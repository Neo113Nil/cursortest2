package la;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s0 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s0 s0Var, String str, mf.c cVar) {
        o0 o0Var;
        int i5;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i10 = o0Var.f19563c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                o0Var.f19563c = i10 - Integer.MIN_VALUE;
                Object obj = o0Var.f19561a;
                Object obj2 = lf.a.f20034a;
                i5 = o0Var.f19563c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    o0Var.f19563c = 1;
                    obj = s0Var.g(null, str, o0Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Boolean.valueOf(((ja.d) obj).f18412e == -1);
            }
        }
        o0Var = new o0(s0Var, cVar);
        Object obj3 = o0Var.f19561a;
        Object obj22 = lf.a.f20034a;
        i5 = o0Var.f19563c;
        if (i5 != 0) {
        }
        return Boolean.valueOf(((ja.d) obj3).f18412e == -1);
    }

    public static final String b(s0 s0Var, long j) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ISO_INSTANT;
        Intrinsics.checkNotNullExpressionValue(dateFormat, "ISO_INSTANT");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        String format = ZonedDateTime.ofInstant(Instant.ofEpochSecond(j / 1000), ZoneOffset.UTC).format(dateFormat);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final Object c(s0 s0Var, long j, long j6, String str, Integer num, mf.i iVar) {
        lg.e eVar = eg.m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new p0(s0Var, j, j6, str, num, null), iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable d(s0 s0Var, String str, mf.c cVar) {
        q0 q0Var;
        int i5;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i10 = q0Var.f19578c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                q0Var.f19578c = i10 - Integer.MIN_VALUE;
                Object obj = q0Var.f19576a;
                lf.a aVar = lf.a.f20034a;
                i5 = q0Var.f19578c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    q0Var.f19578c = 1;
                    obj = s0Var.g(null, str, q0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return new Pair(new Long((r4 - 604800) * 1000), new Long(((ja.d) obj).f18412e * 1000));
            }
        }
        q0Var = new q0(s0Var, cVar);
        Object obj2 = q0Var.f19576a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = q0Var.f19578c;
        if (i5 != 0) {
        }
        return new Pair(new Long((r4 - 604800) * 1000), new Long(((ja.d) obj2).f18412e * 1000));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable e(s0 s0Var, Integer num, String str, mf.c cVar) {
        r0 r0Var;
        int i5;
        long j;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i10 = r0Var.f19584c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                r0Var.f19584c = i10 - Integer.MIN_VALUE;
                Object obj = r0Var.f19582a;
                lf.a aVar = lf.a.f20034a;
                i5 = r0Var.f19584c;
                boolean z5 = true;
                if (i5 != 0) {
                    h8.b.B(obj);
                    r0Var.f19584c = 1;
                    obj = s0Var.g(num, str, r0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                long j6 = ((ja.d) obj).f18411d * 1000;
                j = 604800000 + j6;
                if (j <= System.currentTimeMillis()) {
                    j = System.currentTimeMillis();
                } else {
                    z5 = false;
                }
                return new gf.u(new Long(j6), new Long(j), Boolean.valueOf(z5));
            }
        }
        r0Var = new r0(s0Var, cVar);
        Object obj2 = r0Var.f19582a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = r0Var.f19584c;
        boolean z52 = true;
        if (i5 != 0) {
        }
        long j62 = ((ja.d) obj2).f18411d * 1000;
        j = 604800000 + j62;
        if (j <= System.currentTimeMillis()) {
        }
        return new gf.u(new Long(j62), new Long(j), Boolean.valueOf(z52));
    }

    public static Object h(int i5, mf.c cVar) {
        fb.b bVar = new fb.b();
        lg.e eVar = eg.m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new lb.b(bVar, i5, null, 1), cVar);
    }

    public static Object i(long j, String str, androidx.lifecycle.u0 u0Var) {
        fb.b bVar = new fb.b();
        lg.e eVar = eg.m0.f9201a;
        Object A = eg.c0.A(lg.d.f20063c, new cd.o(bVar, j, str, null), u0Var);
        lf.a aVar = lf.a.f20034a;
        if (A != aVar) {
            A = Unit.f19194a;
        }
        return A == aVar ? A : Unit.f19194a;
    }

    public final Object f(int i5, mf.c cVar) {
        lg.e eVar = eg.m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new bd.i(i5, 11, this, (Continuation) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Integer num, String str, mf.c cVar) {
        n0 n0Var;
        int i5;
        String str2;
        Integer num2;
        ja.d dVar;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i10 = n0Var.f19560e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                n0Var.f19560e = i10 - Integer.MIN_VALUE;
                Object obj = n0Var.f19558c;
                lf.a aVar = lf.a.f20034a;
                i5 = n0Var.f19560e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    fb.b bVar = new fb.b();
                    n0Var.f19556a = num;
                    n0Var.f19557b = str;
                    n0Var.f19560e = 1;
                    lg.e eVar = eg.m0.f9201a;
                    str2 = str;
                    obj = eg.c0.A(lg.d.f20063c, new ge.f((Object) bVar, (Comparable) num, str2, (Continuation) null, 2), n0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                    num2 = num;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = n0Var.f19557b;
                    num2 = n0Var.f19556a;
                    h8.b.B(obj);
                    str2 = str3;
                }
                dVar = (ja.d) obj;
                if (dVar != null) {
                    return new ja.d(num2 != null ? num2.intValue() : 0, 0, (int) ((System.currentTimeMillis() / 1000) - 604800), 0, str2);
                }
                return dVar;
            }
        }
        n0Var = new n0(this, cVar);
        Object obj2 = n0Var.f19558c;
        lf.a aVar2 = lf.a.f20034a;
        i5 = n0Var.f19560e;
        if (i5 != 0) {
        }
        dVar = (ja.d) obj2;
        if (dVar != null) {
        }
    }
}
