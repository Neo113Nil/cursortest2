package M6;

import D6.n;

/* loaded from: classes2.dex */
public abstract class d {

    public class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f7524a;

        public a(Throwable th2) {
            this.f7524a = th2;
        }

        @Override // D6.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c get() {
            return d.b(this.f7524a);
        }
    }

    public static n a(Throwable th2) {
        return new a(th2);
    }

    public static c b(Throwable th2) {
        k w10 = k.w();
        w10.o(th2);
        return w10;
    }
}
