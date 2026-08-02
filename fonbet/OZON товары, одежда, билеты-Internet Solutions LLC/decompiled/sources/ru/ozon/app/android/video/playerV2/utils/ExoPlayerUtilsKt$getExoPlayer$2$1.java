package ru.ozon.app.android.video.playerV2.utils;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ExoPlayerUtilsKt$getExoPlayer$2$1 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ ExoPlayer $player;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExoPlayerUtilsKt$getExoPlayer$2$1(ExoPlayer exoPlayer) {
        super(0);
        this.$player = exoPlayer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$player.n());
    }
}
