package ru.ozon.uni.android.ds.compose.component.icon;

import A0.h;
import B1.InterfaceC2547p;
import K1.T;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.ds.compose.component.icon.squircle.AbsoluteSmoothCornerShapeKt;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\"&\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\fj\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/data/icon/IconDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "", "DsIconAtom", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Landroidx/compose/ui/e;LS0/k;II)V", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;", "size", "LK1/T;", "getDefaultTextStyle", "(Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;)LK1/T;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "Lru/ozon/uni/android/ds/compose/modifier/AtomLocator;", "iconLocator", "Lkotlin/jvm/functions/Function1;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsIconAtomKt {

    @NotNull
    private static final Function1<TestInfo, Locator> iconLocator = DsIconAtomKt$iconLocator$1.INSTANCE;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IconDTO.IconShape.values().length];
            try {
                iArr[IconDTO.IconShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconDTO.IconShape.SQUIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconDTO.IconShape.SHAPE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IconDTO.IconShape.SHAPE_SQUIRCLE_FORCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IconDTO.IconSize.values().length];
            try {
                iArr2[IconDTO.IconSize.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IconDTO.IconSize.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IconDTO.IconSize.SIZE_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IconDTO.IconSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[IconDTO.IconSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[IconDTO.IconSize.SIZE_700.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[IconDTO.IconSize.SIZE_800.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[IconDTO.IconSize.SIZE_900.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsIconAtom(@NotNull IconDTO dto, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        e eVar3;
        DrawableResource fromToken;
        long graphicPrimary;
        IconDTO.IconSize size;
        IconDTO.IconSize iconSize;
        String textStyle;
        String backgroundImage;
        boolean z11;
        C3969l c3969l;
        boolean z12;
        PikazonImagePainter a11;
        int i14;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(-14215570);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i13 & 19) == 18 || !u11.b()) {
                eVar3 = i15 == 0 ? e.f40358c0 : eVar2;
                e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
                Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                DrawableResource.Companion companion = DrawableResource.INSTANCE;
                CommonAtomIconDTO icon = dto.getIcon();
                l1.J0 j02 = null;
                fromToken = companion.fromToken(icon == null ? icon.getIcon() : null);
                u11.o(-1829797229);
                if (fromToken == null && fromToken.getIsMulticolor()) {
                    graphicPrimary = C7807Z.f72259m;
                } else {
                    CommonAtomIconDTO icon2 = dto.getIcon();
                    C7807Z c7807z = TokenParserKt.tokenToColor(icon2 == null ? icon2.getTintColor() : null, u11, 0);
                    graphicPrimary = c7807z != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicPrimary() : c7807z.w();
                }
                u11.k();
                CommonAtomIconDTO icon3 = dto.getIcon();
                String tintColor = icon3 == null ? icon3.getTintColor() : null;
                u11.o(-1829790807);
                AbstractC7799Q abstractC7799Q = tintColor != null ? null : TokenParserKt.tokenToGradient(tintColor, u11, 0);
                u11.k();
                C7807Z c7807z2 = TokenParserKt.tokenToColor(dto.getBorderColor(), u11, 0);
                long w11 = c7807z2 == null ? c7807z2.w() : C7807Z.f72259m;
                size = dto.getSize();
                if (size == null) {
                    size = IconDTO.IconSize.SIZE_500;
                }
                iconSize = size;
                ImageSize imageSize = new ImageSize(ResourceExtKt.toPx(iconSize.getSizeShape()), ResourceExtKt.toPx(iconSize.getSizeShape()));
                InterfaceC2547p d11 = dto.getBackgroundImageFitType() != IconDTO.FitType.FIT_CENTER ? InterfaceC2547p.a.d() : InterfaceC2547p.a.a();
                C7807Z c7807z3 = TokenParserKt.tokenToColor(dto.getBackgroundColor(), u11, 0);
                u11.o(-1829773449);
                long bgPrimary = c7807z3 != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgPrimary() : c7807z3.w();
                u11.k();
                AbstractC7799Q abstractC7799Q2 = TokenParserKt.tokenToGradient(dto.getBackgroundColor(), u11, 0);
                C7807Z c7807z4 = TokenParserKt.tokenToColor(dto.getTextColor(), u11, 0);
                long w12 = c7807z4 == null ? c7807z4.w() : C7807Z.f72259m;
                AbstractC7799Q d12 = dto.getShape() != IconDTO.IconShape.SQUIRCLE ? AbstractC7799Q.a.d(AbstractC7799Q.Companion, C7714v.b0(C7807Z.m(w11), C7807Z.m(w11)), 0L, 0L, 14) : new K0(w11);
                textStyle = dto.getTextStyle();
                if (textStyle != null || (r10 = TokenParserKt.parseTypographyToken(textStyle)) == null) {
                    T defaultTextStyle = getDefaultTextStyle(iconSize);
                }
                DsIconStyle dsIconStyle = new DsIconStyle(d11, C7807Z.m(graphicPrimary), bgPrimary, C7807Z.m(w12), d12, defaultTextStyle, dto.getBorderWidth() == null ? r10.intValue() : iconSize.getBorderWidth(), iconSize.getSizeShape(), iconSize.getSize(), iconSize.getPadding(), abstractC7799Q, abstractC7799Q2, null);
                Integer resId = fromToken == null ? fromToken.getResId(context) : null;
                String text = dto.getText();
                u11.o(-1829748200);
                AbstractC8972b a12 = resId != null ? null : G1.e.a(resId.intValue(), u11, 0);
                u11.k();
                backgroundImage = dto.getBackgroundImage();
                u11.o(-1829745447);
                if (backgroundImage != null) {
                    z11 = false;
                    c3969l = u11;
                    a11 = null;
                    z12 = true;
                } else {
                    u11.o(1426753646);
                    boolean F11 = u11.F(imageSize);
                    Object C11 = u11.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new DsIconAtomKt$DsIconAtom$2$1$1(imageSize);
                        u11.x(C11);
                    }
                    Function1 function1 = (Function1) C11;
                    u11.k();
                    z11 = false;
                    c3969l = u11;
                    z12 = true;
                    a11 = f.a(backgroundImage, null, null, function1, c3969l, 0, 6);
                }
                c3969l.k();
                Boolean hasParanja = dto.getHasParanja();
                boolean booleanValue = hasParanja == null ? hasParanja.booleanValue() : z11;
                boolean z13 = dto.getBorderColor() == null ? z12 : z11;
                i14 = WhenMappings.$EnumSwitchMapping$0[dto.getCompatShape().ordinal()];
                if (i14 != z12) {
                    j02 = h.e();
                } else if (i14 == 2) {
                    j02 = UniGlobalConfigKt.getRoundCornersFlag(context) ? h.e() : AbsoluteSmoothCornerShapeKt.m1719AbsoluteSmoothCornerShapeD5KLDUw(iconSize.getCornerRadius(), 100);
                } else if (i14 != 3) {
                    if (i14 != 4) {
                        throw new o();
                    }
                    j02 = AbsoluteSmoothCornerShapeKt.m1719AbsoluteSmoothCornerShapeD5KLDUw(iconSize.getCornerRadius(), 100);
                }
                u11 = c3969l;
                DsIconKt.DsIcon(dsIconStyle, AtomLocatorKt.testTag(viewAnalytics, iconLocator.invoke(dto.getTestInfo())), text, a12, a11, booleanValue, z13, j02, u11, 0, 0);
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new DsIconAtomKt$DsIconAtom$3(dto, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 19) == 18) {
        }
        if (i15 == 0) {
        }
        e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
        Context context2 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
        DrawableResource.Companion companion2 = DrawableResource.INSTANCE;
        CommonAtomIconDTO icon4 = dto.getIcon();
        l1.J0 j022 = null;
        fromToken = companion2.fromToken(icon4 == null ? icon4.getIcon() : null);
        u11.o(-1829797229);
        if (fromToken == null) {
        }
        CommonAtomIconDTO icon22 = dto.getIcon();
        C7807Z c7807z5 = TokenParserKt.tokenToColor(icon22 == null ? icon22.getTintColor() : null, u11, 0);
        if (c7807z5 != null) {
        }
        u11.k();
        CommonAtomIconDTO icon32 = dto.getIcon();
        if (icon32 == null) {
        }
        u11.o(-1829790807);
        if (tintColor != null) {
        }
        u11.k();
        C7807Z c7807z22 = TokenParserKt.tokenToColor(dto.getBorderColor(), u11, 0);
        if (c7807z22 == null) {
        }
        size = dto.getSize();
        if (size == null) {
        }
        iconSize = size;
        ImageSize imageSize2 = new ImageSize(ResourceExtKt.toPx(iconSize.getSizeShape()), ResourceExtKt.toPx(iconSize.getSizeShape()));
        InterfaceC2547p d112 = dto.getBackgroundImageFitType() != IconDTO.FitType.FIT_CENTER ? InterfaceC2547p.a.d() : InterfaceC2547p.a.a();
        C7807Z c7807z32 = TokenParserKt.tokenToColor(dto.getBackgroundColor(), u11, 0);
        u11.o(-1829773449);
        long bgPrimary2 = c7807z32 != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgPrimary() : c7807z32.w();
        u11.k();
        AbstractC7799Q abstractC7799Q22 = TokenParserKt.tokenToGradient(dto.getBackgroundColor(), u11, 0);
        C7807Z c7807z42 = TokenParserKt.tokenToColor(dto.getTextColor(), u11, 0);
        if (c7807z42 == null) {
        }
        if (dto.getShape() != IconDTO.IconShape.SQUIRCLE) {
        }
        textStyle = dto.getTextStyle();
        if (textStyle != null) {
        }
        T defaultTextStyle2 = getDefaultTextStyle(iconSize);
        DsIconStyle dsIconStyle2 = new DsIconStyle(d112, C7807Z.m(graphicPrimary), bgPrimary2, C7807Z.m(w12), d12, defaultTextStyle2, dto.getBorderWidth() == null ? r10.intValue() : iconSize.getBorderWidth(), iconSize.getSizeShape(), iconSize.getSize(), iconSize.getPadding(), abstractC7799Q, abstractC7799Q22, null);
        if (fromToken == null) {
        }
        String text2 = dto.getText();
        u11.o(-1829748200);
        if (resId != null) {
        }
        u11.k();
        backgroundImage = dto.getBackgroundImage();
        u11.o(-1829745447);
        if (backgroundImage != null) {
        }
        c3969l.k();
        Boolean hasParanja2 = dto.getHasParanja();
        if (hasParanja2 == null) {
        }
        if (dto.getBorderColor() == null) {
        }
        i14 = WhenMappings.$EnumSwitchMapping$0[dto.getCompatShape().ordinal()];
        if (i14 != z12) {
        }
        u11 = c3969l;
        DsIconKt.DsIcon(dsIconStyle2, AtomLocatorKt.testTag(viewAnalytics2, iconLocator.invoke(dto.getTestInfo())), text2, a12, a11, booleanValue, z13, j022, u11, 0, 0);
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    private static final T getDefaultTextStyle(IconDTO.IconSize iconSize) {
        switch (WhenMappings.$EnumSwitchMapping$1[iconSize.ordinal()]) {
            case 1:
                return UniTheme.INSTANCE.getTypography().getBodyAccent250Caption();
            case 2:
                return UniTheme.INSTANCE.getTypography().getBodyControl300XSmall();
            case 3:
                return UniTheme.INSTANCE.getTypography().getBodyControl400Small();
            case 4:
                return UniTheme.INSTANCE.getTypography().getBodyControl500Medium();
            case 5:
                return UniTheme.INSTANCE.getTypography().getHeadline400Small();
            case 6:
                return UniTheme.INSTANCE.getTypography().getHeadline500Medium();
            case 7:
                return UniTheme.INSTANCE.getTypography().getHeadline700XLarge();
            case 8:
                return UniTheme.INSTANCE.getTypography().getHeadline800XxLarge();
            default:
                throw new o();
        }
    }
}
