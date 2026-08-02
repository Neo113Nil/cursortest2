package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RTNGiphyGridViewManagerInterface;

/* loaded from: classes2.dex */
public class RTNGiphyGridViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RTNGiphyGridViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RTNGiphyGridViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2005837745:
                if (str.equals("cellPadding")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1439500848:
                if (str.equals("orientation")) {
                    c10 = 1;
                    break;
                }
                break;
            case -669554715:
                if (str.equals("spanCount")) {
                    c10 = 2;
                    break;
                }
                break;
            case -412007010:
                if (str.equals("disableEmojiVariations")) {
                    c10 = 3;
                    break;
                }
                break;
            case -24357170:
                if (str.equals("renditionType")) {
                    c10 = 4;
                    break;
                }
                break;
            case 110327241:
                if (str.equals("theme")) {
                    c10 = 5;
                    break;
                }
                break;
            case 366392613:
                if (str.equals("showCheckeredBackground")) {
                    c10 = 6;
                    break;
                }
                break;
            case 734594748:
                if (str.equals("fixedSizeCells")) {
                    c10 = 7;
                    break;
                }
                break;
            case 951530617:
                if (str.equals("content")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 970724265:
                if (str.equals("clipsPreviewRenditionType")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((RTNGiphyGridViewManagerInterface) this.mViewManager).setCellPadding(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 1:
                ((RTNGiphyGridViewManagerInterface) this.mViewManager).setOrientation(t10, obj != null ? (String) obj : null);
                break;
            case 2:
                ((RTNGiphyGridViewManagerInterface) this.mViewManager).setSpanCount(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 3:
                ((RTNGiphyGridViewManagerInterface) this.mViewManager).setDisableEmojiVariations(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 4:
                ((RTNGiphyGridViewManagerInterface) this.mViewManager).setRenditionType(t10, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RTNGiphyGridViewManagerInterface) this.mViewManager).setTheme(t10, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RTNGiphyGridViewManagerInterface) this.mViewManager).setShowCheckeredBackground(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 7:
                ((RTNGiphyGridViewManagerInterface) this.mViewManager).setFixedSizeCells(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\b':
                ((RTNGiphyGridViewManagerInterface) this.mViewManager).setContent(t10, obj != null ? (String) obj : null);
                break;
            case '\t':
                ((RTNGiphyGridViewManagerInterface) this.mViewManager).setClipsPreviewRenditionType(t10, obj != null ? (String) obj : null);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
