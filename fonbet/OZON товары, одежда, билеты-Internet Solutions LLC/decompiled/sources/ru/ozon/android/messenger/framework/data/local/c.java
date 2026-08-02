package ru.ozon.android.messenger.framework.data.local;

import Ae.C2399j;
import Ae.C2417s0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.domain.usecases.C9385b;
import ru.ozon.android.messenger.framework.domain.usecases.K;
import ru.ozon.android.messenger.framework.presentation.models.u;

/* loaded from: classes10.dex */
public final class c implements ru.ozon.android.messenger.framework.data.local.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f87446a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9385b f87447b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.a f87448c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Je.d f87449d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<ru.ozon.android.messenger.framework.domain.model.a> f87450e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final M0<ru.ozon.android.messenger.framework.domain.model.a> f87451f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<ru.ozon.android.messenger.framework.domain.model.i> f87452g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final M0<ru.ozon.android.messenger.framework.domain.model.i> f87453h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C2417s0 f87454i;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.local.ChatItemsStorageImpl$chatState$1", f = "ChatItemsStorageImpl.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<ru.ozon.android.messenger.framework.domain.model.a, ru.ozon.android.messenger.framework.domain.model.i, kotlin.coroutines.d<? super ru.ozon.android.messenger.framework.domain.model.b>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ ru.ozon.android.messenger.framework.domain.model.a f87455d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ ru.ozon.android.messenger.framework.domain.model.i f87456e;

        @Override // fd.InterfaceC6511n
        public final Object invoke(ru.ozon.android.messenger.framework.domain.model.a aVar, ru.ozon.android.messenger.framework.domain.model.i iVar, kotlin.coroutines.d<? super ru.ozon.android.messenger.framework.domain.model.b> dVar) {
            a aVar2 = new a(3, dVar);
            aVar2.f87455d = aVar;
            aVar2.f87456e = iVar;
            return aVar2.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            return new ru.ozon.android.messenger.framework.domain.model.b(this.f87456e, this.f87455d);
        }
    }

    static final class b extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f87457b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f87457b = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
            ru.ozon.android.messenger.framework.presentation.models.q it = qVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(it), this.f87457b));
        }
    }

    public c(@NotNull K resolveMessageInfoUseCase, @NotNull C9385b appendDateWidgetsUseCase, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.a chatArgs) {
        Intrinsics.checkNotNullParameter(resolveMessageInfoUseCase, "resolveMessageInfoUseCase");
        Intrinsics.checkNotNullParameter(appendDateWidgetsUseCase, "appendDateWidgetsUseCase");
        Intrinsics.checkNotNullParameter(chatArgs, "chatArgs");
        this.f87446a = resolveMessageInfoUseCase;
        this.f87447b = appendDateWidgetsUseCase;
        this.f87448c = chatArgs;
        this.f87449d = Je.e.a();
        x0<ru.ozon.android.messenger.framework.domain.model.a> a11 = O0.a(new ru.ozon.android.messenger.framework.domain.model.a(new ArrayList(), false));
        this.f87450e = a11;
        this.f87451f = C2399j.b(a11);
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        x0<ru.ozon.android.messenger.framework.domain.model.i> a12 = O0.a(new ru.ozon.android.messenger.framework.domain.model.i(k11, k11));
        this.f87452g = a12;
        this.f87453h = C2399j.b(a12);
        this.f87454i = new C2417s0(a11, a12, new a(3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:12:0x0056, B:13:0x0058, B:15:0x0082, B:16:0x008f, B:19:0x009d), top: B:11:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.data.local.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ru.ozon.android.messenger.framework.domain.model.c cVar, @NotNull List list, @NotNull kotlin.coroutines.jvm.internal.c cVar2) {
        e eVar;
        int i11;
        Je.d dVar;
        c cVar3;
        x0<ru.ozon.android.messenger.framework.domain.model.a> x0Var;
        ru.ozon.android.messenger.framework.domain.model.a value;
        ru.ozon.android.messenger.framework.domain.model.a aVar;
        ArrayList W02;
        try {
            if (cVar2 instanceof e) {
                eVar = (e) cVar2;
                int i12 = eVar.f87584j;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    eVar.f87584j = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = eVar.f87582h;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = eVar.f87584j;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        eVar.f87578d = this;
                        eVar.f87579e = cVar;
                        eVar.f87580f = list;
                        dVar = this.f87449d;
                        eVar.f87581g = dVar;
                        eVar.f87584j = 1;
                        if (dVar.a(eVar) == aVar2) {
                            return aVar2;
                        }
                        cVar3 = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Je.d dVar2 = eVar.f87581g;
                        list = eVar.f87580f;
                        ru.ozon.android.messenger.framework.domain.model.c cVar4 = eVar.f87579e;
                        cVar3 = eVar.f87578d;
                        Sc.s.b(obj);
                        dVar = dVar2;
                        cVar = cVar4;
                    }
                    x0Var = cVar3.f87450e;
                    do {
                        value = x0Var.getValue();
                        aVar = value;
                        W02 = C7714v.W0(aVar.b());
                        int a11 = ru.ozon.android.messenger.framework.domain.model.d.a(W02, list, cVar);
                        K k11 = cVar3.f87446a;
                        int size = list.size() + a11;
                        k11.getClass();
                        K.a(a11, size, W02);
                        if (cVar3.f87448c.c()) {
                            cVar3.f87447b.b(a11, list.size() + a11, W02);
                        }
                    } while (!x0Var.b(value, ru.ozon.android.messenger.framework.domain.model.a.a(W02, aVar.c())));
                    Unit unit = Unit.f71690a;
                    dVar.c(null);
                    return Unit.f71690a;
                }
            }
            x0Var = cVar3.f87450e;
            do {
                value = x0Var.getValue();
                aVar = value;
                W02 = C7714v.W0(aVar.b());
                int a112 = ru.ozon.android.messenger.framework.domain.model.d.a(W02, list, cVar);
                K k112 = cVar3.f87446a;
                int size2 = list.size() + a112;
                k112.getClass();
                K.a(a112, size2, W02);
                if (cVar3.f87448c.c()) {
                }
            } while (!x0Var.b(value, ru.ozon.android.messenger.framework.domain.model.a.a(W02, aVar.c())));
            Unit unit2 = Unit.f71690a;
            dVar.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            dVar.c(null);
            throw th2;
        }
        eVar = new e(this, cVar2);
        Object obj2 = eVar.f87582h;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f87584j;
        if (i11 != 0) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.data.local.a
    @NotNull
    public final C2417s0 b() {
        return this.f87454i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:12:0x004d, B:13:0x004f, B:14:0x0074, B:16:0x007a, B:19:0x00a4, B:24:0x00aa, B:27:0x00b4), top: B:11:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.data.local.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull ru.ozon.android.messenger.framework.presentation.models.q[] qVarArr, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        ru.ozon.android.messenger.framework.data.local.b bVar;
        int i11;
        Je.d dVar;
        c cVar2;
        x0<ru.ozon.android.messenger.framework.domain.model.i> x0Var;
        ru.ozon.android.messenger.framework.domain.model.i value;
        ru.ozon.android.messenger.framework.domain.model.i iVar;
        ArrayList arrayList;
        Iterator it;
        try {
            if (cVar instanceof ru.ozon.android.messenger.framework.data.local.b) {
                bVar = (ru.ozon.android.messenger.framework.data.local.b) cVar;
                int i12 = bVar.f87445i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar.f87445i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = bVar.f87443g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = bVar.f87445i;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        bVar.f87440d = this;
                        bVar.f87441e = qVarArr;
                        dVar = this.f87449d;
                        bVar.f87442f = dVar;
                        bVar.f87445i = 1;
                        if (dVar.a(bVar) == aVar) {
                            return aVar;
                        }
                        cVar2 = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Je.d dVar2 = bVar.f87442f;
                        ru.ozon.android.messenger.framework.presentation.models.q[] qVarArr2 = bVar.f87441e;
                        cVar2 = bVar.f87440d;
                        Sc.s.b(obj);
                        dVar = dVar2;
                        qVarArr = qVarArr2;
                    }
                    x0Var = cVar2.f87452g;
                    do {
                        value = x0Var.getValue();
                        iVar = value;
                        ArrayList p02 = C7714v.p0(iVar.b(), C7705l.f0(qVarArr));
                        HashSet hashSet = new HashSet();
                        arrayList = new ArrayList();
                        it = p02.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) next;
                            int i13 = ru.ozon.android.messenger.framework.presentation.models.r.f91458b;
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            if (hashSet.add(new Integer(((u) C7714v.K(qVar.b())).e()))) {
                                arrayList.add(next);
                            }
                        }
                    } while (!x0Var.b(value, ru.ozon.android.messenger.framework.domain.model.i.a(iVar, arrayList)));
                    Unit unit = Unit.f71690a;
                    dVar.c(null);
                    return Unit.f71690a;
                }
            }
            x0Var = cVar2.f87452g;
            do {
                value = x0Var.getValue();
                iVar = value;
                ArrayList p022 = C7714v.p0(iVar.b(), C7705l.f0(qVarArr));
                HashSet hashSet2 = new HashSet();
                arrayList = new ArrayList();
                it = p022.iterator();
                while (it.hasNext()) {
                }
            } while (!x0Var.b(value, ru.ozon.android.messenger.framework.domain.model.i.a(iVar, arrayList)));
            Unit unit2 = Unit.f71690a;
            dVar.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            dVar.c(null);
            throw th2;
        }
        bVar = new ru.ozon.android.messenger.framework.data.local.b(this, cVar);
        Object obj2 = bVar.f87443g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f87445i;
        if (i11 != 0) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.data.local.a
    public final void d(@NotNull ArrayList blocks) {
        ru.ozon.android.messenger.framework.domain.model.a value;
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        x0<ru.ozon.android.messenger.framework.domain.model.a> x0Var = this.f87450e;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, ru.ozon.android.messenger.framework.domain.model.a.a(blocks, value.c())));
    }

    @Override // ru.ozon.android.messenger.framework.data.local.a
    public final Object e(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object i11 = i(new j(this), cVar);
        return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.local.a
    public final void f(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        j(new b(id2));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.data.local.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        int i11;
        Je.d dVar;
        c cVar2;
        x0<ru.ozon.android.messenger.framework.domain.model.i> x0Var;
        ru.ozon.android.messenger.framework.domain.model.i value;
        List items;
        List<ru.ozon.android.messenger.framework.presentation.models.q> pinnedItems;
        try {
            if (cVar instanceof n) {
                nVar = (n) cVar;
                int i12 = nVar.f87620i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    nVar.f87620i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = nVar.f87618g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = nVar.f87620i;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        nVar.f87615d = this;
                        nVar.f87616e = function1;
                        dVar = this.f87449d;
                        nVar.f87617f = dVar;
                        nVar.f87620i = 1;
                        if (dVar.a(nVar) == aVar) {
                            return aVar;
                        }
                        cVar2 = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Je.d dVar2 = nVar.f87617f;
                        Function1 function12 = nVar.f87616e;
                        cVar2 = nVar.f87615d;
                        Sc.s.b(obj);
                        dVar = dVar2;
                        function1 = function12;
                    }
                    x0Var = cVar2.f87452g;
                    do {
                        value = x0Var.getValue();
                        ru.ozon.android.messenger.framework.domain.model.i iVar = value;
                        items = (List) function1.invoke(iVar.b());
                        pinnedItems = iVar.c();
                        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
                        Intrinsics.checkNotNullParameter(items, "items");
                    } while (!x0Var.b(value, new ru.ozon.android.messenger.framework.domain.model.i(pinnedItems, items)));
                    Unit unit = Unit.f71690a;
                    dVar.c(null);
                    return Unit.f71690a;
                }
            }
            x0Var = cVar2.f87452g;
            do {
                value = x0Var.getValue();
                ru.ozon.android.messenger.framework.domain.model.i iVar2 = value;
                items = (List) function1.invoke(iVar2.b());
                pinnedItems = iVar2.c();
                Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
                Intrinsics.checkNotNullParameter(items, "items");
            } while (!x0Var.b(value, new ru.ozon.android.messenger.framework.domain.model.i(pinnedItems, items)));
            Unit unit2 = Unit.f71690a;
            dVar.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            dVar.c(null);
            throw th2;
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.f87618g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = nVar.f87620i;
        if (i11 != 0) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.data.local.a
    public final Object h(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object i11 = i(new h(this, str), cVar);
        return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.data.local.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        int i11;
        Je.d dVar;
        c cVar2;
        x0<ru.ozon.android.messenger.framework.domain.model.a> x0Var;
        ru.ozon.android.messenger.framework.domain.model.a value;
        ru.ozon.android.messenger.framework.domain.model.a aVar;
        ArrayList W02;
        try {
            if (cVar instanceof l) {
                lVar = (l) cVar;
                int i12 = lVar.f87602i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    lVar.f87602i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = lVar.f87600g;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = lVar.f87602i;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        lVar.f87597d = this;
                        lVar.f87598e = function1;
                        dVar = this.f87449d;
                        lVar.f87599f = dVar;
                        lVar.f87602i = 1;
                        if (dVar.a(lVar) == aVar2) {
                            return aVar2;
                        }
                        cVar2 = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Je.d dVar2 = lVar.f87599f;
                        Function1 function12 = lVar.f87598e;
                        cVar2 = lVar.f87597d;
                        Sc.s.b(obj);
                        dVar = dVar2;
                        function1 = function12;
                    }
                    x0Var = cVar2.f87450e;
                    do {
                        value = x0Var.getValue();
                        aVar = value;
                        W02 = C7714v.W0(aVar.b());
                        function1.invoke(W02);
                    } while (!x0Var.b(value, ru.ozon.android.messenger.framework.domain.model.a.a(W02, aVar.c())));
                    Unit unit = Unit.f71690a;
                    dVar.c(null);
                    return Unit.f71690a;
                }
            }
            x0Var = cVar2.f87450e;
            do {
                value = x0Var.getValue();
                aVar = value;
                W02 = C7714v.W0(aVar.b());
                function1.invoke(W02);
            } while (!x0Var.b(value, ru.ozon.android.messenger.framework.domain.model.a.a(W02, aVar.c())));
            Unit unit2 = Unit.f71690a;
            dVar.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            dVar.c(null);
            throw th2;
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.f87600g;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = lVar.f87602i;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.util.ArrayList] */
    @Override // ru.ozon.android.messenger.framework.data.local.a
    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.q> j(@NotNull Function1<? super ru.ozon.android.messenger.framework.presentation.models.q, Boolean> predicate) {
        ru.ozon.android.messenger.framework.domain.model.i value;
        ru.ozon.android.messenger.framework.domain.model.i iVar;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        M m11 = new M();
        m11.f71787a = kotlin.collections.K.f71697a;
        x0<ru.ozon.android.messenger.framework.domain.model.i> x0Var = this.f87452g;
        do {
            value = x0Var.getValue();
            iVar = value;
            List<ru.ozon.android.messenger.framework.presentation.models.q> b11 = iVar.b();
            ?? arrayList = new ArrayList();
            for (Object obj : b11) {
                if (predicate.invoke(obj).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            m11.f71787a = arrayList;
        } while (!x0Var.b(value, ru.ozon.android.messenger.framework.domain.model.i.a(iVar, C7714v.l0(iVar.b(), C7714v.Y0((Iterable) m11.f71787a)))));
        return (List) m11.f71787a;
    }

    @Override // ru.ozon.android.messenger.framework.data.local.a
    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.q> k() {
        return this.f87450e.getValue().b();
    }

    @Override // ru.ozon.android.messenger.framework.data.local.a
    public final Unit l(@NotNull ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        ru.ozon.android.messenger.framework.domain.model.i value;
        ru.ozon.android.messenger.framework.domain.model.i iVar;
        ArrayList arrayList;
        x0<ru.ozon.android.messenger.framework.domain.model.i> x0Var = this.f87452g;
        do {
            value = x0Var.getValue();
            iVar = value;
            List m11 = kotlin.text.h.m(qVar.c().getId(), new String[]{"."}, 0, 6);
            String str = (String) C7714v.M(m11);
            if (str == null) {
                str = qVar.c().getId();
            }
            String str2 = (String) C7714v.Q(1, m11);
            List<ru.ozon.android.messenger.framework.presentation.models.q> b11 = iVar.b();
            if (str2 == null) {
                arrayList = ru.ozon.android.messenger.utils.b.e(b11, qVar, new o(qVar));
            } else {
                List<ru.ozon.android.messenger.framework.presentation.models.q> list = b11;
                int i11 = 10;
                ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
                for (ru.ozon.android.messenger.framework.presentation.models.q qVar2 : list) {
                    if (Intrinsics.d(qVar2.c().getId(), str)) {
                        List<u> b12 = qVar2.b();
                        ArrayList arrayList3 = new ArrayList(C7714v.z(b12, i11));
                        Iterator<T> it = b12.iterator();
                        while (true) {
                            Object obj = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            u uVar = (u) it.next();
                            if (Intrinsics.d(uVar.b().getName(), str2)) {
                                Iterator<T> it2 = qVar.b().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Object next = it2.next();
                                    if (Intrinsics.d(((u) next).b().getName(), str2)) {
                                        obj = next;
                                        break;
                                    }
                                }
                                u uVar2 = (u) obj;
                                if (uVar2 != null) {
                                    uVar = uVar2;
                                }
                            }
                            arrayList3.add(uVar);
                        }
                        qVar2 = ru.ozon.android.messenger.framework.presentation.models.q.a(qVar2, arrayList3, null, 2);
                    }
                    arrayList2.add(qVar2);
                    i11 = 10;
                }
                arrayList = arrayList2;
            }
        } while (!x0Var.b(value, ru.ozon.android.messenger.framework.domain.model.i.a(iVar, arrayList)));
        return Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.data.local.a
    @NotNull
    public final ArrayList m() {
        List<ru.ozon.android.messenger.framework.presentation.models.q> k11 = k();
        ArrayList arrayList = new ArrayList();
        for (Object obj : k11) {
            if (ru.ozon.android.messenger.framework.presentation.models.r.h((ru.ozon.android.messenger.framework.presentation.models.q) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.data.local.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(@NotNull String[] strArr, @NotNull ru.ozon.android.messenger.framework.presentation.models.q qVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        Object obj;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f87461g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f87461g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = dVar.f87459e;
                Object obj3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f87461g;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ru.ozon.android.messenger.framework.presentation.models.q qVar2 = dVar.f87458d;
                    Sc.s.b(obj2);
                    return qVar2;
                }
                Sc.s.b(obj2);
                Iterator<T> it = this.f87452g.getValue().b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C7705l.m(strArr, ru.ozon.android.messenger.framework.presentation.models.r.d((ru.ozon.android.messenger.framework.presentation.models.q) obj))) {
                        break;
                    }
                }
                if (((ru.ozon.android.messenger.framework.presentation.models.q) obj) == null) {
                    dVar.f87458d = qVar;
                    dVar.f87461g = 1;
                    if (c(new ru.ozon.android.messenger.framework.presentation.models.q[]{qVar}, dVar) == obj3) {
                        return obj3;
                    }
                }
                return qVar;
            }
        }
        dVar = new d(this, cVar);
        Object obj22 = dVar.f87459e;
        Object obj32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f87461g;
        if (i11 == 0) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.data.local.a
    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.q> o() {
        return this.f87452g.getValue().b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:12:0x005b, B:13:0x005d, B:15:0x0066, B:16:0x006a, B:19:0x0082), top: B:11:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.data.local.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(@NotNull List items, List list, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        m mVar;
        int i11;
        Je.d dVar;
        c cVar2;
        x0<ru.ozon.android.messenger.framework.domain.model.i> x0Var;
        ru.ozon.android.messenger.framework.domain.model.i value;
        List pinnedItems;
        try {
            if (cVar instanceof m) {
                mVar = (m) cVar;
                int i12 = mVar.f87609j;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    mVar.f87609j = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = mVar.f87607h;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = mVar.f87609j;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        mVar.f87603d = this;
                        mVar.f87604e = items;
                        mVar.f87605f = list;
                        dVar = this.f87449d;
                        mVar.f87606g = dVar;
                        mVar.f87609j = 1;
                        if (dVar.a(mVar) == aVar) {
                            return aVar;
                        }
                        cVar2 = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Je.d dVar2 = mVar.f87606g;
                        list = mVar.f87605f;
                        List list2 = mVar.f87604e;
                        cVar2 = mVar.f87603d;
                        Sc.s.b(obj);
                        dVar = dVar2;
                        items = list2;
                    }
                    x0Var = cVar2.f87452g;
                    do {
                        value = x0Var.getValue();
                        ru.ozon.android.messenger.framework.domain.model.i iVar = value;
                        pinnedItems = list != null ? kotlin.collections.K.f71697a : list;
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
                        Intrinsics.checkNotNullParameter(items, "items");
                    } while (!x0Var.b(value, new ru.ozon.android.messenger.framework.domain.model.i(pinnedItems, items)));
                    Unit unit = Unit.f71690a;
                    dVar.c(null);
                    return Unit.f71690a;
                }
            }
            x0Var = cVar2.f87452g;
            do {
                value = x0Var.getValue();
                ru.ozon.android.messenger.framework.domain.model.i iVar2 = value;
                if (list != null) {
                }
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
                Intrinsics.checkNotNullParameter(items, "items");
            } while (!x0Var.b(value, new ru.ozon.android.messenger.framework.domain.model.i(pinnedItems, items)));
            Unit unit2 = Unit.f71690a;
            dVar.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            dVar.c(null);
            throw th2;
        }
        mVar = new m(this, cVar);
        Object obj2 = mVar.f87607h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = mVar.f87609j;
        if (i11 != 0) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.data.local.a
    public final void q() {
        ru.ozon.android.messenger.framework.domain.model.i value;
        kotlin.collections.K k11;
        x0<ru.ozon.android.messenger.framework.domain.model.a> x0Var = this.f87450e;
        while (!x0Var.b(x0Var.getValue(), new ru.ozon.android.messenger.framework.domain.model.a(new ArrayList(), false))) {
        }
        x0<ru.ozon.android.messenger.framework.domain.model.i> x0Var2 = this.f87452g;
        do {
            value = x0Var2.getValue();
            k11 = kotlin.collections.K.f71697a;
        } while (!x0Var2.b(value, new ru.ozon.android.messenger.framework.domain.model.i(k11, k11)));
    }

    @Override // ru.ozon.android.messenger.framework.data.local.a
    public final void r(@NotNull Function1<? super List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(this.f87450e.getValue().b());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.android.messenger.framework.data.local.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        k kVar;
        int i11;
        Je.d dVar;
        c cVar2;
        x0<ru.ozon.android.messenger.framework.domain.model.a> x0Var;
        ru.ozon.android.messenger.framework.domain.model.a value;
        ru.ozon.android.messenger.framework.domain.model.a aVar;
        try {
            if (cVar instanceof k) {
                kVar = (k) cVar;
                int i12 = kVar.f87596i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    kVar.f87596i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = kVar.f87594g;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = kVar.f87596i;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        kVar.f87591d = this;
                        kVar.f87592e = function1;
                        dVar = this.f87449d;
                        kVar.f87593f = dVar;
                        kVar.f87596i = 1;
                        if (dVar.a(kVar) == aVar2) {
                            return aVar2;
                        }
                        cVar2 = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Je.d dVar2 = kVar.f87593f;
                        Function1 function12 = kVar.f87592e;
                        cVar2 = kVar.f87591d;
                        Sc.s.b(obj);
                        dVar = dVar2;
                        function1 = function12;
                    }
                    x0Var = cVar2.f87450e;
                    do {
                        value = x0Var.getValue();
                        aVar = value;
                    } while (!x0Var.b(value, ru.ozon.android.messenger.framework.domain.model.a.a(C7714v.W0((List) function1.invoke(aVar.b())), aVar.c())));
                    Unit unit = Unit.f71690a;
                    dVar.c(null);
                    return Unit.f71690a;
                }
            }
            x0Var = cVar2.f87450e;
            do {
                value = x0Var.getValue();
                aVar = value;
            } while (!x0Var.b(value, ru.ozon.android.messenger.framework.domain.model.a.a(C7714v.W0((List) function1.invoke(aVar.b())), aVar.c())));
            Unit unit2 = Unit.f71690a;
            dVar.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            dVar.c(null);
            throw th2;
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.f87594g;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = kVar.f87596i;
        if (i11 != 0) {
        }
    }

    @Override // ru.ozon.android.messenger.framework.data.local.a
    public final void t() {
        ru.ozon.android.messenger.framework.domain.model.a value;
        x0<ru.ozon.android.messenger.framework.domain.model.a> x0Var = this.f87450e;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, ru.ozon.android.messenger.framework.domain.model.a.a(value.b(), true)));
    }

    @Override // ru.ozon.android.messenger.framework.data.local.a
    @NotNull
    public final M0<ru.ozon.android.messenger.framework.domain.model.i> u() {
        return this.f87453h;
    }
}
