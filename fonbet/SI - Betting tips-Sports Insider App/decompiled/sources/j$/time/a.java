package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class a extends j$.com.android.tools.r8.a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f17302b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a, reason: collision with root package name */
    public final ZoneId f17303a;

    public a(ZoneId zoneId) {
        this.f17303a = zoneId;
    }

    static {
        System.currentTimeMillis();
        f17302b = new a(ZoneOffset.UTC);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f17303a.equals(((a) obj).f17303a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17303a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f17303a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}
