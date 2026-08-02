package ru.ozon.android.messenger.framework.data.repository;

import Ae.C2399j;
import Ae.C2417s0;
import Ae.I0;
import Ae.M0;
import De.C2862e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import xe.B0;
import xe.C10720e0;
import xe.H0;
import xe.X0;

/* loaded from: classes10.dex */
public final class Y implements ru.ozon.android.messenger.framework.domain.repository.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.a f88440a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.B f88441b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.presentation.models.B f88442c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M0<ru.ozon.android.messenger.framework.domain.model.b> f88443d;

    static final class a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f88444b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
            super(1);
            this.f88444b = qVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
            ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
            Intrinsics.checkNotNullParameter(it, "it");
            String e11 = ru.ozon.android.messenger.framework.presentation.models.r.e(it);
            return Boolean.valueOf((e11 == null || kotlin.text.h.K(e11) || !Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.e(it), ru.ozon.android.messenger.framework.presentation.models.r.e(this.f88444b))) ? false : true);
        }
    }

    public Y(@NotNull ru.ozon.android.messenger.framework.data.local.a chatItemsStorage, @NotNull ru.ozon.android.messenger.framework.domain.usecases.B mapBlockUpdateUseCase, ru.ozon.android.messenger.framework.presentation.models.B b11) {
        Intrinsics.checkNotNullParameter(chatItemsStorage, "chatItemsStorage");
        Intrinsics.checkNotNullParameter(mapBlockUpdateUseCase, "mapBlockUpdateUseCase");
        this.f88440a = chatItemsStorage;
        this.f88441b = mapBlockUpdateUseCase;
        this.f88442c = b11;
        B0 b12 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = xe.N.a(CoroutineContext.Element.a.d(De.s.f6650a.x(), (H0) b12));
        C2417s0 b13 = chatItemsStorage.b();
        int i11 = I0.f818a;
        I0 c11 = I0.a.c();
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        this.f88443d = C2399j.M(b13, a11, c11, new ru.ozon.android.messenger.framework.domain.model.b(new ru.ozon.android.messenger.framework.domain.model.i(k11, k11), new ru.ozon.android.messenger.framework.domain.model.a(new ArrayList(), false)));
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final Object a(@NotNull ru.ozon.android.messenger.framework.domain.model.c cVar, @NotNull List list, @NotNull kotlin.coroutines.jvm.internal.c cVar2) {
        Object a11 = this.f88440a.a(cVar, list, cVar2);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    @NotNull
    public final M0<ru.ozon.android.messenger.framework.domain.model.b> b() {
        return this.f88443d;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final Object c(@NotNull ru.ozon.android.messenger.framework.presentation.models.q[] qVarArr, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object c11 = this.f88440a.c((ru.ozon.android.messenger.framework.presentation.models.q[]) Arrays.copyOf(qVarArr, qVarArr.length), cVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final void d(@NotNull ArrayList widgets) {
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        this.f88440a.d(widgets);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final Object e(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object e11 = this.f88440a.e(cVar);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final void f(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f88440a.f(id2);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final Object g(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object g10 = this.f88440a.g(function1, cVar);
        return g10 == Wc.a.COROUTINE_SUSPENDED ? g10 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final Object h(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object h11 = this.f88440a.h(str, cVar);
        return h11 == Wc.a.COROUTINE_SUSPENDED ? h11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final Object i(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object i11 = this.f88440a.i(function1, cVar);
        return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.q> j(@NotNull Function1<? super ru.ozon.android.messenger.framework.presentation.models.q, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return this.f88440a.j(predicate);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final Object k(@NotNull List list, kotlin.collections.K k11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object p11 = this.f88440a.p(list, k11, cVar);
        return p11 == Wc.a.COROUTINE_SUSPENDED ? p11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final Object l(@NotNull ru.ozon.android.messenger.framework.presentation.models.q qVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Unit l11 = this.f88440a.l(qVar);
        return l11 == Wc.a.COROUTINE_SUSPENDED ? l11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final Object m(@NotNull d.w wVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object s11 = this.f88440a.s(new Z(this, wVar), cVar);
        return s11 == Wc.a.COROUTINE_SUSPENDED ? s11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final boolean n(@NotNull ru.ozon.android.messenger.framework.presentation.models.q item) {
        Object obj;
        Intrinsics.checkNotNullParameter(item, "item");
        a aVar = new a(item);
        Iterator<T> it = this.f88440a.k().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) obj;
            if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(qVar), ru.ozon.android.messenger.framework.presentation.models.r.d(item)) || ((Boolean) aVar.invoke(qVar)).booleanValue()) {
                break;
            }
        }
        return obj != null;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final Object o(@NotNull ru.ozon.android.messenger.framework.presentation.models.q qVar, @NotNull String[] strArr, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        return this.f88440a.n((String[]) Arrays.copyOf(strArr, strArr.length), qVar, jVar);
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final boolean p(@NotNull String blockId) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        ru.ozon.android.messenger.framework.data.local.a aVar = this.f88440a;
        if (aVar.k().isEmpty()) {
            return false;
        }
        List<ru.ozon.android.messenger.framework.presentation.models.q> k11 = aVar.k();
        if ((k11 instanceof Collection) && k11.isEmpty()) {
            return false;
        }
        Iterator<T> it = k11.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d((ru.ozon.android.messenger.framework.presentation.models.q) it.next()), blockId)) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final Object q(@NotNull d.w wVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object g10 = this.f88440a.g(new a0(this, wVar), cVar);
        return g10 == Wc.a.COROUTINE_SUSPENDED ? g10 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.domain.repository.d
    public final Object r(@NotNull String str, CustomBlockDTO customBlockDTO, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object obj;
        Object obj2;
        Object invoke;
        List<ru.ozon.android.messenger.framework.presentation.models.q> b11 = this.f88443d.getValue().b().b();
        Iterator<T> it = b11.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (ru.ozon.android.messenger.framework.presentation.models.r.b((ru.ozon.android.messenger.framework.presentation.models.q) obj) instanceof ru.ozon.android.messenger.blocks.ai.input.presentation.a) {
                break;
            }
        }
        ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) obj;
        Iterator<T> it2 = b11.iterator();
        loop1: while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            List<ru.ozon.android.messenger.framework.presentation.models.u> b12 = ((ru.ozon.android.messenger.framework.presentation.models.q) obj2).b();
            if (!(b12 instanceof Collection) || !b12.isEmpty()) {
                Iterator<T> it3 = b12.iterator();
                while (it3.hasNext()) {
                    if (((ru.ozon.android.messenger.framework.presentation.models.u) it3.next()).c() instanceof ru.ozon.android.messenger.blocks.input.d) {
                        break loop1;
                    }
                }
            }
        }
        ru.ozon.android.messenger.framework.presentation.models.q qVar2 = (ru.ozon.android.messenger.framework.presentation.models.q) obj2;
        if (qVar2 == null) {
            return (qVar == null && (invoke = function1.invoke(dVar)) == Wc.a.COROUTINE_SUSPENDED) ? invoke : Unit.f71690a;
        }
        List<ru.ozon.android.messenger.framework.presentation.models.u> b13 = qVar2.b();
        ArrayList arrayList = new ArrayList(C7714v.z(b13, 10));
        for (ru.ozon.android.messenger.framework.presentation.models.u uVar : b13) {
            ru.ozon.android.messenger.framework.presentation.models.g c11 = uVar.c();
            if (c11 instanceof ru.ozon.android.messenger.blocks.input.d) {
                ru.ozon.android.messenger.blocks.input.d dVar2 = (ru.ozon.android.messenger.blocks.input.d) c11;
                ru.ozon.android.messenger.framework.presentation.models.B b14 = this.f88442c;
                uVar = ru.ozon.android.messenger.framework.presentation.models.u.a(uVar, ru.ozon.android.messenger.blocks.input.d.a(dVar2, str, customBlockDTO, null, false, b14 != null ? b14.a() : null, 1903));
            }
            arrayList.add(uVar);
        }
        Object l11 = l(ru.ozon.android.messenger.framework.presentation.models.q.a(qVar2, arrayList, null, 2), (kotlin.coroutines.jvm.internal.c) dVar);
        return l11 == Wc.a.COROUTINE_SUSPENDED ? l11 : Unit.f71690a;
    }
}
