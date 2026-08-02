package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.ui.molecules.header.HeaderV2DTO;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data.NavigationSliderV3DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO_SectionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Section;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Section;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Section;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;", "nullableCornersAdapter", "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;", "nullableHeaderV2DTOAdapter", "", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item;", "nullableListOfItemAdapter", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigationSliderV3DTO_SectionJsonAdapter extends JsonAdapter<NavigationSliderV3DTO.Section> {

    @NotNull
    private final JsonAdapter<NavigationSliderV3DTO.Corners> nullableCornersAdapter;

    @NotNull
    private final JsonAdapter<HeaderV2DTO> nullableHeaderV2DTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<NavigationSliderV3DTO.Item>> nullableListOfItemAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public NavigationSliderV3DTO_SectionJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("separatorHeight", "backgroundColor", "corners", CommentV3DTO.HEADER_FIELD_NAME, "items");
        M m11 = M.f71699a;
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "separatorHeight");
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableCornersAdapter = moshi.f(NavigationSliderV3DTO.Corners.class, m11, "corners");
        this.nullableHeaderV2DTOAdapter = moshi.f(HeaderV2DTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableListOfItemAdapter = moshi.f(D.e(List.class, NavigationSliderV3DTO.Item.class), m11, "items");
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(NavigationSliderV3DTO.Section)", "toString(...)");
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
        List<NavigationSliderV3DTO.Item> list = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                num = this.nullableIntAdapter.fromJson(reader);
            } else if (v11 == 1) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("backgroundColor", "backgroundColor", reader);
                }
            } else if (v11 == 2) {
                corners = this.nullableCornersAdapter.fromJson(reader);
            } else if (v11 == 3) {
                headerV2DTO = this.nullableHeaderV2DTOAdapter.fromJson(reader);
            } else if (v11 == 4) {
                list = this.nullableListOfItemAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (str != null) {
            return new NavigationSliderV3DTO.Section(num, str, corners, headerV2DTO, list);
        }
        throw c.j("backgroundColor", "backgroundColor", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NavigationSliderV3DTO.Section value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("separatorHeight");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getSeparatorHeight());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("corners");
        this.nullableCornersAdapter.mo44toJson(writer, (x) value.getCorners());
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableHeaderV2DTOAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("items");
        this.nullableListOfItemAdapter.mo44toJson(writer, (x) value.getItems());
        writer.p();
    }
}
