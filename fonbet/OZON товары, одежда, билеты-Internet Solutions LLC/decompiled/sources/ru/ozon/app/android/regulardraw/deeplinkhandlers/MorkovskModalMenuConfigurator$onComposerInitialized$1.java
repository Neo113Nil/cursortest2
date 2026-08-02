package ru.ozon.app.android.regulardraw.deeplinkhandlers;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.deeplinkhandlers.MorkovskModalMenuConfigurator$onComposerInitialized$1;
import ru.ozon.app.android.regulardraw.ui.backgroundViews.MorkovskModalBgView;
import ru.ozon.app.android.regulardraw.utils.UtilKt;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ru/ozon/app/android/regulardraw/deeplinkhandlers/MorkovskModalMenuConfigurator$onComposerInitialized$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskModalMenuConfigurator$onComposerInitialized$1 implements DefaultLifecycleObserver {
    final /* synthetic */ Context $context;
    final /* synthetic */ ComponentCallbacksC5392m $fragment;
    final /* synthetic */ MorkovskModalMenuConfigurator this$0;

    MorkovskModalMenuConfigurator$onComposerInitialized$1(ComponentCallbacksC5392m componentCallbacksC5392m, Context context, MorkovskModalMenuConfigurator morkovskModalMenuConfigurator) {
        this.$fragment = componentCallbacksC5392m;
        this.$context = context;
        this.this$0 = morkovskModalMenuConfigurator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(MorkovskModalBgView morkovskModalBgView, RecyclerView recyclerView) {
        morkovskModalBgView.bind(recyclerView.getMeasuredHeight());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(J owner) {
        ViewTreeObserver viewTreeObserver;
        Intrinsics.checkNotNullParameter(owner, "owner");
        View view = this.$fragment.getView();
        CoordinatorLayout composerCoordinatorLayout = view != null ? ComposerViewExtensionKt.composerCoordinatorLayout(view) : null;
        View view2 = this.$fragment.getView();
        final RecyclerView composerRecyclerView = view2 != null ? ComposerViewExtensionKt.composerRecyclerView(view2) : null;
        final MorkovskModalBgView morkovskModalBgView = new MorkovskModalBgView(this.$context, null, 0, 6, null);
        if (composerRecyclerView != null && (viewTreeObserver = composerRecyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: PF.a
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    MorkovskModalMenuConfigurator$onComposerInitialized$1.onCreate$lambda$0(MorkovskModalBgView.this, composerRecyclerView);
                }
            });
        }
        if (composerCoordinatorLayout != null) {
            composerCoordinatorLayout.addView(morkovskModalBgView, 0);
        }
        if (composerCoordinatorLayout != null) {
            composerCoordinatorLayout.setBackgroundColor(UtilKt.parseColor(R$color.modal_bg_color, this.$context));
        }
        this.this$0.configModal(this.$fragment);
    }
}
