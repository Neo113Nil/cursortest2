package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.zao;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.Ua;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.gh0;
import defpackage.i2n;
import defpackage.l2n;
import defpackage.m10;
import defpackage.m2n;
import defpackage.x5n;
import defpackage.zg0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class GoogleApiManager implements Handler.Callback {
    public static final Status p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status q = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object r = new Object();
    public static GoogleApiManager s;
    public TelemetryData c;
    public com.google.android.gms.common.internal.service.zat d;
    public final Context e;
    public final GoogleApiAvailability f;
    public final zao g;
    public final com.google.android.gms.internal.base.zao n;
    public volatile boolean o;
    public long a = Ua.s;
    public boolean b = false;
    public final AtomicInteger h = new AtomicInteger(1);
    public final AtomicInteger i = new AtomicInteger(0);
    public final ConcurrentHashMap j = new ConcurrentHashMap(5, 0.75f, 1);
    public zaab k = null;
    public final gh0 l = new gh0(0);
    public final gh0 m = new gh0(0);

    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.o = true;
        this.e = context;
        com.google.android.gms.internal.base.zao zaoVar = new com.google.android.gms.internal.base.zao(looper, this);
        this.n = zaoVar;
        this.f = googleApiAvailability;
        this.g = new zao(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = DeviceProperties.e;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            DeviceProperties.e = bool;
        }
        if (bool.booleanValue()) {
            this.o = false;
        }
        zaoVar.sendMessage(zaoVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (r) {
            try {
                GoogleApiManager googleApiManager = s;
                if (googleApiManager != null) {
                    googleApiManager.i.incrementAndGet();
                    com.google.android.gms.internal.base.zao zaoVar = googleApiManager.n;
                    zaoVar.sendMessageAtFrontOfQueue(zaoVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status d(ApiKey apiKey, ConnectionResult connectionResult) {
        String str = apiKey.b.c;
        String valueOf = String.valueOf(connectionResult);
        return new Status(17, fc6.o(new StringBuilder(str.length() + 63 + valueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", valueOf), connectionResult.c, connectionResult);
    }

    public static GoogleApiManager e(Context context) {
        GoogleApiManager googleApiManager;
        HandlerThread handlerThread;
        synchronized (r) {
            googleApiManager = s;
            if (googleApiManager == null) {
                synchronized (GmsClientSupervisor.a) {
                    try {
                        handlerThread = GmsClientSupervisor.c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            GmsClientSupervisor.c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = GmsClientSupervisor.c;
                        }
                    } finally {
                    }
                }
                GoogleApiManager googleApiManager2 = new GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.e);
                s = googleApiManager2;
                googleApiManager = googleApiManager2;
            }
        }
        return googleApiManager;
    }

    public final zabk b(GoogleApi googleApi) {
        ApiKey apiKey = googleApi.f;
        ConcurrentHashMap concurrentHashMap = this.j;
        zabk zabkVar = (zabk) concurrentHashMap.get(apiKey);
        if (zabkVar == null) {
            zabkVar = new zabk(this, googleApi);
            concurrentHashMap.put(apiKey, zabkVar);
        }
        if (zabkVar.b.requiresSignIn()) {
            this.m.add(apiKey);
        }
        zabkVar.o();
        return zabkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TaskCompletionSource taskCompletionSource, int i, GoogleApi googleApi) {
        l2n l2nVar;
        GoogleApiManager googleApiManager;
        if (i == 0) {
            return;
        }
        ApiKey apiKey = googleApi.f;
        if (f()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.a().a;
            boolean z = true;
            if (rootTelemetryConfiguration != null) {
                if (rootTelemetryConfiguration.b) {
                    boolean z2 = rootTelemetryConfiguration.c;
                    zabk zabkVar = (zabk) this.j.get(apiKey);
                    if (zabkVar != null) {
                        Object obj = zabkVar.b;
                        if (obj instanceof BaseGmsClient) {
                            BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                            if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                                ConnectionTelemetryConfiguration a = l2n.a(zabkVar, baseGmsClient, i);
                                if (a != null) {
                                    zabkVar.l++;
                                    z = a.c;
                                }
                            }
                        }
                    }
                    z = z2;
                }
            }
            googleApiManager = this;
            l2nVar = new l2n(googleApiManager, i, apiKey, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            if (l2nVar == null) {
                Task task = taskCompletionSource.getTask();
                com.google.android.gms.internal.base.zao zaoVar = googleApiManager.n;
                Objects.requireNonNull(zaoVar);
                task.addOnCompleteListener(new m10(zaoVar, 4), l2nVar);
                return;
            }
            return;
        }
        l2nVar = null;
        googleApiManager = this;
        if (l2nVar == null) {
        }
    }

    public final boolean f() {
        int i;
        if (this.b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = RootTelemetryConfigManager.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        SparseIntArray sparseIntArray = this.g.a;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    public final boolean g(ConnectionResult connectionResult, int i) {
        PendingIntent pendingIntent;
        GoogleApiAvailability googleApiAvailability = this.f;
        googleApiAvailability.getClass();
        Context context = this.e;
        if (!InstantApps.a(context)) {
            boolean Y0 = connectionResult.Y0();
            int i2 = connectionResult.b;
            if (Y0) {
                pendingIntent = connectionResult.c;
            } else {
                pendingIntent = null;
                Intent a = googleApiAvailability.a(context, i2, null);
                if (a != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i3 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                googleApiAvailability.f(context, i2, PendingIntent.getActivity(context, 0, intent, com.google.android.gms.internal.base.zak.a | 134217728));
                googleApiAvailability.g(context, connectionResult, false);
                return true;
            }
        }
        return false;
    }

    public final void h(ConnectionResult connectionResult, int i) {
        if (g(connectionResult, i)) {
            return;
        }
        com.google.android.gms.internal.base.zao zaoVar = this.n;
        zaoVar.sendMessage(zaoVar.obtainMessage(5, i, 0, connectionResult));
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x02db  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        zabk zabkVar;
        boolean z;
        Feature[] f;
        int i = message.what;
        Context context = this.e;
        com.google.android.gms.internal.base.zao zaoVar = this.n;
        ConcurrentHashMap concurrentHashMap = this.j;
        switch (i) {
            case 1:
                this.a = true == ((Boolean) message.obj).booleanValue() ? Ua.s : 300000L;
                zaoVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zaoVar.sendMessageDelayed(zaoVar.obtainMessage(12, (ApiKey) it.next()), this.a);
                }
                return true;
            case 2:
                ((zal) message.obj).getClass();
                throw null;
            case 3:
                for (zabk zabkVar2 : concurrentHashMap.values()) {
                    Preconditions.d(zabkVar2.m.n);
                    zabkVar2.k = null;
                    zabkVar2.o();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zacc zaccVar = (zacc) message.obj;
                GoogleApi googleApi = zaccVar.c;
                zai zaiVar = zaccVar.a;
                zabk zabkVar3 = (zabk) concurrentHashMap.get(googleApi.f);
                if (zabkVar3 == null) {
                    zabkVar3 = b(googleApi);
                }
                if (!zabkVar3.b.requiresSignIn() || this.i.get() == zaccVar.b) {
                    zabkVar3.m(zaiVar);
                    return true;
                }
                zaiVar.a(p);
                zabkVar3.n();
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zabkVar = (zabk) it2.next();
                        if (zabkVar.g == i2) {
                        }
                    } else {
                        zabkVar = null;
                    }
                }
                if (zabkVar == null) {
                    new StringBuilder(String.valueOf(i2).length() + 65);
                    new Exception();
                    return true;
                }
                if (connectionResult.b != 13) {
                    zabkVar.g(d(zabkVar.c, connectionResult));
                    return true;
                }
                int i3 = connectionResult.b;
                this.f.getClass();
                AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
                String a1 = ConnectionResult.a1(i3);
                String str = connectionResult.d;
                zabkVar.g(new Status(17, fc6.o(new StringBuilder(a1.length() + 69 + String.valueOf(str).length()), "Error resolution was canceled by the user, original error message: ", a1, ": ", str), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    BackgroundDetector.b((Application) context.getApplicationContext());
                    BackgroundDetector backgroundDetector = BackgroundDetector.e;
                    backgroundDetector.a(new b(this));
                    AtomicBoolean atomicBoolean2 = backgroundDetector.a;
                    AtomicBoolean atomicBoolean3 = backgroundDetector.b;
                    if (!atomicBoolean3.get()) {
                        if (ProcessUtils.b()) {
                            z = true;
                            if (!z) {
                                this.a = 300000L;
                                return true;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo g = x5n.g();
                            if (!atomicBoolean3.getAndSet(true) && g.importance > 100) {
                                atomicBoolean2.set(true);
                            }
                        }
                    }
                    z = atomicBoolean2.get();
                    if (!z) {
                    }
                }
                return true;
            case 7:
                b((GoogleApi) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    zabk zabkVar4 = (zabk) concurrentHashMap.get(message.obj);
                    Preconditions.d(zabkVar4.m.n);
                    if (zabkVar4.i) {
                        zabkVar4.o();
                        return true;
                    }
                }
                return true;
            case 10:
                gh0 gh0Var = this.m;
                gh0Var.getClass();
                zg0 zg0Var = new zg0(gh0Var);
                while (zg0Var.hasNext()) {
                    zabk zabkVar5 = (zabk) concurrentHashMap.remove((ApiKey) zg0Var.next());
                    if (zabkVar5 != null) {
                        zabkVar5.n();
                    }
                }
                gh0Var.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    zabk zabkVar6 = (zabk) concurrentHashMap.get(message.obj);
                    GoogleApiManager googleApiManager = zabkVar6.m;
                    Preconditions.d(googleApiManager.n);
                    boolean z2 = zabkVar6.i;
                    if (z2) {
                        if (z2) {
                            GoogleApiManager googleApiManager2 = zabkVar6.m;
                            ApiKey apiKey = zabkVar6.c;
                            googleApiManager2.n.removeMessages(11, apiKey);
                            googleApiManager2.n.removeMessages(9, apiKey);
                            zabkVar6.i = false;
                        }
                        zabkVar6.g(googleApiManager.f.b(googleApiManager.e, GoogleApiAvailabilityLight.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        zabkVar6.b.disconnect("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    zabk zabkVar7 = (zabk) concurrentHashMap.get(message.obj);
                    Preconditions.d(zabkVar7.m.n);
                    Api.Client client = zabkVar7.b;
                    if (client.isConnected() && zabkVar7.f.isEmpty()) {
                        zaaa zaaaVar = zabkVar7.d;
                        if (zaaaVar.a.isEmpty() && zaaaVar.b.isEmpty()) {
                            client.disconnect("Timing out service connection.");
                            return true;
                        }
                        zabkVar7.h();
                    }
                    return true;
                }
                return true;
            case 14:
                throw fn0.h(message.obj);
            case 15:
                i2n i2nVar = (i2n) message.obj;
                if (concurrentHashMap.containsKey(i2nVar.a)) {
                    zabk zabkVar8 = (zabk) concurrentHashMap.get(i2nVar.a);
                    if (zabkVar8.j.contains(i2nVar) && !zabkVar8.i) {
                        if (zabkVar8.b.isConnected()) {
                            zabkVar8.d();
                            return true;
                        }
                        zabkVar8.o();
                        return true;
                    }
                }
                return true;
            case 16:
                i2n i2nVar2 = (i2n) message.obj;
                if (concurrentHashMap.containsKey(i2nVar2.a)) {
                    zabk zabkVar9 = (zabk) concurrentHashMap.get(i2nVar2.a);
                    if (zabkVar9.j.remove(i2nVar2)) {
                        GoogleApiManager googleApiManager3 = zabkVar9.m;
                        googleApiManager3.n.removeMessages(15, i2nVar2);
                        googleApiManager3.n.removeMessages(16, i2nVar2);
                        Feature feature = i2nVar2.b;
                        LinkedList<zai> linkedList = zabkVar9.a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (zai zaiVar2 : linkedList) {
                            if ((zaiVar2 instanceof zac) && (f = ((zac) zaiVar2).f(zabkVar9)) != null) {
                                int length = f.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length) {
                                        break;
                                    }
                                    if (!com.google.android.gms.common.internal.Objects.a(f[i4], feature)) {
                                        i4++;
                                    } else if (i4 >= 0) {
                                        arrayList.add(zaiVar2);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            zai zaiVar3 = (zai) arrayList.get(i5);
                            linkedList.remove(zaiVar3);
                            zaiVar3.b(new UnsupportedApiCallException(feature));
                        }
                    }
                }
                return true;
            case 17:
                TelemetryData telemetryData = this.c;
                if (telemetryData != null) {
                    if (telemetryData.a > 0 || f()) {
                        com.google.android.gms.common.internal.service.zat zatVar = this.d;
                        if (zatVar == null) {
                            com.google.android.gms.common.internal.service.zat zatVar2 = new com.google.android.gms.common.internal.service.zat(context, com.google.android.gms.common.internal.service.zat.l, TelemetryLoggingOptions.b, GoogleApi.Settings.c);
                            this.d = zatVar2;
                            zatVar = zatVar2;
                        }
                        zatVar.i(telemetryData);
                    }
                    this.c = null;
                    return true;
                }
                return true;
            case 18:
                m2n m2nVar = (m2n) message.obj;
                long j = m2nVar.c;
                MethodInvocation methodInvocation = m2nVar.a;
                int i6 = m2nVar.b;
                if (j == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(i6, Arrays.asList(methodInvocation));
                    com.google.android.gms.common.internal.service.zat zatVar3 = this.d;
                    if (zatVar3 == null) {
                        com.google.android.gms.common.internal.service.zat zatVar4 = new com.google.android.gms.common.internal.service.zat(context, com.google.android.gms.common.internal.service.zat.l, TelemetryLoggingOptions.b, GoogleApi.Settings.c);
                        this.d = zatVar4;
                        zatVar3 = zatVar4;
                    }
                    zatVar3.i(telemetryData2);
                    return true;
                }
                TelemetryData telemetryData3 = this.c;
                if (telemetryData3 != null) {
                    List list = telemetryData3.b;
                    if (telemetryData3.a != i6 || (list != null && list.size() >= m2nVar.d)) {
                        zaoVar.removeMessages(17);
                        TelemetryData telemetryData4 = this.c;
                        if (telemetryData4 != null) {
                            if (telemetryData4.a > 0 || f()) {
                                com.google.android.gms.common.internal.service.zat zatVar5 = this.d;
                                if (zatVar5 == null) {
                                    com.google.android.gms.common.internal.service.zat zatVar6 = new com.google.android.gms.common.internal.service.zat(context, com.google.android.gms.common.internal.service.zat.l, TelemetryLoggingOptions.b, GoogleApi.Settings.c);
                                    this.d = zatVar6;
                                    zatVar5 = zatVar6;
                                }
                                zatVar5.i(telemetryData4);
                            }
                            this.c = null;
                        }
                    } else {
                        TelemetryData telemetryData5 = this.c;
                        List list2 = telemetryData5.b;
                        if (list2 == null) {
                            list2 = new ArrayList();
                            telemetryData5.b = list2;
                        }
                        list2.add(methodInvocation);
                    }
                }
                if (this.c == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(methodInvocation);
                    this.c = new TelemetryData(i6, arrayList2);
                    zaoVar.sendMessageDelayed(zaoVar.obtainMessage(17), j);
                    return true;
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                new StringBuilder(String.valueOf(i).length() + 20);
                return false;
        }
    }
}
