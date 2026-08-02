package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzajr extends zzajz implements zzajg {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final zzajz[] g;

    public zzajr(String str, int i, int i2, long j, long j2, zzajz[] zzajzVarArr) {
        super(ChapterFrame.ID);
        String str2;
        zzguk.a(i <= i2);
        this.b = str;
        this.c = i;
        this.d = i2;
        int length = zzajzVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str2 = null;
                break;
            }
            zzajz zzajzVar = zzajzVarArr[i3];
            if (zzajzVar instanceof zzake) {
                zzake zzakeVar = (zzake) zzajzVar;
                zzgxm zzgxmVar = zzakeVar.c;
                if (zzakeVar.a.equals("TIT2") && !zzgxmVar.isEmpty()) {
                    str2 = (String) zzgxmVar.get(0);
                    break;
                }
            }
            i3++;
        }
        if (str2 != null) {
            new zzx(null, str2);
        }
        this.e = j;
        this.f = j2;
        this.g = zzajzVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzajr.class != obj.getClass()) {
            return false;
        }
        zzajr zzajrVar = (zzajr) obj;
        return this.c == zzajrVar.c && this.d == zzajrVar.d && this.e == zzajrVar.e && this.f == zzajrVar.f && this.b.equals(zzajrVar.b) && Arrays.equals(this.g, zzajrVar.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((this.c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
