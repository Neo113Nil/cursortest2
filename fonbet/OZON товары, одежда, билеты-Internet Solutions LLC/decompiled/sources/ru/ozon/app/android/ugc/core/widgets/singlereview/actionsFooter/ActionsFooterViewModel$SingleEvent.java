package ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter;

import B90.C2618u;
import C.o0;
import Kk.C3532b;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"ru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModel$SingleEvent", "", "ShowError", "SwitchControlState", "VoteSucceeded", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModel$SingleEvent$ShowError;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModel$SingleEvent$SwitchControlState;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModel$SingleEvent$VoteSucceeded;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ActionsFooterViewModel$SingleEvent {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModel$SingleEvent$ShowError;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModel$SingleEvent;", "", "isNetworkError", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowError implements ActionsFooterViewModel$SingleEvent {
        private final boolean isNetworkError;

        public ShowError(boolean z11) {
            this.isNetworkError = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowError) && this.isNetworkError == ((ShowError) other).isNetworkError;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isNetworkError);
        }

        /* renamed from: isNetworkError, reason: from getter */
        public final boolean getIsNetworkError() {
            return this.isNetworkError;
        }

        @NotNull
        public String toString() {
            return C2618u.g("ShowError(isNetworkError=", ")", this.isNetworkError);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModel$SingleEvent$SwitchControlState;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModel$SingleEvent;", "", "reviewUuid", "", "isLiked", "reactionId", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReviewUuid", "Z", "()Z", "getReactionId", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SwitchControlState implements ActionsFooterViewModel$SingleEvent {
        private final boolean isLiked;
        private final String reactionId;

        @NotNull
        private final String reviewUuid;

        public SwitchControlState(@NotNull String reviewUuid, boolean z11, String str) {
            Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
            this.reviewUuid = reviewUuid;
            this.isLiked = z11;
            this.reactionId = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SwitchControlState)) {
                return false;
            }
            SwitchControlState switchControlState = (SwitchControlState) other;
            return Intrinsics.d(this.reviewUuid, switchControlState.reviewUuid) && this.isLiked == switchControlState.isLiked && Intrinsics.d(this.reactionId, switchControlState.reactionId);
        }

        public final String getReactionId() {
            return this.reactionId;
        }

        @NotNull
        public final String getReviewUuid() {
            return this.reviewUuid;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.reviewUuid.hashCode() * 31, 31, this.isLiked);
            String str = this.reactionId;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        /* renamed from: isLiked, reason: from getter */
        public final boolean getIsLiked() {
            return this.isLiked;
        }

        @NotNull
        public String toString() {
            String str = this.reviewUuid;
            boolean z11 = this.isLiked;
            return o0.c(C4636t5.b("SwitchControlState(reviewUuid=", str, ", isLiked=", ", reactionId=", z11), this.reactionId, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModel$SingleEvent$VoteSucceeded;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterViewModel$SingleEvent;", "", "reviewUuid", "", "isLiked", "reactionId", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReviewUuid", "Z", "()Z", "getReactionId", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VoteSucceeded implements ActionsFooterViewModel$SingleEvent {
        private final boolean isLiked;
        private final String reactionId;

        @NotNull
        private final String reviewUuid;

        public VoteSucceeded(@NotNull String reviewUuid, boolean z11, String str) {
            Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
            this.reviewUuid = reviewUuid;
            this.isLiked = z11;
            this.reactionId = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VoteSucceeded)) {
                return false;
            }
            VoteSucceeded voteSucceeded = (VoteSucceeded) other;
            return Intrinsics.d(this.reviewUuid, voteSucceeded.reviewUuid) && this.isLiked == voteSucceeded.isLiked && Intrinsics.d(this.reactionId, voteSucceeded.reactionId);
        }

        public final String getReactionId() {
            return this.reactionId;
        }

        @NotNull
        public final String getReviewUuid() {
            return this.reviewUuid;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.reviewUuid.hashCode() * 31, 31, this.isLiked);
            String str = this.reactionId;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        /* renamed from: isLiked, reason: from getter */
        public final boolean getIsLiked() {
            return this.isLiked;
        }

        @NotNull
        public String toString() {
            String str = this.reviewUuid;
            boolean z11 = this.isLiked;
            return o0.c(C4636t5.b("VoteSucceeded(reviewUuid=", str, ", isLiked=", ", reactionId=", z11), this.reactionId, ")");
        }
    }
}
