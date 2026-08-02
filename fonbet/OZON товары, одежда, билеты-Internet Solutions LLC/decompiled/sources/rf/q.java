package rf;

import java.math.BigInteger;
import java.net.ProtocolException;
import java.util.ArrayList;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rf.C9263b;
import sf.C9681g;
import sf.C9684j;
import sf.G;
import sf.z;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: h, reason: collision with root package name */
    private static final p f83453h = new p(0, 0, -1, false);

    /* renamed from: a, reason: collision with root package name */
    private final a f83454a;

    /* renamed from: b, reason: collision with root package name */
    private final G f83455b;

    /* renamed from: c, reason: collision with root package name */
    private long f83456c;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f83457d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f83458e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f83459f;

    /* renamed from: g, reason: collision with root package name */
    private p f83460g;

    private static final class a extends sf.q {

        /* renamed from: a, reason: collision with root package name */
        private long f83461a;

        public final long c() {
            return this.f83461a;
        }

        @Override // sf.q, sf.M
        public final long read(@NotNull C9681g sink, long j11) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            long read = delegate().read(sink, j11);
            if (read == -1) {
                return -1L;
            }
            this.f83461a += read;
            return read;
        }
    }

    public q(@NotNull C9681g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source, "source");
        a aVar = new a(source);
        this.f83454a = aVar;
        this.f83455b = z.d(aVar);
        this.f83456c = -1L;
        this.f83457d = new ArrayList();
        this.f83458e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long i() {
        return this.f83454a.c() - this.f83455b.f98667b.size();
    }

    private final long j() {
        long j11 = this.f83456c;
        if (j11 == -1) {
            return -1L;
        }
        return j11 - i();
    }

    private final long u() {
        long j11 = 0;
        while (true) {
            long readByte = this.f83455b.readByte();
            long j12 = 255 & readByte;
            if ((readByte & 128) != 128) {
                return j11 + j12;
            }
            j11 = (j11 + (readByte & 127)) << 7;
        }
    }

    public final Object k() {
        return C7714v.Z(this.f83457d);
    }

    public final p l() {
        long j11;
        p pVar = this.f83460g;
        if (pVar == null) {
            if (pVar != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            long i11 = i();
            long j12 = this.f83456c;
            p pVar2 = f83453h;
            if (i11 != j12) {
                G g10 = this.f83455b;
                if (j12 != -1 || !g10.c()) {
                    byte readByte = g10.readByte();
                    int i12 = readByte & 192;
                    boolean z11 = (readByte & 32) == 32;
                    int i13 = readByte & 31;
                    long u11 = i13 != 31 ? i13 : u();
                    byte readByte2 = g10.readByte();
                    if ((readByte2 & 255) == 128) {
                        throw new ProtocolException("indefinite length not permitted for DER");
                    }
                    if ((readByte2 & 128) == 128) {
                        int i14 = readByte2 & Byte.MAX_VALUE;
                        if (i14 > 8) {
                            throw new ProtocolException("length encoded with more than 8 bytes is not supported");
                        }
                        long readByte3 = g10.readByte();
                        j11 = 255 & readByte3;
                        if (j11 == 0 || (i14 == 1 && (readByte3 & 128) == 0)) {
                            throw new ProtocolException("invalid encoding for length");
                        }
                        for (int i15 = 1; i15 < i14; i15++) {
                            j11 = (g10.readByte() & 255) + (j11 << 8);
                        }
                        if (j11 < 0) {
                            throw new ProtocolException("length > Long.MAX_VALUE");
                        }
                    } else {
                        j11 = readByte2 & Byte.MAX_VALUE;
                    }
                    pVar = new p(i12, u11, j11, z11);
                    this.f83460g = pVar;
                }
            }
            pVar = pVar2;
            this.f83460g = pVar;
        }
        if (pVar.e()) {
            return null;
        }
        return pVar;
    }

    @NotNull
    public final BigInteger m() {
        if (j() != 0) {
            long j11 = j();
            G g10 = this.f83455b;
            g10.r1(j11);
            return new BigInteger(g10.f98667b.v(j11));
        }
        throw new ProtocolException("unexpected length: " + j() + " at " + this);
    }

    @NotNull
    public final k n() {
        if (j() == -1 || this.f83459f) {
            throw new ProtocolException("constructed bit strings not supported for DER");
        }
        if (j() < 1) {
            throw new ProtocolException("malformed bit string");
        }
        G g10 = this.f83455b;
        return new k(g10.readByte() & 255, g10.d(j()));
    }

    public final boolean o() {
        if (j() == 1) {
            return this.f83455b.readByte() != 0;
        }
        throw new ProtocolException("unexpected length: " + j() + " at " + this);
    }

    public final long p() {
        long j11 = 8;
        long j12 = j();
        if (1 > j12 || j11 < j12) {
            throw new ProtocolException("unexpected length: " + j() + " at " + this);
        }
        long readByte = this.f83455b.readByte();
        while (i() < this.f83456c) {
            readByte = (readByte << 8) + (r1.readByte() & 255);
        }
        return readByte;
    }

    @NotNull
    public final String q() {
        C9681g c9681g = new C9681g();
        byte b11 = (byte) 46;
        long u11 = u();
        if (0 <= u11 && 40 > u11) {
            c9681g.l0(0L);
            c9681g.d0(b11);
            c9681g.l0(u11);
        } else if (40 <= u11 && 80 > u11) {
            c9681g.l0(1L);
            c9681g.d0(b11);
            c9681g.l0(u11 - 40);
        } else {
            c9681g.l0(2L);
            c9681g.d0(b11);
            c9681g.l0(u11 - 80);
        }
        while (i() < this.f83456c) {
            c9681g.d0(b11);
            c9681g.l0(u());
        }
        return c9681g.G0();
    }

    @NotNull
    public final C9684j r() {
        if (j() == -1 || this.f83459f) {
            throw new ProtocolException("constructed octet strings not supported for DER");
        }
        return this.f83455b.d(j());
    }

    @NotNull
    public final C9684j s() {
        return this.f83455b.d(j());
    }

    @NotNull
    public final String t() {
        if (j() == -1 || this.f83459f) {
            throw new ProtocolException("constructed strings not supported for DER");
        }
        return this.f83455b.r(j());
    }

    @NotNull
    public final String toString() {
        return C7714v.V(this.f83458e, " / ", null, null, null, 62);
    }

    public final void v(Object obj) {
        this.f83457d.set(r0.size() - 1, obj);
    }

    public final <T> T w(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ArrayList arrayList = this.f83457d;
        arrayList.add(null);
        try {
            return (T) ((C9263b.n.a) block).invoke();
        } finally {
            Ej.b.b(1, arrayList);
        }
    }
}
