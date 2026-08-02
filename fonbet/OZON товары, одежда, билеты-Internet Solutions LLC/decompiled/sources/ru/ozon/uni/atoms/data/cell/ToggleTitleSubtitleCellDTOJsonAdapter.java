package ru.ozon.uni.atoms.data.cell;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.ToggleTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO$ToggleTitleSubtitleCellPreset;", "nullableToggleTitleSubtitleCellPresetAtEnumNullFallbackAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "nullableCommonCellSettingsAdapter", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO;", "commonAtomLabelDTOAdapter", "nullableCommonAtomLabelDTOAdapter", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "nullableToggleDTOAdapter", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToggleTitleSubtitleCellDTOJsonAdapter extends JsonAdapter<ToggleTitleSubtitleCellDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CommonAtomLabelDTO> commonAtomLabelDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomLabelDTO> nullableCommonAtomLabelDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings> nullableCommonCellSettingsAdapter;

    @NotNull
    private final JsonAdapter<ToggleDTO> nullableToggleDTOAdapter;

    @NotNull
    private final JsonAdapter<ToggleTitleSubtitleCellDTO.ToggleTitleSubtitleCellPreset> nullableToggleTitleSubtitleCellPresetAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    public ToggleTitleSubtitleCellDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("preset", "common", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "toggle");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<ToggleTitleSubtitleCellDTO.ToggleTitleSubtitleCellPreset> f7 = moshi.f(ToggleTitleSubtitleCellDTO.ToggleTitleSubtitleCellPreset.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.cell.ToggleTitleSubtitleCellDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "preset");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableToggleTitleSubtitleCellPresetAtEnumNullFallbackAdapter = f7;
        M m11 = M.f71699a;
        JsonAdapter<CommonCellSettings> f11 = moshi.f(CommonCellSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableCommonCellSettingsAdapter = f11;
        JsonAdapter<CommonAtomLabelDTO> f12 = moshi.f(CommonAtomLabelDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.commonAtomLabelDTOAdapter = f12;
        JsonAdapter<CommonAtomLabelDTO> f13 = moshi.f(CommonAtomLabelDTO.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableCommonAtomLabelDTOAdapter = f13;
        JsonAdapter<ToggleDTO> f14 = moshi.f(ToggleDTO.class, m11, "toggle");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableToggleDTOAdapter = f14;
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(ToggleTitleSubtitleCellDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ToggleTitleSubtitleCellDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ToggleTitleSubtitleCellDTO.ToggleTitleSubtitleCellPreset toggleTitleSubtitleCellPreset = null;
        CommonCellSettings commonCellSettings = null;
        CommonAtomLabelDTO commonAtomLabelDTO = null;
        CommonAtomLabelDTO commonAtomLabelDTO2 = null;
        ToggleDTO toggleDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                toggleTitleSubtitleCellPreset = this.nullableToggleTitleSubtitleCellPresetAtEnumNullFallbackAdapter.fromJson(reader);
            } else if (v11 == 1) {
                commonCellSettings = this.nullableCommonCellSettingsAdapter.fromJson(reader);
            } else if (v11 == 2) {
                commonAtomLabelDTO = this.commonAtomLabelDTOAdapter.fromJson(reader);
                if (commonAtomLabelDTO == null) {
                    throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
            } else if (v11 == 3) {
                commonAtomLabelDTO2 = this.nullableCommonAtomLabelDTOAdapter.fromJson(reader);
            } else if (v11 == 4) {
                toggleDTO = this.nullableToggleDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (commonAtomLabelDTO != null) {
            return new ToggleTitleSubtitleCellDTO(toggleTitleSubtitleCellPreset, commonCellSettings, commonAtomLabelDTO, commonAtomLabelDTO2, toggleDTO);
        }
        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ToggleTitleSubtitleCellDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("preset");
        this.nullableToggleTitleSubtitleCellPresetAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getPreset());
        writer.w("common");
        this.nullableCommonCellSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.commonAtomLabelDTOAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableCommonAtomLabelDTOAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("toggle");
        this.nullableToggleDTOAdapter.mo44toJson(writer, (x) value_.getToggle());
        writer.p();
    }
}
