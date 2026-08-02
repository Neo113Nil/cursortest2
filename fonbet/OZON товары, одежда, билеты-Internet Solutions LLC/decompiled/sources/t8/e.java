package t8;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import r8.f;
import r8.g;

/* loaded from: classes9.dex */
final class e implements r8.e, g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f99240a = true;

    /* renamed from: b, reason: collision with root package name */
    private final JsonWriter f99241b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f99242c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f99243d;

    /* renamed from: e, reason: collision with root package name */
    private final C9776a f99244e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f99245f;

    e(@NonNull Writer writer, @NonNull HashMap hashMap, @NonNull HashMap hashMap2, C9776a c9776a, boolean z11) {
        this.f99241b = new JsonWriter(writer);
        this.f99242c = hashMap;
        this.f99243d = hashMap2;
        this.f99244e = c9776a;
        this.f99245f = z11;
    }

    private void d() throws IOException {
        if (!this.f99240a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    @NonNull
    final e a(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f99241b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        b(entry.getValue(), (String) key);
                    } catch (ClassCastException e11) {
                        throw new r8.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e11);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            r8.d dVar = (r8.d) this.f99242c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.encode(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f99243d.get(obj.getClass());
            if (fVar != null) {
                fVar.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f99244e.encode(obj, this);
                throw null;
            }
            String name = ((Enum) obj).name();
            d();
            jsonWriter.value(name);
            return this;
        }
        if (obj instanceof byte[]) {
            d();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i11 = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i11 < length) {
                jsonWriter.value(r6[i11]);
                i11++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i11 < length2) {
                long j11 = jArr[i11];
                d();
                jsonWriter.value(j11);
                i11++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i11 < length3) {
                jsonWriter.value(dArr[i11]);
                i11++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i11 < length4) {
                jsonWriter.value(zArr[i11]);
                i11++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i11 < length5) {
                a(numberArr[i11]);
                i11++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i11 < length6) {
                a(objArr[i11]);
                i11++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    @Override // r8.e
    @NonNull
    public final r8.e add(@NonNull r8.c cVar, Object obj) throws IOException {
        b(obj, cVar.b());
        return this;
    }

    @NonNull
    public final e b(Object obj, @NonNull String str) throws IOException {
        boolean z11 = this.f99245f;
        JsonWriter jsonWriter = this.f99241b;
        if (z11) {
            if (obj == null) {
                return this;
            }
            d();
            jsonWriter.name(str);
            a(obj);
            return this;
        }
        d();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        a(obj);
        return this;
    }

    final void c() throws IOException {
        d();
        this.f99241b.flush();
    }

    @Override // r8.e
    @NonNull
    public final r8.e add(@NonNull r8.c cVar, int i11) throws IOException {
        String b11 = cVar.b();
        d();
        JsonWriter jsonWriter = this.f99241b;
        jsonWriter.name(b11);
        d();
        jsonWriter.value(i11);
        return this;
    }

    @Override // r8.e
    @NonNull
    public final r8.e add(@NonNull r8.c cVar, long j11) throws IOException {
        String b11 = cVar.b();
        d();
        JsonWriter jsonWriter = this.f99241b;
        jsonWriter.name(b11);
        d();
        jsonWriter.value(j11);
        return this;
    }

    @Override // r8.g
    @NonNull
    public final g add(String str) throws IOException {
        d();
        this.f99241b.value(str);
        return this;
    }

    @Override // r8.g
    @NonNull
    public final g add(boolean z11) throws IOException {
        d();
        this.f99241b.value(z11);
        return this;
    }
}
