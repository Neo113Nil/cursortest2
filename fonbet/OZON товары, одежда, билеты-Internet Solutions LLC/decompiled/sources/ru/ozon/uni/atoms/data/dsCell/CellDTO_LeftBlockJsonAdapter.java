package ru.ozon.uni.atoms.data.dsCell;

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
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/uni/atoms/data/dsCell/CellDTO_LeftBlockJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$LeftBlock;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/dsCell/CellDTO$LeftBlock;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/dsCell/CellDTO$LeftBlock;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO$BlockAlignment;", "nullableBlockAlignmentAtEnumNullFallbackAdapter", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "nullableLayoutPaddingAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "nullableImageDTOAdapter", "Lru/ozon/uni/atoms/data/AtomDTO;", "nullableAtomDTOAtCellControlAtomAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CellDTO_LeftBlockJsonAdapter extends JsonAdapter<CellDTO.LeftBlock> {
    public static final int $stable = 8;
    private volatile Constructor<CellDTO.LeftBlock> constructorRef;

    @NotNull
    private final JsonAdapter<AtomDTO> nullableAtomDTOAtCellControlAtomAdapter;

    @NotNull
    private final JsonAdapter<CellDTO.BlockAlignment> nullableBlockAlignmentAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> nullableLayoutPaddingAdapter;

    @NotNull
    private final n.a options;

    public CellDTO_LeftBlockJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("common", "alignment", "topPadding", "rightPadding", "horizontalSpaceBetween", "icon", "image", "control");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CommonControlSettings> f7 = moshi.f(CommonControlSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f7;
        JsonAdapter<CellDTO.BlockAlignment> f11 = moshi.f(CellDTO.BlockAlignment.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.uni.atoms.data.dsCell.CellDTO_LeftBlockJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "alignment");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableBlockAlignmentAtEnumNullFallbackAdapter = f11;
        JsonAdapter<CommonCellSettings.LayoutPadding> f12 = moshi.f(CommonCellSettings.LayoutPadding.class, m11, "topPadding");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableLayoutPaddingAdapter = f12;
        JsonAdapter<IconDTO> f13 = moshi.f(IconDTO.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableIconDTOAdapter = f13;
        JsonAdapter<ImageDTO> f14 = moshi.f(ImageDTO.class, m11, "image");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableImageDTOAdapter = f14;
        JsonAdapter<AtomDTO> f15 = moshi.f(AtomDTO.class, e0.h(new CellControlAtom() { // from class: ru.ozon.uni.atoms.data.dsCell.CellDTO_LeftBlockJsonAdapter$annotationImpl$ru_ozon_uni_atoms_data_dsCell_CellControlAtom$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return CellControlAtom.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof CellControlAtom;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.data.dsCell.CellControlAtom()";
            }
        }), "control");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableAtomDTOAtCellControlAtomAdapter = f15;
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(CellDTO.LeftBlock)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CellDTO.LeftBlock fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        CommonControlSettings commonControlSettings = null;
        CellDTO.BlockAlignment blockAlignment = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        IconDTO iconDTO = null;
        ImageDTO imageDTO = null;
        AtomDTO atomDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    blockAlignment = this.nullableBlockAlignmentAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    layoutPadding = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    layoutPadding2 = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    layoutPadding3 = this.nullableLayoutPaddingAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    atomDTO = this.nullableAtomDTOAtCellControlAtomAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -256) {
            AtomDTO atomDTO2 = atomDTO;
            ImageDTO imageDTO2 = imageDTO;
            IconDTO iconDTO2 = iconDTO;
            CommonCellSettings.LayoutPadding layoutPadding4 = layoutPadding3;
            CommonCellSettings.LayoutPadding layoutPadding5 = layoutPadding2;
            return new CellDTO.LeftBlock(commonControlSettings, blockAlignment, layoutPadding, layoutPadding5, layoutPadding4, iconDTO2, imageDTO2, atomDTO2);
        }
        AtomDTO atomDTO3 = atomDTO;
        ImageDTO imageDTO3 = imageDTO;
        IconDTO iconDTO3 = iconDTO;
        CommonCellSettings.LayoutPadding layoutPadding6 = layoutPadding3;
        CommonCellSettings.LayoutPadding layoutPadding7 = layoutPadding2;
        CommonCellSettings.LayoutPadding layoutPadding8 = layoutPadding;
        CellDTO.BlockAlignment blockAlignment2 = blockAlignment;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        Constructor<CellDTO.LeftBlock> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CellDTO.LeftBlock.class.getDeclaredConstructor(CommonControlSettings.class, CellDTO.BlockAlignment.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, IconDTO.class, ImageDTO.class, AtomDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        CellDTO.LeftBlock newInstance = constructor.newInstance(commonControlSettings2, blockAlignment2, layoutPadding8, layoutPadding7, layoutPadding6, iconDTO3, imageDTO3, atomDTO3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CellDTO.LeftBlock value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("alignment");
        this.nullableBlockAlignmentAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value_.getAlignment());
        writer.w("topPadding");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value_.getTopPadding());
        writer.w("rightPadding");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value_.getRightPadding());
        writer.w("horizontalSpaceBetween");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value_.getHorizontalSpaceBetween());
        writer.w("icon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("image");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("control");
        this.nullableAtomDTOAtCellControlAtomAdapter.mo44toJson(writer, (x) value_.getControl());
        writer.p();
    }
}
