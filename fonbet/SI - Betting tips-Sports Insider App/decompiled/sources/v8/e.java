package v8;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import t8.f;
import t8.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements t8.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24462a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f24463b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f24464c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f24465d;

    /* renamed from: e, reason: collision with root package name */
    public final t8.d f24466e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24467f;

    public e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a aVar, boolean z5) {
        this.f24463b = new JsonWriter(bufferedWriter);
        this.f24464c = hashMap;
        this.f24465d = hashMap2;
        this.f24466e = aVar;
        this.f24467f = z5;
    }

    @Override // t8.e
    public final t8.e a(t8.c cVar, Object obj) {
        g(obj, cVar.f23753a);
        return this;
    }

    @Override // t8.e
    public final t8.e b(t8.c cVar, long j) {
        String str = cVar.f23753a;
        h();
        JsonWriter jsonWriter = this.f24463b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(j);
        return this;
    }

    @Override // t8.g
    public final g c(String str) {
        h();
        this.f24463b.value(str);
        return this;
    }

    @Override // t8.g
    public final g d(boolean z5) {
        h();
        this.f24463b.value(z5);
        return this;
    }

    @Override // t8.e
    public final t8.e e(t8.c cVar, int i5) {
        String str = cVar.f23753a;
        h();
        JsonWriter jsonWriter = this.f24463b;
        jsonWriter.name(str);
        h();
        jsonWriter.value(i5);
        return this;
    }

    public final void f(Object obj) {
        JsonWriter jsonWriter = this.f24463b;
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        int i5 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next());
                }
                jsonWriter.endArray();
                return;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g(entry.getValue(), (String) key);
                    } catch (ClassCastException e7) {
                        throw new t8.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e7);
                    }
                }
                jsonWriter.endObject();
                return;
            }
            t8.d dVar = (t8.d) this.f24464c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return;
            }
            f fVar = (f) this.f24465d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                h();
                jsonWriter.value(name);
                return;
            } else {
                jsonWriter.beginObject();
                this.f24466e.a(obj, this);
                jsonWriter.endObject();
                return;
            }
        }
        if (obj instanceof byte[]) {
            h();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i5 < length) {
                jsonWriter.value(r7[i5]);
                i5++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i5 < length2) {
                long j = jArr[i5];
                h();
                jsonWriter.value(j);
                i5++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i5 < length3) {
                jsonWriter.value(dArr[i5]);
                i5++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i5 < length4) {
                jsonWriter.value(zArr[i5]);
                i5++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i5 < length5) {
                f(numberArr[i5]);
                i5++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i5 < length6) {
                f(objArr[i5]);
                i5++;
            }
        }
        jsonWriter.endArray();
    }

    public final void g(Object obj, String str) {
        boolean z5 = this.f24467f;
        JsonWriter jsonWriter = this.f24463b;
        if (z5) {
            if (obj == null) {
                return;
            }
            h();
            jsonWriter.name(str);
            f(obj);
            return;
        }
        h();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            f(obj);
        }
    }

    public final void h() {
        if (!this.f24462a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
