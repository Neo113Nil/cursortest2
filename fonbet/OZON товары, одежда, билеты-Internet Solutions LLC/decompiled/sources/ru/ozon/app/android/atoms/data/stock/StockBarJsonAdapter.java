package ru.ozon.app.android.atoms.data.stock;

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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/atoms/data/stock/StockBarJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/stock/StockBar;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/stock/StockBar;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/stock/StockBar$StockBarTheme;", "nullableStockBarThemeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "nullableStringAdapter", "", "floatAdapter", "", "booleanAdapter", "nullableBooleanAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StockBarJsonAdapter extends JsonAdapter<StockBar> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<StockBar> constructorRef;

    @NotNull
    private final JsonAdapter<Float> floatAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<StockBar.StockBarTheme> nullableStockBarThemeAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    public StockBarJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("theme", "percent", "text", "textColor", "stockBarColor", "stockBarBackgroundColor", "stockBarBackgroundAlpha", "isFullWidth", "hasBorder", "testInfo");
        M m11 = M.f71699a;
        this.nullableStockBarThemeAdapter = moshi.f(StockBar.StockBarTheme.class, m11, "theme");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "percent");
        this.ozonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "text");
        this.nullableStringAdapter = moshi.f(String.class, m11, "textColor");
        this.floatAdapter = moshi.f(Float.TYPE, m11, "stockBarBackgroundAlpha");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isFullWidth");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "hasBorder");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @NotNull
    public String toString() {
        return b.c(30, "GeneratedJsonAdapter(StockBar)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public StockBar fromJson(@NotNull n reader) {
        StockBar.StockBarTheme stockBarTheme;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Float valueOf = Float.valueOf(0.0f);
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        OzonSpannableString ozonSpannableString = null;
        Float f7 = valueOf;
        Boolean bool2 = bool;
        StockBar.StockBarTheme stockBarTheme2 = null;
        String str = null;
        Integer num = null;
        String str2 = null;
        Boolean bool3 = null;
        TestInfo testInfo = null;
        int i11 = -1;
        String str3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    stockBarTheme2 = this.nullableStockBarThemeAdapter.fromJson(reader);
                    i11 &= -2;
                    break;
                case 1:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("percent", "percent", reader);
                    }
                    break;
                case 2:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    f7 = this.floatAdapter.fromJson(reader);
                    if (f7 == null) {
                        throw c.q("stockBarBackgroundAlpha", "stockBarBackgroundAlpha", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isFullWidth", "isFullWidth", reader);
                    }
                    i11 &= -129;
                    break;
                case 8:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -257;
                    break;
                case 9:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    i11 &= -513;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -1018) {
            if (num == null) {
                throw c.j("percent", "percent", reader);
            }
            int intValue = num.intValue();
            if (ozonSpannableString == null) {
                throw c.j("text", "text", reader);
            }
            return new StockBar(stockBarTheme2, intValue, ozonSpannableString, str3, str, str2, f7.floatValue(), bool2.booleanValue(), bool3, testInfo);
        }
        Constructor<StockBar> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Integer.TYPE;
            stockBarTheme = stockBarTheme2;
            constructor = StockBar.class.getDeclaredConstructor(StockBar.StockBarTheme.class, cls3, OzonSpannableString.class, String.class, String.class, String.class, Float.TYPE, cls2, Boolean.class, TestInfo.class, cls3, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            stockBarTheme = stockBarTheme2;
        }
        if (num == null) {
            throw c.j("percent", "percent", reader);
        }
        if (ozonSpannableString == null) {
            throw c.j("text", "text", reader);
        }
        String str4 = str;
        StockBar newInstance = constructor.newInstance(stockBarTheme, num, ozonSpannableString, str3, str4, str2, f7, bool2, bool3, testInfo, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, StockBar value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("theme");
        this.nullableStockBarThemeAdapter.mo44toJson(writer, (x) value.getTheme());
        writer.w("percent");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getPercent()));
        writer.w("text");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("textColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTextColor());
        writer.w("stockBarColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getStockBarColor());
        writer.w("stockBarBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getStockBarBackgroundColor());
        writer.w("stockBarBackgroundAlpha");
        this.floatAdapter.mo44toJson(writer, (x) Float.valueOf(value.getStockBarBackgroundAlpha()));
        writer.w("isFullWidth");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isFullWidth()));
        writer.w("hasBorder");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHasBorder());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.p();
    }
}
