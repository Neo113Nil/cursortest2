package nm0;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import rl0.P;
import rl0.Y;
import rl0.h0;

/* loaded from: classes4.dex */
public final class y extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f77431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, int i11) {
        super(1);
        this.f77430b = i11;
        this.f77431c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f77430b) {
            case 0:
                wl0.c error = (wl0.c) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                ((lm0.e) this.f77431c).a(error);
                return Unit.f71690a;
            default:
                lm0.e emitter = (lm0.e) obj;
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                Context context = ((Y) this.f77431c).f83656a;
                String packageName = context.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                return new P(context, packageName, new h0(emitter), new w(emitter, 1));
        }
    }
}
