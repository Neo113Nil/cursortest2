package ru.ozon.app.android.geo.map.presentation.iconsadapter.icon;

import Cy.b;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.geo.databinding.MapBannerBinding;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/ozon/app/android/geo/map/presentation/iconsadapter/icon/BannerIcon$bind$2$1", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "Landroid/graphics/drawable/Drawable;", "onLoadSuccessful", "", "resource", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BannerIcon$bind$2$1 implements PikazonLoaderCallback<Drawable> {
    final /* synthetic */ MapBannerBinding $binding;
    final /* synthetic */ AddressEditMapVO.MapIcon $icon;
    final /* synthetic */ BannerIcon this$0;

    BannerIcon$bind$2$1(AddressEditMapVO.MapIcon mapIcon, BannerIcon bannerIcon, MapBannerBinding mapBannerBinding) {
        this.$icon = mapIcon;
        this.this$0 = bannerIcon;
        this.$binding = mapBannerBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLoadSuccessful$lambda$0(BannerIcon bannerIcon, AddressEditMapVO.MapIcon mapIcon, View view) {
        Function1 function1;
        function1 = bannerIcon.onAction;
        function1.invoke(mapIcon);
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
    public void onLoadFailed(Exception exc) {
        PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
    }

    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
    public void onLoadSuccessful(Drawable resource) {
        Function1 function1;
        Long hintDelay = ((AddressEditMapVO.MapIcon.BannerIcon) this.$icon).getHintDelay();
        if (hintDelay != null && hintDelay.longValue() == 0) {
            this.this$0.updateState(this.$binding, AddressEditMapViewModel.BannerState.SHOW_HINT, (AddressEditMapVO.MapIcon.BannerIcon) this.$icon, false);
        } else {
            Long hintDelay2 = ((AddressEditMapVO.MapIcon.BannerIcon) this.$icon).getHintDelay();
            if (hintDelay2 != null) {
                function1 = this.this$0.onBannerLoaded;
                function1.invoke(hintDelay2);
            }
        }
        this.$binding.bannerIv.setOnClickListener(new b(0, this.this$0, this.$icon));
    }
}
