package com.squareup.moshi;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.AdapterMethodsFactory;
import com.squareup.moshi.JsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Moshi {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Tc.b f60362e;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Tc.b f60363a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60364b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ThreadLocal<b> f60365c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<Object, JsonAdapter<?>> f60366d;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u000b2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\fH\u0082\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R*\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/squareup/moshi/Moshi$Lookup;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Type;", "type", "", "fieldName", "", "cacheKey", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/Object;)V", "R", "Lkotlin/Function1;", "body", "withAdapter", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Object;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "Ljava/lang/String;", "getFieldName", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "setAdapter", "(Lcom/squareup/moshi/JsonAdapter;)V", "moshi"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Lookup<T> extends JsonAdapter<T> {
        private JsonAdapter<T> adapter;

        @NotNull
        private final Object cacheKey;
        private final String fieldName;

        @NotNull
        private final Type type;

        public Lookup(@NotNull Type type, String str, @NotNull Object cacheKey) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            this.type = type;
            this.fieldName = str;
            this.cacheKey = cacheKey;
        }

        private final <R> R withAdapter(Function1<? super JsonAdapter<T>, ? extends R> body) {
            JsonAdapter<T> jsonAdapter = this.adapter;
            if (jsonAdapter != null) {
                return body.invoke(jsonAdapter);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.JsonAdapter
        public T fromJson(@NotNull n reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            JsonAdapter<T> jsonAdapter = this.adapter;
            if (jsonAdapter != null) {
                return jsonAdapter.fromJson(reader);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public final JsonAdapter<T> getAdapter() {
            return this.adapter;
        }

        @NotNull
        public final Object getCacheKey() {
            return this.cacheKey;
        }

        public final String getFieldName() {
            return this.fieldName;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        public final void setAdapter(JsonAdapter<T> jsonAdapter) {
            this.adapter = jsonAdapter;
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson */
        public void mo44toJson(@NotNull x writer, T value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            JsonAdapter<T> jsonAdapter = this.adapter;
            if (jsonAdapter == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            jsonAdapter.mo44toJson(writer, (x) value);
        }

        @NotNull
        public String toString() {
            String obj;
            JsonAdapter<T> jsonAdapter = this.adapter;
            return (jsonAdapter == null || (obj = jsonAdapter.toString()) == null) ? super.toString() : obj;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f60367a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private int f60368b;

        @NotNull
        public final void a(@NotNull JsonAdapter.a factory) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            ArrayList arrayList = this.f60367a;
            int i11 = this.f60368b;
            this.f60368b = i11 + 1;
            arrayList.add(i11, factory);
        }

        @NotNull
        public final void b(@NotNull Object adapter) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            a(AdapterMethodsFactory.b.c(adapter));
        }

        @NotNull
        public final void c(@NotNull final Type type, @NotNull final JsonAdapter jsonAdapter) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(jsonAdapter, "jsonAdapter");
            Tc.b bVar = Moshi.f60362e;
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(jsonAdapter, "jsonAdapter");
            a(new JsonAdapter.a() { // from class: com.squareup.moshi.B
                @Override // com.squareup.moshi.JsonAdapter.a
                public final JsonAdapter create(Type candidate, Set annotations, Moshi moshi) {
                    Type pattern = type;
                    Intrinsics.checkNotNullParameter(pattern, "$type");
                    JsonAdapter jsonAdapter2 = jsonAdapter;
                    Intrinsics.checkNotNullParameter(jsonAdapter2, "$jsonAdapter");
                    Intrinsics.checkNotNullParameter(candidate, "targetType");
                    Intrinsics.checkNotNullParameter(annotations, "annotations");
                    Intrinsics.checkNotNullParameter(moshi, "<anonymous parameter 2>");
                    if (!annotations.isEmpty()) {
                        return null;
                    }
                    M m11 = Y9.c.f34861a;
                    Intrinsics.checkNotNullParameter(pattern, "pattern");
                    Intrinsics.checkNotNullParameter(candidate, "candidate");
                    if (D.b(pattern, candidate)) {
                        return jsonAdapter2;
                    }
                    return null;
                }
            });
        }

        @NotNull
        public final void d(@NotNull JsonAdapter.a factory) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            this.f60367a.add(factory);
        }

        @NotNull
        public final ArrayList e() {
            return this.f60367a;
        }

        public final int f() {
            return this.f60368b;
        }
    }

    public final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f60369a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C7704k<Lookup<?>> f60370b = new C7704k<>();

        /* renamed from: c, reason: collision with root package name */
        private boolean f60371c;

        public b() {
        }

        public final <T> void a(@NotNull JsonAdapter<T> result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Lookup<?> last = this.f60370b.last();
            Intrinsics.g(last, "null cannot be cast to non-null type com.squareup.moshi.Moshi.Lookup<T of com.squareup.moshi.Moshi.LookupChain.adapterFound>");
            last.setAdapter(result);
        }

        @NotNull
        public final IllegalArgumentException b(@NotNull IllegalArgumentException e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            if (!this.f60371c) {
                this.f60371c = true;
                C7704k<Lookup<?>> c7704k = this.f60370b;
                if (c7704k.getF26995b() != 1 || c7704k.first().getFieldName() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e11.getMessage());
                    for (Lookup lookup : C7714v.v(c7704k)) {
                        sb2.append("\nfor ");
                        sb2.append(lookup.getType());
                        if (lookup.getFieldName() != null) {
                            sb2.append(' ');
                            sb2.append(lookup.getFieldName());
                        }
                    }
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                    return new IllegalArgumentException(sb3, e11);
                }
            }
            return e11;
        }

        public final void c(boolean z11) {
            this.f60370b.removeLast();
            if (this.f60370b.isEmpty()) {
                Moshi.this.f60365c.remove();
                if (z11) {
                    LinkedHashMap linkedHashMap = Moshi.this.f60366d;
                    Moshi moshi = Moshi.this;
                    synchronized (linkedHashMap) {
                        try {
                            int size = this.f60369a.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                Lookup lookup = (Lookup) this.f60369a.get(i11);
                                JsonAdapter jsonAdapter = (JsonAdapter) moshi.f60366d.put(lookup.getCacheKey(), lookup.getAdapter());
                                if (jsonAdapter != null) {
                                    lookup.setAdapter(jsonAdapter);
                                    moshi.f60366d.put(lookup.getCacheKey(), jsonAdapter);
                                }
                            }
                            Unit unit = Unit.f71690a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        public final <T> JsonAdapter<T> d(@NotNull Type type, String str, @NotNull Object cacheKey) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            ArrayList arrayList = this.f60369a;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                C7704k<Lookup<?>> c7704k = this.f60370b;
                if (i11 >= size) {
                    Lookup<?> lookup = new Lookup<>(type, str, cacheKey);
                    arrayList.add(lookup);
                    c7704k.addLast(lookup);
                    return null;
                }
                Lookup<?> lookup2 = (Lookup) arrayList.get(i11);
                if (Intrinsics.d(lookup2.getCacheKey(), cacheKey)) {
                    c7704k.addLast(lookup2);
                    return lookup2.getAdapter() != null ? (JsonAdapter<T>) lookup2.getAdapter() : lookup2;
                }
                i11++;
            }
        }
    }

    static {
        Tc.b builder = new Tc.b(6);
        builder.add(StandardJsonAdapters.f60373a);
        builder.add(CollectionJsonAdapter.INSTANCE);
        builder.add(MapJsonAdapter.INSTANCE);
        builder.add(ArrayJsonAdapter.INSTANCE);
        builder.add(RecordJsonAdapter.INSTANCE);
        builder.add(ClassJsonAdapter.INSTANCE);
        Intrinsics.checkNotNullParameter(builder, "builder");
        f60362e = builder.B();
    }

    public Moshi(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.b builder2 = C7714v.B();
        builder2.addAll(builder.e());
        builder2.addAll(f60362e);
        Intrinsics.checkNotNullParameter(builder2, "builder");
        this.f60363a = builder2.B();
        this.f60364b = builder.f();
        this.f60365c = new ThreadLocal<>();
        this.f60366d = new LinkedHashMap<>();
    }

    @NotNull
    public final <T> JsonAdapter<T> c(@NotNull Class<T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return e(type, Y9.c.f34861a);
    }

    @NotNull
    public final <T> JsonAdapter<T> d(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return e(type, Y9.c.f34861a);
    }

    @NotNull
    public final <T> JsonAdapter<T> e(@NotNull Type type, @NotNull Set<? extends Annotation> annotations) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return f(type, annotations, null);
    }

    @NotNull
    public final <T> JsonAdapter<T> f(@NotNull Type type, @NotNull Set<? extends Annotation> annotations, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Type k11 = Y9.c.k(Y9.c.a(type));
        Object b02 = annotations.isEmpty() ? k11 : C7714v.b0(k11, annotations);
        synchronized (this.f60366d) {
            JsonAdapter<T> jsonAdapter = (JsonAdapter) this.f60366d.get(b02);
            if (jsonAdapter != null) {
                return jsonAdapter;
            }
            Unit unit = Unit.f71690a;
            b bVar = this.f60365c.get();
            if (bVar == null) {
                bVar = new b();
                this.f60365c.set(bVar);
            }
            JsonAdapter<T> d11 = bVar.d(k11, str, b02);
            try {
                if (d11 != null) {
                    return d11;
                }
                try {
                    int f26995b = this.f60363a.getF26995b();
                    for (int i11 = 0; i11 < f26995b; i11++) {
                        JsonAdapter<T> jsonAdapter2 = (JsonAdapter<T>) ((JsonAdapter.a) this.f60363a.get(i11)).create(k11, annotations, this);
                        if (jsonAdapter2 != null) {
                            bVar.a(jsonAdapter2);
                            bVar.c(true);
                            return jsonAdapter2;
                        }
                    }
                    throw new IllegalArgumentException("No JsonAdapter for " + Y9.c.o(type, annotations));
                } catch (IllegalArgumentException e11) {
                    throw bVar.b(e11);
                }
            } finally {
                bVar.c(false);
            }
        }
    }

    @NotNull
    public final a g() {
        Tc.b bVar;
        int i11;
        a aVar = new a();
        int i12 = 0;
        while (true) {
            bVar = this.f60363a;
            i11 = this.f60364b;
            if (i12 >= i11) {
                break;
            }
            aVar.a((JsonAdapter.a) bVar.get(i12));
            i12++;
        }
        int f26995b = bVar.getF26995b() - f60362e.getF26995b();
        while (i11 < f26995b) {
            aVar.d((JsonAdapter.a) bVar.get(i11));
            i11++;
        }
        return aVar;
    }

    @NotNull
    public final <T> JsonAdapter<T> h(@NotNull JsonAdapter.a skipPast, @NotNull Type type, @NotNull Set<? extends Annotation> annotations) {
        Intrinsics.checkNotNullParameter(skipPast, "skipPast");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Type k11 = Y9.c.k(Y9.c.a(type));
        Tc.b bVar = this.f60363a;
        int indexOf = bVar.indexOf(skipPast);
        if (indexOf == -1) {
            throw new IllegalArgumentException(("Unable to skip past unknown factory " + skipPast).toString());
        }
        int f26995b = bVar.getF26995b();
        for (int i11 = indexOf + 1; i11 < f26995b; i11++) {
            JsonAdapter<T> jsonAdapter = (JsonAdapter<T>) ((JsonAdapter.a) bVar.get(i11)).create(k11, annotations, this);
            if (jsonAdapter != null) {
                return jsonAdapter;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + Y9.c.o(k11, annotations));
    }
}
