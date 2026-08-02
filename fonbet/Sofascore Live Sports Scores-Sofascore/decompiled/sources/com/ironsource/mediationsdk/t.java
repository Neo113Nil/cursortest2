package com.ironsource.mediationsdk;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.C4355v5;
import com.ironsource.EnumC4373w5;
import com.ironsource.F9;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import defpackage.e5h;
import defpackage.i5h;
import defpackage.k13;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class t implements AdapterNetworkData {

    @NotNull
    private final String a;

    @NotNull
    private final JSONObject b;

    public t(@NotNull String str, @NotNull JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        this.a = str;
        this.b = new JSONObject(jSONObject.toString());
    }

    private final void a(Collection<? extends AbstractAdapter> collection) {
        ArrayList W = CollectionsKt.W(collection);
        ArrayList arrayList = new ArrayList();
        Iterator it = W.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (c.a(this.a, (AbstractAdapter) next)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractAdapter) it2.next()).setNetworkData(this);
        }
    }

    private final void b(Collection<? extends AdapterBaseWrapper> collection) {
        ArrayList W = CollectionsKt.W(collection);
        ArrayList arrayList = new ArrayList();
        Iterator it = W.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (c.a(this.a, (AdapterBaseWrapper) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((AdapterBaseWrapper) it2.next()).getAdapterBaseInterface());
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (next2 instanceof AdapterNetworkDataInterface) {
                arrayList3.add(next2);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((AdapterNetworkDataInterface) it4.next()).setNetworkData(this);
        }
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @NotNull
    public JSONObject allData() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @Nullable
    public <T> T dataByKeyIgnoreCase(@NotNull String str, @NotNull Class<T> cls) {
        Object obj;
        str.getClass();
        cls.getClass();
        Iterator<String> keys = allData().keys();
        keys.getClass();
        Iterator it = e5h.b(keys).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.c.o((String) obj, str, true)) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            Object opt = allData().opt(str2);
            if (!cls.isInstance(opt)) {
                opt = null;
            }
            if (opt != null) {
                return cls.cast(opt);
            }
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @NotNull
    public JSONObject networkDataByAdUnit(@NotNull IronSource.a aVar) {
        aVar.getClass();
        JSONObject optJSONObject = this.b.optJSONObject(aVar.toString());
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    @NotNull
    public String toString() {
        return "NetworkData(networkName=" + this.a + ", networkData=" + this.b + ")";
    }

    public final void a(@NotNull Collection<? extends AbstractAdapter> collection, @NotNull Collection<? extends AdapterBaseWrapper> collection2) {
        collection.getClass();
        collection2.getClass();
        try {
            a(collection);
            b(collection2);
        } catch (Exception e) {
            IronLog.INTERNAL.error("error while setting network data: " + e.getMessage());
        }
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final void b() {
        Iterator<String> keys = this.b.keys();
        keys.getClass();
        String f0 = CollectionsKt.f0(i5h.q(e5h.b(keys)), BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
        F9.i().a(new C4355v5(EnumC4373w5.SET_NETWORK_DATA, IronSourceUtils.b(false).put(IronSourceConstants.EVENTS_EXT1, this.a + " - " + f0)));
    }
}
