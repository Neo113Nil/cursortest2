package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate;

import Vg.e;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeDelegateFactoryImpl;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeDelegateFactory;", "<init>", "()V", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/ComposeWidgetInfo;", "widgetInfo", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "Lru/ozon/app/android/action/WidgetActionHandlerBuilder;", "actionHandlerBuilder", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeViewDelegate;", "create-nsP1ncM", "(Landroid/view/View;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/ComposeWidgetInfo;Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;LVg/e$a;)Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteentity/composeDelegate/FavoriteEntityComposeViewDelegate;", "create", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteEntityComposeDelegateFactoryImpl implements FavoriteEntityComposeDelegateFactory {
    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.composeDelegate.FavoriteEntityComposeDelegateFactory
    @NotNull
    /* renamed from: create-nsP1ncM */
    public FavoriteEntityComposeViewDelegate mo698creatensP1ncM(@NotNull View containerView, @NotNull ComposeWidgetInfo widgetInfo, @NotNull FavoriteEntityInteractor favoriteEntityInteractor, @NotNull e.a actionHandlerBuilder) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(favoriteEntityInteractor, "favoriteEntityInteractor");
        Intrinsics.checkNotNullParameter(actionHandlerBuilder, "actionHandlerBuilder");
        return new FavoriteEntityComposeViewDelegate(containerView, widgetInfo, favoriteEntityInteractor, actionHandlerBuilder, null);
    }
}
