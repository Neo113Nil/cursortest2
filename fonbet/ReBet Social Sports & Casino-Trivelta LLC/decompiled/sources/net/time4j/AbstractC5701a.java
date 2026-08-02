package net.time4j;

/* renamed from: net.time4j.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5701a extends net.time4j.format.d implements InterfaceC5703c {

    /* renamed from: b, reason: collision with root package name */
    public final transient AbstractC5722o f57686b;

    /* renamed from: c, reason: collision with root package name */
    public final transient AbstractC5722o f57687c;

    public AbstractC5701a(String str) {
        super(str);
        this.f57686b = new C5716i(this, 0);
        this.f57687c = new C5716i(this, 1);
    }

    public AbstractC5722o x(Comparable comparable) {
        return new C5716i(this, 6, comparable);
    }
}
