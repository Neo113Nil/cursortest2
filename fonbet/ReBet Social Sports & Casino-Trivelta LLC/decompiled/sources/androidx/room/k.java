package androidx.room;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k extends G {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(w database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public abstract void bind(E2.k kVar, Object obj);

    public final void d(Iterable entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        E2.k acquire = acquire();
        try {
            Iterator it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                acquire.J0();
            }
        } finally {
            release(acquire);
        }
    }

    public final void e(Object obj) {
        E2.k acquire = acquire();
        try {
            bind(acquire, obj);
            acquire.J0();
        } finally {
            release(acquire);
        }
    }

    public final long f(Object obj) {
        E2.k acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.J0();
        } finally {
            release(acquire);
        }
    }
}
