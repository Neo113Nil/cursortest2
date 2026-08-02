package ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.v1.data;

import Am.C2438a;
import B0.C2454a;
import C.o0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/contentHider/v1/data/ContentHiderDTO;", "", "topOpticalPartHeight", "", "bottomOpticalPartHeight", "opticalPartColor", "", "<init>", "(IILjava/lang/String;)V", "getTopOpticalPartHeight", "()I", "getBottomOpticalPartHeight", "getOpticalPartColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContentHiderDTO {
    public static final int $stable = 0;
    private final int bottomOpticalPartHeight;

    @NotNull
    private final String opticalPartColor;
    private final int topOpticalPartHeight;

    public ContentHiderDTO() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ ContentHiderDTO copy$default(ContentHiderDTO contentHiderDTO, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = contentHiderDTO.topOpticalPartHeight;
        }
        if ((i13 & 2) != 0) {
            i12 = contentHiderDTO.bottomOpticalPartHeight;
        }
        if ((i13 & 4) != 0) {
            str = contentHiderDTO.opticalPartColor;
        }
        return contentHiderDTO.copy(i11, i12, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTopOpticalPartHeight() {
        return this.topOpticalPartHeight;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBottomOpticalPartHeight() {
        return this.bottomOpticalPartHeight;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOpticalPartColor() {
        return this.opticalPartColor;
    }

    @NotNull
    public final ContentHiderDTO copy(int topOpticalPartHeight, int bottomOpticalPartHeight, @NotNull String opticalPartColor) {
        Intrinsics.checkNotNullParameter(opticalPartColor, "opticalPartColor");
        return new ContentHiderDTO(topOpticalPartHeight, bottomOpticalPartHeight, opticalPartColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentHiderDTO)) {
            return false;
        }
        ContentHiderDTO contentHiderDTO = (ContentHiderDTO) other;
        return this.topOpticalPartHeight == contentHiderDTO.topOpticalPartHeight && this.bottomOpticalPartHeight == contentHiderDTO.bottomOpticalPartHeight && Intrinsics.d(this.opticalPartColor, contentHiderDTO.opticalPartColor);
    }

    public final int getBottomOpticalPartHeight() {
        return this.bottomOpticalPartHeight;
    }

    @NotNull
    public final String getOpticalPartColor() {
        return this.opticalPartColor;
    }

    public final int getTopOpticalPartHeight() {
        return this.topOpticalPartHeight;
    }

    public int hashCode() {
        return this.opticalPartColor.hashCode() + C2454a.a(this.bottomOpticalPartHeight, Integer.hashCode(this.topOpticalPartHeight) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.topOpticalPartHeight;
        int i12 = this.bottomOpticalPartHeight;
        return o0.c(C2438a.a("ContentHiderDTO(topOpticalPartHeight=", i11, ", bottomOpticalPartHeight=", ", opticalPartColor=", i12), this.opticalPartColor, ")");
    }

    public ContentHiderDTO(int i11, int i12, @NotNull String opticalPartColor) {
        Intrinsics.checkNotNullParameter(opticalPartColor, "opticalPartColor");
        this.topOpticalPartHeight = i11;
        this.bottomOpticalPartHeight = i12;
        this.opticalPartColor = opticalPartColor;
    }

    public /* synthetic */ ContentHiderDTO(int i11, int i12, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? UniColors.LAYER_FLOOR_1.getToken() : str);
    }
}
