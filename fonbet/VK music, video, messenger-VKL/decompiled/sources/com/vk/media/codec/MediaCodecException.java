package com.vk.media.codec;

import android.media.MediaCodec;

/* compiled from: MediaCodecException.kt */
/* loaded from: classes3.dex */
public final class MediaCodecException extends RuntimeException {
    private final String codecName;
    private final Throwable th;
    private final String usage;

    public MediaCodecException(String str, Throwable th) {
        super(th);
        this.usage = "configure";
        this.codecName = str;
        this.th = th;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        Object message = this.th.getMessage();
        if (message == null) {
            message = this.th;
        }
        sb.append(message);
        sb.append(", usage=");
        sb.append(this.usage);
        sb.append(", codecName=");
        sb.append(this.codecName);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        Throwable th = this.th;
        while (!(th instanceof MediaCodec.CodecException)) {
            th = th != null ? th.getCause() : null;
            if (th == null || th.equals(th.getCause())) {
                return sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder(", diagnosticInfo=");
        MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
        sb3.append(codecException.getDiagnosticInfo());
        sb2.append(sb3.toString());
        sb2.append(", codecErrorCode=" + codecException.getErrorCode());
        return sb2.toString();
    }
}
