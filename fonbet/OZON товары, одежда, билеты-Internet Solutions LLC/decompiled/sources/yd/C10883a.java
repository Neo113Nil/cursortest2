package yd;

import Ld.q;
import Ld.x;
import Ld.y;
import Md.a;
import ae.C5002d;
import ce.C5815b;
import ce.l;
import he.C6924F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd.C10533t;

/* renamed from: yd.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10883a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q f106561a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f106562b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Sd.b, l> f106563c;

    public C10883a(@NotNull q resolver, @NotNull g kotlinClassFinder) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f106561a = resolver;
        this.f106562b = kotlinClassFinder;
        this.f106563c = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    @NotNull
    public final l a(@NotNull f fileClass) {
        ?? a02;
        Intrinsics.checkNotNullParameter(fileClass, "fileClass");
        ConcurrentHashMap<Sd.b, l> concurrentHashMap = this.f106563c;
        Sd.b b11 = fileClass.b();
        l lVar = concurrentHashMap.get(b11);
        if (lVar == null) {
            Sd.c f7 = fileClass.b().f();
            a.EnumC0345a c11 = fileClass.a().c();
            a.EnumC0345a enumC0345a = a.EnumC0345a.MULTIFILE_CLASS;
            q qVar = this.f106561a;
            if (c11 == enumC0345a) {
                List<String> f11 = fileClass.a().f();
                a02 = new ArrayList();
                Iterator it = f11.iterator();
                while (it.hasNext()) {
                    Sd.c topLevelFqName = C5002d.d((String) it.next()).e();
                    Intrinsics.checkNotNullExpressionValue(topLevelFqName, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                    Sd.c e11 = topLevelFqName.e();
                    y a11 = x.a(this.f106562b, new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)")), te.c.a(qVar.c().g()));
                    if (a11 != null) {
                        a02.add(a11);
                    }
                }
            } else {
                a02 = C7714v.a0(fileClass);
            }
            C10533t c10533t = new C10533t(qVar.c().q(), f7);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((Iterable) a02).iterator();
            while (it2.hasNext()) {
                C6924F b12 = qVar.b(c10533t, (y) it2.next());
                if (b12 != null) {
                    arrayList.add(b12);
                }
            }
            l a12 = C5815b.a.a(C7714v.U0(arrayList), "package " + f7 + " (" + fileClass + ')');
            l putIfAbsent = concurrentHashMap.putIfAbsent(b11, a12);
            lVar = putIfAbsent == null ? a12 : putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(lVar, "getOrPut(...)");
        return lVar;
    }
}
