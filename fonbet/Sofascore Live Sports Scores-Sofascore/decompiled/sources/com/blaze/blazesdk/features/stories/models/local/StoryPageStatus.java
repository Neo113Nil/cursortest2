package com.blaze.blazesdk.features.stories.models.local;

import androidx.annotation.Keep;
import defpackage.lnb;
import defpackage.o6a;
import defpackage.utl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u0006\u0010\r\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/blaze/blazesdk/features/stories/models/local/StoryPageStatus;", "Lutl;", "", "pageId", "storyId", "", "isSynced", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/blaze/blazesdk/features/stories/models/local/StoryPageStatus;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPageId", "getStoryId", "setStoryId", "(Ljava/lang/String;)V", "Z", "setSynced", "(Z)V", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StoryPageStatus implements utl {
    public static final int $stable = 8;
    private boolean isSynced;

    @NotNull
    private final String pageId;

    @NotNull
    private String storyId;

    public StoryPageStatus(@NotNull String str, @NotNull String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.pageId = str;
        this.storyId = str2;
        this.isSynced = z;
    }

    public static /* synthetic */ StoryPageStatus copy$default(StoryPageStatus storyPageStatus, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storyPageStatus.pageId;
        }
        if ((i & 2) != 0) {
            str2 = storyPageStatus.storyId;
        }
        if ((i & 4) != 0) {
            z = storyPageStatus.isSynced;
        }
        return storyPageStatus.copy(str, str2, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStoryId() {
        return this.storyId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSynced() {
        return this.isSynced;
    }

    @NotNull
    public final StoryPageStatus copy(@NotNull String pageId, @NotNull String storyId, boolean isSynced) {
        pageId.getClass();
        storyId.getClass();
        return new StoryPageStatus(pageId, storyId, isSynced);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryPageStatus)) {
            return false;
        }
        StoryPageStatus storyPageStatus = (StoryPageStatus) other;
        return Intrinsics.c(this.pageId, storyPageStatus.pageId) && Intrinsics.c(this.storyId, storyPageStatus.storyId) && this.isSynced == storyPageStatus.isSynced;
    }

    @NotNull
    public final String getPageId() {
        return this.pageId;
    }

    @NotNull
    public final String getStoryId() {
        return this.storyId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSynced) + o6a.k(this.storyId, this.pageId.hashCode() * 31);
    }

    public boolean isSynced() {
        return this.isSynced;
    }

    public final void setStoryId(@NotNull String str) {
        str.getClass();
        this.storyId = str;
    }

    @Override // defpackage.utl
    public void setSynced(boolean z) {
        this.isSynced = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("StoryPageStatus(pageId=");
        sb.append(this.pageId);
        sb.append(", storyId=");
        sb.append(this.storyId);
        sb.append(", isSynced=");
        return lnb.r(sb, this.isSynced, ')');
    }
}
