package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.a;
import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzai;
import defpackage.a70;
import defpackage.ayn;
import defpackage.dbn;
import defpackage.rzo;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class GmsSignatureVerifier {
    static {
        dbn dbnVar = zzah.b;
        a aVar = a.e;
        ayn aynVar = rzo.f;
        Object[] objArr = {aynVar.S1(), rzo.d.S1(), rzo.b.S1()};
        zzai.a(3, objArr);
        a v = zzah.v(3, objArr);
        Preconditions.i(v);
        zzah u = zzah.u(v);
        ayn aynVar2 = rzo.e;
        byte[] S1 = aynVar2.S1();
        ayn aynVar3 = rzo.c;
        Object[] objArr2 = {S1, aynVar3.S1(), rzo.a.S1()};
        zzai.a(3, objArr2);
        a v2 = zzah.v(3, objArr2);
        Preconditions.i(v2);
        zzah u2 = zzah.u(v2);
        if (u.isEmpty() && u2.isEmpty()) {
            a70.r("Either orderedTestCerts or orderedProdCerts must have at least one cert");
            return;
        }
        Object[] objArr3 = {aynVar.S1()};
        zzai.a(1, objArr3);
        a v3 = zzah.v(1, objArr3);
        Preconditions.i(v3);
        zzah u3 = zzah.u(v3);
        Object[] objArr4 = {aynVar2.S1(), aynVar3.S1()};
        zzai.a(2, objArr4);
        a v4 = zzah.v(2, objArr4);
        Preconditions.i(v4);
        zzah u4 = zzah.u(v4);
        if (u3.isEmpty() && u4.isEmpty()) {
            a70.r("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        } else {
            new HashMap();
        }
    }
}
