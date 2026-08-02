package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation;

import Sc.s;
import Wc.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.AddToCartParams;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalViewModel$addToCart$2", f = "StickyTotalViewModel.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StickyTotalViewModel$addToCart$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ AtomAction $additionalAction;
    final /* synthetic */ boolean $asyncEnabled;
    final /* synthetic */ long $delay;
    final /* synthetic */ Function0<Unit> $onFailure;
    final /* synthetic */ Function1<Integer, Unit> $onSyncSuccess;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ int $quantity;
    final /* synthetic */ Map<String, TokenizedTrackingInfo> $trackingInfo;
    final /* synthetic */ long $widgetId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StickyTotalViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StickyTotalViewModel$addToCart$2(StickyTotalViewModel stickyTotalViewModel, Map<String, String> map, int i11, long j11, Map<String, TokenizedTrackingInfo> map2, Function1<? super AtomAction, Unit> function1, Function0<Unit> function0, AtomAction atomAction, long j12, Function1<? super Integer, Unit> function12, boolean z11, d<? super StickyTotalViewModel$addToCart$2> dVar) {
        super(2, dVar);
        this.this$0 = stickyTotalViewModel;
        this.$params = map;
        this.$quantity = i11;
        this.$widgetId = j11;
        this.$trackingInfo = map2;
        this.$actionHandler = function1;
        this.$onFailure = function0;
        this.$additionalAction = atomAction;
        this.$delay = j12;
        this.$onSyncSuccess = function12;
        this.$asyncEnabled = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        StickyTotalViewModel$addToCart$2 stickyTotalViewModel$addToCart$2 = new StickyTotalViewModel$addToCart$2(this.this$0, this.$params, this.$quantity, this.$widgetId, this.$trackingInfo, this.$actionHandler, this.$onFailure, this.$additionalAction, this.$delay, this.$onSyncSuccess, this.$asyncEnabled, dVar);
        stickyTotalViewModel$addToCart$2.L$0 = obj;
        return stickyTotalViewModel$addToCart$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AddToCartParams.CartItem copy$default;
        Object addToCartInternal;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            AddToCartParams.CartItem firstProductFromParams = this.this$0.getFirstProductFromParams(this.$params);
            if (firstProductFromParams == null || (copy$default = AddToCartParams.CartItem.copy$default(firstProductFromParams, null, this.$quantity, null, 5, null)) == null) {
                return Unit.f71690a;
            }
            StickyTotalViewModel stickyTotalViewModel = this.this$0;
            long j11 = this.$widgetId;
            List a02 = C7714v.a0(copy$default);
            Map<String, TokenizedTrackingInfo> map = this.$trackingInfo;
            Function1<AtomAction, Unit> function1 = this.$actionHandler;
            Function0<Unit> function0 = this.$onFailure;
            AtomAction atomAction = this.$additionalAction;
            long j12 = this.$delay;
            Function1<Integer, Unit> function12 = this.$onSyncSuccess;
            boolean z11 = this.$asyncEnabled;
            this.label = 1;
            addToCartInternal = stickyTotalViewModel.addToCartInternal(m11, j11, a02, map, function1, function0, atomAction, j12, function12, z11, this);
            if (addToCartInternal == aVar) {
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
        return ((StickyTotalViewModel$addToCart$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
