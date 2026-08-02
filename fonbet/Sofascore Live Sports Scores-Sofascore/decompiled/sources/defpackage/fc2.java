package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fc2 implements Comparable {
    public static final fc2 c = new fc2(new byte[0]);
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final byte[] a;
    public int b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fc2(byte[] bArr, int i, int i2) {
        this(mh0.k(i, i2, bArr));
        bArr.getClass();
    }

    public final byte a(int i) {
        byte[] bArr = this.a;
        if (i >= 0 && i < bArr.length) {
            return bArr[i];
        }
        zzl.r(wv8.j(lnb.t(i, "index (", ") is out of byte string bounds: [0.."), bArr.length, ')'));
        return (byte) 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        fc2 fc2Var = (fc2) obj;
        fc2Var.getClass();
        byte[] bArr = fc2Var.a;
        if (fc2Var == this) {
            return 0;
        }
        byte[] bArr2 = this.a;
        int min = Math.min(bArr2.length, bArr.length);
        for (int i = 0; i < min; i++) {
            byte b = bArr2[i];
            o7k o7kVar = p7k.b;
            int d2 = Intrinsics.d(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if (d2 != 0) {
                return d2;
            }
        }
        return Intrinsics.d(bArr2.length, bArr.length);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || fc2.class != obj.getClass()) {
            return false;
        }
        fc2 fc2Var = (fc2) obj;
        byte[] bArr = fc2Var.a;
        int length = bArr.length;
        byte[] bArr2 = this.a;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = fc2Var.b;
        if (i2 == 0 || (i = this.b) == 0 || i2 == i) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.a);
        this.b = hashCode;
        return hashCode;
    }

    public final String toString() {
        byte[] bArr = this.a;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String valueOf = String.valueOf(bArr.length);
        StringBuilder sb = new StringBuilder((bArr.length * 2) + valueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(valueOf);
        sb.append(" hex=");
        for (byte b : bArr) {
            char[] cArr = d;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ fc2(byte[] bArr, int i) {
        this(bArr, 0, bArr.length);
    }

    public fc2(byte[] bArr) {
        this.a = bArr;
    }
}
