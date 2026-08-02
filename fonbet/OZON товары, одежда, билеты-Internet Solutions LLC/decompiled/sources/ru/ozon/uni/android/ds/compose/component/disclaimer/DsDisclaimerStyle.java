package ru.ozon.uni.android.ds.compose.component.disclaimer;

import Pk0.c;
import S0.InterfaceC3967k;
import Sc.C;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b \u0010\u0017¨\u0006\""}, d2 = {"Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerStyle;", "", "Ll1/Z;", "backgroundColor", "titleColor", "subtitleColor", "Lq1/b;", "icon", "iconColor", "iconCrossColor", "iconChevronColor", "hoverColor", "<init>", "(JJJLq1/b;JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getBackgroundColor-0d7_KjU", "()J", "getTitleColor-0d7_KjU", "getSubtitleColor-0d7_KjU", "Lq1/b;", "getIcon", "()Lq1/b;", "getIconColor-0d7_KjU", "getIconCrossColor-0d7_KjU", "getIconChevronColor-0d7_KjU", "getHoverColor-0d7_KjU", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsDisclaimerStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long backgroundColor;
    private final long hoverColor;

    @NotNull
    private final AbstractC8972b icon;
    private final long iconChevronColor;
    private final long iconColor;
    private final long iconCrossColor;
    private final long subtitleColor;
    private final long titleColor;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerStyle$Companion;", "", "<init>", "()V", "Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerStyle;", "neutral", "(LS0/k;I)Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerStyle;", "positive", "warning", "negative", "marketing", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DsDisclaimerStyle marketing(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-1606872436);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            long bgMarketingSecondary = uniTheme.getColors(interfaceC3967k, i12).getBgMarketingSecondary();
            long textPrimary = uniTheme.getColors(interfaceC3967k, i12).getTextPrimary();
            long textSecondary = uniTheme.getColors(interfaceC3967k, i12).getTextSecondary();
            uniTheme.getIcons();
            interfaceC3967k.B(1944553699);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_ask_for_discount_filled, "ic_m_ask_for_discount_filled", interfaceC3967k, 48);
            interfaceC3967k.K();
            DsDisclaimerStyle dsDisclaimerStyle = new DsDisclaimerStyle(bgMarketingSecondary, textPrimary, textSecondary, uniPainterResource, uniTheme.getColors(interfaceC3967k, i12).getGraphicMarketing(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getBgActiveMarketingSecondary(), null);
            interfaceC3967k.k();
            return dsDisclaimerStyle;
        }

        @NotNull
        public final DsDisclaimerStyle negative(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-297758975);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            long bgNegativeSecondary = uniTheme.getColors(interfaceC3967k, i12).getBgNegativeSecondary();
            long textPrimary = uniTheme.getColors(interfaceC3967k, i12).getTextPrimary();
            long textSecondary = uniTheme.getColors(interfaceC3967k, i12).getTextSecondary();
            uniTheme.getIcons();
            interfaceC3967k.B(-2128284421);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_octahedron_cancel_filled, "ic_m_octahedron_cancel_filled", interfaceC3967k, 48);
            interfaceC3967k.K();
            DsDisclaimerStyle dsDisclaimerStyle = new DsDisclaimerStyle(bgNegativeSecondary, textPrimary, textSecondary, uniPainterResource, uniTheme.getColors(interfaceC3967k, i12).getGraphicNegativePrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getBgActiveNegativeSecondary(), null);
            interfaceC3967k.k();
            return dsDisclaimerStyle;
        }

        @NotNull
        public final DsDisclaimerStyle neutral(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(624699403);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            long bgSecondary = uniTheme.getColors(interfaceC3967k, i12).getBgSecondary();
            long textPrimary = uniTheme.getColors(interfaceC3967k, i12).getTextPrimary();
            long textSecondary = uniTheme.getColors(interfaceC3967k, i12).getTextSecondary();
            uniTheme.getIcons();
            interfaceC3967k.B(-618687229);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_info_filled, "ic_m_info_filled", interfaceC3967k, 48);
            interfaceC3967k.K();
            DsDisclaimerStyle dsDisclaimerStyle = new DsDisclaimerStyle(bgSecondary, textPrimary, textSecondary, uniPainterResource, uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getBgActiveSecondary(), null);
            interfaceC3967k.k();
            return dsDisclaimerStyle;
        }

        @NotNull
        public final DsDisclaimerStyle positive(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(763936701);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            long bgPositiveSecondary = uniTheme.getColors(interfaceC3967k, i12).getBgPositiveSecondary();
            long textPrimary = uniTheme.getColors(interfaceC3967k, i12).getTextPrimary();
            long textSecondary = uniTheme.getColors(interfaceC3967k, i12).getTextSecondary();
            uniTheme.getIcons();
            interfaceC3967k.B(-1238607463);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_confirmed_filled, "ic_m_confirmed_filled", interfaceC3967k, 48);
            interfaceC3967k.K();
            DsDisclaimerStyle dsDisclaimerStyle = new DsDisclaimerStyle(bgPositiveSecondary, textPrimary, textSecondary, uniPainterResource, uniTheme.getColors(interfaceC3967k, i12).getGraphicPositivePrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getBgActivePositiveSecondary(), null);
            interfaceC3967k.k();
            return dsDisclaimerStyle;
        }

        @NotNull
        public final DsDisclaimerStyle warning(InterfaceC3967k interfaceC3967k, int i11) {
            interfaceC3967k.o(-1238284202);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i12 = UniTheme.$stable;
            long bgWarningSecondary = uniTheme.getColors(interfaceC3967k, i12).getBgWarningSecondary();
            long textPrimary = uniTheme.getColors(interfaceC3967k, i12).getTextPrimary();
            long textSecondary = uniTheme.getColors(interfaceC3967k, i12).getTextSecondary();
            uniTheme.getIcons();
            interfaceC3967k.B(-119644701);
            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_danger_filled, "ic_m_danger_filled", interfaceC3967k, 48);
            interfaceC3967k.K();
            DsDisclaimerStyle dsDisclaimerStyle = new DsDisclaimerStyle(bgWarningSecondary, textPrimary, textSecondary, uniPainterResource, uniTheme.getColors(interfaceC3967k, i12).getGraphicWarningPrimary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getGraphicTertiary(), uniTheme.getColors(interfaceC3967k, i12).getBgActiveWarningSecondary(), null);
            interfaceC3967k.k();
            return dsDisclaimerStyle;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DsDisclaimerStyle(long j11, long j12, long j13, AbstractC8972b abstractC8972b, long j14, long j15, long j16, long j17, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, abstractC8972b, j14, j15, j16, j17);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DsDisclaimerStyle.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.uni.android.ds.compose.component.disclaimer.DsDisclaimerStyle");
        DsDisclaimerStyle dsDisclaimerStyle = (DsDisclaimerStyle) other;
        return C7807Z.p(this.backgroundColor, dsDisclaimerStyle.backgroundColor) && C7807Z.p(this.titleColor, dsDisclaimerStyle.titleColor) && C7807Z.p(this.subtitleColor, dsDisclaimerStyle.subtitleColor) && Intrinsics.d(this.icon, dsDisclaimerStyle.icon) && C7807Z.p(this.iconColor, dsDisclaimerStyle.iconColor) && C7807Z.p(this.iconCrossColor, dsDisclaimerStyle.iconCrossColor) && C7807Z.p(this.iconChevronColor, dsDisclaimerStyle.iconChevronColor) && C7807Z.p(this.hoverColor, dsDisclaimerStyle.hoverColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getHoverColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getHoverColor() {
        return this.hoverColor;
    }

    @NotNull
    public final AbstractC8972b getIcon() {
        return this.icon;
    }

    /* renamed from: getIconChevronColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getIconChevronColor() {
        return this.iconChevronColor;
    }

    /* renamed from: getIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getIconColor() {
        return this.iconColor;
    }

    /* renamed from: getIconCrossColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getIconCrossColor() {
        return this.iconCrossColor;
    }

    /* renamed from: getSubtitleColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSubtitleColor() {
        return this.subtitleColor;
    }

    /* renamed from: getTitleColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        long j11 = this.backgroundColor;
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.hoverColor) + c.a(c.a(c.a((this.icon.hashCode() + c.a(c.a(Long.hashCode(j11) * 31, 31, this.titleColor), 31, this.subtitleColor)) * 31, 31, this.iconColor), 31, this.iconCrossColor), 31, this.iconChevronColor);
    }

    private DsDisclaimerStyle(long j11, long j12, long j13, AbstractC8972b icon, long j14, long j15, long j16, long j17) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.backgroundColor = j11;
        this.titleColor = j12;
        this.subtitleColor = j13;
        this.icon = icon;
        this.iconColor = j14;
        this.iconCrossColor = j15;
        this.iconChevronColor = j16;
        this.hoverColor = j17;
    }
}
