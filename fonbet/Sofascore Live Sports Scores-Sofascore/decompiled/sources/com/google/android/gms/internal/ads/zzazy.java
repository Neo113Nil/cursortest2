package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import defpackage.hbo;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzazy implements PackageManager$OnChecksumsReadyListener {
    public final zzhdr a = zzhdr.r();

    public final void onChecksumsReady(List list) {
        zzhdr zzhdrVar = this.a;
        if (list == null) {
            zzhdrVar.d("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum c = hbo.c(list.get(i));
                if (c.getType() == 8) {
                    zzhah j = zzhah.c.j();
                    byte[] value = c.getValue();
                    zzhdrVar.d(j.f(value.length, value));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        zzhdrVar.d("");
    }
}
