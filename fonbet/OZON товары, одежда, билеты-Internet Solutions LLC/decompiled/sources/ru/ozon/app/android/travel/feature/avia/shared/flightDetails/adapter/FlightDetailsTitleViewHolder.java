package ru.ozon.app.android.travel.feature.avia.shared.flightDetails.adapter;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.AviaDetailsItem;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsTitleView;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/adapter/FlightDetailsTitleViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem;", "titleView", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsTitleView;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "favoriteProductDelegate", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsTitleView;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;)V", "analyticData", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "bind", "item", "payloads", "", "", "onAttach", "onDetach", "setAnalyticsData", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightDetailsTitleViewHolder extends BaseViewHolder<AviaDetailsItem> {
    private AnalyticData analyticData;
    private final FavoriteProductV4Delegate favoriteProductDelegate;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final FlightDetailsTitleView titleView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlightDetailsPayloads$FlightDetailsTitlePayloads.values().length];
            try {
                iArr[FlightDetailsPayloads$FlightDetailsTitlePayloads.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlightDetailsPayloads$FlightDetailsTitlePayloads.SUBTITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlightDetailsPayloads$FlightDetailsTitlePayloads.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlightDetailsPayloads$FlightDetailsTitlePayloads.FAVORITE_BUTTON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlightDetailsTitleViewHolder(@NotNull FlightDetailsTitleView titleView, @NotNull Function1<? super AtomAction, Unit> onAction, FavoriteProductV4Delegate favoriteProductV4Delegate) {
        super(titleView);
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.titleView = titleView;
        this.onAction = onAction;
        this.favoriteProductDelegate = favoriteProductV4Delegate;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(AviaDetailsItem aviaDetailsItem, List list) {
        bind2(aviaDetailsItem, (List<? extends Object>) list);
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        FavoriteProductV4Delegate favoriteProductV4Delegate = this.favoriteProductDelegate;
        if (favoriteProductV4Delegate != null) {
            favoriteProductV4Delegate.attachFavButtonView(this.titleView.getFavoriteButtonV());
        }
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        FavoriteProductV4Delegate favoriteProductV4Delegate = this.favoriteProductDelegate;
        if (favoriteProductV4Delegate != null) {
            favoriteProductV4Delegate.detachFavButtonView();
        }
    }

    public final void setAnalyticsData(AnalyticData analyticData) {
        this.analyticData = analyticData;
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull AviaDetailsItem item, @NotNull List<? extends Object> payloads) {
        AnalyticData analyticData;
        FavoriteProductV4Delegate favoriteProductV4Delegate;
        AnalyticData analyticData2;
        FavoriteProductV4Delegate favoriteProductV4Delegate2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        ArrayList arrayList = null;
        if ((item instanceof AviaDetailsItem.TitleVO ? (AviaDetailsItem.TitleVO) item : null) != null) {
            Object M11 = C7714v.M(payloads);
            List list = M11 instanceof List ? (List) M11 : null;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof FlightDetailsPayloads$FlightDetailsTitlePayloads) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList == null || arrayList.isEmpty()) {
                AviaDetailsItem.TitleVO titleVO = (AviaDetailsItem.TitleVO) item;
                this.titleView.bind(titleVO, this.onAction);
                if (!(titleVO.getFavoriteButton() instanceof AviaDetailsItem.TitleVO.ButtonType.FavoriteButton) || (analyticData = this.analyticData) == null || (favoriteProductV4Delegate = this.favoriteProductDelegate) == null) {
                    return;
                }
                favoriteProductV4Delegate.bindFavoriteProductButton(this.titleView.getFavoriteButtonV(), ((AviaDetailsItem.TitleVO.ButtonType.FavoriteButton) titleVO.getFavoriteButton()).getFavoriteButton(), analyticData);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[((FlightDetailsPayloads$FlightDetailsTitlePayloads) it.next()).ordinal()];
                if (i11 == 1) {
                    this.titleView.bindTitle((AviaDetailsItem.TitleVO) item);
                } else if (i11 == 2) {
                    this.titleView.bindSubtitle((AviaDetailsItem.TitleVO) item);
                } else if (i11 == 3) {
                    this.titleView.bindButton((AviaDetailsItem.TitleVO) item, this.onAction);
                } else {
                    if (i11 != 4) {
                        throw new o();
                    }
                    AviaDetailsItem.TitleVO titleVO2 = (AviaDetailsItem.TitleVO) item;
                    if ((titleVO2.getFavoriteButton() instanceof AviaDetailsItem.TitleVO.ButtonType.FavoriteButton) && (analyticData2 = this.analyticData) != null && (favoriteProductV4Delegate2 = this.favoriteProductDelegate) != null) {
                        favoriteProductV4Delegate2.bindFavoriteProductButton(this.titleView.getFavoriteButtonV(), ((AviaDetailsItem.TitleVO.ButtonType.FavoriteButton) titleVO2.getFavoriteButton()).getFavoriteButton(), analyticData2);
                    }
                    this.titleView.bindFavoriteButton(titleVO2.getFavoriteButton(), this.onAction);
                }
            }
        }
    }
}
