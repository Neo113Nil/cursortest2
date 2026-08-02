package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import Ae.x0;
import Sc.r;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.core.RateItemsV2Mapper;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.data.RateItemsV2DTO;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.model.RateItemsV2ViewState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel$fetch$1", f = "RateItemsV2ViewModel.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RateItemsV2ViewModel$fetch$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RateItemsV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateItemsV2ViewModel$fetch$1(RateItemsV2ViewModel rateItemsV2ViewModel, String str, d<? super RateItemsV2ViewModel$fetch$1> dVar) {
        super(2, dVar);
        this.this$0 = rateItemsV2ViewModel;
        this.$asyncData = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        RateItemsV2ViewModel$fetch$1 rateItemsV2ViewModel$fetch$1 = new RateItemsV2ViewModel$fetch$1(this.this$0, this.$asyncData, dVar);
        rateItemsV2ViewModel$fetch$1.L$0 = obj;
        return rateItemsV2ViewModel$fetch$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RateItemsV2ViewModel$fetch$1 rateItemsV2ViewModel$fetch$1;
        RateItemsV2Mapper rateItemsV2Mapper;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        RateItemsV2Mapper rateItemsV2Mapper2;
        Throwable th2;
        Object a11;
        Throwable b11;
        x0 x0Var;
        x0 x0Var2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            RateItemsV2ViewModel rateItemsV2ViewModel = this.this$0;
            String str = this.$asyncData;
            try {
                r.Companion companion = r.INSTANCE;
                rateItemsV2Mapper = rateItemsV2ViewModel.mapper;
                composerAsyncWidgetRepository = rateItemsV2ViewModel.repository;
                this.L$0 = rateItemsV2Mapper;
                this.label = 1;
                rateItemsV2ViewModel$fetch$1 = this;
                try {
                    obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, RateItemsV2DTO.class, null, rateItemsV2ViewModel$fetch$1, 4, null);
                    if (obj == aVar) {
                        return aVar;
                    }
                    rateItemsV2Mapper2 = rateItemsV2Mapper;
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                    RateItemsV2ViewModel rateItemsV2ViewModel2 = rateItemsV2ViewModel$fetch$1.this$0;
                    if (!(a11 instanceof r.b)) {
                    }
                    RateItemsV2ViewModel rateItemsV2ViewModel3 = rateItemsV2ViewModel$fetch$1.this$0;
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
            } catch (Throwable th4) {
                th = th4;
                rateItemsV2ViewModel$fetch$1 = this;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                RateItemsV2ViewModel rateItemsV2ViewModel22 = rateItemsV2ViewModel$fetch$1.this$0;
                if (!(a11 instanceof r.b)) {
                }
                RateItemsV2ViewModel rateItemsV2ViewModel32 = rateItemsV2ViewModel$fetch$1.this$0;
                b11 = r.b(a11);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rateItemsV2Mapper2 = (RateItemsV2Mapper) this.L$0;
            try {
                s.b(obj);
                rateItemsV2ViewModel$fetch$1 = this;
            } catch (Throwable th5) {
                th2 = th5;
                rateItemsV2ViewModel$fetch$1 = this;
                r.Companion companion222 = r.INSTANCE;
                a11 = s.a(th2);
                RateItemsV2ViewModel rateItemsV2ViewModel222 = rateItemsV2ViewModel$fetch$1.this$0;
                if (!(a11 instanceof r.b)) {
                }
                RateItemsV2ViewModel rateItemsV2ViewModel322 = rateItemsV2ViewModel$fetch$1.this$0;
                b11 = r.b(a11);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
        }
        a11 = rateItemsV2Mapper2.toVo((RateItemsV2DTO) ((ComposerAsyncWidgetResponse) obj).getState());
        r.Companion companion3 = r.INSTANCE;
        RateItemsV2ViewModel rateItemsV2ViewModel2222 = rateItemsV2ViewModel$fetch$1.this$0;
        if (!(a11 instanceof r.b)) {
            x0Var2 = rateItemsV2ViewModel2222._viewState;
            x0Var2.setValue(new RateItemsV2ViewState.Content((RateItemsV2VO) a11));
        }
        RateItemsV2ViewModel rateItemsV2ViewModel3222 = rateItemsV2ViewModel$fetch$1.this$0;
        b11 = r.b(a11);
        if (b11 != null) {
            x0Var = rateItemsV2ViewModel3222._viewState;
            x0Var.setValue(new RateItemsV2ViewState.Error(b11));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RateItemsV2ViewModel$fetch$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
