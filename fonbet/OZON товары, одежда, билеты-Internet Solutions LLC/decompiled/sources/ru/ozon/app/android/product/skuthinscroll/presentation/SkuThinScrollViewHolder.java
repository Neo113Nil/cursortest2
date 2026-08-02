package ru.ozon.app.android.product.skuthinscroll.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import WZ.l;
import android.R;
import android.os.Parcelable;
import android.widget.LinearLayout;
import androidx.core.view.G;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.databinding.WidgetSkuThinScrollBinding;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollHeaderDTO;
import ru.ozon.app.android.product.utils.ComposerRefreshExtKt;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ#\u0010#\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\"\u001a\u00060 j\u0002`!H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0017H\u0016¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\u0017H\u0016¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010\u0019J\u000f\u0010(\u001a\u00020\u0017H\u0016¢\u0006\u0004\b(\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00170/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/product/databinding/WidgetSkuThinScrollBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "<init>", "(Lru/ozon/app/android/product/databinding/WidgetSkuThinScrollBinding;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/video/preload/PlayerPreloader;)V", "", "observeRefresh", "()V", "item", "restoreScrollState", "(Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO;)V", "saveScrollState", "()Lkotlin/Unit;", "setRootLocatorIfExists", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO;Ll20/d;)V", "onAttach", "onViewInVisibleBounds", "onRecycle", "onDetach", "Lru/ozon/app/android/product/databinding/WidgetSkuThinScrollBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lnc/a;", "addToCartDisposables", "Lnc/a;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinItemsAdapter;", "adapter", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinItemsAdapter;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SkuThinScrollViewHolder extends k<SkuThinScrollVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SkuThinItemsAdapter adapter;

    @NotNull
    private final C8486a addToCartDisposables;

    @NotNull
    private final WidgetSkuThinScrollBinding binding;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SkuThinScrollViewHolder(@NotNull WidgetSkuThinScrollBinding binding, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull CartService cartService, @NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker, @NotNull CoroutineDispatcherProvider coroutineDispatcherProvider, @NotNull PlayerPreloader playerPreloader) {
        super(r1);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.addToCartDisposables = new C8486a();
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onClick(new SkuThinScrollViewHolder$actionHandler$1(this, cartService)).buildHandler();
        this.actionHandler = buildHandler;
        SkuThinItemsAdapter skuThinItemsAdapter = new SkuThinItemsAdapter(buildHandler, null, refs, cartService, adultHandler, featureChecker, coroutineDispatcherProvider, new SkuThinScrollViewHolder$adapter$1(playerPreloader), tokenizedAnalytics, this, 2, null);
        RecyclerView recyclerView = binding.itemsRv;
        recyclerView.setAdapter(skuThinItemsAdapter);
        recyclerView.addItemDecoration(new SkuThinScrollOffsetItemsDecorator());
        this.adapter = skuThinItemsAdapter;
        binding.itemsRv.setItemAnimator(null);
        binding.headerTav.setTextAppearance(R.style.TextAppearance.Material.Body1);
    }

    private final void observeRefresh() {
        final InterfaceC2395h<A00.a> eventsFlow = this.refs.getController().getEventsFlow();
        C2399j.C(new C2408n0(new InterfaceC2395h<A00.a>() { // from class: ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollViewHolder$observeRefresh$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollViewHolder$observeRefresh$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollViewHolder$observeRefresh$$inlined$filter$1$2", f = "SkuThinScrollViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollViewHolder$observeRefresh$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (ComposerRefreshExtKt.isEventRefresh((A00.a) obj)) {
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
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super A00.a> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new SkuThinScrollViewHolder$observeRefresh$2(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreScrollState(SkuThinScrollVO item) {
        RecyclerView.o layoutManager;
        Parcelable layoutManagerState = item.getLayoutManagerState();
        if (layoutManagerState == null || (layoutManager = this.binding.itemsRv.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(layoutManagerState);
    }

    private final Unit saveScrollState() {
        Parcelable onSaveInstanceState;
        RecyclerView.o layoutManager = this.binding.itemsRv.getLayoutManager();
        if (layoutManager == null || (onSaveInstanceState = layoutManager.onSaveInstanceState()) == null) {
            return null;
        }
        SkuThinScrollVO boundData = getBoundData();
        if (boundData != null) {
            boundData.setLayoutManagerState(onSaveInstanceState);
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit setRootLocatorIfExists() {
        TestInfo testInfo;
        String automatizationId;
        SkuThinScrollVO boundData = getBoundData();
        if (boundData == null || (testInfo = boundData.getTestInfo()) == null || (automatizationId = testInfo.getAutomatizationId()) == null) {
            return null;
        }
        this.binding.getConstraintLayout().setContentDescription(automatizationId);
        return Unit.f71690a;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeRefresh();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        saveScrollState();
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.addToCartDisposables.d();
        saveScrollState();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        setRootLocatorIfExists();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SkuThinScrollVO item, @NotNull l20.d info) {
        TextDTO text;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetSkuThinScrollBinding widgetSkuThinScrollBinding = this.binding;
        final LinearLayout constraintLayout = widgetSkuThinScrollBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        G.a(constraintLayout, new Runnable() { // from class: ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollViewHolder$bind$lambda$6$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.setRootLocatorIfExists();
            }
        });
        SkuThinScrollHeaderDTO header = item.getHeader();
        if (header == null || (text = header.getText()) == null) {
            TextAtomV2View headerTav = widgetSkuThinScrollBinding.headerTav;
            Intrinsics.checkNotNullExpressionValue(headerTav, "headerTav");
            headerTav.setVisibility(8);
        } else {
            TextAtomV2View headerTav2 = widgetSkuThinScrollBinding.headerTav;
            Intrinsics.checkNotNullExpressionValue(headerTav2, "headerTav");
            headerTav2.setVisibility(0);
            TextAtomV2View headerTav3 = widgetSkuThinScrollBinding.headerTav;
            Intrinsics.checkNotNullExpressionValue(headerTav3, "headerTav");
            headerTav3.setPadding(0, 0, 0, 0);
            TextAtomV2View headerTav4 = widgetSkuThinScrollBinding.headerTav;
            Intrinsics.checkNotNullExpressionValue(headerTav4, "headerTav");
            TextHolderKt.bind$default(headerTav4, text, null, 2, null);
        }
        this.adapter.submitList(item.getItems(), new DW.a(1, this, item));
    }
}
