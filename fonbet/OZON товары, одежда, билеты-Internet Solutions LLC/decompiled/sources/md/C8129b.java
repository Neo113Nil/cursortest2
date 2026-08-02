package md;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.f;
import kotlin.reflect.q;
import kotlin.reflect.r;
import nd.R0;
import nd.V0;
import org.jetbrains.annotations.NotNull;
import td.EnumC9840f;
import td.InterfaceC9839e;
import td.InterfaceC9842h;

/* renamed from: md.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8129b {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final kotlin.reflect.d<?> a(@NotNull f fVar) {
        InterfaceC9839e interfaceC9839e;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof kotlin.reflect.d) {
            return (kotlin.reflect.d) fVar;
        }
        if (!(fVar instanceof r)) {
            throw new V0("Cannot calculate JVM erasure for type: " + fVar);
        }
        List<q> upperBounds = ((r) fVar).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            q qVar = (q) next;
            Intrinsics.g(qVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC9842h p11 = ((R0) qVar).i().H0().p();
            interfaceC9839e = p11 instanceof InterfaceC9839e ? (InterfaceC9839e) p11 : null;
            if (interfaceC9839e != null && interfaceC9839e.getKind() != EnumC9840f.INTERFACE && interfaceC9839e.getKind() != EnumC9840f.ANNOTATION_CLASS) {
                interfaceC9839e = next;
                break;
            }
        }
        q qVar2 = (q) interfaceC9839e;
        if (qVar2 == null) {
            qVar2 = (q) C7714v.M(upperBounds);
        }
        return qVar2 != null ? b(qVar2) : N.b(Object.class);
    }

    @NotNull
    public static final kotlin.reflect.d<?> b(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        f d11 = qVar.d();
        if (d11 != null) {
            return a(d11);
        }
        throw new V0("Cannot calculate JVM erasure for type: " + qVar);
    }
}
