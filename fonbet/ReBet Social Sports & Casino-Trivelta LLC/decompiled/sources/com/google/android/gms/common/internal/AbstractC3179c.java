package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C3171d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3179c {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @NonNull
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    @NonNull
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile M9.a zzB;
    private ConnectionResult zzC;
    private boolean zzD;
    private volatile zzj zzE;
    q0 zza;
    final Handler zzb;

    @NonNull
    protected InterfaceC0491c zzc;

    @NonNull
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC3182f zzn;
    private final C3171d zzo;
    private final Object zzp;
    private final Object zzq;
    private InterfaceC3187k zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private f0 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final Feature[] zze = new Feature[0];

    @NonNull
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface a {
        void g(Bundle bundle);

        void i(int i10);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface b {
        void c(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c, reason: collision with other inner class name */
    public interface InterfaceC0491c {
        void a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    public class d implements InterfaceC0491c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC3179c f32683a;

        public d(AbstractC3179c abstractC3179c) {
            Objects.requireNonNull(abstractC3179c);
            this.f32683a = abstractC3179c;
        }

        @Override // com.google.android.gms.common.internal.AbstractC3179c.InterfaceC0491c
        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.l()) {
                AbstractC3179c abstractC3179c = this.f32683a;
                abstractC3179c.getRemoteService(null, abstractC3179c.getScopes());
            } else {
                AbstractC3179c abstractC3179c2 = this.f32683a;
                if (abstractC3179c2.zzl() != null) {
                    abstractC3179c2.zzl().c(connectionResult);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC3179c(Context context, Looper looper, int i10, a aVar, b bVar, String str) {
        this(context, looper, r3, r4, i10, aVar, bVar, str);
        AbstractC3182f b10 = AbstractC3182f.b(context);
        C3171d h10 = C3171d.h();
        AbstractC3191o.m(aVar);
        AbstractC3191o.m(bVar);
    }

    public void checkAvailabilityAndConnect() {
        int j10 = this.zzo.j(this.zzl, getMinApkVersion());
        if (j10 == 0) {
            connect(new d(this));
        } else {
            e(1, null);
            triggerNotAvailable(new d(this), j10, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(@NonNull InterfaceC0491c interfaceC0491c) {
        AbstractC3191o.n(interfaceC0491c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0491c;
        e(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d0) arrayList.get(i10)).d();
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        e(1, null);
    }

    public void dump(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        int i10;
        IInterface iInterface;
        InterfaceC3187k interfaceC3187k;
        long j10;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC3187k = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC3187k == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC3187k.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j11 = this.zzh;
            String format = simpleDateFormat.format(new Date(j11));
            j10 = 0;
            StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(format).length());
            sb2.append(j11);
            sb2.append(" ");
            sb2.append(format);
            append.println(sb2.toString());
        } else {
            j10 = 0;
        }
        if (this.zzg > j10) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j12 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j12));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j12).length() + 1 + String.valueOf(format2).length());
            sb3.append(j12);
            sb3.append(" ");
            sb3.append(format2);
            append2.println(sb3.toString());
        }
        if (this.zzj > j10) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.c.getStatusCodeString(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j13 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j13));
            StringBuilder sb4 = new StringBuilder(String.valueOf(j13).length() + 1 + String.valueOf(format3).length());
            sb4.append(j13);
            sb4.append(" ");
            sb4.append(format3);
            append3.println(sb4.toString());
        }
    }

    public final void e(int i10, IInterface iInterface) {
        q0 q0Var;
        AbstractC3191o.a((i10 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i10;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    f0 f0Var = this.zzu;
                    if (f0Var != null) {
                        AbstractC3182f abstractC3182f = this.zzn;
                        String a10 = this.zza.a();
                        AbstractC3191o.m(a10);
                        abstractC3182f.f(a10, this.zza.b(), 4225, f0Var, zza(), this.zza.c());
                        this.zzu = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    f0 f0Var2 = this.zzu;
                    if (f0Var2 != null && (q0Var = this.zza) != null) {
                        String a11 = q0Var.a();
                        String b10 = q0Var.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a11).length() + 70 + String.valueOf(b10).length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(a11);
                        sb2.append(" on ");
                        sb2.append(b10);
                        Log.e("GmsClient", sb2.toString());
                        AbstractC3182f abstractC3182f2 = this.zzn;
                        String a12 = this.zza.a();
                        AbstractC3191o.m(a12);
                        abstractC3182f2.f(a12, this.zza.b(), 4225, f0Var2, zza(), this.zza.c());
                        this.zzd.incrementAndGet();
                    }
                    f0 f0Var3 = new f0(this, this.zzd.get());
                    this.zzu = f0Var3;
                    q0 q0Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new q0(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new q0(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                    this.zza = q0Var2;
                    if (q0Var2.c() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.a())));
                    }
                    AbstractC3182f abstractC3182f3 = this.zzn;
                    String a13 = this.zza.a();
                    AbstractC3191o.m(a13);
                    ConnectionResult e10 = abstractC3182f3.e(new l0(a13, this.zza.b(), 4225, this.zza.c()), f0Var3, zza(), getBindServiceExecutor());
                    if (!e10.l()) {
                        String a14 = this.zza.a();
                        String b11 = this.zza.b();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(a14).length() + 34 + String.valueOf(b11).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(a14);
                        sb3.append(" on ");
                        sb3.append(b11);
                        Log.w("GmsClient", sb3.toString());
                        int h10 = e10.h() == -1 ? 16 : e10.h();
                        if (e10.j() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, e10.j());
                        }
                        zzb(h10, bundle, this.zzd.get());
                    }
                } else if (i10 == 4) {
                    AbstractC3191o.m(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    @NonNull
    public Feature[] getApiFeatures() {
        return zze;
    }

    public M9.a getAttributionSourceWrapper() {
        return null;
    }

    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.zzb;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    @NonNull
    public final Context getContext() {
        return this.zzl;
    }

    @NonNull
    public String getEndpointPackageName() {
        q0 q0Var;
        if (!isConnected() || (q0Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return q0Var.b();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    @NonNull
    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    @NonNull
    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract int getMinApkVersion();

    public void getRemoteService(InterfaceC3184h interfaceC3184h, @NonNull Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i10 = this.zzy;
        int i11 = C3171d.f32607a;
        Scope[] scopeArr = GetServiceRequest.zza;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.zzb;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i10, i11, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f32642d = this.zzl.getPackageName();
        getServiceRequest.f32644f = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.zzh = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.f32645g = account;
            if (interfaceC3184h != null) {
                getServiceRequest.f32643e = interfaceC3184h.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f32645g = getAccount();
        }
        getServiceRequest.zzk = zze;
        getServiceRequest.zzl = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.f32648j = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    InterfaceC3187k interfaceC3187k = this.zzr;
                    if (interfaceC3187k != null) {
                        interfaceC3187k.b0(new e0(this, this.zzd.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set getScopes() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                IInterface iInterface2 = this.zzs;
                AbstractC3191o.n(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                InterfaceC3187k interfaceC3187k = this.zzr;
                if (interfaceC3187k == null) {
                    return null;
                }
                return interfaceC3187k.asBinder();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract String getServiceDescriptor();

    @NonNull
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    @NonNull
    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f32772c;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void onConnectedLocked(@NonNull IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zzi = connectionResult.h();
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        g0 g0Var = new g0(this, i10, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, g0Var));
    }

    public void onUserSignOut(@NonNull e eVar) {
        eVar.a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(@NonNull String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        int i11 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i11, i10));
    }

    public void triggerNotAvailable(@NonNull InterfaceC0491c interfaceC0491c, int i10, PendingIntent pendingIntent) {
        AbstractC3191o.n(interfaceC0491c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0491c;
        int i11 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i11, i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    @NonNull
    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i10, Bundle bundle, int i11) {
        h0 h0Var = new h0(this, i10, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, h0Var));
    }

    public final /* synthetic */ void zzc(zzj zzjVar) {
        this.zzE = zzjVar;
        if (usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f32772c;
            C3192p.b().c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.l());
        }
    }

    public final /* synthetic */ void zzd(int i10, IInterface iInterface) {
        e(i10, null);
    }

    public final /* synthetic */ boolean zze(int i10, int i11, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i10) {
                    return false;
                }
                e(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void zzf(int i10) {
        int i11;
        int i12;
        synchronized (this.zzp) {
            i11 = this.zzv;
        }
        if (i11 == 3) {
            this.zzD = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i12, this.zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(InterfaceC3187k interfaceC3187k) {
        this.zzr = interfaceC3187k;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ a zzk() {
        return this.zzw;
    }

    public final /* synthetic */ b zzl() {
        return this.zzx;
    }

    public final /* synthetic */ ConnectionResult zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(ConnectionResult connectionResult) {
        this.zzC = connectionResult;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public AbstractC3179c(Context context, Looper looper, AbstractC3182f abstractC3182f, C3171d c3171d, int i10, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        AbstractC3191o.n(context, "Context must not be null");
        this.zzl = context;
        AbstractC3191o.n(looper, "Looper must not be null");
        this.zzm = looper;
        AbstractC3191o.n(abstractC3182f, "Supervisor must not be null");
        this.zzn = abstractC3182f;
        AbstractC3191o.n(c3171d, "API availability must not be null");
        this.zzo = c3171d;
        this.zzb = new c0(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public void disconnect(@NonNull String str) {
        this.zzk = str;
        disconnect();
    }

    public void setAttributionSourceWrapper(@NonNull M9.a aVar) {
    }
}
