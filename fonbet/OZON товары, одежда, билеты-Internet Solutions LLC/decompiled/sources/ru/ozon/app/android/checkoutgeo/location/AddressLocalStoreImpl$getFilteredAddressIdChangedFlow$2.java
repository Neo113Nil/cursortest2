package ru.ozon.app.android.checkoutgeo.location;

import Sc.s;
import Wc.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.checkoutgeo.location.AddressLocalStoreImpl$getFilteredAddressIdChangedFlow$2", f = "AddressLocalStoreImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AddressLocalStoreImpl$getFilteredAddressIdChangedFlow$2 extends j implements Function2<String, d<? super Unit>, Object> {
    final /* synthetic */ String $consumerId;
    int label;
    final /* synthetic */ AddressLocalStoreImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressLocalStoreImpl$getFilteredAddressIdChangedFlow$2(AddressLocalStoreImpl addressLocalStoreImpl, String str, d<? super AddressLocalStoreImpl$getFilteredAddressIdChangedFlow$2> dVar) {
        super(2, dVar);
        this.this$0 = addressLocalStoreImpl;
        this.$consumerId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddressLocalStoreImpl$getFilteredAddressIdChangedFlow$2(this.this$0, this.$consumerId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Set set;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        set = this.this$0.activeConsumerIds;
        set.add(this.$consumerId);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, d<? super Unit> dVar) {
        return ((AddressLocalStoreImpl$getFilteredAddressIdChangedFlow$2) create(str, dVar)).invokeSuspend(Unit.f71690a);
    }
}
