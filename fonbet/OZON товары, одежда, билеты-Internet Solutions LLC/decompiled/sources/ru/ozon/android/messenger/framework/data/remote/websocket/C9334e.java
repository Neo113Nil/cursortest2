package ru.ozon.android.messenger.framework.data.remote.websocket;

import Ae.C0;
import Ae.C2399j;
import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Lm0.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.RpcResponseDTO;
import ru.ozon.android.messenger.framework.data.remote.models.WebSocketMessageDTO;
import ru.ozon.android.messenger.framework.data.remote.models.WebSocketRequestDTO;
import ru.ozon.android.messenger.framework.data.requests.ChatEnterResponseDTO;
import ru.ozon.android.messenger.utils.i;
import xe.C10727i;
import xe.f1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$sendRequest$4", f = "MessengerWebSocketDataSource.kt", l = {229}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9334e extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ChatEnterResponseDTO>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f88014d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f88015e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9331b f88016f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ WebSocketRequestDTO f88017g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$sendRequest$4$1", f = "MessengerWebSocketDataSource.kt", l = {234, 235}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.e$a */
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ChatEnterResponseDTO>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f88018d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f88019e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f88020f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C9331b f88021g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ WebSocketRequestDTO f88022h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$sendRequest$4$1$response$1", f = "MessengerWebSocketDataSource.kt", l = {281}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.e$a$a, reason: collision with other inner class name */
        public static final class C1592a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ChatEnterResponseDTO>>, Object> {

            /* renamed from: d, reason: collision with root package name */
            C9331b f88023d;

            /* renamed from: e, reason: collision with root package name */
            int f88024e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C9331b f88025f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ WebSocketRequestDTO f88026g;

            /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.e$a$a$a, reason: collision with other inner class name */
            public static final class C1593a implements InterfaceC2395h<RpcResponseDTO> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C0 f88027a;

                /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.e$a$a$a$a, reason: collision with other inner class name */
                public static final class C1594a<T> implements InterfaceC2397i {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC2397i f88028a;

                    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$chatEnter$$inlined$sendRequest$1$1$1$1$2", f = "MessengerWebSocketDataSource.kt", l = {223}, m = "emit")
                    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.e$a$a$a$a$a, reason: collision with other inner class name */
                    public static final class C1595a extends kotlin.coroutines.jvm.internal.c {

                        /* renamed from: d, reason: collision with root package name */
                        /* synthetic */ Object f88029d;

                        /* renamed from: e, reason: collision with root package name */
                        int f88030e;

                        public C1595a(kotlin.coroutines.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.f88029d = obj;
                            this.f88030e |= LinearLayoutManager.INVALID_OFFSET;
                            return C1594a.this.emit(null, this);
                        }
                    }

                    public C1594a(InterfaceC2397i interfaceC2397i) {
                        this.f88028a = interfaceC2397i;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                        C1595a c1595a;
                        int i11;
                        if (dVar instanceof C1595a) {
                            c1595a = (C1595a) dVar;
                            int i12 = c1595a.f88030e;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                c1595a.f88030e = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = c1595a.f88029d;
                                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                i11 = c1595a.f88030e;
                                if (i11 != 0) {
                                    Sc.s.b(obj2);
                                    RpcResponseDTO response = ((WebSocketMessageDTO) obj).getPayload().getResponse();
                                    c1595a.f88030e = 1;
                                    if (this.f88028a.emit(response, c1595a) == aVar) {
                                        return aVar;
                                    }
                                } else {
                                    if (i11 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    Sc.s.b(obj2);
                                }
                                return Unit.f71690a;
                            }
                        }
                        c1595a = new C1595a(dVar);
                        Object obj22 = c1595a.f88029d;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1595a.f88030e;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                public C1593a(C0 c02) {
                    this.f88027a = c02;
                }

                @Override // Ae.InterfaceC2395h
                public final Object collect(@NotNull InterfaceC2397i<? super RpcResponseDTO> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
                    Object collect = this.f88027a.collect(new C1594a(interfaceC2397i), dVar);
                    return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            }

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$captureResponse$3", f = "MessengerWebSocketDataSource.kt", l = {}, m = "invokeSuspend")
            /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.e$a$a$b */
            public static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<RpcResponseDTO, kotlin.coroutines.d<? super Boolean>, Object> {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f88032d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f88033e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String str, kotlin.coroutines.d dVar) {
                    super(2, dVar);
                    this.f88033e = str;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    b bVar = new b(this.f88033e, dVar);
                    bVar.f88032d = obj;
                    return bVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RpcResponseDTO rpcResponseDTO, kotlin.coroutines.d<? super Boolean> dVar) {
                    return ((b) create(rpcResponseDTO, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    Sc.s.b(obj);
                    return Boolean.valueOf(Intrinsics.d(((RpcResponseDTO) this.f88032d).getId(), this.f88033e));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1592a(C9331b c9331b, WebSocketRequestDTO webSocketRequestDTO, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f88025f = c9331b;
                this.f88026g = webSocketRequestDTO;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1592a(this.f88025f, this.f88026g, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ChatEnterResponseDTO>> dVar) {
                return ((C1592a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C0 c02;
                C9331b c9331b;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f88024e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    String id2 = this.f88026g.getRequest().getId();
                    C9331b c9331b2 = this.f88025f;
                    c02 = c9331b2.f87998k;
                    C2406m0 c2406m0 = new C2406m0(new C1593a(c02));
                    b bVar = new b(id2, null);
                    this.f88023d = c9331b2;
                    this.f88024e = 1;
                    obj = C2399j.v(c2406m0, bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c9331b = c9331b2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9331b = this.f88023d;
                    Sc.s.b(obj);
                }
                return c9331b.f87990c.a((RpcResponseDTO) obj, ChatEnterResponseDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, C9331b c9331b, WebSocketRequestDTO webSocketRequestDTO, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f88020f = str;
            this.f88021g = c9331b;
            this.f88022h = webSocketRequestDTO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f88020f, this.f88021g, this.f88022h, dVar);
            aVar.f88019e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ChatEnterResponseDTO>> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
        
            if (xe.Y.b(50, r10) == r0) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            xe.U a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f88018d;
            if (i11 == 0) {
                Sc.s.b(obj);
                xe.M m11 = (xe.M) this.f88019e;
                WebSocketRequestDTO webSocketRequestDTO = this.f88022h;
                C9331b c9331b = this.f88021g;
                a11 = C10727i.a(m11, null, null, new C1592a(c9331b, webSocketRequestDTO, null), 3);
                a.b bVar = Lm0.a.f17149a;
                StringBuilder sb2 = new StringBuilder("sendRequest: ");
                String str = this.f88020f;
                sb2.append(str);
                bVar.d(sb2.toString(), new Object[0]);
                We.Q b11 = C9331b.b(c9331b);
                if (Intrinsics.d(b11 != null ? Boolean.valueOf(b11.b(str)) : null, Boolean.FALSE)) {
                    return new i.a.h(0);
                }
                if (ru.ozon.android.messenger.framework.data.q.b() == ru.ozon.android.messenger.framework.data.p.LOCAL_MOCKS) {
                    this.f88019e = a11;
                    this.f88018d = 1;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return obj;
                }
                a11 = (xe.U) this.f88019e;
                Sc.s.b(obj);
            }
            this.f88019e = null;
            this.f88018d = 2;
            Object s11 = a11.s(this);
            return s11 == aVar ? aVar : s11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9334e(String str, C9331b c9331b, WebSocketRequestDTO webSocketRequestDTO, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f88015e = str;
        this.f88016f = c9331b;
        this.f88017g = webSocketRequestDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9334e(this.f88015e, this.f88016f, this.f88017g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends ChatEnterResponseDTO>> dVar) {
        return ((C9334e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f88014d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f88015e, this.f88016f, this.f88017g, null);
            this.f88014d = 1;
            obj = f1.c(100000L, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
        return iVar == null ? i.a.C1725i.f91957c : iVar;
    }
}
