package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rn0 {
    public final AudioManager a;
    public final qn0 b;
    public lg6 c;
    public int d;
    public float e = 1.0f;

    public rn0(Context context, Handler handler, lg6 lg6Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.a = audioManager;
        this.c = lg6Var;
        this.b = new qn0(this, handler);
        this.d = 0;
    }

    public final void a() {
        if (this.d == 0) {
            return;
        }
        if (lik.a < 26) {
            this.a.abandonAudioFocus(this.b);
        }
        b(0);
    }

    public final void b(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.e == f) {
            return;
        }
        this.e = f;
        lg6 lg6Var = this.c;
        if (lg6Var != null) {
            ug6 ug6Var = lg6Var.a;
            ug6Var.F(1, 2, Float.valueOf(ug6Var.a0 * ug6Var.A.e));
        }
    }

    public final int c(int i, boolean z) {
        a();
        return z ? 1 : -1;
    }
}
