package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Bi.b;
import D40.a;
import V.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;", "", "<init>", "()V", "CallAuth", "CloseReplyTo", "DeleteComment", "FetchError", "SendError", "IncrementCount", "NewItems", "Error", "ReplyToComment", "SendingComment", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$CallAuth;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$CloseReplyTo;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$DeleteComment;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$Error;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$FetchError;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$IncrementCount;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$NewItems;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$ReplyToComment;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$SendError;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$SendingComment;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Action {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$CallAuth;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CallAuth extends Action {

        @NotNull
        public static final CallAuth INSTANCE = new CallAuth();

        private CallAuth() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CallAuth);
        }

        public int hashCode() {
            return -619989443;
        }

        @NotNull
        public String toString() {
            return "CallAuth";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$CloseReplyTo;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloseReplyTo extends Action {

        @NotNull
        public static final CloseReplyTo INSTANCE = new CloseReplyTo();

        private CloseReplyTo() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CloseReplyTo);
        }

        public int hashCode() {
            return -43613308;
        }

        @NotNull
        public String toString() {
            return "CloseReplyTo";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$DeleteComment;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeleteComment extends Action {

        @NotNull
        public static final DeleteComment INSTANCE = new DeleteComment();

        private DeleteComment() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof DeleteComment);
        }

        public int hashCode() {
            return -1428674691;
        }

        @NotNull
        public String toString() {
            return "DeleteComment";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$Error;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends Action {

        @NotNull
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.d(this.throwable, ((Error) other).throwable);
        }

        @NotNull
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        @NotNull
        public String toString() {
            return a.c("Error(throwable=", ")", this.throwable);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$FetchError;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FetchError extends Action {

        @NotNull
        public static final FetchError INSTANCE = new FetchError();

        private FetchError() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FetchError);
        }

        public int hashCode() {
            return 398352069;
        }

        @NotNull
        public String toString() {
            return "FetchError";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$IncrementCount;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IncrementCount extends Action {

        @NotNull
        public static final IncrementCount INSTANCE = new IncrementCount();

        private IncrementCount() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof IncrementCount);
        }

        public int hashCode() {
            return -1191608649;
        }

        @NotNull
        public String toString() {
            return "IncrementCount";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$NewItems;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "items", "", "scrollCommentUuid", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/String;", "getScrollCommentUuid", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewItems extends Action {

        @NotNull
        private final List<CommentsAdapterVO> items;
        private final String scrollCommentUuid;

        public /* synthetic */ NewItems(List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? null : str);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewItems)) {
                return false;
            }
            NewItems newItems = (NewItems) other;
            return Intrinsics.d(this.items, newItems.items) && Intrinsics.d(this.scrollCommentUuid, newItems.scrollCommentUuid);
        }

        @NotNull
        public final List<CommentsAdapterVO> getItems() {
            return this.items;
        }

        public final String getScrollCommentUuid() {
            return this.scrollCommentUuid;
        }

        public int hashCode() {
            int hashCode = this.items.hashCode() * 31;
            String str = this.scrollCommentUuid;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return b.e("NewItems(items=", ", scrollCommentUuid=", this.scrollCommentUuid, ")", this.items);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NewItems(@NotNull List<? extends CommentsAdapterVO> items, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
            this.scrollCommentUuid = str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$ReplyToComment;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;", "", "replyTo", "commentUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReplyTo", "getCommentUuid", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReplyToComment extends Action {
        private final String commentUuid;

        @NotNull
        private final String replyTo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReplyToComment(@NotNull String replyTo, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(replyTo, "replyTo");
            this.replyTo = replyTo;
            this.commentUuid = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReplyToComment)) {
                return false;
            }
            ReplyToComment replyToComment = (ReplyToComment) other;
            return Intrinsics.d(this.replyTo, replyToComment.replyTo) && Intrinsics.d(this.commentUuid, replyToComment.commentUuid);
        }

        public final String getCommentUuid() {
            return this.commentUuid;
        }

        @NotNull
        public final String getReplyTo() {
            return this.replyTo;
        }

        public int hashCode() {
            int hashCode = this.replyTo.hashCode() * 31;
            String str = this.commentUuid;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("ReplyToComment(replyTo=", this.replyTo, ", commentUuid=", this.commentUuid, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$SendError;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SendError extends Action {

        @NotNull
        public static final SendError INSTANCE = new SendError();

        private SendError() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SendError);
        }

        public int hashCode() {
            return -963419863;
        }

        @NotNull
        public String toString() {
            return "SendError";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action$SendingComment;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/Action;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "replyOnComment", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "getReplyOnComment", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SendingComment extends Action {
        private final CommentsAdapterVO replyOnComment;

        /* JADX WARN: Multi-variable type inference failed */
        public SendingComment() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SendingComment) && Intrinsics.d(this.replyOnComment, ((SendingComment) other).replyOnComment);
        }

        public final CommentsAdapterVO getReplyOnComment() {
            return this.replyOnComment;
        }

        public int hashCode() {
            CommentsAdapterVO commentsAdapterVO = this.replyOnComment;
            if (commentsAdapterVO == null) {
                return 0;
            }
            return commentsAdapterVO.hashCode();
        }

        @NotNull
        public String toString() {
            return "SendingComment(replyOnComment=" + this.replyOnComment + ")";
        }

        public SendingComment(CommentsAdapterVO commentsAdapterVO) {
            super(null);
            this.replyOnComment = commentsAdapterVO;
        }

        public /* synthetic */ SendingComment(CommentsAdapterVO commentsAdapterVO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : commentsAdapterVO);
        }
    }

    public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Action() {
    }
}
