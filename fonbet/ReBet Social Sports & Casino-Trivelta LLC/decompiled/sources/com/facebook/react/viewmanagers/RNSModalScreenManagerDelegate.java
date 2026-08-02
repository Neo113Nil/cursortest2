package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSModalScreenManagerInterface;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import kotlin.text.Typography;

/* loaded from: classes2.dex */
public class RNSModalScreenManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSModalScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSModalScreenManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        char c10;
        str.getClass();
        switch (str.hashCode()) {
            case -2035671681:
                if (str.equals("synchronousShadowStateUpdatesEnabled")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1991728986:
                if (str.equals("bottomScrollEdgeEffect")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1937389126:
                if (str.equals("homeIndicatorHidden")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1871891504:
                if (str.equals("topScrollEdgeEffect")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1853558344:
                if (str.equals("gestureEnabled")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1791070590:
                if (str.equals("leftScrollEdgeEffect")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1734097646:
                if (str.equals("hideKeyboardOnSwipe")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -1628518761:
                if (str.equals("rightScrollEdgeEffect")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -1349152186:
                if (str.equals("sheetCornerRadius")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -1322084375:
                if (str.equals("navigationBarHidden")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -1156137512:
                if (str.equals("statusBarTranslucent")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case -1150711358:
                if (str.equals("stackPresentation")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case -1047235902:
                if (str.equals("activityState")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case -973702878:
                if (str.equals("statusBarColor")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case -958765200:
                if (str.equals("statusBarStyle")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case -952227806:
                if (str.equals("fullScreenSwipeShadowEnabled")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case -577711652:
                if (str.equals("stackAnimation")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case -462720700:
                if (str.equals("navigationBarColor")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case -411607385:
                if (str.equals("screenId")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case -381571779:
                if (str.equals("sheetInitialDetent")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case -274098190:
                if (str.equals("sheetAllowedDetents")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case -257141968:
                if (str.equals("replaceAnimation")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case -166356101:
                if (str.equals("preventNativeDismiss")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 17337291:
                if (str.equals("statusBarHidden")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case 129956386:
                if (str.equals("fullScreenSwipeEnabled")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 187703999:
                if (str.equals("gestureResponseDistance")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case 227582404:
                if (str.equals("screenOrientation")) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 241896530:
                if (str.equals("sheetLargestUndimmedDetent")) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case 425064969:
                if (str.equals("transitionDuration")) {
                    c10 = 28;
                    break;
                }
                c10 = 65535;
                break;
            case 658632444:
                if (str.equals("sheetShouldOverflowTopInset")) {
                    c10 = 29;
                    break;
                }
                c10 = 65535;
                break;
            case 1082157413:
                if (str.equals("swipeDirection")) {
                    c10 = 30;
                    break;
                }
                c10 = 65535;
                break;
            case 1110843912:
                if (str.equals("customAnimationOnSwipe")) {
                    c10 = 31;
                    break;
                }
                c10 = 65535;
                break;
            case 1116050554:
                if (str.equals("navigationBarTranslucent")) {
                    c10 = ' ';
                    break;
                }
                c10 = 65535;
                break;
            case 1269009342:
                if (str.equals("sheetElevation")) {
                    c10 = '!';
                    break;
                }
                c10 = 65535;
                break;
            case 1287164531:
                if (str.equals("sheetDefaultResizeAnimationEnabled")) {
                    c10 = Typography.quote;
                    break;
                }
                c10 = 65535;
                break;
            case 1357942638:
                if (str.equals("sheetGrabberVisible")) {
                    c10 = '#';
                    break;
                }
                c10 = 65535;
                break;
            case 1387359683:
                if (str.equals("statusBarAnimation")) {
                    c10 = Typography.dollar;
                    break;
                }
                c10 = 65535;
                break;
            case 1729091548:
                if (str.equals("nativeBackButtonDismissalEnabled")) {
                    c10 = '%';
                    break;
                }
                c10 = 65535;
                break;
            case 2097450072:
                if (str.equals("sheetExpandsWhenScrolledToEdge")) {
                    c10 = Typography.amp;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSynchronousShadowStateUpdatesEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNSModalScreenManagerInterface) this.mViewManager).setBottomScrollEdgeEffect(t10, (String) obj);
                break;
            case 2:
                ((RNSModalScreenManagerInterface) this.mViewManager).setHomeIndicatorHidden(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((RNSModalScreenManagerInterface) this.mViewManager).setTopScrollEdgeEffect(t10, (String) obj);
                break;
            case 4:
                ((RNSModalScreenManagerInterface) this.mViewManager).setGestureEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 5:
                ((RNSModalScreenManagerInterface) this.mViewManager).setLeftScrollEdgeEffect(t10, (String) obj);
                break;
            case 6:
                ((RNSModalScreenManagerInterface) this.mViewManager).setHideKeyboardOnSwipe(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 7:
                ((RNSModalScreenManagerInterface) this.mViewManager).setRightScrollEdgeEffect(t10, (String) obj);
                break;
            case '\b':
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetCornerRadius(t10, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case '\t':
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarHidden(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\n':
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarTranslucent(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStackPresentation(t10, (String) obj);
                break;
            case '\f':
                ((RNSModalScreenManagerInterface) this.mViewManager).setActivityState(t10, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case '\r':
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 14:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarStyle(t10, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSModalScreenManagerInterface) this.mViewManager).setFullScreenSwipeShadowEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 16:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStackAnimation(t10, (String) obj);
                break;
            case 17:
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 18:
                ((RNSModalScreenManagerInterface) this.mViewManager).setScreenId(t10, obj == null ? "" : (String) obj);
                break;
            case 19:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetInitialDetent(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 20:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetAllowedDetents(t10, (ReadableArray) obj);
                break;
            case 21:
                ((RNSModalScreenManagerInterface) this.mViewManager).setReplaceAnimation(t10, (String) obj);
                break;
            case 22:
                ((RNSModalScreenManagerInterface) this.mViewManager).setPreventNativeDismiss(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 23:
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarHidden(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 24:
                ((RNSModalScreenManagerInterface) this.mViewManager).setFullScreenSwipeEnabled(t10, (String) obj);
                break;
            case 25:
                ((RNSModalScreenManagerInterface) this.mViewManager).setGestureResponseDistance(t10, (ReadableMap) obj);
                break;
            case 26:
                ((RNSModalScreenManagerInterface) this.mViewManager).setScreenOrientation(t10, obj != null ? (String) obj : null);
                break;
            case 27:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetLargestUndimmedDetent(t10, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case 28:
                ((RNSModalScreenManagerInterface) this.mViewManager).setTransitionDuration(t10, obj == null ? FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION : ((Double) obj).intValue());
                break;
            case 29:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetShouldOverflowTopInset(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 30:
                ((RNSModalScreenManagerInterface) this.mViewManager).setSwipeDirection(t10, (String) obj);
                break;
            case 31:
                ((RNSModalScreenManagerInterface) this.mViewManager).setCustomAnimationOnSwipe(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ' ':
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarTranslucent(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '!':
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetElevation(t10, obj != null ? ((Double) obj).intValue() : 24);
                break;
            case '\"':
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetDefaultResizeAnimationEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case '#':
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetGrabberVisible(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '$':
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarAnimation(t10, obj != null ? (String) obj : null);
                break;
            case '%':
                ((RNSModalScreenManagerInterface) this.mViewManager).setNativeBackButtonDismissalEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '&':
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetExpandsWhenScrolledToEdge(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
