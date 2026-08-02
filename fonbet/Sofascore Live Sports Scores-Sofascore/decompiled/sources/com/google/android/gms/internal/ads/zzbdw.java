package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.hmn;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdw {
    public static String a(Context context, String str, ArrayList arrayList) {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(PlayerKt.VOLLEYBALL_SETTER)) {
            return null;
        }
        zzhdr r = zzhdr.r();
        context.getPackageManager().requestChecksums(str, false, 8, arrayList, new hmn(r, 0));
        return (String) r.get();
    }
}
