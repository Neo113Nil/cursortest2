package com.blaze.blazesdk.features.stories.models.local;

import androidx.annotation.Keep;
import defpackage.lnb;
import defpackage.u0a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/blaze/blazesdk/features/stories/models/local/PageLocal;", "", "id", "", "is_read", "", "storyId", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getStoryId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PageLocal {
    public static final int $stable = 0;

    @NotNull
    private final String id;
    private final boolean is_read;

    @NotNull
    private final String storyId;

    public PageLocal(@NotNull String str, boolean z, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.is_read = z;
        this.storyId = str2;
    }

    public static /* synthetic */ PageLocal copy$default(PageLocal pageLocal, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageLocal.id;
        }
        if ((i & 2) != 0) {
            z = pageLocal.is_read;
        }
        if ((i & 4) != 0) {
            str2 = pageLocal.storyId;
        }
        return pageLocal.copy(str, z, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIs_read() {
        return this.is_read;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStoryId() {
        return this.storyId;
    }

    @NotNull
    public final PageLocal copy(@NotNull String id, boolean is_read, @NotNull String storyId) {
        id.getClass();
        storyId.getClass();
        return new PageLocal(id, is_read, storyId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageLocal)) {
            return false;
        }
        PageLocal pageLocal = (PageLocal) other;
        return Intrinsics.c(this.id, pageLocal.id) && this.is_read == pageLocal.is_read && Intrinsics.c(this.storyId, pageLocal.storyId);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getStoryId() {
        return this.storyId;
    }

    public int hashCode() {
        return this.storyId.hashCode() + u0a.t(this.id.hashCode() * 31, this.is_read);
    }

    public final boolean is_read() {
        return this.is_read;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PageLocal(id=");
        sb.append(this.id);
        sb.append(", is_read=");
        sb.append(this.is_read);
        sb.append(", storyId=");
        return lnb.q(sb, this.storyId, ')');
    }
}
