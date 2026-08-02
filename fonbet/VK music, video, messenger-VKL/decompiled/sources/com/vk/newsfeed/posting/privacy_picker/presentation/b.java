package com.vk.newsfeed.posting.privacy_picker.presentation;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.cell.content.b1;
import com.vk.core.compose.component.cell.content.f1;
import com.vk.core.compose.component.cell.content.h1;
import com.vk.core.compose.component.cell.content.k0;
import com.vk.core.compose.component.cell.content.m0;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.cell.content.p0;
import com.vk.core.compose.component.cell.content.u0;
import com.vk.core.compose.component.cell.content.y0;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.UserStackSize;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.group.header.g;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.u;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ahn;
import xsna.alb0;
import xsna.bhu0;
import xsna.bqg;
import xsna.cri;
import xsna.d370;
import xsna.dl70;
import xsna.dt1;
import xsna.efd0;
import xsna.em;
import xsna.gec0;
import xsna.gp;
import xsna.gzs;
import xsna.h7g;
import xsna.iyk0;
import xsna.izs;
import xsna.j97;
import xsna.jz30;
import xsna.k9q0;
import xsna.kqu0;
import xsna.l54;
import xsna.lcd0;
import xsna.lg90;
import xsna.lxz;
import xsna.mh3;
import xsna.muv0;
import xsna.n34;
import xsna.n9w;
import xsna.oq5;
import xsna.or;
import xsna.p5;
import xsna.q630;
import xsna.qri;
import xsna.r0;
import xsna.rrv0;
import xsna.s200;
import xsna.sux;
import xsna.sy90;
import xsna.txj0;
import xsna.u78;
import xsna.wiu0;
import xsna.wna;
import xsna.wzs;
import xsna.xcc;
import xsna.ygv0;
import xsna.ylu0;
import xsna.zje;
import xsna.zq;

/* compiled from: PrivacySettingsNewContentView.kt */
/* loaded from: classes4.dex */
public final class b {

    /* compiled from: PrivacySettingsNewContentView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrivacyViewState.Type.values().length];
            try {
                iArr[PrivacyViewState.Type.Privacy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrivacyViewState.Type.PrivacyAndDons.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrivacyViewState.Type.Dons.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(PrivacyViewState.a.C1434a c1434a, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1817415950);
        if ((i & 6) == 0) {
            i2 = (M.J(c1434a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1817415950, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyBlocksContent (PrivacySettingsNewContentView.kt:312)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            int i3 = i2;
            f a3 = f.a.a(d370.N(R.string.privacy_settings_menu_description, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510);
            b.d dVar = b.d.a;
            q630.a aVar4 = q630.a.a;
            g.b(a3, txj0.f(aVar4, 1.0f), dVar, null, null, null, true, M, 1573296, 56);
            int i4 = i3 & 112;
            e(c1434a.a, izsVar, null, M, i4, 4);
            aVar2 = M;
            g.b(f.a.a(d370.N(R.string.privacy_settings_subtitle_without_access, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510), txj0.f(s200.D(aVar4, kqu0.r), 1.0f), dVar, null, null, null, true, aVar2, 1573248, 56);
            c(c1434a.b, izsVar, null, aVar2, i4);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new l54(i, 3, c1434a, izsVar, q630Var);
        }
    }

    public static final void b(PrivacyViewState.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-1393885619);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1393885619, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyContent (PrivacySettingsNewContentView.kt:160)");
            }
            if (aVar instanceof PrivacyViewState.a.b) {
                M.K(-1502421493);
                d((PrivacyViewState.a.b) aVar, izsVar, q630Var, M, i2 & 1008);
                M.j();
            } else if (aVar instanceof PrivacyViewState.a.c) {
                M.K(-1502258619);
                e(((PrivacyViewState.a.c) aVar).a, izsVar, q630Var, M, i2 & 1008, 0);
                M.j();
            } else {
                if (!(aVar instanceof PrivacyViewState.a.C1434a)) {
                    throw alb0.c(505722370, M);
                }
                M.K(-1502101108);
                a((PrivacyViewState.a.C1434a) aVar, izsVar, q630Var, M, i2 & 1008);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new em(aVar, izsVar, q630Var, i, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0267, code lost:
    
        if (r6 == r5) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(PrivacyViewState.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        PrivacyViewState.b.a aVar2;
        Cell$Middle.d a2;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(1463882746);
        if ((i & 6) == 0) {
            i2 = i | (M.J(bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1463882746, i3, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyDonutWithoutAccessContent (PrivacySettingsNewContentView.kt:240)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            String str = null;
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            h1 a4 = Cell$Middle.d.b.a(d370.N(R.string.open_post_for_all, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            Date date = bVar.a;
            PrivacyViewState.b.a aVar5 = bVar.b;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (date == null) {
                M.K(434442555);
            } else {
                M.K(434442556);
                Object x = M.x();
                if (x == c0012a2) {
                    x = new gec0();
                    M.R(x);
                }
                Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                ((gec0) x).getClass();
                str = gec0.a(context, date);
            }
            M.j();
            if (str == null) {
                str = zq.a(M, 434654875, R.string.never_open, M, 0);
            } else {
                M.K(-2064196359);
                M.j();
            }
            k0 a5 = Cell$Middle.a.a(a4, Cell$Middle.c.b.b(str, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 196608, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            u0 a6 = o.b.a.a(null, null, ylu0Var.getIcon().n, false, M, 196608, 23);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a2) {
                x2 = new j97(izsVar, 6);
                M.R(x2);
            }
            wiu0.b(null, false, null, a5, a6, (gzs) x2, null, M, 0, 71);
            androidx.compose.runtime.a aVar6 = M;
            q630 E = ahn.E(aVar3, "PrivacySettingsDonutTeaserCell");
            if (aVar5.b) {
                aVar6.K(435210829);
                a2 = new wna(d370.N(R.string.post_teaser_for_non_dons, 0, aVar6));
                aVar6.j();
                aVar2 = aVar5;
            } else {
                aVar6.K(435380399);
                aVar2 = aVar5;
                a2 = Cell$Middle.d.b.a(d370.N(R.string.post_teaser_for_non_dons, 0, aVar6), null, null, 0, null, null, aVar6, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                aVar6 = aVar6;
                aVar6.j();
            }
            Cell$Middle.d dVar = a2;
            String str2 = aVar2.a;
            if (str2 == null) {
                str2 = zq.a(aVar6, -2064156801, R.string.post_teaser_by_default, aVar6, 0);
            } else {
                aVar6.K(-2064157700);
                aVar6.j();
            }
            androidx.compose.runtime.a aVar7 = aVar6;
            k0 a7 = Cell$Middle.a.a(dVar, Cell$Middle.c.b.b(str2, 0, null, null, null, aVar6, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar7, 196608, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar7.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            u0 a8 = o.b.a.a(null, null, ylu0Var2.getIcon().n, false, aVar7, 196608, 23);
            boolean z2 = i4 == 32;
            Object x3 = aVar7.x();
            if (z2) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
            }
            x3 = new u78(izsVar, 4);
            aVar7.R(x3);
            a.C0011a.C0012a c0012a3 = c0012a;
            wiu0.b(E, false, null, a7, a8, (gzs) x3, null, aVar7, 6, 70);
            boolean z3 = i4 == 32;
            Object x4 = aVar7.x();
            if (z3 || x4 == c0012a3) {
                x4 = new oq5(izsVar, 9);
                aVar7.R(x4);
            }
            bhu0.e((gzs) x4, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, s200.E(txj0.f(aVar3, 1.0f), kqu0.b, kqu0.v), null, false, false, null, null, null, d370.N(R.string.privacy_settings_button_ready, 0, aVar7), null, null, null, null, false, null, null, null, aVar7, X2.b.f, 0, 0, 4190176);
            M = aVar7;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h7g(i, 2, (Object) bVar, izsVar, q630Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [xsna.q630] */
    public static final void d(PrivacyViewState.a.b bVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        boolean z;
        h1 h1Var;
        a.C0011a.C0012a c0012a;
        gzs gzsVar;
        y0 y0Var;
        androidx.compose.runtime.a aVar2;
        gzs gzsVar2;
        DonutLevel donutLevel = bVar.a;
        androidx.compose.runtime.a M = aVar.M(-1576937688);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1576937688, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyOnlyDonutContent (PrivacySettingsNewContentView.kt:183)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            q630 E = ahn.E(txj0.f(q630.a.a, 1.0f), "PrivacySettingsSingleDonutLevelButton");
            int i3 = i2;
            h1 a3 = Cell$Middle.d.b.a(d370.N(R.string.privacy_settings_community_donut_level, 0, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            boolean z2 = bVar.b;
            if (donutLevel == null) {
                M.K(747114334);
                M.j();
                z = z2;
                h1Var = null;
            } else {
                M.K(747114335);
                String O = d370.O(z2 ? R.string.privacy_settings_donut_level_and_higher : R.string.privacy_settings_single_donut_level, new Object[]{donutLevel.c}, M);
                z = z2;
                h1 b = Cell$Middle.c.b.b(O, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
                h1Var = b;
            }
            k0 a4 = Cell$Middle.a.a(a3, h1Var, null, null, M, 196608, 28);
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z) {
                M.K(747695244);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().n;
                Object x = M.x();
                if (x == c0012a2) {
                    x = new dl70(11);
                    M.R(x);
                }
                com.vk.core.compose.component.semantics.a a5 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                c0012a = c0012a2;
                gzsVar = null;
                y0Var = o.c.a(null, null, null, o.b.a.a(null, a5, j, false, M, 196608, 19), null, M, 55);
                M.j();
            } else {
                c0012a = c0012a2;
                gzsVar = null;
                M.K(748094400);
                M.j();
                y0Var = null;
            }
            if (z) {
                M.K(748192360);
                boolean z3 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    x2 = new u(29, izsVar, bVar);
                    M.R(x2);
                }
                M.j();
                aVar2 = M;
                gzsVar2 = (gzs) x2;
            } else {
                M.K(748349344);
                M.j();
                aVar2 = M;
                gzsVar2 = gzsVar;
            }
            androidx.compose.runtime.a aVar4 = aVar2;
            wiu0.b(E, false, null, a4, y0Var, gzsVar2, null, aVar4, 6, 70);
            M = aVar4;
            c(bVar.c, izsVar, gzsVar, M, i3 & 112);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new efd0(bVar, izsVar, q630Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Type inference failed for: r5v52, types: [com.vk.core.compose.component.cell.content.b0] */
    /* JADX WARN: Type inference failed for: r7v26, types: [com.vk.core.compose.component.cell.content.o$e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(ArrayList arrayList, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final ArrayList arrayList2;
        int i3;
        q630 q630Var2;
        int i4;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        String str;
        int i5;
        int i6;
        String str2;
        f1 f1Var;
        int i7;
        a.C0011a.C0012a c0012a;
        int i8;
        u0 u0Var;
        int i9;
        p0 p0Var;
        a.C0011a.C0012a c0012a2;
        PrivacyViewState.c cVar;
        u0 u0Var2;
        int i10;
        int i11;
        u0 u0Var3;
        androidx.compose.runtime.a aVar3;
        int i12;
        int i13;
        String str3;
        androidx.compose.runtime.a M = aVar.M(1048230583);
        int i14 = 2;
        if ((i & 6) == 0) {
            arrayList2 = arrayList;
            i3 = (M.J(arrayList2) ? 4 : 2) | i;
        } else {
            arrayList2 = arrayList;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            i4 = i3;
            int i16 = 1;
            int i17 = 0;
            if (M.t(i4 & 1, (i4 & 147) == 146)) {
                aVar2 = M;
                aVar2.h();
                q630Var3 = q630Var2;
            } else {
                q630.a aVar4 = q630.a.a;
                q630 q630Var4 = i15 != 0 ? aVar4 : q630Var2;
                int i18 = -1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1048230583, i4, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyOnlyPrivacyTypesContent (PrivacySettingsNewContentView.kt:349)");
                }
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630Var4);
                cri.h7.getClass();
                LayoutNode.a aVar5 = cri.a.b;
                int i19 = i4;
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
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                M.K(1675574658);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    PrivacyViewState.c cVar2 = (PrivacyViewState.c) it.next();
                    q630 f = txj0.f(aVar4, 1.0f);
                    boolean z = cVar2 instanceof PrivacyViewState.c.a;
                    if (z) {
                        str = "PrivacySettingsAllSelector";
                    } else if (cVar2 instanceof PrivacyViewState.c.d) {
                        str = "PrivacySettingsFriendsSelector";
                    } else if (cVar2 instanceof PrivacyViewState.c.b) {
                        str = "PrivacySettingsBestFriendsSelector";
                    } else {
                        if (!(cVar2 instanceof PrivacyViewState.c.C1435c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "PrivacySettingsSingleDonutLevelButton";
                    }
                    q630 E = ahn.E(f, str);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-474041833, i17, i18, "com.vk.newsfeed.posting.privacy_picker.presentation.resolvePrivacyTypeName (PrivacySettingsNewContentView.kt:397)");
                    }
                    if (z) {
                        i5 = -287662388;
                        i6 = R.string.privacy_settings_visible_all;
                    } else if (cVar2 instanceof PrivacyViewState.c.d) {
                        i5 = -287659024;
                        i6 = R.string.privacy_settings_visible_friends;
                    } else if (cVar2 instanceof PrivacyViewState.c.b) {
                        i5 = -287655403;
                        i6 = R.string.privacy_settings_visible_best_friends;
                    } else {
                        if (!(cVar2 instanceof PrivacyViewState.c.C1435c)) {
                            throw alb0.c(-287663928, M);
                        }
                        i5 = -287651658;
                        i6 = R.string.privacy_settings_community_donut_level;
                    }
                    String a3 = zq.a(M, i5, i6, M, i17);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    androidx.compose.runtime.a aVar6 = M;
                    q630 q630Var5 = q630Var4;
                    q630.a aVar7 = aVar4;
                    int i20 = i18;
                    f1 a4 = RichCell$Middle.h.b.a(a3, null, null, null, aVar6, 196608, 30);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1799273086, i17, i20, "com.vk.newsfeed.posting.privacy_picker.presentation.resolvePrivacyTypeExtraSubtitle (PrivacySettingsNewContentView.kt:415)");
                    }
                    if (cVar2 instanceof PrivacyViewState.c.C1435c) {
                        aVar6.K(-952446003);
                        PrivacyViewState.c.C1435c c1435c = (PrivacyViewState.c.C1435c) cVar2;
                        DonutLevel donutLevel = c1435c.f;
                        if (donutLevel == null) {
                            aVar6.K(-952421328);
                            aVar6.j();
                            str2 = null;
                        } else {
                            aVar6.K(-952421327);
                            str2 = d370.O(c1435c.e ? R.string.privacy_settings_donut_level_and_higher : R.string.privacy_settings_single_donut_level, new Object[]{donutLevel.c}, aVar6);
                            aVar6.j();
                        }
                        aVar6.j();
                    } else {
                        aVar6.K(-952070748);
                        aVar6.j();
                        str2 = null;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (str2 == null) {
                        aVar6.K(-2017723294);
                        aVar6.j();
                        f1Var = null;
                    } else {
                        aVar6.K(-2017723293);
                        f1 a5 = RichCell$Middle.c.b.a(str2, null, null, null, aVar6, 196608, 30);
                        aVar6.j();
                        f1Var = a5;
                    }
                    int i21 = i19 & 112;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1191823676, i21, i20, "com.vk.newsfeed.posting.privacy_picker.presentation.resolvePrivacyTypeSlot (PrivacySettingsNewContentView.kt:439)");
                    }
                    boolean z2 = cVar2 instanceof PrivacyViewState.c.b;
                    a.C0011a.C0012a c0012a3 = a.C0011a.a;
                    if (z2) {
                        aVar6.K(875767353);
                        PrivacyViewState.c.b bVar = (PrivacyViewState.c.b) cVar2;
                        lcd0 lcd0Var = bVar.e;
                        if (lcd0Var == null || lcd0Var.a <= 0) {
                            i7 = i21;
                            c0012a = c0012a3;
                            i8 = i16;
                            u0Var = null;
                            i9 = 32;
                            aVar6.K(876650202);
                            aVar6.j();
                            p0Var = null;
                        } else {
                            aVar6.K(875836855);
                            lcd0 lcd0Var2 = bVar.e;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1828708692, i17, i20, "com.vk.newsfeed.posting.privacy_picker.presentation.resolveBestFriendDescription (PrivacySettingsNewContentView.kt:473)");
                            }
                            List<String> list = lcd0Var2.c;
                            int size = list.size();
                            if (size == i16) {
                                aVar6.K(747434088);
                                aVar6.j();
                                str3 = list.get(i17);
                            } else if (size != i14) {
                                aVar6.K(747440622);
                                int i22 = lcd0Var2.a;
                                str3 = d370.F(R.plurals.privacy_settings_friends_quantity, i22, new Object[]{Integer.valueOf(i22)}, aVar6, i17);
                                aVar6.j();
                            } else {
                                aVar6.K(747435304);
                                str3 = d370.O(R.string.privacy_settings_two_friends, new Object[]{list.get(i17), list.get(i16)}, aVar6);
                                aVar6.j();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            UserStackSize userStackSize = UserStackSize.Small;
                            String str4 = str3;
                            xcc.a.g gVar = xcc.a.g.a;
                            Object x = aVar6.x();
                            if (x == c0012a3) {
                                x = new jz30(8);
                                aVar6.R(x);
                            }
                            u0Var = null;
                            com.vk.core.compose.component.semantics.a a6 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                            boolean J = aVar6.J(lcd0Var2);
                            Object x2 = aVar6.x();
                            if (J || x2 == c0012a3) {
                                x2 = new lxz(lcd0Var2, 21);
                                aVar6.R(x2);
                            }
                            izs izsVar2 = (izs) x2;
                            boolean z3 = ((i21 ^ 48) > 32 && aVar6.J(izsVar)) || (i19 & 48) == 32;
                            Object x3 = aVar6.x();
                            if (z3 || x3 == c0012a3) {
                                x3 = new zje(izsVar, 4);
                                aVar6.R(x3);
                            }
                            c0012a = c0012a3;
                            i8 = 1;
                            i7 = i21;
                            i9 = 32;
                            p0Var = m0.a(izsVar2, str4, userStackSize, gVar, (gzs) x3, a6, aVar6, 1573248, 0);
                            aVar6 = aVar6;
                            aVar6.j();
                        }
                        aVar6.j();
                    } else {
                        i7 = i21;
                        c0012a = c0012a3;
                        i8 = i16;
                        u0Var = null;
                        i9 = 32;
                        aVar6.K(876713442);
                        aVar6.j();
                        p0Var = null;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    u0 u0Var4 = u0Var;
                    androidx.compose.runtime.a aVar8 = aVar6;
                    int i23 = i19;
                    Iterator it2 = it;
                    int i24 = i9;
                    b1 a7 = RichCell$Middle.b.a(null, a4, null, f1Var, p0Var, null, null, null, null, aVar8, 0, 1995);
                    Boolean b = cVar2.b();
                    if (b != null ? b.booleanValue() : false) {
                        aVar8.K(-2017350673);
                        cVar = cVar2;
                        int i25 = (aVar8.J(cVar) ? 1 : 0) | (i7 == i24 ? i8 : 0);
                        Object x4 = aVar8.x();
                        c0012a2 = c0012a;
                        if (i25 != 0 || x4 == c0012a2) {
                            x4 = new p5(21, izsVar, cVar);
                            aVar8.R(x4);
                        }
                        ?? a8 = o.e.a.C0736a.a(true, (gzs) x4, false, null, aVar8, 24582, 12);
                        aVar8.j();
                        u0Var2 = a8;
                    } else {
                        c0012a2 = c0012a;
                        cVar = cVar2;
                        aVar8.K(-2017038472);
                        aVar8.j();
                        u0Var2 = u0Var4;
                    }
                    if (cVar.a()) {
                        aVar8.K(-2016924826);
                        if (androidx.compose.runtime.b.d()) {
                            i12 = -1;
                            i13 = 0;
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        } else {
                            i12 = -1;
                            i13 = 0;
                        }
                        ylu0 ylu0Var = (ylu0) aVar8.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        i11 = i12;
                        i10 = i13;
                        aVar3 = aVar8;
                        u0 a9 = o.b.a.a(null, null, ylu0Var.getIcon().n, false, aVar3, 196608, 23);
                        aVar3.j();
                        u0Var3 = a9;
                    } else {
                        i10 = 0;
                        i11 = -1;
                        aVar8.K(-2016757736);
                        aVar8.j();
                        u0Var3 = u0Var4;
                        aVar3 = aVar8;
                    }
                    y0 a10 = o.c.a(null, null, u0Var2, u0Var3, null, aVar3, 51);
                    androidx.compose.runtime.a aVar9 = aVar3;
                    int i26 = (aVar9.J(cVar) ? 1 : 0) | (i7 == i24 ? i8 : i10);
                    Object x5 = aVar9.x();
                    if (i26 != 0 || x5 == c0012a2) {
                        x5 = new mh3(22, izsVar, cVar);
                        aVar9.R(x5);
                    }
                    M = aVar9;
                    ygv0.a(E, null, a7, a10, (gzs) x5, M, 0, 34);
                    it = it2;
                    q630Var4 = q630Var5;
                    aVar4 = aVar7;
                    i19 = i23;
                    i16 = i8;
                    i17 = i10;
                    i18 = i11;
                    i14 = 2;
                }
                q630 q630Var6 = q630Var4;
                aVar2 = M;
                if (gp.d(aVar2)) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var6;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.dfd0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        com.vk.newsfeed.posting.privacy_picker.presentation.b.e(arrayList2, izsVar, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        i4 = i3;
        int i162 = 1;
        int i172 = 0;
        if (M.t(i4 & 1, (i4 & 147) == 146)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void f(PrivacyViewState.Type type, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1692522215);
        int i4 = i | (M.o(type.ordinal()) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1692522215, i4, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyTopBar (PrivacySettingsNewContentView.kt:121)");
            }
            int i5 = i4 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(244792154, i5, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.resolveTopBarTitle (PrivacySettingsNewContentView.kt:149)");
            }
            int i6 = a.$EnumSwitchMapping$0[type.ordinal()];
            if (i6 == 1) {
                i2 = -977936335;
                i3 = R.string.privacy_settings_toolbar_title;
            } else if (i6 == 2) {
                i2 = -977932998;
                i3 = R.string.privacy_settings_and_dons_toolbar_title;
            } else {
                if (i6 != 3) {
                    throw alb0.c(-977937817, M);
                }
                i2 = -977929701;
                i3 = R.string.privacy_settings_only_dons_toolbar_title;
            }
            String a2 = zq.a(M, i2, i3, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new sux(18);
                M.R(x);
            }
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(a2, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 14), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-218864772, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel28> (VkSdkIcons.kt:236)");
            }
            lg90 b = or.b(M, -439898899, R.drawable.vk_icon_cancel_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.previous_step_talkback_title, 0, M);
            boolean z = (i4 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new r0(izsVar, 4);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new n9w(16);
                M.R(x3);
            }
            aVar2 = M;
            TopBar$Before.e a4 = TopBar$Before.e.a.a(b, N, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 2), aVar2, 1572872, 24);
            q630Var2 = q630Var;
            muv0.h(a3, ahn.E(q630Var2, "PrivacySettingsToolbar"), null, null, null, a4, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 8156);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bqg(type, izsVar, q630Var2, i, 4);
        }
    }
}
