package n3;

import e3.x;
import f3.j0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final f3.f f20840a;

    /* renamed from: b, reason: collision with root package name */
    public final f3.k f20841b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20842c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20843d;

    public m(f3.f processor, f3.k token, boolean z5, int i5) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f20840a = processor;
        this.f20841b = token;
        this.f20842c = z5;
        this.f20843d = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean h10;
        j0 b10;
        if (this.f20842c) {
            f3.f fVar = this.f20840a;
            f3.k kVar = this.f20841b;
            int i5 = this.f20843d;
            fVar.getClass();
            String str = kVar.f9389a.f20321a;
            synchronized (fVar.f9362k) {
                b10 = fVar.b(str);
            }
            h10 = f3.f.e(str, b10, i5);
        } else {
            h10 = this.f20840a.h(this.f20841b, this.f20843d);
        }
        x.e().a(x.g("StopWorkRunnable"), "StopWorkRunnable for " + this.f20841b.f9389a.f20321a + "; Processor.stopWork = " + h10);
    }
}
