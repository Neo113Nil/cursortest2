package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSFullWindowOverlayManagerInterface;

/* loaded from: classes2.dex */
public class RNSFullWindowOverlayManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSFullWindowOverlayManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSFullWindowOverlayManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        if (str.equals("accessibilityContainerViewIsModal")) {
            ((RNSFullWindowOverlayManagerInterface) this.mViewManager).setAccessibilityContainerViewIsModal(t10, obj == null ? true : ((Boolean) obj).booleanValue());
        } else {
            super.kotlinCompat$setProperty(t10, str, obj);
        }
    }
}
