package zb;

/* renamed from: zb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6954b implements InterfaceC6953a {

    /* renamed from: a, reason: collision with root package name */
    public static C6954b f68662a;

    public static C6954b b() {
        if (f68662a == null) {
            f68662a = new C6954b();
        }
        return f68662a;
    }

    @Override // zb.InterfaceC6953a
    public long a() {
        return System.currentTimeMillis();
    }
}
