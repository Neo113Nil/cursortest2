package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.SecureDealCurtainViewModel", f = "SecureDealCurtainViewModel.kt", l = {87, 88, 95, 101}, m = "requestAsyncUpdate")
/* loaded from: classes11.dex */
final class SecureDealCurtainViewModel$requestAsyncUpdate$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SecureDealCurtainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecureDealCurtainViewModel$requestAsyncUpdate$1(SecureDealCurtainViewModel secureDealCurtainViewModel, d<? super SecureDealCurtainViewModel$requestAsyncUpdate$1> dVar) {
        super(dVar);
        this.this$0 = secureDealCurtainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object requestAsyncUpdate;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        requestAsyncUpdate = this.this$0.requestAsyncUpdate(null, this);
        return requestAsyncUpdate;
    }
}
