package io.sentry.android.core.anr;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f50894a;

    /* renamed from: b, reason: collision with root package name */
    public final float f50895b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50896c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50897d;

    /* renamed from: e, reason: collision with root package name */
    public int f50898e = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f50899f;

    /* renamed from: g, reason: collision with root package name */
    public long f50900g;
    private final StackTraceElement[] stack;

    public a(StackTraceElement[] stackTraceElementArr, int i10, int i11, long j10, float f10) {
        this.stack = stackTraceElementArr;
        this.f50896c = i10;
        this.f50897d = i11;
        this.f50894a = (i11 - i10) + 1;
        this.f50899f = j10;
        this.f50900g = j10;
        this.f50895b = f10;
    }

    public void a(long j10) {
        this.f50899f = Math.min(this.f50899f, j10);
        this.f50900g = Math.max(this.f50900g, j10);
        this.f50898e++;
    }

    public StackTraceElement[] b() {
        return (StackTraceElement[]) Arrays.copyOfRange(this.stack, this.f50896c, this.f50897d + 1);
    }
}
