package com.blaze.blazesdk.user_activity.models.responses;

import androidx.annotation.Keep;
import defpackage.b6h;
import defpackage.dmi;
import defpackage.fc6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003JI\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/blaze/blazesdk/user_activity/models/responses/UserActivity;", "", "likedMoments", "", "", "viewedMoments", "viewedStoryPages", "interactionResponses", "Lcom/blaze/blazesdk/user_activity/models/responses/UserActivityInteraction;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getLikedMoments", "()Ljava/util/List;", "getViewedMoments", "getViewedStoryPages", "getInteractionResponses", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserActivity {
    public static final int $stable = 8;

    @b6h("interactionResponses")
    @NotNull
    private final List<UserActivityInteraction> interactionResponses;

    @b6h("likedMoments")
    @NotNull
    private final List<String> likedMoments;

    @b6h("viewedMoments")
    @NotNull
    private final List<String> viewedMoments;

    @b6h("viewedStoryPages")
    @NotNull
    private final List<String> viewedStoryPages;

    public UserActivity(@NotNull List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<UserActivityInteraction> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.likedMoments = list;
        this.viewedMoments = list2;
        this.viewedStoryPages = list3;
        this.interactionResponses = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserActivity copy$default(UserActivity userActivity, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userActivity.likedMoments;
        }
        if ((i & 2) != 0) {
            list2 = userActivity.viewedMoments;
        }
        if ((i & 4) != 0) {
            list3 = userActivity.viewedStoryPages;
        }
        if ((i & 8) != 0) {
            list4 = userActivity.interactionResponses;
        }
        return userActivity.copy(list, list2, list3, list4);
    }

    @NotNull
    public final List<String> component1() {
        return this.likedMoments;
    }

    @NotNull
    public final List<String> component2() {
        return this.viewedMoments;
    }

    @NotNull
    public final List<String> component3() {
        return this.viewedStoryPages;
    }

    @NotNull
    public final List<UserActivityInteraction> component4() {
        return this.interactionResponses;
    }

    @NotNull
    public final UserActivity copy(@NotNull List<String> likedMoments, @NotNull List<String> viewedMoments, @NotNull List<String> viewedStoryPages, @NotNull List<UserActivityInteraction> interactionResponses) {
        likedMoments.getClass();
        viewedMoments.getClass();
        viewedStoryPages.getClass();
        interactionResponses.getClass();
        return new UserActivity(likedMoments, viewedMoments, viewedStoryPages, interactionResponses);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserActivity)) {
            return false;
        }
        UserActivity userActivity = (UserActivity) other;
        return Intrinsics.c(this.likedMoments, userActivity.likedMoments) && Intrinsics.c(this.viewedMoments, userActivity.viewedMoments) && Intrinsics.c(this.viewedStoryPages, userActivity.viewedStoryPages) && Intrinsics.c(this.interactionResponses, userActivity.interactionResponses);
    }

    @NotNull
    public final List<UserActivityInteraction> getInteractionResponses() {
        return this.interactionResponses;
    }

    @NotNull
    public final List<String> getLikedMoments() {
        return this.likedMoments;
    }

    @NotNull
    public final List<String> getViewedMoments() {
        return this.viewedMoments;
    }

    @NotNull
    public final List<String> getViewedStoryPages() {
        return this.viewedStoryPages;
    }

    public int hashCode() {
        return this.interactionResponses.hashCode() + dmi.d(dmi.d(this.likedMoments.hashCode() * 31, 31, this.viewedMoments), 31, this.viewedStoryPages);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("UserActivity(likedMoments=");
        sb.append(this.likedMoments);
        sb.append(", viewedMoments=");
        sb.append(this.viewedMoments);
        sb.append(", viewedStoryPages=");
        sb.append(this.viewedStoryPages);
        sb.append(", interactionResponses=");
        return fc6.p(sb, this.interactionResponses, ')');
    }
}
