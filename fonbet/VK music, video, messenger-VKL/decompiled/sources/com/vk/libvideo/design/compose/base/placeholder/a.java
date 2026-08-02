package com.vk.libvideo.design.compose.base.placeholder;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.alb0;
import xsna.bhu0;
import xsna.byc0;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.fo7;
import xsna.frv0;
import xsna.hr80;
import xsna.k9q0;
import xsna.kbe;
import xsna.kqu0;
import xsna.l5g;
import xsna.mno0;
import xsna.n34;
import xsna.pqv;
import xsna.pzu0;
import xsna.q630;
import xsna.qri;
import xsna.rmw;
import xsna.rrv0;
import xsna.s200;
import xsna.sy90;
import xsna.txj0;
import xsna.uco;
import xsna.wuv0;
import xsna.ylu0;
import xsna.yqv0;
import xsna.zoi;

/* compiled from: PlaceholderView.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: PlaceholderView.kt */
    /* renamed from: com.vk.libvideo.design.compose.base.placeholder.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1223a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PlaceholderViewState.Size.values().length];
            try {
                iArr[PlaceholderViewState.Size.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaceholderViewState.Size.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PlaceholderViewState.Appearance.values().length];
            try {
                iArr2[PlaceholderViewState.Appearance.Neutral.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PlaceholderViewState.Appearance.Overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final void a(PlaceholderViewState placeholderViewState, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        frv0 frv0Var;
        float f;
        float f2;
        long j;
        int[] iArr;
        long j2;
        int i4;
        ButtonStyle buttonStyle;
        ButtonAppearance buttonAppearance;
        q630 q630Var2;
        q630.a aVar2;
        int i5;
        char c;
        int i6;
        String a;
        int i7;
        pqv pqvVar;
        rmw rmwVar = placeholderViewState.a;
        mno0 mno0Var = placeholderViewState.b;
        VkColorToken vkColorToken = placeholderViewState.e;
        androidx.compose.runtime.a M = aVar.M(1840138312);
        if ((i & 6) == 0) {
            i2 = (M.J(placeholderViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (b.d()) {
                b.f(1840138312, i2, -1, "com.vk.libvideo.design.compose.base.placeholder.PlaceholderView (PlaceholderView.kt:35)");
            }
            PlaceholderViewState.Size size = (PlaceholderViewState.Size) ((zoi) placeholderViewState.f.getValue()).getValue();
            if (size == null) {
                size = PlaceholderViewState.Size.Medium;
            }
            PlaceholderViewState.Appearance value = placeholderViewState.a().getValue();
            if (value == null) {
                value = PlaceholderViewState.Appearance.Neutral;
            }
            int[] iArr2 = C1223a.$EnumSwitchMapping$0;
            int i8 = iArr2[size.ordinal()];
            if (i8 == 1) {
                i3 = 28;
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 24;
            }
            float f3 = i3;
            int i9 = iArr2[size.ordinal()];
            if (i9 == 1) {
                M.K(1556500047);
                if (b.d()) {
                    b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (b.d()) {
                    b.e();
                }
                frv0Var = wuv0Var.T;
                M.j();
            } else {
                if (i9 != 2) {
                    throw alb0.c(1556497853, M);
                }
                M.K(1556502067);
                if (b.d()) {
                    b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (b.d()) {
                    b.e();
                }
                frv0Var = wuv0Var2.s0;
                M.j();
            }
            frv0 frv0Var2 = frv0Var;
            int i10 = iArr2[size.ordinal()];
            if (i10 == 1) {
                f = kqu0.t;
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = kqu0.q;
            }
            float f4 = f;
            int[] iArr3 = C1223a.$EnumSwitchMapping$1;
            int i11 = iArr3[value.ordinal()];
            if (i11 == 1) {
                f2 = f3;
                M.K(1208418115);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                j = ylu0Var.getIcon().l;
                M.j();
            } else {
                if (i11 != 2) {
                    throw alb0.c(1208415686, M);
                }
                M.K(1208420706);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                f2 = f3;
                j = ylu0Var2.getIcon().c;
                M.j();
            }
            int i12 = iArr3[value.ordinal()];
            if (i12 == 1) {
                iArr = iArr3;
                M.K(-1644548361);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                j2 = ylu0Var3.getText().p;
                M.j();
            } else {
                if (i12 != 2) {
                    throw alb0.c(-1644550790, M);
                }
                M.K(-1644545770);
                iArr = iArr3;
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                j2 = ylu0Var4.getText().d;
                M.j();
            }
            long j3 = j2;
            int i13 = iArr[value.ordinal()];
            if (i13 != 1) {
                i4 = 2;
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                buttonStyle = ButtonStyle.Primary;
            } else {
                i4 = 2;
                buttonStyle = ButtonStyle.Secondary;
            }
            ButtonStyle buttonStyle2 = buttonStyle;
            int i14 = iArr[value.ordinal()];
            if (i14 == 1) {
                buttonAppearance = ButtonAppearance.Neutral;
            } else {
                if (i14 != i4) {
                    throw new NoWhenBranchMatchedException();
                }
                buttonAppearance = ButtonAppearance.Overlay;
            }
            ButtonAppearance buttonAppearance2 = buttonAppearance;
            e.a aVar3 = e.a;
            q630.a aVar4 = q630.a.a;
            if (vkColorToken != null) {
                M.K(-1153585158);
                q630Var2 = hr80.m(aVar4, vkColorToken.a(0, M), aVar3);
                M.j();
            } else if (value == PlaceholderViewState.Appearance.Overlay) {
                M.K(-1153581159);
                if (b.d()) {
                    b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                if (b.d()) {
                    b.e();
                }
                q630Var2 = hr80.m(aVar4, ylu0Var5.j().a, aVar3);
                M.j();
            } else {
                M.K(-1153579088);
                M.j();
                q630Var2 = aVar4;
            }
            q630 D = s200.D(q630Var.g(q630Var2), 8);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            c a2 = androidx.compose.foundation.layout.b.a(cVar, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            float f5 = f2;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (rmwVar != null) {
                M.K(1376503094);
                c = 2;
                i5 = 1;
                aVar2 = aVar4;
                pzu0.b(rmw.b.a(new uco(byc0.b(f5, f5)), rmwVar, M, 0, 2), null, txj0.q(aVar4, f5), j, M, 56, 0);
            } else {
                aVar2 = aVar4;
                i5 = 1;
                c = 2;
                M.K(1373946896);
            }
            M.j();
            if (mno0Var != null) {
                M.K(1376789069);
                q630 H = s200.H(txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, i5, aVar2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                String a3 = mno0Var.a(0, M);
                i6 = 0;
                yqv0.c(a3, H, j3, null, null, 0, 3, null, 2, false, 0, 3, null, frv0Var2, M, 100663296, 48, 5816);
                M = M;
            } else {
                i6 = 0;
                M.K(1373946896);
            }
            M.j();
            mno0 mno0Var2 = placeholderViewState.c;
            if (mno0Var2 == null) {
                M.K(1377229733);
                M.j();
                a = null;
            } else {
                M.K(-1618141220);
                a = mno0Var2.a(i6, M);
                M.j();
            }
            if (a == null || size == PlaceholderViewState.Size.Small) {
                M.K(1373946896);
            } else {
                M.K(1377327849);
                q630 H2 = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                kbe kbeVar = placeholderViewState.b().c;
                ButtonSize buttonSize = ButtonSize.Small;
                rmw rmwVar2 = placeholderViewState.d;
                if (rmwVar2 == null) {
                    M.K(1377650403);
                    M.j();
                    i7 = 6;
                    pqvVar = null;
                } else {
                    M.K(1377650404);
                    float f6 = 16;
                    i7 = 6;
                    pqv a4 = cp8.b.a.a(rmw.b.a(new uco(byc0.b(f6, f6)), rmwVar2, M, 6, 2), new l5g(l5g.k), null, null, null, M, 196664, 28);
                    M.j();
                    pqvVar = a4;
                }
                androidx.compose.runtime.a aVar6 = M;
                bhu0.d(kbeVar, buttonStyle2, buttonAppearance2, H2, buttonSize, null, pqvVar, cp8.d.a.a(a, null, M, 3072, i7), false, null, aVar6, 24576, 3872);
                M = aVar6;
            }
            M.j();
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new fo7(placeholderViewState, q630Var, i, 3);
        }
    }
}
