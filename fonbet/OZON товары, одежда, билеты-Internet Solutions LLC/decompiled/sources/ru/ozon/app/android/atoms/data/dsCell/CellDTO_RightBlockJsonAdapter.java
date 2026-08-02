package ru.ozon.app.android.atoms.data.dsCell;

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
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.data.cell.CommonCellSettings;
import ru.ozon.app.android.atoms.data.controls.CommonControlSettings;
import ru.ozon.app.android.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.app.android.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.app.android.atoms.data.dsCell.CellDTO;
import ru.ozon.app.android.atoms.data.icon.IconDTO;
import ru.ozon.app.android.atoms.data.image.ImageDTO;
import ru.ozon.app.android.atoms.data.indicator.IndicatorDTO;
import ru.ozon.app.android.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/atoms/data/dsCell/CellDTO_RightBlockJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/dsCell/CellDTO$RightBlock;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/dsCell/CellDTO$RightBlock;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/dsCell/CellDTO$RightBlock;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/dsCell/CellDTO$BlockAlignment;", "nullableBlockAlignmentAdapter", "Lru/ozon/app/android/atoms/data/cell/CommonCellSettings$LayoutPadding;", "nullableLayoutPaddingAdapter", "Lru/ozon/app/android/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/app/android/atoms/data/indicator/IndicatorDTO;", "nullableIndicatorDTOAdapter", "Lru/ozon/app/android/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/app/android/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "Lru/ozon/app/android/atoms/data/image/ImageDTO;", "nullableImageDTOAdapter", "Lru/ozon/app/android/atoms/data/AtomDTO;", "nullableAtomDTOAtCellControlAtomDTOAdapter", "Lru/ozon/app/android/atoms/data/price/PriceDTO;", "nullablePriceDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CellDTO_RightBlockJsonAdapter extends JsonAdapter<CellDTO.RightBlock> {
    public static final int $stable = 8;
    private volatile Constructor<CellDTO.RightBlock> constructorRef;

    @NotNull
    private final JsonAdapter<AtomDTO> nullableAtomDTOAtCellControlAtomDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<CellDTO.BlockAlignment> nullableBlockAlignmentAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<IndicatorDTO> nullableIndicatorDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> nullableLayoutPaddingAdapter;

    @NotNull
    private final JsonAdapter<PriceDTO> nullablePriceDTOAdapter;

    @NotNull
    private final n.a options;

    public CellDTO_RightBlockJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("common", "alignment", "topPadding", "leftPadding", "horizontalSpaceBetween", "badge", "indicator", "icon", "button", "image", "control", "price");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<CommonControlSettings> f7 = moshi.f(CommonControlSettings.class, m11, "common");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableCommonControlSettingsAdapter = f7;
        JsonAdapter<CellDTO.BlockAlignment> f11 = moshi.f(CellDTO.BlockAlignment.class, m11, "alignment");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableBlockAlignmentAdapter = f11;
        JsonAdapter<CommonCellSettings.LayoutPadding> f12 = moshi.f(CommonCellSettings.LayoutPadding.class, m11, "topPadding");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableLayoutPaddingAdapter = f12;
        JsonAdapter<BadgeDTO> f13 = moshi.f(BadgeDTO.class, m11, "badge");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBadgeDTOAdapter = f13;
        JsonAdapter<IndicatorDTO> f14 = moshi.f(IndicatorDTO.class, m11, "indicator");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableIndicatorDTOAdapter = f14;
        JsonAdapter<IconDTO> f15 = moshi.f(IconDTO.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableIconDTOAdapter = f15;
        JsonAdapter<ButtonV3DTO> f16 = moshi.f(ButtonV3DTO.class, m11, "button");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableButtonV3DTOAdapter = f16;
        JsonAdapter<ImageDTO> f17 = moshi.f(ImageDTO.class, m11, "image");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableImageDTOAdapter = f17;
        JsonAdapter<AtomDTO> f18 = moshi.f(AtomDTO.class, e0.h(new CellControlAtomDTO() { // from class: ru.ozon.app.android.atoms.data.dsCell.CellDTO_RightBlockJsonAdapter$annotationImpl$ru_ozon_app_android_atoms_data_dsCell_CellControlAtomDTO$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return CellControlAtomDTO.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof CellControlAtomDTO;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.app.android.atoms.data.dsCell.CellControlAtomDTO()";
            }
        }), "control");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableAtomDTOAtCellControlAtomDTOAdapter = f18;
        JsonAdapter<PriceDTO> f19 = moshi.f(PriceDTO.class, m11, "price");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullablePriceDTOAdapter = f19;
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(CellDTO.RightBlock)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CellDTO.RightBlock fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        CommonControlSettings commonControlSettings = null;
        CellDTO.BlockAlignment blockAlignment = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        BadgeDTO badgeDTO = null;
        IndicatorDTO indicatorDTO = null;
        IconDTO iconDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        ImageDTO imageDTO = null;
        AtomDTO atomDTO = null;
        PriceDTO priceDTO = null;
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
                    blockAlignment = this.nullableBlockAlignmentAdapter.fromJson(reader);
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
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    indicatorDTO = this.nullableIndicatorDTOAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    atomDTO = this.nullableAtomDTOAtCellControlAtomDTOAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    priceDTO = this.nullablePriceDTOAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -4096) {
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            IconDTO iconDTO2 = iconDTO;
            IndicatorDTO indicatorDTO2 = indicatorDTO;
            BadgeDTO badgeDTO2 = badgeDTO;
            CommonCellSettings.LayoutPadding layoutPadding4 = layoutPadding3;
            CommonCellSettings.LayoutPadding layoutPadding5 = layoutPadding2;
            return new CellDTO.RightBlock(commonControlSettings, blockAlignment, layoutPadding, layoutPadding5, layoutPadding4, badgeDTO2, indicatorDTO2, iconDTO2, buttonV3DTO2, imageDTO, atomDTO, priceDTO);
        }
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
        IconDTO iconDTO3 = iconDTO;
        IndicatorDTO indicatorDTO3 = indicatorDTO;
        BadgeDTO badgeDTO3 = badgeDTO;
        CommonCellSettings.LayoutPadding layoutPadding6 = layoutPadding3;
        CommonCellSettings.LayoutPadding layoutPadding7 = layoutPadding2;
        CommonCellSettings.LayoutPadding layoutPadding8 = layoutPadding;
        CellDTO.BlockAlignment blockAlignment2 = blockAlignment;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        Constructor<CellDTO.RightBlock> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CellDTO.RightBlock.class.getDeclaredConstructor(CommonControlSettings.class, CellDTO.BlockAlignment.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, BadgeDTO.class, IndicatorDTO.class, IconDTO.class, ButtonV3DTO.class, ImageDTO.class, AtomDTO.class, PriceDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        CellDTO.RightBlock newInstance = constructor.newInstance(commonControlSettings2, blockAlignment2, layoutPadding8, layoutPadding7, layoutPadding6, badgeDTO3, indicatorDTO3, iconDTO3, buttonV3DTO3, imageDTO, atomDTO, priceDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CellDTO.RightBlock value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value_.getCommon());
        writer.w("alignment");
        this.nullableBlockAlignmentAdapter.mo44toJson(writer, (x) value_.getAlignment());
        writer.w("topPadding");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value_.getTopPadding());
        writer.w("leftPadding");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value_.getLeftPadding());
        writer.w("horizontalSpaceBetween");
        this.nullableLayoutPaddingAdapter.mo44toJson(writer, (x) value_.getHorizontalSpaceBetween());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value_.getBadge());
        writer.w("indicator");
        this.nullableIndicatorDTOAdapter.mo44toJson(writer, (x) value_.getIndicator());
        writer.w("icon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("button");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value_.getButton());
        writer.w("image");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("control");
        this.nullableAtomDTOAtCellControlAtomDTOAdapter.mo44toJson(writer, (x) value_.getControl());
        writer.w("price");
        this.nullablePriceDTOAdapter.mo44toJson(writer, (x) value_.getPrice());
        writer.p();
    }
}
