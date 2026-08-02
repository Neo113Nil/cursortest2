package ru.ozon.app.android.deliveryreview.deliveryReviewHeader.data;

import J0.P;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003JH\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/data/DeliveryReviewHeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "maxCount", "", "photos", "", "info", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getMaxCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPhotos", "()Ljava/util/List;", "getInfo", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lru/ozon/app/android/deliveryreview/deliveryReviewHeader/data/DeliveryReviewHeaderDTO;", "equals", "", "other", "hashCode", "toString", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryReviewHeaderDTO {
    private final List<String> info;
    private final Integer maxCount;
    private final List<String> photos;

    @NotNull
    private final String title;

    public DeliveryReviewHeaderDTO(@NotNull String title, Integer num, List<String> list, List<String> list2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.maxCount = num;
        this.photos = list;
        this.info = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryReviewHeaderDTO copy$default(DeliveryReviewHeaderDTO deliveryReviewHeaderDTO, String str, Integer num, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deliveryReviewHeaderDTO.title;
        }
        if ((i11 & 2) != 0) {
            num = deliveryReviewHeaderDTO.maxCount;
        }
        if ((i11 & 4) != 0) {
            list = deliveryReviewHeaderDTO.photos;
        }
        if ((i11 & 8) != 0) {
            list2 = deliveryReviewHeaderDTO.info;
        }
        return deliveryReviewHeaderDTO.copy(str, num, list, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMaxCount() {
        return this.maxCount;
    }

    public final List<String> component3() {
        return this.photos;
    }

    public final List<String> component4() {
        return this.info;
    }

    @NotNull
    public final DeliveryReviewHeaderDTO copy(@NotNull String title, Integer maxCount, List<String> photos, List<String> info) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new DeliveryReviewHeaderDTO(title, maxCount, photos, info);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryReviewHeaderDTO)) {
            return false;
        }
        DeliveryReviewHeaderDTO deliveryReviewHeaderDTO = (DeliveryReviewHeaderDTO) other;
        return Intrinsics.d(this.title, deliveryReviewHeaderDTO.title) && Intrinsics.d(this.maxCount, deliveryReviewHeaderDTO.maxCount) && Intrinsics.d(this.photos, deliveryReviewHeaderDTO.photos) && Intrinsics.d(this.info, deliveryReviewHeaderDTO.info);
    }

    public final List<String> getInfo() {
        return this.info;
    }

    public final Integer getMaxCount() {
        return this.maxCount;
    }

    public final List<String> getPhotos() {
        return this.photos;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        Integer num = this.maxCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.photos;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.info;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        Integer num = this.maxCount;
        List<String> list = this.photos;
        List<String> list2 = this.info;
        StringBuilder b11 = P.b("DeliveryReviewHeaderDTO(title=", str, num, ", maxCount=", ", photos=");
        b11.append(list);
        b11.append(", info=");
        b11.append(list2);
        b11.append(")");
        return b11.toString();
    }
}
