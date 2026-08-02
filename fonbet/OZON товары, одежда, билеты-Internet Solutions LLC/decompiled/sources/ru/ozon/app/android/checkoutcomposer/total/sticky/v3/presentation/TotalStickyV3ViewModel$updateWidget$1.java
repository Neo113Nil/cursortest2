package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation;

import Ae.x0;
import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.data.TotalStickyV3DTO;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewModel$updateWidget$1", f = "TotalStickyV3ViewModel.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 67}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class TotalStickyV3ViewModel$updateWidget$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TotalStickyV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalStickyV3ViewModel$updateWidget$1(TotalStickyV3ViewModel totalStickyV3ViewModel, String str, d<? super TotalStickyV3ViewModel$updateWidget$1> dVar) {
        super(2, dVar);
        this.this$0 = totalStickyV3ViewModel;
        this.$asyncData = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TotalStickyV3ViewModel$updateWidget$1 totalStickyV3ViewModel$updateWidget$1 = new TotalStickyV3ViewModel$updateWidget$1(this.this$0, this.$asyncData, dVar);
        totalStickyV3ViewModel$updateWidget$1.L$0 = obj;
        return totalStickyV3ViewModel$updateWidget$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r12.emit(r4, r11) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0087  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TotalStickyV3ViewModel$updateWidget$1 totalStickyV3ViewModel$updateWidget$1;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Throwable th2;
        Object a11;
        Object obj2;
        Throwable b11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            TotalStickyV3ViewModel totalStickyV3ViewModel = this.this$0;
            String str = this.$asyncData;
            try {
                r.Companion companion = r.INSTANCE;
                composerAsyncWidgetRepository = totalStickyV3ViewModel.repository;
                this.label = 1;
                totalStickyV3ViewModel$updateWidget$1 = this;
                try {
                    obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, TotalStickyV3DTO.class, null, totalStickyV3ViewModel$updateWidget$1, 4, null);
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                    obj2 = a11;
                    TotalStickyV3ViewModel totalStickyV3ViewModel2 = totalStickyV3ViewModel$updateWidget$1.this$0;
                    if (!(obj2 instanceof r.b)) {
                    }
                    a.b bVar = Lm0.a.f17149a;
                    b11 = r.b(obj2);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
            } catch (Throwable th4) {
                th = th4;
                totalStickyV3ViewModel$updateWidget$1 = this;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                obj2 = a11;
                TotalStickyV3ViewModel totalStickyV3ViewModel22 = totalStickyV3ViewModel$updateWidget$1.this$0;
                if (!(obj2 instanceof r.b)) {
                }
                a.b bVar2 = Lm0.a.f17149a;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                s.b(obj);
                a.b bVar22 = Lm0.a.f17149a;
                b11 = r.b(obj2);
                if (b11 != null) {
                    bVar22.e(b11);
                }
                return Unit.f71690a;
            }
            try {
                s.b(obj);
                totalStickyV3ViewModel$updateWidget$1 = this;
            } catch (Throwable th5) {
                th2 = th5;
                totalStickyV3ViewModel$updateWidget$1 = this;
                r.Companion companion222 = r.INSTANCE;
                a11 = s.a(th2);
                obj2 = a11;
                TotalStickyV3ViewModel totalStickyV3ViewModel222 = totalStickyV3ViewModel$updateWidget$1.this$0;
                if (!(obj2 instanceof r.b)) {
                }
                a.b bVar222 = Lm0.a.f17149a;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
        }
        a11 = (ComposerAsyncWidgetResponse) obj;
        r.Companion companion3 = r.INSTANCE;
        obj2 = a11;
        TotalStickyV3ViewModel totalStickyV3ViewModel2222 = totalStickyV3ViewModel$updateWidget$1.this$0;
        if (!(obj2 instanceof r.b)) {
            ComposerAsyncWidgetResponse composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj2;
            x0 x0Var = totalStickyV3ViewModel2222._widgetUpdateFlow;
            TotalStickyV3UpdateResponse totalStickyV3UpdateResponse = new TotalStickyV3UpdateResponse((TotalStickyV3DTO) composerAsyncWidgetResponse.getState(), composerAsyncWidgetResponse.getTrackingPayloads());
            totalStickyV3ViewModel$updateWidget$1.L$0 = obj2;
            totalStickyV3ViewModel$updateWidget$1.label = 2;
        }
        a.b bVar2222 = Lm0.a.f17149a;
        b11 = r.b(obj2);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TotalStickyV3ViewModel$updateWidget$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
