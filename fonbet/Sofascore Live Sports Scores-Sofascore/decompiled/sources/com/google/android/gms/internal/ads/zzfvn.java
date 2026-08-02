package com.google.android.gms.internal.ads;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfvn {
    public final zzfvz a;
    public final zzfvz b;
    public final boolean c;
    public final zzfvr d;
    public final zzfvu e;

    public zzfvn(zzfvr zzfvrVar, zzfvu zzfvuVar, zzfvz zzfvzVar, zzfvz zzfvzVar2, boolean z) {
        this.d = zzfvrVar;
        this.e = zzfvuVar;
        this.a = zzfvzVar;
        this.b = zzfvzVar2;
        this.c = z;
    }

    public static zzfvn a(zzfvr zzfvrVar, zzfvu zzfvuVar, zzfvz zzfvzVar, zzfvz zzfvzVar2, boolean z) {
        if (zzfvzVar == zzfvz.NONE) {
            a70.p("Impression owner is none");
            return null;
        }
        zzfvr zzfvrVar2 = zzfvr.DEFINED_BY_JAVASCRIPT;
        zzfvz zzfvzVar3 = zzfvz.NATIVE;
        if (zzfvrVar == zzfvrVar2 && zzfvzVar == zzfvzVar3) {
            a70.p("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            return null;
        }
        if (zzfvuVar != zzfvu.DEFINED_BY_JAVASCRIPT || zzfvzVar != zzfvzVar3) {
            return new zzfvn(zzfvrVar, zzfvuVar, zzfvzVar, zzfvzVar2, z);
        }
        a70.p("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        return null;
    }
}
