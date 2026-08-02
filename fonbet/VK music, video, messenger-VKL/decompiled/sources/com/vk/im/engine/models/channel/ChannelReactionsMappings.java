package com.vk.im.engine.models.channel;

import com.vk.core.serialize.Serializer;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.epx;
import xsna.jgp;
import xsna.vu5;
import xsna.zcl;

/* compiled from: ChannelReactionsMappings.kt */
/* loaded from: classes2.dex */
public final class ChannelReactionsMappings extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ChannelReactionsMappings> CREATOR = new a();
    public final Map<Integer, Integer> b;
    public final long c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ChannelReactionsMappings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChannelReactionsMappings a(Serializer serializer) {
            return new ChannelReactionsMappings(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChannelReactionsMappings[i];
        }
    }

    public ChannelReactionsMappings(Map<Integer, Integer> map, long j) {
        this.b = map;
        this.c = j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        Map<Integer, Integer> map = this.b;
        if (map == null) {
            serializer.S(-1);
        } else {
            Iterator c = n.c(serializer, map);
            while (c.hasNext()) {
                Map.Entry entry = (Map.Entry) c.next();
                serializer.S(((Number) entry.getKey()).intValue());
                serializer.S(((Number) entry.getValue()).intValue());
            }
        }
        serializer.Y(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelReactionsMappings)) {
            return false;
        }
        ChannelReactionsMappings channelReactionsMappings = (ChannelReactionsMappings) obj;
        return epx.f(this.b, channelReactionsMappings.b) && this.c == channelReactionsMappings.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelReactionsMappings(mappings=");
        sb.append(this.b);
        sb.append(", syncTime=");
        return vu5.a(')', this.c, sb);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChannelReactionsMappings(Serializer serializer, zcl zclVar) {
        this((Map<Integer, Integer>) r0, serializer.w());
        Map map;
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        try {
            int u = serializer.u();
            if (u >= 0) {
                map = new LinkedHashMap();
                for (int i = 0; i < u; i++) {
                    map.put(Integer.valueOf(serializer.u()), Integer.valueOf(serializer.u()));
                }
            } else {
                map = jgp.b;
            }
        } finally {
        }
    }
}
