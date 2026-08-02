package ru.ozon.android.messenger.framework.data.remote.websocket;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.I0;
import Ae.M0;
import Ae.O0;
import Ae.W;
import Ae.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import qj.C9070d;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.data.remote.models.RpcRequestDTO;
import ru.ozon.android.messenger.framework.data.remote.models.WebSocketMessageDTO;
import ru.ozon.android.messenger.framework.data.remote.models.WebSocketRequestDTO;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.data.remote.websocket.L;
import ru.ozon.android.messenger.framework.data.requests.ChatEnterResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.GetChatsRequest;
import ru.ozon.android.messenger.framework.data.requests.InitializeChatResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.SearchResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.SendMessageRequest;
import ru.ozon.android.messenger.framework.data.requests.StartOrGetChatResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.e;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import xe.C10727i;
import xe.f1;

/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9331b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.mapper.g f87988a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.serialize.b f87989b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.parser.e f87990c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final xe.M f87991d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9067a f87992e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final xe.I f87993f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final U f87994g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final d.f f87995h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final M0<NetworkInfo> f87996i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final x0<AbstractC9330a> f87997j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C0 f87998k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f87999l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Function1<L, Unit> f88000m;

    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88001a;

        static {
            int[] iArr = new int[ru.ozon.android.messenger.framework.data.p.values().length];
            try {
                iArr[ru.ozon.android.messenger.framework.data.p.ORIGINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.data.p.LOCAL_MOCKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.data.p.HTTP_PROXY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f88001a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {179}, m = "closeSocket")
    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.b$b, reason: collision with other inner class name */
    static final class C1591b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        C9331b f88002d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f88003e;

        /* renamed from: g, reason: collision with root package name */
        int f88005g;

        C1591b(kotlin.coroutines.d<? super C1591b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f88003e = obj;
            this.f88005g |= LinearLayoutManager.INVALID_OFFSET;
            return C9331b.this.k(this);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.b$c */
    static final class c extends AbstractC7737t implements Function1<String, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String msg = str;
            Intrinsics.checkNotNullParameter(msg, "msg");
            C9331b c9331b = C9331b.this;
            WebSocketMessageDTO b11 = c9331b.f87990c.b(msg);
            if (b11 != null) {
                C10727i.c(c9331b.f87991d, c9331b.f87993f, null, new B(c9331b, b11, null), 2);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.b$d */
    static final class d extends AbstractC7737t implements Function1<L, Unit> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(L l11) {
            AbstractC9330a abstractC9330a;
            L techEvent = l11;
            Intrinsics.checkNotNullParameter(techEvent, "techEvent");
            x0 x0Var = C9331b.this.f87997j;
            if (Intrinsics.d(techEvent, L.a.f87933a)) {
                abstractC9330a = AbstractC9330a.c.f87984a;
            } else if (techEvent instanceof L.c) {
                abstractC9330a = new AbstractC9330a.e(((L.c) techEvent).a());
            } else if (Intrinsics.d(techEvent, L.d.f87936a)) {
                abstractC9330a = AbstractC9330a.C1590a.f87982a;
            } else {
                if (!Intrinsics.d(techEvent, L.b.f87934a)) {
                    throw new Sc.o();
                }
                abstractC9330a = AbstractC9330a.d.f87985a;
            }
            x0Var.setValue(abstractC9330a);
            return Unit.f71690a;
        }
    }

    public C9331b(@NotNull ru.ozon.android.messenger.framework.data.remote.mapper.g responseMapper, @NotNull ru.ozon.android.messenger.framework.data.remote.serialize.b jsonSerializer, @NotNull ru.ozon.android.messenger.framework.data.remote.parser.e messengerParser, @NotNull xe.M externalScope, @NotNull C9067a networkInfoProvider, @NotNull xe.I ioDispatcher, @NotNull U webSocketResolver, @NotNull d.f networkConfig) {
        NetworkInfo h11;
        Intrinsics.checkNotNullParameter(responseMapper, "responseMapper");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(messengerParser, "messengerParser");
        Intrinsics.checkNotNullParameter(externalScope, "externalScope");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(webSocketResolver, "webSocketResolver");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        this.f87988a = responseMapper;
        this.f87989b = jsonSerializer;
        this.f87990c = messengerParser;
        this.f87991d = externalScope;
        this.f87992e = networkInfoProvider;
        this.f87993f = ioDispatcher;
        this.f87994g = webSocketResolver;
        this.f87995h = networkConfig;
        M0<NetworkInfo> j11 = networkInfoProvider.j();
        int i11 = I0.f818a;
        I0 c11 = I0.a.c();
        h11 = networkInfoProvider.h(C9070d.f82206b);
        this.f87996i = C2399j.M(j11, externalScope, c11, h11);
        this.f87997j = O0.a(AbstractC9330a.f.f87987a);
        this.f87998k = E0.b(0, 0, null, 7);
        this.f87999l = new c();
        this.f88000m = new d();
    }

    public static final We.Q b(C9331b c9331b) {
        return c9331b.f87994g.g();
    }

    private final WebSocketRequestDTO h(ru.ozon.android.messenger.framework.data.requests.e eVar) {
        String str;
        eVar.getClass();
        if ((eVar instanceof ru.ozon.android.messenger.framework.data.requests.h) || (eVar instanceof ru.ozon.android.messenger.framework.data.requests.ai.a)) {
            Intrinsics.checkNotNullParameter(kotlin.jvm.internal.T.f71792a, "<this>");
            str = "";
        } else {
            str = this.f87995h.c();
        }
        String id2 = ru.ozon.android.messenger.utils.n.a();
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new WebSocketRequestDTO(str, new RpcRequestDTO(id2, eVar.a().a(), eVar.b(), null, 8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(kotlin.coroutines.jvm.internal.c cVar) {
        C9332c c9332c;
        int i11;
        if (cVar instanceof C9332c) {
            c9332c = (C9332c) cVar;
            int i12 = c9332c.f88010f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9332c.f88010f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9332c.f88008d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9332c.f88010f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C9333d c9333d = new C9333d(this, null);
                    c9332c.f88010f = 1;
                    obj = f1.c(5000L, c9333d, c9332c);
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
                return iVar != null ? i.a.C1725i.f91957c : iVar;
            }
        }
        c9332c = new C9332c(this, cVar);
        Object obj2 = c9332c.f88008d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9332c.f88010f;
        if (i11 != 0) {
        }
        ru.ozon.android.messenger.utils.i iVar2 = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(@NotNull ru.ozon.android.messenger.framework.data.requests.i iVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        D d11;
        int i11;
        ru.ozon.android.messenger.framework.data.requests.i iVar2;
        Object obj;
        C9331b c9331b;
        C9331b c9331b2;
        ru.ozon.android.messenger.utils.i iVar3;
        Object eVar;
        ru.ozon.android.messenger.utils.i iVar4;
        if (cVar instanceof D) {
            d11 = (D) cVar;
            int i12 = d11.f87871i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                d11.f87871i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = d11.f87869g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = d11.f87871i;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    boolean z11 = iVar.c() != e.a.NO_RECONNECT_NO_RETRY;
                    d11.f87866d = this;
                    d11.f87867e = iVar;
                    d11.f87868f = this;
                    d11.f87871i = 1;
                    Object m11 = m(z11, d11);
                    if (m11 != aVar) {
                        iVar2 = iVar;
                        obj = m11;
                        c9331b = this;
                        c9331b2 = c9331b;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9331b = d11.f87866d;
                    Sc.s.b(obj2);
                    eVar = obj2;
                    iVar4 = (ru.ozon.android.messenger.utils.i) eVar;
                    ru.ozon.android.messenger.framework.data.remote.mapper.g gVar = c9331b.f87988a;
                    if (iVar4 instanceof i.b) {
                        return new i.b(gVar.h((StartOrGetChatResponseDTO) ((i.b) iVar4).b()));
                    }
                    if (iVar4 instanceof i.a) {
                        return iVar4;
                    }
                    throw new Sc.o();
                }
                C9331b c9331b3 = d11.f87868f;
                iVar2 = d11.f87867e;
                C9331b c9331b4 = d11.f87866d;
                Sc.s.b(obj2);
                c9331b2 = c9331b3;
                c9331b = c9331b4;
                obj = obj2;
                iVar3 = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar3 instanceof i.a)) {
                    eVar = (i.a) iVar3;
                } else if ((iVar3 instanceof i.b) && ((Boolean) ((i.b) iVar3).b()).booleanValue() && iVar2.c() == e.a.RECONNECT_WITHOUT_RETRY) {
                    eVar = new i.a.e("No retry after reconnect");
                } else {
                    WebSocketRequestDTO h11 = c9331b2.h(iVar2);
                    C c11 = new C(c9331b2.f87989b.a(h11), c9331b2, h11, null);
                    d11.f87866d = c9331b;
                    d11.f87867e = null;
                    d11.f87868f = null;
                    d11.f87871i = 2;
                    obj2 = xe.N.d(c11, d11);
                }
                iVar4 = (ru.ozon.android.messenger.utils.i) eVar;
                ru.ozon.android.messenger.framework.data.remote.mapper.g gVar2 = c9331b.f87988a;
                if (iVar4 instanceof i.b) {
                }
            }
        }
        d11 = new D(this, cVar);
        Object obj22 = d11.f87869g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = d11.f87871i;
        if (i11 != 0) {
        }
        iVar3 = (ru.ozon.android.messenger.utils.i) obj;
        if (!(iVar3 instanceof i.a)) {
        }
        iVar4 = (ru.ozon.android.messenger.utils.i) eVar;
        ru.ozon.android.messenger.framework.data.remote.mapper.g gVar22 = c9331b.f87988a;
        if (iVar4 instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(@NotNull ru.ozon.android.messenger.framework.data.requests.j jVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        F f7;
        int i11;
        Object obj;
        C9331b c9331b;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof F) {
            f7 = (F) cVar;
            int i12 = f7.f87896h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                f7.f87896h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = f7.f87894f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = f7.f87896h;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    boolean z11 = jVar.c() != e.a.NO_RECONNECT_NO_RETRY;
                    f7.f87892d = jVar;
                    f7.f87893e = this;
                    f7.f87896h = 1;
                    Object m11 = m(z11, f7);
                    if (m11 != aVar) {
                        obj = m11;
                        c9331b = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                    return obj2;
                }
                C9331b c9331b2 = f7.f87893e;
                ru.ozon.android.messenger.framework.data.requests.j jVar2 = f7.f87892d;
                Sc.s.b(obj2);
                c9331b = c9331b2;
                jVar = jVar2;
                obj = obj2;
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.a)) {
                    return (i.a) iVar;
                }
                if ((iVar instanceof i.b) && ((Boolean) ((i.b) iVar).b()).booleanValue() && jVar.c() == e.a.RECONNECT_WITHOUT_RETRY) {
                    return new i.a.e("No retry after reconnect");
                }
                WebSocketRequestDTO h11 = c9331b.h(jVar);
                E e11 = new E(c9331b.f87989b.a(h11), c9331b, h11, null);
                f7.f87892d = null;
                f7.f87893e = null;
                f7.f87896h = 2;
                Object d11 = xe.N.d(e11, f7);
                return d11 == aVar ? aVar : d11;
            }
        }
        f7 = new F(this, cVar);
        Object obj22 = f7.f87894f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = f7.f87896h;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (!(iVar instanceof i.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(@NotNull ru.ozon.android.messenger.framework.data.requests.k kVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        H h11;
        int i11;
        Object obj;
        C9331b c9331b;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof H) {
            h11 = (H) cVar;
            int i12 = h11.f87921h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                h11.f87921h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = h11.f87919f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = h11.f87921h;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    boolean z11 = kVar.c() != e.a.NO_RECONNECT_NO_RETRY;
                    h11.f87917d = kVar;
                    h11.f87918e = this;
                    h11.f87921h = 1;
                    Object m11 = m(z11, h11);
                    if (m11 != aVar) {
                        obj = m11;
                        c9331b = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                    return obj2;
                }
                C9331b c9331b2 = h11.f87918e;
                ru.ozon.android.messenger.framework.data.requests.k kVar2 = h11.f87917d;
                Sc.s.b(obj2);
                c9331b = c9331b2;
                kVar = kVar2;
                obj = obj2;
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.a)) {
                    return (i.a) iVar;
                }
                if ((iVar instanceof i.b) && ((Boolean) ((i.b) iVar).b()).booleanValue() && kVar.c() == e.a.RECONNECT_WITHOUT_RETRY) {
                    return new i.a.e("No retry after reconnect");
                }
                WebSocketRequestDTO h12 = c9331b.h(kVar);
                G g10 = new G(c9331b.f87989b.a(h12), c9331b, h12, null);
                h11.f87917d = null;
                h11.f87918e = null;
                h11.f87921h = 2;
                Object d11 = xe.N.d(g10, h11);
                return d11 == aVar ? aVar : d11;
            }
        }
        h11 = new H(this, cVar);
        Object obj22 = h11.f87919f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = h11.f87921h;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (!(iVar instanceof i.a)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(@NotNull ru.ozon.android.messenger.framework.data.requests.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9335f c9335f;
        int i11;
        ru.ozon.android.messenger.framework.data.requests.a aVar2;
        Object obj;
        C9331b c9331b;
        C9331b c9331b2;
        ru.ozon.android.messenger.utils.i iVar;
        Object eVar;
        ru.ozon.android.messenger.utils.i iVar2;
        if (cVar instanceof C9335f) {
            c9335f = (C9335f) cVar;
            int i12 = c9335f.f88039i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9335f.f88039i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c9335f.f88037g;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9335f.f88039i;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    boolean z11 = aVar.c() != e.a.NO_RECONNECT_NO_RETRY;
                    c9335f.f88034d = this;
                    c9335f.f88035e = aVar;
                    c9335f.f88036f = this;
                    c9335f.f88039i = 1;
                    Object m11 = m(z11, c9335f);
                    if (m11 != aVar3) {
                        aVar2 = aVar;
                        obj = m11;
                        c9331b = this;
                        c9331b2 = c9331b;
                    }
                    return aVar3;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9331b = c9335f.f88034d;
                    Sc.s.b(obj2);
                    eVar = obj2;
                    iVar2 = (ru.ozon.android.messenger.utils.i) eVar;
                    ru.ozon.android.messenger.framework.data.remote.mapper.g gVar = c9331b.f87988a;
                    if (!(iVar2 instanceof i.b)) {
                        if (iVar2 instanceof i.a) {
                            return iVar2;
                        }
                        throw new Sc.o();
                    }
                    ChatEnterResponseDTO responseDTO = (ChatEnterResponseDTO) ((i.b) iVar2).b();
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(responseDTO, "responseDTO");
                    return new i.b(new ru.ozon.android.messenger.framework.presentation.models.responses.a(responseDTO.getTrackingInfo()));
                }
                C9331b c9331b3 = c9335f.f88036f;
                aVar2 = c9335f.f88035e;
                C9331b c9331b4 = c9335f.f88034d;
                Sc.s.b(obj2);
                c9331b2 = c9331b3;
                c9331b = c9331b4;
                obj = obj2;
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.a)) {
                    eVar = (i.a) iVar;
                } else if ((iVar instanceof i.b) && ((Boolean) ((i.b) iVar).b()).booleanValue() && aVar2.c() == e.a.RECONNECT_WITHOUT_RETRY) {
                    eVar = new i.a.e("No retry after reconnect");
                } else {
                    WebSocketRequestDTO h11 = c9331b2.h(aVar2);
                    C9334e c9334e = new C9334e(c9331b2.f87989b.a(h11), c9331b2, h11, null);
                    c9335f.f88034d = c9331b;
                    c9335f.f88035e = null;
                    c9335f.f88036f = null;
                    c9335f.f88039i = 2;
                    obj2 = xe.N.d(c9334e, c9335f);
                }
                iVar2 = (ru.ozon.android.messenger.utils.i) eVar;
                ru.ozon.android.messenger.framework.data.remote.mapper.g gVar2 = c9331b.f87988a;
                if (!(iVar2 instanceof i.b)) {
                }
            }
        }
        c9335f = new C9335f(this, cVar);
        Object obj22 = c9335f.f88037g;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9335f.f88039i;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (!(iVar instanceof i.a)) {
        }
        iVar2 = (ru.ozon.android.messenger.utils.i) eVar;
        ru.ozon.android.messenger.framework.data.remote.mapper.g gVar22 = c9331b.f87988a;
        if (!(iVar2 instanceof i.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        C1591b c1591b;
        int i11;
        C9331b c9331b;
        if (dVar instanceof C1591b) {
            c1591b = (C1591b) dVar;
            int i12 = c1591b.f88005g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c1591b.f88005g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c1591b.f88003e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1591b.f88005g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c1591b.f88002d = this;
                    c1591b.f88005g = 1;
                    if (this.f87994g.c(c1591b) == aVar) {
                        return aVar;
                    }
                    c9331b = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9331b = c1591b.f88002d;
                    Sc.s.b(obj);
                }
                c9331b.f87997j.setValue(AbstractC9330a.c.f87984a);
                return Unit.f71690a;
            }
        }
        c1591b = new C1591b(dVar);
        Object obj2 = c1591b.f88003e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c1591b.f88005g;
        if (i11 != 0) {
        }
        c9331b.f87997j.setValue(AbstractC9330a.c.f87984a);
        return Unit.f71690a;
    }

    @NotNull
    public final NetworkInfo l() {
        NetworkInfo h11;
        h11 = this.f87992e.h(C9070d.f82206b);
        return h11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:
    
        if (r7 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0083, code lost:
    
        if (r7 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(boolean z11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9336g c9336g;
        int i11;
        if (cVar instanceof C9336g) {
            c9336g = (C9336g) cVar;
            int i12 = c9336g.f88042f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9336g.f88042f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9336g.f88040d;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9336g.f88042f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AbstractC9330a value = this.f87997j.getValue();
                    if (value instanceof AbstractC9330a.C1590a) {
                        return new i.b(Boolean.FALSE);
                    }
                    if (value instanceof AbstractC9330a.b) {
                        c9336g.f88042f = 1;
                        obj = i(c9336g);
                    } else {
                        if (!z11) {
                            return new i.a.h(0);
                        }
                        c9336g.f88042f = 2;
                        obj = u(c9336g);
                    }
                    return obj2;
                }
                if (i11 == 1) {
                    Sc.s.b(obj);
                    ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
                    if (iVar instanceof i.b) {
                        return new i.b(Boolean.TRUE);
                    }
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                ru.ozon.android.messenger.utils.i iVar2 = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar2 instanceof i.b) {
                    return new i.b(Boolean.TRUE);
                }
                if (iVar2 instanceof i.a) {
                    return iVar2;
                }
                throw new Sc.o();
            }
        }
        c9336g = new C9336g(this, cVar);
        Object obj3 = c9336g.f88040d;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9336g.f88042f;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(@NotNull GetChatsRequest getChatsRequest, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9338i c9338i;
        int i11;
        Object obj;
        C9331b c9331b;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof C9338i) {
            c9338i = (C9338i) cVar;
            int i12 = c9338i.f88067h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9338i.f88067h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c9338i.f88065f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9338i.f88067h;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    boolean z11 = getChatsRequest.c() != e.a.NO_RECONNECT_NO_RETRY;
                    c9338i.f88063d = getChatsRequest;
                    c9338i.f88064e = this;
                    c9338i.f88067h = 1;
                    Object m11 = m(z11, c9338i);
                    if (m11 != aVar) {
                        obj = m11;
                        c9331b = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                    return obj2;
                }
                C9331b c9331b2 = c9338i.f88064e;
                GetChatsRequest getChatsRequest2 = c9338i.f88063d;
                Sc.s.b(obj2);
                c9331b = c9331b2;
                getChatsRequest = getChatsRequest2;
                obj = obj2;
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.a)) {
                    return (i.a) iVar;
                }
                if ((iVar instanceof i.b) && ((Boolean) ((i.b) iVar).b()).booleanValue() && getChatsRequest.c() == e.a.RECONNECT_WITHOUT_RETRY) {
                    return new i.a.e("No retry after reconnect");
                }
                WebSocketRequestDTO h11 = c9331b.h(getChatsRequest);
                C9337h c9337h = new C9337h(c9331b.f87989b.a(h11), c9331b, h11, null);
                c9338i.f88063d = null;
                c9338i.f88064e = null;
                c9338i.f88067h = 2;
                Object d11 = xe.N.d(c9337h, c9338i);
                return d11 == aVar ? aVar : d11;
            }
        }
        c9338i = new C9338i(this, cVar);
        Object obj22 = c9338i.f88065f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9338i.f88067h;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (!(iVar instanceof i.a)) {
        }
    }

    @NotNull
    public final M0<AbstractC9330a> o() {
        return this.f87997j;
    }

    @NotNull
    public final W p() {
        return C2399j.y(new C9339j(this.f87998k), new C9340k(2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(@NotNull ru.ozon.android.messenger.framework.data.requests.b bVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9342m c9342m;
        int i11;
        Object obj;
        C9331b c9331b;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof C9342m) {
            c9342m = (C9342m) cVar;
            int i12 = c9342m.f88098h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9342m.f88098h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c9342m.f88096f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9342m.f88098h;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    boolean z11 = bVar.c() != e.a.NO_RECONNECT_NO_RETRY;
                    c9342m.f88094d = bVar;
                    c9342m.f88095e = this;
                    c9342m.f88098h = 1;
                    Object m11 = m(z11, c9342m);
                    if (m11 != aVar) {
                        obj = m11;
                        c9331b = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                    return obj2;
                }
                C9331b c9331b2 = c9342m.f88095e;
                ru.ozon.android.messenger.framework.data.requests.b bVar2 = c9342m.f88094d;
                Sc.s.b(obj2);
                c9331b = c9331b2;
                bVar = bVar2;
                obj = obj2;
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.a)) {
                    return (i.a) iVar;
                }
                if ((iVar instanceof i.b) && ((Boolean) ((i.b) iVar).b()).booleanValue() && bVar.c() == e.a.RECONNECT_WITHOUT_RETRY) {
                    return new i.a.e("No retry after reconnect");
                }
                WebSocketRequestDTO h11 = c9331b.h(bVar);
                C9341l c9341l = new C9341l(c9331b.f87989b.a(h11), c9331b, h11, null);
                c9342m.f88094d = null;
                c9342m.f88095e = null;
                c9342m.f88098h = 2;
                Object d11 = xe.N.d(c9341l, c9342m);
                return d11 == aVar ? aVar : d11;
            }
        }
        c9342m = new C9342m(this, cVar);
        Object obj22 = c9342m.f88096f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9342m.f88098h;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (!(iVar instanceof i.a)) {
        }
    }

    @NotNull
    public final M0<NetworkInfo> r() {
        return this.f87996i;
    }

    public final Object s(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f87997j.setValue(AbstractC9330a.b.f87983a);
        int i11 = a.f88001a[ru.ozon.android.messenger.framework.data.q.b().ordinal()];
        Function1<L, Unit> function1 = this.f88000m;
        Function1<String, Unit> function12 = this.f87999l;
        U u11 = this.f87994g;
        if (i11 == 1) {
            Object f7 = u11.f(function12, function1, dVar);
            return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
        }
        if (i11 == 2) {
            u11.d(function12, function1);
        } else {
            if (i11 != 3) {
                throw new Sc.o();
            }
            u11.e(function12, function1);
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ab, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(@NotNull ru.ozon.android.messenger.framework.data.requests.c cVar, @NotNull kotlin.coroutines.jvm.internal.c cVar2) {
        C9344o c9344o;
        int i11;
        ru.ozon.android.messenger.framework.data.requests.c cVar3;
        Object obj;
        C9331b c9331b;
        C9331b c9331b2;
        ru.ozon.android.messenger.utils.i iVar;
        Object eVar;
        ru.ozon.android.messenger.utils.i iVar2;
        if (cVar2 instanceof C9344o) {
            c9344o = (C9344o) cVar2;
            int i12 = c9344o.f88124i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9344o.f88124i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c9344o.f88122g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9344o.f88124i;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    boolean z11 = cVar.c() != e.a.NO_RECONNECT_NO_RETRY;
                    c9344o.f88119d = this;
                    c9344o.f88120e = cVar;
                    c9344o.f88121f = this;
                    c9344o.f88124i = 1;
                    Object m11 = m(z11, c9344o);
                    if (m11 != aVar) {
                        cVar3 = cVar;
                        obj = m11;
                        c9331b = this;
                        c9331b2 = c9331b;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9331b = c9344o.f88119d;
                    Sc.s.b(obj2);
                    eVar = obj2;
                    iVar2 = (ru.ozon.android.messenger.utils.i) eVar;
                    ru.ozon.android.messenger.framework.data.remote.mapper.g gVar = c9331b.f87988a;
                    if (!(iVar2 instanceof i.b)) {
                        if (iVar2 instanceof i.a) {
                            return iVar2;
                        }
                        throw new Sc.o();
                    }
                    InitializeChatResponseDTO responseDTO = (InitializeChatResponseDTO) ((i.b) iVar2).b();
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(responseDTO, "responseDTO");
                    InitializeChatResponseDTO.AnalyticsTokens analytics = responseDTO.getAnalytics();
                    String pageToken = analytics != null ? analytics.getPageToken() : null;
                    InitializeChatResponseDTO.AnalyticsTokens analytics2 = responseDTO.getAnalytics();
                    String widgetToken = analytics2 != null ? analytics2.getWidgetToken() : null;
                    InitializeChatResponseDTO.AnalyticsTokens analytics3 = responseDTO.getAnalytics();
                    return new i.b(new ru.ozon.android.messenger.framework.presentation.models.responses.i(pageToken, widgetToken, analytics3 != null ? analytics3.getUserToken() : null));
                }
                C9331b c9331b3 = c9344o.f88121f;
                cVar3 = c9344o.f88120e;
                C9331b c9331b4 = c9344o.f88119d;
                Sc.s.b(obj2);
                c9331b2 = c9331b3;
                c9331b = c9331b4;
                obj = obj2;
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.a)) {
                    eVar = (i.a) iVar;
                } else if ((iVar instanceof i.b) && ((Boolean) ((i.b) iVar).b()).booleanValue() && cVar3.c() == e.a.RECONNECT_WITHOUT_RETRY) {
                    eVar = new i.a.e("No retry after reconnect");
                } else {
                    WebSocketRequestDTO h11 = c9331b2.h(cVar3);
                    C9343n c9343n = new C9343n(c9331b2.f87989b.a(h11), c9331b2, h11, null);
                    c9344o.f88119d = c9331b;
                    c9344o.f88120e = null;
                    c9344o.f88121f = null;
                    c9344o.f88124i = 2;
                    obj2 = xe.N.d(c9343n, c9344o);
                }
                iVar2 = (ru.ozon.android.messenger.utils.i) eVar;
                ru.ozon.android.messenger.framework.data.remote.mapper.g gVar2 = c9331b.f87988a;
                if (!(iVar2 instanceof i.b)) {
                }
            }
        }
        c9344o = new C9344o(this, cVar2);
        Object obj22 = c9344o.f88122g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9344o.f88124i;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (!(iVar instanceof i.a)) {
        }
        iVar2 = (ru.ozon.android.messenger.utils.i) eVar;
        ru.ozon.android.messenger.framework.data.remote.mapper.g gVar22 = c9331b.f87988a;
        if (!(iVar2 instanceof i.b)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (s(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9345p c9345p;
        int i11;
        xe.U a11;
        if (cVar instanceof C9345p) {
            c9345p = (C9345p) cVar;
            int i12 = c9345p.f88128g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9345p.f88128g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9345p.f88126e;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9345p.f88128g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    a11 = C10727i.a(this.f87991d, null, null, new C9346q(this, null), 3);
                    c9345p.f88125d = a11;
                    c9345p.f88128g = 1;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return obj;
                    }
                    a11 = (xe.U) c9345p.f88125d;
                    Sc.s.b(obj);
                }
                c9345p.f88125d = null;
                c9345p.f88128g = 2;
                Object s11 = a11.s(c9345p);
                return s11 != obj2 ? obj2 : s11;
            }
        }
        c9345p = new C9345p(this, cVar);
        Object obj3 = c9345p.f88126e;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9345p.f88128g;
        if (i11 != 0) {
        }
        c9345p.f88125d = null;
        c9345p.f88128g = 2;
        Object s112 = a11.s(c9345p);
        if (s112 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(@NotNull ru.ozon.android.messenger.framework.data.requests.f fVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9347s c9347s;
        int i11;
        ru.ozon.android.messenger.framework.data.requests.f fVar2;
        Object obj;
        C9331b c9331b;
        C9331b c9331b2;
        ru.ozon.android.messenger.utils.i iVar;
        Object eVar;
        ru.ozon.android.messenger.utils.i iVar2;
        if (cVar instanceof C9347s) {
            c9347s = (C9347s) cVar;
            int i12 = c9347s.f88156i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9347s.f88156i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c9347s.f88154g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9347s.f88156i;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    boolean z11 = fVar.c() != e.a.NO_RECONNECT_NO_RETRY;
                    c9347s.f88151d = this;
                    c9347s.f88152e = fVar;
                    c9347s.f88153f = this;
                    c9347s.f88156i = 1;
                    Object m11 = m(z11, c9347s);
                    if (m11 != aVar) {
                        fVar2 = fVar;
                        obj = m11;
                        c9331b = this;
                        c9331b2 = c9331b;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9331b = c9347s.f88151d;
                    Sc.s.b(obj2);
                    eVar = obj2;
                    iVar2 = (ru.ozon.android.messenger.utils.i) eVar;
                    ru.ozon.android.messenger.framework.data.remote.mapper.g gVar = c9331b.f87988a;
                    if (iVar2 instanceof i.b) {
                        return new i.b(gVar.g((SearchResponseDTO) ((i.b) iVar2).b()));
                    }
                    if (iVar2 instanceof i.a) {
                        return iVar2;
                    }
                    throw new Sc.o();
                }
                C9331b c9331b3 = c9347s.f88153f;
                fVar2 = c9347s.f88152e;
                C9331b c9331b4 = c9347s.f88151d;
                Sc.s.b(obj2);
                c9331b2 = c9331b3;
                c9331b = c9331b4;
                obj = obj2;
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.a)) {
                    eVar = (i.a) iVar;
                } else if ((iVar instanceof i.b) && ((Boolean) ((i.b) iVar).b()).booleanValue() && fVar2.c() == e.a.RECONNECT_WITHOUT_RETRY) {
                    eVar = new i.a.e("No retry after reconnect");
                } else {
                    WebSocketRequestDTO h11 = c9331b2.h(fVar2);
                    r rVar = new r(c9331b2.f87989b.a(h11), c9331b2, h11, null);
                    c9347s.f88151d = c9331b;
                    c9347s.f88152e = null;
                    c9347s.f88153f = null;
                    c9347s.f88156i = 2;
                    obj2 = xe.N.d(rVar, c9347s);
                }
                iVar2 = (ru.ozon.android.messenger.utils.i) eVar;
                ru.ozon.android.messenger.framework.data.remote.mapper.g gVar2 = c9331b.f87988a;
                if (iVar2 instanceof i.b) {
                }
            }
        }
        c9347s = new C9347s(this, cVar);
        Object obj22 = c9347s.f88154g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9347s.f88156i;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (!(iVar instanceof i.a)) {
        }
        iVar2 = (ru.ozon.android.messenger.utils.i) eVar;
        ru.ozon.android.messenger.framework.data.remote.mapper.g gVar22 = c9331b.f87988a;
        if (iVar2 instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(@NotNull SendMessageRequest sendMessageRequest, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9349u c9349u;
        int i11;
        Object obj;
        C9331b c9331b;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof C9349u) {
            c9349u = (C9349u) cVar;
            int i12 = c9349u.f88181h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9349u.f88181h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c9349u.f88179f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9349u.f88181h;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    boolean z11 = sendMessageRequest.c() != e.a.NO_RECONNECT_NO_RETRY;
                    c9349u.f88177d = sendMessageRequest;
                    c9349u.f88178e = this;
                    c9349u.f88181h = 1;
                    Object m11 = m(z11, c9349u);
                    if (m11 != aVar) {
                        obj = m11;
                        c9331b = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                    return obj2;
                }
                C9331b c9331b2 = c9349u.f88178e;
                SendMessageRequest sendMessageRequest2 = c9349u.f88177d;
                Sc.s.b(obj2);
                c9331b = c9331b2;
                sendMessageRequest = sendMessageRequest2;
                obj = obj2;
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.a)) {
                    return (i.a) iVar;
                }
                if ((iVar instanceof i.b) && ((Boolean) ((i.b) iVar).b()).booleanValue() && sendMessageRequest.c() == e.a.RECONNECT_WITHOUT_RETRY) {
                    return new i.a.e("No retry after reconnect");
                }
                WebSocketRequestDTO h11 = c9331b.h(sendMessageRequest);
                C9348t c9348t = new C9348t(c9331b.f87989b.a(h11), c9331b, h11, null);
                c9349u.f88177d = null;
                c9349u.f88178e = null;
                c9349u.f88181h = 2;
                Object d11 = xe.N.d(c9348t, c9349u);
                return d11 == aVar ? aVar : d11;
            }
        }
        c9349u = new C9349u(this, cVar);
        Object obj22 = c9349u.f88179f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9349u.f88181h;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (!(iVar instanceof i.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(@NotNull ru.ozon.android.messenger.framework.data.requests.ai.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        w wVar;
        int i11;
        Object obj;
        C9331b c9331b;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i12 = wVar.f88206h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                wVar.f88206h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = wVar.f88204f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = wVar.f88206h;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    boolean z11 = aVar.c() != e.a.NO_RECONNECT_NO_RETRY;
                    wVar.f88202d = aVar;
                    wVar.f88203e = this;
                    wVar.f88206h = 1;
                    Object m11 = m(z11, wVar);
                    if (m11 != aVar2) {
                        obj = m11;
                        c9331b = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                    return obj2;
                }
                C9331b c9331b2 = wVar.f88203e;
                ru.ozon.android.messenger.framework.data.requests.ai.a aVar3 = wVar.f88202d;
                Sc.s.b(obj2);
                c9331b = c9331b2;
                aVar = aVar3;
                obj = obj2;
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.a)) {
                    return (i.a) iVar;
                }
                if ((iVar instanceof i.b) && ((Boolean) ((i.b) iVar).b()).booleanValue() && aVar.c() == e.a.RECONNECT_WITHOUT_RETRY) {
                    return new i.a.e("No retry after reconnect");
                }
                WebSocketRequestDTO h11 = c9331b.h(aVar);
                C9350v c9350v = new C9350v(c9331b.f87989b.a(h11), c9331b, h11, null);
                wVar.f88202d = null;
                wVar.f88203e = null;
                wVar.f88206h = 2;
                Object d11 = xe.N.d(c9350v, wVar);
                return d11 == aVar2 ? aVar2 : d11;
            }
        }
        wVar = new w(this, cVar);
        Object obj22 = wVar.f88204f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = wVar.f88206h;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (!(iVar instanceof i.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(@NotNull ru.ozon.android.messenger.framework.data.requests.g gVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        y yVar;
        int i11;
        Object obj;
        C9331b c9331b;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i12 = yVar.f88231h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                yVar.f88231h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = yVar.f88229f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = yVar.f88231h;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    boolean z11 = gVar.c() != e.a.NO_RECONNECT_NO_RETRY;
                    yVar.f88227d = gVar;
                    yVar.f88228e = this;
                    yVar.f88231h = 1;
                    Object m11 = m(z11, yVar);
                    if (m11 != aVar) {
                        obj = m11;
                        c9331b = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                    return obj2;
                }
                C9331b c9331b2 = yVar.f88228e;
                ru.ozon.android.messenger.framework.data.requests.g gVar2 = yVar.f88227d;
                Sc.s.b(obj2);
                c9331b = c9331b2;
                gVar = gVar2;
                obj = obj2;
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.a)) {
                    return (i.a) iVar;
                }
                if ((iVar instanceof i.b) && ((Boolean) ((i.b) iVar).b()).booleanValue() && gVar.c() == e.a.RECONNECT_WITHOUT_RETRY) {
                    return new i.a.e("No retry after reconnect");
                }
                WebSocketRequestDTO h11 = c9331b.h(gVar);
                x xVar = new x(c9331b.f87989b.a(h11), c9331b, h11, null);
                yVar.f88227d = null;
                yVar.f88228e = null;
                yVar.f88231h = 2;
                Object d11 = xe.N.d(xVar, yVar);
                return d11 == aVar ? aVar : d11;
            }
        }
        yVar = new y(this, cVar);
        Object obj22 = yVar.f88229f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = yVar.f88231h;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (!(iVar instanceof i.a)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(@NotNull ru.ozon.android.messenger.framework.data.requests.h hVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        A a11;
        int i11;
        Object obj;
        C9331b c9331b;
        ru.ozon.android.messenger.utils.i iVar;
        if (cVar instanceof A) {
            a11 = (A) cVar;
            int i12 = a11.f87842h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                a11.f87842h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = a11.f87840f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = a11.f87842h;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    boolean z11 = hVar.c() != e.a.NO_RECONNECT_NO_RETRY;
                    a11.f87838d = hVar;
                    a11.f87839e = this;
                    a11.f87842h = 1;
                    Object m11 = m(z11, a11);
                    if (m11 != aVar) {
                        obj = m11;
                        c9331b = this;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                    return obj2;
                }
                C9331b c9331b2 = a11.f87839e;
                ru.ozon.android.messenger.framework.data.requests.h hVar2 = a11.f87838d;
                Sc.s.b(obj2);
                c9331b = c9331b2;
                hVar = hVar2;
                obj = obj2;
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.a)) {
                    return (i.a) iVar;
                }
                if ((iVar instanceof i.b) && ((Boolean) ((i.b) iVar).b()).booleanValue() && hVar.c() == e.a.RECONNECT_WITHOUT_RETRY) {
                    return new i.a.e("No retry after reconnect");
                }
                WebSocketRequestDTO h11 = c9331b.h(hVar);
                z zVar = new z(c9331b.f87989b.a(h11), c9331b, h11, null);
                a11.f87838d = null;
                a11.f87839e = null;
                a11.f87842h = 2;
                Object d11 = xe.N.d(zVar, a11);
                return d11 == aVar ? aVar : d11;
            }
        }
        a11 = new A(this, cVar);
        Object obj22 = a11.f87840f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = a11.f87842h;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (!(iVar instanceof i.a)) {
        }
    }
}
