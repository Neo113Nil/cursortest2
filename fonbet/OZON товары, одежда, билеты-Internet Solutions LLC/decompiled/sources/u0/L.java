package u0;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class L extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M f99612b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f99613c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(M m11, View view) {
        super(1);
        this.f99612b = m11;
        this.f99613c = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        M m11 = this.f99612b;
        View view = this.f99613c;
        m11.j(view);
        return new K(m11, view);
    }
}
