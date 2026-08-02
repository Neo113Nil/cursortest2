package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.data;

import Ak.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.data.ComposableImageDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "nullableImageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "nullableProductMediaDTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "nullableStringAdapter", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO$Border;", "nullableBorderAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableImageDTOJsonAdapter extends JsonAdapter<ComposableImageDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ComposableImageDTO> constructorRef;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ComposableImageDTO.Border> nullableBorderAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<ProductMediaDTO> nullableProductMediaDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public ComposableImageDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", "productMedia", "counter", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "isTranslucent", "badge", "blurImageUrl", "border", "common");
        M m11 = M.f71699a;
        this.nullableImageDTOAdapter = moshi.f(ImageDTO.class, m11, "image");
        this.nullableProductMediaDTOAdapter = moshi.f(ProductMediaDTO.class, m11, "productMedia");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "counter");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableStringAdapter = moshi.f(String.class, m11, "blurImageUrl");
        this.nullableBorderAdapter = moshi.f(ComposableImageDTO.Border.class, m11, "border");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(ComposableImageDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ComposableImageDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ImageDTO imageDTO = null;
        ProductMediaDTO productMediaDTO = null;
        TextDTO textDTO = null;
        Boolean bool = null;
        Boolean bool2 = null;
        BadgeDTO badgeDTO = null;
        String str = null;
        ComposableImageDTO.Border border = null;
        CommonControlSettings commonControlSettings = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    productMediaDTO = this.nullableProductMediaDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 4:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 5:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    border = this.nullableBorderAdapter.fromJson(reader);
                    break;
                case 8:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new ComposableImageDTO(imageDTO, productMediaDTO, textDTO, bool, bool2, badgeDTO, str, border, commonControlSettings, null, UserVerificationMethods.USER_VERIFY_NONE, null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ComposableImageDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("productMedia");
        this.nullableProductMediaDTOAdapter.mo44toJson(writer, (x) value.getProductMedia());
        writer.w("counter");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getCounter());
        writer.w(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isAdult());
        writer.w("isTranslucent");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isTranslucent());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("blurImageUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBlurImageUrl());
        writer.w("border");
        this.nullableBorderAdapter.mo44toJson(writer, (x) value.getBorder());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.p();
    }
}
