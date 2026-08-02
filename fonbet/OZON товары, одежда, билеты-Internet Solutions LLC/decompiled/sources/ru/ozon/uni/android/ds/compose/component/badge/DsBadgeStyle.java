package ru.ozon.uni.android.ds.compose.component.badge;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniGradientToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeStyle;", "", "Ll1/Q;", "background", "Ll1/Z;", "textColor", "leftIconColor", "rightIconColor", "<init>", "(Ll1/Q;JJJ)V", "Ll1/Q;", "getBackground$uni_release", "()Ll1/Q;", "J", "getTextColor-0d7_KjU$uni_release", "()J", "getLeftIconColor-0d7_KjU$uni_release", "getRightIconColor-0d7_KjU$uni_release", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsBadgeStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AbstractC7799Q background;
    private final long leftIconColor;
    private final long rightIconColor;
    private final long textColor;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010%\u001a\u00020\u0004H\u0007¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010&\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010(\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010\u0006J\u000f\u0010+\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\u0004H\u0007¢\u0006\u0004\b,\u0010\u0006J\u000f\u0010-\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010.\u001a\u00020\u0004H\u0007¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010/\u001a\u00020\u0004H\u0007¢\u0006\u0004\b/\u0010\u0006J\u000f\u00100\u001a\u00020\u0004H\u0007¢\u0006\u0004\b0\u0010\u0006J\u000f\u00101\u001a\u00020\u0004H\u0007¢\u0006\u0004\b1\u0010\u0006J\u000f\u00102\u001a\u00020\u0004H\u0007¢\u0006\u0004\b2\u0010\u0006J\u000f\u00103\u001a\u00020\u0004H\u0007¢\u0006\u0004\b3\u0010\u0006J\u000f\u00104\u001a\u00020\u0004H\u0007¢\u0006\u0004\b4\u0010\u0006J/\u0010=\u001a\u00020\u00042\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0007¢\u0006\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeStyle$Companion;", "", "<init>", "()V", "Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeStyle;", "default$uni_release", "(LS0/k;I)Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeStyle;", "default", "neutralPrimary", "neutralSecondary", "neutralTertiary", "neutralStaticPrimary", "warningPrimary", "warningSecondary", "negativePrimary", "negativeSecondary", "positivePrimary", "positiveSecondary", "actionPrimary", "actionSecondary", "sellerBonusLight", "sellerBonusDark", "digitalGoodsLight", "digitalGoodsDark", "promotionalFirstLight", "promotionalFirstDark", "ozonCareLight", "ozonCareDark", "preOrderLight", "preOrderDark", "newLight", "newDark", "bestsellerLight", "bestsellerDark", "tSRCertificateLight", "tSRCertificateDark", "ozonAdsLight", "ozonAdsDark", "paymentAfterFittingLight", "paymentAfterFittingDark", "pointsForReviewsLight", "pointsForReviewsDark", "cashPaymentLight", "cashPaymentDark", "audioLight", "audioDark", "originalProductLight", "originalProductDark", "outOfStockLight", "outOfStockDark", "bigPromo", "rating", "premiumPlus", "Ll1/Q;", "background", "Ll1/Z;", "textColor", "leftIconColor", "rightIconColor", "custom-EtIuwbw", "(Ll1/Q;JJJLS0/k;I)Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeStyle;", "custom", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DsBadgeStyle actionPrimary(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(1196298168);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgActionPrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicSecondaryOnDark(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle actionSecondary(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-1187520634);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgActionSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextAction(), uniTheme.getColors(interfaceC3967k, i12).getGraphicActionPrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicActionPrimary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle audioDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(306917688);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgDarkKey()), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryOnDark(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle audioLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-1718270744);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextSecondary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicSecondary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle bestsellerDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-122220433);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgWarningPrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle bestsellerLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-2136650607);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgWarningSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextWarning(), uniTheme.getColors(interfaceC3967k, i12).getGraphicWarningPrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicWarningPrimary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle bigPromo(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(1629970233);
            UniTheme uniTheme = UniTheme.INSTANCE;
            AbstractC7799Q gradient = TokensExtKt.getGradient(uniTheme.getGradients().getGrSale(), interfaceC3967k, UniGradientToken.$stable);
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(gradient, uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle cashPaymentDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(496350299);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgNegativePrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle cashPaymentLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-140827099);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgNegativeSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextNegative(), uniTheme.getColors(interfaceC3967k, i12).getGraphicNegativePrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicNegativePrimary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        /* renamed from: custom-EtIuwbw, reason: not valid java name */
        public final DsBadgeStyle m1679customEtIuwbw(@NotNull AbstractC7799Q background, long j11, long j12, long j13, InterfaceC3967k interfaceC3967k, int i11) {
            Intrinsics.checkNotNullParameter(background, "background");
            interfaceC3967k.o(-1242380060);
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(background, j11, j12, j13, null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle default$uni_release(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-1370787709);
            DsBadgeStyle neutralPrimary = neutralPrimary(interfaceC3967k, i11 & 14);
            interfaceC3967k.k();
            return neutralPrimary;
        }

        @NotNull
        public final DsBadgeStyle digitalGoodsDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(1303646228);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgDarkKey()), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryOnDark(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle digitalGoodsLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-884457076);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextSecondary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicSecondary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle negativePrimary(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(767484471);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgNegativePrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicSecondaryOnDark(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle negativeSecondary(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-960623035);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgNegativeSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextNegative(), uniTheme.getColors(interfaceC3967k, i12).getGraphicNegativePrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicNegativePrimary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle neutralPrimary(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-1100128019);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextPrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle neutralSecondary(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-439896197);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextSecondary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle neutralStaticPrimary(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(1739848891);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getClearDarkKey700()), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle neutralTertiary(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(971549835);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getLayerFloor3()), uniTheme.getColors(interfaceC3967k, i12).getTextSecondary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle newDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(345903918);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgPositivePrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle newLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-509697614);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgPositiveSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextPositive(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPositivePrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPositivePrimary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle originalProductDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(157512368);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgPositivePrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle originalProductLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-2054868368);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgPositiveSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextPositive(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPositivePrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPositivePrimary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle outOfStockDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(636589377);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgDarkKey()), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryOnDark(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle outOfStockLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-88382977);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextSecondary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicSecondary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicSecondary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle ozonAdsDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-29337528);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgPremiumPrimaryInverted()), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryInverted(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPrimaryInverted(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPrimaryInverted(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle ozonAdsLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(742719448);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgPrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextPremium(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPremium(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPremium(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle ozonCareDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-42072297);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getGraphicActionOnDark()), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle ozonCareLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(347941609);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgActionSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextActionOnDark(), uniTheme.getColors(interfaceC3967k, i12).getGraphicActionOnDark(), uniTheme.getColors(interfaceC3967k, i12).getGraphicActionOnDark(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle paymentAfterFittingDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-1490925755);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgDarkKey()), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryOnDark(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle paymentAfterFittingLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-1616842629);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgPrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextPremium(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPremium(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPremium(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle pointsForReviewsDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(90385981);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgMarketingPrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle pointsForReviewsLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(159180931);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgMarketingSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextMarketing(), uniTheme.getColors(interfaceC3967k, i12).getGraphicMarketing(), uniTheme.getColors(interfaceC3967k, i12).getGraphicMarketing(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle positivePrimary(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-70635525);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgPositivePrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicSecondaryOnDark(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle positiveSecondary(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(1059912457);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgPositiveSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextPositive(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPositivePrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPositivePrimary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle preOrderDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-1816335897);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgDarkKey()), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryOnDark(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle preOrderLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(1180344857);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgPrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextPremium(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPremium(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPremium(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle premiumPlus(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-1319371469);
            UniTheme uniTheme = UniTheme.INSTANCE;
            AbstractC7799Q gradient = TokensExtKt.getGradient(uniTheme.getGradients().getGrPremiumPlus(), interfaceC3967k, UniGradientToken.$stable);
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(gradient, uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle promotionalFirstDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(1108628080);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(TokensExtKt.getGradient(uniTheme.getGradients().getGrMarketingPrimary(), interfaceC3967k, UniGradientToken.$stable), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle promotionalFirstLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(1659914928);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgMarketingSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextMarketing(), uniTheme.getColors(interfaceC3967k, i12).getGraphicMarketing(), uniTheme.getColors(interfaceC3967k, i12).getGraphicMarketing(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle rating(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(1432819147);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryOnDark()), uniTheme.getColors(interfaceC3967k, i12).getTextSecondaryOnLight(), uniTheme.getColors(interfaceC3967k, i12).getGraphicRating(), uniTheme.getColors(interfaceC3967k, i12).getGraphicSecondary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle sellerBonusDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-1288421650);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgMarketingPrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle sellerBonusLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(365817330);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgMarketingSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextMarketing(), uniTheme.getColors(interfaceC3967k, i12).getGraphicMarketing(), uniTheme.getColors(interfaceC3967k, i12).getGraphicMarketing(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle tSRCertificateDark(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(852765614);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgFreshPrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), uniTheme.getColors(interfaceC3967k, i12).getGraphicLightKey(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle tSRCertificateLight(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-1976854222);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgFreshSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextFresh(), uniTheme.getColors(interfaceC3967k, i12).getGraphicFresh(), uniTheme.getColors(interfaceC3967k, i12).getGraphicFresh(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle warningPrimary(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-950885694);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgWarningPrimary()), uniTheme.getColors(interfaceC3967k, i12).getTextPrimaryOnLight(), uniTheme.getColors(interfaceC3967k, i12).getGraphicPrimaryOnLight(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiaryOnLight(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        @NotNull
        public final DsBadgeStyle warningSecondary(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(1248057360);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            DsBadgeStyle dsBadgeStyle = new DsBadgeStyle(new K0(uniTheme.getColors(interfaceC3967k, i12).getBgWarningSecondary()), uniTheme.getColors(interfaceC3967k, i12).getTextWarning(), uniTheme.getColors(interfaceC3967k, i12).getGraphicWarningPrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicWarningPrimary(), null);
            interfaceC3967k.k();
            return dsBadgeStyle;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DsBadgeStyle(AbstractC7799Q abstractC7799Q, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC7799Q, j11, j12, j13);
    }

    @NotNull
    /* renamed from: getBackground$uni_release, reason: from getter */
    public final AbstractC7799Q getBackground() {
        return this.background;
    }

    /* renamed from: getLeftIconColor-0d7_KjU$uni_release, reason: not valid java name and from getter */
    public final long getLeftIconColor() {
        return this.leftIconColor;
    }

    /* renamed from: getRightIconColor-0d7_KjU$uni_release, reason: not valid java name and from getter */
    public final long getRightIconColor() {
        return this.rightIconColor;
    }

    /* renamed from: getTextColor-0d7_KjU$uni_release, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    private DsBadgeStyle(AbstractC7799Q abstractC7799Q, long j11, long j12, long j13) {
        this.background = abstractC7799Q;
        this.textColor = j11;
        this.leftIconColor = j12;
        this.rightIconColor = j13;
    }
}
