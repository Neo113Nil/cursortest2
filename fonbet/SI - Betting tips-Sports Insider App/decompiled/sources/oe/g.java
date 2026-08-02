package oe;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import c4.o;
import c4.p;
import c4.v;
import c4.y;
import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import eg.t1;
import gf.m;
import gf.t;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import me.b0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends k1 {

    /* renamed from: e, reason: collision with root package name */
    public b0 f21186e;

    /* renamed from: i, reason: collision with root package name */
    public we.a f21190i;

    /* renamed from: l, reason: collision with root package name */
    public t1 f21192l;

    /* renamed from: m, reason: collision with root package name */
    public String f21193m;

    /* renamed from: n, reason: collision with root package name */
    public String f21194n;

    /* renamed from: o, reason: collision with root package name */
    public String f21195o;

    /* renamed from: p, reason: collision with root package name */
    public String f21196p;
    public String q;

    /* renamed from: r, reason: collision with root package name */
    public String f21197r;

    /* renamed from: b, reason: collision with root package name */
    public final t f21183b = gf.k.b(new id.a(18));

    /* renamed from: c, reason: collision with root package name */
    public final t f21184c = gf.k.b(new id.a(19));

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f21185d = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public a f21187f = a.f21159a;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f21188g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final p0 f21189h = new p0(Boolean.FALSE);
    public final p0 j = new p0("");

    /* renamed from: k, reason: collision with root package name */
    public final p0 f21191k = new p0("");

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0105, code lost:
    
        if (r15 != 4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x013a, code lost:
    
        if (r15 != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        if (r15 == r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        if (r15 == r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
    
        if (r15 == r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
    
        if (r15 == r3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(g gVar, mf.c cVar) {
        c cVar2;
        boolean booleanValue;
        int i5;
        int i10;
        int intValue;
        t tVar = gVar.f21184c;
        p0 p0Var = gVar.j;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f21172e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f21172e = i11 - Integer.MIN_VALUE;
                Object obj = cVar2.f21170c;
                Object obj2 = lf.a.f20034a;
                int i12 = 2;
                int i13 = 1;
                Continuation continuation = null;
                switch (cVar2.f21172e) {
                    case 0:
                        h8.b.B(obj);
                        a aVar = a.f21164f;
                        gVar.f21187f = aVar;
                        cVar2.f21172e = 1;
                        obj = gVar.g(aVar, cVar2);
                        break;
                    case 1:
                        h8.b.B(obj);
                        p0Var.h((String) obj);
                        gd.c cVar3 = (gd.c) tVar.getValue();
                        cVar2.f21172e = 2;
                        cVar3.getClass();
                        lg.e eVar = m0.f9201a;
                        obj = c0.A(lg.d.f20063c, new bd.b(i12, continuation, i13), cVar2);
                        break;
                    case 2:
                        h8.b.B(obj);
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (!booleanValue) {
                            a aVar2 = a.f21160b;
                            gVar.f21187f = aVar2;
                            cVar2.f21168a = booleanValue;
                            cVar2.f21172e = 3;
                            obj = gVar.g(aVar2, cVar2);
                            break;
                        }
                        i5 = -1;
                        if (booleanValue) {
                            gd.c cVar4 = (gd.c) tVar.getValue();
                            cVar2.f21168a = booleanValue;
                            cVar2.f21169b = -1;
                            cVar2.f21172e = 4;
                            cVar4.getClass();
                            lg.e eVar2 = m0.f9201a;
                            obj = c0.A(lg.d.f20063c, new gd.a(false, cVar4, null), cVar2);
                            break;
                        }
                        if (booleanValue) {
                            gd.c cVar5 = (gd.c) tVar.getValue();
                            cVar2.f21168a = booleanValue;
                            cVar2.f21169b = i5;
                            cVar2.f21172e = 5;
                            cVar5.getClass();
                            lg.e eVar3 = m0.f9201a;
                            Object A = c0.A(lg.d.f20063c, new gd.a(true, cVar5, null), cVar2);
                            if (A != obj2) {
                                i10 = i5;
                                obj = A;
                                intValue = ((Number) obj).intValue();
                                a aVar3 = a.f21161c;
                                if (i10 == 1) {
                                    aVar3 = a.f21162d;
                                }
                                if (intValue == 1) {
                                    if (intValue != 2) {
                                        if (intValue == 3) {
                                            if (aVar3 != a.f21162d) {
                                                aVar3 = a.f21160b;
                                            }
                                        }
                                    }
                                    if (aVar3 != a.f21162d) {
                                        aVar3 = a.f21163e;
                                    }
                                } else {
                                    aVar3 = a.f21162d;
                                }
                                c0.t(MyApp.f6830c, rc.b0.b(), null, new rc.e(i10, intValue, new rc.g(), (Continuation) null), 2);
                                gVar.f21187f = aVar3;
                                cVar2.f21168a = booleanValue;
                                cVar2.f21169b = i10;
                                cVar2.f21172e = 6;
                                obj = gVar.g(aVar3, cVar2);
                                break;
                            }
                            return obj2;
                        }
                        return Unit.f19194a;
                    case 3:
                        booleanValue = cVar2.f21168a;
                        h8.b.B(obj);
                        p0Var.h((String) obj);
                        i5 = -1;
                        if (booleanValue) {
                        }
                        if (booleanValue) {
                        }
                        return Unit.f19194a;
                    case 4:
                        booleanValue = cVar2.f21168a;
                        h8.b.B(obj);
                        i5 = ((Number) obj).intValue();
                        if (booleanValue) {
                        }
                        return Unit.f19194a;
                    case 5:
                        i10 = cVar2.f21169b;
                        booleanValue = cVar2.f21168a;
                        h8.b.B(obj);
                        intValue = ((Number) obj).intValue();
                        a aVar32 = a.f21161c;
                        if (i10 == 1) {
                        }
                        if (intValue == 1) {
                        }
                        c0.t(MyApp.f6830c, rc.b0.b(), null, new rc.e(i10, intValue, new rc.g(), (Continuation) null), 2);
                        gVar.f21187f = aVar32;
                        cVar2.f21168a = booleanValue;
                        cVar2.f21169b = i10;
                        cVar2.f21172e = 6;
                        obj = gVar.g(aVar32, cVar2);
                        break;
                    case 6:
                        h8.b.B(obj);
                        p0Var.h((String) obj);
                        return Unit.f19194a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        cVar2 = new c(gVar, cVar);
        Object obj3 = cVar2.f21170c;
        Object obj22 = lf.a.f20034a;
        int i122 = 2;
        int i132 = 1;
        Continuation continuation2 = null;
        switch (cVar2.f21172e) {
        }
    }

    public static String h() {
        String format = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm"));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @Override // androidx.lifecycle.k1
    public final void d() {
        t1 t1Var = this.f21192l;
        if (t1Var != null) {
            t1Var.k(null);
        }
        this.f21192l = null;
        we.a aVar = this.f21190i;
        if (aVar != null) {
            aVar.k();
        }
        this.f21190i = null;
    }

    public final void f() {
        AtomicBoolean atomicBoolean = this.f21188g;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f21192l = c0.t(d1.i(this), null, null, new d(this, null, 0), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x014c, code lost:
    
        if (r11 == r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016b, code lost:
    
        if (r11 == r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0182, code lost:
    
        if (r11 == r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0199, code lost:
    
        if (r11 == r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b0, code lost:
    
        if (r11 == r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c7, code lost:
    
        if (r11 == r1) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(a aVar, mf.c cVar) {
        e eVar;
        String str;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i5 = eVar.f21178c;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                eVar.f21178c = i5 - Integer.MIN_VALUE;
                Object obj = eVar.f21176a;
                lf.a aVar2 = lf.a.f20034a;
                switch (eVar.f21178c) {
                    case 0:
                        h8.b.B(obj);
                        if (aVar == a.f21159a && this.f21193m != null) {
                            return this.f21193m + " (" + h() + ')';
                        }
                        if (aVar == a.f21160b && this.f21194n != null) {
                            return this.f21194n + " (" + h() + ')';
                        }
                        if (aVar == a.f21161c && this.f21195o != null) {
                            return this.f21195o + " (" + h() + ')';
                        }
                        if (aVar == a.f21162d && this.f21196p != null) {
                            return this.f21196p + " (" + h() + ')';
                        }
                        if (aVar == a.f21164f && this.q != null) {
                            return this.q + " (" + h() + ')';
                        }
                        if (aVar == a.f21163e && this.f21197r != null) {
                            return this.f21197r + " (" + h() + ')';
                        }
                        int ordinal = aVar.ordinal();
                        int i10 = 2;
                        int i11 = 1;
                        Continuation continuation = null;
                        if (ordinal == 0) {
                            lg.e eVar2 = m0.f9201a;
                            lg.d dVar = lg.d.f20063c;
                            d dVar2 = new d(this, continuation, i10);
                            eVar.f21178c = 1;
                            obj = c0.A(dVar, dVar2, eVar);
                            break;
                        } else {
                            int i12 = 3;
                            if (ordinal == 1) {
                                lg.e eVar3 = m0.f9201a;
                                lg.d dVar3 = lg.d.f20063c;
                                d dVar4 = new d(this, continuation, i12);
                                eVar.f21178c = 2;
                                obj = c0.A(dVar3, dVar4, eVar);
                                break;
                            } else {
                                int i13 = 5;
                                int i14 = 4;
                                if (ordinal == 2) {
                                    lg.e eVar4 = m0.f9201a;
                                    lg.d dVar5 = lg.d.f20063c;
                                    d dVar6 = new d(this, continuation, i13);
                                    eVar.f21178c = 4;
                                    obj = c0.A(dVar5, dVar6, eVar);
                                    break;
                                } else {
                                    int i15 = 6;
                                    if (ordinal == 3) {
                                        lg.e eVar5 = m0.f9201a;
                                        lg.d dVar7 = lg.d.f20063c;
                                        d dVar8 = new d(this, continuation, i15);
                                        eVar.f21178c = 5;
                                        obj = c0.A(dVar7, dVar8, eVar);
                                        break;
                                    } else if (ordinal == 4) {
                                        lg.e eVar6 = m0.f9201a;
                                        lg.d dVar9 = lg.d.f20063c;
                                        d dVar10 = new d(this, continuation, i14);
                                        eVar.f21178c = 3;
                                        obj = c0.A(dVar9, dVar10, eVar);
                                        break;
                                    } else {
                                        if (ordinal != 5) {
                                            throw new m();
                                        }
                                        lg.e eVar7 = m0.f9201a;
                                        lg.d dVar11 = lg.d.f20063c;
                                        d dVar12 = new d(this, continuation, i11);
                                        eVar.f21178c = 6;
                                        obj = c0.A(dVar11, dVar12, eVar);
                                        break;
                                    }
                                }
                            }
                        }
                        return aVar2;
                    case 1:
                        h8.b.B(obj);
                        str = (String) obj;
                        this.f21193m = str;
                        StringBuilder c2 = v.f.c(str, " (");
                        c2.append(h());
                        c2.append(')');
                        return c2.toString();
                    case 2:
                        h8.b.B(obj);
                        str = (String) obj;
                        this.f21194n = str;
                        StringBuilder c22 = v.f.c(str, " (");
                        c22.append(h());
                        c22.append(')');
                        return c22.toString();
                    case 3:
                        h8.b.B(obj);
                        str = (String) obj;
                        this.f21197r = str;
                        StringBuilder c222 = v.f.c(str, " (");
                        c222.append(h());
                        c222.append(')');
                        return c222.toString();
                    case 4:
                        h8.b.B(obj);
                        str = (String) obj;
                        this.f21195o = str;
                        StringBuilder c2222 = v.f.c(str, " (");
                        c2222.append(h());
                        c2222.append(')');
                        return c2222.toString();
                    case 5:
                        h8.b.B(obj);
                        str = (String) obj;
                        this.f21196p = str;
                        StringBuilder c22222 = v.f.c(str, " (");
                        c22222.append(h());
                        c22222.append(')');
                        return c22222.toString();
                    case 6:
                        h8.b.B(obj);
                        str = (String) obj;
                        this.q = str;
                        StringBuilder c222222 = v.f.c(str, " (");
                        c222222.append(h());
                        c222222.append(')');
                        return c222222.toString();
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f21176a;
        lf.a aVar22 = lf.a.f20034a;
        switch (eVar.f21178c) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: Exception -> 0x0070, TRY_LEAVE, TryCatch #0 {Exception -> 0x0070, blocks: (B:11:0x0025, B:12:0x005a, B:14:0x0062, B:22:0x0034), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Context context, Integer num, mf.c cVar) {
        f fVar;
        int i5;
        c4.m image;
        try {
            if (cVar instanceof f) {
                fVar = (f) cVar;
                int i10 = fVar.f21182d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    fVar.f21182d = i10 - Integer.MIN_VALUE;
                    Object obj = fVar.f21180b;
                    lf.a aVar = lf.a.f20034a;
                    i5 = fVar.f21182d;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        q4.e eVar = new q4.e(context);
                        eVar.f21940c = num;
                        q4.b bVar = q4.b.f21930c;
                        eVar.f21946i = bVar;
                        eVar.f21945h = bVar;
                        eVar.j = q4.b.f21931d;
                        q4.h a7 = eVar.a();
                        o a10 = y.a(context);
                        fVar.f21179a = context;
                        fVar.f21182d = 1;
                        obj = ((v) a10).c(a7, fVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        context = fVar.f21179a;
                        h8.b.B(obj);
                    }
                    image = ((q4.k) obj).getImage();
                    if (image != null) {
                        return null;
                    }
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    return p.b(image, resources);
                }
            }
            if (i5 != 0) {
            }
            image = ((q4.k) obj).getImage();
            if (image != null) {
            }
        } catch (Exception unused) {
            return null;
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f21180b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = fVar.f21182d;
    }
}
