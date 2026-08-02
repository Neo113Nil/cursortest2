package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.g3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3434g3 extends AbstractC3536k2 {
    public final Zc b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3434g3(Zc zc) {
        super(new defpackage.om(zc, 3));
        zc.getClass();
        this.b = zc;
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
    }

    public static final boolean a(Zc zc) {
        return AbstractC3315bd.a(zc.a);
    }

    @Override // com.inmobi.media.AbstractC3536k2
    public final void b(H2 h2) {
        h2.getClass();
        ep epVar = h2 instanceof ep ? (ep) h2 : null;
        if (epVar == null) {
            return;
        }
        Map map = epVar.a;
        List list = epVar.b;
        String str = (String) map.get("[EVENTTYPE]");
        if (str == null) {
            return;
        }
        if (str.equals("1") || StringsKt.J(str, "companion", true)) {
            if (!this.d.compareAndSet(false, true)) {
                return;
            }
        } else if (!this.c.compareAndSet(false, true)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String a = AbstractC3315bd.a((String) it.next(), this.b, map);
            E3 e3 = E3.a;
            a.getClass();
            E3.a(a, false, null);
        }
    }
}
