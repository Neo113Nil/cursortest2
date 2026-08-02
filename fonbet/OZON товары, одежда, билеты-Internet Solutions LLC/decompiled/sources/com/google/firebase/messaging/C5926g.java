package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.l;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C5924e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5926g {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f59714a;

    /* renamed from: b, reason: collision with root package name */
    private final FirebaseMessagingService f59715b;

    /* renamed from: c, reason: collision with root package name */
    private final A f59716c;

    public C5926g(FirebaseMessagingService firebaseMessagingService, A a11, ExecutorService executorService) {
        this.f59714a = executorService;
        this.f59715b = firebaseMessagingService;
        this.f59716c = a11;
    }

    final boolean a() {
        A a11 = this.f59716c;
        if (a11.a("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = this.f59715b;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10L);
            }
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        C5942x d11 = C5942x.d(a11.f("gcm.n.image"));
        if (d11 != null) {
            d11.k(this.f59714a);
        }
        C5924e.a a12 = C5924e.a(firebaseMessagingService, a11);
        l.d dVar = a12.f59711a;
        if (d11 != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await(d11.j(), 5L, TimeUnit.SECONDS);
                dVar.s(bitmap);
                l.b bVar = new l.b();
                bVar.e(bitmap);
                bVar.d();
                dVar.F(bVar);
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                d11.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e11) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e11.getCause());
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                d11.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) firebaseMessagingService.getSystemService("notification")).notify(a12.f59712b, 0, dVar.b());
        return true;
    }
}
