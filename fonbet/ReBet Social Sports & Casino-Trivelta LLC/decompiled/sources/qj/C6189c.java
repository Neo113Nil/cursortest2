package qj;

import java.io.IOException;

/* renamed from: qj.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6189c extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public Exception f63679a;

    public C6189c(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f63679a;
    }

    public C6189c(String str, Exception exc) {
        super(str);
        this.f63679a = exc;
    }
}
