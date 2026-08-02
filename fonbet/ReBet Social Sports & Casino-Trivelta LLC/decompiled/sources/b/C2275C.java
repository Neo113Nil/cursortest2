package b;

import java.io.IOException;

/* renamed from: b.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2275C extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f24057a;

    public C2275C(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f24057a;
    }

    public C2275C(String str, RuntimeException runtimeException) {
        super(str);
        this.f24057a = runtimeException;
    }
}
