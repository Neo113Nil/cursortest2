package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface;
import kotlin.text.Typography;

/* loaded from: classes2.dex */
public class RNSVGSymbolManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGSymbolManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGSymbolManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1567958285:
                if (str.equals("vbHeight")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1274492040:
                if (str.equals(ViewProps.FILTER)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    c10 = 3;
                    break;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    c10 = 4;
                    break;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    c10 = 5;
                    break;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    c10 = 6;
                    break;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    c10 = 7;
                    break;
                }
                break;
            case -734428249:
                if (str.equals(ViewProps.FONT_WEIGHT)) {
                    c10 = '\b';
                    break;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    c10 = 11;
                    break;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    c10 = 14;
                    break;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    c10 = 15;
                    break;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    c10 = 16;
                    break;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    c10 = 17;
                    break;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
                    c10 = 18;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c10 = 19;
                    break;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    c10 = 20;
                    break;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
                    c10 = 21;
                    break;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    c10 = 22;
                    break;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    c10 = 23;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    c10 = 24;
                    break;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
                    c10 = 25;
                    break;
                }
                break;
            case 365601008:
                if (str.equals(ViewProps.FONT_SIZE)) {
                    c10 = 26;
                    break;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    c10 = 27;
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c10 = 28;
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c10 = 31;
                    break;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c10 = '!';
                    break;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    c10 = Typography.quote;
                    break;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    c10 = '#';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setVbHeight(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 1:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setFilter(t10, obj != null ? (String) obj : null);
                break;
            case 2:
                this.mViewManager.setOpacity(t10, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 3:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setMatrix(t10, (ReadableArray) obj);
                break;
            case 4:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setPropList(t10, (ReadableArray) obj);
                break;
            case 5:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setMarkerEnd(t10, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setMarkerMid(t10, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setStroke(t10, new DynamicFromObject(obj));
                break;
            case '\b':
                ((RNSVGSymbolManagerInterface) this.mViewManager).setFontWeight(t10, new DynamicFromObject(obj));
                break;
            case '\t':
                ((RNSVGSymbolManagerInterface) this.mViewManager).setFillRule(t10, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case '\n':
                ((RNSVGSymbolManagerInterface) this.mViewManager).setStrokeOpacity(t10, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 11:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setPointerEvents(t10, obj != null ? (String) obj : null);
                break;
            case '\f':
                ((RNSVGSymbolManagerInterface) this.mViewManager).setFillOpacity(t10, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case '\r':
                ((RNSVGSymbolManagerInterface) this.mViewManager).setStrokeDashoffset(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 14:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setFill(t10, new DynamicFromObject(obj));
                break;
            case 15:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setFont(t10, new DynamicFromObject(obj));
                break;
            case 16:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setMask(t10, obj != null ? (String) obj : null);
                break;
            case 17:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setMinX(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 18:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setMinY(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 19:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setName(t10, obj != null ? (String) obj : null);
                break;
            case 20:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setStrokeMiterlimit(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 21:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setAlign(t10, obj != null ? (String) obj : null);
                break;
            case 22:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 23:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setVectorEffect(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 24:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setMarkerStart(t10, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setVbWidth(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 26:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setFontSize(t10, new DynamicFromObject(obj));
                break;
            case 27:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setStrokeDasharray(t10, new DynamicFromObject(obj));
                break;
            case 28:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setClipPath(t10, obj != null ? (String) obj : null);
                break;
            case 29:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setClipRule(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 30:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setStrokeLinecap(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 31:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setDisplay(t10, obj != null ? (String) obj : null);
                break;
            case ' ':
                ((RNSVGSymbolManagerInterface) this.mViewManager).setStrokeLinejoin(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '!':
                ((RNSVGSymbolManagerInterface) this.mViewManager).setResponsible(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\"':
                ((RNSVGSymbolManagerInterface) this.mViewManager).setMeetOrSlice(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '#':
                ((RNSVGSymbolManagerInterface) this.mViewManager).setStrokeWidth(t10, new DynamicFromObject(obj));
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
