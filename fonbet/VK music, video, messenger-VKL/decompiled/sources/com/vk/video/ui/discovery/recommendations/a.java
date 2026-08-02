package com.vk.video.ui.discovery.recommendations;

import com.vk.video.ui.discovery.recommendations.b;
import xsna.epx;
import xsna.qoy;
import xsna.tn;

/* compiled from: VideoDiscoveryRecommendationsEvent.kt */
/* loaded from: classes7.dex */
public abstract class a {

    /* compiled from: VideoDiscoveryRecommendationsEvent.kt */
    /* renamed from: com.vk.video.ui.discovery.recommendations.a$a, reason: collision with other inner class name */
    public static final class C1996a extends a {
        public final b.a a;
        public final boolean b;
        public final Boolean c;

        public C1996a(b.a aVar, boolean z, Boolean bool) {
            this.a = aVar;
            this.b = z;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1996a)) {
                return false;
            }
            C1996a c1996a = (C1996a) obj;
            return epx.f(this.a, c1996a.a) && this.b == c1996a.b && epx.f(this.c, c1996a.c);
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            Boolean bool = this.c;
            return b + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageLoaded(result=");
            sb.append(this.a);
            sb.append(", isReload=");
            sb.append(this.b);
            sb.append(", isPreviousJoin=");
            return tn.a(sb, this.c, ')');
        }
    }

    /* compiled from: VideoDiscoveryRecommendationsEvent.kt */
    public static final class b extends a {
        public static final b a = new b();
    }
}
