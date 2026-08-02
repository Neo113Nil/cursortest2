package ru.ozon.app.android.marketing.widgets.stickyLadder.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.marketing.widgets.stickyLadder.data.StickyLadderDTO;
import ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderAsyncViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderAsyncViewModel$updateWidgetState$1", f = "StickyLadderAsyncViewModel.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StickyLadderAsyncViewModel$updateWidgetState$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ long $id;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StickyLadderAsyncViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyLadderAsyncViewModel$updateWidgetState$1(StickyLadderAsyncViewModel stickyLadderAsyncViewModel, String str, long j11, d<? super StickyLadderAsyncViewModel$updateWidgetState$1> dVar) {
        super(2, dVar);
        this.this$0 = stickyLadderAsyncViewModel;
        this.$asyncData = str;
        this.$id = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        StickyLadderAsyncViewModel$updateWidgetState$1 stickyLadderAsyncViewModel$updateWidgetState$1 = new StickyLadderAsyncViewModel$updateWidgetState$1(this.this$0, this.$asyncData, this.$id, dVar);
        stickyLadderAsyncViewModel$updateWidgetState$1.L$0 = obj;
        return stickyLadderAsyncViewModel$updateWidgetState$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        StickyLadderAsyncViewModel$updateWidgetState$1 stickyLadderAsyncViewModel$updateWidgetState$1;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Throwable th2;
        Object a11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            StickyLadderAsyncViewModel stickyLadderAsyncViewModel = this.this$0;
            String str = this.$asyncData;
            try {
                r.Companion companion = r.INSTANCE;
                composerAsyncWidgetRepository = stickyLadderAsyncViewModel.repository;
                this.label = 1;
                stickyLadderAsyncViewModel$updateWidgetState$1 = this;
            } catch (Throwable th3) {
                th = th3;
                stickyLadderAsyncViewModel$updateWidgetState$1 = this;
                th2 = th;
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
                StickyLadderAsyncViewModel stickyLadderAsyncViewModel2 = stickyLadderAsyncViewModel$updateWidgetState$1.this$0;
                long j11 = stickyLadderAsyncViewModel$updateWidgetState$1.$id;
                String str2 = stickyLadderAsyncViewModel$updateWidgetState$1.$asyncData;
                if (!(a11 instanceof r.b)) {
                }
                return Unit.f71690a;
            }
            try {
                obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, StickyLadderDTO.class, null, stickyLadderAsyncViewModel$updateWidgetState$1, 4, null);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                StickyLadderAsyncViewModel stickyLadderAsyncViewModel22 = stickyLadderAsyncViewModel$updateWidgetState$1.this$0;
                long j112 = stickyLadderAsyncViewModel$updateWidgetState$1.$id;
                String str22 = stickyLadderAsyncViewModel$updateWidgetState$1.$asyncData;
                if (!(a11 instanceof r.b)) {
                }
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                s.b(obj);
                stickyLadderAsyncViewModel$updateWidgetState$1 = this;
            } catch (Throwable th5) {
                th2 = th5;
                stickyLadderAsyncViewModel$updateWidgetState$1 = this;
                r.Companion companion222 = r.INSTANCE;
                a11 = s.a(th2);
                StickyLadderAsyncViewModel stickyLadderAsyncViewModel222 = stickyLadderAsyncViewModel$updateWidgetState$1.this$0;
                long j1122 = stickyLadderAsyncViewModel$updateWidgetState$1.$id;
                String str222 = stickyLadderAsyncViewModel$updateWidgetState$1.$asyncData;
                if (!(a11 instanceof r.b)) {
                }
                return Unit.f71690a;
            }
        }
        a11 = (ComposerAsyncWidgetResponse) obj;
        r.Companion companion3 = r.INSTANCE;
        StickyLadderAsyncViewModel stickyLadderAsyncViewModel2222 = stickyLadderAsyncViewModel$updateWidgetState$1.this$0;
        long j11222 = stickyLadderAsyncViewModel$updateWidgetState$1.$id;
        String str2222 = stickyLadderAsyncViewModel$updateWidgetState$1.$asyncData;
        if (!(a11 instanceof r.b)) {
            stickyLadderAsyncViewModel2222.getWidgetState().postValue(new StickyLadderAsyncViewModel.NewState(((StickyLadderDTO) ((ComposerAsyncWidgetResponse) a11).getState()).mapToVo(j11222, str2222)));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((StickyLadderAsyncViewModel$updateWidgetState$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
