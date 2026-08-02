package m1;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import e1.AbstractC4156x;
import e1.InterfaceC4143j;
import e1.InterfaceC4152t;

/* loaded from: classes.dex */
public final class C1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f56081a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4152t f56082b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f56083c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f56084d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f56085a;

        /* renamed from: b, reason: collision with root package name */
        public WifiManager.WifiLock f56086b;

        public a(Context context) {
            this.f56085a = context;
        }

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f56086b == null) {
                WifiManager wifiManager = (WifiManager) this.f56085a.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    AbstractC4156x.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f56086b = createWifiLock;
                    createWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f56086b;
            if (wifiLock == null) {
                return;
            }
            if (z10 && z11) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public C1(Context context, Looper looper, InterfaceC4143j interfaceC4143j) {
        this.f56081a = new a(context.getApplicationContext());
        this.f56082b = interfaceC4143j.d(looper, null);
    }

    public void c(final boolean z10) {
        if (this.f56083c == z10) {
            return;
        }
        this.f56083c = z10;
        final boolean z11 = this.f56084d;
        this.f56082b.j(new Runnable() { // from class: m1.A1
            @Override // java.lang.Runnable
            public final void run() {
                C1.this.f56081a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f56084d == z10) {
            return;
        }
        this.f56084d = z10;
        if (this.f56083c) {
            this.f56082b.j(new Runnable() { // from class: m1.B1
                @Override // java.lang.Runnable
                public final void run() {
                    C1.this.f56081a.a(true, z10);
                }
            });
        }
    }
}
