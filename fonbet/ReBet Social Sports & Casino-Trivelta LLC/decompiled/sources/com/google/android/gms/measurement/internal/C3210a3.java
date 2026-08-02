package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;
import java.lang.Thread;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3210a3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f33916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3234d3 f33917b;

    public C3210a3(C3234d3 c3234d3, String str) {
        Objects.requireNonNull(c3234d3);
        this.f33917b = c3234d3;
        AbstractC3191o.m(str);
        this.f33916a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f33917b.f33578a.a().o().b(this.f33916a, th2);
    }
}
