package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.data.SteppedThermometerDTO;
import xe.M;
import ze.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "LSc/r;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerVO;", "<anonymous>", "(Lxe/M;)LSc/r;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation.SteppedThermometerViewModel$requestStateChange$2", f = "SteppedThermometerViewModel.kt", l = {54, 56}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SteppedThermometerViewModel$requestStateChange$2 extends j implements Function2<M, d<? super r<? extends SteppedThermometerVO>>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ l20.d $info;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SteppedThermometerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SteppedThermometerViewModel$requestStateChange$2(SteppedThermometerViewModel steppedThermometerViewModel, String str, l20.d dVar, d<? super SteppedThermometerViewModel$requestStateChange$2> dVar2) {
        super(2, dVar2);
        this.this$0 = steppedThermometerViewModel;
        this.$asyncData = str;
        this.$info = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SteppedThermometerViewModel$requestStateChange$2 steppedThermometerViewModel$requestStateChange$2 = new SteppedThermometerViewModel$requestStateChange$2(this.this$0, this.$asyncData, this.$info, dVar);
        steppedThermometerViewModel$requestStateChange$2.L$0 = obj;
        return steppedThermometerViewModel$requestStateChange$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super r<? extends SteppedThermometerVO>> dVar) {
        return invoke2(m11, (d<? super r<SteppedThermometerVO>>) dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r12.n((ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation.SteppedThermometerVO) r0, r11) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0093  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SteppedThermometerViewModel$requestStateChange$2 steppedThermometerViewModel$requestStateChange$2;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Throwable th2;
        Object a11;
        Object obj2;
        h hVar;
        SteppedThermometerMapper steppedThermometerMapper;
        Throwable b11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            SteppedThermometerViewModel steppedThermometerViewModel = this.this$0;
            String str = this.$asyncData;
            try {
                r.Companion companion = r.INSTANCE;
                composerAsyncWidgetRepository = steppedThermometerViewModel.repository;
                this.label = 1;
                steppedThermometerViewModel$requestStateChange$2 = this;
                try {
                    obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, SteppedThermometerDTO.class, null, steppedThermometerViewModel$requestStateChange$2, 4, null);
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                    SteppedThermometerViewModel steppedThermometerViewModel2 = steppedThermometerViewModel$requestStateChange$2.this$0;
                    l20.d dVar = steppedThermometerViewModel$requestStateChange$2.$info;
                    if (!(a11 instanceof r.b)) {
                    }
                    obj2 = a11;
                    SteppedThermometerViewModel steppedThermometerViewModel3 = steppedThermometerViewModel$requestStateChange$2.this$0;
                    if (!(obj2 instanceof r.b)) {
                    }
                    b11 = r.b(obj2);
                    if (b11 != null) {
                    }
                    return r.a(obj2);
                }
            } catch (Throwable th4) {
                th = th4;
                steppedThermometerViewModel$requestStateChange$2 = this;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                SteppedThermometerViewModel steppedThermometerViewModel22 = steppedThermometerViewModel$requestStateChange$2.this$0;
                l20.d dVar2 = steppedThermometerViewModel$requestStateChange$2.$info;
                if (!(a11 instanceof r.b)) {
                }
                obj2 = a11;
                SteppedThermometerViewModel steppedThermometerViewModel32 = steppedThermometerViewModel$requestStateChange$2.this$0;
                if (!(obj2 instanceof r.b)) {
                }
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return r.a(obj2);
            }
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                s.b(obj);
                b11 = r.b(obj2);
                if (b11 != null && !(b11 instanceof CancellationException)) {
                    Lm0.a.f17149a.e(b11);
                }
                return r.a(obj2);
            }
            try {
                s.b(obj);
                steppedThermometerViewModel$requestStateChange$2 = this;
            } catch (Throwable th5) {
                th2 = th5;
                steppedThermometerViewModel$requestStateChange$2 = this;
                r.Companion companion222 = r.INSTANCE;
                a11 = s.a(th2);
                SteppedThermometerViewModel steppedThermometerViewModel222 = steppedThermometerViewModel$requestStateChange$2.this$0;
                l20.d dVar22 = steppedThermometerViewModel$requestStateChange$2.$info;
                if (!(a11 instanceof r.b)) {
                }
                obj2 = a11;
                SteppedThermometerViewModel steppedThermometerViewModel322 = steppedThermometerViewModel$requestStateChange$2.this$0;
                if (!(obj2 instanceof r.b)) {
                }
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return r.a(obj2);
            }
        }
        a11 = (ComposerAsyncWidgetResponse) obj;
        r.Companion companion3 = r.INSTANCE;
        SteppedThermometerViewModel steppedThermometerViewModel2222 = steppedThermometerViewModel$requestStateChange$2.this$0;
        l20.d dVar222 = steppedThermometerViewModel$requestStateChange$2.$info;
        if (!(a11 instanceof r.b)) {
            steppedThermometerMapper = steppedThermometerViewModel2222.mapper;
            a11 = (SteppedThermometerVO) C7714v.K(steppedThermometerMapper.invoke((SteppedThermometerDTO) ((ComposerAsyncWidgetResponse) a11).getState(), dVar222));
        }
        obj2 = a11;
        SteppedThermometerViewModel steppedThermometerViewModel3222 = steppedThermometerViewModel$requestStateChange$2.this$0;
        if (!(obj2 instanceof r.b)) {
            hVar = steppedThermometerViewModel3222._widgetUpdates;
            steppedThermometerViewModel$requestStateChange$2.L$0 = obj2;
            steppedThermometerViewModel$requestStateChange$2.label = 2;
        }
        b11 = r.b(obj2);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
        }
        return r.a(obj2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super r<SteppedThermometerVO>> dVar) {
        return ((SteppedThermometerViewModel$requestStateChange$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
