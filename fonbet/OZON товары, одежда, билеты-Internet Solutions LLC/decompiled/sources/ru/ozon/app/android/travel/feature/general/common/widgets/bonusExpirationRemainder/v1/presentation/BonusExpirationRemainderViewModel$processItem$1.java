package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation;

import Ae.x0;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewModel$processItem$1", f = "BonusExpirationRemainderViewModel.kt", l = {32, DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 41}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BonusExpirationRemainderViewModel$processItem$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ BonusExpirationRemainderVI $item;
    int label;
    final /* synthetic */ BonusExpirationRemainderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BonusExpirationRemainderViewModel$processItem$1(BonusExpirationRemainderVI bonusExpirationRemainderVI, BonusExpirationRemainderViewModel bonusExpirationRemainderViewModel, d<? super BonusExpirationRemainderViewModel$processItem$1> dVar) {
        super(2, dVar);
        this.$item = bonusExpirationRemainderVI;
        this.this$0 = bonusExpirationRemainderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BonusExpirationRemainderViewModel$processItem$1(this.$item, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r1.emit(r10, r9) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (r10.emit(r1, r9) == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        Object obj2;
        x0 x0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Exception e11) {
            if (!(e11 instanceof CancellationException)) {
                Lm0.a.f17149a.e(e11);
                x0Var = this.this$0._resultFlow;
                BonusExpirationRemainderViewModel.ShowItem showItem = new BonusExpirationRemainderViewModel.ShowItem(this.$item);
                this.label = 3;
            }
        }
        if (i11 == 0) {
            s.b(obj);
            String key = this.$item.getKey();
            if (key != null) {
                BonusExpirationRemainderViewModel bonusExpirationRemainderViewModel = this.this$0;
                this.label = 1;
                obj = bonusExpirationRemainderViewModel.getTimestamp(key, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            obj2 = new BonusExpirationRemainderViewModel.ShowItem(this.$item);
            x0Var2 = this.this$0._resultFlow;
            this.label = 2;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    s.b(obj);
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        if (((Number) obj).longValue() < this.$item.getTimestamp()) {
            obj2 = new BonusExpirationRemainderViewModel.ShowItem(this.$item);
            x0Var2 = this.this$0._resultFlow;
            this.label = 2;
        } else {
            obj2 = new BonusExpirationRemainderViewModel.RemoveWidget(this.$item.getId(), true);
            x0Var2 = this.this$0._resultFlow;
            this.label = 2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BonusExpirationRemainderViewModel$processItem$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
