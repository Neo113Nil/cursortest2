package ru.ozon.uni.components.badge;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000f\u0010\f\u0082\u0001\r\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle;", "", "Lru/ozon/uni/utils/DeferredBrush;", "backgroundDefBrush", "Lru/ozon/uni/utils/DeferredColor;", "labelDefColor", "startGraphicDefColor", "endGraphicDefColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/lang/Object;", "getBackgroundDefBrush-QAoP-dQ$uni_release", "()Ljava/lang/Object;", "getLabelDefColor-e_QkOiY$uni_release", "getStartGraphicDefColor-e_QkOiY$uni_release", "getEndGraphicDefColor-e_QkOiY$uni_release", "NeutralPrimary", "NeutralSecondary", "WarningPrimary", "WarningSecondary", "NegativePrimary", "NegativeSecondary", "PositivePrimary", "PositiveSecondary", "ActionPrimary", "ActionSecondary", "StaticPrimary", "StaticSecondary", "CustomStyle", "Lru/ozon/uni/components/badge/UniBadgeStyle$ActionPrimary;", "Lru/ozon/uni/components/badge/UniBadgeStyle$ActionSecondary;", "Lru/ozon/uni/components/badge/UniBadgeStyle$CustomStyle;", "Lru/ozon/uni/components/badge/UniBadgeStyle$NegativePrimary;", "Lru/ozon/uni/components/badge/UniBadgeStyle$NegativeSecondary;", "Lru/ozon/uni/components/badge/UniBadgeStyle$NeutralPrimary;", "Lru/ozon/uni/components/badge/UniBadgeStyle$NeutralSecondary;", "Lru/ozon/uni/components/badge/UniBadgeStyle$PositivePrimary;", "Lru/ozon/uni/components/badge/UniBadgeStyle$PositiveSecondary;", "Lru/ozon/uni/components/badge/UniBadgeStyle$StaticPrimary;", "Lru/ozon/uni/components/badge/UniBadgeStyle$StaticSecondary;", "Lru/ozon/uni/components/badge/UniBadgeStyle$WarningPrimary;", "Lru/ozon/uni/components/badge/UniBadgeStyle$WarningSecondary;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UniBadgeStyle {

    @NotNull
    private final Object backgroundDefBrush;

    @NotNull
    private final Object endGraphicDefColor;

    @NotNull
    private final Object labelDefColor;

    @NotNull
    private final Object startGraphicDefColor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle$ActionPrimary;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionPrimary extends UniBadgeStyle {

        @NotNull
        public static final ActionPrimary INSTANCE = new ActionPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionPrimary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getBgActionPrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextPrimaryDynamic()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicSecondaryDynamic()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicTertiaryDynamic()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionPrimary);
        }

        public int hashCode() {
            return -1198333904;
        }

        @NotNull
        public String toString() {
            return "ActionPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle$ActionSecondary;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionSecondary extends UniBadgeStyle {

        @NotNull
        public static final ActionSecondary INSTANCE = new ActionSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionSecondary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getBgActionSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextAction()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicActionPrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicActionPrimary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionSecondary);
        }

        public int hashCode() {
            return 476999714;
        }

        @NotNull
        public String toString() {
            return "ActionSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle$CustomStyle;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "Lru/ozon/uni/utils/DeferredBrush;", "backgroundDefBrush", "Lru/ozon/uni/utils/DeferredColor;", "labelDefColor", "startGraphicDefColor", "endGraphicDefColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Ll1/Q;", "backgroundBrush", "Ll1/Z;", "labelColor", "startGraphicColor", "endGraphicColor", "(Ll1/Q;JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CustomStyle extends UniBadgeStyle {
        public /* synthetic */ CustomStyle(AbstractC7799Q abstractC7799Q, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC7799Q, j11, j12, j13);
        }

        private CustomStyle(Object obj, Object obj2, Object obj3, Object obj4) {
            super(obj, obj2, obj3, obj4, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        private CustomStyle(AbstractC7799Q backgroundBrush, long j11, long j12, long j13) {
            this(DeferredBrush.m3255constructorimpl(backgroundBrush), DeferredColor.m3260constructorimpl(j11), DeferredColor.m3260constructorimpl(j12), DeferredColor.m3260constructorimpl(j13));
            Intrinsics.checkNotNullParameter(backgroundBrush, "backgroundBrush");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle$NegativePrimary;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NegativePrimary extends UniBadgeStyle {

        @NotNull
        public static final NegativePrimary INSTANCE = new NegativePrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NegativePrimary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getBgNegativePrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextLightKey()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicLightKey()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicSecondaryOnDark()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NegativePrimary);
        }

        public int hashCode() {
            return -1773984687;
        }

        @NotNull
        public String toString() {
            return "NegativePrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle$NegativeSecondary;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NegativeSecondary extends UniBadgeStyle {

        @NotNull
        public static final NegativeSecondary INSTANCE = new NegativeSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NegativeSecondary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getBgNegativeSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextNegative()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicNegativePrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicNegativePrimary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NegativeSecondary);
        }

        public int hashCode() {
            return 1327378435;
        }

        @NotNull
        public String toString() {
            return "NegativeSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle$NeutralPrimary;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeutralPrimary extends UniBadgeStyle {

        @NotNull
        public static final NeutralPrimary INSTANCE = new NeutralPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NeutralPrimary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getBgSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextPrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicPrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicTertiary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeutralPrimary);
        }

        public int hashCode() {
            return -684723849;
        }

        @NotNull
        public String toString() {
            return "NeutralPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle$NeutralSecondary;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeutralSecondary extends UniBadgeStyle {

        @NotNull
        public static final NeutralSecondary INSTANCE = new NeutralSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NeutralSecondary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getBgSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicTertiary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicTertiary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeutralSecondary);
        }

        public int hashCode() {
            return 135023529;
        }

        @NotNull
        public String toString() {
            return "NeutralSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle$PositivePrimary;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PositivePrimary extends UniBadgeStyle {

        @NotNull
        public static final PositivePrimary INSTANCE = new PositivePrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private PositivePrimary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getBgPositivePrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextLightKey()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicLightKey()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicSecondaryOnDark()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PositivePrimary);
        }

        public int hashCode() {
            return -2007674355;
        }

        @NotNull
        public String toString() {
            return "PositivePrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle$PositiveSecondary;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PositiveSecondary extends UniBadgeStyle {

        @NotNull
        public static final PositiveSecondary INSTANCE = new PositiveSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private PositiveSecondary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getBgPositiveSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextPositive()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicPositivePrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicPositivePrimary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PositiveSecondary);
        }

        public int hashCode() {
            return 89906879;
        }

        @NotNull
        public String toString() {
            return "PositiveSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle$StaticPrimary;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StaticPrimary extends UniBadgeStyle {

        @NotNull
        public static final StaticPrimary INSTANCE = new StaticPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private StaticPrimary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getClearDarkKey700()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextLightKey()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicLightKey()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicSecondaryOnDark()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof StaticPrimary);
        }

        public int hashCode() {
            return -2105777928;
        }

        @NotNull
        public String toString() {
            return "StaticPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle$StaticSecondary;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StaticSecondary extends UniBadgeStyle {

        @NotNull
        public static final StaticSecondary INSTANCE = new StaticSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private StaticSecondary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getLayerFloor3()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicTertiary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicTertiary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof StaticSecondary);
        }

        public int hashCode() {
            return 301653738;
        }

        @NotNull
        public String toString() {
            return "StaticSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle$WarningPrimary;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WarningPrimary extends UniBadgeStyle {

        @NotNull
        public static final WarningPrimary INSTANCE = new WarningPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private WarningPrimary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getBgWarningPrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextPrimaryOnLight()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicPrimaryOnLight()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicTertiaryOnLight()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof WarningPrimary);
        }

        public int hashCode() {
            return 1660786178;
        }

        @NotNull
        public String toString() {
            return "WarningPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStyle$WarningSecondary;", "Lru/ozon/uni/components/badge/UniBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WarningSecondary extends UniBadgeStyle {

        @NotNull
        public static final WarningSecondary INSTANCE = new WarningSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private WarningSecondary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getBgWarningSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextWarning()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicWarningPrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicWarningPrimary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof WarningSecondary);
        }

        public int hashCode() {
            return -687670924;
        }

        @NotNull
        public String toString() {
            return "WarningSecondary";
        }
    }

    public /* synthetic */ UniBadgeStyle(Object obj, Object obj2, Object obj3, Object obj4, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, obj3, obj4);
    }

    @NotNull
    /* renamed from: getBackgroundDefBrush-QAoP-dQ$uni_release, reason: not valid java name and from getter */
    public final Object getBackgroundDefBrush() {
        return this.backgroundDefBrush;
    }

    @NotNull
    /* renamed from: getEndGraphicDefColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getEndGraphicDefColor() {
        return this.endGraphicDefColor;
    }

    @NotNull
    /* renamed from: getLabelDefColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getLabelDefColor() {
        return this.labelDefColor;
    }

    @NotNull
    /* renamed from: getStartGraphicDefColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getStartGraphicDefColor() {
        return this.startGraphicDefColor;
    }

    private UniBadgeStyle(Object backgroundDefBrush, Object labelDefColor, Object startGraphicDefColor, Object endGraphicDefColor) {
        Intrinsics.checkNotNullParameter(backgroundDefBrush, "backgroundDefBrush");
        Intrinsics.checkNotNullParameter(labelDefColor, "labelDefColor");
        Intrinsics.checkNotNullParameter(startGraphicDefColor, "startGraphicDefColor");
        Intrinsics.checkNotNullParameter(endGraphicDefColor, "endGraphicDefColor");
        this.backgroundDefBrush = backgroundDefBrush;
        this.labelDefColor = labelDefColor;
        this.startGraphicDefColor = startGraphicDefColor;
        this.endGraphicDefColor = endGraphicDefColor;
    }
}
