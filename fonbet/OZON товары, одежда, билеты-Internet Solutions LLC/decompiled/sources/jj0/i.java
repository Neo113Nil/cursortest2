package jj0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.S;
import org.jetbrains.annotations.NotNull;
import xe.N;

/* loaded from: classes3.dex */
public final class i implements ij0.e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Nl.a f70159a;

    public i(@NotNull Nl.a configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f70159a = configurationRepository;
    }

    public static final Object b(i iVar, fj0.d dVar, kotlin.coroutines.jvm.internal.j jVar) {
        Object f7;
        iVar.getClass();
        Object a11 = dVar.a();
        boolean z11 = a11 instanceof Integer;
        Nl.a aVar = iVar.f70159a;
        if (!z11) {
            return ((a11 instanceof Boolean) && (f7 = aVar.a().f(dVar.getKey(), ((Boolean) a11).booleanValue(), jVar)) == Wc.a.COROUTINE_SUSPENDED) ? f7 : Unit.f71690a;
        }
        Object c11 = aVar.a().c(((Number) a11).intValue(), dVar.getKey(), jVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }

    @Override // ij0.e
    public final Object a(@NotNull fj0.d dVar, @NotNull fj0.d[] dVarArr, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        int length = dVarArr.length;
        Function1[] function1Arr = new Function1[length];
        for (int i11 = 0; i11 < length; i11++) {
            function1Arr[i11] = new h(this, dVarArr, i11, null);
        }
        S s11 = new S(2);
        s11.a(new g(this, dVar, null));
        s11.b(function1Arr);
        Object d11 = N.d(new Dj0.a((Function1[]) s11.d(new Function1[s11.c()]), null), jVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }
}
