package A7;

import w6.InterfaceC6713d;

/* loaded from: classes2.dex */
public abstract class v {

    public class a implements z {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f253a;

        public a(t tVar) {
            this.f253a = tVar;
        }

        @Override // A7.z
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC6713d interfaceC6713d) {
            this.f253a.l(interfaceC6713d);
        }

        @Override // A7.z
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC6713d interfaceC6713d) {
            this.f253a.m(interfaceC6713d);
        }

        @Override // A7.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(InterfaceC6713d interfaceC6713d) {
            this.f253a.a(interfaceC6713d);
        }
    }

    public static u a(x xVar, t tVar) {
        tVar.n(xVar);
        return new u(xVar, new a(tVar));
    }
}
