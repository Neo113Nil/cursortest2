package je;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;

/* renamed from: je.k0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7389k0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7389k0 f69897a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final td.h0 f69898b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<y0> f69899c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<td.i0, y0> f69900d;

    /* renamed from: je.k0$a */
    public static final class a {
        @NotNull
        public static C7389k0 a(C7389k0 c7389k0, @NotNull td.h0 typeAliasDescriptor, @NotNull List arguments) {
            Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            List<td.i0> parameters = typeAliasDescriptor.k().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            List<td.i0> list = parameters;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((td.i0) it.next()).n0());
            }
            return new C7389k0(c7389k0, typeAliasDescriptor, arguments, kotlin.collections.U.s(C7714v.b1(arrayList, arguments)));
        }
    }

    public C7389k0(C7389k0 c7389k0, td.h0 h0Var, List list, Map map) {
        this.f69897a = c7389k0;
        this.f69898b = h0Var;
        this.f69899c = list;
        this.f69900d = map;
    }

    @NotNull
    public final List<y0> a() {
        return this.f69899c;
    }

    @NotNull
    public final td.h0 b() {
        return this.f69898b;
    }

    public final y0 c(@NotNull s0 constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        InterfaceC9842h p11 = constructor.p();
        if (p11 instanceof td.i0) {
            return this.f69900d.get(p11);
        }
        return null;
    }

    public final boolean d(@NotNull td.h0 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (Intrinsics.d(this.f69898b, descriptor)) {
            return true;
        }
        C7389k0 c7389k0 = this.f69897a;
        return c7389k0 != null ? c7389k0.d(descriptor) : false;
    }
}
