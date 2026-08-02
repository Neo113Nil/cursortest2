package ru.ozon.uni.components.disclaimer;

import K1.C3422b;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import a1.C4912a;
import a1.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.android.ds.compose.html.SpannedAnnotateConvertorKt;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.util.FoundationMapperKt$toOnClickLambda$1$1;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.components.disclaimer.UniDisclaimerMainButtonTheme;
import ru.ozon.uni.components.disclaimer.UniDisclaimerTheme;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.DeferredColor;
import ru.ozon.uni.utils.UniTestTagsKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\" \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "UniDisclaimerAtom", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$Theme;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme;", "asVo", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$Theme;)Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$ButtonTheme;", "theme", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$CustomButtonTheme;", "customButtonTheme", "Lru/ozon/uni/components/disclaimer/UniDisclaimerMainButtonTheme;", "getMainButtonStyle", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$ButtonTheme;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO$CustomButtonTheme;)Lru/ozon/uni/components/disclaimer/UniDisclaimerMainButtonTheme;", "", "styleMap", "Ljava/util/Map;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniDisclaimerAtomKt {

    @NotNull
    private static final Map<DisclaimerDTO.Theme, UniDisclaimerTheme> styleMap = U.j(new Pair(DisclaimerDTO.Theme.NEUTRAL, UniDisclaimerTheme.Neutral.INSTANCE), new Pair(DisclaimerDTO.Theme.INFO, UniDisclaimerTheme.Info.INSTANCE), new Pair(DisclaimerDTO.Theme.POSITIVE, UniDisclaimerTheme.Positive.INSTANCE), new Pair(DisclaimerDTO.Theme.WARNING, UniDisclaimerTheme.Warning.INSTANCE), new Pair(DisclaimerDTO.Theme.NEGATIVE, UniDisclaimerTheme.Negative.INSTANCE), new Pair(DisclaimerDTO.Theme.MARKETING, UniDisclaimerTheme.Marketing.INSTANCE));

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DisclaimerDTO.ButtonTheme.values().length];
            try {
                iArr[DisclaimerDTO.ButtonTheme.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisclaimerDTO.ButtonTheme.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisclaimerDTO.ButtonTheme.THEME_INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DisclaimerDTO.ButtonTheme.BASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniDisclaimerAtom(@NotNull DisclaimerDTO dto, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super AtomAction, Unit> function12;
        Function1<? super AtomAction, Unit> function13;
        boolean d11;
        CommonControlSettings closeButton;
        FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$1;
        AbstractC8972b abstractC8972b;
        Integer titleLinesLimit;
        e eVar3;
        Integer num;
        Integer subtitleLinesLimit;
        boolean z11;
        Integer num2;
        e eVar4;
        CommonControlSettings common;
        AtomAction atomAction;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(1535797904);
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
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function12 = function1;
                i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i13 & 147) == 146 || !u11.b()) {
                    e eVar5 = i15 != 0 ? e.f40358c0 : eVar2;
                    FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$12 = null;
                    function13 = i14 != 0 ? null : function12;
                    e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar5, dto);
                    d11 = Intrinsics.d(dto.getHideIcon(), Boolean.TRUE);
                    boolean z12 = !d11;
                    UniDisclaimerTheme asVo = asVo(dto.getTheme());
                    closeButton = dto.getCloseButton();
                    if (!dto.isClickable() || function13 == null) {
                        closeButton = null;
                    }
                    if (closeButton != null) {
                        Intrinsics.f(function13);
                        AtomAction atomAction2 = closeButton.toAtomAction();
                        if (atomAction2 != null) {
                            foundationMapperKt$toOnClickLambda$1$1 = new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction2);
                            u11.o(-1059180789);
                            if (d11) {
                                String icon = dto.getIcon();
                                u11.o(-1059180105);
                                AbstractC8972b abstractC8972b2 = icon == null ? null : TokenParserKt.tokenToIcon(icon, u11, 0);
                                u11.k();
                                if (abstractC8972b2 == null) {
                                    abstractC8972b2 = TokensExtKt.getIcon(asVo.getIcon(), u11, UniIconToken.$stable);
                                }
                                abstractC8972b = abstractC8972b2;
                            } else {
                                abstractC8972b = null;
                            }
                            u11.k();
                            OzonSpannableString title = dto.getTitle();
                            u11.o(-1059177220);
                            C3422b m1836toAnnotateStringiJQMabo = title != null ? null : SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(title, 0L, u11, 0, 1);
                            u11.k();
                            OzonSpannableString subtitle = dto.getSubtitle();
                            u11.o(-1059175524);
                            C3422b m1836toAnnotateStringiJQMabo2 = subtitle != null ? null : SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(subtitle, 0L, u11, 0, 1);
                            u11.k();
                            titleLinesLimit = dto.getTitleLinesLimit();
                            if (titleLinesLimit != null || titleLinesLimit.intValue() <= 0) {
                                eVar3 = viewAnalytics;
                                num = null;
                            } else {
                                num = titleLinesLimit;
                                eVar3 = viewAnalytics;
                            }
                            subtitleLinesLimit = dto.getSubtitleLinesLimit();
                            if (subtitleLinesLimit != null || subtitleLinesLimit.intValue() <= 0) {
                                z11 = z12;
                                num2 = null;
                            } else {
                                z11 = z12;
                                num2 = subtitleLinesLimit;
                            }
                            DisclaimerDTO.MainButton mainButton = dto.getMainButton();
                            if (dto.isClickable()) {
                                mainButton = null;
                            }
                            u11.o(-1059167298);
                            C4912a c11 = mainButton != null ? null : c.c(-787502924, new UniDisclaimerAtomKt$UniDisclaimerAtom$4$1(mainButton, function13), u11);
                            u11.k();
                            DisclaimerDTO.AdditionalButton additionalButton = dto.getAdditionalButton();
                            if (dto.isClickable()) {
                                additionalButton = null;
                            }
                            u11.o(-1059152944);
                            C4912a c12 = additionalButton != null ? null : c.c(-533473187, new UniDisclaimerAtomKt$UniDisclaimerAtom$6$1(additionalButton, function13), u11);
                            u11.k();
                            if (function13 != null && (common = dto.getCommon()) != null && (atomAction = common.toAtomAction()) != null) {
                                foundationMapperKt$toOnClickLambda$1$12 = new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction);
                            }
                            UniDisclaimerKt.UniDisclaimer(UniTestTagsKt.uniTestTag(eVar3, UniDisclaimerTestTags.Container, null, u11, 48, 2), m1836toAnnotateStringiJQMabo, m1836toAnnotateStringiJQMabo2, asVo, z11, abstractC8972b, num, num2, c11, c12, foundationMapperKt$toOnClickLambda$1$1, foundationMapperKt$toOnClickLambda$1$12, dto.getTagSupported(), u11, 0, 0, 0);
                            u11 = u11;
                            eVar4 = eVar5;
                        }
                    }
                    foundationMapperKt$toOnClickLambda$1$1 = null;
                    u11.o(-1059180789);
                    if (d11) {
                    }
                    u11.k();
                    OzonSpannableString title2 = dto.getTitle();
                    u11.o(-1059177220);
                    if (title2 != null) {
                    }
                    u11.k();
                    OzonSpannableString subtitle2 = dto.getSubtitle();
                    u11.o(-1059175524);
                    if (subtitle2 != null) {
                    }
                    u11.k();
                    titleLinesLimit = dto.getTitleLinesLimit();
                    if (titleLinesLimit != null) {
                    }
                    eVar3 = viewAnalytics;
                    num = null;
                    subtitleLinesLimit = dto.getSubtitleLinesLimit();
                    if (subtitleLinesLimit != null) {
                    }
                    z11 = z12;
                    num2 = null;
                    DisclaimerDTO.MainButton mainButton2 = dto.getMainButton();
                    if (dto.isClickable()) {
                    }
                    u11.o(-1059167298);
                    if (mainButton2 != null) {
                    }
                    u11.k();
                    DisclaimerDTO.AdditionalButton additionalButton2 = dto.getAdditionalButton();
                    if (dto.isClickable()) {
                    }
                    u11.o(-1059152944);
                    if (additionalButton2 != null) {
                    }
                    u11.k();
                    if (function13 != null) {
                        foundationMapperKt$toOnClickLambda$1$12 = new FoundationMapperKt$toOnClickLambda$1$1(function13, atomAction);
                    }
                    UniDisclaimerKt.UniDisclaimer(UniTestTagsKt.uniTestTag(eVar3, UniDisclaimerTestTags.Container, null, u11, 48, 2), m1836toAnnotateStringiJQMabo, m1836toAnnotateStringiJQMabo2, asVo, z11, abstractC8972b, num, num2, c11, c12, foundationMapperKt$toOnClickLambda$1$1, foundationMapperKt$toOnClickLambda$1$12, dto.getTagSupported(), u11, 0, 0, 0);
                    u11 = u11;
                    eVar4 = eVar5;
                } else {
                    u11.j();
                    eVar4 = eVar2;
                    function13 = function12;
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new UniDisclaimerAtomKt$UniDisclaimerAtom$8(dto, eVar4, function13, i11, i12));
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i13 & 147) == 146) {
            }
            if (i15 != 0) {
            }
            FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$122 = null;
            if (i14 != 0) {
            }
            e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar5, dto);
            d11 = Intrinsics.d(dto.getHideIcon(), Boolean.TRUE);
            boolean z122 = !d11;
            UniDisclaimerTheme asVo2 = asVo(dto.getTheme());
            closeButton = dto.getCloseButton();
            if (!dto.isClickable()) {
            }
            closeButton = null;
            if (closeButton != null) {
            }
            foundationMapperKt$toOnClickLambda$1$1 = null;
            u11.o(-1059180789);
            if (d11) {
            }
            u11.k();
            OzonSpannableString title22 = dto.getTitle();
            u11.o(-1059177220);
            if (title22 != null) {
            }
            u11.k();
            OzonSpannableString subtitle22 = dto.getSubtitle();
            u11.o(-1059175524);
            if (subtitle22 != null) {
            }
            u11.k();
            titleLinesLimit = dto.getTitleLinesLimit();
            if (titleLinesLimit != null) {
            }
            eVar3 = viewAnalytics2;
            num = null;
            subtitleLinesLimit = dto.getSubtitleLinesLimit();
            if (subtitleLinesLimit != null) {
            }
            z11 = z122;
            num2 = null;
            DisclaimerDTO.MainButton mainButton22 = dto.getMainButton();
            if (dto.isClickable()) {
            }
            u11.o(-1059167298);
            if (mainButton22 != null) {
            }
            u11.k();
            DisclaimerDTO.AdditionalButton additionalButton22 = dto.getAdditionalButton();
            if (dto.isClickable()) {
            }
            u11.o(-1059152944);
            if (additionalButton22 != null) {
            }
            u11.k();
            if (function13 != null) {
            }
            UniDisclaimerKt.UniDisclaimer(UniTestTagsKt.uniTestTag(eVar3, UniDisclaimerTestTags.Container, null, u11, 48, 2), m1836toAnnotateStringiJQMabo, m1836toAnnotateStringiJQMabo2, asVo2, z11, abstractC8972b, num, num2, c11, c12, foundationMapperKt$toOnClickLambda$1$1, foundationMapperKt$toOnClickLambda$1$122, dto.getTagSupported(), u11, 0, 0, 0);
            u11 = u11;
            eVar4 = eVar5;
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
        FoundationMapperKt$toOnClickLambda$1$1 foundationMapperKt$toOnClickLambda$1$1222 = null;
        if (i14 != 0) {
        }
        e viewAnalytics22 = AnalyticsModifierKt.viewAnalytics(eVar5, dto);
        d11 = Intrinsics.d(dto.getHideIcon(), Boolean.TRUE);
        boolean z1222 = !d11;
        UniDisclaimerTheme asVo22 = asVo(dto.getTheme());
        closeButton = dto.getCloseButton();
        if (!dto.isClickable()) {
        }
        closeButton = null;
        if (closeButton != null) {
        }
        foundationMapperKt$toOnClickLambda$1$1 = null;
        u11.o(-1059180789);
        if (d11) {
        }
        u11.k();
        OzonSpannableString title222 = dto.getTitle();
        u11.o(-1059177220);
        if (title222 != null) {
        }
        u11.k();
        OzonSpannableString subtitle222 = dto.getSubtitle();
        u11.o(-1059175524);
        if (subtitle222 != null) {
        }
        u11.k();
        titleLinesLimit = dto.getTitleLinesLimit();
        if (titleLinesLimit != null) {
        }
        eVar3 = viewAnalytics22;
        num = null;
        subtitleLinesLimit = dto.getSubtitleLinesLimit();
        if (subtitleLinesLimit != null) {
        }
        z11 = z1222;
        num2 = null;
        DisclaimerDTO.MainButton mainButton222 = dto.getMainButton();
        if (dto.isClickable()) {
        }
        u11.o(-1059167298);
        if (mainButton222 != null) {
        }
        u11.k();
        DisclaimerDTO.AdditionalButton additionalButton222 = dto.getAdditionalButton();
        if (dto.isClickable()) {
        }
        u11.o(-1059152944);
        if (additionalButton222 != null) {
        }
        u11.k();
        if (function13 != null) {
        }
        UniDisclaimerKt.UniDisclaimer(UniTestTagsKt.uniTestTag(eVar3, UniDisclaimerTestTags.Container, null, u11, 48, 2), m1836toAnnotateStringiJQMabo, m1836toAnnotateStringiJQMabo2, asVo22, z11, abstractC8972b, num, num2, c11, c12, foundationMapperKt$toOnClickLambda$1$1, foundationMapperKt$toOnClickLambda$1$1222, dto.getTagSupported(), u11, 0, 0, 0);
        u11 = u11;
        eVar4 = eVar5;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    private static final UniDisclaimerTheme asVo(DisclaimerDTO.Theme theme) {
        UniDisclaimerTheme uniDisclaimerTheme = styleMap.get(theme);
        return uniDisclaimerTheme == null ? UniDisclaimerTheme.Neutral.INSTANCE : uniDisclaimerTheme;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UniDisclaimerMainButtonTheme getMainButtonStyle(DisclaimerDTO.ButtonTheme buttonTheme, DisclaimerDTO.CustomButtonTheme customButtonTheme) {
        UniColorToken bgOverlap;
        UniColorToken textPrimary;
        String textColor;
        String backgroundColor;
        int i11 = buttonTheme == null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonTheme.ordinal()];
        if (i11 != -1) {
            if (i11 == 1) {
                return UniDisclaimerMainButtonTheme.Primary.INSTANCE;
            }
            if (i11 == 2) {
                if (customButtonTheme == null || (backgroundColor = customButtonTheme.getBackgroundColor()) == null || (bgOverlap = UniTheme.INSTANCE.getColorTokens().getById(backgroundColor)) == null) {
                    bgOverlap = UniTheme.INSTANCE.getColorTokens().getBgOverlap();
                }
                Object m3262constructorimpl = DeferredColor.m3262constructorimpl(bgOverlap);
                if (customButtonTheme == null || (textColor = customButtonTheme.getTextColor()) == null || (textPrimary = UniTheme.INSTANCE.getColorTokens().getById(textColor)) == null) {
                    textPrimary = UniTheme.INSTANCE.getColorTokens().getTextPrimary();
                }
                return new UniDisclaimerMainButtonTheme.Custom(m3262constructorimpl, DeferredColor.m3262constructorimpl(textPrimary), null);
            }
            if (i11 != 3 && i11 != 4) {
                throw new o();
            }
        }
        return UniDisclaimerMainButtonTheme.Base.INSTANCE;
    }
}
