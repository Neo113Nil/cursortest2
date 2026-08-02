package com.vk.feed.settings.impl.presentation.filtered.tab;

import java.util.List;
import xsna.epx;
import xsna.t230;
import xsna.vu5;
import xsna.xl50;

/* compiled from: NewsfeedFilterListPatch.kt */
/* loaded from: classes18.dex */
public abstract class d implements xl50 {

    /* compiled from: NewsfeedFilterListPatch.kt */
    public static final class a extends d {
        public static final a b = new a();
    }

    /* compiled from: NewsfeedFilterListPatch.kt */
    public static final class b extends d {
        public static final b b = new b();
    }

    /* compiled from: NewsfeedFilterListPatch.kt */
    public static final class c extends d {
        public static final c b = new c();
    }

    /* compiled from: NewsfeedFilterListPatch.kt */
    /* renamed from: com.vk.feed.settings.impl.presentation.filtered.tab.d$d, reason: collision with other inner class name */
    public static final class C1063d extends d {
        public final List<t230> b;
        public final int c;

        /* JADX WARN: Multi-variable type inference failed */
        public C1063d(List<? extends t230> list, int i) {
            this.b = list;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1063d)) {
                return false;
            }
            C1063d c1063d = (C1063d) obj;
            return epx.f(this.b, c1063d.b) && this.c == c1063d.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateItems(items=");
            sb.append(this.b);
            sb.append(", total=");
            return vu5.b(sb, this.c, ')');
        }
    }
}
