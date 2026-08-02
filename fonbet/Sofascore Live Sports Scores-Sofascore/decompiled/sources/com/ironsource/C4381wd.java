package com.ironsource;

import com.ironsource.E0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import defpackage.k13;
import defpackage.km5;
import defpackage.xka;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.wd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4381wd implements InterfaceC4399xd {

    @NotNull
    private final T0 a;

    @NotNull
    private final AbstractC4386x0 b;

    @NotNull
    private final Function1<T0, T0> c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.wd$a */
    public static final class a extends xka implements Function1<T0, T0> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T0 invoke(@NotNull T0 t0) {
            t0.getClass();
            return new T0(t0, E0.b.PROVIDER);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4381wd(@NotNull T0 t0, @NotNull AbstractC4386x0 abstractC4386x0, @NotNull Function1<? super T0, ? extends T0> function1) {
        t0.getClass();
        abstractC4386x0.getClass();
        function1.getClass();
        this.a = t0;
        this.b = abstractC4386x0;
        this.c = function1;
    }

    private final C4088g6 a(C4173l2 c4173l2, NetworkSettings networkSettings) {
        I i = new I(this.a, this.b, networkSettings);
        return new C4088g6((T0) this.c.invoke(this.a), new C(this.b, networkSettings, c4173l2, new C4011c1(networkSettings, this.b.b(networkSettings), this.b.b().a()), new C4227o2(networkSettings.getProviderInstanceName()), this.a.g(), true), i);
    }

    private final List<NetworkSettings> b(List<String> list) {
        Set W0 = CollectionsKt.W0(list);
        HashMap hashMap = new HashMap(list.size());
        for (NetworkSettings networkSettings : this.b.m()) {
            if (W0.contains(networkSettings.getProviderInstanceName())) {
                String providerInstanceName = networkSettings.getProviderInstanceName();
                providerInstanceName.getClass();
                hashMap.put(providerInstanceName, networkSettings);
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

    public /* synthetic */ C4381wd(T0 t0, AbstractC4386x0 abstractC4386x0, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(t0, abstractC4386x0, (i & 4) != 0 ? a.a : function1);
    }

    @Override // com.ironsource.InterfaceC4399xd
    @NotNull
    public List<C4088g6> a(@NotNull List<String> list) {
        list.getClass();
        if (list.isEmpty()) {
            return km5.a;
        }
        List<NetworkSettings> b = b(list);
        C4173l2 a2 = a();
        ArrayList arrayList = new ArrayList(k13.r(b, 10));
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(a(a2, (NetworkSettings) it.next()));
        }
        return arrayList;
    }

    private final C4173l2 a() {
        return new C4173l2("", new JSONObject(), null, 0, "");
    }
}
