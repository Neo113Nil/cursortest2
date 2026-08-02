package ru.ozon.android.messenger.blocks.recommendations;

import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.recommendations.RecommendationsDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO_ProductDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ProductDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ProductDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/recommendations/RecommendationsDTO$ProductDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "nullablePriceDTOAdapter", "", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "nullableIconButtonDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "nullableMapOfStringMessengerTrackingInfoAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RecommendationsDTO_ProductDTOJsonAdapter extends JsonAdapter<RecommendationsDTO.ProductDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<IconButtonDTO> nullableIconButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> nullableMapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<PriceDTO> nullablePriceDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public RecommendationsDTO_ProductDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("imageUrl", SelectionItemFormDTO.TITLE_FIELD_NAME, "price", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "icon", "button", "action", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "imageUrl");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<TextDTO> f11 = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.textDTOAdapter = f11;
        JsonAdapter<PriceDTO> f12 = moshi.f(PriceDTO.class, m11, "price");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullablePriceDTOAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.class, m11, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBooleanAdapter = f13;
        JsonAdapter<IconDTO> f14 = moshi.f(IconDTO.class, m11, "icon");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableIconDTOAdapter = f14;
        JsonAdapter<IconButtonDTO> f15 = moshi.f(IconButtonDTO.class, m11, "button");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableIconButtonDTOAdapter = f15;
        JsonAdapter<AtomActionDTO> f16 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f16;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringMessengerTrackingInfoAdapter = f17;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(51, "GeneratedJsonAdapter(RecommendationsDTO.ProductDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RecommendationsDTO.ProductDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        TextDTO textDTO = null;
        PriceDTO priceDTO = null;
        Boolean bool = null;
        IconDTO iconDTO = null;
        IconButtonDTO iconButtonDTO = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, MessengerTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q("imageUrl", "imageUrl", reader);
                    }
                    break;
                case 1:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 2:
                    priceDTO = this.nullablePriceDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 4:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    iconButtonDTO = this.nullableIconButtonDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw Y9.c.j("imageUrl", "imageUrl", reader);
        }
        if (textDTO != null) {
            return new RecommendationsDTO.ProductDTO(str, textDTO, priceDTO, bool, iconDTO, iconButtonDTO, atomActionDTO, map);
        }
        throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RecommendationsDTO.ProductDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("imageUrl");
        this.stringAdapter.mo44toJson(writer, (x) value_.getImageUrl());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("price");
        this.nullablePriceDTOAdapter.mo44toJson(writer, (x) value_.getPrice());
        writer.w(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isAdult());
        writer.w("icon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value_.getIcon());
        writer.w("button");
        this.nullableIconButtonDTOAdapter.mo44toJson(writer, (x) value_.getButton());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
