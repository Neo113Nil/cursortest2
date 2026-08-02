package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data;

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
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO;
import ru.ozon.app.android.travel.molecules.dto.awardBadge.AwardBadgeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO_CardStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4DTO$CardStyle$CardLayoutVariant;", "cardLayoutVariantAtEnumNullFallbackAdapter", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO;", "nullableAwardBadgeDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapInfoV4DTO_CardStyleJsonAdapter extends JsonAdapter<HotelsMapInfoV4DTO.CardStyle> {

    @NotNull
    private final JsonAdapter<BadgeDTO> badgeDTOAdapter;

    @NotNull
    private final JsonAdapter<HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant> cardLayoutVariantAtEnumNullFallbackAdapter;
    private volatile Constructor<HotelsMapInfoV4DTO.CardStyle> constructorRef;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<AwardBadgeDTO> nullableAwardBadgeDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public HotelsMapInfoV4DTO_CardStyleJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "ratingBadge", "reviewsIcon", "reviews", "priceText", "milesBadge", "soldOutText", "layoutVariant", "awardBadge");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.badgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "ratingBadge");
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "reviewsIcon");
        this.cardLayoutVariantAtEnumNullFallbackAdapter = moshi.f(HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO_CardStyleJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
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
        return b.c(50, "GeneratedJsonAdapter(HotelsMapInfoV4DTO.CardStyle)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsMapInfoV4DTO.CardStyle fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        TextDTO textDTO = null;
        BadgeDTO badgeDTO = null;
        IconDTO iconDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        BadgeDTO badgeDTO2 = null;
        TextDTO textDTO4 = null;
        HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant cardLayoutVariant = null;
        AwardBadgeDTO awardBadgeDTO = null;
        while (true) {
            TextDTO textDTO5 = textDTO;
            BadgeDTO badgeDTO3 = badgeDTO;
            IconDTO iconDTO2 = iconDTO;
            if (!reader.hasNext()) {
                TextDTO textDTO6 = textDTO2;
                reader.endObject();
                if (i12 == -129) {
                    if (textDTO5 == null) {
                        throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    if (badgeDTO3 == null) {
                        throw c.j("ratingBadge", "ratingBadge", reader);
                    }
                    if (iconDTO2 == null) {
                        throw c.j("reviewsIcon", "reviewsIcon", reader);
                    }
                    if (textDTO6 == null) {
                        throw c.j("reviews", "reviews", reader);
                    }
                    if (textDTO3 == null) {
                        throw c.j("priceText", "priceText", reader);
                    }
                    if (badgeDTO2 == null) {
                        throw c.j("milesBadge", "milesBadge", reader);
                    }
                    if (textDTO4 == null) {
                        throw c.j("soldOutText", "soldOutText", reader);
                    }
                    Intrinsics.g(cardLayoutVariant, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant");
                    AwardBadgeDTO awardBadgeDTO2 = awardBadgeDTO;
                    HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant cardLayoutVariant2 = cardLayoutVariant;
                    return new HotelsMapInfoV4DTO.CardStyle(textDTO5, badgeDTO3, iconDTO2, textDTO6, textDTO3, badgeDTO2, textDTO4, cardLayoutVariant2, awardBadgeDTO2);
                }
                Constructor<HotelsMapInfoV4DTO.CardStyle> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = HotelsMapInfoV4DTO.CardStyle.class.getDeclaredConstructor(TextDTO.class, BadgeDTO.class, IconDTO.class, TextDTO.class, TextDTO.class, BadgeDTO.class, TextDTO.class, HotelsMapInfoV4DTO.CardStyle.CardLayoutVariant.class, AwardBadgeDTO.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<HotelsMapInfoV4DTO.CardStyle> constructor2 = constructor;
                if (textDTO5 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (badgeDTO3 == null) {
                    throw c.j("ratingBadge", "ratingBadge", reader);
                }
                if (iconDTO2 == null) {
                    throw c.j("reviewsIcon", "reviewsIcon", reader);
                }
                if (textDTO6 == null) {
                    throw c.j("reviews", "reviews", reader);
                }
                if (textDTO3 == null) {
                    throw c.j("priceText", "priceText", reader);
                }
                if (badgeDTO2 == null) {
                    throw c.j("milesBadge", "milesBadge", reader);
                }
                if (textDTO4 == null) {
                    throw c.j("soldOutText", "soldOutText", reader);
                }
                HotelsMapInfoV4DTO.CardStyle newInstance = constructor2.newInstance(textDTO5, badgeDTO3, iconDTO2, textDTO6, textDTO3, badgeDTO2, textDTO4, cardLayoutVariant, awardBadgeDTO, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            TextDTO textDTO7 = textDTO2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    textDTO2 = textDTO7;
                    textDTO = textDTO5;
                    badgeDTO = badgeDTO3;
                    iconDTO = iconDTO2;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    textDTO2 = textDTO7;
                    badgeDTO = badgeDTO3;
                    iconDTO = iconDTO2;
                case 1:
                    badgeDTO = this.badgeDTOAdapter.fromJson(reader);
                    if (badgeDTO == null) {
                        throw c.q("ratingBadge", "ratingBadge", reader);
                    }
                    textDTO2 = textDTO7;
                    textDTO = textDTO5;
                    iconDTO = iconDTO2;
                case 2:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("reviewsIcon", "reviewsIcon", reader);
                    }
                    textDTO2 = textDTO7;
                    textDTO = textDTO5;
                    badgeDTO = badgeDTO3;
                case 3:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("reviews", "reviews", reader);
                    }
                    textDTO = textDTO5;
                    badgeDTO = badgeDTO3;
                    iconDTO = iconDTO2;
                case 4:
                    textDTO3 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO3 == null) {
                        throw c.q("priceText", "priceText", reader);
                    }
                    textDTO2 = textDTO7;
                    textDTO = textDTO5;
                    badgeDTO = badgeDTO3;
                    iconDTO = iconDTO2;
                case 5:
                    badgeDTO2 = this.badgeDTOAdapter.fromJson(reader);
                    if (badgeDTO2 == null) {
                        throw c.q("milesBadge", "milesBadge", reader);
                    }
                    textDTO2 = textDTO7;
                    textDTO = textDTO5;
                    badgeDTO = badgeDTO3;
                    iconDTO = iconDTO2;
                case 6:
                    textDTO4 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO4 == null) {
                        throw c.q("soldOutText", "soldOutText", reader);
                    }
                    textDTO2 = textDTO7;
                    textDTO = textDTO5;
                    badgeDTO = badgeDTO3;
                    iconDTO = iconDTO2;
                case 7:
                    cardLayoutVariant = this.cardLayoutVariantAtEnumNullFallbackAdapter.fromJson(reader);
                    if (cardLayoutVariant == null) {
                        throw c.q("layoutVariant", "layoutVariant", reader);
                    }
                    textDTO2 = textDTO7;
                    textDTO = textDTO5;
                    badgeDTO = badgeDTO3;
                    iconDTO = iconDTO2;
                    i12 = -129;
                case 8:
                    awardBadgeDTO = this.nullableAwardBadgeDTOAdapter.fromJson(reader);
                    textDTO2 = textDTO7;
                    textDTO = textDTO5;
                    badgeDTO = badgeDTO3;
                    iconDTO = iconDTO2;
                default:
                    textDTO2 = textDTO7;
                    textDTO = textDTO5;
                    badgeDTO = badgeDTO3;
                    iconDTO = iconDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsMapInfoV4DTO.CardStyle value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("ratingBadge");
        this.badgeDTOAdapter.mo44toJson(writer, (x) value.getRatingBadge());
        writer.w("reviewsIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getReviewsIcon());
        writer.w("reviews");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getReviews());
        writer.w("priceText");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getPriceText());
        writer.w("milesBadge");
        this.badgeDTOAdapter.mo44toJson(writer, (x) value.getMilesBadge());
        writer.w("soldOutText");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSoldOutText());
        writer.w("layoutVariant");
        this.cardLayoutVariantAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getLayoutVariant());
        writer.w("awardBadge");
        this.nullableAwardBadgeDTOAdapter.mo44toJson(writer, (x) value.getAwardBadge());
        writer.p();
    }
}
