package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.ihi;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzico {
    @Deprecated
    public zzico() {
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final zzicq d() {
        if (this instanceof zzicq) {
            return (zzicq) this;
        }
        a70.r("Not a JSON Object: ".concat(toString()));
        return null;
    }

    public final zzics e() {
        if (this instanceof zzics) {
            return (zzics) this;
        }
        a70.r("Not a JSON Primitive: ".concat(toString()));
        return null;
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            zzidn zzidnVar = new zzidn(new ihi(1, sb));
            zzidnVar.h = zzict.a;
            zzidj.a.getClass();
            zzidj.a(zzidnVar, this);
            return sb.toString();
        } catch (IOException e) {
            a70.j(e);
            return null;
        }
    }
}
