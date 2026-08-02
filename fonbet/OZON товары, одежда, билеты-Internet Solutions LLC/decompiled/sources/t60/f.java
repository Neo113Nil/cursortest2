package t60;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        r90.f handleRequestPermission = (r90.f) obj;
        Activity activity = (Activity) obj2;
        Intrinsics.checkNotNullParameter(handleRequestPermission, "$this$handleRequestPermission");
        Intrinsics.checkNotNullParameter(activity, "activity");
        handleRequestPermission.d(activity, true);
        return Unit.f71690a;
    }
}
