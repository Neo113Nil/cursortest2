package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNGoogleSigninButtonManagerInterface;

/* loaded from: classes2.dex */
public class RNGoogleSigninButtonManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNGoogleSigninButtonManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNGoogleSigninButtonManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "size":
                ((RNGoogleSigninButtonManagerInterface) this.mViewManager).setSize(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "color":
                ((RNGoogleSigninButtonManagerInterface) this.mViewManager).setColor(t10, (String) obj);
                break;
            case "disabled":
                ((RNGoogleSigninButtonManagerInterface) this.mViewManager).setDisabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
