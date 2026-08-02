package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import defpackage.uao;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzfyp {
    public static zzaza a(Context context, String str, String str2) {
        zzaza zzazaVar;
        try {
            zzazaVar = (zzaza) new uao(context, str, str2).d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzazaVar = null;
        }
        return zzazaVar == null ? uao.b() : zzazaVar;
    }
}
