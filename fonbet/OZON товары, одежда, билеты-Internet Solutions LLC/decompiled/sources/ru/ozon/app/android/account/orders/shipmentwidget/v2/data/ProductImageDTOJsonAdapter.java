package ru.ozon.app.android.account.orders.shipmentwidget.v2.data;

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
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductImageDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductImageDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductImageDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductImageDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "imageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "nullablePriceDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductImageDTOJsonAdapter extends JsonAdapter<ProductImageDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ProductImageDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<PriceDTO> nullablePriceDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public ProductImageDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", "topCornerRadius", "badgeStatus", "price", "priceBadge", "caption", "captionCommon");
        M m11 = M.f71699a;
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "image");
        this.cornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "topCornerRadius");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badgeStatus");
        this.nullablePriceDTOAdapter = moshi.f(PriceDTO.class, m11, "price");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "caption");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "captionCommon");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(ProductImageDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductImageDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        ImageDTO imageDTO = null;
        CornerRadius cornerRadius = null;
        BadgeDTO badgeDTO = null;
        PriceDTO priceDTO = null;
        BadgeDTO badgeDTO2 = null;
        TextDTO textDTO = null;
        CommonControlSettings commonControlSettings = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("image", "image", reader);
                    }
                    break;
                case 1:
                    cornerRadius = this.cornerRadiusAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw c.q("topCornerRadius", "topCornerRadius", reader);
                    }
                    i11 = -3;
                    break;
                case 2:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    priceDTO = this.nullablePriceDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    badgeDTO2 = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -3) {
            ImageDTO imageDTO2 = imageDTO;
            if (imageDTO2 == null) {
                throw c.j("image", "image", reader);
            }
            Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            TextDTO textDTO2 = textDTO;
            BadgeDTO badgeDTO3 = badgeDTO2;
            return new ProductImageDTO(imageDTO2, cornerRadius, badgeDTO, priceDTO, badgeDTO3, textDTO2, commonControlSettings2);
        }
        ImageDTO imageDTO3 = imageDTO;
        Constructor<ProductImageDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ProductImageDTO.class.getDeclaredConstructor(ImageDTO.class, CornerRadius.class, BadgeDTO.class, PriceDTO.class, BadgeDTO.class, TextDTO.class, CommonControlSettings.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<ProductImageDTO> constructor2 = constructor;
        if (imageDTO3 == null) {
            throw c.j("image", "image", reader);
        }
        ProductImageDTO newInstance = constructor2.newInstance(imageDTO3, cornerRadius, badgeDTO, priceDTO, badgeDTO2, textDTO, commonControlSettings, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductImageDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("topCornerRadius");
        this.cornerRadiusAdapter.mo44toJson(writer, (x) value.getTopCornerRadius());
        writer.w("badgeStatus");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadgeStatus());
        writer.w("price");
        this.nullablePriceDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("priceBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getPriceBadge());
        writer.w("caption");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getCaption());
        writer.w("captionCommon");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCaptionCommon());
        writer.p();
    }
}
