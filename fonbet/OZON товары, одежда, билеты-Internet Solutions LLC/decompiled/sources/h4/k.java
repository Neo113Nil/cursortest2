package h4;

import Ij.C3261b;
import java.nio.ByteBuffer;
import java.util.UUID;
import m3.C8050C;

/* loaded from: classes8.dex */
public final class k {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f64898a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64899b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f64900c;

        /* renamed from: d, reason: collision with root package name */
        public final UUID[] f64901d;

        a(UUID uuid, int i11, byte[] bArr, UUID[] uuidArr) {
            this.f64898a = uuid;
            this.f64899b = i11;
            this.f64900c = bArr;
            this.f64901d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static a b(byte[] bArr) {
        UUID[] uuidArr;
        C8050C c8050c = new C8050C(bArr);
        if (c8050c.i() < 32) {
            return null;
        }
        c8050c.R(0);
        int a11 = c8050c.a();
        int p11 = c8050c.p();
        if (p11 != a11) {
            m3.s.f("PsshAtomUtil", "Advertised atom size (" + p11 + ") does not match buffer size: " + a11);
            return null;
        }
        int p12 = c8050c.p();
        if (p12 != 1886614376) {
            C3261b.f(p12, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int d11 = C6795a.d(c8050c.p());
        if (d11 > 1) {
            C3261b.f(d11, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(c8050c.y(), c8050c.y());
        if (d11 == 1) {
            int I11 = c8050c.I();
            uuidArr = new UUID[I11];
            for (int i11 = 0; i11 < I11; i11++) {
                uuidArr[i11] = new UUID(c8050c.y(), c8050c.y());
            }
        } else {
            uuidArr = null;
        }
        int I12 = c8050c.I();
        int a12 = c8050c.a();
        if (I12 == a12) {
            byte[] bArr2 = new byte[I12];
            c8050c.n(0, I12, bArr2);
            return new a(uuid, d11, bArr2, uuidArr);
        }
        m3.s.f("PsshAtomUtil", "Atom data size (" + I12 + ") does not match the bytes left: " + a12);
        return null;
    }

    public static byte[] c(UUID uuid, byte[] bArr) {
        a b11 = b(bArr);
        if (b11 == null) {
            return null;
        }
        UUID uuid2 = b11.f64898a;
        if (uuid.equals(uuid2)) {
            return b11.f64900c;
        }
        m3.s.f("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static UUID d(byte[] bArr) {
        a b11 = b(bArr);
        if (b11 == null) {
            return null;
        }
        return b11.f64898a;
    }
}
