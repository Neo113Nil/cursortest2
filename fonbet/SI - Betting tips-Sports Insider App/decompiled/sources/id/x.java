package id;

import androidx.fragment.app.p0;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import eg.c0;
import eg.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import la.s0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f11224a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile long f11225b;

    public static final void a(x xVar) {
        xVar.getClass();
        rc.x.a(R.string.load_predict_error, false);
    }

    public static s0 d() {
        return (s0) y3.m(s0.class, null, 6);
    }

    public static List f(List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList X = CollectionsKt.X(data);
        kotlin.collections.y.m(X, new v(new androidx.coordinatorlayout.widget.i(6)));
        return CollectionsKt.W(X);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        if (r10.f(r2, r0) != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0074, code lost:
    
        if (r10 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i5, mf.c cVar) {
        m mVar;
        int i10;
        boolean z5;
        int i11;
        boolean z7;
        ja.c cVar2;
        Object h10;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i12 = mVar.f11186e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                mVar.f11186e = i12 - Integer.MIN_VALUE;
                Object obj = mVar.f11184c;
                lf.a aVar = lf.a.f20034a;
                switch (mVar.f11186e) {
                    case 0:
                        h8.b.B(obj);
                        s0 d10 = d();
                        mVar.f11182a = i5;
                        mVar.f11186e = 1;
                        d10.getClass();
                        fb.b bVar = new fb.b();
                        lg.e eVar = m0.f9201a;
                        obj = c0.A(lg.d.f20063c, new lb.b(bVar, i5, null, 0), mVar);
                        break;
                    case 1:
                        i5 = mVar.f11182a;
                        h8.b.B(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (booleanValue) {
                            s0 d11 = d();
                            mVar.f11182a = i5;
                            mVar.f11183b = booleanValue;
                            mVar.f11186e = 2;
                            d11.getClass();
                            Object h11 = s0.h(i5, mVar);
                            if (h11 != aVar) {
                                i11 = i5;
                                z7 = booleanValue;
                                obj = h11;
                                cVar2 = (ja.c) obj;
                                if (cVar2 == null && cVar2.f18391d == 1) {
                                    return cVar2;
                                }
                                if (cVar2 == null && cVar2.a()) {
                                    return cVar2;
                                }
                                if (cVar2 != null || !io.sentry.config.a.C(new Integer(cVar2.j))) {
                                    s0 d12 = d();
                                    mVar.f11182a = i11;
                                    mVar.f11183b = z7;
                                    mVar.f11186e = 3;
                                    break;
                                } else {
                                    return cVar2;
                                }
                            }
                        } else {
                            s0 d13 = d();
                            mVar.f11182a = i5;
                            mVar.f11183b = booleanValue;
                            mVar.f11186e = 5;
                            if (d13.f(i5, mVar) != aVar) {
                                i10 = i5;
                                z5 = booleanValue;
                                s0 d14 = d();
                                mVar.f11182a = i10;
                                mVar.f11183b = z5;
                                mVar.f11186e = 6;
                                d14.getClass();
                                h10 = s0.h(i10, mVar);
                                if (h10 == aVar) {
                                    return h10;
                                }
                            }
                        }
                    case 2:
                        z7 = mVar.f11183b;
                        i11 = mVar.f11182a;
                        h8.b.B(obj);
                        cVar2 = (ja.c) obj;
                        if (cVar2 == null) {
                            break;
                        }
                        if (cVar2 == null) {
                            break;
                        }
                        if (cVar2 != null) {
                            break;
                        }
                        s0 d122 = d();
                        mVar.f11182a = i11;
                        mVar.f11183b = z7;
                        mVar.f11186e = 3;
                        break;
                    case 3:
                        z7 = mVar.f11183b;
                        i11 = mVar.f11182a;
                        h8.b.B(obj);
                        s0 d15 = d();
                        mVar.f11182a = i11;
                        mVar.f11183b = z7;
                        mVar.f11186e = 4;
                        d15.getClass();
                        Object h12 = s0.h(i11, mVar);
                        return h12 == aVar ? aVar : h12;
                    case 4:
                        h8.b.B(obj);
                        return obj;
                    case 5:
                        z5 = mVar.f11183b;
                        i10 = mVar.f11182a;
                        h8.b.B(obj);
                        s0 d142 = d();
                        mVar.f11182a = i10;
                        mVar.f11183b = z5;
                        mVar.f11186e = 6;
                        d142.getClass();
                        h10 = s0.h(i10, mVar);
                        if (h10 == aVar) {
                        }
                        break;
                    case 6:
                        h8.b.B(obj);
                        return obj;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        mVar = new m(this, cVar);
        Object obj2 = mVar.f11184c;
        lf.a aVar2 = lf.a.f20034a;
        switch (mVar.f11186e) {
        }
    }

    public final Object c(p0 p0Var, oe.j jVar) {
        lg.e eVar = m0.f9201a;
        Object A = c0.A(lg.d.f20063c, new androidx.lifecycle.c(this, p0Var, (Continuation) null, 18), jVar);
        return A == lf.a.f20034a ? A : Unit.f19194a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r7 = 400;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(mf.c cVar) {
        s sVar;
        int i5;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i10 = sVar.f11212c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.f11212c = i10 - Integer.MIN_VALUE;
                Object obj = sVar.f11210a;
                lf.a aVar = lf.a.f20034a;
                i5 = sVar.f11212c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    s0 d10 = d();
                    sVar.f11212c = 1;
                    d10.getClass();
                    lg.e eVar = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new androidx.lifecycle.b(d10, (Continuation) null, 13), sVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                int i11 = ((Number) obj).intValue();
                return new Integer(i11);
            }
        }
        sVar = new s(this, cVar);
        Object obj2 = sVar.f11210a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = sVar.f11212c;
        if (i5 != 0) {
        }
        int i112 = ((Number) obj2).intValue();
        return new Integer(i112);
    }
}
