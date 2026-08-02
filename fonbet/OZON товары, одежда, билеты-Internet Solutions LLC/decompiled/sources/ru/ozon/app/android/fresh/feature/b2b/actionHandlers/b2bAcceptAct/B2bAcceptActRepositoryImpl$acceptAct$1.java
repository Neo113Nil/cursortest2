package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.B2bAcceptActRepositoryImpl", f = "B2bAcceptActRepository.kt", l = {18}, m = "acceptAct")
/* loaded from: classes12.dex */
final class B2bAcceptActRepositoryImpl$acceptAct$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ B2bAcceptActRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bAcceptActRepositoryImpl$acceptAct$1(B2bAcceptActRepositoryImpl b2bAcceptActRepositoryImpl, d<? super B2bAcceptActRepositoryImpl$acceptAct$1> dVar) {
        super(dVar);
        this.this$0 = b2bAcceptActRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.acceptAct(null, null, this);
    }
}
