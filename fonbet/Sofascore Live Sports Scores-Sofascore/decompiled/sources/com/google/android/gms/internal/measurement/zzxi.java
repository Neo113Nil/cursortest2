package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzyi;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzxi<API extends zzyi<API>> {
    public final zzzf a;

    public zzxi(zzzf zzzfVar) {
        this.a = zzzfVar;
    }

    public static void a(String str, zzxz zzxzVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(zzxzVar.b / 1000000)));
        sb.append(": logging error [");
        zzze.a(1, zzxzVar.g(), sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }
}
