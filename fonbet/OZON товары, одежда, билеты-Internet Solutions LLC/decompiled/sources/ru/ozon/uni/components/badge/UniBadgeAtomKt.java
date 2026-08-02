package ru.ozon.uni.components.badge;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt$toOnClickLambda$1$1;
import ru.ozon.uni.android.ds.compose.util.GradientExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.A11yInfo;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.components.badge.UniBadgeStyle;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;
import ru.ozon.uni.utils.UniTestInfoTestTagKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\f\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u0010\u001a\u0015\u0010\f\u001a\u00020\u000f*\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0004\b\f\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "UniBadgeAtom", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "Lru/ozon/uni/components/badge/UniBadgeSize;", "mapToVo", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;)Lru/ozon/uni/components/badge/UniBadgeSize;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;)Lru/ozon/uni/components/badge/UniBadgeStyle;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomStyle;LS0/k;I)Lru/ozon/uni/components/badge/UniBadgeStyle;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomBackground;", "Ll1/Q;", "toBackgroundBrush", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$CustomBackground;LS0/k;I)Ll1/Q;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniBadgeAtomKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BadgeDTO.BadgeSize.values().length];
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BadgeDTO.Style.values().length];
            try {
                iArr2[BadgeDTO.Style.NEUTRAL_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BadgeDTO.Style.NEUTRAL_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BadgeDTO.Style.NEUTRAL_TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BadgeDTO.Style.NEUTRAL_STATIC_PRIMARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BadgeDTO.Style.WARNING_PRIMARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BadgeDTO.Style.WARNING_SECONDARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[BadgeDTO.Style.NEGATIVE_PRIMARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[BadgeDTO.Style.NEGATIVE_SECONDARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[BadgeDTO.Style.POSITIVE_PRIMARY.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[BadgeDTO.Style.POSITIVE_SECONDARY.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[BadgeDTO.Style.ACTION_PRIMARY.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[BadgeDTO.Style.ACTION_SECONDARY.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniBadgeAtom(@NotNull BadgeDTO dto, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super AtomAction, Unit> function12;
        e eVar3;
        Function1<? super AtomAction, Unit> function13;
        e viewAnalytics;
        boolean z11;
        String text;
        FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$1;
        TestInfo testInfo;
        UniBadgeStyle mapToVo;
        BadgeDTO.BadgeSize size;
        UniBadgeSize uniBadgeSize;
        boolean booleanValue;
        float f7;
        e eVar4;
        UniBadgeStraightCorners uniBadgeStraightCorners;
        String combinedLabel;
        Function1<? super AtomAction, Unit> function14;
        e eVar5;
        BadgeDTO.StraightCorners straightCorners;
        boolean z12;
        AtomAction atomAction;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(-426154706);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
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
                    eVar3 = i15 != 0 ? e.f40358c0 : eVar2;
                    if (i14 != 0) {
                        u11.o(-2071949934);
                        Object C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = UniBadgeAtomKt$UniBadgeAtom$1$1.INSTANCE;
                            u11.x(C11);
                        }
                        function13 = (Function1) C11;
                        u11.k();
                    } else {
                        function13 = function12;
                    }
                    viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
                    Rounds round = dto.getRound();
                    Boolean valueOf = round != null ? Boolean.valueOf(round.getRoundCorners()) : null;
                    u11.o(-2071946896);
                    boolean roundCornersFlag = valueOf == null ? UniGlobalConfigKt.getRoundCornersFlag((Context) u11.m(AndroidCompositionLocals_androidKt.d())) : valueOf.booleanValue();
                    u11.k();
                    z11 = roundCornersFlag;
                    text = dto.getText();
                    CommonControlSettings common = dto.getCommon();
                    foundationMapperKt$toOnClickLambda$1$1 = (common != null || (atomAction = common.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction);
                    u11.o(-2071941218);
                    testInfo = dto.getTestInfo();
                    if (testInfo != null) {
                        viewAnalytics = UniTestInfoTestTagKt.uniTestTag(viewAnalytics, testInfo, u11, 0);
                    }
                    u11.k();
                    String leftIcon = dto.getLeftIcon();
                    UniIconToken byId = leftIcon != null ? UniTheme.INSTANCE.getIconTokens().getById(leftIcon) : null;
                    u11.o(-2071937388);
                    AbstractC8972b icon = byId == null ? null : TokensExtKt.getIcon(byId, u11, UniIconToken.$stable);
                    u11.k();
                    u11.o(-2071936455);
                    mapToVo = dto.getBadgeStyle() == BadgeDTO.Style.CUSTOM ? mapToVo(dto.getCustomBadgeStyle(), u11, 0) : mapToVo(dto.getBadgeStyle());
                    u11.k();
                    size = dto.getSize();
                    if (size != null || (uniBadgeSize = mapToVo(size)) == null) {
                        uniBadgeSize = UniBadgeSize.Size500;
                    }
                    Boolean hideDisclosure = dto.getHideDisclosure();
                    booleanValue = hideDisclosure != null ? hideDisclosure.booleanValue() : false;
                    f7 = z11 ? 99 : Float.NaN;
                    if (z11 && (straightCorners = dto.getStraightCorners()) != null && straightCorners.getIsNonDefault()) {
                        Boolean topLeft = dto.getStraightCorners().getTopLeft();
                        boolean booleanValue2 = topLeft != null ? topLeft.booleanValue() : false;
                        Boolean topRight = dto.getStraightCorners().getTopRight();
                        boolean booleanValue3 = topRight != null ? topRight.booleanValue() : false;
                        Boolean bottomLeft = dto.getStraightCorners().getBottomLeft();
                        if (bottomLeft != null) {
                            eVar4 = eVar3;
                            z12 = bottomLeft.booleanValue();
                        } else {
                            eVar4 = eVar3;
                            z12 = false;
                        }
                        Boolean bottomRight = dto.getStraightCorners().getBottomRight();
                        uniBadgeStraightCorners = new UniBadgeStraightCorners(booleanValue2, booleanValue3, z12, bottomRight != null ? bottomRight.booleanValue() : false);
                    } else {
                        eVar4 = eVar3;
                        uniBadgeStraightCorners = null;
                    }
                    A11yInfo a11yInfo = dto.getA11yInfo();
                    combinedLabel = a11yInfo != null ? a11yInfo.getCombinedLabel() : null;
                    if (text == null || icon == null) {
                        UniBadgeSize uniBadgeSize2 = uniBadgeSize;
                        UniBadgeStraightCorners uniBadgeStraightCorners2 = uniBadgeStraightCorners;
                        FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$12 = foundationMapperKt$toOnClickLambda$1$1;
                        UniBadgeStyle uniBadgeStyle = mapToVo;
                        e eVar6 = viewAnalytics;
                        boolean z13 = booleanValue;
                        float f11 = f7;
                        String str = combinedLabel;
                        if (text != null) {
                            u11.o(195762303);
                            UniBadgeKt.m1871UniBadgeWu8B24Y(text, foundationMapperKt$toOnClickLambda$1$12, eVar6, icon, uniBadgeStyle, false, uniBadgeSize2, z13, f11, uniBadgeStraightCorners2, str, u11, 0, 0, 32);
                            u11 = u11;
                            u11.k();
                        } else {
                            u11.o(196149586);
                            u11.k();
                        }
                    } else {
                        u11.o(195362744);
                        UniBadgeKt.m1870UniBadgeV95POc(icon, foundationMapperKt$toOnClickLambda$1$1, viewAnalytics, mapToVo, uniBadgeSize, booleanValue, f7, uniBadgeStraightCorners, combinedLabel, u11, 0, 0);
                        u11.k();
                    }
                    function14 = function13;
                    eVar5 = eVar4;
                } else {
                    u11.j();
                    eVar5 = eVar2;
                    function14 = function12;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new UniBadgeAtomKt$UniBadgeAtom$2(dto, eVar5, function14, i11, i12));
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i13 & 147) == 146) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
            Rounds round2 = dto.getRound();
            if (round2 != null) {
            }
            u11.o(-2071946896);
            if (valueOf == null) {
            }
            u11.k();
            z11 = roundCornersFlag;
            text = dto.getText();
            CommonControlSettings common2 = dto.getCommon();
            if (common2 != null) {
            }
            u11.o(-2071941218);
            testInfo = dto.getTestInfo();
            if (testInfo != null) {
            }
            u11.k();
            String leftIcon2 = dto.getLeftIcon();
            if (leftIcon2 != null) {
            }
            u11.o(-2071937388);
            if (byId == null) {
            }
            u11.k();
            u11.o(-2071936455);
            if (dto.getBadgeStyle() == BadgeDTO.Style.CUSTOM) {
            }
            u11.k();
            size = dto.getSize();
            if (size != null) {
            }
            uniBadgeSize = UniBadgeSize.Size500;
            Boolean hideDisclosure2 = dto.getHideDisclosure();
            if (hideDisclosure2 != null) {
            }
            if (z11) {
            }
            if (z11) {
            }
            eVar4 = eVar3;
            uniBadgeStraightCorners = null;
            A11yInfo a11yInfo2 = dto.getA11yInfo();
            if (a11yInfo2 != null) {
            }
            if (text == null) {
            }
            UniBadgeSize uniBadgeSize22 = uniBadgeSize;
            UniBadgeStraightCorners uniBadgeStraightCorners22 = uniBadgeStraightCorners;
            FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$122 = foundationMapperKt$toOnClickLambda$1$1;
            UniBadgeStyle uniBadgeStyle2 = mapToVo;
            e eVar62 = viewAnalytics;
            boolean z132 = booleanValue;
            float f112 = f7;
            String str2 = combinedLabel;
            if (text != null) {
            }
            function14 = function13;
            eVar5 = eVar4;
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
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
        Rounds round22 = dto.getRound();
        if (round22 != null) {
        }
        u11.o(-2071946896);
        if (valueOf == null) {
        }
        u11.k();
        z11 = roundCornersFlag;
        text = dto.getText();
        CommonControlSettings common22 = dto.getCommon();
        if (common22 != null) {
        }
        u11.o(-2071941218);
        testInfo = dto.getTestInfo();
        if (testInfo != null) {
        }
        u11.k();
        String leftIcon22 = dto.getLeftIcon();
        if (leftIcon22 != null) {
        }
        u11.o(-2071937388);
        if (byId == null) {
        }
        u11.k();
        u11.o(-2071936455);
        if (dto.getBadgeStyle() == BadgeDTO.Style.CUSTOM) {
        }
        u11.k();
        size = dto.getSize();
        if (size != null) {
        }
        uniBadgeSize = UniBadgeSize.Size500;
        Boolean hideDisclosure22 = dto.getHideDisclosure();
        if (hideDisclosure22 != null) {
        }
        if (z11) {
        }
        if (z11) {
        }
        eVar4 = eVar3;
        uniBadgeStraightCorners = null;
        A11yInfo a11yInfo22 = dto.getA11yInfo();
        if (a11yInfo22 != null) {
        }
        if (text == null) {
        }
        UniBadgeSize uniBadgeSize222 = uniBadgeSize;
        UniBadgeStraightCorners uniBadgeStraightCorners222 = uniBadgeStraightCorners;
        FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$1222 = foundationMapperKt$toOnClickLambda$1$1;
        UniBadgeStyle uniBadgeStyle22 = mapToVo;
        e eVar622 = viewAnalytics;
        boolean z1322 = booleanValue;
        float f1122 = f7;
        String str22 = combinedLabel;
        if (text != null) {
        }
        function14 = function13;
        eVar5 = eVar4;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    private static final UniBadgeSize mapToVo(BadgeDTO.BadgeSize badgeSize) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[badgeSize.ordinal()];
        if (i11 == 1) {
            return UniBadgeSize.Size200;
        }
        if (i11 == 2) {
            return UniBadgeSize.Size300;
        }
        if (i11 == 3) {
            return UniBadgeSize.Size400;
        }
        if (i11 == 4) {
            return UniBadgeSize.Size500;
        }
        if (i11 == 5) {
            return UniBadgeSize.Size600;
        }
        throw new o();
    }

    private static final AbstractC7799Q toBackgroundBrush(BadgeDTO.CustomBackground customBackground, InterfaceC3967k interfaceC3967k, int i11) {
        AbstractC7799Q abstractC7799Q;
        interfaceC3967k.o(1677877832);
        if (customBackground.getColor() != null) {
            interfaceC3967k.o(-604520861);
            abstractC7799Q = TokenParserKt.tokenToGradient(customBackground.getColor(), interfaceC3967k, 0);
            if (abstractC7799Q == null) {
                C7807Z c7807z = TokenParserKt.tokenToColor(customBackground.getColor(), interfaceC3967k, 0);
                if (c7807z == null) {
                    interfaceC3967k.k();
                    interfaceC3967k.k();
                    return null;
                }
                abstractC7799Q = new K0(c7807z.w());
            }
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-604427334);
            UniGradient gradient = customBackground.getGradient();
            AbstractC7799Q brush = gradient != null ? GradientExtKt.toBrush(gradient, interfaceC3967k, UniGradient.$stable) : null;
            interfaceC3967k.k();
            abstractC7799Q = brush;
        }
        interfaceC3967k.k();
        return abstractC7799Q;
    }

    private static final UniBadgeStyle mapToVo(BadgeDTO.Style style) {
        switch (WhenMappings.$EnumSwitchMapping$1[style.ordinal()]) {
            case 1:
                return UniBadgeStyle.NeutralPrimary.INSTANCE;
            case 2:
                return UniBadgeStyle.NeutralSecondary.INSTANCE;
            case 3:
                return UniBadgeStyle.StaticSecondary.INSTANCE;
            case 4:
                return UniBadgeStyle.StaticPrimary.INSTANCE;
            case 5:
                return UniBadgeStyle.WarningPrimary.INSTANCE;
            case 6:
                return UniBadgeStyle.WarningSecondary.INSTANCE;
            case 7:
                return UniBadgeStyle.NegativePrimary.INSTANCE;
            case 8:
                return UniBadgeStyle.NegativeSecondary.INSTANCE;
            case 9:
                return UniBadgeStyle.PositivePrimary.INSTANCE;
            case 10:
                return UniBadgeStyle.PositiveSecondary.INSTANCE;
            case 11:
                return UniBadgeStyle.ActionPrimary.INSTANCE;
            case 12:
                return UniBadgeStyle.ActionSecondary.INSTANCE;
            default:
                return UniBadgeStyle.NeutralPrimary.INSTANCE;
        }
    }

    private static final UniBadgeStyle mapToVo(BadgeDTO.CustomStyle customStyle, InterfaceC3967k interfaceC3967k, int i11) {
        UniBadgeStyle customStyle2;
        interfaceC3967k.o(-613296088);
        if (customStyle == null) {
            customStyle2 = UniBadgeStyle.NeutralPrimary.INSTANCE;
        } else {
            UniBadgeStyle.NeutralPrimary neutralPrimary = UniBadgeStyle.NeutralPrimary.INSTANCE;
            BadgeDTO.CustomBackground backgroundColor = customStyle.getBackgroundColor();
            interfaceC3967k.o(575000759);
            AbstractC7799Q backgroundBrush = backgroundColor == null ? null : toBackgroundBrush(backgroundColor, interfaceC3967k, 0);
            interfaceC3967k.k();
            interfaceC3967k.o(575000273);
            if (backgroundBrush == null) {
                backgroundBrush = DeferredBrush.getValue(neutralPrimary.getBackgroundDefBrush(), interfaceC3967k, 0);
            }
            interfaceC3967k.k();
            C7807Z c7807z = TokenParserKt.tokenToColor(customStyle.getTextColor(), interfaceC3967k, 0);
            interfaceC3967k.o(575003584);
            long value = c7807z == null ? DeferredColor.getValue(neutralPrimary.getLabelDefColor(), interfaceC3967k, 0) : c7807z.w();
            interfaceC3967k.k();
            C7807Z c7807z2 = TokenParserKt.tokenToColor(customStyle.getLeftGraphicColor(), interfaceC3967k, 0);
            interfaceC3967k.o(575006606);
            long value2 = c7807z2 == null ? DeferredColor.getValue(neutralPrimary.getStartGraphicDefColor(), interfaceC3967k, 0) : c7807z2.w();
            interfaceC3967k.k();
            C7807Z c7807z3 = TokenParserKt.tokenToColor(customStyle.getRightGraphicColor(), interfaceC3967k, 0);
            customStyle2 = new UniBadgeStyle.CustomStyle(backgroundBrush, value, value2, c7807z3 == null ? DeferredColor.getValue(neutralPrimary.getEndGraphicDefColor(), interfaceC3967k, 0) : c7807z3.w(), null);
        }
        interfaceC3967k.k();
        return customStyle2;
    }
}
