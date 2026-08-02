package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.VirtualViewManagerInterface;

/* loaded from: classes2.dex */
public class VirtualViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & VirtualViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public VirtualViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "renderState":
                ((VirtualViewManagerInterface) this.mViewManager).setRenderState(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "initialHidden":
                ((VirtualViewManagerInterface) this.mViewManager).setInitialHidden(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "removeClippedSubviews":
                ((VirtualViewManagerInterface) this.mViewManager).setRemoveClippedSubviews(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
