package ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation;

import a00.C4911f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La00/f;", "invoke", "()La00/f;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class FreshTileViewHolderV2$attachDelegate$1 extends AbstractC7737t implements Function0<C4911f> {
    final /* synthetic */ FreshTileViewHolderV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshTileViewHolderV2$attachDelegate$1(FreshTileViewHolderV2 freshTileViewHolderV2) {
        super(0);
        this.this$0 = freshTileViewHolderV2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C4911f invoke() {
        ComposerReferences composerReferences;
        composerReferences = this.this$0.composerReferences;
        return composerReferences.getContainer();
    }
}
