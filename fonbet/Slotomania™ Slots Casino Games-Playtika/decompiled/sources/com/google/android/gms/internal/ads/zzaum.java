package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzaum extends zzilp {
    public zzaum(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzilp
    public final void zze(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
