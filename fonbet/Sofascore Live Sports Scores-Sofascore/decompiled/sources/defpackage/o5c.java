package defpackage;

import com.sofascore.model.newNetwork.WSCStory;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o5c implements g6c {
    public final WSCStory a;
    public final int b;
    public final String c;

    public o5c(WSCStory wSCStory, int i, String str) {
        str.getClass();
        this.a = wSCStory;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5c)) {
            return false;
        }
        o5c o5cVar = (o5c) obj;
        return this.a.equals(o5cVar.a) && this.b == o5cVar.b && Intrinsics.c(this.c, o5cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsUrlItem(urlClip=");
        sb.append(this.a);
        sb.append(", eventId=");
        sb.append(this.b);
        sb.append(", sportSlug=");
        return mz1.o(sb, this.c, ")");
    }
}
