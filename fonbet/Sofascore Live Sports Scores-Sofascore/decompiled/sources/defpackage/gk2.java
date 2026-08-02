package defpackage;

import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.unity3d.services.UnityAdsConstants;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gk2 {
    public final float a;
    public final float b;
    public final float c;

    public gk2(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cdi a(boolean z, wzc wzcVar, of3 of3Var, int i) {
        Object O;
        q50 q50Var;
        int i2;
        Object O2;
        q50 q50Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.d0(-1763481333);
        float f = this.a;
        a99 a99Var = nf3.a;
        if (wzcVar == null) {
            av8Var.d0(167751211);
            Object O3 = av8Var.O();
            Object obj = O3;
            if (O3 == a99Var) {
                e1d f2 = e.f(new p75(f));
                av8Var.n0(f2);
                obj = f2;
            }
            e1d e1dVar = (e1d) obj;
            av8Var.s(false);
            av8Var.s(false);
            return e1dVar;
        }
        av8Var.d0(167824247);
        av8Var.s(false);
        Object O4 = av8Var.O();
        Object obj2 = O4;
        if (O4 == a99Var) {
            SnapshotStateList snapshotStateList = new SnapshotStateList();
            av8Var.n0(snapshotStateList);
            obj2 = snapshotStateList;
        }
        SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj2;
        int i3 = 1;
        boolean z2 = (((i & 112) ^ 48) > 32 && av8Var.g(wzcVar)) || (i & 48) == 32;
        Object O5 = av8Var.O();
        rq3 rq3Var = null;
        Object obj3 = O5;
        if (z2 || O5 == a99Var) {
            t72 t72Var = new t72(wzcVar, snapshotStateList2, rq3Var, i3);
            av8Var.n0(t72Var);
            obj3 = t72Var;
        }
        hz8.o(av8Var, wzcVar, (Function2) obj3);
        i7a i7aVar = (i7a) CollectionsKt.j0(snapshotStateList2);
        if (z && !(i7aVar instanceof l6f)) {
            if (i7aVar instanceof sf9) {
                f = this.b;
            } else if (!(i7aVar instanceof rd8)) {
                if (i7aVar instanceof m95) {
                    f = this.c;
                }
            }
            O = av8Var.O();
            Object obj4 = O;
            if (O == a99Var) {
                q50 q50Var3 = new q50(new p75(f), lz.h, null, 12);
                av8Var.n0(q50Var3);
                obj4 = q50Var3;
            }
            q50Var = (q50) obj4;
            p75 p75Var = new p75(f);
            int i4 = (av8Var.i(q50Var) ? 1 : 0) | (av8Var.d(f) ? 1 : 0) | (((((i & 14) ^ 6) > 4 || !av8Var.h(z)) && (i & 6) != 4) ? 0 : 1);
            if ((((i & 896) ^ 384) > 256 || !av8Var.g(this)) && (i & 384) != 256) {
                i3 = 0;
            }
            i2 = i4 | i3 | (av8Var.i(i7aVar) ? 1 : 0);
            O2 = av8Var.O();
            if (i2 == 0 || O2 == a99Var) {
                q50Var2 = q50Var;
                u72 u72Var = new u72(q50Var2, f, z, this, i7aVar, null, 1);
                av8Var.n0(u72Var);
                O2 = u72Var;
            } else {
                q50Var2 = q50Var;
            }
            hz8.o(av8Var, p75Var, (Function2) O2);
            d80 d80Var = q50Var2.c;
            av8Var.s(false);
            return d80Var;
        }
        f = 0.0f;
        O = av8Var.O();
        Object obj42 = O;
        if (O == a99Var) {
        }
        q50Var = (q50) obj42;
        p75 p75Var2 = new p75(f);
        int i42 = (av8Var.i(q50Var) ? 1 : 0) | (av8Var.d(f) ? 1 : 0) | (((((i & 14) ^ 6) > 4 || !av8Var.h(z)) && (i & 6) != 4) ? 0 : 1);
        if (((i & 896) ^ 384) > 256) {
        }
        i3 = 0;
        i2 = i42 | i3 | (av8Var.i(i7aVar) ? 1 : 0);
        O2 = av8Var.O();
        if (i2 == 0) {
        }
        q50Var2 = q50Var;
        u72 u72Var2 = new u72(q50Var2, f, z, this, i7aVar, null, 1);
        av8Var.n0(u72Var2);
        O2 = u72Var2;
        hz8.o(av8Var, p75Var2, (Function2) O2);
        d80 d80Var2 = q50Var2.c;
        av8Var.s(false);
        return d80Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gk2)) {
            return false;
        }
        gk2 gk2Var = (gk2) obj;
        return p75.b(this.a, gk2Var.a) && p75.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && p75.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && p75.b(this.b, gk2Var.b) && p75.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final int hashCode() {
        return Float.hashCode(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + fc6.a(this.b, fc6.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fc6.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
