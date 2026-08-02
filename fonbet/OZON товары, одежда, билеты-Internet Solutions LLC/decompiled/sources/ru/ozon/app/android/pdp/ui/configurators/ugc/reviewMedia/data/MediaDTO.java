package ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.data;

import N3.C3660k;
import Nh.a;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/data/MediaDTO;", "", ImagesContract.URL, "", "deeplink", "supportIcon", "supportIconTintColor", "videoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;)V", "getUrl", "()Ljava/lang/String;", "getDeeplink", "getSupportIcon", "getSupportIconTintColor", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MediaDTO {
    public static final int $stable = PreloadVideoInfo.$stable;
    private final String deeplink;
    private final String supportIcon;
    private final String supportIconTintColor;
    private final String url;
    private final PreloadVideoInfo videoInfo;

    public MediaDTO(String str, String str2, String str3, String str4, PreloadVideoInfo preloadVideoInfo) {
        this.url = str;
        this.deeplink = str2;
        this.supportIcon = str3;
        this.supportIconTintColor = str4;
        this.videoInfo = preloadVideoInfo;
    }

    public static /* synthetic */ MediaDTO copy$default(MediaDTO mediaDTO, String str, String str2, String str3, String str4, PreloadVideoInfo preloadVideoInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mediaDTO.url;
        }
        if ((i11 & 2) != 0) {
            str2 = mediaDTO.deeplink;
        }
        if ((i11 & 4) != 0) {
            str3 = mediaDTO.supportIcon;
        }
        if ((i11 & 8) != 0) {
            str4 = mediaDTO.supportIconTintColor;
        }
        if ((i11 & 16) != 0) {
            preloadVideoInfo = mediaDTO.videoInfo;
        }
        PreloadVideoInfo preloadVideoInfo2 = preloadVideoInfo;
        String str5 = str3;
        return mediaDTO.copy(str, str2, str5, str4, preloadVideoInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSupportIcon() {
        return this.supportIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSupportIconTintColor() {
        return this.supportIconTintColor;
    }

    /* renamed from: component5, reason: from getter */
    public final PreloadVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    @NotNull
    public final MediaDTO copy(String url, String deeplink, String supportIcon, String supportIconTintColor, PreloadVideoInfo videoInfo) {
        return new MediaDTO(url, deeplink, supportIcon, supportIconTintColor, videoInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaDTO)) {
            return false;
        }
        MediaDTO mediaDTO = (MediaDTO) other;
        return Intrinsics.d(this.url, mediaDTO.url) && Intrinsics.d(this.deeplink, mediaDTO.deeplink) && Intrinsics.d(this.supportIcon, mediaDTO.supportIcon) && Intrinsics.d(this.supportIconTintColor, mediaDTO.supportIconTintColor) && Intrinsics.d(this.videoInfo, mediaDTO.videoInfo);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getSupportIcon() {
        return this.supportIcon;
    }

    public final String getSupportIconTintColor() {
        return this.supportIconTintColor;
    }

    public final String getUrl() {
        return this.url;
    }

    public final PreloadVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deeplink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.supportIcon;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.supportIconTintColor;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PreloadVideoInfo preloadVideoInfo = this.videoInfo;
        return hashCode4 + (preloadVideoInfo != null ? preloadVideoInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.deeplink;
        String str3 = this.supportIcon;
        String str4 = this.supportIconTintColor;
        PreloadVideoInfo preloadVideoInfo = this.videoInfo;
        StringBuilder d11 = C3660k.d("MediaDTO(url=", str, ", deeplink=", str2, ", supportIcon=");
        a.h(d11, str3, ", supportIconTintColor=", str4, ", videoInfo=");
        d11.append(preloadVideoInfo);
        d11.append(")");
        return d11.toString();
    }
}
