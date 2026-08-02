package t60;

import android.app.Activity;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.onetap.compose.onetap.OneTapKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99225a;

    public /* synthetic */ g(int i11) {
        this.f99225a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit OneTap$lambda$28$lambda$27;
        switch (this.f99225a) {
            case 0:
                r90.f handleRequestPermission = (r90.f) obj;
                Activity activity = (Activity) obj2;
                Intrinsics.checkNotNullParameter(handleRequestPermission, "$this$handleRequestPermission");
                Intrinsics.checkNotNullParameter(activity, "activity");
                handleRequestPermission.f(activity);
                return Unit.f71690a;
            case 1:
                I30.a act = (I30.a) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(act, "act");
                if (booleanValue) {
                    act.a(true);
                } else {
                    act.s(true);
                }
                return Unit.f71690a;
            default:
                OneTap$lambda$28$lambda$27 = OneTapKt.OneTap$lambda$28$lambda$27((AuthCodeData) obj, ((Boolean) obj2).booleanValue());
                return OneTap$lambda$28$lambda$27;
        }
    }
}
