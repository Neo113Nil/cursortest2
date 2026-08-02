package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import h3.C6788a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7741a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.chatGroups.grouplist.j;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.b;
import ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.c;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.android.messenger.framework.data.requests.GetChatsRequest;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.navigation.action.g;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a;
import ru.ozon.android.messenger.framework.presentation.chatlist.j;
import ru.ozon.android.messenger.framework.presentation.chatlist.popup.f;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9499k;
import ru.ozon.android.messenger.framework.presentation.common.notification.d;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.AbstractC10711a;
import xe.B0;
import xe.C10727i;
import xe.H0;
import ze.EnumC11113a;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9509v extends w0 implements InterfaceC9506s, androidx.lifecycle.I, InterfaceC9499k {

    /* renamed from: A, reason: collision with root package name */
    private B0 f90689A;

    /* renamed from: B, reason: collision with root package name */
    private B0 f90690B;

    /* renamed from: C, reason: collision with root package name */
    private ru.ozon.android.messenger.framework.presentation.chatlist.v f90691C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final Object f90692D;

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C9500l f90693a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C9490b f90694b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.b f90695c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f90696d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.input.viewmodel.e f90697e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.r f90698f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.B f90699g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.chatlist.d f90700h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.mappers.a f90701i;

    /* renamed from: j, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f90702j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.alert.a f90703k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.a f90704l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final d.a f90705m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.notification.g f90706n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Jb.c f90707o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final JsonParser f90708p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final M0<ru.ozon.android.messenger.framework.presentation.chatlist.f> f90709q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C0 f90710r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final x0<ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a> f90711s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final C0 f90712t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f90713u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final x0<ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.b> f90714v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f90715w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final C0 f90716x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final C9508u f90717y;

    /* renamed from: z, reason: collision with root package name */
    private B0 f90718z;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.v$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90719a;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f90719a = iArr;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.v$b */
    static final class b extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f90720b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
            ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, null, null, null, null, null, null, null, null, null, 2015);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$chatDetailsDataConsumed$2", f = "ChatListViewModel.kt", l = {229}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.v$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90721d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9509v.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90721d;
            if (i11 == 0) {
                Sc.s.b(obj);
                ru.ozon.android.messenger.framework.navigation.action.a c11 = ru.ozon.android.messenger.framework.navigation.action.b.c(ru.ozon.android.messenger.utils.a.a(ru.ozon.android.messenger.framework.navigation.action.g.HIDE));
                this.f90721d = 1;
                if (C9509v.this.G0(c11, this) == aVar) {
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

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.v$d */
    static final class d extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f90723b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
            ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, null, null, null, null, null, null, null, null, null, 1791);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl", f = "ChatListViewModel.kt", l = {510, 577}, m = "handlePopUpEvents")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.v$e */
    static final class e extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        C9509v f90724d;

        /* renamed from: e, reason: collision with root package name */
        ru.ozon.android.messenger.framework.navigation.action.a f90725e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90726f;

        /* renamed from: h, reason: collision with root package name */
        int f90728h;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f90726f = obj;
            this.f90728h |= LinearLayoutManager.INVALID_OFFSET;
            return C9509v.this.G0(null, this);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.v$f */
    static final class f extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f90729b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ArrayList arrayList) {
            super(1);
            this.f90729b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
            ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, null, null, null, null, null, null, this.f90729b, null, null, 1919);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.v$g */
    static final class g extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f90730b = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
            ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, null, null, null, null, null, null, kotlin.collections.K.f71697a, null, null, 1919);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.v$h */
    static final class h extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f90731b = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
            ru.ozon.android.messenger.framework.presentation.chatlist.f it = fVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(it, null, null, null, null, null, kotlin.collections.K.f71697a, null, null, null, 1983);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.ChatListViewModelImpl$showNoInternetNotificationIfNeedOrElse$1", f = "ChatListViewModel.kt", l = {666}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.v$i */
    static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90732d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f90733e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f90733e = (kotlin.coroutines.jvm.internal.j) function1;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new i(this.f90733e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90732d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f90732d = 1;
                if (this.f90733e.invoke(this) == aVar) {
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

    /* JADX WARN: Type inference failed for: r1v5, types: [ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.u] */
    public C9509v(@NotNull ru.ozon.android.messenger.framework.navigation.controller.b controller, @NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, @NotNull ru.ozon.android.messenger.blocks.input.viewmodel.e draftsLoader, @NotNull ru.ozon.android.messenger.framework.domain.usecases.r getSocketEventsUseCase, @NotNull ru.ozon.android.messenger.framework.domain.usecases.B mapBlockUpdateUseCase, @NotNull ru.ozon.android.messenger.framework.presentation.chatlist.d reducer, @NotNull ru.ozon.android.messenger.framework.domain.mappers.a blockVOtoItemVOMapper, ru.ozon.android.messenger.framework.analytics.i iVar, @NotNull ru.ozon.android.messenger.blocks.alert.a alertBlockFactory, @NotNull ru.ozon.android.messenger.framework.domain.repository.a actionRepository, @NotNull d.a noInternetNotificationOrEmptyScreenConditionFactory, @NotNull ru.ozon.android.messenger.framework.presentation.common.notification.g noInternetNotificationPresenter, @NotNull ru.ozon.android.messenger.framework.core.c featureProvider, @NotNull Jb.c blocksItemMapperProvider, @NotNull JsonParser jsonDeserializer, @NotNull C9490b chatListEventDelegateImpl, @NotNull C9500l chatListLoadingDelegateImpl) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(draftsLoader, "draftsLoader");
        Intrinsics.checkNotNullParameter(getSocketEventsUseCase, "getSocketEventsUseCase");
        Intrinsics.checkNotNullParameter(mapBlockUpdateUseCase, "mapBlockUpdateUseCase");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        String str = "reducer";
        Intrinsics.checkNotNullParameter(blockVOtoItemVOMapper, "blockVOtoItemVOMapper");
        Intrinsics.checkNotNullParameter(alertBlockFactory, "alertBlockFactory");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(noInternetNotificationOrEmptyScreenConditionFactory, "noInternetNotificationOrEmptyScreenConditionFactory");
        Intrinsics.checkNotNullParameter(noInternetNotificationPresenter, "noInternetNotificationPresenter");
        Intrinsics.checkNotNullParameter(featureProvider, "featureProvider");
        Intrinsics.checkNotNullParameter(blocksItemMapperProvider, "blocksItemMapperProvider");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(chatListEventDelegateImpl, "chatListEventDelegateImpl");
        Intrinsics.checkNotNullParameter(chatListLoadingDelegateImpl, "chatListLoadingDelegateImpl");
        this.f90693a = chatListLoadingDelegateImpl;
        this.f90694b = chatListEventDelegateImpl;
        this.f90695c = controller;
        this.f90696d = repository;
        this.f90697e = draftsLoader;
        this.f90698f = getSocketEventsUseCase;
        this.f90699g = mapBlockUpdateUseCase;
        this.f90700h = reducer;
        this.f90701i = blockVOtoItemVOMapper;
        this.f90702j = iVar;
        this.f90703k = alertBlockFactory;
        this.f90704l = actionRepository;
        this.f90705m = noInternetNotificationOrEmptyScreenConditionFactory;
        this.f90706n = noInternetNotificationPresenter;
        this.f90707o = blocksItemMapperProvider;
        this.f90708p = jsonDeserializer;
        this.f90709q = reducer.getState();
        EnumC11113a enumC11113a = EnumC11113a.DROP_OLDEST;
        this.f90710r = E0.a(1, 1, enumC11113a);
        this.f90711s = O0.a(a.b.f90469a);
        int i11 = 0;
        this.f90712t = E0.b(0, 1, enumC11113a, 1);
        this.f90713u = new Q(this);
        this.f90714v = O0.a(b.a.f86160a);
        this.f90715w = new S(this);
        this.f90716x = E0.b(0, 1, enumC11113a, 1);
        this.f90717y = new androidx.lifecycle.G() { // from class: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.u
            @Override // androidx.lifecycle.G
            public final void onStateChanged(androidx.lifecycle.J j11, AbstractC5434v.a aVar) {
                C9509v.d0(C9509v.this, j11, aVar);
            }
        };
        this.f90692D = ru.ozon.android.messenger.utils.f.b(new E(this));
        AbstractC9507t[] abstractC9507tArr = {chatListLoadingDelegateImpl, chatListEventDelegateImpl};
        while (i11 < 2) {
            AbstractC9507t abstractC9507t = abstractC9507tArr[i11];
            C6788a scope = androidx.lifecycle.x0.a(this);
            abstractC9507t.getClass();
            Intrinsics.checkNotNullParameter(scope, "scope");
            ru.ozon.android.messenger.framework.presentation.chatlist.d dVar = this.f90700h;
            String str2 = str;
            Intrinsics.checkNotNullParameter(dVar, str2);
            Intrinsics.checkNotNullParameter(scope, "<set-?>");
            abstractC9507t.f90686a = scope;
            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
            abstractC9507t.f90687b = dVar;
            i11++;
            str = str2;
        }
        B0 b02 = this.f90689A;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new O(this, null), 3);
        }
    }

    public static final void A0(C9509v c9509v, Map map) {
        ru.ozon.android.messenger.framework.analytics.i iVar;
        c9509v.getClass();
        MessengerTrackingInfo messengerTrackingInfo = (MessengerTrackingInfo) map.get("view");
        if (messengerTrackingInfo == null || (iVar = c9509v.f90702j) == null) {
            return;
        }
        ru.ozon.android.messenger.framework.analytics.h.f(iVar, kotlin.collections.U.i(new Pair("view", messengerTrackingInfo)));
    }

    public static final void B0(C9509v c9509v, ru.ozon.android.messenger.utils.i iVar, ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        Map<String, String> params;
        c9509v.getClass();
        boolean z11 = iVar instanceof i.b;
        C0 c02 = c9509v.f90712t;
        if (z11) {
            ru.ozon.android.messenger.framework.presentation.models.responses.b bVar = (ru.ozon.android.messenger.framework.presentation.models.responses.b) ((i.b) iVar).b();
            if (bVar != null) {
                c02.tryEmit(new NotificationDTO(bVar.b(), bVar.a(), null, Integer.MAX_VALUE, null, null, null, null, null, NotificationDTO.Preset.SUCCESS, 468, null));
            } else {
                Lm0.a.f17149a.w("Incorrect or empty action response", new Object[0]);
            }
        }
        if (iVar instanceof i.a) {
            AtomActionDTO b11 = aVar.b();
            NotificationDTO notificationDTO = null;
            if (b11 == null || (params = b11.getParams()) == null) {
                AtomAction c11 = aVar.c();
                AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                params = click != null ? click.getParams() : null;
            }
            if (params == null) {
                Lm0.a.f17149a.e("Error notification params not found", new Object[0]);
                return;
            }
            String str = (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.ERROR_TITLE.a(), params);
            if (str == null) {
                Lm0.a.f17149a.e("Required params for error notification not found", new Object[0]);
            } else {
                notificationDTO = new NotificationDTO(str, (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.ERROR_SUBTITLE.a(), params), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
            }
            if (notificationDTO == null) {
                return;
            }
            c02.tryEmit(notificationDTO);
        }
    }

    public static final void C0(C9509v c9509v) {
        c9509v.f90693a.k(false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019d, code lost:
    
        if (r7 == r1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G0(ru.ozon.android.messenger.framework.navigation.action.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        e eVar;
        int i11;
        C9509v c9509v;
        Unit unit;
        ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.c cVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i12 = eVar.f90728h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f90728h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f90726f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f90728h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    String id2 = aVar.getId();
                    if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.g.SEND_RATE_MESSENGER.a()) || Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.g.SEND_RATE_MESSENGER_ON_DISMISS.a())) {
                        eVar.f90724d = this;
                        eVar.f90725e = aVar;
                        eVar.f90728h = 1;
                        obj = this.f90704l.k(aVar, eVar);
                        if (obj != aVar2) {
                            c9509v = this;
                            ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
                            if (!Intrinsics.d(aVar.getId(), ru.ozon.android.messenger.framework.navigation.action.g.SEND_RATE_MESSENGER_ON_DISMISS.a())) {
                            }
                        }
                    } else {
                        boolean d11 = Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.g.SET_ON_HIDE_CALLBACK.a());
                        C0 c02 = this.f90710r;
                        if (d11) {
                            c02.tryEmit(new f.a((ru.ozon.android.messenger.framework.navigation.action.a) ru.ozon.android.messenger.framework.navigation.action.b.a(g.b.ON_HIDE_ACTION.a(), aVar.d())));
                        } else if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.g.DELETE_ON_HIDE_CALLBACK.a())) {
                            c02.tryEmit(f.b.f90539a);
                        } else if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.g.HIDE.a())) {
                            c02.tryEmit(f.c.f90540a);
                        } else {
                            boolean d12 = Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.g.UPDATE_POP_UP_CONTENT.a());
                            ru.ozon.android.messenger.framework.presentation.chatlist.d dVar2 = this.f90700h;
                            if (d12) {
                                Map map = (Map) ru.ozon.android.messenger.framework.navigation.action.b.a(g.b.BLOCKS_MAP.a(), aVar.d());
                                ArrayList arrayList = new ArrayList();
                                for (Map.Entry entry : map.entrySet()) {
                                    arrayList.add(this.f90701i.a((ru.ozon.android.messenger.framework.presentation.models.g) entry.getKey(), (ru.ozon.android.messenger.framework.domain.f) entry.getValue()));
                                }
                                dVar2.a(new f(arrayList));
                            } else if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.g.REMOVE_POP_UP_BLOCKS.a())) {
                                dVar2.a(g.f90730b);
                            } else if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.g.SHOW_POP_UP_ALERT.a())) {
                                c02.tryEmit(new f.e((String) ru.ozon.android.messenger.framework.navigation.action.b.a(g.b.POP_UP_ALERT_TITLE.a(), aVar.d())));
                            } else if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.g.HIDE_POP_UP_ALERT.a())) {
                                c02.tryEmit(f.d.f90541a);
                            } else if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.g.REQUEST_HEIGHT.a())) {
                                c02.tryEmit(ru.ozon.android.messenger.framework.navigation.action.b.a(g.b.NEW_HEIGHT.a(), aVar.d()));
                            } else if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.g.READ_ALL_IN_CHAT_ACTION.a()) || Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.g.READ_ALL_CHATS_ACTION.a())) {
                                eVar.f90728h = 2;
                                if (aVar.c() instanceof AtomAction.Click) {
                                    K0(new A(aVar, this, null));
                                    unit = Unit.f71690a;
                                } else {
                                    unit = Unit.f71690a;
                                }
                            }
                        }
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                aVar = eVar.f90725e;
                c9509v = eVar.f90724d;
                Sc.s.b(obj);
                ru.ozon.android.messenger.utils.i iVar2 = (ru.ozon.android.messenger.utils.i) obj;
                if (!Intrinsics.d(aVar.getId(), ru.ozon.android.messenger.framework.navigation.action.g.SEND_RATE_MESSENGER_ON_DISMISS.a())) {
                    if ((iVar2 instanceof i.b) && (cVar = (ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.c) ((i.b) iVar2).b()) != null && !(c9509v.f90714v.getValue() instanceof b.C1520b)) {
                        boolean z11 = cVar instanceof c.b;
                        C0 c03 = c9509v.f90710r;
                        if (z11) {
                            c03.tryEmit(f.c.f90540a);
                            c9509v.f90714v.tryEmit(new b.C1520b(cVar));
                        } else {
                            if (!(cVar instanceof c.a)) {
                                throw new Sc.o();
                            }
                            String a11 = ((c.a) cVar).a();
                            if (a11 == null) {
                                a11 = "";
                            }
                            c03.tryEmit(new f.e(a11));
                        }
                    }
                    if (iVar2 instanceof i.a) {
                        c9509v.f90710r.tryEmit(new f.e(((i.a) iVar2).c()));
                    }
                }
                return Unit.f71690a;
            }
        }
        eVar = new e(dVar);
        Object obj2 = eVar.f90726f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f90728h;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    private final void K0(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1) {
        if (this.f90696d.E().getValue() instanceof NetworkInfo.Available) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new i(function1, null), 3);
        } else {
            this.f90712t.tryEmit(this.f90706n.b());
        }
    }

    public static void d0(C9509v c9509v, androidx.lifecycle.J j11, AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(j11, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i11 = a.f90719a[event.ordinal()];
        if (i11 == 1) {
            c9509v.getClass();
            c9509v.f90690B = C10727i.c(androidx.lifecycle.x0.a(c9509v), null, null, new N(c9509v, null), 3);
            B0 b02 = c9509v.f90718z;
            if (b02 == null || !((AbstractC10711a) b02).isActive()) {
                c9509v.f90718z = C10727i.c(androidx.lifecycle.x0.a(c9509v), null, null, new G(c9509v, null), 3);
            }
            ru.ozon.android.messenger.framework.presentation.chatlist.v vVar = c9509v.f90691C;
            c9509v.D0(!c9509v.f90709q.getValue().k().isEmpty(), vVar != null ? new GetChatsRequest.Filter(vVar.a(), vVar.c(), vVar.b()) : null);
            return;
        }
        if (i11 != 2) {
            return;
        }
        B0 b03 = c9509v.f90690B;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
        B0 b04 = c9509v.f90718z;
        if (b04 != null) {
            ((H0) b04).j(null);
        }
        c9509v.f90690B = null;
        c9509v.f90718z = null;
        b7.d.a();
    }

    public static final void e0(C9509v c9509v) {
        B0 b02 = c9509v.f90689A;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        c9509v.f90689A = C10727i.c(androidx.lifecycle.x0.a(c9509v), null, null, new w(c9509v, null), 3);
    }

    public static final ru.ozon.android.messenger.framework.presentation.chatlist.f q0(C9509v c9509v) {
        return c9509v.f90709q.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.List] */
    public static final Object v0(C9509v c9509v, d.f fVar, kotlin.coroutines.d dVar) {
        String str;
        Map<String, String> c11;
        String str2;
        List<ru.ozon.android.messenger.framework.presentation.models.q> list;
        Iterator it;
        Iterator it2;
        Map<String, String> params;
        c9509v.getClass();
        String id2 = fVar.a().getId();
        boolean d11 = Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.d.CHAT_GROUP_SELECTED.a());
        M0<ru.ozon.android.messenger.framework.presentation.chatlist.f> m02 = c9509v.f90709q;
        if (d11) {
            AtomActionDTO b11 = fVar.a().b();
            String str3 = (b11 == null || (params = b11.getParams()) == null) ? null : params.get(d.c.SELECTED_CHAT_GROUP_ID.a());
            if (str3 != null) {
                ru.ozon.android.messenger.blocks.chatGroups.grouplist.m a11 = ru.ozon.android.messenger.framework.presentation.chatlist.i.a(m02.getValue());
                if (!str3.equals(a11 != null ? a11.c() : null)) {
                    c9509v.f90700h.a(new P(c9509v, new d.w(new j.b(str3))));
                    InterfaceC9499k.a.a(c9509v, InterfaceC9499k.b.REFRESH, 0, 0, 12);
                }
            }
        } else if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.d.OPEN_MESSENGER_DISCLAIMER_MODAL.a())) {
            c9509v.K0(new x(c9509v, fVar, null));
        } else if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.d.DISMISS_MESSENGER_DISCLAIMER_MODAL.a())) {
            c9509v.f90711s.tryEmit(a.C1678a.f90468a);
        } else if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.d.CHAT_ACTION_WITH_SUCCESS_MESSAGE.a())) {
            c9509v.K0(new y(c9509v, fVar, null));
        } else {
            if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.d.ONBOARDING_HIDDEN.a())) {
                Object j11 = c9509v.f90704l.j(fVar.a(), dVar);
                return j11 == Wc.a.COROUTINE_SUSPENDED ? j11 : Unit.f71690a;
            }
            boolean d12 = Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.d.OPEN_SEARCH.a());
            C0 c02 = c9509v.f90716x;
            if (d12) {
                List<ru.ozon.android.messenger.framework.presentation.models.q> f7 = m02.getValue().f();
                List<ru.ozon.android.messenger.framework.presentation.models.q> f11 = m02.getValue().f();
                Intrinsics.checkNotNullParameter(f11, "<this>");
                ArrayList arrayList = new ArrayList();
                for (Object obj : f11) {
                    ru.ozon.android.messenger.framework.presentation.models.u uVar = (ru.ozon.android.messenger.framework.presentation.models.u) C7714v.M(((ru.ozon.android.messenger.framework.presentation.models.q) obj).b());
                    if ((uVar != null ? uVar.c() : null) instanceof ru.ozon.android.messenger.blocks.chatGroups.grouplist.m) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) it3.next();
                    for (ru.ozon.android.messenger.framework.presentation.models.u uVar2 : qVar.b()) {
                        if (uVar2.c() instanceof ru.ozon.android.messenger.blocks.chatGroups.grouplist.m) {
                            ru.ozon.android.messenger.framework.presentation.models.g c12 = uVar2.c();
                            Intrinsics.g(c12, "null cannot be cast to non-null type ru.ozon.android.messenger.blocks.chatGroups.grouplist.ChatGroupListVO");
                            ru.ozon.android.messenger.blocks.chatGroups.grouplist.m mVar = (ru.ozon.android.messenger.blocks.chatGroups.grouplist.m) c12;
                            List<ru.ozon.android.messenger.framework.presentation.models.q> b12 = mVar.b();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : b12) {
                                List<ru.ozon.android.messenger.framework.presentation.models.u> b13 = ((ru.ozon.android.messenger.framework.presentation.models.q) obj2).b();
                                if (!(b13 instanceof Collection) || !b13.isEmpty()) {
                                    Iterator it4 = b13.iterator();
                                    while (it4.hasNext()) {
                                        ru.ozon.android.messenger.framework.presentation.models.g c13 = ((ru.ozon.android.messenger.framework.presentation.models.u) it4.next()).c();
                                        ru.ozon.android.messenger.blocks.chatGroups.a aVar = c13 instanceof ru.ozon.android.messenger.blocks.chatGroups.a ? (ru.ozon.android.messenger.blocks.chatGroups.a) c13 : null;
                                        if (aVar != null && aVar.d()) {
                                        }
                                    }
                                }
                                arrayList3.add(obj2);
                            }
                            Pair pair = new Pair(uVar2, ru.ozon.android.messenger.framework.presentation.models.u.a(uVar2, ru.ozon.android.messenger.blocks.chatGroups.grouplist.m.a(mVar, arrayList3, null, 13)));
                            ru.ozon.android.messenger.framework.presentation.models.u uVar3 = (ru.ozon.android.messenger.framework.presentation.models.u) pair.a();
                            ru.ozon.android.messenger.framework.presentation.models.u uVar4 = (ru.ozon.android.messenger.framework.presentation.models.u) pair.b();
                            List<ru.ozon.android.messenger.framework.presentation.models.u> b14 = qVar.b();
                            ArrayList arrayList4 = new ArrayList(C7714v.z(b14, 10));
                            for (ru.ozon.android.messenger.framework.presentation.models.u uVar5 : b14) {
                                if (Intrinsics.d(uVar5, uVar3)) {
                                    uVar5 = uVar4;
                                }
                                arrayList4.add(uVar5);
                            }
                            Iterator it5 = arrayList4.iterator();
                            int i11 = 0;
                            while (true) {
                                if (!it5.hasNext()) {
                                    i11 = -1;
                                    break;
                                }
                                if (((ru.ozon.android.messenger.framework.presentation.models.u) it5.next()).c() instanceof ru.ozon.android.messenger.blocks.chatGroups.grouplist.m) {
                                    break;
                                }
                                i11++;
                            }
                            if (i11 >= 0) {
                                ru.ozon.android.messenger.framework.presentation.models.u uVar6 = (ru.ozon.android.messenger.framework.presentation.models.u) arrayList4.get(i11);
                                ru.ozon.android.messenger.framework.presentation.models.g c14 = uVar6.c();
                                Intrinsics.g(c14, "null cannot be cast to non-null type ru.ozon.android.messenger.blocks.chatGroups.grouplist.ChatGroupListVO");
                                ru.ozon.android.messenger.blocks.chatGroups.grouplist.m mVar2 = (ru.ozon.android.messenger.blocks.chatGroups.grouplist.m) c14;
                                List<ru.ozon.android.messenger.framework.presentation.models.q> b15 = mVar2.b();
                                if (!(b15 instanceof Collection) || !b15.isEmpty()) {
                                    Iterator it6 = b15.iterator();
                                    while (it6.hasNext()) {
                                        List<ru.ozon.android.messenger.framework.presentation.models.u> b16 = ((ru.ozon.android.messenger.framework.presentation.models.q) it6.next()).b();
                                        if (!(b16 instanceof Collection) || !b16.isEmpty()) {
                                            Iterator it7 = b16.iterator();
                                            while (it7.hasNext()) {
                                                ru.ozon.android.messenger.framework.presentation.models.g c15 = ((ru.ozon.android.messenger.framework.presentation.models.u) it7.next()).c();
                                                ru.ozon.android.messenger.blocks.chatGroups.a aVar2 = c15 instanceof ru.ozon.android.messenger.blocks.chatGroups.a ? (ru.ozon.android.messenger.blocks.chatGroups.a) c15 : null;
                                                if (aVar2 != null && aVar2.g()) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!mVar2.b().isEmpty()) {
                                    ru.ozon.android.messenger.framework.presentation.models.q qVar2 = (ru.ozon.android.messenger.framework.presentation.models.q) C7714v.K(mVar2.b());
                                    List<ru.ozon.android.messenger.framework.presentation.models.u> b17 = qVar2.b();
                                    ArrayList arrayList5 = new ArrayList(C7714v.z(b17, 10));
                                    for (ru.ozon.android.messenger.framework.presentation.models.u uVar7 : b17) {
                                        ru.ozon.android.messenger.framework.presentation.models.g c16 = uVar7.c();
                                        List<ru.ozon.android.messenger.framework.presentation.models.q> list2 = f7;
                                        ru.ozon.android.messenger.blocks.chatGroups.a aVar3 = c16 instanceof ru.ozon.android.messenger.blocks.chatGroups.a ? (ru.ozon.android.messenger.blocks.chatGroups.a) c16 : null;
                                        if (aVar3 != null) {
                                            it2 = it3;
                                            uVar7 = ru.ozon.android.messenger.framework.presentation.models.u.a(uVar7, ru.ozon.android.messenger.blocks.chatGroups.a.a(aVar3, true, 2031));
                                        } else {
                                            it2 = it3;
                                        }
                                        arrayList5.add(uVar7);
                                        f7 = list2;
                                        it3 = it2;
                                    }
                                    list = f7;
                                    it = it3;
                                    ru.ozon.android.messenger.framework.presentation.models.u a12 = ru.ozon.android.messenger.framework.presentation.models.u.a(uVar6, ru.ozon.android.messenger.blocks.chatGroups.grouplist.m.a(mVar2, C7714v.p0(C7714v.D(mVar2.b(), 1), C7714v.a0(ru.ozon.android.messenger.framework.presentation.models.q.a(qVar2, arrayList5, null, 2))), ru.ozon.android.messenger.framework.presentation.models.r.d(qVar2), 9));
                                    arrayList4 = C7714v.W0(arrayList4);
                                    arrayList4.set(i11, a12);
                                    arrayList2.add(ru.ozon.android.messenger.framework.presentation.models.q.a(qVar, arrayList4, null, 2));
                                    f7 = list;
                                    it3 = it;
                                }
                            }
                            list = f7;
                            it = it3;
                            arrayList2.add(ru.ozon.android.messenger.framework.presentation.models.q.a(qVar, arrayList4, null, 2));
                            f7 = list;
                            it3 = it;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                List<ru.ozon.android.messenger.framework.presentation.models.q> list3 = f7;
                ArrayList arrayList6 = new ArrayList(C7714v.z(arrayList2, 10));
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    ru.ozon.android.messenger.framework.presentation.models.q qVar3 = (ru.ozon.android.messenger.framework.presentation.models.q) it8.next();
                    List<ru.ozon.android.messenger.framework.presentation.models.u> b18 = qVar3.b();
                    ArrayList arrayList7 = new ArrayList(C7714v.z(b18, 10));
                    for (ru.ozon.android.messenger.framework.presentation.models.u uVar8 : b18) {
                        ru.ozon.android.messenger.framework.presentation.models.g c17 = uVar8.c();
                        if (c17 instanceof ru.ozon.android.messenger.blocks.chatGroups.grouplist.m) {
                            uVar8 = ru.ozon.android.messenger.framework.presentation.models.u.a(uVar8, ru.ozon.android.messenger.blocks.chatGroups.grouplist.m.a((ru.ozon.android.messenger.blocks.chatGroups.grouplist.m) c17, null, null, 7));
                        }
                        arrayList7.add(uVar8);
                    }
                    arrayList6.add(ru.ozon.android.messenger.framework.presentation.models.q.a(qVar3, arrayList7, null, 2));
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj3 : list3) {
                    ru.ozon.android.messenger.framework.presentation.models.u uVar9 = (ru.ozon.android.messenger.framework.presentation.models.u) C7714v.M(((ru.ozon.android.messenger.framework.presentation.models.q) obj3).b());
                    if ((uVar9 != null ? uVar9.c() : null) instanceof ru.ozon.android.messenger.blocks.chatlistheader.f) {
                        arrayList8.add(obj3);
                    }
                }
                ArrayList arrayList9 = new ArrayList();
                Iterator it9 = arrayList8.iterator();
                while (it9.hasNext()) {
                    Object next = it9.next();
                    ru.ozon.android.messenger.framework.presentation.models.u uVar10 = (ru.ozon.android.messenger.framework.presentation.models.u) C7714v.M(((ru.ozon.android.messenger.framework.presentation.models.q) next).b());
                    ru.ozon.android.messenger.framework.presentation.models.g c18 = uVar10 != null ? uVar10.c() : null;
                    ru.ozon.android.messenger.blocks.chatlistheader.f fVar2 = c18 instanceof ru.ozon.android.messenger.blocks.chatlistheader.f ? (ru.ozon.android.messenger.blocks.chatlistheader.f) c18 : null;
                    if ((fVar2 != null ? fVar2.d() : null) instanceof f.c.a) {
                        arrayList9.add(next);
                    }
                }
                if (arrayList9.isEmpty()) {
                    ru.ozon.android.messenger.framework.navigation.action.a a13 = fVar.a();
                    AtomAction c19 = a13.c();
                    if ((c19 instanceof AtomAction.Click ? (AtomAction.Click) c19 : null) == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Map<String, String> params2 = ((AtomAction.Click) a13.c()).getParams();
                    if (params2 == null || (str2 = (String) ru.ozon.android.messenger.framework.navigation.action.b.b("chatListHeader", params2)) == null) {
                        throw new IllegalStateException("Param with key chatListHeader cannot be found");
                    }
                    ru.ozon.android.messenger.framework.presentation.models.q f12 = ((ru.ozon.android.messenger.framework.data.remote.mapper.a) c9509v.f90707o.get()).f(null, (ItemDTO) c9509v.f90708p.fromJson(str2, ItemDTO.class));
                    ArrayList a02 = f12 != null ? C7714v.a0(f12) : null;
                    arrayList9 = a02 == null ? kotlin.collections.K.f71697a : a02;
                }
                c02.tryEmit(new j.b(new ru.ozon.android.messenger.framework.navigation.args.a(C7714v.p0(arrayList6, arrayList9))));
            } else if (Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.d.REPORT_ABUSE_FORM.a())) {
                AtomActionDTO b19 = fVar.a().b();
                if (b19 == null || (str = b19.getLink()) == null) {
                    AtomAction c21 = fVar.a().c();
                    AtomAction.Click click = c21 instanceof AtomAction.Click ? (AtomAction.Click) c21 : null;
                    String link = click != null ? click.getLink() : null;
                    if (link == null) {
                        return Unit.f71690a;
                    }
                    str = link;
                }
                AtomActionDTO b21 = fVar.a().b();
                if (b21 == null || (c11 = b21.getParams()) == null) {
                    AtomAction c22 = fVar.a().c();
                    AtomAction.Click click2 = c22 instanceof AtomAction.Click ? (AtomAction.Click) c22 : null;
                    Map<String, String> params3 = click2 != null ? click2.getParams() : null;
                    c11 = params3 == null ? kotlin.collections.U.c() : params3;
                }
                String str4 = c11.get("bodyParams");
                if (str4 == null) {
                    str4 = "";
                }
                try {
                    JSONObject jSONObject = new JSONObject(str4);
                    Iterator<String> keys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                    C7741a b22 = kotlin.sequences.l.b(keys);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it10 = b22.iterator();
                    while (it10.hasNext()) {
                        Object next2 = it10.next();
                        linkedHashMap.put(next2, jSONObject.getString((String) next2));
                    }
                    c11 = linkedHashMap;
                } catch (Exception unused) {
                }
                c02.tryEmit(new j.a(str, c11));
            } else {
                if (!Intrinsics.d(id2, ru.ozon.android.messenger.framework.navigation.action.d.CHAT_GET_CURTAIN_MODAL.a())) {
                    Object G02 = c9509v.G0(fVar.a(), dVar);
                    return G02 == Wc.a.COROUTINE_SUSPENDED ? G02 : Unit.f71690a;
                }
                c9509v.K0(new z(c9509v, fVar, null));
            }
        }
        return Unit.f71690a;
    }

    public static final void w0(C9509v c9509v, Map map) {
        ru.ozon.android.messenger.framework.analytics.i iVar = c9509v.f90702j;
        if (iVar != null) {
            ru.ozon.android.messenger.framework.analytics.h.d(iVar, map);
        }
    }

    public static final void x0(C9509v c9509v, Map map) {
        ru.ozon.android.messenger.framework.analytics.i iVar;
        c9509v.getClass();
        MessengerTrackingInfo messengerTrackingInfo = (MessengerTrackingInfo) map.get("click");
        if (messengerTrackingInfo == null || (iVar = c9509v.f90702j) == null) {
            return;
        }
        ru.ozon.android.messenger.framework.analytics.h.e(iVar, kotlin.collections.U.i(new Pair("click", messengerTrackingInfo)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public static final void z0(C9509v c9509v) {
        ((ru.ozon.android.messenger.framework.presentation.common.notification.d) c9509v.f90692D.getValue()).a(null, new B(c9509v), new D(c9509v));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean A() {
        this.f90693a.getClass();
        return false;
    }

    public final void D0(boolean z11, GetChatsRequest.Filter filter) {
        this.f90693a.k(z11, filter);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s
    @NotNull
    public final Function0<Unit> E() {
        return this.f90715w;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.navigation.controller.b E0() {
        return this.f90695c;
    }

    public final void F0(@NotNull ru.ozon.android.messenger.framework.presentation.models.q newItem, @NotNull ru.ozon.android.messenger.framework.presentation.models.x place, String str, ru.ozon.android.messenger.framework.presentation.models.q qVar, @NotNull ru.ozon.android.messenger.blocks.input.b draftVO) {
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Intrinsics.checkNotNullParameter(place, "place");
        Intrinsics.checkNotNullParameter(draftVO, "draftVO");
        this.f90694b.h(newItem, place, str, qVar, draftVO);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final void G() {
        this.f90693a.getClass();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final void H() {
        this.f90693a.H();
    }

    public final void H0(@NotNull d.q event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f90693a.l(event);
    }

    public final void I0(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        C9490b c9490b = this.f90694b;
        c9490b.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        c9490b.a().a(new C9494f(id2));
    }

    public final void J0(@NotNull ru.ozon.android.messenger.framework.presentation.models.q updatedItem, ru.ozon.android.messenger.framework.presentation.models.q qVar, @NotNull ru.ozon.android.messenger.blocks.input.b draftVO) {
        Intrinsics.checkNotNullParameter(updatedItem, "updatedItem");
        Intrinsics.checkNotNullParameter(draftVO, "draftVO");
        C9490b c9490b = this.f90694b;
        c9490b.getClass();
        Intrinsics.checkNotNullParameter(updatedItem, "updatedItem");
        Intrinsics.checkNotNullParameter(draftVO, "draftVO");
        c9490b.a().a(new C9496h(c9490b, updatedItem, qVar, draftVO));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.f.b
    public final void K() {
        this.f90700h.a(d.f90723b);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s
    @NotNull
    public final M0<ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a> M() {
        return C2399j.b(this.f90711s);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s
    public final C9508u P() {
        return this.f90717y;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean S() {
        return this.f90693a.S();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s
    @NotNull
    public final Function0<Unit> U() {
        return this.f90713u;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.u
    public final boolean Y() {
        return this.f90693a.Y();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.f.b
    public final void a(ru.ozon.android.messenger.framework.presentation.chatlist.v vVar) {
        this.f90691C = vVar;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.common.view.recycler.u c() {
        return this.f90693a.c();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.f.b
    public final void c0() {
        this.f90700h.a(b.f90720b);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new c(null), 3);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s
    @NotNull
    public final Ae.B0<NotificationDTO> d() {
        return C2399j.a(this.f90712t);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s
    public final ru.ozon.android.messenger.framework.navigation.controller.a getController() {
        return this.f90695c;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s
    @NotNull
    public final M0<ru.ozon.android.messenger.framework.presentation.chatlist.f> getUiState() {
        return this.f90709q;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s
    @NotNull
    public final InterfaceC2395h<ru.ozon.android.messenger.framework.presentation.chatlist.popup.f> j() {
        return C2399j.a(this.f90710r);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s
    @NotNull
    public final M0<ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.b> s() {
        return C2399j.b(this.f90714v);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s
    @NotNull
    public final C0 v() {
        return this.f90716x;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.f.b
    public final void x() {
        this.f90700h.a(h.f90731b);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9499k
    @NotNull
    public final B0 y(@NotNull InterfaceC9499k.b loadType, int i11, boolean z11, int i12, boolean z12) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        return this.f90693a.y(loadType, i11, z11, i12, z12);
    }
}
