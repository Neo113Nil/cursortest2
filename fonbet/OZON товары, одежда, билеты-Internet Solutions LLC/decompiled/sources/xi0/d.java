package xi0;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import ij0.InterfaceC7087b;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi0.h;
import vi0.AbstractC10323a;
import xe.N;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC7087b f105592a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final h f105593b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AtomicBoolean f105594c;

    public d(@NotNull InterfaceC7087b changeConfiguration, @NotNull h externalConfiguration) {
        Intrinsics.checkNotNullParameter(changeConfiguration, "changeConfiguration");
        Intrinsics.checkNotNullParameter(externalConfiguration, "externalConfiguration");
        this.f105592a = changeConfiguration;
        this.f105593b = externalConfiguration;
        this.f105594c = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        d dVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f105587g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f105587g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f105585e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f105587g;
                if (i11 != 0) {
                    s.b(obj);
                    h hVar = this.f105593b;
                    if (hVar.i() && !this.f105594c.get()) {
                        Pair[] pairArr = {new Pair(AbstractC10323a.C2233a.f102983c, hVar.a()), new Pair(AbstractC10323a.k.f102993c, hVar.g()), new Pair(AbstractC10323a.j.f102992c, hVar.j()), new Pair(AbstractC10323a.g.f102989c, hVar.f()), new Pair(AbstractC10323a.e.f102987c, hVar.d()), new Pair(AbstractC10323a.c.f102985c, hVar.b()), new Pair(AbstractC10323a.f.f102988c, hVar.e()), new Pair(AbstractC10323a.d.f102986c, hVar.c()), new Pair(AbstractC10323a.h.f102990c, hVar.h())};
                        Function1[] function1Arr = new Function1[9];
                        for (int i13 = 0; i13 < 9; i13++) {
                            Pair pair = pairArr[i13];
                            function1Arr[i13] = new c(pair.b(), this, (fj0.d) pair.a(), null);
                        }
                        C10780a c10780a = new C10780a((Function1[]) Arrays.copyOf(function1Arr, 9), null);
                        bVar.f105584d = this;
                        bVar.f105587g = 1;
                        if (N.d(c10780a, bVar) == aVar) {
                            return aVar;
                        }
                        dVar = this;
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = bVar.f105584d;
                s.b(obj);
                dVar.f105594c.compareAndSet(false, true);
                return Unit.f71690a;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f105585e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f105587g;
        if (i11 != 0) {
        }
        dVar.f105594c.compareAndSet(false, true);
        return Unit.f71690a;
    }
}
