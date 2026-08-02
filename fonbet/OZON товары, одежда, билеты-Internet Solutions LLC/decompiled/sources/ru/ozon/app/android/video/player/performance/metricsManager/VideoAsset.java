package ru.ozon.app.android.video.player.performance.metricsManager;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.video.MediaFormat;
import ru.ozon.app.android.video.MediaFormatKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001d\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;", "", "", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "videoUrl", "", "byteOffset", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", FormPageDTO.Field.FIELD_TYPE_RANGE, "(Ljava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getVideoUrl", "Ljava/lang/Long;", "getByteOffset", "()Ljava/lang/Long;", "getRange", "setRange", "(Ljava/lang/String;)V", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VideoAsset {
    private final Long byteOffset;

    @NotNull
    private String range;

    @NotNull
    private final String videoUrl;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00060\u0007j\u0002`\b*\u00060\u0007j\u0002`\tH\u0000¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f*\u00060\u0007j\u0002`\tH\u0000¢\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\f*\u00060\u0007j\u0002`\tH\u0000¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\f*\u00060\u0007j\u0002`\tH\u0000¢\u0006\u0002\b\u0011J\u0015\u0010\u0012\u001a\u00020\f*\u00060\u0007j\u0002`\tH\u0000¢\u0006\u0002\b\u0013J\u0019\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0007j\u0002`\tH\u0000¢\u0006\u0002\b\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset$Companion;", "", "<init>", "()V", "BASE_URL_DELIMITER", "", "castToBaseUrl", "", "Lru/ozon/app/android/video/player/performance/metricsManager/BaseVideoUrl;", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoUrl;", "castToBaseUrl$video_prodGoogleAllVendorsRelease", "isManifestFile", "", "isManifestFile$video_prodGoogleAllVendorsRelease", "isMp4File", "isMp4File$video_prodGoogleAllVendorsRelease", "isHLSStreamingManifest", "isHLSStreamingManifest$video_prodGoogleAllVendorsRelease", "isDashStreamingManifest", "isDashStreamingManifest$video_prodGoogleAllVendorsRelease", "emptyVideoAsset", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoAsset;", ImagesContract.URL, "emptyVideoAsset$video_prodGoogleAllVendorsRelease", "parseStartingByte", "", "byteRange", "(Ljava/lang/String;)Ljava/lang/Long;", "isByteRangeValid", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isByteRangeValid(String byteRange) {
            Regex regex = new Regex("bytes (\\d+)-(\\d+)/(\\d+)");
            Regex regex2 = new Regex("bytes=(\\d+)-(\\d+)");
            if (byteRange.length() == 0) {
                return false;
            }
            return regex.f(byteRange) || regex2.f(byteRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Long parseStartingByte(String byteRange) {
            if (isByteRangeValid(byteRange)) {
                return Long.valueOf(Long.parseLong((String) h.m(h.t(byteRange, "=", false) ? (String) h.m(byteRange, new String[]{"="}, 0, 6).get(1) : (String) h.m((CharSequence) h.m(byteRange, new String[]{" "}, 0, 6).get(1), new String[]{"/"}, 0, 6).get(0), new String[]{"-"}, 0, 6).get(0)));
            }
            return null;
        }

        @NotNull
        public final String castToBaseUrl$video_prodGoogleAllVendorsRelease(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            String o02 = h.o0(str, "#", str);
            String o03 = h.o0(o02, "?", o02);
            if (!isMp4File$video_prodGoogleAllVendorsRelease(o03)) {
                return h.n0('/', o03, o03);
            }
            String substring = o03.substring(0, o03.length() - 4);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }

        @NotNull
        public final VideoAsset emptyVideoAsset$video_prodGoogleAllVendorsRelease(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new VideoAsset(url, (Long) 0L);
        }

        public final boolean isDashStreamingManifest$video_prodGoogleAllVendorsRelease(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return MediaFormatKt.extractMediaFormatFromUrl(str) == MediaFormat.DASH;
        }

        public final boolean isHLSStreamingManifest$video_prodGoogleAllVendorsRelease(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return MediaFormatKt.extractMediaFormatFromUrl(str) == MediaFormat.HLS;
        }

        public final boolean isManifestFile$video_prodGoogleAllVendorsRelease(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return isHLSStreamingManifest$video_prodGoogleAllVendorsRelease(str) || isDashStreamingManifest$video_prodGoogleAllVendorsRelease(str);
        }

        public final boolean isMp4File$video_prodGoogleAllVendorsRelease(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return MediaFormatKt.extractMediaFormatFromUrl(str) == MediaFormat.MP4;
        }

        private Companion() {
        }
    }

    public VideoAsset(@NotNull String videoUrl, Long l11) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        this.videoUrl = videoUrl;
        this.byteOffset = l11;
        this.range = "";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!VideoAsset.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.app.android.video.player.performance.metricsManager.VideoAsset");
        VideoAsset videoAsset = (VideoAsset) other;
        return Intrinsics.d(this.videoUrl, videoAsset.videoUrl) && Intrinsics.d(this.byteOffset, videoAsset.byteOffset) && Intrinsics.d(this.range, videoAsset.range);
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        int hashCode = this.videoUrl.hashCode() * 31;
        Long l11 = this.byteOffset;
        return this.range.hashCode() + ((hashCode + (l11 != null ? l11.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "VideoAsset range:" + this.range + "; byteOffset:" + this.byteOffset + "; url: " + this.videoUrl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoAsset(@NotNull String videoUrl, @NotNull String range) {
        this(videoUrl, INSTANCE.parseStartingByte(range));
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(range, "range");
        this.range = range;
    }
}
