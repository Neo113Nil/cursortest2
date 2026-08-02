package gf;

import bf.AbstractC5657a;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import sf.C9681g;

/* loaded from: classes10.dex */
public final class k extends AbstractC5657a {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f f64397e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f64398f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9681g f64399g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f64400h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, f fVar, int i11, C9681g c9681g, int i12, boolean z11) {
        super(str, true);
        this.f64397e = fVar;
        this.f64398f = i11;
        this.f64399g = c9681g;
        this.f64400h = i12;
    }

    @Override // bf.AbstractC5657a
    public final long f() {
        try {
            r rVar = this.f64397e.f64342l;
            C9681g source = this.f64399g;
            int i11 = this.f64400h;
            ((q) rVar).getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            source.skip(i11);
            this.f64397e.s0().r(this.f64398f, EnumC6726b.CANCEL);
            synchronized (this.f64397e) {
                this.f64397e.f64330B.remove(Integer.valueOf(this.f64398f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
