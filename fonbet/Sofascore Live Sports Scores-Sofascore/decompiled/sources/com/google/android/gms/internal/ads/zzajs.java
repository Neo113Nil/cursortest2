package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzajs extends zzajz {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final zzajz[] f;

    public zzajs(String str, boolean z, boolean z2, String[] strArr, zzajz[] zzajzVarArr) {
        super(ChapterTocFrame.ID);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = zzajzVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzajs.class != obj.getClass()) {
            return false;
        }
        zzajs zzajsVar = (zzajs) obj;
        return this.c == zzajsVar.c && this.d == zzajsVar.d && this.b.equals(zzajsVar.b) && Arrays.equals(this.e, zzajsVar.e) && Arrays.equals(this.f, zzajsVar.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((((this.c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
