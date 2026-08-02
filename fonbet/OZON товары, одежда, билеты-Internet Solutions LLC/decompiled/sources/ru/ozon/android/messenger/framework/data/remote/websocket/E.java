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
import ru.ozon.android.messenger.framework.data.requests.UpdateMessageResponseDTO;
import ru.ozon.android.messenger.utils.i;
import xe.C10727i;
import xe.f1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$sendRequest$4", f = "MessengerWebSocketDataSource.kt", l = {229}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class E extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends UpdateMessageResponseDTO>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f87872d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f87873e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9331b f87874f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ WebSocketRequestDTO f87875g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$sendRequest$4$1", f = "MessengerWebSocketDataSource.kt", l = {234, 235}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends UpdateMessageResponseDTO>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f87876d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f87877e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f87878f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C9331b f87879g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ WebSocketRequestDTO f87880h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$sendRequest$4$1$response$1", f = "MessengerWebSocketDataSource.kt", l = {281}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.E$a$a, reason: collision with other inner class name */
        public static final class C1582a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends UpdateMessageResponseDTO>>, Object> {

            /* renamed from: d, reason: collision with root package name */
            C9331b f87881d;

            /* renamed from: e, reason: collision with root package name */
            int f87882e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C9331b f87883f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ WebSocketRequestDTO f87884g;

            /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.E$a$a$a, reason: collision with other inner class name */
            public static final class C1583a implements InterfaceC2395h<RpcResponseDTO> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C0 f87885a;

                /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.E$a$a$a$a, reason: collision with other inner class name */
                public static final class C1584a<T> implements InterfaceC2397i {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC2397i f87886a;

                    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$updateMessage$$inlined$sendRequest$1$1$1$1$2", f = "MessengerWebSocketDataSource.kt", l = {223}, m = "emit")
                    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.E$a$a$a$a$a, reason: collision with other inner class name */
                    public static final class C1585a extends kotlin.coroutines.jvm.internal.c {

                        /* renamed from: d, reason: collision with root package name */
                        /* synthetic */ Object f87887d;

                        /* renamed from: e, reason: collision with root package name */
                        int f87888e;

                        public C1585a(kotlin.coroutines.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.f87887d = obj;
                            this.f87888e |= LinearLayoutManager.INVALID_OFFSET;
                            return C1584a.this.emit(null, this);
                        }
                    }

                    public C1584a(InterfaceC2397i interfaceC2397i) {
                        this.f87886a = interfaceC2397i;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                        C1585a c1585a;
                        int i11;
                        if (dVar instanceof C1585a) {
                            c1585a = (C1585a) dVar;
                            int i12 = c1585a.f87888e;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                c1585a.f87888e = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = c1585a.f87887d;
                                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                                i11 = c1585a.f87888e;
                                if (i11 != 0) {
                                    Sc.s.b(obj2);
                                    RpcResponseDTO response = ((WebSocketMessageDTO) obj).getPayload().getResponse();
                                    c1585a.f87888e = 1;
                                    if (this.f87886a.emit(response, c1585a) == aVar) {
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
                        c1585a = new C1585a(dVar);
                        Object obj22 = c1585a.f87887d;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1585a.f87888e;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                public C1583a(C0 c02) {
                    this.f87885a = c02;
                }

                @Override // Ae.InterfaceC2395h
                public final Object collect(@NotNull InterfaceC2397i<? super RpcResponseDTO> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
                    Object collect = this.f87885a.collect(new C1584a(interfaceC2397i), dVar);
                    return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            }

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource$captureResponse$3", f = "MessengerWebSocketDataSource.kt", l = {}, m = "invokeSuspend")
            /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.E$a$a$b */
            public static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<RpcResponseDTO, kotlin.coroutines.d<? super Boolean>, Object> {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f87890d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f87891e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String str, kotlin.coroutines.d dVar) {
                    super(2, dVar);
                    this.f87891e = str;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    b bVar = new b(this.f87891e, dVar);
                    bVar.f87890d = obj;
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
                    return Boolean.valueOf(Intrinsics.d(((RpcResponseDTO) this.f87890d).getId(), this.f87891e));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1582a(C9331b c9331b, WebSocketRequestDTO webSocketRequestDTO, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f87883f = c9331b;
                this.f87884g = webSocketRequestDTO;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1582a(this.f87883f, this.f87884g, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends UpdateMessageResponseDTO>> dVar) {
                return ((C1582a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C0 c02;
                C9331b c9331b;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f87882e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    String id2 = this.f87884g.getRequest().getId();
                    C9331b c9331b2 = this.f87883f;
                    c02 = c9331b2.f87998k;
                    C2406m0 c2406m0 = new C2406m0(new C1583a(c02));
                    b bVar = new b(id2, null);
                    this.f87881d = c9331b2;
                    this.f87882e = 1;
                    obj = C2399j.v(c2406m0, bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c9331b = c9331b2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9331b = this.f87881d;
                    Sc.s.b(obj);
                }
                return c9331b.f87990c.a((RpcResponseDTO) obj, UpdateMessageResponseDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, C9331b c9331b, WebSocketRequestDTO webSocketRequestDTO, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f87878f = str;
            this.f87879g = c9331b;
            this.f87880h = webSocketRequestDTO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f87878f, this.f87879g, this.f87880h, dVar);
            aVar.f87877e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends UpdateMessageResponseDTO>> dVar) {
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
            int i11 = this.f87876d;
            if (i11 == 0) {
                Sc.s.b(obj);
                xe.M m11 = (xe.M) this.f87877e;
                WebSocketRequestDTO webSocketRequestDTO = this.f87880h;
                C9331b c9331b = this.f87879g;
                a11 = C10727i.a(m11, null, null, new C1582a(c9331b, webSocketRequestDTO, null), 3);
                a.b bVar = Lm0.a.f17149a;
                StringBuilder sb2 = new StringBuilder("sendRequest: ");
                String str = this.f87878f;
                sb2.append(str);
                bVar.d(sb2.toString(), new Object[0]);
                We.Q b11 = C9331b.b(c9331b);
                if (Intrinsics.d(b11 != null ? Boolean.valueOf(b11.b(str)) : null, Boolean.FALSE)) {
                    return new i.a.h(0);
                }
                if (ru.ozon.android.messenger.framework.data.q.b() == ru.ozon.android.messenger.framework.data.p.LOCAL_MOCKS) {
                    this.f87877e = a11;
                    this.f87876d = 1;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return obj;
                }
                a11 = (xe.U) this.f87877e;
                Sc.s.b(obj);
            }
            this.f87877e = null;
            this.f87876d = 2;
            Object s11 = a11.s(this);
            return s11 == aVar ? aVar : s11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(String str, C9331b c9331b, WebSocketRequestDTO webSocketRequestDTO, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f87873e = str;
        this.f87874f = c9331b;
        this.f87875g = webSocketRequestDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new E(this.f87873e, this.f87874f, this.f87875g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super ru.ozon.android.messenger.utils.i<? extends UpdateMessageResponseDTO>> dVar) {
        return ((E) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f87872d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f87873e, this.f87874f, this.f87875g, null);
            this.f87872d = 1;
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
