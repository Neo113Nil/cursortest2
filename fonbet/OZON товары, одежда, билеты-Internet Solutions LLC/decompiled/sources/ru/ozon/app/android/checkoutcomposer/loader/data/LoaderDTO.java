package ru.ozon.app.android.checkoutcomposer.loader.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/loader/data/LoaderDTO;", "", "color", "", "size", "Lru/ozon/app/android/checkoutcomposer/loader/data/LoaderDTO$Size;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/loader/data/LoaderDTO$Size;)V", "getColor", "()Ljava/lang/String;", "getSize", "()Lru/ozon/app/android/checkoutcomposer/loader/data/LoaderDTO$Size;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Size", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LoaderDTO {
    public static final int $stable = 0;
    private final String color;
    private final Size size;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/loader/data/LoaderDTO$Size;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_200", "SIZE_300", "SIZE_400", "SIZE_500", "SIZE_600", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Size {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size SIZE_200 = new Size("SIZE_200", 0);
        public static final Size SIZE_300 = new Size("SIZE_300", 1);
        public static final Size SIZE_400 = new Size("SIZE_400", 2);
        public static final Size SIZE_500 = new Size("SIZE_500", 3);
        public static final Size SIZE_600 = new Size("SIZE_600", 4);

        private static final /* synthetic */ Size[] $values() {
            return new Size[]{SIZE_200, SIZE_300, SIZE_400, SIZE_500, SIZE_600};
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

    public LoaderDTO(String str, Size size) {
        this.color = str;
        this.size = size;
    }

    public static /* synthetic */ LoaderDTO copy$default(LoaderDTO loaderDTO, String str, Size size, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = loaderDTO.color;
        }
        if ((i11 & 2) != 0) {
            size = loaderDTO.size;
        }
        return loaderDTO.copy(str, size);
    }

    /* renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    public final LoaderDTO copy(String color, Size size) {
        return new LoaderDTO(color, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoaderDTO)) {
            return false;
        }
        LoaderDTO loaderDTO = (LoaderDTO) other;
        return Intrinsics.d(this.color, loaderDTO.color) && this.size == loaderDTO.size;
    }

    public final String getColor() {
        return this.color;
    }

    public final Size getSize() {
        return this.size;
    }

    public int hashCode() {
        String str = this.color;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Size size = this.size;
        return hashCode + (size != null ? size.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LoaderDTO(color=" + this.color + ", size=" + this.size + ")";
    }
}
