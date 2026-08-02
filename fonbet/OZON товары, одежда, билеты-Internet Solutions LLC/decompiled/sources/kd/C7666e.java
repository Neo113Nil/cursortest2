package kd;

import java.util.NoSuchElementException;
import kotlin.collections.S;

/* renamed from: kd.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7666e extends S {

    /* renamed from: a, reason: collision with root package name */
    private final long f71427a;

    /* renamed from: b, reason: collision with root package name */
    private final long f71428b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f71429c;

    /* renamed from: d, reason: collision with root package name */
    private long f71430d;

    public C7666e(long j11, long j12, long j13) {
        this.f71427a = j13;
        this.f71428b = j12;
        boolean z11 = false;
        if (j13 <= 0 ? j11 >= j12 : j11 <= j12) {
            z11 = true;
        }
        this.f71429c = z11;
        this.f71430d = z11 ? j11 : j12;
    }

    @Override // kotlin.collections.S
    public final long b() {
        long j11 = this.f71430d;
        if (j11 != this.f71428b) {
            this.f71430d = this.f71427a + j11;
            return j11;
        }
        if (!this.f71429c) {
            throw new NoSuchElementException();
        }
        this.f71429c = false;
        return j11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71429c;
    }
}
