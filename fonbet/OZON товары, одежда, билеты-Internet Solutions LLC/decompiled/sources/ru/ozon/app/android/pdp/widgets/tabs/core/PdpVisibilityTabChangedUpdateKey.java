package ru.ozon.app.android.pdp.widgets.tabs.core;

import A00.a;
import Ak.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/core/PdpVisibilityTabChangedUpdateKey;", "LA00/a$J$a;", "", "tabGroupId", "", "isHidden", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTabGroupId", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PdpVisibilityTabChangedUpdateKey implements a.J.InterfaceC0007a {
    private final boolean isHidden;

    @NotNull
    private final String tabGroupId;

    public PdpVisibilityTabChangedUpdateKey(@NotNull String tabGroupId, boolean z11) {
        Intrinsics.checkNotNullParameter(tabGroupId, "tabGroupId");
        this.tabGroupId = tabGroupId;
        this.isHidden = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdpVisibilityTabChangedUpdateKey)) {
            return false;
        }
        PdpVisibilityTabChangedUpdateKey pdpVisibilityTabChangedUpdateKey = (PdpVisibilityTabChangedUpdateKey) other;
        return Intrinsics.d(this.tabGroupId, pdpVisibilityTabChangedUpdateKey.tabGroupId) && this.isHidden == pdpVisibilityTabChangedUpdateKey.isHidden;
    }

    @NotNull
    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isHidden) + (this.tabGroupId.hashCode() * 31);
    }

    /* renamed from: isHidden, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    @NotNull
    public String toString() {
        return b.f("PdpVisibilityTabChangedUpdateKey(tabGroupId=", this.tabGroupId, ", isHidden=", ")", this.isHidden);
    }
}
