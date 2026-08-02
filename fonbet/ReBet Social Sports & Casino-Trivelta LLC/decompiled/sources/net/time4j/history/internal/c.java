package net.time4j.history.internal;

import net.time4j.format.d;
import oi.p;

/* loaded from: classes5.dex */
public class c extends d {

    /* renamed from: e, reason: collision with root package name */
    public static final p f58210e = new c("YEAR_OF_DISPLAY", 0, 1, 9999);
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final transient char f58211b;

    /* renamed from: c, reason: collision with root package name */
    public final transient Integer f58212c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Integer f58213d;

    public c(String str, char c10, int i10, int i11) {
        super(str);
        this.f58211b = c10;
        this.f58212c = Integer.valueOf(i10);
        this.f58213d = Integer.valueOf(i11);
    }

    private Object readResolve() {
        return f58210e;
    }

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // oi.AbstractC5909e, oi.p
    public char a() {
        return this.f58211b;
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    @Override // oi.p
    public final Class getType() {
        return Integer.class;
    }

    @Override // oi.AbstractC5909e
    public boolean w() {
        return true;
    }

    @Override // oi.p
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Integer c() {
        return this.f58213d;
    }

    @Override // oi.p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Integer d0() {
        return this.f58212c;
    }
}
