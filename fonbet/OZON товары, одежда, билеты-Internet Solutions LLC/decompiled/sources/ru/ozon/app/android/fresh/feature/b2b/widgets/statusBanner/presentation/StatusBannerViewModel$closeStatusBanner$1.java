package ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.presentation;

import Ae.w0;
import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.data.StatusBannerRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.data.api.CloseStatusBannerResponse;
import ru.ozon.app.android.utils.Result;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.presentation.StatusBannerViewModel$closeStatusBanner$1", f = "StatusBannerViewModel.kt", l = {34, DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 42}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StatusBannerViewModel$closeStatusBanner$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ String $bannerId;
    int label;
    final /* synthetic */ StatusBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatusBannerViewModel$closeStatusBanner$1(StatusBannerViewModel statusBannerViewModel, String str, String str2, d<? super StatusBannerViewModel$closeStatusBanner$1> dVar) {
        super(2, dVar);
        this.this$0 = statusBannerViewModel;
        this.$actionName = str;
        this.$bannerId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new StatusBannerViewModel$closeStatusBanner$1(this.this$0, this.$actionName, this.$bannerId, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0034, code lost:
    
        if (r7 == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        StatusBannerRepository statusBannerRepository;
        w0 w0Var;
        NotificationDTO defaultNotificationDTO;
        w0 w0Var2;
        x0 x0Var;
        x0 x0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            statusBannerRepository = this.this$0.statusBannerRepository;
            String str = this.$actionName;
            String str2 = this.$bannerId;
            this.label = 1;
            obj = statusBannerRepository.closeStatusBanner(str, str2, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                x0Var2 = this.this$0._shouldShowBanner;
                x0Var2.setValue(Boolean.TRUE);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            Result.Success success = (Result.Success) result;
            if (((CloseStatusBannerResponse) success.getValue()).getNotification() == null) {
                x0Var = this.this$0._shouldShowBanner;
                x0Var.setValue(Boolean.FALSE);
            } else {
                w0Var2 = this.this$0._notificationBar;
                NotificationDTO notification = ((CloseStatusBannerResponse) success.getValue()).getNotification();
                if (notification == null) {
                    notification = this.this$0.getDefaultNotificationDTO();
                }
                this.label = 2;
            }
            x0Var2 = this.this$0._shouldShowBanner;
            x0Var2.setValue(Boolean.TRUE);
            return Unit.f71690a;
        }
        if (!(result instanceof Result.Failure)) {
            throw new o();
        }
        w0Var = this.this$0._notificationBar;
        defaultNotificationDTO = this.this$0.getDefaultNotificationDTO();
        this.label = 3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((StatusBannerViewModel$closeStatusBanner$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
