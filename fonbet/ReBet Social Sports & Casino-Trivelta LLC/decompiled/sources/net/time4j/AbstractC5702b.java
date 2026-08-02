package net.time4j;

/* renamed from: net.time4j.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5702b extends net.time4j.format.d implements InterfaceC5703c {

    /* renamed from: b, reason: collision with root package name */
    public final transient AbstractC5722o f57723b;

    /* renamed from: c, reason: collision with root package name */
    public final transient AbstractC5722o f57724c;

    public AbstractC5702b(String str) {
        super(str);
        this.f57723b = new S(this, 0);
        this.f57724c = new S(this, 1);
    }

    public AbstractC5722o x(Comparable comparable) {
        return new S(this, 6, comparable);
    }
}
