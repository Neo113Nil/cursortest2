package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;
import com.twilio.voice.EventKeys;

/* loaded from: classes2.dex */
public class RNSScreenStackHeaderConfigManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSScreenStackHeaderConfigManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSScreenStackHeaderConfigManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2035671681:
                if (str.equals("synchronousShadowStateUpdatesEnabled")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1829317469:
                if (str.equals("userInterfaceStyle")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1822687399:
                if (str.equals("translucent")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1799367701:
                if (str.equals("titleColor")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1795707688:
                if (str.equals("blurEffect")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1774658170:
                if (str.equals("largeTitleColor")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1715368693:
                if (str.equals("titleFontFamily")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1503810304:
                if (str.equals("disableBackButtonMenu")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1225100257:
                if (str.equals("titleFontWeight")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -1217487446:
                if (str.equals(ViewProps.HIDDEN)) {
                    c10 = '\t';
                    break;
                }
                break;
            case -1094575123:
                if (str.equals("largeTitleFontSize")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -1093089076:
                if (str.equals("backButtonDisplayMode")) {
                    c10 = 11;
                    break;
                }
                break;
            case -1063138943:
                if (str.equals("backTitleVisible")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -962590849:
                if (str.equals(EventKeys.DIRECTION_KEY)) {
                    c10 = '\r';
                    break;
                }
                break;
            case -389245640:
                if (str.equals("largeTitleBackgroundColor")) {
                    c10 = 14;
                    break;
                }
                break;
            case -360738525:
                if (str.equals("legacyTopInsetBehavior")) {
                    c10 = 15;
                    break;
                }
                break;
            case -140063148:
                if (str.equals("backButtonInCustomView")) {
                    c10 = 16;
                    break;
                }
                break;
            case -134815516:
                if (str.equals("consumeTopInset")) {
                    c10 = 17;
                    break;
                }
                break;
            case 347216:
                if (str.equals("largeTitleFontFamily")) {
                    c10 = 18;
                    break;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    c10 = 19;
                    break;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    c10 = 20;
                    break;
                }
                break;
            case 183888321:
                if (str.equals("backTitleFontSize")) {
                    c10 = 21;
                    break;
                }
                break;
            case 243070244:
                if (str.equals("backTitleFontFamily")) {
                    c10 = 22;
                    break;
                }
                break;
            case 339462402:
                if (str.equals("hideShadow")) {
                    c10 = 23;
                    break;
                }
                break;
            case 490615652:
                if (str.equals("largeTitleFontWeight")) {
                    c10 = 24;
                    break;
                }
                break;
            case 946001674:
                if (str.equals("headerRightBarButtonItems")) {
                    c10 = 25;
                    break;
                }
                break;
            case 1038753243:
                if (str.equals("hideBackButton")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1249557231:
                if (str.equals("headerLeftBarButtonItems")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1287124693:
                if (str.equals(ViewProps.BACKGROUND_COLOR)) {
                    c10 = 28;
                    break;
                }
                break;
            case 1324688817:
                if (str.equals("backTitle")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1518161768:
                if (str.equals("titleFontSize")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1564506303:
                if (str.equals("largeTitleHideShadow")) {
                    c10 = 31;
                    break;
                }
                break;
            case 2029798365:
                if (str.equals("largeTitle")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 2099541337:
                if (str.equals("topInsetEnabled")) {
                    c10 = '!';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setSynchronousShadowStateUpdatesEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setUserInterfaceStyle(t10, (String) obj);
                break;
            case 2:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTranslucent(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 4:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBlurEffect(t10, (String) obj);
                break;
            case 5:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 6:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleFontFamily(t10, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setDisableBackButtonMenu(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\b':
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleFontWeight(t10, obj != null ? (String) obj : null);
                break;
            case '\t':
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHidden(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\n':
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleFontSize(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 11:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackButtonDisplayMode(t10, (String) obj);
                break;
            case '\f':
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitleVisible(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '\r':
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setDirection(t10, (String) obj);
                break;
            case 14:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleBackgroundColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 15:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLegacyTopInsetBehavior(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 16:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackButtonInCustomView(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setConsumeTopInset(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 18:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleFontFamily(t10, obj != null ? (String) obj : null);
                break;
            case 19:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 20:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitle(t10, obj != null ? (String) obj : null);
                break;
            case 21:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitleFontSize(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 22:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitleFontFamily(t10, obj != null ? (String) obj : null);
                break;
            case 23:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHideShadow(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 24:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleFontWeight(t10, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHeaderRightBarButtonItems(t10, (ReadableArray) obj);
                break;
            case 26:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHideBackButton(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 27:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHeaderLeftBarButtonItems(t10, (ReadableArray) obj);
                break;
            case 28:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackgroundColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 29:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitle(t10, obj != null ? (String) obj : null);
                break;
            case 30:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleFontSize(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 31:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleHideShadow(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ' ':
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitle(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '!':
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTopInsetEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
