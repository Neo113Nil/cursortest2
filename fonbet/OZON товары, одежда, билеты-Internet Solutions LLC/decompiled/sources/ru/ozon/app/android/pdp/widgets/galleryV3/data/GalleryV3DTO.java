package ru.ozon.app.android.pdp.widgets.galleryV3.data;

import Fj.c;
import G.g;
import N3.C3660k;
import T7.P;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u00040123Bi\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003J~\u0010(\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\t\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\r\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00064"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO;", "", "items", "", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem;", "badges", "Lru/ozon/uni/atoms/data/badge/Badge;", "buttons", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "isParandjaEnabled", "", "ratio", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$Ratio;", "isClassified", "classifiedInfo", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$ClassifiedInfo;", "trackingInfo", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$TrackingInfoWrapper;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$Ratio;Ljava/lang/Boolean;Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$ClassifiedInfo;Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$TrackingInfoWrapper;)V", "getItems", "()Ljava/util/List;", "getBadges", "getButtons", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRatio", "()Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$Ratio;", "getClassifiedInfo", "()Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$ClassifiedInfo;", "getTrackingInfo", "()Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$TrackingInfoWrapper;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$Ratio;Ljava/lang/Boolean;Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$ClassifiedInfo;Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$TrackingInfoWrapper;)Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO;", "equals", "other", "hashCode", "", "toString", "", "GalleryItem", "Ratio", "ClassifiedInfo", "TrackingInfoWrapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryV3DTO {
    public static final int $stable = 8;
    private final List<Badge> badges;
    private final List<ButtonV3Atom.LargeIconButton> buttons;
    private final ClassifiedInfo classifiedInfo;
    private final Boolean isClassified;
    private final Boolean isParandjaEnabled;

    @NotNull
    private final List<GalleryItem> items;
    private final Ratio ratio;
    private final TrackingInfoWrapper trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$ClassifiedInfo;", "", "classifiedText", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "backgroundColor", "", "backgroundAlpha", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/Float;)V", "getClassifiedText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBackgroundColor", "()Ljava/lang/String;", "getBackgroundAlpha", "()Ljava/lang/Float;", "Ljava/lang/Float;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClassifiedInfo {
        public static final int $stable = TextAtom.$stable;
        private final Float backgroundAlpha;
        private final String backgroundColor;
        private final TextAtom classifiedText;

        public ClassifiedInfo(TextAtom textAtom, String str, Float f7) {
            this.classifiedText = textAtom;
            this.backgroundColor = str;
            this.backgroundAlpha = f7;
        }

        public final Float getBackgroundAlpha() {
            return this.backgroundAlpha;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final TextAtom getClassifiedText() {
            return this.classifiedText;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem;", "", "<init>", "()V", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getTrackingInfo", "()Ljava/util/Map;", "Image", "Photo360", "OzonVideo", "VideoTrackingInfo", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$Image;", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$OzonVideo;", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$Photo360;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class GalleryItem {
        public static final int $stable = 0;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JH\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0004\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$Image;", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem;", ImagesContract.URL, "", "isBorderless", "", "alpha", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/util/Map;)V", "getUrl", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAlpha", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/util/Map;)Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$Image;", "equals", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image extends GalleryItem {
            public static final int $stable = 8;
            private final Float alpha;
            private final Boolean isBorderless;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @NotNull
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(@NotNull String url, Boolean bool, Float f7, Map<String, TokenizedTrackingInfo> map) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.isBorderless = bool;
                this.alpha = f7;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Image copy$default(Image image, String str, Boolean bool, Float f7, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = image.url;
                }
                if ((i11 & 2) != 0) {
                    bool = image.isBorderless;
                }
                if ((i11 & 4) != 0) {
                    f7 = image.alpha;
                }
                if ((i11 & 8) != 0) {
                    map = image.trackingInfo;
                }
                return image.copy(str, bool, f7, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: component2, reason: from getter */
            public final Boolean getIsBorderless() {
                return this.isBorderless;
            }

            /* renamed from: component3, reason: from getter */
            public final Float getAlpha() {
                return this.alpha;
            }

            public final Map<String, TokenizedTrackingInfo> component4() {
                return this.trackingInfo;
            }

            @NotNull
            public final Image copy(@NotNull String url, Boolean isBorderless, Float alpha, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new Image(url, isBorderless, alpha, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.d(this.url, image.url) && Intrinsics.d(this.isBorderless, image.isBorderless) && Intrinsics.d(this.alpha, image.alpha) && Intrinsics.d(this.trackingInfo, image.trackingInfo);
            }

            public final Float getAlpha() {
                return this.alpha;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV3.data.GalleryV3DTO.GalleryItem
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int hashCode = this.url.hashCode() * 31;
                Boolean bool = this.isBorderless;
                int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Float f7 = this.alpha;
                int hashCode3 = (hashCode2 + (f7 == null ? 0 : f7.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode3 + (map != null ? map.hashCode() : 0);
            }

            public final Boolean isBorderless() {
                return this.isBorderless;
            }

            @NotNull
            public String toString() {
                return "Image(url=" + this.url + ", isBorderless=" + this.isBorderless + ", alpha=" + this.alpha + ", trackingInfo=" + this.trackingInfo + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JR\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0006\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$OzonVideo;", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem;", "video", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "previewUrl", "", "isAutoplay", "", "videoTrackingInfo", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$VideoTrackingInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$VideoTrackingInfo;Ljava/util/Map;)V", "getVideo", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getPreviewUrl", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVideoTrackingInfo", "()Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$VideoTrackingInfo;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$VideoTrackingInfo;Ljava/util/Map;)Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$OzonVideo;", "equals", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OzonVideo extends GalleryItem {
            public static final int $stable = 8;
            private final Boolean isAutoplay;

            @NotNull
            private final String previewUrl;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @NotNull
            private final VideoMolecule video;
            private final VideoTrackingInfo videoTrackingInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OzonVideo(@NotNull VideoMolecule video, @NotNull String previewUrl, Boolean bool, VideoTrackingInfo videoTrackingInfo, Map<String, TokenizedTrackingInfo> map) {
                super(null);
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                this.video = video;
                this.previewUrl = previewUrl;
                this.isAutoplay = bool;
                this.videoTrackingInfo = videoTrackingInfo;
                this.trackingInfo = map;
            }

            public static /* synthetic */ OzonVideo copy$default(OzonVideo ozonVideo, VideoMolecule videoMolecule, String str, Boolean bool, VideoTrackingInfo videoTrackingInfo, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    videoMolecule = ozonVideo.video;
                }
                if ((i11 & 2) != 0) {
                    str = ozonVideo.previewUrl;
                }
                if ((i11 & 4) != 0) {
                    bool = ozonVideo.isAutoplay;
                }
                if ((i11 & 8) != 0) {
                    videoTrackingInfo = ozonVideo.videoTrackingInfo;
                }
                if ((i11 & 16) != 0) {
                    map = ozonVideo.trackingInfo;
                }
                Map map2 = map;
                Boolean bool2 = bool;
                return ozonVideo.copy(videoMolecule, str, bool2, videoTrackingInfo, map2);
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
            public final Boolean getIsAutoplay() {
                return this.isAutoplay;
            }

            /* renamed from: component4, reason: from getter */
            public final VideoTrackingInfo getVideoTrackingInfo() {
                return this.videoTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.trackingInfo;
            }

            @NotNull
            public final OzonVideo copy(@NotNull VideoMolecule video, @NotNull String previewUrl, Boolean isAutoplay, VideoTrackingInfo videoTrackingInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                return new OzonVideo(video, previewUrl, isAutoplay, videoTrackingInfo, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OzonVideo)) {
                    return false;
                }
                OzonVideo ozonVideo = (OzonVideo) other;
                return Intrinsics.d(this.video, ozonVideo.video) && Intrinsics.d(this.previewUrl, ozonVideo.previewUrl) && Intrinsics.d(this.isAutoplay, ozonVideo.isAutoplay) && Intrinsics.d(this.videoTrackingInfo, ozonVideo.videoTrackingInfo) && Intrinsics.d(this.trackingInfo, ozonVideo.trackingInfo);
            }

            @NotNull
            public final String getPreviewUrl() {
                return this.previewUrl;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV3.data.GalleryV3DTO.GalleryItem
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            @NotNull
            public final VideoMolecule getVideo() {
                return this.video;
            }

            public final VideoTrackingInfo getVideoTrackingInfo() {
                return this.videoTrackingInfo;
            }

            public int hashCode() {
                int a11 = g.a(this.video.hashCode() * 31, 31, this.previewUrl);
                Boolean bool = this.isAutoplay;
                int hashCode = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
                VideoTrackingInfo videoTrackingInfo = this.videoTrackingInfo;
                int hashCode2 = (hashCode + (videoTrackingInfo == null ? 0 : videoTrackingInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode2 + (map != null ? map.hashCode() : 0);
            }

            public final Boolean isAutoplay() {
                return this.isAutoplay;
            }

            @NotNull
            public String toString() {
                VideoMolecule videoMolecule = this.video;
                String str = this.previewUrl;
                Boolean bool = this.isAutoplay;
                VideoTrackingInfo videoTrackingInfo = this.videoTrackingInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("OzonVideo(video=");
                sb2.append(videoMolecule);
                sb2.append(", previewUrl=");
                sb2.append(str);
                sb2.append(", isAutoplay=");
                sb2.append(bool);
                sb2.append(", videoTrackingInfo=");
                sb2.append(videoTrackingInfo);
                sb2.append(", trackingInfo=");
                return P.f(sb2, map, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$Photo360;", "Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem;", "coverImage", "", "description", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/util/Map;)V", "getCoverImage", "()Ljava/lang/String;", "getDescription", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Photo360 extends GalleryItem {
            public static final int $stable = 8;
            private final ButtonV3Atom.SmallButton button;

            @NotNull
            private final String coverImage;

            @NotNull
            private final String description;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Photo360(@NotNull String coverImage, @NotNull String description, ButtonV3Atom.SmallButton smallButton, Map<String, TokenizedTrackingInfo> map) {
                super(null);
                Intrinsics.checkNotNullParameter(coverImage, "coverImage");
                Intrinsics.checkNotNullParameter(description, "description");
                this.coverImage = coverImage;
                this.description = description;
                this.button = smallButton;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Photo360 copy$default(Photo360 photo360, String str, String str2, ButtonV3Atom.SmallButton smallButton, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = photo360.coverImage;
                }
                if ((i11 & 2) != 0) {
                    str2 = photo360.description;
                }
                if ((i11 & 4) != 0) {
                    smallButton = photo360.button;
                }
                if ((i11 & 8) != 0) {
                    map = photo360.trackingInfo;
                }
                return photo360.copy(str, str2, smallButton, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getCoverImage() {
                return this.coverImage;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component3, reason: from getter */
            public final ButtonV3Atom.SmallButton getButton() {
                return this.button;
            }

            public final Map<String, TokenizedTrackingInfo> component4() {
                return this.trackingInfo;
            }

            @NotNull
            public final Photo360 copy(@NotNull String coverImage, @NotNull String description, ButtonV3Atom.SmallButton button, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(coverImage, "coverImage");
                Intrinsics.checkNotNullParameter(description, "description");
                return new Photo360(coverImage, description, button, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Photo360)) {
                    return false;
                }
                Photo360 photo360 = (Photo360) other;
                return Intrinsics.d(this.coverImage, photo360.coverImage) && Intrinsics.d(this.description, photo360.description) && Intrinsics.d(this.button, photo360.button) && Intrinsics.d(this.trackingInfo, photo360.trackingInfo);
            }

            public final ButtonV3Atom.SmallButton getButton() {
                return this.button;
            }

            @NotNull
            public final String getCoverImage() {
                return this.coverImage;
            }

            @NotNull
            public final String getDescription() {
                return this.description;
            }

            @Override // ru.ozon.app.android.pdp.widgets.galleryV3.data.GalleryV3DTO.GalleryItem
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = g.a(this.coverImage.hashCode() * 31, 31, this.description);
                ButtonV3Atom.SmallButton smallButton = this.button;
                int hashCode = (a11 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.coverImage;
                String str2 = this.description;
                ButtonV3Atom.SmallButton smallButton = this.button;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C3660k.d("Photo360(coverImage=", str, ", description=", str2, ", button=");
                d11.append(smallButton);
                d11.append(", trackingInfo=");
                d11.append(map);
                d11.append(")");
                return d11.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$GalleryItem$VideoTrackingInfo;", "", "openVideo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "startVideo", "endVideo", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getOpenVideo", "()Ljava/util/Map;", "getStartVideo", "getEndVideo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class VideoTrackingInfo {
            public static final int $stable = 8;
            private final Map<String, TokenizedTrackingInfo> endVideo;
            private final Map<String, TokenizedTrackingInfo> openVideo;
            private final Map<String, TokenizedTrackingInfo> startVideo;

            public VideoTrackingInfo(Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
                this.openVideo = map;
                this.startVideo = map2;
                this.endVideo = map3;
            }

            public final Map<String, TokenizedTrackingInfo> getEndVideo() {
                return this.endVideo;
            }

            public final Map<String, TokenizedTrackingInfo> getOpenVideo() {
                return this.openVideo;
            }

            public final Map<String, TokenizedTrackingInfo> getStartVideo() {
                return this.startVideo;
            }
        }

        public /* synthetic */ GalleryItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Map<String, TokenizedTrackingInfo> getTrackingInfo();

        private GalleryItem() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$Ratio;", "", "width", "", "height", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getWidth", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getHeight", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Ratio {
        public static final int $stable = 0;
        private final Float height;
        private final Float width;

        public Ratio(Float f7, Float f11) {
            this.width = f7;
            this.height = f11;
        }

        public final Float getHeight() {
            return this.height;
        }

        public final Float getWidth() {
            return this.width;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/data/GalleryV3DTO$TrackingInfoWrapper;", "", "gallery", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "popup", "popupClose", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getGallery", "()Ljava/util/Map;", "getPopup", "getPopupClose", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TrackingInfoWrapper {
        public static final int $stable = 8;
        private final Map<String, TokenizedTrackingInfo> gallery;
        private final Map<String, TokenizedTrackingInfo> popup;
        private final Map<String, TokenizedTrackingInfo> popupClose;

        public TrackingInfoWrapper(Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
            this.gallery = map;
            this.popup = map2;
            this.popupClose = map3;
        }

        public final Map<String, TokenizedTrackingInfo> getGallery() {
            return this.gallery;
        }

        public final Map<String, TokenizedTrackingInfo> getPopup() {
            return this.popup;
        }

        public final Map<String, TokenizedTrackingInfo> getPopupClose() {
            return this.popupClose;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryV3DTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = GalleryItem.Image.class), @ProtoOneOfSignature(name = "photo360", type = GalleryItem.Photo360.class), @ProtoOneOfSignature(name = "ozonVideo", type = GalleryItem.OzonVideo.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends GalleryItem> items, List<Badge> list, List<ButtonV3Atom.LargeIconButton> list2, Boolean bool, Ratio ratio, Boolean bool2, ClassifiedInfo classifiedInfo, TrackingInfoWrapper trackingInfoWrapper) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.badges = list;
        this.buttons = list2;
        this.isParandjaEnabled = bool;
        this.ratio = ratio;
        this.isClassified = bool2;
        this.classifiedInfo = classifiedInfo;
        this.trackingInfo = trackingInfoWrapper;
    }

    public static /* synthetic */ GalleryV3DTO copy$default(GalleryV3DTO galleryV3DTO, List list, List list2, List list3, Boolean bool, Ratio ratio, Boolean bool2, ClassifiedInfo classifiedInfo, TrackingInfoWrapper trackingInfoWrapper, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = galleryV3DTO.items;
        }
        if ((i11 & 2) != 0) {
            list2 = galleryV3DTO.badges;
        }
        if ((i11 & 4) != 0) {
            list3 = galleryV3DTO.buttons;
        }
        if ((i11 & 8) != 0) {
            bool = galleryV3DTO.isParandjaEnabled;
        }
        if ((i11 & 16) != 0) {
            ratio = galleryV3DTO.ratio;
        }
        if ((i11 & 32) != 0) {
            bool2 = galleryV3DTO.isClassified;
        }
        if ((i11 & 64) != 0) {
            classifiedInfo = galleryV3DTO.classifiedInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            trackingInfoWrapper = galleryV3DTO.trackingInfo;
        }
        ClassifiedInfo classifiedInfo2 = classifiedInfo;
        TrackingInfoWrapper trackingInfoWrapper2 = trackingInfoWrapper;
        Ratio ratio2 = ratio;
        Boolean bool3 = bool2;
        return galleryV3DTO.copy(list, list2, list3, bool, ratio2, bool3, classifiedInfo2, trackingInfoWrapper2);
    }

    @NotNull
    public final List<GalleryItem> component1() {
        return this.items;
    }

    public final List<Badge> component2() {
        return this.badges;
    }

    public final List<ButtonV3Atom.LargeIconButton> component3() {
        return this.buttons;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsParandjaEnabled() {
        return this.isParandjaEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final Ratio getRatio() {
        return this.ratio;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsClassified() {
        return this.isClassified;
    }

    /* renamed from: component7, reason: from getter */
    public final ClassifiedInfo getClassifiedInfo() {
        return this.classifiedInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final TrackingInfoWrapper getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final GalleryV3DTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = GalleryItem.Image.class), @ProtoOneOfSignature(name = "photo360", type = GalleryItem.Photo360.class), @ProtoOneOfSignature(name = "ozonVideo", type = GalleryItem.OzonVideo.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends GalleryItem> items, List<Badge> badges, List<ButtonV3Atom.LargeIconButton> buttons, Boolean isParandjaEnabled, Ratio ratio, Boolean isClassified, ClassifiedInfo classifiedInfo, TrackingInfoWrapper trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new GalleryV3DTO(items, badges, buttons, isParandjaEnabled, ratio, isClassified, classifiedInfo, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryV3DTO)) {
            return false;
        }
        GalleryV3DTO galleryV3DTO = (GalleryV3DTO) other;
        return Intrinsics.d(this.items, galleryV3DTO.items) && Intrinsics.d(this.badges, galleryV3DTO.badges) && Intrinsics.d(this.buttons, galleryV3DTO.buttons) && Intrinsics.d(this.isParandjaEnabled, galleryV3DTO.isParandjaEnabled) && Intrinsics.d(this.ratio, galleryV3DTO.ratio) && Intrinsics.d(this.isClassified, galleryV3DTO.isClassified) && Intrinsics.d(this.classifiedInfo, galleryV3DTO.classifiedInfo) && Intrinsics.d(this.trackingInfo, galleryV3DTO.trackingInfo);
    }

    public final List<Badge> getBadges() {
        return this.badges;
    }

    public final List<ButtonV3Atom.LargeIconButton> getButtons() {
        return this.buttons;
    }

    public final ClassifiedInfo getClassifiedInfo() {
        return this.classifiedInfo;
    }

    @NotNull
    public final List<GalleryItem> getItems() {
        return this.items;
    }

    public final Ratio getRatio() {
        return this.ratio;
    }

    public final TrackingInfoWrapper getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        List<Badge> list = this.badges;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ButtonV3Atom.LargeIconButton> list2 = this.buttons;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isParandjaEnabled;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Ratio ratio = this.ratio;
        int hashCode5 = (hashCode4 + (ratio == null ? 0 : ratio.hashCode())) * 31;
        Boolean bool2 = this.isClassified;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ClassifiedInfo classifiedInfo = this.classifiedInfo;
        int hashCode7 = (hashCode6 + (classifiedInfo == null ? 0 : classifiedInfo.hashCode())) * 31;
        TrackingInfoWrapper trackingInfoWrapper = this.trackingInfo;
        return hashCode7 + (trackingInfoWrapper != null ? trackingInfoWrapper.hashCode() : 0);
    }

    public final Boolean isClassified() {
        return this.isClassified;
    }

    public final Boolean isParandjaEnabled() {
        return this.isParandjaEnabled;
    }

    @NotNull
    public String toString() {
        List<GalleryItem> list = this.items;
        List<Badge> list2 = this.badges;
        List<ButtonV3Atom.LargeIconButton> list3 = this.buttons;
        Boolean bool = this.isParandjaEnabled;
        Ratio ratio = this.ratio;
        Boolean bool2 = this.isClassified;
        ClassifiedInfo classifiedInfo = this.classifiedInfo;
        TrackingInfoWrapper trackingInfoWrapper = this.trackingInfo;
        StringBuilder d11 = c.d("GalleryV3DTO(items=", list, ", badges=", ", buttons=", list2);
        d11.append(list3);
        d11.append(", isParandjaEnabled=");
        d11.append(bool);
        d11.append(", ratio=");
        d11.append(ratio);
        d11.append(", isClassified=");
        d11.append(bool2);
        d11.append(", classifiedInfo=");
        d11.append(classifiedInfo);
        d11.append(", trackingInfo=");
        d11.append(trackingInfoWrapper);
        d11.append(")");
        return d11.toString();
    }
}
