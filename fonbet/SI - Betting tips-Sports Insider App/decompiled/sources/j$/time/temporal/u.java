package j$.time.temporal;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class u implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final ConcurrentHashMap f17550g = new ConcurrentHashMap(4, 0.75f, 2);

    /* renamed from: h, reason: collision with root package name */
    public static final h f17551h;
    private static final long serialVersionUID = -1177360819670808121L;

    /* renamed from: a, reason: collision with root package name */
    public final j$.time.d f17552a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17553b;

    /* renamed from: c, reason: collision with root package name */
    public final transient t f17554c;

    /* renamed from: d, reason: collision with root package name */
    public final transient t f17555d;

    /* renamed from: e, reason: collision with root package name */
    public final transient t f17556e;

    /* renamed from: f, reason: collision with root package name */
    public final transient t f17557f;

    static {
        new u(j$.time.d.MONDAY, 4);
        a(j$.time.d.SUNDAY, 1);
        f17551h = i.f17522d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u a(j$.time.d dVar, int i5) {
        String str = dVar.toString() + i5;
        ConcurrentHashMap concurrentHashMap = f17550g;
        u uVar = (u) concurrentHashMap.get(str);
        if (uVar != null) {
            return uVar;
        }
        concurrentHashMap.putIfAbsent(str, new u(dVar, i5));
        return (u) concurrentHashMap.get(str);
    }

    public u(j$.time.d dVar, int i5) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.f17554c = new t("DayOfWeek", this, chronoUnit, chronoUnit2, t.f17541f);
        this.f17555d = new t("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, t.f17542g);
        h hVar = i.f17522d;
        this.f17556e = new t("WeekOfWeekBasedYear", this, chronoUnit2, hVar, t.f17544i);
        this.f17557f = new t("WeekBasedYear", this, hVar, ChronoUnit.FOREVER, a.YEAR.f17512b);
        Objects.requireNonNull(dVar, "firstDayOfWeek");
        if (i5 < 1 || i5 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f17552a = dVar;
        this.f17553b = i5;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.f17552a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i5 = this.f17553b;
        if (i5 < 1 || i5 > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() {
        try {
            return a(this.f17552a, this.f17553b);
        } catch (IllegalArgumentException e7) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e7.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.f17552a.ordinal() * 7) + this.f17553b;
    }

    public final String toString() {
        return "WeekFields[" + this.f17552a + StringUtils.COMMA + this.f17553b + "]";
    }
}
