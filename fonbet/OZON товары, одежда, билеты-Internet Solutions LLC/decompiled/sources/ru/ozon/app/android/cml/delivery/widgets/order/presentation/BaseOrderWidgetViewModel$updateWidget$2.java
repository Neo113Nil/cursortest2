package ru.ozon.app.android.cml.delivery.widgets.order.presentation;

import Ae.x0;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cml.delivery.data.PreorderParamsStore;
import ru.ozon.app.android.cml.delivery.widgets.order.presentation.OrderWidgetAsyncUiState;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.order.presentation.BaseOrderWidgetViewModel$updateWidget$2", f = "BaseOrderWidgetViewModel.kt", l = {82, 83, 91, 94}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BaseOrderWidgetViewModel$updateWidget$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ l20.d $widgetInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BaseOrderWidgetViewModel<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseOrderWidgetViewModel$updateWidget$2(BaseOrderWidgetViewModel<T> baseOrderWidgetViewModel, String str, l20.d dVar, d<? super BaseOrderWidgetViewModel$updateWidget$2> dVar2) {
        super(2, dVar2);
        this.this$0 = baseOrderWidgetViewModel;
        this.$asyncData = str;
        this.$widgetInfo = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        BaseOrderWidgetViewModel$updateWidget$2 baseOrderWidgetViewModel$updateWidget$2 = new BaseOrderWidgetViewModel$updateWidget$2(this.this$0, this.$asyncData, this.$widgetInfo, dVar);
        baseOrderWidgetViewModel$updateWidget$2.L$0 = obj;
        return baseOrderWidgetViewModel$updateWidget$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r10 == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        Object handleAsyncUpdate;
        Throwable b11;
        x0 x0Var;
        Throwable th2;
        String str;
        x0 x0Var2;
        BaseOrderWidgetViewModel baseOrderWidgetViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th3) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th3);
        }
        if (i11 == 0) {
            s.b(obj);
            BaseOrderWidgetViewModel baseOrderWidgetViewModel2 = this.this$0;
            str = this.$asyncData;
            r.Companion companion2 = r.INSTANCE;
            x0Var2 = baseOrderWidgetViewModel2.uiStateFlow;
            OrderWidgetAsyncUiState.Loading loading = OrderWidgetAsyncUiState.Loading.INSTANCE;
            this.L$0 = baseOrderWidgetViewModel2;
            this.L$1 = str;
            this.label = 1;
            if (x0Var2.emit(loading, this) == aVar) {
                return aVar;
            }
            baseOrderWidgetViewModel = baseOrderWidgetViewModel2;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    s.b(obj);
                    a11 = (ComposerAsyncWidgetResponse) obj;
                    r.Companion companion3 = r.INSTANCE;
                    obj2 = a11;
                    BaseOrderWidgetViewModel<T> baseOrderWidgetViewModel3 = this.this$0;
                    l20.d dVar = this.$widgetInfo;
                    if (!(obj2 instanceof r.b)) {
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.label = 3;
                        handleAsyncUpdate = baseOrderWidgetViewModel3.handleAsyncUpdate((ComposerAsyncWidgetResponse) obj2, dVar, this);
                    }
                    BaseOrderWidgetViewModel<T> baseOrderWidgetViewModel4 = this.this$0;
                    b11 = r.b(obj2);
                    if (b11 != null) {
                    }
                    PreorderParamsStore.INSTANCE.setShouldAsyncUpdate(false);
                    return Unit.f71690a;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = (Throwable) this.L$1;
                    s.b(obj);
                    if (!(th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    Lm0.a.f17149a.e(th2);
                    PreorderParamsStore.INSTANCE.setShouldAsyncUpdate(false);
                    return Unit.f71690a;
                }
                obj2 = this.L$0;
                s.b(obj);
                BaseOrderWidgetViewModel<T> baseOrderWidgetViewModel42 = this.this$0;
                b11 = r.b(obj2);
                if (b11 != null) {
                    x0Var = ((BaseOrderWidgetViewModel) baseOrderWidgetViewModel42).uiStateFlow;
                    OrderWidgetAsyncUiState.Error error = OrderWidgetAsyncUiState.Error.INSTANCE;
                    this.L$0 = obj2;
                    this.L$1 = b11;
                    this.label = 4;
                    if (x0Var.emit(error, this) != aVar) {
                        th2 = b11;
                        if (!(th2 instanceof CancellationException)) {
                        }
                    }
                    return aVar;
                }
                PreorderParamsStore.INSTANCE.setShouldAsyncUpdate(false);
                return Unit.f71690a;
            }
            str = (String) this.L$1;
            baseOrderWidgetViewModel = (BaseOrderWidgetViewModel) this.L$0;
            s.b(obj);
        }
        Map<String, ? extends Object> i12 = U.i(new Pair("extraBody", PreorderParamsStore.INSTANCE.getPreorderParams()));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = baseOrderWidgetViewModel.fetchAsyncState(str, i12, this);
        if (obj == aVar) {
            return aVar;
        }
        a11 = (ComposerAsyncWidgetResponse) obj;
        r.Companion companion32 = r.INSTANCE;
        obj2 = a11;
        BaseOrderWidgetViewModel<T> baseOrderWidgetViewModel32 = this.this$0;
        l20.d dVar2 = this.$widgetInfo;
        if (!(obj2 instanceof r.b)) {
        }
        BaseOrderWidgetViewModel<T> baseOrderWidgetViewModel422 = this.this$0;
        b11 = r.b(obj2);
        if (b11 != null) {
        }
        PreorderParamsStore.INSTANCE.setShouldAsyncUpdate(false);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BaseOrderWidgetViewModel$updateWidget$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
