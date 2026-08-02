package ru.ozon.uni.components.iconButton;

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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.K0;
import n0.C8391l;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt$toOnClickLambda$1$1;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.components.iconButton.UniIconButtonStyle;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;
import ru.ozon.uni.utils.UniTestInfoTestTagKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u000e2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0010\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0010\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/components/iconButton/UniIconButtonResizing;", "resizing", "", "isLoading", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "UniIconButtonAtom", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Landroidx/compose/ui/e;Lru/ozon/uni/components/iconButton/UniIconButtonResizing;ZLkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$ButtonStyle;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle;", "toVO", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$ButtonStyle;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;LS0/k;I)Lru/ozon/uni/components/iconButton/UniIconButtonStyle;", "", "token", "Ll1/Q;", "parseTokenColor", "(Ljava/lang/String;LS0/k;I)Ll1/Q;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "Lru/ozon/uni/components/iconButton/UniIconButtonSize;", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;)Lru/ozon/uni/components/iconButton/UniIconButtonSize;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniIconButtonAtomKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IconButtonV3DTO.IconButtonShape.values().length];
            try {
                iArr[IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE_FORCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IconButtonV3DTO.Sizes.values().length];
            try {
                iArr2[IconButtonV3DTO.Sizes.SIZE_300.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IconButtonV3DTO.Sizes.SIZE_400.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IconButtonV3DTO.Sizes.SIZE_450.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IconButtonV3DTO.Sizes.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IconButtonV3DTO.Sizes.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[IconButtonV3DTO.Sizes.SIZE_700.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniIconButtonAtom(@NotNull IconButtonV3DTO dto, e eVar, UniIconButtonResizing uniIconButtonResizing, boolean z11, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        UniIconButtonResizing uniIconButtonResizing2;
        int i15;
        boolean z12;
        int i16;
        Function1<? super AtomAction, Unit> function12;
        Function1<? super AtomAction, Unit> function13;
        TestInfo testInfo;
        UniIconToken byId;
        C8391l c8391l;
        int i17;
        boolean z13;
        UniIconButtonResizing uniIconButtonResizing3;
        Function1<? super AtomAction, Unit> function14;
        boolean z14;
        e eVar3;
        AtomAction atomAction;
        String strokeColor;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(-468654889);
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
                uniIconButtonResizing2 = uniIconButtonResizing;
                i13 |= u11.n(uniIconButtonResizing2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
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
                        if ((i13 & 9363) == 9362 || !u11.b()) {
                            e eVar4 = i18 != 0 ? e.f40358c0 : eVar2;
                            UniIconButtonResizing uniIconButtonResizing4 = i14 != 0 ? UniIconButtonResizing.HUG : uniIconButtonResizing2;
                            boolean z15 = i15 != 0 ? false : z12;
                            if (i16 != 0) {
                                u11.o(-1681414516);
                                Object C11 = u11.C();
                                if (C11 == InterfaceC3967k.a.a()) {
                                    C11 = UniIconButtonAtomKt$UniIconButtonAtom$1$1.INSTANCE;
                                    u11.x(C11);
                                }
                                function13 = (Function1) C11;
                                u11.k();
                            } else {
                                function13 = function12;
                            }
                            u11.o(-1681411272);
                            e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                            testInfo = dto.getTestInfo();
                            if (testInfo != null) {
                                viewAnalytics = UniTestInfoTestTagKt.uniTestTag(viewAnalytics, testInfo, u11, 0);
                            }
                            u11.k();
                            byId = UniTheme.INSTANCE.getIconTokens().getById(dto.getIcon());
                            if (byId == null) {
                                J0 m02 = u11.m0();
                                if (m02 != null) {
                                    m02.G(new UniIconButtonAtomKt$UniIconButtonAtom$3(dto, eVar4, uniIconButtonResizing4, z15, function13, i11, i12));
                                    return;
                                }
                                return;
                            }
                            e eVar5 = eVar4;
                            UniIconButtonResizing uniIconButtonResizing5 = uniIconButtonResizing4;
                            Function1<? super AtomAction, Unit> function15 = function13;
                            AbstractC8972b icon = TokensExtKt.getIcon(byId, u11, UniIconToken.$stable);
                            UniIconButtonStyle vo = toVO(dto.getButtonStyle(), dto, u11, (i13 << 3) & 112);
                            IconButtonV3DTO.Sizes size = dto.getSize();
                            if (size == null) {
                                size = IconButtonV3DTO.Sizes.SIZE_400;
                            }
                            UniIconButtonSize vo2 = toVO(size);
                            u11.o(-1681401973);
                            if (dto.getButtonStyle() == IconButtonV3DTO.ButtonStyle.CUSTOM && Intrinsics.d(dto.getHasStroke(), Boolean.TRUE)) {
                                Integer strokeWidth = dto.getStrokeWidth();
                                if (strokeWidth == null || strokeWidth.intValue() <= 0) {
                                    strokeWidth = null;
                                }
                                if (strokeWidth != null) {
                                    String strokeColor2 = dto.getStrokeColor();
                                    u11.o(-1681397669);
                                    AbstractC7799Q abstractC7799Q = strokeColor2 == null ? null : TokenParserKt.tokenToGradient(strokeColor2, u11, 0);
                                    u11.k();
                                    C7807Z c7807z = (abstractC7799Q != null || (strokeColor = dto.getStrokeColor()) == null) ? null : TokenParserKt.tokenToColor(strokeColor, u11, 0);
                                    if (abstractC7799Q != null) {
                                        c8391l = new C8391l(abstractC7799Q, dto.getStrokeWidth().intValue());
                                    } else if (c7807z != null) {
                                        c8391l = new C8391l(new K0(c7807z.w()), dto.getStrokeWidth().intValue());
                                    }
                                    u11.k();
                                    Boolean isDisabled = dto.isDisabled();
                                    Boolean bool = Boolean.FALSE;
                                    boolean d11 = Intrinsics.d(isDisabled, bool);
                                    IconButtonV3DTO.IconButtonShape buttonShape = dto.getButtonShape();
                                    i17 = buttonShape != null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonShape.ordinal()];
                                    if (i17 != 1) {
                                        u11.o(-583177727);
                                        u11.k();
                                        z13 = true;
                                    } else if (i17 == 2) {
                                        u11.o(-1681377446);
                                        z13 = UniGlobalConfigKt.getRoundCornersFlag((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
                                        u11.k();
                                    } else if (i17 != 3) {
                                        u11.o(-582984369);
                                        z13 = UniGlobalConfigKt.getRoundCornersFlag((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
                                        u11.k();
                                    } else {
                                        u11.o(-583010042);
                                        u11.k();
                                        z13 = false;
                                    }
                                    boolean d12 = Intrinsics.d(dto.isHoverDisabled(), bool);
                                    CommonControlSettings common = dto.getCommon();
                                    UniIconButtonKt.UniIconButton(icon, vo, vo2, viewAnalytics, uniIconButtonResizing5, c8391l, z15, d11, z13, d12, (common != null || (atomAction = common.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function15, atomAction), null, u11, ((i13 << 9) & 3670016) | ((i13 << 6) & 57344), 0, 2048);
                                    uniIconButtonResizing3 = uniIconButtonResizing5;
                                    function14 = function15;
                                    z14 = z15;
                                    eVar3 = eVar5;
                                }
                            }
                            c8391l = null;
                            u11.k();
                            Boolean isDisabled2 = dto.isDisabled();
                            Boolean bool2 = Boolean.FALSE;
                            boolean d112 = Intrinsics.d(isDisabled2, bool2);
                            IconButtonV3DTO.IconButtonShape buttonShape2 = dto.getButtonShape();
                            if (buttonShape2 != null) {
                            }
                            if (i17 != 1) {
                            }
                            boolean d122 = Intrinsics.d(dto.isHoverDisabled(), bool2);
                            CommonControlSettings common2 = dto.getCommon();
                            UniIconButtonKt.UniIconButton(icon, vo, vo2, viewAnalytics, uniIconButtonResizing5, c8391l, z15, d112, z13, d122, (common2 != null || (atomAction = common2.toAtomAction()) == null) ? null : new FoundationMapperKt$toOnClickLambda$1$1(function15, atomAction), null, u11, ((i13 << 9) & 3670016) | ((i13 << 6) & 57344), 0, 2048);
                            uniIconButtonResizing3 = uniIconButtonResizing5;
                            function14 = function15;
                            z14 = z15;
                            eVar3 = eVar5;
                        } else {
                            u11.j();
                            eVar3 = eVar2;
                            uniIconButtonResizing3 = uniIconButtonResizing2;
                            z14 = z12;
                            function14 = function12;
                        }
                        J0 m03 = u11.m0();
                        if (m03 != null) {
                            m03.G(new UniIconButtonAtomKt$UniIconButtonAtom$5(dto, eVar3, uniIconButtonResizing3, z14, function14, i11, i12));
                            return;
                        }
                        return;
                    }
                    function12 = function1;
                    if ((i13 & 9363) == 9362) {
                    }
                    if (i18 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    u11.o(-1681411272);
                    e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                    testInfo = dto.getTestInfo();
                    if (testInfo != null) {
                    }
                    u11.k();
                    byId = UniTheme.INSTANCE.getIconTokens().getById(dto.getIcon());
                    if (byId == null) {
                    }
                }
                z12 = z11;
                i16 = i12 & 16;
                if (i16 == 0) {
                }
                function12 = function1;
                if ((i13 & 9363) == 9362) {
                }
                if (i18 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                u11.o(-1681411272);
                e viewAnalytics22 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                testInfo = dto.getTestInfo();
                if (testInfo != null) {
                }
                u11.k();
                byId = UniTheme.INSTANCE.getIconTokens().getById(dto.getIcon());
                if (byId == null) {
                }
            }
            uniIconButtonResizing2 = uniIconButtonResizing;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            z12 = z11;
            i16 = i12 & 16;
            if (i16 == 0) {
            }
            function12 = function1;
            if ((i13 & 9363) == 9362) {
            }
            if (i18 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            u11.o(-1681411272);
            e viewAnalytics222 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
            testInfo = dto.getTestInfo();
            if (testInfo != null) {
            }
            u11.k();
            byId = UniTheme.INSTANCE.getIconTokens().getById(dto.getIcon());
            if (byId == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        uniIconButtonResizing2 = uniIconButtonResizing;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        z12 = z11;
        i16 = i12 & 16;
        if (i16 == 0) {
        }
        function12 = function1;
        if ((i13 & 9363) == 9362) {
        }
        if (i18 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        u11.o(-1681411272);
        e viewAnalytics2222 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
        testInfo = dto.getTestInfo();
        if (testInfo != null) {
        }
        u11.k();
        byId = UniTheme.INSTANCE.getIconTokens().getById(dto.getIcon());
        if (byId == null) {
        }
    }

    private static final AbstractC7799Q parseTokenColor(String str, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-116659228);
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

    private static final UniIconButtonStyle toVO(IconButtonV3DTO.ButtonStyle buttonStyle, IconButtonV3DTO iconButtonV3DTO, InterfaceC3967k interfaceC3967k, int i11) {
        C7807Z c7807z;
        interfaceC3967k.o(-1163577656);
        UniIconButtonStyle uniIconButtonStyle = UniIconButtonStyle.ActionPrimary.INSTANCE;
        UniIconButtonColors enabled = uniIconButtonStyle.getEnabled();
        if (buttonStyle != IconButtonV3DTO.ButtonStyle.ACTION_PRIMARY && buttonStyle != null) {
            if (buttonStyle == IconButtonV3DTO.ButtonStyle.ACTION_SECONDARY) {
                uniIconButtonStyle = UniIconButtonStyle.ActionSecondary.INSTANCE;
            } else if (buttonStyle == IconButtonV3DTO.ButtonStyle.ACCENT_PRIMARY) {
                uniIconButtonStyle = UniIconButtonStyle.AccentPrimary.INSTANCE;
            } else if (buttonStyle == IconButtonV3DTO.ButtonStyle.ACCENT_SECONDARY) {
                uniIconButtonStyle = UniIconButtonStyle.AccentSecondary.INSTANCE;
            } else if (buttonStyle == IconButtonV3DTO.ButtonStyle.NEUTRAL_SECONDARY) {
                uniIconButtonStyle = UniIconButtonStyle.NeutralSecondary.INSTANCE;
            } else if (buttonStyle == IconButtonV3DTO.ButtonStyle.NEUTRAL_TRANSPARENT) {
                uniIconButtonStyle = UniIconButtonStyle.NeutralTransparent.INSTANCE;
            } else if (buttonStyle == IconButtonV3DTO.ButtonStyle.NEGATIVE) {
                uniIconButtonStyle = UniIconButtonStyle.Negative.INSTANCE;
            } else {
                if (buttonStyle != IconButtonV3DTO.ButtonStyle.CUSTOM) {
                    throw new o();
                }
                AbstractC7799Q parseTokenColor = parseTokenColor(iconButtonV3DTO.getBackgroundColor(), interfaceC3967k, 0);
                interfaceC3967k.o(399009479);
                if (parseTokenColor == null) {
                    parseTokenColor = DeferredBrush.getValue(enabled.getBackgroundColor(), interfaceC3967k, 0);
                }
                AbstractC7799Q abstractC7799Q = parseTokenColor;
                interfaceC3967k.k();
                AbstractC7799Q parseTokenColor2 = parseTokenColor(iconButtonV3DTO.getIconColor(), interfaceC3967k, 0);
                interfaceC3967k.o(399013019);
                if (parseTokenColor2 == null) {
                    parseTokenColor2 = DeferredBrush.getValue(enabled.getIconColor(), interfaceC3967k, 0);
                }
                AbstractC7799Q abstractC7799Q2 = parseTokenColor2;
                interfaceC3967k.k();
                C7807Z c7807z2 = TokenParserKt.tokenToColor(iconButtonV3DTO.getIconColor(), interfaceC3967k, 0);
                interfaceC3967k.o(399016251);
                long value = c7807z2 == null ? DeferredColor.getValue(enabled.getLoaderColor(), interfaceC3967k, 0) : c7807z2.w();
                interfaceC3967k.k();
                String hoverColor = iconButtonV3DTO.getHoverColor();
                interfaceC3967k.o(399020125);
                if (hoverColor == null || TokenParserKt.tokenToGradient(hoverColor, interfaceC3967k, 0) != null) {
                    hoverColor = null;
                }
                interfaceC3967k.k();
                C7807Z c7807z3 = TokenParserKt.tokenToColor(hoverColor, interfaceC3967k, 0);
                interfaceC3967k.o(399019737);
                if (c7807z3 == null) {
                    String iconColor = iconButtonV3DTO.getIconColor();
                    interfaceC3967k.o(399023101);
                    if (iconColor == null || TokenParserKt.tokenToGradient(iconColor, interfaceC3967k, 0) != null) {
                        iconColor = null;
                    }
                    interfaceC3967k.k();
                    c7807z3 = TokenParserKt.tokenToColor(iconColor, interfaceC3967k, 0);
                }
                interfaceC3967k.k();
                if (c7807z3 == null) {
                    c7807z3 = C7807Z.m(UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getGraphicSecondaryDynamic());
                    if (iconButtonV3DTO.getIconColor() != null) {
                        c7807z = null;
                        uniIconButtonStyle = new UniIconButtonStyle.Custom(new UniIconButtonColors(abstractC7799Q, abstractC7799Q2, value, c7807z, (DefaultConstructorMarker) null), null, 2, null);
                    }
                }
                c7807z = c7807z3;
                uniIconButtonStyle = new UniIconButtonStyle.Custom(new UniIconButtonColors(abstractC7799Q, abstractC7799Q2, value, c7807z, (DefaultConstructorMarker) null), null, 2, null);
            }
        }
        interfaceC3967k.k();
        return uniIconButtonStyle;
    }

    private static final UniIconButtonSize toVO(IconButtonV3DTO.Sizes sizes) {
        switch (WhenMappings.$EnumSwitchMapping$1[sizes.ordinal()]) {
            case 1:
                return UniIconButtonSize.SIZE_300;
            case 2:
                return UniIconButtonSize.SIZE_400;
            case 3:
                return UniIconButtonSize.SIZE_450;
            case 4:
                return UniIconButtonSize.SIZE_500;
            case 5:
                return UniIconButtonSize.SIZE_600;
            case 6:
                return UniIconButtonSize.SIZE_700;
            default:
                throw new o();
        }
    }
}
