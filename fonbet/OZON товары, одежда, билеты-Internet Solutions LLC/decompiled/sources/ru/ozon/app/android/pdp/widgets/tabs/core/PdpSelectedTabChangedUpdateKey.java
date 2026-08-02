package ru.ozon.app.android.pdp.widgets.tabs.core;

import A00.a;
import B0.A0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/core/PdpSelectedTabChangedUpdateKey;", "LA00/a$J$a;", "", "selectedGroupId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectedGroupId", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PdpSelectedTabChangedUpdateKey implements a.J.InterfaceC0007a {

    @NotNull
    private final String selectedGroupId;

    public PdpSelectedTabChangedUpdateKey(@NotNull String selectedGroupId) {
        Intrinsics.checkNotNullParameter(selectedGroupId, "selectedGroupId");
        this.selectedGroupId = selectedGroupId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PdpSelectedTabChangedUpdateKey) && Intrinsics.d(this.selectedGroupId, ((PdpSelectedTabChangedUpdateKey) other).selectedGroupId);
    }

    @NotNull
    public final String getSelectedGroupId() {
        return this.selectedGroupId;
    }

    public int hashCode() {
        return this.selectedGroupId.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("PdpSelectedTabChangedUpdateKey(selectedGroupId=", this.selectedGroupId, ")");
    }
}
