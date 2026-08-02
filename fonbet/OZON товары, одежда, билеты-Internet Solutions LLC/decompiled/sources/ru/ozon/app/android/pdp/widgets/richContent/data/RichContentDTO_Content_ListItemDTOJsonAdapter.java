package ru.ozon.app.android.pdp.widgets.richContent.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO_Content_ListItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$ListItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$ListItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content$ListItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;", "nullableAlignedTextAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;", "nullableImagePositionAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "", "nullableIntAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentDTO_Content_ListItemDTOJsonAdapter extends JsonAdapter<RichContentDTO.Content.ListItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<RichContentDTO.AlignedText> nullableAlignedTextAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<RichContentDTO.ImagePosition> nullableImagePositionAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public RichContentDTO_Content_ListItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "text", "imagePosition", "isParandja", "image", "number", "tabGroupId", "isExpanded", "position");
        M m11 = M.f71699a;
        this.nullableAlignedTextAdapter = moshi.f(RichContentDTO.AlignedText.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableImagePositionAdapter = moshi.f(RichContentDTO.ImagePosition.class, m11, "imagePosition");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isParandja");
        this.nullableStringAdapter = moshi.f(String.class, m11, "image");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "number");
    }

    @NotNull
    public String toString() {
        return b.c(56, "GeneratedJsonAdapter(RichContentDTO.Content.ListItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RichContentDTO.Content.ListItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        RichContentDTO.AlignedText alignedText = null;
        RichContentDTO.AlignedText alignedText2 = null;
        RichContentDTO.ImagePosition imagePosition = null;
        Boolean bool = null;
        String str = null;
        Integer num = null;
        String str2 = null;
        Boolean bool2 = null;
        Integer num2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    alignedText = this.nullableAlignedTextAdapter.fromJson(reader);
                    break;
                case 1:
                    alignedText2 = this.nullableAlignedTextAdapter.fromJson(reader);
                    break;
                case 2:
                    imagePosition = this.nullableImagePositionAdapter.fromJson(reader);
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 8:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new RichContentDTO.Content.ListItemDTO(alignedText, alignedText2, imagePosition, bool, str, num, str2, bool2, num2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RichContentDTO.Content.ListItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableAlignedTextAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("text");
        this.nullableAlignedTextAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("imagePosition");
        this.nullableImagePositionAdapter.mo44toJson(writer, (x) value.getImagePosition());
        writer.w("isParandja");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isParandja());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("number");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getNumber());
        writer.w("tabGroupId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTabGroupId());
        writer.w("isExpanded");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isExpanded());
        writer.w("position");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getPosition());
        writer.p();
    }
}
