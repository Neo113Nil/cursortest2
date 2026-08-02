package ru.ozon.android.messenger.blocks.replymessageblock;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/blocks/replymessageblock/VerticalLineStyleDTO;", "", "colorToken", "", "width", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getColorToken", "()Ljava/lang/String;", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/android/messenger/blocks/replymessageblock/VerticalLineStyleDTO;", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class VerticalLineStyleDTO {
    public static final int $stable = 0;
    private final String colorToken;
    private final Integer width;

    public VerticalLineStyleDTO(String str, Integer num) {
        this.colorToken = str;
        this.width = num;
    }

    public static /* synthetic */ VerticalLineStyleDTO copy$default(VerticalLineStyleDTO verticalLineStyleDTO, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = verticalLineStyleDTO.colorToken;
        }
        if ((i11 & 2) != 0) {
            num = verticalLineStyleDTO.width;
        }
        return verticalLineStyleDTO.copy(str, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getColorToken() {
        return this.colorToken;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @NotNull
    public final VerticalLineStyleDTO copy(String colorToken, Integer width) {
        return new VerticalLineStyleDTO(colorToken, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalLineStyleDTO)) {
            return false;
        }
        VerticalLineStyleDTO verticalLineStyleDTO = (VerticalLineStyleDTO) other;
        return Intrinsics.d(this.colorToken, verticalLineStyleDTO.colorToken) && Intrinsics.d(this.width, verticalLineStyleDTO.width);
    }

    public final String getColorToken() {
        return this.colorToken;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.colorToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.width;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VerticalLineStyleDTO(colorToken=" + this.colorToken + ", width=" + this.width + ")";
    }
}
