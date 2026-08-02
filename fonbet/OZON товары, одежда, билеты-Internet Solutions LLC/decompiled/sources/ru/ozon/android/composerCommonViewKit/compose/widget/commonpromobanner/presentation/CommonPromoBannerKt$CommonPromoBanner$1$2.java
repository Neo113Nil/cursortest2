package ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.presentation;

import A0.g;
import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import J0.P;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import Sc.o;
import Tg.b;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import e1.d;
import fd.InterfaceC6511n;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.y0;
import m3.C8060b;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.data.CommonPromoBannerDTO;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniPaddingToken;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/H;", "", "invoke", "(Ll0/H;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class CommonPromoBannerKt$CommonPromoBanner$1$2 extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ e $modifier;
    final /* synthetic */ g $shape;
    final /* synthetic */ CommonPromoBannerDTO $this_with;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonPromoBannerDTO.ThemeType.values().length];
            try {
                iArr[CommonPromoBannerDTO.ThemeType.THEME_TYPE_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonPromoBannerDTO.ThemeType.THEME_TYPE_RIGHT_WHOLE_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonPromoBannerDTO.ThemeType.THEME_TYPE_RIGHT_CROPPED_IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommonPromoBannerKt$CommonPromoBanner$1$2(e eVar, CommonPromoBannerDTO commonPromoBannerDTO, g gVar, Function1<? super b, Unit> function1) {
        super(3);
        this.$modifier = eVar;
        this.$this_with = commonPromoBannerDTO;
        this.$shape = gVar;
        this.$actionHandler = function1;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(h11, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(H AnimatedVisibility, InterfaceC3967k interfaceC3967k, int i11) {
        V v11;
        long j11;
        e b11;
        UniPaddingToken rightPadding;
        UniPaddingToken leftPadding;
        UniPaddingToken bottomPadding;
        UniPaddingToken topPadding;
        UniPaddingToken rightMargin;
        UniPaddingToken leftMargin;
        UniPaddingToken bottomMargin;
        UniPaddingToken topMargin;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        interfaceC3967k.o(-1818204774);
        interfaceC3967k.o(-1818221867);
        e e11 = a0.e(this.$modifier, 1.0f);
        CommonPromoBannerDTO.Margins margins = this.$this_with.getMargins();
        float dp = (margins == null || (topMargin = margins.getTopMargin()) == null) ? 0 : TokensExtKt.getDp(topMargin);
        CommonPromoBannerDTO.Margins margins2 = this.$this_with.getMargins();
        float dp2 = (margins2 == null || (bottomMargin = margins2.getBottomMargin()) == null) ? 0 : TokensExtKt.getDp(bottomMargin);
        CommonPromoBannerDTO.Margins margins3 = this.$this_with.getMargins();
        float dp3 = (margins3 == null || (leftMargin = margins3.getLeftMargin()) == null) ? 0 : TokensExtKt.getDp(leftMargin);
        CommonPromoBannerDTO.Margins margins4 = this.$this_with.getMargins();
        e i12 = T.i(e11, dp3, dp, (margins4 == null || (rightMargin = margins4.getRightMargin()) == null) ? 0 : TokensExtKt.getDp(rightMargin), dp2);
        CommonPromoBannerDTO commonPromoBannerDTO = this.$this_with;
        g gVar = this.$shape;
        interfaceC3967k.o(-1818221079);
        if (commonPromoBannerDTO.getBackgroundImage() == null) {
            CommonPromoBannerDTO.Background backgroundColor = commonPromoBannerDTO.getBackgroundColor();
            UniGradient gradient = backgroundColor != null ? backgroundColor.getGradient() : null;
            interfaceC3967k.o(-2040981642);
            AbstractC7799Q brushGradient = gradient == null ? null : CommonPromoBannerKt.toBrushGradient(gradient, interfaceC3967k, UniGradient.$stable);
            interfaceC3967k.k();
            e a11 = brushGradient != null ? androidx.compose.foundation.e.a(i12, brushGradient, gVar, 4) : null;
            interfaceC3967k.o(-2040982347);
            if (a11 == null) {
                CommonPromoBannerDTO.Background backgroundColor2 = commonPromoBannerDTO.getBackgroundColor();
                String color = backgroundColor2 != null ? backgroundColor2.getColor() : null;
                C7807Z c7807z = color == null ? null : TokenParserKt.tokenToColor(color, interfaceC3967k, 0);
                a11 = c7807z != null ? androidx.compose.foundation.e.b(i12, c7807z.w(), gVar) : null;
            }
            interfaceC3967k.k();
            if (a11 == null) {
                CommonPromoBannerDTO.Background backgroundColor3 = commonPromoBannerDTO.getBackgroundColor();
                String color2 = backgroundColor3 != null ? backgroundColor3.getColor() : null;
                AbstractC7799Q abstractC7799Q = color2 == null ? null : TokenParserKt.tokenToGradient(color2, interfaceC3967k, 0);
                a11 = abstractC7799Q != null ? androidx.compose.foundation.e.a(i12, abstractC7799Q, gVar, 4) : null;
            }
            if (a11 != null) {
                i12 = a11;
            }
        }
        interfaceC3967k.k();
        interfaceC3967k.k();
        e a12 = C6988h.a(i12, this.$shape);
        boolean z11 = (this.$this_with.getActionButton() != null || this.$this_with.getAction() == null || this.$actionHandler == null) ? false : true;
        Function1<b, Unit> function1 = this.$actionHandler;
        CommonPromoBannerDTO commonPromoBannerDTO2 = this.$this_with;
        if (z11) {
            interfaceC3967k.o(-2040964321);
            boolean n11 = interfaceC3967k.n(function1) | interfaceC3967k.n(commonPromoBannerDTO2);
            Object C11 = interfaceC3967k.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new CommonPromoBannerKt$CommonPromoBanner$1$2$2$1$1(function1, commonPromoBannerDTO2);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            a12 = i.c(a12, false, null, null, (Function0) C11, 7);
        }
        interfaceC3967k.k();
        d n12 = InterfaceC6250b.a.n();
        CommonPromoBannerDTO commonPromoBannerDTO3 = this.$this_with;
        Function1<b, Unit> function12 = this.$actionHandler;
        V f7 = C5185h.f(n12, false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, a12);
        InterfaceC2801g.f5440U.getClass();
        Function0 a13 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a13);
        } else {
            interfaceC3967k.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        C5187j c5187j = C5187j.f39515a;
        interfaceC3967k.o(-2040957067);
        if (commonPromoBannerDTO3.getBackgroundImage() != null) {
            DsImageAtomKt.DsImageAtom(new ImageDTO(commonPromoBannerDTO3.getBackgroundImage(), null, null, false, null, null, null, null, null, null, null, null, null, ImageDTO.ImageType.FILL, ImageDTO.FitType.FIT_CENTER, null, 40958, null), a0.e(c5187j.a(c5187j.b(e.f40358c0), InterfaceC6250b.a.e()), 1.0f), interfaceC3967k, 0, 0);
        }
        interfaceC3967k.k();
        int i13 = WhenMappings.$EnumSwitchMapping$0[commonPromoBannerDTO3.getTheme().ordinal()];
        if (i13 == 1) {
            throw new IllegalStateException("Unreachable");
        }
        if (i13 == 2) {
            v11 = CommonPromoBannerKt.WholeImageMeasurePolicy;
        } else {
            if (i13 != 3) {
                throw new o();
            }
            v11 = CommonPromoBannerKt.CroppedImageMeasurePolicy;
        }
        e.a aVar = e.f40358c0;
        int I12 = interfaceC3967k.I();
        A0 d13 = interfaceC3967k.d();
        e f12 = c.f(interfaceC3967k, aVar);
        Function0 a14 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a14);
        } else {
            interfaceC3967k.e();
        }
        Function2 d14 = C2454a.d(interfaceC3967k, v11, interfaceC3967k, d13);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I12))) {
            a.d(d14, I12, interfaceC3967k, I12);
        }
        F1.b(interfaceC3967k, f12, InterfaceC2801g.a.f());
        e b12 = androidx.compose.ui.layout.a.b(aVar, "content");
        CommonPromoBannerDTO.Paddings paddings = commonPromoBannerDTO3.getPaddings();
        float dp4 = (paddings == null || (topPadding = paddings.getTopPadding()) == null) ? 0 : TokensExtKt.getDp(topPadding);
        CommonPromoBannerDTO.Paddings paddings2 = commonPromoBannerDTO3.getPaddings();
        float dp5 = (paddings2 == null || (bottomPadding = paddings2.getBottomPadding()) == null) ? 0 : TokensExtKt.getDp(bottomPadding);
        CommonPromoBannerDTO.Paddings paddings3 = commonPromoBannerDTO3.getPaddings();
        float dp6 = (paddings3 == null || (leftPadding = paddings3.getLeftPadding()) == null) ? 0 : TokensExtKt.getDp(leftPadding);
        CommonPromoBannerDTO.Paddings paddings4 = commonPromoBannerDTO3.getPaddings();
        e i14 = T.i(b12, dp6, dp4, (paddings4 == null || (rightPadding = paddings4.getRightPadding()) == null) ? 0 : TokensExtKt.getDp(rightPadding), dp5);
        C5194q a15 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k, 0);
        int I13 = interfaceC3967k.I();
        A0 d15 = interfaceC3967k.d();
        e f13 = c.f(interfaceC3967k, i14);
        Function0 a16 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a16);
        } else {
            interfaceC3967k.e();
        }
        Function2 c11 = P.c(interfaceC3967k, a15, interfaceC3967k, d15);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I13))) {
            a.d(c11, I13, interfaceC3967k, I13);
        }
        F1.b(interfaceC3967k, f13, InterfaceC2801g.a.f());
        interfaceC3967k.o(873996039);
        if (commonPromoBannerDTO3.getTitle() != null) {
            DsTextAtomKt.DsTextAtom(commonPromoBannerDTO3.getTitle(), null, interfaceC3967k, 0, 2);
        }
        interfaceC3967k.k();
        interfaceC3967k.o(873998003);
        if (commonPromoBannerDTO3.getDescription() != null) {
            DsTextAtomKt.DsTextAtom(commonPromoBannerDTO3.getDescription(), null, interfaceC3967k, 0, 2);
        }
        interfaceC3967k.k();
        interfaceC3967k.o(874000369);
        if (commonPromoBannerDTO3.getActionButton() != null) {
            DsButtonAtomKt.DsButtonAtom(commonPromoBannerDTO3.getActionButton(), null, false, function12, interfaceC3967k, 0, 6);
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
        DsImageAtomKt.DsImageAtom(commonPromoBannerDTO3.getImage(), androidx.compose.ui.layout.a.b(aVar, "image"), interfaceC3967k, 48, 0);
        e c12 = a0.c(a0.r(T.j(aVar, 20, 0.0f, 0.0f, 0.0f, 14), 8));
        j11 = C7807Z.f72252f;
        b11 = androidx.compose.foundation.e.b(c12, C7807Z.o(0.3f, j11), y0.a());
        C5185h.a(b11, interfaceC3967k, 6);
        interfaceC3967k.f();
        interfaceC3967k.o(-2040890354);
        if (commonPromoBannerDTO3.getCloseButton() != null) {
            DsIconButtonAtomKt.DsIconButtonAtom(commonPromoBannerDTO3.getCloseButton(), T.f(aVar, 12), false, function12, interfaceC3967k, IconButtonV3DTO.$stable | 48, 4);
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
    }
}
