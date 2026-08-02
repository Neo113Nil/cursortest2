package com.vk.managed_groups.impl.list;

import com.vk.managed_groups.impl.list.popup.ManagedGroupAction;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.epx;
import xsna.ms9;

/* compiled from: ManagedGroupsViewEvent.kt */
/* loaded from: classes3.dex */
public interface h {

    /* compiled from: ManagedGroupsViewEvent.kt */
    public static final class a implements h {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2000241767;
        }

        public final String toString() {
            return "ErrorChangingNotificationSettings";
        }
    }

    /* compiled from: ManagedGroupsViewEvent.kt */
    public static final class b implements h {
        public final List<ManagedGroupAction> a;

        public b(ListBuilder listBuilder) {
            this.a = listBuilder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return epx.f(this.a, bVar.a);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("OpenChannelsPopup(peer=null, actions="), this.a);
        }
    }
}
