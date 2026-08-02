package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel", f = "RegistrationViewModel.kt", l = {116, 119, 120, 123, 124, 126}, m = "handleOperationResult")
/* loaded from: classes12.dex */
final class RegistrationViewModel$handleOperationResult$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegistrationViewModel$handleOperationResult$1(RegistrationViewModel registrationViewModel, d<? super RegistrationViewModel$handleOperationResult$1> dVar) {
        super(dVar);
        this.this$0 = registrationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object handleOperationResult;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        handleOperationResult = this.this$0.handleOperationResult(null, this);
        return handleOperationResult;
    }
}
