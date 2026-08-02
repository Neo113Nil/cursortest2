package com.vk.video.ui.discovery.catalog;

import com.vk.video.ui.discovery.catalog.b;
import defpackage.q0;
import xsna.epx;

/* compiled from: VideoDiscoveryCatalogEvent.kt */
/* loaded from: classes7.dex */
public abstract class a {

    /* compiled from: VideoDiscoveryCatalogEvent.kt */
    /* renamed from: com.vk.video.ui.discovery.catalog.a$a, reason: collision with other inner class name */
    public static final class C1966a extends a {
        public static final C1966a a = new C1966a();
    }

    /* compiled from: VideoDiscoveryCatalogEvent.kt */
    public static final class b extends a {
        public final b.a a;
        public final boolean b;

        public b(b.a aVar, boolean z) {
            this.a = aVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageLoaded(result=");
            sb.append(this.a);
            sb.append(", isReload=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VideoDiscoveryCatalogEvent.kt */
    public static final class c extends a {
        public static final c a = new c();
    }
}
