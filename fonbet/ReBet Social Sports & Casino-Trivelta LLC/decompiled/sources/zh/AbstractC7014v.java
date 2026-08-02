package zh;

/* renamed from: zh.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7014v {
    public static void a(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }
}
