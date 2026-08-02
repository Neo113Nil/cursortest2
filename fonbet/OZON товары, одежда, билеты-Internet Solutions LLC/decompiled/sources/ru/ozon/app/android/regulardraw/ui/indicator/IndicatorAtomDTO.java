package ru.ozon.app.android.regulardraw.ui.indicator;

import V.e;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "", "bgImage", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBgImage", "()Ljava/lang/String;", "getText", "size", "Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO$Size;", "getSize", "()Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO$Size;", "setSize", "(Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO$Size;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Size", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class IndicatorAtomDTO {
    public static final int $stable = 8;

    @NotNull
    private final String bgImage;

    @NotNull
    private Size size;
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO$Size;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "LARGE", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size SMALL = new Size("SMALL", 0);
        public static final Size LARGE = new Size("LARGE", 1);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{SMALL, LARGE};
        }

        static {
            Size[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Size(String str, int i11) {
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    public IndicatorAtomDTO(@NotNull String bgImage, String str) {
        Intrinsics.checkNotNullParameter(bgImage, "bgImage");
        this.bgImage = bgImage;
        this.text = str;
        this.size = Size.LARGE;
    }

    public static /* synthetic */ IndicatorAtomDTO copy$default(IndicatorAtomDTO indicatorAtomDTO, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = indicatorAtomDTO.bgImage;
        }
        if ((i11 & 2) != 0) {
            str2 = indicatorAtomDTO.text;
        }
        return indicatorAtomDTO.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBgImage() {
        return this.bgImage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final IndicatorAtomDTO copy(@NotNull String bgImage, String text) {
        Intrinsics.checkNotNullParameter(bgImage, "bgImage");
        return new IndicatorAtomDTO(bgImage, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorAtomDTO)) {
            return false;
        }
        IndicatorAtomDTO indicatorAtomDTO = (IndicatorAtomDTO) other;
        return Intrinsics.d(this.bgImage, indicatorAtomDTO.bgImage) && Intrinsics.d(this.text, indicatorAtomDTO.text);
    }

    @NotNull
    public final String getBgImage() {
        return this.bgImage;
    }

    @NotNull
    public final Size getSize() {
        return this.size;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.bgImage.hashCode() * 31;
        String str = this.text;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setSize(@NotNull Size size) {
        Intrinsics.checkNotNullParameter(size, "<set-?>");
        this.size = size;
    }

    @NotNull
    public String toString() {
        return e.a("IndicatorAtomDTO(bgImage=", this.bgImage, ", text=", this.text, ")");
    }
}
