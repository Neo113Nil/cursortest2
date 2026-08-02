package q3;

import Hj0.T;
import java.io.IOException;
import java.io.InterruptedIOException;
import p3.i;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final c f81440a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8980a f81441b;

    /* renamed from: c, reason: collision with root package name */
    private final p3.i f81442c;

    /* renamed from: d, reason: collision with root package name */
    private final String f81443d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f81444e;

    /* renamed from: f, reason: collision with root package name */
    private final a f81445f;

    /* renamed from: g, reason: collision with root package name */
    private long f81446g;

    /* renamed from: h, reason: collision with root package name */
    private long f81447h;

    /* renamed from: i, reason: collision with root package name */
    private long f81448i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f81449j;

    public interface a {
        void a(long j11, long j12, long j13);
    }

    public i(c cVar, p3.i iVar, byte[] bArr, a aVar) {
        this.f81440a = cVar;
        this.f81441b = cVar.j();
        this.f81442c = iVar;
        this.f81444e = bArr == null ? new byte[131072] : bArr;
        this.f81445f = aVar;
        this.f81443d = ((Pk0.f) cVar.k()).a(iVar);
        this.f81446g = iVar.f80071f;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0156 A[Catch: Exception -> 0x014a, TryCatch #2 {Exception -> 0x014a, blocks: (B:62:0x00ef, B:65:0x00f6, B:70:0x0108, B:71:0x0102, B:79:0x0116, B:81:0x011a, B:84:0x0123, B:86:0x0131, B:90:0x0142, B:91:0x013c, B:92:0x0145, B:97:0x014c, B:98:0x0151, B:103:0x0156, B:106:0x015f, B:111:0x0172, B:112:0x016c), top: B:61:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f6 A[Catch: Exception -> 0x014a, TryCatch #2 {Exception -> 0x014a, blocks: (B:62:0x00ef, B:65:0x00f6, B:70:0x0108, B:71:0x0102, B:79:0x0116, B:81:0x011a, B:84:0x0123, B:86:0x0131, B:90:0x0142, B:91:0x013c, B:92:0x0145, B:97:0x014c, B:98:0x0151, B:103:0x0156, B:106:0x015f, B:111:0x0172, B:112:0x016c), top: B:61:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116 A[Catch: Exception -> 0x014a, TryCatch #2 {Exception -> 0x014a, blocks: (B:62:0x00ef, B:65:0x00f6, B:70:0x0108, B:71:0x0102, B:79:0x0116, B:81:0x011a, B:84:0x0123, B:86:0x0131, B:90:0x0142, B:91:0x013c, B:92:0x0145, B:97:0x014c, B:98:0x0151, B:103:0x0156, B:106:0x015f, B:111:0x0172, B:112:0x016c), top: B:61:0x00ef }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() throws IOException {
        long j11;
        int i11;
        long j12;
        long j13;
        if (this.f81449j) {
            throw new InterruptedIOException();
        }
        p3.i iVar = this.f81442c;
        this.f81448i = this.f81441b.c(this.f81443d, iVar.f80071f, iVar.f80072g);
        long j14 = iVar.f80072g;
        long j15 = -1;
        if (j14 != -1) {
            this.f81447h = iVar.f80071f + j14;
        } else {
            long c11 = this.f81441b.a(this.f81443d).c();
            if (c11 == -1) {
                c11 = -1;
            }
            this.f81447h = c11;
        }
        a aVar = this.f81445f;
        if (aVar != null) {
            long j16 = this.f81447h;
            aVar.a(j16 == -1 ? -1L : j16 - this.f81442c.f80071f, this.f81448i, 0L);
        }
        while (true) {
            long j17 = this.f81447h;
            if (j17 != j15 && this.f81446g >= j17) {
                return;
            }
            if (this.f81449j) {
                throw new InterruptedIOException();
            }
            long j18 = this.f81447h;
            long d11 = this.f81441b.d(this.f81443d, this.f81446g, j18 == j15 ? Long.MAX_VALUE : j18 - this.f81446g);
            if (d11 > 0) {
                this.f81446g += d11;
                j12 = j15;
            } else {
                long j19 = -d11;
                if (j19 == Long.MAX_VALUE) {
                    j19 = j15;
                }
                long j21 = this.f81446g;
                boolean z11 = true;
                int i12 = 0;
                boolean z12 = j21 + j19 == this.f81447h || j19 == j15;
                c cVar = this.f81440a;
                if (j19 != j15) {
                    i.a a11 = iVar.a();
                    a11.h(j21);
                    a11.g(j19);
                    try {
                        j11 = cVar.open(a11.a());
                    } catch (Exception unused) {
                        T.b(cVar);
                    }
                    if (!z11) {
                        if (this.f81449j) {
                            throw new InterruptedIOException();
                        }
                        i.a a12 = iVar.a();
                        a12.h(j21);
                        a12.g(j15);
                        try {
                            j11 = cVar.open(a12.a());
                        } catch (Exception e11) {
                            T.b(cVar);
                            throw e11;
                        }
                    }
                    if (z12 && j11 != j15) {
                        j13 = j11 + j21;
                        try {
                            if (this.f81447h == j13) {
                                this.f81447h = j13;
                                a aVar2 = this.f81445f;
                                if (aVar2 != null) {
                                    aVar2.a(j13 == j15 ? j15 : j13 - this.f81442c.f80071f, this.f81448i, 0L);
                                }
                            }
                        } catch (Exception e12) {
                            T.b(cVar);
                            throw e12;
                        }
                    }
                    i11 = 0;
                    int i13 = 0;
                    while (i11 != -1) {
                        if (this.f81449j) {
                            throw new InterruptedIOException();
                        }
                        byte[] bArr = this.f81444e;
                        i11 = cVar.read(bArr, i12, bArr.length);
                        if (i11 != -1) {
                            long j22 = i11;
                            long j23 = j15;
                            long j24 = this.f81448i + j22;
                            this.f81448i = j24;
                            a aVar3 = this.f81445f;
                            if (aVar3 != null) {
                                long j25 = this.f81447h;
                                aVar3.a(j25 == j23 ? j23 : j25 - this.f81442c.f80071f, j24, j22);
                            }
                            i13 += i11;
                            j15 = j23;
                            i12 = 0;
                        }
                    }
                    j12 = j15;
                    if (z12) {
                        long j26 = i13 + j21;
                        if (this.f81447h != j26) {
                            this.f81447h = j26;
                            a aVar4 = this.f81445f;
                            if (aVar4 != null) {
                                aVar4.a(j26 == j12 ? j12 : j26 - this.f81442c.f80071f, this.f81448i, 0L);
                            }
                        }
                    }
                    cVar.close();
                    this.f81446g = j21 + i13;
                }
                j11 = j15;
                z11 = false;
                if (!z11) {
                }
                if (z12) {
                    j13 = j11 + j21;
                    if (this.f81447h == j13) {
                    }
                }
                i11 = 0;
                int i132 = 0;
                while (i11 != -1) {
                }
                j12 = j15;
                if (z12) {
                }
                cVar.close();
                this.f81446g = j21 + i132;
            }
            j15 = j12;
        }
    }

    public final void b() {
        this.f81449j = true;
    }
}
