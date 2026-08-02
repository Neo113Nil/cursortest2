package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.data.AspectsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R(\u0010)\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO_VariantJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$Variant;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$Variant;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$Variant;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableOzonSpannableStringAdapter", "nullableStringAdapter", "", "nullableFloatAdapter", "", "nullableListOfStringAdapter", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableBadgeAdapter", "Lru/ozon/uni/atoms/data/price/Price;", "nullablePriceAdapter", "", "booleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsDTO_VariantJsonAdapter extends JsonAdapter<AspectsDTO.Variant> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Badge> nullableBadgeAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<Price> nullablePriceAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AspectsDTO_VariantJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "refreshDeeplink", "deeplink", "subtitle", "image", "aspectRatio", "colors", "badge", "price", "status", "isSelected", "trackingInfo");
        M m11 = M.f71699a;
        this.ozonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter = moshi.f(String.class, m11, "refreshDeeplink");
        this.nullableOzonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "subtitle");
        this.nullableStringAdapter = moshi.f(String.class, m11, "image");
        this.nullableFloatAdapter = moshi.f(Float.class, m11, "aspectRatio");
        this.nullableListOfStringAdapter = moshi.f(D.e(List.class, String.class), m11, "colors");
        this.nullableBadgeAdapter = moshi.f(Badge.class, m11, "badge");
        this.nullablePriceAdapter = moshi.f(Price.class, m11, "price");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSelected");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(AspectsDTO.Variant)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AspectsDTO.Variant fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        OzonSpannableString ozonSpannableString = null;
        String str = null;
        String str2 = null;
        OzonSpannableString ozonSpannableString2 = null;
        String str3 = null;
        Float f7 = null;
        List<String> list = null;
        Badge badge = null;
        Price price = null;
        String str4 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            Boolean bool2 = bool;
            OzonSpannableString ozonSpannableString3 = ozonSpannableString;
            String str5 = str;
            if (!reader.hasNext()) {
                String str6 = str2;
                reader.endObject();
                if (ozonSpannableString3 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (str5 == null) {
                    throw c.j("refreshDeeplink", "refreshDeeplink", reader);
                }
                if (str6 == null) {
                    throw c.j("deeplink", "deeplink", reader);
                }
                if (str4 == null) {
                    throw c.j("status", "status", reader);
                }
                if (bool2 != null) {
                    return new AspectsDTO.Variant(ozonSpannableString3, str5, str6, ozonSpannableString2, str3, f7, list, badge, price, str4, bool2.booleanValue(), map);
                }
                throw c.j("isSelected", "isSelected", reader);
            }
            String str7 = str2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool2;
                    str2 = str7;
                    ozonSpannableString = ozonSpannableString3;
                    str = str5;
                case 0:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    bool = bool2;
                    str2 = str7;
                    str = str5;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("refreshDeeplink", "refreshDeeplink", reader);
                    }
                    bool = bool2;
                    str2 = str7;
                    ozonSpannableString = ozonSpannableString3;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("deeplink", "deeplink", reader);
                    }
                    bool = bool2;
                    ozonSpannableString = ozonSpannableString3;
                    str = str5;
                case 3:
                    ozonSpannableString2 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    bool = bool2;
                    str2 = str7;
                    ozonSpannableString = ozonSpannableString3;
                    str = str5;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    bool = bool2;
                    str2 = str7;
                    ozonSpannableString = ozonSpannableString3;
                    str = str5;
                case 5:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    bool = bool2;
                    str2 = str7;
                    ozonSpannableString = ozonSpannableString3;
                    str = str5;
                case 6:
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    bool = bool2;
                    str2 = str7;
                    ozonSpannableString = ozonSpannableString3;
                    str = str5;
                case 7:
                    badge = this.nullableBadgeAdapter.fromJson(reader);
                    bool = bool2;
                    str2 = str7;
                    ozonSpannableString = ozonSpannableString3;
                    str = str5;
                case 8:
                    price = this.nullablePriceAdapter.fromJson(reader);
                    bool = bool2;
                    str2 = str7;
                    ozonSpannableString = ozonSpannableString3;
                    str = str5;
                case 9:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("status", "status", reader);
                    }
                    bool = bool2;
                    str2 = str7;
                    ozonSpannableString = ozonSpannableString3;
                    str = str5;
                case 10:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("isSelected", "isSelected", reader);
                    }
                    str2 = str7;
                    ozonSpannableString = ozonSpannableString3;
                    str = str5;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool2;
                    str2 = str7;
                    ozonSpannableString = ozonSpannableString3;
                    str = str5;
                default:
                    bool = bool2;
                    str2 = str7;
                    ozonSpannableString = ozonSpannableString3;
                    str = str5;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AspectsDTO.Variant value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("refreshDeeplink");
        this.stringAdapter.mo44toJson(writer, (x) value.getRefreshDeeplink());
        writer.w("deeplink");
        this.stringAdapter.mo44toJson(writer, (x) value.getDeeplink());
        writer.w("subtitle");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("aspectRatio");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value.getAspectRatio());
        writer.w("colors");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value.getColors());
        writer.w("badge");
        this.nullableBadgeAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("price");
        this.nullablePriceAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("status");
        this.stringAdapter.mo44toJson(writer, (x) value.getStatus());
        writer.w("isSelected");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSelected()));
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
