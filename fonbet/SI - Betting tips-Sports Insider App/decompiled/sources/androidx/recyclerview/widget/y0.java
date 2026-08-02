package androidx.recyclerview.widget;

import android.database.Observable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((z0) ((Observable) this).mObservers.get(size)).onChanged();
        }
    }

    public final void c(int i5, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((z0) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i5, i10, 1);
        }
    }

    public final void d(int i5, int i10, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((z0) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i5, i10, obj);
        }
    }

    public final void e(int i5, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((z0) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i5, i10);
        }
    }

    public final void f(int i5, int i10) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((z0) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i5, i10);
        }
    }

    public final void g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((z0) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
        }
    }
}
