package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation;

import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.AddToCartParams;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalViewModel$addToCart$1", f = "StickyTotalViewModel.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StickyTotalViewModel$addToCart$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ AtomAction $additionalAction;
    final /* synthetic */ long $delay;
    final /* synthetic */ Function0<Unit> $onFailure;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ Map<String, TokenizedTrackingInfo> $trackingInfo;
    final /* synthetic */ long $widgetId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StickyTotalViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StickyTotalViewModel$addToCart$1(Map<String, String> map, StickyTotalViewModel stickyTotalViewModel, long j11, Map<String, TokenizedTrackingInfo> map2, Function1<? super AtomAction, Unit> function1, Function0<Unit> function0, AtomAction atomAction, long j12, d<? super StickyTotalViewModel$addToCart$1> dVar) {
        super(2, dVar);
        this.$params = map;
        this.this$0 = stickyTotalViewModel;
        this.$widgetId = j11;
        this.$trackingInfo = map2;
        this.$actionHandler = function1;
        this.$onFailure = function0;
        this.$additionalAction = atomAction;
        this.$delay = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        StickyTotalViewModel$addToCart$1 stickyTotalViewModel$addToCart$1 = new StickyTotalViewModel$addToCart$1(this.$params, this.this$0, this.$widgetId, this.$trackingInfo, this.$actionHandler, this.$onFailure, this.$additionalAction, this.$delay, dVar);
        stickyTotalViewModel$addToCart$1.L$0 = obj;
        return stickyTotalViewModel$addToCart$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        JsonParser jsonParser;
        Object addToCartInternal;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            String str = this.$params.get("postData");
            if (str == null) {
                return Unit.f71690a;
            }
            jsonParser = this.this$0.jsonDeserializer;
            List<AddToCartParams.CartItem> items = ((AddToCartParams) jsonParser.fromJson(str, AddToCartParams.class)).getItems();
            StickyTotalViewModel stickyTotalViewModel = this.this$0;
            long j11 = this.$widgetId;
            Map<String, TokenizedTrackingInfo> map = this.$trackingInfo;
            Function1<AtomAction, Unit> function1 = this.$actionHandler;
            Function0<Unit> function0 = this.$onFailure;
            AtomAction atomAction = this.$additionalAction;
            long j12 = this.$delay;
            this.label = 1;
            addToCartInternal = stickyTotalViewModel.addToCartInternal(m11, j11, items, map, function1, function0, atomAction, j12, (r30 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? StickyTotalViewModel$addToCartInternal$2.INSTANCE : null, (r30 & 256) != 0, this);
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
        return ((StickyTotalViewModel$addToCart$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
