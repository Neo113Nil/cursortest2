package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface;

/* loaded from: classes2.dex */
public class AndroidBlurViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & AndroidBlurViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AndroidBlurViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "blurAmount":
                ((AndroidBlurViewManagerInterface) this.mViewManager).setBlurAmount(t10, obj == null ? 10 : ((Double) obj).intValue());
                break;
            case "enabled":
                ((AndroidBlurViewManagerInterface) this.mViewManager).setEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "blurRadius":
                ((AndroidBlurViewManagerInterface) this.mViewManager).setBlurRadius(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "blurType":
                ((AndroidBlurViewManagerInterface) this.mViewManager).setBlurType(t10, (String) obj);
                break;
            case "autoUpdate":
                ((AndroidBlurViewManagerInterface) this.mViewManager).setAutoUpdate(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "overlayColor":
                ((AndroidBlurViewManagerInterface) this.mViewManager).setOverlayColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case "downsampleFactor":
                ((AndroidBlurViewManagerInterface) this.mViewManager).setDownsampleFactor(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
