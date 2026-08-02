package ru.ozon.app.android.common.actionHandlers.setPublicProfile;

import Ge.f;
import Sc.r;
import Sc.s;
import W10.c;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.actionHandlers.setPublicProfile.SetPublicProfileStatusActionHandler$processAction$1", f = "SetPublicProfileStatusActionHandler.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SetPublicProfileStatusActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ ComposerReferences $composerRefs;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SetPublicProfileStatusActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetPublicProfileStatusActionHandler$processAction$1(AtomAction atomAction, SetPublicProfileStatusActionHandler setPublicProfileStatusActionHandler, CustomActionHandler.HandlerReferences handlerReferences, ComposerReferences composerReferences, d<? super SetPublicProfileStatusActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.$action = atomAction;
        this.this$0 = setPublicProfileStatusActionHandler;
        this.$handlerRefs = handlerReferences;
        this.$composerRefs = composerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SetPublicProfileStatusActionHandler$processAction$1 setPublicProfileStatusActionHandler$processAction$1 = new SetPublicProfileStatusActionHandler$processAction$1(this.$action, this.this$0, this.$handlerRefs, this.$composerRefs, dVar);
        setPublicProfileStatusActionHandler$processAction$1.L$0 = obj;
        return setPublicProfileStatusActionHandler$processAction$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            AtomAction atomAction = this.$action;
            SetPublicProfileStatusActionHandler setPublicProfileStatusActionHandler = this.this$0;
            CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
            r.Companion companion2 = r.INSTANCE;
            String link = ((AtomAction.Click) atomAction).getLink();
            a11 = null;
            if (link != null) {
                ActionV2Repository actionV2Repository = setPublicProfileStatusActionHandler.getActionV2Repository();
                ActionV2Request actionV2Request = new ActionV2Request(((AtomAction.Click) atomAction).getParams(), link, false, 4, null);
                c trackingData = handlerReferences.getTrackingData();
                if (trackingData == null) {
                    trackingData = new c(null, null, null);
                }
                y callActionWithTracking = actionV2Repository.callActionWithTracking(actionV2Request, trackingData, Object.class);
                this.label = 1;
                obj = f.b(callActionWithTracking, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            r.Companion companion3 = r.INSTANCE;
            ComposerReferences composerReferences = this.$composerRefs;
            if (!(a11 instanceof r.b)) {
                InterfaceC7851b.a.a(composerReferences.getController(), null, null, null, null, 15);
            }
            ComposerReferences composerReferences2 = this.$composerRefs;
            if (r.b(a11) != null) {
                InterfaceC7851b.a.a(composerReferences2.getController(), null, null, null, null, 15);
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        a11 = (ActionV2Response) obj;
        r.Companion companion32 = r.INSTANCE;
        ComposerReferences composerReferences3 = this.$composerRefs;
        if (!(a11 instanceof r.b)) {
        }
        ComposerReferences composerReferences22 = this.$composerRefs;
        if (r.b(a11) != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SetPublicProfileStatusActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
