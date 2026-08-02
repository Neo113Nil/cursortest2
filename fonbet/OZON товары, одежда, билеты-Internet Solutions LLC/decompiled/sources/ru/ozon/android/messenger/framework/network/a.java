package ru.ozon.android.messenger.framework.network;

import We.B;
import We.G;
import We.L;
import We.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a implements B {
    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a aVar) {
        G a11 = Ek.a.a(aVar, "chain");
        G.a aVar2 = new G.a(a11);
        z e11 = a11.e();
        int h11 = U.h(C7714v.z(e11, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        Iterator<Pair<? extends String, ? extends String>> it = e11.iterator();
        while (it.hasNext()) {
            Pair<? extends String, ? extends String> next = it.next();
            Pair pair = new Pair(next.e(), next.f());
            linkedHashMap.put(pair.e(), pair.f());
        }
        z.f33821b.getClass();
        aVar2.e(z.b.e(linkedHashMap));
        return aVar.proceed(aVar2.b());
    }
}
