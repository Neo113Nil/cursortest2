package com.vk.feed.settings.impl.presentation.filtered;

import com.vk.feed.settings.api.domain.model.FilteredSourceType;
import xsna.kj50;
import xsna.vu5;

/* compiled from: NewsfeedFilteredSourcesAction.kt */
/* loaded from: classes18.dex */
public abstract class a implements kj50 {

    /* compiled from: NewsfeedFilteredSourcesAction.kt */
    /* renamed from: com.vk.feed.settings.impl.presentation.filtered.a$a, reason: collision with other inner class name */
    public static final class C1057a extends a {
        public static final C1057a b = new C1057a();
    }

    /* compiled from: NewsfeedFilteredSourcesAction.kt */
    public static final class b extends a {
        public final FilteredSourceType b;
        public final int c;

        public b(FilteredSourceType filteredSourceType, int i) {
            this.b = filteredSourceType;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateCounter(sourceType=");
            sb.append(this.b);
            sb.append(", value=");
            return vu5.b(sb, this.c, ')');
        }
    }
}
