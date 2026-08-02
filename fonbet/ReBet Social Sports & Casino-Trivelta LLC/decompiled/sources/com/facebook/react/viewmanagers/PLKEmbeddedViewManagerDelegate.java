package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.PLKEmbeddedViewManagerInterface;

/* loaded from: classes2.dex */
public class PLKEmbeddedViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & PLKEmbeddedViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public PLKEmbeddedViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        if (str.equals("iOSPresentationStyle")) {
            ((PLKEmbeddedViewManagerInterface) this.mViewManager).setIOSPresentationStyle(t10, obj != null ? (String) obj : null);
        } else if (str.equals("token")) {
            ((PLKEmbeddedViewManagerInterface) this.mViewManager).setToken(t10, obj != null ? (String) obj : null);
        } else {
            super.kotlinCompat$setProperty(t10, str, obj);
        }
    }
}
