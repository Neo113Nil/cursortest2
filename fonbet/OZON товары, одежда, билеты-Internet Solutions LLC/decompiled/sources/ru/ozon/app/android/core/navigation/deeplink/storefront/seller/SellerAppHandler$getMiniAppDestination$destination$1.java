package ru.ozon.app.android.core.navigation.deeplink.storefront.seller;

import CZ.g;
import EZ.e;
import GZ.j;
import android.net.Uri;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.miniapp.R$style;
import ru.ozon.app.android.seller.presentation.SellerMiniAppFragment;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/fragment/app/m;", "invoke", "()Landroidx/fragment/app/m;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class SellerAppHandler$getMiniAppDestination$destination$1 extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
    final /* synthetic */ String $currentMiniApp;
    final /* synthetic */ String $miniAppName;
    final /* synthetic */ e<g> $response;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerAppHandler$getMiniAppDestination$destination$1(e<g> eVar, String str, String str2) {
        super(0);
        this.$response = eVar;
        this.$miniAppName = str;
        this.$currentMiniApp = str2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ComponentCallbacksC5392m invoke() {
        Uri d11;
        SellerMiniAppFragment.Companion companion = SellerMiniAppFragment.INSTANCE;
        j c11 = this.$response.c();
        return companion.newInstance((c11 == null || (d11 = c11.d()) == null) ? null : d11.toString(), this.$miniAppName, this.$currentMiniApp, R$style.SellerTheme);
    }
}
