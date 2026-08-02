package o8;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements a9.a {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f21131a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f21132b;

    public final synchronized void a() {
        try {
            Iterator it = this.f21131a.iterator();
            while (it.hasNext()) {
                this.f21132b.add(((a9.a) it.next()).get());
            }
            this.f21131a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // a9.a
    public final Object get() {
        if (this.f21132b == null) {
            synchronized (this) {
                try {
                    if (this.f21132b == null) {
                        this.f21132b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f21132b);
    }
}
