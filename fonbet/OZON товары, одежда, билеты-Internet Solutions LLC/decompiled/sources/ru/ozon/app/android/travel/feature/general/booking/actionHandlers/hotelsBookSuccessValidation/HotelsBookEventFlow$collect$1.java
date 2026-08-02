package ru.ozon.app.android.travel.feature.general.booking.actionHandlers.hotelsBookSuccessValidation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.booking.actionHandlers.hotelsBookSuccessValidation.HotelsBookEventFlow", f = "HotelsBookEventFlow.kt", l = {-1}, m = "collect-impl")
/* loaded from: classes3.dex */
final class HotelsBookEventFlow$collect$1 extends c {
    int label;
    /* synthetic */ Object result;

    HotelsBookEventFlow$collect$1(d<? super HotelsBookEventFlow$collect$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return HotelsBookEventFlow.m1089collectimpl(null, null, this);
    }
}
