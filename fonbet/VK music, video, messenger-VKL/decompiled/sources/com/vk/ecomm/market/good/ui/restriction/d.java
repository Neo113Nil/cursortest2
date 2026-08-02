package com.vk.ecomm.market.good.ui.restriction;

import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.ecomm.market.good.ui.restriction.ProductCardRestrictionViewState;
import com.vk.ecomm.market.good.ui.restriction.b;
import com.vk.ecomm.market.good.ui.restriction.c;
import com.vkontakte.android.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import xsna.alb0;
import xsna.brm0;
import xsna.c220;
import xsna.c4r;
import xsna.cp10;
import xsna.cri;
import xsna.csa0;
import xsna.d370;
import xsna.dt1;
import xsna.e4c;
import xsna.eaz;
import xsna.ept;
import xsna.epx;
import xsna.gzs;
import xsna.hr80;
import xsna.hyu;
import xsna.i2v0;
import xsna.i9z;
import xsna.ir;
import xsna.iyk0;
import xsna.izs;
import xsna.ja8;
import xsna.k9q0;
import xsna.klv0;
import xsna.ldv0;
import xsna.lg90;
import xsna.n34;
import xsna.o6;
import xsna.ojc;
import xsna.pg90;
import xsna.q630;
import xsna.qri;
import xsna.qzu0;
import xsna.r48;
import xsna.rrv0;
import xsna.s8u0;
import xsna.sg50;
import xsna.sy90;
import xsna.t8p0;
import xsna.txj0;
import xsna.us2;
import xsna.uuz;
import xsna.vl20;
import xsna.wra0;
import xsna.ws2;
import xsna.y48;
import xsna.ylu0;
import xsna.zqv0;
import xsna.zra0;

/* compiled from: ProductCardRestrictionContent.kt */
/* loaded from: classes18.dex */
public final class d {

    /* compiled from: ProductCardRestrictionContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ProductCardRestrictionViewState.Icon.values().length];
            try {
                iArr[ProductCardRestrictionViewState.Icon.Lock.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductCardRestrictionViewState.Icon.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductCardRestrictionViewState.Icon.Help.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductCardRestrictionViewState.Icon.Hide.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProductCardRestrictionViewState.Button.Mode.values().length];
            try {
                iArr2[ProductCardRestrictionViewState.Button.Mode.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ProductCardRestrictionViewState.Button.Mode.Tertiary.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0507  */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ProductCardRestrictionViewState productCardRestrictionViewState, izs izsVar, final izs izsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        f s;
        lg90 a2;
        int i2;
        int i3;
        us2 b;
        Object x;
        ProductCardRestrictionViewState.Button button;
        r48 r48Var;
        r48 b2;
        y48 y48Var;
        int i4;
        Matcher matcher;
        String str;
        b bVar = productCardRestrictionViewState.b;
        androidx.compose.runtime.a M = aVar.M(-981105261);
        int i5 = i | (M.J(productCardRestrictionViewState) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128) | 3072;
        if (M.t(i5 & 1, (i5 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-981105261, i5, -1, "com.vk.ecomm.market.good.ui.restriction.ProductCardRestrictionsContent (ProductCardRestrictionContent.kt:42)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            Object x2 = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            Object obj = x2;
            if (x2 == c0012a) {
                obj = ir.h(M);
            }
            sg50 sg50Var = (sg50) obj;
            Object x3 = M.x();
            Object obj2 = x3;
            if (x3 == c0012a) {
                o6 o6Var = new o6(26);
                M.R(o6Var);
                obj2 = o6Var;
            }
            q630 b3 = ojc.b(d, sg50Var, null, false, null, (gzs) obj2, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(b3, ylu0Var.getBackground().g, e.a);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ProductCardRestrictionViewState.Icon icon = productCardRestrictionViewState.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1419809203, 0, -1, "com.vk.ecomm.market.good.ui.restriction.resolveRestrictionIcon (ProductCardRestrictionContent.kt:99)");
            }
            int i6 = a.$EnumSwitchMapping$0[icon.ordinal()];
            if (i6 == 1) {
                M.K(-1362950464);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(50548752, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-LockOutline56> (VkSdkIcons.kt:2168)");
                }
                a2 = pg90.a(R.drawable.vk_icon_lock_outline_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else if (i6 == 2) {
                M.K(-1362948063);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1223610404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorOutline56> (VkSdkIcons.kt:814)");
                }
                a2 = pg90.a(R.drawable.vk_icon_error_outline_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else if (i6 == 3) {
                M.K(-1362945760);
                qzu0.a.getClass();
                a2 = qzu0.e0(M);
                M.j();
            } else {
                if (i6 != 4) {
                    throw alb0.c(-1362952538, M);
                }
                M.K(-1362943488);
                qzu0.a.getClass();
                a2 = qzu0.g0(M);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                i2 = -1;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                i2 = -1;
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var2.getIcon().l;
            Object x4 = M.x();
            Object obj3 = x4;
            if (x4 == c0012a) {
                uuz uuzVar = new uuz(18);
                M.R(uuzVar);
                obj3 = uuzVar;
            }
            int i7 = i2;
            t8p0 a3 = csa0.a(a2, j, 0L, null, com.vk.core.compose.component.semantics.b.a(null, (izs) obj3, 3), M, 196616, 12);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-337626762, 0, i7, "com.vk.ecomm.market.good.ui.restriction.resolveTitle (ProductCardRestrictionContent.kt:110)");
            }
            M.K(1958216208);
            if (bVar instanceof b.InterfaceC0949b) {
                i3 = R.string.good_restrictions_is_blocked_title;
            } else if (bVar instanceof b.e) {
                i3 = R.string.good_restrictions_binder_unsubscribed_title;
            } else if (bVar instanceof b.d) {
                i3 = R.string.good_restrictions_binder_disabled_market_title;
            } else if (bVar instanceof b.c) {
                i3 = R.string.good_restrictions_confirm_adult_dialog_title;
            } else {
                if (!(bVar instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.string.good_restrictions_only_for_adult_dialog_title;
            }
            String N = d370.N(i3, 0, M);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            us2 b4 = ws2.b(N, M, 0);
            Object x5 = M.x();
            Object obj4 = x5;
            if (x5 == c0012a) {
                ept eptVar = new ept(22);
                M.R(eptVar);
                obj4 = eptVar;
            }
            com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(null, (izs) obj4, 3);
            int i8 = i5 >> 3;
            int i9 = i8 & 112;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1019731397, i9, i7, "com.vk.ecomm.market.good.ui.restriction.resolveDescription (ProductCardRestrictionContent.kt:123)");
            }
            if (bVar instanceof b.InterfaceC0949b.a) {
                M.K(-514118858);
                String str2 = ((b.InterfaceC0949b.a) bVar).a;
                if (str2 == null) {
                    M.K(-514089533);
                    M.j();
                    b = null;
                } else {
                    M.K(-514089532);
                    boolean J = M.J(str2);
                    Object x6 = M.x();
                    if (J || x6 == c0012a) {
                        try {
                            matcher = ((Pattern) eaz.h.getValue()).matcher(str2);
                            matcher.find();
                            i4 = 1;
                        } catch (Throwable unused) {
                            i4 = 1;
                        }
                        try {
                            x6 = matcher.group(1);
                        } catch (Throwable unused2) {
                            x6 = null;
                            M.R(x6);
                            str = (String) x6;
                            if (str != null) {
                            }
                            M.j();
                            if (b != null) {
                            }
                            M.j();
                            us2 us2Var = b;
                            if (androidx.compose.runtime.b.d()) {
                            }
                            x = M.x();
                            Object obj5 = x;
                            if (x == c0012a) {
                            }
                            vl20 b5 = zra0.a.b(b4, a4, us2Var, com.vk.core.compose.component.semantics.b.a(null, (izs) obj5, 3), M, 196608, 8);
                            button = productCardRestrictionViewState.c;
                            if (button != null) {
                            }
                            ldv0.d(null, a3, b5, y48Var, null, null, false, M, 0, 113);
                            M.G();
                            if (androidx.compose.runtime.b.d()) {
                            }
                            q630Var2 = aVar2;
                            s = M.s();
                            if (s == null) {
                            }
                        }
                        M.R(x6);
                    } else {
                        i4 = 1;
                    }
                    str = (String) x6;
                    if (str != null) {
                        b = null;
                    } else {
                        String O = d370.O(R.string.product_card_restrict_for_owner_product_blocked, new Object[]{str}, M);
                        int i10 = (M.J(O) ? 1 : 0) | ((((i9 ^ 48) <= 32 || !M.J(izsVar2)) && (i8 & 48) != 32) ? 0 : i4);
                        Object x7 = M.x();
                        Object obj6 = x7;
                        if (i10 != 0 || x7 == c0012a) {
                            s8u0 s8u0Var = new s8u0(0);
                            Matcher matcher2 = ((Pattern) eaz.h.getValue()).matcher(O);
                            if (matcher2.find()) {
                                int start = matcher2.start();
                                String group = matcher2.group(0);
                                final String group2 = matcher2.group(i4);
                                String group3 = matcher2.group(2);
                                if (group != null && group2 != null && group3 != null) {
                                    s8u0Var.e(brm0.y(O, group, group3));
                                    s8u0Var.b(new i2v0(group2, new zqv0(new klv0(null, VkColorToken.TextLink), 14), new i9z() { // from class: xsna.lmd0
                                        @Override // xsna.i9z
                                        public final void a(q8z q8zVar) {
                                            izsVar2.invoke(group2);
                                        }
                                    }), start, group3.length() + start);
                                }
                            } else {
                                s8u0Var.e(O);
                            }
                            M.R(s8u0Var);
                            obj6 = s8u0Var;
                        }
                        b = ((s8u0) obj6).j(8, M);
                    }
                    M.j();
                }
                if (b != null) {
                    M.K(-513585813);
                    b = ws2.b(d370.N(R.string.good_restrictions_is_blocked_owner_description, 0, M), M, 0);
                    M.j();
                } else {
                    M.K(-709320716);
                    M.j();
                }
                M.j();
            } else if (epx.f(bVar, b.InterfaceC0949b.C0950b.a)) {
                M.K(-513369092);
                b = ws2.b(d370.N(R.string.good_restrictions_is_blocked_user_description, 0, M), M, 0);
                M.j();
            } else if (epx.f(bVar, b.e.a)) {
                M.K(-513177512);
                b = ws2.b(d370.N(R.string.good_restrictions_binder_unsubscribed_description, 0, M), M, 0);
                M.j();
            } else if (epx.f(bVar, b.d.a)) {
                M.K(-512978027);
                b = ws2.b(d370.N(R.string.good_restrictions_binder_disabled_market_description, 0, M), M, 0);
                M.j();
            } else if (epx.f(bVar, b.c.a)) {
                M.K(-512784680);
                b = ws2.b(d370.N(R.string.good_restrictions_available_for_adult_description, 0, M), M, 0);
                M.j();
            } else {
                if (!epx.f(bVar, b.a.a)) {
                    throw alb0.c(-709322516, M);
                }
                M.K(-512597192);
                b = ws2.b(d370.N(R.string.good_restrictions_available_for_adult_description, 0, M), M, 0);
                M.j();
            }
            us2 us2Var2 = b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            x = M.x();
            Object obj52 = x;
            if (x == c0012a) {
                hyu hyuVar = new hyu(15);
                M.R(hyuVar);
                obj52 = hyuVar;
            }
            vl20 b52 = zra0.a.b(b4, a4, us2Var2, com.vk.core.compose.component.semantics.b.a(null, (izs) obj52, 3), M, 196608, 8);
            button = productCardRestrictionViewState.c;
            if (button != null) {
                M.K(1244639905);
                M.j();
                y48Var = null;
            } else {
                M.K(1244639906);
                Object x8 = M.x();
                Object obj7 = x8;
                if (x8 == c0012a) {
                    c4r c4rVar = new c4r(26);
                    M.R(c4rVar);
                    obj7 = c4rVar;
                }
                int i11 = i5 & 112;
                r48 b6 = b(button, izsVar, com.vk.core.compose.component.semantics.b.a(null, (izs) obj7, 3), M, i11);
                ProductCardRestrictionViewState.Button button2 = productCardRestrictionViewState.d;
                if (button2 == null) {
                    M.K(606148781);
                    M.j();
                    r48Var = null;
                    b2 = null;
                } else {
                    M.K(606148782);
                    Object x9 = M.x();
                    Object obj8 = x9;
                    if (x9 == c0012a) {
                        c220 c220Var = new c220(15);
                        M.R(c220Var);
                        obj8 = c220Var;
                    }
                    r48Var = null;
                    b2 = b(button2, izsVar, com.vk.core.compose.component.semantics.b.a(null, (izs) obj8, 3), M, i11);
                    M.j();
                }
                y48 a5 = wra0.b.a(b6, b2, r48Var, M, 12);
                M.j();
                y48Var = a5;
            }
            ldv0.d(null, a3, b52, y48Var, null, null, false, M, 0, 113);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        s = M.s();
        if (s == null) {
            s.d = new e4c(i, 3, productCardRestrictionViewState, izsVar2, izsVar, q630Var2);
        }
    }

    public static final r48 b(ProductCardRestrictionViewState.Button button, izs izsVar, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        ButtonStyle buttonStyle;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(153610292, i, -1, "com.vk.ecomm.market.good.ui.restriction.resolveButton (ProductCardRestrictionContent.kt:172)");
        }
        int i3 = i & 14;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1668773876, i3, -1, "com.vk.ecomm.market.good.ui.restriction.resolveButtonText (ProductCardRestrictionContent.kt:192)");
        }
        aVar2.K(1668921614);
        c cVar = button.b;
        if (cVar instanceof c.C0951c) {
            i2 = R.string.good_restrictions_is_blocked_open_market;
        } else if (cVar instanceof c.d) {
            i2 = R.string.good_restrictions_binder_open_market_button;
        } else if (cVar instanceof c.f) {
            i2 = R.string.good_restrictions_is_blocked_delete_good;
        } else if (cVar instanceof c.e) {
            i2 = R.string.good_restrictions_is_blocked_open_support;
        } else if (cVar instanceof c.a) {
            i2 = R.string.good_restrictions_only_for_adult_dialog_confirm;
        } else if (cVar instanceof c.b) {
            i2 = R.string.good_restrictions_confirm_adult_dialog_confirm;
        } else {
            if (!(cVar instanceof c.g)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string.good_restrictions_confirm_adult_dialog_cancel;
        }
        String N = d370.N(i2, 0, aVar2);
        aVar2.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        ButtonSize buttonSize = ButtonSize.Small;
        ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
        int i4 = a.$EnumSwitchMapping$1[button.a.ordinal()];
        boolean z = true;
        if (i4 == 1) {
            buttonStyle = ButtonStyle.Primary;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            buttonStyle = ButtonStyle.Tertiary;
        }
        boolean z2 = button.c;
        boolean z3 = !z2;
        boolean z4 = (((i & 112) ^ 48) > 32 && aVar2.J(izsVar)) || (i & 48) == 32;
        if (((i3 ^ 6) <= 4 || !aVar2.y(button)) && (i & 6) != 4) {
            z = false;
        }
        boolean z5 = z4 | z;
        Object x = aVar2.x();
        if (z5 || x == a.C0011a.a) {
            x = new com.vk.catalog2.common.ui.holders.a(24, izsVar, button);
            aVar2.R(x);
        }
        r48 a2 = wra0.a.C3954a.a(N, (gzs) x, buttonSize, buttonStyle, buttonAppearance, z2, null, null, null, null, null, null, false, z3, null, aVar, aVar2, 24960, ((i << 12) & 3670016) | 12582912, 49088);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }
}
