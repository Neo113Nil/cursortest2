package ru.ozon.app.android.travel.utils.timerFlow;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.utils.timerFlow.TimerFlow", f = "TimerFlow.kt", l = {114, 115, 120, 122}, m = "startTimer")
/* loaded from: classes2.dex */
final class TimerFlow$startTimer$1 extends c {
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimerFlow<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerFlow$startTimer$1(TimerFlow<T> timerFlow, d<? super TimerFlow$startTimer$1> dVar) {
        super(dVar);
        this.this$0 = timerFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object startTimer;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        startTimer = this.this$0.startTimer(null, 0L, 0L, null, this);
        return startTimer;
    }
}
