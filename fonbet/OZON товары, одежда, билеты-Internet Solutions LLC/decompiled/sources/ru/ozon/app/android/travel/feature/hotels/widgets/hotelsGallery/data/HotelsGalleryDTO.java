package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data;

import B0.A0;
import D40.a;
import Fj.c;
import G.g;
import Kk.C3532b;
import Xc.b;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import ed.InterfaceC6346b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0006!\"#$%&BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO;", "", "items", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$GalleryItem;", "buttons", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$VideoButton;", "mobileSettings", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getButtons", "getMobileSettings", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "GalleryItem", "Image", "Video", "VideoButton", "VideoTrackingInfo", "MobileSettings", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsGalleryDTO {
    public static final int $stable = 8;
    private final List<VideoButton> buttons;

    @NotNull
    private final List<GalleryItem> items;

    @NotNull
    private final MobileSettings mobileSettings;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JL\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$GalleryItem;", "", "image", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$Image;", "video", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$Video;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$Video;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getImage-fX04VSE", "()Ljava/lang/String;", "Ljava/lang/String;", "getVideo", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$Video;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component1-fX04VSE", "component2", "component3", "component4", "copy", "copy-YHYZ9WU", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$Video;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$GalleryItem;", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GalleryItem {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String image;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final Video video;

        public /* synthetic */ GalleryItem(String str, Video video, AtomActionDTO atomActionDTO, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, video, atomActionDTO, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-YHYZ9WU$default, reason: not valid java name */
        public static /* synthetic */ GalleryItem m1357copyYHYZ9WU$default(GalleryItem galleryItem, String str, Video video, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = galleryItem.image;
            }
            if ((i11 & 2) != 0) {
                video = galleryItem.video;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = galleryItem.action;
            }
            if ((i11 & 8) != 0) {
                map = galleryItem.trackingInfo;
            }
            return galleryItem.m1359copyYHYZ9WU(str, video, atomActionDTO, map);
        }

        /* renamed from: component1-fX04VSE, reason: not valid java name and from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final Video getVideo() {
            return this.video;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: copy-YHYZ9WU, reason: not valid java name */
        public final GalleryItem m1359copyYHYZ9WU(String image, Video video, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            return new GalleryItem(image, video, action, trackingInfo, null);
        }

        public boolean equals(Object other) {
            boolean m1364equalsimpl0;
            if (this == other) {
                return true;
            }
            if (!(other instanceof GalleryItem)) {
                return false;
            }
            GalleryItem galleryItem = (GalleryItem) other;
            String str = this.image;
            String str2 = galleryItem.image;
            if (str == null) {
                if (str2 == null) {
                    m1364equalsimpl0 = true;
                }
                m1364equalsimpl0 = false;
            } else {
                if (str2 != null) {
                    m1364equalsimpl0 = Image.m1364equalsimpl0(str, str2);
                }
                m1364equalsimpl0 = false;
            }
            return m1364equalsimpl0 && Intrinsics.d(this.video, galleryItem.video) && Intrinsics.d(this.action, galleryItem.action) && Intrinsics.d(this.trackingInfo, galleryItem.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: getImage-fX04VSE, reason: not valid java name */
        public final String m1360getImagefX04VSE() {
            return this.image;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final Video getVideo() {
            return this.video;
        }

        public int hashCode() {
            String str = this.image;
            int m1365hashCodeimpl = (str == null ? 0 : Image.m1365hashCodeimpl(str)) * 31;
            Video video = this.video;
            int hashCode = (m1365hashCodeimpl + (video == null ? 0 : video.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String m1366toStringimpl = str == null ? "null" : Image.m1366toStringimpl(str);
            Video video = this.video;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("GalleryItem(image=");
            sb2.append(m1366toStringimpl);
            sb2.append(", video=");
            sb2.append(video);
            sb2.append(", action=");
            return a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
        }

        private GalleryItem(String str, Video video, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            this.image = str;
            this.video = video;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }
    }

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$Image;", "", ImagesContract.URL, "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final class Image {

        @NotNull
        private final String url;

        private /* synthetic */ Image(String str) {
            this.url = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Image m1361boximpl(String str) {
            return new Image(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m1362constructorimpl(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return url;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1363equalsimpl(String str, Object obj) {
            return (obj instanceof Image) && Intrinsics.d(str, ((Image) obj).m1367unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1364equalsimpl0(String str, String str2) {
            return Intrinsics.d(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1365hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1366toStringimpl(String str) {
            return A0.b("Image(url=", str, ")");
        }

        public boolean equals(Object obj) {
            return m1363equalsimpl(this.url, obj);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return m1365hashCodeimpl(this.url);
        }

        public String toString() {
            return m1366toStringimpl(this.url);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m1367unboximpl() {
            return this.url;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$VideoButton;", "", "enableButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "disableButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getEnableButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDisableButton", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoButton {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final IconButtonV3DTO disableButton;

        @NotNull
        private final IconButtonV3DTO enableButton;

        public VideoButton(@NotNull IconButtonV3DTO enableButton, IconButtonV3DTO iconButtonV3DTO) {
            Intrinsics.checkNotNullParameter(enableButton, "enableButton");
            this.enableButton = enableButton;
            this.disableButton = iconButtonV3DTO;
        }

        public static /* synthetic */ VideoButton copy$default(VideoButton videoButton, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonV3DTO = videoButton.enableButton;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO2 = videoButton.disableButton;
            }
            return videoButton.copy(iconButtonV3DTO, iconButtonV3DTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconButtonV3DTO getEnableButton() {
            return this.enableButton;
        }

        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getDisableButton() {
            return this.disableButton;
        }

        @NotNull
        public final VideoButton copy(@NotNull IconButtonV3DTO enableButton, IconButtonV3DTO disableButton) {
            Intrinsics.checkNotNullParameter(enableButton, "enableButton");
            return new VideoButton(enableButton, disableButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoButton)) {
                return false;
            }
            VideoButton videoButton = (VideoButton) other;
            return Intrinsics.d(this.enableButton, videoButton.enableButton) && Intrinsics.d(this.disableButton, videoButton.disableButton);
        }

        public final IconButtonV3DTO getDisableButton() {
            return this.disableButton;
        }

        @NotNull
        public final IconButtonV3DTO getEnableButton() {
            return this.enableButton;
        }

        public int hashCode() {
            int hashCode = this.enableButton.hashCode() * 31;
            IconButtonV3DTO iconButtonV3DTO = this.disableButton;
            return hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "VideoButton(enableButton=" + this.enableButton + ", disableButton=" + this.disableButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$VideoTrackingInfo;", "", "startVideo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "endVideo", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getStartVideo", "()Ljava/util/Map;", "getEndVideo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoTrackingInfo {
        public static final int $stable = 8;
        private final Map<String, TokenizedTrackingInfo> endVideo;
        private final Map<String, TokenizedTrackingInfo> startVideo;

        public VideoTrackingInfo(Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
            this.startVideo = map;
            this.endVideo = map2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VideoTrackingInfo copy$default(VideoTrackingInfo videoTrackingInfo, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = videoTrackingInfo.startVideo;
            }
            if ((i11 & 2) != 0) {
                map2 = videoTrackingInfo.endVideo;
            }
            return videoTrackingInfo.copy(map, map2);
        }

        public final Map<String, TokenizedTrackingInfo> component1() {
            return this.startVideo;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.endVideo;
        }

        @NotNull
        public final VideoTrackingInfo copy(Map<String, TokenizedTrackingInfo> startVideo, Map<String, TokenizedTrackingInfo> endVideo) {
            return new VideoTrackingInfo(startVideo, endVideo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoTrackingInfo)) {
                return false;
            }
            VideoTrackingInfo videoTrackingInfo = (VideoTrackingInfo) other;
            return Intrinsics.d(this.startVideo, videoTrackingInfo.startVideo) && Intrinsics.d(this.endVideo, videoTrackingInfo.endVideo);
        }

        public final Map<String, TokenizedTrackingInfo> getEndVideo() {
            return this.endVideo;
        }

        public final Map<String, TokenizedTrackingInfo> getStartVideo() {
            return this.startVideo;
        }

        public int hashCode() {
            Map<String, TokenizedTrackingInfo> map = this.startVideo;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.endVideo;
            return hashCode + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "VideoTrackingInfo(startVideo=" + this.startVideo + ", endVideo=" + this.endVideo + ")";
        }
    }

    public HotelsGalleryDTO(@NotNull List<GalleryItem> items, List<VideoButton> list, @NotNull MobileSettings mobileSettings, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(mobileSettings, "mobileSettings");
        this.items = items;
        this.buttons = list;
        this.mobileSettings = mobileSettings;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelsGalleryDTO copy$default(HotelsGalleryDTO hotelsGalleryDTO, List list, List list2, MobileSettings mobileSettings, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = hotelsGalleryDTO.items;
        }
        if ((i11 & 2) != 0) {
            list2 = hotelsGalleryDTO.buttons;
        }
        if ((i11 & 4) != 0) {
            mobileSettings = hotelsGalleryDTO.mobileSettings;
        }
        if ((i11 & 8) != 0) {
            map = hotelsGalleryDTO.trackingInfo;
        }
        return hotelsGalleryDTO.copy(list, list2, mobileSettings, map);
    }

    @NotNull
    public final List<GalleryItem> component1() {
        return this.items;
    }

    public final List<VideoButton> component2() {
        return this.buttons;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final MobileSettings getMobileSettings() {
        return this.mobileSettings;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsGalleryDTO copy(@NotNull List<GalleryItem> items, List<VideoButton> buttons, @NotNull MobileSettings mobileSettings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(mobileSettings, "mobileSettings");
        return new HotelsGalleryDTO(items, buttons, mobileSettings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsGalleryDTO)) {
            return false;
        }
        HotelsGalleryDTO hotelsGalleryDTO = (HotelsGalleryDTO) other;
        return Intrinsics.d(this.items, hotelsGalleryDTO.items) && Intrinsics.d(this.buttons, hotelsGalleryDTO.buttons) && Intrinsics.d(this.mobileSettings, hotelsGalleryDTO.mobileSettings) && Intrinsics.d(this.trackingInfo, hotelsGalleryDTO.trackingInfo);
    }

    public final List<VideoButton> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final List<GalleryItem> getItems() {
        return this.items;
    }

    @NotNull
    public final MobileSettings getMobileSettings() {
        return this.mobileSettings;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        List<VideoButton> list = this.buttons;
        int hashCode2 = (this.mobileSettings.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<GalleryItem> list = this.items;
        List<VideoButton> list2 = this.buttons;
        MobileSettings mobileSettings = this.mobileSettings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = c.d("HotelsGalleryDTO(items=", list, ", buttons=", ", mobileSettings=", list2);
        d11.append(mobileSettings);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$Video;", "", "video", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "previewUrl", "", "isAutoplay", "", "videoTrackingInfo", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$VideoTrackingInfo;", "<init>", "(Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Ljava/lang/String;ZLru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$VideoTrackingInfo;)V", "getVideo", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getPreviewUrl", "()Ljava/lang/String;", "()Z", "getVideoTrackingInfo", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$VideoTrackingInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Video {
        public static final int $stable = 8;
        private final boolean isAutoplay;

        @NotNull
        private final String previewUrl;

        @NotNull
        private final VideoMolecule video;
        private final VideoTrackingInfo videoTrackingInfo;

        public Video(@NotNull VideoMolecule video, @NotNull String previewUrl, boolean z11, VideoTrackingInfo videoTrackingInfo) {
            Intrinsics.checkNotNullParameter(video, "video");
            Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
            this.video = video;
            this.previewUrl = previewUrl;
            this.isAutoplay = z11;
            this.videoTrackingInfo = videoTrackingInfo;
        }

        public static /* synthetic */ Video copy$default(Video video, VideoMolecule videoMolecule, String str, boolean z11, VideoTrackingInfo videoTrackingInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                videoMolecule = video.video;
            }
            if ((i11 & 2) != 0) {
                str = video.previewUrl;
            }
            if ((i11 & 4) != 0) {
                z11 = video.isAutoplay;
            }
            if ((i11 & 8) != 0) {
                videoTrackingInfo = video.videoTrackingInfo;
            }
            return video.copy(videoMolecule, str, z11, videoTrackingInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final VideoMolecule getVideo() {
            return this.video;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPreviewUrl() {
            return this.previewUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsAutoplay() {
            return this.isAutoplay;
        }

        /* renamed from: component4, reason: from getter */
        public final VideoTrackingInfo getVideoTrackingInfo() {
            return this.videoTrackingInfo;
        }

        @NotNull
        public final Video copy(@NotNull VideoMolecule video, @NotNull String previewUrl, boolean isAutoplay, VideoTrackingInfo videoTrackingInfo) {
            Intrinsics.checkNotNullParameter(video, "video");
            Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
            return new Video(video, previewUrl, isAutoplay, videoTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Video)) {
                return false;
            }
            Video video = (Video) other;
            return Intrinsics.d(this.video, video.video) && Intrinsics.d(this.previewUrl, video.previewUrl) && this.isAutoplay == video.isAutoplay && Intrinsics.d(this.videoTrackingInfo, video.videoTrackingInfo);
        }

        @NotNull
        public final String getPreviewUrl() {
            return this.previewUrl;
        }

        @NotNull
        public final VideoMolecule getVideo() {
            return this.video;
        }

        public final VideoTrackingInfo getVideoTrackingInfo() {
            return this.videoTrackingInfo;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(this.video.hashCode() * 31, 31, this.previewUrl), 31, this.isAutoplay);
            VideoTrackingInfo videoTrackingInfo = this.videoTrackingInfo;
            return a11 + (videoTrackingInfo == null ? 0 : videoTrackingInfo.hashCode());
        }

        public final boolean isAutoplay() {
            return this.isAutoplay;
        }

        @NotNull
        public String toString() {
            return "Video(video=" + this.video + ", previewUrl=" + this.previewUrl + ", isAutoplay=" + this.isAutoplay + ", videoTrackingInfo=" + this.videoTrackingInfo + ")";
        }

        public /* synthetic */ Video(VideoMolecule videoMolecule, String str, boolean z11, VideoTrackingInfo videoTrackingInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(videoMolecule, str, (i11 & 4) != 0 ? true : z11, videoTrackingInfo);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jc\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings;", "", "backgroundColor", "", "islandRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "islandTopPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "islandBackgroundColor", "aspectRatio", "pageControl", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "hotelsGalleryFeedAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getIslandRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getIslandTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getIslandBackgroundColor", "getAspectRatio", "getPageControl", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getHotelsGalleryFeedAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "PageControl", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class MobileSettings {
        public static final int $stable = 0;
        private final String aspectRatio;
        private final String backgroundColor;
        private final BadgeDTO badge;
        private final AtomActionDTO hotelsGalleryFeedAction;
        private final String islandBackgroundColor;

        @NotNull
        private final CornerRadius islandRadius;

        @NotNull
        private final Paddings islandTopPadding;

        @NotNull
        private final PageControl pageControl;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl;", "", "indicatorType", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl$IndicatorType;", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl$IndicatorType;)V", "getIndicatorType", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl$IndicatorType;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "IndicatorType", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class PageControl {
            public static final int $stable = 0;

            @EnumNullFallback
            @NotNull
            private final IndicatorType indicatorType;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl$IndicatorType;", "", "<init>", "(Ljava/lang/String;I)V", "INDICATOR_TYPE_DOTS", "INDICATOR_TYPE_LINE", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class IndicatorType {
                private static final /* synthetic */ Xc.a $ENTRIES;
                private static final /* synthetic */ IndicatorType[] $VALUES;

                @i(name = "INDICATOR_TYPE_DOTS")
                public static final IndicatorType INDICATOR_TYPE_DOTS = new IndicatorType("INDICATOR_TYPE_DOTS", 0);

                @i(name = "INDICATOR_TYPE_LINE")
                public static final IndicatorType INDICATOR_TYPE_LINE = new IndicatorType("INDICATOR_TYPE_LINE", 1);

                private static final /* synthetic */ IndicatorType[] $values() {
                    return new IndicatorType[]{INDICATOR_TYPE_DOTS, INDICATOR_TYPE_LINE};
                }

                static {
                    IndicatorType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private IndicatorType(String str, int i11) {
                }

                public static IndicatorType valueOf(String str) {
                    return (IndicatorType) Enum.valueOf(IndicatorType.class, str);
                }

                public static IndicatorType[] values() {
                    return (IndicatorType[]) $VALUES.clone();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public PageControl() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ PageControl copy$default(PageControl pageControl, IndicatorType indicatorType, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    indicatorType = pageControl.indicatorType;
                }
                return pageControl.copy(indicatorType);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final IndicatorType getIndicatorType() {
                return this.indicatorType;
            }

            @NotNull
            public final PageControl copy(@NotNull IndicatorType indicatorType) {
                Intrinsics.checkNotNullParameter(indicatorType, "indicatorType");
                return new PageControl(indicatorType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PageControl) && this.indicatorType == ((PageControl) other).indicatorType;
            }

            @NotNull
            public final IndicatorType getIndicatorType() {
                return this.indicatorType;
            }

            public int hashCode() {
                return this.indicatorType.hashCode();
            }

            @NotNull
            public String toString() {
                return "PageControl(indicatorType=" + this.indicatorType + ")";
            }

            public PageControl(@NotNull IndicatorType indicatorType) {
                Intrinsics.checkNotNullParameter(indicatorType, "indicatorType");
                this.indicatorType = indicatorType;
            }

            public /* synthetic */ PageControl(IndicatorType indicatorType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? IndicatorType.INDICATOR_TYPE_DOTS : indicatorType);
            }
        }

        public MobileSettings(String str, @NotNull CornerRadius islandRadius, @NotNull Paddings islandTopPadding, String str2, String str3, @NotNull PageControl pageControl, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(islandRadius, "islandRadius");
            Intrinsics.checkNotNullParameter(islandTopPadding, "islandTopPadding");
            Intrinsics.checkNotNullParameter(pageControl, "pageControl");
            this.backgroundColor = str;
            this.islandRadius = islandRadius;
            this.islandTopPadding = islandTopPadding;
            this.islandBackgroundColor = str2;
            this.aspectRatio = str3;
            this.pageControl = pageControl;
            this.badge = badgeDTO;
            this.hotelsGalleryFeedAction = atomActionDTO;
        }

        public static /* synthetic */ MobileSettings copy$default(MobileSettings mobileSettings, String str, CornerRadius cornerRadius, Paddings paddings, String str2, String str3, PageControl pageControl, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = mobileSettings.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                cornerRadius = mobileSettings.islandRadius;
            }
            if ((i11 & 4) != 0) {
                paddings = mobileSettings.islandTopPadding;
            }
            if ((i11 & 8) != 0) {
                str2 = mobileSettings.islandBackgroundColor;
            }
            if ((i11 & 16) != 0) {
                str3 = mobileSettings.aspectRatio;
            }
            if ((i11 & 32) != 0) {
                pageControl = mobileSettings.pageControl;
            }
            if ((i11 & 64) != 0) {
                badgeDTO = mobileSettings.badge;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                atomActionDTO = mobileSettings.hotelsGalleryFeedAction;
            }
            BadgeDTO badgeDTO2 = badgeDTO;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str4 = str3;
            PageControl pageControl2 = pageControl;
            return mobileSettings.copy(str, cornerRadius, paddings, str2, str4, pageControl2, badgeDTO2, atomActionDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CornerRadius getIslandRadius() {
            return this.islandRadius;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getIslandTopPadding() {
            return this.islandTopPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIslandBackgroundColor() {
            return this.islandBackgroundColor;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAspectRatio() {
            return this.aspectRatio;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final PageControl getPageControl() {
            return this.pageControl;
        }

        /* renamed from: component7, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component8, reason: from getter */
        public final AtomActionDTO getHotelsGalleryFeedAction() {
            return this.hotelsGalleryFeedAction;
        }

        @NotNull
        public final MobileSettings copy(String backgroundColor, @NotNull CornerRadius islandRadius, @NotNull Paddings islandTopPadding, String islandBackgroundColor, String aspectRatio, @NotNull PageControl pageControl, BadgeDTO badge, AtomActionDTO hotelsGalleryFeedAction) {
            Intrinsics.checkNotNullParameter(islandRadius, "islandRadius");
            Intrinsics.checkNotNullParameter(islandTopPadding, "islandTopPadding");
            Intrinsics.checkNotNullParameter(pageControl, "pageControl");
            return new MobileSettings(backgroundColor, islandRadius, islandTopPadding, islandBackgroundColor, aspectRatio, pageControl, badge, hotelsGalleryFeedAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MobileSettings)) {
                return false;
            }
            MobileSettings mobileSettings = (MobileSettings) other;
            return Intrinsics.d(this.backgroundColor, mobileSettings.backgroundColor) && this.islandRadius == mobileSettings.islandRadius && this.islandTopPadding == mobileSettings.islandTopPadding && Intrinsics.d(this.islandBackgroundColor, mobileSettings.islandBackgroundColor) && Intrinsics.d(this.aspectRatio, mobileSettings.aspectRatio) && Intrinsics.d(this.pageControl, mobileSettings.pageControl) && Intrinsics.d(this.badge, mobileSettings.badge) && Intrinsics.d(this.hotelsGalleryFeedAction, mobileSettings.hotelsGalleryFeedAction);
        }

        public final String getAspectRatio() {
            return this.aspectRatio;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final AtomActionDTO getHotelsGalleryFeedAction() {
            return this.hotelsGalleryFeedAction;
        }

        public final String getIslandBackgroundColor() {
            return this.islandBackgroundColor;
        }

        @NotNull
        public final CornerRadius getIslandRadius() {
            return this.islandRadius;
        }

        @NotNull
        public final Paddings getIslandTopPadding() {
            return this.islandTopPadding;
        }

        @NotNull
        public final PageControl getPageControl() {
            return this.pageControl;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int b11 = GR.b.b(this.islandTopPadding, Tl.b.b(this.islandRadius, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
            String str2 = this.islandBackgroundColor;
            int hashCode = (b11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.aspectRatio;
            int hashCode2 = (this.pageControl.hashCode() + ((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.hotelsGalleryFeedAction;
            return hashCode3 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MobileSettings(backgroundColor=" + this.backgroundColor + ", islandRadius=" + this.islandRadius + ", islandTopPadding=" + this.islandTopPadding + ", islandBackgroundColor=" + this.islandBackgroundColor + ", aspectRatio=" + this.aspectRatio + ", pageControl=" + this.pageControl + ", badge=" + this.badge + ", hotelsGalleryFeedAction=" + this.hotelsGalleryFeedAction + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ MobileSettings(String str, CornerRadius cornerRadius, Paddings paddings, String str2, String str3, PageControl pageControl, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, r2, r3, str2, str3, r6, badgeDTO, atomActionDTO);
            PageControl pageControl2;
            CornerRadius cornerRadius2 = (i11 & 2) != 0 ? CornerRadius.RADIUS_600 : cornerRadius;
            Paddings paddings2 = (i11 & 4) != 0 ? Paddings.PADDING_500 : paddings;
            if ((i11 & 32) != 0) {
                pageControl2 = new PageControl(null, 1, 0 == true ? 1 : 0);
            } else {
                pageControl2 = pageControl;
            }
        }
    }
}
