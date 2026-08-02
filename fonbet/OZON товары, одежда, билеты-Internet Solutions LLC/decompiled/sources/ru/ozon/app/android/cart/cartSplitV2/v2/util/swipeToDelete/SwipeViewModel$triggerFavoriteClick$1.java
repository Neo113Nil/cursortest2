package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete;

import Ae.w0;
import Sc.s;
import Wc.a;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SwipeViewModel$triggerFavoriteClick$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ SwipeViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeViewModel$triggerFavoriteClick$1$1", f = "SwipeViewModel.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeViewModel$triggerFavoriteClick$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int label;
        final /* synthetic */ SwipeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SwipeViewModel swipeViewModel, String str, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = swipeViewModel;
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$groupId, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            w0 w0Var;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                w0Var = this.this$0._swipeFavoriteClick;
                String str = this.$groupId;
                this.label = 1;
                if (w0Var.emit(str, this) == aVar) {
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
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeViewModel$triggerFavoriteClick$1(SwipeViewModel swipeViewModel, String str) {
        super(0);
        this.this$0 = swipeViewModel;
        this.$groupId = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C10727i.c(x0.a(this.this$0), null, null, new AnonymousClass1(this.this$0, this.$groupId, null), 3);
    }
}
