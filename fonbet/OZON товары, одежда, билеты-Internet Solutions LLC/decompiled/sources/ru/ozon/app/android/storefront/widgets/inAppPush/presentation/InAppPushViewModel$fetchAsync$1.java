package ru.ozon.app.android.storefront.widgets.inAppPush.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.storefront.widgets.inAppPush.presentation.InAppPushViewModel", f = "InAppPushViewModel.kt", l = {67, 70, 75, 78}, m = "fetchAsync")
/* loaded from: classes2.dex */
final class InAppPushViewModel$fetchAsync$1 extends c {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppPushViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppPushViewModel$fetchAsync$1(InAppPushViewModel inAppPushViewModel, d<? super InAppPushViewModel$fetchAsync$1> dVar) {
        super(dVar);
        this.this$0 = inAppPushViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchAsync;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        fetchAsync = this.this$0.fetchAsync(0, this);
        return fetchAsync;
    }
}
