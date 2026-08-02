package he;

import Ad.C2379a;
import Bd.InterfaceC2627a;
import Pd.h;
import fe.C6535n;
import fe.C6537p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9820K;
import td.InterfaceC9842h;
import vd.InterfaceC10305b;

/* renamed from: he.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6924F extends z {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC9820K f65389g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f65390h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Sd.c f65391i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6924F(@NotNull InterfaceC9820K packageDescriptor, @NotNull Nd.k proto, @NotNull Pd.c nameResolver, @NotNull Pd.a metadataVersion, Ld.t tVar, @NotNull C6535n components, @NotNull String debugName, @NotNull Function0 classNames) {
        super(r0, r2, r3, r4, classNames);
        Intrinsics.checkNotNullParameter(packageDescriptor, "packageDescriptor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        Nd.s L11 = proto.L();
        Intrinsics.checkNotNullExpressionValue(L11, "getTypeTable(...)");
        Pd.g gVar = new Pd.g(L11);
        int i11 = Pd.h.f22262c;
        Nd.v M11 = proto.M();
        Intrinsics.checkNotNullExpressionValue(M11, "getVersionRequirementTable(...)");
        C6537p a11 = components.a(packageDescriptor, nameResolver, gVar, h.a.a(M11), metadataVersion, tVar);
        List<Nd.h> I11 = proto.I();
        Intrinsics.checkNotNullExpressionValue(I11, "getFunctionList(...)");
        List<Nd.m> J11 = proto.J();
        Intrinsics.checkNotNullExpressionValue(J11, "getPropertyList(...)");
        List<Nd.q> K11 = proto.K();
        Intrinsics.checkNotNullExpressionValue(K11, "getTypeAliasList(...)");
        this.f65389g = packageDescriptor;
        this.f65390h = debugName;
        this.f65391i = packageDescriptor.c();
    }

    @Override // he.z, ce.m, ce.o
    public final InterfaceC9842h d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        C2379a.b(n().c().p(), location, this.f65389g, name);
        return super.d(name, location);
    }

    @Override // ce.m, ce.o
    public final Collection e(ce.d kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Collection j11 = j(kindFilter, nameFilter, Bd.c.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<InterfaceC10305b> l11 = n().c().l();
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC10305b> it = l11.iterator();
        while (it.hasNext()) {
            C7714v.p(it.next().a(this.f65391i), arrayList);
        }
        return C7714v.p0(arrayList, j11);
    }

    @Override // he.z
    protected final void i(@NotNull ArrayList result, @NotNull Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
    }

    @Override // he.z
    @NotNull
    protected final Sd.b m(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Sd.b(this.f65391i, name);
    }

    @Override // he.z
    protected final Set<Sd.f> p() {
        return M.f71699a;
    }

    @Override // he.z
    @NotNull
    protected final Set<Sd.f> q() {
        return M.f71699a;
    }

    @Override // he.z
    @NotNull
    protected final Set<Sd.f> r() {
        return M.f71699a;
    }

    @Override // he.z
    protected final boolean s(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (super.s(name)) {
            return true;
        }
        Iterable<InterfaceC10305b> l11 = n().c().l();
        if ((l11 instanceof Collection) && ((Collection) l11).isEmpty()) {
            return false;
        }
        Iterator<InterfaceC10305b> it = l11.iterator();
        while (it.hasNext()) {
            if (it.next().b(this.f65391i, name)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String toString() {
        return this.f65390h;
    }
}
