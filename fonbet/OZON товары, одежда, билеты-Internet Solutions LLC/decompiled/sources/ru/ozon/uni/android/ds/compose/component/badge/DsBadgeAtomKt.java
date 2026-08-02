package ru.ozon.uni.android.ds.compose.component.badge;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.Locator;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt$toOnClickLambda$1$1;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.A11yInfo;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\"&\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\u0004j\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "DsBadgeAtom", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/uni/android/ds/compose/modifier/Locator;", "Lru/ozon/uni/android/ds/compose/modifier/AtomLocator;", "badgeLocator", "Lkotlin/jvm/functions/Function1;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsBadgeAtomKt {

    @NotNull
    private static final Function1<TestInfo, Locator> badgeLocator = DsBadgeAtomKt$badgeLocator$1.INSTANCE;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsBadgeAtom(@NotNull BadgeDTO dto, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super AtomAction, Unit> function12;
        e eVar3;
        Function1<? super AtomAction, Unit> function13;
        BadgeDTO.BadgeSize size;
        DsBadgeSize dsBadgeSize;
        DsBadgeStyle vo;
        CommonControlSettings common;
        DsBadgeSize dsBadgeSize2;
        FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$1;
        C3969l c3969l;
        Boolean bottomRight;
        Boolean bottomLeft;
        Boolean topRight;
        Boolean topLeft;
        AtomAction atomAction;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(-1402339033);
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
                        u11.o(-798361658);
                        Object C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = DsBadgeAtomKt$DsBadgeAtom$1$1.INSTANCE;
                            u11.x(C11);
                        }
                        function13 = (Function1) C11;
                        u11.k();
                    } else {
                        function13 = function12;
                    }
                    e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
                    size = dto.getSize();
                    if (size != null || (dsBadgeSize = DsBadgeMappersKt.toVo(size)) == null) {
                        dsBadgeSize = DsBadgeSize.SIZE_500;
                    }
                    Rounds round = dto.getRound();
                    float badgeCornerRadius = DsBadgeMappersKt.getBadgeCornerRadius(dsBadgeSize, round != null ? Boolean.valueOf(round.getRoundCorners()) : null, u11, 0, 0);
                    BadgeDTO.StraightCorners straightCorners = dto.getStraightCorners();
                    String leftIcon = dto.getLeftIcon();
                    UniIconToken byId = leftIcon != null ? UniTheme.INSTANCE.getIconTokens().getById(leftIcon) : null;
                    if (dto.getBadgeStyle() == BadgeDTO.Style.CUSTOM) {
                        u11.o(1020962675);
                        vo = DsBadgeStyleKt.toVo(dto.getCustomBadgeStyle(), u11, 0);
                        u11.k();
                    } else {
                        u11.o(1021011097);
                        vo = DsBadgeStyleKt.toVo(dto.getBadgeStyle(), u11, 0);
                        u11.k();
                    }
                    common = dto.getCommon();
                    if (common != null || (atomAction = common.toAtomAction()) == null) {
                        dsBadgeSize2 = dsBadgeSize;
                        foundationMapperKt$toOnClickLambda$1$1 = null;
                    } else {
                        FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$12 = new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction);
                        dsBadgeSize2 = dsBadgeSize;
                        foundationMapperKt$toOnClickLambda$1$1 = foundationMapperKt$toOnClickLambda$1$12;
                    }
                    AbstractC7799Q background = vo.getBackground();
                    e testTag = AtomLocatorKt.testTag(viewAnalytics, badgeLocator.invoke(dto.getTestInfo()));
                    long textColor = vo.getTextColor();
                    long leftIconColor = (byId == null && byId.getIsMulticolor()) ? C7807Z.f72259m : vo.getLeftIconColor();
                    long rightIconColor = vo.getRightIconColor();
                    long j11 = leftIconColor;
                    String text = dto.getText();
                    boolean booleanValue = (straightCorners != null || (topLeft = straightCorners.getTopLeft()) == null) ? false : topLeft.booleanValue();
                    boolean booleanValue2 = (straightCorners != null || (topRight = straightCorners.getTopRight()) == null) ? false : topRight.booleanValue();
                    boolean booleanValue3 = (straightCorners != null || (bottomLeft = straightCorners.getBottomLeft()) == null) ? false : bottomLeft.booleanValue();
                    boolean booleanValue4 = (straightCorners != null || (bottomRight = straightCorners.getBottomRight()) == null) ? false : bottomRight.booleanValue();
                    Boolean hideDisclosure = dto.getHideDisclosure();
                    boolean booleanValue5 = hideDisclosure != null ? hideDisclosure.booleanValue() : false;
                    u11.o(-798319992);
                    AbstractC8972b icon = byId == null ? null : TokensExtKt.getIcon(byId, u11, UniIconToken.$stable);
                    u11.k();
                    A11yInfo a11yInfo = dto.getA11yInfo();
                    c3969l = u11;
                    DsBadgeKt.m1675DsBadgeATjRvoI(dsBadgeSize2, background, testTag, textColor, j11, rightIconColor, badgeCornerRadius, text, booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, icon, foundationMapperKt$toOnClickLambda$1$1, a11yInfo != null ? a11yInfo.getCombinedLabel() : null, c3969l, 0, 0, 0);
                } else {
                    u11.j();
                    c3969l = u11;
                    eVar3 = eVar2;
                    function13 = function12;
                }
                m02 = c3969l.m0();
                if (m02 != null) {
                    m02.G(new DsBadgeAtomKt$DsBadgeAtom$2(dto, eVar3, function13, i11, i12));
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
            e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
            size = dto.getSize();
            if (size != null) {
            }
            dsBadgeSize = DsBadgeSize.SIZE_500;
            Rounds round2 = dto.getRound();
            float badgeCornerRadius2 = DsBadgeMappersKt.getBadgeCornerRadius(dsBadgeSize, round2 != null ? Boolean.valueOf(round2.getRoundCorners()) : null, u11, 0, 0);
            BadgeDTO.StraightCorners straightCorners2 = dto.getStraightCorners();
            String leftIcon2 = dto.getLeftIcon();
            if (leftIcon2 != null) {
            }
            if (dto.getBadgeStyle() == BadgeDTO.Style.CUSTOM) {
            }
            common = dto.getCommon();
            if (common != null) {
            }
            dsBadgeSize2 = dsBadgeSize;
            foundationMapperKt$toOnClickLambda$1$1 = null;
            AbstractC7799Q background2 = vo.getBackground();
            e testTag2 = AtomLocatorKt.testTag(viewAnalytics2, badgeLocator.invoke(dto.getTestInfo()));
            long textColor2 = vo.getTextColor();
            if (byId == null) {
            }
            long rightIconColor2 = vo.getRightIconColor();
            long j112 = leftIconColor;
            String text2 = dto.getText();
            if (straightCorners2 != null) {
            }
            if (straightCorners2 != null) {
            }
            if (straightCorners2 != null) {
            }
            if (straightCorners2 != null) {
            }
            Boolean hideDisclosure2 = dto.getHideDisclosure();
            if (hideDisclosure2 != null) {
            }
            u11.o(-798319992);
            if (byId == null) {
            }
            u11.k();
            A11yInfo a11yInfo2 = dto.getA11yInfo();
            c3969l = u11;
            DsBadgeKt.m1675DsBadgeATjRvoI(dsBadgeSize2, background2, testTag2, textColor2, j112, rightIconColor2, badgeCornerRadius2, text2, booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, icon, foundationMapperKt$toOnClickLambda$1$1, a11yInfo2 != null ? a11yInfo2.getCombinedLabel() : null, c3969l, 0, 0, 0);
            m02 = c3969l.m0();
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
        e viewAnalytics22 = AnalyticsModifierKt.viewAnalytics(eVar3, dto);
        size = dto.getSize();
        if (size != null) {
        }
        dsBadgeSize = DsBadgeSize.SIZE_500;
        Rounds round22 = dto.getRound();
        float badgeCornerRadius22 = DsBadgeMappersKt.getBadgeCornerRadius(dsBadgeSize, round22 != null ? Boolean.valueOf(round22.getRoundCorners()) : null, u11, 0, 0);
        BadgeDTO.StraightCorners straightCorners22 = dto.getStraightCorners();
        String leftIcon22 = dto.getLeftIcon();
        if (leftIcon22 != null) {
        }
        if (dto.getBadgeStyle() == BadgeDTO.Style.CUSTOM) {
        }
        common = dto.getCommon();
        if (common != null) {
        }
        dsBadgeSize2 = dsBadgeSize;
        foundationMapperKt$toOnClickLambda$1$1 = null;
        AbstractC7799Q background22 = vo.getBackground();
        e testTag22 = AtomLocatorKt.testTag(viewAnalytics22, badgeLocator.invoke(dto.getTestInfo()));
        long textColor22 = vo.getTextColor();
        if (byId == null) {
        }
        long rightIconColor22 = vo.getRightIconColor();
        long j1122 = leftIconColor;
        String text22 = dto.getText();
        if (straightCorners22 != null) {
        }
        if (straightCorners22 != null) {
        }
        if (straightCorners22 != null) {
        }
        if (straightCorners22 != null) {
        }
        Boolean hideDisclosure22 = dto.getHideDisclosure();
        if (hideDisclosure22 != null) {
        }
        u11.o(-798319992);
        if (byId == null) {
        }
        u11.k();
        A11yInfo a11yInfo22 = dto.getA11yInfo();
        c3969l = u11;
        DsBadgeKt.m1675DsBadgeATjRvoI(dsBadgeSize2, background22, testTag22, textColor22, j1122, rightIconColor22, badgeCornerRadius22, text22, booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, icon, foundationMapperKt$toOnClickLambda$1$1, a11yInfo22 != null ? a11yInfo22.getCombinedLabel() : null, c3969l, 0, 0, 0);
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
