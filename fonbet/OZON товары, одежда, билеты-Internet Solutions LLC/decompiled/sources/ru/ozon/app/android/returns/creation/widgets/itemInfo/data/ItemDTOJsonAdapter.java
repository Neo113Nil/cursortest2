package ru.ozon.app.android.returns.creation.widgets.itemInfo.data;

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
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelector;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "nullableImageDTOAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "priceDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "nullableRmsQuantitySelectorAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "nullableStringAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ItemDTOJsonAdapter extends JsonAdapter<ItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ItemDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<RmsQuantitySelector> nullableRmsQuantitySelectorAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PriceDTO> priceDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", "csmaImage", "price", AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "quantitySelector", "common", "validationText", "deleteButton", "annotation", "backgroundColor", "isSticky");
        M m11 = M.f71699a;
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "image");
        this.nullableImageDTOAdapter = moshi.f(ImageDTO.class, m11, "csmaImage");
        this.priceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "description");
        this.nullableRmsQuantitySelectorAdapter = moshi.f(RmsQuantitySelector.class, m11, "quantitySelector");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "deleteButton");
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, "annotation");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSticky");
    }

    @NotNull
    public String toString() {
        return b.c(29, "GeneratedJsonAdapter(ItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ItemDTO fromJson(@NotNull n reader) {
        ImageDTO imageDTO;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        ImageDTO imageDTO2 = null;
        Boolean bool2 = bool;
        IconDTO iconDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        RmsQuantitySelector rmsQuantitySelector = null;
        CommonControlSettings commonControlSettings = null;
        TextDTO textDTO3 = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        DisclaimerAtom disclaimerAtom = null;
        String str = null;
        int i11 = -1;
        PriceDTO priceDTO = null;
        while (true) {
            IconDTO iconDTO2 = iconDTO;
            if (!reader.hasNext()) {
                reader.endObject();
                if (i11 == -4084) {
                    if (priceDTO == null) {
                        throw c.j("price", "price", reader);
                    }
                    if (textDTO == null) {
                        throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    return new ItemDTO(iconDTO2, imageDTO2, priceDTO, textDTO, textDTO2, rmsQuantitySelector, commonControlSettings, textDTO3, iconButtonV3DTO, disclaimerAtom, str, bool2.booleanValue());
                }
                Constructor<ItemDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    imageDTO = imageDTO2;
                    constructor = ItemDTO.class.getDeclaredConstructor(IconDTO.class, ImageDTO.class, PriceDTO.class, TextDTO.class, TextDTO.class, RmsQuantitySelector.class, CommonControlSettings.class, TextDTO.class, IconButtonV3DTO.class, DisclaimerAtom.class, String.class, Boolean.TYPE, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    imageDTO = imageDTO2;
                }
                if (priceDTO == null) {
                    throw c.j("price", "price", reader);
                }
                if (textDTO == null) {
                    throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                }
                IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
                RmsQuantitySelector rmsQuantitySelector2 = rmsQuantitySelector;
                PriceDTO priceDTO2 = priceDTO;
                ItemDTO newInstance = constructor.newInstance(iconDTO2, imageDTO, priceDTO2, textDTO, textDTO2, rmsQuantitySelector2, commonControlSettings, textDTO3, iconButtonV3DTO2, disclaimerAtom, str, bool2, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    i11 &= -2;
                    continue;
                case 1:
                    imageDTO2 = this.nullableImageDTOAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    priceDTO = this.priceDTOAdapter.fromJson(reader);
                    if (priceDTO == null) {
                        throw c.q("price", "price", reader);
                    }
                    break;
                case 3:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    break;
                case 4:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    rmsQuantitySelector = this.nullableRmsQuantitySelectorAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isSticky", "isSticky", reader);
                    }
                    i11 &= -2049;
                    break;
            }
            iconDTO = iconDTO2;
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
        writer.w("image");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("csmaImage");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value.getCsmaImage());
        writer.w("price");
        this.priceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getName());
        writer.w("description");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("quantitySelector");
        this.nullableRmsQuantitySelectorAdapter.mo44toJson(writer, (x) value.getQuantitySelector());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("validationText");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getValidationText());
        writer.w("deleteButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getDeleteButton());
        writer.w("annotation");
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getAnnotation());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("isSticky");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSticky()));
        writer.p();
    }
}
