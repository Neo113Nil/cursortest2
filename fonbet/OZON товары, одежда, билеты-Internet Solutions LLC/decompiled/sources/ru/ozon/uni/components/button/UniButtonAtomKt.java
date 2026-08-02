package ru.ozon.uni.components.button;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import android.content.Context;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt$toOnClickLambda$1$1;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.A11yInfo;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.components.button.UniButtonStyleType;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;
import ru.ozon.uni.utils.UniTestInfoTestTagKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0011\u001a\u00020\u0010*\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/components/button/UniButtonResizing;", "resizing", "", "isLoading", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "UniButtonAtom", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Landroidx/compose/ui/e;Lru/ozon/uni/components/button/UniButtonResizing;ZLkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "isEnabled", "Lru/ozon/uni/components/button/UniButtonStyleType;", "toButtonStyleType", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LS0/k;II)Lru/ozon/uni/components/button/UniButtonStyleType;", "toCustomColorScheme", "(Lru/ozon/uni/components/button/UniButtonStyleType;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LS0/k;I)Lru/ozon/uni/components/button/UniButtonStyleType;", "", "token", "Ll1/Q;", "getGradientOrColor", "(Ljava/lang/String;LS0/k;I)Ll1/Q;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;", "Lru/ozon/uni/components/button/UniButtonSize;", "toButtonSizeType", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;)Lru/ozon/uni/components/button/UniButtonSize;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniButtonAtomKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3DTO.Sizes.values().length];
            try {
                iArr[ButtonV3DTO.Sizes.SIZE_400.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3DTO.Sizes.SIZE_500.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3DTO.Sizes.SIZE_600.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3DTO.Sizes.SIZE_700.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniButtonAtom(@NotNull ButtonV3DTO dto, e eVar, UniButtonResizing uniButtonResizing, boolean z11, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        UniButtonResizing uniButtonResizing2;
        int i15;
        boolean z12;
        int i16;
        Function1<? super AtomAction, Unit> function12;
        int i17;
        Function1<? super AtomAction, Unit> function13;
        ButtonV3DTO.Sizes size;
        TestInfo testInfo;
        Object obj;
        e e11;
        Function1<? super AtomAction, Unit> function14;
        C3969l c3969l;
        boolean z13;
        e eVar3;
        UniButtonResizing uniButtonResizing3;
        AtomAction atomAction;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(682739856);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                uniButtonResizing2 = uniButtonResizing;
                i13 |= u11.n(uniButtonResizing2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
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
                        i17 = i13;
                        if ((i17 & 9363) == 9362 || !u11.b()) {
                            e eVar4 = i18 != 0 ? e.f40358c0 : eVar2;
                            if (i14 != 0) {
                                uniButtonResizing2 = UniButtonResizing.HUG;
                            }
                            boolean z14 = i15 != 0 ? false : z12;
                            if (i16 != 0) {
                                u11.o(-347010886);
                                Object C11 = u11.C();
                                if (C11 == InterfaceC3967k.a.a()) {
                                    C11 = UniButtonAtomKt$UniButtonAtom$1$1.INSTANCE;
                                    u11.x(C11);
                                }
                                u11.k();
                                function13 = (Function1) C11;
                            } else {
                                function13 = function12;
                            }
                            e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                            boolean d11 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
                            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                            String icon = dto.getIcon();
                            UniIconToken byId = icon != null ? UniTheme.INSTANCE.getIconTokens().getById(icon) : null;
                            boolean z15 = byId == null && byId.getIsMulticolor();
                            size = dto.getSize();
                            if (size != null || (r5 = toButtonSizeType(size)) == null) {
                                UniButtonSize uniButtonSize = UniButtonSize.SIZE_500;
                            }
                            UniButtonSize uniButtonSize2 = uniButtonSize;
                            UniButtonStyleType adjustedColors = UniButtonStyleTypeKt.adjustedColors(toButtonStyleType(dto.getStyleType(), d11, dto, u11, (i17 << 6) & 896, 0), z15);
                            Rounds round = dto.getRound();
                            boolean roundCorners = round != null ? round.getRoundCorners() : UniGlobalConfigKt.getRoundCornersFlag(context);
                            Boolean isHoverDisabled = dto.isHoverDisabled();
                            boolean booleanValue = isHoverDisabled != null ? isHoverDisabled.booleanValue() : false;
                            CommonControlSettings common = dto.getCommon();
                            FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$1 = (common != null || (atomAction = common.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction);
                            u11.o(-346990202);
                            testInfo = dto.getTestInfo();
                            if (testInfo != null) {
                                viewAnalytics = UniTestInfoTestTagKt.uniTestTag(viewAnalytics, testInfo, u11, 0);
                            }
                            u11.k();
                            if (uniButtonResizing2 == UniButtonResizing.HUG) {
                                obj = null;
                                e11 = a0.x(viewAnalytics, null, 3);
                            } else {
                                obj = null;
                                e11 = a0.e(viewAnalytics, 1.0f);
                            }
                            UniButtonResizing uniButtonResizing4 = uniButtonResizing2;
                            String title = dto.getTitle();
                            String subtitle = dto.getSubtitle();
                            String dataText = dto.getDataText();
                            u11.o(-346978564);
                            AbstractC8972b icon2 = byId == null ? null : TokensExtKt.getIcon(byId, u11, UniIconToken.$stable);
                            u11.k();
                            boolean z16 = !d11;
                            A11yInfo a11yInfo = dto.getA11yInfo();
                            boolean z17 = booleanValue;
                            UniButtonKt.UniButton(title, e11, subtitle, dataText, icon2, a11yInfo != null ? a11yInfo.getCombinedLabel() : null, foundationMapperKt$toOnClickLambda$1$1, roundCorners, z16, z17, z14, adjustedColors, uniButtonSize2, false, null, u11, 0, (i17 >> 9) & 14, 24576);
                            function14 = function13;
                            c3969l = u11;
                            z13 = z14;
                            eVar3 = eVar4;
                            uniButtonResizing3 = uniButtonResizing4;
                        } else {
                            u11.j();
                            c3969l = u11;
                            eVar3 = eVar2;
                            uniButtonResizing3 = uniButtonResizing2;
                            z13 = z12;
                            function14 = function12;
                        }
                        m02 = c3969l.m0();
                        if (m02 != null) {
                            m02.G(new UniButtonAtomKt$UniButtonAtom$2(dto, eVar3, uniButtonResizing3, z13, function14, i11, i12));
                            return;
                        }
                        return;
                    }
                    function12 = function1;
                    i17 = i13;
                    if ((i17 & 9363) == 9362) {
                    }
                    if (i18 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                    boolean d112 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
                    Context context2 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                    String icon3 = dto.getIcon();
                    if (icon3 != null) {
                    }
                    if (byId == null) {
                    }
                    size = dto.getSize();
                    if (size != null) {
                    }
                    UniButtonSize uniButtonSize3 = UniButtonSize.SIZE_500;
                    UniButtonSize uniButtonSize22 = uniButtonSize3;
                    UniButtonStyleType adjustedColors2 = UniButtonStyleTypeKt.adjustedColors(toButtonStyleType(dto.getStyleType(), d112, dto, u11, (i17 << 6) & 896, 0), z15);
                    Rounds round2 = dto.getRound();
                    if (round2 != null) {
                    }
                    Boolean isHoverDisabled2 = dto.isHoverDisabled();
                    if (isHoverDisabled2 != null) {
                    }
                    CommonControlSettings common2 = dto.getCommon();
                    if (common2 != null) {
                    }
                    u11.o(-346990202);
                    testInfo = dto.getTestInfo();
                    if (testInfo != null) {
                    }
                    u11.k();
                    if (uniButtonResizing2 == UniButtonResizing.HUG) {
                    }
                    UniButtonResizing uniButtonResizing42 = uniButtonResizing2;
                    String title2 = dto.getTitle();
                    String subtitle2 = dto.getSubtitle();
                    String dataText2 = dto.getDataText();
                    u11.o(-346978564);
                    if (byId == null) {
                    }
                    u11.k();
                    boolean z162 = !d112;
                    A11yInfo a11yInfo2 = dto.getA11yInfo();
                    boolean z172 = booleanValue;
                    UniButtonKt.UniButton(title2, e11, subtitle2, dataText2, icon2, a11yInfo2 != null ? a11yInfo2.getCombinedLabel() : null, foundationMapperKt$toOnClickLambda$1$1, roundCorners, z162, z172, z14, adjustedColors2, uniButtonSize22, false, null, u11, 0, (i17 >> 9) & 14, 24576);
                    function14 = function13;
                    c3969l = u11;
                    z13 = z14;
                    eVar3 = eVar4;
                    uniButtonResizing3 = uniButtonResizing42;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                z12 = z11;
                i16 = i12 & 16;
                if (i16 == 0) {
                }
                function12 = function1;
                i17 = i13;
                if ((i17 & 9363) == 9362) {
                }
                if (i18 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                e viewAnalytics22 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                boolean d1122 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
                Context context22 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                String icon32 = dto.getIcon();
                if (icon32 != null) {
                }
                if (byId == null) {
                }
                size = dto.getSize();
                if (size != null) {
                }
                UniButtonSize uniButtonSize32 = UniButtonSize.SIZE_500;
                UniButtonSize uniButtonSize222 = uniButtonSize32;
                UniButtonStyleType adjustedColors22 = UniButtonStyleTypeKt.adjustedColors(toButtonStyleType(dto.getStyleType(), d1122, dto, u11, (i17 << 6) & 896, 0), z15);
                Rounds round22 = dto.getRound();
                if (round22 != null) {
                }
                Boolean isHoverDisabled22 = dto.isHoverDisabled();
                if (isHoverDisabled22 != null) {
                }
                CommonControlSettings common22 = dto.getCommon();
                if (common22 != null) {
                }
                u11.o(-346990202);
                testInfo = dto.getTestInfo();
                if (testInfo != null) {
                }
                u11.k();
                if (uniButtonResizing2 == UniButtonResizing.HUG) {
                }
                UniButtonResizing uniButtonResizing422 = uniButtonResizing2;
                String title22 = dto.getTitle();
                String subtitle22 = dto.getSubtitle();
                String dataText22 = dto.getDataText();
                u11.o(-346978564);
                if (byId == null) {
                }
                u11.k();
                boolean z1622 = !d1122;
                A11yInfo a11yInfo22 = dto.getA11yInfo();
                boolean z1722 = booleanValue;
                UniButtonKt.UniButton(title22, e11, subtitle22, dataText22, icon2, a11yInfo22 != null ? a11yInfo22.getCombinedLabel() : null, foundationMapperKt$toOnClickLambda$1$1, roundCorners, z1622, z1722, z14, adjustedColors22, uniButtonSize222, false, null, u11, 0, (i17 >> 9) & 14, 24576);
                function14 = function13;
                c3969l = u11;
                z13 = z14;
                eVar3 = eVar4;
                uniButtonResizing3 = uniButtonResizing422;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            uniButtonResizing2 = uniButtonResizing;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            z12 = z11;
            i16 = i12 & 16;
            if (i16 == 0) {
            }
            function12 = function1;
            i17 = i13;
            if ((i17 & 9363) == 9362) {
            }
            if (i18 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            e viewAnalytics222 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
            boolean d11222 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
            Context context222 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            String icon322 = dto.getIcon();
            if (icon322 != null) {
            }
            if (byId == null) {
            }
            size = dto.getSize();
            if (size != null) {
            }
            UniButtonSize uniButtonSize322 = UniButtonSize.SIZE_500;
            UniButtonSize uniButtonSize2222 = uniButtonSize322;
            UniButtonStyleType adjustedColors222 = UniButtonStyleTypeKt.adjustedColors(toButtonStyleType(dto.getStyleType(), d11222, dto, u11, (i17 << 6) & 896, 0), z15);
            Rounds round222 = dto.getRound();
            if (round222 != null) {
            }
            Boolean isHoverDisabled222 = dto.isHoverDisabled();
            if (isHoverDisabled222 != null) {
            }
            CommonControlSettings common222 = dto.getCommon();
            if (common222 != null) {
            }
            u11.o(-346990202);
            testInfo = dto.getTestInfo();
            if (testInfo != null) {
            }
            u11.k();
            if (uniButtonResizing2 == UniButtonResizing.HUG) {
            }
            UniButtonResizing uniButtonResizing4222 = uniButtonResizing2;
            String title222 = dto.getTitle();
            String subtitle222 = dto.getSubtitle();
            String dataText222 = dto.getDataText();
            u11.o(-346978564);
            if (byId == null) {
            }
            u11.k();
            boolean z16222 = !d11222;
            A11yInfo a11yInfo222 = dto.getA11yInfo();
            boolean z17222 = booleanValue;
            UniButtonKt.UniButton(title222, e11, subtitle222, dataText222, icon2, a11yInfo222 != null ? a11yInfo222.getCombinedLabel() : null, foundationMapperKt$toOnClickLambda$1$1, roundCorners, z16222, z17222, z14, adjustedColors222, uniButtonSize2222, false, null, u11, 0, (i17 >> 9) & 14, 24576);
            function14 = function13;
            c3969l = u11;
            z13 = z14;
            eVar3 = eVar4;
            uniButtonResizing3 = uniButtonResizing4222;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        uniButtonResizing2 = uniButtonResizing;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        z12 = z11;
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        function12 = function1;
        i17 = i13;
        if ((i17 & 9363) == 9362) {
        }
        if (i18 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        e viewAnalytics2222 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
        boolean d112222 = Intrinsics.d(dto.isDisabled(), Boolean.FALSE);
        Context context2222 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
        String icon3222 = dto.getIcon();
        if (icon3222 != null) {
        }
        if (byId == null) {
        }
        size = dto.getSize();
        if (size != null) {
        }
        UniButtonSize uniButtonSize3222 = UniButtonSize.SIZE_500;
        UniButtonSize uniButtonSize22222 = uniButtonSize3222;
        UniButtonStyleType adjustedColors2222 = UniButtonStyleTypeKt.adjustedColors(toButtonStyleType(dto.getStyleType(), d112222, dto, u11, (i17 << 6) & 896, 0), z15);
        Rounds round2222 = dto.getRound();
        if (round2222 != null) {
        }
        Boolean isHoverDisabled2222 = dto.isHoverDisabled();
        if (isHoverDisabled2222 != null) {
        }
        CommonControlSettings common2222 = dto.getCommon();
        if (common2222 != null) {
        }
        u11.o(-346990202);
        testInfo = dto.getTestInfo();
        if (testInfo != null) {
        }
        u11.k();
        if (uniButtonResizing2 == UniButtonResizing.HUG) {
        }
        UniButtonResizing uniButtonResizing42222 = uniButtonResizing2;
        String title2222 = dto.getTitle();
        String subtitle2222 = dto.getSubtitle();
        String dataText2222 = dto.getDataText();
        u11.o(-346978564);
        if (byId == null) {
        }
        u11.k();
        boolean z162222 = !d112222;
        A11yInfo a11yInfo2222 = dto.getA11yInfo();
        boolean z172222 = booleanValue;
        UniButtonKt.UniButton(title2222, e11, subtitle2222, dataText2222, icon2, a11yInfo2222 != null ? a11yInfo2222.getCombinedLabel() : null, foundationMapperKt$toOnClickLambda$1$1, roundCorners, z162222, z172222, z14, adjustedColors2222, uniButtonSize22222, false, null, u11, 0, (i17 >> 9) & 14, 24576);
        function14 = function13;
        c3969l = u11;
        z13 = z14;
        eVar3 = eVar4;
        uniButtonResizing3 = uniButtonResizing42222;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    private static final AbstractC7799Q getGradientOrColor(String str, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-778430005);
        int i12 = i11 & 14;
        AbstractC7799Q abstractC7799Q = TokenParserKt.tokenToGradient(str, interfaceC3967k, i12);
        if (abstractC7799Q == null) {
            C7807Z c7807z = TokenParserKt.tokenToColor(str, interfaceC3967k, i12);
            if (c7807z == null) {
                interfaceC3967k.k();
                return null;
            }
            abstractC7799Q = new K0(c7807z.w());
        }
        interfaceC3967k.k();
        return abstractC7799Q;
    }

    private static final UniButtonSize toButtonSizeType(ButtonV3DTO.Sizes sizes) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[sizes.ordinal()];
        if (i11 == 1) {
            return UniButtonSize.SIZE_400;
        }
        if (i11 == 2) {
            return UniButtonSize.SIZE_500;
        }
        if (i11 == 3) {
            return UniButtonSize.SIZE_600;
        }
        if (i11 == 4) {
            return UniButtonSize.SIZE_700;
        }
        throw new o();
    }

    private static final UniButtonStyleType toButtonStyleType(ButtonV3DTO.StyleTypes styleTypes, boolean z11, ButtonV3DTO buttonV3DTO, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        UniButtonStyleType uniButtonStyleType;
        interfaceC3967k.o(315847025);
        if ((i12 & 1) != 0) {
            z11 = true;
        }
        if (!z11) {
            uniButtonStyleType = UniButtonStyleType.Disabled.INSTANCE;
        } else if (styleTypes == null || styleTypes == ButtonV3DTO.StyleTypes.ACTION_PRIMARY) {
            uniButtonStyleType = UniButtonStyleType.ActionPrimary.INSTANCE;
        } else if (styleTypes == ButtonV3DTO.StyleTypes.ACTION_SECONDARY) {
            uniButtonStyleType = UniButtonStyleType.ActionSecondary.INSTANCE;
        } else if (styleTypes == ButtonV3DTO.StyleTypes.ACCENT_PRIMARY) {
            uniButtonStyleType = UniButtonStyleType.AccentPrimary.INSTANCE;
        } else if (styleTypes == ButtonV3DTO.StyleTypes.ACCENT_SECONDARY) {
            uniButtonStyleType = UniButtonStyleType.AccentSecondary.INSTANCE;
        } else if (styleTypes == ButtonV3DTO.StyleTypes.NEGATIVE) {
            uniButtonStyleType = UniButtonStyleType.Negative.INSTANCE;
        } else if (styleTypes == ButtonV3DTO.StyleTypes.NEUTRAL_SECONDARY) {
            uniButtonStyleType = UniButtonStyleType.NeutralSecondary.INSTANCE;
        } else {
            if (styleTypes != ButtonV3DTO.StyleTypes.CUSTOM) {
                throw new o();
            }
            uniButtonStyleType = toCustomColorScheme(UniButtonStyleType.ActionPrimary.INSTANCE, buttonV3DTO, interfaceC3967k, ((i11 >> 3) & 112) | 6);
        }
        interfaceC3967k.k();
        return uniButtonStyleType;
    }

    private static final UniButtonStyleType toCustomColorScheme(UniButtonStyleType uniButtonStyleType, ButtonV3DTO buttonV3DTO, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-1478845490);
        AbstractC7799Q gradientOrColor = getGradientOrColor(buttonV3DTO.getBackgroundColor(), interfaceC3967k, 0);
        interfaceC3967k.o(1021603206);
        if (gradientOrColor == null) {
            gradientOrColor = DeferredBrush.getValue(uniButtonStyleType.getBackgroundColor(), interfaceC3967k, 0);
        }
        AbstractC7799Q abstractC7799Q = gradientOrColor;
        interfaceC3967k.k();
        String hoverColor = buttonV3DTO.getHoverColor();
        interfaceC3967k.o(1021606984);
        String str = null;
        if (hoverColor == null || TokenParserKt.tokenToGradient(hoverColor, interfaceC3967k, 0) != null) {
            hoverColor = null;
        }
        interfaceC3967k.k();
        C7807Z c7807z = TokenParserKt.tokenToColor(hoverColor, interfaceC3967k, 0);
        interfaceC3967k.o(1021606589);
        if (c7807z == null) {
            String titleColor = buttonV3DTO.getTitleColor();
            interfaceC3967k.o(1021609736);
            if (titleColor != null && TokenParserKt.tokenToGradient(titleColor, interfaceC3967k, 0) == null) {
                str = titleColor;
            }
            interfaceC3967k.k();
            c7807z = TokenParserKt.tokenToColor(str, interfaceC3967k, 0);
        }
        C7807Z c7807z2 = c7807z;
        interfaceC3967k.k();
        AbstractC7799Q gradientOrColor2 = getGradientOrColor(buttonV3DTO.getTitleColor(), interfaceC3967k, 0);
        interfaceC3967k.o(1021612352);
        if (gradientOrColor2 == null) {
            gradientOrColor2 = DeferredBrush.getValue(uniButtonStyleType.getTitleTextColor(), interfaceC3967k, 0);
        }
        AbstractC7799Q abstractC7799Q2 = gradientOrColor2;
        interfaceC3967k.k();
        AbstractC7799Q gradientOrColor3 = getGradientOrColor(buttonV3DTO.getSubtitleColor(), interfaceC3967k, 0);
        interfaceC3967k.o(1021615334);
        if (gradientOrColor3 == null) {
            gradientOrColor3 = DeferredBrush.getValue(uniButtonStyleType.getSubtitleTextColor(), interfaceC3967k, 0);
        }
        AbstractC7799Q abstractC7799Q3 = gradientOrColor3;
        interfaceC3967k.k();
        C7807Z c7807z3 = TokenParserKt.tokenToColor(buttonV3DTO.getIconColor(), interfaceC3967k, 0);
        interfaceC3967k.o(1021618229);
        long value = c7807z3 == null ? DeferredColor.getValue(uniButtonStyleType.getIconColor(), interfaceC3967k, 0) : c7807z3.w();
        interfaceC3967k.k();
        C7807Z c7807z4 = TokenParserKt.tokenToColor(buttonV3DTO.getDataBackgroundColor(), interfaceC3967k, 0);
        interfaceC3967k.o(1021620937);
        long value2 = c7807z4 == null ? DeferredColor.getValue(uniButtonStyleType.getDataBackgroundColor(), interfaceC3967k, 0) : c7807z4.w();
        interfaceC3967k.k();
        AbstractC7799Q gradientOrColor4 = getGradientOrColor(buttonV3DTO.getDataTextColor(), interfaceC3967k, 0);
        interfaceC3967k.o(1021624066);
        if (gradientOrColor4 == null) {
            gradientOrColor4 = DeferredBrush.getValue(uniButtonStyleType.getDataTextColor(), interfaceC3967k, 0);
        }
        interfaceC3967k.k();
        UniButtonStyleType.Custom custom = new UniButtonStyleType.Custom(abstractC7799Q, abstractC7799Q2, abstractC7799Q3, gradientOrColor4, c7807z2, value, value2, TokenParserKt.tokenToGradient(buttonV3DTO.getIconColor(), interfaceC3967k, 0), (DefaultConstructorMarker) null);
        interfaceC3967k.k();
        return custom;
    }
}
