package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel", f = "RegistrationViewModel.kt", l = {108, 112}, m = "executeRepositoryOperation")
/* loaded from: classes12.dex */
final class RegistrationViewModel$executeRepositoryOperation$1<T> extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegistrationViewModel$executeRepositoryOperation$1(RegistrationViewModel registrationViewModel, d<? super RegistrationViewModel$executeRepositoryOperation$1> dVar) {
        super(dVar);
        this.this$0 = registrationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object executeRepositoryOperation;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        executeRepositoryOperation = this.this$0.executeRepositoryOperation(null, null, this);
        return executeRepositoryOperation;
    }
}
