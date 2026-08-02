package ru.ozon.app.android.search.widgets.history.search.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO_PresentationSettingsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$PresentationSettings;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$PresentationSettings;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO$PresentationSettings;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/common/Paddings;", "nullablePaddingsAdapter", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HistoryDTO_PresentationSettingsJsonAdapter extends JsonAdapter<HistoryDTO.PresentationSettings> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Paddings> nullablePaddingsAdapter;

    @NotNull
    private final n.a options;

    public HistoryDTO_PresentationSettingsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("showMoreButton", "hasMoreItems", "collapsedMaxRows", "lastItemMinWidth", "paddingTop", "paddingRight", "paddingBottom", "paddingLeft", "rowGap", "columnGap");
        M m11 = M.f71699a;
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "showMoreButton");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "hasMoreItems");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "collapsedMaxRows");
        this.nullablePaddingsAdapter = moshi.f(Paddings.class, m11, "paddingTop");
    }

    @NotNull
    public String toString() {
        return b.c(53, "GeneratedJsonAdapter(HistoryDTO.PresentationSettings)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HistoryDTO.PresentationSettings fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ButtonV3DTO buttonV3DTO = null;
        Boolean bool = null;
        Integer num = null;
        Integer num2 = null;
        Paddings paddings = null;
        Paddings paddings2 = null;
        Paddings paddings3 = null;
        Paddings paddings4 = null;
        Paddings paddings5 = null;
        Paddings paddings6 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("showMoreButton", "showMoreButton", reader);
                    }
                    break;
                case 1:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 3:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 4:
                    paddings = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 5:
                    paddings2 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 6:
                    paddings3 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 7:
                    paddings4 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 8:
                    paddings5 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 9:
                    paddings6 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (buttonV3DTO != null) {
            return new HistoryDTO.PresentationSettings(buttonV3DTO, bool, num, num2, paddings, paddings2, paddings3, paddings4, paddings5, paddings6);
        }
        throw c.j("showMoreButton", "showMoreButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HistoryDTO.PresentationSettings value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("showMoreButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getShowMoreButton());
        writer.w("hasMoreItems");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHasMoreItems());
        writer.w("collapsedMaxRows");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getCollapsedMaxRows());
        writer.w("lastItemMinWidth");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getLastItemMinWidth());
        writer.w("paddingTop");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getPaddingTop());
        writer.w("paddingRight");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getPaddingRight());
        writer.w("paddingBottom");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getPaddingBottom());
        writer.w("paddingLeft");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getPaddingLeft());
        writer.w("rowGap");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getRowGap());
        writer.w("columnGap");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getColumnGap());
        writer.p();
    }
}
