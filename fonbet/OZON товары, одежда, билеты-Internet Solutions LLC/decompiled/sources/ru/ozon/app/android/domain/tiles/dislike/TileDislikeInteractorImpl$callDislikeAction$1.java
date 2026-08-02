package ru.ozon.app.android.domain.tiles.dislike;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractorImpl", f = "TileDislikeInteractorImpl.kt", l = {121, 125}, m = "callDislikeAction")
/* loaded from: classes11.dex */
final class TileDislikeInteractorImpl$callDislikeAction$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TileDislikeInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileDislikeInteractorImpl$callDislikeAction$1(TileDislikeInteractorImpl tileDislikeInteractorImpl, d<? super TileDislikeInteractorImpl$callDislikeAction$1> dVar) {
        super(dVar);
        this.this$0 = tileDislikeInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object callDislikeAction;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        callDislikeAction = this.this$0.callDislikeAction(null, this);
        return callDislikeAction;
    }
}
