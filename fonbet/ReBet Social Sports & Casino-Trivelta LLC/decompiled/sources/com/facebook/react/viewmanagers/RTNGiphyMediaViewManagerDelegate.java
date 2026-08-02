package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RTNGiphyMediaViewManagerInterface;

/* loaded from: classes2.dex */
public class RTNGiphyMediaViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RTNGiphyMediaViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RTNGiphyMediaViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t10, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("resume")) {
            ((RTNGiphyMediaViewManagerInterface) this.mViewManager).resume(t10);
        } else if (str.equals("pause")) {
            ((RTNGiphyMediaViewManagerInterface) this.mViewManager).pause(t10);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -24357170:
                if (str.equals("renditionType")) {
                    c10 = 0;
                    break;
                }
                break;
            case 366392613:
                if (str.equals("showCheckeredBackground")) {
                    c10 = 1;
                    break;
                }
                break;
            case 940773407:
                if (str.equals("mediaId")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1438608771:
                if (str.equals("autoPlay")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2049757303:
                if (str.equals(ViewProps.RESIZE_MODE)) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((RTNGiphyMediaViewManagerInterface) this.mViewManager).setRenditionType(t10, obj != null ? (String) obj : null);
                break;
            case 1:
                ((RTNGiphyMediaViewManagerInterface) this.mViewManager).setShowCheckeredBackground(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 2:
                ((RTNGiphyMediaViewManagerInterface) this.mViewManager).setMediaId(t10, obj != null ? (String) obj : null);
                break;
            case 3:
                ((RTNGiphyMediaViewManagerInterface) this.mViewManager).setAutoPlay(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 4:
                ((RTNGiphyMediaViewManagerInterface) this.mViewManager).setResizeMode(t10, obj != null ? (String) obj : null);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
