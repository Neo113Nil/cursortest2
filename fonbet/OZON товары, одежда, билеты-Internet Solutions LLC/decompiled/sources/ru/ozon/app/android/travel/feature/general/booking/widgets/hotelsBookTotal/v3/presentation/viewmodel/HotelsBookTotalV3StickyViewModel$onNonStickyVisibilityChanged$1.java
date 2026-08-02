package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel;

import Ae.w0;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3StickyViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3StickyViewModel$onNonStickyVisibilityChanged$1", f = "HotelsBookTotalV3StickyViewModel.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class HotelsBookTotalV3StickyViewModel$onNonStickyVisibilityChanged$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $isVisible;
    int label;
    final /* synthetic */ HotelsBookTotalV3StickyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsBookTotalV3StickyViewModel$onNonStickyVisibilityChanged$1(HotelsBookTotalV3StickyViewModel hotelsBookTotalV3StickyViewModel, boolean z11, d<? super HotelsBookTotalV3StickyViewModel$onNonStickyVisibilityChanged$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsBookTotalV3StickyViewModel;
        this.$isVisible = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsBookTotalV3StickyViewModel$onNonStickyVisibilityChanged$1(this.this$0, this.$isVisible, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        HotelsBookTotalV3StickyViewModel.StickyContainerVisibilityState stickyContainerVisibilityState;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            HotelsBookTotalV3StickyViewModel hotelsBookTotalV3StickyViewModel = this.this$0;
            w0Var = hotelsBookTotalV3StickyViewModel.mutableVisibilityStateFlow;
            boolean z11 = this.$isVisible;
            stickyContainerVisibilityState = hotelsBookTotalV3StickyViewModel.cache;
            HotelsBookTotalV3StickyViewModel.StickyContainerVisibilityState copy$default = HotelsBookTotalV3StickyViewModel.StickyContainerVisibilityState.copy$default(stickyContainerVisibilityState, z11, false, 2, null);
            hotelsBookTotalV3StickyViewModel.cache = copy$default;
            this.label = 1;
            if (w0Var.emit(copy$default, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsBookTotalV3StickyViewModel$onNonStickyVisibilityChanged$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
