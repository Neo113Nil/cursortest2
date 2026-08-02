package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import AA.d;
import AF.g;
import BT.b;
import Cw.c;
import Dp.C2877a;
import Fn.C3055d;
import Fn.C3056e;
import Lm0.a;
import Tm.C4047b;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import io.reactivex.k;
import io.reactivex.p;
import io.reactivex.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.autopicker.view.productpickersearch.data.repo.ProductPickerSearchInitialNetworkData;
import ru.ozon.app.android.autopicker.view.productpickersearch.domain.ProductPickerSearchInteractor;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.Action;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import sc.C9653a;
import sc.C9656b;
import xc.C10699b;
import xc.m;
import xc.n;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJC\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\"\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchViewModel;", "Lru/ozon/app/android/autopicker/view/productpickersearch/domain/ProductPickerSearchInteractor;", "interactor", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchAnalytics;", "analytics", "<init>", "(Lru/ozon/app/android/autopicker/view/productpickersearch/domain/ProductPickerSearchInteractor;Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchAnalytics;)V", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "currentStep", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "paramsExtra", "", "setInitialNetworkData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "", "isButtonClick", "onRetrieveData", "(Z)V", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "item", "onLeafClicked", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;)V", "", "position", "onNodeClicked", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;I)V", "text", "onSearch", "(Ljava/lang/String;)V", "onCleared", "()V", "Lru/ozon/app/android/autopicker/view/productpickersearch/domain/ProductPickerSearchInteractor;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchAnalytics;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/Action;", "actionLiveData", "Landroidx/lifecycle/V;", "getActionLiveData", "()Landroidx/lifecycle/V;", "Lnc/a;", "disposables", "Lnc/a;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchViewModelImpl extends w0 implements ProductPickerSearchViewModel {

    @NotNull
    private final V<Action> actionLiveData;

    @NotNull
    private final ProductPickerSearchAnalytics analytics;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final ProductPickerSearchInteractor interactor;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "items", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends ProductPickerSearchVO.ProductPickerSearchItem>, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductPickerSearchVO.ProductPickerSearchItem> list) {
            invoke2((List<ProductPickerSearchVO.ProductPickerSearchItem>) list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<ProductPickerSearchVO.ProductPickerSearchItem> list) {
            V<Action> actionLiveData = ProductPickerSearchViewModelImpl.this.getActionLiveData();
            Intrinsics.f(list);
            List<ProductPickerSearchVO.ProductPickerSearchItem> list2 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!((ProductPickerSearchVO.ProductPickerSearchItem) obj).getIsHidden()) {
                    arrayList.add(obj);
                }
            }
            actionLiveData.setValue(new Action.NewItems(arrayList));
            V<Action> actionLiveData2 = ProductPickerSearchViewModelImpl.this.getActionLiveData();
            ProductPickerSearchViewModelImpl productPickerSearchViewModelImpl = ProductPickerSearchViewModelImpl.this;
            boolean z11 = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((ProductPickerSearchVO.ProductPickerSearchItem) it.next()).getIsSelected() || productPickerSearchViewModelImpl.interactor.hasMultiselection()) {
                        z11 = true;
                        break;
                    }
                }
            }
            actionLiveData2.setValue(new Action.EnableButton(z11));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl$10, reason: invalid class name */
    /* synthetic */ class AnonymousClass10 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass10(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ButtonAnalyticsData;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ButtonAnalyticsData;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl$11, reason: invalid class name */
    static final class AnonymousClass11 extends AbstractC7737t implements Function1<ButtonAnalyticsData, Unit> {
        AnonymousClass11() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ButtonAnalyticsData buttonAnalyticsData) {
            invoke2(buttonAnalyticsData);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ButtonAnalyticsData buttonAnalyticsData) {
            ProductPickerSearchAnalytics productPickerSearchAnalytics = ProductPickerSearchViewModelImpl.this.analytics;
            Intrinsics.f(buttonAnalyticsData);
            productPickerSearchAnalytics.trackButton(buttonAnalyticsData);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl$12, reason: invalid class name */
    /* synthetic */ class AnonymousClass12 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass12(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Integer, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            V<Action> actionLiveData = ProductPickerSearchViewModelImpl.this.getActionLiveData();
            Intrinsics.f(num);
            actionLiveData.setValue(new Action.ScrollToPosition(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass4(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<Integer, Unit> {
        AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            V<Action> actionLiveData = ProductPickerSearchViewModelImpl.this.getActionLiveData();
            Intrinsics.f(num);
            actionLiveData.setValue(new Action.SmoothScrollToPosition(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl$6, reason: invalid class name */
    /* synthetic */ class AnonymousClass6 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass6(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "it", "", "", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/util/Map;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl$7, reason: invalid class name */
    static final class AnonymousClass7 extends AbstractC7737t implements Function1<Map<String, ? extends Object>, Unit> {
        AnonymousClass7() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
            invoke2(map);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, ? extends Object> map) {
            V<Action> actionLiveData = ProductPickerSearchViewModelImpl.this.getActionLiveData();
            Intrinsics.f(map);
            actionLiveData.setValue(new Action.Params(map));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl$8, reason: invalid class name */
    /* synthetic */ class AnonymousClass8 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass8(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModelImpl$9, reason: invalid class name */
    static final class AnonymousClass9 extends AbstractC7737t implements Function1<String, Unit> {
        AnonymousClass9() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            ProductPickerSearchAnalytics productPickerSearchAnalytics = ProductPickerSearchViewModelImpl.this.analytics;
            Intrinsics.f(str);
            productPickerSearchAnalytics.pageView(str);
        }
    }

    public ProductPickerSearchViewModelImpl(@NotNull ProductPickerSearchInteractor interactor, @NotNull ProductPickerSearchAnalytics analytics) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.interactor = interactor;
        this.analytics = analytics;
        this.actionLiveData = new V<>();
        C8486a c8486a = new C8486a();
        this.disposables = c8486a;
        p<List<ProductPickerSearchVO.ProductPickerSearchItem>> observeOn = interactor.observeItems().observeOn(C8125a.a());
        d dVar = new d(new AnonymousClass1(), 10);
        a.b bVar = a.f17149a;
        InterfaceC8487b subscribe = observeOn.subscribe(dVar, new C3055d(new AnonymousClass2(bVar), 12));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
        InterfaceC8487b subscribe2 = interactor.observeScroll().observeOn(C8125a.a()).subscribe(new AF.d(new AnonymousClass3(), 11), new C3056e(new AnonymousClass4(bVar), 10));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe2);
        InterfaceC8487b subscribe3 = interactor.observeSmoothScroll().observeOn(C8125a.a()).subscribe(new HC.a(new AnonymousClass5(), 7), new g(new AnonymousClass6(bVar), 8));
        Intrinsics.checkNotNullExpressionValue(subscribe3, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe3);
        InterfaceC8487b subscribe4 = interactor.observeParams().observeOn(C8125a.a()).subscribe(new C4047b(new AnonymousClass7(), 4), new DF.a(new AnonymousClass8(bVar), 9));
        Intrinsics.checkNotNullExpressionValue(subscribe4, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe4);
        RxExtKt.plusAssign(c8486a, interactor.observeSearch());
        InterfaceC8487b subscribe5 = interactor.observePageViewTracking().observeOn(C8125a.a()).subscribe(new c(new AnonymousClass9(), 11), new b(new AnonymousClass10(bVar), 8));
        Intrinsics.checkNotNullExpressionValue(subscribe5, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe5);
        InterfaceC8487b subscribe6 = interactor.observeButtonClickTracking().observeOn(C8125a.a()).subscribe(new AF.a(new AnonymousClass11(), 12), new AF.b(new AnonymousClass12(bVar), 11));
        Intrinsics.checkNotNullExpressionValue(subscribe6, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRetrieveData$lambda$15(ProductPickerSearchViewModelImpl productPickerSearchViewModelImpl) {
        productPickerSearchViewModelImpl.getActionLiveData().setValue(Action.Finish.INSTANCE);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModel
    public void onLeafClicked(@NotNull ProductPickerSearchVO.ProductPickerSearchItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.interactor.performLeafClick(item);
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModel
    public void onNodeClicked(@NotNull ProductPickerSearchVO.ProductPickerSearchItem item, int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.interactor.performNodeClick(item, position);
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModel
    public void onRetrieveData(boolean isButtonClick) {
        if (isButtonClick) {
            this.interactor.trackButtonClick();
        }
        C8486a c8486a = this.disposables;
        k<ProductPickerSearchVO> refreshPage = this.interactor.refreshPage();
        x b11 = Mc.a.b();
        refreshPage.getClass();
        C9656b.c(b11, "scheduler is null");
        m mVar = new m(new xc.k(new n(refreshPage, b11), C8125a.a()), new BT.c(new ProductPickerSearchViewModelImpl$onRetrieveData$1(this), 5), C9653a.g(), C9653a.g());
        C10699b c10699b = new C10699b(new Lz.d(new ProductPickerSearchViewModelImpl$onRetrieveData$2(this), 6), new C2877a(new ProductPickerSearchViewModelImpl$onRetrieveData$3(this), 10), new InterfaceC9019a() { // from class: jm.d
            @Override // qc.InterfaceC9019a
            public final void run() {
                ProductPickerSearchViewModelImpl.onRetrieveData$lambda$15(ProductPickerSearchViewModelImpl.this);
            }
        });
        mVar.a(c10699b);
        Intrinsics.checkNotNullExpressionValue(c10699b, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, c10699b);
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModel
    public void onSearch(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.interactor.performSearch(text);
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModel
    public void setInitialNetworkData(@NotNull String actionType, @NotNull String currentStep, @NotNull HashMap<String, String> paramsExtra) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(currentStep, "currentStep");
        Intrinsics.checkNotNullParameter(paramsExtra, "paramsExtra");
        this.interactor.setInitialNetworkData(new ProductPickerSearchInitialNetworkData(actionType, currentStep, paramsExtra));
    }

    @Override // ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchViewModel
    @NotNull
    public V<Action> getActionLiveData() {
        return this.actionLiveData;
    }
}
