package ru.ozon.android.messenger.framework.presentation.chatlist;

import Ae.C0;
import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.L;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.b;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a;
import ru.ozon.android.messenger.framework.presentation.chatlist.j;
import ru.ozon.android.messenger.framework.presentation.chatlist.k;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.C9509v;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.U;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.MessengerMetricsRecyclerView;
import ru.ozon.android.messenger.framework.presentation.search.C9516a;
import ru.ozon.android.messenger.utils.m;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.databinding.MFragmentChatListBinding;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/android/messenger/framework/presentation/chatlist/a;", "Lru/ozon/android/messenger/framework/presentation/common/screen/i;", "Lru/ozon/app/android/messenger/databinding/MFragmentChatListBinding;", "<init>", "()V", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9488a extends ru.ozon.android.messenger.framework.presentation.common.screen.i<MFragmentChatListBinding> {

    /* renamed from: c, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.core.initialization.d f90417c;

    /* renamed from: d, reason: collision with root package name */
    public U f90418d;

    /* renamed from: e, reason: collision with root package name */
    public k.a f90419e;

    /* renamed from: f, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.data.b f90420f;

    /* renamed from: g, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.navigation.d f90421g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final y0 f90422h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final y0 f90423i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final y0 f90424j;

    /* renamed from: k, reason: collision with root package name */
    private ru.ozon.android.messenger.framework.presentation.chatlist.k f90425k;

    /* renamed from: l, reason: collision with root package name */
    private ru.ozon.android.messenger.framework.presentation.models.c f90426l;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$a, reason: collision with other inner class name */
    /* synthetic */ class C1673a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MFragmentChatListBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1673a f90427a = new C1673a(3, MFragmentChatListBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MFragmentChatListBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MFragmentChatListBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MFragmentChatListBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$b */
    static final class b extends AbstractC7737t implements Function0<B0> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            ComponentCallbacksC5392m requireParentFragment = C9488a.this.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(requireParentFragment, "requireParentFragment(...)");
            return requireParentFragment;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.ChatListFragment$onViewCreated$$inlined$observe$1", f = "ChatListFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$c */
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f90429d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f90430e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.core.d dVar2) {
            super(2, dVar);
            this.f90430e = dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(dVar, this.f90430e);
            cVar.f90429d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.b bVar = (ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.b) this.f90429d;
            if (bVar instanceof b.C1520b) {
                ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.c disclaimerModalResponseVO = ((b.C1520b) bVar).a();
                Intrinsics.checkNotNullParameter(disclaimerModalResponseVO, "disclaimerModalResponseVO");
                ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.a aVar2 = new ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.a();
                Bundle bundle = new Bundle();
                bundle.putParcelable("RATE_MESSENGER_SUCCESS_MODAL_KEY", disclaimerModalResponseVO);
                aVar2.setArguments(bundle);
                aVar2.show(this.f90430e.d().getChildFragmentManager(), ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.a.class.getSimpleName());
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.ChatListFragment$onViewCreated$$inlined$observe$2", f = "ChatListFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$d */
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<NotificationDTO, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f90431d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9488a f90432e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.coroutines.d dVar, C9488a c9488a) {
            super(2, dVar);
            this.f90432e = c9488a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(dVar, this.f90432e);
            dVar2.f90431d = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NotificationDTO notificationDTO, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(notificationDTO, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            NotificationDTO notificationDTO = (NotificationDTO) this.f90431d;
            C9488a c9488a = this.f90432e;
            ConstraintLayout chatListRootCl = C9488a.u(c9488a).chatListRootCl;
            Intrinsics.checkNotNullExpressionValue(chatListRootCl, "chatListRootCl");
            NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(chatListRootCl, null, 1, null);
            if (asNotificationLayoutManager$default != null) {
                NotificationBar.Companion companion = NotificationBar.INSTANCE;
                J viewLifecycleOwner = c9488a.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, notificationDTO, viewLifecycleOwner, null, 8, null).show();
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.ChatListFragment$onViewCreated$$inlined$observe$3", f = "ChatListFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$e */
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<ru.ozon.android.messenger.framework.presentation.chatlist.j, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f90433d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9488a f90434e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f90435f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.core.d dVar2, C9488a c9488a) {
            super(2, dVar);
            this.f90434e = c9488a;
            this.f90435f = dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = new e(dVar, this.f90435f, this.f90434e);
            eVar.f90433d = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ru.ozon.android.messenger.framework.presentation.chatlist.j jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(jVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            ru.ozon.android.messenger.framework.presentation.chatlist.j jVar = (ru.ozon.android.messenger.framework.presentation.chatlist.j) this.f90433d;
            boolean z11 = jVar instanceof j.b;
            ru.ozon.android.messenger.framework.core.d dVar = this.f90435f;
            C9488a c9488a = this.f90434e;
            if (z11) {
                if (c9488a.f90421g == null) {
                    Intrinsics.n("chatRouter");
                    throw null;
                }
                ComponentCallbacksC5392m fragment = dVar.d();
                ru.ozon.android.messenger.framework.navigation.args.a args = ((j.b) jVar).a();
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(args, "args");
                G parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                Q p11 = parentFragmentManager.p();
                p11.t(0, 0, 0, 0);
                int i11 = R$id.fragmentChatContainer;
                Intrinsics.checkNotNullParameter(args, "args");
                C9516a c9516a = new C9516a();
                c9516a.setArguments(androidx.core.os.d.b(new Pair("CHAT_SEARCH_ARGS", args)));
                p11.r(i11, c9516a, "null");
                p11.g("null");
                p11.i();
            } else if (jVar instanceof j.a) {
                ru.ozon.android.messenger.framework.navigation.d dVar2 = c9488a.f90421g;
                if (dVar2 == null) {
                    Intrinsics.n("chatRouter");
                    throw null;
                }
                j.a aVar2 = (j.a) jVar;
                dVar2.d(aVar2.b(), aVar2.a());
            } else {
                if (!(jVar instanceof j.c)) {
                    throw new Sc.o();
                }
                if (c9488a.f90421g == null) {
                    Intrinsics.n("chatRouter");
                    throw null;
                }
                ru.ozon.android.messenger.framework.navigation.d.e(dVar.d(), ((j.c) jVar).a());
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.ChatListFragment$onViewCreated$1", f = "ChatListFragment.kt", l = {119}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$f */
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90436d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9488a f90437e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f90438f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.ChatListFragment$onViewCreated$1$1", f = "ChatListFragment.kt", l = {120}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$f$a, reason: collision with other inner class name */
        static final class C1674a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f90439d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C9488a f90440e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ru.ozon.android.messenger.framework.core.d f90441f;

            /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$f$a$a, reason: collision with other inner class name */
            static final class C1675a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C9488a f90442a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ru.ozon.android.messenger.framework.core.d f90443b;

                C1675a(C9488a c9488a, ru.ozon.android.messenger.framework.core.d dVar) {
                    this.f90442a = c9488a;
                    this.f90443b = dVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    List<ru.ozon.android.messenger.framework.presentation.models.q> h11 = ((ru.ozon.android.messenger.framework.presentation.chatlist.f) obj).h();
                    ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) C7714v.M(h11);
                    ru.ozon.android.messenger.framework.presentation.models.g b11 = qVar != null ? ru.ozon.android.messenger.framework.presentation.models.r.b(qVar) : null;
                    ru.ozon.android.messenger.framework.presentation.models.c blockId = b11 != null ? b11.getBlockId() : null;
                    if (!h11.isEmpty()) {
                        C9488a c9488a = this.f90442a;
                        if (!Intrinsics.d(c9488a.f90426l, blockId)) {
                            c9488a.f90426l = blockId;
                            boolean z11 = b11 instanceof ru.ozon.android.messenger.blocks.curtain.c;
                            ru.ozon.android.messenger.framework.core.d dVar2 = this.f90443b;
                            if (!z11) {
                                new ru.ozon.android.messenger.framework.presentation.chatlist.popup.c().show(dVar2.d().getChildFragmentManager(), ru.ozon.android.messenger.framework.presentation.chatlist.popup.c.class.getSimpleName());
                            } else {
                                if (c9488a.f90421g == null) {
                                    Intrinsics.n("chatRouter");
                                    throw null;
                                }
                                ru.ozon.android.messenger.framework.navigation.d.e(dVar2.d(), (ru.ozon.android.messenger.blocks.curtain.c) b11);
                            }
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1674a(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.core.d dVar2, C9488a c9488a) {
                super(2, dVar);
                this.f90440e = c9488a;
                this.f90441f = dVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1674a(dVar, this.f90441f, this.f90440e);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1674a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f90439d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C9488a c9488a = this.f90440e;
                    M0<ru.ozon.android.messenger.framework.presentation.chatlist.f> uiState = c9488a.z().getUiState();
                    C1675a c1675a = new C1675a(c9488a, this.f90441f);
                    this.f90439d = 1;
                    if (uiState.collect(c1675a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.core.d dVar2, C9488a c9488a) {
            super(2, dVar);
            this.f90437e = c9488a;
            this.f90438f = dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(dVar, this.f90438f, this.f90437e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90436d;
            if (i11 == 0) {
                Sc.s.b(obj);
                AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
                ru.ozon.android.messenger.framework.core.d dVar = this.f90438f;
                C9488a c9488a = this.f90437e;
                C1674a c1674a = new C1674a(null, dVar, c9488a);
                this.f90436d = 1;
                if (C5412d0.b(c9488a, bVar, c1674a, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.ChatListFragment$onViewCreated$2", f = "ChatListFragment.kt", l = {152}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$g */
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90444d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9488a f90445e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f90446f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatlist.ChatListFragment$onViewCreated$2$1", f = "ChatListFragment.kt", l = {153}, m = "invokeSuspend")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$g$a, reason: collision with other inner class name */
        static final class C1676a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f90447d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C9488a f90448e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ru.ozon.android.messenger.framework.core.d f90449f;

            /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$g$a$a, reason: collision with other inner class name */
            static final class C1677a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ru.ozon.android.messenger.framework.core.d f90450a;

                C1677a(ru.ozon.android.messenger.framework.core.d dVar) {
                    this.f90450a = dVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a aVar = (ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a) obj;
                    if (aVar instanceof a.c) {
                        ru.ozon.android.messenger.blocks.disclaimer.modal.e disclaimerModalResponseVO = ((a.c) aVar).a();
                        Intrinsics.checkNotNullParameter(disclaimerModalResponseVO, "disclaimerModalResponseVO");
                        ru.ozon.android.messenger.blocks.disclaimer.modal.c cVar = new ru.ozon.android.messenger.blocks.disclaimer.modal.c();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("DISCLAIMER_MODAL_KEY", disclaimerModalResponseVO);
                        cVar.setArguments(bundle);
                        cVar.show(this.f90450a.d().getChildFragmentManager(), ru.ozon.android.messenger.blocks.disclaimer.modal.c.class.getSimpleName());
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1676a(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.core.d dVar2, C9488a c9488a) {
                super(2, dVar);
                this.f90448e = c9488a;
                this.f90449f = dVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1676a(dVar, this.f90449f, this.f90448e);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1676a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f90447d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    M0<ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a> M11 = this.f90448e.z().M();
                    C1677a c1677a = new C1677a(this.f90449f);
                    this.f90447d = 1;
                    if (M11.collect(c1677a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(kotlin.coroutines.d dVar, ru.ozon.android.messenger.framework.core.d dVar2, C9488a c9488a) {
            super(2, dVar);
            this.f90445e = c9488a;
            this.f90446f = dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(dVar, this.f90446f, this.f90445e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90444d;
            if (i11 == 0) {
                Sc.s.b(obj);
                AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
                ru.ozon.android.messenger.framework.core.d dVar = this.f90446f;
                C9488a c9488a = this.f90445e;
                C1676a c1676a = new C1676a(null, dVar, c9488a);
                this.f90444d = 1;
                if (C5412d0.b(c9488a, bVar, c1676a, this) == aVar) {
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

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$h */
    public static final class h extends AbstractC7737t implements Function0<A0> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return C9488a.this.requireActivity().getViewModelStore();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$i */
    public static final class i extends AbstractC7737t implements Function0<AbstractC6409a> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            return C9488a.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$j */
    public static final class j extends AbstractC7737t implements Function0<z0.b> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return C9488a.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$k */
    public static final class k extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return C9488a.this;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$l */
    public static final class l extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f90455b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f90455b = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f90455b.invoke();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$m */
    public static final class m extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f90456b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f90456b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f90456b.getValue()).getViewModelStore();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$n */
    public static final class n extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f90457b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f90457b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f90457b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$o */
    public static final class o extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f90458b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Function0 function0) {
            super(0);
            this.f90458b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f90458b.invoke();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$p */
    public static final class p extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f90459b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f90459b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f90459b.getValue()).getViewModelStore();
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$q */
    public static final class q extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f90460b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f90460b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f90460b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$r */
    public static final class r extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f90462c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f90462c = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            z0.b defaultViewModelProviderFactory;
            B0 b02 = (B0) this.f90462c.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return (interfaceC5431s == null || (defaultViewModelProviderFactory = interfaceC5431s.getDefaultViewModelProviderFactory()) == null) ? C9488a.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.a$s */
    static final class s extends AbstractC7737t implements Function0<z0.b> {
        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            U u11 = C9488a.this.f90418d;
            if (u11 != null) {
                return u11;
            }
            Intrinsics.n("chatListVmFactory");
            throw null;
        }
    }

    public C9488a() {
        super(C1673a.f90427a);
        s sVar = new s();
        k kVar = new k();
        Sc.n nVar = Sc.n.NONE;
        InterfaceC4008j a11 = Sc.k.a(nVar, new l(kVar));
        this.f90422h = b0.b(this, N.b(C9509v.class), new m(a11), new n(a11), sVar);
        this.f90423i = b0.b(this, N.b(ru.ozon.android.messenger.framework.presentation.messenger.b.class), new h(), new i(), new j());
        InterfaceC4008j a12 = Sc.k.a(nVar, new o(new b()));
        this.f90424j = b0.b(this, N.b(ru.ozon.android.messenger.framework.presentation.messenger.l.class), new p(a12), new q(a12), new r(a12));
    }

    public static final /* synthetic */ MFragmentChatListBinding u(C9488a c9488a) {
        return c9488a.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC9506s z() {
        return (InterfaceC9506s) this.f90422h.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ru.ozon.android.messenger.utils.g.d(this).u(this);
        getLifecycle().a(z().P());
        z().a((v) requireArguments().getParcelable("ARG_INITIAL_FILTER"));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.screen.i, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        ru.ozon.android.messenger.framework.core.e.b();
        this.f90425k = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putParcelable("ChatListFragment.POP_UP_BLOCK_ID", this.f90426l);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        ((ru.ozon.android.messenger.framework.presentation.messenger.l) this.f90424j.getValue()).t0("communications_chats");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        AbstractC5434v lifecycle = getViewLifecycleOwner().getLifecycle();
        m.a aVar = m.a.ADJUST_RESIZE;
        Window window = requireActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        lifecycle.a(new ru.ozon.android.messenger.utils.m(aVar, window));
        MessengerMetricsRecyclerView messengerMetricsRecyclerView = getBinding().chatListRv;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        messengerMetricsRecyclerView.setLayoutManager(new ChatListLayoutManager(context));
        ru.ozon.android.messenger.framework.navigation.controller.a controller = z().getController();
        CoordinatorLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ru.ozon.android.messenger.framework.presentation.messenger.a f02 = ((ru.ozon.android.messenger.framework.presentation.messenger.b) this.f90423i.getValue()).f0();
        ru.ozon.android.messenger.framework.data.b bVar = this.f90420f;
        if (bVar == null) {
            Intrinsics.n("blockStore");
            throw null;
        }
        ru.ozon.android.messenger.framework.core.d dVar = new ru.ozon.android.messenger.framework.core.d(controller, constraintLayout, viewLifecycleOwner, this, f02, bVar);
        ru.ozon.android.messenger.framework.core.e.a(dVar);
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new f(null, dVar, this), 3);
        dVar.c().q(new ru.ozon.android.messenger.framework.navigation.action.a(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, N.b(d.p.class).B(), null, 10, null), null, null, 6));
        MessengerMetricsRecyclerView chatListRv = getBinding().chatListRv;
        Intrinsics.checkNotNullExpressionValue(chatListRv, "chatListRv");
        A a11 = new A(chatListRv);
        k.a aVar2 = this.f90419e;
        if (aVar2 == null) {
            Intrinsics.n("chatListViewDelegateFactory");
            throw null;
        }
        ru.ozon.android.messenger.framework.presentation.chatlist.k a12 = aVar2.a(dVar, a11, z(), new ru.ozon.android.messenger.framework.presentation.common.view.recycler.p(z().c()), getBinding());
        this.f90425k = a12;
        M0<ru.ozon.android.messenger.framework.presentation.chatlist.f> uiState = z().getUiState();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner3, uiState, new ru.ozon.android.messenger.framework.presentation.chatlist.c(null, a12));
        CoordinatorLayout constraintLayout2 = getBinding().getConstraintLayout();
        if (this.f90417c == null) {
            Intrinsics.n("messengerConfig");
            throw null;
        }
        constraintLayout2.setFitsSystemWindows(!r2.getEnabledInsets());
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new g(null, dVar, this), 3);
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        L.a(onBackPressedDispatcher, getViewLifecycleOwner(), new ru.ozon.android.messenger.framework.presentation.chatlist.b(this), 2);
        M0<ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.b> s11 = z().s();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner5, s11, new c(null, dVar));
        Ae.B0<NotificationDTO> d11 = z().d();
        J viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner6, d11, new d(null, this));
        C0 v11 = z().v();
        J viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        new ru.ozon.android.messenger.utils.coroutines.f(viewLifecycleOwner7, v11, new e(null, dVar, this));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewStateRestored(Bundle bundle) {
        ru.ozon.android.messenger.framework.presentation.models.c cVar;
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            Intrinsics.checkNotNullParameter(ru.ozon.android.messenger.framework.presentation.models.c.class, "clazz");
            cVar = (ru.ozon.android.messenger.framework.presentation.models.c) (Build.VERSION.SDK_INT >= 33 ? bundle.getParcelable("ChatListFragment.POP_UP_BLOCK_ID", ru.ozon.android.messenger.framework.presentation.models.c.class) : bundle.getParcelable("ChatListFragment.POP_UP_BLOCK_ID"));
        } else {
            cVar = null;
        }
        this.f90426l = cVar;
    }
}
