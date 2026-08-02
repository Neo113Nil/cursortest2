package sj;

import java.io.IOException;

/* renamed from: sj.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6373d extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f64953a;

    public C6373d(String str, Throwable th2) {
        super(str);
        this.f64953a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f64953a;
    }
}
