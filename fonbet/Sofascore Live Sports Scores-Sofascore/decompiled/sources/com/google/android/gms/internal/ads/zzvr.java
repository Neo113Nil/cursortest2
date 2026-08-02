package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzvr extends zziw {
    public final int a;

    public zzvr(IllegalStateException illegalStateException, zzvs zzvsVar) {
        super("Decoder failed: ".concat(String.valueOf(zzvsVar == null ? null : zzvsVar.a)), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.a = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
