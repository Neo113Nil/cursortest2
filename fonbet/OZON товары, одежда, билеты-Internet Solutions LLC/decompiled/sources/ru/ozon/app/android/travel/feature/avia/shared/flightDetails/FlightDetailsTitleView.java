package ru.ozon.app.android.travel.feature.avia.shared.flightDetails;

import Am.C2438a;
import android.content.Context;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.AviaDetailsItem;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020 0$J\u000e\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\"\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020 0$J\u0006\u0010)\u001a\u00020\u001eJ$\u0010*\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010+2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020 0$J\b\u0010,\u001a\u00020 H\u0002J\b\u0010-\u001a\u00020 H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001b\u0010\u0018R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsTitleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp4", "dp16", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "subtitleTav", "getSubtitleTav", "subtitleTav$delegate", "space", "Landroid/widget/Space;", "sharingButtonIbv", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getSharingButtonIbv", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "sharingButtonIbv$delegate", "favoriteIconButtonIbv", "getFavoriteIconButtonIbv", "favoriteIconButtonIbv$delegate", "favoriteButtonV", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindTitle", "bindSubtitle", "bindButton", "getFavoriteButtonView", "bindFavoriteButton", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO$ButtonType;", "addViews", "setupConstraints", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FlightDetailsTitleView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightDetailsTitleView.class, "titleTav", "getTitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(FlightDetailsTitleView.class, "subtitleTav", "getSubtitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(FlightDetailsTitleView.class, "sharingButtonIbv", "getSharingButtonIbv()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", 0), C2438a.c(FlightDetailsTitleView.class, "favoriteIconButtonIbv", "getFavoriteIconButtonIbv()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", 0)};
    public static final int $stable = 8;
    private final int dp16;
    private final int dp2;
    private final int dp4;

    @NotNull
    private final ProductFavoriteMoleculeV4ButtonView favoriteButtonV;

    /* renamed from: favoriteIconButtonIbv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate favoriteIconButtonIbv;

    /* renamed from: sharingButtonIbv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate sharingButtonIbv;

    @NotNull
    private final Space space;

    /* renamed from: subtitleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate subtitleTav;

    /* renamed from: titleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightDetailsTitleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new FlightDetailsTitleView$special$$inlined$preCreationViewPool$default$1(this), new FlightDetailsTitleView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.subtitleTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new FlightDetailsTitleView$special$$inlined$preCreationViewPool$default$3(this), new FlightDetailsTitleView$special$$inlined$preCreationViewPool$default$4());
        Space space = new Space(context);
        space.setId(4569);
        space.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.space = space;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.sharingButtonIbv = new PreCreationViewPoolDelegate(context4, N.b(IconButtonV3View.class), new FlightDetailsTitleView$special$$inlined$preCreationViewPool$default$5(this), new FlightDetailsTitleView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.favoriteIconButtonIbv = new PreCreationViewPoolDelegate(context5, N.b(IconButtonV3View.class), new FlightDetailsTitleView$special$$inlined$preCreationViewPool$default$7(this), new FlightDetailsTitleView$special$$inlined$preCreationViewPool$default$8());
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView = new ProductFavoriteMoleculeV4ButtonView(context, null, 0, 6, null);
        productFavoriteMoleculeV4ButtonView.setId(4572);
        productFavoriteMoleculeV4ButtonView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.favoriteButtonV = productFavoriteMoleculeV4ButtonView;
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(getTitleTav());
        addView(getSubtitleTav());
        addView(this.space);
        addView(getSharingButtonIbv());
        addView(getFavoriteIconButtonIbv());
        addView(this.favoriteButtonV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconButtonV3View getFavoriteIconButtonIbv() {
        return (IconButtonV3View) this.favoriteIconButtonIbv.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconButtonV3View getSharingButtonIbv() {
        return (IconButtonV3View) this.sharingButtonIbv.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getSubtitleTav() {
        return (TextAtomV2View) this.subtitleTav.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTitleTav() {
        return (TextAtomV2View) this.titleTav.getValue(this, $$delegatedProperties[0]);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new FlightDetailsTitleView$setupConstraints$1(this));
    }

    public final void bind(@NotNull AviaDetailsItem.TitleVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        bindTitle(item);
        bindSubtitle(item);
        bindButton(item, onAction);
        bindFavoriteButton(item.getFavoriteButton(), onAction);
    }

    public final void bindButton(@NotNull AviaDetailsItem.TitleVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        IconButtonV3HolderKt.bindOrGone(getSharingButtonIbv(), item.getSharingButton(), onAction);
    }

    public final void bindFavoriteButton(AviaDetailsItem.TitleVO.ButtonType item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (item instanceof AviaDetailsItem.TitleVO.ButtonType.FavoriteButton) {
            ViewExtKt.show(this.favoriteButtonV);
            ViewExtKt.gone(getFavoriteIconButtonIbv());
        } else if (item instanceof AviaDetailsItem.TitleVO.ButtonType.IconButton) {
            IconButtonV3HolderKt.bindOrGone(getFavoriteIconButtonIbv(), ((AviaDetailsItem.TitleVO.ButtonType.IconButton) item).getIconButton(), onAction);
            ViewExtKt.gone(this.favoriteButtonV);
        } else {
            ViewExtKt.gone(getFavoriteIconButtonIbv());
            ViewExtKt.gone(this.favoriteButtonV);
        }
    }

    public final void bindSubtitle(@NotNull AviaDetailsItem.TitleVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(getSubtitleTav(), item.getSubtitle(), null, 2, null);
    }

    public final void bindTitle(@NotNull AviaDetailsItem.TitleVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(getTitleTav(), item.getTitle(), null, 2, null);
    }

    @NotNull
    /* renamed from: getFavoriteButtonView, reason: from getter */
    public final ProductFavoriteMoleculeV4ButtonView getFavoriteButtonV() {
        return this.favoriteButtonV;
    }
}
