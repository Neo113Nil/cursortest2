package ma;

import Sc.r;
import We.L;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.onetap.compose.onetap.OneTapAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: ma.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C8121b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74701a;

    public /* synthetic */ C8121b(int i11) {
        this.f74701a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r logout$lambda$3;
        Unit OneTapShown$lambda$12$lambda$11$lambda$9$lambda$7;
        switch (this.f74701a) {
            case 0:
                logout$lambda$3 = VKIDApiService.logout$lambda$3((L) obj);
                return logout$lambda$3;
            default:
                OneTapShown$lambda$12$lambda$11$lambda$9$lambda$7 = OneTapAnalytics.OneTapShown$lambda$12$lambda$11$lambda$9$lambda$7((Throwable) obj);
                return OneTapShown$lambda$12$lambda$11$lambda$9$lambda$7;
        }
    }
}
