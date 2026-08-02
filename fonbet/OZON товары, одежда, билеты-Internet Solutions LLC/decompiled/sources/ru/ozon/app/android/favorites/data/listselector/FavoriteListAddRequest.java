package ru.ozon.app.android.favorites.data.listselector;

import Pk0.c;
import com.squareup.moshi.j;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/favorites/data/listselector/FavoriteListAddRequest;", "", "skus", "", "", "id", "from", "", "<init>", "(Ljava/util/List;JLjava/lang/String;)V", "getSkus", "()Ljava/util/List;", "getId", "()J", "getFrom", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteListAddRequest {
    private final String from;
    private final long id;

    @NotNull
    private final List<Long> skus;

    public FavoriteListAddRequest(@NotNull List<Long> skus, long j11, String str) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        this.skus = skus;
        this.id = j11;
        this.from = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoriteListAddRequest copy$default(FavoriteListAddRequest favoriteListAddRequest, List list, long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = favoriteListAddRequest.skus;
        }
        if ((i11 & 2) != 0) {
            j11 = favoriteListAddRequest.id;
        }
        if ((i11 & 4) != 0) {
            str = favoriteListAddRequest.from;
        }
        return favoriteListAddRequest.copy(list, j11, str);
    }

    @NotNull
    public final List<Long> component1() {
        return this.skus;
    }

    /* renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @NotNull
    public final FavoriteListAddRequest copy(@NotNull List<Long> skus, long id2, String from) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        return new FavoriteListAddRequest(skus, id2, from);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteListAddRequest)) {
            return false;
        }
        FavoriteListAddRequest favoriteListAddRequest = (FavoriteListAddRequest) other;
        return Intrinsics.d(this.skus, favoriteListAddRequest.skus) && this.id == favoriteListAddRequest.id && Intrinsics.d(this.from, favoriteListAddRequest.from);
    }

    public final String getFrom() {
        return this.from;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final List<Long> getSkus() {
        return this.skus;
    }

    public int hashCode() {
        int a11 = c.a(this.skus.hashCode() * 31, 31, this.id);
        String str = this.from;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        List<Long> list = this.skus;
        long j11 = this.id;
        String str = this.from;
        StringBuilder sb2 = new StringBuilder("FavoriteListAddRequest(skus=");
        sb2.append(list);
        sb2.append(", id=");
        sb2.append(j11);
        return C6594f.a(", from=", str, ")", sb2);
    }

    public /* synthetic */ FavoriteListAddRequest(List list, long j11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, j11, (i11 & 4) != 0 ? null : str);
    }
}
