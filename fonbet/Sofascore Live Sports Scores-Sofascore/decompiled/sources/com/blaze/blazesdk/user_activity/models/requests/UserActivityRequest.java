package com.blaze.blazesdk.user_activity.models.requests;

import androidx.annotation.Keep;
import defpackage.b6h;
import defpackage.fc6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/blaze/blazesdk/user_activity/models/requests/UserActivityRequest;", "", "viewedMoments", "", "", "viewedPages", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getViewedMoments", "()Ljava/util/List;", "getViewedPages", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserActivityRequest {
    public static final int $stable = 8;

    @b6h("viewedMoments")
    @NotNull
    private final List<String> viewedMoments;

    @b6h("viewedPages")
    @NotNull
    private final List<String> viewedPages;

    public UserActivityRequest(@NotNull List<String> list, @NotNull List<String> list2) {
        list.getClass();
        list2.getClass();
        this.viewedMoments = list;
        this.viewedPages = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserActivityRequest copy$default(UserActivityRequest userActivityRequest, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userActivityRequest.viewedMoments;
        }
        if ((i & 2) != 0) {
            list2 = userActivityRequest.viewedPages;
        }
        return userActivityRequest.copy(list, list2);
    }

    @NotNull
    public final List<String> component1() {
        return this.viewedMoments;
    }

    @NotNull
    public final List<String> component2() {
        return this.viewedPages;
    }

    @NotNull
    public final UserActivityRequest copy(@NotNull List<String> viewedMoments, @NotNull List<String> viewedPages) {
        viewedMoments.getClass();
        viewedPages.getClass();
        return new UserActivityRequest(viewedMoments, viewedPages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserActivityRequest)) {
            return false;
        }
        UserActivityRequest userActivityRequest = (UserActivityRequest) other;
        return Intrinsics.c(this.viewedMoments, userActivityRequest.viewedMoments) && Intrinsics.c(this.viewedPages, userActivityRequest.viewedPages);
    }

    @NotNull
    public final List<String> getViewedMoments() {
        return this.viewedMoments;
    }

    @NotNull
    public final List<String> getViewedPages() {
        return this.viewedPages;
    }

    public int hashCode() {
        return this.viewedPages.hashCode() + (this.viewedMoments.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("UserActivityRequest(viewedMoments=");
        sb.append(this.viewedMoments);
        sb.append(", viewedPages=");
        return fc6.p(sb, this.viewedPages, ')');
    }
}
