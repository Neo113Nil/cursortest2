package ru.ozon.android.messenger.framework.data.repository;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Je.InterfaceC3394a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.d;
import xe.AbstractC10711a;
import xe.B0;
import xe.H0;

/* loaded from: classes10.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f88589a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xe.M f88590b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xe.I f88591c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private WeakReference<d.g> f88592d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Je.d f88593e;

    /* renamed from: f, reason: collision with root package name */
    private B0 f88594f;

    public n0(@NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, @NotNull xe.M externalScope, @NotNull xe.I mainDispatcher) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(externalScope, "externalScope");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.f88589a = repository;
        this.f88590b = externalScope;
        this.f88591c = mainDispatcher;
        this.f88592d = new WeakReference<>(null);
        this.f88593e = Je.e.a();
    }

    public final void c(@NotNull d.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f88592d = new WeakReference<>(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [Je.a, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        j0 j0Var;
        Object obj;
        Object obj2;
        ?? r22;
        n0 n0Var;
        InterfaceC3394a interfaceC3394a;
        B0 b02;
        n0 n0Var2;
        n0 n0Var3;
        try {
            if (cVar instanceof j0) {
                j0Var = (j0) cVar;
                int i11 = j0Var.f88561i;
                if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    j0Var.f88561i = i11 - LinearLayoutManager.INVALID_OFFSET;
                    obj = j0Var.f88559g;
                    obj2 = Wc.a.COROUTINE_SUSPENDED;
                    r22 = j0Var.f88561i;
                    if (r22 != 0) {
                        Sc.s.b(obj);
                        j0Var.f88556d = this;
                        Je.d dVar = this.f88593e;
                        j0Var.f88557e = dVar;
                        j0Var.f88561i = 1;
                        if (dVar.a(j0Var) != obj2) {
                            n0Var = this;
                            interfaceC3394a = dVar;
                        }
                        return obj2;
                    }
                    if (r22 != 1) {
                        if (r22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        n0Var3 = j0Var.f88558f;
                        interfaceC3394a = j0Var.f88557e;
                        n0Var2 = j0Var.f88556d;
                        Sc.s.b(obj);
                        n0Var3.f88594f = C2399j.C(new C2408n0(C2399j.J(new l0((InterfaceC2395h) obj), 1000L), new k0(n0Var2, null)), n0Var2.f88590b);
                        Unit unit = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return unit;
                    }
                    interfaceC3394a = j0Var.f88557e;
                    n0Var = j0Var.f88556d;
                    Sc.s.b(obj);
                    b02 = n0Var.f88594f;
                    if (b02 == null && ((AbstractC10711a) b02).isActive()) {
                        Unit unit2 = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return unit2;
                    }
                    ru.ozon.android.messenger.framework.domain.repository.b bVar = n0Var.f88589a;
                    j0Var.f88556d = n0Var;
                    j0Var.f88557e = interfaceC3394a;
                    j0Var.f88558f = n0Var;
                    j0Var.f88561i = 2;
                    obj = bVar.getEvents();
                    if (obj != obj2) {
                        n0Var2 = n0Var;
                        n0Var3 = n0Var2;
                        n0Var3.f88594f = C2399j.C(new C2408n0(C2399j.J(new l0((InterfaceC2395h) obj), 1000L), new k0(n0Var2, null)), n0Var2.f88590b);
                        Unit unit3 = Unit.f71690a;
                        interfaceC3394a.c(null);
                        return unit3;
                    }
                    return obj2;
                }
            }
            if (r22 != 0) {
            }
            b02 = n0Var.f88594f;
            if (b02 == null) {
            }
            ru.ozon.android.messenger.framework.domain.repository.b bVar2 = n0Var.f88589a;
            j0Var.f88556d = n0Var;
            j0Var.f88557e = interfaceC3394a;
            j0Var.f88558f = n0Var;
            j0Var.f88561i = 2;
            obj = bVar2.getEvents();
            if (obj != obj2) {
            }
            return obj2;
        } catch (Throwable th2) {
            r22.c(null);
            throw th2;
        }
        j0Var = new j0(this, cVar);
        obj = j0Var.f88559g;
        obj2 = Wc.a.COROUTINE_SUSPENDED;
        r22 = j0Var.f88561i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:12:0x0048, B:15:0x0054, B:20:0x004d), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        m0 m0Var;
        int i11;
        n0 n0Var;
        Je.d dVar;
        B0 b02;
        try {
            if (cVar instanceof m0) {
                m0Var = (m0) cVar;
                int i12 = m0Var.f88584h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    m0Var.f88584h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = m0Var.f88582f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = m0Var.f88584h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        m0Var.f88580d = this;
                        Je.d dVar2 = this.f88593e;
                        m0Var.f88581e = dVar2;
                        m0Var.f88584h = 1;
                        if (dVar2.a(m0Var) == aVar) {
                            return aVar;
                        }
                        n0Var = this;
                        dVar = dVar2;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar = m0Var.f88581e;
                        n0Var = m0Var.f88580d;
                        Sc.s.b(obj);
                    }
                    b02 = n0Var.f88594f;
                    if (b02 == null) {
                        ((H0) b02).j(null);
                        n0Var.f88594f = null;
                    }
                    return Unit.f71690a;
                }
            }
            b02 = n0Var.f88594f;
            if (b02 == null) {
            }
            return Unit.f71690a;
        } finally {
            dVar.c(null);
        }
        m0Var = new m0(this, cVar);
        Object obj2 = m0Var.f88582f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = m0Var.f88584h;
        if (i11 != 0) {
        }
    }
}
