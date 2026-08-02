package ru.ozon.app.android.sellerproducts.sellerProducts.secondarybutton;

import GZ.g;
import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.bottomsheet.MessagesProcessor;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JQ\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/secondarybutton/SecondaryButtonMessageProcesser;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/bottomsheet/MessagesProcessor;", "LGZ/g;", "screenRouter", "<init>", "(LGZ/g;)V", "Landroidx/lifecycle/J;", "viewOwner", "Landroid/app/Activity;", "activity", "", "message", "", "duration", "", "icon", "actionTitle", "actionDeeplink", "", "showMessage", "(Landroidx/lifecycle/J;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "errorMessage", "showError", "(Landroidx/lifecycle/J;Landroid/app/Activity;Ljava/lang/String;)V", "LGZ/g;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SecondaryButtonMessageProcesser implements MessagesProcessor {

    @NotNull
    private final g screenRouter;

    public SecondaryButtonMessageProcesser(@NotNull g screenRouter) {
        Intrinsics.checkNotNullParameter(screenRouter, "screenRouter");
        this.screenRouter = screenRouter;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.bottomsheet.MessagesProcessor
    public void showError(@NotNull J viewOwner, @NotNull Activity activity, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        ViewGroup rootView = ContextExtKt.getRootView(activity);
        if (rootView != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(errorMessage), null, null, Integer.valueOf(R$drawable.ic_warning), null, null, null, null, null, null, null, 3000L, null, null, viewOwner, 57306, null).show();
        }
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.bottomsheet.MessagesProcessor
    public void showMessage(@NotNull J viewOwner, @NotNull Activity activity, @NotNull String message, Long duration, Integer icon, String actionTitle, String actionDeeplink) {
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(message, "message");
        Action action = actionTitle != null ? new Action(actionTitle, false, new SecondaryButtonMessageProcesser$showMessage$action$1$1(actionDeeplink, this), 2, null) : null;
        ViewGroup rootView = ContextExtKt.getRootView(activity);
        if (rootView != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, icon, null, null, null, action, null, null, null, duration, null, null, viewOwner, 56794, null).show();
        }
    }
}
