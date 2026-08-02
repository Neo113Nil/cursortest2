package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.w3b;
import xsna.y2r0;

/* compiled from: AudioMixingUtil.java */
/* loaded from: classes12.dex */
public final class a {
    public static boolean a(AudioProcessor.a aVar) {
        if (aVar.a == -1 || aVar.b == -1) {
            return false;
        }
        int i = aVar.c;
        return i == 2 || i == 4;
    }

    public static float b(ByteBuffer byteBuffer, boolean z, boolean z2) {
        int i = OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND;
        if (z2) {
            if (z) {
                return byteBuffer.getShort();
            }
            float f = byteBuffer.getFloat();
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i = 32768;
            }
            return y2r0.i(f * i, -32768.0f, 32767.0f);
        }
        if (!z) {
            return byteBuffer.getFloat();
        }
        short s = byteBuffer.getShort();
        float f2 = s;
        if (s < 0) {
            i = 32768;
        }
        return f2 / i;
    }

    public static void c(ByteBuffer byteBuffer, AudioProcessor.a aVar, ByteBuffer byteBuffer2, AudioProcessor.a aVar2, w3b w3bVar, int i, boolean z) {
        int i2 = w3bVar.b;
        boolean z2 = aVar.c == 2;
        boolean z3 = aVar2.c == 2;
        int i3 = w3bVar.a;
        float[] fArr = new float[i3];
        float[] fArr2 = new float[i2];
        for (int i4 = 0; i4 < i; i4++) {
            if (z) {
                int position = byteBuffer2.position();
                for (int i5 = 0; i5 < i2; i5++) {
                    fArr2[i5] = b(byteBuffer2, z3, z3);
                }
                byteBuffer2.position(position);
            }
            for (int i6 = 0; i6 < i3; i6++) {
                fArr[i6] = b(byteBuffer, z2, z3);
            }
            for (int i7 = 0; i7 < i2; i7++) {
                for (int i8 = 0; i8 < i3; i8++) {
                    fArr2[i7] = (w3bVar.c[(i8 * i2) + i7] * fArr[i8]) + fArr2[i7];
                }
                if (z3) {
                    byteBuffer2.putShort((short) y2r0.i(fArr2[i7], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(y2r0.i(fArr2[i7], -1.0f, 1.0f));
                }
                fArr2[i7] = 0.0f;
            }
        }
    }
}
