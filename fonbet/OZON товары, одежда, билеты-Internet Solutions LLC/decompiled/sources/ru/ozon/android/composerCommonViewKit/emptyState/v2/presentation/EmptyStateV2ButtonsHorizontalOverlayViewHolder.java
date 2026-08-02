package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsHorizontalOverlayViewHolder;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsBaseOverlayViewHolder;", "Ll10/i;", "container", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;Ld20/e;)V", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsVO;", "item", "", "bind", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsVO;)V", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsHorizontalViewDelegate;", "emptyStateV2ButtonsHorizontalViewDelegate", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsHorizontalViewDelegate;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateV2ButtonsHorizontalOverlayViewHolder extends EmptyStateV2ButtonsBaseOverlayViewHolder {

    @NotNull
    private final EmptyStateV2ButtonsHorizontalViewDelegate emptyStateV2ButtonsHorizontalViewDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateV2ButtonsHorizontalOverlayViewHolder(@NotNull i container, @NotNull ActionHandlersFactory actionHandlersFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory, actionHandlersFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(actionHandlersFactory, "actionHandlersFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.emptyStateV2ButtonsHorizontalViewDelegate = new EmptyStateV2ButtonsHorizontalViewDelegate(getView(), getActionHandler(), container.b0());
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull EmptyStateV2ButtonsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.emptyStateV2ButtonsHorizontalViewDelegate.bind(item);
    }
}
