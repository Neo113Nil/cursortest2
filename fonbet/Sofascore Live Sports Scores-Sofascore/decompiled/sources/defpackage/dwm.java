package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dwm extends HandlerThread {
    public final /* synthetic */ int a;
    public final /* synthetic */ jwm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwm(jwm jwmVar, int i) {
        super("AppLogS");
        this.a = i;
        switch (i) {
            case 1:
                this.b = jwmVar;
                super("AppLogU");
                break;
            default:
                this.b = jwmVar;
                break;
        }
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        switch (this.a) {
            case 0:
                this.b.f = new Handler(getLooper(), this.b);
                this.b.b();
                break;
            default:
                this.b.e = new Handler(getLooper(), this.b);
                this.b.b();
                break;
        }
    }
}
