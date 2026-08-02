package com.vk.managed_groups.impl.list;

import com.vk.dto.common.Peer;
import com.vk.managed_groups.impl.list.popup.ManagedGroupAction;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import xsna.epx;
import xsna.kj50;

/* compiled from: ManagedGroupsListAction.kt */
/* loaded from: classes3.dex */
public interface a extends kj50 {

    /* compiled from: ManagedGroupsListAction.kt */
    /* renamed from: com.vk.managed_groups.impl.list.a$a, reason: collision with other inner class name */
    public static final class C1260a implements a {
        public final ManagedGroupAction b;

        public C1260a(ManagedGroupAction managedGroupAction) {
            this.b = managedGroupAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1260a)) {
                return false;
            }
            C1260a c1260a = (C1260a) obj;
            c1260a.getClass();
            return this.b == c1260a.b;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ApplyAction(peer=null, action=" + this.b + ')';
        }
    }

    /* compiled from: ManagedGroupsListAction.kt */
    public static final class b implements a {
        public final Peer.Group b;

        public b(Peer.Group group) {
            this.b = group;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return "Click(peer=" + this.b + ')';
        }
    }

    /* compiled from: ManagedGroupsListAction.kt */
    public static final class c implements a {
        public final ArrayList b;

        public c(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b.equals(((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("GroupsLoaded(groupsList="), this.b);
        }
    }

    /* compiled from: ManagedGroupsListAction.kt */
    public static final class d implements a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1492053817;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ManagedGroupsListAction.kt */
    public static final class e implements a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OpenActionsMenu(peer=null)";
        }
    }
}
