package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjs {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final zzdb d;
    public final boolean e;
    public final Long f;
    public final Long g;
    public final String h;

    public zzjs(Context context, zzdb zzdbVar, Long l, Long l2) {
        this.e = true;
        Preconditions.i(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.i(applicationContext);
        this.a = applicationContext;
        this.f = l;
        this.g = l2;
        if (zzdbVar != null) {
            this.d = zzdbVar;
            this.e = zzdbVar.c;
            this.c = zzdbVar.b;
            this.h = zzdbVar.e;
            Bundle bundle = zzdbVar.d;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
