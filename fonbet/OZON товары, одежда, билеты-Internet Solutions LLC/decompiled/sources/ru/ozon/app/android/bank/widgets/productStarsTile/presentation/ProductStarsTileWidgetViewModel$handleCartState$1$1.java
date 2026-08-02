package ru.ozon.app.android.bank.widgets.productStarsTile.presentation;

import Ae.C;
import Ae.InterfaceC2397i;
import Ae.x0;
import Ge.n;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.bank.widgets.productStarsTile.data.ProductStarsTileRequestDTO;
import ru.ozon.app.android.bank.widgets.productStarsTile.data.ProductStarsTileResponseDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetViewModel$handleCartState$1$1", f = "ProductStarsTileWidgetViewModel.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ProductStarsTileWidgetViewModel$handleCartState$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $productId;
    int label;
    final /* synthetic */ ProductStarsTileWidgetViewModel this$0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LAe/i;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/bank/widgets/productStarsTile/data/ProductStarsTileResponseDTO;", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetViewModel$handleCartState$1$1$1", f = "ProductStarsTileWidgetViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetViewModel$handleCartState$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements InterfaceC6511n<InterfaceC2397i<? super ActionV2Response<ProductStarsTileResponseDTO>>, Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super ActionV2Response<ProductStarsTileResponseDTO>> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = th2;
            return anonymousClass1.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Lm0.a.f17149a.e((Throwable) this.L$0);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductStarsTileWidgetViewModel$handleCartState$1$1(ProductStarsTileWidgetViewModel productStarsTileWidgetViewModel, long j11, d<? super ProductStarsTileWidgetViewModel$handleCartState$1$1> dVar) {
        super(2, dVar);
        this.this$0 = productStarsTileWidgetViewModel;
        this.$productId = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProductStarsTileWidgetViewModel$handleCartState$1$1(this.this$0, this.$productId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            p k11 = actionV2Repository.callAction(new ActionV2Request(new ProductStarsTileRequestDTO(this.$productId), "payfacadeProductStarsTile", false, 4, null), ProductStarsTileResponseDTO.class).k();
            Intrinsics.checkNotNullExpressionValue(k11, "toObservable(...)");
            C c11 = new C(n.a(k11), new AnonymousClass1(null));
            final ProductStarsTileWidgetViewModel productStarsTileWidgetViewModel = this.this$0;
            InterfaceC2397i<? super Object> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetViewModel$handleCartState$1$1.2
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((ActionV2Response<ProductStarsTileResponseDTO>) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(ActionV2Response<ProductStarsTileResponseDTO> actionV2Response, d<? super Unit> dVar) {
                    x0<String> countItem = ProductStarsTileWidgetViewModel.this.getCountItem();
                    ProductStarsTileResponseDTO data = actionV2Response.getData();
                    String balance = data != null ? data.getBalance() : null;
                    if (balance == null) {
                        balance = "";
                    }
                    countItem.setValue(balance);
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (c11.collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ProductStarsTileWidgetViewModel$handleCartState$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
