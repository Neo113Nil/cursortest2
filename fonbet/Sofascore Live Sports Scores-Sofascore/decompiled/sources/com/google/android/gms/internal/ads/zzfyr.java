package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import defpackage.vao;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzfyr {
    public static zzfzw a(Context context, zzbei zzbeiVar, String str, String str2, zzfyi zzfyiVar) {
        zzfzw zzfzwVar;
        vao vaoVar = new vao(context, zzbeiVar, str, str2, zzfyiVar);
        try {
            zzfzwVar = (zzfzw) vaoVar.e.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            vaoVar.b(2009, vaoVar.h, e);
            zzfzwVar = null;
        }
        vaoVar.b(3004, vaoVar.h, null);
        if (zzfzwVar != null) {
            if (zzfzwVar.c == 7) {
                zzfyi.e = 3;
            } else {
                zzfyi.e = 2;
            }
        }
        return zzfzwVar == null ? new zzfzw() : zzfzwVar;
    }
}
