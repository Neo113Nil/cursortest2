package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class p6 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f5182a;

    public p6(Unsafe unsafe) {
        this.f5182a = unsafe;
    }

    public abstract void a(Object obj, long j, byte b10);

    public abstract boolean b(long j, Object obj);

    public abstract void c(Object obj, long j, boolean z5);

    public abstract float d(long j, Object obj);

    public abstract void e(Object obj, long j, float f6);

    public abstract double f(long j, Object obj);

    public abstract void g(Object obj, long j, double d10);
}
