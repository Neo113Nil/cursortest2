package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky;

import Ae.C2399j;
import Ae.C2408n0;
import Vg.d;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l10.t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.permission.extension.ActivitiesKt;
import ru.ozon.app.android.travel.utils.extensions.PermissionExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyVO;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyViewModel;", "viewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LVg/d;Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyViewModel;Ld20/e;)V", "", "observeViewModel", "()V", "", "isAlreadyRequested", "handleNotificationPermission", "(Z)V", "dismissBottomSheet", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyVO;)V", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Ll10/t;", "getOwnerContainer", "()Ll10/t;", "ownerContainer", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoPopupV4StickyWidgetViewHolder extends AbstractC6064a<InfoPopupV4StickyVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final InfoPopupV4StickyViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoPopupV4StickyWidgetViewHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull InfoPopupV4StickyViewModel viewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new InfoPopupV4StickyWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onPreProcess(new InfoPopupV4StickyWidgetViewHolder$actionHandler$2(this)).onClick(new InfoPopupV4StickyWidgetViewHolder$actionHandler$3(this)).buildHandler();
        observeViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissBottomSheet() {
        List<ComponentCallbacksC5392m> r02;
        G c11 = getOwnerContainer().c();
        ComponentCallbacksC5392m componentCallbacksC5392m = (c11 == null || (r02 = c11.r0()) == null) ? null : (ComponentCallbacksC5392m) C7714v.Z(r02);
        ComponentCallbacksC5392m parentFragment = componentCallbacksC5392m != null ? componentCallbacksC5392m.getParentFragment() : null;
        if (parentFragment instanceof BottomSheetComposerFragment) {
            ((BottomSheetComposerFragment) parentFragment).dismiss();
            c11.c0();
        }
    }

    private final t getOwnerContainer() {
        return this.container.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleNotificationPermission(boolean isAlreadyRequested) {
        r a11 = getOwnerContainer().a();
        if (a11 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 33) {
            PermissionExtKt.openAppNotificationSettings(a11);
        } else if (isAlreadyRequested) {
            PermissionExtKt.openAppNotificationSettings(a11);
        } else {
            ActivitiesKt.requestPermission(a11, InfoPopupV4StickyWidgetViewHolder$handleNotificationPermission$1.INSTANCE);
        }
    }

    private final void observeViewModel() {
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getPermissionFlow(), getOwnerContainer().f().getLifecycle(), AbstractC5434v.b.STARTED), new InfoPopupV4StickyWidgetViewHolder$observeViewModel$1(this, null)), K.a(getOwnerContainer().f()));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull InfoPopupV4StickyVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky.InfoPopupV4StickyView");
        ((InfoPopupV4StickyView) view).bind$services_prodGoogleAllVendorsRelease(item, this.actionHandler);
    }
}
