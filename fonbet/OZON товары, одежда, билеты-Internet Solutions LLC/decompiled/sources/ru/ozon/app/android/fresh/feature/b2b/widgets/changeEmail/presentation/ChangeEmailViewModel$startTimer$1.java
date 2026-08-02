package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import Ae.x0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewModel$startTimer$1", f = "ChangeEmailViewModel.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ChangeEmailViewModel$startTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $seconds;
    int I$0;
    int label;
    final /* synthetic */ ChangeEmailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeEmailViewModel$startTimer$1(int i11, ChangeEmailViewModel changeEmailViewModel, d<? super ChangeEmailViewModel$startTimer$1> dVar) {
        super(2, dVar);
        this.$seconds = i11;
        this.this$0 = changeEmailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ChangeEmailViewModel$startTimer$1(this.$seconds, this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0037 -> B:5:0x003a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        int i11;
        x0 x0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = this.label;
        if (i12 == 0) {
            s.b(obj);
            int i13 = this.$seconds;
            x0Var = this.this$0._timer;
            x0Var.setValue(new Integer(i13));
            i11 = i13;
            if (i11 > 0) {
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.I$0;
            s.b(obj);
            i11--;
            x0Var2 = this.this$0._timer;
            x0Var2.setValue(new Integer(i11));
            if (i11 > 0) {
                this.I$0 = i11;
                this.label = 1;
                if (Y.b(1000L, this) == aVar) {
                    return aVar;
                }
                i11--;
                x0Var2 = this.this$0._timer;
                x0Var2.setValue(new Integer(i11));
                if (i11 > 0) {
                    return Unit.f71690a;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ChangeEmailViewModel$startTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
