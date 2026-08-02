package y4;

import B1.m0;
import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f105992b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f105991a = i11;
        this.f105992b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f105991a) {
            case 0:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return (View) ((Function1) this.f105992b).invoke(it);
            default:
                m0.a layout = (m0.a) obj;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                layout.d((m0) this.f105992b, 0, 0, 0.0f);
                return Unit.f71690a;
        }
    }
}
