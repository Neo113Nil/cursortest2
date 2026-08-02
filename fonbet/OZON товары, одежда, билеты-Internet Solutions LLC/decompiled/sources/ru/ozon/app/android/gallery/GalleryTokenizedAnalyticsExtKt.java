package ru.ozon.app.android.gallery;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.video.TokenizedVideoEvents;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/video/TokenizedVideoEvents;", "LWZ/l;", "analytics", "", "openView", "(Lru/ozon/app/android/video/TokenizedVideoEvents;LWZ/l;)Lkotlin/Unit;", "startVideo", "endVideo", "gallery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GalleryTokenizedAnalyticsExtKt {
    public static final Unit endVideo(TokenizedVideoEvents tokenizedVideoEvents, @NotNull l analytics) {
        t endVideoEvent;
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        if (tokenizedVideoEvents == null || (endVideoEvent = tokenizedVideoEvents.getEndVideoEvent()) == null) {
            return null;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(analytics, endVideoEvent, null, 2, null);
        return Unit.f71690a;
    }

    public static final Unit openView(TokenizedVideoEvents tokenizedVideoEvents, @NotNull l analytics) {
        t openVideoEvent;
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        if (tokenizedVideoEvents == null || (openVideoEvent = tokenizedVideoEvents.getOpenVideoEvent()) == null) {
            return null;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(analytics, openVideoEvent, null, 2, null);
        return Unit.f71690a;
    }

    public static final Unit startVideo(TokenizedVideoEvents tokenizedVideoEvents, @NotNull l analytics) {
        t startVideoEvent;
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        if (tokenizedVideoEvents == null || (startVideoEvent = tokenizedVideoEvents.getStartVideoEvent()) == null) {
            return null;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(analytics, startVideoEvent, null, 2, null);
        return Unit.f71690a;
    }
}
