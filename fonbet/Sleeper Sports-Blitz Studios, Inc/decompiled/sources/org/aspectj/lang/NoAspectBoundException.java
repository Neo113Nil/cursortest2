package org.aspectj.lang;

/* loaded from: classes10.dex */
public class NoAspectBoundException extends RuntimeException {
    Throwable cause;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NoAspectBoundException(String str, Throwable th) {
        super(str);
        if (th != null) {
            str = "Exception while initializing " + str + ": " + th;
        }
        this.cause = th;
    }

    public NoAspectBoundException() {
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
