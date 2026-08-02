package ru.ozon.app.android.timerMolecule.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.timerMolecule.presentation.TimerViewModelImpl", f = "TimerViewModel.kt", l = {90}, m = "updateTimeRemain")
/* loaded from: classes2.dex */
final class TimerViewModelImpl$updateTimeRemain$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimerViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerViewModelImpl$updateTimeRemain$1(TimerViewModelImpl timerViewModelImpl, d<? super TimerViewModelImpl$updateTimeRemain$1> dVar) {
        super(dVar);
        this.this$0 = timerViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object updateTimeRemain;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        updateTimeRemain = this.this$0.updateTimeRemain(null, this);
        return updateTimeRemain;
    }
}
