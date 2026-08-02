package B;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: B.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027b extends AtomicInteger {
    public C1027b(int i10) {
        super(i10);
    }

    public byte a() {
        return (byte) intValue();
    }

    public /* bridge */ double b() {
        return super.doubleValue();
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        return a();
    }

    public /* bridge */ float c() {
        return super.floatValue();
    }

    public /* bridge */ int d() {
        return super.intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ double doubleValue() {
        return b();
    }

    public /* bridge */ long e() {
        return super.longValue();
    }

    public short f() {
        return (short) intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ float floatValue() {
        return c();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ int intValue() {
        return d();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ long longValue() {
        return e();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        return f();
    }
}
