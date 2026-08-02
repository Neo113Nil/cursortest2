package defpackage;

import android.database.Observable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xqf extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((yqf) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((yqf) ((Observable) this).mObservers.get(size)).e(i, i2);
        }
    }

    public final void d(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((yqf) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
        }
    }

    public final void e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((yqf) ((Observable) this).mObservers.get(size)).d(i, i2);
        }
    }

    public final void f(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((yqf) ((Observable) this).mObservers.get(size)).f(i, i2);
        }
    }

    public final void g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((yqf) ((Observable) this).mObservers.get(size)).g();
        }
    }
}
