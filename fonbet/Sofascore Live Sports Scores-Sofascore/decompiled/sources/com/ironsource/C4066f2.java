package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.zol;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4066f2 implements Uc {

    @NotNull
    private final T0 a;

    @NotNull
    private final com.ironsource.mediationsdk.e b;
    private boolean c;

    public C4066f2(@NotNull T0 t0, @NotNull com.ironsource.mediationsdk.e eVar) {
        t0.getClass();
        eVar.getClass();
        this.a = t0;
        this.b = eVar;
    }

    @Override // com.ironsource.Uc
    public void a(@NotNull List<? extends B> list, @NotNull B b) {
        list.getClass();
        b.getClass();
        if (this.c) {
            return;
        }
        this.c = true;
        C4227o2 h = b.h();
        this.b.a(h, b.r(), b.m());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C4227o2> concurrentHashMap = new ConcurrentHashMap<>();
        for (B b2 : list) {
            arrayList.add(b2.p());
            concurrentHashMap.put(b2.p(), b2.h());
        }
        this.b.a(arrayList, concurrentHashMap, b.r(), b.m(), h);
    }

    @Override // com.ironsource.Uc
    public void a(@NotNull B b, @Nullable String str, @NotNull C4181la c4181la) {
        b.getClass();
        c4181la.getClass();
        this.b.a(b.h(), b.r(), b.m(), str);
        a(c4181la, b);
    }

    private final void a(C4181la c4181la, B b) {
        V8 v8 = new V8(b.e());
        Iterator it = new HashSet(c4181la.a()).iterator();
        while (it.hasNext()) {
            this.a.b(new zol(4, this, (ImpressionDataListener) it.next(), v8));
            this.a.f().h().a(v8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4066f2 c4066f2, ImpressionDataListener impressionDataListener, V8 v8) {
        c4066f2.getClass();
        impressionDataListener.getClass();
        v8.getClass();
        IronLog.CALLBACK.verbose(C4243p0.a(c4066f2.a, "onImpressionSuccess ".concat(impressionDataListener.getClass().getSimpleName()), (String) null, 2, (Object) null));
        impressionDataListener.onImpressionSuccess(v8);
    }
}
