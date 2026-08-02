package ru.ozon.uni.atoms.data.price;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/uni/atoms/data/price/PriceJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/price/Price;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/price/Price;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/price/Price;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/price/Price$StyleType;", "nullableStyleTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "nullableOzonSpannableStringAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PriceJsonAdapter extends JsonAdapter<Price> {
    public static final int $stable = 8;
    private volatile Constructor<Price> constructorRef;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<Price.StyleType> nullableStyleTypeAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public PriceJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("style", "theme", "price", "priceSubtitle", "priceColor", "originalPrice", "originalPriceColor", "image", "imageTintColor", "strikethroughColor", "trackingInfo", "testInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Price.StyleType> f7 = moshi.f(Price.StyleType.class, m11, "style");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStyleTypeAdapter = f7;
        JsonAdapter<OzonSpannableString> f11 = moshi.f(OzonSpannableString.class, m11, "price");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableOzonSpannableStringAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "priceColor");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f13 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f13;
        JsonAdapter<TestInfo> f14 = moshi.f(TestInfo.class, m11, "testInfo");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableTestInfoAdapter = f14;
    }

    @NotNull
    public String toString() {
        return b.c(27, "GeneratedJsonAdapter(Price)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Price fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        Price.StyleType styleType = null;
        Price.StyleType styleType2 = null;
        OzonSpannableString ozonSpannableString = null;
        OzonSpannableString ozonSpannableString2 = null;
        String str = null;
        OzonSpannableString ozonSpannableString3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    styleType = this.nullableStyleTypeAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    styleType2 = this.nullableStyleTypeAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    ozonSpannableString = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    ozonSpannableString2 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    ozonSpannableString3 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
                case 10:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -4096) {
            String str6 = str4;
            String str7 = str3;
            String str8 = str2;
            OzonSpannableString ozonSpannableString4 = ozonSpannableString3;
            String str9 = str;
            OzonSpannableString ozonSpannableString5 = ozonSpannableString2;
            return new Price(styleType, styleType2, ozonSpannableString, ozonSpannableString5, str9, ozonSpannableString4, str8, str7, str6, str5, map, testInfo);
        }
        String str10 = str4;
        String str11 = str3;
        String str12 = str2;
        OzonSpannableString ozonSpannableString6 = ozonSpannableString3;
        String str13 = str;
        OzonSpannableString ozonSpannableString7 = ozonSpannableString2;
        OzonSpannableString ozonSpannableString8 = ozonSpannableString;
        Price.StyleType styleType3 = styleType2;
        Price.StyleType styleType4 = styleType;
        Constructor<Price> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Price.class.getDeclaredConstructor(Price.StyleType.class, Price.StyleType.class, OzonSpannableString.class, OzonSpannableString.class, String.class, OzonSpannableString.class, String.class, String.class, String.class, String.class, Map.class, TestInfo.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Price newInstance = constructor.newInstance(styleType4, styleType3, ozonSpannableString8, ozonSpannableString7, str13, ozonSpannableString6, str12, str11, str10, str5, map, testInfo, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Price value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("style");
        this.nullableStyleTypeAdapter.mo44toJson(writer, (x) value_.getStyle());
        writer.w("theme");
        this.nullableStyleTypeAdapter.mo44toJson(writer, (x) value_.getTheme());
        writer.w("price");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value_.getPrice());
        writer.w("priceSubtitle");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value_.getPriceSubtitle());
        writer.w("priceColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPriceColor());
        writer.w("originalPrice");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value_.getOriginalPrice());
        writer.w("originalPriceColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getOriginalPriceColor());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("imageTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getImageTintColor());
        writer.w("strikethroughColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getStrikethroughColor());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value_.getTestInfo());
        writer.p();
    }
}
