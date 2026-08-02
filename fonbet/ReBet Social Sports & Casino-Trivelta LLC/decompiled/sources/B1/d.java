package B1;

import B1.f;
import H1.C1174g;
import H1.C1181n;
import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import H1.O;
import H1.r;
import android.util.SparseArray;
import androidx.media3.common.a;
import b1.AbstractC2335D;
import b1.InterfaceC2358l;
import b2.C2378h;
import com.reactnativecommunity.clipboard.ClipboardModule;
import d2.C3995a;
import e1.AbstractC4134a;
import e1.Z;
import e2.C4166h;
import e2.s;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import n1.G1;

/* loaded from: classes.dex */
public final class d implements r, f {

    /* renamed from: i, reason: collision with root package name */
    public static final b f536i = new b();

    /* renamed from: j, reason: collision with root package name */
    public static final I f537j = new I();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1183p f538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f539b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.a f540c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f541d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public boolean f542e;

    /* renamed from: f, reason: collision with root package name */
    public f.b f543f;

    /* renamed from: g, reason: collision with root package name */
    public long f544g;

    /* renamed from: h, reason: collision with root package name */
    public J f545h;
    private androidx.media3.common.a[] sampleFormats;

    public static final class a implements O {

        /* renamed from: a, reason: collision with root package name */
        public final int f546a;

        /* renamed from: b, reason: collision with root package name */
        public final int f547b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.a f548c;

        /* renamed from: d, reason: collision with root package name */
        public final C1181n f549d = new C1181n();

        /* renamed from: e, reason: collision with root package name */
        public androidx.media3.common.a f550e;

        /* renamed from: f, reason: collision with root package name */
        public O f551f;

        /* renamed from: g, reason: collision with root package name */
        public long f552g;

        public a(int i10, int i11, androidx.media3.common.a aVar) {
            this.f546a = i10;
            this.f547b = i11;
            this.f548c = aVar;
        }

        @Override // H1.O
        public int b(InterfaceC2358l interfaceC2358l, int i10, boolean z10, int i11) {
            return ((O) Z.i(this.f551f)).e(interfaceC2358l, i10, z10);
        }

        @Override // H1.O
        public void c(androidx.media3.common.a aVar) {
            androidx.media3.common.a aVar2 = this.f548c;
            if (aVar2 != null) {
                aVar = aVar.i(aVar2);
            }
            this.f550e = aVar;
            ((O) Z.i(this.f551f)).c(this.f550e);
        }

        @Override // H1.O
        public void f(e1.J j10, int i10, int i11) {
            ((O) Z.i(this.f551f)).a(j10, i10);
        }

        @Override // H1.O
        public void g(long j10, int i10, int i11, int i12, O.a aVar) {
            long j11 = this.f552g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f551f = this.f549d;
            }
            ((O) Z.i(this.f551f)).g(j10, i10, i11, i12, aVar);
        }

        public void h(f.b bVar, long j10) {
            if (bVar == null) {
                this.f551f = this.f549d;
                return;
            }
            this.f552g = j10;
            O c10 = bVar.c(this.f546a, this.f547b);
            this.f551f = c10;
            androidx.media3.common.a aVar = this.f550e;
            if (aVar != null) {
                c10.c(aVar);
            }
        }
    }

    public static final class b implements f.a {

        /* renamed from: a, reason: collision with root package name */
        public s.a f553a = new C4166h();

        /* renamed from: b, reason: collision with root package name */
        public boolean f554b;

        /* renamed from: c, reason: collision with root package name */
        public int f555c;

        @Override // B1.f.a
        public androidx.media3.common.a d(androidx.media3.common.a aVar) {
            String str;
            if (!this.f554b || !this.f553a.a(aVar)) {
                return aVar;
            }
            a.b Y10 = aVar.b().y0("application/x-media3-cues").Y(this.f553a.b(aVar));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aVar.f20543o);
            if (aVar.f20539k != null) {
                str = " " + aVar.f20539k;
            } else {
                str = "";
            }
            sb2.append(str);
            return Y10.U(sb2.toString()).C0(LongCompanionObject.MAX_VALUE).P();
        }

        @Override // B1.f.a
        public f e(int i10, androidx.media3.common.a aVar, boolean z10, List list, O o10, G1 g12) {
            InterfaceC1183p c2378h;
            String str = aVar.f20542n;
            if (!AbstractC2335D.s(str)) {
                if (AbstractC2335D.r(str)) {
                    c2378h = new Z1.e(this.f553a, this.f554b ? 1 : 3);
                } else if (Objects.equals(str, ClipboardModule.MIMETYPE_JPEG)) {
                    c2378h = new P1.a(1);
                } else if (Objects.equals(str, ClipboardModule.MIMETYPE_PNG)) {
                    c2378h = new C3995a();
                } else {
                    int i11 = z10 ? 4 : 0;
                    if (!this.f554b) {
                        i11 |= 32;
                    }
                    c2378h = new C2378h(this.f553a, i11 | C2378h.i(this.f555c), null, null, list, o10);
                }
            } else {
                if (!this.f554b) {
                    return null;
                }
                c2378h = new e2.o(this.f553a.c(aVar), aVar);
            }
            return new d(c2378h, i10, aVar);
        }

        @Override // B1.f.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b b(boolean z10) {
            this.f554b = z10;
            return this;
        }

        @Override // B1.f.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public b c(int i10) {
            this.f555c = i10;
            return this;
        }

        @Override // B1.f.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b a(s.a aVar) {
            this.f553a = (s.a) AbstractC4134a.e(aVar);
            return this;
        }
    }

    public d(InterfaceC1183p interfaceC1183p, int i10, androidx.media3.common.a aVar) {
        this.f538a = interfaceC1183p;
        this.f539b = i10;
        this.f540c = aVar;
    }

    @Override // B1.f
    public boolean a(InterfaceC1184q interfaceC1184q) {
        int g10 = this.f538a.g(interfaceC1184q, f537j);
        AbstractC4134a.g(g10 != 1);
        return g10 == 0;
    }

    @Override // B1.f
    public C1174g b() {
        J j10 = this.f545h;
        if (j10 instanceof C1174g) {
            return (C1174g) j10;
        }
        return null;
    }

    @Override // H1.r
    public O c(int i10, int i11) {
        a aVar = (a) this.f541d.get(i10);
        if (aVar == null) {
            AbstractC4134a.g(this.sampleFormats == null);
            aVar = new a(i10, i11, i11 == this.f539b ? this.f540c : null);
            aVar.h(this.f543f, this.f544g);
            this.f541d.put(i10, aVar);
        }
        return aVar;
    }

    @Override // B1.f
    public void d(f.b bVar, long j10, long j11) {
        this.f543f = bVar;
        this.f544g = j11;
        if (!this.f542e) {
            this.f538a.c(this);
            if (j10 != -9223372036854775807L) {
                this.f538a.a(0L, j10);
            }
            this.f542e = true;
            return;
        }
        InterfaceC1183p interfaceC1183p = this.f538a;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        interfaceC1183p.a(0L, j10);
        for (int i10 = 0; i10 < this.f541d.size(); i10++) {
            ((a) this.f541d.valueAt(i10)).h(bVar, j11);
        }
    }

    @Override // B1.f
    public androidx.media3.common.a[] e() {
        return this.sampleFormats;
    }

    @Override // H1.r
    public void q(J j10) {
        this.f545h = j10;
    }

    @Override // B1.f
    public void release() {
        this.f538a.release();
    }

    @Override // H1.r
    public void s() {
        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[this.f541d.size()];
        for (int i10 = 0; i10 < this.f541d.size(); i10++) {
            aVarArr[i10] = (androidx.media3.common.a) AbstractC4134a.i(((a) this.f541d.valueAt(i10)).f550e);
        }
        this.sampleFormats = aVarArr;
    }
}
