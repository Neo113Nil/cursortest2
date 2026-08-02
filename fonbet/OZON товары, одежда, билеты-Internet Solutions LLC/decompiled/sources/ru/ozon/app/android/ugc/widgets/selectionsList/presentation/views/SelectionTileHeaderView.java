package ru.ozon.app.android.ugc.widgets.selectionsList.presentation.views;

import Bi.b;
import HR.a;
import Kk.C3531a;
import Lt.c;
import Sc.InterfaceC4008j;
import Sc.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010 \u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b&\u0010\u001fJ*\u0010,\u001a\u00020\f2\u0006\u0010#\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00101R\u0014\u00106\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010?\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010C\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bF\u0010GR*\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/views/SelectionTileHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Landroid/content/Context;", "context", "favProductMoleculeDelegate", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;)V", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO$SocialHeader;", "socialHeader", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bindSocialHeader", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO$SocialHeader;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent;", "topContent", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/l;", "viewItem", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$HeaderVO;Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent;LW10/c;Lru/ozon/composer/ui/widget/l;Lkotlin/jvm/functions/Function1;)V", "", "onFavoriteClick", "()Z", "hideHeaderContent", "()V", "bindTopContent", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TopRightContent;LW10/c;Lru/ozon/composer/ui/widget/l;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "Lru/ozon/uni/android/atom/icon/IconView;", "profileIcon", "Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "verifyIcon", "leftContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/FrameLayout;", "rightContainer", "Landroid/widget/FrameLayout;", "playIcon$delegate", "LSc/j;", "getPlayIcon", "()Lru/ozon/uni/android/atom/icon/IconView;", "playIcon", "favoriteMolecule$delegate", "getFavoriteMolecule", "()Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "favoriteMolecule", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView$delegate", "getBadgeView", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "getOnFavoriteClick", "()Lkotlin/jvm/functions/Function1;", "setOnFavoriteClick", "(Lkotlin/jvm/functions/Function1;)V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class SelectionTileHeaderView extends ConstraintLayout implements FavoriteProductDelegate {

    /* renamed from: badgeView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeView;

    @NotNull
    private final FavoriteProductDelegate favProductMoleculeDelegate;

    /* renamed from: favoriteMolecule$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j favoriteMolecule;

    @NotNull
    private final ConstraintLayout leftContainer;

    /* renamed from: playIcon$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j playIcon;

    @NotNull
    private IconView profileIcon;

    @NotNull
    private final FrameLayout rightContainer;

    @NotNull
    private TextAtomV2View titleView;

    @NotNull
    private IconView verifyIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionTileHeaderView(@NotNull Context context, @NotNull FavoriteProductDelegate favProductMoleculeDelegate) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegate, "favProductMoleculeDelegate");
        this.favProductMoleculeDelegate = favProductMoleculeDelegate;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R$id.selectionHeaderLeftContainer);
        this.leftContainer = constraintLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R$id.selectionHeaderRightContainer);
        this.rightContainer = frameLayout;
        this.playIcon = LazyUtilsKt.unsafeLazy(new SelectionTileHeaderView$playIcon$2(context, this));
        this.favoriteMolecule = LazyUtilsKt.unsafeLazy(new SelectionTileHeaderView$favoriteMolecule$2(context, this));
        this.badgeView = LazyUtilsKt.unsafeLazy(new SelectionTileHeaderView$badgeView$2(context, this));
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        Dimens dimens = Dimens.INSTANCE;
        setPadding(dimens.getDP_8(), dimens.getDP_8(), dimens.getDP_8(), 0);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        addView(frameLayout);
        frameLayout.setLayoutParams(bVar);
        int i11 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i12 = 0;
        IconView iconView = new IconView(context, null, i12, i11, defaultConstructorMarker);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.selectionHeaderProfileIcon, -2, -2);
        a11.f41656t = 0;
        a11.f41636i = 0;
        a11.f41642l = 0;
        iconView.setLayoutParams(a11);
        constraintLayout.addView(iconView);
        this.profileIcon = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.selectionHeaderTitle, -2, -2);
        d11.f41655s = R$id.selectionHeaderProfileIcon;
        d11.f41636i = 0;
        d11.f41642l = 0;
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setLayoutParams(d11);
        constraintLayout.addView(textAtomV2View);
        this.titleView = textAtomV2View;
        IconView iconView2 = new IconView(context, null, i12, i11, defaultConstructorMarker);
        ConstraintLayout.b a12 = C3531a.a(iconView2, R$id.selectionHeaderVerifyIcon, -2, -2);
        a12.f41655s = R$id.selectionHeaderTitle;
        a12.f41636i = 0;
        a12.f41642l = 0;
        iconView2.setLayoutParams(a12);
        constraintLayout.addView(iconView2);
        this.verifyIcon = iconView2;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41656t = 0;
        bVar2.f41657u = R$id.selectionHeaderRightContainer;
        bVar2.f41636i = 0;
        bVar2.f41642l = 0;
        addView(constraintLayout);
        constraintLayout.setLayoutParams(bVar2);
    }

    private final void bindSocialHeader(SelectionsListVI.HeaderVO.SocialHeader socialHeader, Function1<? super AtomAction, Unit> actionHandler) {
        setOnClickListener(new c(1, socialHeader, actionHandler));
        IconHolderKt.bindOrGone$default(this.profileIcon, socialHeader.getIcon(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.verifyIcon, socialHeader.getVerifyIcon(), null, 2, null);
        post(new a(1, this, socialHeader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindSocialHeader$lambda$17(SelectionsListVI.HeaderVO.SocialHeader socialHeader, Function1 function1, View view) {
        AtomAction action = socialHeader.getAction();
        if (action != null) {
            function1.invoke(action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindSocialHeader$lambda$18(SelectionTileHeaderView selectionTileHeaderView, SelectionsListVI.HeaderVO.SocialHeader socialHeader) {
        int width = (selectionTileHeaderView.leftContainer.getWidth() - selectionTileHeaderView.profileIcon.getWidth()) - selectionTileHeaderView.verifyIcon.getWidth();
        if (width > 0) {
            selectionTileHeaderView.titleView.setMaxWidth(width);
        }
        TextHolderKt.bindOrGone$default(selectionTileHeaderView.titleView, socialHeader.getTitle(), null, 2, null);
    }

    private final BadgeView getBadgeView() {
        return (BadgeView) this.badgeView.getValue();
    }

    private final ProductFavoriteMoleculeButtonView getFavoriteMolecule() {
        return (ProductFavoriteMoleculeButtonView) this.favoriteMolecule.getValue();
    }

    private final IconView getPlayIcon() {
        return (IconView) this.playIcon.getValue();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeButtonView button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.favProductMoleculeDelegate.attachFavButtonView(button);
    }

    public final void bind(@NotNull SelectionsListVI.HeaderVO header, SelectionsListVI.TopRightContent topContent, @NotNull W10.c trackingData, @NotNull l viewItem, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (header instanceof SelectionsListVI.HeaderVO.BadgeWrapper) {
            ViewExtKt.gone(this.profileIcon);
            ViewExtKt.gone(this.titleView);
            ViewExtKt.gone(this.verifyIcon);
            BadgeHolderKt.bind$default(getBadgeView(), ((SelectionsListVI.HeaderVO.BadgeWrapper) header).getBadge(), (Function1) null, 2, (Object) null);
        } else if (header instanceof SelectionsListVI.HeaderVO.SocialHeader) {
            bindSocialHeader((SelectionsListVI.HeaderVO.SocialHeader) header, actionHandler);
        }
        if (topContent != null) {
            bindTopContent(topContent, trackingData, viewItem);
        } else {
            ViewExtKt.gone(this.rightContainer);
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void bindFavoriteProductButton(@NotNull FavoriteButton button, FavoriteProductMolecule molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.favProductMoleculeDelegate.bindFavoriteProductButton(button, molecule, analyticData);
    }

    public final void bindTopContent(SelectionsListVI.TopRightContent topContent, @NotNull W10.c trackingData, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        if (topContent == null) {
            ViewExtKt.gone(this.rightContainer);
            return;
        }
        if (topContent instanceof SelectionsListVI.TopRightContent.IconWrapper) {
            ViewExtKt.gone(getFavoriteMolecule());
            IconHolderKt.bind$default(getPlayIcon(), ((SelectionsListVI.TopRightContent.IconWrapper) topContent).getIcon(), null, 2, null);
            ViewExtKt.show(this.rightContainer);
        } else {
            if (!(topContent instanceof SelectionsListVI.TopRightContent.FavoriteWrapper)) {
                throw new o();
            }
            ViewExtKt.gone(getPlayIcon());
            bindFavoriteProductButton(getFavoriteMolecule(), ((SelectionsListVI.TopRightContent.FavoriteWrapper) topContent).getFavoriteMolecule(), new AnalyticData(trackingData, viewItem));
            ViewExtKt.show(this.rightContainer);
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void detachFavButtonView() {
        this.favProductMoleculeDelegate.detachFavButtonView();
    }

    public final void hideHeaderContent() {
        ViewExtKt.gone(this.profileIcon);
        ViewExtKt.gone(this.titleView);
        ViewExtKt.gone(this.verifyIcon);
        ViewExtKt.gone(getBadgeView());
    }

    public final boolean onFavoriteClick() {
        return getFavoriteMolecule().performClick();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void setOnFavoriteClick(Function1<? super Boolean, Unit> function1) {
        this.favProductMoleculeDelegate.setOnFavoriteClick(function1);
    }
}
