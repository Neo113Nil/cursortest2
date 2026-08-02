package ru.ozon.app.android.video.player;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"changeAssetQuality", "", "videoQuality", "", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoLinkReplacementUtilsKt {
    @NotNull
    public static final String changeAssetQuality(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("asset_(\\d+)([_a-zA-Z0-9]*\\.mp4)").g(str, new VideoLinkReplacementUtilsKt$changeAssetQuality$1(i11));
    }
}
