package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepositoryImpl", f = "ReturnCreationPhotoPickerRepositoryImpl.kt", l = {87, 90}, m = "mutateToError")
/* loaded from: classes13.dex */
final class ReturnCreationPhotoPickerRepositoryImpl$mutateToError$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReturnCreationPhotoPickerRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnCreationPhotoPickerRepositoryImpl$mutateToError$1(ReturnCreationPhotoPickerRepositoryImpl returnCreationPhotoPickerRepositoryImpl, d<? super ReturnCreationPhotoPickerRepositoryImpl$mutateToError$1> dVar) {
        super(dVar);
        this.this$0 = returnCreationPhotoPickerRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object mutateToError;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        mutateToError = this.this$0.mutateToError(null, this);
        return mutateToError;
    }
}
