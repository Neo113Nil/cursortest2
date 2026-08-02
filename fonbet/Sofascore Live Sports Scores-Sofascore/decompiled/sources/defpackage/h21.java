package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class h21 implements rq3, mu3, Serializable {

    @Nullable
    private final rq3<Object> completion;

    public h21(rq3 rq3Var) {
        this.completion = rq3Var;
    }

    @NotNull
    public rq3<Unit> create(@NotNull rq3<?> rq3Var) {
        rq3Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.mu3
    @Nullable
    public mu3 getCallerFrame() {
        rq3<Object> rq3Var = this.completion;
        if (rq3Var instanceof mu3) {
            return (mu3) rq3Var;
        }
        return null;
    }

    @Nullable
    public final rq3<Object> getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        il4 il4Var = (il4) getClass().getAnnotation(il4.class);
        String str2 = null;
        if (il4Var == null || il4Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? il4Var.l()[i] : -1;
        fuc.a.getClass();
        x6k x6kVar = fuc.c;
        x6k x6kVar2 = fuc.b;
        if (x6kVar == null) {
            try {
                x6k x6kVar3 = new x6k(13, Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                fuc.c = x6kVar3;
                x6kVar = x6kVar3;
            } catch (Exception unused2) {
                fuc.c = x6kVar2;
                x6kVar = x6kVar2;
            }
        }
        if (x6kVar != x6kVar2 && (method = (Method) x6kVar.b) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) x6kVar.c) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) x6kVar.d;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = il4Var.c();
        } else {
            str = str2 + '/' + il4Var.c();
        }
        return new StackTraceElement(str, il4Var.m(), il4Var.f(), i2);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rq3, rq3<java.lang.Object>] */
    @Override // defpackage.rq3
    public final void resumeWith(@NotNull Object obj) {
        while (true) {
            h21 h21Var = this;
            ?? r0 = h21Var.completion;
            r0.getClass();
            try {
                obj = h21Var.invokeSuspend(obj);
            } catch (Throwable th) {
                p2g p2gVar = w2g.b;
                obj = new u2g(th);
            }
            if (obj == lu3.a) {
                return;
            }
            p2g p2gVar2 = w2g.b;
            h21Var.releaseIntercepted();
            if (!(r0 instanceof h21)) {
                r0.resumeWith(obj);
                return;
            }
            this = r0;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @NotNull
    public rq3<Unit> create(@Nullable Object obj, @NotNull rq3<?> rq3Var) {
        rq3Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
