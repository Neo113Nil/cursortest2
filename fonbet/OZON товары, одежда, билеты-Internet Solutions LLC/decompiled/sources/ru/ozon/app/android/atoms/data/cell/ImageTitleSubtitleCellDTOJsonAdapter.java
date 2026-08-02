package ru.ozon.app.android.atoms.data.cell;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cell.ImageTitleSubtitleCellDTO;
import ru.ozon.app.android.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.app.android.atoms.data.image.ImageDTO;
import ru.ozon.app.android.atoms.data.image.ImageFixedDTO;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/atoms/data/cell/ImageTitleSubtitleCellDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/cell/ImageTitleSubtitleCellDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/cell/ImageTitleSubtitleCellDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/cell/ImageTitleSubtitleCellDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings;", "nullableCommonCellSettingsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/cell/ImageTitleSubtitleCellDTO$ImageTitleSubtitleCellPreset;", "nullableImageTitleSubtitleCellPresetAtEnumNullFallbackAdapter", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "commonAtomLabelDTOAdapter", "nullableCommonAtomLabelDTOAdapter", "Lru/ozon/app/android/atoms/data/image/ImageFixedDTO;", "nullableImageFixedDTOAdapter", "Lru/ozon/app/android/atoms/data/image/ImageDTO;", "nullableImageDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImageTitleSubtitleCellDTOJsonAdapter extends JsonAdapter<ImageTitleSubtitleCellDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CommonAtomLabelDTO> commonAtomLabelDTOAdapter;
    private volatile Constructor<ImageTitleSubtitleCellDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CommonAtomLabelDTO> nullableCommonAtomLabelDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings> nullableCommonCellSettingsAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<ImageFixedDTO> nullableImageFixedDTOAdapter;

    @NotNull
    private final JsonAdapter<ImageTitleSubtitleCellDTO.ImageTitleSubtitleCellPreset> nullableImageTitleSubtitleCellPresetAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    public ImageTitleSubtitleCellDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("common", "preset", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "imageFixed", "image");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CommonCellSettings> f7 = moshi.f(CommonCellSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableCommonCellSettingsAdapter = f7;
        JsonAdapter<ImageTitleSubtitleCellDTO.ImageTitleSubtitleCellPreset> f11 = moshi.f(ImageTitleSubtitleCellDTO.ImageTitleSubtitleCellPreset.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.atoms.data.cell.ImageTitleSubtitleCellDTOJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
                return "@ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "preset");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableImageTitleSubtitleCellPresetAtEnumNullFallbackAdapter = f11;
        JsonAdapter<CommonAtomLabelDTO> f12 = moshi.f(CommonAtomLabelDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.commonAtomLabelDTOAdapter = f12;
        JsonAdapter<CommonAtomLabelDTO> f13 = moshi.f(CommonAtomLabelDTO.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableCommonAtomLabelDTOAdapter = f13;
        JsonAdapter<ImageFixedDTO> f14 = moshi.f(ImageFixedDTO.class, m11, "imageFixed");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableImageFixedDTOAdapter = f14;
        JsonAdapter<ImageDTO> f15 = moshi.f(ImageDTO.class, m11, "image");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableImageDTOAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(ImageTitleSubtitleCellDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ImageTitleSubtitleCellDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        CommonCellSettings commonCellSettings = null;
        ImageTitleSubtitleCellDTO.ImageTitleSubtitleCellPreset imageTitleSubtitleCellPreset = null;
        CommonAtomLabelDTO commonAtomLabelDTO = null;
        CommonAtomLabelDTO commonAtomLabelDTO2 = null;
        ImageFixedDTO imageFixedDTO = null;
        ImageDTO imageDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    commonCellSettings = this.nullableCommonCellSettingsAdapter.fromJson(reader);
                    break;
                case 1:
                    imageTitleSubtitleCellPreset = this.nullableImageTitleSubtitleCellPresetAtEnumNullFallbackAdapter.fromJson(reader);
                    break;
                case 2:
                    commonAtomLabelDTO = this.commonAtomLabelDTOAdapter.fromJson(reader);
                    if (commonAtomLabelDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 3:
                    commonAtomLabelDTO2 = this.nullableCommonAtomLabelDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    imageFixedDTO = this.nullableImageFixedDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                    i11 = -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            ImageDTO imageDTO2 = imageDTO;
            ImageFixedDTO imageFixedDTO2 = imageFixedDTO;
            CommonAtomLabelDTO commonAtomLabelDTO3 = commonAtomLabelDTO2;
            CommonAtomLabelDTO commonAtomLabelDTO4 = commonAtomLabelDTO;
            ImageTitleSubtitleCellDTO.ImageTitleSubtitleCellPreset imageTitleSubtitleCellPreset2 = imageTitleSubtitleCellPreset;
            CommonCellSettings commonCellSettings2 = commonCellSettings;
            if (commonAtomLabelDTO4 != null) {
                return new ImageTitleSubtitleCellDTO(commonCellSettings2, imageTitleSubtitleCellPreset2, commonAtomLabelDTO4, commonAtomLabelDTO3, imageFixedDTO2, imageDTO2);
            }
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        ImageDTO imageDTO3 = imageDTO;
        ImageFixedDTO imageFixedDTO3 = imageFixedDTO;
        CommonAtomLabelDTO commonAtomLabelDTO5 = commonAtomLabelDTO2;
        CommonAtomLabelDTO commonAtomLabelDTO6 = commonAtomLabelDTO;
        ImageTitleSubtitleCellDTO.ImageTitleSubtitleCellPreset imageTitleSubtitleCellPreset3 = imageTitleSubtitleCellPreset;
        CommonCellSettings commonCellSettings3 = commonCellSettings;
        Constructor<ImageTitleSubtitleCellDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ImageTitleSubtitleCellDTO.class.getDeclaredConstructor(CommonCellSettings.class, ImageTitleSubtitleCellDTO.ImageTitleSubtitleCellPreset.class, CommonAtomLabelDTO.class, CommonAtomLabelDTO.class, ImageFixedDTO.class, ImageDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (commonAtomLabelDTO6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        ImageTitleSubtitleCellDTO newInstance = constructor.newInstance(commonCellSettings3, imageTitleSubtitleCellPreset3, commonAtomLabelDTO6, commonAtomLabelDTO5, imageFixedDTO3, imageDTO3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ImageTitleSubtitleCellDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("common");
        this.nullableCommonCellSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("preset");
        this.nullableImageTitleSubtitleCellPresetAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getPreset());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.commonAtomLabelDTOAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableCommonAtomLabelDTOAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("imageFixed");
        this.nullableImageFixedDTOAdapter.mo44toJson(writer, (x) value_.getImageFixed());
        writer.w("image");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.p();
    }
}
