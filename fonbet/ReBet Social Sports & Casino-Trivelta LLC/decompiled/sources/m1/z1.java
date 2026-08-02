package m1;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import e1.AbstractC4156x;
import e1.InterfaceC4143j;
import e1.InterfaceC4152t;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f56338a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4152t f56339b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f56340c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f56341d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f56342a;

        /* renamed from: b, reason: collision with root package name */
        public PowerManager.WakeLock f56343b;

        public a(Context context) {
            this.f56342a = context;
        }

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f56343b == null) {
                PowerManager powerManager = (PowerManager) this.f56342a.getSystemService("power");
                if (powerManager == null) {
                    AbstractC4156x.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f56343b = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f56343b;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public z1(Context context, Looper looper, InterfaceC4143j interfaceC4143j) {
        this.f56338a = new a(context.getApplicationContext());
        this.f56339b = interfaceC4143j.d(looper, null);
    }

    public void c(final boolean z10) {
        if (this.f56340c == z10) {
            return;
        }
        this.f56340c = z10;
        final boolean z11 = this.f56341d;
        this.f56339b.j(new Runnable() { // from class: m1.y1
            @Override // java.lang.Runnable
            public final void run() {
                z1.this.f56338a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f56341d == z10) {
            return;
        }
        this.f56341d = z10;
        if (this.f56340c) {
            this.f56339b.j(new Runnable() { // from class: m1.x1
                @Override // java.lang.Runnable
                public final void run() {
                    z1.this.f56338a.a(true, z10);
                }
            });
        }
    }
}
