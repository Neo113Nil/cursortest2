package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import defpackage.k13;
import defpackage.sub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class Dc extends Kg {

    @NotNull
    private final T0 e;

    @NotNull
    private final AbstractC4386x0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dc(@NotNull T0 t0, @NotNull AbstractC4386x0 abstractC4386x0) {
        super(t0, abstractC4386x0);
        t0.getClass();
        abstractC4386x0.getClass();
        this.e = t0;
        this.f = abstractC4386x0;
    }

    private final void a(Lg lg, C4173l2 c4173l2, E e) {
        IronLog.INTERNAL.verbose(C4243p0.a(this.e, (String) null, (String) null, 3, (Object) null));
        lg.a(Kg.a(this, f(), e(), c4173l2, e, null, 16, null));
    }

    private final C4173l2 d() {
        return new C4173l2("", new JSONObject(), null, 0, "");
    }

    private final Map<String, I> e() {
        Rf g = this.f.b().g();
        List<NetworkSettings> m = this.f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (g == null || g.a(networkSettings, this.f.b().a())) {
                if (!networkSettings.isBidder(this.f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        int c = sub.c(k13.r(arrayList, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettings2 = (NetworkSettings) it.next();
            linkedHashMap.put(networkSettings2.getProviderInstanceName(), new I(this.e, this.f, networkSettings2));
        }
        return linkedHashMap;
    }

    private final List<C4227o2> f() {
        Rf g = this.f.b().g();
        List<NetworkSettings> m = this.f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (g == null || g.a(networkSettings, this.f.b().a())) {
                if (!networkSettings.isBidder(this.f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C4227o2(((NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    public final void a(@NotNull Lg lg, int i, @NotNull String str, @NotNull String str2, @NotNull E e) {
        lg.getClass();
        str.getClass();
        str2.getClass();
        e.getClass();
        a(lg, new C4173l2(str2, new JSONObject(), null, i, str), e);
    }

    @Override // com.ironsource.Kg
    public void a(@NotNull E e, @NotNull Lg lg) {
        e.getClass();
        lg.getClass();
        IronLog.INTERNAL.verbose(C4243p0.a(this.e, "auction disabled", (String) null, 2, (Object) null));
        a(lg, d(), e);
    }
}
