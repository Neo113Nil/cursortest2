package com.vk.im.engine.commands.contacts;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.b1r0;
import xsna.c5g;
import xsna.ebj;
import xsna.epx;
import xsna.j5g;
import xsna.le6;
import xsna.ms9;
import xsna.s3q0;
import xsna.w2w;
import xsna.wpp;

/* compiled from: NewSyncedContactsSetCmd.kt */
/* loaded from: classes2.dex */
public final class b extends le6<s3q0> {
    public final List<Long> b;

    public b(List<Long> list) {
        this.b = list;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        ArrayList arrayList = new ArrayList(this.b);
        Collection<Long> t = w2wVar.I0().d().t(3);
        ArrayList arrayList2 = new ArrayList(c5g.u(t, 10));
        Iterator<T> it = t.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList2.add(Peer.a.b(longValue));
        }
        Collection values = ((wpp) w2wVar.L0(this, new b1r0(arrayList2, Source.CACHE))).c.values();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : values) {
            if (((User) obj).c != null) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Long l = ((User) it2.next()).c;
            if (l != null) {
                arrayList4.add(l);
            }
        }
        List t0 = j5g.t0(arrayList, arrayList4);
        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((User) it3.next()).B7());
        }
        w2wVar.L0(this, new ebj(this, arrayList5));
        if (!t0.isEmpty()) {
            w2wVar.I0().w().q(true);
        }
        w2wVar.S0().i();
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return ms9.a(')', new StringBuilder("NewSyncedContactsSetCmd(contactIds="), this.b);
    }

    public b() {
        this(EmptyList.b);
    }
}
