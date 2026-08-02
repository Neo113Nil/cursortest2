package ru.ozon.app.android.composer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll10/b;", "invoke", "()Ll10/b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ComposerReferences$controller$2 extends AbstractC7737t implements Function0<InterfaceC7851b> {
    final /* synthetic */ ComposerReferences this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerReferences$controller$2(ComposerReferences composerReferences) {
        super(0);
        this.this$0 = composerReferences;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC7851b invoke() {
        RetainComposerComponentApi component;
        component = this.this$0.getComponent();
        return component.getComposerController();
    }
}
