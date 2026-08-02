package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeqd {
    public final zzfmp a;
    public final zzdxx b;
    public final zzeaj c;

    public zzeqd(zzfmp zzfmpVar, zzdxx zzdxxVar, zzeaj zzeajVar) {
        this.a = zzfmpVar;
        this.b = zzdxxVar;
        this.c = zzeajVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(zzflg zzflgVar, zzfld zzfldVar, int i, zzemu zzemuVar, long j) {
        String str;
        zzeai a = this.c.a();
        a.b("gqi", zzflgVar.b);
        a.a(zzfldVar);
        a.b("action", "adapter_status");
        a.b("adapter_l", String.valueOf(j));
        a.b("sc", Integer.toString(i));
        zzdxw zzdxwVar = null;
        if (zzemuVar != null) {
            a.b("arec", Integer.toString(zzemuVar.b.zza));
            String message = zzemuVar.getMessage();
            Pattern pattern = this.a.a;
            if (pattern != null && message != null) {
                Matcher matcher = pattern.matcher(message);
                if (matcher.find()) {
                    str = matcher.group();
                    if (str != null) {
                        a.b("areec", str);
                    }
                }
            }
            str = null;
            if (str != null) {
            }
        }
        Iterator it = zzfldVar.t.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzdxw b = this.b.b((String) it.next());
            if (b != null) {
                zzdxwVar = b;
                break;
            }
        }
        if (zzdxwVar != null) {
            a.b("ancn", zzdxwVar.a);
            zzbyi zzbyiVar = zzdxwVar.b;
            if (zzbyiVar != null) {
                a.b("adapter_v", zzbyiVar.toString());
            }
            zzbyi zzbyiVar2 = zzdxwVar.c;
            if (zzbyiVar2 != null) {
                a.b("adapter_sv", zzbyiVar2.toString());
            }
        }
        a.c();
    }
}
