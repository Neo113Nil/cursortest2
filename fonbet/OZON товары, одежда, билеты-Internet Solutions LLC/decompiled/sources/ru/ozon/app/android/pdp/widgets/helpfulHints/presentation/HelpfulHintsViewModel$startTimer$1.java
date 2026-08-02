package ru.ozon.app.android.pdp.widgets.helpfulHints.presentation;

import Sc.s;
import Wc.a;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.ui.configurators.pdp.helpfulhints.HelpfulHintsInfoStorage;
import ru.ozon.app.android.pdp.ui.configurators.pdp.helpfulhints.HelpfulHintsVO;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.helpfulHints.presentation.HelpfulHintsViewModel$startTimer$1", f = "HelpfulHintsViewModel.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class HelpfulHintsViewModel$startTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ HelpfulHintsVO $item;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HelpfulHintsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpfulHintsViewModel$startTimer$1(HelpfulHintsViewModel helpfulHintsViewModel, HelpfulHintsVO helpfulHintsVO, d<? super HelpfulHintsViewModel$startTimer$1> dVar) {
        super(2, dVar);
        this.this$0 = helpfulHintsViewModel;
        this.$item = helpfulHintsVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HelpfulHintsViewModel$startTimer$1(this.this$0, this.$item, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x005c -> B:5:0x005f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        HelpfulHintsViewModel helpfulHintsViewModel;
        int i11;
        HelpfulHintsVO helpfulHintsVO;
        int i12;
        AtomicInteger atomicInteger3;
        AtomicInteger atomicInteger4;
        HelpfulHintsVO.NotificationBehavior notificationBehavior;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.label;
        if (i13 == 0) {
            s.b(obj);
            atomicInteger = this.this$0.delaySeconds;
            if (atomicInteger.get() != 0) {
                atomicInteger2 = this.this$0.delaySeconds;
                int i14 = atomicInteger2.get();
                helpfulHintsViewModel = this.this$0;
                i11 = 0;
                helpfulHintsVO = this.$item;
                i12 = i14;
                if (i11 < i12) {
                }
            }
            return Unit.f71690a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i11 = this.I$1;
        i12 = this.I$0;
        helpfulHintsVO = (HelpfulHintsVO) this.L$1;
        helpfulHintsViewModel = (HelpfulHintsViewModel) this.L$0;
        s.b(obj);
        HelpfulHintsInfoStorage helpfulHintsInfoStorage = HelpfulHintsInfoStorage.INSTANCE;
        String sku = helpfulHintsVO.getSku();
        atomicInteger4 = helpfulHintsViewModel.delaySeconds;
        int i15 = atomicInteger4.get();
        notificationBehavior = helpfulHintsViewModel.behavior;
        helpfulHintsInfoStorage.addToSetOfSku(sku, i15, notificationBehavior);
        i11++;
        if (i11 < i12) {
            atomicInteger3 = helpfulHintsViewModel.delaySeconds;
            atomicInteger3.decrementAndGet();
            this.L$0 = helpfulHintsViewModel;
            this.L$1 = helpfulHintsVO;
            this.I$0 = i12;
            this.I$1 = i11;
            this.label = 1;
            if (Y.b(1000L, this) == aVar) {
                return aVar;
            }
            HelpfulHintsInfoStorage helpfulHintsInfoStorage2 = HelpfulHintsInfoStorage.INSTANCE;
            String sku2 = helpfulHintsVO.getSku();
            atomicInteger4 = helpfulHintsViewModel.delaySeconds;
            int i152 = atomicInteger4.get();
            notificationBehavior = helpfulHintsViewModel.behavior;
            helpfulHintsInfoStorage2.addToSetOfSku(sku2, i152, notificationBehavior);
            i11++;
            if (i11 < i12) {
                this.this$0.showNotificationIfNeed(Long.parseLong(this.$item.getSku()));
                return Unit.f71690a;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HelpfulHintsViewModel$startTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
