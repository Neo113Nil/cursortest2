package ru.ozon.uni.android.ds.compose.component.button;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018B9\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme;", "", "backgroundColor", "Lru/ozon/uni/core/models/UniColorToken;", "titleTextColor", "subtitleTextColor", "iconColor", "dataBackgroundColor", "dataTextColor", "<init>", "(Lru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/core/models/UniColorToken;Lru/ozon/uni/core/models/UniColorToken;)V", "getBackgroundColor", "()Lru/ozon/uni/core/models/UniColorToken;", "getTitleTextColor", "getSubtitleTextColor", "getIconColor", "getDataBackgroundColor", "getDataTextColor", "Disabled", "ActionPrimary", "ActionSecondary", "AccentPrimary", "AccentSecondary", "Negative", "NeutralSecondary", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$AccentPrimary;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$AccentSecondary;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$ActionPrimary;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$ActionSecondary;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$Disabled;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$Negative;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$NeutralSecondary;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class DsButtonColorScheme {

    @NotNull
    private final UniColorToken backgroundColor;

    @NotNull
    private final UniColorToken dataBackgroundColor;

    @NotNull
    private final UniColorToken dataTextColor;

    @NotNull
    private final UniColorToken iconColor;

    @NotNull
    private final UniColorToken subtitleTextColor;

    @NotNull
    private final UniColorToken titleTextColor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$AccentPrimary;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class AccentPrimary extends DsButtonColorScheme {

        @NotNull
        public static final AccentPrimary INSTANCE = new AccentPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private AccentPrimary() {
            super(r0.getColorTokens().getBgAccentPrimary(), r0.getColorTokens().getTextLightKey(), r0.getColorTokens().getTextPrimaryOnDark(), r0.getColorTokens().getGraphicPrimaryOnDark(), r0.getColorTokens().getClearLightKey400(), r0.getColorTokens().getTextLightKey(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AccentPrimary);
        }

        public int hashCode() {
            return -1187110517;
        }

        @NotNull
        public String toString() {
            return "AccentPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$AccentSecondary;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class AccentSecondary extends DsButtonColorScheme {

        @NotNull
        public static final AccentSecondary INSTANCE = new AccentSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private AccentSecondary() {
            super(r0.getColorTokens().getBgAccentSecondary(), r0.getColorTokens().getTextAccent(), r0.getColorTokens().getTextAccent(), r0.getColorTokens().getGraphicAccentPrimary(), r0.getColorTokens().getBgAccentSecondary(), r0.getColorTokens().getTextAccent(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AccentSecondary);
        }

        public int hashCode() {
            return -1622227267;
        }

        @NotNull
        public String toString() {
            return "AccentSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$ActionPrimary;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionPrimary extends DsButtonColorScheme {

        @NotNull
        public static final ActionPrimary INSTANCE = new ActionPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionPrimary() {
            super(r0.getColorTokens().getBgActionPrimary(), r0.getColorTokens().getTextPrimaryDynamic(), r0.getColorTokens().getTextSecondaryDynamic(), r0.getColorTokens().getGraphicSecondaryDynamic(), r0.getColorTokens().getBgSecondaryDynamic(), r0.getColorTokens().getTextPrimaryDynamic(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionPrimary);
        }

        public int hashCode() {
            return -1835981153;
        }

        @NotNull
        public String toString() {
            return "ActionPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$ActionSecondary;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class ActionSecondary extends DsButtonColorScheme {

        @NotNull
        public static final ActionSecondary INSTANCE = new ActionSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionSecondary() {
            super(r0.getColorTokens().getBgActionSecondary(), r0.getColorTokens().getTextAction(), r0.getColorTokens().getTextAction(), r0.getColorTokens().getGraphicActionPrimary(), r0.getColorTokens().getBgActionSecondary(), r0.getColorTokens().getTextAction(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionSecondary);
        }

        public int hashCode() {
            return 1878316753;
        }

        @NotNull
        public String toString() {
            return "ActionSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$Disabled;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class Disabled extends DsButtonColorScheme {

        @NotNull
        public static final Disabled INSTANCE = new Disabled();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Disabled() {
            super(r0.getColorTokens().getBgSecondary(), r0.getColorTokens().getTextPrimary(), r0.getColorTokens().getTextPrimary(), r0.getColorTokens().getGraphicTertiary(), r0.getColorTokens().getClearDarkKey100(), r0.getColorTokens().getTextPrimary(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Disabled);
        }

        public int hashCode() {
            return 1503244009;
        }

        @NotNull
        public String toString() {
            return "Disabled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$Negative;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class Negative extends DsButtonColorScheme {

        @NotNull
        public static final Negative INSTANCE = new Negative();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Negative() {
            super(r0.getColorTokens().getBgNegativeSecondary(), r0.getColorTokens().getTextNegative(), r0.getColorTokens().getTextNegative(), r0.getColorTokens().getGraphicNegativePrimary(), r0.getColorTokens().getBgNegativeSecondary(), r0.getColorTokens().getTextNegative(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Negative);
        }

        public int hashCode() {
            return -2141552478;
        }

        @NotNull
        public String toString() {
            return "Negative";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme$NeutralSecondary;", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonColorScheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class NeutralSecondary extends DsButtonColorScheme {

        @NotNull
        public static final NeutralSecondary INSTANCE = new NeutralSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NeutralSecondary() {
            super(r0.getColorTokens().getBgSecondary(), r0.getColorTokens().getTextPrimary(), r0.getColorTokens().getTextPrimary(), r0.getColorTokens().getGraphicPrimary(), r0.getColorTokens().getBgSecondary(), r0.getColorTokens().getTextPrimary(), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeutralSecondary);
        }

        public int hashCode() {
            return 626178778;
        }

        @NotNull
        public String toString() {
            return "NeutralSecondary";
        }
    }

    public /* synthetic */ DsButtonColorScheme(UniColorToken uniColorToken, UniColorToken uniColorToken2, UniColorToken uniColorToken3, UniColorToken uniColorToken4, UniColorToken uniColorToken5, UniColorToken uniColorToken6, DefaultConstructorMarker defaultConstructorMarker) {
        this(uniColorToken, uniColorToken2, uniColorToken3, uniColorToken4, uniColorToken5, uniColorToken6);
    }

    @NotNull
    public final UniColorToken getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final UniColorToken getDataBackgroundColor() {
        return this.dataBackgroundColor;
    }

    @NotNull
    public final UniColorToken getDataTextColor() {
        return this.dataTextColor;
    }

    @NotNull
    public final UniColorToken getIconColor() {
        return this.iconColor;
    }

    @NotNull
    public final UniColorToken getSubtitleTextColor() {
        return this.subtitleTextColor;
    }

    @NotNull
    public final UniColorToken getTitleTextColor() {
        return this.titleTextColor;
    }

    private DsButtonColorScheme(UniColorToken uniColorToken, UniColorToken uniColorToken2, UniColorToken uniColorToken3, UniColorToken uniColorToken4, UniColorToken uniColorToken5, UniColorToken uniColorToken6) {
        this.backgroundColor = uniColorToken;
        this.titleTextColor = uniColorToken2;
        this.subtitleTextColor = uniColorToken3;
        this.iconColor = uniColorToken4;
        this.dataBackgroundColor = uniColorToken5;
        this.dataTextColor = uniColorToken6;
    }
}
