package ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.data.FreshMiniappHeaderDTO;
import xe.M;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation.FreshMiniappHeaderViewModel$updateWidget$1", f = "FreshMiniappHeaderViewModel.kt", l = {29, DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FreshMiniappHeaderViewModel$updateWidget$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FreshMiniappHeaderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshMiniappHeaderViewModel$updateWidget$1(FreshMiniappHeaderViewModel freshMiniappHeaderViewModel, String str, d<? super FreshMiniappHeaderViewModel$updateWidget$1> dVar) {
        super(2, dVar);
        this.this$0 = freshMiniappHeaderViewModel;
        this.$asyncData = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FreshMiniappHeaderViewModel$updateWidget$1 freshMiniappHeaderViewModel$updateWidget$1 = new FreshMiniappHeaderViewModel$updateWidget$1(this.this$0, this.$asyncData, dVar);
        freshMiniappHeaderViewModel$updateWidget$1.L$0 = obj;
        return freshMiniappHeaderViewModel$updateWidget$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r12.n(r4, r11) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0085  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FreshMiniappHeaderViewModel$updateWidget$1 freshMiniappHeaderViewModel$updateWidget$1;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Throwable th2;
        Object a11;
        Object obj2;
        h hVar;
        Throwable b11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            FreshMiniappHeaderViewModel freshMiniappHeaderViewModel = this.this$0;
            String str = this.$asyncData;
            try {
                r.Companion companion = r.INSTANCE;
                composerAsyncWidgetRepository = freshMiniappHeaderViewModel.repository;
                this.label = 1;
                freshMiniappHeaderViewModel$updateWidget$1 = this;
                try {
                    obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, FreshMiniappHeaderDTO.class, null, freshMiniappHeaderViewModel$updateWidget$1, 4, null);
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                    obj2 = a11;
                    FreshMiniappHeaderViewModel freshMiniappHeaderViewModel2 = freshMiniappHeaderViewModel$updateWidget$1.this$0;
                    if (!(obj2 instanceof r.b)) {
                    }
                    b11 = r.b(obj2);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
            } catch (Throwable th4) {
                th = th4;
                freshMiniappHeaderViewModel$updateWidget$1 = this;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                obj2 = a11;
                FreshMiniappHeaderViewModel freshMiniappHeaderViewModel22 = freshMiniappHeaderViewModel$updateWidget$1.this$0;
                if (!(obj2 instanceof r.b)) {
                }
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return Unit.f71690a;
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
                return Unit.f71690a;
            }
            try {
                s.b(obj);
                freshMiniappHeaderViewModel$updateWidget$1 = this;
            } catch (Throwable th5) {
                th2 = th5;
                freshMiniappHeaderViewModel$updateWidget$1 = this;
                r.Companion companion222 = r.INSTANCE;
                a11 = s.a(th2);
                obj2 = a11;
                FreshMiniappHeaderViewModel freshMiniappHeaderViewModel222 = freshMiniappHeaderViewModel$updateWidget$1.this$0;
                if (!(obj2 instanceof r.b)) {
                }
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
        }
        a11 = (ComposerAsyncWidgetResponse) obj;
        r.Companion companion3 = r.INSTANCE;
        obj2 = a11;
        FreshMiniappHeaderViewModel freshMiniappHeaderViewModel2222 = freshMiniappHeaderViewModel$updateWidget$1.this$0;
        if (!(obj2 instanceof r.b)) {
            ComposerAsyncWidgetResponse composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj2;
            hVar = freshMiniappHeaderViewModel2222._widgetUpdate;
            FreshMiniappHeaderUpdateResponse freshMiniappHeaderUpdateResponse = new FreshMiniappHeaderUpdateResponse((FreshMiniappHeaderDTO) composerAsyncWidgetResponse.getState(), composerAsyncWidgetResponse.getTrackingPayloads());
            freshMiniappHeaderViewModel$updateWidget$1.L$0 = obj2;
            freshMiniappHeaderViewModel$updateWidget$1.label = 2;
        }
        b11 = r.b(obj2);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FreshMiniappHeaderViewModel$updateWidget$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
