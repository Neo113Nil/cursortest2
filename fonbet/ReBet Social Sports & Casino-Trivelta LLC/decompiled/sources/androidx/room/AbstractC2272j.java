package androidx.room;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.room.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2272j extends G {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2272j(w database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public abstract void bind(E2.k kVar, Object obj);

    public final int handle(Object obj) {
        E2.k acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.G();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(@NotNull Iterable<Object> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        E2.k acquire = acquire();
        try {
            Iterator<Object> it = entities.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                bind(acquire, it.next());
                i10 += acquire.G();
            }
            return i10;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(@NotNull Object[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        E2.k acquire = acquire();
        try {
            int i10 = 0;
            for (Object obj : entities) {
                bind(acquire, obj);
                i10 += acquire.G();
            }
            return i10;
        } finally {
            release(acquire);
        }
    }
}
