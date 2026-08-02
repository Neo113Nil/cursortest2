package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.r;
import Sc.s;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.ThrowableExtKt;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelsMapInfoV4View;
import we0.m;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$observeActions$2$2", f = "HotelsMapInfoV4Wrapper.kt", l = {198}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4Wrapper$observeActions$2$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ HotelsMapInfoV4View $this_run;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4Wrapper$observeActions$2$2(HotelsMapInfoV4View hotelsMapInfoV4View, HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper, d<? super HotelsMapInfoV4Wrapper$observeActions$2$2> dVar) {
        super(2, dVar);
        this.$this_run = hotelsMapInfoV4View;
        this.this$0 = hotelsMapInfoV4Wrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsMapInfoV4Wrapper$observeActions$2$2 hotelsMapInfoV4Wrapper$observeActions$2$2 = new HotelsMapInfoV4Wrapper$observeActions$2$2(this.$this_run, this.this$0, dVar);
        hotelsMapInfoV4Wrapper$observeActions$2$2.L$0 = obj;
        return hotelsMapInfoV4Wrapper$observeActions$2$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        Throwable th2;
        Object a11;
        Throwable b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                M m12 = (M) this.L$0;
                HotelsMapInfoV4View hotelsMapInfoV4View = this.$this_run;
                final HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper = this.this$0;
                try {
                    r.Companion companion = r.INSTANCE;
                    InterfaceC2395h<m> e11 = hotelsMapInfoV4View.getController().d().e();
                    InterfaceC2397i<? super m> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$observeActions$2$2$1$1
                        @Override // Ae.InterfaceC2397i
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                            return emit((m) obj2, (d<? super Unit>) dVar);
                        }

                        public final Object emit(m mVar, d<? super Unit> dVar) {
                            Function1 function1;
                            function1 = HotelsMapInfoV4Wrapper.this.onMapClickListener;
                            function1.invoke(mVar);
                            return Unit.f71690a;
                        }
                    };
                    this.L$0 = m12;
                    this.label = 1;
                    if (e11.collect(interfaceC2397i, this) == aVar) {
                        return aVar;
                    }
                    m11 = m12;
                } catch (Throwable th3) {
                    m11 = m12;
                    th2 = th3;
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m11 = (M) this.L$0;
                try {
                    s.b(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    r.Companion companion22 = r.INSTANCE;
                    a11 = s.a(th2);
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
            }
            a11 = Unit.f71690a;
            r.Companion companion3 = r.INSTANCE;
            b11 = r.b(a11);
            if (b11 != null) {
                ThrowableExtKt.log(b11, m11.getClass().getSimpleName().concat("_onMapClickFlow"));
            }
            return Unit.f71690a;
        } catch (CancellationException e12) {
            throw e12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4Wrapper$observeActions$2$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
