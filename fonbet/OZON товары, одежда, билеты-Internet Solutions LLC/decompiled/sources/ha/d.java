package ha;

import Sc.r;
import We.L;
import android.view.View;
import com.vk.id.group.subscription.compose.progress.CircleProgressKt;
import com.vk.id.internal.api.VKIDApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.InterfaceC7825i0;
import m0.O;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.camera.presentation.camera.CameraViewModel;
import ru.ozon.fintech.features.offline.presentation.pay.OfflinePayFragment;

/* loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f65265b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f65264a = i11;
        this.f65265b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit CircleProgress$lambda$5$lambda$4;
        r silentAuthProviders$lambda$1;
        Unit onStart$lambda$17;
        switch (this.f65264a) {
            case 0:
                CircleProgress$lambda$5$lambda$4 = CircleProgressKt.CircleProgress$lambda$5$lambda$4((O.a) this.f65265b, (InterfaceC7825i0) obj);
                return CircleProgress$lambda$5$lambda$4;
            case 1:
                return OfflinePayFragment.t((OfflinePayFragment) this.f65265b, (View) obj);
            case 2:
                silentAuthProviders$lambda$1 = VKIDApiService.getSilentAuthProviders$lambda$1((VKIDApiService) this.f65265b, (L) obj);
                return silentAuthProviders$lambda$1;
            case 3:
                onStart$lambda$17 = CameraViewModel.onStart$lambda$17((CameraViewModel) this.f65265b, (ActionResult2) obj);
                return onStart$lambda$17;
            default:
                return z90.e.d0((z90.e) this.f65265b);
        }
    }
}
