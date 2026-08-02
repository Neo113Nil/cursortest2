package com.mbridge.msdk.config.component.status;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.xab;

/* compiled from: MBActivityLifecyclePublisher.java */
/* loaded from: classes13.dex */
public class b implements Application.ActivityLifecycleCallbacks {
    private final List<a> a = new CopyOnWriteArrayList();
    private int b = 0;
    private int c = 0;
    private boolean d = true;
    private boolean e = true;
    Handler f = new Handler();
    private final Runnable g = new xab(this, 13);

    public b(Context context) {
        if (context == null) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a();
        b();
    }

    public void b(a aVar) {
        try {
            this.a.remove(aVar);
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "remove subscriber error");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        a("LifecycleChanged", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        a("LifecycleChanged", "onActivityDestroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        this.c--;
        a("LifecycleChanged", "onActivityPaused");
        if (this.c == 0) {
            this.f.postDelayed(this.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        this.c++;
        a("LifecycleChanged", "onActivityResumed");
        if (this.c == 1) {
            if (!this.d) {
                this.f.removeCallbacks(this.g);
            } else {
                a("916003", "");
                this.d = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        this.b++;
        a("LifecycleChanged", "onActivityStarted");
        if (this.b == 1 && this.e) {
            this.e = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        this.b--;
        a("LifecycleChanged", "onActivityStopped");
        b();
    }

    public void a(a aVar) {
        try {
            this.a.add(aVar);
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "add subscriber error");
        }
    }

    private void b() {
        if (this.b == 0 && this.d) {
            a("916004", "");
            this.e = true;
        }
    }

    private void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<a> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable unused) {
            q0.b("LifecyclePublisher", "notifySubscriber error");
        }
    }

    private void a(String str, String str2) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b(str);
        HashMap hashMap = new HashMap();
        hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("100"), str2);
        bVar.a(hashMap);
        a(bVar);
    }

    private void a() {
        if (this.c == 0) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }
}
