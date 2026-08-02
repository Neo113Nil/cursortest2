package ru.ozon.app.android.fresh.navigation.addressSearch.data;

import G.g;
import I0.C3173b;
import Kk.C3532b;
import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO;", "", "action", "Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO$ActionDTO;", "isExact", "", "searchText", "", "errorText", "<init>", "(Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO$ActionDTO;ZLjava/lang/String;Ljava/lang/String;)V", "getAction", "()Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO$ActionDTO;", "()Z", "getSearchText", "()Ljava/lang/String;", "getErrorText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "ActionDTO", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ValidateAddressResponseDTO {
    private final ActionDTO action;
    private final String errorText;
    private final boolean isExact;

    @NotNull
    private final String searchText;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO$ActionDTO;", "", "behavior", "", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBehavior", "()Ljava/lang/String;", "getLink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionDTO {

        @NotNull
        private final String behavior;

        @NotNull
        private final String link;

        public ActionDTO(@NotNull String behavior, @NotNull String link) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(link, "link");
            this.behavior = behavior;
            this.link = link;
        }

        public static /* synthetic */ ActionDTO copy$default(ActionDTO actionDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = actionDTO.behavior;
            }
            if ((i11 & 2) != 0) {
                str2 = actionDTO.link;
            }
            return actionDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBehavior() {
            return this.behavior;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final ActionDTO copy(@NotNull String behavior, @NotNull String link) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(link, "link");
            return new ActionDTO(behavior, link);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionDTO)) {
                return false;
            }
            ActionDTO actionDTO = (ActionDTO) other;
            return Intrinsics.d(this.behavior, actionDTO.behavior) && Intrinsics.d(this.link, actionDTO.link);
        }

        @NotNull
        public final String getBehavior() {
            return this.behavior;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public int hashCode() {
            return this.link.hashCode() + (this.behavior.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ActionDTO(behavior=", this.behavior, ", link=", this.link, ")");
        }
    }

    public ValidateAddressResponseDTO(ActionDTO actionDTO, boolean z11, @NotNull String searchText, String str) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        this.action = actionDTO;
        this.isExact = z11;
        this.searchText = searchText;
        this.errorText = str;
    }

    public static /* synthetic */ ValidateAddressResponseDTO copy$default(ValidateAddressResponseDTO validateAddressResponseDTO, ActionDTO actionDTO, boolean z11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            actionDTO = validateAddressResponseDTO.action;
        }
        if ((i11 & 2) != 0) {
            z11 = validateAddressResponseDTO.isExact;
        }
        if ((i11 & 4) != 0) {
            str = validateAddressResponseDTO.searchText;
        }
        if ((i11 & 8) != 0) {
            str2 = validateAddressResponseDTO.errorText;
        }
        return validateAddressResponseDTO.copy(actionDTO, z11, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final ActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsExact() {
        return this.isExact;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSearchText() {
        return this.searchText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    @NotNull
    public final ValidateAddressResponseDTO copy(ActionDTO action, boolean isExact, @NotNull String searchText, String errorText) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        return new ValidateAddressResponseDTO(action, isExact, searchText, errorText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateAddressResponseDTO)) {
            return false;
        }
        ValidateAddressResponseDTO validateAddressResponseDTO = (ValidateAddressResponseDTO) other;
        return Intrinsics.d(this.action, validateAddressResponseDTO.action) && this.isExact == validateAddressResponseDTO.isExact && Intrinsics.d(this.searchText, validateAddressResponseDTO.searchText) && Intrinsics.d(this.errorText, validateAddressResponseDTO.errorText);
    }

    public final ActionDTO getAction() {
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
        ActionDTO actionDTO = this.action;
        int a11 = g.a(C3532b.a((actionDTO == null ? 0 : actionDTO.hashCode()) * 31, 31, this.isExact), 31, this.searchText);
        String str = this.errorText;
        return a11 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isExact() {
        return this.isExact;
    }

    @NotNull
    public String toString() {
        ActionDTO actionDTO = this.action;
        boolean z11 = this.isExact;
        String str = this.searchText;
        String str2 = this.errorText;
        StringBuilder sb2 = new StringBuilder("ValidateAddressResponseDTO(action=");
        sb2.append(actionDTO);
        sb2.append(", isExact=");
        sb2.append(z11);
        sb2.append(", searchText=");
        return C3173b.c(sb2, str, ", errorText=", str2, ")");
    }
}
