package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.api;

import C.o0;
import K1.G;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/api/AddEdoResponseV2;", "", "isSuccess", "", "deeplink", "", "error", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getDeeplink", "()Ljava/lang/String;", "getError", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddEdoResponseV2 {
    public static final int $stable = 0;
    private final String deeplink;
    private final String error;
    private final boolean isSuccess;

    public AddEdoResponseV2(boolean z11, String str, String str2) {
        this.isSuccess = z11;
        this.deeplink = str;
        this.error = str2;
    }

    public static /* synthetic */ AddEdoResponseV2 copy$default(AddEdoResponseV2 addEdoResponseV2, boolean z11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = addEdoResponseV2.isSuccess;
        }
        if ((i11 & 2) != 0) {
            str = addEdoResponseV2.deeplink;
        }
        if ((i11 & 4) != 0) {
            str2 = addEdoResponseV2.error;
        }
        return addEdoResponseV2.copy(z11, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final AddEdoResponseV2 copy(boolean isSuccess, String deeplink, String error) {
        return new AddEdoResponseV2(isSuccess, deeplink, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddEdoResponseV2)) {
            return false;
        }
        AddEdoResponseV2 addEdoResponseV2 = (AddEdoResponseV2) other;
        return this.isSuccess == addEdoResponseV2.isSuccess && Intrinsics.d(this.deeplink, addEdoResponseV2.deeplink) && Intrinsics.d(this.error, addEdoResponseV2.error);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isSuccess) * 31;
        String str = this.deeplink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isSuccess;
        String str = this.deeplink;
        return o0.c(G.d("AddEdoResponseV2(isSuccess=", ", deeplink=", str, ", error=", z11), this.error, ")");
    }
}
