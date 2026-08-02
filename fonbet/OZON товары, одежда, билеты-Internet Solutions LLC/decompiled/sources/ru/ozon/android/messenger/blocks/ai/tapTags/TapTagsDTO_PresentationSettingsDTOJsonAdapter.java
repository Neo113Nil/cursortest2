package ru.ozon.android.messenger.blocks.ai.tapTags;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.tapTags.TapTagsDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO_PresentationSettingsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO$PresentationSettingsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO$PresentationSettingsDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/ai/tapTags/TapTagsDTO$PresentationSettingsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/common/Paddings;", "nullablePaddingsAdapter", "nullableStringAdapter", "", "nullableFloatAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TapTagsDTO_PresentationSettingsDTOJsonAdapter extends JsonAdapter<TapTagsDTO.PresentationSettingsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Paddings> nullablePaddingsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public TapTagsDTO_PresentationSettingsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("showMoreButton", "hasMoreItems", "collapsedMaxRows", "lastItemMinWidth", "paddingTop", "paddingRight", "paddingBottom", "paddingLeft", "rowGap", "columnGap", "backgroundColor", "itemsMaxPercentWidth", "pinToBottom");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<ButtonV3DTO> f7 = moshi.f(ButtonV3DTO.class, m11, "showMoreButton");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableButtonV3DTOAdapter = f7;
        JsonAdapter<Boolean> f11 = moshi.f(Boolean.class, m11, "hasMoreItems");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableBooleanAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "collapsedMaxRows");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        JsonAdapter<Paddings> f13 = moshi.f(Paddings.class, m11, "paddingTop");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullablePaddingsAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
        JsonAdapter<Float> f15 = moshi.f(Float.class, m11, "itemsMaxPercentWidth");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableFloatAdapter = f15;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(56, "GeneratedJsonAdapter(TapTagsDTO.PresentationSettingsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TapTagsDTO.PresentationSettingsDTO fromJson(@NotNull n reader) {
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
        String str = null;
        Float f7 = null;
        Boolean bool2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
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
                case 10:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 11:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    break;
                case 12:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new TapTagsDTO.PresentationSettingsDTO(buttonV3DTO, bool, num, num2, paddings, paddings2, paddings3, paddings4, paddings5, paddings6, str, f7, bool2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TapTagsDTO.PresentationSettingsDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("showMoreButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value_.getShowMoreButton());
        writer.w("hasMoreItems");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHasMoreItems());
        writer.w("collapsedMaxRows");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getCollapsedMaxRows());
        writer.w("lastItemMinWidth");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getLastItemMinWidth());
        writer.w("paddingTop");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value_.getPaddingTop());
        writer.w("paddingRight");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value_.getPaddingRight());
        writer.w("paddingBottom");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value_.getPaddingBottom());
        writer.w("paddingLeft");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value_.getPaddingLeft());
        writer.w("rowGap");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value_.getRowGap());
        writer.w("columnGap");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value_.getColumnGap());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("itemsMaxPercentWidth");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value_.getItemsMaxPercentWidth());
        writer.w("pinToBottom");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getPinToBottom());
        writer.p();
    }
}
