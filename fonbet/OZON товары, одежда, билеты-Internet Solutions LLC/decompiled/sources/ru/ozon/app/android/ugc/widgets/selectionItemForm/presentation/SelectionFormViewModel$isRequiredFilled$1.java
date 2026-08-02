package ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel", f = "SelectionFormViewModel.kt", l = {162}, m = "isRequiredFilled")
/* loaded from: classes2.dex */
final class SelectionFormViewModel$isRequiredFilled$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SelectionFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormViewModel$isRequiredFilled$1(SelectionFormViewModel selectionFormViewModel, d<? super SelectionFormViewModel$isRequiredFilled$1> dVar) {
        super(dVar);
        this.this$0 = selectionFormViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object isRequiredFilled;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        isRequiredFilled = this.this$0.isRequiredFilled(this);
        return isRequiredFilled;
    }
}
