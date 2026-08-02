package ru.ozon.app.android.favorites.data.api;

import C.o0;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/favorites/data/api/FavoriteRequest;", "", "skus", "", "", "referer", "", "miniapp", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getSkus", "()Ljava/util/List;", "getReferer", "()Ljava/lang/String;", "getMiniapp", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FavoriteRequest {
    private final String miniapp;
    private final String referer;

    @NotNull
    private final List<Long> skus;

    public FavoriteRequest(@NotNull List<Long> skus, String str, String str2) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        this.skus = skus;
        this.referer = str;
        this.miniapp = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoriteRequest copy$default(FavoriteRequest favoriteRequest, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = favoriteRequest.skus;
        }
        if ((i11 & 2) != 0) {
            str = favoriteRequest.referer;
        }
        if ((i11 & 4) != 0) {
            str2 = favoriteRequest.miniapp;
        }
        return favoriteRequest.copy(list, str, str2);
    }

    @NotNull
    public final List<Long> component1() {
        return this.skus;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReferer() {
        return this.referer;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMiniapp() {
        return this.miniapp;
    }

    @NotNull
    public final FavoriteRequest copy(@NotNull List<Long> skus, String referer, String miniapp) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        return new FavoriteRequest(skus, referer, miniapp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteRequest)) {
            return false;
        }
        FavoriteRequest favoriteRequest = (FavoriteRequest) other;
        return Intrinsics.d(this.skus, favoriteRequest.skus) && Intrinsics.d(this.referer, favoriteRequest.referer) && Intrinsics.d(this.miniapp, favoriteRequest.miniapp);
    }

    public final String getMiniapp() {
        return this.miniapp;
    }

    public final String getReferer() {
        return this.referer;
    }

    @NotNull
    public final List<Long> getSkus() {
        return this.skus;
    }

    public int hashCode() {
        int hashCode = this.skus.hashCode() * 31;
        String str = this.referer;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.miniapp;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Long> list = this.skus;
        String str = this.referer;
        return o0.c(C4055a.a("FavoriteRequest(skus=", ", referer=", str, ", miniapp=", list), this.miniapp, ")");
    }

    public /* synthetic */ FavoriteRequest(List list, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }
}
