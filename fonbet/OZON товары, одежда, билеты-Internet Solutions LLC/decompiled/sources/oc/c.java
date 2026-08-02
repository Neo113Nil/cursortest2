package oc;

/* loaded from: classes9.dex */
public final class c extends RuntimeException {
    public c(Throwable th2) {
        super("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th2, th2 == null ? new NullPointerException() : th2);
    }
}
