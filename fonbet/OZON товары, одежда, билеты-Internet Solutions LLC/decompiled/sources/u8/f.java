package u8;

import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import u8.C9982a;
import u8.d;

/* loaded from: classes9.dex */
final class f implements r8.e {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f100372f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final r8.c f100373g = HY.a.b(1, r8.c.a("key"));

    /* renamed from: h, reason: collision with root package name */
    private static final r8.c f100374h = HY.a.b(2, r8.c.a(AppMeasurementSdk.ConditionalUserProperty.VALUE));

    /* renamed from: i, reason: collision with root package name */
    private static final e f100375i = new e();

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f100376a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f100377b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f100378c;

    /* renamed from: d, reason: collision with root package name */
    private final g f100379d;

    /* renamed from: e, reason: collision with root package name */
    private final i f100380e = new i(this);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f100381a;

        static {
            int[] iArr = new int[d.a.values().length];
            f100381a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100381a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100381a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, g gVar) {
        this.f100376a = byteArrayOutputStream;
        this.f100377b = hashMap;
        this.f100378c = hashMap2;
        this.f100379d = gVar;
    }

    public static /* synthetic */ void a(Map.Entry entry, r8.e eVar) {
        eVar.add(f100373g, entry.getKey());
        eVar.add(f100374h, entry.getValue());
    }

    private void e(r8.d dVar, r8.c cVar, Object obj, boolean z11) throws IOException {
        C9983b c9983b = new C9983b();
        try {
            OutputStream outputStream = this.f100376a;
            this.f100376a = c9983b;
            try {
                dVar.encode(obj, this);
                this.f100376a = outputStream;
                long c11 = c9983b.c();
                c9983b.close();
                if (z11 && c11 == 0) {
                    return;
                }
                h((g(cVar) << 3) | 2);
                i(c11);
                dVar.encode(obj, this);
            } catch (Throwable th2) {
                this.f100376a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c9983b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static int g(r8.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return ((C9982a.C2200a) dVar).b();
        }
        throw new r8.b("Field has no @Protobuf config");
    }

    private void h(int i11) throws IOException {
        while ((i11 & (-128)) != 0) {
            this.f100376a.write((i11 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            i11 >>>= 7;
        }
        this.f100376a.write(i11 & 127);
    }

    private void i(long j11) throws IOException {
        while (((-128) & j11) != 0) {
            this.f100376a.write((((int) j11) & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            j11 >>>= 7;
        }
        this.f100376a.write(((int) j11) & 127);
    }

    @Override // r8.e
    @NonNull
    public final r8.e add(@NonNull r8.c cVar, Object obj) throws IOException {
        d(cVar, obj, true);
        return this;
    }

    final void b(@NonNull r8.c cVar, int i11, boolean z11) throws IOException {
        if (z11 && i11 == 0) {
            return;
        }
        d dVar = (d) cVar.c(d.class);
        if (dVar == null) {
            throw new r8.b("Field has no @Protobuf config");
        }
        C9982a.C2200a c2200a = (C9982a.C2200a) dVar;
        int i12 = a.f100381a[c2200a.a().ordinal()];
        if (i12 == 1) {
            h(c2200a.b() << 3);
            h(i11);
        } else if (i12 == 2) {
            h(c2200a.b() << 3);
            h((i11 << 1) ^ (i11 >> 31));
        } else {
            if (i12 != 3) {
                return;
            }
            h((c2200a.b() << 3) | 5);
            this.f100376a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i11).array());
        }
    }

    final void c(@NonNull r8.c cVar, long j11, boolean z11) throws IOException {
        if (z11 && j11 == 0) {
            return;
        }
        d dVar = (d) cVar.c(d.class);
        if (dVar == null) {
            throw new r8.b("Field has no @Protobuf config");
        }
        C9982a.C2200a c2200a = (C9982a.C2200a) dVar;
        int i11 = a.f100381a[c2200a.a().ordinal()];
        if (i11 == 1) {
            h(c2200a.b() << 3);
            i(j11);
        } else if (i11 == 2) {
            h(c2200a.b() << 3);
            i((j11 >> 63) ^ (j11 << 1));
        } else {
            if (i11 != 3) {
                return;
            }
            h((c2200a.b() << 3) | 1);
            this.f100376a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j11).array());
        }
    }

    final void d(@NonNull r8.c cVar, Object obj, boolean z11) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z11 && charSequence.length() == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f100372f);
            h(bytes.length);
            this.f100376a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(f100375i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z11 && doubleValue == 0.0d) {
                return;
            }
            h((g(cVar) << 3) | 1);
            this.f100376a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z11 && floatValue == 0.0f) {
                return;
            }
            h((g(cVar) << 3) | 5);
            this.f100376a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            c(cVar, ((Number) obj).longValue(), z11);
            return;
        }
        if (obj instanceof Boolean) {
            b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z11);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z11 && bArr.length == 0) {
                return;
            }
            h((g(cVar) << 3) | 2);
            h(bArr.length);
            this.f100376a.write(bArr);
            return;
        }
        r8.d dVar = (r8.d) this.f100377b.get(obj.getClass());
        if (dVar != null) {
            e(dVar, cVar, obj, z11);
            return;
        }
        r8.f fVar = (r8.f) this.f100378c.get(obj.getClass());
        if (fVar != null) {
            i iVar = this.f100380e;
            iVar.a(cVar, z11);
            fVar.encode(obj, iVar);
        } else if (obj instanceof InterfaceC9984c) {
            b(cVar, ((InterfaceC9984c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            b(cVar, ((Enum) obj).ordinal(), true);
        } else {
            e(this.f100379d, cVar, obj, z11);
        }
    }

    final void f(Object obj) throws IOException {
        if (obj == null) {
            return;
        }
        r8.d dVar = (r8.d) this.f100377b.get(obj.getClass());
        if (dVar != null) {
            dVar.encode(obj, this);
        } else {
            throw new r8.b("No encoder for " + obj.getClass());
        }
    }

    @Override // r8.e
    @NonNull
    public final r8.e add(@NonNull r8.c cVar, int i11) throws IOException {
        b(cVar, i11, true);
        return this;
    }

    @Override // r8.e
    @NonNull
    public final r8.e add(@NonNull r8.c cVar, long j11) throws IOException {
        c(cVar, j11, true);
        return this;
    }
}
