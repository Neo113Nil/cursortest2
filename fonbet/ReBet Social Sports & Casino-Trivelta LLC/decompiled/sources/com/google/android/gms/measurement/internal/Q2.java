package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public final class Q2 {

    /* renamed from: a, reason: collision with root package name */
    public final P2 f33598a;

    public Q2(P2 p22) {
        AbstractC3191o.m(p22);
        this.f33598a = p22;
    }

    public final void a(Context context, Intent intent) {
        C3298l3 O10 = C3298l3.O(context, null, null);
        C3392x2 a10 = O10.a();
        if (intent == null) {
            a10.r().a("Receiver called with null intent");
            return;
        }
        O10.c();
        String action = intent.getAction();
        a10.w().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                a10.r().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            a10.w().a("Starting wakeful intent.");
            this.f33598a.a(context, className);
        }
    }
}
