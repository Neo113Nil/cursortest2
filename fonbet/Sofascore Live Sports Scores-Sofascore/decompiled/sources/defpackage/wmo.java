package defpackage;

import com.google.android.gms.internal.ads.zzhmp;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class wmo {
    public static final long[] a;
    public static final long[] b;
    public static final long[] c;
    public static final tmo[][] d;
    public static final tmo[] e;
    public static final BigInteger f;
    public static final BigInteger g;
    public static final BigInteger h;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        h = mod2;
        BigInteger valueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger modPow = valueOf.modPow(subtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), subtract);
        f0o f0oVar = new f0o(21);
        BigInteger mod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        f0oVar.c = mod3;
        BigInteger multiply = mod3.pow(2).subtract(bigInteger).multiply(mod.multiply(mod3.pow(2)).add(bigInteger).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        f0oVar.b = modPow2;
        a = zzhmp.g(b(mod));
        b = zzhmp.g(b(mod2));
        c = zzhmp.g(b(modPow));
        d = (tmo[][]) Array.newInstance((Class<?>) tmo.class, 32, 8);
        f0o f0oVar2 = f0oVar;
        for (int i = 0; i < 32; i++) {
            f0o f0oVar3 = f0oVar2;
            for (int i2 = 0; i2 < 8; i2++) {
                d[i][i2] = c(f0oVar3);
                f0oVar3 = a(f0oVar3, f0oVar2);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                f0oVar2 = a(f0oVar2, f0oVar2);
            }
        }
        f0o a2 = a(f0oVar, f0oVar);
        e = new tmo[8];
        for (int i4 = 0; i4 < 8; i4++) {
            e[i4] = c(f0oVar);
            f0oVar = a(f0oVar, a2);
        }
    }

    public static f0o a(f0o f0oVar, f0o f0oVar2) {
        f0o f0oVar3 = new f0o(21);
        BigInteger multiply = g.multiply(((BigInteger) f0oVar.b).multiply((BigInteger) f0oVar2.b).multiply((BigInteger) f0oVar.c).multiply((BigInteger) f0oVar2.c));
        BigInteger bigInteger = f;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = ((BigInteger) f0oVar.b).multiply((BigInteger) f0oVar2.c).add(((BigInteger) f0oVar2.b).multiply((BigInteger) f0oVar.c));
        BigInteger bigInteger2 = BigInteger.ONE;
        f0oVar3.b = add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger);
        f0oVar3.c = ((BigInteger) f0oVar.c).multiply((BigInteger) f0oVar2.c).add(((BigInteger) f0oVar.b).multiply((BigInteger) f0oVar2.b)).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return f0oVar3;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b2 = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }

    public static tmo c(f0o f0oVar) {
        BigInteger add = ((BigInteger) f0oVar.c).add((BigInteger) f0oVar.b);
        BigInteger bigInteger = f;
        return new tmo(zzhmp.g(b(add.mod(bigInteger))), zzhmp.g(b(((BigInteger) f0oVar.c).subtract((BigInteger) f0oVar.b).mod(bigInteger))), zzhmp.g(b(h.multiply((BigInteger) f0oVar.b).multiply((BigInteger) f0oVar.c).mod(bigInteger))));
    }
}
