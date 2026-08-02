package d70;

import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.internal.ipc.VkSilentAuthInfoProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.ui.dots.BaseDotsIndicator;
import ru.ozon.fintech.ui.dots.attacher.DotsIndicatorAttacher;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f61222b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f61221a = i11;
        this.f61222b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        VkSilentAuthInfoProvider vkSilentAuthInfoProvider$lambda$11;
        Unit unit;
        switch (this.f61221a) {
            case 0:
                return k.o((k) this.f61222b);
            case 1:
                return g30.d.e2((g30.d) this.f61222b);
            case 2:
                vkSilentAuthInfoProvider$lambda$11 = VKIDDepsProd.vkSilentAuthInfoProvider$lambda$11((VKIDDepsProd) this.f61222b);
                return vkSilentAuthInfoProvider$lambda$11;
            case 3:
                unit = DotsIndicatorAttacher.setup$lambda$1((BaseDotsIndicator) this.f61222b);
                return unit;
            default:
                return x30.f.c((x30.f) this.f61222b);
        }
    }
}
