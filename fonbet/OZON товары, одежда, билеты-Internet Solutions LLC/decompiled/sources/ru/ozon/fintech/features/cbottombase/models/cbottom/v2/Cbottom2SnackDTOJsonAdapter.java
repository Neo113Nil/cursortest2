package ru.ozon.fintech.features.cbottombase.models.cbottom.v2;

import Ak.b;
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
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2SnackDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2SnackDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2SnackDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2SnackDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "cbottomTypeAdapter", "", "nullableIntAdapter", "", "LF40/a;", "nullableListOfCbottomWidget2DTOAdapter", "", "booleanAdapter", "intAdapter", "nullableStringAdapter", "nullableListOfIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Cbottom2SnackDTOJsonAdapter extends JsonAdapter<Cbottom2SnackDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<CbottomType> cbottomTypeAdapter;
    private volatile Constructor<Cbottom2SnackDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<F40.a>> nullableListOfCbottomWidget2DTOAdapter;

    @NotNull
    private final JsonAdapter<List<Integer>> nullableListOfIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public Cbottom2SnackDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("id", "type", "version", "main", "inWindow", "atTop", "topPadding", "bottomPadding", "duration", "swipeable", "backgroundColor", "backgroundRadius", "borderColor", "borderWidth");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "id");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<CbottomType> f11 = moshi.f(CbottomType.class, m11, "type");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.cbottomTypeAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "version");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        JsonAdapter<List<F40.a>> f13 = moshi.f(D.e(List.class, F40.a.class), m11, "main");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfCbottomWidget2DTOAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.TYPE, m11, "inWindow");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.booleanAdapter = f14;
        JsonAdapter<Integer> f15 = moshi.f(Integer.TYPE, m11, "duration");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.intAdapter = f15;
        JsonAdapter<String> f16 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableStringAdapter = f16;
        JsonAdapter<List<Integer>> f17 = moshi.f(D.e(List.class, Integer.class), m11, "backgroundRadius");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableListOfIntAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(Cbottom2SnackDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Cbottom2SnackDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Integer num = 0;
        CbottomType cbottomType = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num2 = null;
        List<F40.a> list = null;
        Integer num3 = null;
        Integer num4 = null;
        List<Integer> list2 = null;
        Integer num5 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("id", "id", reader);
                    }
                    break;
                case 1:
                    cbottomType = this.cbottomTypeAdapter.fromJson(reader);
                    if (cbottomType == null) {
                        throw c.q("type", "type", reader);
                    }
                    i11 &= -3;
                    break;
                case 2:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    list = this.nullableListOfCbottomWidget2DTOAdapter.fromJson(reader);
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("inWindow", "inWindow", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("atTop", "atTop", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
                case 7:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
                case 8:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("duration", "duration", reader);
                    }
                    i11 &= -257;
                    break;
                case 9:
                    bool4 = this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        throw c.q("swipeable", "swipeable", reader);
                    }
                    i11 &= -513;
                    break;
                case 10:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -1025;
                    break;
                case 11:
                    list2 = this.nullableListOfIntAdapter.fromJson(reader);
                    i11 &= -2049;
                    break;
                case 12:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -4097;
                    break;
                case 13:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -8193;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -16375) {
            String str4 = str;
            if (str2 == null) {
                throw c.j("id", "id", reader);
            }
            Intrinsics.g(cbottomType, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType");
            return new Cbottom2SnackDTO(str2, cbottomType, num2, list, bool2.booleanValue(), bool3.booleanValue(), num3, num4, num.intValue(), bool4.booleanValue(), str4, list2, str3, num5);
        }
        String str5 = str;
        String str6 = str3;
        CbottomType cbottomType2 = cbottomType;
        Constructor<Cbottom2SnackDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Integer.TYPE;
            constructor = Cbottom2SnackDTO.class.getDeclaredConstructor(String.class, CbottomType.class, Integer.class, List.class, cls2, cls2, Integer.class, Integer.class, cls3, cls2, String.class, List.class, String.class, Integer.class, cls3, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str2 == null) {
            throw c.j("id", "id", reader);
        }
        Cbottom2SnackDTO newInstance = constructor.newInstance(str2, cbottomType2, num2, list, bool2, bool3, num3, num4, num, bool4, str5, list2, str6, num5, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Cbottom2SnackDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.stringAdapter.mo44toJson(writer, (x) value_.getId());
        writer.w("type");
        this.cbottomTypeAdapter.mo44toJson(writer, (x) value_.getType());
        writer.w("version");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getVersion());
        writer.w("main");
        this.nullableListOfCbottomWidget2DTOAdapter.mo44toJson(writer, (x) value_.getMain());
        writer.w("inWindow");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getInWindow()));
        writer.w("atTop");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getAtTop()));
        writer.w("topPadding");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getTopPadding());
        writer.w("bottomPadding");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getBottomPadding());
        writer.w("duration");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getDuration()));
        writer.w("swipeable");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getSwipeable()));
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("backgroundRadius");
        this.nullableListOfIntAdapter.mo44toJson(writer, (x) value_.getBackgroundRadius());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBorderColor());
        writer.w("borderWidth");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getBorderWidth());
        writer.p();
    }
}
