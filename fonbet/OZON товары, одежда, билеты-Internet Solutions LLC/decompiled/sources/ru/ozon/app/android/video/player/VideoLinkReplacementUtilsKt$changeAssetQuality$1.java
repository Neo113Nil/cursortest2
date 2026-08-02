package ru.ozon.app.android.video.player;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VideoLinkReplacementUtilsKt$changeAssetQuality$1 extends AbstractC7737t implements Function1<MatchResult, CharSequence> {
    final /* synthetic */ int $videoQuality;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoLinkReplacementUtilsKt$changeAssetQuality$1(int i11) {
        super(1);
        this.$videoQuality = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "asset_" + this.$videoQuality + ((Object) it.c().get(2));
    }
}
