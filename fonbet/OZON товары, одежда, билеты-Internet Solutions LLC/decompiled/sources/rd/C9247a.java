package rd;

import ie.C7056e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import rd.C9253g;
import td.InterfaceC9820K;
import td.InterfaceC9839e;
import vd.InterfaceC10305b;
import wd.L;

/* renamed from: rd.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9247a implements InterfaceC10305b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7056e f83291a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final L f83292b;

    public C9247a(@NotNull C7056e storageManager, @NotNull L module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f83291a = storageManager;
        this.f83292b = module;
    }

    @Override // vd.InterfaceC10305b
    @NotNull
    public final Collection<InterfaceC9839e> a(@NotNull Sd.c packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        return M.f71699a;
    }

    @Override // vd.InterfaceC10305b
    public final boolean b(@NotNull Sd.c packageFqName, @NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        String b11 = name.b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        if (h.e0(b11, "Function", false) || h.e0(b11, "KFunction", false) || h.e0(b11, "SuspendFunction", false) || h.e0(b11, "KSuspendFunction", false)) {
            int i11 = C9253g.f83310d;
            if (C9253g.a.a().b(packageFqName, b11) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // vd.InterfaceC10305b
    public final InterfaceC9839e c(@NotNull Sd.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (classId.i() || classId.j()) {
            return null;
        }
        String b11 = classId.g().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        if (!h.t(b11, "Function", false)) {
            return null;
        }
        Sd.c f7 = classId.f();
        int i11 = C9253g.f83310d;
        C9253g.b b12 = C9253g.a.a().b(f7, b11);
        if (b12 == null) {
            return null;
        }
        AbstractC9252f a11 = b12.a();
        int b13 = b12.b();
        List<InterfaceC9820K> M11 = this.f83292b.v(f7).M();
        ArrayList arrayList = new ArrayList();
        for (Object obj : M11) {
            if (obj instanceof qd.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof qd.h) {
                arrayList2.add(next);
            }
        }
        qd.c cVar = (qd.h) C7714v.M(arrayList2);
        if (cVar == null) {
            cVar = (qd.c) C7714v.K(arrayList);
        }
        return new C9248b(this.f83291a, cVar, a11, b13);
    }
}
