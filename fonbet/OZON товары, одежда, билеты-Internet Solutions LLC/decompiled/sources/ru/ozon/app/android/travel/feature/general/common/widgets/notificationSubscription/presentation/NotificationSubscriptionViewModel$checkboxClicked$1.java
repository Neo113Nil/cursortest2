package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.data.NotificationSubscriptionResponse;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionViewModel$checkboxClicked$1", f = "NotificationSubscriptionViewModel.kt", l = {DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER, 42}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationSubscriptionViewModel$checkboxClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ boolean $isChecked;
    int label;
    final /* synthetic */ NotificationSubscriptionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionViewModel$checkboxClicked$1(NotificationSubscriptionViewModel notificationSubscriptionViewModel, boolean z11, AtomAction atomAction, d<? super NotificationSubscriptionViewModel$checkboxClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = notificationSubscriptionViewModel;
        this.$isChecked = z11;
        this.$action = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NotificationSubscriptionViewModel$checkboxClicked$1(this.this$0, this.$isChecked, this.$action, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r7 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002d, code lost:
    
        if (xe.Y.b(300, r6) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent2;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent3;
        ActionV2Request prepareRequest;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                NotificationSubscriptionResponse notificationSubscriptionResponse = (NotificationSubscriptionResponse) ((ActionV2Response) obj).getData();
                a11 = notificationSubscriptionResponse != null ? Boolean.valueOf(notificationSubscriptionResponse.isChecked()) : null;
                r.Companion companion2 = r.INSTANCE;
                boolean z11 = a11 instanceof r.b;
                if (z11) {
                    broadcastSingleLiveEvent3 = this.this$0._revertLiveData;
                    broadcastSingleLiveEvent3.call();
                } else if (!z11) {
                    if (Intrinsics.d((Boolean) (z11 ? null : a11), Boolean.valueOf(this.$isChecked))) {
                        broadcastSingleLiveEvent = this.this$0._newStateLiveData;
                        broadcastSingleLiveEvent.setValue(Boolean.valueOf(this.$isChecked));
                    } else {
                        broadcastSingleLiveEvent2 = this.this$0._revertLiveData;
                        broadcastSingleLiveEvent2.call();
                    }
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        NotificationSubscriptionViewModel notificationSubscriptionViewModel = this.this$0;
        AtomAction atomAction = this.$action;
        boolean z12 = this.$isChecked;
        r.Companion companion3 = r.INSTANCE;
        prepareRequest = notificationSubscriptionViewModel.prepareRequest(((AtomAction.ComposerAction) atomAction).getActionName(), z12, ((AtomAction.ComposerAction) atomAction).getParams());
        actionV2Repository = notificationSubscriptionViewModel.repository;
        this.label = 2;
        obj = actionV2Repository.callActionSuspend(prepareRequest, NotificationSubscriptionResponse.class, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NotificationSubscriptionViewModel$checkboxClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
