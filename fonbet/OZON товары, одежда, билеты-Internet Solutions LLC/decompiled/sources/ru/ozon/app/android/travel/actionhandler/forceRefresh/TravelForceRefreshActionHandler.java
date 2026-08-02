package ru.ozon.app.android.travel.actionhandler.forceRefresh;

import NZ.d;
import a00.C4911f;
import android.content.Intent;
import androidx.appcompat.app.x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import com.google.android.material.bottomsheet.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/forceRefresh/TravelForceRefreshActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "<init>", "()V", "Landroidx/fragment/app/G;", "fragmentManager", "", "closeAllBottomSheets", "(Landroidx/fragment/app/G;)V", "La00/f;", "container", "", "refreshUrl", "sendRefreshResultToParentComposerFragment", "(La00/f;Ljava/lang/String;)V", "Landroidx/fragment/app/m;", "findParentComposerOrTabFragment", "(Landroidx/fragment/app/m;)Landroidx/fragment/app/m;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelForceRefreshActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId = "travelForceRefresh";

    private final void closeAllBottomSheets(G fragmentManager) {
        ComponentCallbacksC5392m parentFragment;
        G parentFragmentManager;
        List<ComponentCallbacksC5392m> r02;
        List<ComponentCallbacksC5392m> r03 = fragmentManager.r0();
        Intrinsics.checkNotNullExpressionValue(r03, "getFragments(...)");
        ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) C7714v.Z(r03);
        if (componentCallbacksC5392m == null || (parentFragment = componentCallbacksC5392m.getParentFragment()) == null || (parentFragmentManager = parentFragment.getParentFragmentManager()) == null || (r02 = parentFragmentManager.r0()) == null) {
            return;
        }
        for (ComponentCallbacksC5392m componentCallbacksC5392m2 : r02) {
            if ((componentCallbacksC5392m2 instanceof BottomSheetComposerFragment) || (componentCallbacksC5392m2 instanceof b)) {
                ((x) componentCallbacksC5392m2).dismissAllowingStateLoss();
            }
        }
    }

    private final ComponentCallbacksC5392m findParentComposerOrTabFragment(ComponentCallbacksC5392m componentCallbacksC5392m) {
        if ((componentCallbacksC5392m instanceof ComposerFragment) || (componentCallbacksC5392m instanceof d)) {
            return componentCallbacksC5392m;
        }
        ComponentCallbacksC5392m parentFragment = componentCallbacksC5392m.getParentFragment();
        if (parentFragment == null) {
            parentFragment = componentCallbacksC5392m.getTargetFragment();
        }
        if (parentFragment != null) {
            return findParentComposerOrTabFragment(parentFragment);
        }
        return null;
    }

    private final void sendRefreshResultToParentComposerFragment(C4911f container, String refreshUrl) {
        ComponentCallbacksC5392m targetFragment;
        ComponentCallbacksC5392m c11 = container.c();
        if (c11 == null || (targetFragment = c11.getParentFragment()) == null) {
            ComponentCallbacksC5392m c12 = container.c();
            targetFragment = c12 != null ? c12.getTargetFragment() : null;
            if (targetFragment == null) {
                return;
            }
        }
        ComponentCallbacksC5392m findParentComposerOrTabFragment = findParentComposerOrTabFragment(targetFragment);
        if (findParentComposerOrTabFragment == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("EXTRA_REFRESH_URL", refreshUrl);
        findParentComposerOrTabFragment.onActivityResult(9001, -1, intent);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.DismissRefresh) {
            G d11 = handlerRefs.getRefs().getContainer().d();
            if (d11 != null) {
                closeAllBottomSheets(d11);
            }
            String link = ((AtomAction.DismissRefresh) action).getLink();
            if (link != null) {
                sendRefreshResultToParentComposerFragment(handlerRefs.getRefs().getContainer(), link);
            }
        }
    }
}
