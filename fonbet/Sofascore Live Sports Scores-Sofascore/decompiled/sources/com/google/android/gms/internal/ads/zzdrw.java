package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.common.util.Clock;
import defpackage.qon;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdrw implements View.OnClickListener {
    public final zzdvv a;
    public final Clock b;
    public zzboj c;
    public qon d;
    public String e;
    public Long f;
    public WeakReference g;

    public zzdrw(zzdvv zzdvvVar, Clock clock) {
        this.a = zzdvvVar;
        this.b = clock;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.g;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.e != null && this.f != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.e);
            hashMap.put("time_interval", String.valueOf(this.b.a() - this.f.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.a.d(hashMap);
        }
        this.e = null;
        this.f = null;
        WeakReference weakReference2 = this.g;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.g = null;
    }
}
