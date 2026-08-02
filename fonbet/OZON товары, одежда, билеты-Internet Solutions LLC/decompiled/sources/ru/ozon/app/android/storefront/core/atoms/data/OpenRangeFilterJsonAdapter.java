package ru.ozon.app.android.storefront.core.atoms.data;

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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/data/OpenRangeFilterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/core/atoms/data/OpenRangeFilter;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/core/atoms/data/OpenRangeFilter;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/core/atoms/data/OpenRangeFilter;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "nullableIntAdapter", "", "booleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OpenRangeFilterJsonAdapter extends JsonAdapter<OpenRangeFilter> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<OpenRangeFilter> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public OpenRangeFilterJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("minValue", "maxValue", SelectionItemFormDTO.TITLE_FIELD_NAME, "action", "symbol", "stepPower", "maxValueSign", "fromValue", "toValue", "hideSeparator", "trackingInfo", "testInfo", "context");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "minValue");
        this.nullableStringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "stepPower");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "hideSeparator");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(OpenRangeFilter)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OpenRangeFilter fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Integer num = 0;
        Integer num2 = null;
        Boolean bool2 = bool;
        Integer num3 = null;
        Integer num4 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        String str = null;
        String str2 = null;
        AtomActionDTO atomActionDTO = null;
        String str3 = null;
        Integer num5 = null;
        String str4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("minValue", "minValue", reader);
                    }
                    break;
                case 1:
                    num4 = this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        throw c.q("maxValue", "maxValue", reader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("fromValue", "fromValue", reader);
                    }
                    i11 &= -129;
                    break;
                case 8:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("toValue", "toValue", reader);
                    }
                    i11 &= -257;
                    break;
                case 9:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("hideSeparator", "hideSeparator", reader);
                    }
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
                case 12:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -8065) {
            Map<String, TokenizedTrackingInfo> map2 = map;
            if (num3 == null) {
                throw c.j("minValue", "minValue", reader);
            }
            TestInfo testInfo2 = testInfo;
            int intValue = num3.intValue();
            if (num4 == null) {
                throw c.j("maxValue", "maxValue", reader);
            }
            return new OpenRangeFilter(intValue, num4.intValue(), str2, atomActionDTO, str3, num5, str4, num.intValue(), num2.intValue(), bool2.booleanValue(), map2, testInfo2, str);
        }
        Map<String, TokenizedTrackingInfo> map3 = map;
        TestInfo testInfo3 = testInfo;
        String str5 = str;
        Constructor<OpenRangeFilter> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = OpenRangeFilter.class.getDeclaredConstructor(cls2, cls2, String.class, AtomActionDTO.class, String.class, Integer.class, String.class, cls2, cls2, Boolean.TYPE, Map.class, TestInfo.class, String.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (num3 == null) {
            throw c.j("minValue", "minValue", reader);
        }
        if (num4 == null) {
            throw c.j("maxValue", "maxValue", reader);
        }
        OpenRangeFilter newInstance = constructor.newInstance(num3, num4, str2, atomActionDTO, str3, num5, str4, num, num2, bool2, map3, testInfo3, str5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OpenRangeFilter value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("minValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMinValue()));
        writer.w("maxValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxValue()));
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("symbol");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getSymbol());
        writer.w("stepPower");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getStepPower());
        writer.w("maxValueSign");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getMaxValueSign());
        writer.w("fromValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getFromValue()));
        writer.w("toValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getToValue()));
        writer.w("hideSeparator");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getHideSeparator()));
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.w("context");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getContext());
        writer.p();
    }
}
