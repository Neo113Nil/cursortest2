package wd;

import E0.C2942q;
import Sc.InterfaceC4008j;
import ie.C7056e;
import ie.InterfaceC7059h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9814E;
import td.C9860z;
import td.InterfaceC9815F;
import td.InterfaceC9821L;
import td.InterfaceC9827S;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import ud.InterfaceC10030h;
import wd.O;

/* loaded from: classes.dex */
public final class L extends r implements InterfaceC9815F {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7056e f104193c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qd.m f104194d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<C9814E<?>, Object> f104195e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final O f104196f;

    /* renamed from: g, reason: collision with root package name */
    private I f104197g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC9821L f104198h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f104199i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC7059h<Sd.c, InterfaceC9827S> f104200j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f104201k;

    public L() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Sd.f moduleName, C7056e storageManager, qd.m builtIns, int i11) {
        super(InterfaceC10030h.a.b(), moduleName);
        Map<C9814E<?>, Object> capabilities = kotlin.collections.U.c();
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        this.f104193c = storageManager;
        this.f104194d = builtIns;
        if (!moduleName.g()) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f104195e = capabilities;
        O.f104211a.getClass();
        O o11 = (O) F(O.a.a());
        this.f104196f = o11 == null ? O.b.f104214b : o11;
        this.f104199i = true;
        this.f104200j = storageManager.d(new J(this));
        this.f104201k = Sc.k.b(new K(this));
    }

    static C10531q C0(L l11) {
        I i11 = l11.f104197g;
        if (i11 == null) {
            StringBuilder sb2 = new StringBuilder("Dependencies of module ");
            String fVar = l11.getName().toString();
            Intrinsics.checkNotNullExpressionValue(fVar, "toString(...)");
            sb2.append(fVar);
            sb2.append(" were not set before querying module content");
            throw new AssertionError(sb2.toString());
        }
        List<L> a11 = i11.a();
        if (!l11.f104199i) {
            C9860z.a(l11);
        }
        a11.contains(l11);
        List<L> list = a11;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((L) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC9821L interfaceC9821L = ((L) it2.next()).f104198h;
            Intrinsics.f(interfaceC9821L);
            arrayList.add(interfaceC9821L);
        }
        return new C10531q(arrayList, "CompositeProvider@ModuleDescriptor for " + l11.getName());
    }

    static InterfaceC9827S n0(L l11, Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return l11.f104196f.a(l11, fqName, l11.f104193c);
    }

    @Override // td.InterfaceC9815F
    public final boolean D0(@NotNull InterfaceC9815F targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        if (equals(targetModule)) {
            return true;
        }
        I i11 = this.f104197g;
        Intrinsics.f(i11);
        return C7714v.A(i11.c(), targetModule) || ((kotlin.collections.K) Q()).contains(targetModule) || targetModule.Q().contains(this);
    }

    @Override // td.InterfaceC9815F
    public final <T> T F(@NotNull C9814E<T> capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        T t2 = (T) this.f104195e.get(capability);
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    @NotNull
    public final C10531q F0() {
        if (!this.f104199i) {
            C9860z.a(this);
        }
        return (C10531q) this.f104201k.getValue();
    }

    public final void G0(@NotNull InterfaceC9821L providerForModuleContent) {
        Intrinsics.checkNotNullParameter(providerForModuleContent, "providerForModuleContent");
        this.f104198h = providerForModuleContent;
    }

    public final void H0(@NotNull L... descriptors) {
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        List descriptors2 = C7705l.f0(descriptors);
        Intrinsics.checkNotNullParameter(descriptors2, "descriptors");
        kotlin.collections.M friends = kotlin.collections.M.f71699a;
        Intrinsics.checkNotNullParameter(descriptors2, "descriptors");
        Intrinsics.checkNotNullParameter(friends, "friends");
        I dependencies = new I(descriptors2, friends, kotlin.collections.K.f71697a, friends);
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.f104197g = dependencies;
    }

    @Override // td.InterfaceC9815F
    @NotNull
    public final List<InterfaceC9815F> Q() {
        I i11 = this.f104197g;
        if (i11 != null) {
            return i11.b();
        }
        StringBuilder sb2 = new StringBuilder("Dependencies of module ");
        String fVar = getName().toString();
        Intrinsics.checkNotNullExpressionValue(fVar, "toString(...)");
        sb2.append(fVar);
        sb2.append(" were not set");
        throw new AssertionError(sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // td.InterfaceC9845k
    public final <R, D> R X(@NotNull InterfaceC9847m<R, D> visitor, D d11) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return (R) visitor.l(this, (StringBuilder) d11);
    }

    @Override // td.InterfaceC9845k
    public final InterfaceC9845k d() {
        return null;
    }

    @Override // td.InterfaceC9815F
    @NotNull
    public final Collection<Sd.c> j(@NotNull Sd.c fqName, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!this.f104199i) {
            C9860z.a(this);
        }
        return F0().j(fqName, nameFilter);
    }

    @Override // td.InterfaceC9815F
    @NotNull
    public final qd.m n() {
        return this.f104194d;
    }

    @Override // wd.r
    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r.V(this));
        if (!this.f104199i) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        InterfaceC9821L interfaceC9821L = this.f104198h;
        return C2942q.c(sb2, interfaceC9821L != null ? interfaceC9821L.getClass().getSimpleName() : null, "toString(...)");
    }

    @Override // td.InterfaceC9815F
    @NotNull
    public final InterfaceC9827S v(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (!this.f104199i) {
            C9860z.a(this);
        }
        return this.f104200j.invoke(fqName);
    }
}
