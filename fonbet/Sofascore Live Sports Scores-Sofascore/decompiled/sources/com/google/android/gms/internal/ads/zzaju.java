package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import defpackage.bf3;
import defpackage.wt3;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaju extends zzajz {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public zzaju(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaju.class != obj.getClass()) {
            return false;
        }
        zzaju zzajuVar = (zzaju) obj;
        return Objects.equals(this.b, zzajuVar.b) && this.c.equals(zzajuVar.c) && this.d.equals(zzajuVar.d) && Arrays.equals(this.e, zzajuVar.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final String toString() {
        String str = this.a;
        int length = str.length();
        String str2 = this.b;
        int B = wt3.B(length, 11, String.valueOf(str2).length(), 11);
        String str3 = this.c;
        int length2 = str3.length() + B + 14;
        String str4 = this.d;
        StringBuilder sb = new StringBuilder(str4.length() + length2);
        bf3.v(sb, str, ": mimeType=", str2, ", filename=");
        return wt3.m(str3, ", description=", sb, str4);
    }
}
