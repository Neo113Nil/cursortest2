package ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation;

import Vg.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationSliderV3BaseWidgetViewHolder$actionHandler$2 extends AbstractC7737t implements Function0<Function1<? super AtomAction, ? extends Unit>> {
    final /* synthetic */ NavigationSliderV3BaseWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.NavigationSliderV3BaseWidgetViewHolder$actionHandler$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<c> {
        final /* synthetic */ NavigationSliderV3BaseWidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavigationSliderV3BaseWidgetViewHolder navigationSliderV3BaseWidgetViewHolder) {
            super(0);
            this.this$0 = navigationSliderV3BaseWidgetViewHolder;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final c invoke() {
            c cVar;
            cVar = this.this$0.actionHandlersStore;
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderV3BaseWidgetViewHolder$actionHandler$2(NavigationSliderV3BaseWidgetViewHolder navigationSliderV3BaseWidgetViewHolder) {
        super(0);
        this.this$0 = navigationSliderV3BaseWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super AtomAction, ? extends Unit> invoke() {
        ComposerReferences composerReferences;
        composerReferences = this.this$0.composerReferences;
        return new ActionHandler.Builder(composerReferences, this.this$0).customActionHandlers(new AnonymousClass1(this.this$0)).buildHandler();
    }
}
