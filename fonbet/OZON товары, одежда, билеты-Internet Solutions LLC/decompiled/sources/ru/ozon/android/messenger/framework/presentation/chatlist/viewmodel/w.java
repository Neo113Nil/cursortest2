package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.presentation.models.A;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$collectSocketEvents$1", f = "ChatListViewModel.kt", l = {304, 309}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class w extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90734d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9509v f90735e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C9509v f90736a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$collectSocketEvents$1$1", f = "ChatListViewModel.kt", l = {312, 313, 318, 319}, m = "emit")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.w$a$a, reason: collision with other inner class name */
        static final class C1683a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            Object f90737d;

            /* renamed from: e, reason: collision with root package name */
            ru.ozon.android.messenger.framework.presentation.models.A f90738e;

            /* renamed from: f, reason: collision with root package name */
            Map f90739f;

            /* renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f90740g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ a<T> f90741h;

            /* renamed from: i, reason: collision with root package name */
            int f90742i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1683a(a<? super T> aVar, kotlin.coroutines.d<? super C1683a> dVar) {
                super(dVar);
                this.f90741h = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f90740g = obj;
                this.f90742i |= LinearLayoutManager.INVALID_OFFSET;
                return this.f90741h.emit(null, this);
            }
        }

        a(C9509v c9509v) {
            this.f90736a = c9509v;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // Ae.InterfaceC2397i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(ru.ozon.android.messenger.framework.presentation.models.A a11, kotlin.coroutines.d<? super Unit> dVar) {
            C1683a c1683a;
            int i11;
            ru.ozon.android.messenger.framework.domain.repository.b bVar;
            a<T> aVar;
            ru.ozon.android.messenger.framework.domain.repository.b bVar2;
            a<T> aVar2;
            ru.ozon.android.messenger.blocks.input.viewmodel.e eVar;
            Object a12;
            ru.ozon.android.messenger.framework.presentation.models.A a13;
            Map map;
            a<T> aVar3;
            ru.ozon.android.messenger.blocks.input.viewmodel.e eVar2;
            Object a14;
            ru.ozon.android.messenger.framework.presentation.models.A a15;
            Map map2;
            a<T> aVar4;
            if (dVar instanceof C1683a) {
                c1683a = (C1683a) dVar;
                int i12 = c1683a.f90742i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1683a.f90742i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c1683a.f90740g;
                    Wc.a aVar5 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1683a.f90742i;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        boolean z11 = a11 instanceof A.a;
                        C9509v c9509v = this.f90736a;
                        if (z11) {
                            bVar2 = c9509v.f90696d;
                            c1683a.f90737d = this;
                            c1683a.f90738e = a11;
                            c1683a.f90742i = 1;
                            obj = bVar2.b(c1683a);
                            if (obj != aVar5) {
                                aVar2 = this;
                                Map map3 = (Map) obj;
                                eVar = aVar2.f90736a.f90697e;
                                String d11 = ru.ozon.android.messenger.framework.presentation.models.r.d(((A.a) a11).b());
                                c1683a.f90737d = aVar2;
                                c1683a.f90738e = a11;
                                c1683a.f90739f = map3;
                                c1683a.f90742i = 2;
                                a12 = eVar.a(d11, c1683a);
                                if (a12 != aVar5) {
                                }
                            }
                        } else if (a11 instanceof A.g) {
                            bVar = c9509v.f90696d;
                            c1683a.f90737d = this;
                            c1683a.f90738e = a11;
                            c1683a.f90742i = 3;
                            obj = bVar.b(c1683a);
                            if (obj != aVar5) {
                                aVar = this;
                                Map map4 = (Map) obj;
                                eVar2 = aVar.f90736a.f90697e;
                                String d12 = ru.ozon.android.messenger.framework.presentation.models.r.d(((A.g) a11).a());
                                c1683a.f90737d = aVar;
                                c1683a.f90738e = a11;
                                c1683a.f90739f = map4;
                                c1683a.f90742i = 4;
                                a14 = eVar2.a(d12, c1683a);
                                if (a14 != aVar5) {
                                }
                            }
                        } else if (a11 instanceof A.e) {
                            c9509v.I0(((A.e) a11).a());
                        } else if (a11 instanceof A.f) {
                            C9509v.C0(c9509v);
                        }
                        return aVar5;
                    }
                    if (i11 == 1) {
                        a11 = c1683a.f90738e;
                        aVar2 = (a) c1683a.f90737d;
                        Sc.s.b(obj);
                        Map map32 = (Map) obj;
                        eVar = aVar2.f90736a.f90697e;
                        String d112 = ru.ozon.android.messenger.framework.presentation.models.r.d(((A.a) a11).b());
                        c1683a.f90737d = aVar2;
                        c1683a.f90738e = a11;
                        c1683a.f90739f = map32;
                        c1683a.f90742i = 2;
                        a12 = eVar.a(d112, c1683a);
                        if (a12 != aVar5) {
                            a13 = a11;
                            map = map32;
                            obj = a12;
                            aVar3 = aVar2;
                            A.a aVar6 = (A.a) a13;
                            aVar3.f90736a.F0(aVar6.b(), aVar6.c(), aVar6.a(), (ru.ozon.android.messenger.framework.presentation.models.q) map.get(ru.ozon.android.messenger.framework.presentation.models.r.d(aVar6.b())), (ru.ozon.android.messenger.blocks.input.b) obj);
                        }
                        return aVar5;
                    }
                    if (i11 == 2) {
                        map = c1683a.f90739f;
                        a13 = c1683a.f90738e;
                        aVar3 = (a) c1683a.f90737d;
                        Sc.s.b(obj);
                        A.a aVar62 = (A.a) a13;
                        aVar3.f90736a.F0(aVar62.b(), aVar62.c(), aVar62.a(), (ru.ozon.android.messenger.framework.presentation.models.q) map.get(ru.ozon.android.messenger.framework.presentation.models.r.d(aVar62.b())), (ru.ozon.android.messenger.blocks.input.b) obj);
                    } else {
                        if (i11 == 3) {
                            a11 = c1683a.f90738e;
                            aVar = (a) c1683a.f90737d;
                            Sc.s.b(obj);
                            Map map42 = (Map) obj;
                            eVar2 = aVar.f90736a.f90697e;
                            String d122 = ru.ozon.android.messenger.framework.presentation.models.r.d(((A.g) a11).a());
                            c1683a.f90737d = aVar;
                            c1683a.f90738e = a11;
                            c1683a.f90739f = map42;
                            c1683a.f90742i = 4;
                            a14 = eVar2.a(d122, c1683a);
                            if (a14 != aVar5) {
                                a15 = a11;
                                map2 = map42;
                                obj = a14;
                                aVar4 = aVar;
                                A.g gVar = (A.g) a15;
                                aVar4.f90736a.J0(gVar.a(), (ru.ozon.android.messenger.framework.presentation.models.q) map2.get(ru.ozon.android.messenger.framework.presentation.models.r.d(gVar.a())), (ru.ozon.android.messenger.blocks.input.b) obj);
                            }
                            return aVar5;
                        }
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        map2 = c1683a.f90739f;
                        a15 = c1683a.f90738e;
                        aVar4 = (a) c1683a.f90737d;
                        Sc.s.b(obj);
                        A.g gVar2 = (A.g) a15;
                        aVar4.f90736a.J0(gVar2.a(), (ru.ozon.android.messenger.framework.presentation.models.q) map2.get(ru.ozon.android.messenger.framework.presentation.models.r.d(gVar2.a())), (ru.ozon.android.messenger.blocks.input.b) obj);
                    }
                    return Unit.f71690a;
                }
            }
            c1683a = new C1683a(this, dVar);
            Object obj2 = c1683a.f90740g;
            Wc.a aVar52 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1683a.f90742i;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(C9509v c9509v, kotlin.coroutines.d<? super w> dVar) {
        super(2, dVar);
        this.f90735e = c9509v;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new w(this.f90735e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((w) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (((Ae.InterfaceC2395h) r8).collect(r1, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.usecases.r rVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90734d;
        C9509v c9509v = this.f90735e;
        if (i11 == 0) {
            Sc.s.b(obj);
            rVar = c9509v.f90698f;
            ru.ozon.android.messenger.framework.presentation.models.x[] xVarArr = {ru.ozon.android.messenger.framework.presentation.models.x.CHATS, ru.ozon.android.messenger.framework.presentation.models.x.GROUP, ru.ozon.android.messenger.framework.presentation.models.x.CURTAIN};
            String b11 = ru.ozon.android.messenger.framework.presentation.chatlist.i.b(C9509v.q0(c9509v));
            this.f90734d = 1;
            obj = rVar.a(xVarArr, b11, this);
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
        a aVar2 = new a(c9509v);
        this.f90734d = 2;
    }
}
