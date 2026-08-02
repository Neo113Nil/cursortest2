package x1;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10629d extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C10629d f104867a = new C10629d();

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArr;
        stackTraceElementArr = M.f104835a;
        setStackTrace(stackTraceElementArr);
        return this;
    }
}
