package ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation.AdditionalReviewV2ViewModel$onComposerAction$1", f = "AdditionalReviewV2ViewModel.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AdditionalReviewV2ViewModel$onComposerAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ long $itemId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdditionalReviewV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalReviewV2ViewModel$onComposerAction$1(AdditionalReviewV2ViewModel additionalReviewV2ViewModel, AtomAction.ComposerAction composerAction, long j11, d<? super AdditionalReviewV2ViewModel$onComposerAction$1> dVar) {
        super(2, dVar);
        this.this$0 = additionalReviewV2ViewModel;
        this.$action = composerAction;
        this.$itemId = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AdditionalReviewV2ViewModel$onComposerAction$1 additionalReviewV2ViewModel$onComposerAction$1 = new AdditionalReviewV2ViewModel$onComposerAction$1(this.this$0, this.$action, this.$itemId, dVar);
        additionalReviewV2ViewModel$onComposerAction$1.L$0 = obj;
        return additionalReviewV2ViewModel$onComposerAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        h hVar;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                AdditionalReviewV2ViewModel additionalReviewV2ViewModel = this.this$0;
                AtomAction.ComposerAction composerAction = this.$action;
                r.Companion companion = r.INSTANCE;
                actionV2Repository = additionalReviewV2ViewModel.actionV2Repository;
                String actionName = composerAction.getActionName();
                Map<String, String> params = composerAction.getParams();
                if (params == null) {
                    params = U.c();
                }
                ActionV2Request actionV2Request = new ActionV2Request(params, actionName, false, 4, null);
                this.label = 1;
                obj = actionV2Repository.callActionSuspend(actionV2Request, Object.class, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = ((ActionV2Response) obj).getData();
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            a11 = s.a(b11);
        } else if (a11 == null) {
            a11 = s.a(new IllegalStateException("Result value is null"));
        }
        AdditionalReviewV2ViewModel additionalReviewV2ViewModel2 = this.this$0;
        long j11 = this.$itemId;
        if (!(a11 instanceof r.b)) {
            additionalReviewV2ViewModel2.removeItem(j11);
        }
        AdditionalReviewV2ViewModel additionalReviewV2ViewModel3 = this.this$0;
        Throwable b12 = r.b(a11);
        if (b12 != null) {
            hVar = additionalReviewV2ViewModel3._error;
            hVar.b(Unit.f71690a);
            Lm0.a.f17149a.e(b12);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdditionalReviewV2ViewModel$onComposerAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
