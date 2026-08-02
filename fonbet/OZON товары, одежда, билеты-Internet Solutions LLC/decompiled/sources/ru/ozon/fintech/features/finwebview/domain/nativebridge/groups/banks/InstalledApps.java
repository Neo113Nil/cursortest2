package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.banks;

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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/banks/InstalledApps;", "", "installed", "", "", "<init>", "(Ljava/util/List;)V", "getInstalled", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InstalledApps {

    @NotNull
    private final List<String> installed;

    public InstalledApps(@i(name = "installed") @NotNull List<String> installed) {
        Intrinsics.checkNotNullParameter(installed, "installed");
        this.installed = installed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstalledApps copy$default(InstalledApps installedApps, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = installedApps.installed;
        }
        return installedApps.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.installed;
    }

    @NotNull
    public final InstalledApps copy(@i(name = "installed") @NotNull List<String> installed) {
        Intrinsics.checkNotNullParameter(installed, "installed");
        return new InstalledApps(installed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InstalledApps) && Intrinsics.d(this.installed, ((InstalledApps) other).installed);
    }

    @NotNull
    public final List<String> getInstalled() {
        return this.installed;
    }

    public int hashCode() {
        return this.installed.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("InstalledApps(installed=", ")", this.installed);
    }
}
