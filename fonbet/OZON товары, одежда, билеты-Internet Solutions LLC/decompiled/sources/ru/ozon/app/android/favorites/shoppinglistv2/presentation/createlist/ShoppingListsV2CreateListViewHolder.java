package ru.ozon.app.android.favorites.shoppinglistv2.presentation.createlist;

import Dc0.j;
import GZ.g;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.feature.databinding.WidgetShoppingListsNewListItemBinding;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001&B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/favorites/shoppinglistv2/presentation/createlist/ShoppingListsV2CreateListViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/createlist/ShoppingListsV2CreateListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LGZ/g;", "ozonRouter", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LGZ/g;)V", "", "shouldMoveToNewList", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "openCreateNewList", "(ZLru/ozon/uni/atoms/af/AtomAction$Click;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/favorites/shoppinglistv2/presentation/createlist/ShoppingListsV2CreateListVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LGZ/g;", "Lru/ozon/app/android/favorites/feature/databinding/WidgetShoppingListsNewListItemBinding;", "binding", "Lru/ozon/app/android/favorites/feature/databinding/WidgetShoppingListsNewListItemBinding;", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/createlist/ShoppingListsV2CreateListVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShoppingListsV2CreateListViewHolder extends k<ShoppingListsV2CreateListVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetShoppingListsNewListItemBinding binding;

    @NotNull
    private final View containerView;
    private ShoppingListsV2CreateListVO item;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListsV2CreateListViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull g ozonRouter) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.containerView = containerView;
        this.refs = refs;
        this.ozonRouter = ozonRouter;
        WidgetShoppingListsNewListItemBinding bind = WidgetShoppingListsNewListItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new ShoppingListsV2CreateListViewHolder$actionHandler$1(this)).buildHandler();
        containerView.setOnClickListener(new j(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ShoppingListsV2CreateListViewHolder shoppingListsV2CreateListViewHolder, View view) {
        ShoppingListsV2CreateListVO shoppingListsV2CreateListVO = shoppingListsV2CreateListViewHolder.item;
        if (shoppingListsV2CreateListVO == null) {
            Intrinsics.n("item");
            throw null;
        }
        AtomAction action = shoppingListsV2CreateListVO.getAction();
        if (action instanceof AtomAction.Move) {
            String link = ((AtomAction.Move) action).getLink();
            if (link != null) {
                shoppingListsV2CreateListViewHolder.ozonRouter.b(link, 28417, U.c());
            }
        } else {
            Function1<AtomAction, Unit> function1 = shoppingListsV2CreateListViewHolder.actionHandler;
            ShoppingListsV2CreateListVO shoppingListsV2CreateListVO2 = shoppingListsV2CreateListViewHolder.item;
            if (shoppingListsV2CreateListVO2 == null) {
                Intrinsics.n("item");
                throw null;
            }
            function1.invoke(shoppingListsV2CreateListVO2.getAction());
        }
        ShoppingListsV2CreateListVO shoppingListsV2CreateListVO3 = shoppingListsV2CreateListViewHolder.item;
        if (shoppingListsV2CreateListVO3 != null) {
            shoppingListsV2CreateListVO3.getTrackingInfo();
        } else {
            Intrinsics.n("item");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openCreateNewList(boolean shouldMoveToNewList, AtomAction.Click action) {
        if (shouldMoveToNewList) {
            String link = action.getLink();
            if (link != null) {
                this.ozonRouter.b(link, 28417, U.i(new Pair("shouldMoveToNewList", Boolean.valueOf(shouldMoveToNewList))));
                return;
            }
            return;
        }
        ComposerNavigator navigator = this.refs.getNavigator();
        String link2 = action.getLink();
        if (link2 == null) {
            link2 = LinkGenerator.INSTANCE.createFavoritesList().toString();
            Intrinsics.checkNotNullExpressionValue(link2, "toString(...)");
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, link2, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ShoppingListsV2CreateListVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        ImageView addIv = this.binding.addIv;
        Intrinsics.checkNotNullExpressionValue(addIv, "addIv");
        ImageViewExtKt.load$default(addIv, item.getIcon(), null, null, null, null, false, null, 126, null);
        ImageView addIv2 = this.binding.addIv;
        Intrinsics.checkNotNullExpressionValue(addIv2, "addIv");
        ThemeExtKt.tint(addIv2, StyleParser.INSTANCE.parseColor(getContext(), UniColors.BG_ACTION_PRIMARY.getToken()));
        this.binding.addTitle.setText(item.getTitle());
        View addImageBackgroundView = this.binding.addImageBackgroundView;
        Intrinsics.checkNotNullExpressionValue(addImageBackgroundView, "addImageBackgroundView");
        ViewExtKt.showOrGone(addImageBackgroundView, Boolean.valueOf(ThemeExtKt.isDarkThemeActive(getContext())));
    }
}
