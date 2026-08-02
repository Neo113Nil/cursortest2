package com.vk.camera.editor.stories.impl.onlinebooking;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.Iterator;
import java.util.Map;
import xsna.cjl0;
import xsna.epx;
import xsna.jgp;
import xsna.zcl;

/* compiled from: MarketOnlineBookingValuesWrapper.kt */
/* loaded from: classes16.dex */
public final class MarketOnlineBookingValuesWrapper extends Serializer.StreamParcelableAdapter {
    public final Map<UserId, Boolean> b;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketOnlineBookingValuesWrapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        Map<UserId, Boolean> map = this.b;
        if (map == null) {
            serializer.S(-1);
            return;
        }
        Iterator c = n.c(serializer, map);
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            serializer.e0((UserId) entry.getKey());
            serializer.L(((Boolean) entry.getValue()).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketOnlineBookingValuesWrapper) && epx.f(this.b, ((MarketOnlineBookingValuesWrapper) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return cjl0.a(new StringBuilder("MarketOnlineBookingValuesWrapper(marketOnlineBookingValues="), this.b, ')');
    }

    public MarketOnlineBookingValuesWrapper(Map<UserId, Boolean> map) {
        this.b = map;
    }

    public /* synthetic */ MarketOnlineBookingValuesWrapper(Map map, int i, zcl zclVar) {
        this((i & 1) != 0 ? jgp.b : map);
    }
}
