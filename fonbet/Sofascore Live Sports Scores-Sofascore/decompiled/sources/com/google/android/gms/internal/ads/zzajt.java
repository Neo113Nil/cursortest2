package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import defpackage.bf3;
import defpackage.wt3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzajt extends zzajz {
    public final String b;
    public final String c;
    public final String d;

    public zzajt(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzajt.class != obj.getClass()) {
            return false;
        }
        zzajt zzajtVar = (zzajt) obj;
        return this.c.equals(zzajtVar.c) && this.b.equals(zzajtVar.b) && Objects.equals(this.d, zzajtVar.d);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() + ((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        String str = this.d;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final String toString() {
        String str = this.a;
        int length = str.length();
        String str2 = this.d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.b;
        int length3 = str3.length() + length + 11 + 14;
        String str4 = this.c;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 7 + length2);
        bf3.v(sb, str, ": language=", str3, ", description=");
        return wt3.m(str4, ", text=", sb, str2);
    }
}
