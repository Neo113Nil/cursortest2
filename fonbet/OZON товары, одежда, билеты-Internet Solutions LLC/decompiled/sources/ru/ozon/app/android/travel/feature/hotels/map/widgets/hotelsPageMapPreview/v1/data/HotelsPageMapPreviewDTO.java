package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.data;

import B90.C2618u;
import B90.C2619v;
import Ih.a;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.BoundingBox;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.Coordinate;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.PointDTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\t\u00106\u001a\u00020\u0010HÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003J\u0017\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J\u009b\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006A"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/data/HotelsPageMapPreviewDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "pinCoordinate", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;", "pinIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "pinAnchorPoint", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/PointDTO;", "boundingBox", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBox;", "selectAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "copyButton", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "selectActionTrackingInfo", "locationPoint", "", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/PointDTO;Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBox;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getPinCoordinate", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;", "getPinIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getPinAnchorPoint", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/PointDTO;", "getBoundingBox", "()Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBox;", "getSelectAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getCopyButton", "()Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getSelectActionTrackingInfo", "getLocationPoint", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPageMapPreviewDTO {

    @NotNull
    private final BoundingBox boundingBox;

    @NotNull
    private final LinkButtonDTO copyButton;
    private final List<Double> locationPoint;

    @NotNull
    private final PointDTO pinAnchorPoint;

    @NotNull
    private final Coordinate pinCoordinate;

    @NotNull
    private final Icon pinIcon;

    @NotNull
    private final AtomActionDTO selectAction;
    private final Map<String, TokenizedTrackingInfo> selectActionTrackingInfo;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public HotelsPageMapPreviewDTO(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull Coordinate pinCoordinate, @NotNull Icon pinIcon, @NotNull PointDTO pinAnchorPoint, @NotNull BoundingBox boundingBox, @NotNull AtomActionDTO selectAction, @NotNull LinkButtonDTO copyButton, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, List<Double> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(pinCoordinate, "pinCoordinate");
        Intrinsics.checkNotNullParameter(pinIcon, "pinIcon");
        Intrinsics.checkNotNullParameter(pinAnchorPoint, "pinAnchorPoint");
        Intrinsics.checkNotNullParameter(boundingBox, "boundingBox");
        Intrinsics.checkNotNullParameter(selectAction, "selectAction");
        Intrinsics.checkNotNullParameter(copyButton, "copyButton");
        this.title = title;
        this.subtitle = subtitle;
        this.pinCoordinate = pinCoordinate;
        this.pinIcon = pinIcon;
        this.pinAnchorPoint = pinAnchorPoint;
        this.boundingBox = boundingBox;
        this.selectAction = selectAction;
        this.copyButton = copyButton;
        this.trackingInfo = map;
        this.selectActionTrackingInfo = map2;
        this.locationPoint = list;
    }

    public static /* synthetic */ HotelsPageMapPreviewDTO copy$default(HotelsPageMapPreviewDTO hotelsPageMapPreviewDTO, TextAtom textAtom, TextAtom textAtom2, Coordinate coordinate, Icon icon, PointDTO pointDTO, BoundingBox boundingBox, AtomActionDTO atomActionDTO, LinkButtonDTO linkButtonDTO, Map map, Map map2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = hotelsPageMapPreviewDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = hotelsPageMapPreviewDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            coordinate = hotelsPageMapPreviewDTO.pinCoordinate;
        }
        if ((i11 & 8) != 0) {
            icon = hotelsPageMapPreviewDTO.pinIcon;
        }
        if ((i11 & 16) != 0) {
            pointDTO = hotelsPageMapPreviewDTO.pinAnchorPoint;
        }
        if ((i11 & 32) != 0) {
            boundingBox = hotelsPageMapPreviewDTO.boundingBox;
        }
        if ((i11 & 64) != 0) {
            atomActionDTO = hotelsPageMapPreviewDTO.selectAction;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            linkButtonDTO = hotelsPageMapPreviewDTO.copyButton;
        }
        if ((i11 & 256) != 0) {
            map = hotelsPageMapPreviewDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map2 = hotelsPageMapPreviewDTO.selectActionTrackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            list = hotelsPageMapPreviewDTO.locationPoint;
        }
        Map map3 = map2;
        List list2 = list;
        LinkButtonDTO linkButtonDTO2 = linkButtonDTO;
        Map map4 = map;
        BoundingBox boundingBox2 = boundingBox;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        PointDTO pointDTO2 = pointDTO;
        Coordinate coordinate2 = coordinate;
        return hotelsPageMapPreviewDTO.copy(textAtom, textAtom2, coordinate2, icon, pointDTO2, boundingBox2, atomActionDTO2, linkButtonDTO2, map4, map3, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.selectActionTrackingInfo;
    }

    public final List<Double> component11() {
        return this.locationPoint;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Coordinate getPinCoordinate() {
        return this.pinCoordinate;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Icon getPinIcon() {
        return this.pinIcon;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final PointDTO getPinAnchorPoint() {
        return this.pinAnchorPoint;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getSelectAction() {
        return this.selectAction;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final LinkButtonDTO getCopyButton() {
        return this.copyButton;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsPageMapPreviewDTO copy(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull Coordinate pinCoordinate, @NotNull Icon pinIcon, @NotNull PointDTO pinAnchorPoint, @NotNull BoundingBox boundingBox, @NotNull AtomActionDTO selectAction, @NotNull LinkButtonDTO copyButton, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> selectActionTrackingInfo, List<Double> locationPoint) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(pinCoordinate, "pinCoordinate");
        Intrinsics.checkNotNullParameter(pinIcon, "pinIcon");
        Intrinsics.checkNotNullParameter(pinAnchorPoint, "pinAnchorPoint");
        Intrinsics.checkNotNullParameter(boundingBox, "boundingBox");
        Intrinsics.checkNotNullParameter(selectAction, "selectAction");
        Intrinsics.checkNotNullParameter(copyButton, "copyButton");
        return new HotelsPageMapPreviewDTO(title, subtitle, pinCoordinate, pinIcon, pinAnchorPoint, boundingBox, selectAction, copyButton, trackingInfo, selectActionTrackingInfo, locationPoint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPageMapPreviewDTO)) {
            return false;
        }
        HotelsPageMapPreviewDTO hotelsPageMapPreviewDTO = (HotelsPageMapPreviewDTO) other;
        return Intrinsics.d(this.title, hotelsPageMapPreviewDTO.title) && Intrinsics.d(this.subtitle, hotelsPageMapPreviewDTO.subtitle) && Intrinsics.d(this.pinCoordinate, hotelsPageMapPreviewDTO.pinCoordinate) && Intrinsics.d(this.pinIcon, hotelsPageMapPreviewDTO.pinIcon) && Intrinsics.d(this.pinAnchorPoint, hotelsPageMapPreviewDTO.pinAnchorPoint) && Intrinsics.d(this.boundingBox, hotelsPageMapPreviewDTO.boundingBox) && Intrinsics.d(this.selectAction, hotelsPageMapPreviewDTO.selectAction) && Intrinsics.d(this.copyButton, hotelsPageMapPreviewDTO.copyButton) && Intrinsics.d(this.trackingInfo, hotelsPageMapPreviewDTO.trackingInfo) && Intrinsics.d(this.selectActionTrackingInfo, hotelsPageMapPreviewDTO.selectActionTrackingInfo) && Intrinsics.d(this.locationPoint, hotelsPageMapPreviewDTO.locationPoint);
    }

    @NotNull
    public final BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    @NotNull
    public final LinkButtonDTO getCopyButton() {
        return this.copyButton;
    }

    public final List<Double> getLocationPoint() {
        return this.locationPoint;
    }

    @NotNull
    public final PointDTO getPinAnchorPoint() {
        return this.pinAnchorPoint;
    }

    @NotNull
    public final Coordinate getPinCoordinate() {
        return this.pinCoordinate;
    }

    @NotNull
    public final Icon getPinIcon() {
        return this.pinIcon;
    }

    @NotNull
    public final AtomActionDTO getSelectAction() {
        return this.selectAction;
    }

    public final Map<String, TokenizedTrackingInfo> getSelectActionTrackingInfo() {
        return this.selectActionTrackingInfo;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.copyButton.hashCode() + a.b(this.selectAction, (this.boundingBox.hashCode() + ((this.pinAnchorPoint.hashCode() + Lc.a.a(this.pinIcon, (this.pinCoordinate.hashCode() + C2619v.b(this.title.hashCode() * 31, 31, this.subtitle)) * 31, 31)) * 31)) * 31, 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.selectActionTrackingInfo;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        List<Double> list = this.locationPoint;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        Coordinate coordinate = this.pinCoordinate;
        Icon icon = this.pinIcon;
        PointDTO pointDTO = this.pinAnchorPoint;
        BoundingBox boundingBox = this.boundingBox;
        AtomActionDTO atomActionDTO = this.selectAction;
        LinkButtonDTO linkButtonDTO = this.copyButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.selectActionTrackingInfo;
        List<Double> list = this.locationPoint;
        StringBuilder a11 = HY.a.a("HotelsPageMapPreviewDTO(title=", textAtom, ", subtitle=", textAtom2, ", pinCoordinate=");
        a11.append(coordinate);
        a11.append(", pinIcon=");
        a11.append(icon);
        a11.append(", pinAnchorPoint=");
        a11.append(pointDTO);
        a11.append(", boundingBox=");
        a11.append(boundingBox);
        a11.append(", selectAction=");
        a11.append(atomActionDTO);
        a11.append(", copyButton=");
        a11.append(linkButtonDTO);
        a11.append(", trackingInfo=");
        b.g(a11, map, ", selectActionTrackingInfo=", map2, ", locationPoint=");
        return C2618u.h(a11, list, ")");
    }
}
