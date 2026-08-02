package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ap, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1593Ap implements InterfaceC3256rI {
    public final /* synthetic */ C1592Ao A00;

    public C1593Ap(C1592Ao c1592Ao) {
        this.A00 = c1592Ao;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3256rI
    public final void AFq() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        InterfaceC3256rI interfaceC3256rI;
        InterfaceC3256rI interfaceC3256rI2;
        linkedHashMap = this.A00.A06;
        synchronized (linkedHashMap) {
            linkedHashMap2 = this.A00.A06;
            arrayList = new ArrayList(linkedHashMap2.size());
            linkedHashMap3 = this.A00.A06;
            for (Runnable runnable : linkedHashMap3.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            linkedHashMap4 = this.A00.A06;
            linkedHashMap4.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        interfaceC3256rI = this.A00.A01;
        if (interfaceC3256rI != null) {
            interfaceC3256rI2 = this.A00.A01;
            interfaceC3256rI2.AFq();
        }
    }
}
