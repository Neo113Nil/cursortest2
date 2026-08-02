package ru.ozon.app.android.video.manager.progressiveImpl;

import F3.InterfaceC3018x;
import android.net.Uri;
import j3.C7275q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p3.InterfaceC8846f;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.video.player.flags.ChunkLengthForFragmentedMP4Flag;
import ru.ozon.app.android.video.player.flags.FirstChunkLengthForFragmentedMP4Flag;
import ru.ozon.app.android.video.player.fromexoplayer.OzProgressiveMediaSource;
import ru.ozon.app.android.video.player.performance.PlayerNamespaceKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0003\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "videoUrl", "Lru/ozon/app/android/video/player/performance/PlayerWidgetInfo;", "widgetInfo", "", "supportByteRangeLoading", "Lp3/f$a;", "dataSourceFactory", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "LF3/x;", "createMediaSource", "(Ljava/lang/String;Ljava/lang/String;ZLp3/f$a;Lru/ozon/app/android/network/abtool/FeatureService;)LF3/x;", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProgressiveCacheDelegatesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3018x createMediaSource(String str, String str2, boolean z11, InterfaceC8846f.a aVar, FeatureService featureService) {
        C7275q.a aVar2 = new C7275q.a();
        aVar2.i(Uri.parse(str));
        aVar2.h(PlayerNamespaceKt.mapToPlayerNamespace(str2));
        C7275q a11 = aVar2.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        if (!z11) {
            return new OzProgressiveMediaSource.Factory(aVar).createMediaSource(a11);
        }
        int intKey = featureService.getIntKey(FirstChunkLengthForFragmentedMP4Flag.INSTANCE);
        int intKey2 = featureService.getIntKey(ChunkLengthForFragmentedMP4Flag.INSTANCE);
        return (intKey <= 0 || intKey2 <= 0) ? new OzProgressiveMediaSource.Factory(aVar).createMediaSource(a11) : new OzProgressiveMediaSource.Factory(aVar).setByteRange(Long.valueOf(intKey * 1024), Long.valueOf(intKey2 * 1024)).createMediaSource(a11);
    }
}
