package N8;

import java.util.HashMap;
import java.util.HashSet;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7942a = new HashMap();

    public final void a() {
        this.f7942a.clear();
    }

    public final boolean b(String mediaId, String responseId) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Intrinsics.checkNotNullParameter(responseId, "responseId");
        HashSet hashSet = (HashSet) this.f7942a.get(responseId);
        if (hashSet == null) {
            this.f7942a.put(responseId, SetsKt.hashSetOf(mediaId));
            return true;
        }
        if (hashSet.contains(mediaId)) {
            return false;
        }
        hashSet.add(mediaId);
        return true;
    }
}
