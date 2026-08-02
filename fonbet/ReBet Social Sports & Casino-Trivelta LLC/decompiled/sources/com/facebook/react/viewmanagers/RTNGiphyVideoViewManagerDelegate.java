package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RTNGiphyVideoViewManagerInterface;

/* loaded from: classes2.dex */
public class RTNGiphyVideoViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RTNGiphyVideoViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RTNGiphyVideoViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "muted":
                ((RTNGiphyVideoViewManagerInterface) this.mViewManager).setMuted(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "mediaId":
                ((RTNGiphyVideoViewManagerInterface) this.mViewManager).setMediaId(t10, obj == null ? null : (String) obj);
                break;
            case "autoPlay":
                ((RTNGiphyVideoViewManagerInterface) this.mViewManager).setAutoPlay(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
