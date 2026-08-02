package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.internal.Logger;
import defpackage.b1l;
import defpackage.ejg;
import defpackage.hcc;
import defpackage.ibc;
import defpackage.jbc;
import defpackage.pbc;
import defpackage.xdc;
import defpackage.yz8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbx extends zzbd {
    public static final Logger h = new Logger("MediaRouterProxy", null);
    public final pbc a;
    public final CastOptions b;
    public final HashMap c = new HashMap();
    public final zzce d;
    public final boolean e;
    public boolean f;
    public boolean g;

    public zzbx(Context context, pbc pbcVar, CastOptions castOptions, com.google.android.gms.cast.internal.zzn zznVar) {
        this.a = pbcVar;
        this.b = castOptions;
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        h.a("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.d = new zzce(castOptions);
        new Intent(context, (Class<?>) xdc.class).setPackage(context.getPackageName());
        this.e = !context.getPackageManager().queryBroadcastReceivers(r5, 0).isEmpty();
        this.f = true;
        zznVar.i(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new b1l(this, 7));
    }

    public final void S1(hcc hccVar) {
        this.a.getClass();
        pbc.b();
        yz8 c = pbc.c();
        c.D = hccVar;
        ejg ejgVar = hccVar != null ? new ejg(c, hccVar) : null;
        ejg ejgVar2 = c.C;
        if (ejgVar2 != null) {
            ejgVar2.d();
        }
        c.C = ejgVar;
        if (ejgVar != null) {
            c.n();
        }
    }

    public final void Z1(ibc ibcVar, int i) {
        Set set = (Set) this.c.get(ibcVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.a.a(ibcVar, (jbc) it.next(), i);
        }
    }

    public final void l2(ibc ibcVar) {
        Set set = (Set) this.c.get(ibcVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.a.h((jbc) it.next());
        }
    }

    public final boolean zzo() {
        CastOptions castOptions;
        return this.e && this.f && (castOptions = this.b) != null && castOptions.m;
    }
}
