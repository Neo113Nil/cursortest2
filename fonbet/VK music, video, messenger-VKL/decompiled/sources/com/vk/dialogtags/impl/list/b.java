package com.vk.dialogtags.impl.list;

import java.util.List;
import xsna.epx;
import xsna.pk50;
import xsna.x1o0;

/* compiled from: TagsListEvent.kt */
/* loaded from: classes18.dex */
public interface b extends pk50 {

    /* compiled from: TagsListEvent.kt */
    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -846265330;
        }

        public final String toString() {
            return "HideList";
        }
    }

    /* compiled from: TagsListEvent.kt */
    /* renamed from: com.vk.dialogtags.impl.list.b$b, reason: collision with other inner class name */
    public static final class C0899b implements b {
        public final List<? extends Integer> a;

        public C0899b() {
            throw null;
        }

        public C0899b(List list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0899b) && epx.f(this.a, ((C0899b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TagsSelected(filter=" + ((Object) x1o0.t(this.a)) + ')';
        }
    }

    /* compiled from: TagsListEvent.kt */
    public static final class c implements b {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1517315946;
        }

        public final String toString() {
            return "TagsSettings";
        }
    }
}
