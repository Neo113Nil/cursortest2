package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateView;", "containerView", "", "tag", "<init>", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateView;Ljava/lang/String;)V", "Ll10/i;", "container", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "actionHandlersFactory", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateView;Ljava/lang/String;Ll10/i;Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;)V", "item", "Ll20/d;", "info", "", "payload", "", "bind", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2TopPartVO;Ll20/d;)V", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateView;", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actions", "Lkotlin/jvm/functions/Function1;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateV2ViewHolder extends k<EmptyStateV2TopPartVO> {
    private Function1<? super AtomAction, Unit> actions;

    @NotNull
    private final EmptyStateView containerView;
    private final String tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateV2ViewHolder(@NotNull EmptyStateView containerView, String str) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        this.tag = str;
    }

    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EmptyStateV2TopPartVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        EmptyStateView emptyStateView = this.containerView;
        Function1<? super AtomAction, Unit> function1 = this.actions;
        if (function1 == null) {
            function1 = EmptyStateV2ViewHolder$bind$1.INSTANCE;
        }
        emptyStateView.bind(item, payload, function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptyStateV2ViewHolder(@NotNull EmptyStateView containerView, String str, @NotNull i container, @NotNull ActionHandlersFactory actionHandlersFactory) {
        this(containerView, str);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(actionHandlersFactory, "actionHandlersFactory");
        this.actions = actionHandlersFactory.createActionHandler(container, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EmptyStateV2TopPartVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        EmptyStateView emptyStateView = this.containerView;
        Function1<? super AtomAction, Unit> function1 = this.actions;
        if (function1 == null) {
            function1 = EmptyStateV2ViewHolder$bind$2.INSTANCE;
        }
        emptyStateView.bind(item, function1);
    }
}
