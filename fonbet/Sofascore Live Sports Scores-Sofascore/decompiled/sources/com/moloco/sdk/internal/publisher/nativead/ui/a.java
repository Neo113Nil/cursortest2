package com.moloco.sdk.internal.publisher.nativead.ui;

import com.moloco.sdk.internal.publisher.h0;
import com.sofascore.results.R;
import defpackage.av8;
import defpackage.ct8;
import defpackage.haa;
import defpackage.of3;
import defpackage.r13;
import defpackage.xtc;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var = (of3) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).h(booleanValue) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    av8 av8Var = (av8) of3Var;
                    if (av8Var.D()) {
                        av8Var.W();
                        break;
                    }
                }
                com.facebook.appevents.j.f(haa.t(booleanValue ? R.drawable.moloco_twotone_pause_24 : R.drawable.moloco_twotone_play_arrow_24, 0, of3Var), (Function0) obj5, null, false, (String) obj4, r13.d, 0L, 0L, null, 0L, of3Var, 196608, 972);
            default:
                xtc xtcVar = (xtc) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Number) obj3).intValue();
                xtcVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xtcVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.D()) {
                        av8Var2.W();
                        break;
                    }
                }
                h0.g(0, of3Var2, ((xtc) obj5).z(xtcVar), (Function1) obj4);
        }
        return Unit.a;
    }
}
