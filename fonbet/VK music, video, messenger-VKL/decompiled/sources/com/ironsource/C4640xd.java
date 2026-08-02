package com.ironsource;

import com.ironsource.F0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.c5g;
import xsna.izs;
import xsna.j5g;
import xsna.zcl;

/* renamed from: com.ironsource.xd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4640xd implements InterfaceC4658yd {
    private final V0 a;
    private final AbstractC4627x0 b;
    private final izs<V0, V0> c;

    /* renamed from: com.ironsource.xd$a */
    public static final class a extends Lambda implements izs<V0, V0> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // xsna.izs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V0 invoke(V0 v0) {
            return new V0(v0, F0.b.PROVIDER);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4640xd(V0 v0, AbstractC4627x0 abstractC4627x0, izs<? super V0, ? extends V0> izsVar) {
        this.a = v0;
        this.b = abstractC4627x0;
        this.c = izsVar;
    }

    private final List<NetworkSettings> b(List<String> list) {
        Set S0 = j5g.S0(list);
        HashMap hashMap = new HashMap(list.size());
        for (NetworkSettings networkSettings : this.b.m()) {
            if (S0.contains(networkSettings.getProviderInstanceName())) {
                hashMap.put(networkSettings.getProviderInstanceName(), networkSettings);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettings2 = (NetworkSettings) hashMap.get((String) it.next());
            if (networkSettings2 != null) {
                arrayList.add(networkSettings2);
            }
        }
        return arrayList;
    }

    @Override // com.ironsource.InterfaceC4658yd
    public List<C4382j6> a(List<String> list) {
        if (list.isEmpty()) {
            return EmptyList.b;
        }
        List<NetworkSettings> b = b(list);
        C4450n2 a2 = a();
        ArrayList arrayList = new ArrayList(c5g.u(b, 10));
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(a(a2, (NetworkSettings) it.next()));
        }
        return arrayList;
    }

    public /* synthetic */ C4640xd(V0 v0, AbstractC4627x0 abstractC4627x0, izs izsVar, int i, zcl zclVar) {
        this(v0, abstractC4627x0, (i & 4) != 0 ? a.a : izsVar);
    }

    private final C4382j6 a(C4450n2 c4450n2, NetworkSettings networkSettings) {
        I i = new I(this.a, this.b, networkSettings);
        return new C4382j6(this.c.invoke(this.a), new C(this.b, networkSettings, c4450n2, new C4288e1(networkSettings, this.b.b(networkSettings), this.b.b().a()), new C4504q2(networkSettings.getProviderInstanceName()), this.a.e(), true), i);
    }

    private final C4450n2 a() {
        return new C4450n2("", new JSONObject(), null, 0, "");
    }
}
