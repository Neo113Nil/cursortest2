package com.socure.idplus.device.internal.behavior.manager;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Window;
import com.socure.idplus.device.SigmaDeviceOptions;
import com.socure.idplus.device.error.SigmaDeviceError;
import com.socure.idplus.device.internal.behavior.model.LifeCycleEvent;
import com.socure.idplus.device.internal.behavior.model.LifeCycleType;
import com.socure.idplus.device.internal.input.j;
import com.socure.idplus.device.internal.input.k;
import com.socure.idplus.device.internal.sigmaDeviceConfig.model.Behavioral;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final com.socure.idplus.device.internal.sharedPrefs.a f850a;
    public final k b;
    public final com.socure.idplus.device.internal.thread.c c;
    public final com.socure.idplus.device.internal.sigmaDeviceLocation.manager.e d;
    public com.socure.idplus.device.internal.input.manager.a e;
    public final g f;
    public final com.socure.idplus.device.internal.input.f g;
    public final c h;
    public com.socure.idplus.device.internal.behavior.a i;
    public final Handler j;
    public Behavioral k;
    public long l;

    public f(Context context, SigmaDeviceOptions sigmaDeviceOptions, com.socure.idplus.device.internal.api.b apiClient, com.socure.idplus.device.internal.sharedPrefs.a socureSharedPrefs, k windowManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sigmaDeviceOptions, "sigmaDeviceOptions");
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        Intrinsics.checkNotNullParameter(socureSharedPrefs, "socureSharedPrefs");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        this.f850a = socureSharedPrefs;
        this.b = windowManager;
        com.socure.idplus.device.internal.thread.c cVar = new com.socure.idplus.device.internal.thread.c();
        this.c = cVar;
        this.d = sigmaDeviceOptions.getOmitLocationData() ? null : new com.socure.idplus.device.internal.sigmaDeviceLocation.manager.e(cVar);
        g gVar = new g(cVar);
        this.f = gVar;
        com.socure.idplus.device.internal.input.f fVar = new com.socure.idplus.device.internal.input.f(cVar);
        this.g = fVar;
        c cVar2 = new c(cVar, apiClient, new d(this));
        this.h = cVar2;
        this.i = com.socure.idplus.device.internal.behavior.a.d;
        this.j = new Handler(context.getMainLooper());
        cVar.start();
        cVar.a(cVar2);
        fVar.b();
        if (context instanceof Activity) {
            gVar.a((Activity) context);
        }
    }

    public final void a() {
        Behavioral behavioral = this.k;
        if (behavioral == null) {
            return;
        }
        int sessionIdleTimeoutSeconds = behavioral.getSessionIdleTimeoutSeconds();
        long j = this.f850a.f874a.getLong("lastSessionEventTimeStamp", -1L);
        Long valueOf = j != -1 ? Long.valueOf(j) : null;
        if (valueOf != null) {
            if (SystemClock.uptimeMillis() - valueOf.longValue() <= sessionIdleTimeoutSeconds * 1000) {
                return;
            }
            a(behavioral.getSessionDuration());
        }
    }

    public final void b(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        com.socure.idplus.device.internal.logger.b.a("DeviceBehaviorManager", "onWindowRemoved " + window);
        com.socure.idplus.device.internal.input.manager.a aVar = this.e;
        if (aVar != null) {
            aVar.b(window);
        }
    }

    public final void b(boolean z) {
        if (z || this.i != com.socure.idplus.device.internal.behavior.a.c) {
            Intrinsics.checkNotNullParameter("DeviceBehaviorManager", "tag");
            Intrinsics.checkNotNullParameter("resumeDataCollection", "msg");
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.f870a;
            if (this.i == com.socure.idplus.device.internal.behavior.a.f843a) {
                a();
                return;
            }
            com.socure.idplus.device.internal.input.f fVar = this.g;
            fVar.getClass();
            LifeCycleType lifeCycleType = z ? LifeCycleType.RESUMED : LifeCycleType.FOREGROUNDED;
            Intrinsics.checkNotNullParameter(lifeCycleType, "lifeCycleType");
            fVar.a(new LifeCycleEvent(SystemClock.uptimeMillis(), lifeCycleType));
            if (SystemClock.uptimeMillis() >= this.l) {
                b();
                a();
                return;
            }
            this.j.postAtTime(new Runnable() { // from class: com.socure.idplus.device.internal.behavior.manager.f$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    f.a(f.this);
                }
            }, this.l);
            this.i = com.socure.idplus.device.internal.behavior.a.d;
            com.socure.idplus.device.internal.input.manager.a aVar2 = this.e;
            if (aVar2 != null) {
                aVar2.b();
            }
            com.socure.idplus.device.internal.thread.c cVar = this.c;
            cVar.getClass();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.obj = null;
            Handler handler = cVar.f899a;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
        }
    }

    public final void a(Context context, String sessionToken, Behavioral behavioralConfig, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(behavioralConfig, "behavioralConfig");
        if (this.i == com.socure.idplus.device.internal.behavior.a.f843a) {
            return;
        }
        if (this.e == null) {
            this.e = z ? new com.socure.idplus.device.internal.input.manager.a(context, this.c) : null;
        }
        this.k = behavioralConfig;
        c cVar = this.h;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(behavioralConfig, "behavioralConfig");
        cVar.o = Long.valueOf(behavioralConfig.getBundleGenerationInterval() == 0 ? 1000L : behavioralConfig.getBundleGenerationInterval());
        Bundle bundle = new Bundle();
        bundle.putString("keySessionToken", sessionToken);
        bundle.putString("keyHostUrl", behavioralConfig.getHost());
        com.socure.idplus.device.internal.thread.c cVar2 = (com.socure.idplus.device.internal.thread.c) cVar.f847a;
        cVar2.getClass();
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = null;
        obtain.setData(bundle);
        Handler handler = cVar2.f899a;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        a(behavioralConfig.getSessionDuration());
        com.socure.idplus.device.internal.sigmaDeviceLocation.manager.e eVar = this.d;
        if (eVar != null) {
            e onError = e.f849a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(onError, "onError");
            com.socure.idplus.device.internal.sigmaDeviceLocation.monitor.a aVar = eVar.b;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            if (!com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.f873a, context)) {
                aVar.f880a = true;
                return;
            }
            com.socure.idplus.device.internal.thread.b socureThread = eVar.f879a;
            com.socure.idplus.device.internal.sigmaDeviceLocation.manager.b onSuccess = new com.socure.idplus.device.internal.sigmaDeviceLocation.manager.b(eVar, context);
            com.socure.idplus.device.internal.sigmaDeviceLocation.manager.c onError2 = new com.socure.idplus.device.internal.sigmaDeviceLocation.manager.c(onError);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(socureThread, "socureThread");
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            Intrinsics.checkNotNullParameter(onError2, "onError");
            try {
                com.socure.idplus.device.internal.common.utils.a.a(context, socureThread, 1, onSuccess, onError2);
            } catch (Exception unused) {
                onError2.invoke(SigmaDeviceError.NetworkConnectionError, "Network not available");
            }
        }
    }

    public static final void b(f this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b();
    }

    public final void b() {
        if (this.i == com.socure.idplus.device.internal.behavior.a.f843a) {
            return;
        }
        Intrinsics.checkNotNullParameter("DeviceBehaviorManager", "tag");
        Intrinsics.checkNotNullParameter("stopCapture", "msg");
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.f870a;
        this.j.removeCallbacksAndMessages(null);
        com.socure.idplus.device.internal.thread.c cVar = this.c;
        cVar.getClass();
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = null;
        Handler handler = cVar.f899a;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        if (this.e != null) {
            WeakHashMap weakHashMap = this.b.f861a;
            ArrayList arrayList = new ArrayList(weakHashMap.size());
            Iterator it = weakHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((Window) ((Map.Entry) it.next()).getKey());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Window window = (Window) it2.next();
                com.socure.idplus.device.internal.input.manager.a aVar2 = this.e;
                if (aVar2 != null) {
                    aVar2.b(window);
                }
            }
            this.b.b = null;
            com.socure.idplus.device.internal.input.manager.a aVar3 = this.e;
            if (aVar3 != null) {
                aVar3.c();
            }
        }
        this.l = 0L;
        this.i = com.socure.idplus.device.internal.behavior.a.f843a;
    }

    public final void a(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        if (this.i != com.socure.idplus.device.internal.behavior.a.f843a) {
            com.socure.idplus.device.internal.logger.b.a("DeviceBehaviorManager", "onWindowAdded " + window);
            com.socure.idplus.device.internal.input.manager.a aVar = this.e;
            if (aVar != null) {
                aVar.a(window);
            }
        }
    }

    public final void a(boolean z) {
        com.socure.idplus.device.internal.sharedPrefs.a aVar = this.f850a;
        aVar.b.putLong("lastSessionEventTimeStamp", SystemClock.uptimeMillis());
        aVar.b.commit();
        if (this.i != com.socure.idplus.device.internal.behavior.a.d) {
            return;
        }
        Intrinsics.checkNotNullParameter("DeviceBehaviorManager", "tag");
        Intrinsics.checkNotNullParameter("pauseDataCollection", "msg");
        com.socure.idplus.device.internal.logger.a aVar2 = com.socure.idplus.device.internal.logger.a.f870a;
        com.socure.idplus.device.internal.input.f fVar = this.g;
        fVar.getClass();
        LifeCycleType lifeCycleType = z ? LifeCycleType.PAUSED : LifeCycleType.BACKGROUNDED;
        Intrinsics.checkNotNullParameter(lifeCycleType, "lifeCycleType");
        fVar.a(new LifeCycleEvent(SystemClock.uptimeMillis(), lifeCycleType));
        com.socure.idplus.device.internal.input.manager.a aVar3 = this.e;
        if (aVar3 != null) {
            aVar3.c();
        }
        com.socure.idplus.device.internal.thread.c cVar = this.c;
        cVar.getClass();
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.obj = null;
        Handler handler = cVar.f899a;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        this.j.removeCallbacksAndMessages(null);
        this.i = z ? com.socure.idplus.device.internal.behavior.a.c : com.socure.idplus.device.internal.behavior.a.b;
    }

    public static final void a(f this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b();
    }

    public final void a(long j) {
        this.l = SystemClock.uptimeMillis() + j;
        this.j.postAtTime(new Runnable() { // from class: com.socure.idplus.device.internal.behavior.manager.f$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                f.b(f.this);
            }
        }, this.l);
        this.i = com.socure.idplus.device.internal.behavior.a.d;
        com.socure.idplus.device.internal.input.manager.a aVar = this.e;
        if (aVar != null) {
            aVar.b();
            WeakHashMap weakHashMap = this.b.f861a;
            ArrayList arrayList = new ArrayList(weakHashMap.size());
            Iterator it = weakHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((Window) ((Map.Entry) it.next()).getKey());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Window window = (Window) it2.next();
                com.socure.idplus.device.internal.input.manager.a aVar2 = this.e;
                if (aVar2 != null) {
                    aVar2.a(window);
                }
            }
            this.b.b = this;
        }
        this.h.a();
    }
}
