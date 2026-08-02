package ru.ozon.app.android.orderdetails.productsToPay.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.media.data.ProductMediaImageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/data/ProductDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/orderdetails/productsToPay/data/ProductDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/orderdetails/productsToPay/data/ProductDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/orderdetails/productsToPay/data/ProductDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "nullableCheckBoxDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/orderdetails/productsToPay/data/ProductImageDTO;", "nullableProductImageDTOAdapter", "Lru/ozon/app/android/cscore/orderdetails/molecule/media/data/ProductMediaImageDTO;", "nullableProductMediaImageDTOAdapter", "Lru/ozon/app/android/orderdetails/productsToPay/data/ProductPriceDTO;", "nullableProductPriceDTOAdapter", "Lru/ozon/app/android/orderdetails/productsToPay/data/ProductCounterDto;", "nullableProductCounterDtoAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductDTOJsonAdapter extends JsonAdapter<ProductDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ProductDTO> constructorRef;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<CheckBoxDTO> nullableCheckBoxDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<ProductCounterDto> nullableProductCounterDtoAdapter;

    @NotNull
    private final JsonAdapter<ProductImageDTO> nullableProductImageDTOAdapter;

    @NotNull
    private final JsonAdapter<ProductMediaImageDTO> nullableProductMediaImageDTOAdapter;

    @NotNull
    private final JsonAdapter<ProductPriceDTO> nullableProductPriceDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ProductDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("checkbox", "productImage", "productMediaImage", "productPrice", "productCounter", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "badge", "common", "disableSeparator");
        M m11 = M.f71699a;
        this.nullableCheckBoxDTOAdapter = moshi.f(CheckBoxDTO.class, m11, "checkbox");
        this.nullableProductImageDTOAdapter = moshi.f(ProductImageDTO.class, m11, "productImage");
        this.nullableProductMediaImageDTOAdapter = moshi.f(ProductMediaImageDTO.class, m11, "productMediaImage");
        this.nullableProductPriceDTOAdapter = moshi.f(ProductPriceDTO.class, m11, "productPrice");
        this.nullableProductCounterDtoAdapter = moshi.f(ProductCounterDto.class, m11, "productCounter");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "subtitle");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "disableSeparator");
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(ProductDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        CheckBoxDTO checkBoxDTO = null;
        ProductImageDTO productImageDTO = null;
        ProductMediaImageDTO productMediaImageDTO = null;
        ProductPriceDTO productPriceDTO = null;
        ProductCounterDto productCounterDto = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        BadgeDTO badgeDTO = null;
        CommonControlSettings commonControlSettings = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    checkBoxDTO = this.nullableCheckBoxDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    productImageDTO = this.nullableProductImageDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    productMediaImageDTO = this.nullableProductMediaImageDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    productPriceDTO = this.nullableProductPriceDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    productCounterDto = this.nullableProductCounterDtoAdapter.fromJson(reader);
                    break;
                case 5:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 6:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 9:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("disableSeparator", "disableSeparator", reader);
                    }
                    i11 = -513;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -513) {
            if (textDTO != null) {
                return new ProductDTO(checkBoxDTO, productImageDTO, productMediaImageDTO, productPriceDTO, productCounterDto, textDTO, textDTO2, badgeDTO, commonControlSettings, bool2.booleanValue(), null, null, 3072, null);
            }
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        Constructor<ProductDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ProductDTO.class.getDeclaredConstructor(CheckBoxDTO.class, ProductImageDTO.class, ProductMediaImageDTO.class, ProductPriceDTO.class, ProductCounterDto.class, TextDTO.class, TextDTO.class, BadgeDTO.class, CommonControlSettings.class, Boolean.TYPE, String.class, VerticalPadding.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (textDTO == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        ProductDTO newInstance = constructor.newInstance(checkBoxDTO, productImageDTO, productMediaImageDTO, productPriceDTO, productCounterDto, textDTO, textDTO2, badgeDTO, commonControlSettings, bool2, null, null, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("checkbox");
        this.nullableCheckBoxDTOAdapter.mo44toJson(writer, (x) value.getCheckbox());
        writer.w("productImage");
        this.nullableProductImageDTOAdapter.mo44toJson(writer, (x) value.getProductImage());
        writer.w("productMediaImage");
        this.nullableProductMediaImageDTOAdapter.mo44toJson(writer, (x) value.getProductMediaImage());
        writer.w("productPrice");
        this.nullableProductPriceDTOAdapter.mo44toJson(writer, (x) value.getProductPrice());
        writer.w("productCounter");
        this.nullableProductCounterDtoAdapter.mo44toJson(writer, (x) value.getProductCounter());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("disableSeparator");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getDisableSeparator()));
        writer.p();
    }
}
