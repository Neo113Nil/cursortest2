package ru.ozon.app.android.ugc.core.widgets.commentsListV3.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/ReplyCommentV3DTO;", "", "comment", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO;)V", "getComment", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReplyCommentV3DTO {
    public static final int $stable = 8;
    private final CommentV3DTO comment;

    public ReplyCommentV3DTO(CommentV3DTO commentV3DTO) {
        this.comment = commentV3DTO;
    }

    public static /* synthetic */ ReplyCommentV3DTO copy$default(ReplyCommentV3DTO replyCommentV3DTO, CommentV3DTO commentV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commentV3DTO = replyCommentV3DTO.comment;
        }
        return replyCommentV3DTO.copy(commentV3DTO);
    }

    /* renamed from: component1, reason: from getter */
    public final CommentV3DTO getComment() {
        return this.comment;
    }

    @NotNull
    public final ReplyCommentV3DTO copy(CommentV3DTO comment) {
        return new ReplyCommentV3DTO(comment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReplyCommentV3DTO) && Intrinsics.d(this.comment, ((ReplyCommentV3DTO) other).comment);
    }

    public final CommentV3DTO getComment() {
        return this.comment;
    }

    public int hashCode() {
        CommentV3DTO commentV3DTO = this.comment;
        if (commentV3DTO == null) {
            return 0;
        }
        return commentV3DTO.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReplyCommentV3DTO(comment=" + this.comment + ")";
    }
}
