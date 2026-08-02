package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;
import ru.ozon.app.android.ugcratingmolecule.presentation.UgcRatingDelegate;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/RatingMoleculeBinder;", "", "Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegate;", "ratingDelegate", "LSc/j;", "Lru/ozon/uni/android/atom/rating/RatingView;", "ratingView", "<init>", "(Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegate;LSc/j;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;Lkotlin/jvm/functions/Function1;)V", "onAttach", "()V", "onDetach", "trackView", "Lru/ozon/app/android/ugcratingmolecule/presentation/UgcRatingDelegate;", "LSc/j;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RatingMoleculeBinder {

    @NotNull
    private final UgcRatingDelegate ratingDelegate;
    private final InterfaceC4008j<RatingView> ratingView;

    public RatingMoleculeBinder(@NotNull UgcRatingDelegate ratingDelegate, InterfaceC4008j<RatingView> interfaceC4008j) {
        Intrinsics.checkNotNullParameter(ratingDelegate, "ratingDelegate");
        this.ratingDelegate = ratingDelegate;
        this.ratingView = interfaceC4008j;
    }

    public final void bind(@NotNull TileGrid2VO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        InterfaceC4008j<RatingView> interfaceC4008j = this.ratingView;
        if (interfaceC4008j == null) {
            return;
        }
        if (interfaceC4008j.isInitialized() || item.getRatingMolecule() != null) {
            this.ratingDelegate.bindOrGone(item.getId(), interfaceC4008j.getValue(), item.getRatingMolecule(), onAction);
            interfaceC4008j.getValue().setOnClickListener(null);
        }
    }

    public final void onAttach() {
        InterfaceC4008j<RatingView> interfaceC4008j = this.ratingView;
        if (interfaceC4008j != null && interfaceC4008j.isInitialized()) {
            this.ratingDelegate.onAttach(interfaceC4008j.getValue());
        }
    }

    public final void onDetach() {
        this.ratingDelegate.onDetach();
    }

    public final void trackView() {
        this.ratingDelegate.trackView();
    }
}
