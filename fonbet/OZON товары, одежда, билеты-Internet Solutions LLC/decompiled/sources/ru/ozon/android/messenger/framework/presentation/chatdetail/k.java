package ru.ozon.android.messenger.framework.presentation.chatdetail;

import B0.C2454a;
import Bl0.g0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.C;
import androidx.activity.J;
import androidx.activity.L;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.G;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.Q;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import nm0.C8612b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.common.BottomArcView;
import ru.ozon.android.messenger.blocks.snackbar.SnackbarVO;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.presentation.chatdetail.d;
import ru.ozon.android.messenger.framework.presentation.chatdetail.j;
import ru.ozon.android.messenger.framework.presentation.chatdetail.view.ScrollToLastMessageButton;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.w;
import ru.ozon.android.messenger.framework.presentation.chatlist.C9488a;
import ru.ozon.android.messenger.framework.presentation.common.screen.compose.d;
import ru.ozon.android.messenger.framework.presentation.common.screen.m;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.D;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.MessengerMetricsRecyclerView;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.i.d;
import ru.ozon.android.messenger.framework.presentation.messenger.i;
import ru.ozon.android.messenger.framework.presentation.models.C9514a;
import ru.ozon.android.messenger.framework.presentation.models.responses.c;
import ru.ozon.android.messenger.framework.presentation.models.y;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$color;
import ru.ozon.app.android.messenger.R$dimen;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.app.android.messenger.databinding.MFragmentChatBinding;
import ru.ozon.uni.android.haptic.HapticVibrator;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ru.ozon.android.messenger.framework.presentation.common.popupmenu.k f89886a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f89887b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final MFragmentChatBinding f89888c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> f89889d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f89890e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f89891f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.d f89892g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.view.recycler.g f89893h;

    /* renamed from: i, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.analytics.i f89894i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.notification.g f89895j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.common.notification.j f89896k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f89897l;

    /* renamed from: m, reason: collision with root package name */
    private String f89898m;

    /* renamed from: n, reason: collision with root package name */
    private String f89899n;

    /* renamed from: o, reason: collision with root package name */
    private Parcelable f89900o;

    /* renamed from: p, reason: collision with root package name */
    private d.EnumC9455c f89901p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f89902q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f89903r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f89904s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f89905t;

    /* renamed from: u, reason: collision with root package name */
    private final int f89906u;

    /* renamed from: v, reason: collision with root package name */
    private int f89907v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final Object f89908w;

    /* renamed from: x, reason: collision with root package name */
    private int f89909x;

    /* renamed from: y, reason: collision with root package name */
    private int f89910y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private List<ru.ozon.android.messenger.framework.presentation.models.q> f89911z;

    public static final class a implements DefaultLifecycleObserver {

        /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.k$a$a, reason: collision with other inner class name */
        static final class C1662a extends AbstractC7737t implements Function1<C, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f89913b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1662a(k kVar) {
                super(1);
                this.f89913b = kVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(C c11) {
                J onBackPressedDispatcher;
                C addCallback = c11;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                k kVar = this.f89913b;
                if (kVar.L()) {
                    kVar.B();
                } else {
                    addCallback.setEnabled(false);
                    androidx.fragment.app.r activity = kVar.f89890e.d().getActivity();
                    if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                        onBackPressedDispatcher.l();
                    }
                }
                return Unit.f71690a;
            }
        }

        a() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(androidx.lifecycle.J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.onPause(owner);
            k kVar = k.this;
            kVar.w();
            if (kVar.L()) {
                kVar.B();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(androidx.lifecycle.J owner) {
            J onBackPressedDispatcher;
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.onResume(owner);
            k kVar = k.this;
            androidx.fragment.app.r activity = kVar.f89890e.d().getActivity();
            if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                return;
            }
            L.a(onBackPressedDispatcher, kVar.f89890e.f(), new C1662a(kVar), 2);
        }
    }

    public interface b {
        @NotNull
        k a(@NotNull MFragmentChatBinding mFragmentChatBinding, @NotNull ru.ozon.android.messenger.framework.presentation.common.view.recycler.p pVar, @NotNull Function1<? super List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> function1, @NotNull ru.ozon.android.messenger.framework.core.d dVar, Bundle bundle);
    }

    /* synthetic */ class c extends C7735q implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f89914a = new c(1, ru.ozon.android.messenger.framework.presentation.models.r.class, "isValidMessage", "isValidMessage(Lru/ozon/android/messenger/framework/presentation/models/ItemVO;)Z", 1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
            ru.ozon.android.messenger.framework.presentation.models.q p02 = qVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Boolean.valueOf(ru.ozon.android.messenger.framework.presentation.models.r.h(p02));
        }
    }

    /* synthetic */ class d extends C7735q implements Function1<ru.ozon.android.messenger.framework.presentation.models.q, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f89915a = new d(1, ru.ozon.android.messenger.framework.presentation.models.r.class, "isValidMessage", "isValidMessage(Lru/ozon/android/messenger/framework/presentation/models/ItemVO;)Z", 1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
            ru.ozon.android.messenger.framework.presentation.models.q p02 = qVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Boolean.valueOf(ru.ozon.android.messenger.framework.presentation.models.r.h(p02));
        }
    }

    static final class e extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.presentation.common.view.recycler.i> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.framework.presentation.common.view.recycler.i invoke() {
            k kVar = k.this;
            return new ru.ozon.android.messenger.framework.presentation.common.view.recycler.i(kVar.f89890e, new o(kVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull MFragmentChatBinding binding, @NotNull ru.ozon.android.messenger.framework.presentation.common.view.recycler.p paginationListener, @NotNull Function1<? super List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> itemsAppearanceListener, @NotNull ru.ozon.android.messenger.framework.core.d refs, Bundle bundle, @NotNull ru.ozon.android.messenger.framework.data.b blockStore, @NotNull ru.ozon.android.messenger.framework.navigation.d chatRouter, @NotNull ru.ozon.android.messenger.framework.presentation.common.view.recycler.g decoratorHelper, ru.ozon.android.messenger.framework.analytics.i iVar, @NotNull ru.ozon.android.messenger.framework.presentation.common.notification.g noInternetNotificationPresenter, @NotNull ru.ozon.android.messenger.framework.presentation.common.notification.j successNotificationPresenter) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(paginationListener, "paginationListener");
        Intrinsics.checkNotNullParameter(itemsAppearanceListener, "itemsAppearanceListener");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        Intrinsics.checkNotNullParameter(chatRouter, "chatRouter");
        Intrinsics.checkNotNullParameter(decoratorHelper, "decoratorHelper");
        Intrinsics.checkNotNullParameter(noInternetNotificationPresenter, "noInternetNotificationPresenter");
        Intrinsics.checkNotNullParameter(successNotificationPresenter, "successNotificationPresenter");
        this.f89886a = new ru.ozon.android.messenger.framework.presentation.common.popupmenu.k(new ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.f(ru.ozon.android.messenger.framework.core.f.a(refs)), refs.c(), iVar);
        this.f89887b = new h(binding);
        this.f89888c = binding;
        this.f89889d = itemsAppearanceListener;
        this.f89890e = refs;
        this.f89891f = blockStore;
        this.f89892g = chatRouter;
        this.f89893h = decoratorHelper;
        this.f89894i = iVar;
        this.f89895j = noInternetNotificationPresenter;
        this.f89896k = successNotificationPresenter;
        this.f89897l = 0;
        this.f89901p = d.EnumC9455c.BOTTOM;
        this.f89904s = bundle != null ? bundle.getBoolean("BUNDLE_FIRST_ITEM_INSERTION") : true;
        this.f89905t = bundle != null;
        this.f89906u = androidx.core.content.a.getColor(ru.ozon.android.messenger.framework.core.f.a(refs), R$color.layer_overlay_dimming);
        this.f89907v = androidx.core.content.a.getColor(ru.ozon.android.messenger.framework.core.f.a(refs), R$color.layer_floor_1);
        this.f89908w = ru.ozon.android.messenger.utils.f.b(new e());
        this.f89909x = -1;
        this.f89910y = -1;
        this.f89911z = K.f71697a;
        MessengerMetricsRecyclerView messengerMetricsRecyclerView = binding.messagesRv;
        Intrinsics.f(messengerMetricsRecyclerView);
        RecyclerView.o layoutManager = messengerMetricsRecyclerView.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        ru.ozon.android.messenger.framework.presentation.common.view.recycler.i D11 = D();
        D11.registerAdapterDataObserver(new r(this, D11, messengerMetricsRecyclerView, linearLayoutManager));
        messengerMetricsRecyclerView.setAdapter(D11);
        messengerMetricsRecyclerView.post(new I.g(this, 4));
        ScrollToLastMessageButton scrollToLastMessageBtn = binding.scrollToLastMessageBtn;
        Intrinsics.checkNotNullExpressionValue(scrollToLastMessageBtn, "scrollToLastMessageBtn");
        messengerMetricsRecyclerView.addOnScrollListener(new ru.ozon.android.messenger.framework.presentation.chatdetail.view.d(scrollToLastMessageBtn, true));
        LinearLayout actionButtonContainer = binding.actionButtonContainer;
        Intrinsics.checkNotNullExpressionValue(actionButtonContainer, "actionButtonContainer");
        messengerMetricsRecyclerView.addOnScrollListener(new ru.ozon.android.messenger.framework.presentation.chatdetail.view.d(actionButtonContainer, false));
        messengerMetricsRecyclerView.addOnScrollListener(new s(this, linearLayoutManager));
        messengerMetricsRecyclerView.addOnScrollListener(paginationListener);
        Context context = messengerMetricsRecyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int a11 = ru.ozon.android.messenger.utils.h.a(context, R$dimen.m_margin_small);
        Context context2 = messengerMetricsRecyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int a12 = ru.ozon.android.messenger.utils.h.a(context2, R$dimen.m_date_block_offset);
        messengerMetricsRecyclerView.addItemDecoration(new ru.ozon.android.messenger.framework.presentation.chatdetail.view.b());
        messengerMetricsRecyclerView.addItemDecoration(new ru.ozon.android.messenger.utils.recycle.c(D().new d(), a11, a12));
        ru.ozon.android.messenger.framework.analytics.c f91209a = messengerMetricsRecyclerView.getF91209a();
        if (f91209a != null) {
            f91209a.f(new t(this));
        }
        binding.scrollToLastMessageBtn.setOnClickListener(new EI.a(this, 11));
        binding.scrollToLastMessageBtn.setAlpha(bundle != null ? bundle.getFloat("BUNDLE_SCROLL_BTN_ALPHA") : 0.0f);
        Context context3 = binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        if (ru.ozon.android.messenger.utils.h.b(context3)) {
            LinearLayout linearLayout = binding.headerContainerLl;
            Context context4 = binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            linearLayout.setBackgroundColor(ThemeExtKt.themeColor(context4, R$attr.layerFloor0));
        }
        refs.f().getLifecycle().a(new a());
    }

    static void M(k kVar) {
        MessengerMetricsRecyclerView messengerMetricsRecyclerView = kVar.f89888c.messagesRv;
        messengerMetricsRecyclerView.stopScroll();
        int shimmersCount = kVar.D().getShimmersCount() - 1;
        if (shimmersCount < 0) {
            shimmersCount = 0;
        }
        ru.ozon.android.messenger.utils.view.k.a(messengerMetricsRecyclerView, shimmersCount, false, 2);
    }

    public static void a(k kVar) {
        MessengerMetricsRecyclerView messagesRv = kVar.f89888c.messagesRv;
        Intrinsics.checkNotNullExpressionValue(messagesRv, "messagesRv");
        G.a(messagesRv, new l(messagesRv, kVar));
        String str = kVar.f89899n;
        if (str != null) {
            kVar.f89899n = null;
            List<ru.ozon.android.messenger.framework.presentation.models.q> currentList = kVar.D().getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            Iterator<ru.ozon.android.messenger.framework.presentation.models.q> it = currentList.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                ru.ozon.android.messenger.framework.presentation.models.q next = it.next();
                Intrinsics.f(next);
                if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(next), str)) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 != -1) {
                kVar.f89888c.messagesRv.post(new H4.a(kVar, i11, str, 1));
            }
        }
    }

    public static void b(k kVar) {
        RecyclerView.o layoutManager = kVar.f89888c.messagesRv.getLayoutManager();
        Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        kVar.f89889d.invoke((findFirstVisibleItemPosition == -1 || findLastVisibleItemPosition == -1) ? K.f71697a : kVar.D().getCurrentList().subList(findFirstVisibleItemPosition, findLastVisibleItemPosition + 1));
    }

    public static void c(k kVar, int i11, String str) {
        int height = kVar.f89888c.messagesRv.getHeight() / 2;
        MessengerMetricsRecyclerView messagesRv = kVar.f89888c.messagesRv;
        Intrinsics.checkNotNullExpressionValue(messagesRv, "messagesRv");
        RecyclerView.o layoutManager = messagesRv.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i11, height);
        kVar.D().g(str);
    }

    public static void d(k kVar) {
        kVar.f89890e.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, ru.ozon.android.messenger.framework.navigation.action.d.ON_MSG_COUNTER_CLICK.a(), null, 10, null)));
    }

    public static final void e(k kVar, RecyclerView recyclerView) {
        kVar.getClass();
        View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        Object childViewHolder = recyclerView.getChildViewHolder(childAt);
        if (childViewHolder instanceof D) {
            D d11 = (D) childViewHolder;
            String c11 = d11.c();
            if (c11 != null) {
                kVar.f89890e.c().q(new ru.ozon.android.messenger.framework.navigation.action.a(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, ru.ozon.android.messenger.framework.navigation.action.d.ON_UNREAD_MSG_DISPLAYED.a(), C2454a.b(d.c.UNREAD_MESSAGE_ID.a(), c11), 2, null), null, null, 6));
            }
            d11.d();
        }
    }

    @NotNull
    public final Bundle A() {
        return androidx.core.os.d.b(new Pair("BUNDLE_FIRST_ITEM_INSERTION", Boolean.valueOf(this.f89904s)), new Pair("BUNDLE_SCROLL_BTN_ALPHA", Float.valueOf(this.f89888c.scrollToLastMessageBtn.getAlpha())));
    }

    public final void B() {
        this.f89886a.d();
    }

    public final Integer C() {
        return this.f89897l;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.common.view.recycler.i D() {
        return (ru.ozon.android.messenger.framework.presentation.common.view.recycler.i) this.f89908w.getValue();
    }

    public final Parcelable E() {
        return this.f89900o;
    }

    public final boolean F() {
        return this.f89903r;
    }

    public final String G() {
        return this.f89898m;
    }

    public final d.EnumC9455c H() {
        return this.f89901p;
    }

    public final String I() {
        MessengerMetricsRecyclerView messagesRv = this.f89888c.messagesRv;
        Intrinsics.checkNotNullExpressionValue(messagesRv, "messagesRv");
        RecyclerView.o layoutManager = messagesRv.getLayoutManager();
        if (layoutManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        Pair pair = new Pair(Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition()), Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition()));
        int intValue = ((Number) pair.a()).intValue();
        int intValue2 = ((Number) pair.b()).intValue();
        List<ru.ozon.android.messenger.framework.presentation.models.q> currentList = D().getCurrentList();
        if (intValue2 != -1) {
            Intrinsics.f(currentList);
            ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) ru.ozon.android.messenger.utils.b.c(currentList, intValue2 + 1, c.f89914a);
            if (qVar != null) {
                return ru.ozon.android.messenger.framework.presentation.models.r.d(qVar);
            }
            return null;
        }
        if (intValue == -1) {
            return null;
        }
        Intrinsics.f(currentList);
        ru.ozon.android.messenger.framework.presentation.models.q qVar2 = (ru.ozon.android.messenger.framework.presentation.models.q) ru.ozon.android.messenger.utils.b.b(currentList, intValue, intValue2 + 1, d.f89915a);
        if (qVar2 != null) {
            return ru.ozon.android.messenger.framework.presentation.models.r.d(qVar2);
        }
        return null;
    }

    public final void J(@NotNull ru.ozon.android.messenger.framework.presentation.common.screen.l loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        MFragmentChatBinding mFragmentChatBinding = this.f89888c;
        FrameLayout constraintLayout = mFragmentChatBinding.progressBar.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(loader.b() ? 0 : 8);
        if (loader.a() == null) {
            throw new Sc.o();
        }
        Integer a11 = ((m.a) loader.a()).a();
        if (a11 != null) {
            mFragmentChatBinding.progressBar.layoutBackgroundProgressBar.setBackgroundColor(a11.intValue());
        }
        Context context = mFragmentChatBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        mFragmentChatBinding.progressBar.progressBar.getIndeterminateDrawable().setTint(androidx.core.content.a.getColor(mFragmentChatBinding.getConstraintLayout().getContext(), ThemeExtKt.themeColorRes(context, R$attr.textAction)));
    }

    public final boolean K() {
        return this.f89902q;
    }

    public final boolean L() {
        return this.f89886a.e();
    }

    public final void N(Integer num) {
        this.f89897l = num;
    }

    public final void O(boolean z11) {
        this.f89902q = z11;
    }

    public final void P(Parcelable parcelable) {
        this.f89900o = parcelable;
    }

    public final void Q(boolean z11) {
        this.f89903r = z11;
    }

    public final void R(String str) {
        this.f89898m = str;
    }

    public final void S(d.EnumC9455c enumC9455c) {
        this.f89901p = enumC9455c;
    }

    public final void T(@NotNull MessengerMetricsRecyclerView messengerMetricsRecyclerView, @NotNull ru.ozon.android.messenger.framework.presentation.models.q itemVO, int i11, @NotNull Function0 onShow, @NotNull Function0 onDismiss) {
        Intrinsics.checkNotNullParameter(messengerMetricsRecyclerView, "<this>");
        Intrinsics.checkNotNullParameter(itemVO, "itemVO");
        Intrinsics.checkNotNullParameter(onShow, "onShow");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        this.f89886a.g(messengerMetricsRecyclerView, itemVO, i11, onShow, onDismiss);
    }

    public final void U(@NotNull C0 widgetsContainer) {
        Intrinsics.checkNotNullParameter(widgetsContainer, "widgetsContainer");
        List<ru.ozon.android.messenger.framework.presentation.models.q> a11 = widgetsContainer.a();
        boolean b11 = widgetsContainer.b();
        boolean isEmpty = a11.isEmpty();
        MFragmentChatBinding mFragmentChatBinding = this.f89888c;
        if (!isEmpty && b11) {
            mFragmentChatBinding.messagesRv.d(G.c.d());
        } else if (a11.isEmpty() && b11) {
            G.c.a();
        }
        D().submitList(a11, new g0(this, 4));
        ArrayList a12 = ru.ozon.android.messenger.framework.presentation.models.f.a(a11);
        MessengerMetricsRecyclerView messagesRv = mFragmentChatBinding.messagesRv;
        Intrinsics.checkNotNullExpressionValue(messagesRv, "messagesRv");
        this.f89893h.c(messagesRv, a12);
    }

    public final void V(@NotNull ru.ozon.android.messenger.framework.domain.g noUiContainer) {
        Object obj;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(noUiContainer, "noUiContainer");
        ArrayList blockItems = ru.ozon.android.messenger.framework.presentation.models.f.a(noUiContainer.a());
        List<ru.ozon.android.messenger.framework.presentation.models.q> list = this.f89911z;
        List<ru.ozon.android.messenger.framework.presentation.models.q> a11 = noUiContainer.a();
        ArrayList arrayList2 = new ArrayList();
        for (ru.ozon.android.messenger.framework.presentation.models.q qVar : list) {
            Iterator<T> it = a11.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.d(((ru.ozon.android.messenger.framework.presentation.models.q) obj).c().getId(), qVar.c().getId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ru.ozon.android.messenger.framework.presentation.models.q qVar2 = (ru.ozon.android.messenger.framework.presentation.models.q) obj;
            if (qVar2 == null) {
                List<ru.ozon.android.messenger.framework.presentation.models.u> b11 = qVar.b();
                arrayList = new ArrayList(C7714v.z(b11, 10));
                Iterator<T> it2 = b11.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new ru.ozon.android.messenger.framework.presentation.models.q(C7714v.a0((ru.ozon.android.messenger.framework.presentation.models.u) it2.next()), qVar.c()));
                }
            } else {
                List<ru.ozon.android.messenger.framework.presentation.models.u> b12 = qVar.b();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : b12) {
                    ru.ozon.android.messenger.framework.presentation.models.u uVar = (ru.ozon.android.messenger.framework.presentation.models.u) obj2;
                    List<ru.ozon.android.messenger.framework.presentation.models.u> b13 = qVar2.b();
                    if (!(b13 instanceof Collection) || !b13.isEmpty()) {
                        Iterator<T> it3 = b13.iterator();
                        while (it3.hasNext()) {
                            if (Intrinsics.d(((ru.ozon.android.messenger.framework.presentation.models.u) it3.next()).b().getName(), uVar.b().getName())) {
                                break;
                            }
                        }
                    }
                    arrayList3.add(obj2);
                }
                ArrayList arrayList4 = new ArrayList(C7714v.z(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new ru.ozon.android.messenger.framework.presentation.models.q(C7714v.a0((ru.ozon.android.messenger.framework.presentation.models.u) it4.next()), qVar2.c()));
                }
                arrayList = arrayList4;
            }
            C7714v.p(arrayList, arrayList2);
        }
        boolean isEmpty = arrayList2.isEmpty();
        ru.ozon.android.messenger.framework.data.b bVar = this.f89891f;
        ru.ozon.android.messenger.framework.core.d dVar = this.f89890e;
        if (!isEmpty) {
            Iterator it5 = ru.ozon.android.messenger.framework.presentation.models.f.a(arrayList2).iterator();
            while (it5.hasNext()) {
                ru.ozon.android.messenger.framework.presentation.models.e eVar = (ru.ozon.android.messenger.framework.presentation.models.e) it5.next();
                if (eVar.b() instanceof SnackbarVO) {
                    ru.ozon.android.messenger.framework.data.d.c(bVar, eVar.d()).k(dVar.e());
                } else {
                    ru.ozon.android.messenger.framework.data.d.d(bVar, eVar).k(dVar.e());
                }
            }
        }
        Iterator it6 = blockItems.iterator();
        while (it6.hasNext()) {
            ru.ozon.android.messenger.framework.presentation.models.e eVar2 = (ru.ozon.android.messenger.framework.presentation.models.e) it6.next();
            if (eVar2.b() instanceof ru.ozon.android.messenger.blocks.emptystate.v2.g) {
                B();
            }
            ru.ozon.android.messenger.framework.core.viewmapper.b<Object, ru.ozon.android.messenger.framework.presentation.models.g, ?> d11 = ru.ozon.android.messenger.framework.data.d.d(bVar, eVar2);
            ConstraintLayout constraintLayout = this.f89888c.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            d11.m(constraintLayout, dVar, eVar2);
        }
        Intrinsics.checkNotNullParameter(blockItems, "blockItems");
        this.f89887b.p(blockItems);
        this.f89911z = noUiContainer.a();
    }

    public final void W(int i11) {
        this.f89888c.scrollToLastMessageBtn.a(i11);
    }

    public final void u() {
        this.f89887b.m();
    }

    public final void v(boolean z11) {
        MFragmentChatBinding mFragmentChatBinding = this.f89888c;
        MessengerMetricsRecyclerView messagesRv = mFragmentChatBinding.messagesRv;
        Intrinsics.checkNotNullExpressionValue(messagesRv, "messagesRv");
        messagesRv.setVisibility(z11 ? 0 : 8);
        ScrollToLastMessageButton scrollToLastMessageBtn = mFragmentChatBinding.scrollToLastMessageBtn;
        Intrinsics.checkNotNullExpressionValue(scrollToLastMessageBtn, "scrollToLastMessageBtn");
        scrollToLastMessageBtn.setVisibility(z11 ? 0 : 8);
        Context context = mFragmentChatBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ru.ozon.android.messenger.utils.h.b(context)) {
            BottomArcView teethArch = mFragmentChatBinding.teethArch;
            Intrinsics.checkNotNullExpressionValue(teethArch, "teethArch");
            teethArch.setVisibility(0);
        }
    }

    public final void w() {
        this.f89898m = null;
        this.f89901p = null;
        this.f89902q = false;
        this.f89903r = false;
        this.f89899n = null;
    }

    public final void x(@NotNull ru.ozon.android.messenger.framework.presentation.messenger.i uiEvent) {
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        if (!(uiEvent instanceof i.a)) {
            throw new Sc.o();
        }
        HapticVibrator hapticVibrator = HapticVibrator.INSTANCE;
        ConstraintLayout constraintLayout = this.f89888c.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        hapticVibrator.vibrate(constraintLayout, ((i.a) uiEvent).a());
    }

    public final void y(@NotNull w pinUiEvent) {
        Intrinsics.checkNotNullParameter(pinUiEvent, "pinUiEvent");
        boolean d11 = Intrinsics.d(pinUiEvent, w.a.f90412a);
        h hVar = this.f89887b;
        if (d11) {
            hVar.n();
        } else {
            if (!Intrinsics.d(pinUiEvent, w.b.f90413a)) {
                throw new Sc.o();
            }
            hVar.o();
        }
    }

    public final void z(@NotNull j uiEvent) {
        String str;
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        boolean z11 = uiEvent instanceof j.i;
        MFragmentChatBinding mFragmentChatBinding = this.f89888c;
        int i11 = 0;
        if (z11) {
            ((j.i) uiEvent).getClass();
            MessengerMetricsRecyclerView messengerMetricsRecyclerView = mFragmentChatBinding.messagesRv;
            messengerMetricsRecyclerView.stopScroll();
            int shimmersCount = D().getShimmersCount() - 1;
            if (shimmersCount < 0) {
                shimmersCount = 0;
            }
            ru.ozon.android.messenger.utils.view.k.a(messengerMetricsRecyclerView, shimmersCount, false, 2);
            return;
        }
        if (uiEvent instanceof j.C1661j) {
            D().registerAdapterDataObserver(new p(this));
            return;
        }
        if (uiEvent instanceof j.l) {
            MessengerMetricsRecyclerView messagesRv = mFragmentChatBinding.messagesRv;
            Intrinsics.checkNotNullExpressionValue(messagesRv, "messagesRv");
            ((j.l) uiEvent).getClass();
            ru.ozon.android.messenger.utils.view.k.a(messagesRv, 0, false, 6);
            return;
        }
        boolean z12 = uiEvent instanceof j.r;
        ru.ozon.android.messenger.framework.core.d dVar = this.f89890e;
        if (z12) {
            j.r rVar = (j.r) uiEvent;
            View rootView = mFragmentChatBinding.getConstraintLayout().getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup == null) {
                return;
            }
            rVar.getClass();
            ru.ozon.android.messenger.framework.presentation.common.view.flashbar.factory.b.c(viewGroup, new OzonSpannableString(null), null, null, dVar.f(), 498).e();
            return;
        }
        if (uiEvent instanceof j.h) {
            this.f89904s = true;
            return;
        }
        if (uiEvent instanceof j.d) {
            ((j.d) uiEvent).a().invoke(I());
            return;
        }
        boolean z13 = uiEvent instanceof j.f;
        ru.ozon.android.messenger.framework.navigation.d dVar2 = this.f89892g;
        if (z13) {
            ComponentCallbacksC5392m fragment = dVar.d();
            dVar2.getClass();
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Context requireContext = fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", requireContext.getPackageName(), null));
            requireContext.startActivity(intent);
            return;
        }
        if (uiEvent instanceof j.n) {
            ComponentCallbacksC5392m fragment2 = dVar.d();
            dVar2.getClass();
            Intrinsics.checkNotNullParameter(fragment2, "fragment");
            androidx.fragment.app.G parentFragmentManager = fragment2.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            Q p11 = parentFragmentManager.p();
            int i12 = R$id.fragmentChatContainer;
            b7.d.d();
            C9488a c9488a = new C9488a();
            ru.ozon.android.messenger.utils.g.g(c9488a, new Pair("ARG_INITIAL_FILTER", null));
            p11.r(i12, c9488a, null);
            p11.i();
            return;
        }
        if (uiEvent instanceof j.e) {
            Context a11 = ru.ozon.android.messenger.framework.core.f.a(dVar);
            dVar2.getClass();
            ru.ozon.android.messenger.framework.navigation.d.c(a11);
            return;
        }
        if (uiEvent instanceof j.c) {
            Context a12 = ru.ozon.android.messenger.framework.core.f.a(dVar);
            dVar2.getClass();
            ru.ozon.android.messenger.framework.navigation.d.c(a12);
            return;
        }
        if (uiEvent instanceof j.g) {
            y reportContent = ((j.g) uiEvent).a();
            Intrinsics.checkNotNullParameter(reportContent, "reportContent");
            ru.ozon.android.messenger.framework.presentation.chatdetail.report.a aVar = new ru.ozon.android.messenger.framework.presentation.chatdetail.report.a();
            ru.ozon.android.messenger.utils.g.g(aVar, new Pair("BUNDLE_ARG_REPORT_CONTENT", reportContent));
            androidx.fragment.app.G fragmentManager = dVar.d().getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(fragmentManager, "getChildFragmentManager(...)");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            aVar.show(fragmentManager, "ru.ozon.android.messenger.framework.presentation.chatdetail.report.a");
            return;
        }
        if (uiEvent instanceof j.o) {
            c.b.C1710b couponContent = ((j.o) uiEvent).a();
            Intrinsics.checkNotNullParameter(couponContent, "couponContent");
            ru.ozon.android.messenger.framework.presentation.chatdetail.coupon.a aVar2 = new ru.ozon.android.messenger.framework.presentation.chatdetail.coupon.a();
            ru.ozon.android.messenger.utils.g.g(aVar2, new Pair("BUNDLE_ARG_COUPON_CONTENT", couponContent));
            androidx.fragment.app.G fragmentManager2 = dVar.d().getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(fragmentManager2, "getChildFragmentManager(...)");
            Intrinsics.checkNotNullParameter(fragmentManager2, "fragmentManager");
            aVar2.show(fragmentManager2, "ru.ozon.android.messenger.framework.presentation.chatdetail.coupon.a");
            return;
        }
        boolean z14 = uiEvent instanceof j.a;
        ru.ozon.android.messenger.framework.presentation.common.notification.j jVar = this.f89896k;
        if (z14) {
            String a13 = ((j.a) uiEvent).a();
            ViewGroup b11 = C8612b.b(dVar.d());
            if (b11 != null) {
                Context context = b11.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ru.ozon.android.messenger.utils.c.f(context, a13);
                NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(b11, null, 1, null);
                androidx.lifecycle.J viewLifecycleOwner = dVar.d().getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Context context2 = b11.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                jVar.a(asNotificationLayoutManager$default, viewLifecycleOwner, ru.ozon.android.messenger.utils.c.d(R$string.messenger_text_copy_success, context2), null);
                return;
            }
            return;
        }
        if (uiEvent instanceof j.b) {
            Map<String, Object> a14 = ((j.b) uiEvent).a();
            ViewGroup b12 = C8612b.b(dVar.d());
            if (b12 == null || a14 == null || (str = (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.TEXT.a(), a14)) == null) {
                return;
            }
            Context context3 = b12.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ru.ozon.android.messenger.utils.c.f(context3, str);
            String str2 = (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.NOTIFICATION_TITLE.a(), a14);
            if (str2 == null) {
                return;
            }
            String str3 = (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.NOTIFICATION_SUBTITLE.a(), a14);
            NotificationLayoutManager asNotificationLayoutManager$default2 = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(b12, null, 1, null);
            androidx.lifecycle.J viewLifecycleOwner2 = dVar.d().getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            jVar.a(asNotificationLayoutManager$default2, viewLifecycleOwner2, str2, str3);
            return;
        }
        if (uiEvent instanceof j.s) {
            ConstraintLayout constraintLayout = mFragmentChatBinding.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            this.f89895j.a(CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(constraintLayout, null, 1, null), dVar.f());
            return;
        }
        if (uiEvent instanceof j.p) {
            ComponentCallbacksC5392m d11 = dVar.d();
            ru.ozon.android.messenger.blocks.curtain.c a15 = ((j.p) uiEvent).a();
            dVar2.getClass();
            ru.ozon.android.messenger.framework.navigation.d.e(d11, a15);
            return;
        }
        if (uiEvent instanceof j.q) {
            ComponentCallbacksC5392m fragment3 = dVar.d();
            ru.ozon.android.messenger.blocks.curtain.c curtain = ((j.q) uiEvent).a();
            String namespace = ru.ozon.android.messenger.utils.g.e(dVar.d());
            dVar2.getClass();
            Intrinsics.checkNotNullParameter(fragment3, "fragment");
            Intrinsics.checkNotNullParameter(curtain, "modalVO");
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            int i13 = ru.ozon.android.messenger.framework.presentation.common.screen.compose.k.f91089h;
            Intrinsics.checkNotNullParameter(curtain, "curtain");
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            ru.ozon.android.messenger.framework.presentation.common.screen.compose.k kVar = new ru.ozon.android.messenger.framework.presentation.common.screen.compose.k();
            ru.ozon.android.messenger.utils.g.g(kVar, new Pair("ARG_CURTAIN", curtain), new Pair("ARG_MESSENGER_NAMESPACE", namespace));
            kVar.show(fragment3.getChildFragmentManager(), ru.ozon.android.messenger.framework.presentation.common.screen.compose.k.class.getSimpleName());
            return;
        }
        if (uiEvent instanceof j.m) {
            C9514a a16 = ((j.m) uiEvent).a();
            String e11 = ru.ozon.android.messenger.utils.g.e(dVar.d());
            int i14 = ru.ozon.android.messenger.framework.presentation.common.screen.compose.d.f91057e;
            d.f.a(a16, e11).show(dVar.d().getChildFragmentManager(), ru.ozon.android.messenger.framework.presentation.common.screen.compose.d.class.getSimpleName());
            return;
        }
        if (!(uiEvent instanceof j.k)) {
            throw new Sc.o();
        }
        RecyclerView.g adapter = mFragmentChatBinding.messagesRv.getAdapter();
        ru.ozon.android.messenger.framework.presentation.common.view.recycler.i iVar = adapter instanceof ru.ozon.android.messenger.framework.presentation.common.view.recycler.i ? (ru.ozon.android.messenger.framework.presentation.common.view.recycler.i) adapter : null;
        if (iVar == null) {
            return;
        }
        List<ru.ozon.android.messenger.framework.presentation.models.q> currentList = iVar.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator<ru.ozon.android.messenger.framework.presentation.models.q> it = currentList.iterator();
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            ru.ozon.android.messenger.framework.presentation.models.q next = it.next();
            Intrinsics.f(next);
            if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(next), ((j.k) uiEvent).a())) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1) {
            mFragmentChatBinding.messagesRv.post(new H4.a(this, i11, ((j.k) uiEvent).a(), 1));
        } else {
            this.f89899n = ((j.k) uiEvent).a();
        }
    }
}
