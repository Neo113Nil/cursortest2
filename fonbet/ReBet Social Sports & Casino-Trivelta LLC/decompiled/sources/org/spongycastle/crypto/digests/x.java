package org.spongycastle.crypto.digests;

import com.plaid.internal.EnumC3631g;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.spongycastle.crypto.engines.Q;
import org.spongycastle.crypto.params.G;

/* loaded from: classes5.dex */
public class x implements Aj.d {

    /* renamed from: d, reason: collision with root package name */
    public static final Hashtable f62431d = new Hashtable();

    /* renamed from: a, reason: collision with root package name */
    public final Q f62432a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62433b;

    /* renamed from: c, reason: collision with root package name */
    public final c f62434c;
    long[] chain;
    private long[] initialState;
    private byte[] key;
    private b[] postMessageParameters;
    private b[] preMessageParameters;
    private final byte[] singleByte;

    public static class a {
        private byte[] bytes;

        public a(long j10) {
            byte[] bArr = new byte[32];
            this.bytes = bArr;
            bArr[0] = 83;
            bArr[1] = 72;
            bArr[2] = 65;
            bArr[3] = 51;
            bArr[4] = 1;
            bArr[5] = 0;
            Q.l(j10, bArr, 8);
        }

        public byte[] a() {
            return this.bytes;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f62435a;
        private byte[] value;

        public b(int i10, byte[] bArr) {
            this.f62435a = i10;
            this.value = bArr;
        }

        public int a() {
            return this.f62435a;
        }

        public byte[] b() {
            return this.value;
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f62436a = new d();

        /* renamed from: b, reason: collision with root package name */
        public int f62437b;
        private byte[] currentBlock;
        private long[] message;

        public c(int i10) {
            byte[] bArr = new byte[i10];
            this.currentBlock = bArr;
            this.message = new long[bArr.length / 8];
        }

        public void a(long[] jArr) {
            int i10 = this.f62437b;
            while (true) {
                byte[] bArr = this.currentBlock;
                if (i10 >= bArr.length) {
                    this.f62436a.h(true);
                    b(jArr);
                    return;
                } else {
                    bArr[i10] = 0;
                    i10++;
                }
            }
        }

        public final void b(long[] jArr) {
            long[] jArr2;
            x xVar = x.this;
            xVar.f62432a.g(true, xVar.chain, this.f62436a.c());
            int i10 = 0;
            while (true) {
                jArr2 = this.message;
                if (i10 >= jArr2.length) {
                    break;
                }
                jArr2[i10] = Q.f(this.currentBlock, i10 * 8);
                i10++;
            }
            x.this.f62432a.h(jArr2, jArr);
            for (int i11 = 0; i11 < jArr.length; i11++) {
                jArr[i11] = jArr[i11] ^ this.message[i11];
            }
        }

        public void c(int i10) {
            this.f62436a.f();
            this.f62436a.j(i10);
            this.f62437b = 0;
        }

        public void d(c cVar) {
            this.currentBlock = Aj.a.e(cVar.currentBlock, this.currentBlock);
            this.f62437b = cVar.f62437b;
            this.message = Aj.a.i(cVar.message, this.message);
            this.f62436a.g(cVar.f62436a);
        }

        public void e(byte[] bArr, int i10, int i11, long[] jArr) {
            int i12 = 0;
            while (i11 > i12) {
                if (this.f62437b == this.currentBlock.length) {
                    b(jArr);
                    this.f62436a.i(false);
                    this.f62437b = 0;
                }
                int min = Math.min(i11 - i12, this.currentBlock.length - this.f62437b);
                System.arraycopy(bArr, i10 + i12, this.currentBlock, this.f62437b, min);
                i12 += min;
                this.f62437b += min;
                this.f62436a.a(min);
            }
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f62439a;
        private long[] tweak = new long[2];

        public d() {
            f();
        }

        public void a(int i10) {
            if (!this.f62439a) {
                long[] jArr = this.tweak;
                long j10 = jArr[0] + i10;
                jArr[0] = j10;
                if (j10 > 9223372034707292160L) {
                    this.f62439a = true;
                    return;
                }
                return;
            }
            long[] jArr2 = new long[3];
            long[] jArr3 = this.tweak;
            jArr2[0] = jArr3[0] & BodyPartID.bodyIdMax;
            jArr2[1] = (jArr3[0] >>> 32) & BodyPartID.bodyIdMax;
            jArr2[2] = jArr3[1] & BodyPartID.bodyIdMax;
            long j11 = i10;
            for (int i11 = 0; i11 < 3; i11++) {
                long j12 = j11 + jArr2[i11];
                jArr2[i11] = j12;
                j11 = j12 >>> 32;
            }
            long[] jArr4 = this.tweak;
            jArr4[0] = ((jArr2[1] & BodyPartID.bodyIdMax) << 32) | (jArr2[0] & BodyPartID.bodyIdMax);
            jArr4[1] = (jArr2[2] & BodyPartID.bodyIdMax) | (jArr4[1] & (-4294967296L));
        }

        public int b() {
            return (int) ((this.tweak[1] >>> 56) & 63);
        }

        public long[] c() {
            return this.tweak;
        }

        public boolean d() {
            return (this.tweak[1] & Long.MIN_VALUE) != 0;
        }

        public boolean e() {
            return (this.tweak[1] & 4611686018427387904L) != 0;
        }

        public void f() {
            long[] jArr = this.tweak;
            jArr[0] = 0;
            jArr[1] = 0;
            this.f62439a = false;
            i(true);
        }

        public void g(d dVar) {
            this.tweak = Aj.a.i(dVar.tweak, this.tweak);
            this.f62439a = dVar.f62439a;
        }

        public void h(boolean z10) {
            if (z10) {
                long[] jArr = this.tweak;
                jArr[1] = jArr[1] | Long.MIN_VALUE;
            } else {
                long[] jArr2 = this.tweak;
                jArr2[1] = jArr2[1] & LongCompanionObject.MAX_VALUE;
            }
        }

        public void i(boolean z10) {
            if (z10) {
                long[] jArr = this.tweak;
                jArr[1] = jArr[1] | 4611686018427387904L;
            } else {
                long[] jArr2 = this.tweak;
                jArr2[1] = jArr2[1] & (-4611686018427387905L);
            }
        }

        public void j(int i10) {
            long[] jArr = this.tweak;
            jArr[1] = (jArr[1] & (-274877906944L)) | ((i10 & 63) << 56);
        }

        public String toString() {
            return b() + " first: " + e() + ", final: " + d();
        }
    }

    static {
        k(256, 128, new long[]{-2228972824489528736L, -8629553674646093540L, 1155188648486244218L, -3677226592081559102L});
        k(256, EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, new long[]{1450197650740764312L, 3081844928540042640L, -3136097061834271170L, 3301952811952417661L});
        k(256, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE, new long[]{-4176654842910610933L, -8688192972455077604L, -7364642305011795836L, 4056579644589979102L});
        k(256, 256, new long[]{-243853671043386295L, 3443677322885453875L, -5531612722399640561L, 7662005193972177513L});
        k(512, 128, new long[]{-6288014694233956526L, 2204638249859346602L, 3502419045458743507L, -4829063503441264548L, 983504137758028059L, 1880512238245786339L, -6715892782214108542L, 7602827311880509485L});
        k(512, EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, new long[]{2934123928682216849L, -4399710721982728305L, 1684584802963255058L, 5744138295201861711L, 2444857010922934358L, -2807833639722848072L, -5121587834665610502L, 118355523173251694L});
        k(512, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE, new long[]{-3688341020067007964L, -3772225436291745297L, -8300862168937575580L, 4146387520469897396L, 1106145742801415120L, 7455425944880474941L, -7351063101234211863L, -7048981346965512457L});
        k(512, 384, new long[]{-6631894876634615969L, -5692838220127733084L, -7099962856338682626L, -2911352911530754598L, 2000907093792408677L, 9140007292425499655L, 6093301768906360022L, 2769176472213098488L});
        k(512, 512, new long[]{5261240102383538638L, 978932832955457283L, -8083517948103779378L, -7339365279355032399L, 6752626034097301424L, -1531723821829733388L, -7417126464950782685L, -5901786942805128141L});
    }

    public x(int i10, int i11) {
        this.singleByte = new byte[1];
        if (i11 % 8 != 0) {
            throw new IllegalArgumentException("Output size must be a multiple of 8 bits. :" + i11);
        }
        this.f62433b = i11 / 8;
        Q q10 = new Q(i10);
        this.f62432a = q10;
        this.f62434c = new c(q10.getBlockSize());
    }

    public static b[] c(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null) {
            return null;
        }
        if (bVarArr2 == null || bVarArr2.length != bVarArr.length) {
            bVarArr2 = new b[bVarArr.length];
        }
        System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr2.length);
        return bVarArr2;
    }

    public static void k(int i10, int i11, long[] jArr) {
        f62431d.put(t(i10 / 8, i11 / 8), jArr);
    }

    public static void n(b[] bVarArr) {
        if (bVarArr == null) {
            return;
        }
        for (int i10 = 1; i10 < bVarArr.length; i10++) {
            b bVar = bVarArr[i10];
            int i11 = i10;
            while (i11 > 0) {
                int i12 = i11 - 1;
                if (bVar.a() < bVarArr[i12].a()) {
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
            }
            bVarArr[i11] = bVar;
        }
    }

    public static Integer t(int i10, int i11) {
        return new Integer(i10 | (i11 << 16));
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        x xVar = (x) dVar;
        if (g() != xVar.g() || this.f62433b != xVar.f62433b) {
            throw new IllegalArgumentException("Incompatible parameters in provided SkeinEngine.");
        }
        d(xVar);
    }

    public final void b() {
        if (this.f62434c == null) {
            throw new IllegalArgumentException("Skein engine is not initialised.");
        }
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new x(this);
    }

    public final void d(x xVar) {
        this.f62434c.d(xVar.f62434c);
        this.chain = Aj.a.i(xVar.chain, this.chain);
        this.initialState = Aj.a.i(xVar.initialState, this.initialState);
        this.key = Aj.a.e(xVar.key, this.key);
        this.preMessageParameters = c(xVar.preMessageParameters, this.preMessageParameters);
        this.postMessageParameters = c(xVar.postMessageParameters, this.postMessageParameters);
    }

    public final void e() {
        long[] jArr = (long[]) f62431d.get(t(g(), h()));
        int i10 = 0;
        if (this.key != null || jArr == null) {
            this.chain = new long[g() / 8];
            byte[] bArr = this.key;
            if (bArr != null) {
                o(0, bArr);
            }
            o(4, new a(this.f62433b * 8).a());
        } else {
            this.chain = Aj.a.h(jArr);
        }
        if (this.preMessageParameters != null) {
            while (true) {
                b[] bVarArr = this.preMessageParameters;
                if (i10 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i10];
                o(bVar.a(), bVar.b());
                i10++;
            }
        }
        this.initialState = Aj.a.h(this.chain);
    }

    public int f(byte[] bArr, int i10) {
        b();
        if (bArr.length < this.f62433b + i10) {
            throw new org.spongycastle.crypto.l("Output buffer is too short to hold output");
        }
        p();
        if (this.postMessageParameters != null) {
            int i11 = 0;
            while (true) {
                b[] bVarArr = this.postMessageParameters;
                if (i11 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i11];
                o(bVar.a(), bVar.b());
                i11++;
            }
        }
        int g10 = g();
        int i12 = ((this.f62433b + g10) - 1) / g10;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i13 * g10;
            l(i13, bArr, i10 + i14, Math.min(g10, this.f62433b - i14));
        }
        m();
        return this.f62433b;
    }

    public int g() {
        return this.f62432a.getBlockSize();
    }

    public int h() {
        return this.f62433b;
    }

    public void i(G g10) {
        this.chain = null;
        this.key = null;
        this.preMessageParameters = null;
        this.postMessageParameters = null;
        if (g10 != null) {
            if (g10.a().length < 16) {
                throw new IllegalArgumentException("Skein key must be at least 128 bits.");
            }
            j(g10.b());
        }
        e();
        q(48);
    }

    public final void j(Hashtable hashtable) {
        Enumeration keys = hashtable.keys();
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            byte[] bArr = (byte[]) hashtable.get(num);
            if (num.intValue() == 0) {
                this.key = bArr;
            } else if (num.intValue() < 48) {
                vector.addElement(new b(num.intValue(), bArr));
            } else {
                vector2.addElement(new b(num.intValue(), bArr));
            }
        }
        b[] bVarArr = new b[vector.size()];
        this.preMessageParameters = bVarArr;
        vector.copyInto(bVarArr);
        n(this.preMessageParameters);
        b[] bVarArr2 = new b[vector2.size()];
        this.postMessageParameters = bVarArr2;
        vector2.copyInto(bVarArr2);
        n(this.postMessageParameters);
    }

    public final void l(long j10, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        Q.l(j10, bArr2, 0);
        long[] jArr = new long[this.chain.length];
        q(63);
        this.f62434c.e(bArr2, 0, 8, jArr);
        this.f62434c.a(jArr);
        int i12 = (i11 + 7) / 8;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i13 * 8;
            int min = Math.min(8, i11 - i14);
            if (min == 8) {
                Q.l(jArr[i13], bArr, i14 + i10);
            } else {
                Q.l(jArr[i13], bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i14 + i10, min);
            }
        }
    }

    public void m() {
        long[] jArr = this.initialState;
        long[] jArr2 = this.chain;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        q(48);
    }

    public final void o(int i10, byte[] bArr) {
        q(i10);
        this.f62434c.e(bArr, 0, bArr.length, this.chain);
        p();
    }

    public final void p() {
        this.f62434c.a(this.chain);
    }

    public final void q(int i10) {
        this.f62434c.c(i10);
    }

    public void r(byte b10) {
        byte[] bArr = this.singleByte;
        bArr[0] = b10;
        s(bArr, 0, 1);
    }

    public void s(byte[] bArr, int i10, int i11) {
        b();
        this.f62434c.e(bArr, i10, i11, this.chain);
    }

    public x(x xVar) {
        this(xVar.g() * 8, xVar.h() * 8);
        d(xVar);
    }
}
