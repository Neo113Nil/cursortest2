package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
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

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R(\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\"\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/data/HotelsPageMapPreviewDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/data/HotelsPageMapPreviewDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/data/HotelsPageMapPreviewDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/data/HotelsPageMapPreviewDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/Coordinate;", "coordinateAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "iconAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/PointDTO;", "pointDTOAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/shared/data/BoundingBox;", "boundingBoxAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "linkButtonDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "", "nullableListOfDoubleAdapter", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageMapPreviewDTOJsonAdapter extends JsonAdapter<HotelsPageMapPreviewDTO> {

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BoundingBox> boundingBoxAdapter;

    @NotNull
    private final JsonAdapter<Coordinate> coordinateAdapter;

    @NotNull
    private final JsonAdapter<Icon> iconAdapter;

    @NotNull
    private final JsonAdapter<LinkButtonDTO> linkButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<List<Double>> nullableListOfDoubleAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PointDTO> pointDTOAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public HotelsPageMapPreviewDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "pinCoordinate", "pinIcon", "pinAnchorPoint", "boundingBox", "selectAction", "copyButton", "trackingInfo", "selectActionTrackingInfo", "locationPoint");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.coordinateAdapter = moshi.f(Coordinate.class, m11, "pinCoordinate");
        this.iconAdapter = moshi.f(Icon.class, m11, "pinIcon");
        this.pointDTOAdapter = moshi.f(PointDTO.class, m11, "pinAnchorPoint");
        this.boundingBoxAdapter = moshi.f(BoundingBox.class, m11, "boundingBox");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "selectAction");
        this.linkButtonDTOAdapter = moshi.f(LinkButtonDTO.class, m11, "copyButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableListOfDoubleAdapter = moshi.f(D.e(List.class, Double.class), m11, "locationPoint");
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(HotelsPageMapPreviewDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsPageMapPreviewDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        Coordinate coordinate = null;
        Icon icon = null;
        PointDTO pointDTO = null;
        BoundingBox boundingBox = null;
        AtomActionDTO atomActionDTO = null;
        LinkButtonDTO linkButtonDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        List<Double> list = null;
        while (true) {
            TextAtom textAtom3 = textAtom;
            TextAtom textAtom4 = textAtom2;
            Coordinate coordinate2 = coordinate;
            Icon icon2 = icon;
            PointDTO pointDTO2 = pointDTO;
            if (!reader.hasNext()) {
                BoundingBox boundingBox2 = boundingBox;
                reader.endObject();
                if (textAtom3 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (textAtom4 == null) {
                    throw c.j("subtitle", "subtitle", reader);
                }
                if (coordinate2 == null) {
                    throw c.j("pinCoordinate", "pinCoordinate", reader);
                }
                if (icon2 == null) {
                    throw c.j("pinIcon", "pinIcon", reader);
                }
                if (pointDTO2 == null) {
                    throw c.j("pinAnchorPoint", "pinAnchorPoint", reader);
                }
                if (boundingBox2 == null) {
                    throw c.j("boundingBox", "boundingBox", reader);
                }
                if (atomActionDTO == null) {
                    throw c.j("selectAction", "selectAction", reader);
                }
                if (linkButtonDTO != null) {
                    return new HotelsPageMapPreviewDTO(textAtom3, textAtom4, coordinate2, icon2, pointDTO2, boundingBox2, atomActionDTO, linkButtonDTO, map, map2, list);
                }
                throw c.j("copyButton", "copyButton", reader);
            }
            BoundingBox boundingBox3 = boundingBox;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    boundingBox = boundingBox3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    coordinate = coordinate2;
                    icon = icon2;
                    pointDTO = pointDTO2;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    boundingBox = boundingBox3;
                    textAtom2 = textAtom4;
                    coordinate = coordinate2;
                    icon = icon2;
                    pointDTO = pointDTO2;
                case 1:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    boundingBox = boundingBox3;
                    textAtom = textAtom3;
                    coordinate = coordinate2;
                    icon = icon2;
                    pointDTO = pointDTO2;
                case 2:
                    coordinate = this.coordinateAdapter.fromJson(reader);
                    if (coordinate == null) {
                        throw c.q("pinCoordinate", "pinCoordinate", reader);
                    }
                    boundingBox = boundingBox3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    icon = icon2;
                    pointDTO = pointDTO2;
                case 3:
                    icon = this.iconAdapter.fromJson(reader);
                    if (icon == null) {
                        throw c.q("pinIcon", "pinIcon", reader);
                    }
                    boundingBox = boundingBox3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    coordinate = coordinate2;
                    pointDTO = pointDTO2;
                case 4:
                    pointDTO = this.pointDTOAdapter.fromJson(reader);
                    if (pointDTO == null) {
                        throw c.q("pinAnchorPoint", "pinAnchorPoint", reader);
                    }
                    boundingBox = boundingBox3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    coordinate = coordinate2;
                    icon = icon2;
                case 5:
                    boundingBox = this.boundingBoxAdapter.fromJson(reader);
                    if (boundingBox == null) {
                        throw c.q("boundingBox", "boundingBox", reader);
                    }
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    coordinate = coordinate2;
                    icon = icon2;
                    pointDTO = pointDTO2;
                case 6:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("selectAction", "selectAction", reader);
                    }
                    boundingBox = boundingBox3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    coordinate = coordinate2;
                    icon = icon2;
                    pointDTO = pointDTO2;
                case 7:
                    linkButtonDTO = this.linkButtonDTOAdapter.fromJson(reader);
                    if (linkButtonDTO == null) {
                        throw c.q("copyButton", "copyButton", reader);
                    }
                    boundingBox = boundingBox3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    coordinate = coordinate2;
                    icon = icon2;
                    pointDTO = pointDTO2;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    boundingBox = boundingBox3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    coordinate = coordinate2;
                    icon = icon2;
                    pointDTO = pointDTO2;
                case 9:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    boundingBox = boundingBox3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    coordinate = coordinate2;
                    icon = icon2;
                    pointDTO = pointDTO2;
                case 10:
                    list = this.nullableListOfDoubleAdapter.fromJson(reader);
                    boundingBox = boundingBox3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    coordinate = coordinate2;
                    icon = icon2;
                    pointDTO = pointDTO2;
                default:
                    boundingBox = boundingBox3;
                    textAtom = textAtom3;
                    textAtom2 = textAtom4;
                    coordinate = coordinate2;
                    icon = icon2;
                    pointDTO = pointDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsPageMapPreviewDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("pinCoordinate");
        this.coordinateAdapter.mo44toJson(writer, (x) value.getPinCoordinate());
        writer.w("pinIcon");
        this.iconAdapter.mo44toJson(writer, (x) value.getPinIcon());
        writer.w("pinAnchorPoint");
        this.pointDTOAdapter.mo44toJson(writer, (x) value.getPinAnchorPoint());
        writer.w("boundingBox");
        this.boundingBoxAdapter.mo44toJson(writer, (x) value.getBoundingBox());
        writer.w("selectAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getSelectAction());
        writer.w("copyButton");
        this.linkButtonDTOAdapter.mo44toJson(writer, (x) value.getCopyButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("selectActionTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getSelectActionTrackingInfo());
        writer.w("locationPoint");
        this.nullableListOfDoubleAdapter.mo44toJson(writer, (x) value.getLocationPoint());
        writer.p();
    }
}
