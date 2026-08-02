package ru.ozon.uni.android.ds.compose.component.button;

import A0.g;
import A0.h;
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
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonColorScheme;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.models.UniColorToken;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aM\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\r\u001a\u001b\u0010\u0012\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a)\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "", "loading", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "DsIconButtonAtom", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;LS0/k;II)V", "containerModifier", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Landroidx/compose/ui/e;Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;LS0/k;II)V", "Ll1/Z;", "enabled", "updateAlphaIfDisabled-DxMtmZc", "(JZ)J", "updateAlphaIfDisabled", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme;", "toDsIconButtonColorScheme", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;)Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme;", "Lru/ozon/uni/core/models/UniColorToken;", "colorToken", "", "colorString", "getColor", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/core/models/UniColorToken;Ljava/lang/String;LS0/k;I)J", "Ll1/Q;", "getBrush", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;LS0/k;I)Ll1/Q;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsIconButtonAtomKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3DTO.StyleTypes.values().length];
            try {
                iArr[ButtonV3DTO.StyleTypes.NEUTRAL_SECONDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.ACTION_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.ACTION_SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.ACCENT_PRIMARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.ACCENT_SECONDARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.NEGATIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonV3DTO.StyleTypes.CUSTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void DsIconButtonAtom(@NotNull IconButtonV3DTO dto, e eVar, boolean z11, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        interfaceC3967k.o(4257417);
        if ((i12 & 2) != 0) {
            eVar = e.f40358c0;
        }
        e eVar2 = eVar;
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        if ((i12 & 8) != 0) {
            function1 = null;
        }
        int i13 = i11 << 3;
        DsIconButtonAtom(dto, eVar2, e.f40358c0, z12, function1, interfaceC3967k, (i11 & 14) | 384 | (i11 & 112) | (i13 & 7168) | (i13 & 57344), 0);
        interfaceC3967k.k();
    }

    private static final AbstractC7799Q getBrush(IconButtonV3DTO iconButtonV3DTO, InterfaceC3967k interfaceC3967k, int i11) {
        String backgroundColor;
        interfaceC3967k.o(1673222112);
        AbstractC7799Q abstractC7799Q = null;
        if (iconButtonV3DTO.getStyleType() == ButtonV3DTO.StyleTypes.CUSTOM && (backgroundColor = iconButtonV3DTO.getBackgroundColor()) != null) {
            abstractC7799Q = TokenParserKt.tokenToGradient(backgroundColor, interfaceC3967k, 0);
        }
        interfaceC3967k.k();
        return abstractC7799Q;
    }

    private static final long getColor(IconButtonV3DTO iconButtonV3DTO, UniColorToken uniColorToken, String str, InterfaceC3967k interfaceC3967k, int i11) {
        long themedColor;
        interfaceC3967k.o(-2131225857);
        if (iconButtonV3DTO.getStyleType() != ButtonV3DTO.StyleTypes.CUSTOM) {
            interfaceC3967k.o(1136685937);
            themedColor = UniCompositionLocalKt.getThemedColor(uniColorToken, interfaceC3967k, UniColorToken.$stable | ((i11 >> 3) & 14));
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(1136722579);
            C7807Z c7807z = TokenParserKt.tokenToColor(str, interfaceC3967k, (i11 >> 6) & 14);
            themedColor = c7807z == null ? UniCompositionLocalKt.getThemedColor(uniColorToken, interfaceC3967k, UniColorToken.$stable | ((i11 >> 3) & 14)) : c7807z.w();
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return themedColor;
    }

    private static final DsIconButtonColorScheme toDsIconButtonColorScheme(ButtonV3DTO.StyleTypes styleTypes) {
        switch (WhenMappings.$EnumSwitchMapping$0[styleTypes.ordinal()]) {
            case 1:
            case 2:
                return DsIconButtonColorScheme.ActionPrimary.INSTANCE;
            case 3:
                return DsIconButtonColorScheme.ActionSecondary.INSTANCE;
            case 4:
                return DsIconButtonColorScheme.AccentPrimary.INSTANCE;
            case 5:
                return DsIconButtonColorScheme.AccentSecondary.INSTANCE;
            case 6:
                return DsIconButtonColorScheme.Negative.INSTANCE;
            case 7:
                return DsIconButtonColorScheme.ActionPrimary.INSTANCE;
            default:
                throw new o();
        }
    }

    /* renamed from: updateAlphaIfDisabled-DxMtmZc, reason: not valid java name */
    private static final long m1691updateAlphaIfDisabledDxMtmZc(long j11, boolean z11) {
        return !z11 ? C7807Z.o(C7807Z.q(j11) * 0.4f, j11) : j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsIconButtonAtom(@NotNull IconButtonV3DTO dto, e eVar, e eVar2, boolean z11, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar3;
        int i14;
        e eVar4;
        int i15;
        boolean z12;
        int i16;
        Function1<? super AtomAction, Unit> function12;
        boolean d11;
        ButtonV3DTO.StyleTypes styleType;
        DsIconButtonColorScheme dsIconButtonColorScheme;
        IconButtonV3DTO.Sizes size;
        DrawableResource fromToken;
        DrawableResource drawableResource;
        long m1691updateAlphaIfDisabledDxMtmZc;
        Integer resId;
        C3969l c3969l;
        e eVar5;
        Function1<? super AtomAction, Unit> function13;
        e eVar6;
        e eVar7;
        boolean z13;
        Function1<? super AtomAction, Unit> function14;
        g b11;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(2108122774);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i17 = i12 & 2;
        if (i17 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar3 = eVar;
            i13 |= u11.n(eVar3) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                eVar4 = eVar2;
                i13 |= u11.n(eVar4) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    z12 = z11;
                    i13 |= u11.p(z12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i16 = i12 & 16;
                    if (i16 == 0) {
                        i13 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        function12 = function1;
                        i13 |= u11.F(function12) ? 16384 : 8192;
                        if ((i13 & 9363) != 9362 && u11.b()) {
                            u11.j();
                            c3969l = u11;
                            eVar6 = eVar3;
                            eVar7 = eVar4;
                            z13 = z12;
                            function14 = function12;
                        } else {
                            e eVar8 = i17 != 0 ? e.f40358c0 : eVar3;
                            if (i14 != 0) {
                                eVar4 = e.f40358c0;
                            }
                            boolean z14 = i15 != 0 ? false : z12;
                            Function1<? super AtomAction, Unit> function15 = i16 != 0 ? null : function12;
                            e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar8, dto);
                            d11 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
                            styleType = dto.getStyleType();
                            if (styleType == null) {
                                styleType = ButtonV3DTO.StyleTypes.ACTION_PRIMARY;
                            }
                            dsIconButtonColorScheme = toDsIconButtonColorScheme(styleType);
                            if (!d11) {
                                dsIconButtonColorScheme = DsIconButtonColorScheme.Disabled.INSTANCE;
                            }
                            size = dto.getSize();
                            if (size == null) {
                                size = IconButtonV3DTO.Sizes.SIZE_400;
                            }
                            fromToken = DrawableResource.INSTANCE.fromToken(dto.getIcon());
                            UniColorToken backgroundColor = dsIconButtonColorScheme.getBackgroundColor();
                            String backgroundColor2 = dto.getBackgroundColor();
                            int i18 = i13 & 14;
                            int i19 = i18 | (UniColorToken.$stable << 3);
                            long color = getColor(dto, backgroundColor, backgroundColor2, u11, i19);
                            u11.o(407345519);
                            if (fromToken == null && fromToken.getIsMulticolor()) {
                                m1691updateAlphaIfDisabledDxMtmZc = C7807Z.f72259m;
                                drawableResource = fromToken;
                            } else {
                                drawableResource = fromToken;
                                m1691updateAlphaIfDisabledDxMtmZc = m1691updateAlphaIfDisabledDxMtmZc(getColor(dto, dsIconButtonColorScheme.getIconColor(), dto.getIconColor(), u11, i19), d11);
                            }
                            long j11 = m1691updateAlphaIfDisabledDxMtmZc;
                            u11.k();
                            DsIconButtonStyle dsIconButtonStyle = new DsIconButtonStyle(color, j11, size.getSize(), size.getCornerRadius(), TokenParserKt.tokenToGradient(dto.getIconColor(), u11, 0), getBrush(dto, u11, i18), null);
                            u11.o(407358223);
                            resId = drawableResource == null ? null : drawableResource.getResId((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
                            u11.k();
                            DsIconButtonLocator dsIconButtonLocator = new DsIconButtonLocator(dto.getTestInfo(), null, 2, null);
                            if (resId != null) {
                                e testTag = AtomLocatorKt.testTag(viewAnalytics, dsIconButtonLocator);
                                AbstractC8972b a11 = G1.e.a(resId.intValue(), u11, 0);
                                IconButtonV3DTO.IconButtonShape buttonShape = dto.getButtonShape();
                                u11.o(407368394);
                                if (buttonShape != IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE && buttonShape != null) {
                                    if (buttonShape == IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE) {
                                        b11 = h.e();
                                    } else {
                                        if (buttonShape != IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE_FORCE) {
                                            throw new o();
                                        }
                                        b11 = h.b(dsIconButtonStyle.getCornerRadius());
                                    }
                                } else if (UniGlobalConfigKt.getRoundCornersFlag((Context) u11.m(AndroidCompositionLocals_androidKt.d()))) {
                                    b11 = h.e();
                                } else {
                                    b11 = h.b(dsIconButtonStyle.getCornerRadius());
                                }
                                u11.k();
                                e testTag2 = AtomLocatorKt.testTag(e.f40358c0, dsIconButtonLocator.getIcon().invoke());
                                Boolean isDisabled = dto.isDisabled();
                                boolean z15 = isDisabled == null || !isDisabled.booleanValue();
                                u11.o(407388185);
                                C4912a c11 = z14 ? c.c(2031232265, new DsIconButtonAtomKt$DsIconButtonAtom$1(size, dsIconButtonStyle), u11) : null;
                                u11.k();
                                Boolean isHoverDisabled = dto.isHoverDisabled();
                                boolean booleanValue = isHoverDisabled != null ? isHoverDisabled.booleanValue() : false;
                                int i21 = i13;
                                u11.o(407406947);
                                boolean z16 = (i18 == 4) | ((i21 & 57344) == 16384);
                                Object C11 = u11.C();
                                if (z16 || C11 == InterfaceC3967k.a.a()) {
                                    C11 = new DsIconButtonAtomKt$DsIconButtonAtom$2$1(dto, function15);
                                    u11.x(C11);
                                }
                                u11.k();
                                int i22 = (i21 << 9) & 458752;
                                g gVar = b11;
                                eVar5 = eVar4;
                                c3969l = u11;
                                function13 = function15;
                                DsIconButtonKt.DsIconButton(a11, dsIconButtonStyle, gVar, testTag, testTag2, eVar5, z15, c11, booleanValue, null, (Function0) C11, c3969l, i22, 0, UserVerificationMethods.USER_VERIFY_NONE);
                            } else {
                                c3969l = u11;
                                eVar5 = eVar4;
                                function13 = function15;
                            }
                            eVar6 = eVar8;
                            eVar7 = eVar5;
                            z13 = z14;
                            function14 = function13;
                        }
                        m02 = c3969l.m0();
                        if (m02 != null) {
                            m02.G(new DsIconButtonAtomKt$DsIconButtonAtom$3(dto, eVar6, eVar7, z13, function14, i11, i12));
                            return;
                        }
                        return;
                    }
                    function12 = function1;
                    if ((i13 & 9363) != 9362) {
                    }
                    if (i17 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar8, dto);
                    d11 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
                    styleType = dto.getStyleType();
                    if (styleType == null) {
                    }
                    dsIconButtonColorScheme = toDsIconButtonColorScheme(styleType);
                    if (!d11) {
                    }
                    size = dto.getSize();
                    if (size == null) {
                    }
                    fromToken = DrawableResource.INSTANCE.fromToken(dto.getIcon());
                    UniColorToken backgroundColor3 = dsIconButtonColorScheme.getBackgroundColor();
                    String backgroundColor22 = dto.getBackgroundColor();
                    int i182 = i13 & 14;
                    int i192 = i182 | (UniColorToken.$stable << 3);
                    long color2 = getColor(dto, backgroundColor3, backgroundColor22, u11, i192);
                    u11.o(407345519);
                    if (fromToken == null) {
                    }
                    drawableResource = fromToken;
                    m1691updateAlphaIfDisabledDxMtmZc = m1691updateAlphaIfDisabledDxMtmZc(getColor(dto, dsIconButtonColorScheme.getIconColor(), dto.getIconColor(), u11, i192), d11);
                    long j112 = m1691updateAlphaIfDisabledDxMtmZc;
                    u11.k();
                    DsIconButtonStyle dsIconButtonStyle2 = new DsIconButtonStyle(color2, j112, size.getSize(), size.getCornerRadius(), TokenParserKt.tokenToGradient(dto.getIconColor(), u11, 0), getBrush(dto, u11, i182), null);
                    u11.o(407358223);
                    if (drawableResource == null) {
                    }
                    u11.k();
                    DsIconButtonLocator dsIconButtonLocator2 = new DsIconButtonLocator(dto.getTestInfo(), null, 2, null);
                    if (resId != null) {
                    }
                    eVar6 = eVar8;
                    eVar7 = eVar5;
                    z13 = z14;
                    function14 = function13;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                z12 = z11;
                i16 = i12 & 16;
                if (i16 == 0) {
                }
                function12 = function1;
                if ((i13 & 9363) != 9362) {
                }
                if (i17 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                e viewAnalytics22 = AnalyticsModifierKt.viewAnalytics(eVar8, dto);
                d11 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
                styleType = dto.getStyleType();
                if (styleType == null) {
                }
                dsIconButtonColorScheme = toDsIconButtonColorScheme(styleType);
                if (!d11) {
                }
                size = dto.getSize();
                if (size == null) {
                }
                fromToken = DrawableResource.INSTANCE.fromToken(dto.getIcon());
                UniColorToken backgroundColor32 = dsIconButtonColorScheme.getBackgroundColor();
                String backgroundColor222 = dto.getBackgroundColor();
                int i1822 = i13 & 14;
                int i1922 = i1822 | (UniColorToken.$stable << 3);
                long color22 = getColor(dto, backgroundColor32, backgroundColor222, u11, i1922);
                u11.o(407345519);
                if (fromToken == null) {
                }
                drawableResource = fromToken;
                m1691updateAlphaIfDisabledDxMtmZc = m1691updateAlphaIfDisabledDxMtmZc(getColor(dto, dsIconButtonColorScheme.getIconColor(), dto.getIconColor(), u11, i1922), d11);
                long j1122 = m1691updateAlphaIfDisabledDxMtmZc;
                u11.k();
                DsIconButtonStyle dsIconButtonStyle22 = new DsIconButtonStyle(color22, j1122, size.getSize(), size.getCornerRadius(), TokenParserKt.tokenToGradient(dto.getIconColor(), u11, 0), getBrush(dto, u11, i1822), null);
                u11.o(407358223);
                if (drawableResource == null) {
                }
                u11.k();
                DsIconButtonLocator dsIconButtonLocator22 = new DsIconButtonLocator(dto.getTestInfo(), null, 2, null);
                if (resId != null) {
                }
                eVar6 = eVar8;
                eVar7 = eVar5;
                z13 = z14;
                function14 = function13;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            eVar4 = eVar2;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            z12 = z11;
            i16 = i12 & 16;
            if (i16 == 0) {
            }
            function12 = function1;
            if ((i13 & 9363) != 9362) {
            }
            if (i17 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            e viewAnalytics222 = AnalyticsModifierKt.viewAnalytics(eVar8, dto);
            d11 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
            styleType = dto.getStyleType();
            if (styleType == null) {
            }
            dsIconButtonColorScheme = toDsIconButtonColorScheme(styleType);
            if (!d11) {
            }
            size = dto.getSize();
            if (size == null) {
            }
            fromToken = DrawableResource.INSTANCE.fromToken(dto.getIcon());
            UniColorToken backgroundColor322 = dsIconButtonColorScheme.getBackgroundColor();
            String backgroundColor2222 = dto.getBackgroundColor();
            int i18222 = i13 & 14;
            int i19222 = i18222 | (UniColorToken.$stable << 3);
            long color222 = getColor(dto, backgroundColor322, backgroundColor2222, u11, i19222);
            u11.o(407345519);
            if (fromToken == null) {
            }
            drawableResource = fromToken;
            m1691updateAlphaIfDisabledDxMtmZc = m1691updateAlphaIfDisabledDxMtmZc(getColor(dto, dsIconButtonColorScheme.getIconColor(), dto.getIconColor(), u11, i19222), d11);
            long j11222 = m1691updateAlphaIfDisabledDxMtmZc;
            u11.k();
            DsIconButtonStyle dsIconButtonStyle222 = new DsIconButtonStyle(color222, j11222, size.getSize(), size.getCornerRadius(), TokenParserKt.tokenToGradient(dto.getIconColor(), u11, 0), getBrush(dto, u11, i18222), null);
            u11.o(407358223);
            if (drawableResource == null) {
            }
            u11.k();
            DsIconButtonLocator dsIconButtonLocator222 = new DsIconButtonLocator(dto.getTestInfo(), null, 2, null);
            if (resId != null) {
            }
            eVar6 = eVar8;
            eVar7 = eVar5;
            z13 = z14;
            function14 = function13;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar3 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        eVar4 = eVar2;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        z12 = z11;
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        function12 = function1;
        if ((i13 & 9363) != 9362) {
        }
        if (i17 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        e viewAnalytics2222 = AnalyticsModifierKt.viewAnalytics(eVar8, dto);
        d11 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
        styleType = dto.getStyleType();
        if (styleType == null) {
        }
        dsIconButtonColorScheme = toDsIconButtonColorScheme(styleType);
        if (!d11) {
        }
        size = dto.getSize();
        if (size == null) {
        }
        fromToken = DrawableResource.INSTANCE.fromToken(dto.getIcon());
        UniColorToken backgroundColor3222 = dsIconButtonColorScheme.getBackgroundColor();
        String backgroundColor22222 = dto.getBackgroundColor();
        int i182222 = i13 & 14;
        int i192222 = i182222 | (UniColorToken.$stable << 3);
        long color2222 = getColor(dto, backgroundColor3222, backgroundColor22222, u11, i192222);
        u11.o(407345519);
        if (fromToken == null) {
        }
        drawableResource = fromToken;
        m1691updateAlphaIfDisabledDxMtmZc = m1691updateAlphaIfDisabledDxMtmZc(getColor(dto, dsIconButtonColorScheme.getIconColor(), dto.getIconColor(), u11, i192222), d11);
        long j112222 = m1691updateAlphaIfDisabledDxMtmZc;
        u11.k();
        DsIconButtonStyle dsIconButtonStyle2222 = new DsIconButtonStyle(color2222, j112222, size.getSize(), size.getCornerRadius(), TokenParserKt.tokenToGradient(dto.getIconColor(), u11, 0), getBrush(dto, u11, i182222), null);
        u11.o(407358223);
        if (drawableResource == null) {
        }
        u11.k();
        DsIconButtonLocator dsIconButtonLocator2222 = new DsIconButtonLocator(dto.getTestInfo(), null, 2, null);
        if (resId != null) {
        }
        eVar6 = eVar8;
        eVar7 = eVar5;
        z13 = z14;
        function14 = function13;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
