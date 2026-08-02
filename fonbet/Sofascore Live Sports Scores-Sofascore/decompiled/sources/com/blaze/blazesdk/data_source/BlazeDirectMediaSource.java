package com.blaze.blazesdk.data_source;

import androidx.annotation.Keep;
import defpackage.lnb;
import defpackage.o6a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b¨\u0006 "}, d2 = {"Lcom/blaze/blazesdk/data_source/BlazeDirectMediaSource;", "", "id", "", "videoUrl", "previewImageUrl", "title", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getVideoUrl", "getPreviewImageUrl", "getTitle", "getDescription", "stringRepresentation", "getStringRepresentation$blazesdk_release", "analyticsRepresentation", "getAnalyticsRepresentation$blazesdk_release", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeDirectMediaSource {
    public static final int $stable = 0;

    @Nullable
    private final String description;

    @NotNull
    private final String id;

    @Nullable
    private final String previewImageUrl;

    @Nullable
    private final String title;

    @NotNull
    private final String videoUrl;

    public BlazeDirectMediaSource(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.videoUrl = str2;
        this.previewImageUrl = str3;
        this.title = str4;
        this.description = str5;
    }

    public static /* synthetic */ BlazeDirectMediaSource copy$default(BlazeDirectMediaSource blazeDirectMediaSource, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeDirectMediaSource.id;
        }
        if ((i & 2) != 0) {
            str2 = blazeDirectMediaSource.videoUrl;
        }
        if ((i & 4) != 0) {
            str3 = blazeDirectMediaSource.previewImageUrl;
        }
        if ((i & 8) != 0) {
            str4 = blazeDirectMediaSource.title;
        }
        if ((i & 16) != 0) {
            str5 = blazeDirectMediaSource.description;
        }
        String str6 = str5;
        String str7 = str3;
        return blazeDirectMediaSource.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final BlazeDirectMediaSource copy(@NotNull String id, @NotNull String videoUrl, @Nullable String previewImageUrl, @Nullable String title, @Nullable String description) {
        id.getClass();
        videoUrl.getClass();
        return new BlazeDirectMediaSource(id, videoUrl, previewImageUrl, title, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeDirectMediaSource)) {
            return false;
        }
        BlazeDirectMediaSource blazeDirectMediaSource = (BlazeDirectMediaSource) other;
        return Intrinsics.c(this.id, blazeDirectMediaSource.id) && Intrinsics.c(this.videoUrl, blazeDirectMediaSource.videoUrl) && Intrinsics.c(this.previewImageUrl, blazeDirectMediaSource.previewImageUrl) && Intrinsics.c(this.title, blazeDirectMediaSource.title) && Intrinsics.c(this.description, blazeDirectMediaSource.description);
    }

    @Nullable
    public final String getAnalyticsRepresentation$blazesdk_release() {
        return null;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    @NotNull
    public final String getStringRepresentation$blazesdk_release() {
        return this.id;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        int k = o6a.k(this.videoUrl, this.id.hashCode() * 31);
        String str = this.previewImageUrl;
        int hashCode = (k + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeDirectMediaSource(id=");
        sb.append(this.id);
        sb.append(", videoUrl=");
        sb.append(this.videoUrl);
        sb.append(", previewImageUrl=");
        sb.append(this.previewImageUrl);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        return lnb.q(sb, this.description, ')');
    }

    public /* synthetic */ BlazeDirectMediaSource(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
