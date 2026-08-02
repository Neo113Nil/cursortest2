package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.d;
import com.twilio.voice.EventKeys;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import qb.C6135c;

/* loaded from: classes3.dex */
public final class f implements qb.f {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f37768f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final qb.d f37769g = qb.d.a("key").b(com.google.firebase.encoders.proto.a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    public static final qb.d f37770h = qb.d.a(EventKeys.VALUE_KEY).b(com.google.firebase.encoders.proto.a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    public static final qb.e f37771i = new qb.e() { // from class: com.google.firebase.encoders.proto.e
        @Override // qb.InterfaceC6134b
        public final void a(Object obj, Object obj2) {
            f.d((Map.Entry) obj, (qb.f) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f37772a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f37773b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f37774c;

    /* renamed from: d, reason: collision with root package name */
    public final qb.e f37775d;

    /* renamed from: e, reason: collision with root package name */
    public final i f37776e = new i(this);

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding;

        static {
            int[] iArr = new int[d.a.values().length];
            $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(OutputStream outputStream, Map map, Map map2, qb.e eVar) {
        this.f37772a = outputStream;
        this.f37773b = map;
        this.f37774c = map2;
        this.f37775d = eVar;
    }

    public static /* synthetic */ void d(Map.Entry entry, qb.f fVar) {
        fVar.c(f37769g, entry.getKey());
        fVar.c(f37770h, entry.getValue());
    }

    public static ByteBuffer m(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static d r(qb.d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2;
        }
        throw new C6135c("Field has no @Protobuf config");
    }

    public static int s(qb.d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2.tag();
        }
        throw new C6135c("Field has no @Protobuf config");
    }

    @Override // qb.f
    public qb.f c(qb.d dVar, Object obj) {
        return l(dVar, obj, true);
    }

    @Override // qb.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public f a(qb.d dVar, int i10) {
        return f(dVar, i10, true);
    }

    public f f(qb.d dVar, int i10, boolean z10) {
        if (!z10 || i10 != 0) {
            d r10 = r(dVar);
            int i11 = a.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[r10.intEncoding().ordinal()];
            if (i11 == 1) {
                t(r10.tag() << 3);
                t(i10);
                return this;
            }
            if (i11 == 2) {
                t(r10.tag() << 3);
                t((i10 << 1) ^ (i10 >> 31));
                return this;
            }
            if (i11 == 3) {
                t((r10.tag() << 3) | 5);
                this.f37772a.write(m(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    @Override // qb.f
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public f b(qb.d dVar, long j10) {
        return h(dVar, j10, true);
    }

    public f h(qb.d dVar, long j10, boolean z10) {
        if (!z10 || j10 != 0) {
            d r10 = r(dVar);
            int i10 = a.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[r10.intEncoding().ordinal()];
            if (i10 == 1) {
                t(r10.tag() << 3);
                u(j10);
                return this;
            }
            if (i10 == 2) {
                t(r10.tag() << 3);
                u((j10 >> 63) ^ (j10 << 1));
                return this;
            }
            if (i10 == 3) {
                t((r10.tag() << 3) | 1);
                this.f37772a.write(m(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    public f i(qb.d dVar, boolean z10, boolean z11) {
        return f(dVar, z10 ? 1 : 0, z11);
    }

    public qb.f j(qb.d dVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        t((s(dVar) << 3) | 1);
        this.f37772a.write(m(8).putDouble(d10).array());
        return this;
    }

    public qb.f k(qb.d dVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        t((s(dVar) << 3) | 5);
        this.f37772a.write(m(4).putFloat(f10).array());
        return this;
    }

    public qb.f l(qb.d dVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    t((s(dVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f37768f);
                    t(bytes.length);
                    this.f37772a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    l(dVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    o(f37771i, dVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return j(dVar, ((Double) obj).doubleValue(), z10);
                }
                if (obj instanceof Float) {
                    return k(dVar, ((Float) obj).floatValue(), z10);
                }
                if (obj instanceof Number) {
                    return h(dVar, ((Number) obj).longValue(), z10);
                }
                if (obj instanceof Boolean) {
                    return i(dVar, ((Boolean) obj).booleanValue(), z10);
                }
                if (!(obj instanceof byte[])) {
                    qb.e eVar = (qb.e) this.f37773b.get(obj.getClass());
                    if (eVar != null) {
                        return o(eVar, dVar, obj, z10);
                    }
                    qb.g gVar = (qb.g) this.f37774c.get(obj.getClass());
                    return gVar != null ? p(gVar, dVar, obj, z10) : obj instanceof c ? a(dVar, ((c) obj).getNumber()) : obj instanceof Enum ? a(dVar, ((Enum) obj).ordinal()) : o(this.f37775d, dVar, obj, z10);
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    t((s(dVar) << 3) | 2);
                    t(bArr.length);
                    this.f37772a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final long n(qb.e eVar, Object obj) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f37772a;
            this.f37772a = bVar;
            try {
                eVar.a(obj, this);
                this.f37772a = outputStream;
                long d10 = bVar.d();
                bVar.close();
                return d10;
            } catch (Throwable th2) {
                this.f37772a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final f o(qb.e eVar, qb.d dVar, Object obj, boolean z10) {
        long n10 = n(eVar, obj);
        if (z10 && n10 == 0) {
            return this;
        }
        t((s(dVar) << 3) | 2);
        u(n10);
        eVar.a(obj, this);
        return this;
    }

    public final f p(qb.g gVar, qb.d dVar, Object obj, boolean z10) {
        this.f37776e.b(dVar, z10);
        gVar.a(obj, this.f37776e);
        return this;
    }

    public f q(Object obj) {
        if (obj == null) {
            return this;
        }
        qb.e eVar = (qb.e) this.f37773b.get(obj.getClass());
        if (eVar != null) {
            eVar.a(obj, this);
            return this;
        }
        throw new C6135c("No encoder for " + obj.getClass());
    }

    public final void t(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f37772a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f37772a.write(i10 & 127);
    }

    public final void u(long j10) {
        while (((-128) & j10) != 0) {
            this.f37772a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f37772a.write(((int) j10) & 127);
    }
}
