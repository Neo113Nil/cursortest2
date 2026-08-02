package javazoom.jl.decoder;

import java.io.PrintStream;

/* loaded from: classes9.dex */
public class JavaLayerException extends Exception {
    private Throwable exception;

    public JavaLayerException() {
    }

    public JavaLayerException(String str) {
        super(str);
    }

    public JavaLayerException(String str, Throwable th) {
        super(str);
        this.exception = th;
    }

    public Throwable getException() {
        return this.exception;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        Throwable th = this.exception;
        if (th == null) {
            super.printStackTrace(printStream);
        } else {
            th.printStackTrace();
        }
    }
}
