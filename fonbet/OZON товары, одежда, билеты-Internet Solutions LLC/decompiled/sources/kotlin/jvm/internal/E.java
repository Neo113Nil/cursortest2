package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class E extends D {
    public E(kotlin.reflect.g gVar, String str, String str2) {
        super(AbstractC7724f.NO_RECEIVER, ((InterfaceC7726h) gVar).c(), str, str2, !(gVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public E(Class cls, String str, String str2, int i11) {
        super(AbstractC7724f.NO_RECEIVER, cls, str, str2, i11);
    }
}
