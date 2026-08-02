package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsHorizontalViewHolder;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsBaseViewHolder;", "Landroid/widget/FrameLayout;", "view", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactory", "Ll10/i;", "container", "<init>", "(Landroid/widget/FrameLayout;Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;Ll10/i;)V", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsVO;", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsVO;Ll20/d;)V", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsHorizontalViewDelegate;", "emptyStateV2ButtonsHorizontalViewDelegate", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsHorizontalViewDelegate;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateV2ButtonsHorizontalViewHolder extends EmptyStateV2ButtonsBaseViewHolder {

    @NotNull
    private final EmptyStateV2ButtonsHorizontalViewDelegate emptyStateV2ButtonsHorizontalViewDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateV2ButtonsHorizontalViewHolder(@NotNull FrameLayout view, @NotNull ActionHandlersFactory actionHandlersFactory, @NotNull i container) {
        super(view, actionHandlersFactory, container);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandlersFactory, "actionHandlersFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        this.emptyStateV2ButtonsHorizontalViewDelegate = new EmptyStateV2ButtonsHorizontalViewDelegate(view, getActionHandler(), container.b0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EmptyStateV2ButtonsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.emptyStateV2ButtonsHorizontalViewDelegate.bind(item);
    }
}
