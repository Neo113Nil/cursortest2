package ru.ozon.app.android.favorites.createshoppinglist.actiondelegate;

import W10.c;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/actiondelegate/FlowActionDelegate;", "Lru/ozon/app/android/favorites/createshoppinglist/actiondelegate/ActionDelegate;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Landroid/view/ViewGroup;", "composerRootView", "", "widgetId", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/ViewGroup;JLW10/c;)V", "", "onSuccessRename", "()V", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$SuccessCreate;", "action", "onSuccessCreate", "(Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action$SuccessCreate;)V", "J", "LW10/c;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FlowActionDelegate extends ActionDelegate {

    @NotNull
    private final c trackingData;
    private final long widgetId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowActionDelegate(@NotNull ComposerReferences references, @NotNull ViewGroup composerRootView, long j11, @NotNull c trackingData) {
        super(references, composerRootView);
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.widgetId = j11;
        this.trackingData = trackingData;
    }

    @Override // ru.ozon.app.android.favorites.createshoppinglist.actiondelegate.ActionDelegate
    protected void onSuccessCreate(@NotNull CreateShoppingListViewModel.Action.SuccessCreate action) {
        Intrinsics.checkNotNullParameter(action, "action");
        super.onSuccessCreate(action);
        ComposerExtKt.setResult$default(getReferences().getContainer(), null, 0, new FlowActionDelegate$onSuccessCreate$1(action, this), 3, null);
        ComposerExtKt.closeFlow(getReferences().getContainer());
    }

    @Override // ru.ozon.app.android.favorites.createshoppinglist.actiondelegate.ActionDelegate
    protected void onSuccessRename() {
        super.onSuccessRename();
        ComposerExtKt.setResult$default(getReferences().getContainer(), null, 0, null, 7, null);
        ComposerExtKt.closeFlow(getReferences().getContainer());
    }
}
