package ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.data;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/data/TipProductPhotosDTO;", "", "productPhotos", "", "", "<init>", "(Ljava/util/List;)V", "getProductPhotos", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TipProductPhotosDTO {

    @NotNull
    private final List<String> productPhotos;

    public TipProductPhotosDTO(@NotNull List<String> productPhotos) {
        Intrinsics.checkNotNullParameter(productPhotos, "productPhotos");
        this.productPhotos = productPhotos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TipProductPhotosDTO copy$default(TipProductPhotosDTO tipProductPhotosDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tipProductPhotosDTO.productPhotos;
        }
        return tipProductPhotosDTO.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.productPhotos;
    }

    @NotNull
    public final TipProductPhotosDTO copy(@NotNull List<String> productPhotos) {
        Intrinsics.checkNotNullParameter(productPhotos, "productPhotos");
        return new TipProductPhotosDTO(productPhotos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TipProductPhotosDTO) && Intrinsics.d(this.productPhotos, ((TipProductPhotosDTO) other).productPhotos);
    }

    @NotNull
    public final List<String> getProductPhotos() {
        return this.productPhotos;
    }

    public int hashCode() {
        return this.productPhotos.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("TipProductPhotosDTO(productPhotos=", ")", this.productPhotos);
    }
}
