package ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview;

import Ak.b;
import B90.C2618u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action;", "", "<init>", "()V", "LikeError", "BindButtons", "SaveLikeState", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action$BindButtons;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action$LikeError;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action$SaveLikeState;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class Action {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action$BindButtons;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;", "item", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;", "getItem", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BindButtons extends Action {

        @NotNull
        private final ButtonsVO item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BindButtons(@NotNull ButtonsVO item) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BindButtons) && Intrinsics.d(this.item, ((BindButtons) other).item);
        }

        @NotNull
        public final ButtonsVO getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        @NotNull
        public String toString() {
            return "BindButtons(item=" + this.item + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action$LikeError;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action;", "", "isNetworkError", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LikeError extends Action {
        private final boolean isNetworkError;

        public LikeError(boolean z11) {
            super(null);
            this.isNetworkError = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LikeError) && this.isNetworkError == ((LikeError) other).isNetworkError;
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
            return C2618u.g("LikeError(isNetworkError=", ")", this.isNetworkError);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action$SaveLikeState;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action;", "", "reviewUuid", "", "isSelected", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReviewUuid", "Z", "()Z", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SaveLikeState extends Action {
        private final boolean isSelected;

        @NotNull
        private final String reviewUuid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SaveLikeState(@NotNull String reviewUuid, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
            this.reviewUuid = reviewUuid;
            this.isSelected = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveLikeState)) {
                return false;
            }
            SaveLikeState saveLikeState = (SaveLikeState) other;
            return Intrinsics.d(this.reviewUuid, saveLikeState.reviewUuid) && this.isSelected == saveLikeState.isSelected;
        }

        @NotNull
        public final String getReviewUuid() {
            return this.reviewUuid;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSelected) + (this.reviewUuid.hashCode() * 31);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            return b.f("SaveLikeState(reviewUuid=", this.reviewUuid, ", isSelected=", ")", this.isSelected);
        }
    }

    public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Action() {
    }
}
