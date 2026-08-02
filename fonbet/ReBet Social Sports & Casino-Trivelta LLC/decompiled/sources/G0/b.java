package G0;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3781a = new ArrayList();

    public final void a() {
        int lastIndex = CollectionsKt.getLastIndex(this.f3781a);
        if (-1 >= lastIndex) {
            return;
        }
        android.support.v4.media.session.b.a(this.f3781a.get(lastIndex));
        throw null;
    }
}
