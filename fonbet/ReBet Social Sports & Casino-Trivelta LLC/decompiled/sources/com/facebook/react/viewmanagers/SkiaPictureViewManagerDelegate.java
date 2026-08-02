package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.SkiaPictureViewManagerInterface;

/* loaded from: classes2.dex */
public class SkiaPictureViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & SkiaPictureViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public SkiaPictureViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "opaque":
                ((SkiaPictureViewManagerInterface) this.mViewManager).setOpaque(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "androidWarmup":
                ((SkiaPictureViewManagerInterface) this.mViewManager).setAndroidWarmup(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "pointerEvents":
                ((SkiaPictureViewManagerInterface) this.mViewManager).setPointerEvents(t10, (String) obj);
                break;
            case "debug":
                ((SkiaPictureViewManagerInterface) this.mViewManager).setDebug(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "colorSpace":
                ((SkiaPictureViewManagerInterface) this.mViewManager).setColorSpace(t10, obj == null ? null : (String) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
