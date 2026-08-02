package ru.ozon.app.android.pdp.widgets.delivery.async;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliveryWidgetViewModel;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliveryWidgetViewModel$fetchWidget$1", f = "AsyncDeliveryWidgetViewModel.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AsyncDeliveryWidgetViewModel$fetchWidget$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AsyncDeliveryWidgetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncDeliveryWidgetViewModel$fetchWidget$1(AsyncDeliveryWidgetViewModel asyncDeliveryWidgetViewModel, String str, d<? super AsyncDeliveryWidgetViewModel$fetchWidget$1> dVar) {
        super(2, dVar);
        this.this$0 = asyncDeliveryWidgetViewModel;
        this.$asyncData = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AsyncDeliveryWidgetViewModel$fetchWidget$1 asyncDeliveryWidgetViewModel$fetchWidget$1 = new AsyncDeliveryWidgetViewModel$fetchWidget$1(this.this$0, this.$asyncData, dVar);
        asyncDeliveryWidgetViewModel$fetchWidget$1.L$0 = obj;
        return asyncDeliveryWidgetViewModel$fetchWidget$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AsyncDeliveryWidgetViewModel$fetchWidget$1 asyncDeliveryWidgetViewModel$fetchWidget$1;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Throwable th2;
        Object a11;
        SingleLiveEvent singleLiveEvent;
        Throwable b11;
        Throwable b12;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AsyncDeliveryWidgetViewModel asyncDeliveryWidgetViewModel = this.this$0;
            String str = this.$asyncData;
            try {
                r.Companion companion = r.INSTANCE;
                composerAsyncWidgetRepository = asyncDeliveryWidgetViewModel.repository;
                this.label = 1;
                asyncDeliveryWidgetViewModel$fetchWidget$1 = this;
            } catch (Throwable th3) {
                th = th3;
                asyncDeliveryWidgetViewModel$fetchWidget$1 = this;
                th2 = th;
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
                singleLiveEvent = asyncDeliveryWidgetViewModel$fetchWidget$1.this$0._events;
                if (!(a11 instanceof r.b)) {
                }
                b11 = r.b(a11);
                if (b11 != null) {
                }
                b12 = r.b(a11);
                if (b12 != null) {
                }
                singleLiveEvent.postValue(a11);
                return Unit.f71690a;
            }
            try {
                obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, DeliveryDTO.class, null, asyncDeliveryWidgetViewModel$fetchWidget$1, 4, null);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                singleLiveEvent = asyncDeliveryWidgetViewModel$fetchWidget$1.this$0._events;
                if (!(a11 instanceof r.b)) {
                }
                b11 = r.b(a11);
                if (b11 != null) {
                }
                b12 = r.b(a11);
                if (b12 != null) {
                }
                singleLiveEvent.postValue(a11);
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                s.b(obj);
                asyncDeliveryWidgetViewModel$fetchWidget$1 = this;
            } catch (Throwable th5) {
                th2 = th5;
                asyncDeliveryWidgetViewModel$fetchWidget$1 = this;
                r.Companion companion222 = r.INSTANCE;
                a11 = s.a(th2);
                singleLiveEvent = asyncDeliveryWidgetViewModel$fetchWidget$1.this$0._events;
                if (!(a11 instanceof r.b)) {
                }
                b11 = r.b(a11);
                if (b11 != null) {
                }
                b12 = r.b(a11);
                if (b12 != null) {
                }
                singleLiveEvent.postValue(a11);
                return Unit.f71690a;
            }
        }
        a11 = (ComposerAsyncWidgetResponse) obj;
        r.Companion companion3 = r.INSTANCE;
        singleLiveEvent = asyncDeliveryWidgetViewModel$fetchWidget$1.this$0._events;
        if (!(a11 instanceof r.b)) {
            a11 = new AsyncDeliveryWidgetViewModel.Event.OnWidgetFetched((ComposerAsyncWidgetResponse) a11);
        }
        b11 = r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11, "Failed to load async delivery widget", new Object[0]);
        }
        b12 = r.b(a11);
        if (b12 != null) {
            a11 = new AsyncDeliveryWidgetViewModel.Event.OnWidgetFetchingFailed(b12);
        }
        singleLiveEvent.postValue(a11);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AsyncDeliveryWidgetViewModel$fetchWidget$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
