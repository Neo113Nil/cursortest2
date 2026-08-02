package ru.ozon.app.android.travel.feature.general.services.widgets.supportPremiumCellsWithHeader.data;

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
import ru.ozon.app.android.travel.feature.general.services.widgets.supportPremiumCellsWithHeader.data.SupportPremiumCellsWithHeaderDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "nullableImageDTOAdapter", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTO$HeaderContentDTO;", "nullableHeaderContentDTOAdapter", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/supportPremiumCellsWithHeader/data/SupportPremiumCellsWithHeaderDTO$CellBlockDTO;", "listOfCellBlockDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SupportPremiumCellsWithHeaderDTOJsonAdapter extends JsonAdapter<SupportPremiumCellsWithHeaderDTO> {
    public static final int $stable = 8;
    private volatile Constructor<SupportPremiumCellsWithHeaderDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<SupportPremiumCellsWithHeaderDTO.CellBlockDTO>> listOfCellBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<SupportPremiumCellsWithHeaderDTO.HeaderContentDTO> nullableHeaderContentDTOAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SupportPremiumCellsWithHeaderDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("backgroundColor", "backgroundImageApp", "image", "headerContent", "cellBlocks", "trackingInfo");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundImageApp");
        this.nullableImageDTOAdapter = moshi.f(ImageDTO.class, m11, "image");
        this.nullableHeaderContentDTOAdapter = moshi.f(SupportPremiumCellsWithHeaderDTO.HeaderContentDTO.class, m11, "headerContent");
        this.listOfCellBlockDTOAdapter = moshi.f(D.e(List.class, SupportPremiumCellsWithHeaderDTO.CellBlockDTO.class), m11, "cellBlocks");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(SupportPremiumCellsWithHeaderDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SupportPremiumCellsWithHeaderDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        ImageDTO imageDTO = null;
        SupportPremiumCellsWithHeaderDTO.HeaderContentDTO headerContentDTO = null;
        List<SupportPremiumCellsWithHeaderDTO.CellBlockDTO> list = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    headerContentDTO = this.nullableHeaderContentDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    list = this.listOfCellBlockDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("cellBlocks", "cellBlocks", reader);
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
            SupportPremiumCellsWithHeaderDTO.HeaderContentDTO headerContentDTO2 = headerContentDTO;
            ImageDTO imageDTO2 = imageDTO;
            String str3 = str2;
            String str4 = str;
            if (str4 == null) {
                throw c.j("backgroundColor", "backgroundColor", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.general.services.widgets.supportPremiumCellsWithHeader.data.SupportPremiumCellsWithHeaderDTO.CellBlockDTO>");
            return new SupportPremiumCellsWithHeaderDTO(str4, str3, imageDTO2, headerContentDTO2, list, map);
        }
        SupportPremiumCellsWithHeaderDTO.HeaderContentDTO headerContentDTO3 = headerContentDTO;
        ImageDTO imageDTO3 = imageDTO;
        String str5 = str2;
        String str6 = str;
        Constructor<SupportPremiumCellsWithHeaderDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SupportPremiumCellsWithHeaderDTO.class.getDeclaredConstructor(String.class, String.class, ImageDTO.class, SupportPremiumCellsWithHeaderDTO.HeaderContentDTO.class, List.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<SupportPremiumCellsWithHeaderDTO> constructor2 = constructor;
        if (str6 == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        SupportPremiumCellsWithHeaderDTO newInstance = constructor2.newInstance(str6, str5, imageDTO3, headerContentDTO3, list, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SupportPremiumCellsWithHeaderDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("backgroundImageApp");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundImageApp());
        writer.w("image");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("headerContent");
        this.nullableHeaderContentDTOAdapter.mo44toJson(writer, (x) value.getHeaderContent());
        writer.w("cellBlocks");
        this.listOfCellBlockDTOAdapter.mo44toJson(writer, (x) value.getCellBlocks());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
