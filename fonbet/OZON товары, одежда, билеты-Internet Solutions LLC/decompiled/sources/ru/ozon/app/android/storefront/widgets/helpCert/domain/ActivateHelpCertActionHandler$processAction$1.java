package ru.ozon.app.android.storefront.widgets.helpCert.domain;

import Sc.r;
import Sc.s;
import Wc.a;
import i10.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.helpCert.domain.ActivateHelpCertActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.helpCert.domain.ActivateHelpCertActionHandler$processAction$1", f = "ActivateHelpCertActionHandler.kt", l = {118}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ActivateHelpCertActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivateHelpCertActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivateHelpCertActionHandler$processAction$1(CustomActionHandler.HandlerReferences handlerReferences, AtomAction atomAction, ActivateHelpCertActionHandler activateHelpCertActionHandler, d<? super ActivateHelpCertActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.$handlerRefs = handlerReferences;
        this.$action = atomAction;
        this.this$0 = activateHelpCertActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ActivateHelpCertActionHandler$processAction$1 activateHelpCertActionHandler$processAction$1 = new ActivateHelpCertActionHandler$processAction$1(this.$handlerRefs, this.$action, this.this$0, dVar);
        activateHelpCertActionHandler$processAction$1.L$0 = obj;
        return activateHelpCertActionHandler$processAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        ArrayList arrayList;
        ActionV2Repository actionV2Repository;
        String str;
        List m11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
                AtomAction atomAction = this.$action;
                ActivateHelpCertActionHandler activateHelpCertActionHandler = this.this$0;
                r.Companion companion = r.INSTANCE;
                handlerReferences.getRefs().getController().e(new l.a.b(0L, null, 2));
                Map<String, String> params = ((AtomAction.ComposerAction) atomAction).getParams();
                if (params == null || (str = params.get("certificate_id")) == null || (m11 = h.m(str, new String[]{","}, 0, 6)) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    Iterator it = m11.iterator();
                    while (it.hasNext()) {
                        Long y02 = h.y0(h.z0((String) it.next()).toString());
                        if (y02 != null) {
                            arrayList.add(y02);
                        }
                    }
                }
                actionV2Repository = activateHelpCertActionHandler.actionV2Repository;
                ActionV2Request actionV2Request = new ActionV2Request(U.i(new Pair("certificate_id", arrayList)), ((AtomAction.ComposerAction) atomAction).getActionName(), false, 4, null);
                this.label = 1;
                obj = actionV2Repository.callActionSuspend(actionV2Request, ActivateHelpCertActionHandler.HelpCertActionResponse.class, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = (ActionV2Response) obj;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        ActivateHelpCertActionHandler activateHelpCertActionHandler2 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences2 = this.$handlerRefs;
        if (!(a11 instanceof r.b)) {
            ComposerReferences refs = handlerReferences2.getRefs();
            ActivateHelpCertActionHandler.HelpCertActionResponse helpCertActionResponse = (ActivateHelpCertActionHandler.HelpCertActionResponse) ((ActionV2Response) a11).getData();
            activateHelpCertActionHandler2.onSuccess(refs, helpCertActionResponse != null ? helpCertActionResponse.getNotificationBar() : null);
        }
        ActivateHelpCertActionHandler activateHelpCertActionHandler3 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences3 = this.$handlerRefs;
        Throwable b11 = r.b(a11);
        if (b11 != null && !(b11 instanceof CancellationException)) {
            activateHelpCertActionHandler3.onError(handlerReferences3.getRefs(), b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ActivateHelpCertActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
