package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation;

import A0.h;
import B1.InterfaceC2547p;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.n1;
import Sc.o;
import T7.E;
import Tg.b;
import WZ.l;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5182e;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.t;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.C5239d1;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import n0.InterfaceC8367H;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;
import ru.ozon.app.android.pdp.ui.compose.time.TimersKt;
import ru.ozon.app.android.regulardraw.ui.FormattingKt;
import ru.ozon.app.android.regulardraw.ui.ResourcesKt;
import ru.ozon.app.android.regulardraw.utils.PreviewKt;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation.EntryBannerVI;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00102\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00132\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00162\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00192\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content;", "state", "Lkotlin/Function1;", "LTg/b;", "", "onAtomAction", "EntryBannerComposable", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block$Title;", "Landroidx/compose/ui/e;", "modifier", "TitleBlock", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block$Title;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block$Subtitle;", "SubtitleBlock", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block$Subtitle;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block$Badge;", "BadgeBlock", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block$Badge;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text;", "CustomText", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text$TimerText;", "TimerText", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text$TimerText;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$CustomBadge;", "CustomBadge", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$CustomBadge;Landroidx/compose/ui/e;LS0/k;II)V", "", "timerEnabled", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntryBannerComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void BadgeBlock(EntryBannerVI.Content.Block.Badge badge, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-2133705335);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(badge) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e eVar2 = eVar;
            DsBadgeAtomKt.DsBadgeAtom(badge.getDto(), eVar2, null, u11, i13 & 112, 4);
            eVar = eVar2;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new EntryBannerComposableKt$BadgeBlock$1(badge, eVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CustomBadge(EntryBannerVI.Content.CustomBadge customBadge, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e b11;
        long j11;
        C3969l u11 = interfaceC3967k.u(485445188);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(customBadge) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(eVar) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e a11 = C6988h.a(eVar, h.b(8));
            C7807Z c7807z = TokenParserKt.tokenToColor(customBadge.getBackgroundColor(), u11, 0);
            b11 = androidx.compose.foundation.e.b(a11, c7807z != null ? c7807z.w() : C7807Z.f72259m, y0.a());
            float f7 = 2;
            e i15 = T.i(b11, 6, f7, 4, f7);
            Y b12 = X.b(C5179b.n(f7), InterfaceC6250b.a.i(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, i15);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            TextDTO text = customBadge.getText();
            e.a aVar = e.f40358c0;
            DsTextAtomKt.DsTextAtom(text, T.h(aVar, 0.0f, 1, 1), u11, 48, 0);
            j11 = C7807Z.f72252f;
            e o11 = a0.o(PreviewKt.m942previewBackgroundRPmYEkk(aVar, j11, u11, 54), 13, 20);
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = c.f(u11, o11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f14 = E.f(u11, f12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, f14);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            Ag0.e.a(customBadge.getIcon(), a0.d(eVar), null, null, null, 0.0f, null, u11, 3072, 244);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new EntryBannerComposableKt$CustomBadge$2(customBadge, eVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CustomText(EntryBannerVI.Content.Text text, Function1<? super b, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super b, Unit> function12;
        e eVar2;
        C3969l u11 = interfaceC3967k.u(308786796);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(text) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function1) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            eVar2 = eVar;
            function12 = function1;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e eVar3 = eVar;
            if (text instanceof EntryBannerVI.Content.Text.TimerText) {
                u11.o(1513396715);
                TimerText((EntryBannerVI.Content.Text.TimerText) text, function1, eVar3, u11, i13 & 1008, 0);
                function12 = function1;
                u11.k();
            } else {
                function12 = function1;
                if (!(text instanceof EntryBannerVI.Content.Text.DsText)) {
                    u11.o(-1890845308);
                    u11.k();
                    throw new o();
                }
                u11.o(1513565169);
                DsTextAtomKt.DsTextAtom(((EntryBannerVI.Content.Text.DsText) text).getDto(), eVar3, u11, (i13 >> 3) & 112, 0);
                u11.k();
            }
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new EntryBannerComposableKt$CustomText$1(text, function12, eVar2, i11, i12));
        }
    }

    public static final void EntryBannerComposable(@NotNull EntryBannerVI.Content state, @NotNull Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        long j11;
        C3969l c3969l;
        int i12;
        int i13;
        e eVar;
        C3969l c3969l2;
        Function1<? super b, Unit> onAtomAction = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        C3969l u11 = interfaceC3967k.u(-233403906);
        int i14 = (i11 & 6) == 0 ? (u11.n(state) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i14 |= u11.F(onAtomAction) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            u11.o(1490030581);
            l lVar = ((Boolean) u11.m(C5239d1.a())).booleanValue() ? null : (l) u11.m(f.e());
            u11.k();
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(1490034690);
            int i15 = i14 & 14;
            boolean F11 = (i15 == 4) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new EntryBannerComposableKt$EntryBannerComposable$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            e.a aVar2 = e.f40358c0;
            e a11 = C6988h.a(aVar2, h.b(24));
            C7807Z c7807z = TokenParserKt.tokenToColor(state.getBackgroundColor(), u11, 0);
            b11 = androidx.compose.foundation.e.b(a11, c7807z != null ? c7807z.w() : C7807Z.f72258l, y0.a());
            e e11 = a0.e(b11, 1.0f);
            Object m11 = u11.m(t.a());
            if (state.getClickAction() == null) {
                m11 = null;
            }
            InterfaceC8367H interfaceC8367H = (InterfaceC8367H) m11;
            u11.o(1490049559);
            int i16 = i14 & 112;
            boolean z11 = (i15 == 4) | (i16 == 32);
            Object C12 = u11.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new EntryBannerComposableKt$EntryBannerComposable$3$1(state, onAtomAction);
                u11.x(C12);
            }
            u11.k();
            e b12 = androidx.compose.foundation.i.b(e11, null, interfaceC8367H, false, null, null, (Function0) C12, 28);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, b12);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            e b13 = c5187j.b(aVar2);
            V f13 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f14 = c.f(u11, b13);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f15 = E.f(u11, f13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            j11 = C7807Z.f72255i;
            int i17 = 0;
            e eVar2 = null;
            Ag0.e.a(Integer.valueOf(ResourcesKt.drawableResourceId(state.getAnimationName(), u11, 0)), c5187j.a(C5182e.a(a0.c(PreviewKt.m942previewBackgroundRPmYEkk(aVar2, j11, u11, 54)), 1.22f, true), InterfaceC6250b.a.f()), null, null, InterfaceC2547p.a.a(), 0.0f, null, u11, 199680, 212);
            C3969l c3969l3 = u11;
            c3969l3.f();
            float f16 = 16;
            e a14 = c5187j.a(T.j(aVar2, f16, f16, 0.0f, f16, 4), InterfaceC6250b.a.h());
            C5194q a15 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), c3969l3, 0);
            int I13 = c3969l3.I();
            A0 d13 = c3969l3.d();
            e f17 = c.f(c3969l3, a14);
            Function0 a16 = InterfaceC2801g.a.a();
            c3969l3.i();
            if (c3969l3.t()) {
                c3969l3.H(a16);
            } else {
                c3969l3.e();
            }
            Function2 g10 = K00.b.g(c3969l3, a15, c3969l3, d13);
            if (c3969l3.t() || !Intrinsics.d(c3969l3.C(), Integer.valueOf(I13))) {
                a.d(I13, c3969l3, I13, g10);
            }
            F1.b(c3969l3, f17, InterfaceC2801g.a.f());
            c3969l3.o(1115125574);
            for (EntryBannerVI.Content.Block block : state.getBlocks()) {
                if (block instanceof EntryBannerVI.Content.Block.Title) {
                    c3969l3.o(1673310279);
                    EntryBannerVI.Content.Block.Title title = (EntryBannerVI.Content.Block.Title) block;
                    i13 = i17;
                    i12 = i16;
                    C3969l c3969l4 = c3969l3;
                    eVar = eVar2;
                    TitleBlock(title, onAtomAction, null, c3969l4, i12, 4);
                    c3969l2 = c3969l4;
                    c3969l2.k();
                    onAtomAction = function1;
                } else {
                    i12 = i16;
                    i13 = i17;
                    eVar = eVar2;
                    c3969l2 = c3969l3;
                    if (block instanceof EntryBannerVI.Content.Block.Subtitle) {
                        c3969l2.o(1673313322);
                        onAtomAction = function1;
                        SubtitleBlock((EntryBannerVI.Content.Block.Subtitle) block, onAtomAction, null, c3969l2, i12, 4);
                        c3969l2 = c3969l2;
                        c3969l2.k();
                    } else {
                        onAtomAction = function1;
                        if (!(block instanceof EntryBannerVI.Content.Block.Badge)) {
                            c3969l2.o(1673308148);
                            c3969l2.k();
                            throw new o();
                        }
                        c3969l2.o(1673316345);
                        BadgeBlock((EntryBannerVI.Content.Block.Badge) block, eVar, c3969l2, i13, 2);
                        c3969l2.k();
                    }
                }
                c3969l3 = c3969l2;
                i16 = i12;
                eVar2 = eVar;
                i17 = i13;
            }
            c3969l = c3969l3;
            c3969l.k();
            c3969l.f();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new EntryBannerComposableKt$EntryBannerComposable$5(state, onAtomAction, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubtitleBlock(EntryBannerVI.Content.Block.Subtitle subtitle, Function1<? super b, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super b, Unit> function12;
        e eVar2;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1861394500);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(subtitle) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i11 & 48) == 0) {
                i13 |= u11.F(function12) ? 32 : 16;
            }
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar3 = i14 == 0 ? e.f40358c0 : eVar2;
                CustomText(subtitle.getText(), function12, T.j(eVar3, 0.0f, 0.0f, 126, 0.0f, 11), u11, i13 & 112, 0);
                eVar2 = eVar3;
            } else {
                u11.j();
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new EntryBannerComposableKt$SubtitleBlock$1(subtitle, function1, eVar2, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        CustomText(subtitle.getText(), function12, T.j(eVar3, 0.0f, 0.0f, 126, 0.0f, 11), u11, i13 & 112, 0);
        eVar2 = eVar3;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimerText(EntryBannerVI.Content.Text.TimerText timerText, Function1<? super b, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        boolean n11;
        Object C11;
        boolean n12;
        Object C12;
        boolean n13;
        Object C13;
        C3969l c3969l;
        String trailingText;
        e eVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-999430831);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(timerText) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function1) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                StableDateTime expireDate = timerText.getExpireDate();
                u11.o(-159557495);
                n11 = u11.n(expireDate);
                C11 = u11.C();
                if (!n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = n1.f(Boolean.valueOf(timerText.getExpireDate().isAfter(new DateTime())), D1.f25195a);
                    u11.x(C11);
                }
                InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
                u11.k();
                StableDateTime expireDate2 = timerText.getExpireDate();
                u11.o(-159549118);
                n12 = u11.n(interfaceC3978p0);
                C12 = u11.C();
                if (!n12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new EntryBannerComposableKt$TimerText$formattedPeriod$1$1(interfaceC3978p0);
                    u11.x(C12);
                }
                Function1 function12 = (Function1) C12;
                u11.k();
                u11.o(-159547682);
                n13 = ((i13 & 14) != 4) | ((i13 & 112) == 32) | u11.n(interfaceC3978p0);
                C13 = u11.C();
                if (!n13 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new EntryBannerComposableKt$TimerText$formattedPeriod$2$1(timerText, function1, interfaceC3978p0);
                    u11.x(C13);
                }
                u11.k();
                String rememberHumanReadableFormattedPeriod = FormattingKt.rememberHumanReadableFormattedPeriod(TimersKt.rememberRemainingPeriod(expireDate2, function12, null, (Function0) C13, u11, 0, 4), false, null, u11, 0, 6);
                c3969l = u11;
                TextDTO leadingText = timerText.getLeadingText();
                OzonSpannableString text = timerText.getLeadingText().getText();
                trailingText = timerText.getTrailingText();
                if (trailingText == null) {
                    trailingText = "";
                }
                DsTextAtomKt.DsTextAtom(TextDTO.copy$default(leadingText, OzonSpannableStringKt.toOzonSpannableString(((Object) text) + rememberHumanReadableFormattedPeriod + trailingText), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), eVar4, c3969l, (i13 >> 3) & 112, 0);
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new EntryBannerComposableKt$TimerText$1(timerText, function1, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        StableDateTime expireDate3 = timerText.getExpireDate();
        u11.o(-159557495);
        n11 = u11.n(expireDate3);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = n1.f(Boolean.valueOf(timerText.getExpireDate().isAfter(new DateTime())), D1.f25195a);
        u11.x(C11);
        InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
        u11.k();
        StableDateTime expireDate22 = timerText.getExpireDate();
        u11.o(-159549118);
        n12 = u11.n(interfaceC3978p02);
        C12 = u11.C();
        if (!n12) {
        }
        C12 = new EntryBannerComposableKt$TimerText$formattedPeriod$1$1(interfaceC3978p02);
        u11.x(C12);
        Function1 function122 = (Function1) C12;
        u11.k();
        u11.o(-159547682);
        n13 = ((i13 & 14) != 4) | ((i13 & 112) == 32) | u11.n(interfaceC3978p02);
        C13 = u11.C();
        if (!n13) {
        }
        C13 = new EntryBannerComposableKt$TimerText$formattedPeriod$2$1(timerText, function1, interfaceC3978p02);
        u11.x(C13);
        u11.k();
        String rememberHumanReadableFormattedPeriod2 = FormattingKt.rememberHumanReadableFormattedPeriod(TimersKt.rememberRemainingPeriod(expireDate22, function122, null, (Function0) C13, u11, 0, 4), false, null, u11, 0, 6);
        c3969l = u11;
        TextDTO leadingText2 = timerText.getLeadingText();
        OzonSpannableString text2 = timerText.getLeadingText().getText();
        trailingText = timerText.getTrailingText();
        if (trailingText == null) {
        }
        DsTextAtomKt.DsTextAtom(TextDTO.copy$default(leadingText2, OzonSpannableStringKt.toOzonSpannableString(((Object) text2) + rememberHumanReadableFormattedPeriod2 + trailingText), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), eVar4, c3969l, (i13 >> 3) & 112, 0);
        eVar3 = eVar4;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimerText$lambda$10(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TimerText$lambda$9(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TitleBlock(EntryBannerVI.Content.Block.Title title, Function1<? super b, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(321699062);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(title) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function1) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, eVar);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            EntryBannerVI.Content.Text text = title.getText();
            e.a aVar = e.f40358c0;
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            CustomText(text, function1, new LayoutWeightElement(1.0f, false), u11, i13 & 112, 0);
            CustomBadge(title.getBadge(), null, u11, 0, 2);
            u11.f();
        }
        e eVar2 = eVar;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new EntryBannerComposableKt$TitleBlock$2(title, function1, eVar2, i11, i12));
        }
    }
}
