package ru.ozon.app.android.search.dialogsearchscreen;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel", f = "DialogSearchViewModel.kt", l = {392}, m = "refreshPage")
/* loaded from: classes13.dex */
final class DialogSearchViewModel$refreshPage$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DialogSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchViewModel$refreshPage$1(DialogSearchViewModel dialogSearchViewModel, d<? super DialogSearchViewModel$refreshPage$1> dVar) {
        super(dVar);
        this.this$0 = dialogSearchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object refreshPage;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        refreshPage = this.this$0.refreshPage(null, false, this);
        return refreshPage;
    }
}
