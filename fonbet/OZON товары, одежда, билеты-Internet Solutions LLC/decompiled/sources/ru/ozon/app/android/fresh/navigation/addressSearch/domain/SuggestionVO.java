package ru.ozon.app.android.fresh.navigation.addressSearch.domain;

import Kk.C3532b;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.addressSearch.data.ValidateAddressResponseDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/domain/SuggestionVO;", "", "", "searchText", "errorText", "", "isExact", "Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO$ActionDTO;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO$ActionDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSearchText", "getErrorText", "Z", "()Z", "Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO$ActionDTO;", "getAction", "()Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO$ActionDTO;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SuggestionVO {
    private final ValidateAddressResponseDTO.ActionDTO action;
    private final String errorText;
    private final boolean isExact;

    @NotNull
    private final String searchText;

    public SuggestionVO(@NotNull String searchText, String str, boolean z11, ValidateAddressResponseDTO.ActionDTO actionDTO) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        this.searchText = searchText;
        this.errorText = str;
        this.isExact = z11;
        this.action = actionDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestionVO)) {
            return false;
        }
        SuggestionVO suggestionVO = (SuggestionVO) other;
        return Intrinsics.d(this.searchText, suggestionVO.searchText) && Intrinsics.d(this.errorText, suggestionVO.errorText) && this.isExact == suggestionVO.isExact && Intrinsics.d(this.action, suggestionVO.action);
    }

    public final ValidateAddressResponseDTO.ActionDTO getAction() {
        return this.action;
    }

    public final String getErrorText() {
        return this.errorText;
    }

    @NotNull
    public final String getSearchText() {
        return this.searchText;
    }

    public int hashCode() {
        int hashCode = this.searchText.hashCode() * 31;
        String str = this.errorText;
        int a11 = C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isExact);
        ValidateAddressResponseDTO.ActionDTO actionDTO = this.action;
        return a11 + (actionDTO != null ? actionDTO.hashCode() : 0);
    }

    /* renamed from: isExact, reason: from getter */
    public final boolean getIsExact() {
        return this.isExact;
    }

    @NotNull
    public String toString() {
        String str = this.searchText;
        String str2 = this.errorText;
        boolean z11 = this.isExact;
        ValidateAddressResponseDTO.ActionDTO actionDTO = this.action;
        StringBuilder d11 = C3660k.d("SuggestionVO(searchText=", str, ", errorText=", str2, ", isExact=");
        d11.append(z11);
        d11.append(", action=");
        d11.append(actionDTO);
        d11.append(")");
        return d11.toString();
    }
}
