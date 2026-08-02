package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rl3 {
    public final hd2 a;
    public final String b;

    public rl3(hd2 hd2Var, int i, int i2) {
        switch (i2) {
            case 1:
                this.a = hd2Var;
                String str = "start";
                if (i != -2) {
                    if (i == -1) {
                        str = TtmlNode.END;
                    } else if (i == 0) {
                        str = "left";
                    } else if (i == 1) {
                        str = "right";
                    }
                }
                this.b = str;
                break;
            default:
                this.a = hd2Var;
                String str2 = PlayerKt.E_SPORTS_TOP;
                if (i != 0 && i == 1) {
                    str2 = "bottom";
                }
                this.b = str2;
                break;
        }
    }

    public static void c(rl3 rl3Var, wl3 wl3Var, float f, int i) {
        if ((i & 2) != 0) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        rl3Var.a(wl3Var, f);
    }

    public static void d(rl3 rl3Var, xl3 xl3Var, float f, int i) {
        if ((i & 2) != 0) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        rl3Var.b(xl3Var, f);
    }

    public void a(wl3 wl3Var, float f) {
        int i = wl3Var.b;
        String str = PlayerKt.E_SPORTS_TOP;
        if (i != 0 && i == 1) {
            str = "bottom";
        }
        bd2 bd2Var = new bd2(new char[0]);
        bd2Var.q(kd2.q(wl3Var.a.toString()));
        bd2Var.q(kd2.q(str));
        bd2Var.q(new fd2(f));
        bd2Var.q(new fd2(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.a.C(this.b, bd2Var);
    }

    public void b(xl3 xl3Var, float f) {
        int i = xl3Var.b;
        String str = "start";
        if (i != -2) {
            if (i == -1) {
                str = TtmlNode.END;
            } else if (i == 0) {
                str = "left";
            } else if (i == 1) {
                str = "right";
            }
        }
        bd2 bd2Var = new bd2(new char[0]);
        bd2Var.q(kd2.q(xl3Var.a.toString()));
        bd2Var.q(kd2.q(str));
        bd2Var.q(new fd2(f));
        bd2Var.q(new fd2(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.a.C(this.b, bd2Var);
    }
}
