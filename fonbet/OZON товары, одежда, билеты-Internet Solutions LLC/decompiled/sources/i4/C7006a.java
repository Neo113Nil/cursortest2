package i4;

import N3.C3659j;
import N3.H;
import N3.I;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import m3.N;

/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7006a implements g {

    /* renamed from: a, reason: collision with root package name */
    private final f f65795a;

    /* renamed from: b, reason: collision with root package name */
    private final long f65796b;

    /* renamed from: c, reason: collision with root package name */
    private final long f65797c;

    /* renamed from: d, reason: collision with root package name */
    private final i f65798d;

    /* renamed from: e, reason: collision with root package name */
    private int f65799e;

    /* renamed from: f, reason: collision with root package name */
    private long f65800f;

    /* renamed from: g, reason: collision with root package name */
    private long f65801g;

    /* renamed from: h, reason: collision with root package name */
    private long f65802h;

    /* renamed from: i, reason: collision with root package name */
    private long f65803i;

    /* renamed from: j, reason: collision with root package name */
    private long f65804j;

    /* renamed from: k, reason: collision with root package name */
    private long f65805k;

    /* renamed from: l, reason: collision with root package name */
    private long f65806l;

    /* renamed from: i4.a$a, reason: collision with other inner class name */
    private final class C1083a implements H {
        C1083a() {
        }

        @Override // N3.H
        public final long getDurationUs() {
            C7006a c7006a = C7006a.this;
            return c7006a.f65798d.a(c7006a.f65800f);
        }

        @Override // N3.H
        public final H.a getSeekPoints(long j11) {
            C7006a c7006a = C7006a.this;
            long b11 = c7006a.f65798d.b(j11);
            I i11 = new I(j11, N.j((BigInteger.valueOf(b11).multiply(BigInteger.valueOf(c7006a.f65797c - c7006a.f65796b)).divide(BigInteger.valueOf(c7006a.f65800f)).longValue() + c7006a.f65796b) - 30000, c7006a.f65796b, c7006a.f65797c - 1));
            return new H.a(i11, i11);
        }

        @Override // N3.H
        public final boolean isSeekable() {
            return true;
        }
    }

    public C7006a(i iVar, long j11, long j12, long j13, long j14, boolean z11) {
        G10.a.c(j11 >= 0 && j12 > j11);
        this.f65798d = iVar;
        this.f65796b = j11;
        this.f65797c = j12;
        if (j13 == j12 - j11 || z11) {
            this.f65800f = j14;
            this.f65799e = 4;
        } else {
            this.f65799e = 0;
        }
        this.f65795a = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // i4.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(C3659j c3659j) throws IOException {
        long j11;
        ?? r14;
        long j12;
        long j13;
        int i11 = this.f65799e;
        long j14 = this.f65797c;
        f fVar = this.f65795a;
        if (i11 == 0) {
            j11 = 0;
            long position = c3659j.getPosition();
            this.f65801g = position;
            this.f65799e = 1;
            long j15 = j14 - 65307;
            if (j15 > position) {
                return j15;
            }
            r14 = 0;
        } else if (i11 != 1) {
            if (i11 == 2) {
                if (this.f65803i != this.f65804j) {
                    long position2 = c3659j.getPosition();
                    if (fVar.b(c3659j, this.f65804j)) {
                        fVar.a(c3659j, false);
                        c3659j.e();
                        long j16 = this.f65802h;
                        long j17 = fVar.f65823b;
                        long j18 = j16 - j17;
                        int i12 = fVar.f65825d + fVar.f65826e;
                        if (0 > j18 || j18 >= 72000) {
                            if (j18 < 0) {
                                this.f65804j = position2;
                                this.f65806l = j17;
                            } else {
                                this.f65803i = c3659j.getPosition() + i12;
                                this.f65805k = fVar.f65823b;
                            }
                            long j19 = this.f65804j;
                            j12 = this.f65803i;
                            if (j19 - j12 < 100000) {
                                this.f65804j = j12;
                            } else {
                                long position3 = c3659j.getPosition() - (i12 * (j18 <= 0 ? 2L : 1L));
                                long j21 = this.f65804j;
                                long j22 = this.f65803i;
                                long j23 = (j21 - j22) * j18;
                                j13 = 2;
                                j12 = N.j((j23 / (this.f65806l - this.f65805k)) + position3, j22, j21 - 1);
                                if (j12 != -1) {
                                    return j12;
                                }
                                this.f65799e = 3;
                            }
                        }
                    } else {
                        j12 = this.f65803i;
                        if (j12 == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    j13 = 2;
                    if (j12 != -1) {
                    }
                }
                j12 = -1;
                j13 = 2;
                if (j12 != -1) {
                }
            } else {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j13 = 2;
            }
            while (true) {
                fVar.b(c3659j, -1L);
                fVar.a(c3659j, false);
                if (fVar.f65823b > this.f65802h) {
                    c3659j.e();
                    this.f65799e = 4;
                    return -(this.f65805k + j13);
                }
                c3659j.m(fVar.f65825d + fVar.f65826e, false);
                this.f65803i = c3659j.getPosition();
                this.f65805k = fVar.f65823b;
            }
        } else {
            j11 = 0;
            r14 = 0;
        }
        fVar.f65822a = r14;
        fVar.f65823b = j11;
        fVar.f65824c = r14;
        fVar.f65825d = r14;
        fVar.f65826e = r14;
        if (!fVar.b(c3659j, -1L)) {
            throw new EOFException();
        }
        fVar.a(c3659j, r14);
        c3659j.m(fVar.f65825d + fVar.f65826e, r14);
        long j24 = fVar.f65823b;
        while ((fVar.f65822a & 4) != 4 && fVar.b(c3659j, -1L) && c3659j.getPosition() < j14 && fVar.a(c3659j, true)) {
            try {
                c3659j.m(fVar.f65825d + fVar.f65826e, false);
                j24 = fVar.f65823b;
            } catch (EOFException unused) {
            }
        }
        this.f65800f = j24;
        this.f65799e = 4;
        return this.f65801g;
    }

    @Override // i4.g
    public final H b() {
        if (this.f65800f != 0) {
            return new C1083a();
        }
        return null;
    }

    @Override // i4.g
    public final void c(long j11) {
        this.f65802h = N.j(j11, 0L, this.f65800f - 1);
        this.f65799e = 2;
        this.f65803i = this.f65796b;
        this.f65804j = this.f65797c;
        this.f65805k = 0L;
        this.f65806l = this.f65800f;
    }
}
