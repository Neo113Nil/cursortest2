package com.ironsource.mediationsdk;

import com.ironsource.C4632x5;
import com.ironsource.EnumC4650y5;
import com.ironsource.G9;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.brm0;
import xsna.c5g;
import xsna.dli0;
import xsna.j5g;
import xsna.rli0;
import xsna.t5j;

/* loaded from: classes13.dex */
public final class t implements AdapterNetworkData {
    private final String a;
    private final JSONObject b;

    public t(String str, JSONObject jSONObject) {
        this.a = str;
        this.b = new JSONObject(jSONObject.toString());
    }

    private final void b(Collection<? extends AdapterBaseWrapper> collection) {
        List V = j5g.V(collection);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) V).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (c.a(this.a, (AdapterBaseWrapper) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
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

    public final String a() {
        return this.a;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public JSONObject allData() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public <T> T dataByKeyIgnoreCase(String str, Class<T> cls) {
        T t;
        Iterator<T> it = ((t5j) dli0.c(allData().keys())).iterator();
        while (true) {
            if (!it.hasNext()) {
                t = (T) null;
                break;
            }
            t = it.next();
            if (brm0.w((String) t, str, true)) {
                break;
            }
        }
        String str2 = t;
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
    public JSONObject networkDataByAdUnit(IronSource.a aVar) {
        JSONObject optJSONObject = this.b.optJSONObject(aVar.toString());
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    public String toString() {
        return "NetworkData(networkName=" + this.a + ", networkData=" + this.b + ")";
    }

    public final void a(Collection<? extends AbstractAdapter> collection, Collection<? extends AdapterBaseWrapper> collection2) {
        try {
            a(collection);
            b(collection2);
        } catch (Exception e) {
            IronLog.INTERNAL.error("error while setting network data: " + e.getMessage());
        }
    }

    private final void a(Collection<? extends AbstractAdapter> collection) {
        List V = j5g.V(collection);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) V).iterator();
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

    public final void b() {
        String g0 = j5g.g0(rli0.A(dli0.c(this.b.keys())), StringUtils.COMMA, null, null, 0, null, 62);
        G9.i().a(new C4632x5(EnumC4650y5.SET_NETWORK_DATA, IronSourceUtils.b(false).put(IronSourceConstants.EVENTS_EXT1, this.a + " - " + g0)));
    }
}
