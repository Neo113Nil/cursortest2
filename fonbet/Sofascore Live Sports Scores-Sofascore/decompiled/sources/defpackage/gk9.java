package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class gk9 {
    public static final bjb a;
    public static final p4h b;
    public static final sx2 c;
    public static final pm0 d;
    public static final pm0 e;
    public static final pm0 f;
    public static final pm0 g;
    public static final pm0 h;

    static {
        KType kType;
        KType kType2;
        KType kType3;
        KType kType4;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        a = ejb.b("io.ktor.client.plugins.HttpRequestRetry");
        b = new p4h(22);
        c = new sx2("RetryFeature", (Function0) ek9.b, (Function1) new yh9(4));
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Integer.class);
        KType kType5 = null;
        try {
            kType = duf.b(cls2);
        } catch (Throwable unused) {
            kType = null;
        }
        d = new pm0("MaxRetriesPerRequestAttributeKey", new h5k(orCreateKotlinClass, kType));
        KClass orCreateKotlinClass2 = duf.a.getOrCreateKotlinClass(ct8.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            kType2 = duf.d(ct8.class, companion.invariant(duf.b(pk9.class)), companion.invariant(duf.b(xj9.class)), companion.invariant(duf.b(aq4.class)), companion.invariant(duf.b(cls)));
        } catch (Throwable unused2) {
            kType2 = null;
        }
        e = new pm0("ShouldRetryPerRequestAttributeKey", new h5k(orCreateKotlinClass2, kType2));
        KClass orCreateKotlinClass3 = duf.a.getOrCreateKotlinClass(ct8.class);
        try {
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            kType3 = duf.d(ct8.class, companion2.invariant(duf.b(pk9.class)), companion2.invariant(duf.b(yj9.class)), companion2.invariant(duf.b(Throwable.class)), companion2.invariant(duf.b(cls)));
        } catch (Throwable unused3) {
            kType3 = null;
        }
        f = new pm0("ShouldRetryOnExceptionPerRequestAttributeKey", new h5k(orCreateKotlinClass3, kType3));
        KClass orCreateKotlinClass4 = duf.a.getOrCreateKotlinClass(Function2.class);
        try {
            KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
            kType4 = duf.d(Function2.class, companion3.invariant(duf.b(ok9.class)), companion3.invariant(duf.b(yj9.class)), companion3.invariant(duf.b(Unit.class)));
        } catch (Throwable unused4) {
            kType4 = null;
        }
        g = new pm0("ModifyRequestPerRequestAttributeKey", new h5k(orCreateKotlinClass4, kType4));
        KClass orCreateKotlinClass5 = duf.a.getOrCreateKotlinClass(Function2.class);
        try {
            KTypeProjection.Companion companion4 = KTypeProjection.INSTANCE;
            kType5 = duf.d(Function2.class, companion4.invariant(duf.b(mk9.class)), companion4.invariant(duf.b(cls2)), companion4.invariant(duf.b(Long.TYPE)));
        } catch (Throwable unused5) {
        }
        h = new pm0("RetryDelayPerRequestAttributeKey", new h5k(orCreateKotlinClass5, kType5));
    }

    public static final void a(yj9 yj9Var, Function1 function1) {
        dk9 dk9Var = new dk9();
        function1.invoke(dk9Var);
        xh3 xh3Var = yj9Var.f;
        ud3 ud3Var = dk9Var.a;
        if (ud3Var == null) {
            Intrinsics.i("shouldRetry");
            throw null;
        }
        xh3Var.e(e, ud3Var);
        cv5 cv5Var = dk9Var.b;
        if (cv5Var == null) {
            Intrinsics.i("shouldRetryOnException");
            throw null;
        }
        xh3Var.e(f, cv5Var);
        he3 he3Var = dk9Var.c;
        if (he3Var == null) {
            Intrinsics.i("delayMillis");
            throw null;
        }
        xh3Var.e(h, he3Var);
        xh3Var.e(d, Integer.valueOf(dk9Var.f));
        xh3Var.e(g, dk9Var.e);
    }
}
