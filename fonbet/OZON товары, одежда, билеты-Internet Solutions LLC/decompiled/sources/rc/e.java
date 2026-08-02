package rc;

import io.reactivex.w;
import tc.InterfaceC9803e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e implements InterfaceC9803e<Object> {
    private static final /* synthetic */ e[] $VALUES;
    public static final e INSTANCE;
    public static final e NEVER;

    static {
        e eVar = new e("INSTANCE", 0);
        INSTANCE = eVar;
        e eVar2 = new e("NEVER", 1);
        NEVER = eVar2;
        $VALUES = new e[]{eVar, eVar2};
    }

    private e() {
        throw null;
    }

    public static void b(w<?> wVar) {
        wVar.onSubscribe(INSTANCE);
        wVar.onComplete();
    }

    public static void d(Throwable th2, w<?> wVar) {
        wVar.onSubscribe(INSTANCE);
        wVar.onError(th2);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @Override // tc.InterfaceC9804f
    public final int a(int i11) {
        return 2;
    }

    @Override // tc.InterfaceC9808j
    public final void clear() {
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // tc.InterfaceC9808j
    public final boolean isEmpty() {
        return true;
    }

    @Override // tc.InterfaceC9808j
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // tc.InterfaceC9808j
    public final Object poll() throws Exception {
        return null;
    }
}
