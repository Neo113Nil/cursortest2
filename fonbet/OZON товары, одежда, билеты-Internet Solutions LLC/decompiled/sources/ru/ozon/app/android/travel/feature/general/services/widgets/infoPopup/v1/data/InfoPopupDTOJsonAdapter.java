package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.data;

import Ak.b;
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
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.data.InfoPopupDTO;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellsDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTO$InfoPopupImageDTO;", "nullableInfoPopupImageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellsDTO;", "nullableTextInfoCellsDTOAdapter", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "nullableListOfCellWithSubtitle24IconAdapter", "Lru/ozon/uni/atoms/data/AtomDTO;", "nullableListOfAtomDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoPopupDTOJsonAdapter extends JsonAdapter<InfoPopupDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<InfoPopupDTO.InfoPopupImageDTO> nullableInfoPopupImageDTOAdapter;

    @NotNull
    private final JsonAdapter<List<AtomDTO>> nullableListOfAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon>> nullableListOfCellWithSubtitle24IconAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextInfoCellsDTO> nullableTextInfoCellsDTOAdapter;

    @NotNull
    private final n.a options;

    public InfoPopupDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", "textInfoCells", "cells", "buttons", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableInfoPopupImageDTOAdapter = moshi.f(InfoPopupDTO.InfoPopupImageDTO.class, m11, "image");
        this.nullableTextInfoCellsDTOAdapter = moshi.f(TextInfoCellsDTO.class, m11, "textInfoCells");
        this.nullableListOfCellWithSubtitle24IconAdapter = moshi.f(D.e(List.class, CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class), m11, "cells");
        this.nullableListOfAtomDTOAdapter = moshi.f(D.e(List.class, AtomDTO.class), m11, "buttons");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(InfoPopupDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public InfoPopupDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        InfoPopupDTO.InfoPopupImageDTO infoPopupImageDTO = null;
        TextInfoCellsDTO textInfoCellsDTO = null;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list = null;
        List<AtomDTO> list2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                infoPopupImageDTO = this.nullableInfoPopupImageDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                textInfoCellsDTO = this.nullableTextInfoCellsDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                list = this.nullableListOfCellWithSubtitle24IconAdapter.fromJson(reader);
            } else if (v11 == 3) {
                list2 = this.nullableListOfAtomDTOAdapter.fromJson(reader);
            } else if (v11 == 4) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new InfoPopupDTO(infoPopupImageDTO, textInfoCellsDTO, list, list2, map);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, InfoPopupDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.nullableInfoPopupImageDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("textInfoCells");
        this.nullableTextInfoCellsDTOAdapter.mo44toJson(writer, (x) value.getTextInfoCells());
        writer.w("cells");
        this.nullableListOfCellWithSubtitle24IconAdapter.mo44toJson(writer, (x) value.getCells());
        writer.w("buttons");
        this.nullableListOfAtomDTOAdapter.mo44toJson(writer, (x) value.getButtons());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
