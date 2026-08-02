package ru.ozon.uni.ozi.components.inputs.presets;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.theme.OziColorsKeyTokens;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredColor;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u000f\u0010\u0011\u0012\u0013B+\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n\u0082\u0001\u0005\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus;", "", "borderColor", "Lru/ozon/uni/ozi/utils/internal/presets/DeferredColor;", "systemIconColor", "captionColor", "activeBorderColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getBorderColor-uaV1wGU$uni_release", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSystemIconColor-uaV1wGU$uni_release", "getCaptionColor-uaV1wGU$uni_release", "getActiveBorderColor-uaV1wGU$uni_release", "Neutral", "ReadOnly", "Error", "Success", "Warning", "Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus$Error;", "Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus$Neutral;", "Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus$ReadOnly;", "Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus$Success;", "Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus$Warning;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OziInputStatus {

    @NotNull
    private final Object activeBorderColor;

    @NotNull
    private final Object borderColor;

    @NotNull
    private final Object captionColor;

    @NotNull
    private final Object systemIconColor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus$Error;", "Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends OziInputStatus {

        @NotNull
        public static final Error INSTANCE = new Error();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Error() {
            super(DeferredColor.m3251constructorimpl(r0), DeferredColor.m3251constructorimpl(r0), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.TextNegative), null, 8, null);
            OziColorsKeyTokens oziColorsKeyTokens = OziColorsKeyTokens.GraphicNegativePrimary;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -1079670010;
        }

        @NotNull
        public String toString() {
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus$Neutral;", "Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Neutral extends OziInputStatus {

        @NotNull
        public static final Neutral INSTANCE = new Neutral();

        private Neutral() {
            super(DeferredColor.m3251constructorimpl(OziColorsKeyTokens.GraphicNeutralTransparent), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.GraphicTertiaryTransparent), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.TextSecondaryTransparent), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.GraphicActionPrimary), null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Neutral);
        }

        public int hashCode() {
            return 847548229;
        }

        @NotNull
        public String toString() {
            return "Neutral";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus$ReadOnly;", "Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReadOnly extends OziInputStatus {

        @NotNull
        public static final ReadOnly INSTANCE = new ReadOnly();

        private ReadOnly() {
            super(DeferredColor.m3251constructorimpl(OziColorsKeyTokens.GraphicNeutralTransparent), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.GraphicTertiaryTransparent), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.TextSecondaryTransparent), null, 8, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ReadOnly);
        }

        public int hashCode() {
            return -1702891356;
        }

        @NotNull
        public String toString() {
            return "ReadOnly";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus$Success;", "Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends OziInputStatus {

        @NotNull
        public static final Success INSTANCE = new Success();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Success() {
            super(DeferredColor.m3251constructorimpl(r0), DeferredColor.m3251constructorimpl(r0), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.TextSecondaryTransparent), null, 8, null);
            OziColorsKeyTokens oziColorsKeyTokens = OziColorsKeyTokens.GraphicPositivePrimary;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Success);
        }

        public int hashCode() {
            return 1431024001;
        }

        @NotNull
        public String toString() {
            return "Success";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus$Warning;", "Lru/ozon/uni/ozi/components/inputs/presets/OziInputStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Warning extends OziInputStatus {

        @NotNull
        public static final Warning INSTANCE = new Warning();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Warning() {
            super(DeferredColor.m3251constructorimpl(r0), DeferredColor.m3251constructorimpl(r0), DeferredColor.m3251constructorimpl(OziColorsKeyTokens.TextSecondaryTransparent), null, 8, null);
            OziColorsKeyTokens oziColorsKeyTokens = OziColorsKeyTokens.GraphicWarningPrimary;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Warning);
        }

        public int hashCode() {
            return 127672602;
        }

        @NotNull
        public String toString() {
            return "Warning";
        }
    }

    public /* synthetic */ OziInputStatus(Object obj, Object obj2, Object obj3, Object obj4, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, obj3, obj4);
    }

    @NotNull
    /* renamed from: getActiveBorderColor-uaV1wGU$uni_release, reason: not valid java name and from getter */
    public final Object getActiveBorderColor() {
        return this.activeBorderColor;
    }

    @NotNull
    /* renamed from: getBorderColor-uaV1wGU$uni_release, reason: not valid java name and from getter */
    public final Object getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    /* renamed from: getCaptionColor-uaV1wGU$uni_release, reason: not valid java name and from getter */
    public final Object getCaptionColor() {
        return this.captionColor;
    }

    @NotNull
    /* renamed from: getSystemIconColor-uaV1wGU$uni_release, reason: not valid java name and from getter */
    public final Object getSystemIconColor() {
        return this.systemIconColor;
    }

    private OziInputStatus(Object borderColor, Object systemIconColor, Object captionColor, Object activeBorderColor) {
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(systemIconColor, "systemIconColor");
        Intrinsics.checkNotNullParameter(captionColor, "captionColor");
        Intrinsics.checkNotNullParameter(activeBorderColor, "activeBorderColor");
        this.borderColor = borderColor;
        this.systemIconColor = systemIconColor;
        this.captionColor = captionColor;
        this.activeBorderColor = activeBorderColor;
    }

    public /* synthetic */ OziInputStatus(Object obj, Object obj2, Object obj3, Object obj4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, obj3, (i11 & 8) != 0 ? obj : obj4, null);
    }
}
