package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pgm {
    public static final pgm a = new pgm();
    public static final ArrayList b = new ArrayList();
    public static final ku3 c = evl.coroutineContextOnIO$default(BlazeSDK.INSTANCE, null, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(sq3 sq3Var) {
        uam uamVar;
        int i;
        Iterator it;
        if (sq3Var instanceof uam) {
            uamVar = (uam) sq3Var;
            int i2 = uamVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uamVar.t = i2 - Integer.MIN_VALUE;
                Object obj = uamVar.s;
                lu3 lu3Var = lu3.a;
                i = uamVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    it = b.iterator();
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = uamVar.r;
                    y6a.M(obj);
                }
                while (it.hasNext()) {
                    s1m s1mVar = (s1m) it.next();
                    uamVar.r = it;
                    uamVar.t = 1;
                    a.getClass();
                    if (c(s1mVar) == lu3Var) {
                        return lu3Var;
                    }
                }
                return Unit.a;
            }
        }
        uamVar = new uam(sq3Var);
        Object obj2 = uamVar.s;
        lu3 lu3Var2 = lu3.a;
        i = uamVar.t;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    public static Unit c(s1m s1mVar) {
        String str = s1mVar.a;
        g9i L = xw3.L(c, null, null, new f8m(s1mVar, null), 3);
        L.n(new iol(s1mVar, 8));
        s1mVar.d = L;
        return Unit.a;
    }

    public static final void d() {
        uul uulVar;
        s1m s1mVar = new s1m("Analytics", ljd.g, ljd.f * 1000, null, 8, null);
        ArrayList arrayList = b;
        arrayList.add(s1mVar);
        tul tulVar = jdm.d;
        if ((tulVar == null || (uulVar = tulVar.a) == null) ? false : uulVar.g) {
            arrayList.add(new s1m("post_user_activity", mgm.g, mgm.f * 1000, null, 8, null));
            arrayList.add(new s1m("get_user_activity", z4m.b, z4m.a * 1000, null, 8, null));
        }
        k7m k7mVar = cam.c;
        tul tulVar2 = jdm.d;
        arrayList.add(new s1m("Logger", k7mVar, ((tulVar2 != null ? tulVar2.g : null) != null ? r0.b : 30) * 1000, null, 8, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (defpackage.n4o.y(r9, r0) == r12) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0078 -> B:11:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008a -> B:11:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, long j, Function1 function1, sq3 sq3Var) {
        q1m q1mVar;
        int i2;
        int i3;
        int i4;
        Throwable th;
        int i5;
        Throwable th2;
        Function1 function12;
        if (sq3Var instanceof q1m) {
            q1mVar = (q1m) sq3Var;
            int i6 = q1mVar.y;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                q1mVar.y = i6 - Integer.MIN_VALUE;
                Object obj = q1mVar.w;
                lu3 lu3Var = lu3.a;
                i2 = q1mVar.y;
                if (i2 == 0) {
                    if (i2 == 1) {
                        i3 = q1mVar.s;
                        j = q1mVar.t;
                        i5 = q1mVar.r;
                        function12 = q1mVar.u;
                        try {
                            y6a.M(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            Function1 function13 = function12;
                            th = th2;
                            i4 = i5;
                            function1 = function13;
                            i3++;
                            if (i3 < i4) {
                            }
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                            if (i3 >= i4) {
                            }
                        }
                        return Unit.a;
                    }
                    if (i2 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = q1mVar.s;
                    j = q1mVar.t;
                    int i7 = q1mVar.r;
                    th = q1mVar.v;
                    Function1 function14 = q1mVar.u;
                    y6a.M(obj);
                    i4 = i7;
                    function1 = function14;
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                    if (i3 >= i4) {
                        return Unit.a;
                    }
                    try {
                    } catch (Throwable th4) {
                        th = th4;
                        i3++;
                        if (i3 < i4) {
                            q1mVar.u = function1;
                            q1mVar.v = th;
                            q1mVar.r = i4;
                            q1mVar.t = j;
                            q1mVar.s = i3;
                            q1mVar.y = 2;
                        }
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                        if (i3 >= i4) {
                        }
                    }
                    q1mVar.u = function1;
                    q1mVar.v = null;
                    try {
                    } catch (Throwable th5) {
                        Function1 function15 = function1;
                        i5 = i4;
                        th2 = th5;
                        function12 = function15;
                        Function1 function132 = function12;
                        th = th2;
                        i4 = i5;
                        function1 = function132;
                        i3++;
                        if (i3 < i4) {
                        }
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                        if (i3 >= i4) {
                        }
                    }
                    q1mVar.r = i4;
                    q1mVar.t = j;
                    q1mVar.s = i3;
                    q1mVar.y = 1;
                    if (function1.invoke(q1mVar) != lu3Var) {
                        function12 = function1;
                        i5 = i4;
                        return Unit.a;
                    }
                    return lu3Var;
                }
                y6a.M(obj);
                i3 = 0;
                i4 = i;
                if (i3 >= i4) {
                }
            }
        }
        q1mVar = new q1m(this, sq3Var);
        Object obj2 = q1mVar.w;
        lu3 lu3Var2 = lu3.a;
        i2 = q1mVar.y;
        if (i2 == 0) {
        }
    }
}
