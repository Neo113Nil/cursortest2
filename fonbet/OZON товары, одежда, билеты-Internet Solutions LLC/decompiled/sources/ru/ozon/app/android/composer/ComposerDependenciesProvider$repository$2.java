package ru.ozon.app.android.composer;

import K00.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l20.c;
import m20.InterfaceC8046a;
import n20.k;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponent;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.composer.ui.widget.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LK00/i;", "Lru/ozon/composer/ui/widget/l;", "invoke", "()LK00/i;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ComposerDependenciesProvider$repository$2 extends AbstractC7737t implements Function0<i<l>> {
    final /* synthetic */ ComposerDependenciesProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerDependenciesProvider$repository$2(ComposerDependenciesProvider composerDependenciesProvider) {
        super(0);
        this.this$0 = composerDependenciesProvider;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final i<l> invoke() {
        RetainComposerComponent retainComposerComponent;
        RetainComposerComponent retainComposerComponent2;
        retainComposerComponent = this.this$0.retainComponent;
        k<InterfaceC8046a<?, ? extends c>> widgetStore = retainComposerComponent.getWidgetStore();
        retainComposerComponent2 = this.this$0.retainComponent;
        return K00.a.d(retainComposerComponent2.getNetwork(), widgetStore, new o(widgetStore));
    }
}
