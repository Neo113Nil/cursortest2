package ru.ozon.fintech.features.camera.domain.scanner;

import Y9.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/camera/domain/scanner/MobScannerConfig;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableListOfStringAdapter", "", "intAdapter", "", "longAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MobScannerConfigJsonAdapter extends JsonAdapter<MobScannerConfig> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<MobScannerConfig> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final n.a options;

    public MobScannerConfigJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("qrScanners", "phoneScanners", "bankCardScanners", "disabledSalute", "maxSize", "scannerQueueDebounce", "sharpnessThreshold", "separateSaluteProcess", "separateProcessTimeout");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        b e11 = D.e(List.class, String.class);
        M m11 = M.f71699a;
        JsonAdapter<List<String>> f7 = moshi.f(e11, m11, "qrScanners");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.listOfStringAdapter = f7;
        JsonAdapter<List<String>> f11 = moshi.f(D.e(List.class, String.class), m11, "disabledSalute");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableListOfStringAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.TYPE, m11, "maxSize");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.intAdapter = f12;
        JsonAdapter<Long> f13 = moshi.f(Long.TYPE, m11, "scannerQueueDebounce");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.longAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.TYPE, m11, "separateSaluteProcess");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.booleanAdapter = f14;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(38, "GeneratedJsonAdapter(MobScannerConfig)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MobScannerConfig fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        List<String> list = null;
        List<String> list2 = null;
        List<String> list3 = null;
        List<String> list4 = null;
        Integer num = null;
        Long l11 = null;
        Integer num2 = null;
        Boolean bool = null;
        Long l12 = null;
        while (true) {
            List<String> list5 = list;
            List<String> list6 = list2;
            List<String> list7 = list4;
            if (!reader.hasNext()) {
                Integer num3 = num;
                reader.endObject();
                if (i11 == -5) {
                    if (list5 == null) {
                        throw c.j("qrScanners", "qrScanners", reader);
                    }
                    if (list6 == null) {
                        throw c.j("phoneScanners", "phoneScanners", reader);
                    }
                    Intrinsics.g(list3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    if (num3 == null) {
                        throw c.j("maxSize", "maxSize", reader);
                    }
                    Long l13 = l11;
                    int intValue = num3.intValue();
                    if (l13 == null) {
                        throw c.j("scannerQueueDebounce", "scannerQueueDebounce", reader);
                    }
                    Integer num4 = num2;
                    Boolean bool2 = bool;
                    long longValue = l13.longValue();
                    if (num4 == null) {
                        throw c.j("sharpnessThreshold", "sharpnessThreshold", reader);
                    }
                    Long l14 = l12;
                    int intValue2 = num4.intValue();
                    if (bool2 == null) {
                        throw c.j("separateSaluteProcess", "separateSaluteProcess", reader);
                    }
                    boolean booleanValue = bool2.booleanValue();
                    if (l14 == null) {
                        throw c.j("separateProcessTimeout", "separateProcessTimeout", reader);
                    }
                    return new MobScannerConfig(list5, list6, list3, list7, intValue, longValue, intValue2, booleanValue, l14.longValue());
                }
                Long l15 = l11;
                Integer num5 = num2;
                Boolean bool3 = bool;
                Long l16 = l12;
                Constructor<MobScannerConfig> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Integer.TYPE;
                    Class cls3 = Long.TYPE;
                    constructor = MobScannerConfig.class.getDeclaredConstructor(List.class, List.class, List.class, List.class, cls2, cls3, cls2, Boolean.TYPE, cls3, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                }
                if (list5 == null) {
                    throw c.j("qrScanners", "qrScanners", reader);
                }
                if (list6 == null) {
                    throw c.j("phoneScanners", "phoneScanners", reader);
                }
                if (num3 == null) {
                    throw c.j("maxSize", "maxSize", reader);
                }
                if (l15 == null) {
                    throw c.j("scannerQueueDebounce", "scannerQueueDebounce", reader);
                }
                if (num5 == null) {
                    throw c.j("sharpnessThreshold", "sharpnessThreshold", reader);
                }
                if (bool3 == null) {
                    throw c.j("separateSaluteProcess", "separateSaluteProcess", reader);
                }
                if (l16 == null) {
                    throw c.j("separateProcessTimeout", "separateProcessTimeout", reader);
                }
                MobScannerConfig newInstance = constructor.newInstance(list5, list6, list3, list7, num3, l15, num5, bool3, l16, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            Integer num6 = num;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    num = num6;
                    list = list5;
                    list2 = list6;
                    list4 = list7;
                case 0:
                    list = this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("qrScanners", "qrScanners", reader);
                    }
                    num = num6;
                    list2 = list6;
                    list4 = list7;
                case 1:
                    list2 = this.listOfStringAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("phoneScanners", "phoneScanners", reader);
                    }
                    num = num6;
                    list = list5;
                    list4 = list7;
                case 2:
                    list3 = this.listOfStringAdapter.fromJson(reader);
                    if (list3 == null) {
                        throw c.q("bankCardScanners", "bankCardScanners", reader);
                    }
                    num = num6;
                    list = list5;
                    list2 = list6;
                    list4 = list7;
                    i11 = -5;
                case 3:
                    list4 = this.nullableListOfStringAdapter.fromJson(reader);
                    num = num6;
                    list = list5;
                    list2 = list6;
                case 4:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("maxSize", "maxSize", reader);
                    }
                    list = list5;
                    list2 = list6;
                    list4 = list7;
                case 5:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("scannerQueueDebounce", "scannerQueueDebounce", reader);
                    }
                    num = num6;
                    list = list5;
                    list2 = list6;
                    list4 = list7;
                case 6:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("sharpnessThreshold", "sharpnessThreshold", reader);
                    }
                    num = num6;
                    list = list5;
                    list2 = list6;
                    list4 = list7;
                case 7:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("separateSaluteProcess", "separateSaluteProcess", reader);
                    }
                    num = num6;
                    list = list5;
                    list2 = list6;
                    list4 = list7;
                case 8:
                    l12 = this.longAdapter.fromJson(reader);
                    if (l12 == null) {
                        throw c.q("separateProcessTimeout", "separateProcessTimeout", reader);
                    }
                    num = num6;
                    list = list5;
                    list2 = list6;
                    list4 = list7;
                default:
                    num = num6;
                    list = list5;
                    list2 = list6;
                    list4 = list7;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MobScannerConfig value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("qrScanners");
        this.listOfStringAdapter.mo44toJson(writer, (x) value_.getQrScanners());
        writer.w("phoneScanners");
        this.listOfStringAdapter.mo44toJson(writer, (x) value_.getPhoneScanners());
        writer.w("bankCardScanners");
        this.listOfStringAdapter.mo44toJson(writer, (x) value_.getBankCardScanners());
        writer.w("disabledSalute");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getDisabledSalute());
        writer.w("maxSize");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getMaxSize()));
        writer.w("scannerQueueDebounce");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getScannerQueueDebounce()));
        writer.w("sharpnessThreshold");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getSharpnessThreshold()));
        writer.w("separateSaluteProcess");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getSeparateSaluteProcess()));
        writer.w("separateProcessTimeout");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getSeparateProcessTimeout()));
        writer.p();
    }
}
