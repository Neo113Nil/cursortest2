package ru.ozon.app.android.search.aiMessenger.actionHandlers;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.aiMessenger.actionHandlers.DeleteAiConversationActionHandlerImpl$deleteAiConversation$1", f = "DeleteAiConversationActionHandlerImpl.kt", l = {139, 70, 72}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DeleteAiConversationActionHandlerImpl$deleteAiConversation$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ActionV2Request $actionRequest;
    final /* synthetic */ ActionV2Repository $actionV2Repository;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ Map<String, String> $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeleteAiConversationActionHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteAiConversationActionHandlerImpl$deleteAiConversation$1(ActionV2Repository actionV2Repository, ActionV2Request actionV2Request, DeleteAiConversationActionHandlerImpl deleteAiConversationActionHandlerImpl, CustomActionHandler.HandlerReferences handlerReferences, Map<String, String> map, d<? super DeleteAiConversationActionHandlerImpl$deleteAiConversation$1> dVar) {
        super(2, dVar);
        this.$actionV2Repository = actionV2Repository;
        this.$actionRequest = actionV2Request;
        this.this$0 = deleteAiConversationActionHandlerImpl;
        this.$handlerRefs = handlerReferences;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DeleteAiConversationActionHandlerImpl$deleteAiConversation$1 deleteAiConversationActionHandlerImpl$deleteAiConversation$1 = new DeleteAiConversationActionHandlerImpl$deleteAiConversation$1(this.$actionV2Repository, this.$actionRequest, this.this$0, this.$handlerRefs, this.$params, dVar);
        deleteAiConversationActionHandlerImpl$deleteAiConversation$1.L$0 = obj;
        return deleteAiConversationActionHandlerImpl$deleteAiConversation$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r1 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (r1 == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        RecyclerView recyclerView;
        Object deleteAllCells;
        String str;
        Object deleteCell;
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
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.L$0;
                s.b(obj);
                a11 = obj2;
                DeleteAiConversationActionHandlerImpl deleteAiConversationActionHandlerImpl = this.this$0;
                CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
                if (r.b(a11) != null) {
                    deleteAiConversationActionHandlerImpl.showErrorNotification(handlerReferences);
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        a11 = (ActionV2Response) obj;
        r.Companion companion3 = r.INSTANCE;
        DeleteAiConversationActionHandlerImpl deleteAiConversationActionHandlerImpl2 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences2 = this.$handlerRefs;
        Map<String, String> map = this.$params;
        if (!(a11 instanceof r.b)) {
            recyclerView = deleteAiConversationActionHandlerImpl2.getRecyclerView(handlerReferences2);
            if (((ActionV2Response) a11).getError() != null || recyclerView == null) {
                deleteAiConversationActionHandlerImpl2.showErrorNotification(handlerReferences2);
            } else {
                if (map == null || (str = map.get("conversationId")) == null || str.length() == 0) {
                    this.L$0 = a11;
                    this.label = 2;
                    deleteAllCells = deleteAiConversationActionHandlerImpl2.deleteAllCells(handlerReferences2, recyclerView, this);
                } else {
                    this.L$0 = a11;
                    this.label = 3;
                    deleteCell = deleteAiConversationActionHandlerImpl2.deleteCell(handlerReferences2, recyclerView, this);
                }
                a11 = obj2;
            }
        }
        DeleteAiConversationActionHandlerImpl deleteAiConversationActionHandlerImpl3 = this.this$0;
        CustomActionHandler.HandlerReferences handlerReferences3 = this.$handlerRefs;
        if (r.b(a11) != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DeleteAiConversationActionHandlerImpl$deleteAiConversation$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
