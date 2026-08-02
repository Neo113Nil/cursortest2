package D6;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final n f2569a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final n f2570b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final n f2571c = new d();

    public class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f2572a;

        public a(Object obj) {
            this.f2572a = obj;
        }

        @Override // D6.n
        public Object get() {
            return this.f2572a;
        }
    }

    public class b implements n {
        @Override // D6.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    public class c implements n {
        @Override // D6.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    public class d implements n {
        @Override // D6.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return "";
        }
    }

    public static n a(Object obj) {
        return new a(obj);
    }
}
