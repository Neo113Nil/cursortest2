package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public class zzvd extends zzin {
    public final int zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzvd(Throwable th, zzve zzveVar) {
        super("Decoder failed: ".concat(String.valueOf(r3)), th);
        String str = zzveVar == null ? null : zzveVar.zza;
        String.valueOf(str);
        boolean z = th instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zza = z ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}
