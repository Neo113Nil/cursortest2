package ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.actionHandler;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/ozon/composer/ui/widget/l;", "invoke", "()Lru/ozon/composer/ui/widget/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class BaseCommentFooterActionHandler$processAction$2 extends AbstractC7737t implements Function0<l> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCommentFooterActionHandler$processAction$2(CustomActionHandler.HandlerReferences handlerReferences) {
        super(0);
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.jvm.functions.Function0
    public final l invoke() {
        return this.$handlerRefs.getViewItem();
    }
}
