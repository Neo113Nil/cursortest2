package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSTabsScreenAndroidManagerInterface;

/* loaded from: classes2.dex */
public class RNSTabsScreenAndroidManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSTabsScreenAndroidManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSTabsScreenAndroidManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1770963447:
                if (str.equals("specialEffects")) {
                    c10 = 0;
                    break;
                }
                break;
            case -558395241:
                if (str.equals("tabBarItemAccessibilityLabel")) {
                    c10 = 1;
                    break;
                }
                break;
            case -113697461:
                if (str.equals("selectedDrawableIconResourceName")) {
                    c10 = 2;
                    break;
                }
                break;
            case -10721392:
                if (str.equals("drawableIconResourceName")) {
                    c10 = 3;
                    break;
                }
                break;
            case 28389121:
                if (str.equals("standardAppearance")) {
                    c10 = 4;
                    break;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    c10 = 5;
                    break;
                }
                break;
            case 125075027:
                if (str.equals("screenKey")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1072026510:
                if (str.equals("badgeValue")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1465115197:
                if (str.equals("preventNativeSelection")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1479286599:
                if (str.equals("selectedImageIconResource")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1577043198:
                if (str.equals("tabBarItemTestID")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2109188258:
                if (str.equals("imageIconResource")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((RNSTabsScreenAndroidManagerInterface) this.mViewManager).setSpecialEffects(t10, (ReadableMap) obj);
                break;
            case 1:
                ((RNSTabsScreenAndroidManagerInterface) this.mViewManager).setTabBarItemAccessibilityLabel(t10, obj != null ? (String) obj : null);
                break;
            case 2:
                ((RNSTabsScreenAndroidManagerInterface) this.mViewManager).setSelectedDrawableIconResourceName(t10, obj != null ? (String) obj : null);
                break;
            case 3:
                ((RNSTabsScreenAndroidManagerInterface) this.mViewManager).setDrawableIconResourceName(t10, obj != null ? (String) obj : null);
                break;
            case 4:
                ((RNSTabsScreenAndroidManagerInterface) this.mViewManager).setStandardAppearance(t10, (ReadableMap) obj);
                break;
            case 5:
                ((RNSTabsScreenAndroidManagerInterface) this.mViewManager).setTitle(t10, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSTabsScreenAndroidManagerInterface) this.mViewManager).setScreenKey(t10, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSTabsScreenAndroidManagerInterface) this.mViewManager).setBadgeValue(t10, obj != null ? (String) obj : null);
                break;
            case '\b':
                ((RNSTabsScreenAndroidManagerInterface) this.mViewManager).setPreventNativeSelection(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\t':
                ((RNSTabsScreenAndroidManagerInterface) this.mViewManager).setSelectedImageIconResource(t10, (ReadableMap) obj);
                break;
            case '\n':
                ((RNSTabsScreenAndroidManagerInterface) this.mViewManager).setTabBarItemTestID(t10, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSTabsScreenAndroidManagerInterface) this.mViewManager).setImageIconResource(t10, (ReadableMap) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
