package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.applovin.impl.f2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.z4;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class i implements AppLovinBroadcastManager.Receiver {
    private final l a;
    private final AtomicReference b;
    private final Handler c;
    private final Handler d;
    private final AtomicLong e = new AtomicLong(0);
    private long f;
    private long g;
    private long h;

    private enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (i.this.b.get() != b.MONITORING) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - i.this.e.get();
            if (currentTimeMillis >= 0 && currentTimeMillis <= i.this.f) {
                i.this.d.postDelayed(this, i.this.h);
                return;
            }
            i.this.b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(i.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = "None";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - l.o());
            HashMap hashMap = new HashMap(3);
            hashMap.put("top_main_method", str);
            hashMap.put("source", i.this.a.B0() ? "non_first_session" : "first_session");
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "seconds_since_app_launch", String.valueOf(seconds));
            List a = i.this.a.h().a();
            if (!CollectionUtils.isEmpty(a)) {
                JsonUtils.putJsonArray(jSONObject, "ad_info", new JSONArray((Collection) a));
            }
            hashMap.put("details", jSONObject.toString());
            i.this.a.E().d(f2.O0, hashMap);
        }
    }

    private class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.this.b.get() != b.MONITORING) {
                return;
            }
            i.this.e.set(System.currentTimeMillis());
            i.this.c.postDelayed(this, i.this.g);
        }
    }

    public i(l lVar) {
        this.a = lVar;
        this.b = new AtomicReference(!q7.c(lVar) ? b.IDLE : b.INELIGIBLE);
        this.c = new Handler(l.p().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    private void b() {
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.b, b.MONITORING, b.IDLE)) {
            this.c.removeCallbacksAndMessages(null);
            this.d.removeCallbacksAndMessages(null);
        }
        this.a.h().b(this);
    }

    private void c() {
        if (((Boolean) this.a.a(z4.l6)).booleanValue() && this.a.o0().getCurrentApplicationState() == SessionTracker.e.PAUSED) {
            return;
        }
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.b, b.IDLE, b.MONITORING)) {
            this.c.post(new d());
            this.d.postDelayed(new c(), this.h / 2);
        }
        this.a.h().a(this);
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f = ((Long) this.a.a(z4.i6)).longValue();
        this.g = ((Long) this.a.a(z4.j6)).longValue();
        this.h = ((Long) this.a.a(z4.k6)).longValue();
        if (((Boolean) this.a.a(z4.l6)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void a() {
        if (this.b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.a.a(z4.h6)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }
}
