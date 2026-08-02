package com.moloco.sdk.internal.services;

import android.content.SharedPreferences;
import defpackage.ccj;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.z45;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e {
    public final SharedPreferences a;

    public e(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }

    public final Object a(String str, sq3 sq3Var) {
        hs4 hs4Var = z45.a;
        Object R = xw3.R(hq4.c, new d(this, str, null, 1), sq3Var);
        return R == lu3.a ? R : Unit.a;
    }

    public final Object b(String str, String str2, sq3 sq3Var) {
        hs4 hs4Var = z45.a;
        Object R = xw3.R(hq4.c, new ccj(str2, this, str, null, 6), sq3Var);
        return R == lu3.a ? R : Unit.a;
    }
}
