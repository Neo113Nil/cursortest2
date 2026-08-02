package com.inmobi.media;

import defpackage.km5;
import defpackage.lm5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Lc extends AbstractC3536k2 {
    public final Zc b;
    public final Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lc(Zc zc, Function0 function0) {
        super(new defpackage.om(zc, 1));
        zc.getClass();
        function0.getClass();
        this.b = zc;
        this.c = function0;
    }

    public static final boolean a(Zc zc) {
        return AbstractC3315bd.a(zc.a);
    }

    @Override // com.inmobi.media.AbstractC3536k2
    public final void b(H2 h2) {
        Map map;
        h2.getClass();
        boolean z = h2 instanceof ep;
        ArrayList w0 = CollectionsKt.w0(z ? ((ep) h2).b : km5.a, (Collection) this.c.invoke());
        if (w0.isEmpty()) {
            return;
        }
        if (z) {
            map = ((ep) h2).a;
        } else {
            map = lm5.a;
            map.getClass();
        }
        Iterator it = w0.iterator();
        while (it.hasNext()) {
            String a = AbstractC3315bd.a((String) it.next(), this.b, map);
            E3 e3 = E3.a;
            a.getClass();
            E3.a(a, false, null);
        }
    }
}
