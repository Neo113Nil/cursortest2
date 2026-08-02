package ru.ozon.app.android.widgets.separator;

import C.o0;
import Kk.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "", "width", "", "height", "color", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "equals", "", "other", "hashCode", "toString", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SeparatorDTO {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String color;
    private final Integer height;
    private final Integer width;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/widgets/separator/SeparatorDTO$Companion;", "", "<init>", "()V", "createTransparentSeparator", "Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "height", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SeparatorDTO createTransparentSeparator(int height) {
            return new SeparatorDTO(null, Integer.valueOf(height), null);
        }

        private Companion() {
        }
    }

    public SeparatorDTO(Integer num, Integer num2, String str) {
        this.width = num;
        this.height = num2;
        this.color = str;
    }

    public static /* synthetic */ SeparatorDTO copy$default(SeparatorDTO separatorDTO, Integer num, Integer num2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = separatorDTO.width;
        }
        if ((i11 & 2) != 0) {
            num2 = separatorDTO.height;
        }
        if ((i11 & 4) != 0) {
            str = separatorDTO.color;
        }
        return separatorDTO.copy(num, num2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final SeparatorDTO copy(Integer width, Integer height, String color) {
        return new SeparatorDTO(width, height, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeparatorDTO)) {
            return false;
        }
        SeparatorDTO separatorDTO = (SeparatorDTO) other;
        return Intrinsics.d(this.width, separatorDTO.width) && Intrinsics.d(this.height, separatorDTO.height) && Intrinsics.d(this.color, separatorDTO.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.width;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.color;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.width;
        Integer num2 = this.height;
        return o0.c(c.f("SeparatorDTO(width=", ", height=", num, num2, ", color="), this.color, ")");
    }
}
