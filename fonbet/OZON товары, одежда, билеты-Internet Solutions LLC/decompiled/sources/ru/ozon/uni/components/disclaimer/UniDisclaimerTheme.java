package ru.ozon.uni.components.disclaimer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.DeferredColor;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0017B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f\u0082\u0001\u0006\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme;", "", "Lru/ozon/uni/utils/DeferredColor;", "backgroundColor", "activeBackgroundColor", "Lru/ozon/uni/core/models/UniIconToken;", "icon", "iconColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lru/ozon/uni/core/models/UniIconToken;Ljava/lang/Object;)V", "Ljava/lang/Object;", "getBackgroundColor-e_QkOiY$uni_release", "()Ljava/lang/Object;", "getActiveBackgroundColor-e_QkOiY$uni_release", "Lru/ozon/uni/core/models/UniIconToken;", "getIcon$uni_release", "()Lru/ozon/uni/core/models/UniIconToken;", "getIconColor-e_QkOiY$uni_release", "Neutral", "Info", "Positive", "Warning", "Negative", "Marketing", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme$Info;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme$Marketing;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme$Negative;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme$Neutral;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme$Positive;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme$Warning;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UniDisclaimerTheme {

    @NotNull
    private final Object activeBackgroundColor;

    @NotNull
    private final Object backgroundColor;

    @NotNull
    private final UniIconToken icon;

    @NotNull
    private final Object iconColor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme$Info;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Info extends UniDisclaimerTheme {

        @NotNull
        public static final Info INSTANCE = new Info();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Info() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgActionSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgActiveActionSecondary()), r0.getIconTokens().getIc_m_info_filled(), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicTertiary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Info);
        }

        public int hashCode() {
            return 642652396;
        }

        @NotNull
        public String toString() {
            return "Info";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme$Marketing;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Marketing extends UniDisclaimerTheme {

        @NotNull
        public static final Marketing INSTANCE = new Marketing();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Marketing() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgMarketingSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgActiveMarketingSecondary()), r0.getIconTokens().getIc_m_ask_for_discount_filled(), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicMarketing()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Marketing);
        }

        public int hashCode() {
            return -1512567640;
        }

        @NotNull
        public String toString() {
            return "Marketing";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme$Negative;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Negative extends UniDisclaimerTheme {

        @NotNull
        public static final Negative INSTANCE = new Negative();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Negative() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgNegativeSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgActiveNegativeSecondary()), r0.getIconTokens().getIc_m_danger_filled(), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicNegativePrimary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Negative);
        }

        public int hashCode() {
            return -621579917;
        }

        @NotNull
        public String toString() {
            return "Negative";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme$Neutral;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Neutral extends UniDisclaimerTheme {

        @NotNull
        public static final Neutral INSTANCE = new Neutral();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Neutral() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgActiveSecondary()), r0.getIconTokens().getIc_m_info_filled(), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicTertiary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Neutral);
        }

        public int hashCode() {
            return -1807673143;
        }

        @NotNull
        public String toString() {
            return "Neutral";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme$Positive;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Positive extends UniDisclaimerTheme {

        @NotNull
        public static final Positive INSTANCE = new Positive();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Positive() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgPositiveSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgActivePositiveSecondary()), r0.getIconTokens().getIc_m_confirmed_filled(), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicPositivePrimary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Positive);
        }

        public int hashCode() {
            return -794886345;
        }

        @NotNull
        public String toString() {
            return "Positive";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme$Warning;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerTheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Warning extends UniDisclaimerTheme {

        @NotNull
        public static final Warning INSTANCE = new Warning();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Warning() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgWarningSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgActiveWarningSecondary()), r0.getIconTokens().getIc_m_danger_filled(), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicWarningPrimary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Warning);
        }

        public int hashCode() {
            return 1767418526;
        }

        @NotNull
        public String toString() {
            return "Warning";
        }
    }

    public /* synthetic */ UniDisclaimerTheme(Object obj, Object obj2, UniIconToken uniIconToken, Object obj3, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, uniIconToken, obj3);
    }

    @NotNull
    /* renamed from: getActiveBackgroundColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getActiveBackgroundColor() {
        return this.activeBackgroundColor;
    }

    @NotNull
    /* renamed from: getBackgroundColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: getIcon$uni_release, reason: from getter */
    public final UniIconToken getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: getIconColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getIconColor() {
        return this.iconColor;
    }

    private UniDisclaimerTheme(Object backgroundColor, Object activeBackgroundColor, UniIconToken icon, Object iconColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(activeBackgroundColor, "activeBackgroundColor");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        this.backgroundColor = backgroundColor;
        this.activeBackgroundColor = activeBackgroundColor;
        this.icon = icon;
        this.iconColor = iconColor;
    }
}
