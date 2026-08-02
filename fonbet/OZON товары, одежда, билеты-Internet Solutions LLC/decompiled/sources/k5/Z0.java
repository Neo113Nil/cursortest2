package k5;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.view.Display;
import androidx.annotation.NonNull;
import k5.InterfaceC7576v1;

/* loaded from: classes8.dex */
final class Z0 extends AbstractC7560r1 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f70681e;

    /* renamed from: f, reason: collision with root package name */
    private final U1 f70682f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f70683g;

    /* renamed from: h, reason: collision with root package name */
    private a f70684h;

    private final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            boolean equals = "android.intent.action.SCREEN_OFF".equals(action);
            Z0 z02 = Z0.this;
            if (equals) {
                Z0.k(z02, false);
            } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                Z0.k(z02, true);
            }
        }
    }

    Z0(@NonNull Context context, @NonNull AudioManager audioManager, @NonNull U1 u12) {
        super(audioManager);
        this.f70681e = context;
        this.f70682f = u12;
    }

    static void k(Z0 z02, boolean z11) {
        z02.f70683g = z11;
        U1 u12 = z02.f70682f;
        if (z11) {
            u12.g(new Y0(z02));
        } else {
            u12.d();
        }
    }

    @Override // k5.AbstractC7560r1, k5.InterfaceC7576v1
    public final void a(@NonNull InterfaceC7576v1.a aVar) {
        super.a(aVar);
        if (g()) {
            a aVar2 = this.f70684h;
            if (aVar2 != null) {
                this.f70681e.unregisterReceiver(aVar2);
                this.f70684h = null;
            }
            this.f70682f.d();
        }
    }

    @Override // k5.AbstractC7560r1, k5.InterfaceC7576v1
    public final void b(@NonNull InterfaceC7576v1.a aVar) {
        super.b(aVar);
        c();
    }

    @Override // k5.InterfaceC7576v1
    public final void c() {
        if (g()) {
            return;
        }
        synchronized (this) {
            i(e().getMode(), true);
        }
        Context context = this.f70681e;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        boolean z11 = false;
        if (displayManager != null && keyguardManager != null) {
            Display[] displays = displayManager.getDisplays();
            int length = displays.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (displays[i11].getState() != 1) {
                    z11 = !keyguardManager.isKeyguardLocked();
                    break;
                }
                i11++;
            }
        }
        this.f70683g = z11;
        a aVar = this.f70684h;
        if (aVar != null) {
            this.f70681e.unregisterReceiver(aVar);
            this.f70684h = null;
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        a aVar2 = new a();
        this.f70684h = aVar2;
        context.registerReceiver(aVar2, intentFilter);
        boolean z12 = this.f70683g;
        U1 u12 = this.f70682f;
        if (z12) {
            u12.g(new Y0(this));
        } else {
            u12.d();
        }
    }

    @Override // k5.AbstractC7560r1
    protected final void j() {
        super.j();
        a aVar = this.f70684h;
        if (aVar != null) {
            this.f70681e.unregisterReceiver(aVar);
            this.f70684h = null;
        }
        this.f70682f.d();
    }
}
