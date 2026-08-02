package net.time4j;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class I implements oi.p {

    /* renamed from: d, reason: collision with root package name */
    public static final oi.p f57621d = new I(EnumC5714g.class, EnumC5714g.f58143a, EnumC5714g.f58148f);

    /* renamed from: e, reason: collision with root package name */
    public static final oi.p f57622e = new I(TimeUnit.class, TimeUnit.DAYS, TimeUnit.NANOSECONDS);

    /* renamed from: a, reason: collision with root package name */
    public final Class f57623a;

    /* renamed from: b, reason: collision with root package name */
    public final transient Comparable f57624b;

    /* renamed from: c, reason: collision with root package name */
    public final transient Comparable f57625c;

    public I(Class cls, Comparable comparable, Comparable comparable2) {
        this.f57623a = cls;
        this.f57624b = comparable;
        this.f57625c = comparable2;
    }

    @Override // oi.p
    public boolean Y() {
        return false;
    }

    @Override // oi.p
    public char a() {
        return (char) 0;
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(oi.o oVar, oi.o oVar2) {
        Comparable comparable = (Comparable) oVar.j(this);
        Comparable comparable2 = (Comparable) oVar2.j(this);
        return this.f57623a == EnumC5714g.class ? comparable.compareTo(comparable2) : comparable2.compareTo(comparable);
    }

    @Override // oi.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Comparable c() {
        return this.f57625c;
    }

    @Override // oi.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Comparable d0() {
        return this.f57624b;
    }

    @Override // oi.p
    public boolean e0() {
        return true;
    }

    @Override // oi.p
    public boolean g() {
        return false;
    }

    @Override // oi.p
    public Class getType() {
        return this.f57623a;
    }

    @Override // oi.p
    public String name() {
        return "PRECISION";
    }
}
