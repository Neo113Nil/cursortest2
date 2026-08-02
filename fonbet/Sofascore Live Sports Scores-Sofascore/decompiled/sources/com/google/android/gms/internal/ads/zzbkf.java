package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import defpackage.ba4;
import defpackage.fa4;
import defpackage.ga4;
import defpackage.ja4;
import defpackage.pnn;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbkf extends ga4 {
    public final AtomicBoolean b = new AtomicBoolean(false);
    public Context c;
    public zzeaj d;
    public ja4 e;
    public fa4 f;

    @Override // defpackage.ga4
    public final void onCustomTabsServiceConnected(ComponentName componentName, ba4 ba4Var) {
        this.f = (fa4) ba4Var;
        ba4Var.d();
        this.e = ba4Var.c(new pnn(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f = null;
        this.e = null;
    }
}
