package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.fjn;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzark {
    public final List a;
    public final zzaht[] b;
    public final zzhc c = new zzhc(new fjn(this, 0));

    public zzark(List list) {
        this.a = list;
        this.b = new zzaht[list.size()];
    }

    public final void a(zzagk zzagkVar, zzarv zzarvVar) {
        int i = 0;
        while (true) {
            zzaht[] zzahtVarArr = this.b;
            if (i >= zzahtVarArr.length) {
                return;
            }
            zzarvVar.a();
            zzarvVar.b();
            zzaht b = zzagkVar.b(zzarvVar.d, 3);
            zzv zzvVar = (zzv) this.a.get(i);
            String str = zzvVar.o;
            boolean z = true;
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                z = false;
            }
            zzguk.e(str, "Invalid closed caption MIME type provided: %s", z);
            String str2 = zzvVar.a;
            if (str2 == null) {
                zzarvVar.b();
                str2 = zzarvVar.e;
            }
            zzt zztVar = new zzt();
            zztVar.a = str2;
            zztVar.c("video/mp2t");
            zztVar.d(str);
            zztVar.e = zzvVar.e;
            zztVar.d = zzvVar.d;
            zztVar.M = zzvVar.N;
            zztVar.q = zzvVar.r;
            b.e(new zzv(zztVar));
            zzahtVarArr[i] = b;
            i++;
        }
    }
}
