package ru.ozon.app.android.delivery.customActionsHandlers.cleanCncAddress;

import Sc.s;
import Tg.b;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.concurrent.CancellationException;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.delivery.customActionsHandlers.cleanCncAddress.data.CleanCncAddressResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.cleanCncAddress.CleanCncAddressActionHandler$processWidgetAction$1", f = "CleanCncAddressActionHandler.kt", l = {DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CleanCncAddressActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ b $action;
    final /* synthetic */ C7475g $widgetComponentStorage;
    int label;
    final /* synthetic */ CleanCncAddressActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CleanCncAddressActionHandler$processWidgetAction$1(b bVar, CleanCncAddressActionHandler cleanCncAddressActionHandler, C7475g c7475g, d<? super CleanCncAddressActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.$action = bVar;
        this.this$0 = cleanCncAddressActionHandler;
        this.$widgetComponentStorage = c7475g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CleanCncAddressActionHandler$processWidgetAction$1(this.$action, this.this$0, this.$widgetComponentStorage, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String link;
        ComposerNavigator navigator;
        AtomActionDTO action;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                C10720e0 c10720e0 = C10720e0.f105451a;
                He.b bVar = He.b.f10879b;
                CleanCncAddressActionHandler$processWidgetAction$1$result$1 cleanCncAddressActionHandler$processWidgetAction$1$result$1 = new CleanCncAddressActionHandler$processWidgetAction$1$result$1(this.$action, this.this$0, null);
                this.label = 1;
                obj = C10727i.f(bVar, cleanCncAddressActionHandler$processWidgetAction$1$result$1, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            CleanCncAddressResponse cleanCncAddressResponse = (CleanCncAddressResponse) ((ActionV2Response) obj).getData();
            AtomAction atomAction = (cleanCncAddressResponse == null || (action = cleanCncAddressResponse.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, null);
            AtomAction.DismissRefresh dismissRefresh = atomAction instanceof AtomAction.DismissRefresh ? (AtomAction.DismissRefresh) atomAction : null;
            if (dismissRefresh != null && (link = dismissRefresh.getLink()) != null) {
                navigator = this.this$0.getNavigator(this.$widgetComponentStorage);
                ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, link, null, 2, null);
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception e12) {
            Lm0.a.f17149a.e(e12);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CleanCncAddressActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
