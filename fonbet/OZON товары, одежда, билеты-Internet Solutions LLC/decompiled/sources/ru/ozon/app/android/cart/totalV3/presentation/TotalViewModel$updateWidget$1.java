package ru.ozon.app.android.cart.totalV3.presentation;

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
import ru.ozon.app.android.cart.totalV3.data.TotalDTO;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.totalV3.presentation.TotalViewModel$updateWidget$1", f = "TotalViewModel.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class TotalViewModel$updateWidget$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TotalViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalViewModel$updateWidget$1(TotalViewModel totalViewModel, String str, d<? super TotalViewModel$updateWidget$1> dVar) {
        super(2, dVar);
        this.this$0 = totalViewModel;
        this.$asyncData = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TotalViewModel$updateWidget$1 totalViewModel$updateWidget$1 = new TotalViewModel$updateWidget$1(this.this$0, this.$asyncData, dVar);
        totalViewModel$updateWidget$1.L$0 = obj;
        return totalViewModel$updateWidget$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TotalViewModel$updateWidget$1 totalViewModel$updateWidget$1;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Throwable th2;
        Object a11;
        Throwable b11;
        SingleLiveEvent singleLiveEvent;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            TotalViewModel totalViewModel = this.this$0;
            String str = this.$asyncData;
            try {
                r.Companion companion = r.INSTANCE;
                composerAsyncWidgetRepository = totalViewModel.repository;
                this.label = 1;
                totalViewModel$updateWidget$1 = this;
            } catch (Throwable th3) {
                th = th3;
                totalViewModel$updateWidget$1 = this;
                th2 = th;
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
                TotalViewModel totalViewModel2 = totalViewModel$updateWidget$1.this$0;
                if (!(a11 instanceof r.b)) {
                }
                a.b bVar = Lm0.a.f17149a;
                b11 = r.b(a11);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
            try {
                obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, TotalDTO.class, null, totalViewModel$updateWidget$1, 4, null);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                TotalViewModel totalViewModel22 = totalViewModel$updateWidget$1.this$0;
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
                totalViewModel$updateWidget$1 = this;
            } catch (Throwable th5) {
                th2 = th5;
                totalViewModel$updateWidget$1 = this;
                r.Companion companion222 = r.INSTANCE;
                a11 = s.a(th2);
                TotalViewModel totalViewModel222 = totalViewModel$updateWidget$1.this$0;
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
        TotalViewModel totalViewModel2222 = totalViewModel$updateWidget$1.this$0;
        if (!(a11 instanceof r.b)) {
            ComposerAsyncWidgetResponse composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) a11;
            singleLiveEvent = totalViewModel2222._widgetUpdate;
            singleLiveEvent.postValue(new TotalV3UpdateResponse((TotalDTO) composerAsyncWidgetResponse.getState(), composerAsyncWidgetResponse.getTrackingPayloads()));
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
        return ((TotalViewModel$updateWidget$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
