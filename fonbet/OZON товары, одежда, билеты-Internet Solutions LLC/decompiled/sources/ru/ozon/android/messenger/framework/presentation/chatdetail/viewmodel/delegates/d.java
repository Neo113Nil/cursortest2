package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates;

import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.loading.LoadingDTO;
import ru.ozon.android.messenger.blocks.paginationerror.PaginationErrorDTO;
import ru.ozon.android.messenger.framework.data.requests.b;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.domain.model.c;
import ru.ozon.android.messenger.framework.domain.usecases.C9388e;
import ru.ozon.android.messenger.framework.domain.usecases.C9396m;
import ru.ozon.android.messenger.framework.domain.usecases.C9397n;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.InterfaceC9460a;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a;
import ru.ozon.android.messenger.framework.presentation.common.screen.m;
import ru.ozon.android.messenger.framework.presentation.common.startup.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.u;
import ru.ozon.android.messenger.framework.presentation.models.r;
import ru.ozon.android.messenger.utils.i;
import xe.AbstractC10711a;
import xe.B0;
import xe.C10727i;
import xe.C10737n;
import xe.H0;
import xe.M;

/* loaded from: classes10.dex */
public class d extends l implements ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a {

    /* renamed from: A, reason: collision with root package name */
    private B0 f90066A;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9388e f90067c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final P20.f f90068d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9396m f90069e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C9397n f90070f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.emptystate.e f90071g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f90072h;

    /* renamed from: i, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f90073i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.a f90074j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.a f90075k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final o f90076l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.startup.a f90077m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.a f90078n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final d f90079o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f90080p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final x0<Integer> f90081q;

    /* renamed from: r, reason: collision with root package name */
    private String f90082r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f90083s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f90084t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f90085u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final x0<ru.ozon.android.messenger.framework.presentation.common.screen.l> f90086v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f90087w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private ru.ozon.android.messenger.utils.coroutines.a<Unit> f90088x;

    /* renamed from: y, reason: collision with root package name */
    private ru.ozon.android.messenger.framework.presentation.models.responses.f f90089y;

    /* renamed from: z, reason: collision with root package name */
    private B0 f90090z;

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90095a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f90096b;

        static {
            int[] iArr = new int[PaginationErrorDTO.a.values().length];
            try {
                iArr[PaginationErrorDTO.a.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaginationErrorDTO.a.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f90095a = iArr;
            int[] iArr2 = new int[b.a.values().length];
            try {
                iArr2[b.a.FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[b.a.BACKWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f90096b = iArr2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.ChatLoadingDelegateImpl$fullRefresh$1", f = "ChatLoadingDelegate.kt", l = {242, 263}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90097d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f90098e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<M, kotlin.coroutines.d<? super Unit>, Object> f90100g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f90101h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.ChatLoadingDelegateImpl$fullRefresh$1$1", f = "ChatLoadingDelegate.kt", l = {248, m.e.DEFAULT_SWIPE_ANIMATION_DURATION, 252, 253}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            kotlin.jvm.internal.M f90102d;

            /* renamed from: e, reason: collision with root package name */
            a.C1700a f90103e;

            /* renamed from: f, reason: collision with root package name */
            d f90104f;

            /* renamed from: g, reason: collision with root package name */
            int f90105g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ d f90106h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Map<String, String> f90107i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, Map<String, String> map, kotlin.coroutines.d<? super a> dVar2) {
                super(1, dVar2);
                this.f90106h = dVar;
                this.f90107i = map;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f90106h, this.f90107i, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x00c5, code lost:
            
                if (ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d.M(r2, r11, r10, 6) == r0) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
            
                if (r11.n(r5, r10) != r0) goto L28;
             */
            /* JADX WARN: Type inference failed for: r11v8, types: [T, java.util.Map] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                kotlin.jvm.internal.M m11;
                a.C1700a c1700a;
                kotlin.jvm.internal.M m12;
                d dVar;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f90105g;
                d dVar2 = this.f90106h;
                if (i11 == 0) {
                    s.b(obj);
                    dVar2.w(true, new m.a(null));
                    dVar2.N();
                    dVar2.f90074j.q();
                    kotlin.jvm.internal.M m13 = new kotlin.jvm.internal.M();
                    ru.ozon.android.messenger.framework.presentation.common.startup.a aVar2 = dVar2.f90077m;
                    this.f90102d = m13;
                    this.f90105g = 1;
                    Object b11 = aVar2.b(this.f90107i, this);
                    if (b11 != aVar) {
                        m11 = m13;
                        obj = b11;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    m11 = this.f90102d;
                    s.b(obj);
                } else if (i11 == 2) {
                    dVar = this.f90104f;
                    c1700a = this.f90103e;
                    m12 = this.f90102d;
                    s.b(obj);
                    dVar.b0((String) obj, c1700a.c(), c1700a.a());
                    m11 = m12;
                    ze.h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> b12 = dVar2.b();
                    j.h hVar = j.h.f89877a;
                    this.f90102d = m11;
                    this.f90103e = null;
                    this.f90104f = null;
                    this.f90105g = 3;
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        dVar2.w(false, new m.a(null));
                        return Unit.f71690a;
                    }
                    m11 = this.f90102d;
                    s.b(obj);
                    a aVar3 = new a(b.a.BACK_AND_FORTH, dVar2.v(), (Map) m11.f71787a, a.b.FIRST);
                    this.f90102d = null;
                    this.f90105g = 4;
                }
                ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    c1700a = (a.C1700a) ((i.b) iVar).b();
                    m11.f71787a = c1700a.b();
                    this.f90102d = m11;
                    this.f90103e = c1700a;
                    this.f90104f = dVar2;
                    this.f90105g = 2;
                    obj = dVar2.B(this);
                    if (obj != aVar) {
                        m12 = m11;
                        dVar = dVar2;
                        dVar.b0((String) obj, c1700a.c(), c1700a.a());
                        m11 = m12;
                    }
                    return aVar;
                }
                ze.h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> b122 = dVar2.b();
                j.h hVar2 = j.h.f89877a;
                this.f90102d = m11;
                this.f90103e = null;
                this.f90104f = null;
                this.f90105g = 3;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, Map<String, String> map, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f90100g = function2;
            this.f90101h = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = d.this.new c(this.f90100g, this.f90101h, dVar);
            cVar.f90098e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            if (r8.f90100g.invoke(r1, r8) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r5.d(r6, r8) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            M m11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90097d;
            if (i11 == 0) {
                s.b(obj);
                m11 = (M) this.f90098e;
                d dVar = d.this;
                ru.ozon.android.messenger.utils.coroutines.a<Unit> t2 = dVar.t();
                a aVar2 = new a(dVar, this.f90101h, null);
                this.f90098e = m11;
                this.f90097d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                m11 = (M) this.f90098e;
                s.b(obj);
            }
            this.f90098e = null;
            this.f90097d = 2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.ChatLoadingDelegateImpl$handleLoadedNoUiItems$1", f = "ChatLoadingDelegate.kt", l = {523}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d$d, reason: collision with other inner class name */
    static final class C1666d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90108d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f90109e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f90110f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1666d(ArrayList arrayList, d dVar, kotlin.coroutines.d dVar2) {
            super(2, dVar2);
            this.f90109e = arrayList;
            this.f90110f = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1666d(this.f90109e, this.f90110f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1666d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object p11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90108d;
            if (i11 == 0) {
                s.b(obj);
                ArrayList I11 = C7714v.I(this.f90109e);
                d dVar = this.f90110f;
                ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.a guard = dVar.f90078n;
                Intrinsics.checkNotNullParameter(I11, "<this>");
                Intrinsics.checkNotNullParameter(guard, "guard");
                ArrayList arrayList = new ArrayList();
                Iterator it = I11.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!guard.d((ru.ozon.android.messenger.framework.presentation.models.q) next)) {
                        arrayList.add(next);
                    }
                }
                ru.ozon.android.messenger.framework.presentation.models.q c11 = dVar.f90078n.c();
                ru.ozon.android.messenger.framework.data.local.a aVar2 = dVar.f90074j;
                ArrayList p02 = C7714v.p0(C7714v.c0(c11), arrayList);
                this.f90108d = 1;
                p11 = aVar2.p(p02, aVar2.u().getValue().c(), this);
                if (p11 == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.ChatLoadingDelegateImpl", f = "ChatLoadingDelegate.kt", l = {209, 214}, m = "handleRefreshMessengerEvent$suspendImpl")
    static final class e extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        d f90111d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f90112e;

        /* renamed from: g, reason: collision with root package name */
        int f90114g;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f90112e = obj;
            this.f90114g |= LinearLayoutManager.INVALID_OFFSET;
            return d.J(d.this, null, this);
        }
    }

    static final class f extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f90115b = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
            List<ru.ozon.android.messenger.framework.presentation.models.q> updateBlocks = list;
            Intrinsics.checkNotNullParameter(updateBlocks, "$this$updateBlocks");
            updateBlocks.remove(0);
            return Unit.f71690a;
        }
    }

    static final class g extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f90116b = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
            List<ru.ozon.android.messenger.framework.presentation.models.q> updateBlocks = list;
            Intrinsics.checkNotNullParameter(updateBlocks, "$this$updateBlocks");
            C7714v.x0(updateBlocks);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.ChatLoadingDelegateImpl$onLoadMoreBackward$1", f = "ChatLoadingDelegate.kt", l = {164, 169}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90117d;

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new h(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
        
            if (ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d.M(r2, r4, r10, 2) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        
            if (r11.a(r1, r5, r10) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90117d;
            d dVar = d.this;
            if (i11 == 0) {
                s.b(obj);
                ru.ozon.android.messenger.framework.data.local.a aVar2 = dVar.f90074j;
                c.C1634c c1634c = new c.C1634c(false);
                ArrayList a11 = dVar.f90069e.a(new Pair(f.b.LOADING, new LoadingDTO()));
                this.f90117d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            b.a aVar3 = b.a.BACKWARD;
            ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) C7714v.M(dVar.f90074j.m());
            a aVar4 = new a(aVar3, qVar != null ? r.d(qVar) : null, null, null, 12);
            this.f90117d = 2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.ChatLoadingDelegateImpl$onLoadMoreForward$1", f = "ChatLoadingDelegate.kt", l = {185, 190}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90119d;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return d.this.new i(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
        
            if (ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d.M(r2, r4, r10, 2) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        
            if (r11.a(r1, r5, r10) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90119d;
            d dVar = d.this;
            if (i11 == 0) {
                s.b(obj);
                ru.ozon.android.messenger.framework.data.local.a aVar2 = dVar.f90074j;
                c.a aVar3 = new c.a(false);
                ArrayList a11 = dVar.f90069e.a(new Pair(f.b.LOADING, new LoadingDTO()));
                this.f90119d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            b.a aVar4 = b.a.FORWARD;
            ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) C7714v.Z(dVar.f90074j.m());
            a aVar5 = new a(aVar4, qVar != null ? r.d(qVar) : null, null, null, 12);
            this.f90119d = 2;
        }
    }

    public d(@NotNull C9388e appendUnreadWidgetUseCase, @NotNull P20.f insertAbsoluteItemsUseCase, @NotNull C9396m getInternalWidgetUseCase, @NotNull C9397n getRemoteMessagesUseCase, @NotNull ru.ozon.android.messenger.blocks.emptystate.e emptyStateBlockFactory, @NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, ru.ozon.android.messenger.framework.analytics.i iVar, @NotNull ru.ozon.android.messenger.framework.data.local.a itemStorageDelegate, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.a args, @NotNull o unreadMessagesController, @NotNull ru.ozon.android.messenger.framework.presentation.common.startup.a chatStartupDelegate, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.a footerUpdateGuard) {
        Intrinsics.checkNotNullParameter(appendUnreadWidgetUseCase, "appendUnreadWidgetUseCase");
        Intrinsics.checkNotNullParameter(insertAbsoluteItemsUseCase, "insertAbsoluteItemsUseCase");
        Intrinsics.checkNotNullParameter(getInternalWidgetUseCase, "getInternalWidgetUseCase");
        Intrinsics.checkNotNullParameter(getRemoteMessagesUseCase, "getRemoteMessagesUseCase");
        Intrinsics.checkNotNullParameter(emptyStateBlockFactory, "emptyStateBlockFactory");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(itemStorageDelegate, "itemStorageDelegate");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(unreadMessagesController, "unreadMessagesController");
        Intrinsics.checkNotNullParameter(chatStartupDelegate, "chatStartupDelegate");
        Intrinsics.checkNotNullParameter(footerUpdateGuard, "footerUpdateGuard");
        this.f90067c = appendUnreadWidgetUseCase;
        this.f90068d = insertAbsoluteItemsUseCase;
        this.f90069e = getInternalWidgetUseCase;
        this.f90070f = getRemoteMessagesUseCase;
        this.f90071g = emptyStateBlockFactory;
        this.f90072h = repository;
        this.f90073i = iVar;
        this.f90074j = itemStorageDelegate;
        this.f90075k = args;
        this.f90076l = unreadMessagesController;
        this.f90077m = chatStartupDelegate;
        this.f90078n = footerUpdateGuard;
        this.f90079o = this;
        this.f90080p = true;
        this.f90081q = O0.a(null);
        this.f90082r = Intrinsics.d(args.d(), "0") ? null : args.d();
        this.f90084t = true;
        this.f90085u = true;
        this.f90086v = O0.a(new ru.ozon.android.messenger.framework.presentation.common.screen.l(true));
        this.f90088x = new ru.ozon.android.messenger.utils.coroutines.a<>();
    }

    public static void I(d dVar, i.a failure, b.a loadDirection) {
        Pair pair;
        Pair pair2;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(failure, "failure");
        Intrinsics.checkNotNullParameter(loadDirection, "loadDirection");
        Lm0.a.f17149a.w("ERROR %s", failure.c());
        if (loadDirection == b.a.FORWARD) {
            dVar.U(false);
        }
        if (loadDirection == b.a.BACKWARD) {
            dVar.f90084t = false;
        }
        int i11 = b.f90096b[loadDirection.ordinal()];
        if (i11 == 1) {
            pair = new Pair(new c.a(true), PaginationErrorDTO.a.BOTTOM);
        } else {
            if (i11 != 2) {
                pair2 = new Pair(null, null);
                C10727i.c(dVar.d(), null, null, new ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.g((ru.ozon.android.messenger.framework.domain.model.c) pair2.a(), (PaginationErrorDTO.a) pair2.b(), dVar, null), 3);
            }
            pair = new Pair(new c.C1634c(true), PaginationErrorDTO.a.TOP);
        }
        pair2 = pair;
        C10727i.c(dVar.d(), null, null, new ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.g((ru.ozon.android.messenger.framework.domain.model.c) pair2.a(), (PaginationErrorDTO.a) pair2.b(), dVar, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (r7.i(ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d.g.f90116b, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        if (r7.i(ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d.f.f90115b, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object J(d dVar, d.q qVar, kotlin.coroutines.d<? super Unit> dVar2) {
        e eVar;
        int i11;
        if (dVar2 instanceof e) {
            eVar = (e) dVar2;
            int i12 = eVar.f90114g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f90114g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f90112e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f90114g;
                if (i11 != 0) {
                    s.b(obj);
                    if (qVar.b()) {
                        G.c.e();
                        a.C1665a.b(dVar, null, null, 3);
                    } else {
                        Map<String, Object> a11 = qVar.a();
                        Object obj2 = a11 != null ? a11.get("pagination") : null;
                        PaginationErrorDTO.a aVar2 = obj2 instanceof PaginationErrorDTO.a ? (PaginationErrorDTO.a) obj2 : null;
                        if (aVar2 != null) {
                            int i13 = b.f90095a[aVar2.ordinal()];
                            if (i13 == 1) {
                                ru.ozon.android.messenger.framework.data.local.a aVar3 = dVar.f90074j;
                                eVar.f90111d = dVar;
                                eVar.f90114g = 1;
                            } else {
                                if (i13 != 2) {
                                    throw new Sc.o();
                                }
                                ru.ozon.android.messenger.framework.data.local.a aVar4 = dVar.f90074j;
                                eVar.f90111d = dVar;
                                eVar.f90114g = 2;
                            }
                            return aVar;
                        }
                        if (!qVar.c()) {
                            dVar.w(true, new m.a(null));
                        }
                    }
                } else if (i11 == 1) {
                    dVar = eVar.f90111d;
                    s.b(obj);
                    dVar.G();
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = eVar.f90111d;
                    s.b(obj);
                    dVar.H();
                }
                return Unit.f71690a;
            }
        }
        eVar = dVar.new e(dVar2);
        Object obj3 = eVar.f90112e;
        Wc.a aVar5 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f90114g;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (r12.n(r13, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (M(r12, r6, r0, 6) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object K(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.h hVar;
        int i11;
        if (cVar instanceof ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.h) {
            hVar = (ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.h) cVar;
            int i12 = hVar.f90141g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f90141g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f90139e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f90141g;
                int i13 = 0;
                if (i11 != 0) {
                    s.b(obj);
                    if (!dVar.f90083s) {
                        dVar.w(true, new m.a(null));
                        dVar.f90074j.q();
                        a aVar2 = new a(b.a.BACK_AND_FORTH, null, null, a.b.FIRST, 6);
                        hVar.f90138d = dVar;
                        hVar.f90141g = 1;
                    }
                    ze.h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> b11 = dVar.b();
                    j.i iVar = new j.i(i13);
                    hVar.f90138d = null;
                    hVar.f90141g = 2;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    dVar = hVar.f90138d;
                    s.b(obj);
                }
                dVar.w(false, new m.a(null));
                ze.h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> b112 = dVar.b();
                j.i iVar2 = new j.i(i13);
                hVar.f90138d = null;
                hVar.f90141g = 2;
            }
        }
        hVar = new ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.h(dVar, cVar);
        Object obj2 = hVar.f90139e;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f90141g;
        int i132 = 0;
        if (i11 != 0) {
        }
        dVar.w(false, new m.a(null));
        ze.h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> b1122 = dVar.b();
        j.i iVar22 = new j.i(i132);
        hVar.f90138d = null;
        hVar.f90141g = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(a aVar, Map map, boolean z11, kotlin.coroutines.jvm.internal.c cVar) {
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.i iVar;
        int i11;
        boolean z12;
        a aVar2;
        Object a11;
        d dVar;
        ru.ozon.android.messenger.utils.i iVar2;
        a aVar3;
        ru.ozon.android.messenger.utils.i iVar3;
        d dVar2;
        if (cVar instanceof ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.i) {
            iVar = (ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.i) cVar;
            int i12 = iVar.f90149k;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                iVar.f90149k = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = iVar.f90147i;
                Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
                i11 = iVar.f90149k;
                if (i11 != 0) {
                    s.b(obj);
                    String value = this.f90077m.e().getValue();
                    if (value == null) {
                        return new i.a.e("Chat id is null");
                    }
                    this.f90080p = true;
                    z12 = aVar.d() == a.b.FIRST;
                    ru.ozon.android.messenger.framework.data.requests.b bVar = new ru.ozon.android.messenger.framework.data.requests.b(value, aVar.c(), aVar.b(), z11, z12, aVar.a(), map);
                    iVar.f90142d = this;
                    aVar2 = aVar;
                    iVar.f90143e = aVar2;
                    iVar.f90146h = z12 ? 1 : 0;
                    iVar.f90149k = 1;
                    a11 = this.f90070f.a(bVar, iVar);
                    if (a11 != aVar4) {
                        dVar = this;
                    }
                    return aVar4;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar3 = iVar.f90145g;
                    a11 = iVar.f90144f;
                    aVar3 = iVar.f90143e;
                    dVar2 = iVar.f90142d;
                    s.b(obj);
                    dVar = dVar2;
                    iVar2 = iVar3;
                    aVar2 = aVar3;
                    if (iVar2 instanceof i.a) {
                        I(dVar, (i.a) iVar2, aVar2.b());
                    }
                    dVar.f90080p = false;
                    return a11;
                }
                ?? r42 = iVar.f90146h;
                a aVar5 = iVar.f90143e;
                dVar = iVar.f90142d;
                s.b(obj);
                z12 = r42;
                a11 = obj;
                aVar2 = aVar5;
                iVar2 = (ru.ozon.android.messenger.utils.i) a11;
                if (iVar2 instanceof i.b) {
                    ru.ozon.android.messenger.framework.presentation.models.responses.h hVar = (ru.ozon.android.messenger.framework.presentation.models.responses.h) ((i.b) iVar2).b();
                    dVar.getClass();
                    if (hVar.c() != null) {
                        dVar.f90089y = hVar.c();
                    }
                    Boolean d11 = hVar.d();
                    Boolean bool = Boolean.FALSE;
                    if (Intrinsics.d(d11, bool)) {
                        dVar.U(false);
                    }
                    if (Intrinsics.d(hVar.e(), bool)) {
                        dVar.f90084t = false;
                    }
                    dVar.E(hVar, aVar2.b(), aVar2.d());
                    dVar.C(hVar.g(), hVar.c(), z12);
                    Map<String, String> b11 = hVar.b();
                    iVar.f90142d = dVar;
                    iVar.f90143e = aVar2;
                    iVar.f90144f = a11;
                    iVar.f90145g = (i.b) iVar2;
                    iVar.f90149k = 2;
                    if (dVar.o(b11, iVar) != aVar4) {
                        aVar3 = aVar2;
                        iVar3 = iVar2;
                        dVar2 = dVar;
                        dVar = dVar2;
                        iVar2 = iVar3;
                        aVar2 = aVar3;
                    }
                    return aVar4;
                }
                if (iVar2 instanceof i.a) {
                }
                dVar.f90080p = false;
                return a11;
            }
        }
        iVar = new ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.i(this, cVar);
        Object obj2 = iVar.f90147i;
        Wc.a aVar42 = Wc.a.COROUTINE_SUSPENDED;
        i11 = iVar.f90149k;
        if (i11 != 0) {
        }
        iVar2 = (ru.ozon.android.messenger.utils.i) a11;
        if (iVar2 instanceof i.b) {
        }
        if (iVar2 instanceof i.a) {
        }
        dVar.f90080p = false;
        return a11;
    }

    static /* synthetic */ Object M(d dVar, a aVar, kotlin.coroutines.jvm.internal.c cVar, int i11) {
        return dVar.L(aVar, U.c(), (i11 & 4) != 0, cVar);
    }

    public static final ArrayList l(d dVar, List list, ru.ozon.android.messenger.framework.presentation.models.responses.f fVar, Boolean bool, Boolean bool2) {
        List<ru.ozon.android.messenger.framework.presentation.models.q> e11;
        List<ru.ozon.android.messenger.framework.presentation.models.q> f7;
        dVar.getClass();
        ArrayList items = C7714v.W0(list);
        if (!dVar.f90087w && dVar.f90075k.c()) {
            dVar.f90087w = ((Boolean) dVar.f90067c.a(items).f()).booleanValue();
        }
        dVar.f90068d.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        Boolean bool3 = Boolean.TRUE;
        if (!bool.equals(bool3) && fVar != null && (f7 = fVar.f()) != null) {
            items.addAll(0, f7);
        }
        if (!bool2.equals(bool3) && fVar != null && (e11 = fVar.e()) != null) {
            items.addAll(e11);
        }
        return items;
    }

    public static final void m(d dVar, List list) {
        int i11;
        x0<Integer> x0Var = dVar.f90081q;
        String str = dVar.f90082r;
        Integer num = null;
        if (str != null) {
            ru.ozon.android.messenger.framework.presentation.chatdetail.a aVar = dVar.f90075k;
            int i12 = -1;
            int i13 = 0;
            if (!str.equals(aVar.d())) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i13 = -1;
                        break;
                    } else if (Intrinsics.d(r.d((ru.ozon.android.messenger.framework.presentation.models.q) it.next()), dVar.f90082r)) {
                        break;
                    } else {
                        i13++;
                    }
                }
                do {
                    i11 = i13;
                    i13--;
                    if (-1 >= i13) {
                        break;
                    }
                } while (!r.g((ru.ozon.android.messenger.framework.presentation.models.q) list.get(i13)));
                num = Integer.valueOf(i11);
            } else if (aVar.b()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.d(r.d((ru.ozon.android.messenger.framework.presentation.models.q) it2.next()), dVar.f90082r)) {
                        i12 = i13;
                        break;
                    }
                    i13++;
                }
                num = Integer.valueOf(i12);
            } else {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i13 = -1;
                        break;
                    } else if (r.b((ru.ozon.android.messenger.framework.presentation.models.q) it3.next()) instanceof ru.ozon.android.messenger.blocks.unreadline.a) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 != -1) {
                    num = Integer.valueOf(i13);
                }
            }
        }
        x0Var.setValue(num);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean A() {
        return this.f90084t;
    }

    protected final Object B(@NotNull kotlin.coroutines.jvm.internal.j frame) {
        if (this.f90074j.k().isEmpty()) {
            return null;
        }
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        C10727i.c(d(), null, null, new ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.e(this, c10737n, null), 3);
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    protected final void C(@NotNull List<ru.ozon.android.messenger.framework.presentation.models.q> loadedNoUiItems, ru.ozon.android.messenger.framework.presentation.models.responses.f fVar, boolean z11) {
        List<ru.ozon.android.messenger.framework.presentation.models.q> list;
        Intrinsics.checkNotNullParameter(loadedNoUiItems, "loadedNoUiItems");
        if (z11) {
            ArrayList m02 = C7714v.m0(fVar != null ? fVar.d() : null, fVar != null ? fVar.c() : null, fVar != null ? fVar.b() : null, fVar != null ? fVar.g() : null);
            list = m02;
            if (fVar != null) {
                List<ru.ozon.android.messenger.framework.presentation.models.q> a11 = fVar.a();
                list = m02;
                if (a11 != null) {
                    m02.addAll(a11);
                    list = m02;
                }
            }
        } else {
            list = this.f90074j.o();
        }
        C10727i.c(d(), null, null, new C1666d(C7714v.p0(loadedNoUiItems, list), this, null), 3);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a
    @NotNull
    public final x0<Integer> D() {
        return this.f90081q;
    }

    @NotNull
    protected final void E(@NotNull ru.ozon.android.messenger.framework.presentation.models.responses.h messagesResponse, @NotNull b.a loadDirection, @NotNull a.b loadType) {
        Intrinsics.checkNotNullParameter(messagesResponse, "messagesResponse");
        Intrinsics.checkNotNullParameter(loadDirection, "loadDirection");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        C10727i.c(d(), null, null, new ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.f(this, messagesResponse, loadType, this.f90074j, loadDirection, null), 3);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a
    public final Object F(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return K(this, cVar);
    }

    public void G() {
        B0 b02 = this.f90066A;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            this.f90066A = C10727i.c(d(), null, null, new h(null), 3);
        }
    }

    public void H() {
        B0 b02 = this.f90090z;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            this.f90090z = C10727i.c(d(), null, null, new i(null), 3);
        }
    }

    public final void N() {
        this.f90087w = false;
        this.f90083s = false;
        this.f90089y = null;
        this.f90085u = true;
        this.f90084t = true;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a
    public final boolean O() {
        return this.f90083s;
    }

    protected final void P(B0 b02) {
        this.f90066A = b02;
    }

    protected final void R(ru.ozon.android.messenger.framework.presentation.models.responses.f fVar) {
        this.f90089y = fVar;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean S() {
        return this.f90085u;
    }

    protected final void T(B0 b02) {
        this.f90090z = b02;
    }

    public final void U(boolean z11) {
        this.f90083s = true;
        this.f90085u = false;
    }

    public void V(@NotNull Map<String, String> additionalParams, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> onRefreshed) {
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        Intrinsics.checkNotNullParameter(onRefreshed, "onRefreshed");
        C10727i.c(d(), null, null, new c(onRefreshed, additionalParams, null), 3);
    }

    public final void W() {
        this.f90084t = false;
    }

    public void X(@NotNull Map<String, String> additionalParams, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> onRefreshed) {
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        Intrinsics.checkNotNullParameter(onRefreshed, "onRefreshed");
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean Y() {
        return this.f90080p;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a
    public final Object Z(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        N();
        this.f90082r = str;
        this.f90074j.q();
        Object M11 = M(this, new a(b.a.BACK_AND_FORTH, str, null, a.b.FIRST, 4), (kotlin.coroutines.jvm.internal.c) dVar, 6);
        return M11 == Wc.a.COROUTINE_SUSPENDED ? M11 : Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.l
    public final void a() {
        this.f90086v.setValue(new ru.ozon.android.messenger.framework.presentation.common.screen.l(true));
    }

    public final void a0(boolean z11) {
        this.f90080p = z11;
    }

    protected final void b0(String str, String str2, @NotNull String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        if (str == null) {
            if (str2 == null) {
                str = this.f90082r;
                if (str == null) {
                    InterfaceC9460a.f90044l0.getClass();
                    str = (String) InterfaceC9460a.C1664a.a().get(chatId);
                    if (str != null) {
                        Intrinsics.checkNotNullParameter(str, "<this>");
                        if (kotlin.text.h.e0(str, "LOCAL_", false)) {
                            str = null;
                        }
                    }
                }
            } else {
                str = str2;
            }
        }
        this.f90082r = str;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a
    @NotNull
    public final u c() {
        return this.f90079o;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a
    public final void cleanup() {
        B0 b02 = this.f90066A;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        B0 b03 = this.f90090z;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
        this.f90066A = null;
        this.f90090z = null;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a
    public final InterfaceC2395h getLoader() {
        return this.f90086v;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a
    public final void n(String str) {
        this.f90082r = str;
    }

    protected Object o(Map<String, String> map, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f90074j.t();
        return Unit.f71690a;
    }

    @NotNull
    protected List p() {
        return this.f90071g.e(this.f90072h.E().getValue(), ru.ozon.android.messenger.blocks.emptystate.j.CHAT_DETAILS, null);
    }

    protected final B0 q() {
        return this.f90066A;
    }

    protected final ru.ozon.android.messenger.framework.presentation.models.responses.f r() {
        return this.f90089y;
    }

    protected final B0 s() {
        return this.f90090z;
    }

    @NotNull
    protected final ru.ozon.android.messenger.utils.coroutines.a<Unit> t() {
        return this.f90088x;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a
    public final Object u(@NotNull d.q qVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return J(this, qVar, dVar);
    }

    public final String v() {
        return this.f90082r;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a
    public final void w(boolean z11, @NotNull m.a loaderType) {
        Intrinsics.checkNotNullParameter(loaderType, "loaderType");
        this.f90086v.setValue(new ru.ozon.android.messenger.framework.presentation.common.screen.l(z11, loaderType));
    }

    @NotNull
    public final x0<ru.ozon.android.messenger.framework.presentation.common.screen.l> x() {
        return this.f90086v;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a
    public final boolean z() {
        return this.f90088x.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b.a f90091a;

        /* renamed from: b, reason: collision with root package name */
        private final String f90092b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<String, String> f90093c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final a.b f90094d;

        public a(@NotNull b.a direction, String str, Map<String, String> map, @NotNull a.b type) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f90091a = direction;
            this.f90092b = str;
            this.f90093c = map;
            this.f90094d = type;
        }

        public final Map<String, String> a() {
            return this.f90093c;
        }

        @NotNull
        public final b.a b() {
            return this.f90091a;
        }

        public final String c() {
            return this.f90092b;
        }

        @NotNull
        public final a.b d() {
            return this.f90094d;
        }

        public /* synthetic */ a(b.a aVar, String str, Map map, a.b bVar, int i11) {
            this(aVar, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? a.b.REGULAR : bVar);
        }
    }
}
