package ru.ozon.app.android.tabbar.data.api;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/tabbar/data/api/TabConfigRequest;", "", "miniapp", "", "referrerMiniapp", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMiniapp", "()Ljava/lang/String;", "getReferrerMiniapp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TabConfigRequest {

    @NotNull
    private final String miniapp;
    private final String referrerMiniapp;

    public TabConfigRequest(@NotNull String miniapp, String str) {
        Intrinsics.checkNotNullParameter(miniapp, "miniapp");
        this.miniapp = miniapp;
        this.referrerMiniapp = str;
    }

    public static /* synthetic */ TabConfigRequest copy$default(TabConfigRequest tabConfigRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tabConfigRequest.miniapp;
        }
        if ((i11 & 2) != 0) {
            str2 = tabConfigRequest.referrerMiniapp;
        }
        return tabConfigRequest.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMiniapp() {
        return this.miniapp;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReferrerMiniapp() {
        return this.referrerMiniapp;
    }

    @NotNull
    public final TabConfigRequest copy(@NotNull String miniapp, String referrerMiniapp) {
        Intrinsics.checkNotNullParameter(miniapp, "miniapp");
        return new TabConfigRequest(miniapp, referrerMiniapp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabConfigRequest)) {
            return false;
        }
        TabConfigRequest tabConfigRequest = (TabConfigRequest) other;
        return Intrinsics.d(this.miniapp, tabConfigRequest.miniapp) && Intrinsics.d(this.referrerMiniapp, tabConfigRequest.referrerMiniapp);
    }

    @NotNull
    public final String getMiniapp() {
        return this.miniapp;
    }

    public final String getReferrerMiniapp() {
        return this.referrerMiniapp;
    }

    public int hashCode() {
        int hashCode = this.miniapp.hashCode() * 31;
        String str = this.referrerMiniapp;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return e.a("TabConfigRequest(miniapp=", this.miniapp, ", referrerMiniapp=", this.referrerMiniapp, ")");
    }

    public /* synthetic */ TabConfigRequest(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2);
    }
}
