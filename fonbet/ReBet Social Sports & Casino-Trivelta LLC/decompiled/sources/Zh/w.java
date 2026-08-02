package Zh;

import ai.AbstractC2028a;
import di.AbstractC4105o;
import di.C0;
import di.D0;
import di.V0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* loaded from: classes5.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final V0 f14881a = AbstractC4105o.a(new Function1() { // from class: Zh.q
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            InterfaceC1901b k10;
            k10 = w.k((KClass) obj);
            return k10;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    public static final V0 f14882b = AbstractC4105o.a(new Function1() { // from class: Zh.r
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            InterfaceC1901b l10;
            l10 = w.l((KClass) obj);
            return l10;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public static final C0 f14883c = AbstractC4105o.b(new Function2() { // from class: Zh.s
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            InterfaceC1901b g10;
            g10 = w.g((KClass) obj, (List) obj2);
            return g10;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public static final C0 f14884d = AbstractC4105o.b(new Function2() { // from class: Zh.t
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            InterfaceC1901b i10;
            i10 = w.i((KClass) obj, (List) obj2);
            return i10;
        }
    });

    public static final InterfaceC1901b g(KClass clazz, final List types) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List e10 = x.e(gi.g.a(), types, true);
        Intrinsics.checkNotNull(e10);
        return x.a(clazz, e10, new Function0() { // from class: Zh.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KClassifier h10;
                h10 = w.h(types);
                return h10;
            }
        });
    }

    public static final KClassifier h(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    public static final InterfaceC1901b i(KClass clazz, final List types) {
        InterfaceC1901b t10;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List e10 = x.e(gi.g.a(), types, true);
        Intrinsics.checkNotNull(e10);
        InterfaceC1901b a10 = x.a(clazz, e10, new Function0() { // from class: Zh.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KClassifier j10;
                j10 = w.j(types);
                return j10;
            }
        });
        if (a10 == null || (t10 = AbstractC2028a.t(a10)) == null) {
            return null;
        }
        return t10;
    }

    public static final KClassifier j(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    public static final InterfaceC1901b k(KClass it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC1901b d10 = x.d(it);
        if (d10 != null) {
            return d10;
        }
        if (D0.l(it)) {
            return new g(it);
        }
        return null;
    }

    public static final InterfaceC1901b l(KClass it) {
        InterfaceC1901b t10;
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC1901b d10 = x.d(it);
        if (d10 == null) {
            d10 = D0.l(it) ? new g(it) : null;
        }
        if (d10 == null || (t10 = AbstractC2028a.t(d10)) == null) {
            return null;
        }
        return t10;
    }

    public static final InterfaceC1901b m(KClass clazz, boolean z10) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (z10) {
            return f14882b.a(clazz);
        }
        InterfaceC1901b a10 = f14881a.a(clazz);
        if (a10 != null) {
            return a10;
        }
        return null;
    }

    public static final Object n(KClass clazz, List types, boolean z10) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        return !z10 ? f14883c.a(clazz, types) : f14884d.a(clazz, types);
    }
}
