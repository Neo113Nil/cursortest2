package ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;
import ru.ozon.app.android.checkoutgeo.address.AddressUpdateManager;
import ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.data.CharityAddressSelectorApi;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.presentation.CharityAddressSelectorViewModel$changeAddress$1", f = "CharityAddressSelectorViewModel.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CharityAddressSelectorViewModel$changeAddress$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $link;
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ CharityAddressSelectorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CharityAddressSelectorViewModel$changeAddress$1(CharityAddressSelectorViewModel charityAddressSelectorViewModel, String str, Map<String, String> map, d<? super CharityAddressSelectorViewModel$changeAddress$1> dVar) {
        super(2, dVar);
        this.this$0 = charityAddressSelectorViewModel;
        this.$link = str;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CharityAddressSelectorViewModel$changeAddress$1(this.this$0, this.$link, this.$params, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CharityAddressSelectorApi charityAddressSelectorApi;
        Object a11;
        AddressUpdateManager addressUpdateManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                charityAddressSelectorApi = this.this$0.api;
                String str = this.$link;
                Map<String, String> map = this.$params;
                this.label = 1;
                obj = charityAddressSelectorApi.changeAddress(str, map, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            if (((Response) obj).code() == 200) {
                addressUpdateManager = this.this$0.addressUpdateManager;
                addressUpdateManager.addressChanged();
                r.Companion companion = r.INSTANCE;
                a11 = Unit.f71690a;
            } else {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(new Throwable());
            }
            this.this$0.getEvents().setValue(r.a(a11));
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
            V<r<Unit>> events = this.this$0.getEvents();
            r.Companion companion3 = r.INSTANCE;
            events.setValue(r.a(s.a(e11)));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CharityAddressSelectorViewModel$changeAddress$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
