package ru.ozon.android.messenger.framework.presentation.chatlist;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.Window;
import androidx.constraintlayout.motion.widget.m;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Q;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.common.SquircleLinearLayout;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.presentation.chatdetail.d;
import ru.ozon.android.messenger.framework.presentation.chatlist.f;
import ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.InterfaceC9506s;
import ru.ozon.android.messenger.framework.presentation.chatlist.w;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.C9513d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.MessengerMetricsRecyclerView;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.databinding.MFragmentChatListBinding;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f90492a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.view.recycler.g f90493b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.logger.b f90494c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC9506s f90495d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f90496e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final MFragmentChatListBinding f90497f;

    /* renamed from: g, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f90498g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final A f90499h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Object f90500i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.popupmenu.f f90501j;

    /* renamed from: k, reason: collision with root package name */
    private int f90502k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f90503l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.utils.view.m f90504m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f90505n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f90506o;

    public interface a {
        @NotNull
        k a(@NotNull ru.ozon.android.messenger.framework.core.d dVar, A a11, @NotNull InterfaceC9506s interfaceC9506s, @NotNull ru.ozon.android.messenger.framework.presentation.common.view.recycler.p pVar, @NotNull MFragmentChatListBinding mFragmentChatListBinding);
    }

    public k(@NotNull ru.ozon.android.messenger.framework.data.b blockStore, @NotNull ru.ozon.android.messenger.framework.presentation.common.view.recycler.g decoratorHelper, ru.ozon.android.messenger.framework.logger.b bVar, @NotNull InterfaceC9506s stateEffectConsumer, @NotNull ru.ozon.android.messenger.framework.presentation.common.view.recycler.p paginationListener, @NotNull ru.ozon.android.messenger.framework.core.d refs, @NotNull MFragmentChatListBinding binding, ru.ozon.android.messenger.framework.analytics.i iVar, @NotNull A menuListener) {
        boolean z11;
        final int themeColor;
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        Intrinsics.checkNotNullParameter(decoratorHelper, "decoratorHelper");
        Intrinsics.checkNotNullParameter(stateEffectConsumer, "stateEffectConsumer");
        Intrinsics.checkNotNullParameter(paginationListener, "paginationListener");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(menuListener, "menuListener");
        this.f90492a = blockStore;
        this.f90493b = decoratorHelper;
        this.f90494c = bVar;
        this.f90495d = stateEffectConsumer;
        this.f90496e = refs;
        this.f90497f = binding;
        this.f90498g = iVar;
        this.f90499h = menuListener;
        InterfaceC4008j b11 = ru.ozon.android.messenger.utils.f.b(new l(this));
        this.f90500i = b11;
        this.f90501j = new ru.ozon.android.messenger.framework.presentation.common.popupmenu.f(new ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.d(), refs.c(), iVar);
        this.f90503l = Sc.k.b(new m(this));
        Window window = refs.d().requireActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        this.f90504m = new ru.ozon.android.messenger.utils.view.m(window);
        Context context = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f90505n = ru.ozon.android.messenger.utils.h.b(context);
        MessengerMetricsRecyclerView messengerMetricsRecyclerView = binding.chatListRv;
        C9513d c9513d = (C9513d) b11.getValue();
        c9513d.registerAdapterDataObserver(new n(messengerMetricsRecyclerView));
        messengerMetricsRecyclerView.setAdapter(c9513d);
        messengerMetricsRecyclerView.addOnScrollListener(paginationListener);
        messengerMetricsRecyclerView.addOnScrollListener(new o(this));
        ru.ozon.android.messenger.framework.analytics.c f91209a = messengerMetricsRecyclerView.getF91209a();
        if (f91209a != null) {
            f91209a.f(new p(this));
        }
        ArrayList<m.b> y11 = binding.supportViewRoot.y();
        Intrinsics.checkNotNullExpressionValue(y11, "getDefinedTransitions(...)");
        Iterator<m.b> it = y11.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            z11 = this.f90505n;
            if (!hasNext) {
                break;
            } else {
                it.next().D((z11 || this.f90506o) ? false : true);
            }
        }
        binding.headerContainerLl.c(!z11);
        int i11 = z11 ? R$attr.layerFloor0 : R$attr.layerFloor1;
        SquircleLinearLayout squircleLinearLayout = binding.headerContainerLl;
        Context context2 = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        squircleLinearLayout.b(Integer.valueOf(ThemeExtKt.themeColor(context2, i11)));
        if (this.f90505n) {
            Context context3 = this.f90497f.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            themeColor = ThemeExtKt.themeColor(context3, R$attr.layerFloor0);
        } else {
            Context context4 = this.f90497f.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            themeColor = ThemeExtKt.themeColor(context4, R$attr.layerFloor1);
        }
        final ru.ozon.android.messenger.utils.view.m mVar = this.f90504m;
        AbstractC5434v lifecycle = this.f90496e.f().getLifecycle();
        final AbstractC5434v.a event = AbstractC5434v.a.ON_RESUME;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(event, "event");
        lifecycle.a(new G() { // from class: ru.ozon.android.messenger.utils.view.l
            @Override // androidx.lifecycle.G
            public final void onStateChanged(J j11, AbstractC5434v.a lifecycleEvent) {
                Intrinsics.checkNotNullParameter(j11, "<unused var>");
                Intrinsics.checkNotNullParameter(lifecycleEvent, "lifecycleEvent");
                if (lifecycleEvent == AbstractC5434v.a.this) {
                    mVar.a(themeColor);
                }
            }
        });
    }

    public static void a(k kVar, w wVar) {
        C10727i.c(K.a(kVar.f90496e.f()), null, null, new s(wVar, kVar, null), 3);
    }

    public static final int d(k kVar) {
        return ((Number) kVar.f90503l.getValue()).intValue();
    }

    public static final void m(k kVar, w wVar) {
        Pair pair;
        kVar.getClass();
        boolean z11 = wVar instanceof w.b;
        MFragmentChatListBinding mFragmentChatListBinding = kVar.f90497f;
        if (z11) {
            Context context = mFragmentChatListBinding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            pair = new Pair(Integer.valueOf(ThemeExtKt.themeColorRes(context, R$attr.layerOverlayDimming)), Integer.valueOf(R$color.graphic_neutral));
        } else {
            Context context2 = mFragmentChatListBinding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Integer valueOf = Integer.valueOf(ThemeExtKt.themeColorRes(context2, R$attr.layerFloor1));
            Context context3 = mFragmentChatListBinding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            pair = new Pair(valueOf, Integer.valueOf(ThemeExtKt.themeColorRes(context3, R$attr.textAction)));
        }
        int intValue = ((Number) pair.a()).intValue();
        int intValue2 = ((Number) pair.b()).intValue();
        mFragmentChatListBinding.progressBar.getConstraintLayout().setBackgroundColor(androidx.core.content.a.getColor(mFragmentChatListBinding.getConstraintLayout().getContext(), intValue));
        mFragmentChatListBinding.progressBar.progressBar.getIndeterminateDrawable().setTint(androidx.core.content.a.getColor(mFragmentChatListBinding.getConstraintLayout().getContext(), intValue2));
        ConstraintLayout constraintLayout = mFragmentChatListBinding.chatListRootCl;
        androidx.constraintlayout.widget.d d11 = Tl.a.d(constraintLayout, "chatListRootCl", constraintLayout);
        if (z11) {
            int i11 = R$id.progressBar;
            Intrinsics.checkNotNullParameter(d11, "<this>");
            d11.t(i11, 3, 0, 3, 0);
        }
        d11.f(constraintLayout);
    }

    public final void n() {
        ru.ozon.android.messenger.framework.presentation.common.popupmenu.f fVar = this.f90501j;
        if (fVar.e()) {
            fVar.d();
        }
    }

    public final boolean o() {
        return this.f90501j.e();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [Sc.j, java.lang.Object] */
    public final void p(@NotNull f state) {
        ContextMenuDTO b11;
        Window window;
        ru.ozon.android.messenger.framework.presentation.chatdetail.d a11;
        Intrinsics.checkNotNullParameter(state, "state");
        List<ru.ozon.android.messenger.framework.presentation.models.e> d11 = state.d();
        MFragmentChatListBinding mFragmentChatListBinding = this.f90497f;
        MessengerMetricsRecyclerView chatListRv = mFragmentChatListBinding.chatListRv;
        Intrinsics.checkNotNullExpressionValue(chatListRv, "chatListRv");
        this.f90493b.c(chatListRv, d11);
        ArrayList a12 = ru.ozon.android.messenger.framework.presentation.models.f.a(state.g());
        boolean isEmpty = a12.isEmpty();
        ru.ozon.android.messenger.framework.core.d dVar = this.f90496e;
        ru.ozon.android.messenger.framework.data.b bVar = this.f90492a;
        InterfaceC9506s interfaceC9506s = this.f90495d;
        if (!isEmpty) {
            Iterator it = a12.iterator();
            while (it.hasNext()) {
                ru.ozon.android.messenger.framework.data.d.d(bVar, (ru.ozon.android.messenger.framework.presentation.models.e) it.next()).k(dVar.e());
            }
            interfaceC9506s.x();
        }
        Iterator it2 = ru.ozon.android.messenger.framework.presentation.models.f.a(state.f()).iterator();
        while (it2.hasNext()) {
            ru.ozon.android.messenger.framework.presentation.models.e eVar = (ru.ozon.android.messenger.framework.presentation.models.e) it2.next();
            ru.ozon.android.messenger.framework.core.viewmapper.b<Object, ru.ozon.android.messenger.framework.presentation.models.g, ?> d12 = ru.ozon.android.messenger.framework.data.d.d(bVar, eVar);
            CoordinatorLayout constraintLayout = mFragmentChatListBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            d12.m(constraintLayout, dVar, eVar);
        }
        if (state.c() != null) {
            f.a c11 = state.c();
            String uri = c11.b().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            a11 = d.C9454b.a(c11.b(), c11.a(), c11.c(), false, false, d.EnumC9455c.BOTTOM);
            androidx.fragment.app.G parentFragmentManager = dVar.d().getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            Q p11 = parentFragmentManager.p();
            p11.r(R$id.fragmentChatContainer, a11, uri);
            p11.g(uri);
            p11.i();
            interfaceC9506s.c0();
        }
        if (state.j() != null && state.i() != null) {
            this.f90506o = true;
        }
        w e11 = state.e();
        boolean l11 = state.l();
        Lm0.a.f17149a.d("submitChatBlocks " + state.d(), new Object[0]);
        List<ru.ozon.android.messenger.framework.presentation.models.e> d13 = state.d();
        if (!d13.isEmpty() && l11) {
            mFragmentChatListBinding.chatListRv.d(b7.d.c());
        } else if (d13.isEmpty() && l11) {
            b7.d.a();
        }
        ?? r42 = this.f90500i;
        ((C9513d) r42.getValue()).submitList(d13, new Vq.f(1, this, e11));
        if (!this.f90505n && !this.f90506o) {
            mFragmentChatListBinding.supportViewRoot.O();
        }
        String j11 = state.j();
        ContextMenuDTO i11 = state.i();
        if (j11 == null || i11 == null) {
            this.f90506o = false;
            return;
        }
        List<ru.ozon.android.messenger.framework.presentation.models.e> currentList = ((C9513d) r42.getValue()).getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator<ru.ozon.android.messenger.framework.presentation.models.e> it3 = currentList.iterator();
        int i12 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i12 = -1;
                break;
            } else if (Intrinsics.d(it3.next().b().getBlockId().a(), j11)) {
                break;
            } else {
                i12++;
            }
        }
        Integer valueOf = i12 == -1 ? null : Integer.valueOf(i12);
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            List<ru.ozon.android.messenger.framework.presentation.models.e> currentList2 = ((C9513d) r42.getValue()).getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList2, "getCurrentList(...)");
            ru.ozon.android.messenger.framework.presentation.models.e eVar2 = (ru.ozon.android.messenger.framework.presentation.models.e) C7714v.Q(intValue, currentList2);
            if (eVar2 == null) {
                return;
            }
            ru.ozon.android.messenger.framework.presentation.models.g b12 = eVar2.b();
            ru.ozon.android.messenger.blocks.chat.common.b bVar2 = b12 instanceof ru.ozon.android.messenger.blocks.chat.common.b ? (ru.ozon.android.messenger.blocks.chat.common.b) b12 : null;
            if (bVar2 == null || (b11 = bVar2.b()) == null) {
                return;
            }
            if (b11.getAdditionalMenuItems().isEmpty()) {
                this.f90506o = false;
                return;
            }
            m.b B11 = mFragmentChatListBinding.supportViewRoot.B(R$id.swipeTransition);
            boolean A11 = B11.A();
            B11.D(false);
            androidx.fragment.app.r activity = dVar.d().getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                MessengerMetricsRecyclerView chatListRv2 = mFragmentChatListBinding.chatListRv;
                Intrinsics.checkNotNullExpressionValue(chatListRv2, "chatListRv");
                this.f90501j.g(chatListRv2, b11, intValue, new q(this, window), new r(window, this, B11, A11));
            }
            interfaceC9506s.K();
        }
    }
}
