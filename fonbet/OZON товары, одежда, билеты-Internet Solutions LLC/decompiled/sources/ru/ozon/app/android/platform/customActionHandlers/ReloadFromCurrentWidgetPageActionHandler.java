package ru.ozon.app.android.platform.customActionHandlers;

import A00.a;
import T00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.di.module.CommonReloadPageActionFix;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/platform/customActionHandlers/ReloadFromCurrentWidgetPageActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "reloadFromPageSticky", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "getScrollOffset", "", "Landroid/view/View;", "Companion", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReloadFromCurrentWidgetPageActionHandler extends CustomActionHandler {
    private static final int SCROLL_OFFSET_PADDING = ResourceExtKt.toPx(8);

    @NotNull
    private final String actionId;

    @NotNull
    private final FeatureChecker featureChecker;

    public ReloadFromCurrentWidgetPageActionHandler(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
        this.actionId = "common_reloadFromPage";
    }

    private final int getScrollOffset(View view) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ResourceExtKt.getStatusBarHeight(context) - SCROLL_OFFSET_PADDING;
    }

    private final void reloadFromPageSticky(RecyclerView recyclerView, AtomAction.Click action, CustomActionHandler.HandlerReferences handlerRefs) {
        Object obj;
        int scrollOffset;
        ViewGroup rootView;
        AppBarLayout composerAppbar;
        RecyclerView.g adapter = recyclerView.getAdapter();
        C8042d c8042d = adapter instanceof C8042d ? (C8042d) adapter : null;
        if (c8042d == null) {
            return;
        }
        Iterator<T> it = c8042d.g().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Long voId = handlerRefs.getVoId();
            long f7 = ((l) obj).f();
            if (voId != null && voId.longValue() == f7) {
                break;
            }
        }
        l lVar = (l) obj;
        if (lVar == null) {
            return;
        }
        a b11 = lVar.c().b();
        String c11 = b11 != null ? b11.c() : null;
        if (c11 == null) {
            c11 = "";
        }
        InterfaceC7851b controller = handlerRefs.getRefs().getController();
        String link = action.getLink();
        if (link == null) {
            return;
        }
        if (this.featureChecker.isEnabled(CommonReloadPageActionFix.INSTANCE)) {
            ComponentCallbacksC5392m b12 = Sh.a.b(handlerRefs);
            scrollOffset = (b12 == null || (rootView = ContextExtKt.getRootView(b12)) == null || (composerAppbar = ComposerViewExtensionKt.composerAppbar(rootView)) == null) ? 0 : composerAppbar.getHeight();
        } else {
            scrollOffset = getScrollOffset(recyclerView);
        }
        controller.n(scrollOffset, c11, link);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        RecyclerView recyclerView;
        String str;
        d c11;
        a b11;
        d c12;
        a b12;
        View view;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.Click) {
            ComponentCallbacksC5392m b13 = Sh.a.b(handlerRefs);
            String str2 = null;
            if (b13 == null || (view = b13.getView()) == null || (recyclerView = ComposerViewExtensionKt.composerRecyclerViewOrNull(view)) == null) {
                r a11 = handlerRefs.getRefs().getContainer().a();
                recyclerView = a11 != null ? (RecyclerView) a11.findViewById(R.id.listRv) : null;
                if (recyclerView == null) {
                    return;
                }
            }
            int childCount = recyclerView.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                if (childAt != null) {
                    RecyclerView.C childViewHolder = recyclerView.getChildViewHolder(childAt);
                    if (childViewHolder instanceof k) {
                        k kVar = (k) childViewHolder;
                        l viewItem = kVar.getViewItem();
                        if (Intrinsics.d(viewItem != null ? Long.valueOf(viewItem.f()) : null, handlerRefs.getVoId())) {
                            if (this.featureChecker.isEnabled(CommonReloadPageActionFix.INSTANCE)) {
                                InterfaceC7851b controller = handlerRefs.getRefs().getController();
                                if (viewItem != null && (c12 = viewItem.c()) != null && (b12 = c12.b()) != null) {
                                    str2 = b12.c();
                                }
                                str = str2 != null ? str2 : "";
                                String link = ((AtomAction.Click) action).getLink();
                                if (link == null) {
                                    return;
                                }
                                controller.j(str, link, new a.C.b(kVar.getAdapterPosition(), (int) childAt.getY()));
                                return;
                            }
                            InterfaceC7851b controller2 = handlerRefs.getRefs().getController();
                            if (viewItem != null && (c11 = viewItem.c()) != null && (b11 = c11.b()) != null) {
                                str2 = b11.c();
                            }
                            str = str2 != null ? str2 : "";
                            String link2 = ((AtomAction.Click) action).getLink();
                            if (link2 == null) {
                                return;
                            }
                            controller2.n(((int) childAt.getY()) - getScrollOffset(childAt), str, link2);
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            reloadFromPageSticky(recyclerView, (AtomAction.Click) action, handlerRefs);
        }
    }
}
