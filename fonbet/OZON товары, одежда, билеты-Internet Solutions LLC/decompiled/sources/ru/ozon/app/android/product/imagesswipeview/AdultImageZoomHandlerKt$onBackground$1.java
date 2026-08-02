package ru.ozon.app.android.product.imagesswipeview;

import Sc.s;
import Wc.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.product.imagesswipeview.AdultImageZoomHandlerKt$onBackground$1", f = "AdultImageZoomHandler.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AdultImageZoomHandlerKt$onBackground$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function2<M, d<? super Unit>, Object> $block;
    final /* synthetic */ AdultImageZoomHandlerKt$onBackground$listener$1 $listener;
    final /* synthetic */ View $this_onBackground;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdultImageZoomHandlerKt$onBackground$1(Function2<? super M, ? super d<? super Unit>, ? extends Object> function2, View view, AdultImageZoomHandlerKt$onBackground$listener$1 adultImageZoomHandlerKt$onBackground$listener$1, d<? super AdultImageZoomHandlerKt$onBackground$1> dVar) {
        super(2, dVar);
        this.$block = function2;
        this.$this_onBackground = view;
        this.$listener = adultImageZoomHandlerKt$onBackground$listener$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AdultImageZoomHandlerKt$onBackground$1 adultImageZoomHandlerKt$onBackground$1 = new AdultImageZoomHandlerKt$onBackground$1(this.$block, this.$this_onBackground, this.$listener, dVar);
        adultImageZoomHandlerKt$onBackground$1.L$0 = obj;
        return adultImageZoomHandlerKt$onBackground$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            Function2<M, d<? super Unit>, Object> function2 = this.$block;
            this.label = 1;
            if (function2.invoke(m11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.$this_onBackground.removeOnAttachStateChangeListener(this.$listener);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdultImageZoomHandlerKt$onBackground$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
