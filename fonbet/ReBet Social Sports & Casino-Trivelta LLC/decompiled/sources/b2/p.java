package b2;

import e1.AbstractC4156x;
import e1.J;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class p {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f24938a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24939b;
        public final UUID[] keyIds;
        public final byte[] schemeData;

        public a(UUID uuid, int i10, byte[] bArr, UUID[] uuidArr) {
            this.f24938a = uuid;
            this.f24939b = i10;
            this.schemeData = bArr;
            this.keyIds = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
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

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        J j10 = new J(bArr);
        if (j10.j() < 32) {
            return null;
        }
        j10.b0(0);
        int a10 = j10.a();
        int v10 = j10.v();
        if (v10 != a10) {
            AbstractC4156x.i("PsshAtomUtil", "Advertised atom size (" + v10 + ") does not match buffer size: " + a10);
            return null;
        }
        int v11 = j10.v();
        if (v11 != 1886614376) {
            AbstractC4156x.i("PsshAtomUtil", "Atom type is not pssh: " + v11);
            return null;
        }
        int q10 = AbstractC2372b.q(j10.v());
        if (q10 > 1) {
            AbstractC4156x.i("PsshAtomUtil", "Unsupported pssh version: " + q10);
            return null;
        }
        UUID uuid = new UUID(j10.F(), j10.F());
        if (q10 == 1) {
            int Q10 = j10.Q();
            uuidArr = new UUID[Q10];
            for (int i10 = 0; i10 < Q10; i10++) {
                uuidArr[i10] = new UUID(j10.F(), j10.F());
            }
        } else {
            uuidArr = null;
        }
        int Q11 = j10.Q();
        int a11 = j10.a();
        if (Q11 == a11) {
            byte[] bArr2 = new byte[Q11];
            j10.q(bArr2, 0, Q11);
            return new a(uuid, q10, bArr2, uuidArr);
        }
        AbstractC4156x.i("PsshAtomUtil", "Atom data size (" + Q11 + ") does not match the bytes left: " + a11);
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        if (uuid.equals(d10.f24938a)) {
            return d10.schemeData;
        }
        AbstractC4156x.i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d10.f24938a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        return d10.f24938a;
    }

    public static int g(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return -1;
        }
        return d10.f24939b;
    }
}
