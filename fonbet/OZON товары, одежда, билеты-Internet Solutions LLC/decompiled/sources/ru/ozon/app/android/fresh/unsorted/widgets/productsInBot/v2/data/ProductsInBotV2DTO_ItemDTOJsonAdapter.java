package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.data;

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
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.data.ProductsInBotV2DTO;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelector;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/data/ProductsInBotV2DTO_ItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/data/ProductsInBotV2DTO$ItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/data/ProductsInBotV2DTO$ItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/data/ProductsInBotV2DTO$ItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "rmsCheckboxAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "nullableRmsQuantitySelectorAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "", "nullableBooleanAdapter", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductsInBotV2DTO_ItemDTOJsonAdapter extends JsonAdapter<ProductsInBotV2DTO.ItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<RmsQuantitySelector> nullableRmsQuantitySelectorAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO> priceDTOAdapter;

    @NotNull
    private final JsonAdapter<RmsCheckbox> rmsCheckboxAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ProductsInBotV2DTO_ItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("checkbox", "skuId", "image", "privateIcon", "price", AppMeasurementSdk.ConditionalUserProperty.NAME, "quantitySelector", "maxQuantity", "badge", "common", "isDisabled");
        M m11 = M.f71699a;
        this.rmsCheckboxAdapter = moshi.f(RmsCheckbox.class, m11, "checkbox");
        this.stringAdapter = moshi.f(String.class, m11, "skuId");
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "image");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "privateIcon");
        this.priceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableRmsQuantitySelectorAdapter = moshi.f(RmsQuantitySelector.class, m11, "quantitySelector");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "maxQuantity");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isDisabled");
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(ProductsInBotV2DTO.ItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductsInBotV2DTO.ItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        RmsCheckbox rmsCheckbox = null;
        String str = null;
        IconDTO iconDTO = null;
        IconDTO iconDTO2 = null;
        PriceDTO priceDTO = null;
        TextDTO textDTO = null;
        RmsQuantitySelector rmsQuantitySelector = null;
        Integer num = null;
        BadgeDTO badgeDTO = null;
        CommonControlSettings commonControlSettings = null;
        Boolean bool = null;
        while (true) {
            RmsCheckbox rmsCheckbox2 = rmsCheckbox;
            String str2 = str;
            if (!reader.hasNext()) {
                IconDTO iconDTO3 = iconDTO;
                reader.endObject();
                if (rmsCheckbox2 == null) {
                    throw c.j("checkbox", "checkbox", reader);
                }
                if (str2 == null) {
                    throw c.j("skuId", "skuId", reader);
                }
                if (iconDTO3 == null) {
                    throw c.j("image", "image", reader);
                }
                if (priceDTO == null) {
                    throw c.j("price", "price", reader);
                }
                if (textDTO != null) {
                    return new ProductsInBotV2DTO.ItemDTO(rmsCheckbox2, str2, iconDTO3, iconDTO2, priceDTO, textDTO, rmsQuantitySelector, num, badgeDTO, commonControlSettings, bool);
                }
                throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
            }
            IconDTO iconDTO4 = iconDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    iconDTO = iconDTO4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 0:
                    rmsCheckbox = this.rmsCheckboxAdapter.fromJson(reader);
                    if (rmsCheckbox == null) {
                        throw c.q("checkbox", "checkbox", reader);
                    }
                    iconDTO = iconDTO4;
                    str = str2;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("skuId", "skuId", reader);
                    }
                    iconDTO = iconDTO4;
                    rmsCheckbox = rmsCheckbox2;
                case 2:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("image", "image", reader);
                    }
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 3:
                    iconDTO2 = this.nullableIconDTOAdapter.fromJson(reader);
                    iconDTO = iconDTO4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 4:
                    priceDTO = this.priceDTOAdapter.fromJson(reader);
                    if (priceDTO == null) {
                        throw c.q("price", "price", reader);
                    }
                    iconDTO = iconDTO4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 5:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    iconDTO = iconDTO4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 6:
                    rmsQuantitySelector = this.nullableRmsQuantitySelectorAdapter.fromJson(reader);
                    iconDTO = iconDTO4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 7:
                    num = this.nullableIntAdapter.fromJson(reader);
                    iconDTO = iconDTO4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 8:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    iconDTO = iconDTO4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 9:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    iconDTO = iconDTO4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                case 10:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    iconDTO = iconDTO4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
                default:
                    iconDTO = iconDTO4;
                    rmsCheckbox = rmsCheckbox2;
                    str = str2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductsInBotV2DTO.ItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("checkbox");
        this.rmsCheckboxAdapter.mo44toJson(writer, (x) value.getCheckbox());
        writer.w("skuId");
        this.stringAdapter.mo44toJson(writer, (x) value.getSkuId());
        writer.w("image");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("privateIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getPrivateIcon());
        writer.w("price");
        this.priceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getName());
        writer.w("quantitySelector");
        this.nullableRmsQuantitySelectorAdapter.mo44toJson(writer, (x) value.getQuantitySelector());
        writer.w("maxQuantity");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMaxQuantity());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("isDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isDisabled());
        writer.p();
    }
}
