package com.vk.profile.design.compose.header;

import java.util.List;
import xsna.n23;
import xsna.qoy;
import xsna.shy;
import xsna.wow;

/* compiled from: AuthorHeaderConfig.kt */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: AuthorHeaderConfig.kt */
    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2093106381;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: AuthorHeaderConfig.kt */
    /* renamed from: com.vk.profile.design.compose.header.b$b, reason: collision with other inner class name */
    public static final class C1661b implements b {
        public final Object a;
        public final int b;
        public final boolean c;

        public C1661b(List list, int i, boolean z, int i2) {
            i = (i2 & 2) != 0 ? 0 : i;
            z = (i2 & 4) != 0 ? true : z;
            this.a = list;
            this.b = i;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1661b)) {
                return false;
            }
            C1661b c1661b = (C1661b) obj;
            return this.a.equals(c1661b.a) && this.b == c1661b.b && this.c == c1661b.c;
        }

        public final int hashCode() {
            return Long.hashCode(6000L) + qoy.b(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        public final String toString() {
            StringBuilder sb = new StringBuilder("LiveCover(mediaItems=");
            sb.append((Object) wow.c(this.a));
            sb.append(", initialPageIndex=");
            sb.append(this.b);
            sb.append(", isAutoSwitchEnabled=");
            return n23.b(sb, this.c, ", autoSwitchDurationMillis=6000)");
        }
    }
}
