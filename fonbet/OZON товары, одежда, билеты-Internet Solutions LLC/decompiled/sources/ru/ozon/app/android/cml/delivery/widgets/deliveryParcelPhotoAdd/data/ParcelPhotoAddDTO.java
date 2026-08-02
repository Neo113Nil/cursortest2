package ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.data;

import B0.C2454a;
import B4.V;
import Bk.C2638a;
import C.o0;
import El.C2971a;
import G.g;
import Nh.a;
import T7.P;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0003DEFBË\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u0017\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u0017\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003Jé\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u000bHÖ\u0001J\t\u0010C\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u001f\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+¨\u0006G"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO;", "", "pickerItem", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$ItemDTO;", "emptyItem", "photos", "", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$PhotoItemDTO;", "removeIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "maxItemsCount", "", "photoConfig", "Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$PhotoConfig;", "borderColor", "", "deliveryNumber", "postingNumber", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "uploadTrackingInfo", "uploadErrorTrackingInfo", "deleteTrackingInfo", "deleteErrorTrackingInfo", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$ItemDTO;Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$ItemDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/icon/IconDTO;ILru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$PhotoConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getPickerItem", "()Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$ItemDTO;", "getEmptyItem", "getPhotos", "()Ljava/util/List;", "getRemoveIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getMaxItemsCount", "()I", "getPhotoConfig", "()Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$PhotoConfig;", "getBorderColor", "()Ljava/lang/String;", "getDeliveryNumber", "getPostingNumber", "getTrackingInfo", "()Ljava/util/Map;", "getUploadTrackingInfo", "getUploadErrorTrackingInfo", "getDeleteTrackingInfo", "getDeleteErrorTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "ItemDTO", "PhotoItemDTO", "PhotoConfig", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ParcelPhotoAddDTO {
    private final String borderColor;
    private final Map<String, TokenizedTrackingInfo> deleteErrorTrackingInfo;
    private final Map<String, TokenizedTrackingInfo> deleteTrackingInfo;
    private final String deliveryNumber;

    @NotNull
    private final ItemDTO emptyItem;
    private final int maxItemsCount;

    @NotNull
    private final PhotoConfig photoConfig;
    private final List<PhotoItemDTO> photos;

    @NotNull
    private final ItemDTO pickerItem;
    private final String postingNumber;

    @NotNull
    private final IconDTO removeIcon;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final Map<String, TokenizedTrackingInfo> uploadErrorTrackingInfo;
    private final Map<String, TokenizedTrackingInfo> uploadTrackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$ItemDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemDTO {
        private final IconDTO icon;

        @NotNull
        private final ImageDTO image;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ItemDTO(@NotNull ImageDTO image, IconDTO iconDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.icon = iconDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, ImageDTO imageDTO, IconDTO iconDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = itemDTO.image;
            }
            if ((i11 & 2) != 0) {
                iconDTO = itemDTO.icon;
            }
            if ((i11 & 4) != 0) {
                map = itemDTO.trackingInfo;
            }
            return itemDTO.copy(imageDTO, iconDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final ItemDTO copy(@NotNull ImageDTO image, IconDTO icon, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new ItemDTO(image, icon, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDTO)) {
                return false;
            }
            ItemDTO itemDTO = (ItemDTO) other;
            return Intrinsics.d(this.image, itemDTO.image) && Intrinsics.d(this.icon, itemDTO.icon) && Intrinsics.d(this.trackingInfo, itemDTO.trackingInfo);
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            IconDTO iconDTO = this.icon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            IconDTO iconDTO = this.icon;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ItemDTO(image=");
            sb2.append(imageDTO);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$PhotoConfig;", "", "uploadPhotoAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "deletePhotoAction", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getUploadPhotoAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDeletePhotoAction", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhotoConfig {

        @NotNull
        private final AtomActionDTO deletePhotoAction;

        @NotNull
        private final AtomActionDTO uploadPhotoAction;

        public PhotoConfig(@NotNull AtomActionDTO uploadPhotoAction, @NotNull AtomActionDTO deletePhotoAction) {
            Intrinsics.checkNotNullParameter(uploadPhotoAction, "uploadPhotoAction");
            Intrinsics.checkNotNullParameter(deletePhotoAction, "deletePhotoAction");
            this.uploadPhotoAction = uploadPhotoAction;
            this.deletePhotoAction = deletePhotoAction;
        }

        public static /* synthetic */ PhotoConfig copy$default(PhotoConfig photoConfig, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = photoConfig.uploadPhotoAction;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO2 = photoConfig.deletePhotoAction;
            }
            return photoConfig.copy(atomActionDTO, atomActionDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getUploadPhotoAction() {
            return this.uploadPhotoAction;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getDeletePhotoAction() {
            return this.deletePhotoAction;
        }

        @NotNull
        public final PhotoConfig copy(@NotNull AtomActionDTO uploadPhotoAction, @NotNull AtomActionDTO deletePhotoAction) {
            Intrinsics.checkNotNullParameter(uploadPhotoAction, "uploadPhotoAction");
            Intrinsics.checkNotNullParameter(deletePhotoAction, "deletePhotoAction");
            return new PhotoConfig(uploadPhotoAction, deletePhotoAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoConfig)) {
                return false;
            }
            PhotoConfig photoConfig = (PhotoConfig) other;
            return Intrinsics.d(this.uploadPhotoAction, photoConfig.uploadPhotoAction) && Intrinsics.d(this.deletePhotoAction, photoConfig.deletePhotoAction);
        }

        @NotNull
        public final AtomActionDTO getDeletePhotoAction() {
            return this.deletePhotoAction;
        }

        @NotNull
        public final AtomActionDTO getUploadPhotoAction() {
            return this.uploadPhotoAction;
        }

        public int hashCode() {
            return this.deletePhotoAction.hashCode() + (this.uploadPhotoAction.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PhotoConfig(uploadPhotoAction=" + this.uploadPhotoAction + ", deletePhotoAction=" + this.deletePhotoAction + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/deliveryParcelPhotoAdd/data/ParcelPhotoAddDTO$PhotoItemDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "photoId", "", "cdnUrl", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getPhotoId", "()Ljava/lang/String;", "getCdnUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhotoItemDTO {
        private final String cdnUrl;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final String photoId;

        public PhotoItemDTO(@NotNull ImageDTO image, @NotNull String photoId, String str) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(photoId, "photoId");
            this.image = image;
            this.photoId = photoId;
            this.cdnUrl = str;
        }

        public static /* synthetic */ PhotoItemDTO copy$default(PhotoItemDTO photoItemDTO, ImageDTO imageDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = photoItemDTO.image;
            }
            if ((i11 & 2) != 0) {
                str = photoItemDTO.photoId;
            }
            if ((i11 & 4) != 0) {
                str2 = photoItemDTO.cdnUrl;
            }
            return photoItemDTO.copy(imageDTO, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPhotoId() {
            return this.photoId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCdnUrl() {
            return this.cdnUrl;
        }

        @NotNull
        public final PhotoItemDTO copy(@NotNull ImageDTO image, @NotNull String photoId, String cdnUrl) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(photoId, "photoId");
            return new PhotoItemDTO(image, photoId, cdnUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoItemDTO)) {
                return false;
            }
            PhotoItemDTO photoItemDTO = (PhotoItemDTO) other;
            return Intrinsics.d(this.image, photoItemDTO.image) && Intrinsics.d(this.photoId, photoItemDTO.photoId) && Intrinsics.d(this.cdnUrl, photoItemDTO.cdnUrl);
        }

        public final String getCdnUrl() {
            return this.cdnUrl;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final String getPhotoId() {
            return this.photoId;
        }

        public int hashCode() {
            int a11 = g.a(this.image.hashCode() * 31, 31, this.photoId);
            String str = this.cdnUrl;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            String str = this.photoId;
            String str2 = this.cdnUrl;
            StringBuilder sb2 = new StringBuilder("PhotoItemDTO(image=");
            sb2.append(imageDTO);
            sb2.append(", photoId=");
            sb2.append(str);
            sb2.append(", cdnUrl=");
            return o0.c(sb2, str2, ")");
        }
    }

    public ParcelPhotoAddDTO(@NotNull ItemDTO pickerItem, @NotNull ItemDTO emptyItem, List<PhotoItemDTO> list, @NotNull IconDTO removeIcon, int i11, @NotNull PhotoConfig photoConfig, String str, String str2, String str3, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, Map<String, TokenizedTrackingInfo> map4, Map<String, TokenizedTrackingInfo> map5) {
        Intrinsics.checkNotNullParameter(pickerItem, "pickerItem");
        Intrinsics.checkNotNullParameter(emptyItem, "emptyItem");
        Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
        Intrinsics.checkNotNullParameter(photoConfig, "photoConfig");
        this.pickerItem = pickerItem;
        this.emptyItem = emptyItem;
        this.photos = list;
        this.removeIcon = removeIcon;
        this.maxItemsCount = i11;
        this.photoConfig = photoConfig;
        this.borderColor = str;
        this.deliveryNumber = str2;
        this.postingNumber = str3;
        this.trackingInfo = map;
        this.uploadTrackingInfo = map2;
        this.uploadErrorTrackingInfo = map3;
        this.deleteTrackingInfo = map4;
        this.deleteErrorTrackingInfo = map5;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ItemDTO getPickerItem() {
        return this.pickerItem;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.uploadTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.uploadErrorTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component13() {
        return this.deleteTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component14() {
        return this.deleteErrorTrackingInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ItemDTO getEmptyItem() {
        return this.emptyItem;
    }

    public final List<PhotoItemDTO> component3() {
        return this.photos;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final IconDTO getRemoveIcon() {
        return this.removeIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxItemsCount() {
        return this.maxItemsCount;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final PhotoConfig getPhotoConfig() {
        return this.photoConfig;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDeliveryNumber() {
        return this.deliveryNumber;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPostingNumber() {
        return this.postingNumber;
    }

    @NotNull
    public final ParcelPhotoAddDTO copy(@NotNull ItemDTO pickerItem, @NotNull ItemDTO emptyItem, List<PhotoItemDTO> photos, @NotNull IconDTO removeIcon, int maxItemsCount, @NotNull PhotoConfig photoConfig, String borderColor, String deliveryNumber, String postingNumber, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> uploadTrackingInfo, Map<String, TokenizedTrackingInfo> uploadErrorTrackingInfo, Map<String, TokenizedTrackingInfo> deleteTrackingInfo, Map<String, TokenizedTrackingInfo> deleteErrorTrackingInfo) {
        Intrinsics.checkNotNullParameter(pickerItem, "pickerItem");
        Intrinsics.checkNotNullParameter(emptyItem, "emptyItem");
        Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
        Intrinsics.checkNotNullParameter(photoConfig, "photoConfig");
        return new ParcelPhotoAddDTO(pickerItem, emptyItem, photos, removeIcon, maxItemsCount, photoConfig, borderColor, deliveryNumber, postingNumber, trackingInfo, uploadTrackingInfo, uploadErrorTrackingInfo, deleteTrackingInfo, deleteErrorTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParcelPhotoAddDTO)) {
            return false;
        }
        ParcelPhotoAddDTO parcelPhotoAddDTO = (ParcelPhotoAddDTO) other;
        return Intrinsics.d(this.pickerItem, parcelPhotoAddDTO.pickerItem) && Intrinsics.d(this.emptyItem, parcelPhotoAddDTO.emptyItem) && Intrinsics.d(this.photos, parcelPhotoAddDTO.photos) && Intrinsics.d(this.removeIcon, parcelPhotoAddDTO.removeIcon) && this.maxItemsCount == parcelPhotoAddDTO.maxItemsCount && Intrinsics.d(this.photoConfig, parcelPhotoAddDTO.photoConfig) && Intrinsics.d(this.borderColor, parcelPhotoAddDTO.borderColor) && Intrinsics.d(this.deliveryNumber, parcelPhotoAddDTO.deliveryNumber) && Intrinsics.d(this.postingNumber, parcelPhotoAddDTO.postingNumber) && Intrinsics.d(this.trackingInfo, parcelPhotoAddDTO.trackingInfo) && Intrinsics.d(this.uploadTrackingInfo, parcelPhotoAddDTO.uploadTrackingInfo) && Intrinsics.d(this.uploadErrorTrackingInfo, parcelPhotoAddDTO.uploadErrorTrackingInfo) && Intrinsics.d(this.deleteTrackingInfo, parcelPhotoAddDTO.deleteTrackingInfo) && Intrinsics.d(this.deleteErrorTrackingInfo, parcelPhotoAddDTO.deleteErrorTrackingInfo);
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final Map<String, TokenizedTrackingInfo> getDeleteErrorTrackingInfo() {
        return this.deleteErrorTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getDeleteTrackingInfo() {
        return this.deleteTrackingInfo;
    }

    public final String getDeliveryNumber() {
        return this.deliveryNumber;
    }

    @NotNull
    public final ItemDTO getEmptyItem() {
        return this.emptyItem;
    }

    public final int getMaxItemsCount() {
        return this.maxItemsCount;
    }

    @NotNull
    public final PhotoConfig getPhotoConfig() {
        return this.photoConfig;
    }

    public final List<PhotoItemDTO> getPhotos() {
        return this.photos;
    }

    @NotNull
    public final ItemDTO getPickerItem() {
        return this.pickerItem;
    }

    public final String getPostingNumber() {
        return this.postingNumber;
    }

    @NotNull
    public final IconDTO getRemoveIcon() {
        return this.removeIcon;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getUploadErrorTrackingInfo() {
        return this.uploadErrorTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getUploadTrackingInfo() {
        return this.uploadTrackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.emptyItem.hashCode() + (this.pickerItem.hashCode() * 31)) * 31;
        List<PhotoItemDTO> list = this.photos;
        int hashCode2 = (this.photoConfig.hashCode() + C2454a.a(this.maxItemsCount, C2971a.a(this.removeIcon, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31)) * 31;
        String str = this.borderColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deliveryNumber;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postingNumber;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.uploadTrackingInfo;
        int hashCode7 = (hashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.uploadErrorTrackingInfo;
        int hashCode8 = (hashCode7 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map4 = this.deleteTrackingInfo;
        int hashCode9 = (hashCode8 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map5 = this.deleteErrorTrackingInfo;
        return hashCode9 + (map5 != null ? map5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ItemDTO itemDTO = this.pickerItem;
        ItemDTO itemDTO2 = this.emptyItem;
        List<PhotoItemDTO> list = this.photos;
        IconDTO iconDTO = this.removeIcon;
        int i11 = this.maxItemsCount;
        PhotoConfig photoConfig = this.photoConfig;
        String str = this.borderColor;
        String str2 = this.deliveryNumber;
        String str3 = this.postingNumber;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.uploadTrackingInfo;
        Map<String, TokenizedTrackingInfo> map3 = this.uploadErrorTrackingInfo;
        Map<String, TokenizedTrackingInfo> map4 = this.deleteTrackingInfo;
        Map<String, TokenizedTrackingInfo> map5 = this.deleteErrorTrackingInfo;
        StringBuilder sb2 = new StringBuilder("ParcelPhotoAddDTO(pickerItem=");
        sb2.append(itemDTO);
        sb2.append(", emptyItem=");
        sb2.append(itemDTO2);
        sb2.append(", photos=");
        sb2.append(list);
        sb2.append(", removeIcon=");
        sb2.append(iconDTO);
        sb2.append(", maxItemsCount=");
        sb2.append(i11);
        sb2.append(", photoConfig=");
        sb2.append(photoConfig);
        sb2.append(", borderColor=");
        a.h(sb2, str, ", deliveryNumber=", str2, ", postingNumber=");
        C2638a.e(sb2, str3, ", trackingInfo=", map, ", uploadTrackingInfo=");
        b.g(sb2, map2, ", uploadErrorTrackingInfo=", map3, ", deleteTrackingInfo=");
        return V.c(sb2, map4, ", deleteErrorTrackingInfo=", map5, ")");
    }
}
