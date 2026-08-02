package ru.ozon.app.android.ugc.widgets.common.mediaPicker.data;

import B0.C2454a;
import C.o0;
import El.C2971a;
import G.g;
import N3.C3660k;
import Ql.c;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001:\u0006MNOPQRB¥\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\t\u0010>\u001a\u00020\u000eHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0017\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J\u0017\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u00106JÈ\u0001\u0010F\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u001c2\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020\fHÖ\u0001J\t\u0010L\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0096\u0004¢\u0006\n\n\u0002\u00107\u001a\u0004\b\u001b\u00106¨\u0006S"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO;", "medias", "", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$MediaDTO;", "pickerItem", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$ItemDTO;", "emptyItem", "removeIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "playIcon", "maxItemsCount", "", "photoConfig", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PhotoConfig;", "videoConfig", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$VideoConfig;", "borderColor", "", "pickerItemBadge", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO;", "onBoardingConfig", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$OnBoardingConfigDTO;", "uploadTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "uploadErrorTrackingInfo", "isHidden", "", "<init>", "(Ljava/util/List;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$ItemDTO;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$ItemDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;ILru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PhotoConfig;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$VideoConfig;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$OnBoardingConfigDTO;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;)V", "getMedias", "()Ljava/util/List;", "getPickerItem", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$ItemDTO;", "getEmptyItem", "getRemoveIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPlayIcon", "getMaxItemsCount", "()I", "getPhotoConfig", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PhotoConfig;", "getVideoConfig", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$VideoConfig;", "getBorderColor", "()Ljava/lang/String;", "getPickerItemBadge", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO;", "getOnBoardingConfig", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$OnBoardingConfigDTO;", "getUploadTrackingInfo", "()Ljava/util/Map;", "getUploadErrorTrackingInfo", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/util/List;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$ItemDTO;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$ItemDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;ILru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PhotoConfig;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$VideoConfig;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$OnBoardingConfigDTO;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO;", "equals", "other", "", "hashCode", "toString", "ItemDTO", "MediaDTO", "PhotoConfig", "VideoConfig", "PickerItemBadgeDTO", "OnBoardingConfigDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MediaPickerDTO implements ReviewFormFieldDTO {
    public static final int $stable = 8;
    private final String borderColor;

    @NotNull
    private final ItemDTO emptyItem;
    private final Boolean isHidden;
    private final int maxItemsCount;
    private final List<MediaDTO> medias;
    private final OnBoardingConfigDTO onBoardingConfig;

    @NotNull
    private final PhotoConfig photoConfig;

    @NotNull
    private final ItemDTO pickerItem;
    private final PickerItemBadgeDTO pickerItemBadge;

    @NotNull
    private final IconDTO playIcon;

    @NotNull
    private final IconDTO removeIcon;
    private final Map<String, TokenizedTrackingInfo> uploadErrorTrackingInfo;
    private final Map<String, TokenizedTrackingInfo> uploadTrackingInfo;
    private final VideoConfig videoConfig;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$ItemDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemDTO {
        public static final int $stable = 8;
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J{\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$MediaDTO;", "", "type", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$MediaDTO$MediaType;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "uuid", "", "uploadId", "width", "height", "fileName", "bucket", "removeTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$MediaDTO$MediaType;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getType", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$MediaDTO$MediaType;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getUuid", "()Ljava/lang/String;", "getUploadId", "getWidth", "getHeight", "getFileName", "getBucket", "getRemoveTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "MediaType", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class MediaDTO {
        public static final int $stable = 8;
        private final String bucket;
        private final String fileName;
        private final String height;

        @NotNull
        private final ImageDTO image;
        private final Map<String, TokenizedTrackingInfo> removeTrackingInfo;

        @NotNull
        private final MediaType type;
        private final String uploadId;

        @NotNull
        private final String uuid;
        private final String width;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$MediaDTO$MediaType;", "", "<init>", "(Ljava/lang/String;I)V", "PHOTO", "VIDEO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MediaType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ MediaType[] $VALUES;
            public static final MediaType PHOTO = new MediaType("PHOTO", 0);
            public static final MediaType VIDEO = new MediaType("VIDEO", 1);

            private static final /* synthetic */ MediaType[] $values() {
                return new MediaType[]{PHOTO, VIDEO};
            }

            static {
                MediaType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private MediaType(String str, int i11) {
            }

            public static MediaType valueOf(String str) {
                return (MediaType) Enum.valueOf(MediaType.class, str);
            }

            public static MediaType[] values() {
                return (MediaType[]) $VALUES.clone();
            }
        }

        public MediaDTO(@NotNull MediaType type, @NotNull ImageDTO image, @NotNull String uuid, String str, String str2, String str3, String str4, String str5, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.type = type;
            this.image = image;
            this.uuid = uuid;
            this.uploadId = str;
            this.width = str2;
            this.height = str3;
            this.fileName = str4;
            this.bucket = str5;
            this.removeTrackingInfo = map;
        }

        public static /* synthetic */ MediaDTO copy$default(MediaDTO mediaDTO, MediaType mediaType, ImageDTO imageDTO, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                mediaType = mediaDTO.type;
            }
            if ((i11 & 2) != 0) {
                imageDTO = mediaDTO.image;
            }
            if ((i11 & 4) != 0) {
                str = mediaDTO.uuid;
            }
            if ((i11 & 8) != 0) {
                str2 = mediaDTO.uploadId;
            }
            if ((i11 & 16) != 0) {
                str3 = mediaDTO.width;
            }
            if ((i11 & 32) != 0) {
                str4 = mediaDTO.height;
            }
            if ((i11 & 64) != 0) {
                str5 = mediaDTO.fileName;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str6 = mediaDTO.bucket;
            }
            if ((i11 & 256) != 0) {
                map = mediaDTO.removeTrackingInfo;
            }
            String str7 = str6;
            Map map2 = map;
            String str8 = str4;
            String str9 = str5;
            String str10 = str3;
            String str11 = str;
            return mediaDTO.copy(mediaType, imageDTO, str11, str2, str10, str8, str9, str7, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MediaType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUploadId() {
            return this.uploadId;
        }

        /* renamed from: component5, reason: from getter */
        public final String getWidth() {
            return this.width;
        }

        /* renamed from: component6, reason: from getter */
        public final String getHeight() {
            return this.height;
        }

        /* renamed from: component7, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* renamed from: component8, reason: from getter */
        public final String getBucket() {
            return this.bucket;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.removeTrackingInfo;
        }

        @NotNull
        public final MediaDTO copy(@NotNull MediaType type, @NotNull ImageDTO image, @NotNull String uuid, String uploadId, String width, String height, String fileName, String bucket, Map<String, TokenizedTrackingInfo> removeTrackingInfo) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return new MediaDTO(type, image, uuid, uploadId, width, height, fileName, bucket, removeTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MediaDTO)) {
                return false;
            }
            MediaDTO mediaDTO = (MediaDTO) other;
            return this.type == mediaDTO.type && Intrinsics.d(this.image, mediaDTO.image) && Intrinsics.d(this.uuid, mediaDTO.uuid) && Intrinsics.d(this.uploadId, mediaDTO.uploadId) && Intrinsics.d(this.width, mediaDTO.width) && Intrinsics.d(this.height, mediaDTO.height) && Intrinsics.d(this.fileName, mediaDTO.fileName) && Intrinsics.d(this.bucket, mediaDTO.bucket) && Intrinsics.d(this.removeTrackingInfo, mediaDTO.removeTrackingInfo);
        }

        public final String getBucket() {
            return this.bucket;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getHeight() {
            return this.height;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final Map<String, TokenizedTrackingInfo> getRemoveTrackingInfo() {
            return this.removeTrackingInfo;
        }

        @NotNull
        public final MediaType getType() {
            return this.type;
        }

        public final String getUploadId() {
            return this.uploadId;
        }

        @NotNull
        public final String getUuid() {
            return this.uuid;
        }

        public final String getWidth() {
            return this.width;
        }

        public int hashCode() {
            int a11 = g.a(Nh.a.b(this.image, this.type.hashCode() * 31, 31), 31, this.uuid);
            String str = this.uploadId;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.width;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.height;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fileName;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.bucket;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.removeTrackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            MediaType mediaType = this.type;
            ImageDTO imageDTO = this.image;
            String str = this.uuid;
            String str2 = this.uploadId;
            String str3 = this.width;
            String str4 = this.height;
            String str5 = this.fileName;
            String str6 = this.bucket;
            Map<String, TokenizedTrackingInfo> map = this.removeTrackingInfo;
            StringBuilder sb2 = new StringBuilder("MediaDTO(type=");
            sb2.append(mediaType);
            sb2.append(", image=");
            sb2.append(imageDTO);
            sb2.append(", uuid=");
            Nh.a.h(sb2, str, ", uploadId=", str2, ", width=");
            Nh.a.h(sb2, str3, ", height=", str4, ", fileName=");
            Nh.a.h(sb2, str5, ", bucket=", str6, ", removeTrackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$OnBoardingConfigDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onBoardingKey", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/String;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTracking", "()Ljava/util/Map;", "getOnBoardingKey", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBoardingConfigDTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final String onBoardingKey;
        private final Map<String, TokenizedTrackingInfo> tracking;

        public OnBoardingConfigDTO(@NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, String str) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.tracking = map;
            this.onBoardingKey = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnBoardingConfigDTO copy$default(OnBoardingConfigDTO onBoardingConfigDTO, AtomActionDTO atomActionDTO, Map map, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = onBoardingConfigDTO.action;
            }
            if ((i11 & 2) != 0) {
                map = onBoardingConfigDTO.tracking;
            }
            if ((i11 & 4) != 0) {
                str = onBoardingConfigDTO.onBoardingKey;
            }
            return onBoardingConfigDTO.copy(atomActionDTO, map, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.tracking;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOnBoardingKey() {
            return this.onBoardingKey;
        }

        @NotNull
        public final OnBoardingConfigDTO copy(@NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> tracking, String onBoardingKey) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new OnBoardingConfigDTO(action, tracking, onBoardingKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnBoardingConfigDTO)) {
                return false;
            }
            OnBoardingConfigDTO onBoardingConfigDTO = (OnBoardingConfigDTO) other;
            return Intrinsics.d(this.action, onBoardingConfigDTO.action) && Intrinsics.d(this.tracking, onBoardingConfigDTO.tracking) && Intrinsics.d(this.onBoardingKey, onBoardingConfigDTO.onBoardingKey);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getOnBoardingKey() {
            return this.onBoardingKey;
        }

        public final Map<String, TokenizedTrackingInfo> getTracking() {
            return this.tracking;
        }

        public int hashCode() {
            int hashCode = this.action.hashCode() * 31;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
            String str = this.onBoardingKey;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            String str = this.onBoardingKey;
            StringBuilder sb2 = new StringBuilder("OnBoardingConfigDTO(action=");
            sb2.append(atomActionDTO);
            sb2.append(", tracking=");
            sb2.append(map);
            sb2.append(", onBoardingKey=");
            return o0.c(sb2, str, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PhotoConfig;", "", "uploadKey", "", "uploadImageAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "points", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;)V", "getUploadKey", "()Ljava/lang/String;", "getUploadImageAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPoints", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PhotoConfig;", "equals", "", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhotoConfig {
        public static final int $stable = 0;
        private final Integer points;

        @NotNull
        private final AtomActionDTO uploadImageAction;

        @NotNull
        private final String uploadKey;

        public PhotoConfig(@NotNull String uploadKey, @NotNull AtomActionDTO uploadImageAction, Integer num) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
            this.uploadKey = uploadKey;
            this.uploadImageAction = uploadImageAction;
            this.points = num;
        }

        public static /* synthetic */ PhotoConfig copy$default(PhotoConfig photoConfig, String str, AtomActionDTO atomActionDTO, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = photoConfig.uploadKey;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = photoConfig.uploadImageAction;
            }
            if ((i11 & 4) != 0) {
                num = photoConfig.points;
            }
            return photoConfig.copy(str, atomActionDTO, num);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUploadKey() {
            return this.uploadKey;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getUploadImageAction() {
            return this.uploadImageAction;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getPoints() {
            return this.points;
        }

        @NotNull
        public final PhotoConfig copy(@NotNull String uploadKey, @NotNull AtomActionDTO uploadImageAction, Integer points) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(uploadImageAction, "uploadImageAction");
            return new PhotoConfig(uploadKey, uploadImageAction, points);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoConfig)) {
                return false;
            }
            PhotoConfig photoConfig = (PhotoConfig) other;
            return Intrinsics.d(this.uploadKey, photoConfig.uploadKey) && Intrinsics.d(this.uploadImageAction, photoConfig.uploadImageAction) && Intrinsics.d(this.points, photoConfig.points);
        }

        public final Integer getPoints() {
            return this.points;
        }

        @NotNull
        public final AtomActionDTO getUploadImageAction() {
            return this.uploadImageAction;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public int hashCode() {
            int b11 = Ih.a.b(this.uploadImageAction, this.uploadKey.hashCode() * 31, 31);
            Integer num = this.points;
            return b11 + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            AtomActionDTO atomActionDTO = this.uploadImageAction;
            return Ep.a.c(c.c("PhotoConfig(uploadKey=", str, ", uploadImageAction=", atomActionDTO, ", points="), this.points, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO;", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "hideCondition", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO$HideCondition;", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO$HideCondition;)V", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getHideCondition", "()Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO$HideCondition;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HideCondition", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PickerItemBadgeDTO {
        public static final int $stable = 0;

        @NotNull
        private final BadgeDTO badge;
        private final HideCondition hideCondition;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO$HideCondition;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "PHOTO", "VIDEO", "ANY", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HideCondition {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ HideCondition[] $VALUES;
            public static final HideCondition INVALID = new HideCondition("INVALID", 0);
            public static final HideCondition PHOTO = new HideCondition("PHOTO", 1);
            public static final HideCondition VIDEO = new HideCondition("VIDEO", 2);
            public static final HideCondition ANY = new HideCondition("ANY", 3);

            private static final /* synthetic */ HideCondition[] $values() {
                return new HideCondition[]{INVALID, PHOTO, VIDEO, ANY};
            }

            static {
                HideCondition[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private HideCondition(String str, int i11) {
            }

            public static HideCondition valueOf(String str) {
                return (HideCondition) Enum.valueOf(HideCondition.class, str);
            }

            public static HideCondition[] values() {
                return (HideCondition[]) $VALUES.clone();
            }
        }

        public PickerItemBadgeDTO(@NotNull BadgeDTO badge, HideCondition hideCondition) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.badge = badge;
            this.hideCondition = hideCondition;
        }

        public static /* synthetic */ PickerItemBadgeDTO copy$default(PickerItemBadgeDTO pickerItemBadgeDTO, BadgeDTO badgeDTO, HideCondition hideCondition, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                badgeDTO = pickerItemBadgeDTO.badge;
            }
            if ((i11 & 2) != 0) {
                hideCondition = pickerItemBadgeDTO.hideCondition;
            }
            return pickerItemBadgeDTO.copy(badgeDTO, hideCondition);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component2, reason: from getter */
        public final HideCondition getHideCondition() {
            return this.hideCondition;
        }

        @NotNull
        public final PickerItemBadgeDTO copy(@NotNull BadgeDTO badge, HideCondition hideCondition) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            return new PickerItemBadgeDTO(badge, hideCondition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PickerItemBadgeDTO)) {
                return false;
            }
            PickerItemBadgeDTO pickerItemBadgeDTO = (PickerItemBadgeDTO) other;
            return Intrinsics.d(this.badge, pickerItemBadgeDTO.badge) && this.hideCondition == pickerItemBadgeDTO.hideCondition;
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final HideCondition getHideCondition() {
            return this.hideCondition;
        }

        public int hashCode() {
            int hashCode = this.badge.hashCode() * 31;
            HideCondition hideCondition = this.hideCondition;
            return hashCode + (hideCondition == null ? 0 : hideCondition.hashCode());
        }

        @NotNull
        public String toString() {
            return "PickerItemBadgeDTO(badge=" + this.badge + ", hideCondition=" + this.hideCondition + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$VideoConfig;", "", "uploadKey", "", "videoType", "uploadVideoActionId", "points", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getUploadKey", "()Ljava/lang/String;", "getVideoType", "getUploadVideoActionId", "getPoints", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$VideoConfig;", "equals", "", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoConfig {
        public static final int $stable = 0;
        private final Integer points;

        @NotNull
        private final String uploadKey;

        @NotNull
        private final String uploadVideoActionId;

        @NotNull
        private final String videoType;

        public VideoConfig(@NotNull String uploadKey, @NotNull String videoType, @NotNull String uploadVideoActionId, Integer num) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(videoType, "videoType");
            Intrinsics.checkNotNullParameter(uploadVideoActionId, "uploadVideoActionId");
            this.uploadKey = uploadKey;
            this.videoType = videoType;
            this.uploadVideoActionId = uploadVideoActionId;
            this.points = num;
        }

        public static /* synthetic */ VideoConfig copy$default(VideoConfig videoConfig, String str, String str2, String str3, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = videoConfig.uploadKey;
            }
            if ((i11 & 2) != 0) {
                str2 = videoConfig.videoType;
            }
            if ((i11 & 4) != 0) {
                str3 = videoConfig.uploadVideoActionId;
            }
            if ((i11 & 8) != 0) {
                num = videoConfig.points;
            }
            return videoConfig.copy(str, str2, str3, num);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUploadKey() {
            return this.uploadKey;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getVideoType() {
            return this.videoType;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getUploadVideoActionId() {
            return this.uploadVideoActionId;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getPoints() {
            return this.points;
        }

        @NotNull
        public final VideoConfig copy(@NotNull String uploadKey, @NotNull String videoType, @NotNull String uploadVideoActionId, Integer points) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(videoType, "videoType");
            Intrinsics.checkNotNullParameter(uploadVideoActionId, "uploadVideoActionId");
            return new VideoConfig(uploadKey, videoType, uploadVideoActionId, points);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoConfig)) {
                return false;
            }
            VideoConfig videoConfig = (VideoConfig) other;
            return Intrinsics.d(this.uploadKey, videoConfig.uploadKey) && Intrinsics.d(this.videoType, videoConfig.videoType) && Intrinsics.d(this.uploadVideoActionId, videoConfig.uploadVideoActionId) && Intrinsics.d(this.points, videoConfig.points);
        }

        public final Integer getPoints() {
            return this.points;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        @NotNull
        public final String getUploadVideoActionId() {
            return this.uploadVideoActionId;
        }

        @NotNull
        public final String getVideoType() {
            return this.videoType;
        }

        public int hashCode() {
            int a11 = g.a(g.a(this.uploadKey.hashCode() * 31, 31, this.videoType), 31, this.uploadVideoActionId);
            Integer num = this.points;
            return a11 + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            String str2 = this.videoType;
            String str3 = this.uploadVideoActionId;
            Integer num = this.points;
            StringBuilder d11 = C3660k.d("VideoConfig(uploadKey=", str, ", videoType=", str2, ", uploadVideoActionId=");
            d11.append(str3);
            d11.append(", points=");
            d11.append(num);
            d11.append(")");
            return d11.toString();
        }
    }

    public MediaPickerDTO(List<MediaDTO> list, @NotNull ItemDTO pickerItem, @NotNull ItemDTO emptyItem, @NotNull IconDTO removeIcon, @NotNull IconDTO playIcon, int i11, @NotNull PhotoConfig photoConfig, VideoConfig videoConfig, String str, PickerItemBadgeDTO pickerItemBadgeDTO, OnBoardingConfigDTO onBoardingConfigDTO, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Boolean bool) {
        Intrinsics.checkNotNullParameter(pickerItem, "pickerItem");
        Intrinsics.checkNotNullParameter(emptyItem, "emptyItem");
        Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
        Intrinsics.checkNotNullParameter(playIcon, "playIcon");
        Intrinsics.checkNotNullParameter(photoConfig, "photoConfig");
        this.medias = list;
        this.pickerItem = pickerItem;
        this.emptyItem = emptyItem;
        this.removeIcon = removeIcon;
        this.playIcon = playIcon;
        this.maxItemsCount = i11;
        this.photoConfig = photoConfig;
        this.videoConfig = videoConfig;
        this.borderColor = str;
        this.pickerItemBadge = pickerItemBadgeDTO;
        this.onBoardingConfig = onBoardingConfigDTO;
        this.uploadTrackingInfo = map;
        this.uploadErrorTrackingInfo = map2;
        this.isHidden = bool;
    }

    public final List<MediaDTO> component1() {
        return this.medias;
    }

    /* renamed from: component10, reason: from getter */
    public final PickerItemBadgeDTO getPickerItemBadge() {
        return this.pickerItemBadge;
    }

    /* renamed from: component11, reason: from getter */
    public final OnBoardingConfigDTO getOnBoardingConfig() {
        return this.onBoardingConfig;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.uploadTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component13() {
        return this.uploadErrorTrackingInfo;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getIsHidden() {
        return this.isHidden;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ItemDTO getPickerItem() {
        return this.pickerItem;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ItemDTO getEmptyItem() {
        return this.emptyItem;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final IconDTO getRemoveIcon() {
        return this.removeIcon;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final IconDTO getPlayIcon() {
        return this.playIcon;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMaxItemsCount() {
        return this.maxItemsCount;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final PhotoConfig getPhotoConfig() {
        return this.photoConfig;
    }

    /* renamed from: component8, reason: from getter */
    public final VideoConfig getVideoConfig() {
        return this.videoConfig;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final MediaPickerDTO copy(List<MediaDTO> medias, @NotNull ItemDTO pickerItem, @NotNull ItemDTO emptyItem, @NotNull IconDTO removeIcon, @NotNull IconDTO playIcon, int maxItemsCount, @NotNull PhotoConfig photoConfig, VideoConfig videoConfig, String borderColor, PickerItemBadgeDTO pickerItemBadge, OnBoardingConfigDTO onBoardingConfig, Map<String, TokenizedTrackingInfo> uploadTrackingInfo, Map<String, TokenizedTrackingInfo> uploadErrorTrackingInfo, Boolean isHidden) {
        Intrinsics.checkNotNullParameter(pickerItem, "pickerItem");
        Intrinsics.checkNotNullParameter(emptyItem, "emptyItem");
        Intrinsics.checkNotNullParameter(removeIcon, "removeIcon");
        Intrinsics.checkNotNullParameter(playIcon, "playIcon");
        Intrinsics.checkNotNullParameter(photoConfig, "photoConfig");
        return new MediaPickerDTO(medias, pickerItem, emptyItem, removeIcon, playIcon, maxItemsCount, photoConfig, videoConfig, borderColor, pickerItemBadge, onBoardingConfig, uploadTrackingInfo, uploadErrorTrackingInfo, isHidden);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaPickerDTO)) {
            return false;
        }
        MediaPickerDTO mediaPickerDTO = (MediaPickerDTO) other;
        return Intrinsics.d(this.medias, mediaPickerDTO.medias) && Intrinsics.d(this.pickerItem, mediaPickerDTO.pickerItem) && Intrinsics.d(this.emptyItem, mediaPickerDTO.emptyItem) && Intrinsics.d(this.removeIcon, mediaPickerDTO.removeIcon) && Intrinsics.d(this.playIcon, mediaPickerDTO.playIcon) && this.maxItemsCount == mediaPickerDTO.maxItemsCount && Intrinsics.d(this.photoConfig, mediaPickerDTO.photoConfig) && Intrinsics.d(this.videoConfig, mediaPickerDTO.videoConfig) && Intrinsics.d(this.borderColor, mediaPickerDTO.borderColor) && Intrinsics.d(this.pickerItemBadge, mediaPickerDTO.pickerItemBadge) && Intrinsics.d(this.onBoardingConfig, mediaPickerDTO.onBoardingConfig) && Intrinsics.d(this.uploadTrackingInfo, mediaPickerDTO.uploadTrackingInfo) && Intrinsics.d(this.uploadErrorTrackingInfo, mediaPickerDTO.uploadErrorTrackingInfo) && Intrinsics.d(this.isHidden, mediaPickerDTO.isHidden);
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final ItemDTO getEmptyItem() {
        return this.emptyItem;
    }

    public final int getMaxItemsCount() {
        return this.maxItemsCount;
    }

    public final List<MediaDTO> getMedias() {
        return this.medias;
    }

    public final OnBoardingConfigDTO getOnBoardingConfig() {
        return this.onBoardingConfig;
    }

    @NotNull
    public final PhotoConfig getPhotoConfig() {
        return this.photoConfig;
    }

    @NotNull
    public final ItemDTO getPickerItem() {
        return this.pickerItem;
    }

    public final PickerItemBadgeDTO getPickerItemBadge() {
        return this.pickerItemBadge;
    }

    @NotNull
    public final IconDTO getPlayIcon() {
        return this.playIcon;
    }

    @NotNull
    public final IconDTO getRemoveIcon() {
        return this.removeIcon;
    }

    public final Map<String, TokenizedTrackingInfo> getUploadErrorTrackingInfo() {
        return this.uploadErrorTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getUploadTrackingInfo() {
        return this.uploadTrackingInfo;
    }

    public final VideoConfig getVideoConfig() {
        return this.videoConfig;
    }

    public int hashCode() {
        List<MediaDTO> list = this.medias;
        int hashCode = (this.photoConfig.hashCode() + C2454a.a(this.maxItemsCount, C2971a.a(this.playIcon, C2971a.a(this.removeIcon, (this.emptyItem.hashCode() + ((this.pickerItem.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31)) * 31, 31), 31), 31)) * 31;
        VideoConfig videoConfig = this.videoConfig;
        int hashCode2 = (hashCode + (videoConfig == null ? 0 : videoConfig.hashCode())) * 31;
        String str = this.borderColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PickerItemBadgeDTO pickerItemBadgeDTO = this.pickerItemBadge;
        int hashCode4 = (hashCode3 + (pickerItemBadgeDTO == null ? 0 : pickerItemBadgeDTO.hashCode())) * 31;
        OnBoardingConfigDTO onBoardingConfigDTO = this.onBoardingConfig;
        int hashCode5 = (hashCode4 + (onBoardingConfigDTO == null ? 0 : onBoardingConfigDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.uploadTrackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.uploadErrorTrackingInfo;
        int hashCode7 = (hashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool = this.isHidden;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO
    public Boolean isHidden() {
        return this.isHidden;
    }

    @NotNull
    public String toString() {
        return "MediaPickerDTO(medias=" + this.medias + ", pickerItem=" + this.pickerItem + ", emptyItem=" + this.emptyItem + ", removeIcon=" + this.removeIcon + ", playIcon=" + this.playIcon + ", maxItemsCount=" + this.maxItemsCount + ", photoConfig=" + this.photoConfig + ", videoConfig=" + this.videoConfig + ", borderColor=" + this.borderColor + ", pickerItemBadge=" + this.pickerItemBadge + ", onBoardingConfig=" + this.onBoardingConfig + ", uploadTrackingInfo=" + this.uploadTrackingInfo + ", uploadErrorTrackingInfo=" + this.uploadErrorTrackingInfo + ", isHidden=" + this.isHidden + ")";
    }
}
