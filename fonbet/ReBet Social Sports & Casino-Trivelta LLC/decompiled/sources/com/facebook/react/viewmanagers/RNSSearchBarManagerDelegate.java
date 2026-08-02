package com.facebook.react.viewmanagers;

import android.view.View;
import com.appsflyer.AdRevenueScheme;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSSearchBarManagerInterface;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;

/* loaded from: classes2.dex */
public class RNSSearchBarManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSSearchBarManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSSearchBarManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t10, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "cancelSearch":
                ((RNSSearchBarManagerInterface) this.mViewManager).cancelSearch(t10);
                break;
            case "clearText":
                ((RNSSearchBarManagerInterface) this.mViewManager).clearText(t10);
                break;
            case "toggleCancelButton":
                ((RNSSearchBarManagerInterface) this.mViewManager).toggleCancelButton(t10, readableArray.getBoolean(0));
                break;
            case "blur":
                ((RNSSearchBarManagerInterface) this.mViewManager).blur(t10);
                break;
            case "focus":
                ((RNSSearchBarManagerInterface) this.mViewManager).focus(t10);
                break;
            case "setText":
                ((RNSSearchBarManagerInterface) this.mViewManager).setText(t10, readableArray.getString(0));
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1619312835:
                if (str.equals("hideNavigationBar")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1465798051:
                if (str.equals("headerIconColor")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1339545093:
                if (str.equals("autoCapitalize")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    c10 = 3;
                    break;
                }
                break;
            case -336520619:
                if (str.equals("barTintColor")) {
                    c10 = 4;
                    break;
                }
                break;
            case -256845969:
                if (str.equals("hintTextColor")) {
                    c10 = 5;
                    break;
                }
                break;
            case -186579527:
                if (str.equals("hideWhenScrolling")) {
                    c10 = 6;
                    break;
                }
                break;
            case -146361959:
                if (str.equals("cancelButtonText")) {
                    c10 = 7;
                    break;
                }
                break;
            case -109380883:
                if (str.equals("disableBackButtonOverride")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -39414888:
                if (str.equals("shouldShowHintSearchIcon")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 598246771:
                if (str.equals(ReactTextInputShadowNode.PROP_PLACEHOLDER)) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1327599912:
                if (str.equals("tintColor")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1399891586:
                if (str.equals("allowToolbarIntegration")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 1584806451:
                if (str.equals("obscureBackground")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1638055017:
                if (str.equals("autoFocus")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1706976804:
                if (str.equals("inputType")) {
                    c10 = 15;
                    break;
                }
                break;
            case 1792938725:
                if (str.equals(AdRevenueScheme.PLACEMENT)) {
                    c10 = 16;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((RNSSearchBarManagerInterface) this.mViewManager).setHideNavigationBar(t10, (String) obj);
                break;
            case 1:
                ((RNSSearchBarManagerInterface) this.mViewManager).setHeaderIconColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 2:
                ((RNSSearchBarManagerInterface) this.mViewManager).setAutoCapitalize(t10, (String) obj);
                break;
            case 3:
                ((RNSSearchBarManagerInterface) this.mViewManager).setTextColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 4:
                ((RNSSearchBarManagerInterface) this.mViewManager).setBarTintColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 5:
                ((RNSSearchBarManagerInterface) this.mViewManager).setHintTextColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 6:
                ((RNSSearchBarManagerInterface) this.mViewManager).setHideWhenScrolling(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 7:
                ((RNSSearchBarManagerInterface) this.mViewManager).setCancelButtonText(t10, obj != null ? (String) obj : null);
                break;
            case '\b':
                ((RNSSearchBarManagerInterface) this.mViewManager).setDisableBackButtonOverride(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\t':
                ((RNSSearchBarManagerInterface) this.mViewManager).setShouldShowHintSearchIcon(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '\n':
                ((RNSSearchBarManagerInterface) this.mViewManager).setPlaceholder(t10, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSSearchBarManagerInterface) this.mViewManager).setTintColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case '\f':
                ((RNSSearchBarManagerInterface) this.mViewManager).setAllowToolbarIntegration(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '\r':
                ((RNSSearchBarManagerInterface) this.mViewManager).setObscureBackground(t10, (String) obj);
                break;
            case 14:
                ((RNSSearchBarManagerInterface) this.mViewManager).setAutoFocus(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 15:
                ((RNSSearchBarManagerInterface) this.mViewManager).setInputType(t10, obj != null ? (String) obj : null);
                break;
            case 16:
                ((RNSSearchBarManagerInterface) this.mViewManager).setPlacement(t10, (String) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
