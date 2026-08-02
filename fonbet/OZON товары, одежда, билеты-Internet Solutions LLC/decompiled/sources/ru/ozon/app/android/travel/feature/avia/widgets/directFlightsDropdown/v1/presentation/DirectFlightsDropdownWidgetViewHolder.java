package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.s;
import W10.c;
import WZ.l;
import WZ.t;
import Wc.a;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownVO;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownItemView;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownView;
import ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010$\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00170)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/DirectFlightsDropdownView;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/DirectFlightsDropdownView;LWZ/l;Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownViewModel;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ItemVO;", "item", "", "count", "calculateRVHeight", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ItemVO;ILkotlin/coroutines/d;)Ljava/lang/Object;", "calculateRedirectFlightItemHeight", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ItemVO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "cancelJob", "()V", "onAttach", "onRecycle", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/DirectFlightsDropdownView;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lxe/B0;", "job", "Lxe/B0;", "dp8", "I", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/DirectFlightsDropdownItemView;", "tempViewForMeasure$delegate", "LSc/j;", "getTempViewForMeasure", "()Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/DirectFlightsDropdownItemView;", "tempViewForMeasure", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DirectFlightsDropdownWidgetViewHolder extends k<DirectFlightsDropdownVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final int dp8;
    private B0 job;

    /* renamed from: tempViewForMeasure$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j tempViewForMeasure;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final DirectFlightsDropdownView view;

    @NotNull
    private final DirectFlightsDropdownViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectFlightsDropdownWidgetViewHolder(@NotNull ComposerReferences refs, @NotNull DirectFlightsDropdownView view, @NotNull l tokenizedAnalytics, @NotNull DirectFlightsDropdownViewModel viewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        this.dp8 = ResourceExtKt.toPx(8, getContext());
        this.tempViewForMeasure = LazyUtilsKt.unsafeLazy(new DirectFlightsDropdownWidgetViewHolder$tempViewForMeasure$2(this));
        view.setupAdapter(this, buildHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculateRVHeight(DirectFlightsDropdownVO.ItemVO itemVO, int i11, d<? super Integer> dVar) {
        DirectFlightsDropdownWidgetViewHolder$calculateRVHeight$1 directFlightsDropdownWidgetViewHolder$calculateRVHeight$1;
        int i12;
        DirectFlightsDropdownWidgetViewHolder directFlightsDropdownWidgetViewHolder;
        int intValue;
        if (dVar instanceof DirectFlightsDropdownWidgetViewHolder$calculateRVHeight$1) {
            directFlightsDropdownWidgetViewHolder$calculateRVHeight$1 = (DirectFlightsDropdownWidgetViewHolder$calculateRVHeight$1) dVar;
            int i13 = directFlightsDropdownWidgetViewHolder$calculateRVHeight$1.label;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                directFlightsDropdownWidgetViewHolder$calculateRVHeight$1.label = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = directFlightsDropdownWidgetViewHolder$calculateRVHeight$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i12 = directFlightsDropdownWidgetViewHolder$calculateRVHeight$1.label;
                if (i12 != 0) {
                    s.b(obj);
                    Integer firstItemHeight = this.view.getFirstItemHeight();
                    if (firstItemHeight != null) {
                        intValue = firstItemHeight.intValue();
                        directFlightsDropdownWidgetViewHolder = this;
                        return new Integer((intValue + directFlightsDropdownWidgetViewHolder.dp8) * i11);
                    }
                    directFlightsDropdownWidgetViewHolder$calculateRVHeight$1.L$0 = this;
                    directFlightsDropdownWidgetViewHolder$calculateRVHeight$1.I$0 = i11;
                    directFlightsDropdownWidgetViewHolder$calculateRVHeight$1.label = 1;
                    obj = calculateRedirectFlightItemHeight(itemVO, directFlightsDropdownWidgetViewHolder$calculateRVHeight$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    directFlightsDropdownWidgetViewHolder = this;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = directFlightsDropdownWidgetViewHolder$calculateRVHeight$1.I$0;
                    directFlightsDropdownWidgetViewHolder = (DirectFlightsDropdownWidgetViewHolder) directFlightsDropdownWidgetViewHolder$calculateRVHeight$1.L$0;
                    s.b(obj);
                }
                intValue = ((Number) obj).intValue();
                return new Integer((intValue + directFlightsDropdownWidgetViewHolder.dp8) * i11);
            }
        }
        directFlightsDropdownWidgetViewHolder$calculateRVHeight$1 = new DirectFlightsDropdownWidgetViewHolder$calculateRVHeight$1(this, dVar);
        Object obj2 = directFlightsDropdownWidgetViewHolder$calculateRVHeight$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i12 = directFlightsDropdownWidgetViewHolder$calculateRVHeight$1.label;
        if (i12 != 0) {
        }
        intValue = ((Number) obj2).intValue();
        return new Integer((intValue + directFlightsDropdownWidgetViewHolder.dp8) * i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object calculateRedirectFlightItemHeight(DirectFlightsDropdownVO.ItemVO itemVO, d<? super Integer> dVar) {
        DirectFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1 directFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1;
        int i11;
        DirectFlightsDropdownWidgetViewHolder directFlightsDropdownWidgetViewHolder;
        if (dVar instanceof DirectFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1) {
            directFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1 = (DirectFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1) dVar;
            int i12 = directFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                directFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = directFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = directFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    this.view.addView(getTempViewForMeasure());
                    try {
                        ConstraintLayoutExtKt.updateConstraints(this.view, new DirectFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$2(this));
                        DirectFlightsDropdownItemView.bind$default(getTempViewForMeasure(), itemVO, null, 2, null);
                        DirectFlightsDropdownItemView tempViewForMeasure = getTempViewForMeasure();
                        directFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1.L$0 = this;
                        directFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1.label = 1;
                        obj = ViewExtensionsKt.getHeightAfterLayout(tempViewForMeasure, directFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                        directFlightsDropdownWidgetViewHolder = this;
                    } catch (Throwable th2) {
                        th = th2;
                        directFlightsDropdownWidgetViewHolder = this;
                        directFlightsDropdownWidgetViewHolder.view.removeView(directFlightsDropdownWidgetViewHolder.getTempViewForMeasure());
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    directFlightsDropdownWidgetViewHolder = (DirectFlightsDropdownWidgetViewHolder) directFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1.L$0;
                    try {
                        s.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        directFlightsDropdownWidgetViewHolder.view.removeView(directFlightsDropdownWidgetViewHolder.getTempViewForMeasure());
                        throw th;
                    }
                }
                directFlightsDropdownWidgetViewHolder.view.removeView(directFlightsDropdownWidgetViewHolder.getTempViewForMeasure());
                return obj;
            }
        }
        directFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1 = new DirectFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1(this, dVar);
        Object obj2 = directFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = directFlightsDropdownWidgetViewHolder$calculateRedirectFlightItemHeight$1.label;
        if (i11 != 0) {
        }
        directFlightsDropdownWidgetViewHolder.view.removeView(directFlightsDropdownWidgetViewHolder.getTempViewForMeasure());
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelJob() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DirectFlightsDropdownItemView getTempViewForMeasure() {
        return (DirectFlightsDropdownItemView) this.tempViewForMeasure.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttach$processClickEvents(l lVar, t tVar, d dVar) {
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tVar, null, 2, null);
        return Unit.f71690a;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        C2399j.C(new C2408n0(new C2406m0(this.viewModel.getWidgetState()), new DirectFlightsDropdownWidgetViewHolder$onAttach$1(this, null)), K.a(this));
        C2399j.C(new C2408n0(this.viewModel.getWidgetAnalyticsEvents(), new DirectFlightsDropdownWidgetViewHolder$onAttach$2(this.tokenizedAnalytics)), K.a(this));
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        cancelJob();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DirectFlightsDropdownVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.bind(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull DirectFlightsDropdownVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t viewTokenizedEvent = item.getViewTokenizedEvent();
        if (viewTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewTokenizedEvent, null, 2, null);
        }
    }
}
