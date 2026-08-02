package ru.ozon.app.android.account.orders.recipientWidget.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.account.orders.recipientWidget.data.ChangeRecipientRepositoryImpl", f = "ChangeRecipientRepository.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "changeRecipientForRegularDelivery")
/* loaded from: classes11.dex */
final class ChangeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChangeRecipientRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1(ChangeRecipientRepositoryImpl changeRecipientRepositoryImpl, d<? super ChangeRecipientRepositoryImpl$changeRecipientForRegularDelivery$1> dVar) {
        super(dVar);
        this.this$0 = changeRecipientRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object changeRecipientForRegularDelivery;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        changeRecipientForRegularDelivery = this.this$0.changeRecipientForRegularDelivery(null, this);
        return changeRecipientForRegularDelivery;
    }
}
