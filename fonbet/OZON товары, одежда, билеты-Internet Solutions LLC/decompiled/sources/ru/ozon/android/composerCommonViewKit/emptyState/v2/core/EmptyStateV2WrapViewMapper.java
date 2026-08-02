package ru.ozon.android.composerCommonViewKit.emptyState.v2.core;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.EmptyStateV2DTO;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.EmptyStateV2TopPartModel;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateView;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2WrapViewMapper;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2BaseViewMapper;", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactory", "<init>", "(Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateView;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateV2WrapViewMapper extends EmptyStateV2BaseViewMapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateV2WrapViewMapper(@NotNull ActionHandlersFactory actionHandlersFactory) {
        super(actionHandlersFactory);
        Intrinsics.checkNotNullParameter(actionHandlersFactory, "actionHandlersFactory");
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof EmptyStateV2TopPartModel) && ((EmptyStateV2TopPartModel) state).getSize() == EmptyStateV2DTO.EmptyStateSize.WRAP;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public EmptyStateView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        EmptyStateView emptyStateView = new EmptyStateView(context, null, 0, 0, 14, null);
        emptyStateView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        return emptyStateView;
    }
}
