package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation;

import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.data.CourierTipsDTO;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsViewModel$processAsyncEvent$1", f = "CourierTipsViewModel.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CourierTipsViewModel$processAsyncEvent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ Map<String, Object> $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CourierTipsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierTipsViewModel$processAsyncEvent$1(CourierTipsViewModel courierTipsViewModel, String str, Map<String, ? extends Object> map, d<? super CourierTipsViewModel$processAsyncEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = courierTipsViewModel;
        this.$asyncData = str;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CourierTipsViewModel$processAsyncEvent$1 courierTipsViewModel$processAsyncEvent$1 = new CourierTipsViewModel$processAsyncEvent$1(this.this$0, this.$asyncData, this.$params, dVar);
        courierTipsViewModel$processAsyncEvent$1.L$0 = obj;
        return courierTipsViewModel$processAsyncEvent$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CourierTipsViewModel$processAsyncEvent$1 courierTipsViewModel$processAsyncEvent$1;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Throwable th2;
        Object a11;
        Throwable b11;
        SingleLiveEvent singleLiveEvent;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            CourierTipsViewModel courierTipsViewModel = this.this$0;
            String str = this.$asyncData;
            Map<String, Object> map = this.$params;
            try {
                r.Companion companion = r.INSTANCE;
                composerAsyncWidgetRepository = courierTipsViewModel.repository;
                this.label = 1;
                courierTipsViewModel$processAsyncEvent$1 = this;
                try {
                    obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, map, CourierTipsDTO.class, null, courierTipsViewModel$processAsyncEvent$1, 8, null);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                    CourierTipsViewModel courierTipsViewModel2 = courierTipsViewModel$processAsyncEvent$1.this$0;
                    if (!(a11 instanceof r.b)) {
                    }
                    a.b bVar = Lm0.a.f17149a;
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
            } catch (Throwable th4) {
                th = th4;
                courierTipsViewModel$processAsyncEvent$1 = this;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                CourierTipsViewModel courierTipsViewModel22 = courierTipsViewModel$processAsyncEvent$1.this$0;
                if (!(a11 instanceof r.b)) {
                }
                a.b bVar2 = Lm0.a.f17149a;
                b11 = r.b(a11);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                s.b(obj);
                courierTipsViewModel$processAsyncEvent$1 = this;
            } catch (Throwable th5) {
                th2 = th5;
                courierTipsViewModel$processAsyncEvent$1 = this;
                r.Companion companion222 = r.INSTANCE;
                a11 = s.a(th2);
                CourierTipsViewModel courierTipsViewModel222 = courierTipsViewModel$processAsyncEvent$1.this$0;
                if (!(a11 instanceof r.b)) {
                }
                a.b bVar22 = Lm0.a.f17149a;
                b11 = r.b(a11);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
        }
        a11 = (ComposerAsyncWidgetResponse) obj;
        r.Companion companion3 = r.INSTANCE;
        CourierTipsViewModel courierTipsViewModel2222 = courierTipsViewModel$processAsyncEvent$1.this$0;
        if (!(a11 instanceof r.b)) {
            singleLiveEvent = courierTipsViewModel2222._widgetUpdate;
            singleLiveEvent.setValue((ComposerAsyncWidgetResponse) a11);
        }
        a.b bVar222 = Lm0.a.f17149a;
        b11 = r.b(a11);
        if (b11 != null) {
            bVar222.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CourierTipsViewModel$processAsyncEvent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
