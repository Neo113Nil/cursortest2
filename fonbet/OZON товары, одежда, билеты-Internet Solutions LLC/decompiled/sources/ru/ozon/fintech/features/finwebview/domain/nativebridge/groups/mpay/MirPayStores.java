package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay;

import V.e;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayStores;", "", "storeName", "", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStoreName", "()Ljava/lang/String;", "getDeeplink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MirPayStores {

    @NotNull
    private final String deeplink;

    @NotNull
    private final String storeName;

    public MirPayStores(@i(name = "store") @NotNull String storeName, @i(name = "deeplink") @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.storeName = storeName;
        this.deeplink = deeplink;
    }

    public static /* synthetic */ MirPayStores copy$default(MirPayStores mirPayStores, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mirPayStores.storeName;
        }
        if ((i11 & 2) != 0) {
            str2 = mirPayStores.deeplink;
        }
        return mirPayStores.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final MirPayStores copy(@i(name = "store") @NotNull String storeName, @i(name = "deeplink") @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new MirPayStores(storeName, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MirPayStores)) {
            return false;
        }
        MirPayStores mirPayStores = (MirPayStores) other;
        return Intrinsics.d(this.storeName, mirPayStores.storeName) && Intrinsics.d(this.deeplink, mirPayStores.deeplink);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getStoreName() {
        return this.storeName;
    }

    public int hashCode() {
        return this.deeplink.hashCode() + (this.storeName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("MirPayStores(storeName=", this.storeName, ", deeplink=", this.deeplink, ")");
    }
}
