package ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data;

import Y9.b;
import Y9.c;
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
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableListOfButtonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$StatusWidgetSize;", "nullableStatusWidgetSizeAdapter", "nullableStringAdapter", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$ButtonLayout;", "nullableButtonLayoutAdapter", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StatusWidgetDTOJsonAdapter extends JsonAdapter<StatusWidgetDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<StatusWidgetDTO.ButtonLayout> nullableButtonLayoutAdapter;

    @NotNull
    private final JsonAdapter<List<ButtonV3DTO>> nullableListOfButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<StatusWidgetDTO.StatusWidgetSize> nullableStatusWidgetSizeAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public StatusWidgetDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("newButtons", "imageAtom", "titleAtom", "messageAtom", "size", "backgroundColor", "buttonLayout");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        b e11 = D.e(List.class, ButtonV3DTO.class);
        M m11 = M.f71699a;
        JsonAdapter<List<ButtonV3DTO>> f7 = moshi.f(e11, m11, "newButtons");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableListOfButtonV3DTOAdapter = f7;
        JsonAdapter<ImageDTO> f11 = moshi.f(ImageDTO.class, m11, "imageAtom");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.imageDTOAdapter = f11;
        JsonAdapter<TextDTO> f12 = moshi.f(TextDTO.class, m11, "titleAtom");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.textDTOAdapter = f12;
        JsonAdapter<TextDTO> f13 = moshi.f(TextDTO.class, m11, "messageAtom");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableTextDTOAdapter = f13;
        JsonAdapter<StatusWidgetDTO.StatusWidgetSize> f14 = moshi.f(StatusWidgetDTO.StatusWidgetSize.class, m11, "size");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStatusWidgetSizeAdapter = f14;
        JsonAdapter<String> f15 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableStringAdapter = f15;
        JsonAdapter<StatusWidgetDTO.ButtonLayout> f16 = moshi.f(StatusWidgetDTO.ButtonLayout.class, m11, "buttonLayout");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableButtonLayoutAdapter = f16;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(37, "GeneratedJsonAdapter(StatusWidgetDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public StatusWidgetDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<ButtonV3DTO> list = null;
        ImageDTO imageDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        StatusWidgetDTO.StatusWidgetSize statusWidgetSize = null;
        String str = null;
        StatusWidgetDTO.ButtonLayout buttonLayout = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.nullableListOfButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 1:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("imageAtom", "imageAtom", reader);
                    }
                    break;
                case 2:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("titleAtom", "titleAtom", reader);
                    }
                    break;
                case 3:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    statusWidgetSize = this.nullableStatusWidgetSizeAdapter.fromJson(reader);
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    buttonLayout = this.nullableButtonLayoutAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (imageDTO == null) {
            throw c.j("imageAtom", "imageAtom", reader);
        }
        if (textDTO != null) {
            return new StatusWidgetDTO(list, imageDTO, textDTO, textDTO2, statusWidgetSize, str, buttonLayout);
        }
        throw c.j("titleAtom", "titleAtom", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, StatusWidgetDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("newButtons");
        this.nullableListOfButtonV3DTOAdapter.mo44toJson(writer, (x) value_.getNewButtons());
        writer.w("imageAtom");
        this.imageDTOAdapter.mo44toJson(writer, (x) value_.getImageAtom());
        writer.w("titleAtom");
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getTitleAtom());
        writer.w("messageAtom");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getMessageAtom());
        writer.w("size");
        this.nullableStatusWidgetSizeAdapter.mo44toJson(writer, (x) value_.getSize());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("buttonLayout");
        this.nullableButtonLayoutAdapter.mo44toJson(writer, (x) value_.getButtonLayout());
        writer.p();
    }
}
