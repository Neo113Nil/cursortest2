package com.ironsource;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.C4278r0;
import defpackage.k13;
import defpackage.o13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class L {
    private final int a;

    @NotNull
    private final List<J> b = new CopyOnWriteArrayList();

    public L(int i) {
        this.a = i;
    }

    private final boolean b() {
        return this.a == 0;
    }

    private final boolean c() {
        return this.a != -1;
    }

    public final void a(@Nullable J j) {
        if (b()) {
            return;
        }
        if (a()) {
            o13.C(this.b);
        }
        if (j == null) {
            j = new J(C4278r0.a.NotPartOfWaterfall);
        }
        this.b.add(j);
    }

    @NotNull
    public final String d() {
        List<J> list = this.b;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((J) it.next()).b().ordinal()));
        }
        return CollectionsKt.f0(arrayList, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
    }

    private final boolean a() {
        return c() && this.b.size() >= this.a;
    }
}
