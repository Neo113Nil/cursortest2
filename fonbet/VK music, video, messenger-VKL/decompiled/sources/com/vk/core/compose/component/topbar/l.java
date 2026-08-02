package com.vk.core.compose.component.topbar;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.IconButtonRippleType;
import com.vk.core.compose.component.topbar.TopBar$Before;
import xsna.bu00;
import xsna.gzs;
import xsna.izs;
import xsna.jo60;
import xsna.kai;
import xsna.l5g;
import xsna.lg90;
import xsna.mtk0;
import xsna.nzu0;
import xsna.q630;
import xsna.rrv0;
import xsna.s3q0;
import xsna.sta;
import xsna.wh50;
import xsna.wzs;
import xsna.ylu0;
import xsna.znk0;

/* compiled from: TopBar.kt */
/* loaded from: classes17.dex */
public final class l {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final k kVar, final gzs<s3q0> gzsVar, final lg90 lg90Var, final String str, final mtk0<Float> mtk0Var, final q630 q630Var, l5g l5gVar, TopBar$Before.IconType iconType, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        l5g l5gVar2;
        int i4;
        androidx.compose.runtime.a aVar2;
        final TopBar$Before.IconType iconType2;
        final l5g l5gVar3;
        androidx.compose.runtime.f s;
        int i5;
        int i6;
        gzs<s3q0> gzsVar2;
        androidx.compose.runtime.a M = aVar.M(-534511394);
        if ((i & 6) == 0) {
            i3 = (M.J(kVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(mtk0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.J(q630Var) ? 131072 : 65536;
        }
        int i7 = i2 & 64;
        if (i7 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            l5gVar2 = l5gVar;
            i3 |= M.J(l5gVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= M.o(iconType == null ? -1 : iconType.ordinal()) ? 8388608 : 4194304;
            }
            if (M.t(i3 & 1, (4793491 & i3) == 4793490)) {
                aVar2 = M;
                aVar2.h();
                iconType2 = iconType;
                l5gVar3 = l5gVar2;
            } else {
                final l5g l5gVar4 = i7 != 0 ? null : l5gVar2;
                TopBar$Before.IconType iconType3 = i4 == 0 ? iconType : null;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-534511394, i3, -1, "com.vk.core.compose.component.topbar.TopBarIconButton (TopBar.kt:2172)");
                }
                long d = znk0.z().d(kVar, mtk0Var.getValue().floatValue(), M, i3 & 14);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = androidx.compose.runtime.k.b(new l5g(d));
                    M.R(x);
                }
                final wh50 wh50Var = (wh50) x;
                TopBar$Before.IconType iconType4 = iconType3;
                wh50Var.setValue(new l5g(d));
                znk0.z().getClass();
                M.K(1475234095);
                if (androidx.compose.runtime.b.d()) {
                    i5 = 0;
                    i6 = -1;
                    androidx.compose.runtime.b.f(1475234095, 0, -1, "com.vk.core.compose.component.topbar.MilkshakeTopBarDefaults.iconOverlayBackgroundColor (MilkshakeTopBarDefaults.kt:127)");
                } else {
                    i5 = 0;
                    i6 = -1;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i5, i6, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.j().b;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                boolean p = M.p(j) | ((i3 & 57344) == 16384);
                Object x2 = M.x();
                if (p || x2 == c0012a) {
                    x2 = new sta(j, mtk0Var, 3);
                    M.R(x2);
                }
                q630 e = bu00.e(q630Var, (izs) x2);
                b z = znk0.z();
                if (iconType4 == null) {
                    TopBar$Before.IconType iconType5 = TopBar$Before.IconType.Close;
                }
                long e2 = z.e();
                IconButtonRippleType iconButtonRippleType = IconButtonRippleType.Bounded;
                if (gzsVar == null) {
                    M.K(2110705634);
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = new jo60(15);
                        M.R(x3);
                    }
                    gzsVar2 = (gzs) x3;
                    M.j();
                } else {
                    M.K(1730654892);
                    M.j();
                    gzsVar2 = gzsVar;
                }
                aVar2 = M;
                l5g l5gVar5 = l5gVar4;
                nzu0.d(gzsVar2, e2, e, false, iconButtonRippleType, gzsVar != null, null, null, kai.c(-1792415405, new wzs() { // from class: xsna.p7p0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1792415405, intValue, -1, "com.vk.core.compose.component.topbar.TopBarIconButton.<anonymous> (TopBar.kt:2191)");
                            }
                            znk0.z().getClass();
                            q630 a = o19.a(txj0.m(q630.a.a, 28), ((Number) aVar3.r(hfj.a)).floatValue());
                            l5g l5gVar6 = l5g.this;
                            vqv.a(lg90Var, str, a, l5gVar6 != null ? l5gVar6.a : ((l5g) wh50Var.getValue()).a, aVar3, 8, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, M), aVar2, 100687872, 200);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                iconType2 = iconType4;
                l5gVar3 = l5gVar5;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.q7p0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        com.vk.core.compose.component.topbar.l.a(com.vk.core.compose.component.topbar.k.this, gzsVar, lg90Var, str, mtk0Var, q630Var, l5gVar3, iconType2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        l5gVar2 = l5gVar;
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if (M.t(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
