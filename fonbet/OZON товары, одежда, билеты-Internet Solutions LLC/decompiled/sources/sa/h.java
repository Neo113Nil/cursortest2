package sa;

import android.app.Activity;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.multibranding.OAuthListWidgetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final /* synthetic */ class h implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98446a;

    public /* synthetic */ h(int i11) {
        this.f98446a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit OAuthListWidget$lambda$22$lambda$21;
        switch (this.f98446a) {
            case 0:
                OAuthListWidget$lambda$22$lambda$21 = OAuthListWidgetKt.OAuthListWidget$lambda$22$lambda$21((AuthCodeData) obj, ((Boolean) obj2).booleanValue());
                return OAuthListWidget$lambda$22$lambda$21;
            default:
                r90.f handleRequestPermission = (r90.f) obj;
                Activity activity = (Activity) obj2;
                Intrinsics.checkNotNullParameter(handleRequestPermission, "$this$handleRequestPermission");
                Intrinsics.checkNotNullParameter(activity, "activity");
                handleRequestPermission.b(activity);
                return Unit.f71690a;
        }
    }
}
