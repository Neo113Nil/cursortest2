package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class af6 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public af6(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static af6 a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[ef6.H[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new af6(4, 1, wrap.array());
    }

    public static af6 b(cf6 cf6Var, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[ef6.H[5]]);
        wrap.order(byteOrder);
        cf6 cf6Var2 = new cf6[]{cf6Var}[0];
        wrap.putInt((int) cf6Var2.a);
        wrap.putInt((int) cf6Var2.b);
        return new af6(5, 1, wrap.array());
    }

    public static af6 c(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[ef6.H[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new af6(3, 1, wrap.array());
    }

    public final double d(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (g instanceof String) {
            return Double.parseDouble((String) g);
        }
        if (g instanceof long[]) {
            if (((long[]) g).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g instanceof int[]) {
            if (((int[]) g).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g instanceof cf6[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        cf6[] cf6VarArr = (cf6[]) g;
        if (cf6VarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        cf6 cf6Var = cf6VarArr[0];
        return cf6Var.a / cf6Var.b;
    }

    public final int e(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (g instanceof String) {
            return Integer.parseInt((String) g);
        }
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) {
        Object g = g(byteOrder);
        if (g == null) {
            return null;
        }
        if (g instanceof String) {
            return (String) g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (g instanceof long[]) {
            long[] jArr = (long[]) g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
            }
            return sb.toString();
        }
        if (g instanceof int[]) {
            int[] iArr = (int[]) g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
            }
            return sb.toString();
        }
        if (g instanceof double[]) {
            double[] dArr = (double[]) g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
            }
            return sb.toString();
        }
        if (!(g instanceof cf6[])) {
            return null;
        }
        cf6[] cf6VarArr = (cf6[]) g;
        while (i < cf6VarArr.length) {
            sb.append(cf6VarArr[i].a);
            sb.append('/');
            sb.append(cf6VarArr[i].b);
            i++;
            if (i != cf6VarArr.length) {
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:82|(2:84|(2:85|(2:87|(2:90|91)(1:89))(2:92|93)))|94|(2:96|(6:105|106|107|108|109|110)(3:98|(2:100|101)(2:103|104)|102))|113|107|108|109|110) */
    /* JADX WARN: Type inference failed for: r11v11, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r11v13, types: [cf6[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v14, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v15, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v16, types: [cf6[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v17, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v18, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(ByteOrder byteOrder) {
        ze6 ze6Var;
        byte b;
        byte[] bArr = this.d;
        ze6 ze6Var2 = null;
        try {
            ze6Var = new ze6(bArr);
        } catch (IOException unused) {
            ze6Var = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ze6Var.c = byteOrder;
            int i = this.a;
            int i2 = 0;
            int i3 = this.b;
            switch (i) {
                case 1:
                case 6:
                    if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                        String str = new String(bArr, ef6.Q);
                        try {
                            ze6Var.close();
                        } catch (IOException unused2) {
                        }
                        return str;
                    }
                    String str2 = new String(new char[]{(char) (b + 48)});
                    try {
                        ze6Var.close();
                    } catch (IOException unused3) {
                    }
                    return str2;
                case 2:
                case 7:
                    if (i3 >= ef6.I.length) {
                        int i4 = 0;
                        while (true) {
                            byte[] bArr2 = ef6.I;
                            if (i4 >= bArr2.length) {
                                i2 = bArr2.length;
                            } else if (bArr[i4] == bArr2[i4]) {
                                i4++;
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    while (i2 < i3) {
                        byte b2 = bArr[i2];
                        if (b2 == 0) {
                            String sb2 = sb.toString();
                            ze6Var.close();
                            return sb2;
                        }
                        if (b2 >= 32) {
                            sb.append((char) b2);
                        } else {
                            sb.append('?');
                        }
                        i2++;
                    }
                    String sb22 = sb.toString();
                    ze6Var.close();
                    return sb22;
                case 3:
                    ?? r11 = new int[i3];
                    while (i2 < i3) {
                        r11[i2] = ze6Var.readUnsignedShort();
                        i2++;
                    }
                    try {
                        ze6Var.close();
                    } catch (IOException unused4) {
                    }
                    return r11;
                case 4:
                    ?? r112 = new long[i3];
                    while (i2 < i3) {
                        r112[i2] = ze6Var.readInt() & 4294967295L;
                        i2++;
                    }
                    try {
                        ze6Var.close();
                    } catch (IOException unused5) {
                    }
                    return r112;
                case 5:
                    ?? r113 = new cf6[i3];
                    while (i2 < i3) {
                        r113[i2] = new cf6(ze6Var.readInt() & 4294967295L, ze6Var.readInt() & 4294967295L);
                        i2++;
                    }
                    try {
                        ze6Var.close();
                    } catch (IOException unused6) {
                    }
                    return r113;
                case 8:
                    ?? r114 = new int[i3];
                    while (i2 < i3) {
                        r114[i2] = ze6Var.readShort();
                        i2++;
                    }
                    try {
                        ze6Var.close();
                    } catch (IOException unused7) {
                    }
                    return r114;
                case 9:
                    ?? r115 = new int[i3];
                    while (i2 < i3) {
                        r115[i2] = ze6Var.readInt();
                        i2++;
                    }
                    try {
                        ze6Var.close();
                    } catch (IOException unused8) {
                    }
                    return r115;
                case 10:
                    ?? r116 = new cf6[i3];
                    while (i2 < i3) {
                        r116[i2] = new cf6(ze6Var.readInt(), ze6Var.readInt());
                        i2++;
                    }
                    try {
                        ze6Var.close();
                    } catch (IOException unused9) {
                    }
                    return r116;
                case 11:
                    ?? r117 = new double[i3];
                    while (i2 < i3) {
                        r117[i2] = ze6Var.readFloat();
                        i2++;
                    }
                    try {
                        ze6Var.close();
                    } catch (IOException unused10) {
                    }
                    return r117;
                case 12:
                    ?? r118 = new double[i3];
                    while (i2 < i3) {
                        r118[i2] = ze6Var.readDouble();
                        i2++;
                    }
                    try {
                        ze6Var.close();
                    } catch (IOException unused11) {
                    }
                    return r118;
                default:
                    try {
                        ze6Var.close();
                    } catch (IOException unused12) {
                    }
                    return null;
            }
        } catch (IOException unused13) {
            if (ze6Var != null) {
                try {
                    ze6Var.close();
                } catch (IOException unused14) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            ze6Var2 = ze6Var;
            if (ze6Var2 != null) {
                try {
                    ze6Var2.close();
                } catch (IOException unused15) {
                }
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(ef6.G[this.a]);
        sb.append(", data length:");
        return fc6.h(this.d.length, ")", sb);
    }

    public af6(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }
}
