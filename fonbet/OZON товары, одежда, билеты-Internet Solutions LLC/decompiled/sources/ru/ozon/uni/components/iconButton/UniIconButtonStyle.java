package ru.ozon.uni.components.iconButton;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t\u0082\u0001\b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/uni/components/iconButton/UniIconButtonStyle;", "", "Lru/ozon/uni/components/iconButton/UniIconButtonColors;", "enabled", "disabled", "<init>", "(Lru/ozon/uni/components/iconButton/UniIconButtonColors;Lru/ozon/uni/components/iconButton/UniIconButtonColors;)V", "Lru/ozon/uni/components/iconButton/UniIconButtonColors;", "getEnabled$uni_release", "()Lru/ozon/uni/components/iconButton/UniIconButtonColors;", "getDisabled$uni_release", "ActionPrimary", "ActionSecondary", "AccentPrimary", "AccentSecondary", "NeutralSecondary", "NeutralTransparent", "Negative", "Custom", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle$AccentPrimary;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle$AccentSecondary;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle$ActionPrimary;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle$ActionSecondary;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle$Custom;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle$Negative;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle$NeutralSecondary;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle$NeutralTransparent;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UniIconButtonStyle {

    @NotNull
    private final UniIconButtonColors disabled;

    @NotNull
    private final UniIconButtonColors enabled;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/iconButton/UniIconButtonStyle$AccentPrimary;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccentPrimary extends UniIconButtonStyle {

        @NotNull
        public static final AccentPrimary INSTANCE = new AccentPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private AccentPrimary() {
            super(new UniIconButtonColors(DeferredBrush.m3256constructorimpl(r1.getColorTokens().getBgAccentPrimary()), DeferredBrush.m3256constructorimpl(r1.getColorTokens().getGraphicPrimaryOnDark()), DeferredColor.m3262constructorimpl(r1.getColorTokens().getGraphicLightKey()), (C7807Z) null, 8, (DefaultConstructorMarker) null), null, 2, 0 == true ? 1 : 0);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AccentPrimary);
        }

        public int hashCode() {
            return -1471209886;
        }

        @NotNull
        public String toString() {
            return "AccentPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/iconButton/UniIconButtonStyle$AccentSecondary;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccentSecondary extends UniIconButtonStyle {

        @NotNull
        public static final AccentSecondary INSTANCE = new AccentSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private AccentSecondary() {
            super(new UniIconButtonColors(DeferredBrush.m3256constructorimpl(r1.getColorTokens().getBgAccentSecondary()), DeferredBrush.m3256constructorimpl(r1.getColorTokens().getGraphicAccentPrimary()), DeferredColor.m3262constructorimpl(r1.getColorTokens().getGraphicAccentPrimary()), (C7807Z) null, 8, (DefaultConstructorMarker) null), null, 2, 0 == true ? 1 : 0);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AccentSecondary);
        }

        public int hashCode() {
            return 236186068;
        }

        @NotNull
        public String toString() {
            return "AccentSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/iconButton/UniIconButtonStyle$ActionPrimary;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionPrimary extends UniIconButtonStyle {

        @NotNull
        public static final ActionPrimary INSTANCE = new ActionPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionPrimary() {
            super(new UniIconButtonColors(DeferredBrush.m3256constructorimpl(r1.getColorTokens().getBgActionPrimary()), DeferredBrush.m3256constructorimpl(r1.getColorTokens().getGraphicSecondaryDynamic()), DeferredColor.m3262constructorimpl(r1.getColorTokens().getGraphicPrimaryDynamic()), (C7807Z) null, 8, (DefaultConstructorMarker) null), null, 2, 0 == true ? 1 : 0);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionPrimary);
        }

        public int hashCode() {
            return -2120080522;
        }

        @NotNull
        public String toString() {
            return "ActionPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/iconButton/UniIconButtonStyle$ActionSecondary;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionSecondary extends UniIconButtonStyle {

        @NotNull
        public static final ActionSecondary INSTANCE = new ActionSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionSecondary() {
            super(new UniIconButtonColors(DeferredBrush.m3256constructorimpl(r1.getColorTokens().getBgActionSecondary()), DeferredBrush.m3256constructorimpl(r1.getColorTokens().getGraphicActionPrimary()), DeferredColor.m3262constructorimpl(r1.getColorTokens().getGraphicActionPrimary()), (C7807Z) null, 8, (DefaultConstructorMarker) null), null, 2, 0 == true ? 1 : 0);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionSecondary);
        }

        public int hashCode() {
            return -558237208;
        }

        @NotNull
        public String toString() {
            return "ActionSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/iconButton/UniIconButtonStyle$Negative;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Negative extends UniIconButtonStyle {

        @NotNull
        public static final Negative INSTANCE = new Negative();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Negative() {
            super(new UniIconButtonColors(DeferredBrush.m3256constructorimpl(r1.getColorTokens().getBgNegativeSecondary()), DeferredBrush.m3256constructorimpl(r1.getColorTokens().getGraphicNegativePrimary()), DeferredColor.m3262constructorimpl(r1.getColorTokens().getGraphicNegativePrimary()), (C7807Z) null, 8, (DefaultConstructorMarker) null), null, 2, 0 == true ? 1 : 0);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Negative);
        }

        public int hashCode() {
            return -1844012693;
        }

        @NotNull
        public String toString() {
            return "Negative";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/iconButton/UniIconButtonStyle$NeutralSecondary;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeutralSecondary extends UniIconButtonStyle {

        @NotNull
        public static final NeutralSecondary INSTANCE = new NeutralSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NeutralSecondary() {
            super(new UniIconButtonColors(DeferredBrush.m3256constructorimpl(r1.getColorTokens().getBgSecondary()), DeferredBrush.m3256constructorimpl(r1.getColorTokens().getGraphicTertiary()), DeferredColor.m3262constructorimpl(r1.getColorTokens().getGraphicTertiary()), (C7807Z) null, 8, (DefaultConstructorMarker) null), null, 2, 0 == true ? 1 : 0);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeutralSecondary);
        }

        public int hashCode() {
            return -1892549981;
        }

        @NotNull
        public String toString() {
            return "NeutralSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/iconButton/UniIconButtonStyle$NeutralTransparent;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeutralTransparent extends UniIconButtonStyle {

        @NotNull
        public static final NeutralTransparent INSTANCE = new NeutralTransparent();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NeutralTransparent() {
            super(r0, new UniIconButtonColors(DeferredBrush.m3253constructorimpl(r1), DeferredBrush.m3256constructorimpl(r7.getColorTokens().getGraphicTertiary()), DeferredColor.m3262constructorimpl(r7.getColorTokens().getGraphicTertiary()), (C7807Z) null, 8, (DefaultConstructorMarker) null), null);
            long j11;
            UniTheme uniTheme = UniTheme.INSTANCE;
            UniIconButtonColors uniIconButtonColors = new UniIconButtonColors(DeferredBrush.m3256constructorimpl(uniTheme.getColorTokens().getClearLightKey0()), DeferredBrush.m3256constructorimpl(uniTheme.getColorTokens().getGraphicTertiary()), DeferredColor.m3262constructorimpl(uniTheme.getColorTokens().getGraphicTertiary()), (C7807Z) null, 8, (DefaultConstructorMarker) null);
            int i11 = C7807Z.f72260n;
            j11 = C7807Z.f72258l;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeutralTransparent);
        }

        public int hashCode() {
            return 332158657;
        }

        @NotNull
        public String toString() {
            return "NeutralTransparent";
        }
    }

    public /* synthetic */ UniIconButtonStyle(UniIconButtonColors uniIconButtonColors, UniIconButtonColors uniIconButtonColors2, DefaultConstructorMarker defaultConstructorMarker) {
        this(uniIconButtonColors, uniIconButtonColors2);
    }

    @NotNull
    /* renamed from: getDisabled$uni_release, reason: from getter */
    public final UniIconButtonColors getDisabled() {
        return this.disabled;
    }

    @NotNull
    /* renamed from: getEnabled$uni_release, reason: from getter */
    public final UniIconButtonColors getEnabled() {
        return this.enabled;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/components/iconButton/UniIconButtonStyle$Custom;", "Lru/ozon/uni/components/iconButton/UniIconButtonStyle;", "Lru/ozon/uni/components/iconButton/UniIconButtonColors;", "enabledColors", "disabledColors", "<init>", "(Lru/ozon/uni/components/iconButton/UniIconButtonColors;Lru/ozon/uni/components/iconButton/UniIconButtonColors;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/components/iconButton/UniIconButtonColors;", "getEnabledColors$uni_release", "()Lru/ozon/uni/components/iconButton/UniIconButtonColors;", "getDisabledColors$uni_release", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Custom extends UniIconButtonStyle {
        public static final int $stable = 0;

        @NotNull
        private final UniIconButtonColors disabledColors;

        @NotNull
        private final UniIconButtonColors enabledColors;

        public /* synthetic */ Custom(UniIconButtonColors uniIconButtonColors, UniIconButtonColors uniIconButtonColors2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(uniIconButtonColors, (i11 & 2) != 0 ? UniIconButtonColors.INSTANCE.getDefaultDisabledColors() : uniIconButtonColors2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) other;
            return Intrinsics.d(this.enabledColors, custom.enabledColors) && Intrinsics.d(this.disabledColors, custom.disabledColors);
        }

        public int hashCode() {
            return this.disabledColors.hashCode() + (this.enabledColors.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Custom(enabledColors=" + this.enabledColors + ", disabledColors=" + this.disabledColors + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(@NotNull UniIconButtonColors enabledColors, @NotNull UniIconButtonColors disabledColors) {
            super(enabledColors, disabledColors, null);
            Intrinsics.checkNotNullParameter(enabledColors, "enabledColors");
            Intrinsics.checkNotNullParameter(disabledColors, "disabledColors");
            this.enabledColors = enabledColors;
            this.disabledColors = disabledColors;
        }
    }

    private UniIconButtonStyle(UniIconButtonColors uniIconButtonColors, UniIconButtonColors uniIconButtonColors2) {
        this.enabled = uniIconButtonColors;
        this.disabled = uniIconButtonColors2;
    }

    public /* synthetic */ UniIconButtonStyle(UniIconButtonColors uniIconButtonColors, UniIconButtonColors uniIconButtonColors2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(uniIconButtonColors, (i11 & 2) != 0 ? UniIconButtonColors.INSTANCE.getDefaultDisabledColors() : uniIconButtonColors2, null);
    }
}
