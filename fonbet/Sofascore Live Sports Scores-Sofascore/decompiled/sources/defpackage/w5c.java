package defpackage;

import com.sofascore.model.newNetwork.EventMediaNews;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w5c implements g6c {
    public final EventMediaNews a;

    public w5c(EventMediaNews eventMediaNews) {
        eventMediaNews.getClass();
        this.a = eventMediaNews;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5c) && Intrinsics.c(this.a, ((w5c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NewsItem(news=" + this.a + ")";
    }
}
