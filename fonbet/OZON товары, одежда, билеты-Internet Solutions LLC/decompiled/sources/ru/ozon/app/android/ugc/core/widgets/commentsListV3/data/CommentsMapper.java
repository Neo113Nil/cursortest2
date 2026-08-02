package ru.ozon.app.android.ugc.core.widgets.commentsListV3.data;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentVO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\u000eJ\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsMapper;", "", "<init>", "()V", "toCommentVo", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO;", "commentDTO", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO;", "isNested", "", "isLastNested", "toCommentsListVo", "", "dto", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO;", "toVO", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsMapper {
    public static /* synthetic */ CommentVO toCommentVo$default(CommentsMapper commentsMapper, CommentsDTO.CommentDTO commentDTO, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return commentsMapper.toCommentVo(commentDTO, z11, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private static final List<CommentVO> toCommentsListVo$flattenComments(CommentsMapper commentsMapper, CommentsDTO.CommentDTO commentDTO, boolean z11) {
        ?? r82;
        CommentVO commentVo$default = toCommentVo$default(commentsMapper, commentDTO, z11, false, 4, null);
        List<CommentsDTO.CommentDTO> answers = commentDTO.getAnswers();
        if (answers != null) {
            r82 = new ArrayList();
            Iterator it = answers.iterator();
            while (it.hasNext()) {
                C7714v.p(toCommentsListVo$flattenComments(commentsMapper, (CommentsDTO.CommentDTO) it.next(), true), r82);
            }
        } else {
            r82 = 0;
        }
        if (r82 == 0) {
            r82 = K.f71697a;
        }
        return C7714v.p0((Iterable) r82, C7714v.a0(commentVo$default));
    }

    static /* synthetic */ List toCommentsListVo$flattenComments$default(CommentsMapper commentsMapper, CommentsDTO.CommentDTO commentDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return toCommentsListVo$flattenComments(commentsMapper, commentDTO, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final CommentVO toCommentVo(@NotNull CommentsDTO.CommentDTO commentDTO, boolean isNested, boolean isLastNested) {
        CommentsListMapper.Companion companion;
        String str;
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(commentDTO, "commentDTO");
        CommentsListMapper.Companion companion2 = CommentsListMapper.INSTANCE;
        long widgetVoId = companion2.getWidgetVoId();
        String commentUuid = commentDTO.getCommentUuid();
        CommentVO.AuthorVO vo = toVO(commentDTO.getAuthor());
        TextDTO text = commentDTO.getText();
        TextDTO textDTO = null;
        if (text != null) {
            companion = companion2;
            str = 0;
            textDTO = TextDTO.copy$default(text, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null);
        } else {
            companion = companion2;
            str = 0;
        }
        TextDTO date = commentDTO.getDate();
        TextDTO textDTO2 = textDTO;
        boolean isPublished = commentDTO.isPublished();
        boolean z11 = commentDTO.getAnswers() != null ? !r9.isEmpty() : false;
        ButtonV3DTO answerButton = commentDTO.getAnswerButton();
        IconButtonV3DTO reportButton = commentDTO.getDeleteButton() == null ? commentDTO.getReportButton() : str;
        IconButtonV3DTO reportedButton = commentDTO.getReportedButton();
        IconButtonV3DTO deleteButton = commentDTO.getDeleteButton();
        IconButtonV3DTO deleteButton2 = commentDTO.getDeleteButton();
        t b11 = (deleteButton2 == null || (common = deleteButton2.getCommon()) == null || (trackingInfo = common.getTrackingInfo()) == null) ? str : x.b(trackingInfo, Long.valueOf(companion.getWidgetVoId()), str);
        Map<String, TokenizedTrackingInfo> trackingInfo2 = commentDTO.getTrackingInfo();
        t tVar = str;
        if (trackingInfo2 != null) {
            tVar = x.b(trackingInfo2, Long.valueOf(companion.getWidgetVoId()), str);
        }
        return new CommentVO(widgetVoId, commentUuid, vo, textDTO2, date, isPublished, isNested, isLastNested, z11, answerButton, reportButton, reportedButton, deleteButton, isNested, false, false, b11, tVar, 49152, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList, java.util.List] */
    @NotNull
    public final List<CommentVO> toCommentsListVo(@NotNull CommentsDTO dto) {
        ?? r22;
        Intrinsics.checkNotNullParameter(dto, "dto");
        List<CommentsDTO.CommentDTO> comments = dto.getComments();
        if (comments == null) {
            comments = K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = comments.iterator();
        while (it.hasNext()) {
            List commentsListVo$flattenComments$default = toCommentsListVo$flattenComments$default(this, (CommentsDTO.CommentDTO) it.next(), false, 4, null);
            if (commentsListVo$flattenComments$default.isEmpty()) {
                r22 = K.f71697a;
            } else {
                r22 = C7714v.W0(commentsListVo$flattenComments$default);
                r22.set(C7714v.P(r22), CommentVO.copy$default((CommentVO) r22.get(C7714v.P(r22)), 0L, null, null, null, null, false, false, true, false, null, null, null, null, false, false, false, null, null, 262015, null));
            }
            C7714v.p((Iterable) r22, arrayList);
        }
        return arrayList;
    }

    @NotNull
    public final CommentVO.AuthorVO toVO(@NotNull CommentsDTO.CommentDTO.Author author) {
        Intrinsics.checkNotNullParameter(author, "<this>");
        CommentVO.AuthorVO.SocialHeaderVO socialHeaderVO = new CommentVO.AuthorVO.SocialHeaderVO(author.getSocialHeader().getSubscribe(), author.getSocialHeader().getSubscribed(), author.getSocialHeader().isSubscribed());
        CommentsDTO.CommentDTO.Author.ConfirmedIndicator confirmedIndicator = author.getConfirmedIndicator();
        return new CommentVO.AuthorVO(socialHeaderVO, confirmedIndicator != null ? new CommentVO.AuthorVO.ConfirmedIndicatorVO(confirmedIndicator.getIndicator(), confirmedIndicator.getFillColor(), confirmedIndicator.getBorderColor()) : null);
    }
}
