package sb;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import qb.C6135c;
import qb.f;
import qb.g;
import qb.h;

/* renamed from: sb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6349e implements f, h {

    /* renamed from: a, reason: collision with root package name */
    public C6349e f64819a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f64820b = true;

    /* renamed from: c, reason: collision with root package name */
    public final JsonWriter f64821c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f64822d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f64823e;

    /* renamed from: f, reason: collision with root package name */
    public final qb.e f64824f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f64825g;

    public C6349e(Writer writer, Map map, Map map2, qb.e eVar, boolean z10) {
        this.f64821c = new JsonWriter(writer);
        this.f64822d = map;
        this.f64823e = map2;
        this.f64824f = eVar;
        this.f64825g = z10;
    }

    @Override // qb.f
    public f a(qb.d dVar, int i10) {
        return i(dVar.b(), i10);
    }

    @Override // qb.f
    public f b(qb.d dVar, long j10) {
        return j(dVar.b(), j10);
    }

    @Override // qb.f
    public f c(qb.d dVar, Object obj) {
        return k(dVar.b(), obj);
    }

    public C6349e e(int i10) {
        s();
        this.f64821c.value(i10);
        return this;
    }

    public C6349e f(long j10) {
        s();
        this.f64821c.value(j10);
        return this;
    }

    public C6349e g(Object obj, boolean z10) {
        if (z10 && n(obj)) {
            throw new C6135c(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f64821c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f64821c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f64821c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    g(it.next(), false);
                }
                this.f64821c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f64821c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        k((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new C6135c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f64821c.endObject();
                return this;
            }
            qb.e eVar = (qb.e) this.f64822d.get(obj.getClass());
            if (eVar != null) {
                return p(eVar, obj, z10);
            }
            g gVar = (g) this.f64823e.get(obj.getClass());
            if (gVar != null) {
                gVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return p(this.f64824f, obj, z10);
            }
            add(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return m((byte[]) obj);
        }
        this.f64821c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f64821c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                f(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f64821c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f64821c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                g(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                g(obj2, false);
            }
        }
        this.f64821c.endArray();
        return this;
    }

    @Override // qb.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C6349e add(String str) {
        s();
        this.f64821c.value(str);
        return this;
    }

    public C6349e i(String str, int i10) {
        s();
        this.f64821c.name(str);
        return e(i10);
    }

    public C6349e j(String str, long j10) {
        s();
        this.f64821c.name(str);
        return f(j10);
    }

    public C6349e k(String str, Object obj) {
        return this.f64825g ? r(str, obj) : q(str, obj);
    }

    @Override // qb.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C6349e d(boolean z10) {
        s();
        this.f64821c.value(z10);
        return this;
    }

    public C6349e m(byte[] bArr) {
        s();
        if (bArr == null) {
            this.f64821c.nullValue();
            return this;
        }
        this.f64821c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    public final boolean n(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void o() {
        s();
        this.f64821c.flush();
    }

    public C6349e p(qb.e eVar, Object obj, boolean z10) {
        if (!z10) {
            this.f64821c.beginObject();
        }
        eVar.a(obj, this);
        if (!z10) {
            this.f64821c.endObject();
        }
        return this;
    }

    public final C6349e q(String str, Object obj) {
        s();
        this.f64821c.name(str);
        if (obj != null) {
            return g(obj, false);
        }
        this.f64821c.nullValue();
        return this;
    }

    public final C6349e r(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        s();
        this.f64821c.name(str);
        return g(obj, false);
    }

    public final void s() {
        if (!this.f64820b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C6349e c6349e = this.f64819a;
        if (c6349e != null) {
            c6349e.s();
            this.f64819a.f64820b = false;
            this.f64819a = null;
            this.f64821c.endObject();
        }
    }
}
