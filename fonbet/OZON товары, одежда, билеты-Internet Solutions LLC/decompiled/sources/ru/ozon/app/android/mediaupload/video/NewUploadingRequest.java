package ru.ozon.app.android.mediaupload.video;

import C.o0;
import G.g;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/mediaupload/video/NewUploadingRequest;", "", "ffprobe", "Lorg/json/JSONObject;", "videoType", "", "checksum", "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V", "getFfprobe", "()Lorg/json/JSONObject;", "getVideoType", "()Ljava/lang/String;", "getChecksum", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NewUploadingRequest {
    private final String checksum;

    @NotNull
    private final JSONObject ffprobe;

    @NotNull
    private final String videoType;

    public NewUploadingRequest(@i(name = "ffprobe") @NotNull JSONObject ffprobe, @i(name = "video_type") @NotNull String videoType, @i(name = "checksum") String str) {
        Intrinsics.checkNotNullParameter(ffprobe, "ffprobe");
        Intrinsics.checkNotNullParameter(videoType, "videoType");
        this.ffprobe = ffprobe;
        this.videoType = videoType;
        this.checksum = str;
    }

    public static /* synthetic */ NewUploadingRequest copy$default(NewUploadingRequest newUploadingRequest, JSONObject jSONObject, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jSONObject = newUploadingRequest.ffprobe;
        }
        if ((i11 & 2) != 0) {
            str = newUploadingRequest.videoType;
        }
        if ((i11 & 4) != 0) {
            str2 = newUploadingRequest.checksum;
        }
        return newUploadingRequest.copy(jSONObject, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final JSONObject getFfprobe() {
        return this.ffprobe;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVideoType() {
        return this.videoType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    @NotNull
    public final NewUploadingRequest copy(@i(name = "ffprobe") @NotNull JSONObject ffprobe, @i(name = "video_type") @NotNull String videoType, @i(name = "checksum") String checksum) {
        Intrinsics.checkNotNullParameter(ffprobe, "ffprobe");
        Intrinsics.checkNotNullParameter(videoType, "videoType");
        return new NewUploadingRequest(ffprobe, videoType, checksum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewUploadingRequest)) {
            return false;
        }
        NewUploadingRequest newUploadingRequest = (NewUploadingRequest) other;
        return Intrinsics.d(this.ffprobe, newUploadingRequest.ffprobe) && Intrinsics.d(this.videoType, newUploadingRequest.videoType) && Intrinsics.d(this.checksum, newUploadingRequest.checksum);
    }

    public final String getChecksum() {
        return this.checksum;
    }

    @NotNull
    public final JSONObject getFfprobe() {
        return this.ffprobe;
    }

    @NotNull
    public final String getVideoType() {
        return this.videoType;
    }

    public int hashCode() {
        int a11 = g.a(this.ffprobe.hashCode() * 31, 31, this.videoType);
        String str = this.checksum;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        JSONObject jSONObject = this.ffprobe;
        String str = this.videoType;
        String str2 = this.checksum;
        StringBuilder sb2 = new StringBuilder("NewUploadingRequest(ffprobe=");
        sb2.append(jSONObject);
        sb2.append(", videoType=");
        sb2.append(str);
        sb2.append(", checksum=");
        return o0.c(sb2, str2, ")");
    }
}
