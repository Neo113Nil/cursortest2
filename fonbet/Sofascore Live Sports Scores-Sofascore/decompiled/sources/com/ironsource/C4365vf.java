package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.vf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4365vf extends D4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4365vf(@NotNull AbstractC4386x0 abstractC4386x0, @NotNull Mg mg) {
        super(abstractC4386x0, mg);
        abstractC4386x0.getClass();
        mg.getClass();
    }

    private final int a(Mg mg) {
        Integer num;
        List<B> b = mg.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (((B) obj).x()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(b((B) it.next()));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(b((B) it.next()));
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    private final int b(B b) {
        return b.h().l();
    }

    @Override // com.ironsource.H
    public boolean a(@NotNull B b, @NotNull Mg mg) {
        b.getClass();
        mg.getClass();
        return a(mg) < b(b);
    }
}
