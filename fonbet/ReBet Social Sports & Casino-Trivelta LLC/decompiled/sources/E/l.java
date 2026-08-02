package E;

import java.util.Map;

/* loaded from: classes.dex */
public final class l extends k {
    @Override // java.util.Iterator
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        F.a.a(d());
        i(c() + 2);
        return new a(b()[c() - 2], b()[c() - 1]);
    }
}
