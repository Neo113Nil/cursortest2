package ru.ozon.android.composerCommonViewKit.emptyState.di;

import I00.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l20.c;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.core.EmptyStateV2ButtonsHorizontalViewMapper;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.core.EmptyStateV2ButtonsOverlayHorizontalViewMapper;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.core.EmptyStateV2ButtonsOverlayVerticalViewMapper;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.core.EmptyStateV2ButtonsVerticalViewMapper;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.core.EmptyStateV2FullViewMapper;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.core.EmptyStateV2WrapViewMapper;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0002\u0012\u0006\b\u0001\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LI00/d;", "", "Ll20/c;", "invoke", "()[LI00/d;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class EmptyStateWidgetComponent$Companion$invoke$1$1$viewMappers$2 extends AbstractC7737t implements Function0<d<? extends Object, ? extends c>[]> {
    final /* synthetic */ EmptyStateWidgetComponent$Companion$invoke$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateWidgetComponent$Companion$invoke$1$1$viewMappers$2(EmptyStateWidgetComponent$Companion$invoke$1$1 emptyStateWidgetComponent$Companion$invoke$1$1) {
        super(0);
        this.this$0 = emptyStateWidgetComponent$Companion$invoke$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final d<? extends Object, ? extends c>[] invoke() {
        ActionHandlersFactory actionHandlersFactory;
        ActionHandlersFactory actionHandlersFactory2;
        ActionHandlersFactory actionHandlersFactory3;
        ActionHandlersFactory actionHandlersFactory4;
        ActionHandlersFactory actionHandlersFactory5;
        ActionHandlersFactory actionHandlersFactory6;
        actionHandlersFactory = this.this$0.getActionHandlersFactory();
        EmptyStateV2WrapViewMapper emptyStateV2WrapViewMapper = new EmptyStateV2WrapViewMapper(actionHandlersFactory);
        actionHandlersFactory2 = this.this$0.getActionHandlersFactory();
        EmptyStateV2FullViewMapper emptyStateV2FullViewMapper = new EmptyStateV2FullViewMapper(actionHandlersFactory2);
        actionHandlersFactory3 = this.this$0.getActionHandlersFactory();
        EmptyStateV2ButtonsOverlayHorizontalViewMapper emptyStateV2ButtonsOverlayHorizontalViewMapper = new EmptyStateV2ButtonsOverlayHorizontalViewMapper(actionHandlersFactory3);
        actionHandlersFactory4 = this.this$0.getActionHandlersFactory();
        EmptyStateV2ButtonsOverlayVerticalViewMapper emptyStateV2ButtonsOverlayVerticalViewMapper = new EmptyStateV2ButtonsOverlayVerticalViewMapper(actionHandlersFactory4);
        actionHandlersFactory5 = this.this$0.getActionHandlersFactory();
        EmptyStateV2ButtonsVerticalViewMapper emptyStateV2ButtonsVerticalViewMapper = new EmptyStateV2ButtonsVerticalViewMapper(actionHandlersFactory5);
        actionHandlersFactory6 = this.this$0.getActionHandlersFactory();
        return new d[]{emptyStateV2WrapViewMapper, emptyStateV2FullViewMapper, emptyStateV2ButtonsOverlayHorizontalViewMapper, emptyStateV2ButtonsOverlayVerticalViewMapper, emptyStateV2ButtonsVerticalViewMapper, new EmptyStateV2ButtonsHorizontalViewMapper(actionHandlersFactory6)};
    }
}
