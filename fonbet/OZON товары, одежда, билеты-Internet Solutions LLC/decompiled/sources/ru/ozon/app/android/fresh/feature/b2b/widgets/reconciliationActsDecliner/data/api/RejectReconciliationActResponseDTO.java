package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api;

import D3.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/RejectReconciliationActResponseDTO;", "", "isSuccess", "", "deeplink", "", "message", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/Message;", "error", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/Message;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDeeplink", "()Ljava/lang/String;", "getMessage", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/Message;", "getError", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/Message;Ljava/lang/String;)Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/RejectReconciliationActResponseDTO;", "equals", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RejectReconciliationActResponseDTO {
    public static final int $stable = 0;
    private final String deeplink;
    private final String error;
    private final Boolean isSuccess;
    private final Message message;

    public RejectReconciliationActResponseDTO(Boolean bool, String str, Message message, String str2) {
        this.isSuccess = bool;
        this.deeplink = str;
        this.message = message;
        this.error = str2;
    }

    public static /* synthetic */ RejectReconciliationActResponseDTO copy$default(RejectReconciliationActResponseDTO rejectReconciliationActResponseDTO, Boolean bool, String str, Message message, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = rejectReconciliationActResponseDTO.isSuccess;
        }
        if ((i11 & 2) != 0) {
            str = rejectReconciliationActResponseDTO.deeplink;
        }
        if ((i11 & 4) != 0) {
            message = rejectReconciliationActResponseDTO.message;
        }
        if ((i11 & 8) != 0) {
            str2 = rejectReconciliationActResponseDTO.error;
        }
        return rejectReconciliationActResponseDTO.copy(bool, str, message, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final RejectReconciliationActResponseDTO copy(Boolean isSuccess, String deeplink, Message message, String error) {
        return new RejectReconciliationActResponseDTO(isSuccess, deeplink, message, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RejectReconciliationActResponseDTO)) {
            return false;
        }
        RejectReconciliationActResponseDTO rejectReconciliationActResponseDTO = (RejectReconciliationActResponseDTO) other;
        return Intrinsics.d(this.isSuccess, rejectReconciliationActResponseDTO.isSuccess) && Intrinsics.d(this.deeplink, rejectReconciliationActResponseDTO.deeplink) && Intrinsics.d(this.message, rejectReconciliationActResponseDTO.message) && Intrinsics.d(this.error, rejectReconciliationActResponseDTO.error);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getError() {
        return this.error;
    }

    public final Message getMessage() {
        return this.message;
    }

    public int hashCode() {
        Boolean bool = this.isSuccess;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.deeplink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Message message = this.message;
        int hashCode3 = (hashCode2 + (message == null ? 0 : message.hashCode())) * 31;
        String str2 = this.error;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isSuccess;
        String str = this.deeplink;
        Message message = this.message;
        String str2 = this.error;
        StringBuilder e11 = g.e("RejectReconciliationActResponseDTO(isSuccess=", bool, ", deeplink=", str, ", message=");
        e11.append(message);
        e11.append(", error=");
        e11.append(str2);
        e11.append(")");
        return e11.toString();
    }
}
