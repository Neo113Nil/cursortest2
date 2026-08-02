package org.spongycastle.jcajce.provider.asymmetric.util;

import Aj.h;
import com.plaid.internal.EnumC3631g;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.crypto.m;
import org.spongycastle.crypto.params.AbstractC5976c;
import org.spongycastle.crypto.params.v;

/* loaded from: classes5.dex */
public abstract class BaseAgreementSpi extends KeyAgreementSpi {
    private static final Map<String, C5936n> defaultOids;
    private static final Hashtable des;
    private static final Map<String, Integer> keySizes;
    private static final Map<String, String> nameTable;
    private static final Hashtable oids;
    private final String kaAlgorithm;
    private final m kdf;
    protected byte[] ukmParameters;

    static {
        HashMap hashMap = new HashMap();
        defaultOids = hashMap;
        HashMap hashMap2 = new HashMap();
        keySizes = hashMap2;
        HashMap hashMap3 = new HashMap();
        nameTable = hashMap3;
        Hashtable hashtable = new Hashtable();
        oids = hashtable;
        Hashtable hashtable2 = new Hashtable();
        des = hashtable2;
        Integer b10 = Aj.c.b(64);
        Integer b11 = Aj.c.b(128);
        Integer b12 = Aj.c.b(192);
        Integer b13 = Aj.c.b(256);
        hashMap2.put("DES", b10);
        hashMap2.put("DESEDE", b12);
        hashMap2.put("BLOWFISH", b11);
        hashMap2.put("AES", b13);
        hashMap2.put(Ii.b.f5838t.o(), b11);
        hashMap2.put(Ii.b.f5785B.o(), b12);
        hashMap2.put(Ii.b.f5793J.o(), b13);
        hashMap2.put(Ii.b.f5839u.o(), b11);
        hashMap2.put(Ii.b.f5786C.o(), b12);
        C5936n c5936n = Ii.b.f5794K;
        hashMap2.put(c5936n.o(), b13);
        hashMap2.put(Ii.b.f5841w.o(), b11);
        hashMap2.put(Ii.b.f5788E.o(), b12);
        hashMap2.put(Ii.b.f5796M.o(), b13);
        hashMap2.put(Ii.b.f5840v.o(), b11);
        hashMap2.put(Ii.b.f5787D.o(), b12);
        hashMap2.put(Ii.b.f5795L.o(), b13);
        C5936n c5936n2 = Ii.b.f5842x;
        hashMap2.put(c5936n2.o(), b11);
        hashMap2.put(Ii.b.f5789F.o(), b12);
        hashMap2.put(Ii.b.f5797N.o(), b13);
        C5936n c5936n3 = Ii.b.f5844z;
        hashMap2.put(c5936n3.o(), b11);
        hashMap2.put(Ii.b.f5791H.o(), b12);
        hashMap2.put(Ii.b.f5799P.o(), b13);
        hashMap2.put(Ii.b.f5843y.o(), b11);
        hashMap2.put(Ii.b.f5790G.o(), b12);
        hashMap2.put(Ii.b.f5798O.o(), b13);
        C5936n c5936n4 = Ji.a.f6179d;
        hashMap2.put(c5936n4.o(), b11);
        C5936n c5936n5 = Ji.a.f6180e;
        hashMap2.put(c5936n5.o(), b12);
        C5936n c5936n6 = Ji.a.f6181f;
        hashMap2.put(c5936n6.o(), b13);
        C5936n c5936n7 = Gi.a.f4222d;
        hashMap2.put(c5936n7.o(), b11);
        C5936n c5936n8 = Li.f.f7265P2;
        hashMap2.put(c5936n8.o(), b12);
        C5936n c5936n9 = Li.f.f7221B0;
        hashMap2.put(c5936n9.o(), b12);
        C5936n c5936n10 = Ki.b.f6654e;
        hashMap2.put(c5936n10.o(), b10);
        C5936n c5936n11 = Li.f.f7242I0;
        hashMap2.put(c5936n11.o(), Aj.c.b(EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE));
        C5936n c5936n12 = Li.f.f7248K0;
        hashMap2.put(c5936n12.o(), b13);
        C5936n c5936n13 = Li.f.f7251L0;
        hashMap2.put(c5936n13.o(), Aj.c.b(384));
        C5936n c5936n14 = Li.f.f7254M0;
        hashMap2.put(c5936n14.o(), Aj.c.b(512));
        hashMap.put("DESEDE", c5936n9);
        hashMap.put("AES", c5936n);
        C5936n c5936n15 = Ji.a.f6178c;
        hashMap.put("CAMELLIA", c5936n15);
        C5936n c5936n16 = Gi.a.f4219a;
        hashMap.put("SEED", c5936n16);
        hashMap.put("DES", c5936n10);
        hashMap3.put(Hi.a.f5008u.o(), "CAST5");
        hashMap3.put(Hi.a.f5009v.o(), "IDEA");
        hashMap3.put(Hi.a.f5012y.o(), "Blowfish");
        hashMap3.put(Hi.a.f5013z.o(), "Blowfish");
        hashMap3.put(Hi.a.f4981A.o(), "Blowfish");
        hashMap3.put(Hi.a.f4982B.o(), "Blowfish");
        hashMap3.put(Ki.b.f6653d.o(), "DES");
        hashMap3.put(c5936n10.o(), "DES");
        hashMap3.put(Ki.b.f6656g.o(), "DES");
        hashMap3.put(Ki.b.f6655f.o(), "DES");
        hashMap3.put(Ki.b.f6657h.o(), "DESede");
        hashMap3.put(c5936n9.o(), "DESede");
        hashMap3.put(c5936n8.o(), "DESede");
        hashMap3.put(Li.f.f7268Q2.o(), "RC2");
        hashMap3.put(c5936n11.o(), "HmacSHA1");
        hashMap3.put(Li.f.f7245J0.o(), "HmacSHA224");
        hashMap3.put(c5936n12.o(), "HmacSHA256");
        hashMap3.put(c5936n13.o(), "HmacSHA384");
        hashMap3.put(c5936n14.o(), "HmacSHA512");
        hashMap3.put(Ji.a.f6176a.o(), "Camellia");
        hashMap3.put(Ji.a.f6177b.o(), "Camellia");
        hashMap3.put(c5936n15.o(), "Camellia");
        hashMap3.put(c5936n4.o(), "Camellia");
        hashMap3.put(c5936n5.o(), "Camellia");
        hashMap3.put(c5936n6.o(), "Camellia");
        hashMap3.put(c5936n7.o(), "SEED");
        hashMap3.put(c5936n16.o(), "SEED");
        hashMap3.put(Gi.a.f4220b.o(), "SEED");
        hashMap3.put(Ei.a.f3112d.o(), "GOST28147");
        hashMap3.put(c5936n2.o(), "AES");
        hashMap3.put(c5936n3.o(), "AES");
        hashMap3.put(c5936n3.o(), "AES");
        hashtable.put("DESEDE", c5936n9);
        hashtable.put("AES", c5936n);
        hashtable.put("DES", c5936n10);
        hashtable2.put("DES", "DES");
        hashtable2.put("DESEDE", "DES");
        hashtable2.put(c5936n10.o(), "DES");
        hashtable2.put(c5936n9.o(), "DES");
        hashtable2.put(c5936n8.o(), "DES");
    }

    public BaseAgreementSpi(String str, m mVar) {
        this.kaAlgorithm = str;
        this.kdf = mVar;
    }

    public static String getAlgorithm(String str) {
        if (str.indexOf(91) > 0) {
            return str.substring(0, str.indexOf(91));
        }
        if (str.startsWith(Ii.b.f5837s.o())) {
            return "AES";
        }
        if (str.startsWith(Fi.a.f3704i.o())) {
            return "Serpent";
        }
        String str2 = nameTable.get(h.k(str));
        return str2 != null ? str2 : str;
    }

    public static int getKeySize(String str) {
        if (str.indexOf(91) > 0) {
            return Integer.parseInt(str.substring(str.indexOf(91) + 1, str.indexOf(93)));
        }
        String k10 = h.k(str);
        Map<String, Integer> map = keySizes;
        if (map.containsKey(k10)) {
            return map.get(k10).intValue();
        }
        return -1;
    }

    public static byte[] trimZeroes(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int i10 = 0;
        while (i10 < bArr.length && bArr[i10] == 0) {
            i10++;
        }
        int length = bArr.length - i10;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i10, bArr2, 0, length);
        return bArr2;
    }

    public abstract byte[] calcSecret();

    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() {
        if (this.kdf == null) {
            return calcSecret();
        }
        throw new UnsupportedOperationException("KDF can only be used when algorithm is known");
    }

    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i10) {
        byte[] engineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i10 >= engineGenerateSecret.length) {
            System.arraycopy(engineGenerateSecret, 0, bArr, i10, engineGenerateSecret.length);
            return engineGenerateSecret.length;
        }
        throw new ShortBufferException(this.kaAlgorithm + " key agreement: need " + engineGenerateSecret.length + " bytes");
    }

    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) {
        byte[] calcSecret = calcSecret();
        String k10 = h.k(str);
        Hashtable hashtable = oids;
        String o10 = hashtable.containsKey(k10) ? ((C5936n) hashtable.get(k10)).o() : str;
        int keySize = getKeySize(o10);
        m mVar = this.kdf;
        if (mVar != null) {
            if (keySize >= 0) {
                int i10 = keySize / 8;
                byte[] bArr = new byte[i10];
                if (mVar instanceof Ui.c) {
                    try {
                        this.kdf.a(new Ui.b(new C5936n(o10), keySize, calcSecret, this.ukmParameters));
                    } catch (IllegalArgumentException unused) {
                        throw new NoSuchAlgorithmException("no OID for algorithm: " + o10);
                    }
                } else {
                    this.kdf.a(new v(calcSecret, this.ukmParameters));
                }
                this.kdf.generateBytes(bArr, 0, i10);
                calcSecret = bArr;
            } else {
                throw new NoSuchAlgorithmException("unknown algorithm encountered: " + o10);
            }
        } else if (keySize > 0) {
            int i11 = keySize / 8;
            byte[] bArr2 = new byte[i11];
            System.arraycopy(calcSecret, 0, bArr2, 0, i11);
            calcSecret = bArr2;
        }
        String algorithm = getAlgorithm(str);
        if (des.containsKey(algorithm)) {
            AbstractC5976c.c(calcSecret);
        }
        return new SecretKeySpec(calcSecret, algorithm);
    }
}
