package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSScreenStackManagerInterface;

/* loaded from: classes2.dex */
public class RNSScreenStackManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSScreenStackManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSScreenStackManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "iosPreventReattachmentOfDismissedModals":
                ((RNSScreenStackManagerInterface) this.mViewManager).setIosPreventReattachmentOfDismissedModals(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "nativeContainerBackgroundColor":
                ((RNSScreenStackManagerInterface) this.mViewManager).setNativeContainerBackgroundColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case "iosPreventReattachmentOfDismissedScreens":
                ((RNSScreenStackManagerInterface) this.mViewManager).setIosPreventReattachmentOfDismissedScreens(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
