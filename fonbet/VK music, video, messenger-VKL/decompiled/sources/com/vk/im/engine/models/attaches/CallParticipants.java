package com.vk.im.engine.models.attaches;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.epx;
import xsna.vu5;

/* compiled from: CallParticipants.kt */
/* loaded from: classes2.dex */
public final class CallParticipants extends Serializer.StreamParcelableAdapter {
    public final List<Long> b;
    public final int c;
    public static final CallParticipants d = new CallParticipants(EmptyList.b, 0);
    public static final Serializer.c<CallParticipants> CREATOR = new b();

    /* compiled from: CallParticipants.kt */
    public static final class a {
        public static ArrayList a(List list) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Number) obj).longValue() > 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                arrayList2.add(Peer.a.b(longValue));
            }
            return arrayList2;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CallParticipants> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CallParticipants a(Serializer serializer) {
            List f = serializer.f();
            if (f == null) {
                f = EmptyList.b;
            }
            return new CallParticipants(f, serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CallParticipants[i];
        }
    }

    public CallParticipants(List<Long> list, int i) {
        this.b = list;
        this.c = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.a0(this.b);
        serializer.S(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallParticipants)) {
            return false;
        }
        CallParticipants callParticipants = (CallParticipants) obj;
        return epx.f(this.b, callParticipants.b) && this.c == callParticipants.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallParticipants(participantsIds=");
        sb.append(this.b);
        sb.append(", totalParticipantsCount=");
        return vu5.b(sb, this.c, ')');
    }
}
