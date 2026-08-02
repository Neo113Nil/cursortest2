package ru.ozon.fintech.features.installedapps.domain;

import H3.c;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/features/installedapps/domain/WhiteListApps;", "", "whitelist", "", "", "<init>", "(Ljava/util/List;)V", "getWhitelist", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "installed-apps_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WhiteListApps {

    @NotNull
    private final List<String> whitelist;

    public WhiteListApps(@i(name = "whitelist") @NotNull List<String> whitelist) {
        Intrinsics.checkNotNullParameter(whitelist, "whitelist");
        this.whitelist = whitelist;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WhiteListApps copy$default(WhiteListApps whiteListApps, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = whiteListApps.whitelist;
        }
        return whiteListApps.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.whitelist;
    }

    @NotNull
    public final WhiteListApps copy(@i(name = "whitelist") @NotNull List<String> whitelist) {
        Intrinsics.checkNotNullParameter(whitelist, "whitelist");
        return new WhiteListApps(whitelist);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WhiteListApps) && Intrinsics.d(this.whitelist, ((WhiteListApps) other).whitelist);
    }

    @NotNull
    public final List<String> getWhitelist() {
        return this.whitelist;
    }

    public int hashCode() {
        return this.whitelist.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("WhiteListApps(whitelist=", ")", this.whitelist);
    }
}
