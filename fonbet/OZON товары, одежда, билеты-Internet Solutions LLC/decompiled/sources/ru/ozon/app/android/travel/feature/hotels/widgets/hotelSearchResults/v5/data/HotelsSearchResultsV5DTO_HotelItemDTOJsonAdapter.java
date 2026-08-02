package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data;

import Ak.b;
import B0.A0;
import C.C2702w;
import Fj.c;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO;
import ru.ozon.app.android.travel.molecules.dto.awardBadge.AwardBadgeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0018R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0018R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0018R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO_HotelItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "nullablePriceDTOAdapter", "nullableTextDTOAdapter", "listOfBadgeDTOAdapter", "nullableStringAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$ItemHeader;", "nullableItemHeaderAdapter", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "nullableStockBarAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "", "nullableAnyAtProtoOneOfAtProtoOneOfSignatureAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO$HotelItemDTO$CardLayoutVariant;", "cardLayoutVariantAtEnumNullFallbackAdapter", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;", "nullableAwardBadgeDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5DTO_HotelItemDTOJsonAdapter extends JsonAdapter<HotelsSearchResultsV5DTO.HotelItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant> cardLayoutVariantAtEnumNullFallbackAdapter;
    private volatile Constructor<HotelsSearchResultsV5DTO.HotelItemDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> listOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final JsonAdapter<Object> nullableAnyAtProtoOneOfAtProtoOneOfSignatureAdapter;

    @NotNull
    private final JsonAdapter<AwardBadgeDTO> nullableAwardBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<HotelsSearchResultsV5DTO.HotelItemDTO.ItemHeader> nullableItemHeaderAdapter;

    @NotNull
    private final JsonAdapter<PriceDTO> nullablePriceDTOAdapter;

    @NotNull
    private final JsonAdapter<StockBar> nullableStockBarAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public HotelsSearchResultsV5DTO_HotelItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("hotelId", "images", SelectionItemFormDTO.TITLE_FIELD_NAME, FormPageDTO.Field.FIELD_TYPE_ADDRESS, "rating", "mainPrice", "priceDescription", "marketingPrice", "premiumBadge", "imageBadges", "cardBackgroundColor", "marketingHeader", "stockBar", "isShimmerState", "common", "isVisibleCard", "priceErrorMessage", "favoriteButton", "canShowOnboarding", "reviewsIcon", "reviews", "remainingOptions", "layoutVariant", "awardBadge");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "hotelId");
        this.listOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "images");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "rating");
        this.nullablePriceDTOAdapter = moshi.f(PriceDTO.class, m11, "mainPrice");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "priceDescription");
        this.listOfBadgeDTOAdapter = moshi.f(D.e(List.class, BadgeDTO.class), m11, "imageBadges");
        this.nullableStringAdapter = moshi.f(String.class, m11, "cardBackgroundColor");
        this.nullableItemHeaderAdapter = moshi.f(HotelsSearchResultsV5DTO.HotelItemDTO.ItemHeader.class, m11, "marketingHeader");
        this.nullableStockBarAdapter = moshi.f(StockBar.class, m11, "stockBar");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isShimmerState");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        final String str = "type";
        ProtoOneOf protoOneOf = new ProtoOneOf(str) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO_HotelItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
            private final /* synthetic */ String label;

            {
                Intrinsics.checkNotNullParameter(str, "label");
                this.label = str;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOf.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof ProtoOneOf) && Intrinsics.d(label(), ((ProtoOneOf) obj).label());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return this.label.hashCode() ^ 161479436;
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf
            public final /* synthetic */ String label() {
                return this.label;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return A0.b("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf(label=", this.label, ")");
            }
        };
        final d b11 = N.b(FavoriteProductMoleculeV2.class);
        final String str2 = "favoriteProductMoleculeV2";
        final String str3 = "";
        Annotation[] elements = {protoOneOf, new ProtoOneOfSignature(str2, str3, b11) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO_HotelItemDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str2, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b11, "type");
                this.name = str2;
                this.fieldName = str3;
                this.type = C6345a.b(b11);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature.name()) && Intrinsics.d(fieldName(), protoOneOfSignature.fieldName()) && C2702w.f(protoOneOfSignature, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str4 = this.name;
                String str5 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str4, ", fieldName=", str5, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.nullableAnyAtProtoOneOfAtProtoOneOfSignatureAdapter = moshi.f(Object.class, C7705l.j0(elements), "favoriteButton");
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "reviewsIcon");
        this.cardLayoutVariantAtEnumNullFallbackAdapter = moshi.f(HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO_HotelItemDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        }), "layoutVariant");
        this.nullableAwardBadgeDTOAdapter = moshi.f(AwardBadgeDTO.class, m11, "awardBadge");
    }

    @NotNull
    public String toString() {
        return b.c(59, "GeneratedJsonAdapter(HotelsSearchResultsV5DTO.HotelItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsSearchResultsV5DTO.HotelItemDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant cardLayoutVariant = null;
        int i12 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        String str = null;
        List<String> list = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        BadgeDTO badgeDTO = null;
        List<BadgeDTO> list2 = null;
        String str2 = null;
        HotelsSearchResultsV5DTO.HotelItemDTO.ItemHeader itemHeader = null;
        StockBar stockBar = null;
        Boolean bool4 = null;
        CommonControlSettings commonControlSettings = null;
        TextDTO textDTO3 = null;
        Object obj = null;
        IconDTO iconDTO = null;
        TextDTO textDTO4 = null;
        PriceDTO priceDTO = null;
        TextDTO textDTO5 = null;
        PriceDTO priceDTO2 = null;
        BadgeDTO badgeDTO2 = null;
        TextDTO textDTO6 = null;
        AwardBadgeDTO awardBadgeDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    continue;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q("hotelId", "hotelId", reader);
                    }
                    continue;
                case 1:
                    list = this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        throw Y9.c.q("images", "images", reader);
                    }
                    i12 &= -3;
                    continue;
                case 2:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    continue;
                case 3:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw Y9.c.q(FormPageDTO.Field.FIELD_TYPE_ADDRESS, FormPageDTO.Field.FIELD_TYPE_ADDRESS, reader);
                    }
                    continue;
                case 4:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    continue;
                case 5:
                    priceDTO = this.nullablePriceDTOAdapter.fromJson(reader);
                    continue;
                case 6:
                    textDTO5 = this.nullableTextDTOAdapter.fromJson(reader);
                    continue;
                case 7:
                    priceDTO2 = this.nullablePriceDTOAdapter.fromJson(reader);
                    continue;
                case 8:
                    badgeDTO2 = this.nullableBadgeDTOAdapter.fromJson(reader);
                    continue;
                case 9:
                    list2 = this.listOfBadgeDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw Y9.c.q("imageBadges", "imageBadges", reader);
                    }
                    i12 &= -513;
                    continue;
                case 10:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    continue;
                case 11:
                    itemHeader = this.nullableItemHeaderAdapter.fromJson(reader);
                    continue;
                case 12:
                    stockBar = this.nullableStockBarAdapter.fromJson(reader);
                    continue;
                case 13:
                    bool4 = this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw Y9.c.q("isShimmerState", "isShimmerState", reader);
                    }
                    continue;
                case 14:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    continue;
                case 15:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw Y9.c.q("isVisibleCard", "isVisibleCard", reader);
                    }
                    i11 = -32769;
                    break;
                case 16:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    continue;
                case 17:
                    obj = this.nullableAnyAtProtoOneOfAtProtoOneOfSignatureAdapter.fromJson(reader);
                    continue;
                case 18:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw Y9.c.q("canShowOnboarding", "canShowOnboarding", reader);
                    }
                    i11 = -262145;
                    break;
                case 19:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    continue;
                case 20:
                    textDTO4 = this.nullableTextDTOAdapter.fromJson(reader);
                    continue;
                case 21:
                    textDTO6 = this.nullableTextDTOAdapter.fromJson(reader);
                    continue;
                case 22:
                    cardLayoutVariant = this.cardLayoutVariantAtEnumNullFallbackAdapter.fromJson(reader);
                    if (cardLayoutVariant == null) {
                        throw Y9.c.q("layoutVariant", "layoutVariant", reader);
                    }
                    i11 = -4194305;
                    break;
                case 23:
                    awardBadgeDTO = this.nullableAwardBadgeDTOAdapter.fromJson(reader);
                    continue;
            }
            i12 &= i11;
        }
        reader.endObject();
        if (i12 != -4489731) {
            HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant cardLayoutVariant2 = cardLayoutVariant;
            IconDTO iconDTO2 = iconDTO;
            Constructor<HotelsSearchResultsV5DTO.HotelItemDTO> constructor = this.constructorRef;
            if (constructor == null) {
                Class<?> cls = Y9.c.f34864d;
                Class cls2 = Boolean.TYPE;
                constructor = HotelsSearchResultsV5DTO.HotelItemDTO.class.getDeclaredConstructor(String.class, List.class, TextDTO.class, TextDTO.class, BadgeDTO.class, PriceDTO.class, TextDTO.class, PriceDTO.class, BadgeDTO.class, List.class, String.class, HotelsSearchResultsV5DTO.HotelItemDTO.ItemHeader.class, StockBar.class, cls2, CommonControlSettings.class, cls2, TextDTO.class, Object.class, cls2, IconDTO.class, TextDTO.class, TextDTO.class, HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant.class, AwardBadgeDTO.class, Integer.TYPE, cls);
                this.constructorRef = constructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            if (str == null) {
                throw Y9.c.j("hotelId", "hotelId", reader);
            }
            if (textDTO == null) {
                throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (textDTO2 == null) {
                throw Y9.c.j(FormPageDTO.Field.FIELD_TYPE_ADDRESS, FormPageDTO.Field.FIELD_TYPE_ADDRESS, reader);
            }
            if (bool4 == null) {
                throw Y9.c.j("isShimmerState", "isShimmerState", reader);
            }
            HotelsSearchResultsV5DTO.HotelItemDTO newInstance = constructor.newInstance(str, list, textDTO, textDTO2, badgeDTO, priceDTO, textDTO5, priceDTO2, badgeDTO2, list2, str2, itemHeader, stockBar, bool4, commonControlSettings, bool2, textDTO3, obj, bool3, iconDTO2, textDTO4, textDTO6, cardLayoutVariant2, awardBadgeDTO, Integer.valueOf(i12), null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        IconDTO iconDTO3 = iconDTO;
        if (str == null) {
            throw Y9.c.j("hotelId", "hotelId", reader);
        }
        Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        if (textDTO == null) {
            throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (textDTO2 == null) {
            throw Y9.c.j(FormPageDTO.Field.FIELD_TYPE_ADDRESS, FormPageDTO.Field.FIELD_TYPE_ADDRESS, reader);
        }
        Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.dsBadge.BadgeDTO>");
        if (bool4 == null) {
            throw Y9.c.j("isShimmerState", "isShimmerState", reader);
        }
        boolean booleanValue = bool4.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        boolean booleanValue3 = bool3.booleanValue();
        Intrinsics.g(cardLayoutVariant, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO.HotelItemDTO.CardLayoutVariant");
        return new HotelsSearchResultsV5DTO.HotelItemDTO(str, list, textDTO, textDTO2, badgeDTO, priceDTO, textDTO5, priceDTO2, badgeDTO2, list2, str2, itemHeader, stockBar, booleanValue, commonControlSettings, booleanValue2, textDTO3, obj, booleanValue3, iconDTO3, textDTO4, textDTO6, cardLayoutVariant, awardBadgeDTO);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsSearchResultsV5DTO.HotelItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("hotelId");
        this.stringAdapter.mo44toJson(writer, (x) value.getHotelId());
        writer.w("images");
        this.listOfStringAdapter.mo44toJson(writer, (x) value.getImages());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getAddress());
        writer.w("rating");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getRating());
        writer.w("mainPrice");
        this.nullablePriceDTOAdapter.mo44toJson(writer, (x) value.getMainPrice());
        writer.w("priceDescription");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getPriceDescription());
        writer.w("marketingPrice");
        this.nullablePriceDTOAdapter.mo44toJson(writer, (x) value.getMarketingPrice());
        writer.w("premiumBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getPremiumBadge());
        writer.w("imageBadges");
        this.listOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getImageBadges());
        writer.w("cardBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getCardBackgroundColor());
        writer.w("marketingHeader");
        this.nullableItemHeaderAdapter.mo44toJson(writer, (x) value.getMarketingHeader());
        writer.w("stockBar");
        this.nullableStockBarAdapter.mo44toJson(writer, (x) value.getStockBar());
        writer.w("isShimmerState");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isShimmerState()));
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("isVisibleCard");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isVisibleCard()));
        writer.w("priceErrorMessage");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getPriceErrorMessage());
        writer.w("favoriteButton");
        this.nullableAnyAtProtoOneOfAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getFavoriteButton());
        writer.w("canShowOnboarding");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getCanShowOnboarding()));
        writer.w("reviewsIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getReviewsIcon());
        writer.w("reviews");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getReviews());
        writer.w("remainingOptions");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getRemainingOptions());
        writer.w("layoutVariant");
        this.cardLayoutVariantAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getLayoutVariant());
        writer.w("awardBadge");
        this.nullableAwardBadgeDTOAdapter.mo44toJson(writer, (x) value.getAwardBadge());
        writer.p();
    }
}
