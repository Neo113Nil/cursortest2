package j$.util.stream;

/* loaded from: classes2.dex */
public final class m8 extends j5 implements u8 {

    /* renamed from: b, reason: collision with root package name */
    public long f17995b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f17997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l8 f17998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(l8 l8Var, n5 n5Var, boolean z5) {
        super(n5Var);
        this.f17998e = l8Var;
        this.f17997d = z5;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z5;
        boolean z7;
        if (!this.f17996c) {
            boolean test = this.f17998e.f17981t.test(obj);
            this.f17996c = !test;
            if (test) {
                z5 = false;
                z7 = this.f17997d;
                if (z7 && !z5) {
                    this.f17995b++;
                }
                if (!z7 || z5) {
                    this.f17941a.accept((n5) obj);
                }
                return;
            }
        }
        z5 = true;
        z7 = this.f17997d;
        if (z7) {
            this.f17995b++;
        }
        if (z7) {
        }
        this.f17941a.accept((n5) obj);
    }

    @Override // j$.util.stream.u8
    public final long h() {
        return this.f17995b;
    }
}
