package ru.ozon.fintech.features.finwebview.domain.webbridge.groups.navigation.models;

import Ak.b;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/webbridge/groups/navigation/models/NavigationLaunchAndDeeplinkEvent;", "", "deeplink", "", "firstStart", "", "<init>", "(Ljava/lang/String;Z)V", "getDeeplink", "()Ljava/lang/String;", "getFirstStart", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NavigationLaunchAndDeeplinkEvent {
    private final String deeplink;
    private final boolean firstStart;

    public NavigationLaunchAndDeeplinkEvent(@i(name = "deeplink") String str, @i(name = "firstStart") boolean z11) {
        this.deeplink = str;
        this.firstStart = z11;
    }

    public static /* synthetic */ NavigationLaunchAndDeeplinkEvent copy$default(NavigationLaunchAndDeeplinkEvent navigationLaunchAndDeeplinkEvent, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = navigationLaunchAndDeeplinkEvent.deeplink;
        }
        if ((i11 & 2) != 0) {
            z11 = navigationLaunchAndDeeplinkEvent.firstStart;
        }
        return navigationLaunchAndDeeplinkEvent.copy(str, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFirstStart() {
        return this.firstStart;
    }

    @NotNull
    public final NavigationLaunchAndDeeplinkEvent copy(@i(name = "deeplink") String deeplink, @i(name = "firstStart") boolean firstStart) {
        return new NavigationLaunchAndDeeplinkEvent(deeplink, firstStart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationLaunchAndDeeplinkEvent)) {
            return false;
        }
        NavigationLaunchAndDeeplinkEvent navigationLaunchAndDeeplinkEvent = (NavigationLaunchAndDeeplinkEvent) other;
        return Intrinsics.d(this.deeplink, navigationLaunchAndDeeplinkEvent.deeplink) && this.firstStart == navigationLaunchAndDeeplinkEvent.firstStart;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final boolean getFirstStart() {
        return this.firstStart;
    }

    public int hashCode() {
        String str = this.deeplink;
        return Boolean.hashCode(this.firstStart) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return b.f("NavigationLaunchAndDeeplinkEvent(deeplink=", this.deeplink, ", firstStart=", ")", this.firstStart);
    }
}
