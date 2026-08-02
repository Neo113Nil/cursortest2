package com.vk.im.engine.models;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import xsna.j5g;

/* compiled from: SelectedMembers.kt */
/* loaded from: classes2.dex */
public final class SelectedMembers extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SelectedMembers> CREATOR = new b();
    public static final SelectedMembers d = new SelectedMembers((LinkedHashSet<Peer>) new LinkedHashSet(), (LinkedHashSet<Peer>) new LinkedHashSet());
    public final LinkedHashSet b;
    public Object c;

    /* compiled from: SelectedMembers.kt */
    public static final class a {
        public static SelectedMembers a(Set set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                linkedHashSet2.add(Peer.a.b(longValue));
            }
            return new SelectedMembers((LinkedHashSet<Peer>) linkedHashSet, (LinkedHashSet<Peer>) linkedHashSet2);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<SelectedMembers> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SelectedMembers a(Serializer serializer) {
            return new SelectedMembers(serializer.k(Peer.class), serializer.k(Peer.class));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectedMembers[i];
        }
    }

    public SelectedMembers(LinkedHashSet<Peer> linkedHashSet, LinkedHashSet<Peer> linkedHashSet2) {
        this.b = linkedHashSet;
        this.c = linkedHashSet2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(j5g.O0(this.b));
        serializer.o0(j5g.O0((Iterable) this.c));
    }

    public SelectedMembers(Collection<? extends Peer> collection, Collection<? extends Peer> collection2) {
        this((LinkedHashSet<Peer>) new LinkedHashSet(collection), (LinkedHashSet<Peer>) new LinkedHashSet(collection2));
    }
}
