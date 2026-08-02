package ru.ozon.app.android.cart.configurator.base;

import Sc.s;
import Wc.a;
import android.content.Intent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.configurator.base.BaseCartConfigurator$handleRemoveCartSplit$1", f = "BaseCartConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BaseCartConfigurator$handleRemoveCartSplit$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Intent $data;
    int label;
    final /* synthetic */ BaseCartConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCartConfigurator$handleRemoveCartSplit$1(Intent intent, BaseCartConfigurator baseCartConfigurator, d<? super BaseCartConfigurator$handleRemoveCartSplit$1> dVar) {
        super(2, dVar);
        this.$data = intent;
        this.this$0 = baseCartConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BaseCartConfigurator$handleRemoveCartSplit$1(this.$data, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String stringExtra;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Intent intent = this.$data;
        if (intent != null && (stringExtra = intent.getStringExtra("EXTRA_REMOVE_DEEPLINK")) != null) {
            Intent intent2 = this.$data;
            BaseCartConfigurator baseCartConfigurator = this.this$0;
            int intExtra = intent2.getIntExtra("EXTRA_WIDGET_SCROLL_ID", -1);
            String stringExtra2 = intent2.getStringExtra("EXTRA_WIDGET_SCROLL_OFFSET");
            Integer w02 = stringExtra2 != null ? h.w0(stringExtra2) : null;
            String stringExtra3 = intent2.getStringExtra("EXTRA_BODY_PARAMS");
            Map map = stringExtra3 != null ? (Map) baseCartConfigurator.getJsonDeserializer().fromJson(stringExtra3, Map.class) : null;
            if (intent2.getBooleanExtra("EXTRA_REMOVE_BY_SWIPE_PARAMS", false)) {
                baseCartConfigurator.trackRemoveCartSplitBySwipe(intent2);
            } else {
                baseCartConfigurator.trackRemoveCartSplit(intent2);
            }
            CartEventsController cartEventController = baseCartConfigurator.getCartEventController();
            Integer num = new Integer(intExtra);
            cartEventController.handleEvent(new CartRefreshReason.RemoveCartSplit(stringExtra, w02, num.intValue() != -1 ? num : null, map));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BaseCartConfigurator$handleRemoveCartSplit$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
