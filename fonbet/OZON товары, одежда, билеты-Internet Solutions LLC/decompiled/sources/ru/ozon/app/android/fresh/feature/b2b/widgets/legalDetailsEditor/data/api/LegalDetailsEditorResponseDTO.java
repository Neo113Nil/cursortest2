package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api;

import C.o0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/LegalDetailsEditorResponseDTO;", "", "isSuccess", "", "message", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/ResponseMessage;", "deeplink", "", "<init>", "(Ljava/lang/Boolean;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/ResponseMessage;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/ResponseMessage;", "getDeeplink", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/ResponseMessage;Ljava/lang/String;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/LegalDetailsEditorResponseDTO;", "equals", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LegalDetailsEditorResponseDTO {
    public static final int $stable = 0;
    private final String deeplink;
    private final Boolean isSuccess;
    private final ResponseMessage message;

    public LegalDetailsEditorResponseDTO(Boolean bool, ResponseMessage responseMessage, String str) {
        this.isSuccess = bool;
        this.message = responseMessage;
        this.deeplink = str;
    }

    public static /* synthetic */ LegalDetailsEditorResponseDTO copy$default(LegalDetailsEditorResponseDTO legalDetailsEditorResponseDTO, Boolean bool, ResponseMessage responseMessage, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = legalDetailsEditorResponseDTO.isSuccess;
        }
        if ((i11 & 2) != 0) {
            responseMessage = legalDetailsEditorResponseDTO.message;
        }
        if ((i11 & 4) != 0) {
            str = legalDetailsEditorResponseDTO.deeplink;
        }
        return legalDetailsEditorResponseDTO.copy(bool, responseMessage, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final ResponseMessage getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final LegalDetailsEditorResponseDTO copy(Boolean isSuccess, ResponseMessage message, String deeplink) {
        return new LegalDetailsEditorResponseDTO(isSuccess, message, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalDetailsEditorResponseDTO)) {
            return false;
        }
        LegalDetailsEditorResponseDTO legalDetailsEditorResponseDTO = (LegalDetailsEditorResponseDTO) other;
        return Intrinsics.d(this.isSuccess, legalDetailsEditorResponseDTO.isSuccess) && Intrinsics.d(this.message, legalDetailsEditorResponseDTO.message) && Intrinsics.d(this.deeplink, legalDetailsEditorResponseDTO.deeplink);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final ResponseMessage getMessage() {
        return this.message;
    }

    public int hashCode() {
        Boolean bool = this.isSuccess;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ResponseMessage responseMessage = this.message;
        int hashCode2 = (hashCode + (responseMessage == null ? 0 : responseMessage.hashCode())) * 31;
        String str = this.deeplink;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isSuccess;
        ResponseMessage responseMessage = this.message;
        String str = this.deeplink;
        StringBuilder sb2 = new StringBuilder("LegalDetailsEditorResponseDTO(isSuccess=");
        sb2.append(bool);
        sb2.append(", message=");
        sb2.append(responseMessage);
        sb2.append(", deeplink=");
        return o0.c(sb2, str, ")");
    }
}
