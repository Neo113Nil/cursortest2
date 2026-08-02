package ru.ozon.app.android.search.dialogsearchscreen.searchbar.common;

import Ak.b;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/searchbar/common/PageRefreshState;", "", "", ImagesContract.URL, "", "isNeedToTrackSearchEvent", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Z", "()Z", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PageRefreshState {
    private final boolean isNeedToTrackSearchEvent;
    private final String url;

    public PageRefreshState(String str, boolean z11) {
        this.url = str;
        this.isNeedToTrackSearchEvent = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageRefreshState)) {
            return false;
        }
        PageRefreshState pageRefreshState = (PageRefreshState) other;
        return Intrinsics.d(this.url, pageRefreshState.url) && this.isNeedToTrackSearchEvent == pageRefreshState.isNeedToTrackSearchEvent;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        return Boolean.hashCode(this.isNeedToTrackSearchEvent) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    /* renamed from: isNeedToTrackSearchEvent, reason: from getter */
    public final boolean getIsNeedToTrackSearchEvent() {
        return this.isNeedToTrackSearchEvent;
    }

    @NotNull
    public String toString() {
        return b.f("PageRefreshState(url=", this.url, ", isNeedToTrackSearchEvent=", ")", this.isNeedToTrackSearchEvent);
    }

    public /* synthetic */ PageRefreshState(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? true : z11);
    }
}
