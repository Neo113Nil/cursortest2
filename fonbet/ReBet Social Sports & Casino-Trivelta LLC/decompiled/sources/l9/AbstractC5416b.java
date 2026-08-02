package l9;

/* renamed from: l9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5416b {
    public static Object a(int i10, Object obj, InterfaceC5415a interfaceC5415a, InterfaceC5417c interfaceC5417c) {
        Object apply;
        if (i10 < 1) {
            return interfaceC5415a.apply(obj);
        }
        do {
            apply = interfaceC5415a.apply(obj);
            obj = interfaceC5417c.a(obj, apply);
            if (obj == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return apply;
    }
}
