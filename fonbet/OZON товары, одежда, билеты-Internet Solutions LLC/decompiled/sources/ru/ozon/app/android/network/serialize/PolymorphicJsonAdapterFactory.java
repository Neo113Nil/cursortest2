package ru.ozon.app.android.network.serialize;

import C.o0;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.k;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class PolymorphicJsonAdapterFactory<T> implements JsonAdapter.a {
    final Class<T> baseType;
    final T defaultValue;
    final boolean defaultValueSet;
    final String labelKey;
    final List<String> labels;
    final List<Type> subtypes;

    /* loaded from: classes12.dex */
    static final class PolymorphicJsonAdapter extends JsonAdapter<Object> {
        final Object defaultValue;
        final boolean defaultValueSet;
        final List<JsonAdapter<Object>> jsonAdapters;
        final String labelKey;
        final n.a labelKeyOptions;
        final n.a labelOptions;
        final List<String> labels;
        final List<Type> subtypes;

        PolymorphicJsonAdapter(String str, List<String> list, List<Type> list2, List<JsonAdapter<Object>> list3, Object obj, boolean z11) {
            this.labelKey = str;
            this.labels = list;
            this.subtypes = list2;
            this.jsonAdapters = list3;
            this.defaultValue = obj;
            this.defaultValueSet = z11;
            this.labelKeyOptions = n.a.C0918a.a(str);
            this.labelOptions = n.a.C0918a.a((String[]) list.toArray(new String[0]));
        }

        private int labelIndex(n nVar) throws IOException {
            nVar.beginObject();
            while (nVar.hasNext()) {
                if (nVar.v(this.labelKeyOptions) != -1) {
                    int w11 = nVar.w(this.labelOptions);
                    if (w11 != -1 || this.defaultValueSet) {
                        nVar.close();
                        return w11;
                    }
                    throw new k("Expected one of " + this.labels + " for key '" + this.labelKey + "' but found '" + nVar.nextString() + "'. Register a subtype for this label.");
                }
                nVar.y();
                nVar.skipValue();
            }
            throw new k("Missing label for " + this.labelKey);
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(n nVar) throws IOException {
            int labelIndex = labelIndex(nVar.q());
            if (labelIndex != -1) {
                return this.jsonAdapters.get(labelIndex).fromJson(nVar);
            }
            nVar.skipValue();
            return this.defaultValue;
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public void mo44toJson(x xVar, Object obj) throws IOException {
            int indexOf = this.subtypes.indexOf(obj.getClass());
            if (indexOf != -1) {
                JsonAdapter<Object> jsonAdapter = this.jsonAdapters.get(indexOf);
                xVar.j();
                xVar.w(this.labelKey).R(this.labels.get(indexOf));
                int d11 = xVar.d();
                jsonAdapter.mo44toJson(xVar, (x) obj);
                xVar.o(d11);
                xVar.p();
                return;
            }
            throw new IllegalArgumentException("Expected one of " + this.subtypes + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
        }

        public String toString() {
            return o0.c(new StringBuilder("PolymorphicJsonAdapter("), this.labelKey, ")");
        }
    }

    PolymorphicJsonAdapterFactory(Class<T> cls, String str, List<String> list, List<Type> list2, T t2, boolean z11) {
        this.baseType = cls;
        this.labelKey = str;
        this.labels = list;
        this.subtypes = list2;
        this.defaultValue = t2;
        this.defaultValueSet = z11;
    }

    public static <T> PolymorphicJsonAdapterFactory<T> of(Class<T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("baseType == null");
        }
        if (str == null) {
            throw new NullPointerException("labelKey == null");
        }
        List list = Collections.EMPTY_LIST;
        return new PolymorphicJsonAdapterFactory<>(cls, str, list, list, null, false);
    }

    @Override // com.squareup.moshi.JsonAdapter.a
    public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, Moshi moshi) {
        if (D.c(type) != this.baseType || !set.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.subtypes.size());
        int size = this.subtypes.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(moshi.d(this.subtypes.get(i11)));
        }
        return new PolymorphicJsonAdapter(this.labelKey, this.labels, this.subtypes, arrayList, this.defaultValue, this.defaultValueSet).nullSafe();
    }

    public PolymorphicJsonAdapterFactory<T> withSubtype(Class<? extends T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("subtype == null");
        }
        if (str == null) {
            throw new NullPointerException("label == null");
        }
        if (this.labels.contains(str) || this.subtypes.contains(cls)) {
            throw new IllegalArgumentException("Subtypes and labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(this.labels);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.subtypes);
        arrayList2.add(cls);
        return new PolymorphicJsonAdapterFactory<>(this.baseType, this.labelKey, arrayList, arrayList2, this.defaultValue, this.defaultValueSet);
    }
}
