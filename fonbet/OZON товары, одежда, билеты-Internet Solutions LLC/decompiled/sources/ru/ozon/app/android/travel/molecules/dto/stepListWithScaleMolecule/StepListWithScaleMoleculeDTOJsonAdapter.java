package ru.ozon.app.android.travel.molecules.dto.stepListWithScaleMolecule;

import Ak.b;
import C.o0;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.app.android.travel.molecules.dto.stepListWithScaleMolecule.StepListWithScaleMoleculeDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/stepListWithScaleMolecule/StepListWithScaleMoleculeDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/molecules/dto/stepListWithScaleMolecule/StepListWithScaleMoleculeDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/molecules/dto/stepListWithScaleMolecule/StepListWithScaleMoleculeDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/molecules/dto/stepListWithScaleMolecule/StepListWithScaleMoleculeDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "Lru/ozon/app/android/travel/molecules/dto/stepListWithScaleMolecule/StepListWithScaleMoleculeDTO$StepDTO;", "listOfStepDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StepListWithScaleMoleculeDTOJsonAdapter extends JsonAdapter<StepListWithScaleMoleculeDTO> {
    private volatile Constructor<StepListWithScaleMoleculeDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<StepListWithScaleMoleculeDTO.StepDTO>> listOfStepDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public StepListWithScaleMoleculeDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("backgroundColor", "paddingLeft", "paddingRight", "steps");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "paddingLeft");
        this.listOfStepDTOAdapter = moshi.f(D.e(List.class, StepListWithScaleMoleculeDTO.StepDTO.class), m11, "steps");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public StepListWithScaleMoleculeDTO fromJson(@NotNull n reader) {
        Integer a11 = o0.a(reader, "reader", 0);
        Integer num = a11;
        String str = null;
        List<StepListWithScaleMoleculeDTO.StepDTO> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 1) {
                a11 = this.intAdapter.fromJson(reader);
                if (a11 == null) {
                    throw c.q("paddingLeft", "paddingLeft", reader);
                }
                i11 &= -3;
            } else if (v11 == 2) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw c.q("paddingRight", "paddingRight", reader);
                }
                i11 &= -5;
            } else if (v11 == 3 && (list = this.listOfStepDTOAdapter.fromJson(reader)) == null) {
                throw c.q("steps", "steps", reader);
            }
        }
        reader.endObject();
        if (i11 == -7) {
            int intValue = a11.intValue();
            int intValue2 = num.intValue();
            if (list != null) {
                return new StepListWithScaleMoleculeDTO(str, intValue, intValue2, list);
            }
            throw c.j("steps", "steps", reader);
        }
        Constructor<StepListWithScaleMoleculeDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = StepListWithScaleMoleculeDTO.class.getDeclaredConstructor(String.class, cls2, cls2, List.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list == null) {
            throw c.j("steps", "steps", reader);
        }
        StepListWithScaleMoleculeDTO newInstance = constructor.newInstance(str, a11, num, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(StepListWithScaleMoleculeDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, StepListWithScaleMoleculeDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("paddingLeft");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getPaddingLeft()));
        writer.w("paddingRight");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getPaddingRight()));
        writer.w("steps");
        this.listOfStepDTOAdapter.mo44toJson(writer, (x) value.getSteps());
        writer.p();
    }
}
