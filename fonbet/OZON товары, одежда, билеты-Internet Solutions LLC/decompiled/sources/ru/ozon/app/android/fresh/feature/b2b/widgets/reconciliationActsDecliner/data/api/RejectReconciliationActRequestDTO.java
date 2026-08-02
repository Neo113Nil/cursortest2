package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api;

import G.g;
import I0.C3173b;
import N3.C3660k;
import com.google.android.gms.common.Scopes;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/RejectReconciliationActRequestDTO;", "", "documentId", "", "reconciliationAct", Scopes.EMAIL, "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDocumentId", "()Ljava/lang/String;", "getReconciliationAct", "getEmail", "getMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RejectReconciliationActRequestDTO {
    public static final int $stable = 0;

    @NotNull
    private final String documentId;

    @NotNull
    private final String email;

    @NotNull
    private final String message;

    @NotNull
    private final String reconciliationAct;

    public RejectReconciliationActRequestDTO(@NotNull String documentId, @NotNull String reconciliationAct, @NotNull String email, @NotNull String message) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(reconciliationAct, "reconciliationAct");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(message, "message");
        this.documentId = documentId;
        this.reconciliationAct = reconciliationAct;
        this.email = email;
        this.message = message;
    }

    public static /* synthetic */ RejectReconciliationActRequestDTO copy$default(RejectReconciliationActRequestDTO rejectReconciliationActRequestDTO, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rejectReconciliationActRequestDTO.documentId;
        }
        if ((i11 & 2) != 0) {
            str2 = rejectReconciliationActRequestDTO.reconciliationAct;
        }
        if ((i11 & 4) != 0) {
            str3 = rejectReconciliationActRequestDTO.email;
        }
        if ((i11 & 8) != 0) {
            str4 = rejectReconciliationActRequestDTO.message;
        }
        return rejectReconciliationActRequestDTO.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getReconciliationAct() {
        return this.reconciliationAct;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final RejectReconciliationActRequestDTO copy(@NotNull String documentId, @NotNull String reconciliationAct, @NotNull String email, @NotNull String message) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(reconciliationAct, "reconciliationAct");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(message, "message");
        return new RejectReconciliationActRequestDTO(documentId, reconciliationAct, email, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RejectReconciliationActRequestDTO)) {
            return false;
        }
        RejectReconciliationActRequestDTO rejectReconciliationActRequestDTO = (RejectReconciliationActRequestDTO) other;
        return Intrinsics.d(this.documentId, rejectReconciliationActRequestDTO.documentId) && Intrinsics.d(this.reconciliationAct, rejectReconciliationActRequestDTO.reconciliationAct) && Intrinsics.d(this.email, rejectReconciliationActRequestDTO.email) && Intrinsics.d(this.message, rejectReconciliationActRequestDTO.message);
    }

    @NotNull
    public final String getDocumentId() {
        return this.documentId;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getReconciliationAct() {
        return this.reconciliationAct;
    }

    public int hashCode() {
        return this.message.hashCode() + g.a(g.a(this.documentId.hashCode() * 31, 31, this.reconciliationAct), 31, this.email);
    }

    @NotNull
    public String toString() {
        String str = this.documentId;
        String str2 = this.reconciliationAct;
        return C3173b.c(C3660k.d("RejectReconciliationActRequestDTO(documentId=", str, ", reconciliationAct=", str2, ", email="), this.email, ", message=", this.message, ")");
    }
}
