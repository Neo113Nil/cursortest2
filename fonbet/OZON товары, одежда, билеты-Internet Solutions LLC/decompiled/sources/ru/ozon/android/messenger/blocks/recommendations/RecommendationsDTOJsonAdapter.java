package ru.ozon.android.messenger.blocks.recommendations;

import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.recommendations.RecommendationsDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R(\u0010)\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019¨\u0006,"}, d2 = {"Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextDTOAdapter", "", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$Badge;", "nullableListOfBadgeAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ProductsDTO;", "nullableProductsDTOAdapter", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ErrorDTO;", "nullableErrorDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "nullableMapOfStringStringAdapter", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "nullableMapOfStringMessengerTrackingInfoAdapter", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$a;", "placeDTOAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RecommendationsDTOJsonAdapter extends JsonAdapter<RecommendationsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<RecommendationsDTO.ErrorDTO> nullableErrorDTOAdapter;

    @NotNull
    private final JsonAdapter<List<RecommendationsDTO.Badge>> nullableListOfBadgeAdapter;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> nullableMapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<RecommendationsDTO.ProductsDTO> nullableProductsDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<RecommendationsDTO.a> placeDTOAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public RecommendationsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "badges", "buttonBadge", "products", "error", "updateBlockAction", "lexemes", "trackingInfo", "place");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<TextDTO> f7 = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.textDTOAdapter = f7;
        JsonAdapter<TextDTO> f11 = moshi.f(TextDTO.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableTextDTOAdapter = f11;
        JsonAdapter<List<RecommendationsDTO.Badge>> f12 = moshi.f(D.e(List.class, RecommendationsDTO.Badge.class), m11, "badges");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableListOfBadgeAdapter = f12;
        JsonAdapter<BadgeDTO> f13 = moshi.f(BadgeDTO.class, m11, "buttonBadge");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBadgeDTOAdapter = f13;
        JsonAdapter<RecommendationsDTO.ProductsDTO> f14 = moshi.f(RecommendationsDTO.ProductsDTO.class, m11, "products");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableProductsDTOAdapter = f14;
        JsonAdapter<RecommendationsDTO.ErrorDTO> f15 = moshi.f(RecommendationsDTO.ErrorDTO.class, m11, "error");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableErrorDTOAdapter = f15;
        JsonAdapter<AtomActionDTO> f16 = moshi.f(AtomActionDTO.class, m11, "updateBlockAction");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f16;
        JsonAdapter<Map<String, String>> f17 = moshi.f(D.e(Map.class, String.class, String.class), m11, "lexemes");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f17;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f18 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableMapOfStringMessengerTrackingInfoAdapter = f18;
        JsonAdapter<RecommendationsDTO.a> f19 = moshi.f(RecommendationsDTO.a.class, m11, "place");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.placeDTOAdapter = f19;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(40, "GeneratedJsonAdapter(RecommendationsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RecommendationsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        List<RecommendationsDTO.Badge> list = null;
        BadgeDTO badgeDTO = null;
        RecommendationsDTO.ProductsDTO productsDTO = null;
        RecommendationsDTO.ErrorDTO errorDTO = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, String> map = null;
        Map<String, MessengerTrackingInfo> map2 = null;
        RecommendationsDTO.a aVar = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    list = this.nullableListOfBadgeAdapter.fromJson(reader);
                    break;
                case 3:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    productsDTO = this.nullableProductsDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    errorDTO = this.nullableErrorDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    break;
                case 8:
                    map2 = this.nullableMapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
                    break;
                case 9:
                    aVar = this.placeDTOAdapter.fromJson(reader);
                    if (aVar == null) {
                        throw Y9.c.q("place", "place", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (textDTO == null) {
            throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (aVar != null) {
            return new RecommendationsDTO(textDTO, textDTO2, list, badgeDTO, productsDTO, errorDTO, atomActionDTO, map, map2, aVar);
        }
        throw Y9.c.j("place", "place", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RecommendationsDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("badges");
        this.nullableListOfBadgeAdapter.mo44toJson(writer, (x) value_.getBadges());
        writer.w("buttonBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value_.getButtonBadge());
        writer.w("products");
        this.nullableProductsDTOAdapter.mo44toJson(writer, (x) value_.getProducts());
        writer.w("error");
        this.nullableErrorDTOAdapter.mo44toJson(writer, (x) value_.getError());
        writer.w("updateBlockAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getUpdateBlockAction());
        writer.w("lexemes");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value_.getLexemes());
        writer.w("trackingInfo");
        this.nullableMapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("place");
        this.placeDTOAdapter.mo44toJson(writer, (x) value_.getPlace());
        writer.p();
    }
}
