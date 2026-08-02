package com.google.android.gms.internal.pal;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.hbo;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzfi implements PackageManager$OnChecksumsReadyListener {
    public final void onChecksumsReady(List list) {
        list.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ApkChecksum c = hbo.c(list.get(i));
            if (c.getType() == 8) {
                byte[] value = c.getValue();
                int length = value.length;
                char[] cArr = new char[length + length];
                for (int i2 = 0; i2 < value.length; i2++) {
                    byte b = value[i2];
                    int i3 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i4 = i2 + i2;
                    char[] cArr2 = zzdx.a;
                    cArr[i4] = cArr2[i3 >>> 4];
                    cArr[i4 + 1] = cArr2[b & 15];
                }
                new String(cArr);
                throw null;
            }
        }
        throw null;
    }
}
