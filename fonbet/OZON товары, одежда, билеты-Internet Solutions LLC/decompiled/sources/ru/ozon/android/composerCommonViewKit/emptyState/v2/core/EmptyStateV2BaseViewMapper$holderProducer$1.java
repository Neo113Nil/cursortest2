package ru.ozon.android.composerCommonViewKit.emptyState.v2.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateV2ViewHolder;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation.EmptyStateView;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "view", "Ll10/i;", "container", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ViewHolder;", "invoke", "(Landroid/view/View;Ll10/i;)Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ViewHolder;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class EmptyStateV2BaseViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, i, EmptyStateV2ViewHolder> {
    final /* synthetic */ EmptyStateV2BaseViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateV2BaseViewMapper$holderProducer$1(EmptyStateV2BaseViewMapper emptyStateV2BaseViewMapper) {
        super(2);
        this.this$0 = emptyStateV2BaseViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final EmptyStateV2ViewHolder invoke(View view, i container) {
        ActionHandlersFactory actionHandlersFactory;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        EmptyStateView emptyStateView = (EmptyStateView) view;
        actionHandlersFactory = this.this$0.actionHandlersFactory;
        return actionHandlersFactory != null ? new EmptyStateV2ViewHolder(emptyStateView, this.this$0.getTag(), container, actionHandlersFactory) : new EmptyStateV2ViewHolder(emptyStateView, this.this$0.getTag());
    }
}
