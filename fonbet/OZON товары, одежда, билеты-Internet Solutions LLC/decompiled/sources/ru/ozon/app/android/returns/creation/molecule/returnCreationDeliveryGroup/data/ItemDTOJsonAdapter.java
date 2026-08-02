package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data;

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
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelector;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019¨\u0006-"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/ItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/ItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/ItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/ItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "rmsCheckboxAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "nullableRmsQuantitySelectorAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "nullableIconButtonDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "imageDTOAdapter", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ItemDTOJsonAdapter extends JsonAdapter<ItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<IconButtonDTO> nullableIconButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<RmsQuantitySelector> nullableRmsQuantitySelectorAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO> priceDTOAdapter;

    @NotNull
    private final JsonAdapter<RmsCheckbox> rmsCheckboxAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("checkbox", "price", AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "dueDate", "quantitySelector", "badge", "crossButton", "common", "button", "isDisabled", "itemImage", "sealBadge");
        M m11 = M.f71699a;
        this.rmsCheckboxAdapter = moshi.f(RmsCheckbox.class, m11, "checkbox");
        this.priceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "description");
        this.nullableRmsQuantitySelectorAdapter = moshi.f(RmsQuantitySelector.class, m11, "quantitySelector");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableIconButtonDTOAdapter = moshi.f(IconButtonDTO.class, m11, "crossButton");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "button");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isDisabled");
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "itemImage");
    }

    @NotNull
    public String toString() {
        return b.c(29, "GeneratedJsonAdapter(ItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        RmsCheckbox rmsCheckbox = null;
        PriceDTO priceDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        RmsQuantitySelector rmsQuantitySelector = null;
        BadgeDTO badgeDTO = null;
        IconButtonDTO iconButtonDTO = null;
        CommonControlSettings commonControlSettings = null;
        ButtonV3DTO buttonV3DTO = null;
        Boolean bool = null;
        ImageDTO imageDTO = null;
        BadgeDTO badgeDTO2 = null;
        while (true) {
            RmsCheckbox rmsCheckbox2 = rmsCheckbox;
            PriceDTO priceDTO2 = priceDTO;
            if (!reader.hasNext()) {
                TextDTO textDTO4 = textDTO;
                reader.endObject();
                if (rmsCheckbox2 == null) {
                    throw c.j("checkbox", "checkbox", reader);
                }
                if (priceDTO2 == null) {
                    throw c.j("price", "price", reader);
                }
                if (textDTO4 == null) {
                    throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                }
                if (imageDTO != null) {
                    return new ItemDTO(rmsCheckbox2, priceDTO2, textDTO4, textDTO2, textDTO3, rmsQuantitySelector, badgeDTO, iconButtonDTO, commonControlSettings, buttonV3DTO, bool, imageDTO, badgeDTO2);
                }
                throw c.j("itemImage", "itemImage", reader);
            }
            TextDTO textDTO5 = textDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    textDTO = textDTO5;
                    rmsCheckbox = rmsCheckbox2;
                    priceDTO = priceDTO2;
                case 0:
                    rmsCheckbox = this.rmsCheckboxAdapter.fromJson(reader);
                    if (rmsCheckbox == null) {
                        throw c.q("checkbox", "checkbox", reader);
                    }
                    textDTO = textDTO5;
                    priceDTO = priceDTO2;
                case 1:
                    priceDTO = this.priceDTOAdapter.fromJson(reader);
                    if (priceDTO == null) {
                        throw c.q("price", "price", reader);
                    }
                    textDTO = textDTO5;
                    rmsCheckbox = rmsCheckbox2;
                case 2:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    rmsCheckbox = rmsCheckbox2;
                    priceDTO = priceDTO2;
                case 3:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    textDTO = textDTO5;
                    rmsCheckbox = rmsCheckbox2;
                    priceDTO = priceDTO2;
                case 4:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    textDTO = textDTO5;
                    rmsCheckbox = rmsCheckbox2;
                    priceDTO = priceDTO2;
                case 5:
                    rmsQuantitySelector = this.nullableRmsQuantitySelectorAdapter.fromJson(reader);
                    textDTO = textDTO5;
                    rmsCheckbox = rmsCheckbox2;
                    priceDTO = priceDTO2;
                case 6:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    textDTO = textDTO5;
                    rmsCheckbox = rmsCheckbox2;
                    priceDTO = priceDTO2;
                case 7:
                    iconButtonDTO = this.nullableIconButtonDTOAdapter.fromJson(reader);
                    textDTO = textDTO5;
                    rmsCheckbox = rmsCheckbox2;
                    priceDTO = priceDTO2;
                case 8:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    textDTO = textDTO5;
                    rmsCheckbox = rmsCheckbox2;
                    priceDTO = priceDTO2;
                case 9:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    textDTO = textDTO5;
                    rmsCheckbox = rmsCheckbox2;
                    priceDTO = priceDTO2;
                case 10:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    textDTO = textDTO5;
                    rmsCheckbox = rmsCheckbox2;
                    priceDTO = priceDTO2;
                case 11:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("itemImage", "itemImage", reader);
                    }
                    textDTO = textDTO5;
                    rmsCheckbox = rmsCheckbox2;
                    priceDTO = priceDTO2;
                case 12:
                    badgeDTO2 = this.nullableBadgeDTOAdapter.fromJson(reader);
                    textDTO = textDTO5;
                    rmsCheckbox = rmsCheckbox2;
                    priceDTO = priceDTO2;
                default:
                    textDTO = textDTO5;
                    rmsCheckbox = rmsCheckbox2;
                    priceDTO = priceDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("checkbox");
        this.rmsCheckboxAdapter.mo44toJson(writer, (x) value.getCheckbox());
        writer.w("price");
        this.priceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getName());
        writer.w("description");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("dueDate");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getDueDate());
        writer.w("quantitySelector");
        this.nullableRmsQuantitySelectorAdapter.mo44toJson(writer, (x) value.getQuantitySelector());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("crossButton");
        this.nullableIconButtonDTOAdapter.mo44toJson(writer, (x) value.getCrossButton());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("button");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("isDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isDisabled());
        writer.w("itemImage");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getItemImage());
        writer.w("sealBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getSealBadge());
        writer.p();
    }
}
