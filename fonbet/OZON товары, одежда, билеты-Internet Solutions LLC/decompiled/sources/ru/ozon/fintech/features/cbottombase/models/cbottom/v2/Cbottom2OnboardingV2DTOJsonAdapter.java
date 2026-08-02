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
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2OnboardingV2DTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2OnboardingV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2OnboardingV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2OnboardingV2DTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2OnboardingV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/cbottombase/models/cbottom/CbottomType;", "cbottomTypeAdapter", "", "nullableIntAdapter", "intAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "", "Lru/ozon/fintech/features/cbottombase/models/cbottom/v2/Cbottom2OnboardingV2DTO$FrameDTO;", "listOfFrameDTOAdapter", "", "floatAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Cbottom2OnboardingV2DTOJsonAdapter extends JsonAdapter<Cbottom2OnboardingV2DTO> {

    @NotNull
    private final JsonAdapter<CbottomType> cbottomTypeAdapter;
    private volatile Constructor<Cbottom2OnboardingV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<Float> floatAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<Cbottom2OnboardingV2DTO.FrameDTO>> listOfFrameDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public Cbottom2OnboardingV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("id", "type", "version", "selectedFrame", "canClose", "widgetName", "frames", "ratio");
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
        JsonAdapter<Integer> f13 = moshi.f(Integer.TYPE, m11, "selectedFrame");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.intAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.class, m11, "canClose");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableBooleanAdapter = f14;
        JsonAdapter<String> f15 = moshi.f(String.class, m11, "widgetName");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableStringAdapter = f15;
        JsonAdapter<List<Cbottom2OnboardingV2DTO.FrameDTO>> f16 = moshi.f(D.e(List.class, Cbottom2OnboardingV2DTO.FrameDTO.class), m11, "frames");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.listOfFrameDTOAdapter = f16;
        JsonAdapter<Float> f17 = moshi.f(Float.TYPE, m11, "ratio");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.floatAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(Cbottom2OnboardingV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Cbottom2OnboardingV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        CbottomType cbottomType = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        String str2 = null;
        List<Cbottom2OnboardingV2DTO.FrameDTO> list = null;
        Float f7 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
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
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("selectedFrame", "selectedFrame", reader);
                    }
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    list = this.listOfFrameDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("frames", "frames", reader);
                    }
                    break;
                case 7:
                    f7 = this.floatAdapter.fromJson(reader);
                    if (f7 == null) {
                        throw c.q("ratio", "ratio", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (i11 == -7) {
            String str3 = str;
            if (str3 == null) {
                throw c.j("id", "id", reader);
            }
            Intrinsics.g(cbottomType, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType");
            if (num2 == null) {
                throw c.j("selectedFrame", "selectedFrame", reader);
            }
            Float f11 = f7;
            List<Cbottom2OnboardingV2DTO.FrameDTO> list2 = list;
            String str4 = str2;
            Boolean bool2 = bool;
            int intValue = num2.intValue();
            if (list2 == null) {
                throw c.j("frames", "frames", reader);
            }
            if (f11 == null) {
                throw c.j("ratio", "ratio", reader);
            }
            return new Cbottom2OnboardingV2DTO(str3, cbottomType, num, intValue, bool2, str4, list2, f11.floatValue());
        }
        String str5 = str;
        Float f12 = f7;
        List<Cbottom2OnboardingV2DTO.FrameDTO> list3 = list;
        String str6 = str2;
        Boolean bool3 = bool;
        Constructor<Cbottom2OnboardingV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = Cbottom2OnboardingV2DTO.class.getDeclaredConstructor(String.class, CbottomType.class, Integer.class, cls2, Boolean.class, String.class, List.class, Float.TYPE, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str5 == null) {
            throw c.j("id", "id", reader);
        }
        if (num2 == null) {
            throw c.j("selectedFrame", "selectedFrame", reader);
        }
        if (list3 == null) {
            throw c.j("frames", "frames", reader);
        }
        if (f12 == null) {
            throw c.j("ratio", "ratio", reader);
        }
        Cbottom2OnboardingV2DTO newInstance = constructor.newInstance(str5, cbottomType, num, num2, bool3, str6, list3, f12, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Cbottom2OnboardingV2DTO value_) {
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
        writer.w("selectedFrame");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getSelectedFrame()));
        writer.w("canClose");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getCanClose());
        writer.w("widgetName");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getWidgetName());
        writer.w("frames");
        this.listOfFrameDTOAdapter.mo44toJson(writer, (x) value_.getFrames());
        writer.w("ratio");
        this.floatAdapter.mo44toJson(writer, (x) Float.valueOf(value_.getRatio()));
        writer.p();
    }
}
