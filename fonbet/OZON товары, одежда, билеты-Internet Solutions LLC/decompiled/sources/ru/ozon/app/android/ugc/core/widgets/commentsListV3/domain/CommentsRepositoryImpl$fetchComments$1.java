package ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain;

import Ae.InterfaceC2397i;
import B0.A0;
import Sc.r;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ActionName;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsV3DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsV3Mapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LAe/i;", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsRepositoryImpl$fetchComments$1", f = "CommentsRepository.kt", l = {156, 172, UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommentsRepositoryImpl$fetchComments$1 extends j implements Function2<InterfaceC2397i<? super List<? extends CommentsAdapterVO>>, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CommentsRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentsRepositoryImpl$fetchComments$1(AtomAction.ComposerAction composerAction, CommentsRepositoryImpl commentsRepositoryImpl, d<? super CommentsRepositoryImpl$fetchComments$1> dVar) {
        super(2, dVar);
        this.$action = composerAction;
        this.this$0 = commentsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CommentsRepositoryImpl$fetchComments$1 commentsRepositoryImpl$fetchComments$1 = new CommentsRepositoryImpl$fetchComments$1(this.$action, this.this$0, dVar);
        commentsRepositoryImpl$fetchComments$1.L$0 = obj;
        return commentsRepositoryImpl$fetchComments$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super List<? extends CommentsAdapterVO>> interfaceC2397i, d<? super Unit> dVar) {
        return ((CommentsRepositoryImpl$fetchComments$1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0153, code lost:
    
        if (r7.emit(r2, r17) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        Collection collection;
        CommentsRepositoryImpl commentsRepositoryImpl;
        AtomAction.ComposerAction composerAction;
        Object obj2;
        CommentsRepositoryImpl commentsRepositoryImpl2;
        Object obj3;
        AtomAction.ComposerAction composerAction2;
        Object data;
        CommentsV3Mapper commentsV3Mapper;
        Object data2;
        CommentsMapper commentsMapper;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i2 = (InterfaceC2397i) this.L$0;
            if (Intrinsics.d(this.$action.getId(), ActionName.GET_COMMENTS_LIST_V2.getAction())) {
                CommentsRepositoryImpl commentsRepositoryImpl3 = this.this$0;
                AtomAction.ComposerAction composerAction3 = this.$action;
                ActionV2Repository actionV2Repository = commentsRepositoryImpl3.actionV2Repository;
                ActionV2Request actionV2Request = new ActionV2Request(composerAction3.getParams(), composerAction3.getActionName(), false, 4, null);
                this.L$0 = interfaceC2397i2;
                this.L$1 = composerAction3;
                this.L$2 = commentsRepositoryImpl3;
                this.label = 1;
                Object mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, CommentsV3DTO.class, this);
                if (mo479requestActionResult0E7RQCE != aVar) {
                    interfaceC2397i = interfaceC2397i2;
                    commentsRepositoryImpl2 = commentsRepositoryImpl3;
                    obj3 = mo479requestActionResult0E7RQCE;
                    composerAction2 = composerAction3;
                    s.b(obj3);
                    data = ((ActionV2Response) obj3).getData();
                    if (data != null) {
                    }
                }
            } else if (h.t(this.$action.getActionName(), ActionName.REVIEW_COMMENT_V4.getAction(), false)) {
                CommentsRepositoryImpl commentsRepositoryImpl4 = this.this$0;
                AtomAction.ComposerAction composerAction4 = this.$action;
                ActionV2Repository actionV2Repository2 = commentsRepositoryImpl4.actionV2Repository;
                ActionV2Request actionV2Request2 = new ActionV2Request(composerAction4.getParams(), composerAction4.getActionName(), false, 4, null);
                this.L$0 = interfaceC2397i2;
                this.L$1 = composerAction4;
                this.L$2 = commentsRepositoryImpl4;
                this.label = 2;
                Object mo479requestActionResult0E7RQCE2 = actionV2Repository2.mo479requestActionResult0E7RQCE(actionV2Request2, CommentsDTO.class, this);
                if (mo479requestActionResult0E7RQCE2 != aVar) {
                    interfaceC2397i = interfaceC2397i2;
                    commentsRepositoryImpl = commentsRepositoryImpl4;
                    composerAction = composerAction4;
                    obj2 = mo479requestActionResult0E7RQCE2;
                    s.b(obj2);
                    data2 = ((ActionV2Response) obj2).getData();
                    if (data2 != null) {
                    }
                }
            } else {
                interfaceC2397i = interfaceC2397i2;
                collection = K.f71697a;
            }
            return aVar;
        }
        if (i11 == 1) {
            commentsRepositoryImpl2 = (CommentsRepositoryImpl) this.L$2;
            composerAction2 = (AtomAction.ComposerAction) this.L$1;
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            s.b(obj);
            obj3 = ((r) obj).getF26106a();
            s.b(obj3);
            data = ((ActionV2Response) obj3).getData();
            if (data != null) {
                throw new IllegalStateException(A0.b("data in ", composerAction2.getActionName(), " is null").toString());
            }
            CommentsV3DTO commentsV3DTO = (CommentsV3DTO) data;
            commentsRepositoryImpl2.setScrollToCommentUuid(commentsV3DTO.getCommentUuid());
            commentsV3Mapper = commentsRepositoryImpl2.commentsV3Mapper;
            collection = commentsV3Mapper.toCommentsListVo(commentsV3DTO);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            commentsRepositoryImpl = (CommentsRepositoryImpl) this.L$2;
            composerAction = (AtomAction.ComposerAction) this.L$1;
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            s.b(obj);
            obj2 = ((r) obj).getF26106a();
            s.b(obj2);
            data2 = ((ActionV2Response) obj2).getData();
            if (data2 != null) {
                throw new IllegalStateException(A0.b("data in ", composerAction.getActionName(), " is null").toString());
            }
            CommentsDTO commentsDTO = (CommentsDTO) data2;
            commentsRepositoryImpl.setScrollToCommentUuid(commentsDTO.getCommentUuid());
            commentsMapper = commentsRepositoryImpl.commentsMapper;
            collection = commentsMapper.toCommentsListVo(commentsDTO);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 3;
    }
}
