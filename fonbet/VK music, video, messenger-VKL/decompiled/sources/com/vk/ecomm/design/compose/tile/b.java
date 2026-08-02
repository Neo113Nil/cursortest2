package com.vk.ecomm.design.compose.tile;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import xsna.akv0;
import xsna.ck70;
import xsna.cri;
import xsna.dt1;
import xsna.f9t;
import xsna.k9q0;
import xsna.kqu0;
import xsna.n34;
import xsna.q630;
import xsna.qri;
import xsna.rte0;
import xsna.s200;
import xsna.sua;
import xsna.sy90;
import xsna.txj0;
import xsna.vog0;
import xsna.wzs;
import xsna.xga0;

/* compiled from: MarketProductTileSkeleton.kt */
/* loaded from: classes18.dex */
public final class b {

    /* compiled from: MarketProductTileSkeleton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketProductTileConfig.DisplayCtaButtonType.values().length];
            try {
                iArr[MarketProductTileConfig.DisplayCtaButtonType.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, float f, float f2, boolean z, MarketProductTileConfig.DisplayCtaButtonType displayCtaButtonType, androidx.compose.runtime.a aVar, final int i, final int i2) {
        float f3;
        int i3;
        float f4;
        int i4;
        boolean z2;
        int i5;
        q630 q630Var2;
        final float f5;
        final MarketProductTileConfig.DisplayCtaButtonType displayCtaButtonType2;
        f s;
        androidx.compose.runtime.a M = aVar.M(995685482);
        int i6 = i | 6;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i | 54;
            f3 = f;
        } else {
            f3 = f;
            i3 = i6 | (M.n(f3) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i3 | 384;
            f4 = f2;
        } else {
            f4 = f2;
            i4 = i3 | (M.n(f4) ? 256 : 128);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i4 |= M.l(z2) ? 2048 : 1024;
            i5 = i2 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= M.o(displayCtaButtonType == null ? -1 : displayCtaButtonType.ordinal()) ? 16384 : 8192;
            }
            if (M.t(i4 & 1, (i4 & 9363) == 9362)) {
                M.h();
                q630Var2 = q630Var;
                f5 = f3;
                displayCtaButtonType2 = displayCtaButtonType;
            } else {
                float f6 = i7 != 0 ? 0 : f3;
                if (i8 != 0) {
                    f4 = 0;
                }
                if (i9 != 0) {
                    z2 = false;
                }
                displayCtaButtonType2 = i5 != 0 ? MarketProductTileConfig.DisplayCtaButtonType.ABOVE_IMAGE : displayCtaButtonType;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(995685482, i4, -1, "com.vk.ecomm.design.compose.tile.MarketProductTileSkeleton (MarketProductTileSkeleton.kt:32)");
                }
                float f7 = kqu0.r;
                float f8 = kqu0.s;
                q630.a aVar2 = q630.a.a;
                q630 G = s200.G(aVar2, f8, f7, f8, f8);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, G);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar3);
                } else {
                    M.f();
                }
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                SkeletonType skeletonType = SkeletonType.Block;
                q630 d = sua.d(0.8317f, txj0.f(rte0.d(aVar2, vog0.b(kqu0.e)), 1.0f), false);
                if (f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    d = d.g(txj0.s(aVar2, f6, f4));
                }
                akv0.a(skeletonType, d, M, 6);
                float f9 = 9;
                f9t.e(txj0.h(aVar2, f9), M, 6);
                float f10 = 8;
                akv0.a(skeletonType, txj0.q(aVar2, f10), M, 54);
                f9t.e(txj0.h(aVar2, f9), M, 6);
                akv0.a(skeletonType, txj0.q(aVar2, f10), M, 54);
                if (z2) {
                    M.K(266829890);
                } else {
                    M.K(269160129);
                    f9t.e(txj0.h(aVar2, f9), M, 6);
                    akv0.a(skeletonType, txj0.q(aVar2, f10), M, 54);
                }
                M.j();
                if (a.$EnumSwitchMapping$0[displayCtaButtonType2.ordinal()] == 1) {
                    M.K(269440276);
                    f9t.e(txj0.h(aVar2, 17), M, 6);
                    akv0.a(skeletonType, rte0.d(txj0.h(txj0.f(aVar2, 1.0f), 16), vog0.b(4)), M, 6);
                    ck70.b(aVar2, 3, M, 6);
                } else {
                    M.K(269844640);
                    M.j();
                }
                if (xga0.c(aVar2, 6, M, 6)) {
                    androidx.compose.runtime.b.e();
                }
                f5 = f6;
                q630Var2 = aVar2;
            }
            final float f11 = f4;
            final boolean z3 = z2;
            s = M.s();
            if (s == null) {
                final q630 q630Var3 = q630Var2;
                s.d = new wzs() { // from class: xsna.zc10
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        com.vk.ecomm.design.compose.tile.b.a(q630.this, f5, f11, z3, displayCtaButtonType2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        if (M.t(i4 & 1, (i4 & 9363) == 9362)) {
        }
        final float f112 = f4;
        final boolean z32 = z2;
        s = M.s();
        if (s == null) {
        }
    }
}
