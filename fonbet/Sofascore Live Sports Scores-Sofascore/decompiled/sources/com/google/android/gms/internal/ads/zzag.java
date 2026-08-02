package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.dmi;
import defpackage.mio;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzag {
    public final Uri a;
    public final List b;
    public final zzgxm c;

    static {
        String str = zzfm.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public /* synthetic */ zzag(Uri uri, List list, zzgxm zzgxmVar) {
        this.a = uri;
        ArrayList arrayList = zzas.a;
        this.b = list;
        this.c = zzgxmVar;
        mio mioVar = zzgxm.b;
        zzgxj zzgxjVar = new zzgxj();
        if (zzgxmVar.size() <= 0) {
            zzgxjVar.f();
        } else {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return this.a.equals(zzagVar.a) && this.b.equals(zzagVar.b) && this.c.equals(zzagVar.c);
    }

    public final int hashCode() {
        return (int) (((this.c.hashCode() + dmi.d(this.a.hashCode() * 923521, 961, this.b)) * 31 * 31) + C.TIME_UNSET);
    }
}
