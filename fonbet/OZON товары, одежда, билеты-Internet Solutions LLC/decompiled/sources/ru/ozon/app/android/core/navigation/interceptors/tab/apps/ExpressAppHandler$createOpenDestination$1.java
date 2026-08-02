package ru.ozon.app.android.core.navigation.interceptors.tab.apps;

import android.net.Uri;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.common.flags.FreshMainTabbarVisibleFlag;
import ru.ozon.app.android.fresh.navigation.FreshTabMiniAppFragment;
import ru.ozon.app.android.fresh.navigation.singleTab.FreshSingleMiniAppFragment;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/fragment/app/m;", "invoke", "()Landroidx/fragment/app/m;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ExpressAppHandler$createOpenDestination$1 extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
    final /* synthetic */ Uri $deeplink;
    final /* synthetic */ String $miniAppName;
    final /* synthetic */ String $referrerMiniAppName;
    final /* synthetic */ ExpressAppHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressAppHandler$createOpenDestination$1(ExpressAppHandler expressAppHandler, String str, String str2, Uri uri) {
        super(0);
        this.this$0 = expressAppHandler;
        this.$miniAppName = str;
        this.$referrerMiniAppName = str2;
        this.$deeplink = uri;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ComponentCallbacksC5392m invoke() {
        FeatureChecker featureChecker;
        featureChecker = this.this$0.featureChecker;
        if (!featureChecker.isEnabled(FreshMainTabbarVisibleFlag.INSTANCE)) {
            FreshSingleMiniAppFragment.Companion companion = FreshSingleMiniAppFragment.INSTANCE;
            Uri uri = this.$deeplink;
            return companion.newInstance(uri != null ? uri.toString() : null);
        }
        FreshTabMiniAppFragment.Companion companion2 = FreshTabMiniAppFragment.INSTANCE;
        String str = this.$miniAppName;
        String str2 = this.$referrerMiniAppName;
        Uri uri2 = this.$deeplink;
        return companion2.newInstance(str, str2, uri2 != null ? uri2.toString() : null);
    }
}
