package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sn0 {
    public final tmi a;
    public final Handler b;
    public ih6 c;
    public an0 d;
    public int f;
    public tn0 h;
    public float g = 1.0f;
    public int e = 0;

    public sn0(Context context, Looper looper, ih6 ih6Var) {
        this.a = b0a.M(new on0(context, 0));
        this.c = ih6Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.a.get();
        AudioFocusRequest audioFocusRequest = this.h.e;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void b(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        ih6 ih6Var = this.c;
        if (ih6Var != null) {
            ih6Var.h.g(34);
        }
    }

    public final int c(int i, boolean z) {
        int i2;
        zid zidVar;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        int i3 = this.e;
        if (z) {
            if (i3 != 2) {
                tn0 tn0Var = this.h;
                if (tn0Var == null) {
                    if (tn0Var == null) {
                        zidVar = new zid(3);
                        an0 an0Var = an0.b;
                        zidVar.b = i2;
                    } else {
                        zid zidVar2 = new zid(3);
                        zidVar2.b = tn0Var.a;
                        zidVar = zidVar2;
                    }
                    an0 an0Var2 = this.d;
                    an0Var2.getClass();
                    this.h = new tn0(zidVar.b, new nn0(this, 0), this.b, an0Var2, true);
                }
                AudioManager audioManager = (AudioManager) this.a.get();
                AudioFocusRequest audioFocusRequest = this.h.e;
                audioFocusRequest.getClass();
                int requestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                if (requestAudioFocus == 1 || requestAudioFocus == 2) {
                    b(2);
                    return 1;
                }
                b(1);
                return -1;
            }
        } else {
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
