package ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.data;

import Ef0.c;
import Ep.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoImageDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "leftMargin", "", "rightMargin", "topMargin", "bottomMargin", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getLeftMargin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRightMargin", "getTopMargin", "getBottomMargin", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoImageDTO;", "equals", "", "other", "hashCode", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SimpleInfoImageDTO {
    public static final int $stable = 0;
    private final Integer bottomMargin;

    @NotNull
    private final ImageDTO image;
    private final Integer leftMargin;
    private final Integer rightMargin;
    private final Integer topMargin;

    public SimpleInfoImageDTO(@NotNull ImageDTO image, Integer num, Integer num2, Integer num3, Integer num4) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.image = image;
        this.leftMargin = num;
        this.rightMargin = num2;
        this.topMargin = num3;
        this.bottomMargin = num4;
    }

    public static /* synthetic */ SimpleInfoImageDTO copy$default(SimpleInfoImageDTO simpleInfoImageDTO, ImageDTO imageDTO, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = simpleInfoImageDTO.image;
        }
        if ((i11 & 2) != 0) {
            num = simpleInfoImageDTO.leftMargin;
        }
        if ((i11 & 4) != 0) {
            num2 = simpleInfoImageDTO.rightMargin;
        }
        if ((i11 & 8) != 0) {
            num3 = simpleInfoImageDTO.topMargin;
        }
        if ((i11 & 16) != 0) {
            num4 = simpleInfoImageDTO.bottomMargin;
        }
        Integer num5 = num4;
        Integer num6 = num2;
        return simpleInfoImageDTO.copy(imageDTO, num, num6, num3, num5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getLeftMargin() {
        return this.leftMargin;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getRightMargin() {
        return this.rightMargin;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getTopMargin() {
        return this.topMargin;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final SimpleInfoImageDTO copy(@NotNull ImageDTO image, Integer leftMargin, Integer rightMargin, Integer topMargin, Integer bottomMargin) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new SimpleInfoImageDTO(image, leftMargin, rightMargin, topMargin, bottomMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleInfoImageDTO)) {
            return false;
        }
        SimpleInfoImageDTO simpleInfoImageDTO = (SimpleInfoImageDTO) other;
        return Intrinsics.d(this.image, simpleInfoImageDTO.image) && Intrinsics.d(this.leftMargin, simpleInfoImageDTO.leftMargin) && Intrinsics.d(this.rightMargin, simpleInfoImageDTO.rightMargin) && Intrinsics.d(this.topMargin, simpleInfoImageDTO.topMargin) && Intrinsics.d(this.bottomMargin, simpleInfoImageDTO.bottomMargin);
    }

    public final Integer getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final Integer getLeftMargin() {
        return this.leftMargin;
    }

    public final Integer getRightMargin() {
        return this.rightMargin;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        Integer num = this.leftMargin;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.rightMargin;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.topMargin;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bottomMargin;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        Integer num = this.leftMargin;
        Integer num2 = this.rightMargin;
        Integer num3 = this.topMargin;
        Integer num4 = this.bottomMargin;
        StringBuilder sb2 = new StringBuilder("SimpleInfoImageDTO(image=");
        sb2.append(imageDTO);
        sb2.append(", leftMargin=");
        sb2.append(num);
        sb2.append(", rightMargin=");
        c.e(sb2, num2, ", topMargin=", num3, ", bottomMargin=");
        return a.c(sb2, num4, ")");
    }
}
