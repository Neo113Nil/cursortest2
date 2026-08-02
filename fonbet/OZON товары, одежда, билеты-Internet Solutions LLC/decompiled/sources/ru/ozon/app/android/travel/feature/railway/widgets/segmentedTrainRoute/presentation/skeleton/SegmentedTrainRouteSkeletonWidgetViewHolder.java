package ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.skeleton;

import Lm0.a;
import Sc.o;
import WZ.l;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarUtilsKt;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.data.SegmentedTrainRouteDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.SegmentedTrainRouteWidgetViewModel;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.presentation.skeleton.SegmentedTrainRouteSkeletonVI;
import ru.ozon.app.android.travel.feature.railway.widgets.segmentedTrainRoute.views.skeleton.SegmentedTrainRouteSkeletonView;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00110#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI$State;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/views/skeleton/SegmentedTrainRouteSkeletonView;", "content", "Ll10/i;", "composerScreenUiContainer", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/views/skeleton/SegmentedTrainRouteSkeletonView;Ll10/i;LWZ/l;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/skeleton/SegmentedTrainRouteSkeletonVI;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/views/skeleton/SegmentedTrainRouteSkeletonView;", "Ll10/i;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/SegmentedTrainRouteWidgetViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/railway/widgets/segmentedTrainRoute/presentation/SegmentedTrainRouteWidgetViewModel;", "widgetViewModel", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SegmentedTrainRouteSkeletonWidgetViewHolder extends k<SegmentedTrainRouteSkeletonVI> implements AsyncWidgetCallbacks<SegmentedTrainRouteSkeletonVI.State> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i composerScreenUiContainer;

    @NotNull
    private final SegmentedTrainRouteSkeletonView content;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentedTrainRouteDTO.AsyncBehaviorType.values().length];
            try {
                iArr[SegmentedTrainRouteDTO.AsyncBehaviorType.FETCH_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentedTrainRouteDTO.AsyncBehaviorType.ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentedTrainRouteDTO.AsyncBehaviorType.NO_ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedTrainRouteSkeletonWidgetViewHolder(@NotNull SegmentedTrainRouteSkeletonView content, @NotNull i composerScreenUiContainer, @NotNull l tokenizedAnalytics) {
        super(content);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(composerScreenUiContainer, "composerScreenUiContainer");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.content = content;
        this.composerScreenUiContainer = composerScreenUiContainer;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(composerScreenUiContainer, this).buildHandler();
    }

    private final SegmentedTrainRouteWidgetViewModel getWidgetViewModel() {
        return (SegmentedTrainRouteWidgetViewModel) getWidgetViewModel();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<SegmentedTrainRouteSkeletonVI.State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.composerScreenUiContainer.M().update(new SegmentedTrainRouteSkeletonUpdate(fetchedModel.getFetchedState()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a.f17149a.e(throwable);
        NotificationBarUtilsKt.showDefaultError(this.composerScreenUiContainer.Q());
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        SegmentedTrainRouteWidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(widgetViewModel, lifecycle, this, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SegmentedTrainRouteSkeletonVI item, @NotNull d info) {
        SegmentedTrainRouteWidgetViewModel widgetViewModel;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.content.bind(item.getState().getHasTransfer());
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getState().getAsyncBehaviorType().ordinal()];
        if (i11 == 1) {
            String asyncData = item.getAsyncData();
            if (asyncData == null || (widgetViewModel = getWidgetViewModel()) == null) {
                return;
            }
            widgetViewModel.fetchWidget(asyncData);
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new o();
            }
            InterfaceC7851b.a.e(this.composerScreenUiContainer.M(), null, null, null, 7);
        } else {
            AtomAction action = item.getState().getAction();
            if (action != null) {
                this.actionHandler.invoke(action);
            }
        }
    }
}
