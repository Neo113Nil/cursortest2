package d70;

import android.view.View;
import b70.C5578f;
import com.vk.id.internal.auth.app.TrustedProvidersCache;
import com.vk.id.internal.di.VKIDDepsProd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.offline.presentation.pay.OfflinePayFragment;
import ru.ozon.fintech.ui.input.InputView;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f61220b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f61219a = i11;
        this.f61220b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TrustedProvidersCache trustedProvidersCache$lambda$10;
        switch (this.f61219a) {
            case 0:
                return k.l((k) this.f61220b);
            case 1:
                OfflinePayFragment offlinePayFragment = (OfflinePayFragment) this.f61220b;
                C5578f c5578f = offlinePayFragment.f95673b;
                InputView inputView = c5578f != null ? c5578f.f55625l : null;
                C5578f c5578f2 = offlinePayFragment.f95673b;
                View view = c5578f2 != null ? c5578f2.f55620g : null;
                C5578f c5578f3 = offlinePayFragment.f95673b;
                E30.g.b(new i70.e(), inputView, view, c5578f3 != null ? c5578f3.f55633t : null);
                return Unit.f71690a;
            case 2:
                return Boolean.valueOf(l40.d.c((l40.d) this.f61220b));
            default:
                trustedProvidersCache$lambda$10 = VKIDDepsProd.trustedProvidersCache$lambda$10((VKIDDepsProd) this.f61220b);
                return trustedProvidersCache$lambda$10;
        }
    }
}
