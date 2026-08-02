package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponse;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel;
import xe.M;
import ze.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3ViewModel$hideWidget$1", f = "NotificationSubscriptionBannerV3ViewModel.kt", l = {195, 245, 195, 195, 195, 195}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerV3ViewModel$hideWidget$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ Object $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationSubscriptionBannerV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerV3ViewModel$hideWidget$1(String str, NotificationSubscriptionBannerV3ViewModel notificationSubscriptionBannerV3ViewModel, Object obj, d<? super NotificationSubscriptionBannerV3ViewModel$hideWidget$1> dVar) {
        super(2, dVar);
        this.$actionName = str;
        this.this$0 = notificationSubscriptionBannerV3ViewModel;
        this.$params = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NotificationSubscriptionBannerV3ViewModel$hideWidget$1 notificationSubscriptionBannerV3ViewModel$hideWidget$1 = new NotificationSubscriptionBannerV3ViewModel$hideWidget$1(this.$actionName, this.this$0, this.$params, dVar);
        notificationSubscriptionBannerV3ViewModel$hideWidget$1.L$0 = obj;
        return notificationSubscriptionBannerV3ViewModel$hideWidget$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d8, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, xe.M] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NotificationSubscriptionBannerV3VI notificationSubscriptionBannerV3VI;
        w0 w0Var;
        NotificationSubscriptionBannerV3VI notificationSubscriptionBannerV3VI2;
        w0 w0Var2;
        ActionV2Repository actionV2Repository;
        NotificationSubscriptionBannerV3VI notificationSubscriptionBannerV3VI3;
        w0 w0Var3;
        NotificationSubscriptionBannerV3VI notificationSubscriptionBannerV3VI4;
        w0 w0Var4;
        NotificationSubscriptionBannerV3VI notificationSubscriptionBannerV3VI5;
        w0 w0Var5;
        Throwable th2;
        a aVar = a.COROUTINE_SUSPENDED;
        ?? r12 = this.label;
        try {
        } catch (CancellationException e11) {
            throw e11;
        } catch (p e12) {
            Lm0.a.f17149a.e(e12);
            notificationSubscriptionBannerV3VI2 = this.this$0.itemVO;
            if (notificationSubscriptionBannerV3VI2 != null) {
                long id2 = notificationSubscriptionBannerV3VI2.getId();
                w0Var2 = this.this$0.viewEffects;
                NotificationSubscriptionBannerV3ViewModel.ViewEffect.RemoveWidget removeWidget = new NotificationSubscriptionBannerV3ViewModel.ViewEffect.RemoveWidget(id2);
                this.L$0 = null;
                this.label = 4;
            }
        } catch (Throwable th3) {
            this.this$0.handleCoroutineError(r12, th3, "hideWidget");
            notificationSubscriptionBannerV3VI = this.this$0.itemVO;
            if (notificationSubscriptionBannerV3VI != null) {
                long id3 = notificationSubscriptionBannerV3VI.getId();
                w0Var = this.this$0.viewEffects;
                NotificationSubscriptionBannerV3ViewModel.ViewEffect.RemoveWidget removeWidget2 = new NotificationSubscriptionBannerV3ViewModel.ViewEffect.RemoveWidget(id3);
                this.L$0 = null;
                this.label = 5;
            }
        }
        switch (r12) {
            case 0:
                s.b(obj);
                M m11 = (M) this.L$0;
                if (this.$actionName == null) {
                    Unit unit = Unit.f71690a;
                    notificationSubscriptionBannerV3VI3 = this.this$0.itemVO;
                    if (notificationSubscriptionBannerV3VI3 != null) {
                        long id4 = notificationSubscriptionBannerV3VI3.getId();
                        w0Var3 = this.this$0.viewEffects;
                        NotificationSubscriptionBannerV3ViewModel.ViewEffect.RemoveWidget removeWidget3 = new NotificationSubscriptionBannerV3ViewModel.ViewEffect.RemoveWidget(id4);
                        this.L$0 = unit;
                        this.label = 1;
                        if (w0Var3.emit(removeWidget3, this) == aVar) {
                        }
                    }
                    return unit;
                }
                actionV2Repository = this.this$0.actionV2Repository;
                ActionV2Request actionV2Request = new ActionV2Request(this.$params, this.$actionName, true);
                this.L$0 = m11;
                this.label = 2;
                obj = actionV2Repository.callActionSuspend(actionV2Request, TravelCommonActionResponse.class, this);
                if (obj == aVar) {
                }
                ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) obj);
                notificationSubscriptionBannerV3VI4 = this.this$0.itemVO;
                if (notificationSubscriptionBannerV3VI4 != null) {
                    long id5 = notificationSubscriptionBannerV3VI4.getId();
                    w0Var4 = this.this$0.viewEffects;
                    NotificationSubscriptionBannerV3ViewModel.ViewEffect.RemoveWidget removeWidget4 = new NotificationSubscriptionBannerV3ViewModel.ViewEffect.RemoveWidget(id5);
                    this.L$0 = null;
                    this.label = 3;
                    break;
                }
                return Unit.f71690a;
                return aVar;
            case 1:
                Unit unit2 = (Unit) this.L$0;
                s.b(obj);
                return unit2;
            case 2:
                try {
                    s.b(obj);
                    ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) obj);
                    notificationSubscriptionBannerV3VI4 = this.this$0.itemVO;
                    if (notificationSubscriptionBannerV3VI4 != null) {
                    }
                    return Unit.f71690a;
                } catch (Throwable th4) {
                    notificationSubscriptionBannerV3VI5 = this.this$0.itemVO;
                    if (notificationSubscriptionBannerV3VI5 == null) {
                        throw th4;
                    }
                    long id6 = notificationSubscriptionBannerV3VI5.getId();
                    w0Var5 = this.this$0.viewEffects;
                    NotificationSubscriptionBannerV3ViewModel.ViewEffect.RemoveWidget removeWidget5 = new NotificationSubscriptionBannerV3ViewModel.ViewEffect.RemoveWidget(id6);
                    this.L$0 = th4;
                    this.label = 6;
                    if (w0Var5.emit(removeWidget5, this) != aVar) {
                        th2 = th4;
                        break;
                    }
                }
                break;
            case 3:
            case 4:
            case 5:
                s.b(obj);
                return Unit.f71690a;
            case 6:
                th2 = (Throwable) this.L$0;
                s.b(obj);
                throw th2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NotificationSubscriptionBannerV3ViewModel$hideWidget$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
