package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSStackHeaderConfigAndroidManagerInterface;

/* loaded from: classes2.dex */
public class RNSStackHeaderConfigAndroidManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSStackHeaderConfigAndroidManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSStackHeaderConfigAndroidManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1726194350:
                if (str.equals("transparent")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1635632637:
                if (str.equals("backButtonHidden")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1351025853:
                if (str.equals("scrollFlagSnap")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1265371130:
                if (str.equals("scrollFlagScroll")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1217487446:
                if (str.equals(ViewProps.HIDDEN)) {
                    c10 = 4;
                    break;
                }
                break;
            case -1149435991:
                if (str.equals("backButtonDrawableIconResourceName")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1116497648:
                if (str.equals("scrollFlagExitUntilCollapsed")) {
                    c10 = 6;
                    break;
                }
                break;
            case -638202514:
                if (str.equals("scrollFlagEnterAlways")) {
                    c10 = 7;
                    break;
                }
                break;
            case -230626769:
                if (str.equals("backButtonTintColor")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 944955529:
                if (str.equals("scrollFlagEnterAlwaysCollapsed")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1783433897:
                if (str.equals("backButtonImageIconResource")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((RNSStackHeaderConfigAndroidManagerInterface) this.mViewManager).setTransparent(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNSStackHeaderConfigAndroidManagerInterface) this.mViewManager).setBackButtonHidden(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 2:
                ((RNSStackHeaderConfigAndroidManagerInterface) this.mViewManager).setScrollFlagSnap(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((RNSStackHeaderConfigAndroidManagerInterface) this.mViewManager).setScrollFlagScroll(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 4:
                ((RNSStackHeaderConfigAndroidManagerInterface) this.mViewManager).setHidden(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 5:
                ((RNSStackHeaderConfigAndroidManagerInterface) this.mViewManager).setBackButtonDrawableIconResourceName(t10, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSStackHeaderConfigAndroidManagerInterface) this.mViewManager).setScrollFlagExitUntilCollapsed(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 7:
                ((RNSStackHeaderConfigAndroidManagerInterface) this.mViewManager).setScrollFlagEnterAlways(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\b':
                ((RNSStackHeaderConfigAndroidManagerInterface) this.mViewManager).setBackButtonTintColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case '\t':
                ((RNSStackHeaderConfigAndroidManagerInterface) this.mViewManager).setType(t10, (String) obj);
                break;
            case '\n':
                ((RNSStackHeaderConfigAndroidManagerInterface) this.mViewManager).setTitle(t10, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSStackHeaderConfigAndroidManagerInterface) this.mViewManager).setScrollFlagEnterAlwaysCollapsed(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\f':
                ((RNSStackHeaderConfigAndroidManagerInterface) this.mViewManager).setBackButtonImageIconResource(t10, (ReadableMap) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
