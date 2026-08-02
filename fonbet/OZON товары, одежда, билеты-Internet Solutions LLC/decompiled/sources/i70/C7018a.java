package i70;

import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiService;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.camera.domain.scanner.qr.BarCodeAnalyzer;
import ru.ozon.fintech.features.camera.presentation.camera.CameraViewModel;
import ru.ozon.fintech.features.offline.presentation.pay.OfflinePayFragment;

/* renamed from: i70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7018a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f65962b;

    public /* synthetic */ C7018a(Object obj, int i11) {
        this.f65961a = i11;
        this.f65962b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InternalVKIDGroupSubscriptionApiService groupSubscriptionApiService$lambda$31;
        BarCodeAnalyzer barCodeAnalyzer_delegate$lambda$1;
        switch (this.f65961a) {
            case 0:
                return ((OfflinePayFragment) this.f65962b).getFactory();
            case 1:
                groupSubscriptionApiService$lambda$31 = VKIDDepsProd.groupSubscriptionApiService$lambda$31((VKIDDepsProd) this.f65962b);
                return groupSubscriptionApiService$lambda$31;
            case 2:
                barCodeAnalyzer_delegate$lambda$1 = CameraViewModel.barCodeAnalyzer_delegate$lambda$1((CameraViewModel) this.f65962b);
                return barCodeAnalyzer_delegate$lambda$1;
            default:
                return z90.e.e0((z90.e) this.f65962b);
        }
    }
}
