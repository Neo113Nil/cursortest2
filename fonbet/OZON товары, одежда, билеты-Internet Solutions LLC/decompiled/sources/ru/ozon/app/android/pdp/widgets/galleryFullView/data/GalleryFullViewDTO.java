package ru.ozon.app.android.pdp.widgets.galleryFullView.data;

import B0.A0;
import B90.C2618u;
import B90.C2619v;
import Bi.b;
import G.g;
import I0.C3173b;
import Lc.a;
import T7.P;
import Tz.C4055a;
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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003,-.Bs\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0088\u0001\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001a¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO;", "", "items", "", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItemDTO;", "galleryId", "", "miniItemsRatio", "", "backgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "closeButtonTrackingInfo", "swipeDownCloseTrackingInfo", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getGalleryId", "()Ljava/lang/String;", "getMiniItemsRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "getCloseButtonTrackingInfo", "getSwipeDownCloseTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO;", "equals", "", "other", "hashCode", "", "toString", "GalleryItemDTO", "GalleryItem", "VideoTrackingInfo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryFullViewDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final Map<String, TokenizedTrackingInfo> closeButtonTrackingInfo;

    @NotNull
    private final String galleryId;

    @NotNull
    private final List<GalleryItemDTO> items;
    private final Double miniItemsRatio;
    private final Map<String, TokenizedTrackingInfo> swipeDownCloseTrackingInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem;", "", "<init>", "()V", "Image", "Ugc", "Video", "Photo360", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem$Image;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem$Photo360;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem$Ugc;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem$Video;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class GalleryItem {
        public static final int $stable = 0;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem$Image;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem;", ImagesContract.URL, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image extends GalleryItem {
            public static final int $stable = 0;

            @NotNull
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(@NotNull String url) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public static /* synthetic */ Image copy$default(Image image, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = image.url;
                }
                return image.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            @NotNull
            public final Image copy(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new Image(url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Image) && Intrinsics.d(this.url, ((Image) other).url);
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Image(url=", this.url, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem$Photo360;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem;", "previewUrl", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "backgroundColor", "miniIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "templateLink", "placeholderValue", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Ljava/lang/String;)V", "getPreviewUrl", "()Ljava/lang/String;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getBackgroundColor", "getMiniIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTemplateLink", "getPlaceholderValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Photo360 extends GalleryItem {
            public static final int $stable = Icon.$stable | ButtonV3Atom.SmallButton.$stable;
            private final String backgroundColor;

            @NotNull
            private final ButtonV3Atom.SmallButton button;
            private final Icon miniIcon;
            private final String placeholderValue;

            @NotNull
            private final String previewUrl;
            private final String templateLink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Photo360(@NotNull String previewUrl, @NotNull ButtonV3Atom.SmallButton button, String str, Icon icon, String str2, String str3) {
                super(null);
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                Intrinsics.checkNotNullParameter(button, "button");
                this.previewUrl = previewUrl;
                this.button = button;
                this.backgroundColor = str;
                this.miniIcon = icon;
                this.templateLink = str2;
                this.placeholderValue = str3;
            }

            public static /* synthetic */ Photo360 copy$default(Photo360 photo360, String str, ButtonV3Atom.SmallButton smallButton, String str2, Icon icon, String str3, String str4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = photo360.previewUrl;
                }
                if ((i11 & 2) != 0) {
                    smallButton = photo360.button;
                }
                if ((i11 & 4) != 0) {
                    str2 = photo360.backgroundColor;
                }
                if ((i11 & 8) != 0) {
                    icon = photo360.miniIcon;
                }
                if ((i11 & 16) != 0) {
                    str3 = photo360.templateLink;
                }
                if ((i11 & 32) != 0) {
                    str4 = photo360.placeholderValue;
                }
                String str5 = str3;
                String str6 = str4;
                return photo360.copy(str, smallButton, str2, icon, str5, str6);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getPreviewUrl() {
                return this.previewUrl;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final ButtonV3Atom.SmallButton getButton() {
                return this.button;
            }

            /* renamed from: component3, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component4, reason: from getter */
            public final Icon getMiniIcon() {
                return this.miniIcon;
            }

            /* renamed from: component5, reason: from getter */
            public final String getTemplateLink() {
                return this.templateLink;
            }

            /* renamed from: component6, reason: from getter */
            public final String getPlaceholderValue() {
                return this.placeholderValue;
            }

            @NotNull
            public final Photo360 copy(@NotNull String previewUrl, @NotNull ButtonV3Atom.SmallButton button, String backgroundColor, Icon miniIcon, String templateLink, String placeholderValue) {
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                Intrinsics.checkNotNullParameter(button, "button");
                return new Photo360(previewUrl, button, backgroundColor, miniIcon, templateLink, placeholderValue);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Photo360)) {
                    return false;
                }
                Photo360 photo360 = (Photo360) other;
                return Intrinsics.d(this.previewUrl, photo360.previewUrl) && Intrinsics.d(this.button, photo360.button) && Intrinsics.d(this.backgroundColor, photo360.backgroundColor) && Intrinsics.d(this.miniIcon, photo360.miniIcon) && Intrinsics.d(this.templateLink, photo360.templateLink) && Intrinsics.d(this.placeholderValue, photo360.placeholderValue);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final ButtonV3Atom.SmallButton getButton() {
                return this.button;
            }

            public final Icon getMiniIcon() {
                return this.miniIcon;
            }

            public final String getPlaceholderValue() {
                return this.placeholderValue;
            }

            @NotNull
            public final String getPreviewUrl() {
                return this.previewUrl;
            }

            public final String getTemplateLink() {
                return this.templateLink;
            }

            public int hashCode() {
                int c11 = C2618u.c(this.button, this.previewUrl.hashCode() * 31, 31);
                String str = this.backgroundColor;
                int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
                Icon icon = this.miniIcon;
                int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
                String str2 = this.templateLink;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.placeholderValue;
                return hashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.previewUrl;
                ButtonV3Atom.SmallButton smallButton = this.button;
                String str2 = this.backgroundColor;
                Icon icon = this.miniIcon;
                String str3 = this.templateLink;
                String str4 = this.placeholderValue;
                StringBuilder sb2 = new StringBuilder("Photo360(previewUrl=");
                sb2.append(str);
                sb2.append(", button=");
                sb2.append(smallButton);
                sb2.append(", backgroundColor=");
                sb2.append(str2);
                sb2.append(", miniIcon=");
                sb2.append(icon);
                sb2.append(", templateLink=");
                return C3173b.c(sb2, str3, ", placeholderValue=", str4, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem$Ugc;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem;", "previewUrl", "", "previewIcon", "Lru/ozon/uni/atoms/data/button/Icon;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "titleIcon", "subtitle", "backgroundColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "miniIcon", "miniText", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getPreviewUrl", "()Ljava/lang/String;", "getPreviewIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitleIcon", "getSubtitle", "getBackgroundColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getMiniIcon", "getMiniText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Ugc extends GalleryItem {
            public static final int $stable;
            private final AtomActionDTO action;
            private final String backgroundColor;
            private final Icon miniIcon;
            private final TextAtom miniText;
            private final Icon previewIcon;

            @NotNull
            private final String previewUrl;

            @NotNull
            private final TextAtom subtitle;

            @NotNull
            private final TextAtom title;

            @NotNull
            private final Icon titleIcon;

            static {
                int i11 = TextAtom.$stable;
                int i12 = Icon.$stable;
                $stable = i11 | i11 | i12 | i11 | i12 | i12;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ugc(@NotNull String previewUrl, Icon icon, @NotNull TextAtom title, @NotNull Icon titleIcon, @NotNull TextAtom subtitle, String str, AtomActionDTO atomActionDTO, Icon icon2, TextAtom textAtom) {
                super(null);
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.previewUrl = previewUrl;
                this.previewIcon = icon;
                this.title = title;
                this.titleIcon = titleIcon;
                this.subtitle = subtitle;
                this.backgroundColor = str;
                this.action = atomActionDTO;
                this.miniIcon = icon2;
                this.miniText = textAtom;
            }

            public static /* synthetic */ Ugc copy$default(Ugc ugc, String str, Icon icon, TextAtom textAtom, Icon icon2, TextAtom textAtom2, String str2, AtomActionDTO atomActionDTO, Icon icon3, TextAtom textAtom3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = ugc.previewUrl;
                }
                if ((i11 & 2) != 0) {
                    icon = ugc.previewIcon;
                }
                if ((i11 & 4) != 0) {
                    textAtom = ugc.title;
                }
                if ((i11 & 8) != 0) {
                    icon2 = ugc.titleIcon;
                }
                if ((i11 & 16) != 0) {
                    textAtom2 = ugc.subtitle;
                }
                if ((i11 & 32) != 0) {
                    str2 = ugc.backgroundColor;
                }
                if ((i11 & 64) != 0) {
                    atomActionDTO = ugc.action;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    icon3 = ugc.miniIcon;
                }
                if ((i11 & 256) != 0) {
                    textAtom3 = ugc.miniText;
                }
                Icon icon4 = icon3;
                TextAtom textAtom4 = textAtom3;
                String str3 = str2;
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                TextAtom textAtom5 = textAtom2;
                TextAtom textAtom6 = textAtom;
                return ugc.copy(str, icon, textAtom6, icon2, textAtom5, str3, atomActionDTO2, icon4, textAtom4);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getPreviewUrl() {
                return this.previewUrl;
            }

            /* renamed from: component2, reason: from getter */
            public final Icon getPreviewIcon() {
                return this.previewIcon;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final Icon getTitleIcon() {
                return this.titleIcon;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component6, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component7, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component8, reason: from getter */
            public final Icon getMiniIcon() {
                return this.miniIcon;
            }

            /* renamed from: component9, reason: from getter */
            public final TextAtom getMiniText() {
                return this.miniText;
            }

            @NotNull
            public final Ugc copy(@NotNull String previewUrl, Icon previewIcon, @NotNull TextAtom title, @NotNull Icon titleIcon, @NotNull TextAtom subtitle, String backgroundColor, AtomActionDTO action, Icon miniIcon, TextAtom miniText) {
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                return new Ugc(previewUrl, previewIcon, title, titleIcon, subtitle, backgroundColor, action, miniIcon, miniText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Ugc)) {
                    return false;
                }
                Ugc ugc = (Ugc) other;
                return Intrinsics.d(this.previewUrl, ugc.previewUrl) && Intrinsics.d(this.previewIcon, ugc.previewIcon) && Intrinsics.d(this.title, ugc.title) && Intrinsics.d(this.titleIcon, ugc.titleIcon) && Intrinsics.d(this.subtitle, ugc.subtitle) && Intrinsics.d(this.backgroundColor, ugc.backgroundColor) && Intrinsics.d(this.action, ugc.action) && Intrinsics.d(this.miniIcon, ugc.miniIcon) && Intrinsics.d(this.miniText, ugc.miniText);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final Icon getMiniIcon() {
                return this.miniIcon;
            }

            public final TextAtom getMiniText() {
                return this.miniText;
            }

            public final Icon getPreviewIcon() {
                return this.previewIcon;
            }

            @NotNull
            public final String getPreviewUrl() {
                return this.previewUrl;
            }

            @NotNull
            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            @NotNull
            public final Icon getTitleIcon() {
                return this.titleIcon;
            }

            public int hashCode() {
                int hashCode = this.previewUrl.hashCode() * 31;
                Icon icon = this.previewIcon;
                int b11 = C2619v.b(a.a(this.titleIcon, C2619v.b((hashCode + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.title), 31), 31, this.subtitle);
                String str = this.backgroundColor;
                int hashCode2 = (b11 + (str == null ? 0 : str.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Icon icon2 = this.miniIcon;
                int hashCode4 = (hashCode3 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
                TextAtom textAtom = this.miniText;
                return hashCode4 + (textAtom != null ? textAtom.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.previewUrl;
                Icon icon = this.previewIcon;
                TextAtom textAtom = this.title;
                Icon icon2 = this.titleIcon;
                TextAtom textAtom2 = this.subtitle;
                String str2 = this.backgroundColor;
                AtomActionDTO atomActionDTO = this.action;
                Icon icon3 = this.miniIcon;
                TextAtom textAtom3 = this.miniText;
                StringBuilder sb2 = new StringBuilder("Ugc(previewUrl=");
                sb2.append(str);
                sb2.append(", previewIcon=");
                sb2.append(icon);
                sb2.append(", title=");
                sb2.append(textAtom);
                sb2.append(", titleIcon=");
                sb2.append(icon2);
                sb2.append(", subtitle=");
                sb2.append(textAtom2);
                sb2.append(", backgroundColor=");
                sb2.append(str2);
                sb2.append(", action=");
                sb2.append(atomActionDTO);
                sb2.append(", miniIcon=");
                sb2.append(icon3);
                sb2.append(", miniText=");
                return b.g(sb2, textAtom3, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem$Video;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem;", "video", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "previewUrl", "", "videoTrackingInfo", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$VideoTrackingInfo;", "<init>", "(Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$VideoTrackingInfo;)V", "getVideo", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getPreviewUrl", "()Ljava/lang/String;", "getVideoTrackingInfo", "()Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$VideoTrackingInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Video extends GalleryItem {
            public static final int $stable = 8;

            @NotNull
            private final String previewUrl;

            @NotNull
            private final VideoMolecule video;
            private final VideoTrackingInfo videoTrackingInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Video(@NotNull VideoMolecule video, @NotNull String previewUrl, VideoTrackingInfo videoTrackingInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                this.video = video;
                this.previewUrl = previewUrl;
                this.videoTrackingInfo = videoTrackingInfo;
            }

            public static /* synthetic */ Video copy$default(Video video, VideoMolecule videoMolecule, String str, VideoTrackingInfo videoTrackingInfo, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    videoMolecule = video.video;
                }
                if ((i11 & 2) != 0) {
                    str = video.previewUrl;
                }
                if ((i11 & 4) != 0) {
                    videoTrackingInfo = video.videoTrackingInfo;
                }
                return video.copy(videoMolecule, str, videoTrackingInfo);
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
            public final VideoTrackingInfo getVideoTrackingInfo() {
                return this.videoTrackingInfo;
            }

            @NotNull
            public final Video copy(@NotNull VideoMolecule video, @NotNull String previewUrl, VideoTrackingInfo videoTrackingInfo) {
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
                return new Video(video, previewUrl, videoTrackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Video)) {
                    return false;
                }
                Video video = (Video) other;
                return Intrinsics.d(this.video, video.video) && Intrinsics.d(this.previewUrl, video.previewUrl) && Intrinsics.d(this.videoTrackingInfo, video.videoTrackingInfo);
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
                int a11 = g.a(this.video.hashCode() * 31, 31, this.previewUrl);
                VideoTrackingInfo videoTrackingInfo = this.videoTrackingInfo;
                return a11 + (videoTrackingInfo == null ? 0 : videoTrackingInfo.hashCode());
            }

            @NotNull
            public String toString() {
                return "Video(video=" + this.video + ", previewUrl=" + this.previewUrl + ", videoTrackingInfo=" + this.videoTrackingInfo + ")";
            }
        }

        public /* synthetic */ GalleryItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private GalleryItem() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J<\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItemDTO;", "", "content", "Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem;", "containerRatio", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem;Ljava/lang/Double;Ljava/util/Map;)V", "getContent", "()Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem;", "getContainerRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItem;Ljava/lang/Double;Ljava/util/Map;)Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$GalleryItemDTO;", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GalleryItemDTO {
        public static final int $stable = 8;
        private final Double containerRatio;

        @NotNull
        private final GalleryItem content;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public GalleryItemDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = GalleryItem.Image.class), @ProtoOneOfSignature(name = "ugc", type = GalleryItem.Ugc.class), @ProtoOneOfSignature(name = "video", type = GalleryItem.Video.class), @ProtoOneOfSignature(name = "photo360", type = GalleryItem.Photo360.class)}) @NotNull @ProtoOneOf(label = "type") GalleryItem content, Double d11, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.containerRatio = d11;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GalleryItemDTO copy$default(GalleryItemDTO galleryItemDTO, GalleryItem galleryItem, Double d11, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                galleryItem = galleryItemDTO.content;
            }
            if ((i11 & 2) != 0) {
                d11 = galleryItemDTO.containerRatio;
            }
            if ((i11 & 4) != 0) {
                map = galleryItemDTO.trackingInfo;
            }
            return galleryItemDTO.copy(galleryItem, d11, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final GalleryItem getContent() {
            return this.content;
        }

        /* renamed from: component2, reason: from getter */
        public final Double getContainerRatio() {
            return this.containerRatio;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final GalleryItemDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = GalleryItem.Image.class), @ProtoOneOfSignature(name = "ugc", type = GalleryItem.Ugc.class), @ProtoOneOfSignature(name = "video", type = GalleryItem.Video.class), @ProtoOneOfSignature(name = "photo360", type = GalleryItem.Photo360.class)}) @NotNull @ProtoOneOf(label = "type") GalleryItem content, Double containerRatio, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new GalleryItemDTO(content, containerRatio, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GalleryItemDTO)) {
                return false;
            }
            GalleryItemDTO galleryItemDTO = (GalleryItemDTO) other;
            return Intrinsics.d(this.content, galleryItemDTO.content) && Intrinsics.d(this.containerRatio, galleryItemDTO.containerRatio) && Intrinsics.d(this.trackingInfo, galleryItemDTO.trackingInfo);
        }

        public final Double getContainerRatio() {
            return this.containerRatio;
        }

        @NotNull
        public final GalleryItem getContent() {
            return this.content;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.content.hashCode() * 31;
            Double d11 = this.containerRatio;
            int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            GalleryItem galleryItem = this.content;
            Double d11 = this.containerRatio;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("GalleryItemDTO(content=");
            sb2.append(galleryItem);
            sb2.append(", containerRatio=");
            sb2.append(d11);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/data/GalleryFullViewDTO$VideoTrackingInfo;", "", "startVideo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "endVideo", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getStartVideo", "()Ljava/util/Map;", "getEndVideo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public GalleryFullViewDTO(@NotNull List<GalleryItemDTO> items, @NotNull String galleryId, Double d11, String str, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(galleryId, "galleryId");
        this.items = items;
        this.galleryId = galleryId;
        this.miniItemsRatio = d11;
        this.backgroundColor = str;
        this.trackingInfo = map;
        this.closeButtonTrackingInfo = map2;
        this.swipeDownCloseTrackingInfo = map3;
    }

    public static /* synthetic */ GalleryFullViewDTO copy$default(GalleryFullViewDTO galleryFullViewDTO, List list, String str, Double d11, String str2, Map map, Map map2, Map map3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = galleryFullViewDTO.items;
        }
        if ((i11 & 2) != 0) {
            str = galleryFullViewDTO.galleryId;
        }
        if ((i11 & 4) != 0) {
            d11 = galleryFullViewDTO.miniItemsRatio;
        }
        if ((i11 & 8) != 0) {
            str2 = galleryFullViewDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            map = galleryFullViewDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            map2 = galleryFullViewDTO.closeButtonTrackingInfo;
        }
        if ((i11 & 64) != 0) {
            map3 = galleryFullViewDTO.swipeDownCloseTrackingInfo;
        }
        Map map4 = map2;
        Map map5 = map3;
        Map map6 = map;
        Double d12 = d11;
        return galleryFullViewDTO.copy(list, str, d12, str2, map6, map4, map5);
    }

    @NotNull
    public final List<GalleryItemDTO> component1() {
        return this.items;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getGalleryId() {
        return this.galleryId;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getMiniItemsRatio() {
        return this.miniItemsRatio;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.closeButtonTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.swipeDownCloseTrackingInfo;
    }

    @NotNull
    public final GalleryFullViewDTO copy(@NotNull List<GalleryItemDTO> items, @NotNull String galleryId, Double miniItemsRatio, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> closeButtonTrackingInfo, Map<String, TokenizedTrackingInfo> swipeDownCloseTrackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(galleryId, "galleryId");
        return new GalleryFullViewDTO(items, galleryId, miniItemsRatio, backgroundColor, trackingInfo, closeButtonTrackingInfo, swipeDownCloseTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryFullViewDTO)) {
            return false;
        }
        GalleryFullViewDTO galleryFullViewDTO = (GalleryFullViewDTO) other;
        return Intrinsics.d(this.items, galleryFullViewDTO.items) && Intrinsics.d(this.galleryId, galleryFullViewDTO.galleryId) && Intrinsics.d(this.miniItemsRatio, galleryFullViewDTO.miniItemsRatio) && Intrinsics.d(this.backgroundColor, galleryFullViewDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, galleryFullViewDTO.trackingInfo) && Intrinsics.d(this.closeButtonTrackingInfo, galleryFullViewDTO.closeButtonTrackingInfo) && Intrinsics.d(this.swipeDownCloseTrackingInfo, galleryFullViewDTO.swipeDownCloseTrackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> getCloseButtonTrackingInfo() {
        return this.closeButtonTrackingInfo;
    }

    @NotNull
    public final String getGalleryId() {
        return this.galleryId;
    }

    @NotNull
    public final List<GalleryItemDTO> getItems() {
        return this.items;
    }

    public final Double getMiniItemsRatio() {
        return this.miniItemsRatio;
    }

    public final Map<String, TokenizedTrackingInfo> getSwipeDownCloseTrackingInfo() {
        return this.swipeDownCloseTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(this.items.hashCode() * 31, 31, this.galleryId);
        Double d11 = this.miniItemsRatio;
        int hashCode = (a11 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.closeButtonTrackingInfo;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.swipeDownCloseTrackingInfo;
        return hashCode4 + (map3 != null ? map3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<GalleryItemDTO> list = this.items;
        String str = this.galleryId;
        Double d11 = this.miniItemsRatio;
        String str2 = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.closeButtonTrackingInfo;
        Map<String, TokenizedTrackingInfo> map3 = this.swipeDownCloseTrackingInfo;
        StringBuilder a11 = C4055a.a("GalleryFullViewDTO(items=", ", galleryId=", str, ", miniItemsRatio=", list);
        a11.append(d11);
        a11.append(", backgroundColor=");
        a11.append(str2);
        a11.append(", trackingInfo=");
        Tl.b.g(a11, map, ", closeButtonTrackingInfo=", map2, ", swipeDownCloseTrackingInfo=");
        return P.f(a11, map3, ")");
    }
}
