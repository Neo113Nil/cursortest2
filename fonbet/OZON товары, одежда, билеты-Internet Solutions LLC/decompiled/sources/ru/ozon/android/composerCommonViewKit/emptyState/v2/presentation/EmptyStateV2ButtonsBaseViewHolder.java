package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsBaseViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsVO;", "Landroid/widget/FrameLayout;", "view", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactory", "Ll10/i;", "container", "<init>", "(Landroid/widget/FrameLayout;Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;Ll10/i;)V", "", "dp16", "I", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class EmptyStateV2ButtonsBaseViewHolder extends k<EmptyStateV2ButtonsVO> {
    private final Function1<AtomAction, Unit> actionHandler;
    private final int dp16;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateV2ButtonsBaseViewHolder(@NotNull FrameLayout view, @NotNull ActionHandlersFactory actionHandlersFactory, @NotNull i container) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandlersFactory, "actionHandlersFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        int px = UiExtKt.toPx(16);
        this.dp16 = px;
        this.actionHandler = actionHandlersFactory.createActionHandler(container, this);
        view.setPadding(0, 0, 0, px);
    }

    protected final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }
}
