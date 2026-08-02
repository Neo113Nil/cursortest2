package ru.ozon.app.android.ugc.core.widgets.commentsListV3.data;

import An.C2439a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsV3DTO;", "", "commentUuid", "", "comments", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentV3DTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCommentUuid", "()Ljava/lang/String;", "getComments", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommentsV3DTO {
    public static final int $stable = 8;
    private final String commentUuid;
    private final List<CommentV3DTO> comments;

    public CommentsV3DTO(String str, List<CommentV3DTO> list) {
        this.commentUuid = str;
        this.comments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentsV3DTO copy$default(CommentsV3DTO commentsV3DTO, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = commentsV3DTO.commentUuid;
        }
        if ((i11 & 2) != 0) {
            list = commentsV3DTO.comments;
        }
        return commentsV3DTO.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCommentUuid() {
        return this.commentUuid;
    }

    public final List<CommentV3DTO> component2() {
        return this.comments;
    }

    @NotNull
    public final CommentsV3DTO copy(String commentUuid, List<CommentV3DTO> comments) {
        return new CommentsV3DTO(commentUuid, comments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentsV3DTO)) {
            return false;
        }
        CommentsV3DTO commentsV3DTO = (CommentsV3DTO) other;
        return Intrinsics.d(this.commentUuid, commentsV3DTO.commentUuid) && Intrinsics.d(this.comments, commentsV3DTO.comments);
    }

    public final String getCommentUuid() {
        return this.commentUuid;
    }

    public final List<CommentV3DTO> getComments() {
        return this.comments;
    }

    public int hashCode() {
        String str = this.commentUuid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CommentV3DTO> list = this.comments;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return C2439a.a("CommentsV3DTO(commentUuid=", this.commentUuid, ", comments=", ")", this.comments);
    }
}
