package ru.ozon.app.android.checkoutgeo.address.addressUiInfoService;

import Ae.x0;
import Sc.s;
import Wc.a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModelImpl$getActionAddressBookBarGeo$1", f = "AddressUiInfoViewModelImpl.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AddressUiInfoViewModelImpl$getActionAddressBookBarGeo$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $link;
    Object L$0;
    int label;
    final /* synthetic */ AddressUiInfoViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressUiInfoViewModelImpl$getActionAddressBookBarGeo$1(String str, AddressUiInfoViewModelImpl addressUiInfoViewModelImpl, d<? super AddressUiInfoViewModelImpl$getActionAddressBookBarGeo$1> dVar) {
        super(2, dVar);
        this.$link = str;
        this.this$0 = addressUiInfoViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddressUiInfoViewModelImpl$getActionAddressBookBarGeo$1(this.$link, this.this$0, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, java.lang.CharSequence, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionAddressBookBarGeoApi actionAddressBookBarGeoApi;
        x0 x0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
                m11.f71787a = "";
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i12 = 0;
                for (Object obj2 : h.m(this.$link, new String[]{"?", "&"}, 0, 6)) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    ?? r72 = (String) obj2;
                    if (i12 == 0) {
                        m11.f71787a = r72;
                    } else {
                        List m12 = h.m(r72, new String[]{"="}, 0, 6);
                        linkedHashMap.put(C7714v.K(m12), C7714v.X(m12));
                    }
                    i12 = i13;
                }
                x0 x0Var2 = this.this$0._actionAddressBookBarGeo;
                actionAddressBookBarGeoApi = this.this$0.actionAddressBookBarGeoApi;
                String str = (String) m11.f71787a;
                this.L$0 = x0Var2;
                this.label = 1;
                obj = actionAddressBookBarGeoApi.getActionAddressBookBarGeoResponse(str, linkedHashMap, this);
                if (obj == aVar) {
                    return aVar;
                }
                x0Var = x0Var2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x0Var = (x0) this.L$0;
                s.b(obj);
            }
            x0Var.setValue(((ActionV2Response) obj).getData());
        } catch (Exception unused) {
            this.this$0._shouldShow.postValue(Boolean.FALSE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddressUiInfoViewModelImpl$getActionAddressBookBarGeo$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
