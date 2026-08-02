package ze;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import xe.C10720e0;
import xe.C10738n0;
import xe.C10749t0;
import xe.O;
import xe.Y;

/* renamed from: ze.B, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11112B {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (xe.Y.b(r6, r0) != r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (xe.Y.b(r8, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0074 -> B:12:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Wc.a a(long j11, long j12, x xVar, kotlin.coroutines.jvm.internal.c cVar) {
        y yVar;
        Wc.a aVar;
        int i11;
        x xVar2;
        Unit unit;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i12 = yVar.f108966g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                yVar.f108966g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = yVar.f108965f;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = yVar.f108966g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    yVar.f108964e = xVar;
                    yVar.f108963d = j11;
                    yVar.f108966g = 1;
                } else if (i11 == 1) {
                    j11 = yVar.f108963d;
                    xVar = yVar.f108964e;
                    Sc.s.b(obj);
                } else if (i11 == 2) {
                    j11 = yVar.f108963d;
                    xVar2 = yVar.f108964e;
                    Sc.s.b(obj);
                    yVar.f108964e = xVar2;
                    yVar.f108963d = j11;
                    yVar.f108966g = 3;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = yVar.f108963d;
                    xVar2 = yVar.f108964e;
                    Sc.s.b(obj);
                    xVar = xVar2;
                }
                unit = Unit.f71690a;
                yVar.f108964e = xVar;
                yVar.f108963d = j11;
                yVar.f108966g = 2;
                if (xVar.n(unit, yVar) != aVar) {
                    xVar2 = xVar;
                    yVar.f108964e = xVar2;
                    yVar.f108963d = j11;
                    yVar.f108966g = 3;
                }
                return aVar;
            }
        }
        yVar = new y(cVar);
        Object obj2 = yVar.f108965f;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = yVar.f108966g;
        if (i11 != 0) {
        }
        unit = Unit.f71690a;
        yVar.f108964e = xVar;
        yVar.f108963d = j11;
        yVar.f108966g = 2;
        if (xVar.n(unit, yVar) != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        if (xe.Y.b(r13 / 1000000, r1) != r2) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ca -> B:17:0x0045). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dc -> B:16:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Wc.a b(long j11, long j12, x xVar, kotlin.coroutines.jvm.internal.c cVar) {
        z zVar;
        Wc.a aVar;
        int i11;
        x xVar2;
        long j13;
        long j14;
        long c11;
        long j15;
        long j16;
        x xVar3;
        long j17;
        Unit unit;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i12 = zVar.f108971h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                zVar.f108971h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = zVar.f108970g;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = zVar.f108971h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    long nanoTime = System.nanoTime() + C10738n0.c(j12);
                    xVar2 = xVar;
                    zVar.f108969f = xVar2;
                    j13 = j11;
                    zVar.f108967d = j13;
                    zVar.f108968e = nanoTime;
                    zVar.f108971h = 1;
                    if (Y.b(j12, zVar) != aVar) {
                        j14 = nanoTime;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    j14 = zVar.f108968e;
                    long j18 = zVar.f108967d;
                    x xVar4 = zVar.f108969f;
                    Sc.s.b(obj);
                    xVar2 = xVar4;
                    j13 = j18;
                } else {
                    if (i11 != 2) {
                        if (i11 != 3 && i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j16 = zVar.f108968e;
                        j15 = zVar.f108967d;
                        xVar3 = zVar.f108969f;
                        Sc.s.b(obj);
                        long j19 = j15;
                        c11 = j16;
                        j14 = j19;
                        xVar2 = xVar3;
                        long j21 = j14 + c11;
                        unit = Unit.f71690a;
                        zVar.f108969f = xVar2;
                        zVar.f108967d = j21;
                        zVar.f108968e = c11;
                        zVar.f108971h = 2;
                        if (xVar2.n(unit, zVar) != aVar) {
                            long j22 = c11;
                            j15 = j21;
                            j16 = j22;
                            xVar3 = xVar2;
                            long nanoTime2 = System.nanoTime();
                            j17 = j15 - nanoTime2;
                            if (j17 < 0) {
                                j17 = 0;
                            }
                            if (j17 == 0 || j16 == 0) {
                                zVar.f108969f = xVar3;
                                zVar.f108967d = j15;
                                zVar.f108968e = j16;
                                zVar.f108971h = 4;
                            } else {
                                long j23 = j16 - ((nanoTime2 - j15) % j16);
                                long j24 = nanoTime2 + j23;
                                zVar.f108969f = xVar3;
                                zVar.f108967d = j24;
                                zVar.f108968e = j16;
                                zVar.f108971h = 3;
                                if (Y.b(j23 / 1000000, zVar) != aVar) {
                                    c11 = j16;
                                    j14 = j24;
                                    xVar2 = xVar3;
                                    long j212 = j14 + c11;
                                    unit = Unit.f71690a;
                                    zVar.f108969f = xVar2;
                                    zVar.f108967d = j212;
                                    zVar.f108968e = c11;
                                    zVar.f108971h = 2;
                                    if (xVar2.n(unit, zVar) != aVar) {
                                    }
                                }
                            }
                        }
                        return aVar;
                    }
                    j16 = zVar.f108968e;
                    j15 = zVar.f108967d;
                    xVar3 = zVar.f108969f;
                    Sc.s.b(obj);
                    long nanoTime22 = System.nanoTime();
                    j17 = j15 - nanoTime22;
                    if (j17 < 0) {
                    }
                    if (j17 == 0) {
                    }
                    zVar.f108969f = xVar3;
                    zVar.f108967d = j15;
                    zVar.f108968e = j16;
                    zVar.f108971h = 4;
                }
                c11 = C10738n0.c(j13);
                long j2122 = j14 + c11;
                unit = Unit.f71690a;
                zVar.f108969f = xVar2;
                zVar.f108967d = j2122;
                zVar.f108968e = c11;
                zVar.f108971h = 2;
                if (xVar2.n(unit, zVar) != aVar) {
                }
                return aVar;
            }
        }
        zVar = new z(cVar);
        Object obj2 = zVar.f108970g;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = zVar.f108971h;
        if (i11 != 0) {
        }
        c11 = C10738n0.c(j13);
        long j21222 = j14 + c11;
        unit = Unit.f71690a;
        zVar.f108969f = xVar2;
        zVar.f108967d = j21222;
        zVar.f108968e = c11;
        zVar.f108971h = 2;
        if (xVar2.n(unit, zVar) != aVar) {
        }
        return aVar;
    }

    public static w c(long j11, long j12, C c11) {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f71771a;
        if (j11 < 0) {
            throw new IllegalArgumentException(Sh.b.b(j11, "Expected non-negative delay, but has ", " ms").toString());
        }
        if (j12 < 0) {
            throw new IllegalArgumentException(Sh.b.b(j12, "Expected non-negative initial delay, but has ", " ms").toString());
        }
        return s.c(C10749t0.f105499a, C10720e0.b().plus(gVar), 0, EnumC11113a.SUSPEND, O.DEFAULT, new C11111A(c11, j11, j12, null));
    }
}
