package l0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C8011q0;
import m0.D0;

/* loaded from: classes8.dex */
final class U extends AbstractC7737t implements Function1<D0.b<O>, m0.H<Float>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.q f72047b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.s f72048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    U(androidx.compose.animation.q qVar, androidx.compose.animation.s sVar) {
        super(1);
        this.f72047b = qVar;
        this.f72048c = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final m0.H<Float> invoke(D0.b<O> bVar) {
        C8011q0 c8011q0;
        C8011q0 c8011q02;
        m0.H<Float> a11;
        C8011q0 c8011q03;
        m0.H<Float> a12;
        D0.b<O> bVar2 = bVar;
        O o11 = O.PreEnter;
        O o12 = O.Visible;
        if (bVar2.a(o11, o12)) {
            g0 e11 = this.f72047b.b().e();
            if (e11 != null && (a12 = e11.a()) != null) {
                return a12;
            }
            c8011q03 = androidx.compose.animation.b.f38765b;
            return c8011q03;
        }
        if (!bVar2.a(o12, O.PostExit)) {
            c8011q0 = androidx.compose.animation.b.f38765b;
            return c8011q0;
        }
        g0 e12 = this.f72048c.b().e();
        if (e12 != null && (a11 = e12.a()) != null) {
            return a11;
        }
        c8011q02 = androidx.compose.animation.b.f38765b;
        return c8011q02;
    }
}
