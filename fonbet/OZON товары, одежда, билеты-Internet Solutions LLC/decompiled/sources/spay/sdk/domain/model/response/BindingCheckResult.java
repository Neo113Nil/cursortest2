package spay.sdk.domain.model.response;

import B90.C2618u;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import spay.sdk.data.dto.response.binding.BindingV3SessionResponseBodyDtoKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lspay/sdk/domain/model/response/BindingCheckResult;", "", "isSPayBinding", "", "(Z)V", "()Z", "Available", "NotAvailable", "Lspay/sdk/domain/model/response/BindingCheckResult$Available;", "Lspay/sdk/domain/model/response/BindingCheckResult$NotAvailable;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BindingCheckResult {
    private final boolean isSPayBinding;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lspay/sdk/domain/model/response/BindingCheckResult$Available;", "Lspay/sdk/domain/model/response/BindingCheckResult;", "isSPayBinding", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Available extends BindingCheckResult {
        private final boolean isSPayBinding;

        public Available(boolean z11) {
            super(z11, null);
            this.isSPayBinding = z11;
        }

        public static /* synthetic */ Available copy$default(Available available, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = available.getIsSPayBinding();
            }
            return available.copy(z11);
        }

        public final boolean component1() {
            return getIsSPayBinding();
        }

        @NotNull
        public final Available copy(boolean isSPayBinding) {
            return new Available(isSPayBinding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Available) && getIsSPayBinding() == ((Available) other).getIsSPayBinding();
        }

        public int hashCode() {
            boolean isSPayBinding = getIsSPayBinding();
            if (isSPayBinding) {
                return 1;
            }
            return isSPayBinding ? 1 : 0;
        }

        @Override // spay.sdk.domain.model.response.BindingCheckResult
        /* renamed from: isSPayBinding, reason: from getter */
        public boolean getIsSPayBinding() {
            return this.isSPayBinding;
        }

        @NotNull
        public String toString() {
            return C2618u.g("Available(isSPayBinding=", ")", getIsSPayBinding());
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lspay/sdk/domain/model/response/BindingCheckResult$NotAvailable;", "Lspay/sdk/domain/model/response/BindingCheckResult;", "isSPayBinding", "", "isCardBlocked", BindingV3SessionResponseBodyDtoKt.CHECK_RESULT_HAS_CARDS_FIELD, "(ZZZ)V", "getHasAdditionalCards", "()Z", "needUpdateBinding", "getNeedUpdateBinding", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NotAvailable extends BindingCheckResult {
        private final boolean hasAdditionalCards;
        private final boolean isCardBlocked;
        private final boolean isSPayBinding;

        public NotAvailable(boolean z11, boolean z12, boolean z13) {
            super(z11, null);
            this.isSPayBinding = z11;
            this.isCardBlocked = z12;
            this.hasAdditionalCards = z13;
        }

        public static /* synthetic */ NotAvailable copy$default(NotAvailable notAvailable, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = notAvailable.getIsSPayBinding();
            }
            if ((i11 & 2) != 0) {
                z12 = notAvailable.isCardBlocked;
            }
            if ((i11 & 4) != 0) {
                z13 = notAvailable.hasAdditionalCards;
            }
            return notAvailable.copy(z11, z12, z13);
        }

        public final boolean component1() {
            return getIsSPayBinding();
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCardBlocked() {
            return this.isCardBlocked;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasAdditionalCards() {
            return this.hasAdditionalCards;
        }

        @NotNull
        public final NotAvailable copy(boolean isSPayBinding, boolean isCardBlocked, boolean hasAdditionalCards) {
            return new NotAvailable(isSPayBinding, isCardBlocked, hasAdditionalCards);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotAvailable)) {
                return false;
            }
            NotAvailable notAvailable = (NotAvailable) other;
            return getIsSPayBinding() == notAvailable.getIsSPayBinding() && this.isCardBlocked == notAvailable.isCardBlocked && this.hasAdditionalCards == notAvailable.hasAdditionalCards;
        }

        public final boolean getHasAdditionalCards() {
            return this.hasAdditionalCards;
        }

        public final boolean getNeedUpdateBinding() {
            return this.isCardBlocked && this.hasAdditionalCards;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        public int hashCode() {
            boolean isSPayBinding = getIsSPayBinding();
            ?? r02 = isSPayBinding;
            if (isSPayBinding) {
                r02 = 1;
            }
            int i11 = r02 * 31;
            ?? r22 = this.isCardBlocked;
            int i12 = r22;
            if (r22 != 0) {
                i12 = 1;
            }
            int i13 = (i11 + i12) * 31;
            boolean z11 = this.hasAdditionalCards;
            return i13 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public final boolean isCardBlocked() {
            return this.isCardBlocked;
        }

        @Override // spay.sdk.domain.model.response.BindingCheckResult
        /* renamed from: isSPayBinding, reason: from getter */
        public boolean getIsSPayBinding() {
            return this.isSPayBinding;
        }

        @NotNull
        public String toString() {
            boolean isSPayBinding = getIsSPayBinding();
            boolean z11 = this.isCardBlocked;
            return a.a(")", Lh.a.d("NotAvailable(isSPayBinding=", ", isCardBlocked=", ", hasAdditionalCards=", isSPayBinding, z11), this.hasAdditionalCards);
        }
    }

    public /* synthetic */ BindingCheckResult(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11);
    }

    /* renamed from: isSPayBinding, reason: from getter */
    public boolean getIsSPayBinding() {
        return this.isSPayBinding;
    }

    private BindingCheckResult(boolean z11) {
        this.isSPayBinding = z11;
    }
}
