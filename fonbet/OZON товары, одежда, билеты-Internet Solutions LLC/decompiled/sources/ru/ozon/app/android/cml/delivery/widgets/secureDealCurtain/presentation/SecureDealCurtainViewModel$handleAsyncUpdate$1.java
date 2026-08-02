package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.SecureDealCurtainViewModel", f = "SecureDealCurtainViewModel.kt", l = {126}, m = "handleAsyncUpdate")
/* loaded from: classes11.dex */
final class SecureDealCurtainViewModel$handleAsyncUpdate$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SecureDealCurtainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecureDealCurtainViewModel$handleAsyncUpdate$1(SecureDealCurtainViewModel secureDealCurtainViewModel, d<? super SecureDealCurtainViewModel$handleAsyncUpdate$1> dVar) {
        super(dVar);
        this.this$0 = secureDealCurtainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object handleAsyncUpdate;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        handleAsyncUpdate = this.this$0.handleAsyncUpdate(null, this);
        return handleAsyncUpdate;
    }
}
