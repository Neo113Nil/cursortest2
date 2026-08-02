package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGDefsManagerInterface;

/* loaded from: classes2.dex */
public class RNSVGDefsManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGDefsManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGDefsManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    c10 = 1;
                    break;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    c10 = 2;
                    break;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    c10 = 3;
                    break;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    c10 = 4;
                    break;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c10 = 6;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    c10 = 7;
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.mViewManager.setOpacity(t10, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case 1:
                ((RNSVGDefsManagerInterface) this.mViewManager).setMatrix(t10, (ReadableArray) obj);
                break;
            case 2:
                ((RNSVGDefsManagerInterface) this.mViewManager).setMarkerEnd(t10, obj != null ? (String) obj : null);
                break;
            case 3:
                ((RNSVGDefsManagerInterface) this.mViewManager).setMarkerMid(t10, obj != null ? (String) obj : null);
                break;
            case 4:
                ((RNSVGDefsManagerInterface) this.mViewManager).setPointerEvents(t10, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RNSVGDefsManagerInterface) this.mViewManager).setMask(t10, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSVGDefsManagerInterface) this.mViewManager).setName(t10, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSVGDefsManagerInterface) this.mViewManager).setMarkerStart(t10, obj != null ? (String) obj : null);
                break;
            case '\b':
                ((RNSVGDefsManagerInterface) this.mViewManager).setClipPath(t10, obj != null ? (String) obj : null);
                break;
            case '\t':
                ((RNSVGDefsManagerInterface) this.mViewManager).setClipRule(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '\n':
                ((RNSVGDefsManagerInterface) this.mViewManager).setDisplay(t10, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSVGDefsManagerInterface) this.mViewManager).setResponsible(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
