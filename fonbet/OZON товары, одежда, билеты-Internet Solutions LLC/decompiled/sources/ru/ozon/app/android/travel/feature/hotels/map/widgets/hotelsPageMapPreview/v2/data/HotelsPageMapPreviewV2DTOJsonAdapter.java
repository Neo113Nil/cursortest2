package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.data.HotelsPageMapPreviewV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTOAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2DTO$MapSettings;", "mapSettingsAdapter", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "listOfCellDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageMapPreviewV2DTOJsonAdapter extends JsonAdapter<HotelsPageMapPreviewV2DTO> {
    private volatile Constructor<HotelsPageMapPreviewV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> iconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<List<CellDTO>> listOfCellDTOAdapter;

    @NotNull
    private final JsonAdapter<HotelsPageMapPreviewV2DTO.MapSettings> mapSettingsAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public HotelsPageMapPreviewV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, FormPageDTO.Field.FIELD_TYPE_ADDRESS, "copyButton", "map", "pointsOfInterests", "trackingInfo");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.iconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "copyButton");
        this.mapSettingsAdapter = moshi.f(HotelsPageMapPreviewV2DTO.MapSettings.class, m11, "map");
        this.listOfCellDTOAdapter = moshi.f(D.e(List.class, CellDTO.class), m11, "pointsOfInterests");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(HotelsPageMapPreviewV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsPageMapPreviewV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        HotelsPageMapPreviewV2DTO.MapSettings mapSettings = null;
        List<CellDTO> list = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q(FormPageDTO.Field.FIELD_TYPE_ADDRESS, FormPageDTO.Field.FIELD_TYPE_ADDRESS, reader);
                    }
                    break;
                case 2:
                    iconButtonV3DTO = this.iconButtonV3DTOAdapter.fromJson(reader);
                    if (iconButtonV3DTO == null) {
                        throw c.q("copyButton", "copyButton", reader);
                    }
                    break;
                case 3:
                    mapSettings = this.mapSettingsAdapter.fromJson(reader);
                    if (mapSettings == null) {
                        throw c.q("map", "map", reader);
                    }
                    break;
                case 4:
                    list = this.listOfCellDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("pointsOfInterests", "pointsOfInterests", reader);
                    }
                    i11 = -17;
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -17) {
            HotelsPageMapPreviewV2DTO.MapSettings mapSettings2 = mapSettings;
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            TextDTO textDTO3 = textDTO2;
            TextDTO textDTO4 = textDTO;
            if (textDTO4 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (textDTO3 == null) {
                throw c.j(FormPageDTO.Field.FIELD_TYPE_ADDRESS, FormPageDTO.Field.FIELD_TYPE_ADDRESS, reader);
            }
            if (iconButtonV3DTO2 == null) {
                throw c.j("copyButton", "copyButton", reader);
            }
            if (mapSettings2 == null) {
                throw c.j("map", "map", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.dsCell.CellDTO>");
            return new HotelsPageMapPreviewV2DTO(textDTO4, textDTO3, iconButtonV3DTO2, mapSettings2, list, map);
        }
        HotelsPageMapPreviewV2DTO.MapSettings mapSettings3 = mapSettings;
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO;
        TextDTO textDTO5 = textDTO2;
        TextDTO textDTO6 = textDTO;
        Constructor<HotelsPageMapPreviewV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HotelsPageMapPreviewV2DTO.class.getDeclaredConstructor(TextDTO.class, TextDTO.class, IconButtonV3DTO.class, HotelsPageMapPreviewV2DTO.MapSettings.class, List.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<HotelsPageMapPreviewV2DTO> constructor2 = constructor;
        if (textDTO6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (textDTO5 == null) {
            throw c.j(FormPageDTO.Field.FIELD_TYPE_ADDRESS, FormPageDTO.Field.FIELD_TYPE_ADDRESS, reader);
        }
        if (iconButtonV3DTO3 == null) {
            throw c.j("copyButton", "copyButton", reader);
        }
        if (mapSettings3 == null) {
            throw c.j("map", "map", reader);
        }
        HotelsPageMapPreviewV2DTO newInstance = constructor2.newInstance(textDTO6, textDTO5, iconButtonV3DTO3, mapSettings3, list, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsPageMapPreviewV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getAddress());
        writer.w("copyButton");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getCopyButton());
        writer.w("map");
        this.mapSettingsAdapter.mo44toJson(writer, (x) value.getMap());
        writer.w("pointsOfInterests");
        this.listOfCellDTOAdapter.mo44toJson(writer, (x) value.getPointsOfInterests());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
