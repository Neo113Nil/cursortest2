package com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked;

import xsna.epx;
import xsna.ho8;
import xsna.u11;
import xsna.xl50;

/* compiled from: ModerationBlockedItemMVI.kt */
/* loaded from: classes18.dex */
public interface f extends xl50 {

    /* compiled from: ModerationBlockedItemMVI.kt */
    public static final class a implements f {
        public final CharSequence b;
        public final CharSequence c;
        public final String d;

        public a(CharSequence charSequence, CharSequence charSequence2, String str) {
            this.b = charSequence;
            this.c = charSequence2;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int c = u11.c(this.b.hashCode() * 31, 31, this.c);
            String str = this.d;
            return c + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Init(description=");
            sb.append((Object) this.b);
            sb.append(", infoLink=");
            sb.append((Object) this.c);
            sb.append(", imageUrl=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: ModerationBlockedItemMVI.kt */
    public static final class b implements f {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1803763904;
        }

        public final String toString() {
            return "ItemDelete";
        }
    }

    /* compiled from: ModerationBlockedItemMVI.kt */
    public static final class c implements f {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -802612952;
        }

        public final String toString() {
            return "ItemDeleteError";
        }
    }
}
