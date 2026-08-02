package ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.data;

import A00.a;
import B90.C2618u;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/preOrderSubscriptionButton/data/PreOrderSubscriptionUpdateKey;", "LA00/a$J$a;", "", "isSubscribed", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PreOrderSubscriptionUpdateKey implements a.J.InterfaceC0007a {
    private final boolean isSubscribed;

    public PreOrderSubscriptionUpdateKey(boolean z11) {
        this.isSubscribed = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PreOrderSubscriptionUpdateKey) && this.isSubscribed == ((PreOrderSubscriptionUpdateKey) other).isSubscribed;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSubscribed);
    }

    /* renamed from: isSubscribed, reason: from getter */
    public final boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    @NotNull
    public String toString() {
        return C2618u.g("PreOrderSubscriptionUpdateKey(isSubscribed=", ")", this.isSubscribed);
    }
}
