package ru.ozon.app.android.payment.ui.createorder;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.payment.ui.createorder.CreateAndPayRepository", f = "CreateAndPayRepository.kt", l = {69}, m = "processGooglePay")
/* loaded from: classes13.dex */
final class CreateAndPayRepository$processGooglePay$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreateAndPayRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateAndPayRepository$processGooglePay$1(CreateAndPayRepository createAndPayRepository, d<? super CreateAndPayRepository$processGooglePay$1> dVar) {
        super(dVar);
        this.this$0 = createAndPayRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.processGooglePay(null, null, null, null, this);
    }
}
