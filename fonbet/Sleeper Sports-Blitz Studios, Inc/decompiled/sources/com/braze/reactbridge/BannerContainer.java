package com.braze.reactbridge;

import android.content.Context;
import android.widget.FrameLayout;
import com.braze.ui.banners.BannerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BannerContainer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/braze/reactbridge/BannerContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "bannerView", "Lcom/braze/ui/banners/BannerView;", "getBannerView", "()Lcom/braze/ui/banners/BannerView;", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BannerContainer extends FrameLayout {
    private final BannerView bannerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerContainer(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        BannerView bannerView = new BannerView(context);
        bannerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.bannerView = bannerView;
        addView(bannerView);
    }

    public final BannerView getBannerView() {
        return this.bannerView;
    }
}
