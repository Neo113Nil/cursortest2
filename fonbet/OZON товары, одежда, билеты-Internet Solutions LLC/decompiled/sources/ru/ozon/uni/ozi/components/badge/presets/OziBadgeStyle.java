package ru.ozon.uni.ozi.components.badge.presets;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.theme.OziColorsKeyTokens;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredBrush;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredColor;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000f\u0010\f\u0082\u0001\u0004\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle;", "", "Lru/ozon/uni/ozi/utils/internal/presets/DeferredBrush;", "backgroundDefBrush", "Lru/ozon/uni/ozi/utils/internal/presets/DeferredColor;", "labelDefColor", "startGraphicDefColor", "endGraphicDefColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/lang/Object;", "getBackgroundDefBrush-jLqkhjc$uni_release", "()Ljava/lang/Object;", "getLabelDefColor-uaV1wGU$uni_release", "getStartGraphicDefColor-uaV1wGU$uni_release", "getEndGraphicDefColor-uaV1wGU$uni_release", "NeutralPrimary", "NeutralSecondary", "WarningPrimary", "PositivePrimary", "Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle$NeutralPrimary;", "Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle$NeutralSecondary;", "Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle$PositivePrimary;", "Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle$WarningPrimary;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OziBadgeStyle {

    @NotNull
    private final Object backgroundDefBrush;

    @NotNull
    private final Object endGraphicDefColor;

    @NotNull
    private final Object labelDefColor;

    @NotNull
    private final Object startGraphicDefColor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle$NeutralPrimary;", "Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeutralPrimary extends OziBadgeStyle {

        @NotNull
        public static final NeutralPrimary INSTANCE = new NeutralPrimary();

        private NeutralPrimary() {
            super(DeferredBrush.m3248constructorimpl(OziColorsKeyTokens.BgSecondaryTransparent), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.TextPrimary), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.GraphicPrimary), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.GraphicTertiaryTransparent), null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeutralPrimary);
        }

        public int hashCode() {
            return 790330867;
        }

        @NotNull
        public String toString() {
            return "NeutralPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle$NeutralSecondary;", "Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeutralSecondary extends OziBadgeStyle {

        @NotNull
        public static final NeutralSecondary INSTANCE = new NeutralSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NeutralSecondary() {
            super(r2, r3, DeferredColor.m3251constructorimpl(r0), DeferredColor.m3251constructorimpl(r0), null);
            Object m3248constructorimpl = DeferredBrush.m3248constructorimpl(OziColorsKeyTokens.BgSecondaryTransparent);
            Object m3251constructorimpl = DeferredColor.m3251constructorimpl(OziColorsKeyTokens.TextSecondaryTransparent);
            OziColorsKeyTokens oziColorsKeyTokens = OziColorsKeyTokens.GraphicTertiaryTransparent;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeutralSecondary);
        }

        public int hashCode() {
            return 323397925;
        }

        @NotNull
        public String toString() {
            return "NeutralSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle$PositivePrimary;", "Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PositivePrimary extends OziBadgeStyle {

        @NotNull
        public static final PositivePrimary INSTANCE = new PositivePrimary();

        private PositivePrimary() {
            super(DeferredBrush.m3248constructorimpl(OziColorsKeyTokens.BgPositivePrimary), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.StaticTextLightKey), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.StaticGraphicLightKey), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.StaticGraphicSecondaryOnDarkTransparent), null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PositivePrimary);
        }

        public int hashCode() {
            return 769348881;
        }

        @NotNull
        public String toString() {
            return "PositivePrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle$WarningPrimary;", "Lru/ozon/uni/ozi/components/badge/presets/OziBadgeStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WarningPrimary extends OziBadgeStyle {

        @NotNull
        public static final WarningPrimary INSTANCE = new WarningPrimary();

        private WarningPrimary() {
            super(DeferredBrush.m3248constructorimpl(OziColorsKeyTokens.BgWarningPrimary), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.StaticTextPrimaryOnLight), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.StaticGraphicPrimaryOnLight), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.StaticGraphicTertiaryOnLightTransparent), null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof WarningPrimary);
        }

        public int hashCode() {
            return -1159126402;
        }

        @NotNull
        public String toString() {
            return "WarningPrimary";
        }
    }

    public /* synthetic */ OziBadgeStyle(Object obj, Object obj2, Object obj3, Object obj4, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, obj3, obj4);
    }

    @NotNull
    /* renamed from: getBackgroundDefBrush-jLqkhjc$uni_release, reason: not valid java name and from getter */
    public final Object getBackgroundDefBrush() {
        return this.backgroundDefBrush;
    }

    @NotNull
    /* renamed from: getEndGraphicDefColor-uaV1wGU$uni_release, reason: not valid java name and from getter */
    public final Object getEndGraphicDefColor() {
        return this.endGraphicDefColor;
    }

    @NotNull
    /* renamed from: getLabelDefColor-uaV1wGU$uni_release, reason: not valid java name and from getter */
    public final Object getLabelDefColor() {
        return this.labelDefColor;
    }

    @NotNull
    /* renamed from: getStartGraphicDefColor-uaV1wGU$uni_release, reason: not valid java name and from getter */
    public final Object getStartGraphicDefColor() {
        return this.startGraphicDefColor;
    }

    private OziBadgeStyle(Object backgroundDefBrush, Object labelDefColor, Object startGraphicDefColor, Object endGraphicDefColor) {
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
