package m10;

import B0.A0;
import P10.f;
import T7.E;
import Ve.C4598rp;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import f20.C6406a;
import h20.C6787b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m10.j;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: m10.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8042d extends RecyclerView.g<ru.ozon.composer.ui.widget.k<l20.c>> implements N10.b<ru.ozon.composer.ui.widget.k<l20.c>>, l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l10.i f74008a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W10.b f74009b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final n20.k<? extends InterfaceC8046a<?, ? extends l20.c>> f74010c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.composer.ui.widget.a f74011d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.composer.ui.widget.f f74012e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C6787b f74013f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final M10.a f74014g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final jk0.g<ru.ozon.composer.ui.widget.k<l20.c>> f74015h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final p f74016i;

    /* renamed from: j, reason: collision with root package name */
    private VL.b f74017j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f74018k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final j<ru.ozon.composer.ui.widget.l> f74019l;

    /* renamed from: m, reason: collision with root package name */
    private jk0.f<ru.ozon.composer.ui.widget.k<l20.c>> f74020m;

    /* renamed from: n, reason: collision with root package name */
    private BY.b f74021n;

    /* renamed from: m10.d$a */
    private static final class a extends i.d<ru.ozon.composer.ui.widget.l> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C8040b f74022a;

        public a(@NotNull C8040b baseComposerItemCallback) {
            Intrinsics.checkNotNullParameter(baseComposerItemCallback, "baseComposerItemCallback");
            this.f74022a = baseComposerItemCallback;
        }

        @Override // androidx.recyclerview.widget.i.d
        public final boolean areContentsTheSame(ru.ozon.composer.ui.widget.l lVar, ru.ozon.composer.ui.widget.l lVar2) {
            ru.ozon.composer.ui.widget.l oldItem = lVar;
            ru.ozon.composer.ui.widget.l newItem = lVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            this.f74022a.getClass();
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem) && Intrinsics.d(oldItem.l(), newItem.l());
        }

        @Override // androidx.recyclerview.widget.i.d
        public final boolean areItemsTheSame(ru.ozon.composer.ui.widget.l lVar, ru.ozon.composer.ui.widget.l lVar2) {
            ru.ozon.composer.ui.widget.l oldItem = lVar;
            ru.ozon.composer.ui.widget.l newItem = lVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return this.f74022a.areItemsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public final Object getChangePayload(ru.ozon.composer.ui.widget.l lVar, ru.ozon.composer.ui.widget.l lVar2) {
            ru.ozon.composer.ui.widget.l oldItem = lVar;
            ru.ozon.composer.ui.widget.l newItem = lVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            Object changePayload = this.f74022a.getChangePayload(oldItem, newItem);
            return !Intrinsics.d(oldItem.l(), newItem.l()) ? new c(changePayload) : changePayload;
        }
    }

    /* renamed from: m10.d$b */
    private static final class b implements j.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final l10.i f74023a;

        public b(@NotNull l10.i container) {
            Intrinsics.checkNotNullParameter(container, "container");
            this.f74023a = container;
        }

        @Override // m10.j.a
        public final void a() {
        }

        @Override // m10.j.a
        public final void b() {
            this.f74023a.h0();
        }
    }

    /* renamed from: m10.d$c */
    /* loaded from: classes3.dex */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Object f74024a;

        public c(Object obj) {
            this.f74024a = obj;
        }

        public final Object a() {
            return this.f74024a;
        }
    }

    public C8042d(@NotNull l10.i container, @NotNull W10.b widgetTracker, @NotNull n20.k widgetStore, @NotNull ru.ozon.composer.ui.widget.a widgetsFactory, @NotNull ru.ozon.composer.ui.widget.f viewedPond, @NotNull C6787b composerWidgetViewModelStore, @NotNull M10.a composerVerticalScrollOffsetController, @NotNull jk0.g lifecycleAdapterDelegateFactory, @NotNull C8040b baseComposerDiffItemCallback) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(widgetTracker, "widgetTracker");
        Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
        Intrinsics.checkNotNullParameter(widgetsFactory, "widgetsFactory");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        Intrinsics.checkNotNullParameter(composerWidgetViewModelStore, "composerWidgetViewModelStore");
        Intrinsics.checkNotNullParameter(composerVerticalScrollOffsetController, "composerVerticalScrollOffsetController");
        Intrinsics.checkNotNullParameter(lifecycleAdapterDelegateFactory, "lifecycleAdapterDelegateFactory");
        Intrinsics.checkNotNullParameter(baseComposerDiffItemCallback, "baseComposerDiffItemCallback");
        this.f74008a = container;
        this.f74009b = widgetTracker;
        this.f74010c = widgetStore;
        this.f74011d = widgetsFactory;
        this.f74012e = viewedPond;
        this.f74013f = composerWidgetViewModelStore;
        this.f74014g = composerVerticalScrollOffsetController;
        this.f74015h = lifecycleAdapterDelegateFactory;
        this.f74016i = new p();
        j<ru.ozon.composer.ui.widget.l> jVar = new j<>(this, new a(baseComposerDiffItemCallback));
        jVar.d(new b(container));
        this.f74019l = jVar;
    }

    private final void k(int i11) {
        VL.b bVar = this.f74017j;
        if (bVar != null && i11 >= getCardsCount() - ((int) Math.ceil((getCardsCount() * 30) / 100.0d))) {
            l10.i.b((l10.i) bVar.f28451a);
        }
    }

    @Override // m10.l
    public final boolean a(int i11) {
        l20.c b11 = b(i11);
        return (b11 == null || (b11 instanceof g20.b) || (b11 instanceof C6406a)) ? false : true;
    }

    @Override // m10.l
    public final l20.c b(int i11) {
        if (i11 < 0 || i11 > C7714v.P(this.f74019l.e())) {
            return null;
        }
        return h(i11).d();
    }

    @Override // m10.l
    public final Integer c(@NotNull Class<? extends l20.c> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Iterator<ru.ozon.composer.ui.widget.l> it = this.f74019l.e().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (clazz.isInstance(it.next().d())) {
                break;
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        if (i11 != -1) {
            return valueOf;
        }
        return null;
    }

    @Override // N10.b
    @NotNull
    public final ru.ozon.composer.ui.widget.l d(int i11) {
        return h(i11);
    }

    @Override // N10.b
    @NotNull
    public final TreeSet e() {
        TreeSet treeSet = new TreeSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int cardsCount = getCardsCount();
        int i11 = 0;
        for (int i12 = 0; i12 < cardsCount; i12++) {
            ru.ozon.composer.ui.widget.l h11 = h(i12);
            InterfaceC8046a<?, ? extends l20.c> viewMapper = this.f74010c.getViewMapper(h11.j());
            if (!(viewMapper instanceof ru.ozon.composer.ui.widget.g)) {
                viewMapper = null;
            }
            ru.ozon.composer.ui.widget.g gVar = (ru.ozon.composer.ui.widget.g) viewMapper;
            N10.h stickyWidgetConfig = gVar != null ? gVar.getStickyWidgetConfig(h11.d()) : null;
            if (stickyWidgetConfig != null) {
                int itemViewType = getItemViewType(i12);
                if (linkedHashSet.contains(Integer.valueOf(itemViewType))) {
                    linkedHashSet.clear();
                    i11++;
                }
                linkedHashSet.add(Integer.valueOf(itemViewType));
                treeSet.add(new N10.c(C4598rp.c(i11, A0.b("StickyGroupTag(tag=", stickyWidgetConfig.b(), ")"), "_"), i12));
            }
        }
        return treeSet;
    }

    public final void f(@NotNull f.a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f74019l.d(callback);
    }

    @NotNull
    public final List<ru.ozon.composer.ui.widget.l> g() {
        return this.f74019l.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public final int getCardsCount() {
        return this.f74019l.e().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i11) {
        return h(i11).j();
    }

    @NotNull
    public final ru.ozon.composer.ui.widget.l h(int i11) {
        return this.f74019l.e().get(i11);
    }

    @NotNull
    public final p i() {
        return this.f74016i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(int i11, @NotNull ru.ozon.composer.ui.widget.k holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (U4.a.b()) {
            holder.getClass();
        }
        ru.ozon.composer.ui.widget.l h11 = h(i11);
        p pVar = this.f74016i;
        pVar.b().invoke(holder, h11);
        ru.ozon.composer.ui.widget.k.bind$composer_recycler_ui_release$default(holder, h11, h11.d(), this.f74012e, this.f74013f.b(h11), null, 16, null);
        if (this.f74018k) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            InterfaceC8046a<?, ? extends l20.c> viewMapper = this.f74010c.getViewMapper(h11.j());
            if (!(viewMapper instanceof ru.ozon.composer.ui.widget.g)) {
                viewMapper = null;
            }
            ru.ozon.composer.ui.widget.g gVar = (ru.ozon.composer.ui.widget.g) viewMapper;
            N10.h stickyWidgetConfig = gVar != null ? gVar.getStickyWidgetConfig(h11.d()) : null;
            N10.f d11 = stickyWidgetConfig != null ? stickyWidgetConfig.d() : null;
            Intrinsics.checkNotNullParameter(itemView, "<this>");
            itemView.setTag(R.id.sticky_overlap_info, d11);
        }
        pVar.a().invoke(holder, h11);
        k(i11);
        Unit unit = Unit.f71690a;
    }

    public final void l(@NotNull jk0.l info) {
        Intrinsics.checkNotNullParameter(info, "info");
        jk0.f<ru.ozon.composer.ui.widget.k<l20.c>> fVar = this.f74020m;
        if (fVar != null) {
            fVar.i(info);
        }
    }

    public final void m(VL.b bVar) {
        this.f74017j = bVar;
    }

    public final void n(@NotNull BY.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f74021n = listener;
    }

    public final void o(boolean z11) {
        this.f74018k = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.setRecycleChildrenOnDetach(true);
        }
        jk0.f<ru.ozon.composer.ui.widget.k<l20.c>> a11 = this.f74015h.a(layoutManager, this.f74008a.Q().g(), this.f74014g);
        this.f74020m = a11;
        a11.d(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final ru.ozon.composer.ui.widget.k<l20.c> onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        long nanoTime = System.nanoTime();
        ru.ozon.composer.ui.widget.k<l20.c> e11 = this.f74011d.e(i11, this.f74008a);
        if (e11 == null) {
            throw new n(i11);
        }
        e11.setBindingAdapter$composer_recycler_ui_release(this);
        e11.setComposerWidgetTracker$composer_recycler_ui_release(this.f74009b);
        this.f74016i.c().invoke(e11, Long.valueOf(nanoTime));
        return e11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        jk0.f<ru.ozon.composer.ui.widget.k<l20.c>> fVar = this.f74020m;
        if (fVar != null) {
            fVar.f(recyclerView);
        }
        this.f74020m = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewAttachedToWindow(ru.ozon.composer.ui.widget.k<l20.c> kVar) {
        ru.ozon.composer.ui.widget.k<l20.c> holder = kVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        jk0.f<ru.ozon.composer.ui.widget.k<l20.c>> fVar = this.f74020m;
        if (fVar != null) {
            fVar.g(holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewDetachedFromWindow(ru.ozon.composer.ui.widget.k<l20.c> kVar) {
        ru.ozon.composer.ui.widget.k<l20.c> holder = kVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        jk0.f<ru.ozon.composer.ui.widget.k<l20.c>> fVar = this.f74020m;
        if (fVar != null) {
            fVar.h(holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewRecycled(ru.ozon.composer.ui.widget.k<l20.c> kVar) {
        ru.ozon.composer.ui.widget.k<l20.c> holder = kVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.f74020m != null) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.onRecycle();
        }
    }

    public final void p(ArrayList arrayList, boolean z11, @NotNull Function0 onListSubmitted) {
        Intrinsics.checkNotNullParameter(onListSubmitted, "onListSubmitted");
        BY.b bVar = this.f74021n;
        if (bVar != null) {
            ((P10.b) bVar.f3307a).f(arrayList);
        }
        this.f74019l.g(arrayList, !z11, onListSubmitted);
    }

    @NotNull
    public final String toString() {
        return E.a(getCardsCount(), "ComposerAdapter(itemCount=", ")");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(ru.ozon.composer.ui.widget.k<l20.c> kVar, int i11, List payloads) {
        ru.ozon.composer.ui.widget.k<l20.c> holder = kVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i11, payloads);
            return;
        }
        ru.ozon.composer.ui.widget.l h11 = h(i11);
        boolean z11 = true;
        for (Object obj : payloads) {
            if (obj instanceof c) {
                k(i11);
                obj = ((c) obj).a();
                if (obj == null) {
                }
            }
            Object obj2 = obj;
            holder.bind$composer_recycler_ui_release(h11, h11.d(), this.f74012e, this.f74013f.b(h11), obj2);
            z11 = false;
        }
        if (z11) {
            super.onBindViewHolder(holder, i11, K.f71697a);
        }
    }
}
