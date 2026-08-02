package io.intercom.android.sdk.blocks;

import android.text.TextUtils;
import android.view.View;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CarouselImageClickListener.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/blocks/CarouselImageClickListener;", "Lio/intercom/android/sdk/blocks/ImageClickListener;", MetricTracker.Place.API, "Lio/intercom/android/sdk/api/Api;", "<init>", "(Lio/intercom/android/sdk/api/Api;)V", "onImageClicked", "", "imageUrl", "", "linkUrl", "imageView", "Landroid/view/View;", "width", "", "height", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CarouselImageClickListener implements ImageClickListener {
    public static final int $stable = 8;
    private final Api api;

    public CarouselImageClickListener(Api api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    @Override // io.intercom.android.sdk.blocks.ImageClickListener
    public void onImageClicked(String imageUrl, String linkUrl, View imageView, int width, int height) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        if (TextUtils.isEmpty(linkUrl)) {
            return;
        }
        LinkOpener.handleUrl(linkUrl, imageView.getContext(), this.api);
    }
}
