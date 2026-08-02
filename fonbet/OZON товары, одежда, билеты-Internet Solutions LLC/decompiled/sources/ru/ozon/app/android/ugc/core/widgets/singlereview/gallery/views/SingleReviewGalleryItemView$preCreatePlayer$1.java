package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.views;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class SingleReviewGalleryItemView$preCreatePlayer$1 extends C7719a implements Function1<PreloadVideoInfo, Unit> {
    SingleReviewGalleryItemView$preCreatePlayer$1(Object obj) {
        super(1, obj, PlayerPreloader.class, "preCreatePlayer", "preCreatePlayer(Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Lru/ozon/app/android/video/player/performance/PlayerNamespace;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PreloadVideoInfo preloadVideoInfo) {
        invoke2(preloadVideoInfo);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PreloadVideoInfo p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        PlayerPreloader.DefaultImpls.preCreatePlayer$default((PlayerPreloader) this.receiver, p02, null, 2, null);
    }
}
