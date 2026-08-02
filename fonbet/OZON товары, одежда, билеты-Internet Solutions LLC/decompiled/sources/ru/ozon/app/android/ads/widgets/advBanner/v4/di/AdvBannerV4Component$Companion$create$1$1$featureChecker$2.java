package ru.ozon.app.android.ads.widgets.advBanner.v4.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvBannerV4Component$Companion$create$1$1$featureChecker$2 extends AbstractC7737t implements Function0<FeatureChecker> {
    final /* synthetic */ C7475g $storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvBannerV4Component$Companion$create$1$1$featureChecker$2(C7475g c7475g) {
        super(0);
        this.$storage = c7475g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeatureChecker invoke() {
        return ((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getFeatureChecker();
    }
}
