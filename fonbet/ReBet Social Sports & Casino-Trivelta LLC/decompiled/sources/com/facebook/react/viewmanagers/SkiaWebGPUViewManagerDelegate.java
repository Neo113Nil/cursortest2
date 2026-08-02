package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.SkiaWebGPUViewManagerInterface;

/* loaded from: classes2.dex */
public class SkiaWebGPUViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & SkiaWebGPUViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public SkiaWebGPUViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        if (str.equals("transparent")) {
            ((SkiaWebGPUViewManagerInterface) this.mViewManager).setTransparent(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
        } else if (str.equals("contextId")) {
            ((SkiaWebGPUViewManagerInterface) this.mViewManager).setContextId(t10, obj != null ? ((Double) obj).intValue() : 0);
        } else {
            super.kotlinCompat$setProperty(t10, str, obj);
        }
    }
}
