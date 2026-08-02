package ru.ozon.app.android.common.actionHandlers;

import Sc.r;
import Sc.s;
import Tg.b;
import Vg.f;
import Wc.a;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.actionHandlers.SetBugReportActionHandler$processWidgetAction$1", f = "SetBugReportActionHandler.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SetBugReportActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ b $action;
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ f.a $widgetInfo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SetBugReportActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetBugReportActionHandler$processWidgetAction$1(b bVar, SetBugReportActionHandler setBugReportActionHandler, f.a aVar, ComposerReferences composerReferences, d<? super SetBugReportActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.$action = bVar;
        this.this$0 = setBugReportActionHandler;
        this.$widgetInfo = aVar;
        this.$refs = composerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SetBugReportActionHandler$processWidgetAction$1 setBugReportActionHandler$processWidgetAction$1 = new SetBugReportActionHandler$processWidgetAction$1(this.$action, this.this$0, this.$widgetInfo, this.$refs, dVar);
        setBugReportActionHandler$processWidgetAction$1.L$0 = obj;
        return setBugReportActionHandler$processWidgetAction$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        boolean isHomePage;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            b bVar = this.$action;
            SetBugReportActionHandler setBugReportActionHandler = this.this$0;
            f.a aVar2 = this.$widgetInfo;
            r.Companion companion2 = r.INSTANCE;
            Map<String, String> params = ((AtomAction.Click) bVar).getParams();
            if (params == null) {
                a11 = null;
                r.Companion companion3 = r.INSTANCE;
                SetBugReportActionHandler setBugReportActionHandler2 = this.this$0;
                f.a aVar3 = this.$widgetInfo;
                ComposerReferences composerReferences = this.$refs;
                if (!(a11 instanceof r.b)) {
                    T00.a b11 = aVar3.c().c().b();
                    isHomePage = setBugReportActionHandler2.isHomePage(b11 != null ? b11.h() : null);
                    if (!isHomePage) {
                        InterfaceC7851b.a.a(composerReferences.getController(), null, null, null, null, 15);
                    }
                }
                ComposerReferences composerReferences2 = this.$refs;
                if (r.b(a11) != null) {
                    InterfaceC7851b.a.a(composerReferences2.getController(), null, null, null, null, 15);
                }
                return Unit.f71690a;
            }
            actionV2Repository = setBugReportActionHandler.actionV2Repository;
            y callActionWithTracking = actionV2Repository.callActionWithTracking(new ActionV2Request(params, setBugReportActionHandler.getActionId(), false, 4, null), aVar2.c().n(), Object.class);
            this.label = 1;
            obj = Ge.f.b(callActionWithTracking, this);
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
        r.Companion companion32 = r.INSTANCE;
        SetBugReportActionHandler setBugReportActionHandler22 = this.this$0;
        f.a aVar32 = this.$widgetInfo;
        ComposerReferences composerReferences3 = this.$refs;
        if (!(a11 instanceof r.b)) {
        }
        ComposerReferences composerReferences22 = this.$refs;
        if (r.b(a11) != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SetBugReportActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
