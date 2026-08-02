package ru.ozon.app.android.ugcratingmolecule.presentation;

import E0.C2942q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.common.ugc.data.ugcratingmolecule.UgcRatingMolecule;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState;", "", "<init>", "()V", "FailedState", "PendingState", "UpdatedState", "Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState$FailedState;", "Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState$PendingState;", "Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState$UpdatedState;", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class UiRatingState {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState$FailedState;", "Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState;", "previousRating", "", "<init>", "(Ljava/lang/Float;)V", "getPreviousRating", "()Ljava/lang/Float;", "Ljava/lang/Float;", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailedState extends UiRatingState {
        private final Float previousRating;

        public FailedState(Float f7) {
            super(null);
            this.previousRating = f7;
        }

        public final Float getPreviousRating() {
            return this.previousRating;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState$PendingState;", "Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState;", "", "pendingRatingValue", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getPendingRatingValue", "()F", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PendingState extends UiRatingState {
        private final float pendingRatingValue;

        public PendingState(float f7) {
            super(null);
            this.pendingRatingValue = f7;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PendingState) && Float.compare(this.pendingRatingValue, ((PendingState) other).pendingRatingValue) == 0;
        }

        public final float getPendingRatingValue() {
            return this.pendingRatingValue;
        }

        public int hashCode() {
            return Float.hashCode(this.pendingRatingValue);
        }

        @NotNull
        public String toString() {
            return C2942q.b(this.pendingRatingValue, "PendingState(pendingRatingValue=", ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState$UpdatedState;", "Lru/ozon/app/android/ugcratingmolecule/presentation/UiRatingState;", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "updatedMolecule", "<init>", "(Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "getUpdatedMolecule", "()Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdatedState extends UiRatingState {
        private final UgcRatingMolecule updatedMolecule;

        public UpdatedState(UgcRatingMolecule ugcRatingMolecule) {
            super(null);
            this.updatedMolecule = ugcRatingMolecule;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdatedState) && Intrinsics.d(this.updatedMolecule, ((UpdatedState) other).updatedMolecule);
        }

        public final UgcRatingMolecule getUpdatedMolecule() {
            return this.updatedMolecule;
        }

        public int hashCode() {
            UgcRatingMolecule ugcRatingMolecule = this.updatedMolecule;
            if (ugcRatingMolecule == null) {
                return 0;
            }
            return ugcRatingMolecule.hashCode();
        }

        @NotNull
        public String toString() {
            return "UpdatedState(updatedMolecule=" + this.updatedMolecule + ")";
        }
    }

    public /* synthetic */ UiRatingState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UiRatingState() {
    }
}
