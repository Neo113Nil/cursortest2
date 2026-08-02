package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.data;

import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.data.HotelsPageHeaderDTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "listOfBadgeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableBadgeAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "textAtomAdapter", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "nullableLinkButtonDTOAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO$PriceInfo;", "nullablePriceInfoAdapter", "", "booleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageHeaderDTOJsonAdapter extends JsonAdapter<HotelsPageHeaderDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<HotelsPageHeaderDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<Badge>> listOfBadgeAdapter;

    @NotNull
    private final JsonAdapter<Badge> nullableBadgeAdapter;

    @NotNull
    private final JsonAdapter<LinkButtonDTO> nullableLinkButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<HotelsPageHeaderDTO.PriceInfo> nullablePriceInfoAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public HotelsPageHeaderDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("badges", "mirBadge", "stars", SelectionItemFormDTO.TITLE_FIELD_NAME, FormPageDTO.Field.FIELD_TYPE_ADDRESS, "priceInfo", "isPremium", "trackingInfo");
        b e11 = D.e(List.class, Badge.class);
        M m11 = M.f71699a;
        this.listOfBadgeAdapter = moshi.f(e11, m11, "badges");
        this.nullableBadgeAdapter = moshi.f(Badge.class, m11, "mirBadge");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "stars");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableLinkButtonDTOAdapter = moshi.f(LinkButtonDTO.class, m11, FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        this.nullablePriceInfoAdapter = moshi.f(HotelsPageHeaderDTO.PriceInfo.class, m11, "priceInfo");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isPremium");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(41, "GeneratedJsonAdapter(HotelsPageHeaderDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsPageHeaderDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Badge badge = null;
        Boolean bool2 = bool;
        List<Badge> list = null;
        TextAtom textAtom = null;
        LinkButtonDTO linkButtonDTO = null;
        HotelsPageHeaderDTO.PriceInfo priceInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        int i11 = -1;
        TextAtom textAtom2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfBadgeAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("badges", "badges", reader);
                    }
                    i11 &= -2;
                    break;
                case 1:
                    badge = this.nullableBadgeAdapter.fromJson(reader);
                    break;
                case 2:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 3:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 4:
                    linkButtonDTO = this.nullableLinkButtonDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    priceInfo = this.nullablePriceInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isPremium", "isPremium", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -66) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.badge.Badge>");
            if (textAtom != null) {
                return new HotelsPageHeaderDTO(list, badge, textAtom2, textAtom, linkButtonDTO, priceInfo, bool2.booleanValue(), map);
            }
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        Constructor<HotelsPageHeaderDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HotelsPageHeaderDTO.class.getDeclaredConstructor(List.class, Badge.class, TextAtom.class, TextAtom.class, LinkButtonDTO.class, HotelsPageHeaderDTO.PriceInfo.class, Boolean.TYPE, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (textAtom == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        Map<String, TokenizedTrackingInfo> map2 = map;
        LinkButtonDTO linkButtonDTO2 = linkButtonDTO;
        Badge badge2 = badge;
        HotelsPageHeaderDTO newInstance = constructor.newInstance(list, badge2, textAtom2, textAtom, linkButtonDTO2, priceInfo, bool2, map2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsPageHeaderDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("badges");
        this.listOfBadgeAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w("mirBadge");
        this.nullableBadgeAdapter.mo44toJson(writer, (x) value.getMirBadge());
        writer.w("stars");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getStars());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        this.nullableLinkButtonDTOAdapter.mo44toJson(writer, (x) value.getAddress());
        writer.w("priceInfo");
        this.nullablePriceInfoAdapter.mo44toJson(writer, (x) value.getPriceInfo());
        writer.w("isPremium");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isPremium()));
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
