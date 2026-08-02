package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import defpackage.d5p;
import defpackage.e1p;
import defpackage.gmo;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzt extends zzai {
    public final zzr c;

    public zzt(gmo gmoVar) {
        super("internal.logger");
        this.c = gmoVar;
        this.b.put("log", new d5p(this, false, true));
        this.b.put(NotificationCompat.GROUP_KEY_SILENT, new e1p(NotificationCompat.GROUP_KEY_SILENT, 0));
        ((zzai) this.b.get(NotificationCompat.GROUP_KEY_SILENT)).a("log", new d5p(this, true, true));
        this.b.put("unmonitored", new e1p("unmonitored", 1));
        ((zzai) this.b.get("unmonitored")).a("log", new d5p(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao d(zzg zzgVar, List list) {
        return zzao.I7;
    }
}
