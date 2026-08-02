package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.data;

import G.g;
import V.e;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.BoundingBox;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.Coordinate;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.PointDTO;
import ru.ozon.app.android.travel.molecules.dto.travelFiltersButton.TravelFiltersButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u00069:;<=>Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005HÆ\u0003J\u008b\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001a¨\u0006?"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO;", "", "visibleRegion", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBox;", "pins", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Pin;", "userLocationPin", "backButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "locationDeniedAlert", "Lru/ozon/uni/android/flashbar/model/Restriction;", "filtersButton", "Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO;", "zoomInButton", "zoomOutButton", "geolocationButton", "locationPoint", "", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBox;Ljava/util/List;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Pin;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/android/flashbar/model/Restriction;Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Ljava/util/List;)V", "getVisibleRegion", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBox;", "getPins$annotations", "()V", "getPins", "()Ljava/util/List;", "getUserLocationPin", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Pin;", "getBackButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getLocationDeniedAlert", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "getFiltersButton", "()Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO;", "getZoomInButton", "getZoomOutButton", "getGeolocationButton", "getLocationPoint", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Pin", "RenderingInfo", "ImageInfo", "ColorInfo", "Size", "Type", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsMapInfoV2DTO {
    private final ButtonV3Atom.SmallIconButton backButton;
    private final TravelFiltersButtonDTO filtersButton;
    private final ButtonV3Atom.SmallIconButton geolocationButton;
    private final Restriction locationDeniedAlert;
    private final List<Double> locationPoint;

    @NotNull
    private final List<Pin> pins;
    private final Pin userLocationPin;
    private final BoundingBox visibleRegion;
    private final ButtonV3Atom.SmallIconButton zoomInButton;
    private final ButtonV3Atom.SmallIconButton zoomOutButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$ColorInfo;", "", "borderColor", "", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBorderColor", "()Ljava/lang/String;", "getBackgroundColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ColorInfo {

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final String borderColor;

        public ColorInfo(@NotNull String borderColor, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.borderColor = borderColor;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ ColorInfo copy$default(ColorInfo colorInfo, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = colorInfo.borderColor;
            }
            if ((i11 & 2) != 0) {
                str2 = colorInfo.backgroundColor;
            }
            return colorInfo.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ColorInfo copy(@NotNull String borderColor, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(borderColor, "borderColor");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new ColorInfo(borderColor, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ColorInfo)) {
                return false;
            }
            ColorInfo colorInfo = (ColorInfo) other;
            return Intrinsics.d(this.borderColor, colorInfo.borderColor) && Intrinsics.d(this.backgroundColor, colorInfo.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getBorderColor() {
            return this.borderColor;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode() + (this.borderColor.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ColorInfo(borderColor=", this.borderColor, ", backgroundColor=", this.backgroundColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$ImageInfo;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "size", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Size;", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Size;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getSize", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Size;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageInfo {

        @NotNull
        private final Icon icon;

        @NotNull
        private final Size size;

        public ImageInfo(@NotNull Icon icon, @NotNull Size size) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(size, "size");
            this.icon = icon;
            this.size = size;
        }

        public static /* synthetic */ ImageInfo copy$default(ImageInfo imageInfo, Icon icon, Size size, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = imageInfo.icon;
            }
            if ((i11 & 2) != 0) {
                size = imageInfo.size;
            }
            return imageInfo.copy(icon, size);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        @NotNull
        public final ImageInfo copy(@NotNull Icon icon, @NotNull Size size) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(size, "size");
            return new ImageInfo(icon, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageInfo)) {
                return false;
            }
            ImageInfo imageInfo = (ImageInfo) other;
            return Intrinsics.d(this.icon, imageInfo.icon) && Intrinsics.d(this.size, imageInfo.size);
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final Size getSize() {
            return this.size;
        }

        public int hashCode() {
            return this.size.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ImageInfo(icon=" + this.icon + ", size=" + this.size + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J^\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Pin;", "", "id", "", "coordinate", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;", "anchorPoint", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/PointDTO;", "renderingInfo", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$RenderingInfo;", "indivisibleCluster", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/PointDTO;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$RenderingInfo;Ljava/lang/Boolean;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getCoordinate", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;", "getAnchorPoint", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/PointDTO;", "getRenderingInfo", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$RenderingInfo;", "getIndivisibleCluster", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/PointDTO;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$RenderingInfo;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Pin;", "equals", "other", "hashCode", "", "toString", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pin {

        @NotNull
        private final PointDTO anchorPoint;
        private final Coordinate coordinate;
        private final String id;
        private final Boolean indivisibleCluster;

        @NotNull
        private final RenderingInfo renderingInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Pin(String str, Coordinate coordinate, @NotNull PointDTO anchorPoint, @NotNull RenderingInfo renderingInfo, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(anchorPoint, "anchorPoint");
            Intrinsics.checkNotNullParameter(renderingInfo, "renderingInfo");
            this.id = str;
            this.coordinate = coordinate;
            this.anchorPoint = anchorPoint;
            this.renderingInfo = renderingInfo;
            this.indivisibleCluster = bool;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Pin copy$default(Pin pin, String str, Coordinate coordinate, PointDTO pointDTO, RenderingInfo renderingInfo, Boolean bool, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = pin.id;
            }
            if ((i11 & 2) != 0) {
                coordinate = pin.coordinate;
            }
            if ((i11 & 4) != 0) {
                pointDTO = pin.anchorPoint;
            }
            if ((i11 & 8) != 0) {
                renderingInfo = pin.renderingInfo;
            }
            if ((i11 & 16) != 0) {
                bool = pin.indivisibleCluster;
            }
            if ((i11 & 32) != 0) {
                map = pin.trackingInfo;
            }
            Boolean bool2 = bool;
            Map map2 = map;
            return pin.copy(str, coordinate, pointDTO, renderingInfo, bool2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final Coordinate getCoordinate() {
            return this.coordinate;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final PointDTO getAnchorPoint() {
            return this.anchorPoint;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final RenderingInfo getRenderingInfo() {
            return this.renderingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getIndivisibleCluster() {
            return this.indivisibleCluster;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final Pin copy(String id2, Coordinate coordinate, @NotNull PointDTO anchorPoint, @NotNull RenderingInfo renderingInfo, Boolean indivisibleCluster, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(anchorPoint, "anchorPoint");
            Intrinsics.checkNotNullParameter(renderingInfo, "renderingInfo");
            return new Pin(id2, coordinate, anchorPoint, renderingInfo, indivisibleCluster, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return Intrinsics.d(this.id, pin.id) && Intrinsics.d(this.coordinate, pin.coordinate) && Intrinsics.d(this.anchorPoint, pin.anchorPoint) && Intrinsics.d(this.renderingInfo, pin.renderingInfo) && Intrinsics.d(this.indivisibleCluster, pin.indivisibleCluster) && Intrinsics.d(this.trackingInfo, pin.trackingInfo);
        }

        @NotNull
        public final PointDTO getAnchorPoint() {
            return this.anchorPoint;
        }

        public final Coordinate getCoordinate() {
            return this.coordinate;
        }

        public final String getId() {
            return this.id;
        }

        public final Boolean getIndivisibleCluster() {
            return this.indivisibleCluster;
        }

        @NotNull
        public final RenderingInfo getRenderingInfo() {
            return this.renderingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Coordinate coordinate = this.coordinate;
            int hashCode2 = (this.renderingInfo.hashCode() + ((this.anchorPoint.hashCode() + ((hashCode + (coordinate == null ? 0 : coordinate.hashCode())) * 31)) * 31)) * 31;
            Boolean bool = this.indivisibleCluster;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Pin(id=" + this.id + ", coordinate=" + this.coordinate + ", anchorPoint=" + this.anchorPoint + ", renderingInfo=" + this.renderingInfo + ", indivisibleCluster=" + this.indivisibleCluster + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$RenderingInfo;", "", "type", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Type;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "imageInfo", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$ImageInfo;", "colorInfo", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$ColorInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Type;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$ImageInfo;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$ColorInfo;)V", "getType", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Type;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getImageInfo", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$ImageInfo;", "getColorInfo", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$ColorInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RenderingInfo {
        private final ColorInfo colorInfo;
        private final ImageInfo imageInfo;
        private final TextAtom title;

        @NotNull
        private final Type type;

        public RenderingInfo(@NotNull Type type, TextAtom textAtom, ImageInfo imageInfo, ColorInfo colorInfo) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.title = textAtom;
            this.imageInfo = imageInfo;
            this.colorInfo = colorInfo;
        }

        public static /* synthetic */ RenderingInfo copy$default(RenderingInfo renderingInfo, Type type, TextAtom textAtom, ImageInfo imageInfo, ColorInfo colorInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                type = renderingInfo.type;
            }
            if ((i11 & 2) != 0) {
                textAtom = renderingInfo.title;
            }
            if ((i11 & 4) != 0) {
                imageInfo = renderingInfo.imageInfo;
            }
            if ((i11 & 8) != 0) {
                colorInfo = renderingInfo.colorInfo;
            }
            return renderingInfo.copy(type, textAtom, imageInfo, colorInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final ImageInfo getImageInfo() {
            return this.imageInfo;
        }

        /* renamed from: component4, reason: from getter */
        public final ColorInfo getColorInfo() {
            return this.colorInfo;
        }

        @NotNull
        public final RenderingInfo copy(@NotNull Type type, TextAtom title, ImageInfo imageInfo, ColorInfo colorInfo) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new RenderingInfo(type, title, imageInfo, colorInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RenderingInfo)) {
                return false;
            }
            RenderingInfo renderingInfo = (RenderingInfo) other;
            return this.type == renderingInfo.type && Intrinsics.d(this.title, renderingInfo.title) && Intrinsics.d(this.imageInfo, renderingInfo.imageInfo) && Intrinsics.d(this.colorInfo, renderingInfo.colorInfo);
        }

        public final ColorInfo getColorInfo() {
            return this.colorInfo;
        }

        public final ImageInfo getImageInfo() {
            return this.imageInfo;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            TextAtom textAtom = this.title;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            ImageInfo imageInfo = this.imageInfo;
            int hashCode3 = (hashCode2 + (imageInfo == null ? 0 : imageInfo.hashCode())) * 31;
            ColorInfo colorInfo = this.colorInfo;
            return hashCode3 + (colorInfo != null ? colorInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "RenderingInfo(type=" + this.type + ", title=" + this.title + ", imageInfo=" + this.imageInfo + ", colorInfo=" + this.colorInfo + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Size;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Size {
        private final int height;
        private final int width;

        public Size(int i11, int i12) {
            this.width = i11;
            this.height = i12;
        }

        public static /* synthetic */ Size copy$default(Size size, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = size.width;
            }
            if ((i13 & 2) != 0) {
                i12 = size.height;
            }
            return size.copy(i11, i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final Size copy(int width, int height) {
            return new Size(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Size)) {
                return false;
            }
            Size size = (Size) other;
            return this.width == size.width && this.height == size.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
        }

        @NotNull
        public String toString() {
            return Cm.e.c("Size(width=", this.width, ", height=", ")", this.height);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v2/data/HotelsMapInfoV2DTO$Type;", "", "<init>", "(Ljava/lang/String;I)V", "HOTEL_SIMPLE", "HOTEL_PRICE", "CLUSTER", "USER", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @i(name = "HOTEL_SIMPLE")
        public static final Type HOTEL_SIMPLE = new Type("HOTEL_SIMPLE", 0);

        @i(name = "HOTEL_PRICE")
        public static final Type HOTEL_PRICE = new Type("HOTEL_PRICE", 1);

        @i(name = "CLUSTER")
        public static final Type CLUSTER = new Type("CLUSTER", 2);

        @i(name = "USER")
        public static final Type USER = new Type("USER", 3);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{HOTEL_SIMPLE, HOTEL_PRICE, CLUSTER, USER};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public HotelsMapInfoV2DTO(BoundingBox boundingBox, @NotNull List<Pin> pins, Pin pin, ButtonV3Atom.SmallIconButton smallIconButton, Restriction restriction, TravelFiltersButtonDTO travelFiltersButtonDTO, ButtonV3Atom.SmallIconButton smallIconButton2, ButtonV3Atom.SmallIconButton smallIconButton3, ButtonV3Atom.SmallIconButton smallIconButton4, List<Double> list) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.visibleRegion = boundingBox;
        this.pins = pins;
        this.userLocationPin = pin;
        this.backButton = smallIconButton;
        this.locationDeniedAlert = restriction;
        this.filtersButton = travelFiltersButtonDTO;
        this.zoomInButton = smallIconButton2;
        this.zoomOutButton = smallIconButton3;
        this.geolocationButton = smallIconButton4;
        this.locationPoint = list;
    }

    public static /* synthetic */ HotelsMapInfoV2DTO copy$default(HotelsMapInfoV2DTO hotelsMapInfoV2DTO, BoundingBox boundingBox, List list, Pin pin, ButtonV3Atom.SmallIconButton smallIconButton, Restriction restriction, TravelFiltersButtonDTO travelFiltersButtonDTO, ButtonV3Atom.SmallIconButton smallIconButton2, ButtonV3Atom.SmallIconButton smallIconButton3, ButtonV3Atom.SmallIconButton smallIconButton4, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            boundingBox = hotelsMapInfoV2DTO.visibleRegion;
        }
        if ((i11 & 2) != 0) {
            list = hotelsMapInfoV2DTO.pins;
        }
        if ((i11 & 4) != 0) {
            pin = hotelsMapInfoV2DTO.userLocationPin;
        }
        if ((i11 & 8) != 0) {
            smallIconButton = hotelsMapInfoV2DTO.backButton;
        }
        if ((i11 & 16) != 0) {
            restriction = hotelsMapInfoV2DTO.locationDeniedAlert;
        }
        if ((i11 & 32) != 0) {
            travelFiltersButtonDTO = hotelsMapInfoV2DTO.filtersButton;
        }
        if ((i11 & 64) != 0) {
            smallIconButton2 = hotelsMapInfoV2DTO.zoomInButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            smallIconButton3 = hotelsMapInfoV2DTO.zoomOutButton;
        }
        if ((i11 & 256) != 0) {
            smallIconButton4 = hotelsMapInfoV2DTO.geolocationButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            list2 = hotelsMapInfoV2DTO.locationPoint;
        }
        ButtonV3Atom.SmallIconButton smallIconButton5 = smallIconButton4;
        List list3 = list2;
        ButtonV3Atom.SmallIconButton smallIconButton6 = smallIconButton2;
        ButtonV3Atom.SmallIconButton smallIconButton7 = smallIconButton3;
        Restriction restriction2 = restriction;
        TravelFiltersButtonDTO travelFiltersButtonDTO2 = travelFiltersButtonDTO;
        return hotelsMapInfoV2DTO.copy(boundingBox, list, pin, smallIconButton, restriction2, travelFiltersButtonDTO2, smallIconButton6, smallIconButton7, smallIconButton5, list3);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getPins$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final BoundingBox getVisibleRegion() {
        return this.visibleRegion;
    }

    public final List<Double> component10() {
        return this.locationPoint;
    }

    @NotNull
    public final List<Pin> component2() {
        return this.pins;
    }

    /* renamed from: component3, reason: from getter */
    public final Pin getUserLocationPin() {
        return this.userLocationPin;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getBackButton() {
        return this.backButton;
    }

    /* renamed from: component5, reason: from getter */
    public final Restriction getLocationDeniedAlert() {
        return this.locationDeniedAlert;
    }

    /* renamed from: component6, reason: from getter */
    public final TravelFiltersButtonDTO getFiltersButton() {
        return this.filtersButton;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getZoomInButton() {
        return this.zoomInButton;
    }

    /* renamed from: component8, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getZoomOutButton() {
        return this.zoomOutButton;
    }

    /* renamed from: component9, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getGeolocationButton() {
        return this.geolocationButton;
    }

    @NotNull
    public final HotelsMapInfoV2DTO copy(BoundingBox visibleRegion, @NotNull List<Pin> pins, Pin userLocationPin, ButtonV3Atom.SmallIconButton backButton, Restriction locationDeniedAlert, TravelFiltersButtonDTO filtersButton, ButtonV3Atom.SmallIconButton zoomInButton, ButtonV3Atom.SmallIconButton zoomOutButton, ButtonV3Atom.SmallIconButton geolocationButton, List<Double> locationPoint) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        return new HotelsMapInfoV2DTO(visibleRegion, pins, userLocationPin, backButton, locationDeniedAlert, filtersButton, zoomInButton, zoomOutButton, geolocationButton, locationPoint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsMapInfoV2DTO)) {
            return false;
        }
        HotelsMapInfoV2DTO hotelsMapInfoV2DTO = (HotelsMapInfoV2DTO) other;
        return Intrinsics.d(this.visibleRegion, hotelsMapInfoV2DTO.visibleRegion) && Intrinsics.d(this.pins, hotelsMapInfoV2DTO.pins) && Intrinsics.d(this.userLocationPin, hotelsMapInfoV2DTO.userLocationPin) && Intrinsics.d(this.backButton, hotelsMapInfoV2DTO.backButton) && Intrinsics.d(this.locationDeniedAlert, hotelsMapInfoV2DTO.locationDeniedAlert) && Intrinsics.d(this.filtersButton, hotelsMapInfoV2DTO.filtersButton) && Intrinsics.d(this.zoomInButton, hotelsMapInfoV2DTO.zoomInButton) && Intrinsics.d(this.zoomOutButton, hotelsMapInfoV2DTO.zoomOutButton) && Intrinsics.d(this.geolocationButton, hotelsMapInfoV2DTO.geolocationButton) && Intrinsics.d(this.locationPoint, hotelsMapInfoV2DTO.locationPoint);
    }

    public final ButtonV3Atom.SmallIconButton getBackButton() {
        return this.backButton;
    }

    public final TravelFiltersButtonDTO getFiltersButton() {
        return this.filtersButton;
    }

    public final ButtonV3Atom.SmallIconButton getGeolocationButton() {
        return this.geolocationButton;
    }

    public final Restriction getLocationDeniedAlert() {
        return this.locationDeniedAlert;
    }

    public final List<Double> getLocationPoint() {
        return this.locationPoint;
    }

    @NotNull
    public final List<Pin> getPins() {
        return this.pins;
    }

    public final Pin getUserLocationPin() {
        return this.userLocationPin;
    }

    public final BoundingBox getVisibleRegion() {
        return this.visibleRegion;
    }

    public final ButtonV3Atom.SmallIconButton getZoomInButton() {
        return this.zoomInButton;
    }

    public final ButtonV3Atom.SmallIconButton getZoomOutButton() {
        return this.zoomOutButton;
    }

    public int hashCode() {
        BoundingBox boundingBox = this.visibleRegion;
        int b11 = g.b((boundingBox == null ? 0 : boundingBox.hashCode()) * 31, 31, this.pins);
        Pin pin = this.userLocationPin;
        int hashCode = (b11 + (pin == null ? 0 : pin.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton = this.backButton;
        int hashCode2 = (hashCode + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        Restriction restriction = this.locationDeniedAlert;
        int hashCode3 = (hashCode2 + (restriction == null ? 0 : restriction.hashCode())) * 31;
        TravelFiltersButtonDTO travelFiltersButtonDTO = this.filtersButton;
        int hashCode4 = (hashCode3 + (travelFiltersButtonDTO == null ? 0 : travelFiltersButtonDTO.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton2 = this.zoomInButton;
        int hashCode5 = (hashCode4 + (smallIconButton2 == null ? 0 : smallIconButton2.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton3 = this.zoomOutButton;
        int hashCode6 = (hashCode5 + (smallIconButton3 == null ? 0 : smallIconButton3.hashCode())) * 31;
        ButtonV3Atom.SmallIconButton smallIconButton4 = this.geolocationButton;
        int hashCode7 = (hashCode6 + (smallIconButton4 == null ? 0 : smallIconButton4.hashCode())) * 31;
        List<Double> list = this.locationPoint;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HotelsMapInfoV2DTO(visibleRegion=" + this.visibleRegion + ", pins=" + this.pins + ", userLocationPin=" + this.userLocationPin + ", backButton=" + this.backButton + ", locationDeniedAlert=" + this.locationDeniedAlert + ", filtersButton=" + this.filtersButton + ", zoomInButton=" + this.zoomInButton + ", zoomOutButton=" + this.zoomOutButton + ", geolocationButton=" + this.geolocationButton + ", locationPoint=" + this.locationPoint + ")";
    }

    public HotelsMapInfoV2DTO(BoundingBox boundingBox, List list, Pin pin, ButtonV3Atom.SmallIconButton smallIconButton, Restriction restriction, TravelFiltersButtonDTO travelFiltersButtonDTO, ButtonV3Atom.SmallIconButton smallIconButton2, ButtonV3Atom.SmallIconButton smallIconButton3, ButtonV3Atom.SmallIconButton smallIconButton4, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(boundingBox, (i11 & 2) != 0 ? K.f71697a : list, pin, smallIconButton, restriction, travelFiltersButtonDTO, smallIconButton2, smallIconButton3, smallIconButton4, list2);
    }
}
