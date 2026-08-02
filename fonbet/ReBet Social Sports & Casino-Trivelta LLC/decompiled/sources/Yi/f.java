package Yi;

import java.util.Hashtable;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.q;
import org.spongycastle.crypto.v;

/* loaded from: classes5.dex */
public class f implements v {

    /* renamed from: f, reason: collision with root package name */
    public static Hashtable f14296f;

    /* renamed from: a, reason: collision with root package name */
    public o f14297a;

    /* renamed from: b, reason: collision with root package name */
    public int f14298b;

    /* renamed from: c, reason: collision with root package name */
    public int f14299c;

    /* renamed from: d, reason: collision with root package name */
    public Aj.d f14300d;

    /* renamed from: e, reason: collision with root package name */
    public Aj.d f14301e;
    private byte[] inputPad;
    private byte[] outputBuf;

    static {
        Hashtable hashtable = new Hashtable();
        f14296f = hashtable;
        hashtable.put("GOST3411", Aj.c.b(32));
        f14296f.put("MD2", Aj.c.b(16));
        f14296f.put("MD4", Aj.c.b(64));
        f14296f.put("MD5", Aj.c.b(64));
        f14296f.put("RIPEMD128", Aj.c.b(64));
        f14296f.put("RIPEMD160", Aj.c.b(64));
        f14296f.put(McElieceCCA2KeyGenParameterSpec.SHA1, Aj.c.b(64));
        f14296f.put(McElieceCCA2KeyGenParameterSpec.SHA224, Aj.c.b(64));
        f14296f.put("SHA-256", Aj.c.b(64));
        f14296f.put(McElieceCCA2KeyGenParameterSpec.SHA384, Aj.c.b(128));
        f14296f.put("SHA-512", Aj.c.b(128));
        f14296f.put("Tiger", Aj.c.b(64));
        f14296f.put("Whirlpool", Aj.c.b(64));
    }

    public f(o oVar) {
        this(oVar, b(oVar));
    }

    public static int b(o oVar) {
        if (oVar instanceof q) {
            return ((q) oVar).getByteLength();
        }
        Integer num = (Integer) f14296f.get(oVar.getAlgorithmName());
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("unknown digest passed: " + oVar.getAlgorithmName());
    }

    public static void c(byte[] bArr, int i10, byte b10) {
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ b10);
        }
    }

    @Override // org.spongycastle.crypto.v
    public void a(org.spongycastle.crypto.j jVar) {
        byte[] bArr;
        this.f14297a.reset();
        byte[] a10 = ((w) jVar).a();
        int length = a10.length;
        if (length > this.f14299c) {
            this.f14297a.update(a10, 0, length);
            this.f14297a.doFinal(this.inputPad, 0);
            length = this.f14298b;
        } else {
            System.arraycopy(a10, 0, this.inputPad, 0, length);
        }
        while (true) {
            bArr = this.inputPad;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.outputBuf, 0, this.f14299c);
        c(this.inputPad, this.f14299c, (byte) 54);
        c(this.outputBuf, this.f14299c, (byte) 92);
        o oVar = this.f14297a;
        if (oVar instanceof Aj.d) {
            Aj.d copy = ((Aj.d) oVar).copy();
            this.f14301e = copy;
            ((o) copy).update(this.outputBuf, 0, this.f14299c);
        }
        o oVar2 = this.f14297a;
        byte[] bArr2 = this.inputPad;
        oVar2.update(bArr2, 0, bArr2.length);
        o oVar3 = this.f14297a;
        if (oVar3 instanceof Aj.d) {
            this.f14300d = ((Aj.d) oVar3).copy();
        }
    }

    @Override // org.spongycastle.crypto.v
    public int doFinal(byte[] bArr, int i10) {
        this.f14297a.doFinal(this.outputBuf, this.f14299c);
        Aj.d dVar = this.f14301e;
        if (dVar != null) {
            ((Aj.d) this.f14297a).a(dVar);
            o oVar = this.f14297a;
            oVar.update(this.outputBuf, this.f14299c, oVar.getDigestSize());
        } else {
            o oVar2 = this.f14297a;
            byte[] bArr2 = this.outputBuf;
            oVar2.update(bArr2, 0, bArr2.length);
        }
        int doFinal = this.f14297a.doFinal(bArr, i10);
        int i11 = this.f14299c;
        while (true) {
            byte[] bArr3 = this.outputBuf;
            if (i11 >= bArr3.length) {
                break;
            }
            bArr3[i11] = 0;
            i11++;
        }
        Aj.d dVar2 = this.f14300d;
        if (dVar2 != null) {
            ((Aj.d) this.f14297a).a(dVar2);
            return doFinal;
        }
        o oVar3 = this.f14297a;
        byte[] bArr4 = this.inputPad;
        oVar3.update(bArr4, 0, bArr4.length);
        return doFinal;
    }

    @Override // org.spongycastle.crypto.v
    public String getAlgorithmName() {
        return this.f14297a.getAlgorithmName() + "/HMAC";
    }

    @Override // org.spongycastle.crypto.v
    public int getMacSize() {
        return this.f14298b;
    }

    @Override // org.spongycastle.crypto.v
    public void reset() {
        this.f14297a.reset();
        o oVar = this.f14297a;
        byte[] bArr = this.inputPad;
        oVar.update(bArr, 0, bArr.length);
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte b10) {
        this.f14297a.update(b10);
    }

    public f(o oVar, int i10) {
        this.f14297a = oVar;
        int digestSize = oVar.getDigestSize();
        this.f14298b = digestSize;
        this.f14299c = i10;
        this.inputPad = new byte[i10];
        this.outputBuf = new byte[i10 + digestSize];
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte[] bArr, int i10, int i11) {
        this.f14297a.update(bArr, i10, i11);
    }
}
