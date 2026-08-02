package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.o;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.AbstractC3497d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3499f {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f37948a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f37949b;

    /* renamed from: c, reason: collision with root package name */
    public final O f37950c;

    public C3499f(Context context, O o10, ExecutorService executorService) {
        this.f37948a = executorService;
        this.f37949b = context;
        this.f37950c = o10;
    }

    public boolean a() {
        if (this.f37950c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        K d10 = d();
        AbstractC3497d.a e10 = AbstractC3497d.e(this.f37949b, this.f37950c);
        e(e10.f37933a, d10);
        c(e10);
        return true;
    }

    public final boolean b() {
        if (((KeyguardManager) this.f37949b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!K9.n.c()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f37949b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void c(AbstractC3497d.a aVar) {
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.f37949b.getSystemService("notification")).notify(aVar.f37934b, aVar.f37935c, aVar.f37933a.d());
    }

    public final K d() {
        K B10 = K.B(this.f37950c.p("gcm.n.image"));
        if (B10 != null) {
            B10.U(this.f37948a);
        }
        return B10;
    }

    public final void e(o.e eVar, K k10) {
        if (k10 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(k10.J(), 5L, TimeUnit.SECONDS);
            eVar.u(bitmap);
            eVar.G(new o.b().b(bitmap).a(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            k10.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            k10.close();
        }
    }
}
