package oi;

import java.io.Serializable;

/* renamed from: oi.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5912h implements Comparable, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final C5912h f61289a = new C5912h(0);

    /* renamed from: b, reason: collision with root package name */
    public static final C5912h f61290b = new C5912h(1);
    private final long days;

    public C5912h(long j10) {
        this.days = j10;
    }

    public static C5912h c(long j10) {
        return j10 == 0 ? f61289a : j10 == 1 ? f61290b : new C5912h(j10);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5912h c5912h) {
        long j10 = this.days;
        long j11 = c5912h.days;
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    public long b() {
        return this.days;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5912h) && this.days == ((C5912h) obj).days;
    }

    public int hashCode() {
        long j10 = this.days;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.days < 0) {
            sb2.append('-');
        }
        sb2.append('P');
        sb2.append(Math.abs(this.days));
        sb2.append('D');
        return sb2.toString();
    }
}
