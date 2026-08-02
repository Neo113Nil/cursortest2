package com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked;

import xsna.epx;
import xsna.ho8;

/* compiled from: ModerationBlockedItemMVI.kt */
/* loaded from: classes18.dex */
public interface e {

    /* compiled from: ModerationBlockedItemMVI.kt */
    public static final class a implements e {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1790498330;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ModerationBlockedItemMVI.kt */
    public static final class b implements e {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 608794186;
        }

        public final String toString() {
            return "ConfirmDialog";
        }
    }

    /* compiled from: ModerationBlockedItemMVI.kt */
    public static final class c implements e {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Link(link="), this.a, ')');
        }
    }
}
