package e;

import S0.M;
import S0.N;
import androidx.activity.J;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: e.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6240o extends AbstractC7737t implements Function1<N, M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J f61717b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.J f61718c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C6242q f61719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6240o(J j11, androidx.lifecycle.J j12, C6242q c6242q) {
        super(1);
        this.f61717b = j11;
        this.f61718c = j12;
        this.f61719d = c6242q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N n11) {
        J j11 = this.f61717b;
        androidx.lifecycle.J j12 = this.f61718c;
        C6242q c6242q = this.f61719d;
        j11.h(j12, c6242q);
        return new C6239n(c6242q);
    }
}
