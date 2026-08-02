package ru.ozon.android.composerCommonViewKit.emptyState.v2.core;

import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.EmptyStateV2ButtonsModel;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ButtonsVO;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ButtonsVerticalViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2ButtonsVerticalViewMapper;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2ButtonsBaseViewMapper;", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactory", "<init>", "(Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsVO;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateV2ButtonsVerticalViewMapper extends EmptyStateV2ButtonsBaseViewMapper {

    @NotNull
    private final ActionHandlersFactory actionHandlersFactory;

    public EmptyStateV2ButtonsVerticalViewMapper(@NotNull ActionHandlersFactory actionHandlersFactory) {
        Intrinsics.checkNotNullParameter(actionHandlersFactory, "actionHandlersFactory");
        this.actionHandlersFactory = actionHandlersFactory;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        EmptyStateV2ButtonsModel emptyStateV2ButtonsModel;
        List<AtomDTO> buttons;
        return (!(state instanceof EmptyStateV2ButtonsModel) || (buttons = (emptyStateV2ButtonsModel = (EmptyStateV2ButtonsModel) state).getButtons()) == null || buttons.isEmpty() || emptyStateV2ButtonsModel.getIsOverlayWidget() || emptyStateV2ButtonsModel.getButtonLayout() != StatusWidgetDTO.ButtonLayout.BUTTON_LAYOUT_VERTICAL) ? false : true;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<EmptyStateV2ButtonsVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new EmptyStateV2ButtonsVerticalViewHolder((FrameLayout) view, this.actionHandlersFactory, container);
    }
}
