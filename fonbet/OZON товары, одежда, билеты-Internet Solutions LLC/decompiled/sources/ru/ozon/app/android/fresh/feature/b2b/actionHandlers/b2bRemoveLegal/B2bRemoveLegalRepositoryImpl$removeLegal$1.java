package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalRepositoryImpl", f = "B2bRemoveLegalRepository.kt", l = {22}, m = "removeLegal")
/* loaded from: classes12.dex */
final class B2bRemoveLegalRepositoryImpl$removeLegal$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ B2bRemoveLegalRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bRemoveLegalRepositoryImpl$removeLegal$1(B2bRemoveLegalRepositoryImpl b2bRemoveLegalRepositoryImpl, d<? super B2bRemoveLegalRepositoryImpl$removeLegal$1> dVar) {
        super(dVar);
        this.this$0 = b2bRemoveLegalRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.removeLegal(null, null, this);
    }
}
