package ru.ozon.uni.components.productMedia;

import B1.InterfaceC2547p;
import K1.T;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import n0.C8391l;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt$toOnClickLambda$1$1;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.compose.tokens.UniPainter;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.UniTestInfoTestTagKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0010\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0010\u0010\u0014\u001a\u0013\u0010\u0010\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0010\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "UniProductMediaAtom", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "", "Lq1/b;", "tokenToIcon", "(Ljava/lang/String;LS0/k;I)Lq1/b;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$BorderStyle;", "Lru/ozon/uni/components/productMedia/UniProductMediaBorderStyle;", "toVo", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$BorderStyle;)Lru/ozon/uni/components/productMedia/UniProductMediaBorderStyle;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Ratio;", "", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Ratio;)F", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Width;", "Lru/ozon/uni/components/productMedia/UniProductMediaSize;", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Width;)Lru/ozon/uni/components/productMedia/UniProductMediaSize;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniProductMediaAtomKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[ProductMediaDTO.FitType.values().length];
            try {
                iArr[ProductMediaDTO.FitType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductMediaDTO.FitType.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProductMediaDTO.BorderStyle.values().length];
            try {
                iArr2[ProductMediaDTO.BorderStyle.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ProductMediaDTO.BorderStyle.DASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ProductMediaDTO.Ratio.values().length];
            try {
                iArr3[ProductMediaDTO.Ratio.RATIO_1_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[ProductMediaDTO.Ratio.RATIO_3_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ProductMediaDTO.Ratio.RATIO_4_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ProductMediaDTO.Width.values().length];
            try {
                iArr4[ProductMediaDTO.Width.WIDTH_300.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[ProductMediaDTO.Width.WIDTH_400.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[ProductMediaDTO.Width.WIDTH_500.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[ProductMediaDTO.Width.WIDTH_600.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[ProductMediaDTO.Width.WIDTH_700.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[ProductMediaDTO.Width.WIDTH_800.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[ProductMediaDTO.Width.WIDTH_900.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ProductMediaDTO.Width.WIDTH_1000.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ProductMediaDTO.Width.WIDTH_1100.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[ProductMediaDTO.Width.WIDTH_1200.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniProductMediaAtom(@NotNull ProductMediaDTO dto, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super AtomAction, Unit> function12;
        Function1<? super AtomAction, Unit> function13;
        ProductMediaDTO.Image image;
        int i15;
        InterfaceC2547p d11;
        ProductMediaDTO.Width width;
        TestInfo testInfo;
        ProductMediaDTO.Ratio ratio;
        AbstractC7799Q k02;
        e eVar3;
        C8391l c8391l;
        ProductMediaDTO.Border border;
        ProductMediaDTO.Label label;
        e eVar4;
        AtomAction atomAction;
        String typographyToken;
        ProductMediaDTO.BorderStyle style;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(-780987952);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function12 = function1;
                i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) == 146 || !u11.b()) {
                    e eVar5 = i16 != 0 ? e.f40358c0 : eVar2;
                    if (i14 != 0) {
                        u11.o(909938752);
                        Object C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = UniProductMediaAtomKt$UniProductMediaAtom$1$1.INSTANCE;
                            u11.x(C11);
                        }
                        function13 = (Function1) C11;
                        u11.k();
                    } else {
                        function13 = function12;
                    }
                    e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar5, dto);
                    image = dto.getImage();
                    if (image != null || (r6 = image.getFitType()) == null) {
                        ProductMediaDTO.FitType fitType = ProductMediaDTO.FitType.FIT_CENTER;
                    }
                    i15 = WhenMappings.$EnumSwitchMapping$0[fitType.ordinal()];
                    if (i15 == 1) {
                        d11 = InterfaceC2547p.a.d();
                    } else {
                        if (i15 != 2) {
                            throw new o();
                        }
                        d11 = InterfaceC2547p.a.a();
                    }
                    InterfaceC2547p interfaceC2547p = d11;
                    width = dto.getWidth();
                    if (width == null) {
                        width = ProductMediaDTO.Width.WIDTH_500;
                    }
                    UniProductMediaSize vo = toVo(width);
                    u11.o(909951724);
                    testInfo = dto.getTestInfo();
                    if (testInfo != null) {
                        viewAnalytics = UniTestInfoTestTagKt.uniTestTag(viewAnalytics, testInfo, u11, 0);
                    }
                    e eVar6 = viewAnalytics;
                    u11.k();
                    ProductMediaDTO.Image image2 = dto.getImage();
                    u11.o(909954842);
                    PikazonImagePainter a11 = image2 == null ? null : f.a(image2.getUrl(), interfaceC2547p, null, null, u11, 0, 12);
                    u11.k();
                    ratio = dto.getRatio();
                    if (ratio == null) {
                        ratio = ProductMediaDTO.Ratio.RATIO_1_1;
                    }
                    float vo2 = toVo(ratio);
                    u11.o(909961820);
                    String backgroundColor = dto.getBackgroundColor();
                    C7807Z c7807z = TokenParserKt.tokenToColor(backgroundColor, u11, 0);
                    k02 = c7807z != null ? new K0(c7807z.w()) : null;
                    u11.o(909962004);
                    if (k02 == null) {
                        k02 = TokenParserKt.tokenToGradient(backgroundColor, u11, 0);
                    }
                    u11.k();
                    u11.k();
                    u11.o(909960850);
                    if (k02 == null) {
                        k02 = new K0(UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgPrimary());
                    }
                    u11.k();
                    Boolean hasParanja = dto.getHasParanja();
                    boolean booleanValue = hasParanja != null ? hasParanja.booleanValue() : false;
                    u11.o(909967804);
                    if (dto.getBorder() != null) {
                        Integer width2 = dto.getBorder().getWidth();
                        if ((width2 != null ? width2.intValue() : 0) > 0) {
                            float intValue = dto.getBorder().getWidth() != null ? r7.intValue() : 0;
                            String color = dto.getBorder().getColor();
                            u11.o(909973260);
                            C7807Z c7807z2 = color == null ? null : TokenParserKt.tokenToColor(color, u11, 0);
                            u11.k();
                            eVar3 = eVar6;
                            c8391l = new C8391l(new K0(c7807z2 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicPrimary() : c7807z2.w()), intValue);
                            u11.k();
                            border = dto.getBorder();
                            if (border != null || (style = border.getStyle()) == null || (r7 = toVo(style)) == null) {
                                UniProductMediaBorderStyle uniProductMediaBorderStyle = UniProductMediaBorderStyle.SOLID;
                            }
                            UniProductMediaBorderStyle uniProductMediaBorderStyle2 = uniProductMediaBorderStyle;
                            Boolean hasOverlay = dto.getHasOverlay();
                            boolean booleanValue2 = hasOverlay == null ? hasOverlay.booleanValue() : false;
                            CommonAtomIconDTO icon = dto.getIcon();
                            String icon2 = icon == null ? icon.getIcon() : null;
                            u11.o(909982027);
                            AbstractC8972b abstractC8972b = icon2 != null ? null : tokenToIcon(icon2, u11, 0);
                            u11.k();
                            CommonAtomIconDTO icon3 = dto.getIcon();
                            String tintColor = icon3 == null ? icon3.getTintColor() : null;
                            e eVar7 = eVar5;
                            u11.o(909983916);
                            C7807Z c7807z3 = tintColor != null ? null : TokenParserKt.tokenToColor(tintColor, u11, 0);
                            u11.k();
                            u11.o(909983300);
                            long graphicTertiary = c7807z3 != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicTertiary() : c7807z3.w();
                            u11.k();
                            ProductMediaDTO.Label label2 = dto.getLabel();
                            String text = label2 == null ? label2.getText() : null;
                            ProductMediaDTO.Label label3 = dto.getLabel();
                            String color2 = label3 == null ? label3.getColor() : null;
                            String str = text;
                            u11.o(909987852);
                            C7807Z c7807z4 = color2 != null ? null : TokenParserKt.tokenToColor(color2, u11, 0);
                            u11.k();
                            u11.o(909987326);
                            long textTertiary = c7807z4 != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextTertiary() : c7807z4.w();
                            u11.k();
                            label = dto.getLabel();
                            if (label != null || (typographyToken = label.getTypographyToken()) == null || (r0 = TokenParserKt.tokenToTextStyle(typographyToken)) == null) {
                                T labelTextStyle = vo.getLabelTextStyle();
                            }
                            CornerRadius radius = dto.getRadius();
                            float m1866getDpD9Ej5fM = radius == null ? radius.m1866getDpD9Ej5fM() : 8;
                            String smallIcon = dto.getSmallIcon();
                            T t2 = labelTextStyle;
                            u11.o(909995851);
                            AbstractC8972b abstractC8972b2 = smallIcon != null ? null : tokenToIcon(smallIcon, u11, 0);
                            u11.k();
                            String smallLabel = dto.getSmallLabel();
                            String smallIconColor = dto.getSmallIconColor();
                            u11.o(909999052);
                            C7807Z c7807z5 = smallIconColor != null ? null : TokenParserKt.tokenToColor(smallIconColor, u11, 0);
                            u11.k();
                            u11.o(909998467);
                            long graphicTertiary2 = c7807z5 != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicTertiary() : c7807z5.w();
                            u11.k();
                            String smallLabelColor = dto.getSmallLabelColor();
                            u11.o(910002188);
                            C7807Z c7807z6 = smallLabelColor != null ? null : TokenParserKt.tokenToColor(smallLabelColor, u11, 0);
                            u11.k();
                            u11.o(910001569);
                            long textTertiary2 = c7807z6 != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getTextTertiary() : c7807z6.w();
                            u11.k();
                            CommonControlSettings common = dto.getCommon();
                            UniProductMediaKt.m1931UniProductMediawzanWIw(a11, eVar3, vo, vo2, k02, booleanValue, c8391l, uniProductMediaBorderStyle2, booleanValue2, abstractC8972b, graphicTertiary, str, textTertiary, t2, m1866getDpD9Ej5fM, interfaceC2547p, abstractC8972b2, smallLabel, graphicTertiary2, textTertiary2, (common != null || (atomAction = common.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction), null, u11, 0, 0, 0, 2097152);
                            u11 = u11;
                            eVar4 = eVar7;
                        }
                    }
                    eVar3 = eVar6;
                    c8391l = null;
                    u11.k();
                    border = dto.getBorder();
                    if (border != null) {
                    }
                    UniProductMediaBorderStyle uniProductMediaBorderStyle3 = UniProductMediaBorderStyle.SOLID;
                    UniProductMediaBorderStyle uniProductMediaBorderStyle22 = uniProductMediaBorderStyle3;
                    Boolean hasOverlay2 = dto.getHasOverlay();
                    if (hasOverlay2 == null) {
                    }
                    CommonAtomIconDTO icon4 = dto.getIcon();
                    if (icon4 == null) {
                    }
                    u11.o(909982027);
                    if (icon2 != null) {
                    }
                    u11.k();
                    CommonAtomIconDTO icon32 = dto.getIcon();
                    if (icon32 == null) {
                    }
                    e eVar72 = eVar5;
                    u11.o(909983916);
                    if (tintColor != null) {
                    }
                    u11.k();
                    u11.o(909983300);
                    if (c7807z3 != null) {
                    }
                    u11.k();
                    ProductMediaDTO.Label label22 = dto.getLabel();
                    if (label22 == null) {
                    }
                    ProductMediaDTO.Label label32 = dto.getLabel();
                    if (label32 == null) {
                    }
                    String str2 = text;
                    u11.o(909987852);
                    if (color2 != null) {
                    }
                    u11.k();
                    u11.o(909987326);
                    if (c7807z4 != null) {
                    }
                    u11.k();
                    label = dto.getLabel();
                    if (label != null) {
                    }
                    T labelTextStyle2 = vo.getLabelTextStyle();
                    CornerRadius radius2 = dto.getRadius();
                    float m1866getDpD9Ej5fM2 = radius2 == null ? radius2.m1866getDpD9Ej5fM() : 8;
                    String smallIcon2 = dto.getSmallIcon();
                    T t22 = labelTextStyle2;
                    u11.o(909995851);
                    if (smallIcon2 != null) {
                    }
                    u11.k();
                    String smallLabel2 = dto.getSmallLabel();
                    String smallIconColor2 = dto.getSmallIconColor();
                    u11.o(909999052);
                    if (smallIconColor2 != null) {
                    }
                    u11.k();
                    u11.o(909998467);
                    if (c7807z5 != null) {
                    }
                    u11.k();
                    String smallLabelColor2 = dto.getSmallLabelColor();
                    u11.o(910002188);
                    if (smallLabelColor2 != null) {
                    }
                    u11.k();
                    u11.o(910001569);
                    if (c7807z6 != null) {
                    }
                    u11.k();
                    CommonControlSettings common2 = dto.getCommon();
                    UniProductMediaKt.m1931UniProductMediawzanWIw(a11, eVar3, vo, vo2, k02, booleanValue, c8391l, uniProductMediaBorderStyle22, booleanValue2, abstractC8972b, graphicTertiary, str2, textTertiary, t22, m1866getDpD9Ej5fM2, interfaceC2547p, abstractC8972b2, smallLabel2, graphicTertiary2, textTertiary2, (common2 != null || (atomAction = common2.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction), null, u11, 0, 0, 0, 2097152);
                    u11 = u11;
                    eVar4 = eVar72;
                } else {
                    u11.j();
                    eVar4 = eVar2;
                    function13 = function12;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new UniProductMediaAtomKt$UniProductMediaAtom$5(dto, eVar4, function13, i11, i12));
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i13 & 147) == 146) {
            }
            if (i16 != 0) {
            }
            if (i14 != 0) {
            }
            e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar5, dto);
            image = dto.getImage();
            if (image != null) {
            }
            ProductMediaDTO.FitType fitType2 = ProductMediaDTO.FitType.FIT_CENTER;
            i15 = WhenMappings.$EnumSwitchMapping$0[fitType2.ordinal()];
            if (i15 == 1) {
            }
            InterfaceC2547p interfaceC2547p2 = d11;
            width = dto.getWidth();
            if (width == null) {
            }
            UniProductMediaSize vo3 = toVo(width);
            u11.o(909951724);
            testInfo = dto.getTestInfo();
            if (testInfo != null) {
            }
            e eVar62 = viewAnalytics2;
            u11.k();
            ProductMediaDTO.Image image22 = dto.getImage();
            u11.o(909954842);
            if (image22 == null) {
            }
            u11.k();
            ratio = dto.getRatio();
            if (ratio == null) {
            }
            float vo22 = toVo(ratio);
            u11.o(909961820);
            String backgroundColor2 = dto.getBackgroundColor();
            C7807Z c7807z7 = TokenParserKt.tokenToColor(backgroundColor2, u11, 0);
            if (c7807z7 != null) {
            }
            u11.o(909962004);
            if (k02 == null) {
            }
            u11.k();
            u11.k();
            u11.o(909960850);
            if (k02 == null) {
            }
            u11.k();
            Boolean hasParanja2 = dto.getHasParanja();
            if (hasParanja2 != null) {
            }
            u11.o(909967804);
            if (dto.getBorder() != null) {
            }
            eVar3 = eVar62;
            c8391l = null;
            u11.k();
            border = dto.getBorder();
            if (border != null) {
            }
            UniProductMediaBorderStyle uniProductMediaBorderStyle32 = UniProductMediaBorderStyle.SOLID;
            UniProductMediaBorderStyle uniProductMediaBorderStyle222 = uniProductMediaBorderStyle32;
            Boolean hasOverlay22 = dto.getHasOverlay();
            if (hasOverlay22 == null) {
            }
            CommonAtomIconDTO icon42 = dto.getIcon();
            if (icon42 == null) {
            }
            u11.o(909982027);
            if (icon2 != null) {
            }
            u11.k();
            CommonAtomIconDTO icon322 = dto.getIcon();
            if (icon322 == null) {
            }
            e eVar722 = eVar5;
            u11.o(909983916);
            if (tintColor != null) {
            }
            u11.k();
            u11.o(909983300);
            if (c7807z3 != null) {
            }
            u11.k();
            ProductMediaDTO.Label label222 = dto.getLabel();
            if (label222 == null) {
            }
            ProductMediaDTO.Label label322 = dto.getLabel();
            if (label322 == null) {
            }
            String str22 = text;
            u11.o(909987852);
            if (color2 != null) {
            }
            u11.k();
            u11.o(909987326);
            if (c7807z4 != null) {
            }
            u11.k();
            label = dto.getLabel();
            if (label != null) {
            }
            T labelTextStyle22 = vo3.getLabelTextStyle();
            CornerRadius radius22 = dto.getRadius();
            float m1866getDpD9Ej5fM22 = radius22 == null ? radius22.m1866getDpD9Ej5fM() : 8;
            String smallIcon22 = dto.getSmallIcon();
            T t222 = labelTextStyle22;
            u11.o(909995851);
            if (smallIcon22 != null) {
            }
            u11.k();
            String smallLabel22 = dto.getSmallLabel();
            String smallIconColor22 = dto.getSmallIconColor();
            u11.o(909999052);
            if (smallIconColor22 != null) {
            }
            u11.k();
            u11.o(909998467);
            if (c7807z5 != null) {
            }
            u11.k();
            String smallLabelColor22 = dto.getSmallLabelColor();
            u11.o(910002188);
            if (smallLabelColor22 != null) {
            }
            u11.k();
            u11.o(910001569);
            if (c7807z6 != null) {
            }
            u11.k();
            CommonControlSettings common22 = dto.getCommon();
            UniProductMediaKt.m1931UniProductMediawzanWIw(a11, eVar3, vo3, vo22, k02, booleanValue, c8391l, uniProductMediaBorderStyle222, booleanValue2, abstractC8972b, graphicTertiary, str22, textTertiary, t222, m1866getDpD9Ej5fM22, interfaceC2547p2, abstractC8972b2, smallLabel22, graphicTertiary2, textTertiary2, (common22 != null || (atomAction = common22.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction), null, u11, 0, 0, 0, 2097152);
            u11 = u11;
            eVar4 = eVar722;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        function12 = function1;
        if ((i13 & 147) == 146) {
        }
        if (i16 != 0) {
        }
        if (i14 != 0) {
        }
        e viewAnalytics22 = AnalyticsModifierKt.viewAnalytics(eVar5, dto);
        image = dto.getImage();
        if (image != null) {
        }
        ProductMediaDTO.FitType fitType22 = ProductMediaDTO.FitType.FIT_CENTER;
        i15 = WhenMappings.$EnumSwitchMapping$0[fitType22.ordinal()];
        if (i15 == 1) {
        }
        InterfaceC2547p interfaceC2547p22 = d11;
        width = dto.getWidth();
        if (width == null) {
        }
        UniProductMediaSize vo32 = toVo(width);
        u11.o(909951724);
        testInfo = dto.getTestInfo();
        if (testInfo != null) {
        }
        e eVar622 = viewAnalytics22;
        u11.k();
        ProductMediaDTO.Image image222 = dto.getImage();
        u11.o(909954842);
        if (image222 == null) {
        }
        u11.k();
        ratio = dto.getRatio();
        if (ratio == null) {
        }
        float vo222 = toVo(ratio);
        u11.o(909961820);
        String backgroundColor22 = dto.getBackgroundColor();
        C7807Z c7807z72 = TokenParserKt.tokenToColor(backgroundColor22, u11, 0);
        if (c7807z72 != null) {
        }
        u11.o(909962004);
        if (k02 == null) {
        }
        u11.k();
        u11.k();
        u11.o(909960850);
        if (k02 == null) {
        }
        u11.k();
        Boolean hasParanja22 = dto.getHasParanja();
        if (hasParanja22 != null) {
        }
        u11.o(909967804);
        if (dto.getBorder() != null) {
        }
        eVar3 = eVar622;
        c8391l = null;
        u11.k();
        border = dto.getBorder();
        if (border != null) {
        }
        UniProductMediaBorderStyle uniProductMediaBorderStyle322 = UniProductMediaBorderStyle.SOLID;
        UniProductMediaBorderStyle uniProductMediaBorderStyle2222 = uniProductMediaBorderStyle322;
        Boolean hasOverlay222 = dto.getHasOverlay();
        if (hasOverlay222 == null) {
        }
        CommonAtomIconDTO icon422 = dto.getIcon();
        if (icon422 == null) {
        }
        u11.o(909982027);
        if (icon2 != null) {
        }
        u11.k();
        CommonAtomIconDTO icon3222 = dto.getIcon();
        if (icon3222 == null) {
        }
        e eVar7222 = eVar5;
        u11.o(909983916);
        if (tintColor != null) {
        }
        u11.k();
        u11.o(909983300);
        if (c7807z3 != null) {
        }
        u11.k();
        ProductMediaDTO.Label label2222 = dto.getLabel();
        if (label2222 == null) {
        }
        ProductMediaDTO.Label label3222 = dto.getLabel();
        if (label3222 == null) {
        }
        String str222 = text;
        u11.o(909987852);
        if (color2 != null) {
        }
        u11.k();
        u11.o(909987326);
        if (c7807z4 != null) {
        }
        u11.k();
        label = dto.getLabel();
        if (label != null) {
        }
        T labelTextStyle222 = vo32.getLabelTextStyle();
        CornerRadius radius222 = dto.getRadius();
        float m1866getDpD9Ej5fM222 = radius222 == null ? radius222.m1866getDpD9Ej5fM() : 8;
        String smallIcon222 = dto.getSmallIcon();
        T t2222 = labelTextStyle222;
        u11.o(909995851);
        if (smallIcon222 != null) {
        }
        u11.k();
        String smallLabel222 = dto.getSmallLabel();
        String smallIconColor222 = dto.getSmallIconColor();
        u11.o(909999052);
        if (smallIconColor222 != null) {
        }
        u11.k();
        u11.o(909998467);
        if (c7807z5 != null) {
        }
        u11.k();
        String smallLabelColor222 = dto.getSmallLabelColor();
        u11.o(910002188);
        if (smallLabelColor222 != null) {
        }
        u11.k();
        u11.o(910001569);
        if (c7807z6 != null) {
        }
        u11.k();
        CommonControlSettings common222 = dto.getCommon();
        UniProductMediaKt.m1931UniProductMediawzanWIw(a11, eVar3, vo32, vo222, k02, booleanValue, c8391l, uniProductMediaBorderStyle2222, booleanValue2, abstractC8972b, graphicTertiary, str222, textTertiary, t2222, m1866getDpD9Ej5fM222, interfaceC2547p22, abstractC8972b2, smallLabel222, graphicTertiary2, textTertiary2, (common222 != null || (atomAction = common222.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction), null, u11, 0, 0, 0, 2097152);
        u11 = u11;
        eVar4 = eVar7222;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    private static final UniProductMediaBorderStyle toVo(ProductMediaDTO.BorderStyle borderStyle) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[borderStyle.ordinal()];
        if (i11 == 1) {
            return UniProductMediaBorderStyle.SOLID;
        }
        if (i11 == 2) {
            return UniProductMediaBorderStyle.DASH;
        }
        throw new o();
    }

    private static final AbstractC8972b tokenToIcon(String str, InterfaceC3967k interfaceC3967k, int i11) {
        Integer drawable;
        interfaceC3967k.o(89034837);
        if (str == null) {
            interfaceC3967k.k();
            return null;
        }
        UniIconToken byId = UniTheme.INSTANCE.getIconTokens().getById(str);
        if (byId == null || (drawable = TokensExtKt.getDrawable(byId)) == null) {
            interfaceC3967k.k();
            return null;
        }
        UniPainter uniPainter = new UniPainter(str, G1.e.a(drawable.intValue(), interfaceC3967k, 0));
        interfaceC3967k.k();
        return uniPainter;
    }

    private static final float toVo(ProductMediaDTO.Ratio ratio) {
        int i11 = WhenMappings.$EnumSwitchMapping$2[ratio.ordinal()];
        if (i11 == 1) {
            return 1.0f;
        }
        if (i11 == 2) {
            return 0.75f;
        }
        if (i11 == 3) {
            return 1.3333334f;
        }
        throw new o();
    }

    private static final UniProductMediaSize toVo(ProductMediaDTO.Width width) {
        switch (WhenMappings.$EnumSwitchMapping$3[width.ordinal()]) {
            case 1:
                return UniProductMediaSize.Size300;
            case 2:
                return UniProductMediaSize.Size400;
            case 3:
                return UniProductMediaSize.Size500;
            case 4:
                return UniProductMediaSize.Size600;
            case 5:
                return UniProductMediaSize.Size700;
            case 6:
                return UniProductMediaSize.Size800;
            case 7:
                return UniProductMediaSize.Size900;
            case 8:
                return UniProductMediaSize.Size1000;
            case 9:
                return UniProductMediaSize.Size1100;
            case 10:
                return UniProductMediaSize.Size1200;
            default:
                throw new o();
        }
    }
}
