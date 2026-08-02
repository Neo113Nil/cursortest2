package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.base.config.ParseException;
import ru.ozon.app.android.fresh.main.ui.molecules.header.HeaderV2DTO;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data.NavigationSliderV3DTO;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/SectionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Section;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Section;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Section;)V", "Lcom/squareup/moshi/Moshi;", "Lcom/squareup/moshi/n$a;", "jsonDTONames", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;", "headerV2DTOJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item;", "itemJsonAdapter", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;", "cornersJsonAdapter", "", "stringJsonAdapter", "", "intJsonAdapter", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SectionJsonAdapter extends JsonAdapter<NavigationSliderV3DTO.Section> {

    @NotNull
    private final JsonAdapter<NavigationSliderV3DTO.Corners> cornersJsonAdapter;

    @NotNull
    private final JsonAdapter<HeaderV2DTO> headerV2DTOJsonAdapter;

    @NotNull
    private final JsonAdapter<Integer> intJsonAdapter;

    @NotNull
    private final JsonAdapter<NavigationSliderV3DTO.Item> itemJsonAdapter;

    @NotNull
    private final n.a jsonDTONames;

    @NotNull
    private final Moshi moshi;

    @NotNull
    private final JsonAdapter<String> stringJsonAdapter;

    public SectionJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
        NavigationSliderV3DTO.DtoFieldName[] values = NavigationSliderV3DTO.DtoFieldName.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (NavigationSliderV3DTO.DtoFieldName dtoFieldName : values) {
            arrayList.add(dtoFieldName.getJsonName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.jsonDTONames = n.a.C0918a.a((String[]) Arrays.copyOf(strArr, strArr.length));
        this.headerV2DTOJsonAdapter = this.moshi.c(HeaderV2DTO.class);
        this.itemJsonAdapter = this.moshi.c(NavigationSliderV3DTO.Item.class);
        this.cornersJsonAdapter = this.moshi.c(NavigationSliderV3DTO.Corners.class);
        this.stringJsonAdapter = this.moshi.c(String.class);
        this.intJsonAdapter = this.moshi.c(Integer.TYPE);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NavigationSliderV3DTO.Section value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NavigationSliderV3DTO.Section fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        String str = null;
        NavigationSliderV3DTO.Corners corners = null;
        HeaderV2DTO headerV2DTO = null;
        Object obj = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.jsonDTONames);
            if (v11 == NavigationSliderV3DTO.DtoFieldName.CORNERS.ordinal()) {
                corners = this.cornersJsonAdapter.fromJson(reader);
            } else if (v11 == NavigationSliderV3DTO.DtoFieldName.BACKGROUNDS_COLOR.ordinal()) {
                str = this.stringJsonAdapter.fromJson(reader);
            } else if (v11 == NavigationSliderV3DTO.DtoFieldName.SEPARATOR_HEIGHT.ordinal()) {
                num = this.intJsonAdapter.fromJson(reader);
            } else if (v11 == NavigationSliderV3DTO.DtoFieldName.HEADER.ordinal()) {
                headerV2DTO = this.headerV2DTOJsonAdapter.fromJson(reader);
            } else if (v11 == NavigationSliderV3DTO.DtoFieldName.ITEMS.ordinal()) {
                obj = C10727i.d(C10720e0.a(), new SectionJsonAdapter$fromJson$1$1(reader, this, null));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        Integer num2 = num;
        String str2 = str;
        if (str2 != null) {
            return new NavigationSliderV3DTO.Section(num2, str2, corners, headerV2DTO, (List) obj);
        }
        throw new ParseException("Header must not be null");
    }
}
