package ru.ozon.app.android.travel.feature.avia.shared.flightDetails.adapter;

import Tc.b;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.AviaDetailsItem;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsSegmentView;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsTitleView;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconCounterView;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0011\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001BM\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J%\u0010+\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b+\u0010,J3\u0010+\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\"\u001a\u00020!2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0016¢\u0006\u0004\b+\u00100J\u0017\u00103\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00107R\u001c\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00108R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/adapter/FlightDetailsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteProductDelegateProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsTitleView;", "createTitleView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsTitleView;", "Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconCounterView;", "createNoteView", "(Landroid/content/Context;)Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithSubtitle24IconCounterView;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsSegmentView;", "createSegmentView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsSegmentView;", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "createAnnotation", "(Landroid/content/Context;)Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;ILjava/util/List;)V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "setAnalyticsData", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public class FlightDetailsAdapter extends i<AviaDetailsItem, BaseViewHolder<? super AviaDetailsItem>> {
    private AnalyticData analyticData;
    private final ProductFavoriteDelegateProvider favoriteProductDelegateProvider;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;
    private final ComposerReferences references;
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlightDetailsAdapter(@NotNull J containerViewLifecycleOwner, @NotNull Function1<? super AtomAction, Unit> onAction, ProductFavoriteDelegateProvider productFavoriteDelegateProvider, ComposerReferences composerReferences, l lVar) {
        super(new i.d<AviaDetailsItem>() { // from class: ru.ozon.app.android.travel.feature.avia.shared.flightDetails.adapter.FlightDetailsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(AviaDetailsItem oldItem, AviaDetailsItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AviaDetailsItem oldItem, AviaDetailsItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }

            @Override // androidx.recyclerview.widget.i.d
            public List<Object> getChangePayload(AviaDetailsItem oldItem, AviaDetailsItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                b builder = C7714v.B();
                if ((oldItem instanceof AviaDetailsItem.TitleVO) && (newItem instanceof AviaDetailsItem.TitleVO)) {
                    AviaDetailsItem.TitleVO titleVO = (AviaDetailsItem.TitleVO) oldItem;
                    AviaDetailsItem.TitleVO titleVO2 = (AviaDetailsItem.TitleVO) newItem;
                    if (!Intrinsics.d(titleVO.getTitle(), titleVO2.getTitle())) {
                        builder.add(FlightDetailsPayloads$FlightDetailsTitlePayloads.TITLE);
                    }
                    if (!Intrinsics.d(titleVO.getSubtitle(), titleVO2.getSubtitle())) {
                        builder.add(FlightDetailsPayloads$FlightDetailsTitlePayloads.SUBTITLE);
                    }
                    if (!Intrinsics.d(titleVO.getSharingButton(), titleVO2.getSharingButton())) {
                        builder.add(FlightDetailsPayloads$FlightDetailsTitlePayloads.BUTTON);
                    }
                    if (!Intrinsics.d(titleVO.getFavoriteButton(), titleVO2.getFavoriteButton())) {
                        builder.add(FlightDetailsPayloads$FlightDetailsTitlePayloads.FAVORITE_BUTTON);
                    }
                } else if ((oldItem instanceof AviaDetailsItem.SegmentVO) && (newItem instanceof AviaDetailsItem.SegmentVO)) {
                    AviaDetailsItem.SegmentVO segmentVO = (AviaDetailsItem.SegmentVO) oldItem;
                    AviaDetailsItem.SegmentVO segmentVO2 = (AviaDetailsItem.SegmentVO) newItem;
                    if (!Intrinsics.d(segmentVO.getAirlineLogo(), segmentVO2.getAirlineLogo())) {
                        builder.add(FlightDetailsPayloads$FlightDetailsSegmentPayloads.AIRLINE_LOGO);
                    }
                    if (!Intrinsics.d(segmentVO.getSubAirlineLogo(), segmentVO2.getSubAirlineLogo())) {
                        builder.add(FlightDetailsPayloads$FlightDetailsSegmentPayloads.SUB_AIRLINE_LOGO);
                    }
                    if (!Intrinsics.d(segmentVO.getSegmentBadge(), segmentVO2.getSegmentBadge())) {
                        builder.add(FlightDetailsPayloads$FlightDetailsSegmentPayloads.BADGE);
                    }
                    if (!Intrinsics.d(segmentVO.getAirline(), segmentVO2.getAirline())) {
                        builder.add(FlightDetailsPayloads$FlightDetailsSegmentPayloads.AIRLINE);
                    }
                    if (!Intrinsics.d(segmentVO.getSegmentDuration(), segmentVO2.getSegmentDuration())) {
                        builder.add(FlightDetailsPayloads$FlightDetailsSegmentPayloads.SEGMENT_DURATION);
                    }
                    if (!Intrinsics.d(segmentVO.getSegmentAirplane(), segmentVO2.getSegmentAirplane())) {
                        builder.add(FlightDetailsPayloads$FlightDetailsSegmentPayloads.SEGMENT_AIRPLANE);
                    }
                    if (!Intrinsics.d(segmentVO.getSegmentDeparture(), segmentVO2.getSegmentDeparture())) {
                        builder.add(FlightDetailsPayloads$FlightDetailsSegmentPayloads.SEGMENT_DEPARTURE);
                    }
                    if (!Intrinsics.d(segmentVO.getSegmentArrival(), segmentVO2.getSegmentArrival())) {
                        builder.add(FlightDetailsPayloads$FlightDetailsSegmentPayloads.SEGMENT_ARRIVAL);
                    }
                    if (!Intrinsics.d(segmentVO.getLuggageBadges(), segmentVO2.getLuggageBadges())) {
                        builder.add(FlightDetailsPayloads$FlightDetailsSegmentPayloads.LUGGAGE_BADGES);
                    }
                } else {
                    builder.add(new Object() { // from class: ru.ozon.app.android.travel.feature.avia.shared.flightDetails.adapter.FlightDetailsPayloads$FlightDetailsOtherPayloads
                        public boolean equals(Object other) {
                            return this == other || (other instanceof FlightDetailsPayloads$FlightDetailsOtherPayloads);
                        }

                        public int hashCode() {
                            return -203612668;
                        }

                        @NotNull
                        public String toString() {
                            return "FlightDetailsOtherPayloads";
                        }
                    });
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                return builder.B();
            }
        }, containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
        this.favoriteProductDelegateProvider = productFavoriteDelegateProvider;
        this.references = composerReferences;
        this.tokenizedAnalytics = lVar;
    }

    private final DisclaimerContainer createAnnotation(Context context) {
        DisclaimerContainer disclaimerContainer = new DisclaimerContainer(context, null, 0, 6, null);
        int px = ResourceExtKt.toPx(16, context);
        RecyclerView.p pVar = new RecyclerView.p(-1, -2);
        pVar.setMargins(px, 0, px, px);
        disclaimerContainer.setLayoutParams(pVar);
        return disclaimerContainer;
    }

    private final CellWithSubtitle24IconCounterView createNoteView(Context context) {
        CellWithSubtitle24IconCounterView cellWithSubtitle24IconCounterView = new CellWithSubtitle24IconCounterView(context, null, 0, 6, null);
        int px = ResourceExtKt.toPx(16, context);
        RecyclerView.p pVar = new RecyclerView.p(-1, -2);
        pVar.setMargins(px, 0, px, 0);
        cellWithSubtitle24IconCounterView.setLayoutParams(pVar);
        return cellWithSubtitle24IconCounterView;
    }

    private final FlightDetailsSegmentView createSegmentView(Context context) {
        FlightDetailsSegmentView flightDetailsSegmentView = new FlightDetailsSegmentView(context, null, 0, 6, null);
        int px = ResourceExtKt.toPx(16, context);
        RecyclerView.p pVar = new RecyclerView.p(-1, -2);
        pVar.setMargins(px, 0, px, 0);
        flightDetailsSegmentView.setLayoutParams(pVar);
        return flightDetailsSegmentView;
    }

    private final FlightDetailsTitleView createTitleView(Context context) {
        FlightDetailsTitleView flightDetailsTitleView = new FlightDetailsTitleView(context);
        flightDetailsTitleView.setLayoutParams(new RecyclerView.p(-1, -2));
        return flightDetailsTitleView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        AviaDetailsItem item = getItem(position);
        if (item instanceof AviaDetailsItem.SegmentVO) {
            return R$id.flightDetailsSegmentViewType;
        }
        if (item instanceof AviaDetailsItem.NoteVO) {
            return R$id.flightDetailsNoteViewType;
        }
        if (item instanceof AviaDetailsItem.TitleVO) {
            return R$id.flightDetailsTitleViewType;
        }
        if (item instanceof AviaDetailsItem.AnnotationVO) {
            return R$id.flightDetailsAnnotationViewType;
        }
        throw new IllegalArgumentException("Unknown viewType: $");
    }

    public final void setAnalyticsData(AnalyticData analyticData) {
        this.analyticData = analyticData;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((BaseViewHolder<? super AviaDetailsItem>) c11, i11, (List<? extends Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseViewHolder<AviaDetailsItem> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        l lVar;
        ProductFavoriteDelegateProvider productFavoriteDelegateProvider;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        if (viewType == R$id.flightDetailsSegmentViewType) {
            Intrinsics.f(context);
            return new FlightDetailsSegmentViewHolder(createSegmentView(context));
        }
        if (viewType == R$id.flightDetailsNoteViewType) {
            Intrinsics.f(context);
            return new FlightDetailsNoteViewHolder(createNoteView(context), this.onAction);
        }
        if (viewType != R$id.flightDetailsTitleViewType) {
            if (viewType != R$id.flightDetailsAnnotationViewType) {
                throw new IllegalArgumentException(Ej.b.a(viewType, "Unknown viewType: "));
            }
            Intrinsics.f(context);
            return new FlightDetailsAnnotationViewHolder(createAnnotation(context), this.onAction);
        }
        Intrinsics.f(context);
        FlightDetailsTitleView createTitleView = createTitleView(context);
        Function1<AtomAction, Unit> function1 = this.onAction;
        ComposerReferences composerReferences = this.references;
        FavoriteProductV4Delegate favoriteProductV4Delegate = null;
        if (composerReferences != null && (lVar = this.tokenizedAnalytics) != null && (productFavoriteDelegateProvider = this.favoriteProductDelegateProvider) != null) {
            favoriteProductV4Delegate = productFavoriteDelegateProvider.provideV4Delegate(composerReferences, lVar);
        }
        return new FlightDetailsTitleViewHolder(createTitleView, function1, favoriteProductV4Delegate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseViewHolder<? super AviaDetailsItem> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof FlightDetailsTitleViewHolder) {
            ((FlightDetailsTitleViewHolder) holder).setAnalyticsData(this.analyticData);
        }
        AviaDetailsItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, K.f71697a);
    }

    public void onBindViewHolder(@NotNull BaseViewHolder<? super AviaDetailsItem> holder, int position, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (holder instanceof FlightDetailsTitleViewHolder) {
            ((FlightDetailsTitleViewHolder) holder).setAnalyticsData(this.analyticData);
        }
        AviaDetailsItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, payloads);
    }
}
