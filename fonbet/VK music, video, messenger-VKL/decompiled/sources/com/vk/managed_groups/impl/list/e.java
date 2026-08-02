package com.vk.managed_groups.impl.list;

import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import xsna.xl50;

/* compiled from: ManagedGroupsListPatch.kt */
/* loaded from: classes3.dex */
public interface e extends xl50 {

    /* compiled from: ManagedGroupsListPatch.kt */
    public static final class a implements e {
        public final ArrayList b;

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b.equals(((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return j.b(')', new StringBuilder("GroupsLoaded(list="), this.b);
        }
    }

    /* compiled from: ManagedGroupsListPatch.kt */
    public static final class b implements e {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 438729815;
        }

        public final String toString() {
            return "Init";
        }
    }
}
