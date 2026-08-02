package ru.ozon.uni.android.ds.compose.component.button;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme;", "", "backgroundColor", "Lru/ozon/uni/core/models/UniColorToken;", "iconColor", "<init>", "(Lru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/core/models/UniColorToken;)V", "getBackgroundColor", "()Lru/ozon/uni/core/models/UniColorToken;", "getIconColor", "Disabled", "ActionPrimary", "ActionSecondary", "AccentPrimary", "AccentSecondary", "Negative", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme$AccentPrimary;", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme$AccentSecondary;", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme$ActionPrimary;", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme$ActionSecondary;", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme$Disabled;", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme$Negative;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DsIconButtonColorScheme {

    @NotNull
    private final UniColorToken backgroundColor;

    @NotNull
    private final UniColorToken iconColor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme$AccentPrimary;", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class AccentPrimary extends DsIconButtonColorScheme {

        @NotNull
        public static final AccentPrimary INSTANCE = new AccentPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private AccentPrimary() {
            super(r0.getColorTokens().getBgAccentPrimary(), r0.getColorTokens().getGraphicPrimaryOnDark(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AccentPrimary);
        }

        public int hashCode() {
            return -1595613102;
        }

        @NotNull
        public String toString() {
            return "AccentPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme$AccentSecondary;", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class AccentSecondary extends DsIconButtonColorScheme {

        @NotNull
        public static final AccentSecondary INSTANCE = new AccentSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private AccentSecondary() {
            super(r0.getColorTokens().getBgAccentSecondary(), r0.getColorTokens().getGraphicAccentPrimary(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AccentSecondary);
        }

        public int hashCode() {
            return 943779780;
        }

        @NotNull
        public String toString() {
            return "AccentSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme$ActionPrimary;", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionPrimary extends DsIconButtonColorScheme {

        @NotNull
        public static final ActionPrimary INSTANCE = new ActionPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionPrimary() {
            super(r0.getColorTokens().getBgActionPrimary(), r0.getColorTokens().getGraphicSecondaryDynamic(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionPrimary);
        }

        public int hashCode() {
            return 2050483558;
        }

        @NotNull
        public String toString() {
            return "ActionPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme$ActionSecondary;", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class ActionSecondary extends DsIconButtonColorScheme {

        @NotNull
        public static final ActionSecondary INSTANCE = new ActionSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionSecondary() {
            super(r0.getColorTokens().getBgActionSecondary(), r0.getColorTokens().getGraphicActionPrimary(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionSecondary);
        }

        public int hashCode() {
            return 149356504;
        }

        @NotNull
        public String toString() {
            return "ActionSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme$Disabled;", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class Disabled extends DsIconButtonColorScheme {

        @NotNull
        public static final Disabled INSTANCE = new Disabled();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Disabled() {
            super(r0.getColorTokens().getBgSecondary(), r0.getColorTokens().getGraphicTertiary(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Disabled);
        }

        public int hashCode() {
            return 2143981506;
        }

        @NotNull
        public String toString() {
            return "Disabled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme$Negative;", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonColorScheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class Negative extends DsIconButtonColorScheme {

        @NotNull
        public static final Negative INSTANCE = new Negative();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Negative() {
            super(r0.getColorTokens().getBgNegativeSecondary(), r0.getColorTokens().getGraphicNegativePrimary(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Negative);
        }

        public int hashCode() {
            return -1500814981;
        }

        @NotNull
        public String toString() {
            return "Negative";
        }
    }

    public /* synthetic */ DsIconButtonColorScheme(UniColorToken uniColorToken, UniColorToken uniColorToken2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uniColorToken, uniColorToken2);
    }

    @NotNull
    public final UniColorToken getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final UniColorToken getIconColor() {
        return this.iconColor;
    }

    private DsIconButtonColorScheme(UniColorToken uniColorToken, UniColorToken uniColorToken2) {
        this.backgroundColor = uniColorToken;
        this.iconColor = uniColorToken2;
    }
}
