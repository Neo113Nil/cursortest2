package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.BrazeBannerViewManagerInterface;

/* loaded from: classes2.dex */
public class BrazeBannerViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & BrazeBannerViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public BrazeBannerViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        if (str.equals("placementID")) {
            ((BrazeBannerViewManagerInterface) this.mViewManager).setPlacementID(t10, obj == null ? null : (String) obj);
        } else {
            super.kotlinCompat$setProperty(t10, str, obj);
        }
    }
}
