package ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.o;
import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ComposerExtKt;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsListVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentVO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J%\u0010&\u001a\u00020\"*\u00020\"2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b&\u0010'J3\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u0006*\b\u0012\u0004\u0012\u00020(0\u000b2\u0006\u0010)\u001a\u00020\u00102\n\b\u0002\u0010*\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b+\u0010,J,\u00100\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0/2\u0006\u0010.\u001a\u00020-H\u0086@¢\u0006\u0004\b0\u00101J6\u00103\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0018\u00010/2\u0006\u00102\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b3\u00104J8\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b072\u0006\u0010\u0018\u001a\u00020\t2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t05H\u0086@¢\u0006\u0004\b8\u00109J3\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\b\u0010;\u001a\u0004\u0018\u00010\t2\b\u0010<\u001a\u0004\u0018\u00010\t2\b\u0010=\u001a\u0004\u0018\u00010#¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b@\u0010AJ/\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\u0006\u0010B\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b&\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010DR\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010G¨\u0006H"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsGateway;", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsRepository;", "commentsRepository", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsRepository;)V", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "newCommentVo", "", "parentUuid", "", "addComment", "(Ljava/util/List;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;Ljava/lang/String;)Ljava/util/List;", "addToBegin", "(Ljava/util/List;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;)Ljava/util/List;", "", "commentPosition", "addAfterPos", "(Ljava/util/List;ILru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;)Ljava/util/List;", "oldCommentUuid", "newComment", "replaceComment", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;)Ljava/util/List;", "commentUuid", "removeComment", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "newComments", "", "refreshCache", "(Ljava/util/List;)V", "addedValue", "updateCommentsCount", "(I)V", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;", "", "isSelected", "actionId", "updateReactionState", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;ZLjava/lang/String;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO$Control;", "position", "selected", "switchControlState", "(Ljava/util/List;ILjava/lang/Boolean;)Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;", "commentsListVO", "Lkotlin/Pair;", "loadComments", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "comment", "sendComment", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "params", "LSc/r;", "deleteComment-0E7RQCE", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "deleteComment", "authorId", "sellerId", "isSubscribe", "updateCommentsSocialHeader", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/util/List;", "getReplyTo", "(Ljava/lang/String;)Ljava/lang/String;", "uuid", "(Ljava/lang/String;ZLjava/lang/String;)Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsRepository;", "_commentsCache", "Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsListVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsGateway {
    private List<CommentsAdapterVO> _commentsCache;
    private CommentsListVO commentsListVO;

    @NotNull
    private final CommentsRepository commentsRepository;

    public CommentsGateway(@NotNull CommentsRepository commentsRepository) {
        Intrinsics.checkNotNullParameter(commentsRepository, "commentsRepository");
        this.commentsRepository = commentsRepository;
    }

    private final List<CommentsAdapterVO> addAfterPos(List<CommentsAdapterVO> list, int i11, CommentsAdapterVO commentsAdapterVO) {
        CommentsAdapterVO copy$default;
        CommentsAdapterVO commentsAdapterVO2 = list.get(i11);
        boolean z11 = commentsAdapterVO2 instanceof CommentVO;
        CommentVO commentVO = z11 ? (CommentVO) commentsAdapterVO2 : null;
        boolean isLast = commentVO != null ? commentVO.getIsLast() : false;
        if (z11) {
            CommentVO commentVO2 = (CommentVO) commentsAdapterVO2;
            replaceComment(list, commentVO2.getUuid(), CommentVO.copy$default(commentVO2, 0L, null, null, null, null, false, false, false, true, null, null, null, null, false, false, false, null, null, 228991, null));
        }
        List<CommentsAdapterVO> subList = list.subList(i11 + 1, list.size());
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            if (!((CommentsAdapterVO) obj).getIsNested()) {
                break;
            }
            arrayList.add(obj);
        }
        int size = arrayList.size() + i11;
        CommentsAdapterVO commentsAdapterVO3 = list.get(size);
        if (commentsAdapterVO3 instanceof CommentVO) {
            CommentVO commentVO3 = (CommentVO) commentsAdapterVO3;
            replaceComment(list, commentVO3.getUuid(), CommentVO.copy$default(commentVO3, 0L, null, null, null, null, false, false, false, false, null, null, null, null, false, false, false, null, null, 262015, null));
        }
        if (commentsAdapterVO instanceof CommentVO) {
            copy$default = CommentVO.copy$default((CommentVO) commentsAdapterVO, 0L, null, null, null, null, false, true, true, false, null, null, null, null, false, false, isLast, null, null, 229183, null);
        } else {
            if (!(commentsAdapterVO instanceof CommentV3VO)) {
                throw new o();
            }
            copy$default = CommentV3VO.copy$default((CommentV3VO) commentsAdapterVO, 0L, null, null, null, true, null, 47, null);
        }
        list.add(size + 1, copy$default);
        return list;
    }

    private final List<CommentsAdapterVO> addComment(List<CommentsAdapterVO> list, CommentsAdapterVO commentsAdapterVO, String str) {
        int i11;
        CommentsAdapterVO commentsAdapterVO2 = commentsAdapterVO;
        ListIterator<CommentsAdapterVO> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(listIterator.previous().getUuid(), str)) {
                i11 = listIterator.nextIndex();
                break;
            }
        }
        if (i11 == -1) {
            if (commentsAdapterVO2 instanceof CommentVO) {
                commentsAdapterVO2 = CommentVO.copy$default((CommentVO) commentsAdapterVO2, 0L, null, null, null, null, false, false, false, false, null, null, null, null, false, true, false, null, null, 245759, null);
            }
            addToBegin(list, commentsAdapterVO2);
        } else {
            addAfterPos(list, i11, commentsAdapterVO2);
        }
        updateCommentsCount(1);
        return list;
    }

    private final List<CommentsAdapterVO> addToBegin(List<CommentsAdapterVO> list, CommentsAdapterVO commentsAdapterVO) {
        CommentsAdapterVO commentsAdapterVO2 = (CommentsAdapterVO) C7714v.M(list);
        if (commentsAdapterVO2 != null) {
            String uuid = commentsAdapterVO2.getUuid();
            if (commentsAdapterVO2 instanceof CommentVO) {
                commentsAdapterVO2 = CommentVO.copy$default((CommentVO) commentsAdapterVO2, 0L, null, null, null, null, false, false, false, false, null, null, null, null, false, false, false, null, null, 245759, null);
            }
            replaceComment(list, uuid, commentsAdapterVO2);
        }
        list.add(0, commentsAdapterVO);
        return list;
    }

    private final void refreshCache(List<? extends CommentsAdapterVO> newComments) {
        this._commentsCache = C7714v.W0(newComments);
    }

    private final List<CommentsAdapterVO> removeComment(List<CommentsAdapterVO> list, String str) {
        Iterator<CommentsAdapterVO> it = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(it.next().getUuid(), str)) {
                break;
            }
            i11++;
        }
        if (i11 >= 0) {
            CommentsAdapterVO commentsAdapterVO = list.get(i11);
            if ((commentsAdapterVO instanceof CommentVO) && ((CommentVO) commentsAdapterVO).getIsLastNested()) {
                Object Q11 = C7714v.Q(i11 - 1, list);
                CommentVO commentVO = Q11 instanceof CommentVO ? (CommentVO) Q11 : null;
                if (commentVO != null) {
                    replaceComment(list, commentVO.getUuid(), CommentVO.copy$default(commentVO, 0L, null, null, null, null, false, false, commentVO.getIsNested(), false, null, null, null, null, false, false, false, null, null, 261759, null));
                }
            }
            list.remove(commentsAdapterVO);
            updateCommentsCount(-1);
        }
        return list;
    }

    private final List<CommentsAdapterVO> replaceComment(List<CommentsAdapterVO> list, String str, CommentsAdapterVO commentsAdapterVO) {
        CommentsAdapterVO copy$default;
        Iterator<CommentsAdapterVO> it = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(it.next().getUuid(), str)) {
                break;
            }
            i11++;
        }
        if (i11 < 0) {
            return list;
        }
        CommentsAdapterVO commentsAdapterVO2 = list.get(i11);
        if (commentsAdapterVO instanceof CommentVO) {
            copy$default = CommentVO.copy$default((CommentVO) commentsAdapterVO, 0L, null, null, null, null, false, commentsAdapterVO2.getIsNested(), false, false, null, null, null, null, false, false, false, null, null, 262079, null);
        } else {
            if (!(commentsAdapterVO instanceof CommentV3VO)) {
                throw new o();
            }
            copy$default = CommentV3VO.copy$default((CommentV3VO) commentsAdapterVO, 0L, null, null, null, commentsAdapterVO2.getIsNested(), null, 47, null);
        }
        list.set(i11, copy$default);
        return list;
    }

    private final List<CommentV3DTO.Control> switchControlState(List<CommentV3DTO.Control> list, int i11, Boolean bool) {
        ArrayList W02 = C7714v.W0(list);
        CommentV3DTO.Control control = (CommentV3DTO.Control) W02.get(i11);
        W02.set(i11, CommentV3DTO.Control.copy$default(control, bool != null ? bool.booleanValue() : !control.isSelected(), null, null, null, null, 30, null));
        return W02;
    }

    private final void updateCommentsCount(int addedValue) {
        CommentsListVO commentsListVO;
        CommentsListVO commentsListVO2 = this.commentsListVO;
        if (commentsListVO2 != null) {
            commentsListVO = CommentsListVO.copy$default(commentsListVO2, 0L, null, (commentsListVO2 != null ? commentsListVO2.getTotalCount() : 0) + addedValue, null, null, null, null, null, null, null, 1019, null);
        } else {
            commentsListVO = null;
        }
        this.commentsListVO = commentsListVO;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: deleteComment-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1478deleteComment0E7RQCE(@NotNull String str, @NotNull Map<String, String> map, @NotNull d<? super r<? extends List<? extends CommentsAdapterVO>>> dVar) {
        CommentsGateway$deleteComment$1 commentsGateway$deleteComment$1;
        int i11;
        String str2;
        List<CommentsAdapterVO> list;
        Object obj;
        CommentsGateway commentsGateway;
        if (dVar instanceof CommentsGateway$deleteComment$1) {
            commentsGateway$deleteComment$1 = (CommentsGateway$deleteComment$1) dVar;
            int i12 = commentsGateway$deleteComment$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                commentsGateway$deleteComment$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = commentsGateway$deleteComment$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = commentsGateway$deleteComment$1.label;
                if (i11 != 0) {
                    s.b(obj2);
                    List<CommentsAdapterVO> list2 = this._commentsCache;
                    CommentsListVO commentsListVO = this.commentsListVO;
                    AtomAction removeCommentAction = commentsListVO != null ? commentsListVO.getRemoveCommentAction() : null;
                    AtomAction.ComposerAction composerAction = removeCommentAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) removeCommentAction : null;
                    if (list2 == null || commentsListVO == null || composerAction == null) {
                        r.Companion companion = r.INSTANCE;
                        return s.a(new IllegalStateException("missing comments"));
                    }
                    CommentsRepository commentsRepository = this.commentsRepository;
                    AtomAction.ComposerAction addAdditionalParams = ComposerExtKt.addAdditionalParams(composerAction, map);
                    String itemId = commentsListVO.getItemId();
                    commentsGateway$deleteComment$1.L$0 = this;
                    commentsGateway$deleteComment$1.L$1 = str;
                    commentsGateway$deleteComment$1.L$2 = list2;
                    commentsGateway$deleteComment$1.label = 1;
                    Object mo1479deleteCommentBWLJW6A = commentsRepository.mo1479deleteCommentBWLJW6A(addAdditionalParams, str, itemId, commentsGateway$deleteComment$1);
                    if (mo1479deleteCommentBWLJW6A == aVar) {
                        return aVar;
                    }
                    str2 = str;
                    list = list2;
                    obj = mo1479deleteCommentBWLJW6A;
                    commentsGateway = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) commentsGateway$deleteComment$1.L$2;
                    str2 = (String) commentsGateway$deleteComment$1.L$1;
                    commentsGateway = (CommentsGateway) commentsGateway$deleteComment$1.L$0;
                    s.b(obj2);
                    obj = ((r) obj2).getF26106a();
                }
                r.Companion companion2 = r.INSTANCE;
                if (!(obj instanceof r.b)) {
                    return obj;
                }
                try {
                    List<CommentsAdapterVO> removeComment = commentsGateway.removeComment(list, str2);
                    commentsGateway.refreshCache(removeComment);
                    return removeComment;
                } catch (Throwable th2) {
                    r.Companion companion3 = r.INSTANCE;
                    return s.a(th2);
                }
            }
        }
        commentsGateway$deleteComment$1 = new CommentsGateway$deleteComment$1(this, dVar);
        Object obj22 = commentsGateway$deleteComment$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = commentsGateway$deleteComment$1.label;
        if (i11 != 0) {
        }
        r.Companion companion22 = r.INSTANCE;
        if (!(obj instanceof r.b)) {
        }
    }

    @NotNull
    public final String getReplyTo(@NotNull String commentUuid) {
        CommentsAdapterVO commentsAdapterVO;
        Object obj;
        Intrinsics.checkNotNullParameter(commentUuid, "commentUuid");
        List<CommentsAdapterVO> list = this._commentsCache;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((CommentsAdapterVO) obj).getUuid(), commentUuid)) {
                    break;
                }
            }
            commentsAdapterVO = (CommentsAdapterVO) obj;
        } else {
            commentsAdapterVO = null;
        }
        String authorName = commentsAdapterVO != null ? commentsAdapterVO.getAuthorName() : null;
        return authorName == null ? "" : authorName;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadComments(@NotNull CommentsListVO commentsListVO, @NotNull d<? super Pair<String, ? extends List<? extends CommentsAdapterVO>>> dVar) {
        CommentsGateway$loadComments$1 commentsGateway$loadComments$1;
        int i11;
        CommentsGateway commentsGateway;
        if (dVar instanceof CommentsGateway$loadComments$1) {
            commentsGateway$loadComments$1 = (CommentsGateway$loadComments$1) dVar;
            int i12 = commentsGateway$loadComments$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                commentsGateway$loadComments$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = commentsGateway$loadComments$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = commentsGateway$loadComments$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    this.commentsListVO = commentsListVO;
                    CommentsRepository commentsRepository = this.commentsRepository;
                    AtomAction loadCommentsAction = commentsListVO.getLoadCommentsAction();
                    Intrinsics.g(loadCommentsAction, "null cannot be cast to non-null type ru.ozon.uni.atoms.af.AtomAction.ComposerAction");
                    InterfaceC2395h<List<CommentsAdapterVO>> fetchComments = commentsRepository.fetchComments((AtomAction.ComposerAction) loadCommentsAction);
                    commentsGateway$loadComments$1.L$0 = this;
                    commentsGateway$loadComments$1.label = 1;
                    obj = C2399j.u(fetchComments, commentsGateway$loadComments$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    commentsGateway = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    commentsGateway = (CommentsGateway) commentsGateway$loadComments$1.L$0;
                    s.b(obj);
                }
                List<? extends CommentsAdapterVO> list = (List) obj;
                commentsGateway.refreshCache(list);
                return new Pair(commentsGateway.commentsRepository.getScrollToCommentUuid(), list);
            }
        }
        commentsGateway$loadComments$1 = new CommentsGateway$loadComments$1(this, dVar);
        Object obj2 = commentsGateway$loadComments$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = commentsGateway$loadComments$1.label;
        if (i11 != 0) {
        }
        List<? extends CommentsAdapterVO> list2 = (List) obj2;
        commentsGateway.refreshCache(list2);
        return new Pair(commentsGateway.commentsRepository.getScrollToCommentUuid(), list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendComment(@NotNull String str, String str2, @NotNull d<? super Pair<String, ? extends List<? extends CommentsAdapterVO>>> dVar) {
        CommentsGateway$sendComment$1 commentsGateway$sendComment$1;
        int i11;
        CommentsGateway commentsGateway;
        List<CommentsAdapterVO> list;
        CommentsAdapterVO commentsAdapterVO;
        if (dVar instanceof CommentsGateway$sendComment$1) {
            commentsGateway$sendComment$1 = (CommentsGateway$sendComment$1) dVar;
            int i12 = commentsGateway$sendComment$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                commentsGateway$sendComment$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                CommentsGateway$sendComment$1 commentsGateway$sendComment$12 = commentsGateway$sendComment$1;
                Object obj = commentsGateway$sendComment$12.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = commentsGateway$sendComment$12.label;
                if (i11 != 0) {
                    s.b(obj);
                    List<CommentsAdapterVO> list2 = this._commentsCache;
                    CommentsListVO commentsListVO = this.commentsListVO;
                    if (list2 == null || commentsListVO == null) {
                        return null;
                    }
                    AtomAction createCommentAction = commentsListVO.getCreateCommentAction();
                    AtomAction.ComposerAction composerAction = createCommentAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) createCommentAction : null;
                    if (composerAction == null) {
                        commentsGateway = this;
                        list = list2;
                        commentsAdapterVO = null;
                        if (commentsAdapterVO == null) {
                            return null;
                        }
                        List<CommentsAdapterVO> addComment = commentsGateway.addComment(list, commentsAdapterVO, str2);
                        commentsGateway.refreshCache(addComment);
                        return new Pair(commentsAdapterVO.getUuid(), addComment);
                    }
                    CommentsRepository commentsRepository = this.commentsRepository;
                    String reviewUuid = commentsListVO.getReviewUuid();
                    String itemId = commentsListVO.getItemId();
                    commentsGateway$sendComment$12.L$0 = this;
                    commentsGateway$sendComment$12.L$1 = str2;
                    commentsGateway$sendComment$12.L$2 = list2;
                    commentsGateway$sendComment$12.label = 1;
                    Object sendComment = commentsRepository.sendComment(composerAction, str, itemId, reviewUuid, str2, commentsGateway$sendComment$12);
                    if (sendComment == aVar) {
                        return aVar;
                    }
                    obj = sendComment;
                    list = list2;
                    commentsGateway = this;
                    str2 = str2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) commentsGateway$sendComment$12.L$2;
                    str2 = (String) commentsGateway$sendComment$12.L$1;
                    commentsGateway = (CommentsGateway) commentsGateway$sendComment$12.L$0;
                    s.b(obj);
                }
                commentsAdapterVO = (CommentsAdapterVO) obj;
                if (commentsAdapterVO == null) {
                }
            }
        }
        commentsGateway$sendComment$1 = new CommentsGateway$sendComment$1(this, dVar);
        CommentsGateway$sendComment$1 commentsGateway$sendComment$122 = commentsGateway$sendComment$1;
        Object obj2 = commentsGateway$sendComment$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = commentsGateway$sendComment$122.label;
        if (i11 != 0) {
        }
        commentsAdapterVO = (CommentsAdapterVO) obj2;
        if (commentsAdapterVO == null) {
        }
    }

    public final List<CommentsAdapterVO> updateCommentsSocialHeader(String authorId, String sellerId, Boolean isSubscribe) {
        ArrayList arrayList;
        List<CommentsAdapterVO> list = this._commentsCache;
        if (list != null) {
            List<CommentsAdapterVO> list2 = list;
            arrayList = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((CommentsAdapterVO) it.next()).updateSubscribeState(authorId, sellerId, isSubscribe));
            }
        } else {
            arrayList = null;
        }
        this._commentsCache = arrayList != null ? C7714v.W0(arrayList) : null;
        return arrayList;
    }

    public final List<CommentsAdapterVO> updateReactionState(@NotNull String uuid, boolean isSelected, String actionId) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        List<CommentsAdapterVO> list = this._commentsCache;
        if (list != null) {
            List<CommentsAdapterVO> list2 = list;
            arrayList = new ArrayList(C7714v.z(list2, 10));
            for (Object obj : list2) {
                if (obj instanceof CommentV3VO) {
                    CommentV3VO commentV3VO = (CommentV3VO) obj;
                    if (Intrinsics.d(uuid, commentV3VO.getUuid())) {
                        obj = updateReactionState(commentV3VO, isSelected, actionId);
                    }
                }
                arrayList.add(obj);
            }
        } else {
            arrayList = null;
        }
        this._commentsCache = arrayList != null ? C7714v.W0(arrayList) : null;
        return arrayList;
    }

    private final CommentV3VO updateReactionState(CommentV3VO commentV3VO, boolean z11, String str) {
        AtomActionDTO action;
        String id2;
        List<CommentV3DTO.Control> leftControls;
        List<CommentV3DTO.Control> rightControls;
        CommentV3VO commentV3VO2 = commentV3VO;
        CommentV3VO.Content.FooterVO footer = commentV3VO2.getFooter(commentV3VO2);
        if (footer != null) {
            List[] elements = {footer.getLeftControls(), footer.getRightControls()};
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator it = C7705l.B(elements).iterator();
            while (it.hasNext()) {
                List<CommentV3DTO.Control> list = (List) it.next();
                int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        CommonControlSettings commonControl = ((CommentV3DTO.Control) obj).getCommonControl();
                        if (commonControl != null && (action = commonControl.getAction()) != null) {
                            Map<String, String> params = action.getParams();
                            if (params == null || (id2 = params.get("reaction")) == null) {
                                id2 = action.getId();
                            }
                            if (id2 != null) {
                                if (id2.equals(str)) {
                                    List<CommentV3VO.Content> items = commentV3VO2.getItems();
                                    ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
                                    for (CommentV3VO.Content content : items) {
                                        if ((content instanceof CommentV3VO.Content.FooterVO ? (CommentV3VO.Content.FooterVO) content : null) != null) {
                                            CommentV3VO.Content.FooterVO footerVO = (CommentV3VO.Content.FooterVO) content;
                                            if (list == footer.getLeftControls()) {
                                                leftControls = switchControlState(footer.getLeftControls(), i11, Boolean.valueOf(z11));
                                            } else {
                                                leftControls = footer.getLeftControls();
                                            }
                                            List<CommentV3DTO.Control> list2 = leftControls;
                                            if (list == footer.getRightControls()) {
                                                rightControls = switchControlState(footer.getRightControls(), i11, Boolean.valueOf(z11));
                                            } else {
                                                rightControls = footer.getRightControls();
                                            }
                                            CommentV3VO.Content.FooterVO copy$default = CommentV3VO.Content.FooterVO.copy$default(footerVO, list2, rightControls, null, null, 12, null);
                                            if (copy$default != null) {
                                                content = copy$default;
                                            }
                                        }
                                        arrayList.add(content);
                                    }
                                    return CommentV3VO.copy$default(commentV3VO2, 0L, null, null, arrayList, false, null, 55, null);
                                }
                                commentV3VO2 = commentV3VO;
                                i11 = i12;
                            }
                        }
                        commentV3VO2 = commentV3VO;
                        i11 = i12;
                    } else {
                        C7714v.O0();
                        throw null;
                    }
                }
                commentV3VO2 = commentV3VO;
            }
        }
        return commentV3VO;
    }
}
