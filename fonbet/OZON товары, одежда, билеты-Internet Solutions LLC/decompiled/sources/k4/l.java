package k4;

import N3.C3659j;
import N3.E;
import N3.G;
import N3.InterfaceC3665p;
import N3.M;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j3.C7272n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import m3.C8050C;
import m3.N;

/* loaded from: classes8.dex */
public final class l implements InterfaceC3665p {

    /* renamed from: a, reason: collision with root package name */
    private final o f70459a;

    /* renamed from: f, reason: collision with root package name */
    private M f70464f;

    /* renamed from: g, reason: collision with root package name */
    private int f70465g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f70463e = N.f74291c;

    /* renamed from: d, reason: collision with root package name */
    private final C8050C f70462d = new C8050C();

    /* renamed from: b, reason: collision with root package name */
    private final C7272n f70460b = null;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f70461c = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private int f70466h = 0;

    /* renamed from: i, reason: collision with root package name */
    private long[] f70467i = N.f74292d;

    /* renamed from: j, reason: collision with root package name */
    private long f70468j = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    public static class a implements Comparable<a> {

        /* renamed from: a, reason: collision with root package name */
        private final long f70469a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f70470b;

        a(long j11, byte[] bArr) {
            this.f70469a = j11;
            this.f70470b = bArr;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return Long.compare(this.f70469a, aVar.f70469a);
        }
    }

    public l(o oVar) {
        this.f70459a = oVar;
    }

    public static /* synthetic */ void g(l lVar, c cVar) {
        lVar.getClass();
        a aVar = new a(cVar.f70452b, b.a(cVar.f70453c, cVar.f70451a));
        lVar.f70461c.add(aVar);
        long j11 = lVar.f70468j;
        if (j11 == -9223372036854775807L || cVar.f70454d >= j11) {
            lVar.h(aVar);
        }
    }

    private void h(a aVar) {
        G10.a.i(this.f70464f);
        int length = aVar.f70470b.length;
        byte[] bArr = aVar.f70470b;
        C8050C c8050c = this.f70462d;
        c8050c.getClass();
        c8050c.P(bArr.length, bArr);
        this.f70464f.e(length, c8050c);
        this.f70464f.b(aVar.f70469a, 1, length, 0, null);
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        int i11 = this.f70466h;
        G10.a.h((i11 == 0 || i11 == 5) ? false : true);
        this.f70468j = j12;
        if (this.f70466h == 2) {
            this.f70466h = 1;
        }
        if (this.f70466h == 4) {
            this.f70466h = 3;
        }
    }

    @Override // N3.InterfaceC3665p
    public final void b(N3.r rVar) {
        G10.a.h(this.f70466h == 0);
        M track = rVar.track(0, 3);
        this.f70464f = track;
        C7272n c7272n = this.f70460b;
        if (c7272n != null) {
            track.a(c7272n);
            rVar.endTracks();
            rVar.seekMap(new E(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f70466h = 1;
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(N3.q qVar) throws IOException {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r23.f70465g != r13) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r0 == (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r4 = r23.f70468j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0086, code lost:
    
        if (r4 == (-9223372036854775807L)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0088, code lost:
    
        r0 = k4.o.b.c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0096, code lost:
    
        r23.f70459a.a(r23.f70463e, 0, r23.f70465g, r0, new B90.C2609k(r23));
        java.util.Collections.sort(r8);
        r23.f70467i = new long[r8.size()];
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00be, code lost:
    
        if (r0 >= r8.size()) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c0, code lost:
    
        r23.f70467i[r0] = ((k4.l.a) r8.get(r0)).f70469a;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d1, code lost:
    
        r23.f70463e = m3.N.f74291c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d5, code lost:
    
        r23.f70466h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0091, code lost:
    
        r0 = k4.o.b.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00de, code lost:
    
        throw j3.v.a(r0, "SubtitleParser failed.");
     */
    @Override // N3.InterfaceC3665p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(N3.q qVar, G g10) throws IOException {
        long j11;
        int i11 = this.f70466h;
        G10.a.h((i11 == 0 || i11 == 5) ? false : true);
        if (this.f70466h == 1) {
            C3659j c3659j = (C3659j) qVar;
            int c11 = c3659j.getLength() != -1 ? com.google.common.primitives.b.c(c3659j.getLength()) : 1024;
            if (c11 > this.f70463e.length) {
                this.f70463e = new byte[c11];
            }
            this.f70465g = 0;
            this.f70466h = 2;
        }
        int i12 = this.f70466h;
        ArrayList arrayList = this.f70461c;
        if (i12 == 2) {
            byte[] bArr = this.f70463e;
            if (bArr.length == this.f70465g) {
                this.f70463e = Arrays.copyOf(bArr, bArr.length + UserVerificationMethods.USER_VERIFY_ALL);
            }
            byte[] bArr2 = this.f70463e;
            int i13 = this.f70465g;
            C3659j c3659j2 = (C3659j) qVar;
            int read = c3659j2.read(bArr2, i13, bArr2.length - i13);
            if (read != -1) {
                this.f70465g += read;
            }
            long length = c3659j2.getLength();
            if (length != -1) {
                j11 = -1;
            } else {
                j11 = -1;
            }
        } else {
            j11 = -1;
        }
        if (this.f70466h == 3) {
            C3659j c3659j3 = (C3659j) qVar;
            if (c3659j3.c(c3659j3.getLength() != j11 ? com.google.common.primitives.b.c(c3659j3.getLength()) : UserVerificationMethods.USER_VERIFY_ALL) == -1) {
                long j12 = this.f70468j;
                for (int e11 = j12 == -9223372036854775807L ? 0 : N.e(this.f70467i, j12, true); e11 < arrayList.size(); e11++) {
                    h((a) arrayList.get(e11));
                }
                this.f70466h = 4;
            }
        }
        return this.f70466h == 4 ? -1 : 0;
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
        if (this.f70466h == 5) {
            return;
        }
        this.f70459a.reset();
        this.f70466h = 5;
    }
}
