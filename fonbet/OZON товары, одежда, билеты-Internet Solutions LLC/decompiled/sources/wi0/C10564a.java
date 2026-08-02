package wi0;

import Sc.InterfaceC4008j;
import fj0.d;
import ij0.e;
import java.util.Arrays;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.coroutines.jvm.internal.j;
import org.jetbrains.annotations.NotNull;
import vi0.AbstractC10323a;

/* renamed from: wi0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10564a {
    public static final Object a(@NotNull e eVar, @NotNull j jVar) {
        InterfaceC4008j interfaceC4008j;
        interfaceC4008j = AbstractC10323a.f102981a;
        d[] dVarArr = (d[]) ((Set) interfaceC4008j.getValue()).toArray(new d[0]);
        d dVar = (d) C7705l.C(dVarArr);
        d[] dVarArr2 = (d[]) C7705l.w(1, dVarArr.length, dVarArr);
        Object a11 = eVar.a(dVar, (d[]) Arrays.copyOf(dVarArr2, dVarArr2.length), jVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
