package com.moloco.sdk.internal.services;

import android.content.SharedPreferences;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ e s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, String str, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = eVar;
        this.t = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        String str = this.t;
        e eVar = this.s;
        switch (i) {
            case 0:
                return new d(eVar, str, rq3Var, 0);
            default:
                return new d(eVar, str, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((d) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.t;
        e eVar = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                SharedPreferences sharedPreferences = eVar.a;
                if (!sharedPreferences.contains(str)) {
                    return null;
                }
                try {
                    return sharedPreferences.getString(str, "");
                } catch (ClassCastException unused) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ContentValues", "Unexpected value type for key: ".concat(str), null, false, 12, null);
                    return null;
                }
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                eVar.a.edit().remove(str).apply();
                return Unit.a;
        }
    }
}
