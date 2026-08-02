package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import defpackage.cp4;
import defpackage.n2p;
import defpackage.x5n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class BaseGmsClient<T extends IInterface> {

    @KeepForSdk
    public static final int CONNECT_STATE_CONNECTED = 4;

    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTED = 1;

    @KeepForSdk
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @NonNull
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final Feature[] E = new Feature[0];

    @NonNull
    @KeepForSdk
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    @NonNull
    @KeepForSdk
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    public ConnectionResult A;
    public boolean B;
    public volatile zzj C;
    public final AtomicInteger D;
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public zzs g;
    public final Context h;
    public final Looper i;
    public final GmsClientSupervisor j;
    public final GoogleApiAvailabilityLight k;
    public final f l;
    public final Object m;
    public final Object n;
    public IGmsServiceBroker o;
    public ConnectionProgressReportCallbacks p;
    public IInterface q;
    public final ArrayList r;
    public zze s;
    public int t;
    public final BaseConnectionCallbacks u;
    public final BaseOnConnectionFailedListener v;
    public final int w;
    public final String x;
    public volatile String y;
    public volatile AttributionSourceWrapper z;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public interface BaseConnectionCallbacks {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public interface BaseOnConnectionFailedListener {
        void J(ConnectionResult connectionResult);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public interface ConnectionProgressReportCallbacks {
        void a(ConnectionResult connectionResult);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void a(ConnectionResult connectionResult) {
            boolean Z0 = connectionResult.Z0();
            BaseGmsClient baseGmsClient = BaseGmsClient.this;
            if (Z0) {
                baseGmsClient.getRemoteService(null, baseGmsClient.f());
                return;
            }
            BaseOnConnectionFailedListener baseOnConnectionFailedListener = baseGmsClient.v;
            if (baseOnConnectionFailedListener != null) {
                baseOnConnectionFailedListener.J(connectionResult);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public interface SignOutCallbacks {
        void a();
    }

    public BaseGmsClient(Context context, Looper looper, n2p n2pVar, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        this.f = null;
        this.m = new Object();
        this.n = new Object();
        this.r = new ArrayList();
        this.t = 1;
        this.A = null;
        this.B = false;
        this.C = null;
        this.D = new AtomicInteger(0);
        Preconditions.j(context, "Context must not be null");
        this.h = context;
        Preconditions.j(looper, "Looper must not be null");
        this.i = looper;
        Preconditions.j(n2pVar, "Supervisor must not be null");
        this.j = n2pVar;
        Preconditions.j(googleApiAvailabilityLight, "API availability must not be null");
        this.k = googleApiAvailabilityLight;
        this.l = new f(this, looper);
        this.w = i;
        this.u = baseConnectionCallbacks;
        this.v = baseOnConnectionFailedListener;
        this.x = str;
    }

    public abstract IInterface b(IBinder iBinder);

    public Executor c() {
        return null;
    }

    @KeepForSdk
    public void checkAvailabilityAndConnect() {
        int b = this.k.b(this.h, getMinApkVersion());
        if (b == 0) {
            connect(new LegacyClientCallbackAdapter());
        } else {
            s(1, null);
            q(new LegacyClientCallbackAdapter(), b, null);
        }
    }

    @KeepForSdk
    public void connect(@NonNull ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.j(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.p = connectionProgressReportCallbacks;
        s(2, null);
    }

    @KeepForSdk
    public void disconnect() {
        this.D.incrementAndGet();
        ArrayList arrayList = this.r;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    zzc zzcVar = (zzc) arrayList.get(i);
                    synchronized (zzcVar) {
                        zzcVar.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.n) {
            this.o = null;
        }
        s(1, null);
    }

    @KeepForSdk
    public void dump(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        long j;
        synchronized (this.m) {
            i = this.t;
            iInterface = this.q;
        }
        synchronized (this.n) {
            iGmsServiceBroker = this.o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) g()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.c;
            String format = simpleDateFormat.format(new Date(j2));
            j = 0;
            StringBuilder sb = new StringBuilder(x5n.f(1, j2) + String.valueOf(format).length());
            sb.append(j2);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        } else {
            j = 0;
        }
        if (this.b > j) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.a;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.b;
            String format2 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(x5n.f(1, j3) + String.valueOf(format2).length());
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.e > j) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) CommonStatusCodes.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.e;
            String format3 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(x5n.f(1, j4) + String.valueOf(format3).length());
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public Bundle e() {
        return new Bundle();
    }

    public Set f() {
        return Collections.EMPTY_SET;
    }

    public abstract String g();

    @Nullable
    @KeepForSdk
    public Account getAccount() {
        return null;
    }

    @NonNull
    @KeepForSdk
    public Feature[] getApiFeatures() {
        return E;
    }

    @Nullable
    @KeepForSdk
    public AttributionSourceWrapper getAttributionSourceWrapper() {
        return this.z;
    }

    @Nullable
    @KeepForSdk
    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.C;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.b;
    }

    @Nullable
    @KeepForSdk
    public Bundle getConnectionHint() {
        return null;
    }

    @NonNull
    @KeepForSdk
    public final Context getContext() {
        return this.h;
    }

    @NonNull
    @KeepForSdk
    public String getEndpointPackageName() {
        zzs zzsVar;
        if (isConnected() && (zzsVar = this.g) != null) {
            return zzsVar.b;
        }
        cp4.h("Failed to connect when checking package");
        return null;
    }

    @KeepForSdk
    public int getGCoreServiceId() {
        return this.w;
    }

    @Nullable
    @KeepForSdk
    public String getLastDisconnectMessage() {
        return this.f;
    }

    @NonNull
    @KeepForSdk
    public final Looper getLooper() {
        return this.i;
    }

    @KeepForSdk
    public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.a;
    }

    @KeepForSdk
    public void getRemoteService(@Nullable IAccountAccessor iAccountAccessor, @NonNull Set<Scope> set) {
        String attributionTag;
        Bundle e = e();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag = this.y;
        } else if (this.z == null) {
            attributionTag = this.y;
        } else {
            AttributionSource attributionSource = this.z.a;
            attributionTag = attributionSource == null ? this.y : attributionSource.getAttributionTag() == null ? this.y : attributionSource.getAttributionTag();
        }
        String str = attributionTag;
        int i = this.w;
        int i2 = GoogleApiAvailabilityLight.a;
        Scope[] scopeArr = GetServiceRequest.o;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.p;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.d = this.h.getPackageName();
        getServiceRequest.g = e;
        if (set != null) {
            getServiceRequest.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.h = account;
            if (iAccountAccessor != null) {
                getServiceRequest.e = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.h = getAccount();
        }
        getServiceRequest.i = E;
        getServiceRequest.j = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.m = true;
        }
        try {
            try {
                synchronized (this.n) {
                    try {
                        IGmsServiceBroker iGmsServiceBroker = this.o;
                        if (iGmsServiceBroker != null) {
                            iGmsServiceBroker.c0(new zzd(this, this.D.get()), getServiceRequest);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                p(8, null, null, this.D.get());
            }
        } catch (DeadObjectException unused2) {
            triggerConnectionSuspended(3);
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    @NonNull
    @KeepForSdk
    public final T getService() throws DeadObjectException {
        T t;
        synchronized (this.m) {
            try {
                if (this.t == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface = this.q;
                Preconditions.j(iInterface, "Client is connected but service is null");
                t = (T) iInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    @Nullable
    @KeepForSdk
    public IBinder getServiceBrokerBinder() {
        synchronized (this.n) {
            try {
                IGmsServiceBroker iGmsServiceBroker = this.o;
                if (iGmsServiceBroker == null) {
                    return null;
                }
                return iGmsServiceBroker.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    @KeepForSdk
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @Nullable
    @KeepForSdk
    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzjVar = this.C;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.d;
    }

    public abstract String h();

    @KeepForSdk
    public boolean hasConnectionInfo() {
        return this.C != null;
    }

    public String i() {
        return "com.google.android.gms";
    }

    @KeepForSdk
    public boolean isConnected() {
        boolean z;
        synchronized (this.m) {
            z = this.t == 4;
        }
        return z;
    }

    @KeepForSdk
    public boolean isConnecting() {
        boolean z;
        synchronized (this.m) {
            int i = this.t;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean j() {
        return getMinApkVersion() >= 211700000;
    }

    public void k(ConnectionResult connectionResult) {
        this.d = connectionResult.b;
        this.e = System.currentTimeMillis();
    }

    public void o(int i) {
        this.a = i;
        this.b = System.currentTimeMillis();
    }

    @KeepForSdk
    public void onUserSignOut(@NonNull SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.a();
    }

    public void p(int i, IBinder iBinder, Bundle bundle, int i2) {
        zzf zzfVar = new zzf(this, i, iBinder, bundle);
        f fVar = this.l;
        fVar.sendMessage(fVar.obtainMessage(1, i2, -1, zzfVar));
    }

    @KeepForSdk
    public boolean providesSignIn() {
        return false;
    }

    public final void q(ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, PendingIntent pendingIntent) {
        Preconditions.j(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.p = connectionProgressReportCallbacks;
        int i2 = this.D.get();
        f fVar = this.l;
        fVar.sendMessage(fVar.obtainMessage(3, i2, i, pendingIntent));
    }

    public final /* synthetic */ boolean r(int i, int i2, IInterface iInterface) {
        synchronized (this.m) {
            try {
                if (this.t != i) {
                    return false;
                }
                s(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public boolean requiresAccount() {
        return false;
    }

    @KeepForSdk
    public boolean requiresGooglePlayServices() {
        return true;
    }

    @KeepForSdk
    public boolean requiresSignIn() {
        return false;
    }

    public final void s(int i, IInterface iInterface) {
        zzs zzsVar;
        Preconditions.b((i == 4) == (iInterface != null));
        synchronized (this.m) {
            try {
                this.t = i;
                this.q = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    zze zzeVar = this.s;
                    if (zzeVar != null) {
                        GmsClientSupervisor gmsClientSupervisor = this.j;
                        String str = this.g.a;
                        Preconditions.i(str);
                        String str2 = this.g.b;
                        if (this.x == null) {
                            this.h.getClass();
                        }
                        boolean z = this.g.c;
                        gmsClientSupervisor.getClass();
                        gmsClientSupervisor.c(new zzn(str, str2, z), zzeVar);
                        this.s = null;
                    }
                } else if (i == 2 || i == 3) {
                    zze zzeVar2 = this.s;
                    if (zzeVar2 != null && (zzsVar = this.g) != null) {
                        new StringBuilder(String.valueOf(zzsVar.a).length() + 70 + String.valueOf(zzsVar.b).length());
                        GmsClientSupervisor gmsClientSupervisor2 = this.j;
                        String str3 = this.g.a;
                        Preconditions.i(str3);
                        String str4 = this.g.b;
                        if (this.x == null) {
                            this.h.getClass();
                        }
                        boolean z2 = this.g.c;
                        gmsClientSupervisor2.getClass();
                        gmsClientSupervisor2.c(new zzn(str3, str4, z2), zzeVar2);
                        this.D.incrementAndGet();
                    }
                    zze zzeVar3 = new zze(this, this.D.get());
                    this.s = zzeVar3;
                    String i2 = i();
                    String h = h();
                    boolean j = j();
                    this.g = new zzs(i2, h, j);
                    if (j && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.g.a)));
                    }
                    GmsClientSupervisor gmsClientSupervisor3 = this.j;
                    String str5 = this.g.a;
                    Preconditions.i(str5);
                    String str6 = this.g.b;
                    String str7 = this.x;
                    if (str7 == null) {
                        str7 = this.h.getClass().getName();
                    }
                    ConnectionResult b = gmsClientSupervisor3.b(new zzn(str5, str6, this.g.c), zzeVar3, str7, c());
                    if (!b.Z0()) {
                        zzs zzsVar2 = this.g;
                        new StringBuilder(String.valueOf(zzsVar2.a).length() + 34 + String.valueOf(zzsVar2.b).length());
                        int i3 = b.b;
                        if (i3 == -1) {
                            i3 = 16;
                        }
                        if (b.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, b.c);
                        }
                        int i4 = this.D.get();
                        zzg zzgVar = new zzg(this, i3, bundle);
                        f fVar = this.l;
                        fVar.sendMessage(fVar.obtainMessage(7, i4, -1, zzgVar));
                    }
                } else if (i == 4) {
                    Preconditions.i(iInterface);
                    IInterface iInterface2 = iInterface;
                    this.c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    @KeepForSdk
    public void setAttributionSourceWrapper(@NonNull AttributionSourceWrapper attributionSourceWrapper) {
        this.z = attributionSourceWrapper;
    }

    @KeepForSdk
    public void setAttributionTag(@NonNull String str) {
        this.y = str;
    }

    @KeepForSdk
    public void triggerConnectionSuspended(int i) {
        int i2 = this.D.get();
        f fVar = this.l;
        fVar.sendMessage(fVar.obtainMessage(6, i2, i));
    }

    @KeepForSdk
    public boolean usesClientTelemetry() {
        return false;
    }

    @KeepForSdk
    public void disconnect(@NonNull String str) {
        this.f = str;
        disconnect();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BaseGmsClient(int i, Context context, Looper looper, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this(context, looper, r3, r4, i, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
        n2p a = GmsClientSupervisor.a(context);
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.b;
        Preconditions.i(baseConnectionCallbacks);
        Preconditions.i(baseOnConnectionFailedListener);
    }
}
