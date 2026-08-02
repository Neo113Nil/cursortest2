package mf;

import androidx.appcompat.widget.p3;
import gf.o;
import gf.q;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a implements Continuation, d, Serializable {

    @Nullable
    private final Continuation<Object> completion;

    public a(Continuation continuation) {
        this.completion = continuation;
    }

    @NotNull
    public Continuation<Unit> create(@NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public d getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof d) {
            return (d) continuation;
        }
        return null;
    }

    @Nullable
    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        int i5;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Intrinsics.checkNotNullParameter(this, "<this>");
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i5 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i5 = -1;
        }
        int i10 = i5 >= 0 ? eVar.l()[i5] : -1;
        f.f20704a.getClass();
        Intrinsics.checkNotNullParameter(this, "continuation");
        p3 p3Var = f.f20706c;
        p3 p3Var2 = f.f20705b;
        if (p3Var == null) {
            try {
                p3 p3Var3 = new p3(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f20706c = p3Var3;
                p3Var = p3Var3;
            } catch (Exception unused2) {
                f.f20706c = p3Var2;
                p3Var = p3Var2;
            }
        }
        if (p3Var != p3Var2 && (method = p3Var.f869a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = p3Var.f870b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = p3Var.f871c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object obj) {
        Continuation frame = this;
        while (true) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            a aVar = (a) frame;
            Continuation continuation = aVar.completion;
            Intrinsics.checkNotNull(continuation);
            try {
                obj = aVar.invokeSuspend(obj);
            } catch (Throwable th2) {
                o oVar = q.f10031a;
                obj = h8.b.h(th2);
            }
            if (obj == lf.a.f20034a) {
                return;
            }
            o oVar2 = q.f10031a;
            aVar.releaseIntercepted();
            if (!(continuation instanceof a)) {
                continuation.resumeWith(obj);
                return;
            }
            frame = continuation;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    @NotNull
    public Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
