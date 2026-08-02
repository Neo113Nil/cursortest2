package ru.ozon.app.android.travel.usecase;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.usecase.RequestTravelCommonActionV2UseCase", f = "RequestTravelCommonActionV2UseCase.kt", l = {56}, m = "invoke-BWLJW6A")
/* loaded from: classes2.dex */
final class RequestTravelCommonActionV2UseCase$invoke$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RequestTravelCommonActionV2UseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestTravelCommonActionV2UseCase$invoke$1(RequestTravelCommonActionV2UseCase requestTravelCommonActionV2UseCase, d<? super RequestTravelCommonActionV2UseCase$invoke$1> dVar) {
        super(dVar);
        this.this$0 = requestTravelCommonActionV2UseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.invoke(null, null, null, this);
    }
}
