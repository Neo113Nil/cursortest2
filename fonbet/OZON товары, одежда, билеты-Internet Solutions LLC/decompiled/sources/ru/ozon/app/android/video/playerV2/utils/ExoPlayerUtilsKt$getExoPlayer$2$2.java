package ru.ozon.app.android.video.playerV2.utils;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ExoPlayerUtilsKt$getExoPlayer$2$2 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ ExoPlayer $player;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExoPlayerUtilsKt$getExoPlayer$2$2(ExoPlayer exoPlayer) {
        super(0);
        this.$player = exoPlayer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return ExoPlayerUtilsKt.getCurrentPlayerMediaUrl(this.$player);
    }
}
