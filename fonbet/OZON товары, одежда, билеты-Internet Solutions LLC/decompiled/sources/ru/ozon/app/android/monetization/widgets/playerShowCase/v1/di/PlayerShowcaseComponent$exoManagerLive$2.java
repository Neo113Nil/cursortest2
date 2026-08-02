package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.video.manager.ExoManagerLive;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/video/manager/ExoManagerLive;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PlayerShowcaseComponent$exoManagerLive$2 extends AbstractC7737t implements Function0<ExoManagerLive> {
    final /* synthetic */ PlayerShowcaseComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayerShowcaseComponent$exoManagerLive$2(PlayerShowcaseComponent playerShowcaseComponent) {
        super(0);
        this.this$0 = playerShowcaseComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExoManagerLive invoke() {
        return this.this$0.getVideoController().getExoManagerLive();
    }
}
