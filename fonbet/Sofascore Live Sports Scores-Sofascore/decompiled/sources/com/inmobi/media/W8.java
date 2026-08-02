package com.inmobi.media;

import defpackage.lkd;
import java.util.Iterator;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class W8 extends lkd {
    public final /* synthetic */ X8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W8(Tf tf, X8 x8) {
        super(tf);
        this.a = x8;
    }

    @Override // defpackage.lkd
    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        kProperty.getClass();
        Tf tf = (Tf) obj2;
        if (Uf.a((Tf) obj) == Uf.a(tf)) {
            return;
        }
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((Wf) it.next()).a(tf);
        }
    }
}
