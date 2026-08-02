package p6;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f80270a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f80271b;

    /* renamed from: c, reason: collision with root package name */
    private long f80272c;

    /* renamed from: d, reason: collision with root package name */
    private long f80273d;

    static final class a<Y> {

        /* renamed from: a, reason: collision with root package name */
        final Y f80274a;

        /* renamed from: b, reason: collision with root package name */
        final int f80275b;

        a(Y y11, int i11) {
            this.f80274a = y11;
            this.f80275b = i11;
        }
    }

    public h(long j11) {
        this.f80271b = j11;
        this.f80272c = j11;
    }

    public final void a() {
        i(0L);
    }

    public final synchronized Y b(@NonNull T t2) {
        a aVar;
        aVar = (a) this.f80270a.get(t2);
        return aVar != null ? aVar.f80274a : null;
    }

    public final synchronized long c() {
        return this.f80272c;
    }

    protected int d(Y y11) {
        return 1;
    }

    protected void e(@NonNull T t2, Y y11) {
    }

    public final synchronized Y f(@NonNull T t2, Y y11) {
        int d11 = d(y11);
        long j11 = d11;
        if (j11 >= this.f80272c) {
            e(t2, y11);
            return null;
        }
        if (y11 != null) {
            this.f80273d += j11;
        }
        a aVar = (a) this.f80270a.put(t2, y11 == null ? null : new a(y11, d11));
        if (aVar != null) {
            this.f80273d -= aVar.f80275b;
            if (!aVar.f80274a.equals(y11)) {
                e(t2, aVar.f80274a);
            }
        }
        i(this.f80272c);
        return aVar != null ? aVar.f80274a : null;
    }

    public final synchronized Y g(@NonNull T t2) {
        a aVar = (a) this.f80270a.remove(t2);
        if (aVar == null) {
            return null;
        }
        this.f80273d -= aVar.f80275b;
        return aVar.f80274a;
    }

    public final synchronized void h(float f7) {
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        long round = Math.round(this.f80271b * f7);
        this.f80272c = round;
        i(round);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final synchronized void i(long j11) {
        while (this.f80273d > j11) {
            Iterator it = this.f80270a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f80273d -= aVar.f80275b;
            Object key = entry.getKey();
            it.remove();
            e(key, aVar.f80274a);
        }
    }
}
