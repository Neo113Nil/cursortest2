package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import h3.C6788a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.loading.LoadingDTO;
import ru.ozon.android.messenger.blocks.paginationerror.PaginationErrorDTO;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.data.requests.GetChatsRequest;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.domain.model.c;
import ru.ozon.android.messenger.framework.domain.usecases.C9394k;
import ru.ozon.android.messenger.framework.domain.usecases.C9396m;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9499k;
import ru.ozon.android.messenger.framework.presentation.chatlist.w;
import ru.ozon.android.messenger.framework.presentation.models.responses.g;
import ru.ozon.android.messenger.utils.i;
import xe.B0;
import xe.C10727i;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9500l extends AbstractC9507t implements InterfaceC9499k {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f90638m = {I1.w.c(C9500l.class, "hideRead", "getHideRead()Z", 0)};

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C9394k f90639c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C9396m f90640d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.emptystate.e f90641e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f90642f;

    /* renamed from: g, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f90643g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.utils.coroutines.a<Unit> f90644h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C9500l f90645i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f90646j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f90647k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final id.f f90648l;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.l$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90649a;

        static {
            int[] iArr = new int[InterfaceC9499k.b.values().length];
            try {
                iArr[InterfaceC9499k.b.FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC9499k.b.REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f90649a = iArr;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.l$b */
    static final class b extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.I f90650b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.I i11) {
            super(1);
            this.f90650b = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
            ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, null, null, null, new w.a(this.f90650b.f71783a), null, null, null, null, null, 2039);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.l$c */
    static final class c extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f90651b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
            ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, ru.ozon.android.messenger.utils.b.f(it.k(), C9504p.f90678b), null, null, null, null, null, null, null, null, 2046);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListLoadingDelegateImpl$loadChatsWithFilter$1", f = "ChatListLoadingDelegate.kt", l = {222, 225}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.l$d */
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90652d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f90654f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f90655g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f90656h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f90657i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ GetChatsRequest.Filter f90658j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC9499k.b f90659k;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListLoadingDelegateImpl$loadChatsWithFilter$1$1", f = "ChatListLoadingDelegate.kt", l = {232}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.l$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            GetChatsRequest f90660d;

            /* renamed from: e, reason: collision with root package name */
            int f90661e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C9500l f90662f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f90663g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f90664h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f90665i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ GetChatsRequest.Filter f90666j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ InterfaceC9499k.b f90667k;

            /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.l$d$a$a, reason: collision with other inner class name */
            static final class C1682a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f90668b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.responses.g f90669c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.models.q> f90670d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C9500l f90671e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1682a(boolean z11, ru.ozon.android.messenger.framework.presentation.models.responses.g gVar, List<ru.ozon.android.messenger.framework.presentation.models.q> list, C9500l c9500l) {
                    super(1);
                    this.f90668b = z11;
                    this.f90669c = gVar;
                    this.f90670d = list;
                    this.f90671e = c9500l;
                }

                @Override // kotlin.jvm.functions.Function1
                public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
                    List<ru.ozon.android.messenger.framework.presentation.models.q> f7;
                    Pair pair;
                    List list;
                    ru.ozon.android.messenger.framework.presentation.models.q e11;
                    ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
                    Intrinsics.checkNotNullParameter(it, "it");
                    ru.ozon.android.messenger.framework.presentation.models.responses.g gVar = this.f90669c;
                    if (this.f90668b) {
                        g.a d11 = gVar.d();
                        ru.ozon.android.messenger.framework.presentation.models.q d12 = d11 != null ? d11.d() : null;
                        g.a d13 = gVar.d();
                        ru.ozon.android.messenger.framework.presentation.models.q b11 = d13 != null ? d13.b() : null;
                        g.a d14 = gVar.d();
                        ru.ozon.android.messenger.framework.presentation.models.q[] elements = {d12, b11, d14 != null ? d14.c() : null};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        f7 = C7705l.B(elements);
                    } else {
                        f7 = it.f();
                    }
                    ArrayList p02 = C7714v.p0(gVar.f(), f7);
                    if (this.f90670d.isEmpty()) {
                        Integer num = (Integer) C7714v.d0(((LinkedHashMap) gVar.b()).keySet());
                        pair = new Pair(p02, kotlin.collections.U.n(gVar.b(), new Pair(Integer.valueOf(num != null ? num.intValue() + 1 : 0), ru.ozon.android.messenger.blocks.emptystate.e.d(this.f90671e.f90641e))));
                    } else {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = p02.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            ru.ozon.android.messenger.framework.presentation.models.u uVar = (ru.ozon.android.messenger.framework.presentation.models.u) C7714v.M(((ru.ozon.android.messenger.framework.presentation.models.q) next).b());
                            ru.ozon.android.messenger.framework.presentation.models.g c11 = uVar != null ? uVar.c() : null;
                            if (!(c11 instanceof ru.ozon.android.messenger.blocks.emptystate.k) && !(c11 instanceof ru.ozon.android.messenger.blocks.emptystate.v2.g)) {
                                arrayList.add(next);
                            }
                        }
                        pair = new Pair(arrayList, gVar.b());
                    }
                    List list2 = (List) pair.a();
                    Map map = (Map) pair.b();
                    w.a aVar = new w.a(false);
                    g.a d15 = gVar.d();
                    if (d15 == null || (e11 = d15.e()) == null || (list = C7714v.a0(e11)) == null) {
                        list = kotlin.collections.K.f71697a;
                    }
                    return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, this.f90670d, list2, map, aVar, null, null, list, null, null, 1392);
                }
            }

            /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.l$d$a$b */
            static final class b extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.responses.g f90672b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(ru.ozon.android.messenger.framework.presentation.models.responses.g gVar) {
                    super(1);
                    this.f90672b = gVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
                    List<ru.ozon.android.messenger.framework.presentation.models.q> transform = list;
                    Intrinsics.checkNotNullParameter(transform, "$this$transform");
                    ru.ozon.android.messenger.framework.domain.model.d.a(transform, this.f90672b.c(), new c.a(true));
                    return Unit.f71690a;
                }
            }

            /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.l$d$a$c */
            public /* synthetic */ class c {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f90673a;

                static {
                    int[] iArr = new int[InterfaceC9499k.b.values().length];
                    try {
                        iArr[InterfaceC9499k.b.FORWARD.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[InterfaceC9499k.b.REFRESH.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f90673a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C9500l c9500l, int i11, int i12, boolean z11, GetChatsRequest.Filter filter, InterfaceC9499k.b bVar, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f90662f = c9500l;
                this.f90663g = i11;
                this.f90664h = i12;
                this.f90665i = z11;
                this.f90666j = filter;
                this.f90667k = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f90662f, this.f90663g, this.f90664h, this.f90665i, this.f90666j, this.f90667k, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                GetChatsRequest getChatsRequest;
                List<ru.ozon.android.messenger.framework.presentation.models.q> f7;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f90661e;
                boolean z11 = this.f90665i;
                C9500l c9500l = this.f90662f;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    ru.ozon.android.messenger.blocks.chatGroups.grouplist.m a11 = ru.ozon.android.messenger.framework.presentation.chatlist.i.a(c9500l.b());
                    ru.ozon.android.messenger.framework.presentation.models.q a12 = a11 != null ? ru.ozon.android.messenger.blocks.chatGroups.grouplist.n.a(a11) : null;
                    GetChatsRequest getChatsRequest2 = new GetChatsRequest(new Integer(this.f90663g), new Integer(this.f90664h), Boolean.valueOf(z11), this.f90666j);
                    C9394k c9394k = c9500l.f90639c;
                    String d11 = a12 != null ? ru.ozon.android.messenger.framework.presentation.models.r.d(a12) : null;
                    this.f90660d = getChatsRequest2;
                    this.f90661e = 1;
                    obj = c9394k.c(getChatsRequest2, d11, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    getChatsRequest = getChatsRequest2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    getChatsRequest = this.f90660d;
                    Sc.s.b(obj);
                }
                ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
                boolean z12 = iVar instanceof i.b;
                InterfaceC9499k.b bVar = this.f90667k;
                if (z12) {
                    ru.ozon.android.messenger.framework.presentation.models.responses.g gVar = (ru.ozon.android.messenger.framework.presentation.models.responses.g) ((i.b) iVar).b();
                    Boolean e11 = gVar.e();
                    c9500l.o(e11 != null ? e11.booleanValue() : false);
                    int i12 = c.f90673a[bVar.ordinal()];
                    if (i12 == 1) {
                        f7 = ru.ozon.android.messenger.utils.b.f(c9500l.b().k(), new b(gVar));
                    } else {
                        if (i12 != 2) {
                            throw new Sc.o();
                        }
                        f7 = gVar.c();
                    }
                    c9500l.a().a(new C1682a(z11, gVar, f7, c9500l));
                }
                if (iVar instanceof i.a) {
                    Lm0.a.f17149a.w("Failed to load chats with request " + getChatsRequest + "\nFailure: " + ((i.a) iVar), new Object[0]);
                    C9500l.i(c9500l, bVar);
                }
                c9500l.p(false);
                return Unit.f71690a;
            }
        }

        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.l$d$b */
        /* synthetic */ class b extends C7735q implements Function2<Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object>, kotlin.coroutines.d<? super Unit>, Object> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super Unit> dVar) {
                return ((ru.ozon.android.messenger.utils.coroutines.a) this.receiver).b(function1, dVar);
            }
        }

        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.l$d$c */
        /* synthetic */ class c extends C7735q implements Function2<Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object>, kotlin.coroutines.d<? super Unit>, Object> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super Unit> dVar) {
                return ((ru.ozon.android.messenger.utils.coroutines.a) this.receiver).d(function1, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z11, int i11, int i12, boolean z12, GetChatsRequest.Filter filter, InterfaceC9499k.b bVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f90654f = z11;
            this.f90655g = i11;
            this.f90656h = i12;
            this.f90657i = z12;
            this.f90658j = filter;
            this.f90659k = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9500l.this.new d(this.f90654f, this.f90655g, this.f90656h, this.f90657i, this.f90658j, this.f90659k, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
        
            if (r5.invoke(r6, r14) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
        
            if (r15.y(r14) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90652d;
            C9500l c9500l = C9500l.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                c9500l.p(true);
                ru.ozon.android.messenger.framework.domain.repository.b bVar = c9500l.f90642f;
                this.f90652d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
            }
            Function2 bVar2 = this.f90654f ? new b(2, c9500l.f90644h, ru.ozon.android.messenger.utils.coroutines.a.class, "cancelPreviousThenRun", "cancelPreviousThenRun(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0) : new c(2, c9500l.f90644h, ru.ozon.android.messenger.utils.coroutines.a.class, "joinPreviousOrRun", "joinPreviousOrRun(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            a aVar2 = new a(C9500l.this, this.f90655g, this.f90656h, this.f90657i, this.f90658j, this.f90659k, null);
            this.f90652d = 2;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.l$e */
    static final class e extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f90674b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
            super(1);
            this.f90674b = qVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
            ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, ru.ozon.android.messenger.utils.b.f(it.k(), new C9505q(this.f90674b)), null, null, null, null, null, null, null, null, 2046);
        }
    }

    public C9500l(@NotNull C9394k getChatsUseCase, @NotNull C9396m getInternalWidgetUseCase, @NotNull ru.ozon.android.messenger.blocks.emptystate.e emptyStateBlockFactory, @NotNull ru.ozon.android.messenger.blocks.alert.a alertBlockFactory, @NotNull ru.ozon.android.messenger.framework.domain.repository.b chatRepository, ru.ozon.android.messenger.framework.analytics.i iVar) {
        Intrinsics.checkNotNullParameter(getChatsUseCase, "getChatsUseCase");
        Intrinsics.checkNotNullParameter(getInternalWidgetUseCase, "getInternalWidgetUseCase");
        Intrinsics.checkNotNullParameter(emptyStateBlockFactory, "emptyStateBlockFactory");
        Intrinsics.checkNotNullParameter(alertBlockFactory, "alertBlockFactory");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f90639c = getChatsUseCase;
        this.f90640d = getInternalWidgetUseCase;
        this.f90641e = emptyStateBlockFactory;
        this.f90642f = chatRepository;
        this.f90643g = iVar;
        this.f90644h = new ru.ozon.android.messenger.utils.coroutines.a<>();
        this.f90645i = this;
        this.f90648l = chatRepository.c();
    }

    public static final void i(C9500l c9500l, InterfaceC9499k.b bVar) {
        c9500l.getClass();
        if (bVar == InterfaceC9499k.b.FORWARD) {
            c9500l.f90646j = false;
        }
        int i11 = a.f90649a[bVar.ordinal()];
        if (i11 == 1) {
            c9500l.a().a(new C9502n(c9500l));
        } else {
            if (i11 != 2) {
                throw new Sc.o();
            }
            c9500l.a().a(new C9503o(c9500l));
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean A() {
        return false;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final void G() {
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final void H() {
        a().a(new e((ru.ozon.android.messenger.framework.presentation.models.q) C7714v.K(this.f90640d.a(new Pair(f.b.LOADING, new LoadingDTO())))));
        InterfaceC9499k.b bVar = InterfaceC9499k.b.FORWARD;
        int P11 = C7714v.P(b().k());
        if (P11 < 0) {
            P11 = 0;
        }
        InterfaceC9499k.a.a(this, bVar, P11, 0, 28);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean S() {
        return this.f90646j;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean Y() {
        return this.f90647k;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.common.view.recycler.u c() {
        return this.f90645i;
    }

    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.q> j(@NotNull List<ru.ozon.android.messenger.framework.presentation.models.q> oldNoUiItems) {
        Intrinsics.checkNotNullParameter(oldNoUiItems, "oldNoUiItems");
        return this.f90641e.e(this.f90642f.E().getValue(), ru.ozon.android.messenger.blocks.emptystate.j.CHAT_LIST, null);
    }

    public final void k(boolean z11, GetChatsRequest.Filter filter) {
        int i11;
        kotlin.jvm.internal.I i12 = new kotlin.jvm.internal.I();
        i12.f71783a = !z11;
        int size = b().k().size();
        if (size < 30) {
            size = 30;
        }
        if (size > 90) {
            i12.f71783a = true;
            i11 = 30;
        } else {
            i11 = size;
        }
        a().a(new b(i12));
        this.f90646j = false;
        if (filter == null) {
            InterfaceC9499k.a.a(this, InterfaceC9499k.b.REFRESH, 0, i11, 16);
            return;
        }
        this.f90648l.setValue(this, f90638m[0], Boolean.valueOf(Intrinsics.d(filter.getOnlyUnread(), Boolean.TRUE)));
        m(InterfaceC9499k.b.REFRESH, 0, true, i11, false, filter);
    }

    public final void l(@NotNull d.q event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> a11 = event.a();
        Object obj = a11 != null ? a11.get("hideRead") : null;
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            this.f90648l.setValue(this, f90638m[0], bool);
        }
        if (event.b()) {
            b7.d.d();
            k(event.c(), null);
            return;
        }
        Map<String, Object> a12 = event.a();
        Object obj2 = a12 != null ? a12.get("pagination") : null;
        PaginationErrorDTO.a aVar = obj2 instanceof PaginationErrorDTO.a ? (PaginationErrorDTO.a) obj2 : null;
        if (aVar != null) {
            AbstractC9330a value = this.f90642f.l().getValue();
            Intrinsics.checkNotNullParameter(value, "<this>");
            if (!((value instanceof AbstractC9330a.C1590a) || (value instanceof AbstractC9330a.b))) {
                k(false, null);
            }
            if (aVar == PaginationErrorDTO.a.BOTTOM) {
                a().a(c.f90651b);
                H();
            } else {
                Lm0.a.f17149a.w("Invalid pagination error type " + aVar, new Object[0]);
            }
        }
    }

    @NotNull
    public final B0 m(@NotNull InterfaceC9499k.b loadType, int i11, boolean z11, int i12, boolean z12, @NotNull GetChatsRequest.Filter filter) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(filter, "filter");
        C6788a c6788a = this.f90686a;
        if (c6788a != null) {
            return C10727i.c(c6788a, null, null, new d(z12, i11, i12, z11, filter, loadType, null), 3);
        }
        Intrinsics.n("viewModelScope");
        throw null;
    }

    public final void o(boolean z11) {
        this.f90646j = z11;
    }

    public final void p(boolean z11) {
        this.f90647k = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9499k
    @NotNull
    public final B0 y(@NotNull InterfaceC9499k.b loadType, int i11, boolean z11, int i12, boolean z12) {
        ru.ozon.android.messenger.blocks.chatGroups.a aVar;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        ru.ozon.android.messenger.blocks.chatGroups.grouplist.m a11 = ru.ozon.android.messenger.framework.presentation.chatlist.i.a(b());
        String str = null;
        ru.ozon.android.messenger.framework.presentation.models.q a12 = a11 != null ? ru.ozon.android.messenger.blocks.chatGroups.grouplist.n.a(a11) : null;
        if (a12 != null && (aVar = (ru.ozon.android.messenger.blocks.chatGroups.a) ru.ozon.android.messenger.framework.presentation.models.r.c(a12)) != null) {
            str = aVar.b();
        }
        String str2 = str;
        Boolean bool = (Boolean) this.f90648l.getValue(this, f90638m[0]);
        bool.getClass();
        return m(loadType, i11, z11, i12, z12, new GetChatsRequest.Filter(null, bool, str2, 1, null));
    }
}
