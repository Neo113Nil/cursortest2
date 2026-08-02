package defpackage;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class loh {
    public final Function1 a;
    public Object b;
    public h0d c;
    public boolean j;
    public int k;
    public int d = -1;
    public final x0d e = t6a.t();
    public final x0d f = new x0d();
    public final y0d g = new y0d();
    public final i1d h = new i1d(new ay4[16], 0);
    public final zu8 i = new zu8(this, 1);
    public final x0d l = t6a.t();
    public final HashMap m = new HashMap();

    public loh(Function1 function1) {
        this.a = function1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.loh.a(java.util.Set):boolean");
    }

    public final void b(Object obj, int i, Object obj2, h0d h0dVar) {
        int i2;
        if (this.k > 0) {
            return;
        }
        int c = h0dVar.c(obj);
        if (c < 0) {
            c = ~c;
            i2 = -1;
        } else {
            i2 = h0dVar.c[c];
        }
        h0dVar.b[c] = obj;
        h0dVar.c[c] = i;
        if ((obj instanceof ay4) && i2 != i) {
            zx4 i3 = ((ay4) obj).i();
            this.m.put(obj, i3.f);
            h0d h0dVar2 = i3.e;
            x0d x0dVar = this.l;
            t6a.I(x0dVar, obj);
            Object[] objArr = h0dVar2.b;
            long[] jArr = h0dVar2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((j & 255) < 128) {
                                qdi qdiVar = (qdi) objArr[(i4 << 3) + i6];
                                if (qdiVar instanceof rdi) {
                                    ((rdi) qdiVar).g(2);
                                }
                                t6a.l(x0dVar, qdiVar, obj);
                            }
                            j >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof rdi) {
                ((rdi) obj).g(2);
            }
            t6a.l(this.e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        x0d x0dVar = this.e;
        t6a.H(x0dVar, obj2, obj);
        if (!(obj2 instanceof ay4) || x0dVar.c(obj2)) {
            return;
        }
        t6a.I(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long j3;
        x0d x0dVar = this.f;
        long[] jArr3 = x0dVar.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = x0dVar.b[i6];
                        j2 = j5;
                        h0d h0dVar = (h0d) x0dVar.c[i6];
                        obj.getClass();
                        boolean u0 = ((syd) obj).u0();
                        if (!u0) {
                            Object[] objArr = h0dVar.b;
                            int[] iArr = h0dVar.c;
                            long[] jArr4 = h0dVar.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = u0;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                c(obj, obj2);
                                            } else {
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    u0 = z;
                                    jArr4 = jArr5;
                                    i7 = 8;
                                }
                                if (!z) {
                                    x0dVar.l(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        z = u0;
                        if (!z) {
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
