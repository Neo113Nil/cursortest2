package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.util.Range;
import io.sentry.I2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function0<MediaFormat> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f67701b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar) {
        super(0);
        this.f67701b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MediaFormat invoke() {
        e eVar = this.f67701b;
        int a11 = eVar.e().a();
        try {
            MediaCodecInfo codecInfo = eVar.d().getCodecInfo();
            eVar.e().getClass();
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecInfo.getCapabilitiesForType("video/avc").getVideoCapabilities();
            if (!videoCapabilities.getBitrateRange().contains((Range<Integer>) Integer.valueOf(a11))) {
                eVar.f().getLogger().c(I2.DEBUG, "Encoder doesn't support the provided bitRate: " + a11 + ", the value will be clamped to the closest one", new Object[0]);
                Integer clamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(a11));
                Intrinsics.checkNotNullExpressionValue(clamp, "clamp(...)");
                a11 = clamp.intValue();
            }
        } catch (Throwable th2) {
            eVar.f().getLogger().a(I2.DEBUG, "Could not retrieve MediaCodec info", th2);
        }
        eVar.e().getClass();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", eVar.e().e(), eVar.e().d());
        Intrinsics.checkNotNullExpressionValue(createVideoFormat, "createVideoFormat(...)");
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", a11);
        createVideoFormat.setFloat("frame-rate", eVar.e().c());
        createVideoFormat.setInteger("i-frame-interval", 6);
        return createVideoFormat;
    }
}
