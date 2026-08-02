package com.vk.media.pipeline.codec;

import android.media.MediaCodec;
import xsna.uzf;

/* compiled from: MediaCodecException.kt */
/* loaded from: classes3.dex */
public final class MediaCodecException extends RuntimeException {
    private final String codecName;
    private final uzf stat;
    private final Throwable th;
    private final String usage;

    public MediaCodecException(String str, String str2, Throwable th, uzf uzfVar) {
        super(th);
        this.usage = str;
        this.codecName = str2;
        this.th = th;
        this.stat = uzfVar;
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
        if (this.stat != null) {
            sb2.append(", " + this.stat);
        }
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
