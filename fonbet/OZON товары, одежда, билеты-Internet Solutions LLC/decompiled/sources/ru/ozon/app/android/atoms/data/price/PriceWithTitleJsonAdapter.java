package ru.ozon.app.android.atoms.data.price;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.app.android.atoms.data.price.PriceWithTitle;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/atoms/data/price/PriceWithTitleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/price/PriceWithTitle;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/price/PriceWithTitle;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle$ThemeType;", "themeTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "nullableOzonSpannableStringAdapter", "Lru/ozon/app/android/atoms/data/price/PriceWithTitle$GradientColor;", "nullableGradientColorAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PriceWithTitleJsonAdapter extends JsonAdapter<PriceWithTitle> {
    private volatile Constructor<PriceWithTitle> constructorRef;

    @NotNull
    private final JsonAdapter<PriceWithTitle.GradientColor> nullableGradientColorAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<PriceWithTitle.ThemeType> themeTypeAdapter;

    public PriceWithTitleJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("theme", "backgroundColor", "price", "priceSubtitle", "priceColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "strikethroughTitleColor", "subtitle", "subtitleColor", "gradientBackgroundColor", "trackingInfo", "testInfo");
        M m11 = M.f71699a;
        this.themeTypeAdapter = moshi.f(PriceWithTitle.ThemeType.class, m11, "theme");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.ozonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "price");
        this.nullableOzonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "priceSubtitle");
        this.nullableGradientColorAdapter = moshi.f(PriceWithTitle.GradientColor.class, m11, "gradientBackgroundColor");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(PriceWithTitle)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PriceWithTitle fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        PriceWithTitle.ThemeType themeType = null;
        String str = null;
        OzonSpannableString ozonSpannableString = null;
        OzonSpannableString ozonSpannableString2 = null;
        String str2 = null;
        OzonSpannableString ozonSpannableString3 = null;
        String str3 = null;
        String str4 = null;
        OzonSpannableString ozonSpannableString4 = null;
        String str5 = null;
        PriceWithTitle.GradientColor gradientColor = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    themeType = this.themeTypeAdapter.fromJson(reader);
                    if (themeType == null) {
                        throw c.q("theme", "theme", reader);
                    }
                    i12 &= -2;
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -3;
                    break;
                case 2:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q("price", "price", reader);
                    }
                    break;
                case 3:
                    ozonSpannableString2 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i12 &= -9;
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -17;
                    break;
                case 5:
                    ozonSpannableString3 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i12 &= -33;
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -65;
                    break;
                case 7:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -129;
                    break;
                case 8:
                    ozonSpannableString4 = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    i12 &= -257;
                    break;
                case 9:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -513;
                    break;
                case 10:
                    gradientColor = this.nullableGradientColorAdapter.fromJson(reader);
                    i12 &= -1025;
                    break;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i12 &= -2049;
                    break;
                case 12:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i12 &= -4097;
                    break;
            }
        }
        reader.endObject();
        if (i12 == -8188) {
            Intrinsics.g(themeType, "null cannot be cast to non-null type ru.ozon.app.android.atoms.data.price.PriceWithTitle.ThemeType");
            if (ozonSpannableString == null) {
                throw c.j("price", "price", reader);
            }
            OzonSpannableString ozonSpannableString5 = ozonSpannableString4;
            String str6 = str4;
            String str7 = str3;
            OzonSpannableString ozonSpannableString6 = ozonSpannableString3;
            String str8 = str2;
            OzonSpannableString ozonSpannableString7 = ozonSpannableString2;
            return new PriceWithTitle(themeType, str, ozonSpannableString, ozonSpannableString7, str8, ozonSpannableString6, str7, str6, ozonSpannableString5, str5, gradientColor, map, testInfo);
        }
        Constructor<PriceWithTitle> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = PriceWithTitle.class.getDeclaredConstructor(PriceWithTitle.ThemeType.class, String.class, OzonSpannableString.class, OzonSpannableString.class, String.class, OzonSpannableString.class, String.class, String.class, OzonSpannableString.class, String.class, PriceWithTitle.GradientColor.class, Map.class, TestInfo.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<PriceWithTitle> constructor2 = constructor;
        if (ozonSpannableString == null) {
            throw c.j("price", "price", reader);
        }
        PriceWithTitle newInstance = constructor2.newInstance(themeType, str, ozonSpannableString, ozonSpannableString2, str2, ozonSpannableString3, str3, str4, ozonSpannableString4, str5, gradientColor, map, testInfo, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PriceWithTitle value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("theme");
        this.themeTypeAdapter.mo44toJson(writer, (x) value.getTheme());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("price");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("priceSubtitle");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value.getPriceSubtitle());
        writer.w("priceColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPriceColor());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("titleColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitleColor());
        writer.w("strikethroughTitleColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getStrikethroughTitleColor());
        writer.w("subtitle");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("subtitleColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSubtitleColor());
        writer.w("gradientBackgroundColor");
        this.nullableGradientColorAdapter.mo44toJson(writer, (x) value.getGradientBackgroundColor());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.p();
    }
}
