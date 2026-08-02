package ru.ozon.android.composerCommonViewKit.emptyState.v2.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.core.EmptyStateV2ButtonsOverlayVerticalViewMapper;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model.EmptyStateV2ButtonsModel;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ButtonsVO;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ButtonsVerticalOverlayViewHolder;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2ButtonsOverlayVerticalViewMapper;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/core/EmptyStateV2ButtonsOverlayBaseViewMapper;", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactory", "<init>", "(Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsVO;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateV2ButtonsOverlayVerticalViewMapper extends EmptyStateV2ButtonsOverlayBaseViewMapper {

    @NotNull
    private final ActionHandlersFactory actionHandlersFactory;

    public EmptyStateV2ButtonsOverlayVerticalViewMapper(@NotNull ActionHandlersFactory actionHandlersFactory) {
        Intrinsics.checkNotNullParameter(actionHandlersFactory, "actionHandlersFactory");
        this.actionHandlersFactory = actionHandlersFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(i iVar, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FrameLayout frameLayout = new FrameLayout(iVar.L());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        return frameLayout;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        EmptyStateV2ButtonsModel emptyStateV2ButtonsModel;
        List<AtomDTO> buttons;
        return (state instanceof EmptyStateV2ButtonsModel) && (buttons = (emptyStateV2ButtonsModel = (EmptyStateV2ButtonsModel) state).getButtons()) != null && !buttons.isEmpty() && emptyStateV2ButtonsModel.getIsOverlayWidget() && emptyStateV2ButtonsModel.getButtonLayout() == StatusWidgetDTO.ButtonLayout.BUTTON_LAYOUT_VERTICAL;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<EmptyStateV2ButtonsVO> createHolder(@NotNull final i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new EmptyStateV2ButtonsVerticalOverlayViewHolder(container, this.actionHandlersFactory, new InterfaceC6068e() { // from class: Wh.b
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$2;
                createHolder$lambda$2 = EmptyStateV2ButtonsOverlayVerticalViewMapper.createHolder$lambda$2(i.this, (LinearLayout) viewGroup);
                return createHolder$lambda$2;
            }
        });
    }
}
