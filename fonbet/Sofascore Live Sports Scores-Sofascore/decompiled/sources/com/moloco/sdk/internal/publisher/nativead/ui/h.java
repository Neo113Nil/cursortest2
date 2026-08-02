package com.moloco.sdk.internal.publisher.nativead.ui;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q;
import defpackage.av8;
import defpackage.ct8;
import defpackage.of3;
import defpackage.xtc;
import defpackage.yqo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h implements ct8 {
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b a;
    public final /* synthetic */ i b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ q d;

    public h(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar, i iVar, Function0 function0, q qVar) {
        this.a = bVar;
        this.b = iVar;
        this.c = function0;
        this.d = qVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xtc xtcVar = (xtc) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        xtcVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        this.a.a(yqo.y(1035844210, of3Var, new g(this.b, this.c, xtcVar, this.d)), of3Var, 6);
        return Unit.a;
    }
}
