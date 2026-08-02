package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame;
import defpackage.wt3;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzakd extends zzajz {
    public final String b;
    public final byte[] c;

    public zzakd(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzakd.class != obj.getClass()) {
            return false;
        }
        zzakd zzakdVar = (zzakd) obj;
        return this.b.equals(zzakdVar.b) && Arrays.equals(this.c, zzakdVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final String toString() {
        String str = this.a;
        int length = str.length() + 8;
        String str2 = this.b;
        return wt3.m(str, ": owner=", new StringBuilder(str2.length() + length), str2);
    }
}
