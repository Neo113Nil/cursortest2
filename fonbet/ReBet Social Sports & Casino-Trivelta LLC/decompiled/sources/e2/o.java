package e2;

import H1.E;
import H1.I;
import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.O;
import b1.C2338G;
import e1.AbstractC4134a;
import e1.InterfaceC4148o;
import e1.J;
import e1.Z;
import e2.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class o implements InterfaceC1183p {

    /* renamed from: a, reason: collision with root package name */
    public final s f45603a;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.a f45605c;

    /* renamed from: d, reason: collision with root package name */
    public final List f45606d;

    /* renamed from: f, reason: collision with root package name */
    public O f45608f;

    /* renamed from: g, reason: collision with root package name */
    public int f45609g;

    /* renamed from: h, reason: collision with root package name */
    public int f45610h;

    /* renamed from: i, reason: collision with root package name */
    public long f45611i;
    private long[] timestamps;

    /* renamed from: b, reason: collision with root package name */
    public final C4162d f45604b = new C4162d();
    private byte[] subtitleData = Z.EMPTY_BYTE_ARRAY;

    /* renamed from: e, reason: collision with root package name */
    public final J f45607e = new J();

    public static class b implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        public final long f45612a;
        private final byte[] data;

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f45612a, bVar.f45612a);
        }

        public b(long j10, byte[] bArr) {
            this.f45612a = j10;
            this.data = bArr;
        }
    }

    public o(s sVar, androidx.media3.common.a aVar) {
        this.f45603a = sVar;
        this.f45605c = aVar != null ? aVar.b().y0("application/x-media3-cues").U(aVar.f20543o).Y(sVar.c()).P() : null;
        this.f45606d = new ArrayList();
        this.f45610h = 0;
        this.timestamps = Z.EMPTY_LONG_ARRAY;
        this.f45611i = -9223372036854775807L;
    }

    public static /* synthetic */ void b(o oVar, C4163e c4163e) {
        oVar.getClass();
        b bVar = new b(c4163e.f45595b, oVar.f45604b.a(c4163e.f45594a, c4163e.f45596c));
        oVar.f45606d.add(bVar);
        long j10 = oVar.f45611i;
        if (j10 == -9223372036854775807L || c4163e.f45597d >= j10) {
            oVar.l(bVar);
        }
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        int i10 = this.f45610h;
        AbstractC4134a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f45611i = j11;
        if (this.f45610h == 2) {
            this.f45610h = 1;
        }
        if (this.f45610h == 4) {
            this.f45610h = 3;
        }
    }

    @Override // H1.InterfaceC1183p
    public void c(H1.r rVar) {
        AbstractC4134a.g(this.f45610h == 0);
        O c10 = rVar.c(0, 3);
        this.f45608f = c10;
        androidx.media3.common.a aVar = this.f45605c;
        if (aVar != null) {
            c10.c(aVar);
            rVar.s();
            rVar.q(new E(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.f45610h = 1;
    }

    public final void d() {
        try {
            long j10 = this.f45611i;
            this.f45603a.a(this.subtitleData, 0, this.f45609g, j10 != -9223372036854775807L ? s.b.c(j10) : s.b.b(), new InterfaceC4148o() { // from class: e2.n
                @Override // e1.InterfaceC4148o
                public final void accept(Object obj) {
                    o.b(o.this, (C4163e) obj);
                }
            });
            Collections.sort(this.f45606d);
            this.timestamps = new long[this.f45606d.size()];
            for (int i10 = 0; i10 < this.f45606d.size(); i10++) {
                this.timestamps[i10] = ((b) this.f45606d.get(i10)).f45612a;
            }
            this.subtitleData = Z.EMPTY_BYTE_ARRAY;
        } catch (RuntimeException e10) {
            throw C2338G.a("SubtitleParser failed.", e10);
        }
    }

    public final boolean e(InterfaceC1184q interfaceC1184q) {
        byte[] bArr = this.subtitleData;
        if (bArr.length == this.f45609g) {
            this.subtitleData = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.subtitleData;
        int i10 = this.f45609g;
        int read = interfaceC1184q.read(bArr2, i10, bArr2.length - i10);
        if (read != -1) {
            this.f45609g += read;
        }
        long length = interfaceC1184q.getLength();
        return (length != -1 && ((long) this.f45609g) == length) || read == -1;
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, I i10) {
        int i11 = this.f45610h;
        AbstractC4134a.g((i11 == 0 || i11 == 5) ? false : true);
        if (this.f45610h == 1) {
            int e10 = interfaceC1184q.getLength() != -1 ? com.google.common.primitives.f.e(interfaceC1184q.getLength()) : 1024;
            if (e10 > this.subtitleData.length) {
                this.subtitleData = new byte[e10];
            }
            this.f45609g = 0;
            this.f45610h = 2;
        }
        if (this.f45610h == 2 && e(interfaceC1184q)) {
            d();
            this.f45610h = 4;
        }
        if (this.f45610h == 3 && h(interfaceC1184q)) {
            i();
            this.f45610h = 4;
        }
        return this.f45610h == 4 ? -1 : 0;
    }

    public final boolean h(InterfaceC1184q interfaceC1184q) {
        return interfaceC1184q.a((interfaceC1184q.getLength() > (-1L) ? 1 : (interfaceC1184q.getLength() == (-1L) ? 0 : -1)) != 0 ? com.google.common.primitives.f.e(interfaceC1184q.getLength()) : 1024) == -1;
    }

    public final void i() {
        long j10 = this.f45611i;
        for (int h10 = j10 == -9223372036854775807L ? 0 : Z.h(this.timestamps, j10, true, true); h10 < this.f45606d.size(); h10++) {
            l((b) this.f45606d.get(h10));
        }
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        return true;
    }

    public final void l(b bVar) {
        AbstractC4134a.i(this.f45608f);
        int length = bVar.data.length;
        this.f45607e.Y(bVar.data);
        this.f45608f.a(this.f45607e, length);
        this.f45608f.g(bVar.f45612a, 1, length, 0, null);
    }

    @Override // H1.InterfaceC1183p
    public void release() {
        if (this.f45610h == 5) {
            return;
        }
        this.f45603a.reset();
        this.f45610h = 5;
    }
}
