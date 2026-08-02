package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.bm2;
import defpackage.d2l;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaph implements zzanz {
    public final zzeu a = new zzeu();

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void a(int i, int i2, bm2 bm2Var, byte[] bArr) {
        zzcy b;
        zzeu zzeuVar = this.a;
        zzeuVar.z(i2 + i, bArr);
        zzeuVar.D(i);
        ArrayList arrayList = new ArrayList();
        while (zzeuVar.B() > 0) {
            zzguk.b("Incomplete Mp4Webvtt Top Level box header found.", zzeuVar.B() >= 8);
            int b2 = zzeuVar.b() - 8;
            if (zzeuVar.b() == 1987343459) {
                CharSequence charSequence = null;
                zzcx zzcxVar = null;
                while (b2 > 0) {
                    zzguk.b("Incomplete vtt cue box header found.", b2 >= 8);
                    int b3 = zzeuVar.b();
                    int b4 = zzeuVar.b();
                    int i3 = b2 - 8;
                    int i4 = b3 - 8;
                    byte[] bArr2 = zzeuVar.a;
                    int i5 = zzeuVar.b;
                    String str = zzfm.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    zzeuVar.E(i4);
                    if (b4 == 1937011815) {
                        d2l d2lVar = new d2l();
                        zzapq.c(str2, d2lVar);
                        zzcxVar = d2lVar.c();
                    } else if (b4 == 1885436268) {
                        charSequence = zzapq.a(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                    b2 = i3 - i4;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (zzcxVar != null) {
                    zzcxVar.a(charSequence);
                    b = zzcxVar.b();
                } else {
                    Pattern pattern = zzapq.a;
                    d2l d2lVar2 = new d2l();
                    d2lVar2.c = charSequence;
                    b = d2lVar2.c().b();
                }
                arrayList.add(b);
            } else {
                zzeuVar.E(b2);
            }
        }
        bm2Var.mo13zza(new zzanr(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}
