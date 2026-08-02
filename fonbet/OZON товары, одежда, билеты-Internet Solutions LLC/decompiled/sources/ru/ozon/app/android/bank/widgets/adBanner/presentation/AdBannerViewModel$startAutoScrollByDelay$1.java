package ru.ozon.app.android.bank.widgets.adBanner.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.bank.widgets.adBanner.presentation.AdBannerViewModel$startAutoScrollByDelay$1", f = "AdBannerViewModel.kt", l = {62, 63}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AdBannerViewModel$startAutoScrollByDelay$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $autoScrollDelay;
    int label;
    final /* synthetic */ AdBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdBannerViewModel$startAutoScrollByDelay$1(int i11, AdBannerViewModel adBannerViewModel, d<? super AdBannerViewModel$startAutoScrollByDelay$1> dVar) {
        super(2, dVar);
        this.$autoScrollDelay = i11;
        this.this$0 = adBannerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdBannerViewModel$startAutoScrollByDelay$1(this.$autoScrollDelay, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (xe.Y.b(r4, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long j11 = this.$autoScrollDelay * 1000;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        w0<Unit> autoScrollEventsFlow = this.this$0.getAutoScrollEventsFlow();
        Unit unit = Unit.f71690a;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdBannerViewModel$startAutoScrollByDelay$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
