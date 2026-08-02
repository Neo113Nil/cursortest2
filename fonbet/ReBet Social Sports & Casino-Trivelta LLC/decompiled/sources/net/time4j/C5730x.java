package net.time4j;

import java.io.InvalidObjectException;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: net.time4j.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5730x extends AbstractC5702b implements K {

    /* renamed from: g, reason: collision with root package name */
    public static final oi.p f58414g = new C5730x();
    private static final long serialVersionUID = 5930990958663061693L;

    /* renamed from: d, reason: collision with root package name */
    public final transient Long f58415d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Long f58416e;

    /* renamed from: f, reason: collision with root package name */
    public final transient oi.t f58417f;

    public C5730x() {
        this("DAY_OVERFLOW", Long.MIN_VALUE, LongCompanionObject.MAX_VALUE);
    }

    private Object readResolve() {
        Object x02 = G.x0(name());
        if (x02 != null) {
            return x02;
        }
        if (name().equals("DAY_OVERFLOW")) {
            return f58414g;
        }
        throw new InvalidObjectException(name());
    }

    public static C5730x y(String str, long j10, long j11) {
        return new C5730x(str, j10, j11);
    }

    @Override // oi.p
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Long d0() {
        return this.f58415d;
    }

    @Override // oi.p
    public boolean Y() {
        return false;
    }

    @Override // oi.p
    public boolean e0() {
        return true;
    }

    @Override // oi.p
    public Class getType() {
        return Long.class;
    }

    @Override // net.time4j.K
    public /* bridge */ /* synthetic */ AbstractC5722o m(Number number) {
        return super.x((Long) number);
    }

    @Override // oi.p
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Long c() {
        return this.f58416e;
    }

    public C5730x(String str, long j10, long j11) {
        super(str);
        this.f58415d = Long.valueOf(j10);
        this.f58416e = Long.valueOf(j11);
        this.f58417f = new L(this, true);
    }
}
