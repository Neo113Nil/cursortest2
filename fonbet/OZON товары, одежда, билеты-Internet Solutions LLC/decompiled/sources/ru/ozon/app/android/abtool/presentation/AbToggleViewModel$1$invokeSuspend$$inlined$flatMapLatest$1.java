package ru.ozon.app.android.abtool.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.domain.FeatureDebugModel;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "LAe/i;", "it", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.presentation.AbToggleViewModel$1$invokeSuspend$$inlined$flatMapLatest$1", f = "AbToggleViewModel.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class AbToggleViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 extends j implements InterfaceC6511n<InterfaceC2397i<? super List<? extends FeatureDebugModel>>, String, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AbToggleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbToggleViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(d dVar, AbToggleViewModel abToggleViewModel) {
        super(3, dVar);
        this.this$0 = abToggleViewModel;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(@NotNull InterfaceC2397i<? super List<? extends FeatureDebugModel>> interfaceC2397i, String str, d<? super Unit> dVar) {
        AbToggleViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 abToggleViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 = new AbToggleViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(dVar, this.this$0);
        abToggleViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = interfaceC2397i;
        abToggleViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = str;
        return abToggleViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.L$0;
            C2408n0 c2408n0 = new C2408n0(C2399j.A(new AbToggleViewModel$1$2$1(this.this$0, (String) this.L$1, null)), new AbToggleViewModel$1$2$2(this.this$0, null));
            this.label = 1;
            if (C2399j.r(interfaceC2397i, c2408n0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
