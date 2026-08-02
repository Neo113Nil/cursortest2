package com.blaze.blazesdk.app_configurations.models.universal_links;

import androidx.annotation.Keep;
import defpackage.b6h;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/universal_links/SharingCopyDto;", "", "story", "", "moment", "video", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStory", "()Ljava/lang/String;", "getMoment", "getVideo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SharingCopyDto {
    public static final int $stable = 0;

    @b6h("moment")
    @Nullable
    private final String moment;

    @b6h("story")
    @Nullable
    private final String story;

    @b6h("video")
    @Nullable
    private final String video;

    @Keep
    public SharingCopyDto(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.story = str;
        this.moment = str2;
        this.video = str3;
    }

    public static /* synthetic */ SharingCopyDto copy$default(SharingCopyDto sharingCopyDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharingCopyDto.story;
        }
        if ((i & 2) != 0) {
            str2 = sharingCopyDto.moment;
        }
        if ((i & 4) != 0) {
            str3 = sharingCopyDto.video;
        }
        return sharingCopyDto.copy(str, str2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getStory() {
        return this.story;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getMoment() {
        return this.moment;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getVideo() {
        return this.video;
    }

    @NotNull
    public final SharingCopyDto copy(@Nullable String story, @Nullable String moment, @Nullable String video) {
        return new SharingCopyDto(story, moment, video);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharingCopyDto)) {
            return false;
        }
        SharingCopyDto sharingCopyDto = (SharingCopyDto) other;
        return Intrinsics.c(this.story, sharingCopyDto.story) && Intrinsics.c(this.moment, sharingCopyDto.moment) && Intrinsics.c(this.video, sharingCopyDto.video);
    }

    @Nullable
    public final String getMoment() {
        return this.moment;
    }

    @Nullable
    public final String getStory() {
        return this.story;
    }

    @Nullable
    public final String getVideo() {
        return this.video;
    }

    public int hashCode() {
        String str = this.story;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.moment;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.video;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SharingCopyDto(story=");
        sb.append(this.story);
        sb.append(", moment=");
        sb.append(this.moment);
        sb.append(", video=");
        return lnb.q(sb, this.video, ')');
    }
}
