package b1;

import java.util.List;

/* loaded from: classes.dex */
public interface U {

    /* renamed from: a, reason: collision with root package name */
    public static final U f24521a = new a();

    public class a implements U {

        /* renamed from: b1.U$a$a, reason: collision with other inner class name */
        public class C0428a implements InterfaceC2337F {
            public C0428a() {
            }
        }

        @Override // b1.U
        public InterfaceC2337F a(int i10, long j10) {
            return new C0428a();
        }

        @Override // b1.U
        public e1.L b(List list) {
            return (e1.L) list.get(0);
        }
    }

    InterfaceC2337F a(int i10, long j10);

    e1.L b(List list);
}
