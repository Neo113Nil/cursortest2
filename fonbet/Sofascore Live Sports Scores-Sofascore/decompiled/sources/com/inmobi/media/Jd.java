package com.inmobi.media;

import defpackage.a70;
import defpackage.b98;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Jd implements b98 {
    public final /* synthetic */ b98 a;

    public Jd(b98 b98Var) {
        this.a = b98Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        Id id;
        int i;
        if (rq3Var instanceof Id) {
            id = (Id) rq3Var;
            int i2 = id.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                id.b = i2 - Integer.MIN_VALUE;
                Object obj2 = id.a;
                lu3 lu3Var = lu3.a;
                i = id.b;
                if (i != 0) {
                    y6a.M(obj2);
                    b98 b98Var = this.a;
                    if (((AbstractC3650oc) obj) instanceof AbstractC3712qm) {
                        id.b = 1;
                        if (b98Var.emit(obj, id) == lu3Var) {
                            return lu3Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj2);
                }
                return Unit.a;
            }
        }
        id = new Id(this, rq3Var);
        Object obj22 = id.a;
        lu3 lu3Var2 = lu3.a;
        i = id.b;
        if (i != 0) {
        }
        return Unit.a;
    }
}
