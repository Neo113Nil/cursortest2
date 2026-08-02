package ru.ozon.uni.android.ds.compose.component.price;

import B1.C2533b;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import P0.E;
import P0.p2;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import Z1.d;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.b;
import androidx.compose.ui.platform.K0;
import e1.InterfaceC6250b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.core.compose.graphics.DirectionalLinearGradientKt;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.models.UniGradientDirection;
import ru.ozon.uni.core.models.UniGradientToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \"\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "dto", "", "DsPriceAtom", "(Landroidx/compose/ui/e;Lru/ozon/uni/atoms/data/price/PriceDTO;LS0/k;II)V", "Lru/ozon/uni/atoms/data/price/PriceDTO$Component;", "pricePiece", "Lru/ozon/uni/android/ds/compose/component/price/DsPriceSize;", "size", "Ll1/Q;", "gradient", "LK1/T;", "calculateTextStyle", "(Lru/ozon/uni/atoms/data/price/PriceDTO$Component;Lru/ozon/uni/android/ds/compose/component/price/DsPriceSize;Ll1/Q;LS0/k;I)LK1/T;", "Lru/ozon/uni/atoms/data/price/PriceDTO$PriceStyle;", "getGradientBrush", "(Lru/ozon/uni/atoms/data/price/PriceDTO$PriceStyle;LS0/k;I)Ll1/Q;", "Ll1/Z;", "color", "strikethrough-4WTKRHQ", "(Landroidx/compose/ui/e;J)Landroidx/compose/ui/e;", "strikethrough", "LZ1/h;", "neededWidth", "hideWhenDoesntFit-3ABfNKs", "(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;", "hideWhenDoesntFit", "Lru/ozon/uni/atoms/data/price/PriceDTO$Gradient$Direction;", "Lru/ozon/uni/core/models/UniGradientDirection;", "toDirection", "(Lru/ozon/uni/atoms/data/price/PriceDTO$Gradient$Direction;)Lru/ozon/uni/core/models/UniGradientDirection;", "", "Lru/ozon/uni/atoms/data/price/PriceDTO$Component$TextStyle;", "GradientComponents", "[Lru/ozon/uni/atoms/data/price/PriceDTO$Component$TextStyle;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsPriceAtomKt {

    @NotNull
    private static final PriceDTO.Component.TextStyle[] GradientComponents = {PriceDTO.Component.TextStyle.PREFIX, PriceDTO.Component.TextStyle.PRICE, PriceDTO.Component.TextStyle.CAPTION};

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PriceDTO.Gradient.Direction.values().length];
            try {
                iArr[PriceDTO.Gradient.Direction.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriceDTO.Gradient.Direction.RIGHT_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceDTO.Gradient.Direction.BOTTOM_TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PriceDTO.Gradient.Direction.LEFT_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PriceDTO.Gradient.Direction.BOTTOM_RIGHT_TOP_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PriceDTO.Gradient.Direction.BOTTOM_LEFT_TOP_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PriceDTO.Gradient.Direction.TOP_LEFT_BOTTOM_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PriceDTO.Gradient.Direction.TOP_RIGHT_BOTTOM_LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0336  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsPriceAtom(e eVar, @NotNull PriceDTO dto, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        boolean z11;
        float f7;
        C3969l c3969l;
        DsPriceStyle dsPriceStyle;
        float f11;
        DsPriceSize dsPriceSize;
        DsPriceLocator dsPriceLocator;
        e eVar3;
        int i14;
        AbstractC7799Q abstractC7799Q;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(-1980543036);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(dto) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e eVar4 = i15 != 0 ? e.f40358c0 : eVar2;
            e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
            DsPriceSize size = DsPriceSizeKt.toSize(dto.getPreset());
            float p11 = ((d) u11.m(K0.e())).p(TokensExtKt.getTextStyle(size.getActualPriceTextStyle()).o());
            DsPriceLocator dsPriceLocator2 = new DsPriceLocator(dto.getTestInfo(), null, 2, null);
            u11.o(-844502872);
            e v11 = a0.v(viewAnalytics, null, 3);
            d dVar = (d) u11.m(K0.e());
            Paddings paddingLeft = dto.getPaddingLeft();
            int i16 = 0;
            float B11 = paddingLeft != null ? dVar.B(paddingLeft.getPx()) : 0;
            Paddings paddingTop = dto.getPaddingTop();
            if (paddingTop != null) {
                z11 = true;
                f7 = dVar.B(paddingTop.getPx());
            } else {
                z11 = true;
                f7 = 0;
            }
            Paddings paddingRight = dto.getPaddingRight();
            float B12 = paddingRight != null ? dVar.B(paddingRight.getPx()) : 0;
            Paddings paddingBottom = dto.getPaddingBottom();
            e i17 = T.i(v11, B11, f7, B12, paddingBottom != null ? dVar.B(paddingBottom.getPx()) : 0);
            u11.k();
            e testTag = AtomLocatorKt.testTag(a0.i(i17, p11), dsPriceLocator2);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, testTag);
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
            F1.b(u11, f12, InterfaceC2801g.a.f());
            DsPriceStyle style = DsPriceStyleKt.toStyle(dto.getPriceStyle().getStyleType());
            u11.o(239983922);
            AbstractC7799Q gradientBrush = getGradientBrush(dto.getPriceStyle(), u11, 0);
            u11.o(239984470);
            if (gradientBrush == null && style == DsPriceStyle.SALE_PRICE) {
                gradientBrush = TokensExtKt.getGradient(UniTheme.INSTANCE.getGradients().getGrSocialPrimary(), u11, UniGradientToken.$stable);
            }
            u11.k();
            u11.k();
            e.a aVar = e.f40358c0;
            WithAlignmentLineElement withAlignmentLineElement = new WithAlignmentLineElement(C2533b.a());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            e testTag2 = AtomLocatorKt.testTag(withAlignmentLineElement.l0(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false)), dsPriceLocator2.getLeftBlock().invoke());
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f13 = c.f(u11, testTag2);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h12);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            u11.o(-2042643628);
            Iterator it = dto.getPrice().iterator();
            int i18 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    C7714v.O0();
                    throw null;
                }
                PriceDTO.Component component = (PriceDTO.Component) next;
                AbstractC8972b abstractC8972b = TokenParserKt.tokenToIcon(component.getIcon(), u11, i16);
                e eVar5 = eVar4;
                String text = component.getText();
                C7807Z c7807z = TokenParserKt.tokenToColor(component.getColor(), u11, i16);
                u11.o(-2042640452);
                if (c7807z == null) {
                    PriceDTO.Component.TextStyle textStyle = component.getTextStyle();
                    UniColorToken color = textStyle != null ? style.getColor(textStyle) : null;
                    c7807z = color == null ? null : C7807Z.m(UniCompositionLocalKt.getThemedColor(color, u11, UniColorToken.$stable));
                }
                u11.k();
                u11.o(-2042640395);
                long themedColor = c7807z == null ? UniCompositionLocalKt.getThemedColor(style.getColor(PriceDTO.Component.TextStyle.PRICE), u11, UniColorToken.$stable) : c7807z.w();
                u11.k();
                boolean z12 = i18 == 0 ? z11 : false;
                e.a aVar2 = e.f40358c0;
                Iterator it2 = it;
                if (z12) {
                    dsPriceStyle = style;
                } else {
                    dsPriceStyle = style;
                    if (component.getTextStyle() != PriceDTO.Component.TextStyle.PPU) {
                        f11 = (abstractC8972b == null || text != null) ? size.getContentGap() : 2;
                        e j11 = T.j(aVar2, f11, 0.0f, 0.0f, 0.0f, 14);
                        if (text == null) {
                            u11.o(1037593859);
                            e l02 = j11.l0(new WithAlignmentLineElement(C2533b.a()));
                            if (component.getTextStyle() == PriceDTO.Component.TextStyle.ORIGINAL_PRICE && !dto.isStrikethroughLineHidden()) {
                                l02 = m1758strikethrough4WTKRHQ(l02, themedColor);
                            }
                            P9.a.b(l02, "priceComponent" + i18);
                            K1.T calculateTextStyle = calculateTextStyle(component, size, gradientBrush, u11, 0);
                            C3969l c3969l2 = u11;
                            dsPriceLocator = dsPriceLocator2;
                            dsPriceSize = size;
                            eVar3 = eVar5;
                            AbstractC7799Q abstractC7799Q2 = gradientBrush;
                            e eVar6 = l02;
                            abstractC7799Q = abstractC7799Q2;
                            p2.b(text, eVar6, themedColor, 0L, 0L, null, 0L, 2, false, 1, 0, calculateTextStyle, c3969l2, 0, 3120, 55288);
                            u11 = c3969l2;
                            u11.k();
                            i14 = 0;
                        } else {
                            AbstractC7799Q abstractC7799Q3 = gradientBrush;
                            dsPriceSize = size;
                            dsPriceLocator = dsPriceLocator2;
                            eVar3 = eVar5;
                            i14 = 0;
                            if (abstractC8972b != null) {
                                u11.o(1038348089);
                                u11.o(1557523619);
                                e m1757hideWhenDoesntFit3ABfNKs = m1757hideWhenDoesntFit3ABfNKs(a0.n(j11, dsPriceSize.getIconSize()), dsPriceSize.getIconSize());
                                if (abstractC7799Q3 != null) {
                                    u11.o(-1497052093);
                                    Object C11 = u11.C();
                                    if (C11 == InterfaceC3967k.a.a()) {
                                        C11 = DsPriceAtomKt$DsPriceAtom$2$1$1$2$1$1.INSTANCE;
                                        u11.x(C11);
                                    }
                                    u11.k();
                                    e a13 = androidx.compose.ui.graphics.a.a(m1757hideWhenDoesntFit3ABfNKs, (Function1) C11);
                                    u11.o(-1497048477);
                                    boolean n11 = u11.n(abstractC7799Q3);
                                    Object C12 = u11.C();
                                    if (n11 || C12 == InterfaceC3967k.a.a()) {
                                        C12 = new DsPriceAtomKt$DsPriceAtom$2$1$1$2$2$1(abstractC7799Q3);
                                        u11.x(C12);
                                    }
                                    u11.k();
                                    m1757hideWhenDoesntFit3ABfNKs = androidx.compose.ui.draw.c.d(a13, (Function1) C12);
                                }
                                u11.k();
                                P9.a.b(m1757hideWhenDoesntFit3ABfNKs, "priceComponent" + i18);
                                if (abstractC7799Q3 != null) {
                                    themedColor = C7807Z.f72259m;
                                }
                                e eVar7 = m1757hideWhenDoesntFit3ABfNKs;
                                abstractC7799Q = abstractC7799Q3;
                                E.a(abstractC8972b, null, eVar7, themedColor, u11, 48);
                                u11.k();
                            } else {
                                abstractC7799Q = abstractC7799Q3;
                                u11.o(1039266805);
                                u11.k();
                            }
                        }
                        gradientBrush = abstractC7799Q;
                        i16 = i14;
                        i18 = i19;
                        it = it2;
                        style = dsPriceStyle;
                        dsPriceLocator2 = dsPriceLocator;
                        size = dsPriceSize;
                        eVar4 = eVar3;
                    }
                }
                f11 = 0;
                e j112 = T.j(aVar2, f11, 0.0f, 0.0f, 0.0f, 14);
                if (text == null) {
                }
                gradientBrush = abstractC7799Q;
                i16 = i14;
                i18 = i19;
                it = it2;
                style = dsPriceStyle;
                dsPriceLocator2 = dsPriceLocator;
                size = dsPriceSize;
                eVar4 = eVar3;
            }
            DsPriceStyle dsPriceStyle2 = style;
            e eVar8 = eVar4;
            DsPriceSize dsPriceSize2 = size;
            DsPriceLocator dsPriceLocator3 = dsPriceLocator2;
            int i21 = i16;
            u11.k();
            u11.f();
            String discount = dto.getDiscount();
            u11.o(240077840);
            if (discount != null) {
                e.a aVar3 = e.f40358c0;
                e j12 = T.j(new WithAlignmentLineElement(C2533b.a()), dsPriceSize2.getContentGap(), 0.0f, 0.0f, 0.0f, 14);
                P9.a.b(j12, "discount");
                e testTag3 = AtomLocatorKt.testTag(j12, dsPriceLocator3.getDiscount().invoke());
                K1.T textStyle2 = TokensExtKt.getTextStyle(dsPriceSize2.getTextStyle());
                C7807Z c7807z2 = TokenParserKt.tokenToColor(dto.getDiscountColor(), u11, i21);
                u11.o(240091858);
                long themedColor2 = c7807z2 == null ? UniCompositionLocalKt.getThemedColor(dsPriceStyle2.getDiscountColor(), u11, UniColorToken.$stable) : c7807z2.w();
                u11.k();
                c3969l = u11;
                p2.b(discount, testTag3, themedColor2, 0L, 0L, null, 0L, 2, false, 1, 0, textStyle2, c3969l, 0, 3120, 55288);
            } else {
                c3969l = u11;
            }
            c3969l.k();
            c3969l.f();
            eVar2 = eVar8;
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new DsPriceAtomKt$DsPriceAtom$3(eVar2, dto, i11, i12));
        }
    }

    private static final K1.T calculateTextStyle(PriceDTO.Component component, DsPriceSize dsPriceSize, AbstractC7799Q abstractC7799Q, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(616347992);
        K1.T textStyle = TokensExtKt.getTextStyle(component.getTextStyle() == PriceDTO.Component.TextStyle.PRICE ? dsPriceSize.getActualPriceTextStyle() : dsPriceSize.getTextStyle());
        if (C7705l.m(GradientComponents, component.getTextStyle()) && abstractC7799Q != null) {
            textStyle = K1.T.b(textStyle, abstractC7799Q);
        }
        interfaceC3967k.k();
        return textStyle;
    }

    private static final AbstractC7799Q getGradientBrush(PriceDTO.PriceStyle priceStyle, InterfaceC3967k interfaceC3967k, int i11) {
        UniGradientDirection uniGradientDirection;
        PriceDTO.Gradient.Direction direction;
        interfaceC3967k.o(-2030219196);
        PriceDTO.Gradient gradient = priceStyle.getGradient();
        AbstractC7799Q abstractC7799Q = null;
        C7807Z c7807z = TokenParserKt.tokenToColor(gradient != null ? gradient.getStartColor() : null, interfaceC3967k, 0);
        PriceDTO.Gradient gradient2 = priceStyle.getGradient();
        C7807Z c7807z2 = TokenParserKt.tokenToColor(gradient2 != null ? gradient2.getEndColor() : null, interfaceC3967k, 0);
        PriceDTO.Gradient gradient3 = priceStyle.getGradient();
        if (gradient3 == null || (direction = gradient3.getDirection()) == null || (uniGradientDirection = toDirection(direction)) == null) {
            uniGradientDirection = UniGradientDirection.TopLeftBottomRight;
        }
        UniGradientDirection uniGradientDirection2 = uniGradientDirection;
        if (c7807z == null || c7807z2 == null) {
            String gradientToken = priceStyle.getGradientToken();
            if (gradientToken != null) {
                abstractC7799Q = TokenParserKt.tokenToGradient(gradientToken, interfaceC3967k, 0);
            }
        } else {
            abstractC7799Q = DirectionalLinearGradientKt.m1958directionalLinearGradientesKoAe4$default(AbstractC7799Q.Companion, new Pair[]{new Pair(Float.valueOf(0.0f), c7807z), new Pair(Float.valueOf(1.0f), c7807z2)}, 0, uniGradientDirection2, 2, null);
        }
        interfaceC3967k.k();
        return abstractC7799Q;
    }

    /* renamed from: hideWhenDoesntFit-3ABfNKs, reason: not valid java name */
    private static final e m1757hideWhenDoesntFit3ABfNKs(e eVar, float f7) {
        return b.a(new DsPriceAtomKt$hideWhenDoesntFit$1(f7), eVar);
    }

    /* renamed from: strikethrough-4WTKRHQ, reason: not valid java name */
    private static final e m1758strikethrough4WTKRHQ(e eVar, long j11) {
        return androidx.compose.ui.draw.c.d(eVar, new DsPriceAtomKt$strikethrough$1(j11));
    }

    private static final UniGradientDirection toDirection(PriceDTO.Gradient.Direction direction) {
        switch (WhenMappings.$EnumSwitchMapping$0[direction.ordinal()]) {
            case 1:
                return UniGradientDirection.TopBottom;
            case 2:
                return UniGradientDirection.RightLeft;
            case 3:
                return UniGradientDirection.BottomTop;
            case 4:
                return UniGradientDirection.LeftRight;
            case 5:
                return UniGradientDirection.BottomRightTopLeft;
            case 6:
                return UniGradientDirection.BottomLeftTopRight;
            case 7:
                return UniGradientDirection.TopLeftBottomRight;
            case 8:
                return UniGradientDirection.TopRightBottomLeft;
            default:
                throw new o();
        }
    }
}
