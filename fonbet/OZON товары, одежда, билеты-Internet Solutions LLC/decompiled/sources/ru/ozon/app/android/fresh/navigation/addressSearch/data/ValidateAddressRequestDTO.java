package ru.ozon.app.android.fresh.navigation.addressSearch.data;

import G.g;
import K00.b;
import N3.C3660k;
import com.google.android.gms.actions.SearchIntents;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressRequestDTO;", "", SearchIntents.EXTRA_QUERY, "", "suggest", "index", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getQuery", "()Ljava/lang/String;", "getSuggest", "getIndex", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ValidateAddressRequestDTO {
    private final int index;

    @NotNull
    private final String query;

    @NotNull
    private final String suggest;

    public ValidateAddressRequestDTO(@NotNull String query, @NotNull String suggest, int i11) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(suggest, "suggest");
        this.query = query;
        this.suggest = suggest;
        this.index = i11;
    }

    public static /* synthetic */ ValidateAddressRequestDTO copy$default(ValidateAddressRequestDTO validateAddressRequestDTO, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = validateAddressRequestDTO.query;
        }
        if ((i12 & 2) != 0) {
            str2 = validateAddressRequestDTO.suggest;
        }
        if ((i12 & 4) != 0) {
            i11 = validateAddressRequestDTO.index;
        }
        return validateAddressRequestDTO.copy(str, str2, i11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSuggest() {
        return this.suggest;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final ValidateAddressRequestDTO copy(@NotNull String query, @NotNull String suggest, int index) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(suggest, "suggest");
        return new ValidateAddressRequestDTO(query, suggest, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateAddressRequestDTO)) {
            return false;
        }
        ValidateAddressRequestDTO validateAddressRequestDTO = (ValidateAddressRequestDTO) other;
        return Intrinsics.d(this.query, validateAddressRequestDTO.query) && Intrinsics.d(this.suggest, validateAddressRequestDTO.suggest) && this.index == validateAddressRequestDTO.index;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    public final String getSuggest() {
        return this.suggest;
    }

    public int hashCode() {
        return Integer.hashCode(this.index) + g.a(this.query.hashCode() * 31, 31, this.suggest);
    }

    @NotNull
    public String toString() {
        return b.e(this.index, ")", C3660k.d("ValidateAddressRequestDTO(query=", this.query, ", suggest=", this.suggest, ", index="));
    }
}
