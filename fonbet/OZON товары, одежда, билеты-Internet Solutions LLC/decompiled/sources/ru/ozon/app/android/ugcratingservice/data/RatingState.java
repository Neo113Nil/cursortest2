package ru.ozon.app.android.ugcratingservice.data;

import B0.A0;
import B0.C2454a;
import B90.C2618u;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.common.ugc.data.ugcratingservice.EditingActionDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugcratingservice/data/RatingState;", "", "productId", "", "<init>", "(Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "Failed", "Pending", "Success", "Lru/ozon/app/android/ugcratingservice/data/RatingState$Failed;", "Lru/ozon/app/android/ugcratingservice/data/RatingState$Pending;", "Lru/ozon/app/android/ugcratingservice/data/RatingState$Success;", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class RatingState {

    @NotNull
    private final String productId;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugcratingservice/data/RatingState$Failed;", "Lru/ozon/app/android/ugcratingservice/data/RatingState;", "", "productId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failed extends RatingState {

        @NotNull
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(@NotNull String productId) {
            super(productId, null);
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.productId = productId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.d(this.productId, ((Failed) other).productId);
        }

        @Override // ru.ozon.app.android.ugcratingservice.data.RatingState
        @NotNull
        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return this.productId.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Failed(productId=", this.productId, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugcratingservice/data/RatingState$Pending;", "Lru/ozon/app/android/ugcratingservice/data/RatingState;", "", "productId", "", "pendingRatingValue", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "I", "getPendingRatingValue", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pending extends RatingState {
        private final int pendingRatingValue;

        @NotNull
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pending(@NotNull String productId, int i11) {
            super(productId, null);
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.productId = productId;
            this.pendingRatingValue = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pending)) {
                return false;
            }
            Pending pending = (Pending) other;
            return Intrinsics.d(this.productId, pending.productId) && this.pendingRatingValue == pending.pendingRatingValue;
        }

        public final int getPendingRatingValue() {
            return this.pendingRatingValue;
        }

        @Override // ru.ozon.app.android.ugcratingservice.data.RatingState
        @NotNull
        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return Integer.hashCode(this.pendingRatingValue) + (this.productId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2618u.f(this.pendingRatingValue, "Pending(productId=", this.productId, ", pendingRatingValue=", ")");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugcratingservice/data/RatingState$Success;", "Lru/ozon/app/android/ugcratingservice/data/RatingState;", "", "productId", "", "newRatingValue", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingservice/EditingActionDTO;", "editingAction", "<init>", "(Ljava/lang/String;ILru/ozon/app/android/pdp/common/ugc/data/ugcratingservice/EditingActionDTO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "I", "getNewRatingValue", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingservice/EditingActionDTO;", "getEditingAction", "()Lru/ozon/app/android/pdp/common/ugc/data/ugcratingservice/EditingActionDTO;", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends RatingState {

        @NotNull
        private final EditingActionDTO editingAction;
        private final int newRatingValue;

        @NotNull
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String productId, int i11, @NotNull EditingActionDTO editingAction) {
            super(productId, null);
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(editingAction, "editingAction");
            this.productId = productId;
            this.newRatingValue = i11;
            this.editingAction = editingAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.d(this.productId, success.productId) && this.newRatingValue == success.newRatingValue && Intrinsics.d(this.editingAction, success.editingAction);
        }

        @NotNull
        public final EditingActionDTO getEditingAction() {
            return this.editingAction;
        }

        public final int getNewRatingValue() {
            return this.newRatingValue;
        }

        @Override // ru.ozon.app.android.ugcratingservice.data.RatingState
        @NotNull
        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return this.editingAction.hashCode() + C2454a.a(this.newRatingValue, this.productId.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.productId;
            int i11 = this.newRatingValue;
            EditingActionDTO editingActionDTO = this.editingAction;
            StringBuilder c11 = C3660k.c(i11, "Success(productId=", str, ", newRatingValue=", ", editingAction=");
            c11.append(editingActionDTO);
            c11.append(")");
            return c11.toString();
        }
    }

    public /* synthetic */ RatingState(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public String getProductId() {
        return this.productId;
    }

    private RatingState(String str) {
        this.productId = str;
    }
}
