package com.ironsource;

import com.ironsource.F0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ironsource.xd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2744xd implements InterfaceC2762yd {
    private final V0 a;
    private final AbstractC2731x0 b;
    private final Function1<V0, V0> c;

    /* renamed from: com.ironsource.xd$a */
    static final class a extends Lambda implements Function1<V0, V0> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V0 invoke(V0 tools) {
            Intrinsics.checkNotNullParameter(tools, "tools");
            return new V0(tools, F0.b.PROVIDER);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2744xd(V0 adUnitTools, AbstractC2731x0 adUnitData, Function1<? super V0, ? extends V0> createProviderTools) {
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(createProviderTools, "createProviderTools");
        this.a = adUnitTools;
        this.b = adUnitData;
        this.c = createProviderTools;
    }

    private final List<NetworkSettings> b(List<String> list) {
        Set set = CollectionsKt.toSet(list);
        HashMap hashMap = new HashMap(list.size());
        for (NetworkSettings networkSettings : this.b.m()) {
            if (set.contains(networkSettings.getProviderInstanceName())) {
                String providerInstanceName = networkSettings.getProviderInstanceName();
                Intrinsics.checkNotNullExpressionValue(providerInstanceName, "provider.providerInstanceName");
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

    @Override // com.ironsource.InterfaceC2762yd
    public List<C2451h6> a(List<String> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        if (instances.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<NetworkSettings> b = b(instances);
        C2554n2 a2 = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b, 10));
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(a(a2, (NetworkSettings) it.next()));
        }
        return arrayList;
    }

    public /* synthetic */ C2744xd(V0 v0, AbstractC2731x0 abstractC2731x0, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(v0, abstractC2731x0, (i & 4) != 0 ? a.a : function1);
    }

    private final C2451h6 a(C2554n2 c2554n2, NetworkSettings networkSettings) {
        I i = new I(this.a, this.b, networkSettings);
        return new C2451h6(this.c.invoke(this.a), new C(this.b, networkSettings, c2554n2, new C2392e1(networkSettings, this.b.b(networkSettings), this.b.b().a()), new C2608q2(networkSettings.getProviderInstanceName()), this.a.f(), true), i);
    }

    private final C2554n2 a() {
        return new C2554n2("", IronSourceNetworkBridge.jsonObjectInit(), null, 0, "");
    }
}
