package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import defpackage.bf3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzakb extends zzajz {
    public final String b;
    public final String c;
    public final String d;

    public zzakb(String str, String str2, String str3) {
        super(InternalFrame.ID);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzakb.class != obj.getClass()) {
            return false;
        }
        zzakb zzakbVar = (zzakb) obj;
        return this.c.equals(zzakbVar.c) && this.b.equals(zzakbVar.b) && this.d.equals(zzakbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final String toString() {
        String str = this.a;
        int length = str.length() + 9;
        String str2 = this.b;
        int length2 = str2.length() + length + 14;
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(str3.length() + length2);
        bf3.v(sb, str, ": domain=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
