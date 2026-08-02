package nd;

import Bd.b;
import Cd.C2739A;
import Cd.C2742c;
import Cd.t;
import Dd.j;
import Fd.e;
import Kd.C3510g;
import Ld.E;
import ae.C5001c;
import be.C5655a;
import fe.C6535n;
import fe.InterfaceC6534m;
import ie.C7056e;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import je.C7400u;
import ke.q;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import me.C8136a;
import org.jetbrains.annotations.NotNull;
import sd.C9669k;
import td.C9819J;
import td.g0;
import wd.C10531q;
import yd.C10883a;
import zd.C11104f;

/* loaded from: classes.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ConcurrentHashMap f76926a = new ConcurrentHashMap();

    @NotNull
    public static final yd.j a(@NotNull Class<?> cls) {
        C2739A javaTypeEnhancementState;
        C2739A c2739a;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = C11104f.f(cls);
        h1 h1Var = new h1(classLoader);
        ConcurrentHashMap concurrentHashMap = f76926a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(h1Var);
        if (weakReference != null) {
            yd.j jVar = (yd.j) weakReference.get();
            if (jVar != null) {
                return jVar;
            }
            concurrentHashMap.remove(h1Var, weakReference);
        }
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        yd.g kotlinClassFinder = new yd.g(classLoader);
        ClassLoader classLoader2 = Unit.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader2, "getClassLoader(...)");
        yd.g jvmBuiltInsKotlinClassFinder = new yd.g(classLoader2);
        yd.d javaClassFinder = new yd.d(classLoader);
        String moduleName = "runtime module for " + classLoader;
        yd.i errorReporter = yd.i.f106571b;
        yd.k javaSourceElementFactory = yd.k.f106574a;
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
        Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
        C7056e storageManager = new C7056e("DeserializationComponentsForJava.ModuleData");
        C9669k c9669k = new C9669k(storageManager, C9669k.a.FROM_DEPENDENCIES);
        Sd.f i11 = Sd.f.i("<" + moduleName + '>');
        Intrinsics.checkNotNullExpressionValue(i11, "special(...)");
        wd.L module = new wd.L(i11, storageManager, c9669k, 56);
        c9669k.n0(module);
        c9669k.q0(module);
        Ld.q deserializedDescriptorResolver = new Ld.q();
        Fd.n singleModuleClassResolver = new Fd.n();
        C9819J notFoundClasses = new C9819J(storageManager, module);
        E.a packagePartProvider = E.a.f16739a;
        Intrinsics.checkNotNullParameter(javaClassFinder, "javaClassFinder");
        Intrinsics.checkNotNullParameter(module, "module");
        h1 h1Var2 = h1Var;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "reflectKotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(javaSourceElementFactory, "javaSourceElementFactory");
        Intrinsics.checkNotNullParameter(singleModuleClassResolver, "singleModuleClassResolver");
        Intrinsics.checkNotNullParameter(packagePartProvider, "packagePartProvider");
        Dd.p DO_NOTHING = Dd.p.f6590a;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        Dd.k EMPTY = Dd.k.f6583a;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        j.a aVar = j.a.f6582a;
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        C5655a c5655a = new C5655a(storageManager, k11);
        g0.a aVar2 = g0.a.f99394a;
        b.a aVar3 = b.a.f3547a;
        qd.r rVar = new qd.r(module, notFoundClasses);
        javaTypeEnhancementState = C2739A.f4676d;
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        C2742c c2742c = new C2742c(javaTypeEnhancementState);
        e.a javaResolverSettings = e.a.f9386a;
        Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
        C3510g typeEnhancement = new C3510g();
        Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
        Kd.e0 e0Var = new Kd.e0();
        t.a aVar4 = t.a.f4773a;
        ke.q.f71506b.getClass();
        ke.r a11 = q.a.a();
        c2739a = C2739A.f4676d;
        Fd.j lazyJavaPackageFragmentProvider = new Fd.j(new Fd.d(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, aVar, c5655a, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, aVar2, aVar3, module, rVar, c2742c, e0Var, aVar4, javaResolverSettings, a11, c2739a, new Ld.o()));
        Rd.e jvmMetadataVersion = Rd.e.f25015g;
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "reflectKotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        Ld.r rVar2 = new Ld.r(deserializedDescriptorResolver, kotlinClassFinder);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        Ld.j jVar2 = new Ld.j(module, notFoundClasses, storageManager, kotlinClassFinder);
        jVar2.z(jvmMetadataVersion);
        Ld.n components = new Ld.n(storageManager, module, rVar2, jVar2, lazyJavaPackageFragmentProvider, notFoundClasses, InterfaceC6534m.a.a(), q.a.a(), new C8136a(C7714v.a0(C7400u.f69929a)));
        Intrinsics.checkNotNullParameter(components, "components");
        C6535n a12 = components.a();
        Intrinsics.checkNotNullParameter(a12, "<set-?>");
        deserializedDescriptorResolver.f16806a = a12;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        C5001c c5001c = new C5001c(lazyJavaPackageFragmentProvider);
        Intrinsics.checkNotNullParameter(c5001c, "<set-?>");
        singleModuleClassResolver.f9407a = c5001c;
        sd.y yVar = new sd.y(storageManager, jvmBuiltInsKotlinClassFinder, module, notFoundClasses, c9669k.p0(), c9669k.p0(), q.a.a(), new C5655a(storageManager, k11));
        module.H0(module);
        module.G0(new C10531q(C7714v.b0(c5001c.a(), yVar), "CompositeProvider@RuntimeModuleData for " + module));
        Ld.m mVar = new Ld.m(components, deserializedDescriptorResolver);
        yd.j jVar3 = new yd.j(mVar.a().a(), new C10883a(mVar.b(), kotlinClassFinder));
        while (true) {
            h1 h1Var3 = h1Var2;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
            WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(h1Var3, new WeakReference(jVar3));
            if (weakReference2 == null) {
                return jVar3;
            }
            yd.j jVar4 = (yd.j) weakReference2.get();
            if (jVar4 != null) {
                return jVar4;
            }
            concurrentHashMap3.remove(h1Var3, weakReference2);
            h1Var2 = h1Var3;
            concurrentHashMap2 = concurrentHashMap3;
        }
    }
}
