package ru.ozon.app.android.ads.widgets.advVideoBannerV2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.common.pixel.data.PixelDTO;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019¨\u0006."}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$VideoDTO;", "videoDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/ads/common/pixel/data/PixelDTO;", "nullableListOfPixelDTOAdapter", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$InternalProductDTO;", "nullableInternalProductDTOAdapter", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$ExternalProductDTO;", "nullableExternalProductDTOAdapter", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/ProductType;", "productTypeAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTOAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "", "nullableBooleanAdapter", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$PackshotOptions;", "nullablePackshotOptionsAdapter", "nullableStringAdapter", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$DesignOptions;", "nullableDesignOptionsAdapter", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2DTOJsonAdapter extends JsonAdapter<AdvVideoBannerV2DTO> {

    @NotNull
    private final JsonAdapter<BadgeDTO> badgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<AdvVideoBannerV2DTO.DesignOptions> nullableDesignOptionsAdapter;

    @NotNull
    private final JsonAdapter<AdvVideoBannerV2DTO.ExternalProductDTO> nullableExternalProductDTOAdapter;

    @NotNull
    private final JsonAdapter<AdvVideoBannerV2DTO.InternalProductDTO> nullableInternalProductDTOAdapter;

    @NotNull
    private final JsonAdapter<List<PixelDTO>> nullableListOfPixelDTOAdapter;

    @NotNull
    private final JsonAdapter<AdvVideoBannerV2DTO.PackshotOptions> nullablePackshotOptionsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ProductType> productTypeAdapter;

    @NotNull
    private final JsonAdapter<AdvVideoBannerV2DTO.VideoDTO> videoDTOAdapter;

    public AdvVideoBannerV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("video", "pixel", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "externalProduct", "productType", "badgeV2", "legalInformation", "videoCoverDisabled", "disableOverlayDisclaimer", "packshotOptions", "backgroundColor", "designOptions");
        M m11 = M.f71699a;
        this.videoDTOAdapter = moshi.f(AdvVideoBannerV2DTO.VideoDTO.class, m11, "video");
        this.nullableListOfPixelDTOAdapter = moshi.f(D.e(List.class, PixelDTO.class), m11, "pixel");
        this.nullableInternalProductDTOAdapter = moshi.f(AdvVideoBannerV2DTO.InternalProductDTO.class, m11, ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME);
        this.nullableExternalProductDTOAdapter = moshi.f(AdvVideoBannerV2DTO.ExternalProductDTO.class, m11, "externalProduct");
        this.productTypeAdapter = moshi.f(ProductType.class, m11, "productType");
        this.badgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badgeV2");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "legalInformation");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "videoCoverDisabled");
        this.nullablePackshotOptionsAdapter = moshi.f(AdvVideoBannerV2DTO.PackshotOptions.class, m11, "packshotOptions");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableDesignOptionsAdapter = moshi.f(AdvVideoBannerV2DTO.DesignOptions.class, m11, "designOptions");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(AdvVideoBannerV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AdvVideoBannerV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        AdvVideoBannerV2DTO.VideoDTO videoDTO = null;
        List<PixelDTO> list = null;
        AdvVideoBannerV2DTO.InternalProductDTO internalProductDTO = null;
        AdvVideoBannerV2DTO.ExternalProductDTO externalProductDTO = null;
        ProductType productType = null;
        BadgeDTO badgeDTO = null;
        TextAtom textAtom = null;
        Boolean bool = null;
        Boolean bool2 = null;
        AdvVideoBannerV2DTO.PackshotOptions packshotOptions = null;
        String str = null;
        AdvVideoBannerV2DTO.DesignOptions designOptions = null;
        while (true) {
            AdvVideoBannerV2DTO.VideoDTO videoDTO2 = videoDTO;
            if (!reader.hasNext()) {
                List<PixelDTO> list2 = list;
                reader.endObject();
                if (videoDTO2 == null) {
                    throw c.j("video", "video", reader);
                }
                if (productType == null) {
                    throw c.j("productType", "productType", reader);
                }
                if (badgeDTO != null) {
                    return new AdvVideoBannerV2DTO(videoDTO2, list2, internalProductDTO, externalProductDTO, productType, badgeDTO, textAtom, bool, bool2, packshotOptions, str, designOptions);
                }
                throw c.j("badgeV2", "badgeV2", reader);
            }
            List<PixelDTO> list3 = list;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    list = list3;
                    videoDTO = videoDTO2;
                case 0:
                    videoDTO = this.videoDTOAdapter.fromJson(reader);
                    if (videoDTO == null) {
                        throw c.q("video", "video", reader);
                    }
                    list = list3;
                case 1:
                    list = this.nullableListOfPixelDTOAdapter.fromJson(reader);
                    videoDTO = videoDTO2;
                case 2:
                    internalProductDTO = this.nullableInternalProductDTOAdapter.fromJson(reader);
                    list = list3;
                    videoDTO = videoDTO2;
                case 3:
                    externalProductDTO = this.nullableExternalProductDTOAdapter.fromJson(reader);
                    list = list3;
                    videoDTO = videoDTO2;
                case 4:
                    productType = this.productTypeAdapter.fromJson(reader);
                    if (productType == null) {
                        throw c.q("productType", "productType", reader);
                    }
                    list = list3;
                    videoDTO = videoDTO2;
                case 5:
                    badgeDTO = this.badgeDTOAdapter.fromJson(reader);
                    if (badgeDTO == null) {
                        throw c.q("badgeV2", "badgeV2", reader);
                    }
                    list = list3;
                    videoDTO = videoDTO2;
                case 6:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    list = list3;
                    videoDTO = videoDTO2;
                case 7:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    list = list3;
                    videoDTO = videoDTO2;
                case 8:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    list = list3;
                    videoDTO = videoDTO2;
                case 9:
                    packshotOptions = this.nullablePackshotOptionsAdapter.fromJson(reader);
                    list = list3;
                    videoDTO = videoDTO2;
                case 10:
                    str = this.nullableStringAdapter.fromJson(reader);
                    list = list3;
                    videoDTO = videoDTO2;
                case 11:
                    designOptions = this.nullableDesignOptionsAdapter.fromJson(reader);
                    list = list3;
                    videoDTO = videoDTO2;
                default:
                    list = list3;
                    videoDTO = videoDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AdvVideoBannerV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("video");
        this.videoDTOAdapter.mo44toJson(writer, (x) value.getVideo());
        writer.w("pixel");
        this.nullableListOfPixelDTOAdapter.mo44toJson(writer, (x) value.getPixel());
        writer.w(ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME);
        this.nullableInternalProductDTOAdapter.mo44toJson(writer, (x) value.getProduct());
        writer.w("externalProduct");
        this.nullableExternalProductDTOAdapter.mo44toJson(writer, (x) value.getExternalProduct());
        writer.w("productType");
        this.productTypeAdapter.mo44toJson(writer, (x) value.getProductType());
        writer.w("badgeV2");
        this.badgeDTOAdapter.mo44toJson(writer, (x) value.getBadgeV2());
        writer.w("legalInformation");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getLegalInformation());
        writer.w("videoCoverDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getVideoCoverDisabled());
        writer.w("disableOverlayDisclaimer");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getDisableOverlayDisclaimer());
        writer.w("packshotOptions");
        this.nullablePackshotOptionsAdapter.mo44toJson(writer, (x) value.getPackshotOptions());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("designOptions");
        this.nullableDesignOptionsAdapter.mo44toJson(writer, (x) value.getDesignOptions());
        writer.p();
    }
}
