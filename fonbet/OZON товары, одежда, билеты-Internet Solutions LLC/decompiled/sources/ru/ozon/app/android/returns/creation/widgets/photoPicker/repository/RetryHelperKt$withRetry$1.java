package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.RetryHelperKt", f = "RetryHelper.kt", l = {18, 24}, m = "withRetry")
/* loaded from: classes13.dex */
final class RetryHelperKt$withRetry$1<T> extends c {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    RetryHelperKt$withRetry$1(d<? super RetryHelperKt$withRetry$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return RetryHelperKt.withRetry(0, null, null, this);
    }
}
