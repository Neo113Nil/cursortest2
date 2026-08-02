package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.TravelTrainRouteVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.badges.TravelTrainRouteDetailsBadgesAdapter;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.TravelTrainRouteActiveTrainStationsDecoration;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.TravelTrainRouteDecoration;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.TravelTrainRouteTrainListAdapter;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.TravelTrainRouteTrainsDecoration;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.view.TravelTrainRouteWidgetView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TravelTrainRouteWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TravelTrainRouteVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/view/TravelTrainRouteWidgetView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/view/TravelTrainRouteWidgetView;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TravelTrainRouteVO$StopSegment;", "stopSegments", "", "replaceStopSegmentsDecorations", "(Ljava/util/List;)V", "onDropDownClick", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/TravelTrainRouteVO;Ll20/d;)V", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/view/TravelTrainRouteWidgetView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/adapter/badges/TravelTrainRouteDetailsBadgesAdapter;", "badgesAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/adapter/badges/TravelTrainRouteDetailsBadgesAdapter;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/adapter/trains/TravelTrainRouteTrainListAdapter;", "trainListAdapter", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/adapter/trains/TravelTrainRouteTrainListAdapter;", "trainRouteAdapter", "Landroidx/recyclerview/widget/RecyclerView$n;", "stopSegmentsDecorations", "Ljava/util/List;", "", "isRouteExpanded", "Z", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainRouteWidgetViewHolder extends k<TravelTrainRouteVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TravelTrainRouteDetailsBadgesAdapter badgesAdapter;

    @NotNull
    private final TravelTrainRouteWidgetView containerView;
    private boolean isRouteExpanded;

    @NotNull
    private List<? extends RecyclerView.n> stopSegmentsDecorations;

    @NotNull
    private final TravelTrainRouteTrainListAdapter trainListAdapter;

    @NotNull
    private final TravelTrainRouteTrainListAdapter trainRouteAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TravelTrainRouteWidgetViewHolder(@NotNull TravelTrainRouteWidgetView containerView, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.actionHandler = buildHandler;
        TravelTrainRouteDetailsBadgesAdapter travelTrainRouteDetailsBadgesAdapter = new TravelTrainRouteDetailsBadgesAdapter(buildHandler);
        this.badgesAdapter = travelTrainRouteDetailsBadgesAdapter;
        TravelTrainRouteTrainListAdapter travelTrainRouteTrainListAdapter = new TravelTrainRouteTrainListAdapter(null, 1, 0 == true ? 1 : 0);
        this.trainListAdapter = travelTrainRouteTrainListAdapter;
        TravelTrainRouteTrainListAdapter travelTrainRouteTrainListAdapter2 = new TravelTrainRouteTrainListAdapter(new TravelTrainRouteWidgetViewHolder$trainRouteAdapter$1(this));
        this.trainRouteAdapter = travelTrainRouteTrainListAdapter2;
        this.stopSegmentsDecorations = K.f71697a;
        RecyclerView badgesRv = containerView.getBadgesRv();
        badgesRv.setLayoutManager(new FlexboxLayoutManager(badgesRv.getContext()));
        badgesRv.setAdapter(travelTrainRouteDetailsBadgesAdapter);
        badgesRv.setItemAnimator(null);
        badgesRv.setRecycledViewPool(references.getComposerViewPoolProvider().getViewPool());
        RecyclerView trainListRv = containerView.getTrainListRv();
        trainListRv.setLayoutManager(new LinearLayoutManager(trainListRv.getContext()));
        trainListRv.setAdapter(travelTrainRouteTrainListAdapter);
        Context context = trainListRv.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        trainListRv.addItemDecoration(new TravelTrainRouteTrainsDecoration(context));
        trainListRv.setItemAnimator(null);
        trainListRv.setRecycledViewPool(references.getComposerViewPoolProvider().getViewPool());
        RecyclerView trainRouteRv = containerView.getTrainRouteRv();
        trainRouteRv.setLayoutManager(new LinearLayoutManager(trainRouteRv.getContext()));
        trainRouteRv.setAdapter(travelTrainRouteTrainListAdapter2);
        Context context2 = trainRouteRv.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        trainRouteRv.addItemDecoration(new TravelTrainRouteDecoration(context2));
        trainRouteRv.setItemAnimator(null);
        trainRouteRv.setRecycledViewPool(references.getComposerViewPoolProvider().getViewPool());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDropDownClick() {
        TravelTrainRouteVO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        if (this.isRouteExpanded) {
            this.trainRouteAdapter.setItems(boundData.getShortTrainList());
            replaceStopSegmentsDecorations(boundData.getStopSegmentsAtShortList());
        } else {
            this.trainRouteAdapter.setItems(boundData.getFullTrainList());
            replaceStopSegmentsDecorations(boundData.getStopSegmentsAtFullList());
        }
        this.isRouteExpanded = !this.isRouteExpanded;
    }

    private final void replaceStopSegmentsDecorations(List<TravelTrainRouteVO.StopSegment> stopSegments) {
        Iterator<T> it = this.stopSegmentsDecorations.iterator();
        while (it.hasNext()) {
            this.containerView.getTrainRouteRv().removeItemDecoration((RecyclerView.n) it.next());
        }
        List<TravelTrainRouteVO.StopSegment> list = stopSegments;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (TravelTrainRouteVO.StopSegment stopSegment : list) {
            arrayList.add(new TravelTrainRouteActiveTrainStationsDecoration(getContext(), stopSegment.getStartIndex(), stopSegment.getEndIndex()));
        }
        this.stopSegmentsDecorations = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.containerView.getTrainRouteRv().addItemDecoration((TravelTrainRouteActiveTrainStationsDecoration) it2.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelTrainRouteVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomHolderKt.bind$default(this.containerView.getTitleTav(), item.getTitle(), null, 2, null);
        this.badgesAdapter.setItems(item.getNotificationBadges());
        this.containerView.getBadgesRv().setVisibility(item.getIsNotificationBadgesVisible() ? 0 : 8);
        TextAtomHolderKt.bind$default(this.containerView.getDateTav(), item.getDateTitle(), null, 2, null);
        this.trainListAdapter.setItems(item.getTrainsAndTransfers());
        this.containerView.getTrainListRv().setVisibility(item.getIsTrainsAndTransfersVisible() ? 0 : 8);
        this.trainRouteAdapter.setItems(item.getShortTrainList());
        replaceStopSegmentsDecorations(item.getStopSegmentsAtShortList());
    }
}
