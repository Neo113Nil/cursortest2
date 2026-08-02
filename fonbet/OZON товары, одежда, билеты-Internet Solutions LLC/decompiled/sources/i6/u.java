package i6;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u implements m {

    /* renamed from: a, reason: collision with root package name */
    private final Set<m6.h<?>> f65913a = Collections.newSetFromMap(new WeakHashMap());

    public final void a() {
        this.f65913a.clear();
    }

    @NonNull
    public final ArrayList b() {
        return p6.l.e(this.f65913a);
    }

    public final void c(@NonNull m6.h<?> hVar) {
        this.f65913a.add(hVar);
    }

    public final void d(@NonNull m6.h<?> hVar) {
        this.f65913a.remove(hVar);
    }

    @Override // i6.m
    public final void onDestroy() {
        Iterator it = p6.l.e(this.f65913a).iterator();
        while (it.hasNext()) {
            ((m6.h) it.next()).onDestroy();
        }
    }

    @Override // i6.m
    public final void onStart() {
        Iterator it = p6.l.e(this.f65913a).iterator();
        while (it.hasNext()) {
            ((m6.h) it.next()).onStart();
        }
    }

    @Override // i6.m
    public final void onStop() {
        Iterator it = p6.l.e(this.f65913a).iterator();
        while (it.hasNext()) {
            ((m6.h) it.next()).onStop();
        }
    }
}
