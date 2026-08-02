package sd;

import ie.InterfaceC7061j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import qd.s;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9815F;
import td.InterfaceC9820K;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import vd.InterfaceC10305b;
import wd.C10530p;
import wd.L;

/* renamed from: sd.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9665g implements InterfaceC10305b {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Sd.f f98585g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Sd.b f98586h;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L f98587a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<InterfaceC9815F, InterfaceC9845k> f98588b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f98589c;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f98583e = {N.h(new E(N.b(C9665g.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f98582d = new a();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Sd.c f98584f = qd.s.f81865l;

    /* renamed from: sd.g$a */
    public static final class a {
    }

    static {
        Sd.d dVar = s.a.f81901c;
        Sd.f i11 = dVar.i();
        Intrinsics.checkNotNullExpressionValue(i11, "shortName(...)");
        f98585g = i11;
        Sd.c topLevelFqName = dVar.l();
        Intrinsics.checkNotNullExpressionValue(topLevelFqName, "toSafe(...)");
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        Sd.c e11 = topLevelFqName.e();
        f98586h = new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)"));
    }

    public C9665g() {
        throw null;
    }

    public C9665g(ie.o storageManager, L moduleDescriptor) {
        C9664f computeContainingDeclaration = C9664f.f98581a;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(computeContainingDeclaration, "computeContainingDeclaration");
        this.f98587a = moduleDescriptor;
        this.f98588b = computeContainingDeclaration;
        this.f98589c = storageManager.a(new C9663e(this, storageManager));
    }

    static C10530p e(C9665g c9665g, ie.o storageManager) {
        Function1<InterfaceC9815F, InterfaceC9845k> function1 = c9665g.f98588b;
        L l11 = c9665g.f98587a;
        C10530p containingClass = new C10530p(function1.invoke(l11), f98585g, EnumC9812C.ABSTRACT, EnumC9840f.INTERFACE, C7714v.a0(l11.n().i()), storageManager);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        containingClass.F0(new C9659a(storageManager, containingClass), M.f71699a, null);
        return containingClass;
    }

    static qd.c f(InterfaceC9815F module) {
        Intrinsics.checkNotNullParameter(module, "module");
        List<InterfaceC9820K> M11 = module.v(f98584f).M();
        ArrayList arrayList = new ArrayList();
        for (Object obj : M11) {
            if (obj instanceof qd.c) {
                arrayList.add(obj);
            }
        }
        return (qd.c) C7714v.K(arrayList);
    }

    @Override // vd.InterfaceC10305b
    @NotNull
    public final Collection<InterfaceC9839e> a(@NotNull Sd.c packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        if (!Intrinsics.d(packageFqName, f98584f)) {
            return M.f71699a;
        }
        return e0.h((C10530p) ie.n.a(this.f98589c, f98583e[0]));
    }

    @Override // vd.InterfaceC10305b
    public final boolean b(@NotNull Sd.c packageFqName, @NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.d(name, f98585g) && Intrinsics.d(packageFqName, f98584f);
    }

    @Override // vd.InterfaceC10305b
    public final InterfaceC9839e c(@NotNull Sd.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (!Intrinsics.d(classId, f98586h)) {
            return null;
        }
        return (C10530p) ie.n.a(this.f98589c, f98583e[0]);
    }
}
