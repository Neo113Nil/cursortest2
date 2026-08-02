package d0;

import android.media.MediaCodecInfo;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes8.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    protected final MediaCodecInfo.CodecCapabilities f60859a;

    Q(@NonNull MediaCodecInfo mediaCodecInfo, @NonNull String str) throws U {
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f60859a = capabilitiesForType;
        } catch (RuntimeException e11) {
            throw new U(Nk.a.b("Unable to get CodecCapabilities for mime: ", str), e11);
        }
    }
}
