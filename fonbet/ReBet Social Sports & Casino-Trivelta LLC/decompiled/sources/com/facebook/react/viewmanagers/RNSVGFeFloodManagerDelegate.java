package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface;

/* loaded from: classes2.dex */
public class RNSVGFeFloodManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGFeFloodManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGFeFloodManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "floodColor":
                ((RNSVGFeFloodManagerInterface) this.mViewManager).setFloodColor(t10, new DynamicFromObject(obj));
                break;
            case "height":
                ((RNSVGFeFloodManagerInterface) this.mViewManager).setHeight(t10, new DynamicFromObject(obj));
                break;
            case "floodOpacity":
                ((RNSVGFeFloodManagerInterface) this.mViewManager).setFloodOpacity(t10, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case "result":
                ((RNSVGFeFloodManagerInterface) this.mViewManager).setResult(t10, obj == null ? null : (String) obj);
                break;
            case "x":
                ((RNSVGFeFloodManagerInterface) this.mViewManager).setX(t10, new DynamicFromObject(obj));
                break;
            case "y":
                ((RNSVGFeFloodManagerInterface) this.mViewManager).setY(t10, new DynamicFromObject(obj));
                break;
            case "width":
                ((RNSVGFeFloodManagerInterface) this.mViewManager).setWidth(t10, new DynamicFromObject(obj));
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
