package com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked;

import xsna.epx;
import xsna.oq;

/* compiled from: ModerationBlockedItemMVI.kt */
/* loaded from: classes18.dex */
public interface c {

    /* compiled from: ModerationBlockedItemMVI.kt */
    public static final class a implements c {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("ItemDeleteError(error="), this.a, ')');
        }
    }
}
