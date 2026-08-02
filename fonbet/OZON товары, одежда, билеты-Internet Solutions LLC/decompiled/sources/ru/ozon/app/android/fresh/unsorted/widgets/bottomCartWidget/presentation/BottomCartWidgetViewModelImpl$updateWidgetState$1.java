package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation;

import Sc.r;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.data.BottomCartWidgetDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.WidgetState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.BottomCartWidgetViewModelImpl$updateWidgetState$1", f = "BottomCartWidgetViewModel.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class BottomCartWidgetViewModelImpl$updateWidgetState$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncKey;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BottomCartWidgetViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomCartWidgetViewModelImpl$updateWidgetState$1(BottomCartWidgetViewModelImpl bottomCartWidgetViewModelImpl, String str, d<? super BottomCartWidgetViewModelImpl$updateWidgetState$1> dVar) {
        super(2, dVar);
        this.this$0 = bottomCartWidgetViewModelImpl;
        this.$asyncKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        BottomCartWidgetViewModelImpl$updateWidgetState$1 bottomCartWidgetViewModelImpl$updateWidgetState$1 = new BottomCartWidgetViewModelImpl$updateWidgetState$1(this.this$0, this.$asyncKey, dVar);
        bottomCartWidgetViewModelImpl$updateWidgetState$1.L$0 = obj;
        return bottomCartWidgetViewModelImpl$updateWidgetState$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BottomCartWidgetViewModelImpl$updateWidgetState$1 bottomCartWidgetViewModelImpl$updateWidgetState$1;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Throwable th2;
        Object a11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            BottomCartWidgetViewModelImpl bottomCartWidgetViewModelImpl = this.this$0;
            String str = this.$asyncKey;
            try {
                r.Companion companion = r.INSTANCE;
                composerAsyncWidgetRepository = bottomCartWidgetViewModelImpl.repository;
                this.label = 1;
                bottomCartWidgetViewModelImpl$updateWidgetState$1 = this;
            } catch (Throwable th3) {
                th = th3;
                bottomCartWidgetViewModelImpl$updateWidgetState$1 = this;
                th2 = th;
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
                BottomCartWidgetViewModelImpl bottomCartWidgetViewModelImpl2 = bottomCartWidgetViewModelImpl$updateWidgetState$1.this$0;
                if (!(a11 instanceof r.b)) {
                }
                return Unit.f71690a;
            }
            try {
                obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, BottomCartWidgetDTO.class, null, bottomCartWidgetViewModelImpl$updateWidgetState$1, 4, null);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                BottomCartWidgetViewModelImpl bottomCartWidgetViewModelImpl22 = bottomCartWidgetViewModelImpl$updateWidgetState$1.this$0;
                if (!(a11 instanceof r.b)) {
                }
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                s.b(obj);
                bottomCartWidgetViewModelImpl$updateWidgetState$1 = this;
            } catch (Throwable th5) {
                th2 = th5;
                bottomCartWidgetViewModelImpl$updateWidgetState$1 = this;
                r.Companion companion222 = r.INSTANCE;
                a11 = s.a(th2);
                BottomCartWidgetViewModelImpl bottomCartWidgetViewModelImpl222 = bottomCartWidgetViewModelImpl$updateWidgetState$1.this$0;
                if (!(a11 instanceof r.b)) {
                }
                return Unit.f71690a;
            }
        }
        a11 = (ComposerAsyncWidgetResponse) obj;
        r.Companion companion3 = r.INSTANCE;
        BottomCartWidgetViewModelImpl bottomCartWidgetViewModelImpl2222 = bottomCartWidgetViewModelImpl$updateWidgetState$1.this$0;
        if (!(a11 instanceof r.b)) {
            ComposerAsyncWidgetResponse composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) a11;
            bottomCartWidgetViewModelImpl2222.getWidgetState().postValue(new WidgetState.NewState((BottomCartWidgetDTO) composerAsyncWidgetResponse.getState(), composerAsyncWidgetResponse.getTrackingPayloads()));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BottomCartWidgetViewModelImpl$updateWidgetState$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
