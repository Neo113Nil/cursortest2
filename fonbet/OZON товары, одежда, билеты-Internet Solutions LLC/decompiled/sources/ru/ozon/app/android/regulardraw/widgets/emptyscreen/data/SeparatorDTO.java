package ru.ozon.app.android.regulardraw.widgets.emptyscreen.data;

import T7.E;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/SeparatorDTO;", "", "height", "", "<init>", "(I)V", "getHeight", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SeparatorDTO {
    public static final int $stable = 0;
    private final int height;

    public SeparatorDTO(int i11) {
        this.height = i11;
    }

    public static /* synthetic */ SeparatorDTO copy$default(SeparatorDTO separatorDTO, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = separatorDTO.height;
        }
        return separatorDTO.copy(i11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final SeparatorDTO copy(int height) {
        return new SeparatorDTO(height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SeparatorDTO) && this.height == ((SeparatorDTO) other).height;
    }

    public final int getHeight() {
        return this.height;
    }

    public int hashCode() {
        return Integer.hashCode(this.height);
    }

    @NotNull
    public String toString() {
        return E.a(this.height, "SeparatorDTO(height=", ")");
    }
}
