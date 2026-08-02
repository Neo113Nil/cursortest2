package ru.ozon.fintech.features.finwebview.domain.webbridge.groups.navigation.models;

import B0.A0;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/webbridge/groups/navigation/models/NavigationClickCancelLink;", "", "", "cancelLink", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lru/ozon/fintech/features/finwebview/domain/webbridge/groups/navigation/models/NavigationClickCancelLink;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCancelLink", "Companion", "a", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NavigationClickCancelLink {

    @NotNull
    private final String cancelLink;

    public NavigationClickCancelLink(@i(name = "cancelLink") @NotNull String cancelLink) {
        Intrinsics.checkNotNullParameter(cancelLink, "cancelLink");
        this.cancelLink = cancelLink;
    }

    public static /* synthetic */ NavigationClickCancelLink copy$default(NavigationClickCancelLink navigationClickCancelLink, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = navigationClickCancelLink.cancelLink;
        }
        return navigationClickCancelLink.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCancelLink() {
        return this.cancelLink;
    }

    @NotNull
    public final NavigationClickCancelLink copy(@i(name = "cancelLink") @NotNull String cancelLink) {
        Intrinsics.checkNotNullParameter(cancelLink, "cancelLink");
        return new NavigationClickCancelLink(cancelLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NavigationClickCancelLink) && Intrinsics.d(this.cancelLink, ((NavigationClickCancelLink) other).cancelLink);
    }

    @NotNull
    public final String getCancelLink() {
        return this.cancelLink;
    }

    public int hashCode() {
        return this.cancelLink.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("NavigationClickCancelLink(cancelLink=", this.cancelLink, ")");
    }
}
