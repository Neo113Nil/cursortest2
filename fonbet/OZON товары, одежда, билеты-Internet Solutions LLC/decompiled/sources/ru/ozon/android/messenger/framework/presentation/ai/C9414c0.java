package ru.ozon.android.messenger.framework.presentation.ai;

import Ae.C2380A;
import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Ae.I0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import android.net.Uri;
import androidx.lifecycle.C5418g0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.AppsFlyerProperties;
import fd.InterfaceC6511n;
import h3.C6788a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.websocket.AbstractC9330a;
import ru.ozon.android.messenger.framework.data.repository.C9351a;
import ru.ozon.android.messenger.framework.domain.model.f;
import ru.ozon.android.messenger.framework.domain.usecases.C9393j;
import ru.ozon.android.messenger.framework.domain.usecases.C9402t;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.ai.O;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a;
import ru.ozon.android.messenger.framework.presentation.common.screen.m;
import ru.ozon.android.messenger.framework.presentation.models.A;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.AbstractC10711a;
import xe.C10727i;
import ze.C11115c;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9414c0 extends androidx.lifecycle.w0 {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Y> f89487A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final Ae.C0 f89488B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final Object f89489C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final Ae.M0<ru.ozon.android.messenger.framework.presentation.models.l> f89490D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final Ae.x0<W> f89491E;

    /* renamed from: F, reason: collision with root package name */
    private xe.B0 f89492F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final Ae.M0<W> f89493G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.view.recycler.u f89494H;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.common.screen.l> f89495I;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private final Ae.M0<String> f89496J;

    /* renamed from: K, reason: collision with root package name */
    @NotNull
    private final Function2<W, O, W> f89497K;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f89498a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final K0 f89499b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89500c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.d f89501d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9351a f89502e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.r f89503f;

    /* renamed from: g, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f89504g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.notification.c f89505h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a f89506i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.startup.a f89507j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C9402t f89508k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.P f89509l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.F f89510m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.mapper.a f89511n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.alert.a f89512o;

    /* renamed from: p, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.logger.b f89513p;

    /* renamed from: q, reason: collision with root package name */
    private xe.B0 f89514q;

    /* renamed from: r, reason: collision with root package name */
    private String f89515r;

    /* renamed from: s, reason: collision with root package name */
    private xe.B0 f89516s;

    /* renamed from: t, reason: collision with root package name */
    private xe.B0 f89517t;

    /* renamed from: u, reason: collision with root package name */
    private xe.B0 f89518u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f89519v;

    /* renamed from: w, reason: collision with root package name */
    private final C9409a f89520w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final C11115c f89521x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> f89522y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final Ae.C0 f89523z;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c0$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89524a;

        static {
            int[] iArr = new int[ru.ozon.android.messenger.framework.navigation.action.d.values().length];
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.AI_SEND_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.AI_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.AI_RETRY_SEND_MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.AI_OPEN_SOURCES_CURTAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.SCROLL_TO_BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.AI_LIKE_ANSWER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.AI_DISLIKE_ANSWER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.COPY_TEXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.navigation.action.d.ON_CHAT_BUTTONS_CLICK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f89524a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$observeConnectionEvents$1", f = "AiAssistantViewModel.kt", l = {389}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c0$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f89525d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9414c0 f89526e;

        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c0$b$a */
        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C9414c0 f89527a;

            a(C9414c0 c9414c0) {
                this.f89527a = c9414c0;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                AbstractC9330a abstractC9330a = (AbstractC9330a) obj;
                boolean z11 = abstractC9330a instanceof AbstractC9330a.f;
                C9414c0 c9414c0 = this.f89527a;
                if (z11) {
                    c9414c0.f89506i.w(true, new m.a(null));
                } else if (abstractC9330a instanceof AbstractC9330a.e) {
                    C9414c0.B0(c9414c0);
                } else if (abstractC9330a instanceof AbstractC9330a.c) {
                    c9414c0.f89506i.w(false, new m.a(null));
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
            super(2, dVar);
            this.f89526e = c9414c0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(dVar, this.f89526e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f89525d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C9414c0 c9414c0 = this.f89526e;
                Ae.M0<AbstractC9330a> l11 = c9414c0.f89500c.l();
                a aVar2 = new a(c9414c0);
                this.f89525d = 1;
                if (l11.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$observeSocketEvents$1", f = "AiAssistantViewModel.kt", l = {375}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c0$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f89528d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9414c0 f89529e;

        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c0$c$a */
        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C9414c0 f89530a;

            a(C9414c0 c9414c0) {
                this.f89530a = c9414c0;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                Object F02;
                ru.ozon.android.messenger.framework.presentation.models.A a11 = (ru.ozon.android.messenger.framework.presentation.models.A) obj;
                boolean z11 = a11 instanceof A.a;
                C9414c0 c9414c0 = this.f89530a;
                if (z11) {
                    A.a aVar = (A.a) a11;
                    Object w02 = C9414c0.w0(c9414c0, aVar, aVar.a(), dVar);
                    return w02 == Wc.a.COROUTINE_SUSPENDED ? w02 : Unit.f71690a;
                }
                if (!(a11 instanceof A.g)) {
                    return ((a11 instanceof A.e) && (F02 = C9414c0.F0(c9414c0, (A.e) a11, dVar)) == Wc.a.COROUTINE_SUSPENDED) ? F02 : Unit.f71690a;
                }
                Object A02 = C9414c0.A0(c9414c0, ((A.g) a11).a(), dVar);
                return A02 == Wc.a.COROUTINE_SUSPENDED ? A02 : Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$observeSocketEvents$1$invokeSuspend$$inlined$flatMapLatest$1", f = "AiAssistantViewModel.kt", l = {219, 193}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.c0$c$b */
        public static final class b extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super ru.ozon.android.messenger.framework.presentation.models.A>, String, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f89531d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ InterfaceC2397i f89532e;

            /* renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f89533f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C9414c0 f89534g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
                super(3, dVar);
                this.f89534g = c9414c0;
            }

            @Override // fd.InterfaceC6511n
            public final Object invoke(InterfaceC2397i<? super ru.ozon.android.messenger.framework.presentation.models.A> interfaceC2397i, String str, kotlin.coroutines.d<? super Unit> dVar) {
                b bVar = new b(dVar, this.f89534g);
                bVar.f89532e = interfaceC2397i;
                bVar.f89533f = str;
                return bVar.invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
            
                if (Ae.C2399j.r(r1, (Ae.InterfaceC2395h) r10, r9) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
            
                if (r10 == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                InterfaceC2397i interfaceC2397i;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f89531d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    interfaceC2397i = this.f89532e;
                    String str = (String) this.f89533f;
                    ru.ozon.android.messenger.framework.domain.usecases.r rVar = this.f89534g.f89503f;
                    ru.ozon.android.messenger.framework.presentation.models.x[] xVarArr = {ru.ozon.android.messenger.framework.presentation.models.x.MESSAGES, ru.ozon.android.messenger.framework.presentation.models.x.FOOTER, ru.ozon.android.messenger.framework.presentation.models.x.ALERT, ru.ozon.android.messenger.framework.presentation.models.x.CURTAIN};
                    this.f89532e = interfaceC2397i;
                    this.f89531d = 1;
                    obj = rVar.a(xVarArr, str, this);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    interfaceC2397i = this.f89532e;
                    Sc.s.b(obj);
                }
                this.f89532e = null;
                this.f89531d = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
            super(2, dVar);
            this.f89529e = c9414c0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(dVar, this.f89529e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f89528d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C9414c0 c9414c0 = this.f89529e;
                Be.m Q11 = C2399j.Q(c9414c0.e(), new b(null, c9414c0));
                a aVar2 = new a(c9414c0);
                this.f89528d = 1;
                if (Q11.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public C9414c0(@NotNull ru.ozon.android.messenger.framework.navigation.controller.a controller, @NotNull K0 aiSendActionStore, @NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, @NotNull ru.ozon.android.messenger.framework.domain.repository.d messagesRepository, @NotNull C9351a actionRepository, @NotNull ru.ozon.android.messenger.framework.domain.usecases.r getSocketEventsUseCase, ru.ozon.android.messenger.framework.analytics.i iVar, @NotNull ru.ozon.android.messenger.framework.presentation.common.notification.c noInternetNotificationOrEmptyScreenConditionFactory, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o unreadMessagesDelegate, @NotNull ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.a loadingDelegate, @NotNull ru.ozon.android.messenger.framework.presentation.common.startup.a chatStartupDelegate, @NotNull C9402t handleChatEventsUseCase, @NotNull ru.ozon.android.messenger.framework.domain.usecases.P sendMessageUseCase, @NotNull ru.ozon.android.messenger.framework.domain.usecases.F removeItemUseCase, @NotNull ru.ozon.android.messenger.framework.presentation.mapper.a chatUiMapper, @NotNull C9393j getChatMessagesUseCase, @NotNull ru.ozon.android.messenger.blocks.alert.a alertBlockFactory, @NotNull C5418g0 handle, ru.ozon.android.messenger.framework.logger.b bVar) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(aiSendActionStore, "aiSendActionStore");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(getSocketEventsUseCase, "getSocketEventsUseCase");
        Intrinsics.checkNotNullParameter(noInternetNotificationOrEmptyScreenConditionFactory, "noInternetNotificationOrEmptyScreenConditionFactory");
        Intrinsics.checkNotNullParameter(unreadMessagesDelegate, "unreadMessagesDelegate");
        Intrinsics.checkNotNullParameter(loadingDelegate, "loadingDelegate");
        Intrinsics.checkNotNullParameter(chatStartupDelegate, "chatStartupDelegate");
        Intrinsics.checkNotNullParameter(handleChatEventsUseCase, "handleChatEventsUseCase");
        Intrinsics.checkNotNullParameter(sendMessageUseCase, "sendMessageUseCase");
        Intrinsics.checkNotNullParameter(removeItemUseCase, "removeItemUseCase");
        Intrinsics.checkNotNullParameter(chatUiMapper, "chatUiMapper");
        Intrinsics.checkNotNullParameter(getChatMessagesUseCase, "getChatMessagesUseCase");
        Intrinsics.checkNotNullParameter(alertBlockFactory, "alertBlockFactory");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f89498a = controller;
        this.f89499b = aiSendActionStore;
        this.f89500c = repository;
        this.f89501d = messagesRepository;
        this.f89502e = actionRepository;
        this.f89503f = getSocketEventsUseCase;
        this.f89504g = iVar;
        this.f89505h = noInternetNotificationOrEmptyScreenConditionFactory;
        this.f89506i = loadingDelegate;
        this.f89507j = chatStartupDelegate;
        this.f89508k = handleChatEventsUseCase;
        this.f89509l = sendMessageUseCase;
        this.f89510m = removeItemUseCase;
        this.f89511n = chatUiMapper;
        this.f89512o = alertBlockFactory;
        this.f89513p = bVar;
        C9409a c9409a = (C9409a) handle.c("ARG_AI_ASSISTANT");
        this.f89520w = c9409a;
        C11115c a11 = ze.k.a(-2, 6, null);
        this.f89521x = a11;
        this.f89522y = C2399j.H(a11);
        Ae.C0 b11 = Ae.E0.b(0, 0, null, 7);
        this.f89523z = b11;
        this.f89487A = C2399j.a(b11);
        this.f89488B = Ae.E0.b(0, 0, null, 7);
        this.f89489C = ru.ozon.android.messenger.utils.f.b(new v0(this));
        E0 e02 = new E0(getChatMessagesUseCase.a(), this);
        C6788a a12 = androidx.lifecycle.x0.a(this);
        int i11 = Ae.I0.f818a;
        Ae.M0<ru.ozon.android.messenger.framework.presentation.models.l> M11 = C2399j.M(e02, a12, I0.a.d(), new ru.ozon.android.messenger.framework.presentation.models.l(0));
        this.f89490D = M11;
        Ae.x0<W> a13 = Ae.O0.a(new W(null, 15));
        this.f89491E = a13;
        List<ru.ozon.android.messenger.framework.presentation.models.q> e11 = c9409a != null ? c9409a.e() : null;
        W w11 = new W(e11 == null ? kotlin.collections.K.f71697a : e11, 14);
        Intrinsics.g(loadingDelegate, "null cannot be cast to non-null type ru.ozon.android.messenger.framework.presentation.ai.delegates.AiAssistantLoadingDelegate");
        this.f89493G = C2399j.M(new C2380A(C2399j.i(M11, ((ru.ozon.android.messenger.framework.presentation.ai.delegates.b) loadingDelegate).Q(), a13, new C9416d0(4, null)), new C9418e0(null, this)), androidx.lifecycle.x0.a(this), I0.a.a(), w11);
        this.f89494H = loadingDelegate.c();
        this.f89495I = loadingDelegate.getLoader();
        this.f89496J = chatStartupDelegate.e();
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.l[] lVarArr = {(ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.d) loadingDelegate, unreadMessagesDelegate};
        for (int i12 = 0; i12 < 2; i12++) {
            lVarArr[i12].e(androidx.lifecycle.x0.a(this), this.f89521x, this.f89488B);
        }
        C2399j.C(new C2408n0(new Ae.I(this.f89490D), new C9410a0(null, this)), androidx.lifecycle.x0.a(this));
        C2399j.C(new C2408n0(C2399j.o(new C2406m0(new F0(this.f89490D))), new C9412b0(null, this)), androidx.lifecycle.x0.a(this));
        this.f89497K = D0.f89236b;
    }

    public static final Object A0(C9414c0 c9414c0, ru.ozon.android.messenger.framework.presentation.models.q qVar, kotlin.coroutines.d dVar) {
        c9414c0.getClass();
        C9402t.a.b bVar = new C9402t.a.b(qVar);
        C9402t c9402t = c9414c0.f89508k;
        c9402t.getClass();
        Object a11 = bVar.a(c9402t, dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public static final void B0(C9414c0 c9414c0) {
        ((ru.ozon.android.messenger.framework.presentation.common.notification.c) c9414c0.f89489C.getValue()).a(c9414c0.f89496J.getValue(), new C9443r0(c9414c0), new t0(c9414c0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r5.q(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r5.f89501d.m(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C0(C9414c0 c9414c0, d.w wVar, kotlin.coroutines.d dVar) {
        u0 u0Var;
        int i11;
        c9414c0.getClass();
        if (dVar instanceof u0) {
            u0Var = (u0) dVar;
            int i12 = u0Var.f89687h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                u0Var.f89687h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = u0Var.f89685f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = u0Var.f89687h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    u0Var.f89683d = c9414c0;
                    u0Var.f89684e = wVar;
                    u0Var.f89687h = 1;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    wVar = u0Var.f89684e;
                    c9414c0 = u0Var.f89683d;
                    Sc.s.b(obj);
                }
                ru.ozon.android.messenger.framework.domain.repository.d dVar2 = c9414c0.f89501d;
                u0Var.f89683d = null;
                u0Var.f89684e = null;
                u0Var.f89687h = 2;
            }
        }
        u0Var = new u0(dVar, c9414c0);
        Object obj2 = u0Var.f89685f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = u0Var.f89687h;
        if (i11 != 0) {
        }
        ru.ozon.android.messenger.framework.domain.repository.d dVar22 = c9414c0.f89501d;
        u0Var.f89683d = null;
        u0Var.f89684e = null;
        u0Var.f89687h = 2;
    }

    public static final void D0(C9414c0 c9414c0, Map map) {
        ru.ozon.android.messenger.framework.analytics.i iVar;
        c9414c0.getClass();
        MessengerTrackingInfo messengerTrackingInfo = (MessengerTrackingInfo) map.get("view");
        if (messengerTrackingInfo == null || (iVar = c9414c0.f89504g) == null) {
            return;
        }
        ru.ozon.android.messenger.framework.analytics.h.f(iVar, kotlin.collections.U.i(new Pair("view", messengerTrackingInfo)));
    }

    public static final void E0(C9414c0 c9414c0, O.a aVar) {
        W value;
        Ae.x0<W> x0Var = c9414c0.f89491E;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, (W) ((D0) c9414c0.f89497K).invoke(value, aVar)));
    }

    public static final Object F0(C9414c0 c9414c0, A.e eVar, kotlin.coroutines.d dVar) {
        List<ru.ozon.android.messenger.framework.presentation.models.q> a11 = c9414c0.f89490D.getValue().b().a();
        Iterator<ru.ozon.android.messenger.framework.presentation.models.q> it = a11.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(it.next()), eVar.a())) {
                break;
            }
            i11++;
        }
        ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) C7714v.Q(i11, a11);
        if (qVar == null || !R0(qVar) || i11 != C7714v.P(a11)) {
            Object g10 = c9414c0.f89510m.g(new f.b(eVar.a()), dVar);
            return g10 == Wc.a.COROUTINE_SUSPENDED ? g10 : Unit.f71690a;
        }
        String a12 = eVar.a();
        if (!Intrinsics.d(c9414c0.f89515r, a12)) {
            xe.B0 b02 = c9414c0.f89514q;
            if (b02 != null) {
                ((xe.H0) b02).j(null);
            }
            c9414c0.f89515r = a12;
            c9414c0.f89514q = C10727i.c(androidx.lifecycle.x0.a(c9414c0), null, null, new C0(null, c9414c0), 3);
        }
        return Unit.f71690a;
    }

    public static final void G0(C9414c0 c9414c0, j.s sVar) {
        c9414c0.f89521x.b(sVar);
    }

    public static final void J0(C9414c0 c9414c0) {
        xe.B0 b02 = c9414c0.f89492F;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            c9414c0.f89492F = C10727i.c(androidx.lifecycle.x0.a(c9414c0), null, null, new G0(null, c9414c0), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkedHashMap L0(ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        Map<String, String> params;
        AtomActionDTO b11 = aVar.b();
        if ((b11 == null || (params = b11.getParams()) == null) && (params = aVar.c().getParams()) == null) {
            params = kotlin.collections.U.c();
        }
        return kotlin.collections.U.m(params, O0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkedHashMap O0() {
        Uri deeplink;
        C9409a c9409a = this.f89520w;
        return ru.ozon.android.messenger.utils.b.a(kotlin.collections.U.i(new Pair(AppsFlyerProperties.CHANNEL, (c9409a == null || (deeplink = c9409a.getDeeplink()) == null) ? null : deeplink.getQueryParameter(AppsFlyerProperties.CHANNEL))));
    }

    private static boolean R0(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        List<ru.ozon.android.messenger.framework.presentation.models.u> b11 = qVar.b();
        if ((b11 instanceof Collection) && b11.isEmpty()) {
            return false;
        }
        Iterator<T> it = b11.iterator();
        while (it.hasNext()) {
            if (((ru.ozon.android.messenger.framework.presentation.models.u) it.next()).c() instanceof ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a) {
                return true;
            }
        }
        return false;
    }

    private final void S0() {
        xe.B0 b02 = this.f89516s;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            this.f89516s = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new b(null, this), 3);
        }
    }

    private final void T0() {
        xe.B0 b02 = this.f89518u;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            this.f89518u = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new c(null, this), 3);
        }
    }

    static void W0(C9414c0 c9414c0, Function0 function0) {
        if (c9414c0.f89500c.h() instanceof NetworkInfo.Available) {
            function0.invoke();
        } else {
            c9414c0.f89521x.b(j.s.f89885a);
        }
    }

    public static final String k0(C9414c0 c9414c0, ru.ozon.android.messenger.framework.navigation.action.a aVar, String str) {
        Map<String, String> params;
        c9414c0.getClass();
        AtomActionDTO b11 = aVar.b();
        String orDefault = (b11 == null || (params = b11.getParams()) == null) ? null : params.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        Map<String, String> params2 = aVar.c().getParams();
        if (params2 != null) {
            return params2.getOrDefault(str, null);
        }
        return null;
    }

    public static final void v0(C9414c0 c9414c0, d.f fVar) {
        Map<String, String> params;
        c9414c0.getClass();
        ru.ozon.android.messenger.framework.navigation.action.a a11 = fVar.a();
        if (a11.c() instanceof AtomAction.Dismiss) {
            C10727i.c(androidx.lifecycle.x0.a(c9414c0), null, null, new C9420f0(null, c9414c0), 3);
        }
        d.a aVar = ru.ozon.android.messenger.framework.navigation.action.d.Companion;
        String id2 = a11.getId();
        aVar.getClass();
        ru.ozon.android.messenger.framework.navigation.action.d a12 = d.a.a(id2);
        int i11 = a12 == null ? -1 : a.f89524a[a12.ordinal()];
        C11115c c11115c = c9414c0.f89521x;
        switch (i11) {
            case -1:
                c9414c0.f89499b.d();
                break;
            case 1:
                C9422g0 c9422g0 = new C9422g0(c9414c0);
                C9426i0 c9426i0 = new C9426i0(c9414c0, a11, fVar);
                if (!(c9414c0.f89500c.h() instanceof NetworkInfo.Available)) {
                    c9422g0.invoke();
                    c11115c.b(j.s.f89885a);
                    break;
                } else {
                    c9426i0.invoke();
                    break;
                }
            case 2:
                W0(c9414c0, new B0(c9414c0, c9414c0.L0(a11)));
                break;
            case 3:
                W0(c9414c0, new C9430k0(c9414c0, a11));
                break;
            case 4:
                C10727i.c(androidx.lifecycle.x0.a(c9414c0), null, null, new C9432l0(c9414c0, a11, null), 3);
                break;
            case 5:
                c11115c.b(new j.i(0));
                break;
            case 6:
            case 7:
                Object obj = a11.d().get(d.c.AI_MESSAGE_ACTION_TOGGLE_ID.a());
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                if (num != null) {
                    int intValue = num.intValue();
                    Object obj2 = a11.d().get(d.c.ITEM_ID.a());
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str != null) {
                        W0(c9414c0, new C9436n0(c9414c0, intValue, str, a11));
                        break;
                    }
                }
                break;
            case 8:
                AtomAction c11 = a11.c();
                AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                if (click != null && (params = click.getParams()) != null) {
                    c11115c.b(new j.b(params));
                    break;
                }
                break;
            case 9:
                W0(c9414c0, new C9442q0(c9414c0, a11, ru.ozon.android.messenger.blocks.alert.a.f84375c));
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d3, code lost:
    
        if (r8 == r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x016c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w0(C9414c0 c9414c0, A.a aVar, String str, kotlin.coroutines.d dVar) {
        C9438o0 c9438o0;
        int i11;
        C9414c0 c9414c02;
        boolean z11;
        Object g10;
        A.a aVar2;
        C9414c0 c9414c03;
        c9414c0.getClass();
        if (dVar instanceof C9438o0) {
            c9438o0 = (C9438o0) dVar;
            int i12 = c9438o0.f89654i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9438o0.f89654i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9438o0.f89652g;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9438o0.f89654i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    String value = c9414c0.f89496J.getValue();
                    if (str == null || str.equals(value)) {
                        String d11 = ru.ozon.android.messenger.framework.presentation.models.r.d(aVar.b());
                        Ae.M0<ru.ozon.android.messenger.framework.presentation.models.l> m02 = c9414c0.f89490D;
                        boolean isEmpty = m02.getValue().b().a().isEmpty();
                        C9402t c9402t = c9414c0.f89508k;
                        if (!isEmpty) {
                            List<ru.ozon.android.messenger.framework.presentation.models.q> a11 = m02.getValue().b().a();
                            if (!(a11 instanceof Collection) || !a11.isEmpty()) {
                                Iterator<T> it = a11.iterator();
                                while (it.hasNext()) {
                                    if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d((ru.ozon.android.messenger.framework.presentation.models.q) it.next()), d11)) {
                                        ru.ozon.android.messenger.framework.presentation.models.q b11 = aVar.b();
                                        c9438o0.f89654i = 1;
                                        C9402t.a.b bVar = new C9402t.a.b(b11);
                                        c9402t.getClass();
                                        Object a12 = bVar.a(c9402t, c9438o0);
                                        if (a12 != Wc.a.COROUTINE_SUSPENDED) {
                                            a12 = Unit.f71690a;
                                        }
                                    }
                                }
                            }
                        }
                        boolean z12 = (c9414c0.f89515r == null || aVar.c() != ru.ozon.android.messenger.framework.presentation.models.x.MESSAGES || Z.b(aVar.b()) || R0(aVar.b())) ? false : true;
                        C9402t.a.C1638a c1638a = new C9402t.a.C1638a(aVar.b(), aVar.c(), aVar.a());
                        c9438o0.f89649d = c9414c0;
                        c9438o0.f89650e = aVar;
                        c9438o0.f89651f = z12;
                        c9438o0.f89654i = 2;
                        c9402t.getClass();
                        if (C9402t.e(c9402t, c1638a, c9438o0) != aVar3) {
                            c9414c02 = c9414c0;
                            z11 = z12;
                            if (z11) {
                            }
                            ru.ozon.android.messenger.framework.presentation.models.q b12 = aVar.b();
                            c9414c02.getClass();
                            boolean R02 = R0(b12);
                            if (!Z.b(aVar.b())) {
                            }
                            c9414c02.f89521x.b(j.C1661j.f89878a);
                        }
                        return aVar3;
                    }
                } else {
                    if (i11 == 1) {
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 == 2) {
                        z11 = c9438o0.f89651f;
                        aVar = c9438o0.f89650e;
                        c9414c02 = c9438o0.f89649d;
                        Sc.s.b(obj);
                        if (z11) {
                            c9438o0.f89649d = c9414c02;
                            c9438o0.f89650e = aVar;
                            c9438o0.f89654i = 3;
                            String str2 = c9414c02.f89515r;
                            if (str2 == null) {
                                g10 = Unit.f71690a;
                            } else {
                                xe.B0 b02 = c9414c02.f89514q;
                                if (b02 != null) {
                                    ((xe.H0) b02).j(null);
                                }
                                c9414c02.f89514q = null;
                                c9414c02.f89515r = null;
                                g10 = c9414c02.f89510m.g(new f.b(str2), c9438o0);
                                if (g10 != Wc.a.COROUTINE_SUSPENDED) {
                                    g10 = Unit.f71690a;
                                }
                            }
                            if (g10 != aVar3) {
                                aVar2 = aVar;
                                c9414c03 = c9414c02;
                                c9414c02 = c9414c03;
                                aVar = aVar2;
                            }
                            return aVar3;
                        }
                        ru.ozon.android.messenger.framework.presentation.models.q b122 = aVar.b();
                        c9414c02.getClass();
                        boolean R022 = R0(b122);
                        if (!Z.b(aVar.b())) {
                        }
                        c9414c02.f89521x.b(j.C1661j.f89878a);
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = c9438o0.f89650e;
                        c9414c03 = c9438o0.f89649d;
                        Sc.s.b(obj);
                        c9414c02 = c9414c03;
                        aVar = aVar2;
                        ru.ozon.android.messenger.framework.presentation.models.q b1222 = aVar.b();
                        c9414c02.getClass();
                        boolean R0222 = R0(b1222);
                        if (!Z.b(aVar.b()) || R0222) {
                            c9414c02.f89521x.b(j.C1661j.f89878a);
                        }
                    }
                }
                return Unit.f71690a;
            }
        }
        c9438o0 = new C9438o0(dVar, c9414c0);
        Object obj2 = c9438o0.f89652g;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9438o0.f89654i;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    public static final void x0(C9414c0 c9414c0, Map map) {
        ru.ozon.android.messenger.framework.analytics.i iVar = c9414c0.f89504g;
        if (iVar != null) {
            ru.ozon.android.messenger.framework.analytics.h.d(iVar, map);
        }
    }

    public static final void y0(C9414c0 c9414c0, Map map) {
        ru.ozon.android.messenger.framework.analytics.i iVar;
        c9414c0.getClass();
        MessengerTrackingInfo messengerTrackingInfo = (MessengerTrackingInfo) map.get("click");
        if (messengerTrackingInfo == null || (iVar = c9414c0.f89504g) == null) {
            return;
        }
        ru.ozon.android.messenger.framework.analytics.h.e(iVar, kotlin.collections.U.i(new Pair("click", messengerTrackingInfo)));
    }

    public static final void z0(C9414c0 c9414c0, ru.ozon.android.messenger.framework.analytics.d dVar) {
        ru.ozon.android.messenger.framework.analytics.i iVar = c9414c0.f89504g;
        if (iVar != null) {
            iVar.sendCustomEvent(dVar);
        }
    }

    @NotNull
    public final InterfaceC2395h<Y> K0() {
        return this.f89487A;
    }

    @NotNull
    public final Ae.M0<W> M0() {
        return this.f89493G;
    }

    @NotNull
    public final K0 N0() {
        return this.f89499b;
    }

    @NotNull
    public final InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.chatdetail.j> P0() {
        return this.f89522y;
    }

    public final ru.ozon.android.messenger.framework.logger.b Q0() {
        return this.f89513p;
    }

    public final void U0() {
        this.f89519v = true;
        xe.B0 b02 = this.f89518u;
        if (b02 != null) {
            ((xe.H0) b02).j(null);
        }
        this.f89518u = null;
        xe.B0 b03 = this.f89516s;
        if (b03 != null) {
            ((xe.H0) b03).j(null);
        }
        this.f89516s = null;
        String value = this.f89496J.getValue();
        if (value != null) {
            this.f89500c.i(value);
        }
    }

    public final void V0() {
        if (this.f89519v) {
            this.f89519v = false;
            T0();
            S0();
            a.C1665a.b(this.f89506i, O0(), null, 2);
        }
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.common.view.recycler.u c() {
        return this.f89494H;
    }

    @NotNull
    public final Ae.M0<String> e() {
        return this.f89496J;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.navigation.controller.a getController() {
        return this.f89498a;
    }

    @NotNull
    public final InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.common.screen.l> getLoader() {
        return this.f89495I;
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        xe.B0 b02 = this.f89517t;
        if (b02 != null) {
            ((xe.H0) b02).j(null);
        }
        this.f89517t = null;
        xe.B0 b03 = this.f89518u;
        if (b03 != null) {
            ((xe.H0) b03).j(null);
        }
        this.f89518u = null;
        xe.B0 b04 = this.f89516s;
        if (b04 != null) {
            ((xe.H0) b04).j(null);
        }
        this.f89516s = null;
        xe.B0 b05 = this.f89492F;
        if (b05 != null) {
            ((xe.H0) b05).j(null);
        }
        this.f89492F = null;
        xe.B0 b06 = this.f89514q;
        if (b06 != null) {
            ((xe.H0) b06).j(null);
        }
        this.f89514q = null;
        this.f89515r = null;
        this.f89506i.cleanup();
        super.onCleared();
    }

    public final void onStart() {
        xe.B0 b02 = this.f89517t;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            this.f89517t = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new z0(null, this), 3);
        }
        T0();
        S0();
    }
}
