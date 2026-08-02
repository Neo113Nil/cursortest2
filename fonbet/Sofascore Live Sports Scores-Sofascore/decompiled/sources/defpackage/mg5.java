package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mg5 {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public mg5(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? qz.l(edgeEffect) : 0.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final EdgeEffect a(ewd ewdVar) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        EdgeEffect b = i >= 31 ? qz.b(context) : new g09(context);
        b.setColor(this.b);
        if (!c7a.a(this.c, 0L)) {
            ewd ewdVar2 = ewd.a;
            long j = this.c;
            if (ewdVar == ewdVar2) {
                b.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return b;
            }
            b.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return b;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(ewd.a);
        this.e = a;
        return a;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(ewd.b);
        this.f = a;
        return a;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(ewd.b);
        this.g = a;
        return a;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(ewd.a);
        this.d = a;
        return a;
    }
}
