package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct;

import Sc.o;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteChangeResult;
import ru.ozon.app.android.favorites.domain.notification.NotificationDelegate;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavProductButtonView;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FavProductButtonPresenter$initSubscribers$4 extends AbstractC7737t implements Function1<FavoriteChangeResult, Unit> {
    final /* synthetic */ FavoriteProductMolecule $molecule;
    final /* synthetic */ FavProductButtonPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavProductButtonPresenter$initSubscribers$4(FavProductButtonPresenter favProductButtonPresenter, FavoriteProductMolecule favoriteProductMolecule) {
        super(1);
        this.this$0 = favProductButtonPresenter;
        this.$molecule = favoriteProductMolecule;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FavoriteChangeResult favoriteChangeResult) {
        invoke2(favoriteChangeResult);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FavoriteChangeResult favoriteChangeResult) {
        WeakReference weakReference;
        FavProductButtonView favProductButtonView;
        WeakReference weakReference2;
        WeakReference weakReference3;
        FavProductButtonView favProductButtonView2;
        NotificationDelegate notificationDelegate;
        FavProductButtonView favProductButtonView3;
        if (!(favoriteChangeResult instanceof FavoriteChangeResult.Success)) {
            if (!(favoriteChangeResult instanceof FavoriteChangeResult.Failure)) {
                throw new o();
            }
            weakReference = this.this$0.view;
            if (weakReference == null || (favProductButtonView = (FavProductButtonView) weakReference.get()) == null) {
                return;
            }
            favProductButtonView.bindFavButtonOnError(this.$molecule);
            return;
        }
        weakReference2 = this.this$0.view;
        if (weakReference2 != null && (favProductButtonView3 = (FavProductButtonView) weakReference2.get()) != null) {
            favProductButtonView3.favStateSuccefullyChanged(((FavoriteChangeResult.Success) favoriteChangeResult).getMolecule());
        }
        weakReference3 = this.this$0.view;
        if (weakReference3 == null || (favProductButtonView2 = (FavProductButtonView) weakReference3.get()) == null || (notificationDelegate = favProductButtonView2.getNotificationDelegate()) == null) {
            return;
        }
        FavoriteChangeResult.Success success = (FavoriteChangeResult.Success) favoriteChangeResult;
        notificationDelegate.handle(success.getNotification(), success.getNotificationPayloads());
    }
}
