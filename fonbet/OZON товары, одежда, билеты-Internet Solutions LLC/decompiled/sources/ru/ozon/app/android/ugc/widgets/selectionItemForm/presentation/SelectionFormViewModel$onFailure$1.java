package ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel", f = "SelectionFormViewModel.kt", l = {208, 209}, m = "onFailure")
/* loaded from: classes2.dex */
final class SelectionFormViewModel$onFailure$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SelectionFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormViewModel$onFailure$1(SelectionFormViewModel selectionFormViewModel, d<? super SelectionFormViewModel$onFailure$1> dVar) {
        super(dVar);
        this.this$0 = selectionFormViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object onFailure;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        onFailure = this.this$0.onFailure(this);
        return onFailure;
    }
}
