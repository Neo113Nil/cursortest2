package androidx.room;

import androidx.room.e;
import java.lang.ref.WeakReference;
import java.util.Set;

/* compiled from: InvalidationTracker.android.kt */
/* loaded from: classes.dex */
public final class t extends e.a {
    public final e b;
    public final WeakReference<e.a> c;

    public t(e eVar, n nVar) {
        super(nVar.a);
        this.b = eVar;
        this.c = new WeakReference<>(nVar);
    }

    @Override // androidx.room.e.a
    public final void a(Set<String> set) {
        e.a aVar = this.c.get();
        if (aVar == null) {
            this.b.b(this);
        } else {
            aVar.a(set);
        }
    }
}
