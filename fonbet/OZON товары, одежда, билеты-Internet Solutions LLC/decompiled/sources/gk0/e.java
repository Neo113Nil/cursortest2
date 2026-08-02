package gk0;

import De.C2862e;
import Sc.InterfaceC3999a;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.Q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.E0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f64505a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f64506b = N.a(C10720e0.a().plus(new k(J.f105405n0)).plus(X0.b()));

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C6747a f64507c = new C6747a();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<kotlin.reflect.d<? extends View>, ConcurrentLinkedDeque<s>> f64508d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Integer, ConcurrentLinkedDeque<s>> f64509e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<ConcurrentHashMap<? extends Object, ConcurrentLinkedDeque<s>>> f64510f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.uikit.pool.precreation.ClientViewPoolImpl$clear$1", f = "ClientViewPool.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f64512e;

        /* renamed from: gk0.e$a$a, reason: collision with other inner class name */
        static final class C1045a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f64513b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f64514c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1045a(e eVar, String str) {
                super(0);
                this.f64513b = eVar;
                this.f64514c = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                String str = this.f64514c;
                this.f64513b.i(new C6749c(str), new C6750d(str));
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f64512e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new a(this.f64512e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            e eVar = e.this;
            C6747a c6747a = eVar.f64507c;
            String str = this.f64512e;
            c6747a.c(str, new C1045a(eVar, str));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.uikit.pool.precreation.ClientViewPoolImpl$clear$2", f = "ClientViewPool.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Activity f64516e;

        static final class a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f64517b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f64518c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, Activity activity) {
                super(0);
                this.f64517b = eVar;
                this.f64518c = activity;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Activity activity = this.f64518c;
                this.f64517b.i(new f(activity), new g(activity));
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f64516e = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new b(this.f64516e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            e eVar = e.this;
            C6747a c6747a = eVar.f64507c;
            Activity activity = this.f64516e;
            c6747a.b(activity, new a(eVar, activity));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.uikit.pool.precreation.ClientViewPoolImpl$clear$3", f = "ClientViewPool.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* synthetic */ class a extends C7719a implements Function0<Unit> {
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                e.j((e) this.receiver);
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            e.this.f64507c.a(new a(0, e.this, e.class, "clearInternal", "clearInternal(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", 0));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.uikit.pool.precreation.ClientViewPoolImpl$fill$1", f = "ClientViewPool.kt", l = {115}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        e f64520d;

        /* renamed from: e, reason: collision with root package name */
        String f64521e;

        /* renamed from: f, reason: collision with root package name */
        Iterator f64522f;

        /* renamed from: g, reason: collision with root package name */
        n f64523g;

        /* renamed from: h, reason: collision with root package name */
        Iterator f64524h;

        /* renamed from: i, reason: collision with root package name */
        int f64525i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<n> f64526j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ e f64527k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f64528l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends n> list, e eVar, String str, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f64526j = list;
            this.f64527k = eVar;
            this.f64528l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f64526j, this.f64527k, this.f64528l, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0037 -> B:5:0x004e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            e eVar;
            String str;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f64525i;
            if (i11 == 0) {
                Sc.s.b(obj);
                it = this.f64526j.iterator();
                eVar = this.f64527k;
                str = this.f64528l;
                if (it.hasNext()) {
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterator it2 = this.f64524h;
                n nVar = this.f64523g;
                Iterator it3 = this.f64522f;
                String str2 = this.f64521e;
                e eVar2 = this.f64520d;
                Sc.s.b(obj);
                it = it3;
                n nVar2 = nVar;
                e eVar3 = eVar2;
                while (it2.hasNext()) {
                    ((Q) it2).b();
                    this.f64520d = eVar3;
                    this.f64521e = str2;
                    this.f64522f = it;
                    this.f64523g = nVar2;
                    this.f64524h = it2;
                    this.f64525i = 1;
                    if (e.b(eVar3, nVar2, str2, this) == aVar) {
                        return aVar;
                    }
                }
                eVar = eVar3;
                str = str2;
                if (it.hasNext()) {
                    nVar2 = (n) it.next();
                    String str3 = str;
                    eVar3 = eVar;
                    it2 = kotlin.ranges.h.o(0, nVar2.a()).iterator();
                    str2 = str3;
                    while (it2.hasNext()) {
                    }
                    eVar = eVar3;
                    str = str2;
                    if (it.hasNext()) {
                        return Unit.f71690a;
                    }
                }
            }
        }
    }

    public e() {
        ConcurrentHashMap<kotlin.reflect.d<? extends View>, ConcurrentLinkedDeque<s>> concurrentHashMap = new ConcurrentHashMap<>();
        this.f64508d = concurrentHashMap;
        ConcurrentHashMap<Integer, ConcurrentLinkedDeque<s>> concurrentHashMap2 = new ConcurrentHashMap<>();
        this.f64509e = concurrentHashMap2;
        this.f64510f = C7714v.b0(concurrentHashMap, concurrentHashMap2);
    }

    public static final Object b(e eVar, n nVar, String str, kotlin.coroutines.jvm.internal.j jVar) {
        eVar.getClass();
        if (nVar instanceof o) {
            o oVar = (o) nVar;
            Object o11 = eVar.o(eVar.f64509e, new Integer(oVar.c()), new fk0.a(oVar.b()).a(oVar.c(), null), str, jVar);
            return o11 == Wc.a.COROUTINE_SUSPENDED ? o11 : Unit.f71690a;
        }
        if (!(nVar instanceof p)) {
            throw new Sc.o();
        }
        View invoke = ((p) nVar).b().invoke();
        Object o12 = eVar.o(eVar.f64508d, kotlin.jvm.internal.N.b(invoke.getClass()), invoke, str, jVar);
        return o12 == Wc.a.COROUTINE_SUSPENDED ? o12 : Unit.f71690a;
    }

    private final boolean e() {
        if (!this.f64505a) {
            return false;
        }
        Iterator<T> it = this.f64510f.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Collection values = ((ConcurrentHashMap) it.next()).values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            Iterator it2 = values.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                i12 += ((ConcurrentLinkedDeque) it2.next()).size();
            }
            i11 += i12;
        }
        boolean z11 = i11 >= 150;
        if (z11) {
            q qVar = q.f64554a;
        }
        return !z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Function1<? super B0, Boolean> function1, final Function1<? super s, Boolean> function12) {
        Iterator it = kotlin.sequences.l.h(E0.g(this.f64506b.getCoroutineContext()).d(), function1).iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                break;
            } else {
                ((B0) aVar.next()).j(null);
            }
        }
        Iterator<T> it2 = this.f64510f.iterator();
        while (it2.hasNext()) {
            Collection values = ((ConcurrentHashMap) it2.next()).values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            Iterator it3 = values.iterator();
            while (it3.hasNext()) {
                ((ConcurrentLinkedDeque) it3.next()).removeIf(new Predicate() { // from class: gk0.b
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) Function1.this.invoke(obj)).booleanValue();
                    }
                });
            }
        }
    }

    static /* synthetic */ void j(e eVar) {
        eVar.i(h.f64531b, i.f64532b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(ConcurrentHashMap concurrentHashMap, Object obj, View view, String str, kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        int i11;
        ConcurrentLinkedDeque concurrentLinkedDeque;
        Object putIfAbsent;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i12 = lVar.f64546i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lVar.f64546i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = lVar.f64544g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = lVar.f64546i;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    if (!e()) {
                        return Unit.f71690a;
                    }
                    Object obj3 = concurrentHashMap.get(obj);
                    if (obj3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(obj, (obj3 = new ConcurrentLinkedDeque()))) != null) {
                        obj3 = putIfAbsent;
                    }
                    concurrentLinkedDeque = (ConcurrentLinkedDeque) obj3;
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    lVar.f64541d = view;
                    lVar.f64542e = str;
                    lVar.f64543f = concurrentLinkedDeque;
                    lVar.f64546i = 1;
                    if (this.f64507c.d(str, context, lVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    concurrentLinkedDeque = lVar.f64543f;
                    str = lVar.f64542e;
                    view = lVar.f64541d;
                    Sc.s.b(obj2);
                }
                E0.f(lVar.getContext());
                concurrentLinkedDeque.addFirst(new s(view, str));
                return Unit.f71690a;
            }
        }
        lVar = new l(this, cVar);
        Object obj22 = lVar.f64544g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = lVar.f64546i;
        if (i11 != 0) {
        }
        E0.f(lVar.getContext());
        concurrentLinkedDeque.addFirst(new s(view, str));
        return Unit.f71690a;
    }

    public final void f() {
        C10727i.c(this.f64506b, null, null, new c(null), 3);
    }

    public final void g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C10727i.c(this.f64506b, null, null, new b((Activity) context, null), 3);
    }

    public final void h(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        C10727i.c(this.f64506b, null, null, new a(tag, null), 3);
    }

    public final void k(@NotNull androidx.fragment.app.r context, @NotNull String tag, @NotNull List list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(list, "list");
        if (e()) {
            C10727i.c(this.f64506b, new m(context, tag), null, new j(list, this, tag, null), 2);
        }
    }

    @InterfaceC3999a
    public final void l(@NotNull String tag, @NotNull List<? extends n> list) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(list, "list");
        if (e()) {
            C10727i.c(this.f64506b, new m(null, tag), null, new d(list, this, tag, null), 2);
        }
    }

    public final View m(int i11) {
        s pollLast;
        ConcurrentLinkedDeque<s> concurrentLinkedDeque = this.f64509e.get(Integer.valueOf(i11));
        View b11 = (concurrentLinkedDeque == null || (pollLast = concurrentLinkedDeque.pollLast()) == null) ? null : pollLast.b();
        if (b11 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(b11, "<this>");
        Context context = b11.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || !activity.isFinishing()) {
            return b11;
        }
        f();
        return null;
    }

    public final <T extends View> T n(@NotNull kotlin.reflect.d<T> type) {
        s pollLast;
        Intrinsics.checkNotNullParameter(type, "type");
        ConcurrentLinkedDeque<s> concurrentLinkedDeque = this.f64508d.get(type);
        T t2 = (concurrentLinkedDeque == null || (pollLast = concurrentLinkedDeque.pollLast()) == null) ? null : (T) pollLast.b();
        if (t2 == null) {
            t2 = null;
        }
        if (t2 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Context context = t2.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || !activity.isFinishing()) {
            return t2;
        }
        f();
        return null;
    }

    public final void p(boolean z11) {
        this.f64505a = z11;
    }
}
