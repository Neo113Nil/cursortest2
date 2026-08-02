package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdxx {
    public final HashMap a = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(String str, zzfmu zzfmuVar) {
        zzfmd zzfmdVar;
        zzbyi zzH;
        if (this.a.containsKey(str)) {
            return;
        }
        zzbyi zzbyiVar = null;
        if (zzfmuVar != null) {
            try {
                zzH = zzfmuVar.a.zzH();
                if (zzfmuVar != null) {
                    try {
                        zzbyiVar = zzfmuVar.a.l();
                    } finally {
                        try {
                        } catch (zzfmd unused) {
                        }
                    }
                }
                boolean z = true;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Sa)).booleanValue()) {
                    if (zzfmuVar != null) {
                        try {
                            zzfmuVar.a();
                        } catch (zzfmd unused2) {
                        }
                    }
                    z = false;
                }
                this.a.put(str, new zzdxw(str, zzH, zzbyiVar, z));
            } finally {
                try {
                } catch (zzfmd unused3) {
                }
            }
        }
        zzH = null;
        if (zzfmuVar != null) {
        }
        boolean z2 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Sa)).booleanValue()) {
        }
        this.a.put(str, new zzdxw(str, zzH, zzbyiVar, z2));
    }

    public final synchronized zzdxw b(String str) {
        return (zzdxw) this.a.get(str);
    }
}
