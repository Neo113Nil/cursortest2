package ru.ozon.app.android.mediaupload.video.validation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.network.websockets.SocketEvent;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class VideoValidationWebSocket$startValidation$4 extends C7735q implements Function1<SocketEvent, VideoValidationEvent> {
    VideoValidationWebSocket$startValidation$4(Object obj) {
        super(1, obj, VideoValidationWebSocket.class, "map", "map(Lru/ozon/app/android/network/websockets/SocketEvent;)Lru/ozon/app/android/mediaupload/video/validation/VideoValidationEvent;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final VideoValidationEvent invoke(SocketEvent p02) {
        VideoValidationEvent map;
        Intrinsics.checkNotNullParameter(p02, "p0");
        map = ((VideoValidationWebSocket) this.receiver).map(p02);
        return map;
    }
}
