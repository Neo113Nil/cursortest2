package com.inmobi.media;

import defpackage.b98;
import defpackage.fdi;
import defpackage.ku3;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.r2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3717r2 implements b98 {
    public final /* synthetic */ AbstractC3873x2 a;

    public C3717r2(ku3 ku3Var, AbstractC3873x2 abstractC3873x2) {
        this.a = abstractC3873x2;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.a.getClass();
        this.a.e.set(booleanValue);
        AbstractC3873x2 abstractC3873x2 = this.a;
        if (abstractC3873x2.e.get()) {
            Ng ng = abstractC3873x2.c().a;
            ng.f.set(false);
            ng.a();
        } else {
            Ng ng2 = abstractC3873x2.c().a;
            ((fdi) ng2.b).l(EnumC3610mo.HIDDEN);
            ng2.f.set(true);
            P6.a(ng2.e);
            ng2.e = null;
        }
        AbstractC3873x2 abstractC3873x22 = this.a;
        boolean z = abstractC3873x22.e.get();
        Se se = abstractC3873x22.g;
        if (z) {
            se.a();
        } else {
            se.b();
        }
        return Unit.a;
    }
}
