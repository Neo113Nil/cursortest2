package ru.ozon.uni.components.indicator;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.DeferredColor;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0001\t\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/uni/components/indicator/UniIndicatorStyle;", "", "Lru/ozon/uni/utils/DeferredColor;", "backgroundColor", "textColor", "iconColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/lang/Object;", "getBackgroundColor-e_QkOiY$uni_release", "()Ljava/lang/Object;", "getTextColor-e_QkOiY$uni_release", "getIconColor-e_QkOiY$uni_release", "Accent", "AccentSecondary", "Neutral", "NeutralTransparent", "Light", "LightNeutral", "Static", "NeutralOnDark", "CustomStyle", "Lru/ozon/uni/components/indicator/UniIndicatorStyle$Accent;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle$AccentSecondary;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle$CustomStyle;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle$Light;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle$LightNeutral;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle$Neutral;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle$NeutralOnDark;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle$NeutralTransparent;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle$Static;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UniIndicatorStyle {

    @NotNull
    private final Object backgroundColor;

    @NotNull
    private final Object iconColor;

    @NotNull
    private final Object textColor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/indicator/UniIndicatorStyle$Accent;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Accent extends UniIndicatorStyle {

        @NotNull
        public static final Accent INSTANCE = new Accent();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Accent() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgAccentPrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextLightKey()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicLightKey()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Accent);
        }

        public int hashCode() {
            return -1140514554;
        }

        @NotNull
        public String toString() {
            return "Accent";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/indicator/UniIndicatorStyle$AccentSecondary;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccentSecondary extends UniIndicatorStyle {

        @NotNull
        public static final AccentSecondary INSTANCE = new AccentSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private AccentSecondary() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgAccentSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextAccent()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicAccentPrimary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AccentSecondary);
        }

        public int hashCode() {
            return 1906259726;
        }

        @NotNull
        public String toString() {
            return "AccentSecondary";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/components/indicator/UniIndicatorStyle$CustomStyle;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle;", "Lru/ozon/uni/utils/DeferredColor;", "backgroundColor", "textColor", "iconColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Ll1/Z;", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CustomStyle extends UniIndicatorStyle {
        public /* synthetic */ CustomStyle(long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, j12, j13);
        }

        private CustomStyle(Object obj, Object obj2, Object obj3) {
            super(obj, obj2, obj3, null);
        }

        private CustomStyle(long j11, long j12, long j13) {
            this(DeferredColor.m3260constructorimpl(j11), DeferredColor.m3260constructorimpl(j12), DeferredColor.m3260constructorimpl(j13));
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/indicator/UniIndicatorStyle$Light;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Light extends UniIndicatorStyle {

        @NotNull
        public static final Light INSTANCE = new Light();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Light() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgLightKey()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextAccent()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicAccentPrimary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Light);
        }

        public int hashCode() {
            return 1913213274;
        }

        @NotNull
        public String toString() {
            return "Light";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/indicator/UniIndicatorStyle$LightNeutral;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LightNeutral extends UniIndicatorStyle {

        @NotNull
        public static final LightNeutral INSTANCE = new LightNeutral();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private LightNeutral() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgLightKey()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextPrimaryOnLight()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicPrimaryOnLight()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof LightNeutral);
        }

        public int hashCode() {
            return 2002389773;
        }

        @NotNull
        public String toString() {
            return "LightNeutral";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/indicator/UniIndicatorStyle$Neutral;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Neutral extends UniIndicatorStyle {

        @NotNull
        public static final Neutral INSTANCE = new Neutral();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Neutral() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextSecondary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicSecondary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Neutral);
        }

        public int hashCode() {
            return 2025732363;
        }

        @NotNull
        public String toString() {
            return "Neutral";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/indicator/UniIndicatorStyle$NeutralOnDark;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeutralOnDark extends UniIndicatorStyle {

        @NotNull
        public static final NeutralOnDark INSTANCE = new NeutralOnDark();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NeutralOnDark() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgSecondaryInverted()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextSecondaryInverted()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicKeyInverted()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeutralOnDark);
        }

        public int hashCode() {
            return -2007934240;
        }

        @NotNull
        public String toString() {
            return "NeutralOnDark";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/indicator/UniIndicatorStyle$NeutralTransparent;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeutralTransparent extends UniIndicatorStyle {

        @NotNull
        public static final NeutralTransparent INSTANCE = new NeutralTransparent();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NeutralTransparent() {
            super(r0, DeferredColor.m3262constructorimpl(r1.getColorTokens().getTextTertiary()), DeferredColor.m3262constructorimpl(r1.getColorTokens().getGraphicTertiary()), null);
            long j11;
            int i11 = C7807Z.f72260n;
            j11 = C7807Z.f72258l;
            Object m3260constructorimpl = DeferredColor.m3260constructorimpl(j11);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeutralTransparent);
        }

        public int hashCode() {
            return 595347271;
        }

        @NotNull
        public String toString() {
            return "NeutralTransparent";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/indicator/UniIndicatorStyle$Static;", "Lru/ozon/uni/components/indicator/UniIndicatorStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Static extends UniIndicatorStyle {

        @NotNull
        public static final Static INSTANCE = new Static();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Static() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicPrimaryOnLight()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextLightKey()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicLightKey()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Static);
        }

        public int hashCode() {
            return -609535318;
        }

        @NotNull
        public String toString() {
            return "Static";
        }
    }

    public /* synthetic */ UniIndicatorStyle(Object obj, Object obj2, Object obj3, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, obj3);
    }

    @NotNull
    /* renamed from: getBackgroundColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: getIconColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getIconColor() {
        return this.iconColor;
    }

    @NotNull
    /* renamed from: getTextColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getTextColor() {
        return this.textColor;
    }

    private UniIndicatorStyle(Object backgroundColor, Object textColor, Object iconColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.iconColor = iconColor;
    }
}
