package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface;
import kotlin.text.Typography;

/* loaded from: classes2.dex */
public class RNSVGSvgViewAndroidManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGSvgViewAndroidManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGSvgViewAndroidManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2064426617:
                if (str.equals("bbHeight")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1989576717:
                if (str.equals(ViewProps.BORDER_RIGHT_COLOR)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1697814026:
                if (str.equals("backfaceVisibility")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1567958285:
                if (str.equals("vbHeight")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1470826662:
                if (str.equals(ViewProps.BORDER_TOP_COLOR)) {
                    c10 = 4;
                    break;
                }
                break;
            case -1308858324:
                if (str.equals(ViewProps.BORDER_BOTTOM_COLOR)) {
                    c10 = 5;
                    break;
                }
                break;
            case -1228066334:
                if (str.equals(ViewProps.BORDER_TOP_LEFT_RADIUS)) {
                    c10 = 6;
                    break;
                }
                break;
            case -1141400650:
                if (str.equals("accessible")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1122140597:
                if (str.equals(ViewProps.BORDER_TOP_START_RADIUS)) {
                    c10 = '\b';
                    break;
                }
                break;
            case -867333731:
                if (str.equals(ViewProps.BORDER_BOTTOM_START_RADIUS)) {
                    c10 = '\t';
                    break;
                }
                break;
            case -679581037:
                if (str.equals("hasTVPreferredFocus")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -631506969:
                if (str.equals("nextFocusDown")) {
                    c10 = 11;
                    break;
                }
                break;
            case -631278772:
                if (str.equals("nextFocusLeft")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -483490364:
                if (str.equals(ViewProps.BORDER_TOP_END_RADIUS)) {
                    c10 = '\r';
                    break;
                }
                break;
            case -329721498:
                if (str.equals("bbWidth")) {
                    c10 = 14;
                    break;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    c10 = 15;
                    break;
                }
                break;
            case -252105751:
                if (str.equals(ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)) {
                    c10 = 16;
                    break;
                }
                break;
            case -242276144:
                if (str.equals(ViewProps.BORDER_LEFT_COLOR)) {
                    c10 = 17;
                    break;
                }
                break;
            case -223134121:
                if (str.equals(ViewProps.BORDER_START_END_RADIUS)) {
                    c10 = 18;
                    break;
                }
                break;
            case -148030058:
                if (str.equals(ViewProps.BORDER_BOTTOM_END_RADIUS)) {
                    c10 = 19;
                    break;
                }
                break;
            case -109689771:
                if (str.equals("nativeForegroundAndroid")) {
                    c10 = 20;
                    break;
                }
                break;
            case -27894242:
                if (str.equals(ViewProps.BORDER_START_START_RADIUS)) {
                    c10 = 21;
                    break;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    c10 = 22;
                    break;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
                    c10 = 23;
                    break;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
                    c10 = 24;
                    break;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    c10 = 25;
                    break;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
                    c10 = 26;
                    break;
                }
                break;
            case 306963138:
                if (str.equals(ViewProps.BORDER_BLOCK_START_COLOR)) {
                    c10 = 27;
                    break;
                }
                break;
            case 333432965:
                if (str.equals(ViewProps.BORDER_TOP_RIGHT_RADIUS)) {
                    c10 = 28;
                    break;
                }
                break;
            case 503397728:
                if (str.equals("nextFocusForward")) {
                    c10 = 29;
                    break;
                }
                break;
            case 581268560:
                if (str.equals(ViewProps.BORDER_BOTTOM_LEFT_RADIUS)) {
                    c10 = 30;
                    break;
                }
                break;
            case 588239831:
                if (str.equals(ViewProps.BORDER_BOTTOM_RIGHT_RADIUS)) {
                    c10 = 31;
                    break;
                }
                break;
            case 660795168:
                if (str.equals("nextFocusUp")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 684610594:
                if (str.equals(ViewProps.BORDER_BLOCK_COLOR)) {
                    c10 = '!';
                    break;
                }
                break;
            case 722830999:
                if (str.equals(ViewProps.BORDER_COLOR)) {
                    c10 = Typography.quote;
                    break;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    c10 = '#';
                    break;
                }
                break;
            case 762983977:
                if (str.equals(ViewProps.BORDER_BLOCK_END_COLOR)) {
                    c10 = Typography.dollar;
                    break;
                }
                break;
            case 910681861:
                if (str.equals(ViewProps.BORDER_END_START_RADIUS)) {
                    c10 = '%';
                    break;
                }
                break;
            case 926871597:
                if (str.equals("hitSlop")) {
                    c10 = Typography.amp;
                    break;
                }
                break;
            case 1220735892:
                if (str.equals(ViewProps.BORDER_END_COLOR)) {
                    c10 = '\'';
                    break;
                }
                break;
            case 1349188574:
                if (str.equals(ViewProps.BORDER_RADIUS)) {
                    c10 = '(';
                    break;
                }
                break;
            case 1629011506:
                if (str.equals("focusable")) {
                    c10 = ')';
                    break;
                }
                break;
            case 1667773924:
                if (str.equals(ViewProps.NEEDS_OFFSCREEN_ALPHA_COMPOSITING)) {
                    c10 = '*';
                    break;
                }
                break;
            case 1735382270:
                if (str.equals(ViewProps.BORDER_END_END_RADIUS)) {
                    c10 = '+';
                    break;
                }
                break;
            case 1747724810:
                if (str.equals("nativeBackgroundAndroid")) {
                    c10 = ',';
                    break;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    c10 = '-';
                    break;
                }
                break;
            case 1910855543:
                if (str.equals("nextFocusRight")) {
                    c10 = '.';
                    break;
                }
                break;
            case 2119889261:
                if (str.equals(ViewProps.BORDER_START_COLOR)) {
                    c10 = '/';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBbHeight(t10, new DynamicFromObject(obj));
                break;
            case 1:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderRightColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 2:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBackfaceVisibility(t10, obj != null ? (String) obj : null);
                break;
            case 3:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setVbHeight(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 4:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 5:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 6:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopLeftRadius(t10, new DynamicFromObject(obj));
                break;
            case 7:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setAccessible(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\b':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopStartRadius(t10, new DynamicFromObject(obj));
                break;
            case '\t':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomStartRadius(t10, new DynamicFromObject(obj));
                break;
            case '\n':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setHasTVPreferredFocus(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNextFocusDown(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '\f':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNextFocusLeft(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '\r':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopEndRadius(t10, new DynamicFromObject(obj));
                break;
            case 14:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBbWidth(t10, new DynamicFromObject(obj));
                break;
            case 15:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setPointerEvents(t10, obj != null ? (String) obj : null);
                break;
            case 16:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setRemoveClippedSubviews(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderLeftColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 18:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderStartEndRadius(t10, new DynamicFromObject(obj));
                break;
            case 19:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomEndRadius(t10, new DynamicFromObject(obj));
                break;
            case 20:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNativeForegroundAndroid(t10, (ReadableMap) obj);
                break;
            case 21:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderStartStartRadius(t10, new DynamicFromObject(obj));
                break;
            case 22:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setMinX(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 23:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setMinY(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 24:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setAlign(t10, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 26:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setVbWidth(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 27:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBlockStartColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 28:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopRightRadius(t10, new DynamicFromObject(obj));
                break;
            case 29:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNextFocusForward(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 30:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomLeftRadius(t10, new DynamicFromObject(obj));
                break;
            case 31:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomRightRadius(t10, new DynamicFromObject(obj));
                break;
            case ' ':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNextFocusUp(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '!':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBlockColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case '\"':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case '#':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderStyle(t10, obj != null ? (String) obj : null);
                break;
            case '$':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBlockEndColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case '%':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderEndStartRadius(t10, new DynamicFromObject(obj));
                break;
            case '&':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setHitSlop(t10, new DynamicFromObject(obj));
                break;
            case '\'':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderEndColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case '(':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderRadius(t10, new DynamicFromObject(obj));
                break;
            case ')':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setFocusable(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '*':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNeedsOffscreenAlphaCompositing(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '+':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderEndEndRadius(t10, new DynamicFromObject(obj));
                break;
            case ',':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNativeBackgroundAndroid(t10, (ReadableMap) obj);
                break;
            case '-':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setMeetOrSlice(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '.':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNextFocusRight(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '/':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderStartColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
