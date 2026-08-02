package net.time4j;

import kotlin.time.DurationKt;

/* renamed from: net.time4j.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5724q implements oi.v {

    /* renamed from: a, reason: collision with root package name */
    public final char f58310a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58311b;

    public C5724q(char c10, boolean z10) {
        this.f58310a = c10;
        this.f58311b = z10;
    }

    @Override // oi.v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public oi.q apply(oi.q qVar) {
        if (this.f58310a == '9') {
            return qVar;
        }
        K k10 = G.f57562B;
        int intValue = ((Integer) qVar.j(k10)).intValue();
        int intValue2 = ((Integer) qVar.c(k10)).intValue();
        char c10 = this.f58310a;
        if (c10 == '3') {
            return qVar.w(k10, Math.min(intValue2, ((intValue / DurationKt.NANOS_IN_MILLIS) * DurationKt.NANOS_IN_MILLIS) + (this.f58311b ? 999999 : 0)));
        }
        if (c10 == '6') {
            return qVar.w(k10, Math.min(intValue2, ((intValue / 1000) * 1000) + (this.f58311b ? androidx.room.w.MAX_BIND_PARAMETER_CNT : 0)));
        }
        throw new UnsupportedOperationException("Unknown: " + this.f58310a);
    }
}
