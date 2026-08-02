package ru.ozon.app.android.rfbs.deliverycomplain.presentation;

import Ae.w0;
import He.b;
import Sc.r;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.csma.api.models.SendComplainResponse;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.ComplainViewModel;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.models.SendComplainParams;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.rfbs.deliverycomplain.presentation.ComplainViewModel$sendComplain$1", f = "ComplainViewModel.kt", l = {28, DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 41, DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ComplainViewModel$sendComplain$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ SendComplainParams $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ComplainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComplainViewModel$sendComplain$1(ComplainViewModel complainViewModel, SendComplainParams sendComplainParams, d<? super ComplainViewModel$sendComplain$1> dVar) {
        super(2, dVar);
        this.this$0 = complainViewModel;
        this.$params = sendComplainParams;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ComplainViewModel$sendComplain$1 complainViewModel$sendComplain$1 = new ComplainViewModel$sendComplain$1(this.this$0, this.$params, dVar);
        complainViewModel$sendComplain$1.L$0 = obj;
        return complainViewModel$sendComplain$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ca, code lost:
    
        if (r10.emit(r1, r9) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (r1.emit(r3, r9) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
    
        if (r10.emit(r1, r9) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        if (r1.emit(r8, r9) == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Throwable b11;
        w0 w0Var;
        OrderChangePreferences orderChangePreferences;
        w0 w0Var2;
        w0 w0Var3;
        w0 w0Var4;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            w0Var4 = this.this$0._actions;
            ComplainViewModel.Action.Loader loader = new ComplainViewModel.Action.Loader(true);
            this.L$0 = m11;
            this.label = 1;
        } else if (i11 == 1) {
            s.b(obj);
        } else {
            if (i11 == 2) {
                s.b(obj);
                a11 = (SendComplainResponse) obj;
                r.Companion companion2 = r.INSTANCE;
                ComplainViewModel complainViewModel = this.this$0;
                b11 = r.b(a11);
                if (b11 != null) {
                    orderChangePreferences = complainViewModel.prefs;
                    orderChangePreferences.markAsUpdated();
                    w0Var2 = complainViewModel._actions;
                    ComplainViewModel.Action.Success success = new ComplainViewModel.Action.Success(((SendComplainResponse) a11).getLink());
                    this.L$0 = null;
                    this.label = 3;
                } else {
                    Lm0.a.f17149a.e(b11);
                    w0Var = complainViewModel._actions;
                    ComplainViewModel.Action.Error error = ComplainViewModel.Action.Error.INSTANCE;
                    this.L$0 = null;
                    this.label = 4;
                }
                return Unit.f71690a;
            }
            if (i11 != 3 && i11 != 4) {
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            w0Var3 = this.this$0._actions;
            ComplainViewModel.Action.Loader loader2 = new ComplainViewModel.Action.Loader(false);
            this.label = 5;
        }
        ComplainViewModel complainViewModel2 = this.this$0;
        SendComplainParams sendComplainParams = this.$params;
        r.Companion companion3 = r.INSTANCE;
        C10720e0 c10720e0 = C10720e0.f105451a;
        b bVar = b.f10879b;
        ComplainViewModel$sendComplain$1$1$1 complainViewModel$sendComplain$1$1$1 = new ComplainViewModel$sendComplain$1$1$1(complainViewModel2, sendComplainParams, null);
        this.L$0 = null;
        this.label = 2;
        obj = C10727i.f(bVar, complainViewModel$sendComplain$1$1$1, this);
        if (obj == aVar) {
            return aVar;
        }
        a11 = (SendComplainResponse) obj;
        r.Companion companion22 = r.INSTANCE;
        ComplainViewModel complainViewModel3 = this.this$0;
        b11 = r.b(a11);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ComplainViewModel$sendComplain$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
