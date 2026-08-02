package ru.ozon.app.android.payment.ui.createservice;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.payment.ui.createservice.CreateServiceRepository", f = "CreateServiceRepository.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "createService")
/* loaded from: classes13.dex */
final class CreateServiceRepository$createService$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreateServiceRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateServiceRepository$createService$1(CreateServiceRepository createServiceRepository, d<? super CreateServiceRepository$createService$1> dVar) {
        super(dVar);
        this.this$0 = createServiceRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.createService(null, null, null, this);
    }
}
