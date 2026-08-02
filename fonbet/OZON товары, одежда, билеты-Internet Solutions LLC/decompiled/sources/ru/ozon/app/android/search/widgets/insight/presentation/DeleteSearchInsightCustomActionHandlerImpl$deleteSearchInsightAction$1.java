package ru.ozon.app.android.search.widgets.insight.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.composer.ComposerNavigator;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.insight.presentation.DeleteSearchInsightCustomActionHandlerImpl$deleteSearchInsightAction$1", f = "DeleteSearchInsightCustomActionHandlerImpl.kt", l = {143, 86, 90}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DeleteSearchInsightCustomActionHandlerImpl$deleteSearchInsightAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionV2Request $actionRequest;
    final /* synthetic */ ActionV2Repository $actionV2Repository;
    final /* synthetic */ ComposerNavigator $navigator;
    final /* synthetic */ DeleteSearchInsightViewModel $viewModel;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DeleteSearchInsightCustomActionHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteSearchInsightCustomActionHandlerImpl$deleteSearchInsightAction$1(ActionV2Repository actionV2Repository, ActionV2Request actionV2Request, DeleteSearchInsightCustomActionHandlerImpl deleteSearchInsightCustomActionHandlerImpl, DeleteSearchInsightViewModel deleteSearchInsightViewModel, ComposerNavigator composerNavigator, d<? super DeleteSearchInsightCustomActionHandlerImpl$deleteSearchInsightAction$1> dVar) {
        super(2, dVar);
        this.$actionV2Repository = actionV2Repository;
        this.$actionRequest = actionV2Request;
        this.this$0 = deleteSearchInsightCustomActionHandlerImpl;
        this.$viewModel = deleteSearchInsightViewModel;
        this.$navigator = composerNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DeleteSearchInsightCustomActionHandlerImpl$deleteSearchInsightAction$1 deleteSearchInsightCustomActionHandlerImpl$deleteSearchInsightAction$1 = new DeleteSearchInsightCustomActionHandlerImpl$deleteSearchInsightAction$1(this.$actionV2Repository, this.$actionRequest, this.this$0, this.$viewModel, this.$navigator, dVar);
        deleteSearchInsightCustomActionHandlerImpl$deleteSearchInsightAction$1.L$0 = obj;
        return deleteSearchInsightCustomActionHandlerImpl$deleteSearchInsightAction$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        Object dismissDelayed;
        DeleteSearchInsightViewModel deleteSearchInsightViewModel;
        ActionV2Response actionV2Response;
        Object dismissDelayed2;
        DeleteSearchInsightViewModel deleteSearchInsightViewModel2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            ActionV2Repository actionV2Repository = this.$actionV2Repository;
            ActionV2Request actionV2Request = this.$actionRequest;
            r.Companion companion2 = r.INSTANCE;
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, Object.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    deleteSearchInsightViewModel2 = (DeleteSearchInsightViewModel) this.L$1;
                    s.b(obj);
                    deleteSearchInsightViewModel2.showError();
                    return Unit.f71690a;
                }
                actionV2Response = (ActionV2Response) this.L$2;
                deleteSearchInsightViewModel = (DeleteSearchInsightViewModel) this.L$1;
                obj2 = this.L$0;
                s.b(obj);
                if (actionV2Response.getError() != null) {
                    deleteSearchInsightViewModel.deleteWidget();
                } else {
                    deleteSearchInsightViewModel.showError();
                }
                DeleteSearchInsightCustomActionHandlerImpl deleteSearchInsightCustomActionHandlerImpl = this.this$0;
                DeleteSearchInsightViewModel deleteSearchInsightViewModel3 = this.$viewModel;
                ComposerNavigator composerNavigator = this.$navigator;
                if (r.b(obj2) != null) {
                    this.L$0 = obj2;
                    this.L$1 = deleteSearchInsightViewModel3;
                    this.L$2 = null;
                    this.label = 3;
                    dismissDelayed2 = deleteSearchInsightCustomActionHandlerImpl.dismissDelayed(deleteSearchInsightViewModel3, composerNavigator, this);
                    if (dismissDelayed2 != aVar) {
                        deleteSearchInsightViewModel2 = deleteSearchInsightViewModel3;
                        deleteSearchInsightViewModel2.showError();
                    }
                    return aVar;
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        a11 = (ActionV2Response) obj;
        r.Companion companion3 = r.INSTANCE;
        obj2 = a11;
        DeleteSearchInsightCustomActionHandlerImpl deleteSearchInsightCustomActionHandlerImpl2 = this.this$0;
        DeleteSearchInsightViewModel deleteSearchInsightViewModel4 = this.$viewModel;
        ComposerNavigator composerNavigator2 = this.$navigator;
        if (!(obj2 instanceof r.b)) {
            ActionV2Response actionV2Response2 = (ActionV2Response) obj2;
            this.L$0 = obj2;
            this.L$1 = deleteSearchInsightViewModel4;
            this.L$2 = actionV2Response2;
            this.label = 2;
            dismissDelayed = deleteSearchInsightCustomActionHandlerImpl2.dismissDelayed(deleteSearchInsightViewModel4, composerNavigator2, this);
            if (dismissDelayed != aVar) {
                deleteSearchInsightViewModel = deleteSearchInsightViewModel4;
                actionV2Response = actionV2Response2;
                if (actionV2Response.getError() != null) {
                }
            }
            return aVar;
        }
        DeleteSearchInsightCustomActionHandlerImpl deleteSearchInsightCustomActionHandlerImpl3 = this.this$0;
        DeleteSearchInsightViewModel deleteSearchInsightViewModel32 = this.$viewModel;
        ComposerNavigator composerNavigator3 = this.$navigator;
        if (r.b(obj2) != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DeleteSearchInsightCustomActionHandlerImpl$deleteSearchInsightAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
