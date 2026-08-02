package com.squareup.moshi.kotlin.reflect;

import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC7700g;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import kotlin.reflect.k;
import kotlin.reflect.l;
import kotlin.reflect.o;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002%&BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0005\u0012\u001a\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR-\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R+\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lkotlin/reflect/h;", "constructor", "", "Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$a;", "", "allBindings", "nonIgnoredBindings", "Lcom/squareup/moshi/n$a;", "options", "<init>", "(Lkotlin/reflect/h;Ljava/util/List;Ljava/util/List;Lcom/squareup/moshi/n$a;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Object;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/reflect/h;", "getConstructor", "()Lkotlin/reflect/h;", "Ljava/util/List;", "getAllBindings", "()Ljava/util/List;", "getNonIgnoredBindings", "Lcom/squareup/moshi/n$a;", "getOptions", "()Lcom/squareup/moshi/n$a;", "a", "b", "moshi-kotlin"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinJsonAdapter<T> extends JsonAdapter<T> {

    @NotNull
    private final List<a<T, Object>> allBindings;

    @NotNull
    private final h<T> constructor;

    @NotNull
    private final List<a<T, Object>> nonIgnoredBindings;

    @NotNull
    private final n.a options;

    public static final class a<K, P> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f60413a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final JsonAdapter<P> f60414b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final o<K, P> f60415c;

        /* renamed from: d, reason: collision with root package name */
        private final l f60416d;

        /* renamed from: e, reason: collision with root package name */
        private final int f60417e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull String jsonName, @NotNull JsonAdapter<P> adapter, @NotNull o<K, ? extends P> property, l lVar, int i11) {
            Intrinsics.checkNotNullParameter(jsonName, "jsonName");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(property, "property");
            this.f60413a = jsonName;
            this.f60414b = adapter;
            this.f60415c = property;
            this.f60416d = lVar;
            this.f60417e = i11;
        }

        public static a a(a aVar, int i11) {
            String jsonName = aVar.f60413a;
            JsonAdapter<P> adapter = aVar.f60414b;
            o<K, P> property = aVar.f60415c;
            l lVar = aVar.f60416d;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(jsonName, "jsonName");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(property, "property");
            return new a(jsonName, adapter, property, lVar, i11);
        }

        public final P b(K k11) {
            return this.f60415c.get(k11);
        }

        @NotNull
        public final JsonAdapter<P> c() {
            return this.f60414b;
        }

        @NotNull
        public final String d() {
            return this.f60413a;
        }

        @NotNull
        public final o<K, P> e() {
            return this.f60415c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f60413a, aVar.f60413a) && Intrinsics.d(this.f60414b, aVar.f60414b) && Intrinsics.d(this.f60415c, aVar.f60415c) && Intrinsics.d(this.f60416d, aVar.f60416d) && this.f60417e == aVar.f60417e;
        }

        public final int f() {
            return this.f60417e;
        }

        public final void g(K k11, P p11) {
            Object obj;
            obj = Z9.b.f35731a;
            if (p11 != obj) {
                ((k) this.f60415c).y(k11, p11);
            }
        }

        public final int hashCode() {
            int hashCode = (this.f60415c.hashCode() + ((this.f60414b.hashCode() + (this.f60413a.hashCode() * 31)) * 31)) * 31;
            l lVar = this.f60416d;
            return Integer.hashCode(this.f60417e) + ((hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Binding(jsonName=");
            sb2.append(this.f60413a);
            sb2.append(", adapter=");
            sb2.append(this.f60414b);
            sb2.append(", property=");
            sb2.append(this.f60415c);
            sb2.append(", parameter=");
            sb2.append(this.f60416d);
            sb2.append(", propertyIndex=");
            return Ek.a.d(sb2, this.f60417e, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinJsonAdapter(@NotNull h<? extends T> constructor, @NotNull List<a<T, Object>> allBindings, @NotNull List<a<T, Object>> nonIgnoredBindings, @NotNull n.a options) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(allBindings, "allBindings");
        Intrinsics.checkNotNullParameter(nonIgnoredBindings, "nonIgnoredBindings");
        Intrinsics.checkNotNullParameter(options, "options");
        this.constructor = constructor;
        this.allBindings = allBindings;
        this.nonIgnoredBindings = nonIgnoredBindings;
        this.options = options;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(@NotNull n reader) {
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(reader, "reader");
        int size = this.constructor.getParameters().size();
        int size2 = this.allBindings.size();
        Object[] objArr = new Object[size2];
        for (int i11 = 0; i11 < size2; i11++) {
            obj3 = Z9.b.f35731a;
            objArr[i11] = obj3;
        }
        reader.beginObject();
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else {
                a<T, Object> aVar = this.nonIgnoredBindings.get(v11);
                int f7 = aVar.f();
                Object obj4 = objArr[f7];
                obj2 = Z9.b.f35731a;
                if (obj4 != obj2) {
                    throw new com.squareup.moshi.k("Multiple values for '" + aVar.e().getName() + "' at " + reader.d());
                }
                Object fromJson = aVar.c().fromJson(reader);
                objArr[f7] = fromJson;
                if (fromJson == null && !aVar.e().getReturnType().l()) {
                    throw c.q(aVar.e().getName(), aVar.d(), reader);
                }
            }
        }
        reader.endObject();
        boolean z11 = this.allBindings.size() == size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj5 = objArr[i12];
            obj = Z9.b.f35731a;
            if (obj5 == obj) {
                if (this.constructor.getParameters().get(i12).j()) {
                    z11 = false;
                } else {
                    if (!this.constructor.getParameters().get(i12).getType().l()) {
                        String name = this.constructor.getParameters().get(i12).getName();
                        a<T, Object> aVar2 = this.allBindings.get(i12);
                        throw c.j(name, aVar2 != null ? aVar2.d() : null, reader);
                    }
                    objArr[i12] = null;
                }
            }
        }
        T call = z11 ? this.constructor.call(Arrays.copyOf(objArr, size2)) : this.constructor.callBy(new b(this.constructor.getParameters(), objArr));
        int size3 = this.allBindings.size();
        while (size < size3) {
            a aVar3 = this.allBindings.get(size);
            Intrinsics.f(aVar3);
            aVar3.g(call, objArr[size]);
            size++;
        }
        return call;
    }

    @NotNull
    public final List<a<T, Object>> getAllBindings() {
        return this.allBindings;
    }

    @NotNull
    public final h<T> getConstructor() {
        return this.constructor;
    }

    @NotNull
    public final List<a<T, Object>> getNonIgnoredBindings() {
        return this.nonIgnoredBindings;
    }

    @NotNull
    public final n.a getOptions() {
        return this.options;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public void mo44toJson(@NotNull x writer, T value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value == null");
        }
        writer.j();
        for (a<T, Object> aVar : this.allBindings) {
            if (aVar != null) {
                writer.w(aVar.d());
                aVar.c().mo44toJson(writer, (x) aVar.b(value));
            }
        }
        writer.p();
    }

    @NotNull
    public String toString() {
        return "KotlinJsonAdapter(" + this.constructor.getReturnType() + ')';
    }

    /* loaded from: classes9.dex */
    public static final class b extends AbstractC7700g<l, Object> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<l> f60418a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Object[] f60419b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull List<? extends l> parameterKeys, @NotNull Object[] parameterValues) {
            Intrinsics.checkNotNullParameter(parameterKeys, "parameterKeys");
            Intrinsics.checkNotNullParameter(parameterValues, "parameterValues");
            this.f60418a = parameterKeys;
            this.f60419b = parameterValues;
        }

        @Override // kotlin.collections.AbstractC7700g
        @NotNull
        public final Set<Map.Entry<l, Object>> b() {
            Object obj;
            List<l> list = this.f60418a;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (T t2 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                arrayList.add(new AbstractMap.SimpleEntry((l) t2, this.f60419b[i11]));
                i11 = i12;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t11 : arrayList) {
                Object value = ((AbstractMap.SimpleEntry) t11).getValue();
                obj = Z9.b.f35731a;
                if (value != obj) {
                    linkedHashSet.add(t11);
                }
            }
            return linkedHashSet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            Object obj2;
            if (!(obj instanceof l)) {
                return false;
            }
            l key = (l) obj;
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj3 = this.f60419b[key.getIndex()];
            obj2 = Z9.b.f35731a;
            return obj3 != obj2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            Object obj2;
            if (!(obj instanceof l)) {
                return null;
            }
            l key = (l) obj;
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj3 = this.f60419b[key.getIndex()];
            obj2 = Z9.b.f35731a;
            if (obj3 != obj2) {
                return obj3;
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof l) ? obj2 : super.getOrDefault((l) obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            l key = (l) obj;
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof l) {
                return super.remove((l) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj instanceof l) {
                return super.remove((l) obj, obj2);
            }
            return false;
        }
    }
}
