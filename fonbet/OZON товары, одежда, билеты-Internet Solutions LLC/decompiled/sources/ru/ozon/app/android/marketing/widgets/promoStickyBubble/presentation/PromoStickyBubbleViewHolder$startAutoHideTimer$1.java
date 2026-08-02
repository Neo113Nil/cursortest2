package ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation;

import Sc.s;
import Wc.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.K;
import kotlin.time.b;
import kotlin.time.c;
import ve.EnumC10311b;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleViewHolder$startAutoHideTimer$1", f = "PromoStickyBubbleViewHolder.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PromoStickyBubbleViewHolder$startAutoHideTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $hideWidget;
    final /* synthetic */ K $timer;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PromoStickyBubbleViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoStickyBubbleViewHolder$startAutoHideTimer$1(K k11, PromoStickyBubbleViewHolder promoStickyBubbleViewHolder, Function0<Unit> function0, d<? super PromoStickyBubbleViewHolder$startAutoHideTimer$1> dVar) {
        super(2, dVar);
        this.$timer = k11;
        this.this$0 = promoStickyBubbleViewHolder;
        this.$hideWidget = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PromoStickyBubbleViewHolder$startAutoHideTimer$1 promoStickyBubbleViewHolder$startAutoHideTimer$1 = new PromoStickyBubbleViewHolder$startAutoHideTimer$1(this.$timer, this.this$0, this.$hideWidget, dVar);
        promoStickyBubbleViewHolder$startAutoHideTimer$1.L$0 = obj;
        return promoStickyBubbleViewHolder$startAutoHideTimer$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003d -> B:5:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            if (this.$timer.f71785a > 0) {
            }
            this.$hideWidget.invoke();
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m11 = (M) this.L$0;
        s.b(obj);
        K k11 = this.$timer;
        k11.f71785a--;
        PromoStickyBubbleV0 promoStickyBubbleV0 = (PromoStickyBubbleV0) this.this$0.getBoundData();
        if (promoStickyBubbleV0 != null) {
            promoStickyBubbleV0.setRemainingTimerSeconds(new Integer(this.$timer.f71785a));
        }
        if (this.$timer.f71785a > 0 || !N.f(m11)) {
            this.$hideWidget.invoke();
            return Unit.f71690a;
        }
        b.Companion companion = b.INSTANCE;
        long g10 = c.g(1, EnumC10311b.SECONDS);
        this.L$0 = m11;
        this.label = 1;
        if (Y.c(g10, this) == aVar) {
            return aVar;
        }
        K k112 = this.$timer;
        k112.f71785a--;
        PromoStickyBubbleV0 promoStickyBubbleV02 = (PromoStickyBubbleV0) this.this$0.getBoundData();
        if (promoStickyBubbleV02 != null) {
        }
        if (this.$timer.f71785a > 0) {
        }
        this.$hideWidget.invoke();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PromoStickyBubbleViewHolder$startAutoHideTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
