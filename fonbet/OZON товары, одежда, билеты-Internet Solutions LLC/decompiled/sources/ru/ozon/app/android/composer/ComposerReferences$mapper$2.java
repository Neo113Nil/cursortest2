package ru.ozon.app.android.composer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LI00/a;", "Lru/ozon/composer/ui/widget/l;", "invoke", "()LI00/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ComposerReferences$mapper$2 extends AbstractC7737t implements Function0<I00.a<l>> {
    final /* synthetic */ ComposerReferences this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerReferences$mapper$2(ComposerReferences composerReferences) {
        super(0);
        this.this$0 = composerReferences;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final I00.a<l> invoke() {
        RetainComposerComponentApi component;
        component = this.this$0.getComponent();
        return component.getComposerUpdateMapper();
    }
}
