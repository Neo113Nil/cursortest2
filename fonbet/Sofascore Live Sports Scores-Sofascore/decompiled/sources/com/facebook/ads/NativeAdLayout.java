package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.AdComponentFrameLayout;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes2.dex */
public class NativeAdLayout extends AdComponentFrameLayout {
    private NativeAdLayoutApi mNativeAdLayoutApi;

    public NativeAdLayout(Context context, NativeAdLayoutApi nativeAdLayoutApi) {
        super(context);
        this.mNativeAdLayoutApi = nativeAdLayoutApi;
        attachAdComponentViewApi(nativeAdLayoutApi);
        this.mNativeAdLayoutApi.initialize(this);
    }

    private void initializeSelf(Context context) {
        NativeAdLayoutApi createNativeAdLayoutApi = DynamicLoaderFactory.makeLoader(context).createNativeAdLayoutApi();
        this.mNativeAdLayoutApi = createNativeAdLayoutApi;
        attachAdComponentViewApi(createNativeAdLayoutApi);
        this.mNativeAdLayoutApi.initialize(this);
    }

    public NativeAdLayoutApi getNativeAdLayoutApi() {
        return this.mNativeAdLayoutApi;
    }

    public void setMaxWidth(int i) {
        this.mNativeAdLayoutApi.setMaxWidth(i);
    }

    public void setMinWidth(int i) {
        this.mNativeAdLayoutApi.setMinWidth(i);
    }

    public NativeAdLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initializeSelf(context);
    }

    public NativeAdLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initializeSelf(context);
    }

    public NativeAdLayout(Context context) {
        super(context);
        initializeSelf(context);
    }
}
