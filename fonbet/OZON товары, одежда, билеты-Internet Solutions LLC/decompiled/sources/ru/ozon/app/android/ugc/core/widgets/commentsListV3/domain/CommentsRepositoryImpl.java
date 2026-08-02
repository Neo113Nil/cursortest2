package ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import B0.A0;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ActionName;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsV3Mapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.ReplyCommentDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.ReplyCommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJU\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00112\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00112\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R$\u0010(\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsRepositoryImpl;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsRepository;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsMapper;", "commentsMapper", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsV3Mapper;", "commentsV3Mapper", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsMapper;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsV3Mapper;)V", "", "", "actionParams", "comment", "reviewUuid", "commentUuid", "itemId", "", "prepareNewCommentRequest", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "prepareDeleteCommentRequest", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "LAe/h;", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "fetchComments", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)LAe/h;", "parentUuid", "sendComment", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LSc/r;", "", "deleteComment-BWLJW6A", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "deleteComment", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsMapper;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsV3Mapper;", "scrollToCommentUuid", "Ljava/lang/String;", "getScrollToCommentUuid", "()Ljava/lang/String;", "setScrollToCommentUuid", "(Ljava/lang/String;)V", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsRepositoryImpl implements CommentsRepository {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final CommentsMapper commentsMapper;

    @NotNull
    private final CommentsV3Mapper commentsV3Mapper;
    private String scrollToCommentUuid;

    public CommentsRepositoryImpl(@NotNull ActionV2Repository actionV2Repository, @NotNull CommentsMapper commentsMapper, @NotNull CommentsV3Mapper commentsV3Mapper) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(commentsMapper, "commentsMapper");
        Intrinsics.checkNotNullParameter(commentsV3Mapper, "commentsV3Mapper");
        this.actionV2Repository = actionV2Repository;
        this.commentsMapper = commentsMapper;
        this.commentsV3Mapper = commentsV3Mapper;
    }

    private final Map<String, String> prepareDeleteCommentRequest(Map<String, String> actionParams, String commentUuid, String itemId) {
        if (actionParams == null) {
            actionParams = U.c();
        }
        LinkedHashMap u11 = U.u(actionParams);
        u11.put("itemId", itemId);
        u11.put("commentUuid", commentUuid);
        return u11;
    }

    private final Map<String, String> prepareNewCommentRequest(Map<String, String> actionParams, String comment, String reviewUuid, String commentUuid, String itemId) {
        if (actionParams == null) {
            actionParams = U.c();
        }
        LinkedHashMap u11 = U.u(actionParams);
        u11.put("comment", comment);
        if (reviewUuid != null) {
            u11.put("reviewUuid", reviewUuid);
        }
        u11.put("itemId", itemId);
        if (commentUuid != null) {
            u11.put("parentUuid", commentUuid);
        }
        return u11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsRepository
    /* renamed from: deleteComment-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo1479deleteCommentBWLJW6A(@NotNull AtomAction.ComposerAction composerAction, @NotNull String str, @NotNull String str2, @NotNull d<? super r<? extends Object>> dVar) {
        CommentsRepositoryImpl$deleteComment$1 commentsRepositoryImpl$deleteComment$1;
        int i11;
        Object mo479requestActionResult0E7RQCE;
        if (dVar instanceof CommentsRepositoryImpl$deleteComment$1) {
            commentsRepositoryImpl$deleteComment$1 = (CommentsRepositoryImpl$deleteComment$1) dVar;
            int i12 = commentsRepositoryImpl$deleteComment$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                commentsRepositoryImpl$deleteComment$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = commentsRepositoryImpl$deleteComment$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = commentsRepositoryImpl$deleteComment$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    Map<String, String> prepareDeleteCommentRequest = prepareDeleteCommentRequest(composerAction.getParams(), str, str2);
                    ActionV2Repository actionV2Repository = this.actionV2Repository;
                    ActionV2Request actionV2Request = new ActionV2Request(prepareDeleteCommentRequest, composerAction.getActionName(), false, 4, null);
                    commentsRepositoryImpl$deleteComment$1.label = 1;
                    mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, Object.class, commentsRepositoryImpl$deleteComment$1);
                    if (mo479requestActionResult0E7RQCE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
                }
                r.Companion companion = r.INSTANCE;
                if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
                    return mo479requestActionResult0E7RQCE;
                }
                try {
                    Object data = ((ActionV2Response) mo479requestActionResult0E7RQCE).getData();
                    if (data != null) {
                        return data;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                } catch (Throwable th2) {
                    r.Companion companion2 = r.INSTANCE;
                    return s.a(th2);
                }
            }
        }
        commentsRepositoryImpl$deleteComment$1 = new CommentsRepositoryImpl$deleteComment$1(this, dVar);
        Object obj2 = commentsRepositoryImpl$deleteComment$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = commentsRepositoryImpl$deleteComment$1.label;
        if (i11 != 0) {
        }
        r.Companion companion3 = r.INSTANCE;
        if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
        }
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsRepository
    @NotNull
    public InterfaceC2395h<List<CommentsAdapterVO>> fetchComments(@NotNull AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return C2399j.A(new CommentsRepositoryImpl$fetchComments$1(action, this, null));
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsRepository
    public String getScrollToCommentUuid() {
        return this.scrollToCommentUuid;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendComment(@NotNull AtomAction.ComposerAction composerAction, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull d<? super CommentsAdapterVO> dVar) {
        CommentsRepositoryImpl$sendComment$1 commentsRepositoryImpl$sendComment$1;
        int i11;
        Object mo479requestActionResult0E7RQCE;
        String str5;
        AtomAction.ComposerAction composerAction2;
        CommentsRepositoryImpl commentsRepositoryImpl;
        Object mo479requestActionResult0E7RQCE2;
        String str6;
        AtomAction.ComposerAction composerAction3;
        CommentsRepositoryImpl commentsRepositoryImpl2;
        Object data;
        Object data2;
        if (dVar instanceof CommentsRepositoryImpl$sendComment$1) {
            commentsRepositoryImpl$sendComment$1 = (CommentsRepositoryImpl$sendComment$1) dVar;
            int i12 = commentsRepositoryImpl$sendComment$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                commentsRepositoryImpl$sendComment$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                CommentsRepositoryImpl$sendComment$1 commentsRepositoryImpl$sendComment$12 = commentsRepositoryImpl$sendComment$1;
                Object obj = commentsRepositoryImpl$sendComment$12.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = commentsRepositoryImpl$sendComment$12.label;
                if (i11 == 0) {
                    if (i11 == 1) {
                        str6 = (String) commentsRepositoryImpl$sendComment$12.L$2;
                        composerAction3 = (AtomAction.ComposerAction) commentsRepositoryImpl$sendComment$12.L$1;
                        commentsRepositoryImpl2 = (CommentsRepositoryImpl) commentsRepositoryImpl$sendComment$12.L$0;
                        s.b(obj);
                        mo479requestActionResult0E7RQCE2 = ((r) obj).getF26106a();
                        s.b(mo479requestActionResult0E7RQCE2);
                        data = ((ActionV2Response) mo479requestActionResult0E7RQCE2).getData();
                        if (data != null) {
                            throw new IllegalStateException(A0.b("data in ", composerAction3.getActionName(), " is null").toString());
                        }
                        CommentV3DTO comment = ((ReplyCommentV3DTO) data).getComment();
                        if (comment == null) {
                            return null;
                        }
                        return commentsRepositoryImpl2.commentsV3Mapper.toCommentV3VO(comment, str6 != null);
                    }
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str5 = (String) commentsRepositoryImpl$sendComment$12.L$2;
                    composerAction2 = (AtomAction.ComposerAction) commentsRepositoryImpl$sendComment$12.L$1;
                    commentsRepositoryImpl = (CommentsRepositoryImpl) commentsRepositoryImpl$sendComment$12.L$0;
                    s.b(obj);
                    mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
                    s.b(mo479requestActionResult0E7RQCE);
                    data2 = ((ActionV2Response) mo479requestActionResult0E7RQCE).getData();
                    if (data2 != null) {
                        throw new IllegalStateException(A0.b("data in ", composerAction2.getActionName(), " is null").toString());
                    }
                    CommentsDTO.CommentDTO comment2 = ((ReplyCommentDTO) data2).getComment();
                    if (comment2 == null) {
                        return null;
                    }
                    return CommentsMapper.toCommentVo$default(commentsRepositoryImpl.commentsMapper, comment2, str5 != null, false, 4, null);
                }
                s.b(obj);
                boolean d11 = Intrinsics.d(composerAction.getId(), ActionName.CREATE_COMMENT_V4.getAction());
                Map<String, String> prepareNewCommentRequest = prepareNewCommentRequest(composerAction.getParams(), str, !d11 ? str3 : null, str4, str2);
                if (d11) {
                    ActionV2Repository actionV2Repository = this.actionV2Repository;
                    String actionName = composerAction.getActionName();
                    if (prepareNewCommentRequest == null) {
                        prepareNewCommentRequest = composerAction.getParams();
                    }
                    ActionV2Request actionV2Request = new ActionV2Request(prepareNewCommentRequest, actionName, false, 4, null);
                    commentsRepositoryImpl$sendComment$12.L$0 = this;
                    commentsRepositoryImpl$sendComment$12.L$1 = composerAction;
                    commentsRepositoryImpl$sendComment$12.L$2 = str4;
                    commentsRepositoryImpl$sendComment$12.label = 1;
                    mo479requestActionResult0E7RQCE2 = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, ReplyCommentV3DTO.class, commentsRepositoryImpl$sendComment$12);
                    if (mo479requestActionResult0E7RQCE2 != aVar) {
                        str6 = str4;
                        composerAction3 = composerAction;
                        commentsRepositoryImpl2 = this;
                        s.b(mo479requestActionResult0E7RQCE2);
                        data = ((ActionV2Response) mo479requestActionResult0E7RQCE2).getData();
                        if (data != null) {
                        }
                    }
                } else {
                    ActionV2Repository actionV2Repository2 = this.actionV2Repository;
                    String actionName2 = composerAction.getActionName();
                    if (prepareNewCommentRequest == null) {
                        prepareNewCommentRequest = composerAction.getParams();
                    }
                    ActionV2Request actionV2Request2 = new ActionV2Request(prepareNewCommentRequest, actionName2, false, 4, null);
                    commentsRepositoryImpl$sendComment$12.L$0 = this;
                    commentsRepositoryImpl$sendComment$12.L$1 = composerAction;
                    commentsRepositoryImpl$sendComment$12.L$2 = str4;
                    commentsRepositoryImpl$sendComment$12.label = 2;
                    mo479requestActionResult0E7RQCE = actionV2Repository2.mo479requestActionResult0E7RQCE(actionV2Request2, ReplyCommentDTO.class, commentsRepositoryImpl$sendComment$12);
                    if (mo479requestActionResult0E7RQCE != aVar) {
                        str5 = str4;
                        composerAction2 = composerAction;
                        commentsRepositoryImpl = this;
                        s.b(mo479requestActionResult0E7RQCE);
                        data2 = ((ActionV2Response) mo479requestActionResult0E7RQCE).getData();
                        if (data2 != null) {
                        }
                    }
                }
                return aVar;
            }
        }
        commentsRepositoryImpl$sendComment$1 = new CommentsRepositoryImpl$sendComment$1(this, dVar);
        CommentsRepositoryImpl$sendComment$1 commentsRepositoryImpl$sendComment$122 = commentsRepositoryImpl$sendComment$1;
        Object obj2 = commentsRepositoryImpl$sendComment$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = commentsRepositoryImpl$sendComment$122.label;
        if (i11 == 0) {
        }
    }

    public void setScrollToCommentUuid(String str) {
        this.scrollToCommentUuid = str;
    }
}
