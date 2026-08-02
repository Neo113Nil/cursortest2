package v50;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f102336b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f102335a = i11;
        this.f102336b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f102335a) {
            case 0:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((j) this.f102336b).getClass();
                return Unit.f71690a;
            default:
                return z90.e.t0((z90.e) this.f102336b);
        }
    }
}
