package com.squareup.moshi;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0018B!\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/squareup/moshi/ArrayJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "Ljava/lang/Class;", "elementClass", "elementAdapter", "<init>", "(Ljava/lang/Class;Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Object;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Class;", "Lcom/squareup/moshi/JsonAdapter;", "Factory", "a", "moshi"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ArrayJsonAdapter extends JsonAdapter<Object> {

    /* renamed from: Factory, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final JsonAdapter<Object> elementAdapter;

    @NotNull
    private final Class<?> elementClass;

    /* renamed from: com.squareup.moshi.ArrayJsonAdapter$a, reason: from kotlin metadata */
    public static final class Companion implements JsonAdapter.a {
        @Override // com.squareup.moshi.JsonAdapter.a
        public final JsonAdapter<?> create(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, @NotNull Moshi moshi) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(type, "type");
            Type genericComponentType = type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : type instanceof Class ? ((Class) type).getComponentType() : null;
            if (genericComponentType == null || !annotations.isEmpty()) {
                return null;
            }
            Intrinsics.checkNotNullParameter(genericComponentType, "<this>");
            return new ArrayJsonAdapter(D.c(genericComponentType), moshi.d(genericComponentType)).nullSafe();
        }
    }

    public ArrayJsonAdapter(@NotNull Class<?> elementClass, @NotNull JsonAdapter<Object> elementAdapter) {
        Intrinsics.checkNotNullParameter(elementClass, "elementClass");
        Intrinsics.checkNotNullParameter(elementAdapter, "elementAdapter");
        this.elementClass = elementClass;
        this.elementAdapter = elementAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Object fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Tc.b builder = C7714v.B();
        reader.beginArray();
        while (reader.hasNext()) {
            builder.add(this.elementAdapter.fromJson(reader));
        }
        reader.endArray();
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.b B11 = builder.B();
        Object array = Array.newInstance(this.elementClass, B11.getF26995b());
        int i11 = 0;
        ListIterator listIterator = B11.listIterator(0);
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            Array.set(array, i11, next);
            i11 = i12;
        }
        Intrinsics.checkNotNullExpressionValue(array, "array");
        return array;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public void mo44toJson(@NotNull x writer, Object value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.c();
        int i11 = 0;
        if (value instanceof boolean[]) {
            boolean[] zArr = (boolean[]) value;
            int length = zArr.length;
            while (i11 < length) {
                this.elementAdapter.mo44toJson(writer, (x) Boolean.valueOf(zArr[i11]));
                i11++;
            }
        } else if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            int length2 = bArr.length;
            while (i11 < length2) {
                this.elementAdapter.mo44toJson(writer, (x) Byte.valueOf(bArr[i11]));
                i11++;
            }
        } else if (value instanceof char[]) {
            char[] cArr = (char[]) value;
            int length3 = cArr.length;
            while (i11 < length3) {
                this.elementAdapter.mo44toJson(writer, (x) Character.valueOf(cArr[i11]));
                i11++;
            }
        } else if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            int length4 = dArr.length;
            while (i11 < length4) {
                this.elementAdapter.mo44toJson(writer, (x) Double.valueOf(dArr[i11]));
                i11++;
            }
        } else if (value instanceof float[]) {
            float[] fArr = (float[]) value;
            int length5 = fArr.length;
            while (i11 < length5) {
                this.elementAdapter.mo44toJson(writer, (x) Float.valueOf(fArr[i11]));
                i11++;
            }
        } else if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            int length6 = iArr.length;
            while (i11 < length6) {
                this.elementAdapter.mo44toJson(writer, (x) Integer.valueOf(iArr[i11]));
                i11++;
            }
        } else if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            int length7 = jArr.length;
            while (i11 < length7) {
                this.elementAdapter.mo44toJson(writer, (x) Long.valueOf(jArr[i11]));
                i11++;
            }
        } else if (value instanceof short[]) {
            short[] sArr = (short[]) value;
            int length8 = sArr.length;
            while (i11 < length8) {
                this.elementAdapter.mo44toJson(writer, (x) Short.valueOf(sArr[i11]));
                i11++;
            }
        } else if (value instanceof Object[]) {
            Object[] objArr = (Object[]) value;
            int length9 = objArr.length;
            while (i11 < length9) {
                this.elementAdapter.mo44toJson(writer, (x) objArr[i11]);
                i11++;
            }
        }
        writer.m();
    }

    @NotNull
    public String toString() {
        return this.elementAdapter + ".array()";
    }
}
