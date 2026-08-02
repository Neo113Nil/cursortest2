package ru.ozon.app.android.pdp.actionHandlers.addToCartWithRedirect;

import He.b;
import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.actionHandlers.addToCartWithRedirect.AddToCartWithRedirectActionHandler$processAction$1", f = "AddToCartWithRedirectActionHandler.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AddToCartWithRedirectActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ int $quantity;
    final /* synthetic */ Long $selectedDeliverySchema;
    final /* synthetic */ String $sku;
    final /* synthetic */ Boolean $wholeQuant;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddToCartWithRedirectActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartWithRedirectActionHandler$processAction$1(AddToCartWithRedirectActionHandler addToCartWithRedirectActionHandler, String str, int i11, Long l11, CustomActionHandler.HandlerReferences handlerReferences, Boolean bool, AtomAction atomAction, d<? super AddToCartWithRedirectActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = addToCartWithRedirectActionHandler;
        this.$sku = str;
        this.$quantity = i11;
        this.$selectedDeliverySchema = l11;
        this.$handlerRefs = handlerReferences;
        this.$wholeQuant = bool;
        this.$action = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddToCartWithRedirectActionHandler$processAction$1 addToCartWithRedirectActionHandler$processAction$1 = new AddToCartWithRedirectActionHandler$processAction$1(this.this$0, this.$sku, this.$quantity, this.$selectedDeliverySchema, this.$handlerRefs, this.$wholeQuant, this.$action, dVar);
        addToCartWithRedirectActionHandler$processAction$1.L$0 = obj;
        return addToCartWithRedirectActionHandler$processAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                AddToCartWithRedirectActionHandler addToCartWithRedirectActionHandler = this.this$0;
                String str = this.$sku;
                int i12 = this.$quantity;
                Long l11 = this.$selectedDeliverySchema;
                CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
                Boolean bool = this.$wholeQuant;
                AtomAction atomAction = this.$action;
                r.Companion companion = r.INSTANCE;
                C10720e0 c10720e0 = C10720e0.f105451a;
                b bVar = b.f10879b;
                AddToCartWithRedirectActionHandler$processAction$1$1$1 addToCartWithRedirectActionHandler$processAction$1$1$1 = new AddToCartWithRedirectActionHandler$processAction$1$1$1(addToCartWithRedirectActionHandler, str, i12, l11, handlerReferences, bool, atomAction, null);
                this.label = 1;
                if (C10727i.f(bVar, addToCartWithRedirectActionHandler$processAction$1$1$1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        a.b bVar2 = Lm0.a.f17149a;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            bVar2.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddToCartWithRedirectActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
