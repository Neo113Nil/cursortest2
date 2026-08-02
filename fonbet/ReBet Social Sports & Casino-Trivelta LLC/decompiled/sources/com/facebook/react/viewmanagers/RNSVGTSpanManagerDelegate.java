package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface;
import kotlin.text.Typography;
import lb.C5444x;

/* loaded from: classes2.dex */
public class RNSVGTSpanManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGTSpanManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGTSpanManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1603134955:
                if (str.equals("lengthAdjust")) {
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
            case -1171891896:
                if (str.equals("alignmentBaseline")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1139902161:
                if (str.equals("verticalAlign")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    c10 = 5;
                    break;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    c10 = 6;
                    break;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    c10 = 7;
                    break;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -734428249:
                if (str.equals(ViewProps.FONT_WEIGHT)) {
                    c10 = 11;
                    break;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    c10 = 14;
                    break;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    c10 = 15;
                    break;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    c10 = 16;
                    break;
                }
                break;
            case 120:
                if (str.equals(C5444x.f55808b)) {
                    c10 = 17;
                    break;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    c10 = 18;
                    break;
                }
                break;
            case 3220:
                if (str.equals("dx")) {
                    c10 = 19;
                    break;
                }
                break;
            case 3221:
                if (str.equals("dy")) {
                    c10 = 20;
                    break;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    c10 = 21;
                    break;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    c10 = 22;
                    break;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    c10 = 23;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c10 = 24;
                    break;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    c10 = 25;
                    break;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    c10 = 26;
                    break;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    c10 = 27;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    c10 = 28;
                    break;
                }
                break;
            case 275888445:
                if (str.equals("baselineShift")) {
                    c10 = 29;
                    break;
                }
                break;
            case 365601008:
                if (str.equals(ViewProps.FONT_SIZE)) {
                    c10 = 30;
                    break;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    c10 = 31;
                    break;
                }
                break;
            case 778043962:
                if (str.equals("inlineSize")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c10 = '!';
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c10 = Typography.quote;
                    break;
                }
                break;
            case 951530617:
                if (str.equals("content")) {
                    c10 = '#';
                    break;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    c10 = Typography.dollar;
                    break;
                }
                break;
            case 1637488243:
                if (str.equals("textLength")) {
                    c10 = '%';
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c10 = Typography.amp;
                    break;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c10 = '(';
                    break;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    c10 = ')';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setLengthAdjust(t10, obj != null ? (String) obj : null);
                break;
            case 1:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFilter(t10, obj != null ? (String) obj : null);
                break;
            case 2:
                this.mViewManager.setOpacity(t10, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 3:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setAlignmentBaseline(t10, obj != null ? (String) obj : null);
                break;
            case 4:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setVerticalAlign(t10, new DynamicFromObject(obj));
                break;
            case 5:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setMatrix(t10, (ReadableArray) obj);
                break;
            case 6:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setPropList(t10, (ReadableArray) obj);
                break;
            case 7:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setMarkerEnd(t10, obj != null ? (String) obj : null);
                break;
            case '\b':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setMarkerMid(t10, obj != null ? (String) obj : null);
                break;
            case '\t':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setRotate(t10, new DynamicFromObject(obj));
                break;
            case '\n':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStroke(t10, new DynamicFromObject(obj));
                break;
            case 11:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFontWeight(t10, new DynamicFromObject(obj));
                break;
            case '\f':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFillRule(t10, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case '\r':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeOpacity(t10, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 14:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setPointerEvents(t10, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFillOpacity(t10, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 16:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeDashoffset(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 17:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setX(t10, new DynamicFromObject(obj));
                break;
            case 18:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setY(t10, new DynamicFromObject(obj));
                break;
            case 19:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setDx(t10, new DynamicFromObject(obj));
                break;
            case 20:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setDy(t10, new DynamicFromObject(obj));
                break;
            case 21:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFill(t10, new DynamicFromObject(obj));
                break;
            case 22:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFont(t10, new DynamicFromObject(obj));
                break;
            case 23:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setMask(t10, obj != null ? (String) obj : null);
                break;
            case 24:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setName(t10, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeMiterlimit(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 26:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 27:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setVectorEffect(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 28:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setMarkerStart(t10, obj != null ? (String) obj : null);
                break;
            case 29:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setBaselineShift(t10, new DynamicFromObject(obj));
                break;
            case 30:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setFontSize(t10, new DynamicFromObject(obj));
                break;
            case 31:
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeDasharray(t10, new DynamicFromObject(obj));
                break;
            case ' ':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setInlineSize(t10, new DynamicFromObject(obj));
                break;
            case '!':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setClipPath(t10, obj != null ? (String) obj : null);
                break;
            case '\"':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setClipRule(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '#':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setContent(t10, obj != null ? (String) obj : null);
                break;
            case '$':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeLinecap(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '%':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setTextLength(t10, new DynamicFromObject(obj));
                break;
            case '&':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setDisplay(t10, obj != null ? (String) obj : null);
                break;
            case '\'':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeLinejoin(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case '(':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setResponsible(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ')':
                ((RNSVGTSpanManagerInterface) this.mViewManager).setStrokeWidth(t10, new DynamicFromObject(obj));
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
