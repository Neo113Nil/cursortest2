package androidx.media3.transformer;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import com.google.common.collect.ImmutableBiMap;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ho8;
import xsna.t33;

/* loaded from: classes12.dex */
public final class ExportException extends Exception {
    public static final com.google.common.collect.f b;

    @Nullable
    public final a codecInfo;
    public final int errorCode;
    public final long timestampMs;

    public static final class a {
        public final String a;
        public final boolean b;
        public final boolean c;

        @Nullable
        public final String d;

        public a(String str, @Nullable String str2, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = str2;
        }

        public final String toString() {
            StringBuilder a = t33.a("CodecInfo{type=", (this.b ? "Video" : "Audio").concat(this.c ? "Decoder" : "Encoder"), ", configurationFormat=");
            a.append(this.a);
            a.append(", name=");
            return ho8.a(a, this.d, '}');
        }
    }

    static {
        ImmutableBiMap.a aVar = new ImmutableBiMap.a(4);
        aVar.g(1001, "ERROR_CODE_FAILED_RUNTIME_CHECK");
        aVar.g(2000, "ERROR_CODE_IO_UNSPECIFIED");
        aVar.g(2001, "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED");
        aVar.g(2002, "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT");
        aVar.g(2003, "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE");
        aVar.g(2004, "ERROR_CODE_IO_BAD_HTTP_STATUS");
        aVar.g(2005, "ERROR_CODE_IO_FILE_NOT_FOUND");
        aVar.g(2006, "ERROR_CODE_IO_NO_PERMISSION");
        aVar.g(2007, "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED");
        aVar.g(2008, "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE");
        aVar.g(3001, "ERROR_CODE_DECODER_INIT_FAILED");
        aVar.g(3002, "ERROR_CODE_DECODING_FAILED");
        aVar.g(Integer.valueOf(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE), "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED");
        aVar.g(4001, "ERROR_CODE_ENCODER_INIT_FAILED");
        aVar.g(4002, "ERROR_CODE_ENCODING_FAILED");
        aVar.g(4003, "ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED");
        aVar.g(Integer.valueOf(IronSourceConstants.errorCode_biddingDataException), "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED");
        aVar.g(Integer.valueOf(AuthCode.StatusCode.WAITING_CONNECT), "ERROR_CODE_AUDIO_PROCESSING_FAILED");
        aVar.g(7001, "ERROR_CODE_MUXING_FAILED");
        aVar.g(7002, "ERROR_CODE_MUXING_TIMEOUT");
        aVar.g(7003, "ERROR_CODE_MUXING_APPEND");
        b = aVar.c();
    }

    public ExportException(@Nullable String str, @Nullable Throwable th, int i, @Nullable a aVar) {
        super(str, th);
        this.errorCode = i;
        this.timestampMs = SystemClock.elapsedRealtime();
        this.codecInfo = aVar;
    }

    public static ExportException a(int i, Throwable th) {
        return new ExportException("Asset loader error", th, i, null);
    }

    public static ExportException b(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, String str) {
        StringBuilder a2 = t33.a("Audio error: ", str, ", audioFormat=");
        a2.append(unhandledAudioFormatException.inputAudioFormat);
        return new ExportException(a2.toString(), unhandledAudioFormatException, AuthCode.StatusCode.WAITING_CONNECT, null);
    }

    public static ExportException c(Exception exc, int i, a aVar) {
        return new ExportException("Codec exception: " + aVar, exc, i, aVar);
    }

    public static ExportException d(RuntimeException runtimeException) {
        return new ExportException("Unexpected runtime error", runtimeException, 1001, null);
    }
}
