package kd;

import java.util.NoSuchElementException;
import kotlin.collections.Q;

/* renamed from: kd.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7665d extends Q {

    /* renamed from: a, reason: collision with root package name */
    private final int f71423a;

    /* renamed from: b, reason: collision with root package name */
    private final int f71424b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f71425c;

    /* renamed from: d, reason: collision with root package name */
    private int f71426d;

    public C7665d(int i11, int i12, int i13) {
        this.f71423a = i13;
        this.f71424b = i12;
        boolean z11 = false;
        if (i13 <= 0 ? i11 >= i12 : i11 <= i12) {
            z11 = true;
        }
        this.f71425c = z11;
        this.f71426d = z11 ? i11 : i12;
    }

    @Override // kotlin.collections.Q
    public final int b() {
        int i11 = this.f71426d;
        if (i11 != this.f71424b) {
            this.f71426d = this.f71423a + i11;
            return i11;
        }
        if (!this.f71425c) {
            throw new NoSuchElementException();
        }
        this.f71425c = false;
        return i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71425c;
    }
}
