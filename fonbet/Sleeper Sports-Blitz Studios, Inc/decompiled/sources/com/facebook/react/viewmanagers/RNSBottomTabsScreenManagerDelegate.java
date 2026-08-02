package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface;
import org.apache.commons.lang3.CharUtils;

/* loaded from: classes6.dex */
public class RNSBottomTabsScreenManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSBottomTabsScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSBottomTabsScreenManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t, String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1991728986:
                if (str.equals("bottomScrollEdgeEffect")) {
                    c = 0;
                    break;
                }
                break;
            case -1871891504:
                if (str.equals("topScrollEdgeEffect")) {
                    c = 1;
                    break;
                }
                break;
            case -1829317469:
                if (str.equals("userInterfaceStyle")) {
                    c = 2;
                    break;
                }
                break;
            case -1791070590:
                if (str.equals("leftScrollEdgeEffect")) {
                    c = 3;
                    break;
                }
                break;
            case -1770963447:
                if (str.equals("specialEffects")) {
                    c = 4;
                    break;
                }
                break;
            case -1628518761:
                if (str.equals("rightScrollEdgeEffect")) {
                    c = 5;
                    break;
                }
                break;
            case -1439500848:
                if (str.equals("orientation")) {
                    c = 6;
                    break;
                }
                break;
            case -1270820115:
                if (str.equals("isFocused")) {
                    c = 7;
                    break;
                }
                break;
            case -1186468415:
                if (str.equals("overrideScrollViewContentInsetAdjustmentBehavior")) {
                    c = '\b';
                    break;
                }
                break;
            case -1167193694:
                if (str.equals("isTitleUndefined")) {
                    c = '\t';
                    break;
                }
                break;
            case -881409398:
                if (str.equals("tabKey")) {
                    c = '\n';
                    break;
                }
                break;
            case -776576227:
                if (str.equals("iconImageSource")) {
                    c = 11;
                    break;
                }
                break;
            case -737911981:
                if (str.equals("iconType")) {
                    c = '\f';
                    break;
                }
                break;
            case -569869622:
                if (str.equals("selectedIconSfSymbolName")) {
                    c = CharUtils.CR;
                    break;
                }
                break;
            case -558395241:
                if (str.equals("tabBarItemAccessibilityLabel")) {
                    c = 14;
                    break;
                }
                break;
            case -270334418:
                if (str.equals("scrollEdgeAppearance")) {
                    c = 15;
                    break;
                }
                break;
            case -10721392:
                if (str.equals("drawableIconResourceName")) {
                    c = 16;
                    break;
                }
                break;
            case 28389121:
                if (str.equals("standardAppearance")) {
                    c = 17;
                    break;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    c = 18;
                    break;
                }
                break;
            case 143186447:
                if (str.equals("iconSfSymbolName")) {
                    c = 19;
                    break;
                }
                break;
            case 642560482:
                if (str.equals("systemItem")) {
                    c = 20;
                    break;
                }
                break;
            case 1001537282:
                if (str.equals("selectedIconImageSource")) {
                    c = 21;
                    break;
                }
                break;
            case 1072026510:
                if (str.equals("badgeValue")) {
                    c = 22;
                    break;
                }
                break;
            case 1519110851:
                if (str.equals("tabBarItemBadgeBackgroundColor")) {
                    c = 23;
                    break;
                }
                break;
            case 1577043198:
                if (str.equals("tabBarItemTestID")) {
                    c = 24;
                    break;
                }
                break;
            case 1595935908:
                if (str.equals("tabBarItemBadgeTextColor")) {
                    c = 25;
                    break;
                }
                break;
            case 2109188258:
                if (str.equals("imageIconResource")) {
                    c = 26;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setBottomScrollEdgeEffect(t, (String) obj);
                break;
            case 1:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTopScrollEdgeEffect(t, (String) obj);
                break;
            case 2:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setUserInterfaceStyle(t, (String) obj);
                break;
            case 3:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setLeftScrollEdgeEffect(t, (String) obj);
                break;
            case 4:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setSpecialEffects(t, (ReadableMap) obj);
                break;
            case 5:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setRightScrollEdgeEffect(t, (String) obj);
                break;
            case 6:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setOrientation(t, (String) obj);
                break;
            case 7:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIsFocused(t, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\b':
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setOverrideScrollViewContentInsetAdjustmentBehavior(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '\t':
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIsTitleUndefined(t, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '\n':
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabKey(t, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIconImageSource(t, (ReadableMap) obj);
                break;
            case '\f':
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIconType(t, (String) obj);
                break;
            case '\r':
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setSelectedIconSfSymbolName(t, obj != null ? (String) obj : null);
                break;
            case 14:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabBarItemAccessibilityLabel(t, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setScrollEdgeAppearance(t, new DynamicFromObject(obj));
                break;
            case 16:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setDrawableIconResourceName(t, obj != null ? (String) obj : null);
                break;
            case 17:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setStandardAppearance(t, new DynamicFromObject(obj));
                break;
            case 18:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTitle(t, obj != null ? (String) obj : null);
                break;
            case 19:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIconSfSymbolName(t, obj != null ? (String) obj : null);
                break;
            case 20:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setSystemItem(t, (String) obj);
                break;
            case 21:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setSelectedIconImageSource(t, (ReadableMap) obj);
                break;
            case 22:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setBadgeValue(t, obj != null ? (String) obj : null);
                break;
            case 23:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabBarItemBadgeBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 24:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabBarItemTestID(t, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabBarItemBadgeTextColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                break;
            case 26:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setImageIconResource(t, (ReadableMap) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t, str, obj);
                break;
        }
    }
}
