package ru.ozon.app.android.marketing.widgets.coupon.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import d20.AbstractC6065b;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import m10.C8042d;
import oU.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.marketing.R$dimen;
import ru.ozon.app.android.marketing.R$layout;
import ru.ozon.app.android.marketing.coupon.ActivateCouponActionHandler;
import ru.ozon.app.android.marketing.databinding.WidgetGradientCouponBinding;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00012\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e*\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\t0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00108\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/presentation/HighlightsCouponOverlayViewHolder;", "Ld20/b;", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;", "Ll10/i;", "container", "Lru/ozon/app/android/marketing/coupon/ActivateCouponActionHandler;", "couponActionHandler", "<init>", "(Ll10/i;Lru/ozon/app/android/marketing/coupon/ActivateCouponActionHandler;)V", "", "updatePositionAndVisibility", "()V", "Landroid/view/View;", "stickyPlaceholder", "", "visibleHeight", "(Landroid/view/View;Landroid/view/View;)F", "", "isOriginalCouponOutOfBounds", "()Z", "", "findFirstVisiblePosition", "()I", "onWidgetCreated", "onWidgetDestroyed", "addView", "removeView", "item", "bind", "(Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;)V", "Ll10/i;", "Lru/ozon/app/android/marketing/coupon/ActivateCouponActionHandler;", "Landroid/view/ViewGroup;", "rootView", "Landroid/view/ViewGroup;", "Landroidx/recyclerview/widget/g;", "recyclerView", "Landroidx/recyclerview/widget/g;", "view", "Landroid/view/View;", "Lru/ozon/app/android/marketing/databinding/WidgetGradientCouponBinding;", "binding", "Lru/ozon/app/android/marketing/databinding/WidgetGradientCouponBinding;", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponBinder;", "couponBinder", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponBinder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/marketing/widgets/coupon/presentation/HighlightsCouponOverlayViewHolder$scrollListener$1", "scrollListener", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/HighlightsCouponOverlayViewHolder$scrollListener$1;", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "metricView", "getMetricView", "()Landroid/view/View;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HighlightsCouponOverlayViewHolder extends AbstractC6065b<CouponVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetGradientCouponBinding binding;

    @NotNull
    private final i container;

    @NotNull
    private final ActivateCouponActionHandler couponActionHandler;

    @NotNull
    private final CouponBinder couponBinder;

    @NotNull
    private final View.OnLayoutChangeListener layoutChangeListener;

    @NotNull
    private final View metricView;

    @NotNull
    private final g recyclerView;

    @NotNull
    private final ViewGroup rootView;

    @NotNull
    private final HighlightsCouponOverlayViewHolder$scrollListener$1 scrollListener;

    @NotNull
    private final View view;

    /* JADX WARN: Type inference failed for: r4v5, types: [ru.ozon.app.android.marketing.widgets.coupon.presentation.HighlightsCouponOverlayViewHolder$scrollListener$1] */
    public HighlightsCouponOverlayViewHolder(@NotNull i container, @NotNull ActivateCouponActionHandler couponActionHandler) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(couponActionHandler, "couponActionHandler");
        this.container = container;
        this.couponActionHandler = couponActionHandler;
        ViewGroup Z11 = container.Z();
        this.rootView = Z11;
        this.recyclerView = container.e0();
        View inflate = LayoutInflater.from(Z11.getContext()).inflate(R$layout.widget_gradient_coupon, Z11, false);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        inflate.setVisibility(8);
        Intrinsics.checkNotNullExpressionValue(inflate.getContext(), "getContext(...)");
        inflate.setTranslationZ(ResourceExtKt.dim(r0, R$dimen.mini_widget_margin));
        Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
        this.view = inflate;
        WidgetGradientCouponBinding bind = WidgetGradientCouponBinding.bind(inflate);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.couponBinder = new CouponBinder(bind);
        this.actionHandler = new ActionHandler.Builder(container, this).onComposerAction(new HighlightsCouponOverlayViewHolder$actionHandler$1(this)).buildHandler();
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.marketing.widgets.coupon.presentation.HighlightsCouponOverlayViewHolder$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                HighlightsCouponOverlayViewHolder.this.updatePositionAndVisibility();
            }
        };
        this.layoutChangeListener = new c(this, 1);
        this.metricView = inflate;
    }

    private final int findFirstVisiblePosition() {
        View findChildViewUnder = this.recyclerView.findChildViewUnder((r0.getRight() - this.recyclerView.getLeft()) / 2, this.recyclerView.getTop());
        if (findChildViewUnder != null) {
            return this.recyclerView.getChildAdapterPosition(findChildViewUnder);
        }
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            return linearLayoutManager.findFirstVisibleItemPosition();
        }
        return 0;
    }

    private final boolean isOriginalCouponOutOfBounds() {
        int i11;
        RecyclerView.g adapter = this.recyclerView.getAdapter();
        C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
        if (c8042d == null) {
            return false;
        }
        List<l> g10 = c8042d.g();
        ListIterator<l> listIterator = g10.listIterator(g10.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i11 = -1;
                break;
            }
            if (listIterator.previous().d() instanceof CouponVO) {
                i11 = listIterator.nextIndex();
                break;
            }
        }
        return i11 != -1 && findFirstVisiblePosition() > i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePositionAndVisibility() {
        View findViewById = this.rootView.findViewById(R.id.stickyPlaceholder);
        this.view.setY((findViewById != null ? findViewById.getY() : 0.0f) + visibleHeight(this.rootView.findViewById(R.id.stickyContainer), findViewById));
        View view = this.view;
        CouponVO boundData = getBoundData();
        view.setVisibility((boundData != null ? boundData.getCurrentMiniWidget() : null) == HighlightsCurrentMiniWidget.COUPON && isOriginalCouponOutOfBounds() ? 0 : 8);
    }

    private final float visibleHeight(View view, View view2) {
        if (view != null) {
            return Math.max(0.0f, view.getTranslationY() + view.getBottom());
        }
        if (view2 != null) {
            return view2.getHeight();
        }
        return 0.0f;
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        if (this.view.getParent() == null) {
            this.rootView.addView(this.view);
        }
        updatePositionAndVisibility();
    }

    @Override // d20.AbstractC6065b
    @NotNull
    /* renamed from: getMetricView, reason: from getter */
    public View getView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.couponBinder.setOnClickListener(new HighlightsCouponOverlayViewHolder$onWidgetCreated$1(this));
        final InterfaceC2395h<Set<String>> observeCouponStorage = this.couponActionHandler.observeCouponStorage();
        final CouponBinder couponBinder = this.couponBinder;
        C2399j.C(new C2408n0(C2399j.o(new InterfaceC2395h<Set<? extends String>>() { // from class: ru.ozon.app.android.marketing.widgets.coupon.presentation.HighlightsCouponOverlayViewHolder$onWidgetCreated$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.marketing.widgets.coupon.presentation.HighlightsCouponOverlayViewHolder$onWidgetCreated$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ CouponBinder receiver$inlined;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.marketing.widgets.coupon.presentation.HighlightsCouponOverlayViewHolder$onWidgetCreated$$inlined$filter$1$2", f = "HighlightsCouponOverlayViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.marketing.widgets.coupon.presentation.HighlightsCouponOverlayViewHolder$onWidgetCreated$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, CouponBinder couponBinder) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.receiver$inlined = couponBinder;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (this.receiver$inlined.isCouponApplied((Set) obj)) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Set<? extends String>> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, couponBinder), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }), new HighlightsCouponOverlayViewHolder$onWidgetCreated$3(this, null)), K.a(this));
        this.recyclerView.addOnScrollListener(this.scrollListener);
        View findViewById = this.rootView.findViewById(R.id.stickyPlaceholder);
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(this.layoutChangeListener);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.recyclerView.removeOnScrollListener(this.scrollListener);
        View findViewById = this.rootView.findViewById(R.id.stickyPlaceholder);
        if (findViewById != null) {
            findViewById.removeOnLayoutChangeListener(this.layoutChangeListener);
        }
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        this.rootView.removeView(this.view);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CouponVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.couponBinder.bind(item, true);
        updatePositionAndVisibility();
    }
}
