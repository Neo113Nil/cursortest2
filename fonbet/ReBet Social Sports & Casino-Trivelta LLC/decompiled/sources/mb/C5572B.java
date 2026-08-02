package mb;

import wb.InterfaceC6735a;
import wb.InterfaceC6736b;

/* renamed from: mb.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5572B implements InterfaceC6736b {

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC6735a f56420c = new InterfaceC6735a() { // from class: mb.z
        @Override // wb.InterfaceC6735a
        public final void a(InterfaceC6736b interfaceC6736b) {
            C5572B.b(interfaceC6736b);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC6736b f56421d = new InterfaceC6736b() { // from class: mb.A
        @Override // wb.InterfaceC6736b
        public final Object get() {
            return C5572B.a();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC6735a f56422a;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC6736b f56423b;

    public C5572B(InterfaceC6735a interfaceC6735a, InterfaceC6736b interfaceC6736b) {
        this.f56422a = interfaceC6735a;
        this.f56423b = interfaceC6736b;
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    public static /* synthetic */ void b(InterfaceC6736b interfaceC6736b) {
    }

    public static C5572B c() {
        return new C5572B(f56420c, f56421d);
    }

    public void d(InterfaceC6736b interfaceC6736b) {
        InterfaceC6735a interfaceC6735a;
        if (this.f56423b != f56421d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC6735a = this.f56422a;
            this.f56422a = null;
            this.f56423b = interfaceC6736b;
        }
        interfaceC6735a.a(interfaceC6736b);
    }

    @Override // wb.InterfaceC6736b
    public Object get() {
        return this.f56423b.get();
    }
}
