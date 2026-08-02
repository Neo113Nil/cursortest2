package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.dgo;
import defpackage.kgo;
import defpackage.lgo;
import defpackage.u53;
import defpackage.x3o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgrn extends zzbev implements zzgro {
    public zzgrn() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        u53 u53Var;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zzbew.a(parcel);
            parcel.readInt();
            zzbew.f(parcel);
            return true;
        }
        Bundle bundle = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
        zzbew.f(parcel);
        kgo kgoVar = (kgo) this;
        int i2 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i3 = bundle.getInt("uiMode", 0);
        dgo dgoVar = new dgo();
        byte b = (byte) (dgoVar.e | 1);
        dgoVar.a = i2;
        byte b2 = (byte) (b | 1);
        dgoVar.e = b2;
        if (string != null) {
            dgoVar.b = string;
        }
        dgoVar.c = i3;
        dgoVar.e = (byte) (2 | b2);
        if (bundle.containsKey("userInteracted")) {
            dgoVar.d = Boolean.valueOf(bundle.getBoolean("userInteracted"));
        }
        kgoVar.a.zza(dgoVar.a());
        if (i2 == 8157 && (u53Var = kgoVar.b.a) != null) {
            lgo.c.a("unbind LMD display overlay service", new Object[0]);
            u53Var.g(new x3o(u53Var, 26));
        }
        return true;
    }
}
