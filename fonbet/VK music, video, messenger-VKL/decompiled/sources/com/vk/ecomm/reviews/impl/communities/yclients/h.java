package com.vk.ecomm.reviews.impl.communities.yclients;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.reviews.impl.communities.yclients.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ahn;
import xsna.bhu0;
import xsna.bu7;
import xsna.ck70;
import xsna.cp10;
import xsna.cri;
import xsna.d370;
import xsna.dt1;
import xsna.f9t;
import xsna.gcv;
import xsna.gzs;
import xsna.izs;
import xsna.ja8;
import xsna.k9q0;
import xsna.l3j;
import xsna.lg90;
import xsna.m3j;
import xsna.n34;
import xsna.nzu0;
import xsna.or;
import xsna.pg90;
import xsna.pzu0;
import xsna.q630;
import xsna.qri;
import xsna.qzu0;
import xsna.ra8;
import xsna.rrv0;
import xsna.s200;
import xsna.sy90;
import xsna.txj0;
import xsna.ty6;
import xsna.ur;
import xsna.vjw;
import xsna.wlb0;
import xsna.wq0;
import xsna.wzs;
import xsna.ylu0;
import xsna.yqv0;

/* compiled from: ConnectYClientsReviewsStatesContent.kt */
/* loaded from: classes18.dex */
public final class h {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var, boolean z) {
        androidx.compose.runtime.a M = aVar.M(24493102);
        int i2 = i | 6 | (M.l(z) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(24493102, i2, -1, "com.vk.ecomm.reviews.impl.communities.yclients.ConnectYClientsReviewsContent (ConnectYClientsReviewsStatesContent.kt:38)");
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(829899586, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationVkYclients120H> (VkIcons.kt:4072)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_illustration_vk_yclients_120h, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            d(izsVar, a, null, 0L, d370.N(R.string.connect_yclients_reviews_bottom_sheet_title, 0, M), d370.N(R.string.connect_yclients_reviews_bottom_sheet_description, 0, M), d370.N(R.string.connect_yclients_reviews_bottom_sheet_button, 0, M), z, M, ((i2 >> 6) & 14) | 560 | ((i2 << 21) & 234881024), 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = q630.a.a;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m3j(i, izsVar, q630Var, z);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var, boolean z) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1006786811);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | 48 | (M.l(z) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1006786811, i2, -1, "com.vk.ecomm.reviews.impl.communities.yclients.ConnectYClientsReviewsError (ConnectYClientsReviewsStatesContent.kt:55)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1223610404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorOutline56> (VkSdkIcons.kt:814)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_error_outline_56, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            d(izsVar, null, a, ylu0Var.getIcon().l, d370.N(R.string.connect_yclients_reviews_bottom_sheet_error_title, 0, M), d370.N(R.string.connect_yclients_reviews_bottom_sheet_error_description, 0, M), d370.N(R.string.connect_yclients_reviews_bottom_sheet_error_button, 0, M), z, M, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 4096 | ((i2 << 18) & 234881024), 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l3j(i, izsVar, q630Var2, z);
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1233475064);
        int i2 = i | 6 | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1233475064, i2, -1, "com.vk.ecomm.reviews.impl.communities.yclients.ConnectYClientsReviewsSuccess (ConnectYClientsReviewsStatesContent.kt:72)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1444785948, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOutline56> (VkSdkIcons.kt:374)");
            }
            lg90 b = or.b(M, 1751086399, R.drawable.vk_icon_check_circle_outline_56, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            d(izsVar, null, b, 0L, d370.N(R.string.connect_yclients_reviews_bottom_sheet_success_title, 0, M), d370.N(R.string.connect_yclients_reviews_bottom_sheet_success_description, 0, M), d370.N(R.string.connect_yclients_reviews_bottom_sheet_success_button, 0, M), false, M, ((i2 >> 3) & 14) | 4144, 276);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bu7(q630Var2, izsVar, i);
        }
    }

    public static final void d(final izs izsVar, lg90 lg90Var, lg90 lg90Var2, long j, final String str, final String str2, final String str3, boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        long j2;
        androidx.compose.runtime.a aVar2;
        final lg90 lg90Var3;
        final lg90 lg90Var4;
        final boolean z2;
        final long j3;
        lg90 lg90Var5;
        long j4;
        boolean z3;
        int i4;
        lg90 lg90Var6;
        long j5;
        int i5;
        int i6;
        androidx.compose.runtime.a M = aVar.M(358886764);
        if ((i & 6) == 0) {
            i3 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i & 48;
        q630.a aVar3 = q630.a.a;
        if (i7 == 0) {
            i3 |= M.J(aVar3) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? M.J(lg90Var2) : M.y(lg90Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j2 = j;
                if (M.p(j2)) {
                    i6 = 16384;
                    i3 |= i6;
                }
            } else {
                j2 = j;
            }
            i6 = 8192;
            i3 |= i6;
        } else {
            j2 = j;
        }
        if ((i & 196608) == 0) {
            i3 |= M.J(str) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= M.J(str2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= M.J(str3) ? 8388608 : 4194304;
        }
        int i10 = i2 & 256;
        if (i10 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= M.l(z) ? 67108864 : 33554432;
        }
        if (M.t(i3 & 1, (i3 & 38347923) != 38347922)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                lg90Var5 = i8 != 0 ? null : lg90Var;
                lg90 lg90Var7 = i9 != 0 ? null : lg90Var2;
                if ((i2 & 16) != 0) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j4 = ylu0Var.getIcon().a;
                    i3 &= -57345;
                } else {
                    j4 = j2;
                }
                z3 = i10 != 0 ? false : z;
                i4 = i3;
                lg90Var6 = lg90Var7;
                j5 = j4;
            } else {
                M.h();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                lg90Var5 = lg90Var;
                z3 = z;
                i4 = i3;
                j5 = j2;
                lg90Var6 = lg90Var2;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(358886764, i4, -1, "com.vk.ecomm.reviews.impl.communities.yclients.Content (ConnectYClientsReviewsStatesContent.kt:94)");
            }
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            lg90 lg90Var8 = lg90Var5;
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            lg90 lg90Var9 = lg90Var6;
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 f2 = txj0.f(aVar3, 1.0f);
            long j6 = j5;
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 E = ahn.E(s200.F(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ra8.a.b(aVar3, dt1.a.d)), "closeButton");
            if (androidx.compose.runtime.b.d()) {
                i5 = 0;
                androidx.compose.runtime.b.f(1974706104, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dismiss24> (VkSdkIcons.kt:648)");
            } else {
                i5 = 0;
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_dismiss_24, i5, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.reviews_bottom_sheet_close, i5, M);
            long j7 = wlb0.h(M).getIcon().l;
            int i11 = i4 & 14;
            int i12 = i11 == 4 ? 1 : i5;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (i12 != 0 || x == obj) {
                x = new wq0(izsVar, 2);
                M.R(x);
            }
            int i13 = i4;
            final boolean z4 = z3;
            nzu0.c((gzs) x, a2, N, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j7, false, null, false, null, null, M, 64, 2000);
            int i14 = i13 >> 3;
            int i15 = i5;
            e(lg90Var9, lg90Var8, j6, M, ((i13 >> 6) & 112) | 582 | (i13 & 896) | (i14 & 7168));
            M.G();
            ty6.a aVar5 = dt1.a.o;
            float f3 = 16;
            int i16 = i13 >> 15;
            yqv0.c(str, ahn.E(s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new gcv(aVar5)), "title"), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).C, M, i16 & 14, 0, 8120);
            f9t.e(txj0.h(aVar3, 8), M, 6);
            yqv0.c(str2, ahn.E(s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new gcv(aVar5)), "message"), wlb0.h(M).getText().r, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).e0, M, (i13 >> 18) & 14, 0, 8120);
            f9t.e(txj0.h(aVar3, 24), M, 6);
            q630 E2 = ahn.E(s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f)), "actionButton");
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            int i17 = ((i13 & 234881024) == 67108864 ? 1 : i15) | (i11 != 4 ? i15 : 1);
            Object x2 = M.x();
            if (i17 != 0 || x2 == obj) {
                x2 = new gzs() { // from class: xsna.n3j
                    @Override // xsna.gzs
                    public final Object invoke() {
                        if (!z4) {
                            izsVar.invoke(a.c.b);
                        }
                        return s3q0.a;
                    }
                };
                M.R(x2);
            }
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, E2, null, z4, false, null, null, null, str3, null, null, null, null, false, null, null, null, M, (i14 & 29360128) | 28080, i16 & 896, 0, 4190048);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            lg90Var3 = lg90Var8;
            lg90Var4 = lg90Var9;
            z2 = z4;
            j3 = j6;
        } else {
            aVar2 = M;
            aVar2.h();
            lg90Var3 = lg90Var;
            lg90Var4 = lg90Var2;
            z2 = z;
            j3 = j2;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.o3j
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    com.vk.ecomm.reviews.impl.communities.yclients.h.d(izs.this, lg90Var3, lg90Var4, j3, str, str2, str3, z2, (androidx.compose.runtime.a) obj2, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(final lg90 lg90Var, final lg90 lg90Var2, final long j, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2045710305);
        int i3 = i & 6;
        ra8 ra8Var = ra8.a;
        if (i3 == 0) {
            i2 = (M.J(ra8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(lg90Var2) : M.y(lg90Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.p(j) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2045710305, i2, -1, "com.vk.ecomm.reviews.impl.communities.yclients.ImagePart (ConnectYClientsReviewsStatesContent.kt:160)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            q630.a aVar2 = q630.a.a;
            q630 b = ra8Var.b(aVar2, ty6Var);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (lg90Var == null) {
                M.K(-1071366075);
                M.j();
            } else {
                M.K(-1071366074);
                float f = 16;
                f9t.e(txj0.h(aVar2, f), M, 6);
                pzu0.b(lg90Var, null, s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ahn.E(aVar2, "icon")), j, M, (i2 & 7168) | 440, 0);
                ck70.b(aVar2, 12, M, 6);
            }
            if (lg90Var2 == null) {
                M.K(-1070950458);
                M.j();
            } else {
                M.K(-1070950457);
                f9t.e(txj0.h(aVar2, 17), M, 6);
                vjw.a(lg90Var2, null, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ahn.E(aVar2, "image")), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 440, 120);
                M = M;
                ck70.b(aVar2, 15, M, 6);
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.p3j
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    com.vk.ecomm.reviews.impl.communities.yclients.h.e(lg90.this, lg90Var2, j, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
