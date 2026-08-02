package ru.ozon.uni.android.ds.compose.component.button;

import K1.T;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import a1.C4912a;
import a1.c;
import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonColorScheme;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.A11yInfo;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9915y;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "", "loading", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "DsButtonAtom", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme;", "toDsButtonColorScheme", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;)Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme;", "Lru/ozon/uni/core/models/UniColorToken;", "colorToken", "", "colorString", "Ll1/Z;", "getColor", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/core/models/UniColorToken;Ljava/lang/String;LS0/k;I)J", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsButtonAtomKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3DTO.StyleTypes.values().length];
            try {
                iArr[ButtonV3DTO.StyleTypes.ACTION_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.ACTION_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.ACCENT_PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.ACCENT_SECONDARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.NEGATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.NEUTRAL_SECONDARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.CUSTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0304  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsButtonAtom(@NotNull ButtonV3DTO dto, e eVar, boolean z11, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        boolean z12;
        int i15;
        Function1<? super AtomAction, Unit> function12;
        boolean d11;
        ButtonV3DTO.StyleTypes styleType;
        ButtonV3DTO.Sizes size;
        Function1<? super AtomAction, Unit> function13;
        long color;
        ButtonV3DTO.Sizes sizes;
        Integer resId;
        boolean z13;
        AbstractC8972b a11;
        A11yInfo a11yInfo;
        boolean z14;
        Object C11;
        Function1<? super AtomAction, Unit> function14;
        C3969l c3969l;
        e eVar3;
        boolean z15;
        Function1<? super AtomAction, Unit> function15;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(-331878366);
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
                z12 = z11;
                i13 |= u11.p(z12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    function12 = function1;
                    i13 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    if ((i13 & 1171) == 1170 || !u11.b()) {
                        e eVar4 = i16 == 0 ? e.f40358c0 : eVar2;
                        boolean z16 = i14 == 0 ? false : z12;
                        Function1<? super AtomAction, Unit> function16 = i15 == 0 ? null : function12;
                        d11 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
                        Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                        styleType = dto.getStyleType();
                        if (styleType == null) {
                            styleType = ButtonV3DTO.StyleTypes.ACTION_PRIMARY;
                        }
                        DsButtonColorScheme dsButtonColorScheme = toDsButtonColorScheme(styleType);
                        if (!d11) {
                            dsButtonColorScheme = DsButtonColorScheme.Disabled.INSTANCE;
                        }
                        size = dto.getSize();
                        if (size == null) {
                            size = ButtonV3DTO.Sizes.SIZE_500;
                        }
                        DrawableResource fromToken = DrawableResource.INSTANCE.fromToken(dto.getIcon());
                        UniColorToken backgroundColor = dsButtonColorScheme.getBackgroundColor();
                        String backgroundColor2 = dto.getBackgroundColor();
                        int i17 = i13 & 14;
                        int i18 = i17 | (UniColorToken.$stable << 3);
                        long color2 = getColor(dto, backgroundColor, backgroundColor2, u11, i18);
                        long color3 = getColor(dto, dsButtonColorScheme.getTitleTextColor(), dto.getTitleColor(), u11, i18);
                        int i19 = i13;
                        long color4 = getColor(dto, dsButtonColorScheme.getSubtitleTextColor(), dto.getSubtitleColor(), u11, i18);
                        u11.o(2005980327);
                        DsButtonColorScheme dsButtonColorScheme2 = dsButtonColorScheme;
                        function13 = function16;
                        long color5 = (fromToken == null && fromToken.getIsMulticolor()) ? C7807Z.f72259m : getColor(dto, dsButtonColorScheme2.getIconColor(), dto.getIconColor(), u11, i18);
                        u11.k();
                        color = getColor(dto, dsButtonColorScheme2.getDataBackgroundColor(), dto.getDataBackgroundColor(), u11, i18);
                        e eVar5 = eVar4;
                        long color6 = getColor(dto, dsButtonColorScheme2.getDataTextColor(), dto.getDataTextColor(), u11, i18);
                        ButtonV3DTO.Sizes size2 = dto.getSize();
                        ButtonV3DTO.Sizes sizes2 = ButtonV3DTO.Sizes.SIZE_400;
                        T bodyControl400Small = size2 != sizes2 ? UniTheme.INSTANCE.getTypography().getBodyControl400Small() : UniTheme.INSTANCE.getTypography().getBodyControl500Medium();
                        UniTheme uniTheme = UniTheme.INSTANCE;
                        T compact400Small = uniTheme.getTypography().getCompact400Small();
                        T body400Small = dto.getSize() != sizes2 ? uniTheme.getTypography().getBody400Small() : uniTheme.getTypography().getBody500Medium();
                        long m1681updateAlphaDxMtmZc = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color3, d11);
                        long m1681updateAlphaDxMtmZc2 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color4, d11);
                        long m1681updateAlphaDxMtmZc3 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color5, d11);
                        sizes = ButtonV3DTO.Sizes.SIZE_600;
                        if (size != sizes && dto.getSize() != ButtonV3DTO.Sizes.SIZE_700) {
                            color = C7807Z.f72258l;
                        }
                        long j11 = color;
                        long m1681updateAlphaDxMtmZc4 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color6, d11);
                        float height = size.getHeight();
                        Rounds round = dto.getRound();
                        float cornerRadius = !(round == null ? round.getRoundCorners() : UniGlobalConfigKt.getRoundCornersFlag(context)) ? 99 : size.getCornerRadius();
                        float dataCornerRadius = size.getDataCornerRadius();
                        C9915y a12 = dto.getDataText() != null ? androidx.compose.foundation.layout.T.a(size.getHorizontalMargin(), 2, 0.0f) : androidx.compose.foundation.layout.T.b(size.getHorizontalMargin(), 0.0f, size.getDataMargin(), 0.0f, 10);
                        float dataHorizontalPadding = size.getDataHorizontalPadding();
                        float dataVerticalPadding = size.getDataVerticalPadding();
                        DsButtonStyle dsButtonStyle = new DsButtonStyle(bodyControl400Small, compact400Small, body400Small, color2, m1681updateAlphaDxMtmZc, m1681updateAlphaDxMtmZc2, m1681updateAlphaDxMtmZc3, j11, m1681updateAlphaDxMtmZc4, height, cornerRadius, dataCornerRadius, a12, new C9915y(dataHorizontalPadding, dataVerticalPadding, dataHorizontalPadding, dataVerticalPadding), TokenParserKt.tokenToGradient(dto.getBackgroundColor(), u11, 0), null);
                        resId = fromToken == null ? fromToken.getResId(context) : null;
                        boolean z17 = size != sizes || dto.getSize() == ButtonV3DTO.Sizes.SIZE_700;
                        DsButtonLocator dsButtonLocator = new DsButtonLocator(dto.getTestInfo(), null, 2, null);
                        e testTag = AtomLocatorKt.testTag(AnalyticsModifierKt.viewAnalytics(eVar5, dto), dsButtonLocator);
                        e.a aVar = e.f40358c0;
                        e testTag2 = AtomLocatorKt.testTag(aVar, dsButtonLocator.getTitle().invoke());
                        e j12 = androidx.compose.foundation.layout.T.j(AtomLocatorKt.testTag(aVar, dsButtonLocator.getSubtitle().invoke()), 0.0f, 0.0f, 0.0f, DsSpacings.INSTANCE.m1847getDp2D9Ej5fM(), 7);
                        String str = null;
                        String title = dto.getTitle();
                        String subtitle = dto.getSubtitle();
                        String dataText = dto.getDataText();
                        u11.o(2006065538);
                        if ((dto.getSubtitle() == null && z17) || dto.getDataText() != null || resId == null) {
                            a11 = null;
                            z13 = false;
                        } else {
                            z13 = false;
                            a11 = G1.e.a(resId.intValue(), u11, 0);
                        }
                        u11.k();
                        Boolean isDisabled = dto.isDisabled();
                        boolean z18 = (isDisabled == null && isDisabled.booleanValue()) ? z13 : true;
                        u11.o(2006073388);
                        C4912a c11 = !z16 ? c.c(895239156, new DsButtonAtomKt$DsButtonAtom$2(size, dsButtonStyle), u11) : null;
                        u11.k();
                        Boolean isHoverDisabled = dto.isHoverDisabled();
                        boolean booleanValue = isHoverDisabled == null ? isHoverDisabled.booleanValue() : z13;
                        a11yInfo = dto.getA11yInfo();
                        if (a11yInfo != null) {
                            str = a11yInfo.getCombinedLabel();
                        }
                        String str2 = str;
                        u11.o(2006090522);
                        z14 = (i17 != 4 ? true : z13) | ((i19 & 7168) != 2048);
                        C11 = u11.C();
                        if (!z14 || C11 == InterfaceC3967k.a.a()) {
                            function14 = function13;
                            C11 = new DsButtonAtomKt$DsButtonAtom$3$1(dto, function14);
                            u11.x(C11);
                        } else {
                            function14 = function13;
                        }
                        u11.k();
                        c3969l = u11;
                        DsButtonKt.DsButton(title, dsButtonStyle, z17, testTag, subtitle, dataText, a11, c11, z18, booleanValue, testTag2, j12, str2, null, (Function0) C11, c3969l, 0, 0, 8192);
                        eVar3 = eVar5;
                        z15 = z16;
                        function15 = function14;
                    } else {
                        u11.j();
                        c3969l = u11;
                        eVar3 = eVar2;
                        z15 = z12;
                        function15 = function12;
                    }
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new DsButtonAtomKt$DsButtonAtom$4(dto, eVar3, z15, function15, i11, i12));
                        return;
                    }
                    return;
                }
                function12 = function1;
                if ((i13 & 1171) == 1170) {
                }
                if (i16 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                d11 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
                Context context2 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                styleType = dto.getStyleType();
                if (styleType == null) {
                }
                DsButtonColorScheme dsButtonColorScheme3 = toDsButtonColorScheme(styleType);
                if (!d11) {
                }
                size = dto.getSize();
                if (size == null) {
                }
                DrawableResource fromToken2 = DrawableResource.INSTANCE.fromToken(dto.getIcon());
                UniColorToken backgroundColor3 = dsButtonColorScheme3.getBackgroundColor();
                String backgroundColor22 = dto.getBackgroundColor();
                int i172 = i13 & 14;
                int i182 = i172 | (UniColorToken.$stable << 3);
                long color22 = getColor(dto, backgroundColor3, backgroundColor22, u11, i182);
                long color32 = getColor(dto, dsButtonColorScheme3.getTitleTextColor(), dto.getTitleColor(), u11, i182);
                int i192 = i13;
                long color42 = getColor(dto, dsButtonColorScheme3.getSubtitleTextColor(), dto.getSubtitleColor(), u11, i182);
                u11.o(2005980327);
                DsButtonColorScheme dsButtonColorScheme22 = dsButtonColorScheme3;
                function13 = function16;
                long color52 = (fromToken2 == null && fromToken2.getIsMulticolor()) ? C7807Z.f72259m : getColor(dto, dsButtonColorScheme22.getIconColor(), dto.getIconColor(), u11, i182);
                u11.k();
                color = getColor(dto, dsButtonColorScheme22.getDataBackgroundColor(), dto.getDataBackgroundColor(), u11, i182);
                e eVar52 = eVar4;
                long color62 = getColor(dto, dsButtonColorScheme22.getDataTextColor(), dto.getDataTextColor(), u11, i182);
                ButtonV3DTO.Sizes size22 = dto.getSize();
                ButtonV3DTO.Sizes sizes22 = ButtonV3DTO.Sizes.SIZE_400;
                T bodyControl400Small2 = size22 != sizes22 ? UniTheme.INSTANCE.getTypography().getBodyControl400Small() : UniTheme.INSTANCE.getTypography().getBodyControl500Medium();
                UniTheme uniTheme2 = UniTheme.INSTANCE;
                T compact400Small2 = uniTheme2.getTypography().getCompact400Small();
                T body400Small2 = dto.getSize() != sizes22 ? uniTheme2.getTypography().getBody400Small() : uniTheme2.getTypography().getBody500Medium();
                long m1681updateAlphaDxMtmZc5 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color32, d11);
                long m1681updateAlphaDxMtmZc22 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color42, d11);
                long m1681updateAlphaDxMtmZc32 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color52, d11);
                sizes = ButtonV3DTO.Sizes.SIZE_600;
                if (size != sizes) {
                    color = C7807Z.f72258l;
                }
                long j112 = color;
                long m1681updateAlphaDxMtmZc42 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color62, d11);
                float height2 = size.getHeight();
                Rounds round2 = dto.getRound();
                float cornerRadius2 = !(round2 == null ? round2.getRoundCorners() : UniGlobalConfigKt.getRoundCornersFlag(context2)) ? 99 : size.getCornerRadius();
                float dataCornerRadius2 = size.getDataCornerRadius();
                C9915y a122 = dto.getDataText() != null ? androidx.compose.foundation.layout.T.a(size.getHorizontalMargin(), 2, 0.0f) : androidx.compose.foundation.layout.T.b(size.getHorizontalMargin(), 0.0f, size.getDataMargin(), 0.0f, 10);
                float dataHorizontalPadding2 = size.getDataHorizontalPadding();
                float dataVerticalPadding2 = size.getDataVerticalPadding();
                DsButtonStyle dsButtonStyle2 = new DsButtonStyle(bodyControl400Small2, compact400Small2, body400Small2, color22, m1681updateAlphaDxMtmZc5, m1681updateAlphaDxMtmZc22, m1681updateAlphaDxMtmZc32, j112, m1681updateAlphaDxMtmZc42, height2, cornerRadius2, dataCornerRadius2, a122, new C9915y(dataHorizontalPadding2, dataVerticalPadding2, dataHorizontalPadding2, dataVerticalPadding2), TokenParserKt.tokenToGradient(dto.getBackgroundColor(), u11, 0), null);
                if (fromToken2 == null) {
                }
                if (size != sizes) {
                }
                DsButtonLocator dsButtonLocator2 = new DsButtonLocator(dto.getTestInfo(), null, 2, null);
                e testTag3 = AtomLocatorKt.testTag(AnalyticsModifierKt.viewAnalytics(eVar52, dto), dsButtonLocator2);
                e.a aVar2 = e.f40358c0;
                e testTag22 = AtomLocatorKt.testTag(aVar2, dsButtonLocator2.getTitle().invoke());
                e j122 = androidx.compose.foundation.layout.T.j(AtomLocatorKt.testTag(aVar2, dsButtonLocator2.getSubtitle().invoke()), 0.0f, 0.0f, 0.0f, DsSpacings.INSTANCE.m1847getDp2D9Ej5fM(), 7);
                String str3 = null;
                String title2 = dto.getTitle();
                String subtitle2 = dto.getSubtitle();
                String dataText2 = dto.getDataText();
                u11.o(2006065538);
                if (dto.getSubtitle() == null) {
                }
                z13 = false;
                a11 = G1.e.a(resId.intValue(), u11, 0);
                u11.k();
                Boolean isDisabled2 = dto.isDisabled();
                if (isDisabled2 == null) {
                }
                u11.o(2006073388);
                if (!z16) {
                }
                u11.k();
                Boolean isHoverDisabled2 = dto.isHoverDisabled();
                if (isHoverDisabled2 == null) {
                }
                a11yInfo = dto.getA11yInfo();
                if (a11yInfo != null) {
                }
                String str22 = str3;
                u11.o(2006090522);
                z14 = (i172 != 4 ? true : z13) | ((i192 & 7168) != 2048);
                C11 = u11.C();
                if (z14) {
                }
                function14 = function13;
                C11 = new DsButtonAtomKt$DsButtonAtom$3$1(dto, function14);
                u11.x(C11);
                u11.k();
                c3969l = u11;
                DsButtonKt.DsButton(title2, dsButtonStyle2, z17, testTag3, subtitle2, dataText2, a11, c11, z18, booleanValue, testTag22, j122, str22, null, (Function0) C11, c3969l, 0, 0, 8192);
                eVar3 = eVar52;
                z15 = z16;
                function15 = function14;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            z12 = z11;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            function12 = function1;
            if ((i13 & 1171) == 1170) {
            }
            if (i16 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            d11 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
            Context context22 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            styleType = dto.getStyleType();
            if (styleType == null) {
            }
            DsButtonColorScheme dsButtonColorScheme32 = toDsButtonColorScheme(styleType);
            if (!d11) {
            }
            size = dto.getSize();
            if (size == null) {
            }
            DrawableResource fromToken22 = DrawableResource.INSTANCE.fromToken(dto.getIcon());
            UniColorToken backgroundColor32 = dsButtonColorScheme32.getBackgroundColor();
            String backgroundColor222 = dto.getBackgroundColor();
            int i1722 = i13 & 14;
            int i1822 = i1722 | (UniColorToken.$stable << 3);
            long color222 = getColor(dto, backgroundColor32, backgroundColor222, u11, i1822);
            long color322 = getColor(dto, dsButtonColorScheme32.getTitleTextColor(), dto.getTitleColor(), u11, i1822);
            int i1922 = i13;
            long color422 = getColor(dto, dsButtonColorScheme32.getSubtitleTextColor(), dto.getSubtitleColor(), u11, i1822);
            u11.o(2005980327);
            DsButtonColorScheme dsButtonColorScheme222 = dsButtonColorScheme32;
            function13 = function16;
            long color522 = (fromToken22 == null && fromToken22.getIsMulticolor()) ? C7807Z.f72259m : getColor(dto, dsButtonColorScheme222.getIconColor(), dto.getIconColor(), u11, i1822);
            u11.k();
            color = getColor(dto, dsButtonColorScheme222.getDataBackgroundColor(), dto.getDataBackgroundColor(), u11, i1822);
            e eVar522 = eVar4;
            long color622 = getColor(dto, dsButtonColorScheme222.getDataTextColor(), dto.getDataTextColor(), u11, i1822);
            ButtonV3DTO.Sizes size222 = dto.getSize();
            ButtonV3DTO.Sizes sizes222 = ButtonV3DTO.Sizes.SIZE_400;
            T bodyControl400Small22 = size222 != sizes222 ? UniTheme.INSTANCE.getTypography().getBodyControl400Small() : UniTheme.INSTANCE.getTypography().getBodyControl500Medium();
            UniTheme uniTheme22 = UniTheme.INSTANCE;
            T compact400Small22 = uniTheme22.getTypography().getCompact400Small();
            T body400Small22 = dto.getSize() != sizes222 ? uniTheme22.getTypography().getBody400Small() : uniTheme22.getTypography().getBody500Medium();
            long m1681updateAlphaDxMtmZc52 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color322, d11);
            long m1681updateAlphaDxMtmZc222 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color422, d11);
            long m1681updateAlphaDxMtmZc322 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color522, d11);
            sizes = ButtonV3DTO.Sizes.SIZE_600;
            if (size != sizes) {
            }
            long j1122 = color;
            long m1681updateAlphaDxMtmZc422 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color622, d11);
            float height22 = size.getHeight();
            Rounds round22 = dto.getRound();
            float cornerRadius22 = !(round22 == null ? round22.getRoundCorners() : UniGlobalConfigKt.getRoundCornersFlag(context22)) ? 99 : size.getCornerRadius();
            float dataCornerRadius22 = size.getDataCornerRadius();
            C9915y a1222 = dto.getDataText() != null ? androidx.compose.foundation.layout.T.a(size.getHorizontalMargin(), 2, 0.0f) : androidx.compose.foundation.layout.T.b(size.getHorizontalMargin(), 0.0f, size.getDataMargin(), 0.0f, 10);
            float dataHorizontalPadding22 = size.getDataHorizontalPadding();
            float dataVerticalPadding22 = size.getDataVerticalPadding();
            DsButtonStyle dsButtonStyle22 = new DsButtonStyle(bodyControl400Small22, compact400Small22, body400Small22, color222, m1681updateAlphaDxMtmZc52, m1681updateAlphaDxMtmZc222, m1681updateAlphaDxMtmZc322, j1122, m1681updateAlphaDxMtmZc422, height22, cornerRadius22, dataCornerRadius22, a1222, new C9915y(dataHorizontalPadding22, dataVerticalPadding22, dataHorizontalPadding22, dataVerticalPadding22), TokenParserKt.tokenToGradient(dto.getBackgroundColor(), u11, 0), null);
            if (fromToken22 == null) {
            }
            if (size != sizes) {
            }
            DsButtonLocator dsButtonLocator22 = new DsButtonLocator(dto.getTestInfo(), null, 2, null);
            e testTag32 = AtomLocatorKt.testTag(AnalyticsModifierKt.viewAnalytics(eVar522, dto), dsButtonLocator22);
            e.a aVar22 = e.f40358c0;
            e testTag222 = AtomLocatorKt.testTag(aVar22, dsButtonLocator22.getTitle().invoke());
            e j1222 = androidx.compose.foundation.layout.T.j(AtomLocatorKt.testTag(aVar22, dsButtonLocator22.getSubtitle().invoke()), 0.0f, 0.0f, 0.0f, DsSpacings.INSTANCE.m1847getDp2D9Ej5fM(), 7);
            String str32 = null;
            String title22 = dto.getTitle();
            String subtitle22 = dto.getSubtitle();
            String dataText22 = dto.getDataText();
            u11.o(2006065538);
            if (dto.getSubtitle() == null) {
            }
            z13 = false;
            a11 = G1.e.a(resId.intValue(), u11, 0);
            u11.k();
            Boolean isDisabled22 = dto.isDisabled();
            if (isDisabled22 == null) {
            }
            u11.o(2006073388);
            if (!z16) {
            }
            u11.k();
            Boolean isHoverDisabled22 = dto.isHoverDisabled();
            if (isHoverDisabled22 == null) {
            }
            a11yInfo = dto.getA11yInfo();
            if (a11yInfo != null) {
            }
            String str222 = str32;
            u11.o(2006090522);
            z14 = (i1722 != 4 ? true : z13) | ((i1922 & 7168) != 2048);
            C11 = u11.C();
            if (z14) {
            }
            function14 = function13;
            C11 = new DsButtonAtomKt$DsButtonAtom$3$1(dto, function14);
            u11.x(C11);
            u11.k();
            c3969l = u11;
            DsButtonKt.DsButton(title22, dsButtonStyle22, z17, testTag32, subtitle22, dataText22, a11, c11, z18, booleanValue, testTag222, j1222, str222, null, (Function0) C11, c3969l, 0, 0, 8192);
            eVar3 = eVar522;
            z15 = z16;
            function15 = function14;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        z12 = z11;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        function12 = function1;
        if ((i13 & 1171) == 1170) {
        }
        if (i16 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        d11 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
        Context context222 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
        styleType = dto.getStyleType();
        if (styleType == null) {
        }
        DsButtonColorScheme dsButtonColorScheme322 = toDsButtonColorScheme(styleType);
        if (!d11) {
        }
        size = dto.getSize();
        if (size == null) {
        }
        DrawableResource fromToken222 = DrawableResource.INSTANCE.fromToken(dto.getIcon());
        UniColorToken backgroundColor322 = dsButtonColorScheme322.getBackgroundColor();
        String backgroundColor2222 = dto.getBackgroundColor();
        int i17222 = i13 & 14;
        int i18222 = i17222 | (UniColorToken.$stable << 3);
        long color2222 = getColor(dto, backgroundColor322, backgroundColor2222, u11, i18222);
        long color3222 = getColor(dto, dsButtonColorScheme322.getTitleTextColor(), dto.getTitleColor(), u11, i18222);
        int i19222 = i13;
        long color4222 = getColor(dto, dsButtonColorScheme322.getSubtitleTextColor(), dto.getSubtitleColor(), u11, i18222);
        u11.o(2005980327);
        DsButtonColorScheme dsButtonColorScheme2222 = dsButtonColorScheme322;
        function13 = function16;
        long color5222 = (fromToken222 == null && fromToken222.getIsMulticolor()) ? C7807Z.f72259m : getColor(dto, dsButtonColorScheme2222.getIconColor(), dto.getIconColor(), u11, i18222);
        u11.k();
        color = getColor(dto, dsButtonColorScheme2222.getDataBackgroundColor(), dto.getDataBackgroundColor(), u11, i18222);
        e eVar5222 = eVar4;
        long color6222 = getColor(dto, dsButtonColorScheme2222.getDataTextColor(), dto.getDataTextColor(), u11, i18222);
        ButtonV3DTO.Sizes size2222 = dto.getSize();
        ButtonV3DTO.Sizes sizes2222 = ButtonV3DTO.Sizes.SIZE_400;
        T bodyControl400Small222 = size2222 != sizes2222 ? UniTheme.INSTANCE.getTypography().getBodyControl400Small() : UniTheme.INSTANCE.getTypography().getBodyControl500Medium();
        UniTheme uniTheme222 = UniTheme.INSTANCE;
        T compact400Small222 = uniTheme222.getTypography().getCompact400Small();
        T body400Small222 = dto.getSize() != sizes2222 ? uniTheme222.getTypography().getBody400Small() : uniTheme222.getTypography().getBody500Medium();
        long m1681updateAlphaDxMtmZc522 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color3222, d11);
        long m1681updateAlphaDxMtmZc2222 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color4222, d11);
        long m1681updateAlphaDxMtmZc3222 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color5222, d11);
        sizes = ButtonV3DTO.Sizes.SIZE_600;
        if (size != sizes) {
        }
        long j11222 = color;
        long m1681updateAlphaDxMtmZc4222 = ButtonUtilsKt.m1681updateAlphaDxMtmZc(color6222, d11);
        float height222 = size.getHeight();
        Rounds round222 = dto.getRound();
        float cornerRadius222 = !(round222 == null ? round222.getRoundCorners() : UniGlobalConfigKt.getRoundCornersFlag(context222)) ? 99 : size.getCornerRadius();
        float dataCornerRadius222 = size.getDataCornerRadius();
        C9915y a12222 = dto.getDataText() != null ? androidx.compose.foundation.layout.T.a(size.getHorizontalMargin(), 2, 0.0f) : androidx.compose.foundation.layout.T.b(size.getHorizontalMargin(), 0.0f, size.getDataMargin(), 0.0f, 10);
        float dataHorizontalPadding222 = size.getDataHorizontalPadding();
        float dataVerticalPadding222 = size.getDataVerticalPadding();
        DsButtonStyle dsButtonStyle222 = new DsButtonStyle(bodyControl400Small222, compact400Small222, body400Small222, color2222, m1681updateAlphaDxMtmZc522, m1681updateAlphaDxMtmZc2222, m1681updateAlphaDxMtmZc3222, j11222, m1681updateAlphaDxMtmZc4222, height222, cornerRadius222, dataCornerRadius222, a12222, new C9915y(dataHorizontalPadding222, dataVerticalPadding222, dataHorizontalPadding222, dataVerticalPadding222), TokenParserKt.tokenToGradient(dto.getBackgroundColor(), u11, 0), null);
        if (fromToken222 == null) {
        }
        if (size != sizes) {
        }
        DsButtonLocator dsButtonLocator222 = new DsButtonLocator(dto.getTestInfo(), null, 2, null);
        e testTag322 = AtomLocatorKt.testTag(AnalyticsModifierKt.viewAnalytics(eVar5222, dto), dsButtonLocator222);
        e.a aVar222 = e.f40358c0;
        e testTag2222 = AtomLocatorKt.testTag(aVar222, dsButtonLocator222.getTitle().invoke());
        e j12222 = androidx.compose.foundation.layout.T.j(AtomLocatorKt.testTag(aVar222, dsButtonLocator222.getSubtitle().invoke()), 0.0f, 0.0f, 0.0f, DsSpacings.INSTANCE.m1847getDp2D9Ej5fM(), 7);
        String str322 = null;
        String title222 = dto.getTitle();
        String subtitle222 = dto.getSubtitle();
        String dataText222 = dto.getDataText();
        u11.o(2006065538);
        if (dto.getSubtitle() == null) {
        }
        z13 = false;
        a11 = G1.e.a(resId.intValue(), u11, 0);
        u11.k();
        Boolean isDisabled222 = dto.isDisabled();
        if (isDisabled222 == null) {
        }
        u11.o(2006073388);
        if (!z16) {
        }
        u11.k();
        Boolean isHoverDisabled222 = dto.isHoverDisabled();
        if (isHoverDisabled222 == null) {
        }
        a11yInfo = dto.getA11yInfo();
        if (a11yInfo != null) {
        }
        String str2222 = str322;
        u11.o(2006090522);
        z14 = (i17222 != 4 ? true : z13) | ((i19222 & 7168) != 2048);
        C11 = u11.C();
        if (z14) {
        }
        function14 = function13;
        C11 = new DsButtonAtomKt$DsButtonAtom$3$1(dto, function14);
        u11.x(C11);
        u11.k();
        c3969l = u11;
        DsButtonKt.DsButton(title222, dsButtonStyle222, z17, testTag322, subtitle222, dataText222, a11, c11, z18, booleanValue, testTag2222, j12222, str2222, null, (Function0) C11, c3969l, 0, 0, 8192);
        eVar3 = eVar5222;
        z15 = z16;
        function15 = function14;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    private static final long getColor(ButtonV3DTO buttonV3DTO, UniColorToken uniColorToken, String str, InterfaceC3967k interfaceC3967k, int i11) {
        long themedColor;
        interfaceC3967k.o(-518582223);
        if (buttonV3DTO.getStyleType() != ButtonV3DTO.StyleTypes.CUSTOM) {
            interfaceC3967k.o(1137294281);
            themedColor = UniCompositionLocalKt.getThemedColor(uniColorToken, interfaceC3967k, UniColorToken.$stable | ((i11 >> 3) & 14));
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(1137338859);
            C7807Z c7807z = TokenParserKt.tokenToColor(str, interfaceC3967k, (i11 >> 6) & 14);
            themedColor = c7807z == null ? UniCompositionLocalKt.getThemedColor(uniColorToken, interfaceC3967k, UniColorToken.$stable | ((i11 >> 3) & 14)) : c7807z.w();
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return themedColor;
    }

    private static final DsButtonColorScheme toDsButtonColorScheme(ButtonV3DTO.StyleTypes styleTypes) {
        switch (WhenMappings.$EnumSwitchMapping$0[styleTypes.ordinal()]) {
            case 1:
                return DsButtonColorScheme.ActionPrimary.INSTANCE;
            case 2:
                return DsButtonColorScheme.ActionSecondary.INSTANCE;
            case 3:
                return DsButtonColorScheme.AccentPrimary.INSTANCE;
            case 4:
                return DsButtonColorScheme.AccentSecondary.INSTANCE;
            case 5:
                return DsButtonColorScheme.Negative.INSTANCE;
            case 6:
                return DsButtonColorScheme.NeutralSecondary.INSTANCE;
            case 7:
                return DsButtonColorScheme.ActionPrimary.INSTANCE;
            default:
                throw new o();
        }
    }
}
