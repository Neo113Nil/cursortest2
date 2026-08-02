package ru.ozon.android.messenger.framework.presentation.ai.delegates;

import Ae.O0;
import Ae.x0;
import P20.f;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.requests.ai.a;
import ru.ozon.android.messenger.framework.data.requests.b;
import ru.ozon.android.messenger.framework.domain.usecases.C9388e;
import ru.ozon.android.messenger.framework.domain.usecases.C9396m;
import ru.ozon.android.messenger.framework.domain.usecases.C9397n;
import ru.ozon.android.messenger.framework.presentation.ai.delegates.a;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o;
import ru.ozon.android.messenger.framework.presentation.common.screen.m;
import ru.ozon.android.messenger.framework.presentation.common.startup.a;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.r;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import xe.B0;
import xe.C10727i;
import xe.M;
import ze.h;

/* loaded from: classes10.dex */
public final class c extends ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d implements ru.ozon.android.messenger.framework.presentation.ai.delegates.b {

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.ai.b f89545B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.emptystate.a f89546C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89547D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f89548E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.ai.a f89549F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.a f89550G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.a f89551H;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.startup.a f89552I;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private Map<String, String> f89553J;

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private final x0<ru.ozon.android.messenger.framework.presentation.ai.delegates.a> f89554K;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.delegates.AiAssistantLoadingDelegateImpl", f = "AiAssistantLoadingDelegate.kt", l = {92}, m = "afterLoadMessagesSuccess")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        c f89555d;

        /* renamed from: e, reason: collision with root package name */
        ru.ozon.android.messenger.framework.presentation.ai.delegates.a f89556e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89557f;

        /* renamed from: h, reason: collision with root package name */
        int f89559h;

        a(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f89557f = obj;
            this.f89559h |= LinearLayoutManager.INVALID_OFFSET;
            return c.this.o(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.delegates.AiAssistantLoadingDelegateImpl$aiRefresh$1", f = "AiAssistantLoadingDelegate.kt", l = {181, 207}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f89560d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f89561e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ j f89563g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f89564h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.delegates.AiAssistantLoadingDelegateImpl$aiRefresh$1$1", f = "AiAssistantLoadingDelegate.kt", l = {183, 188, 190, 192, 194, 204}, m = "invokeSuspend")
        static final class a extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            kotlin.jvm.internal.M f89565d;

            /* renamed from: e, reason: collision with root package name */
            a.C1700a f89566e;

            /* renamed from: f, reason: collision with root package name */
            c f89567f;

            /* renamed from: g, reason: collision with root package name */
            int f89568g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ c f89569h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Map<String, String> f89570i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, Map<String, String> map, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f89569h = cVar;
                this.f89570i = map;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f89569h, this.f89570i, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x00f3, code lost:
            
                if (r1.n(r2, r9) == r0) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00dc, code lost:
            
                if (ru.ozon.android.messenger.framework.presentation.ai.delegates.c.l0(r4, r10, r2, r9, 4) == r0) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
            
                if (r10.n(r6, r9) == r0) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0049, code lost:
            
                if (r4.k0() == r0) goto L37;
             */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
            /* JADX WARN: Type inference failed for: r10v12, types: [T, java.util.LinkedHashMap] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                kotlin.jvm.internal.M m11;
                i iVar;
                a.C1700a c1700a;
                c cVar;
                kotlin.jvm.internal.M m12;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f89568g;
                Map<String, String> map = this.f89570i;
                c cVar2 = this.f89569h;
                switch (i11) {
                    case 0:
                        s.b(obj);
                        cVar2.w(true, new m.a(null));
                        this.f89568g = 1;
                        break;
                    case 1:
                        s.b(obj);
                        cVar2.N();
                        cVar2.f89550G.q();
                        kotlin.jvm.internal.M m13 = new kotlin.jvm.internal.M();
                        ru.ozon.android.messenger.framework.presentation.common.startup.a aVar2 = cVar2.f89552I;
                        this.f89565d = m13;
                        this.f89568g = 2;
                        Object a11 = aVar2.a(map, this);
                        if (a11 != aVar) {
                            m11 = m13;
                            obj = a11;
                            iVar = (i) obj;
                            if (iVar instanceof i.b) {
                                c1700a = (a.C1700a) ((i.b) iVar).b();
                                Map<String, String> b11 = c1700a.b();
                                if (b11 == null) {
                                    b11 = U.c();
                                }
                                m11.f71787a = U.m(b11, map);
                                this.f89565d = m11;
                                this.f89566e = c1700a;
                                this.f89567f = cVar2;
                                this.f89568g = 3;
                                obj = cVar2.B(this);
                                if (obj != aVar) {
                                    cVar = cVar2;
                                    cVar.b0((String) obj, c1700a.c(), c1700a.a());
                                }
                            }
                            m12 = m11;
                            h b12 = cVar2.b();
                            j.h hVar = j.h.f89877a;
                            this.f89565d = m12;
                            this.f89566e = null;
                            this.f89567f = null;
                            this.f89568g = 4;
                            break;
                        }
                        return aVar;
                    case 2:
                        kotlin.jvm.internal.M m14 = this.f89565d;
                        s.b(obj);
                        m11 = m14;
                        iVar = (i) obj;
                        if (iVar instanceof i.b) {
                        }
                        m12 = m11;
                        h b122 = cVar2.b();
                        j.h hVar2 = j.h.f89877a;
                        this.f89565d = m12;
                        this.f89566e = null;
                        this.f89567f = null;
                        this.f89568g = 4;
                        break;
                    case 3:
                        cVar = this.f89567f;
                        c1700a = this.f89566e;
                        m11 = this.f89565d;
                        s.b(obj);
                        cVar.b0((String) obj, c1700a.c(), c1700a.a());
                        m12 = m11;
                        h b1222 = cVar2.b();
                        j.h hVar22 = j.h.f89877a;
                        this.f89565d = m12;
                        this.f89566e = null;
                        this.f89567f = null;
                        this.f89568g = 4;
                        break;
                    case 4:
                        m12 = this.f89565d;
                        s.b(obj);
                        d.a aVar3 = new d.a(b.a.BACK_AND_FORTH, cVar2.v(), (Map) m12.f71787a, a.b.FIRST);
                        this.f89565d = null;
                        this.f89568g = 5;
                        break;
                    case 5:
                        s.b(obj);
                        cVar2.w(false, new m.a(null));
                        h b13 = cVar2.b();
                        j.i iVar2 = new j.i(0);
                        this.f89568g = 6;
                        break;
                    case 6:
                        s.b(obj);
                        return Unit.f71690a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, Map<String, String> map, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f89563g = (kotlin.coroutines.jvm.internal.j) function2;
            this.f89564h = map;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = c.this.new b(this.f89563g, this.f89564h, dVar);
            bVar.f89561e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            if (r8.f89563g.invoke(r1, r8) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r5.d(r6, r8) == r0) goto L15;
         */
        /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            M m11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f89560d;
            if (i11 == 0) {
                s.b(obj);
                m11 = (M) this.f89561e;
                c cVar = c.this;
                ru.ozon.android.messenger.utils.coroutines.a t2 = cVar.t();
                a aVar2 = new a(cVar, this.f89564h, null);
                this.f89561e = m11;
                this.f89560d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                m11 = (M) this.f89561e;
                s.b(obj);
            }
            this.f89561e = null;
            this.f89560d = 2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.delegates.AiAssistantLoadingDelegateImpl$fullRefresh$1", f = "AiAssistantLoadingDelegate.kt", l = {147, 169}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.delegates.c$c, reason: collision with other inner class name */
    static final class C1656c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f89571d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f89572e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<M, kotlin.coroutines.d<? super Unit>, Object> f89574g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f89575h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.delegates.AiAssistantLoadingDelegateImpl$fullRefresh$1$1", f = "AiAssistantLoadingDelegate.kt", l = {153, 155, 157, 159}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.delegates.c$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            kotlin.jvm.internal.M f89576d;

            /* renamed from: e, reason: collision with root package name */
            a.C1700a f89577e;

            /* renamed from: f, reason: collision with root package name */
            c f89578f;

            /* renamed from: g, reason: collision with root package name */
            int f89579g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ c f89580h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Map<String, String> f89581i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, Map<String, String> map, kotlin.coroutines.d<? super a> dVar) {
                super(1, dVar);
                this.f89580h = cVar;
                this.f89581i = map;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
                return new a(this.f89580h, this.f89581i, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x00d0, code lost:
            
                if (ru.ozon.android.messenger.framework.presentation.ai.delegates.c.l0(r3, r10, null, r9, 6) == r0) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
            
                if (r10.n(r4, r9) != r0) goto L31;
             */
            /* JADX WARN: Type inference failed for: r1v6, types: [T, java.util.LinkedHashMap] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                kotlin.jvm.internal.M m11;
                a.C1700a c1700a;
                c cVar;
                kotlin.jvm.internal.M m12;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f89579g;
                c cVar2 = this.f89580h;
                Map<String, String> map = this.f89581i;
                if (i11 == 0) {
                    s.b(obj);
                    cVar2.w(true, new m.a(null));
                    cVar2.N();
                    cVar2.f89550G.q();
                    kotlin.jvm.internal.M m13 = new kotlin.jvm.internal.M();
                    ru.ozon.android.messenger.framework.presentation.common.startup.a aVar2 = cVar2.f89552I;
                    this.f89576d = m13;
                    this.f89579g = 1;
                    Object b11 = aVar2.b(map, this);
                    if (b11 != aVar) {
                        m11 = m13;
                        obj = b11;
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    kotlin.jvm.internal.M m14 = this.f89576d;
                    s.b(obj);
                    m11 = m14;
                } else if (i11 == 2) {
                    cVar = this.f89578f;
                    c1700a = this.f89577e;
                    m11 = this.f89576d;
                    s.b(obj);
                    cVar.b0((String) obj, c1700a.c(), c1700a.a());
                    m12 = m11;
                    h b12 = cVar2.b();
                    j.h hVar = j.h.f89877a;
                    this.f89576d = m12;
                    this.f89577e = null;
                    this.f89578f = null;
                    this.f89579g = 3;
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        cVar2.w(false, new m.a(null));
                        return Unit.f71690a;
                    }
                    m12 = this.f89576d;
                    s.b(obj);
                    d.a aVar3 = new d.a(b.a.BACK_AND_FORTH, cVar2.v(), (Map) m12.f71787a, a.b.FIRST);
                    this.f89576d = null;
                    this.f89579g = 4;
                }
                i iVar = (i) obj;
                if (iVar instanceof i.b) {
                    a.C1700a c1700a2 = (a.C1700a) ((i.b) iVar).b();
                    Map<String, String> b13 = c1700a2.b();
                    if (b13 == null) {
                        b13 = U.c();
                    }
                    m11.f71787a = U.m(b13, map);
                    this.f89576d = m11;
                    this.f89577e = c1700a2;
                    this.f89578f = cVar2;
                    this.f89579g = 2;
                    Object B11 = cVar2.B(this);
                    if (B11 != aVar) {
                        c1700a = c1700a2;
                        obj = B11;
                        cVar = cVar2;
                        cVar.b0((String) obj, c1700a.c(), c1700a.a());
                    }
                    return aVar;
                }
                m12 = m11;
                h b122 = cVar2.b();
                j.h hVar2 = j.h.f89877a;
                this.f89576d = m12;
                this.f89577e = null;
                this.f89578f = null;
                this.f89579g = 3;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1656c(Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, Map<String, String> map, kotlin.coroutines.d<? super C1656c> dVar) {
            super(2, dVar);
            this.f89574g = function2;
            this.f89575h = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C1656c c1656c = c.this.new C1656c(this.f89574g, this.f89575h, dVar);
            c1656c.f89572e = obj;
            return c1656c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1656c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            if (r8.f89574g.invoke(r1, r8) == r0) goto L15;
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
            int i11 = this.f89571d;
            if (i11 == 0) {
                s.b(obj);
                m11 = (M) this.f89572e;
                c cVar = c.this;
                ru.ozon.android.messenger.utils.coroutines.a t2 = cVar.t();
                a aVar2 = new a(cVar, this.f89575h, null);
                this.f89572e = m11;
                this.f89571d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                m11 = (M) this.f89572e;
                s.b(obj);
            }
            this.f89572e = null;
            this.f89571d = 2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.delegates.AiAssistantLoadingDelegateImpl$onLoadMoreBackward$1", f = "AiAssistantLoadingDelegate.kt", l = {113}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f89582d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f89582d;
            if (i11 == 0) {
                s.b(obj);
                b.a aVar2 = b.a.BACKWARD;
                c cVar = c.this;
                Map map = cVar.f89553J;
                q qVar = (q) C7714v.M(cVar.f89550G.m());
                d.a aVar3 = new d.a(aVar2, qVar != null ? r.d(qVar) : null, map, null, 8);
                this.f89582d = 1;
                if (c.l0(cVar, aVar3, null, this, 2) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.delegates.AiAssistantLoadingDelegateImpl$onLoadMoreForward$1", f = "AiAssistantLoadingDelegate.kt", l = {129}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f89584d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new e(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f89584d;
            if (i11 == 0) {
                s.b(obj);
                b.a aVar2 = b.a.FORWARD;
                c cVar = c.this;
                Map map = cVar.f89553J;
                q qVar = (q) C7714v.Z(cVar.f89550G.m());
                d.a aVar3 = new d.a(aVar2, qVar != null ? r.d(qVar) : null, map, null, 8);
                this.f89584d = 1;
                if (c.l0(cVar, aVar3, null, this, 2) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull C9388e appendUnreadWidgetUseCase, @NotNull f insertAbsoluteItemsUseCase, @NotNull C9397n getRemoteMessagesUseCase, @NotNull C9396m getInternalWidgetUseCase, @NotNull ru.ozon.android.messenger.framework.domain.usecases.ai.b getAiMessagesUseCase, @NotNull ru.ozon.android.messenger.blocks.emptystate.a emptyStateBlockFactory, @NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, @NotNull ru.ozon.android.messenger.framework.navigation.controller.a messengerController, ru.ozon.android.messenger.framework.analytics.i iVar, @NotNull ru.ozon.android.messenger.framework.domain.usecases.ai.a setStateUseCase, @NotNull ru.ozon.android.messenger.framework.data.local.a itemStorageDelegate, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.a args, @NotNull o unreadMessagesController, @NotNull ru.ozon.android.messenger.framework.presentation.common.startup.a chatStartupDelegate, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.a footerUpdateGuard) {
        super(appendUnreadWidgetUseCase, insertAbsoluteItemsUseCase, getInternalWidgetUseCase, getRemoteMessagesUseCase, emptyStateBlockFactory, repository, iVar, itemStorageDelegate, args, unreadMessagesController, chatStartupDelegate, footerUpdateGuard);
        Intrinsics.checkNotNullParameter(appendUnreadWidgetUseCase, "appendUnreadWidgetUseCase");
        Intrinsics.checkNotNullParameter(insertAbsoluteItemsUseCase, "insertAbsoluteItemsUseCase");
        Intrinsics.checkNotNullParameter(getRemoteMessagesUseCase, "getRemoteMessagesUseCase");
        Intrinsics.checkNotNullParameter(getInternalWidgetUseCase, "getInternalWidgetUseCase");
        Intrinsics.checkNotNullParameter(getAiMessagesUseCase, "getAiMessagesUseCase");
        Intrinsics.checkNotNullParameter(emptyStateBlockFactory, "emptyStateBlockFactory");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        Intrinsics.checkNotNullParameter(setStateUseCase, "setStateUseCase");
        Intrinsics.checkNotNullParameter(itemStorageDelegate, "itemStorageDelegate");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(unreadMessagesController, "unreadMessagesController");
        Intrinsics.checkNotNullParameter(chatStartupDelegate, "chatStartupDelegate");
        Intrinsics.checkNotNullParameter(footerUpdateGuard, "footerUpdateGuard");
        this.f89545B = getAiMessagesUseCase;
        this.f89546C = emptyStateBlockFactory;
        this.f89547D = repository;
        this.f89548E = messengerController;
        this.f89549F = setStateUseCase;
        this.f89550G = itemStorageDelegate;
        this.f89551H = args;
        this.f89552I = chatStartupDelegate;
        this.f89553J = U.c();
        this.f89554K = O0.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(d.a aVar, Map map, boolean z11, kotlin.coroutines.jvm.internal.c cVar) {
        ru.ozon.android.messenger.framework.presentation.ai.delegates.d dVar;
        int i11;
        boolean z12;
        d.a aVar2;
        Object a11;
        c cVar2;
        i iVar;
        d.a aVar3;
        i iVar2;
        c cVar3;
        if (cVar instanceof ru.ozon.android.messenger.framework.presentation.ai.delegates.d) {
            dVar = (ru.ozon.android.messenger.framework.presentation.ai.delegates.d) cVar;
            int i12 = dVar.f89593k;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f89593k = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f89591i;
                Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f89593k;
                if (i11 != 0) {
                    s.b(obj);
                    String value = this.f89552I.e().getValue();
                    if (value == null) {
                        return new i.a.e("Chat id is null");
                    }
                    a0(true);
                    z12 = aVar.d() == a.b.FIRST;
                    ru.ozon.android.messenger.framework.data.requests.b bVar = new ru.ozon.android.messenger.framework.data.requests.b(value, aVar.c(), aVar.b(), z11, z12, aVar.a(), map);
                    dVar.f89586d = this;
                    aVar2 = aVar;
                    dVar.f89587e = aVar2;
                    dVar.f89590h = z12 ? 1 : 0;
                    dVar.f89593k = 1;
                    a11 = this.f89545B.a(bVar, dVar);
                    if (a11 != aVar4) {
                        cVar2 = this;
                    }
                    return aVar4;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar2 = dVar.f89589g;
                    a11 = dVar.f89588f;
                    aVar3 = dVar.f89587e;
                    cVar3 = dVar.f89586d;
                    s.b(obj);
                    cVar2 = cVar3;
                    iVar = iVar2;
                    aVar2 = aVar3;
                    if (iVar instanceof i.a) {
                        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d.I(cVar2, (i.a) iVar, aVar2.b());
                    }
                    cVar2.a0(false);
                    return a11;
                }
                ?? r42 = dVar.f89590h;
                d.a aVar5 = dVar.f89587e;
                cVar2 = dVar.f89586d;
                s.b(obj);
                z12 = r42;
                a11 = obj;
                aVar2 = aVar5;
                iVar = (i) a11;
                if (iVar instanceof i.b) {
                    ru.ozon.android.messenger.framework.presentation.models.responses.h hVar = (ru.ozon.android.messenger.framework.presentation.models.responses.h) ((i.b) iVar).b();
                    Map<String, TokenizedTrackingInfo> h11 = hVar.h();
                    if (h11 != null) {
                        cVar2.f89548E.s(ru.ozon.android.messenger.framework.analytics.h.a(h11));
                    }
                    cVar2.getClass();
                    if (hVar.c() != null) {
                        cVar2.R(hVar.c());
                    }
                    Boolean d11 = hVar.d();
                    Boolean bool = Boolean.FALSE;
                    if (Intrinsics.d(d11, bool)) {
                        cVar2.U(false);
                    }
                    if (Intrinsics.d(hVar.e(), bool)) {
                        cVar2.W();
                    }
                    cVar2.E(hVar, aVar2.b(), aVar2.d());
                    cVar2.C(hVar.g(), hVar.c(), z12);
                    Map<String, String> b11 = hVar.b();
                    dVar.f89586d = cVar2;
                    dVar.f89587e = aVar2;
                    dVar.f89588f = a11;
                    dVar.f89589g = (i.b) iVar;
                    dVar.f89593k = 2;
                    if (cVar2.o(b11, dVar) != aVar4) {
                        aVar3 = aVar2;
                        iVar2 = iVar;
                        cVar3 = cVar2;
                        cVar2 = cVar3;
                        iVar = iVar2;
                        aVar2 = aVar3;
                    }
                    return aVar4;
                }
                if (iVar instanceof i.a) {
                }
                cVar2.a0(false);
                return a11;
            }
        }
        dVar = new ru.ozon.android.messenger.framework.presentation.ai.delegates.d(this, cVar);
        Object obj2 = dVar.f89591i;
        Wc.a aVar42 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f89593k;
        if (i11 != 0) {
        }
        iVar = (i) a11;
        if (iVar instanceof i.b) {
        }
        if (iVar instanceof i.a) {
        }
        cVar2.a0(false);
        return a11;
    }

    static /* synthetic */ Object l0(c cVar, d.a aVar, Map map, kotlin.coroutines.jvm.internal.j jVar, int i11) {
        if ((i11 & 2) != 0) {
            map = U.c();
        }
        return cVar.L(aVar, map, (i11 & 4) != 0, jVar);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d, ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final void G() {
        B0 q11 = q();
        if (q11 == null || !q11.isActive()) {
            P(C10727i.c(d(), null, null, new d(null), 3));
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d, ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final void H() {
        B0 s11 = s();
        if (s11 == null || !s11.isActive()) {
            T(C10727i.c(d(), null, null, new e(null), 3));
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.ai.delegates.b
    @NotNull
    public final x0<ru.ozon.android.messenger.framework.presentation.ai.delegates.a> Q() {
        return this.f89554K;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d, ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a
    public final void V(@NotNull Map<String, String> additionalParams, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> onRefreshed) {
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        Intrinsics.checkNotNullParameter(onRefreshed, "onRefreshed");
        this.f89553J = additionalParams;
        C10727i.c(d(), null, null, new C1656c(onRefreshed, additionalParams, null), 3);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d, ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a
    public final void X(@NotNull Map<String, String> additionalParams, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> onRefreshed) {
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        Intrinsics.checkNotNullParameter(onRefreshed, "onRefreshed");
        cleanup();
        this.f89553J = additionalParams;
        C10727i.c(d(), null, null, new b(onRefreshed, additionalParams, null), 3);
    }

    protected final Unit k0() {
        this.f89554K.setValue(null);
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object o(Map<String, String> map, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        String value;
        Object obj;
        c cVar;
        ru.ozon.android.messenger.framework.presentation.ai.delegates.a aVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f89559h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f89559h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = aVar.f89557f;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f89559h;
                if (i11 != 0) {
                    s.b(obj2);
                    if (map != null && (value = map.get("aiAssistantChatStateKey")) != null) {
                        a.EnumC1654a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(value, "value");
                        Iterator<E> it = a.EnumC1654a.a().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (Intrinsics.d(((a.EnumC1654a) obj).b(), value)) {
                                break;
                            }
                        }
                        a.EnumC1654a enumC1654a = (a.EnumC1654a) obj;
                        if (enumC1654a == null) {
                            return Unit.f71690a;
                        }
                        ru.ozon.android.messenger.framework.presentation.ai.delegates.a aVar4 = new ru.ozon.android.messenger.framework.presentation.ai.delegates.a(enumC1654a);
                        a.EnumC1632a enumC1632a = a.EnumC1632a.CHAT_ACTIVE;
                        aVar.f89555d = this;
                        aVar.f89556e = aVar4;
                        aVar.f89559h = 1;
                        if (this.f89549F.a(enumC1632a, map, aVar) == aVar3) {
                            return aVar3;
                        }
                        cVar = this;
                        aVar2 = aVar4;
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = aVar.f89556e;
                cVar = aVar.f89555d;
                s.b(obj2);
                cVar.f89554K.setValue(aVar2);
                return Unit.f71690a;
            }
        }
        aVar = new a((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj22 = aVar.f89557f;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f89559h;
        if (i11 != 0) {
        }
        cVar.f89554K.setValue(aVar2);
        return Unit.f71690a;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d
    @NotNull
    protected final List p() {
        return this.f89546C.e(this.f89547D.E().getValue(), ru.ozon.android.messenger.blocks.emptystate.j.CHAT_DETAILS, null);
    }
}
