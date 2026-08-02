package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CurtainCustomViewMapper$constructLayout$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ ComposerReferences $references;
    final /* synthetic */ CurtainCustomViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurtainCustomViewMapper$constructLayout$actionHandler$1(CurtainCustomViewMapper curtainCustomViewMapper, ComposerReferences composerReferences) {
        super(1);
        this.this$0 = curtainCustomViewMapper;
        this.$references = composerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        boolean processActionWithOpenCustomLinkIfNeedIt;
        Intrinsics.checkNotNullParameter(it, "it");
        processActionWithOpenCustomLinkIfNeedIt = this.this$0.processActionWithOpenCustomLinkIfNeedIt(it, this.$references.getNavigator());
        return Boolean.valueOf(processActionWithOpenCustomLinkIfNeedIt);
    }
}
