package com.moloco.sdk.internal.services;

import android.content.Context;
import defpackage.a70;
import defpackage.lu3;
import defpackage.luj;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.wba;
import defpackage.y6a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b0 {
    public final Context a;

    public b0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, sq3 sq3Var) {
        a0 a0Var;
        int i;
        if (sq3Var instanceof a0) {
            a0Var = (a0) sq3Var;
            int i2 = a0Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.t = i2 - Integer.MIN_VALUE;
                Object obj = a0Var.r;
                lu3 lu3Var = lu3.a;
                i = a0Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    luj lujVar = new luj(this, rq3Var, 16);
                    a0Var.t = 1;
                    obj = wba.V(j, lujVar, a0Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        a0Var = new a0(this, sq3Var);
        Object obj2 = a0Var.r;
        lu3 lu3Var2 = lu3.a;
        i = a0Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }
}
