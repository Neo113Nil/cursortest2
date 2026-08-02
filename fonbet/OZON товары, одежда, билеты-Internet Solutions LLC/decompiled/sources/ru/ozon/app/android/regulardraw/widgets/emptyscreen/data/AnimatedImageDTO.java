package ru.ozon.app.android.regulardraw.widgets.emptyscreen.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/AnimatedImageDTO;", "", "imageUrl", "", "fitType", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/AnimatedImageDTO$FitType;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/AnimatedImageDTO$FitType;)V", "getImageUrl", "()Ljava/lang/String;", "getFitType", "()Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/AnimatedImageDTO$FitType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "FitType", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AnimatedImageDTO {
    public static final int $stable = 0;

    @NotNull
    private final FitType fitType;

    @NotNull
    private final String imageUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/AnimatedImageDTO$FitType;", "", "<init>", "(Ljava/lang/String;I)V", "FILL_CENTER", "FIT_CENTER", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FitType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FitType[] $VALUES;
        public static final FitType FILL_CENTER = new FitType("FILL_CENTER", 0);
        public static final FitType FIT_CENTER = new FitType("FIT_CENTER", 1);

        private static final /* synthetic */ FitType[] $values() {
            return new FitType[]{FILL_CENTER, FIT_CENTER};
        }

        static {
            FitType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private FitType(String str, int i11) {
        }

        public static FitType valueOf(String str) {
            return (FitType) Enum.valueOf(FitType.class, str);
        }

        public static FitType[] values() {
            return (FitType[]) $VALUES.clone();
        }
    }

    public AnimatedImageDTO(@NotNull String imageUrl, @NotNull FitType fitType) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(fitType, "fitType");
        this.imageUrl = imageUrl;
        this.fitType = fitType;
    }

    public static /* synthetic */ AnimatedImageDTO copy$default(AnimatedImageDTO animatedImageDTO, String str, FitType fitType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = animatedImageDTO.imageUrl;
        }
        if ((i11 & 2) != 0) {
            fitType = animatedImageDTO.fitType;
        }
        return animatedImageDTO.copy(str, fitType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FitType getFitType() {
        return this.fitType;
    }

    @NotNull
    public final AnimatedImageDTO copy(@NotNull String imageUrl, @NotNull FitType fitType) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(fitType, "fitType");
        return new AnimatedImageDTO(imageUrl, fitType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimatedImageDTO)) {
            return false;
        }
        AnimatedImageDTO animatedImageDTO = (AnimatedImageDTO) other;
        return Intrinsics.d(this.imageUrl, animatedImageDTO.imageUrl) && this.fitType == animatedImageDTO.fitType;
    }

    @NotNull
    public final FitType getFitType() {
        return this.fitType;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        return this.fitType.hashCode() + (this.imageUrl.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AnimatedImageDTO(imageUrl=" + this.imageUrl + ", fitType=" + this.fitType + ")";
    }

    public /* synthetic */ AnimatedImageDTO(String str, FitType fitType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? FitType.FIT_CENTER : fitType);
    }
}
