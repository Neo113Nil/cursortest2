package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGCircleManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGCircleManagerInterface;
import com.facebook.react.viewmanagers.RNSVGClipPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGDefsManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGDefsManagerInterface;
import com.facebook.react.viewmanagers.RNSVGEllipseManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeBlendManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeCompositeManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeFloodManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeMergeManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFeOffsetManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface;
import com.facebook.react.viewmanagers.RNSVGFilterManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGFilterManagerInterface;
import com.facebook.react.viewmanagers.RNSVGForeignObjectManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface;
import com.facebook.react.viewmanagers.RNSVGGroupManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGGroupManagerInterface;
import com.facebook.react.viewmanagers.RNSVGImageManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGImageManagerInterface;
import com.facebook.react.viewmanagers.RNSVGLineManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGLineManagerInterface;
import com.facebook.react.viewmanagers.RNSVGLinearGradientManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface;
import com.facebook.react.viewmanagers.RNSVGMarkerManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface;
import com.facebook.react.viewmanagers.RNSVGMaskManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGMaskManagerInterface;
import com.facebook.react.viewmanagers.RNSVGPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGPatternManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGPatternManagerInterface;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface;
import com.facebook.react.viewmanagers.RNSVGRectManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGRectManagerInterface;
import com.facebook.react.viewmanagers.RNSVGSymbolManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTSpanManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTextManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTextManagerInterface;
import com.facebook.react.viewmanagers.RNSVGTextPathManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface;
import com.facebook.react.viewmanagers.RNSVGUseManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGUseManagerInterface;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.VirtualViewManager;
import com.horcrux.svg.events.SvgLoadEvent;
import com.horcrux.svg.events.SvgOnLayoutEvent;
import com.twilio.voice.EventKeys;
import java.util.HashMap;
import java.util.Map;
import lb.C5444x;

/* loaded from: classes3.dex */
class RenderableViewManager<T extends RenderableView> extends VirtualViewManager<T> {

    public static class CircleViewManager extends RenderableViewManager<C3524b> implements RNSVGCircleManagerInterface<C3524b> {
        public static final String REACT_CLASS = "RNSVGCircle";

        public CircleViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGCircle);
            ((VirtualViewManager) this).mDelegate = new RNSVGCircleManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C3524b c3524b, String str) {
            super.setClipPath((CircleViewManager) c3524b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C3524b c3524b, int i10) {
            super.setClipRule((CircleViewManager) c3524b, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(C3524b c3524b, Integer num) {
            super.setColor((CircleViewManager) c3524b, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C3524b c3524b, String str) {
            super.setDisplay((CircleViewManager) c3524b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(C3524b c3524b, Dynamic dynamic) {
            super.setFill((CircleViewManager) c3524b, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C3524b c3524b, float f10) {
            super.setFillOpacity((CircleViewManager) c3524b, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C3524b c3524b, int i10) {
            super.setFillRule((CircleViewManager) c3524b, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(C3524b c3524b, String str) {
            super.setFilter((CircleViewManager) c3524b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C3524b c3524b, String str) {
            super.setMarkerEnd((CircleViewManager) c3524b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C3524b c3524b, String str) {
            super.setMarkerMid((CircleViewManager) c3524b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C3524b c3524b, String str) {
            super.setMarkerStart((CircleViewManager) c3524b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C3524b c3524b, String str) {
            super.setMask((CircleViewManager) c3524b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C3524b c3524b, ReadableArray readableArray) {
            super.setMatrix((CircleViewManager) c3524b, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C3524b c3524b, String str) {
            super.setName((CircleViewManager) c3524b, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((CircleViewManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C3524b c3524b, String str) {
            super.setPointerEvents((CircleViewManager) c3524b, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C3524b c3524b, ReadableArray readableArray) {
            super.setPropList((CircleViewManager) c3524b, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C3524b c3524b, boolean z10) {
            super.setResponsible((CircleViewManager) c3524b, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(C3524b c3524b, Dynamic dynamic) {
            super.setStroke((CircleViewManager) c3524b, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C3524b c3524b, Dynamic dynamic) {
            super.setStrokeDasharray((CircleViewManager) c3524b, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C3524b c3524b, float f10) {
            super.setStrokeDashoffset((CircleViewManager) c3524b, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C3524b c3524b, int i10) {
            super.setStrokeLinecap((CircleViewManager) c3524b, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C3524b c3524b, int i10) {
            super.setStrokeLinejoin((CircleViewManager) c3524b, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C3524b c3524b, float f10) {
            super.setStrokeMiterlimit((CircleViewManager) c3524b, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C3524b c3524b, float f10) {
            super.setStrokeOpacity((CircleViewManager) c3524b, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(C3524b c3524b, Dynamic dynamic) {
            super.setStrokeWidth((CircleViewManager) c3524b, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C3524b c3524b, int i10) {
            super.setVectorEffect((CircleViewManager) c3524b, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "cx")
        public void setCx(C3524b c3524b, Dynamic dynamic) {
            c3524b.o(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "cy")
        public void setCy(C3524b c3524b, Dynamic dynamic) {
            c3524b.p(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGCircleManagerInterface
        @ReactProp(name = "r")
        public void setR(C3524b c3524b, Dynamic dynamic) {
            c3524b.q(dynamic);
        }
    }

    public static class ClipPathViewManager extends GroupViewManagerAbstract<C3525c> implements RNSVGClipPathManagerInterface<C3525c> {
        public static final String REACT_CLASS = "RNSVGClipPath";

        public ClipPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGClipPath);
            ((VirtualViewManager) this).mDelegate = new RNSVGClipPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C3525c c3525c, String str) {
            super.setClipPath((ClipPathViewManager) c3525c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C3525c c3525c, int i10) {
            super.setClipRule((ClipPathViewManager) c3525c, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(C3525c c3525c, Integer num) {
            super.setColor((ClipPathViewManager) c3525c, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C3525c c3525c, String str) {
            super.setDisplay((ClipPathViewManager) c3525c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(C3525c c3525c, Dynamic dynamic) {
            super.setFill((ClipPathViewManager) c3525c, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C3525c c3525c, float f10) {
            super.setFillOpacity((ClipPathViewManager) c3525c, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C3525c c3525c, int i10) {
            super.setFillRule((ClipPathViewManager) c3525c, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(C3525c c3525c, String str) {
            super.setFilter((ClipPathViewManager) c3525c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C3525c c3525c, Dynamic dynamic) {
            super.setFont((ClipPathViewManager) c3525c, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(C3525c c3525c, Dynamic dynamic) {
            super.setFontSize((ClipPathViewManager) c3525c, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(C3525c c3525c, Dynamic dynamic) {
            super.setFontWeight((ClipPathViewManager) c3525c, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C3525c c3525c, String str) {
            super.setMarkerEnd((ClipPathViewManager) c3525c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C3525c c3525c, String str) {
            super.setMarkerMid((ClipPathViewManager) c3525c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C3525c c3525c, String str) {
            super.setMarkerStart((ClipPathViewManager) c3525c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C3525c c3525c, String str) {
            super.setMask((ClipPathViewManager) c3525c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C3525c c3525c, ReadableArray readableArray) {
            super.setMatrix((ClipPathViewManager) c3525c, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C3525c c3525c, String str) {
            super.setName((ClipPathViewManager) c3525c, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((ClipPathViewManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C3525c c3525c, String str) {
            super.setPointerEvents((ClipPathViewManager) c3525c, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C3525c c3525c, ReadableArray readableArray) {
            super.setPropList((ClipPathViewManager) c3525c, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C3525c c3525c, boolean z10) {
            super.setResponsible((ClipPathViewManager) c3525c, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(C3525c c3525c, Dynamic dynamic) {
            super.setStroke((ClipPathViewManager) c3525c, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C3525c c3525c, Dynamic dynamic) {
            super.setStrokeDasharray((ClipPathViewManager) c3525c, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C3525c c3525c, float f10) {
            super.setStrokeDashoffset((ClipPathViewManager) c3525c, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C3525c c3525c, int i10) {
            super.setStrokeLinecap((ClipPathViewManager) c3525c, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C3525c c3525c, int i10) {
            super.setStrokeLinejoin((ClipPathViewManager) c3525c, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C3525c c3525c, float f10) {
            super.setStrokeMiterlimit((ClipPathViewManager) c3525c, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C3525c c3525c, float f10) {
            super.setStrokeOpacity((ClipPathViewManager) c3525c, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(C3525c c3525c, Dynamic dynamic) {
            super.setStrokeWidth((ClipPathViewManager) c3525c, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C3525c c3525c, int i10) {
            super.setVectorEffect((ClipPathViewManager) c3525c, i10);
        }
    }

    public static class DefsViewManager extends VirtualViewManager<C3528f> implements RNSVGDefsManagerInterface<C3528f> {
        public static final String REACT_CLASS = "RNSVGDefs";

        public DefsViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGDefs);
            ((VirtualViewManager) this).mDelegate = new RNSVGDefsManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C3528f c3528f, String str) {
            super.setClipPath((DefsViewManager) c3528f, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C3528f c3528f, int i10) {
            super.setClipRule((DefsViewManager) c3528f, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C3528f c3528f, String str) {
            super.setDisplay((DefsViewManager) c3528f, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C3528f c3528f, String str) {
            super.setMarkerEnd((DefsViewManager) c3528f, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C3528f c3528f, String str) {
            super.setMarkerMid((DefsViewManager) c3528f, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C3528f c3528f, String str) {
            super.setMarkerStart((DefsViewManager) c3528f, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C3528f c3528f, String str) {
            super.setMask((DefsViewManager) c3528f, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C3528f c3528f, ReadableArray readableArray) {
            super.setMatrix((DefsViewManager) c3528f, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C3528f c3528f, String str) {
            super.setName((DefsViewManager) c3528f, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((DefsViewManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C3528f c3528f, String str) {
            super.setPointerEvents((DefsViewManager) c3528f, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGDefsManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C3528f c3528f, boolean z10) {
            super.setResponsible((DefsViewManager) c3528f, z10);
        }
    }

    public static class EllipseViewManager extends RenderableViewManager<C3530h> implements RNSVGEllipseManagerInterface<C3530h> {
        public static final String REACT_CLASS = "RNSVGEllipse";

        public EllipseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGEllipse);
            ((VirtualViewManager) this).mDelegate = new RNSVGEllipseManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C3530h c3530h, String str) {
            super.setClipPath((EllipseViewManager) c3530h, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C3530h c3530h, int i10) {
            super.setClipRule((EllipseViewManager) c3530h, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(C3530h c3530h, Integer num) {
            super.setColor((EllipseViewManager) c3530h, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C3530h c3530h, String str) {
            super.setDisplay((EllipseViewManager) c3530h, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(C3530h c3530h, Dynamic dynamic) {
            super.setFill((EllipseViewManager) c3530h, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C3530h c3530h, float f10) {
            super.setFillOpacity((EllipseViewManager) c3530h, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C3530h c3530h, int i10) {
            super.setFillRule((EllipseViewManager) c3530h, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(C3530h c3530h, String str) {
            super.setFilter((EllipseViewManager) c3530h, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C3530h c3530h, String str) {
            super.setMarkerEnd((EllipseViewManager) c3530h, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C3530h c3530h, String str) {
            super.setMarkerMid((EllipseViewManager) c3530h, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C3530h c3530h, String str) {
            super.setMarkerStart((EllipseViewManager) c3530h, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C3530h c3530h, String str) {
            super.setMask((EllipseViewManager) c3530h, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C3530h c3530h, ReadableArray readableArray) {
            super.setMatrix((EllipseViewManager) c3530h, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C3530h c3530h, String str) {
            super.setName((EllipseViewManager) c3530h, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((EllipseViewManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C3530h c3530h, String str) {
            super.setPointerEvents((EllipseViewManager) c3530h, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C3530h c3530h, ReadableArray readableArray) {
            super.setPropList((EllipseViewManager) c3530h, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C3530h c3530h, boolean z10) {
            super.setResponsible((EllipseViewManager) c3530h, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(C3530h c3530h, Dynamic dynamic) {
            super.setStroke((EllipseViewManager) c3530h, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C3530h c3530h, Dynamic dynamic) {
            super.setStrokeDasharray((EllipseViewManager) c3530h, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C3530h c3530h, float f10) {
            super.setStrokeDashoffset((EllipseViewManager) c3530h, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C3530h c3530h, int i10) {
            super.setStrokeLinecap((EllipseViewManager) c3530h, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C3530h c3530h, int i10) {
            super.setStrokeLinejoin((EllipseViewManager) c3530h, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C3530h c3530h, float f10) {
            super.setStrokeMiterlimit((EllipseViewManager) c3530h, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C3530h c3530h, float f10) {
            super.setStrokeOpacity((EllipseViewManager) c3530h, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(C3530h c3530h, Dynamic dynamic) {
            super.setStrokeWidth((EllipseViewManager) c3530h, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C3530h c3530h, int i10) {
            super.setVectorEffect((EllipseViewManager) c3530h, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "cx")
        public void setCx(C3530h c3530h, Dynamic dynamic) {
            c3530h.o(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "cy")
        public void setCy(C3530h c3530h, Dynamic dynamic) {
            c3530h.p(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "rx")
        public void setRx(C3530h c3530h, Dynamic dynamic) {
            c3530h.q(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface
        @ReactProp(name = "ry")
        public void setRy(C3530h c3530h, Dynamic dynamic) {
            c3530h.r(dynamic);
        }
    }

    public static class FeBlendManager extends FilterPrimitiveManager<C3532j> implements RNSVGFeBlendManagerInterface<C3532j> {
        public static final String REACT_CLASS = "RNSVGFeBlend";

        public FeBlendManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeBlend);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeBlendManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(C3532j c3532j, Dynamic dynamic) {
            super.setHeight((FeBlendManager) c3532j, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(C3532j c3532j, String str) {
            super.setResult((FeBlendManager) c3532j, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(C3532j c3532j, Dynamic dynamic) {
            super.setWidth((FeBlendManager) c3532j, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public /* bridge */ /* synthetic */ void setX(C3532j c3532j, Dynamic dynamic) {
            super.setX((FeBlendManager) c3532j, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(C3532j c3532j, Dynamic dynamic) {
            super.setY((FeBlendManager) c3532j, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "in1")
        public void setIn1(C3532j c3532j, String str) {
            c3532j.x(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "in2")
        public void setIn2(C3532j c3532j, String str) {
            c3532j.y(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeBlendManagerInterface
        @ReactProp(name = "mode")
        public void setMode(C3532j c3532j, String str) {
            c3532j.z(str);
        }
    }

    public static class FeColorMatrixManager extends FilterPrimitiveManager<C3533k> implements RNSVGFeColorMatrixManagerInterface<C3533k> {
        public static final String REACT_CLASS = "RNSVGFeColorMatrix";

        public FeColorMatrixManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeColorMatrix);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeColorMatrixManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(C3533k c3533k, Dynamic dynamic) {
            super.setHeight((FeColorMatrixManager) c3533k, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(C3533k c3533k, String str) {
            super.setResult((FeColorMatrixManager) c3533k, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(C3533k c3533k, Dynamic dynamic) {
            super.setWidth((FeColorMatrixManager) c3533k, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public /* bridge */ /* synthetic */ void setX(C3533k c3533k, Dynamic dynamic) {
            super.setX((FeColorMatrixManager) c3533k, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(C3533k c3533k, Dynamic dynamic) {
            super.setY((FeColorMatrixManager) c3533k, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "in1")
        public void setIn1(C3533k c3533k, String str) {
            c3533k.w(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = "type")
        public void setType(C3533k c3533k, String str) {
            c3533k.x(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeColorMatrixManagerInterface
        @ReactProp(name = EventKeys.VALUES_KEY)
        public void setValues(C3533k c3533k, ReadableArray readableArray) {
            c3533k.y(readableArray);
        }
    }

    public static class FeCompositeManager extends FilterPrimitiveManager<C3534l> implements RNSVGFeCompositeManagerInterface<C3534l> {
        public static final String REACT_CLASS = "RNSVGFeComposite";

        public FeCompositeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeComposite);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeCompositeManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(C3534l c3534l, Dynamic dynamic) {
            super.setHeight((FeCompositeManager) c3534l, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(C3534l c3534l, String str) {
            super.setResult((FeCompositeManager) c3534l, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(C3534l c3534l, Dynamic dynamic) {
            super.setWidth((FeCompositeManager) c3534l, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public /* bridge */ /* synthetic */ void setX(C3534l c3534l, Dynamic dynamic) {
            super.setX((FeCompositeManager) c3534l, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(C3534l c3534l, Dynamic dynamic) {
            super.setY((FeCompositeManager) c3534l, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "in1")
        public void setIn1(C3534l c3534l, String str) {
            c3534l.w(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "in2")
        public void setIn2(C3534l c3534l, String str) {
            c3534l.x(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "k1")
        public void setK1(C3534l c3534l, float f10) {
            c3534l.y(Float.valueOf(f10));
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "k2")
        public void setK2(C3534l c3534l, float f10) {
            c3534l.z(Float.valueOf(f10));
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "k3")
        public void setK3(C3534l c3534l, float f10) {
            c3534l.A(Float.valueOf(f10));
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "k4")
        public void setK4(C3534l c3534l, float f10) {
            c3534l.B(Float.valueOf(f10));
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeCompositeManagerInterface
        @ReactProp(name = "operator1")
        public void setOperator1(C3534l c3534l, String str) {
            c3534l.C(str);
        }
    }

    public static class FeFloodManager extends FilterPrimitiveManager<C3535m> implements RNSVGFeFloodManagerInterface<C3535m> {
        public static final String REACT_CLASS = "RNSVGFeFlood";

        public FeFloodManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeFlood);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeFloodManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(C3535m c3535m, Dynamic dynamic) {
            super.setHeight((FeFloodManager) c3535m, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(C3535m c3535m, String str) {
            super.setResult((FeFloodManager) c3535m, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(C3535m c3535m, Dynamic dynamic) {
            super.setWidth((FeFloodManager) c3535m, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public /* bridge */ /* synthetic */ void setX(C3535m c3535m, Dynamic dynamic) {
            super.setX((FeFloodManager) c3535m, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(C3535m c3535m, Dynamic dynamic) {
            super.setY((FeFloodManager) c3535m, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(name = "floodColor")
        public void setFloodColor(C3535m c3535m, Dynamic dynamic) {
            c3535m.w(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeFloodManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "floodOpacity")
        public void setFloodOpacity(C3535m c3535m, float f10) {
            c3535m.y(f10);
        }

        public void setFloodColor(C3535m c3535m, ReadableMap readableMap) {
            c3535m.x(readableMap);
        }
    }

    public static class FeGaussianBlurManager extends FilterPrimitiveManager<C3536n> implements RNSVGFeGaussianBlurManagerInterface<C3536n> {
        public static final String REACT_CLASS = "RNSVGFeGaussianBlur";

        public FeGaussianBlurManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeGaussianBlur);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeGaussianBlurManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(C3536n c3536n, Dynamic dynamic) {
            super.setHeight((FeGaussianBlurManager) c3536n, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(C3536n c3536n, String str) {
            super.setResult((FeGaussianBlurManager) c3536n, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(C3536n c3536n, Dynamic dynamic) {
            super.setWidth((FeGaussianBlurManager) c3536n, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public /* bridge */ /* synthetic */ void setX(C3536n c3536n, Dynamic dynamic) {
            super.setX((FeGaussianBlurManager) c3536n, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(C3536n c3536n, Dynamic dynamic) {
            super.setY((FeGaussianBlurManager) c3536n, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = EventKeys.VALUES_KEY)
        public void setEdgeMode(C3536n c3536n, String str) {
            c3536n.x(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "in1")
        public void setIn1(C3536n c3536n, String str) {
            c3536n.y(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "stdDeviationX")
        public void setStdDeviationX(C3536n c3536n, float f10) {
            c3536n.z(f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeGaussianBlurManagerInterface
        @ReactProp(name = "stdDeviationY")
        public void setStdDeviationY(C3536n c3536n, float f10) {
            c3536n.A(f10);
        }
    }

    public static class FeMergeManager extends FilterPrimitiveManager<C3537o> implements RNSVGFeMergeManagerInterface<C3537o> {
        public static final String REACT_CLASS = "RNSVGFeMerge";

        public FeMergeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeMerge);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeMergeManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(C3537o c3537o, Dynamic dynamic) {
            super.setHeight((FeMergeManager) c3537o, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(C3537o c3537o, String str) {
            super.setResult((FeMergeManager) c3537o, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(C3537o c3537o, Dynamic dynamic) {
            super.setWidth((FeMergeManager) c3537o, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public /* bridge */ /* synthetic */ void setX(C3537o c3537o, Dynamic dynamic) {
            super.setX((FeMergeManager) c3537o, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(C3537o c3537o, Dynamic dynamic) {
            super.setY((FeMergeManager) c3537o, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeMergeManagerInterface
        @ReactProp(name = "nodes")
        public void setNodes(C3537o c3537o, ReadableArray readableArray) {
            c3537o.w(readableArray);
        }
    }

    public static class FeOffsetManager extends FilterPrimitiveManager<C3538p> implements RNSVGFeOffsetManagerInterface<C3538p> {
        public static final String REACT_CLASS = "RNSVGFeOffset";

        public FeOffsetManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeOffset);
            ((VirtualViewManager) this).mDelegate = new RNSVGFeOffsetManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(C3538p c3538p, Dynamic dynamic) {
            super.setHeight((FeOffsetManager) c3538p, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "result")
        public /* bridge */ /* synthetic */ void setResult(C3538p c3538p, String str) {
            super.setResult((FeOffsetManager) c3538p, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(C3538p c3538p, Dynamic dynamic) {
            super.setWidth((FeOffsetManager) c3538p, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public /* bridge */ /* synthetic */ void setX(C3538p c3538p, Dynamic dynamic) {
            super.setX((FeOffsetManager) c3538p, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(C3538p c3538p, Dynamic dynamic) {
            super.setY((FeOffsetManager) c3538p, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "dx")
        public void setDx(C3538p c3538p, Dynamic dynamic) {
            c3538p.w(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "dy")
        public void setDy(C3538p c3538p, Dynamic dynamic) {
            c3538p.x(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFeOffsetManagerInterface
        @ReactProp(name = "in1")
        public void setIn1(C3538p c3538p, String str) {
            c3538p.y(str);
        }
    }

    public static class FilterManager extends VirtualViewManager<C3545w> implements RNSVGFilterManagerInterface<C3545w> {
        public static final String REACT_CLASS = "RNSVGFilter";

        public FilterManager() {
            super(VirtualViewManager.SVGClass.RNSVGFilter);
            ((VirtualViewManager) this).mDelegate = new RNSVGFilterManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C3545w c3545w, String str) {
            super.setName((FilterManager) c3545w, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = "filterUnits")
        public void setFilterUnits(C3545w c3545w, String str) {
            c3545w.p(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = "height")
        public void setHeight(C3545w c3545w, Dynamic dynamic) {
            c3545w.q(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = "primitiveUnits")
        public void setPrimitiveUnits(C3545w c3545w, String str) {
            c3545w.r(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = "width")
        public void setWidth(C3545w c3545w, Dynamic dynamic) {
            c3545w.s(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public void setX(C3545w c3545w, Dynamic dynamic) {
            c3545w.t(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGFilterManagerInterface
        @ReactProp(name = "y")
        public void setY(C3545w c3545w, Dynamic dynamic) {
            c3545w.u(dynamic);
        }
    }

    public static class FilterPrimitiveManager<T extends AbstractC3539q> extends VirtualViewManager<T> {
        public FilterPrimitiveManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @ReactProp(name = "height")
        public void setHeight(T t10, Dynamic dynamic) {
            t10.r(dynamic);
        }

        @ReactProp(name = "result")
        public void setResult(T t10, String str) {
            t10.s(str);
        }

        @ReactProp(name = "width")
        public void setWidth(T t10, Dynamic dynamic) {
            t10.t(dynamic);
        }

        @ReactProp(name = C5444x.f55808b)
        public void setX(T t10, Dynamic dynamic) {
            t10.u(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(T t10, Dynamic dynamic) {
            t10.v(dynamic);
        }
    }

    public static class ForeignObjectManager extends GroupViewManagerAbstract<C3547y> implements RNSVGForeignObjectManagerInterface<C3547y> {
        public static final String REACT_CLASS = "RNSVGForeignObject";

        public ForeignObjectManager() {
            super(VirtualViewManager.SVGClass.RNSVGForeignObject);
            ((VirtualViewManager) this).mDelegate = new RNSVGForeignObjectManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C3547y c3547y, String str) {
            super.setClipPath((ForeignObjectManager) c3547y, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C3547y c3547y, int i10) {
            super.setClipRule((ForeignObjectManager) c3547y, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(C3547y c3547y, Integer num) {
            super.setColor((ForeignObjectManager) c3547y, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C3547y c3547y, String str) {
            super.setDisplay((ForeignObjectManager) c3547y, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(C3547y c3547y, Dynamic dynamic) {
            super.setFill((ForeignObjectManager) c3547y, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C3547y c3547y, float f10) {
            super.setFillOpacity((ForeignObjectManager) c3547y, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C3547y c3547y, int i10) {
            super.setFillRule((ForeignObjectManager) c3547y, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(C3547y c3547y, String str) {
            super.setFilter((ForeignObjectManager) c3547y, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(C3547y c3547y, Dynamic dynamic) {
            super.setFont((ForeignObjectManager) c3547y, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(C3547y c3547y, Dynamic dynamic) {
            super.setFontSize((ForeignObjectManager) c3547y, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(C3547y c3547y, Dynamic dynamic) {
            super.setFontWeight((ForeignObjectManager) c3547y, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C3547y c3547y, String str) {
            super.setMarkerEnd((ForeignObjectManager) c3547y, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C3547y c3547y, String str) {
            super.setMarkerMid((ForeignObjectManager) c3547y, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C3547y c3547y, String str) {
            super.setMarkerStart((ForeignObjectManager) c3547y, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C3547y c3547y, String str) {
            super.setMask((ForeignObjectManager) c3547y, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C3547y c3547y, ReadableArray readableArray) {
            super.setMatrix((ForeignObjectManager) c3547y, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C3547y c3547y, String str) {
            super.setName((ForeignObjectManager) c3547y, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((ForeignObjectManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C3547y c3547y, String str) {
            super.setPointerEvents((ForeignObjectManager) c3547y, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C3547y c3547y, ReadableArray readableArray) {
            super.setPropList((ForeignObjectManager) c3547y, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C3547y c3547y, boolean z10) {
            super.setResponsible((ForeignObjectManager) c3547y, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(C3547y c3547y, Dynamic dynamic) {
            super.setStroke((ForeignObjectManager) c3547y, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C3547y c3547y, Dynamic dynamic) {
            super.setStrokeDasharray((ForeignObjectManager) c3547y, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C3547y c3547y, float f10) {
            super.setStrokeDashoffset((ForeignObjectManager) c3547y, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C3547y c3547y, int i10) {
            super.setStrokeLinecap((ForeignObjectManager) c3547y, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C3547y c3547y, int i10) {
            super.setStrokeLinejoin((ForeignObjectManager) c3547y, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C3547y c3547y, float f10) {
            super.setStrokeMiterlimit((ForeignObjectManager) c3547y, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C3547y c3547y, float f10) {
            super.setStrokeOpacity((ForeignObjectManager) c3547y, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(C3547y c3547y, Dynamic dynamic) {
            super.setStrokeWidth((ForeignObjectManager) c3547y, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C3547y c3547y, int i10) {
            super.setVectorEffect((ForeignObjectManager) c3547y, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "height")
        public void setHeight(C3547y c3547y, Dynamic dynamic) {
            c3547y.z(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "width")
        public void setWidth(C3547y c3547y, Dynamic dynamic) {
            c3547y.A(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public void setX(C3547y c3547y, Dynamic dynamic) {
            c3547y.B(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface
        @ReactProp(name = "y")
        public void setY(C3547y c3547y, Dynamic dynamic) {
            c3547y.C(dynamic);
        }
    }

    public static class GroupViewManager extends GroupViewManagerAbstract<B> implements RNSVGGroupManagerInterface<B> {
        public static final String REACT_CLASS = "RNSVGGroup";

        public GroupViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGGroup);
            ((VirtualViewManager) this).mDelegate = new RNSVGGroupManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(B b10, String str) {
            super.setClipPath((GroupViewManager) b10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(B b10, int i10) {
            super.setClipRule((GroupViewManager) b10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(B b10, Integer num) {
            super.setColor((GroupViewManager) b10, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(B b10, String str) {
            super.setDisplay((GroupViewManager) b10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(B b10, Dynamic dynamic) {
            super.setFill((GroupViewManager) b10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(B b10, float f10) {
            super.setFillOpacity((GroupViewManager) b10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(B b10, int i10) {
            super.setFillRule((GroupViewManager) b10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(B b10, String str) {
            super.setFilter((GroupViewManager) b10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(B b10, Dynamic dynamic) {
            super.setFont((GroupViewManager) b10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(B b10, Dynamic dynamic) {
            super.setFontSize((GroupViewManager) b10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(B b10, Dynamic dynamic) {
            super.setFontWeight((GroupViewManager) b10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(B b10, String str) {
            super.setMarkerEnd((GroupViewManager) b10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(B b10, String str) {
            super.setMarkerMid((GroupViewManager) b10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(B b10, String str) {
            super.setMarkerStart((GroupViewManager) b10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(B b10, String str) {
            super.setMask((GroupViewManager) b10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(B b10, ReadableArray readableArray) {
            super.setMatrix((GroupViewManager) b10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(B b10, String str) {
            super.setName((GroupViewManager) b10, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((GroupViewManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(B b10, String str) {
            super.setPointerEvents((GroupViewManager) b10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(B b10, ReadableArray readableArray) {
            super.setPropList((GroupViewManager) b10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(B b10, boolean z10) {
            super.setResponsible((GroupViewManager) b10, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(B b10, Dynamic dynamic) {
            super.setStroke((GroupViewManager) b10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(B b10, Dynamic dynamic) {
            super.setStrokeDasharray((GroupViewManager) b10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(B b10, float f10) {
            super.setStrokeDashoffset((GroupViewManager) b10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(B b10, int i10) {
            super.setStrokeLinecap((GroupViewManager) b10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(B b10, int i10) {
            super.setStrokeLinejoin((GroupViewManager) b10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(B b10, float f10) {
            super.setStrokeMiterlimit((GroupViewManager) b10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(B b10, float f10) {
            super.setStrokeOpacity((GroupViewManager) b10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(B b10, Dynamic dynamic) {
            super.setStrokeWidth((GroupViewManager) b10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGGroupManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(B b10, int i10) {
            super.setVectorEffect((GroupViewManager) b10, i10);
        }
    }

    public static class GroupViewManagerAbstract<U extends B> extends RenderableViewManager<U> {
        public GroupViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @ReactProp(name = "font")
        public void setFont(U u10, Dynamic dynamic) {
            u10.w(dynamic);
        }

        @ReactProp(name = ViewProps.FONT_SIZE)
        public void setFontSize(U u10, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i10 = a.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
            if (i10 == 1) {
                javaOnlyMap.putDouble(ViewProps.FONT_SIZE, dynamic.asDouble());
            } else if (i10 != 2) {
                return;
            } else {
                javaOnlyMap.putString(ViewProps.FONT_SIZE, dynamic.asString());
            }
            u10.x(javaOnlyMap);
        }

        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public void setFontWeight(U u10, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i10 = a.$SwitchMap$com$facebook$react$bridge$ReadableType[dynamic.getType().ordinal()];
            if (i10 == 1) {
                javaOnlyMap.putDouble(ViewProps.FONT_WEIGHT, dynamic.asDouble());
            } else if (i10 != 2) {
                return;
            } else {
                javaOnlyMap.putString(ViewProps.FONT_WEIGHT, dynamic.asString());
            }
            u10.x(javaOnlyMap);
        }
    }

    public static class ImageViewManager extends RenderableViewManager<C> implements RNSVGImageManagerInterface<C> {
        public static final String REACT_CLASS = "RNSVGImage";

        public ImageViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGImage);
            ((VirtualViewManager) this).mDelegate = new RNSVGImageManagerDelegate(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            HashMap hashMap = new HashMap();
            hashMap.put(SvgLoadEvent.EVENT_NAME, MapBuilder.of("registrationName", "onLoad"));
            return hashMap;
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(C c10, String str) {
            super.setClipPath((ImageViewManager) c10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(C c10, int i10) {
            super.setClipRule((ImageViewManager) c10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(C c10, Integer num) {
            super.setColor((ImageViewManager) c10, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(C c10, String str) {
            super.setDisplay((ImageViewManager) c10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(C c10, Dynamic dynamic) {
            super.setFill((ImageViewManager) c10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(C c10, float f10) {
            super.setFillOpacity((ImageViewManager) c10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(C c10, int i10) {
            super.setFillRule((ImageViewManager) c10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(C c10, String str) {
            super.setFilter((ImageViewManager) c10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(C c10, String str) {
            super.setMarkerEnd((ImageViewManager) c10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(C c10, String str) {
            super.setMarkerMid((ImageViewManager) c10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(C c10, String str) {
            super.setMarkerStart((ImageViewManager) c10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(C c10, String str) {
            super.setMask((ImageViewManager) c10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(C c10, ReadableArray readableArray) {
            super.setMatrix((ImageViewManager) c10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(C c10, String str) {
            super.setName((ImageViewManager) c10, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((ImageViewManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(C c10, String str) {
            super.setPointerEvents((ImageViewManager) c10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(C c10, ReadableArray readableArray) {
            super.setPropList((ImageViewManager) c10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(C c10, boolean z10) {
            super.setResponsible((ImageViewManager) c10, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(C c10, Dynamic dynamic) {
            super.setStroke((ImageViewManager) c10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(C c10, Dynamic dynamic) {
            super.setStrokeDasharray((ImageViewManager) c10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(C c10, float f10) {
            super.setStrokeDashoffset((ImageViewManager) c10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(C c10, int i10) {
            super.setStrokeLinecap((ImageViewManager) c10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(C c10, int i10) {
            super.setStrokeLinejoin((ImageViewManager) c10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(C c10, float f10) {
            super.setStrokeMiterlimit((ImageViewManager) c10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(C c10, float f10) {
            super.setStrokeOpacity((ImageViewManager) c10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(C c10, Dynamic dynamic) {
            super.setStrokeWidth((ImageViewManager) c10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(C c10, int i10) {
            super.setVectorEffect((ImageViewManager) c10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "align")
        public void setAlign(C c10, String str) {
            c10.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "height")
        public void setHeight(C c10, Dynamic dynamic) {
            c10.t(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(C c10, int i10) {
            c10.setMeetOrSlice(i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(customType = "ImageSource", name = "src")
        public void setSrc(C c10, ReadableMap readableMap) {
            c10.u(readableMap);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "width")
        public void setWidth(C c10, Dynamic dynamic) {
            c10.v(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public void setX(C c10, Dynamic dynamic) {
            c10.w(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGImageManagerInterface
        @ReactProp(name = "y")
        public void setY(C c10, Dynamic dynamic) {
            c10.x(dynamic);
        }
    }

    public static class LineViewManager extends RenderableViewManager<D> implements RNSVGLineManagerInterface<D> {
        public static final String REACT_CLASS = "RNSVGLine";

        public LineViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGLine);
            ((VirtualViewManager) this).mDelegate = new RNSVGLineManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(D d10, String str) {
            super.setClipPath((LineViewManager) d10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(D d10, int i10) {
            super.setClipRule((LineViewManager) d10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(D d10, Integer num) {
            super.setColor((LineViewManager) d10, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(D d10, String str) {
            super.setDisplay((LineViewManager) d10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(D d10, Dynamic dynamic) {
            super.setFill((LineViewManager) d10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(D d10, float f10) {
            super.setFillOpacity((LineViewManager) d10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(D d10, int i10) {
            super.setFillRule((LineViewManager) d10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(D d10, String str) {
            super.setFilter((LineViewManager) d10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(D d10, String str) {
            super.setMarkerEnd((LineViewManager) d10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(D d10, String str) {
            super.setMarkerMid((LineViewManager) d10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(D d10, String str) {
            super.setMarkerStart((LineViewManager) d10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(D d10, String str) {
            super.setMask((LineViewManager) d10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(D d10, ReadableArray readableArray) {
            super.setMatrix((LineViewManager) d10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(D d10, String str) {
            super.setName((LineViewManager) d10, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((LineViewManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(D d10, String str) {
            super.setPointerEvents((LineViewManager) d10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(D d10, ReadableArray readableArray) {
            super.setPropList((LineViewManager) d10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(D d10, boolean z10) {
            super.setResponsible((LineViewManager) d10, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(D d10, Dynamic dynamic) {
            super.setStroke((LineViewManager) d10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(D d10, Dynamic dynamic) {
            super.setStrokeDasharray((LineViewManager) d10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(D d10, float f10) {
            super.setStrokeDashoffset((LineViewManager) d10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(D d10, int i10) {
            super.setStrokeLinecap((LineViewManager) d10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(D d10, int i10) {
            super.setStrokeLinejoin((LineViewManager) d10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(D d10, float f10) {
            super.setStrokeMiterlimit((LineViewManager) d10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(D d10, float f10) {
            super.setStrokeOpacity((LineViewManager) d10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(D d10, Dynamic dynamic) {
            super.setStrokeWidth((LineViewManager) d10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(D d10, int i10) {
            super.setVectorEffect((LineViewManager) d10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "x1")
        public void setX1(D d10, Dynamic dynamic) {
            d10.o(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "x2")
        public void setX2(D d10, Dynamic dynamic) {
            d10.p(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "y1")
        public void setY1(D d10, Dynamic dynamic) {
            d10.q(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLineManagerInterface
        @ReactProp(name = "y2")
        public void setY2(D d10, Dynamic dynamic) {
            d10.r(dynamic);
        }
    }

    public static class LinearGradientManager extends VirtualViewManager<E> implements RNSVGLinearGradientManagerInterface<E> {
        public static final String REACT_CLASS = "RNSVGLinearGradient";

        public LinearGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGLinearGradient);
            ((VirtualViewManager) this).mDelegate = new RNSVGLinearGradientManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(E e10, String str) {
            super.setClipPath((LinearGradientManager) e10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(E e10, int i10) {
            super.setClipRule((LinearGradientManager) e10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(E e10, String str) {
            super.setDisplay((LinearGradientManager) e10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(E e10, String str) {
            super.setMarkerEnd((LinearGradientManager) e10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(E e10, String str) {
            super.setMarkerMid((LinearGradientManager) e10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(E e10, String str) {
            super.setMarkerStart((LinearGradientManager) e10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(E e10, String str) {
            super.setMask((LinearGradientManager) e10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(E e10, ReadableArray readableArray) {
            super.setMatrix((LinearGradientManager) e10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(E e10, String str) {
            super.setName((LinearGradientManager) e10, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((LinearGradientManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(E e10, String str) {
            super.setPointerEvents((LinearGradientManager) e10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(E e10, boolean z10) {
            super.setResponsible((LinearGradientManager) e10, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "gradient")
        public void setGradient(E e10, ReadableArray readableArray) {
            e10.o(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "gradientTransform")
        public void setGradientTransform(E e10, ReadableArray readableArray) {
            e10.p(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "gradientUnits")
        public void setGradientUnits(E e10, int i10) {
            e10.q(i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "x1")
        public void setX1(E e10, Dynamic dynamic) {
            e10.r(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "x2")
        public void setX2(E e10, Dynamic dynamic) {
            e10.s(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "y1")
        public void setY1(E e10, Dynamic dynamic) {
            e10.t(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface
        @ReactProp(name = "y2")
        public void setY2(E e10, Dynamic dynamic) {
            e10.u(dynamic);
        }
    }

    public static class MarkerManager extends GroupViewManagerAbstract<F> implements RNSVGMarkerManagerInterface<F> {
        public static final String REACT_CLASS = "RNSVGMarker";

        public MarkerManager() {
            super(VirtualViewManager.SVGClass.RNSVGMarker);
            ((VirtualViewManager) this).mDelegate = new RNSVGMarkerManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(F f10, String str) {
            super.setClipPath((MarkerManager) f10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(F f10, int i10) {
            super.setClipRule((MarkerManager) f10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(F f10, Integer num) {
            super.setColor((MarkerManager) f10, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(F f10, String str) {
            super.setDisplay((MarkerManager) f10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(F f10, Dynamic dynamic) {
            super.setFill((MarkerManager) f10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(F f10, float f11) {
            super.setFillOpacity((MarkerManager) f10, f11);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(F f10, int i10) {
            super.setFillRule((MarkerManager) f10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(F f10, String str) {
            super.setFilter((MarkerManager) f10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(F f10, Dynamic dynamic) {
            super.setFont((MarkerManager) f10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(F f10, Dynamic dynamic) {
            super.setFontSize((MarkerManager) f10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(F f10, Dynamic dynamic) {
            super.setFontWeight((MarkerManager) f10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(F f10, String str) {
            super.setMarkerEnd((MarkerManager) f10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(F f10, String str) {
            super.setMarkerMid((MarkerManager) f10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(F f10, String str) {
            super.setMarkerStart((MarkerManager) f10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(F f10, String str) {
            super.setMask((MarkerManager) f10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(F f10, ReadableArray readableArray) {
            super.setMatrix((MarkerManager) f10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(F f10, String str) {
            super.setName((MarkerManager) f10, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((MarkerManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(F f10, String str) {
            super.setPointerEvents((MarkerManager) f10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(F f10, ReadableArray readableArray) {
            super.setPropList((MarkerManager) f10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(F f10, boolean z10) {
            super.setResponsible((MarkerManager) f10, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(F f10, Dynamic dynamic) {
            super.setStroke((MarkerManager) f10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(F f10, Dynamic dynamic) {
            super.setStrokeDasharray((MarkerManager) f10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(F f10, float f11) {
            super.setStrokeDashoffset((MarkerManager) f10, f11);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(F f10, int i10) {
            super.setStrokeLinecap((MarkerManager) f10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(F f10, int i10) {
            super.setStrokeLinejoin((MarkerManager) f10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(F f10, float f11) {
            super.setStrokeMiterlimit((MarkerManager) f10, f11);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(F f10, float f11) {
            super.setStrokeOpacity((MarkerManager) f10, f11);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(F f10, Dynamic dynamic) {
            super.setStrokeWidth((MarkerManager) f10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(F f10, int i10) {
            super.setVectorEffect((MarkerManager) f10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "align")
        public void setAlign(F f10, String str) {
            f10.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerHeight")
        public void setMarkerHeight(F f10, Dynamic dynamic) {
            f10.A(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerUnits")
        public void setMarkerUnits(F f10, String str) {
            f10.B(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "markerWidth")
        public void setMarkerWidth(F f10, Dynamic dynamic) {
            f10.C(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(F f10, int i10) {
            f10.setMeetOrSlice(i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "minX")
        public void setMinX(F f10, float f11) {
            f10.setMinX(f11);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "minY")
        public void setMinY(F f10, float f11) {
            f10.setMinY(f11);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "orient")
        public void setOrient(F f10, String str) {
            f10.D(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "refX")
        public void setRefX(F f10, Dynamic dynamic) {
            f10.E(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "refY")
        public void setRefY(F f10, Dynamic dynamic) {
            f10.F(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "vbHeight")
        public void setVbHeight(F f10, float f11) {
            f10.setVbHeight(f11);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface
        @ReactProp(name = "vbWidth")
        public void setVbWidth(F f10, float f11) {
            f10.setVbWidth(f11);
        }
    }

    public static class MaskManager extends GroupViewManagerAbstract<G> implements RNSVGMaskManagerInterface<G> {
        public static final String REACT_CLASS = "RNSVGMask";

        public MaskManager() {
            super(VirtualViewManager.SVGClass.RNSVGMask);
            ((VirtualViewManager) this).mDelegate = new RNSVGMaskManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(G g10, String str) {
            super.setClipPath((MaskManager) g10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(G g10, int i10) {
            super.setClipRule((MaskManager) g10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(G g10, Integer num) {
            super.setColor((MaskManager) g10, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(G g10, String str) {
            super.setDisplay((MaskManager) g10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(G g10, Dynamic dynamic) {
            super.setFill((MaskManager) g10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(G g10, float f10) {
            super.setFillOpacity((MaskManager) g10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(G g10, int i10) {
            super.setFillRule((MaskManager) g10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(G g10, String str) {
            super.setFilter((MaskManager) g10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(G g10, Dynamic dynamic) {
            super.setFont((MaskManager) g10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(G g10, Dynamic dynamic) {
            super.setFontSize((MaskManager) g10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(G g10, Dynamic dynamic) {
            super.setFontWeight((MaskManager) g10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(G g10, String str) {
            super.setMarkerEnd((MaskManager) g10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(G g10, String str) {
            super.setMarkerMid((MaskManager) g10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(G g10, String str) {
            super.setMarkerStart((MaskManager) g10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(G g10, String str) {
            super.setMask((MaskManager) g10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(G g10, ReadableArray readableArray) {
            super.setMatrix((MaskManager) g10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(G g10, String str) {
            super.setName((MaskManager) g10, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((MaskManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(G g10, String str) {
            super.setPointerEvents((MaskManager) g10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(G g10, ReadableArray readableArray) {
            super.setPropList((MaskManager) g10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(G g10, boolean z10) {
            super.setResponsible((MaskManager) g10, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(G g10, Dynamic dynamic) {
            super.setStroke((MaskManager) g10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(G g10, Dynamic dynamic) {
            super.setStrokeDasharray((MaskManager) g10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(G g10, float f10) {
            super.setStrokeDashoffset((MaskManager) g10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(G g10, int i10) {
            super.setStrokeLinecap((MaskManager) g10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(G g10, int i10) {
            super.setStrokeLinejoin((MaskManager) g10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(G g10, float f10) {
            super.setStrokeMiterlimit((MaskManager) g10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(G g10, float f10) {
            super.setStrokeOpacity((MaskManager) g10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(G g10, Dynamic dynamic) {
            super.setStrokeWidth((MaskManager) g10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(G g10, int i10) {
            super.setVectorEffect((MaskManager) g10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "height")
        public void setHeight(G g10, Dynamic dynamic) {
            g10.B(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "maskContentUnits")
        public void setMaskContentUnits(G g10, int i10) {
            g10.C(i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "maskType")
        public void setMaskType(G g10, int i10) {
            g10.D(i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "maskUnits")
        public void setMaskUnits(G g10, int i10) {
            g10.E(i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "width")
        public void setWidth(G g10, Dynamic dynamic) {
            g10.F(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public void setX(G g10, Dynamic dynamic) {
            g10.G(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGMaskManagerInterface
        @ReactProp(name = "y")
        public void setY(G g10, Dynamic dynamic) {
            g10.H(dynamic);
        }
    }

    public static class PathViewManager extends RenderableViewManager<J> implements RNSVGPathManagerInterface<J> {
        public static final String REACT_CLASS = "RNSVGPath";

        public PathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGPath);
            ((VirtualViewManager) this).mDelegate = new RNSVGPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(J j10, String str) {
            super.setClipPath((PathViewManager) j10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(J j10, int i10) {
            super.setClipRule((PathViewManager) j10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(J j10, Integer num) {
            super.setColor((PathViewManager) j10, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(J j10, String str) {
            super.setDisplay((PathViewManager) j10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(J j10, Dynamic dynamic) {
            super.setFill((PathViewManager) j10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(J j10, float f10) {
            super.setFillOpacity((PathViewManager) j10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(J j10, int i10) {
            super.setFillRule((PathViewManager) j10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(J j10, String str) {
            super.setFilter((PathViewManager) j10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(J j10, String str) {
            super.setMarkerEnd((PathViewManager) j10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(J j10, String str) {
            super.setMarkerMid((PathViewManager) j10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(J j10, String str) {
            super.setMarkerStart((PathViewManager) j10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(J j10, String str) {
            super.setMask((PathViewManager) j10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(J j10, ReadableArray readableArray) {
            super.setMatrix((PathViewManager) j10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(J j10, String str) {
            super.setName((PathViewManager) j10, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((PathViewManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(J j10, String str) {
            super.setPointerEvents((PathViewManager) j10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(J j10, ReadableArray readableArray) {
            super.setPropList((PathViewManager) j10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(J j10, boolean z10) {
            super.setResponsible((PathViewManager) j10, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(J j10, Dynamic dynamic) {
            super.setStroke((PathViewManager) j10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(J j10, Dynamic dynamic) {
            super.setStrokeDasharray((PathViewManager) j10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(J j10, float f10) {
            super.setStrokeDashoffset((PathViewManager) j10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(J j10, int i10) {
            super.setStrokeLinecap((PathViewManager) j10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(J j10, int i10) {
            super.setStrokeLinejoin((PathViewManager) j10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(J j10, float f10) {
            super.setStrokeMiterlimit((PathViewManager) j10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(J j10, float f10) {
            super.setStrokeOpacity((PathViewManager) j10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(J j10, Dynamic dynamic) {
            super.setStrokeWidth((PathViewManager) j10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(J j10, int i10) {
            super.setVectorEffect((PathViewManager) j10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPathManagerInterface
        @ReactProp(name = W9.d.f13160a)
        public void setD(J j10, String str) {
            j10.o(str);
        }
    }

    public static class PatternManager extends GroupViewManagerAbstract<K> implements RNSVGPatternManagerInterface<K> {
        public static final String REACT_CLASS = "RNSVGPattern";

        public PatternManager() {
            super(VirtualViewManager.SVGClass.RNSVGPattern);
            ((VirtualViewManager) this).mDelegate = new RNSVGPatternManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(K k10, String str) {
            super.setClipPath((PatternManager) k10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(K k10, int i10) {
            super.setClipRule((PatternManager) k10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(K k10, Integer num) {
            super.setColor((PatternManager) k10, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(K k10, String str) {
            super.setDisplay((PatternManager) k10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(K k10, Dynamic dynamic) {
            super.setFill((PatternManager) k10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(K k10, float f10) {
            super.setFillOpacity((PatternManager) k10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(K k10, int i10) {
            super.setFillRule((PatternManager) k10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(K k10, String str) {
            super.setFilter((PatternManager) k10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(K k10, Dynamic dynamic) {
            super.setFont((PatternManager) k10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(K k10, Dynamic dynamic) {
            super.setFontSize((PatternManager) k10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(K k10, Dynamic dynamic) {
            super.setFontWeight((PatternManager) k10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(K k10, String str) {
            super.setMarkerEnd((PatternManager) k10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(K k10, String str) {
            super.setMarkerMid((PatternManager) k10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(K k10, String str) {
            super.setMarkerStart((PatternManager) k10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(K k10, String str) {
            super.setMask((PatternManager) k10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(K k10, ReadableArray readableArray) {
            super.setMatrix((PatternManager) k10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(K k10, String str) {
            super.setName((PatternManager) k10, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((PatternManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(K k10, String str) {
            super.setPointerEvents((PatternManager) k10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(K k10, ReadableArray readableArray) {
            super.setPropList((PatternManager) k10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(K k10, boolean z10) {
            super.setResponsible((PatternManager) k10, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(K k10, Dynamic dynamic) {
            super.setStroke((PatternManager) k10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(K k10, Dynamic dynamic) {
            super.setStrokeDasharray((PatternManager) k10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(K k10, float f10) {
            super.setStrokeDashoffset((PatternManager) k10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(K k10, int i10) {
            super.setStrokeLinecap((PatternManager) k10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(K k10, int i10) {
            super.setStrokeLinejoin((PatternManager) k10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(K k10, float f10) {
            super.setStrokeMiterlimit((PatternManager) k10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(K k10, float f10) {
            super.setStrokeOpacity((PatternManager) k10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(K k10, Dynamic dynamic) {
            super.setStrokeWidth((PatternManager) k10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(K k10, int i10) {
            super.setVectorEffect((PatternManager) k10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "align")
        public void setAlign(K k10, String str) {
            k10.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "height")
        public void setHeight(K k10, Dynamic dynamic) {
            k10.z(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(K k10, int i10) {
            k10.setMeetOrSlice(i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "minX")
        public void setMinX(K k10, float f10) {
            k10.setMinX(f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "minY")
        public void setMinY(K k10, float f10) {
            k10.setMinY(f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "patternContentUnits")
        public void setPatternContentUnits(K k10, int i10) {
            k10.A(i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "patternTransform")
        public void setPatternTransform(K k10, ReadableArray readableArray) {
            k10.B(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "patternUnits")
        public void setPatternUnits(K k10, int i10) {
            k10.C(i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "vbHeight")
        public void setVbHeight(K k10, float f10) {
            k10.setVbHeight(f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "vbWidth")
        public void setVbWidth(K k10, float f10) {
            k10.setVbWidth(f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "width")
        public void setWidth(K k10, Dynamic dynamic) {
            k10.D(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public void setX(K k10, Dynamic dynamic) {
            k10.E(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGPatternManagerInterface
        @ReactProp(name = "y")
        public void setY(K k10, Dynamic dynamic) {
            k10.F(dynamic);
        }
    }

    public static class RadialGradientManager extends VirtualViewManager<P> implements RNSVGRadialGradientManagerInterface<P> {
        public static final String REACT_CLASS = "RNSVGRadialGradient";

        public RadialGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGRadialGradient);
            ((VirtualViewManager) this).mDelegate = new RNSVGRadialGradientManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(P p10, String str) {
            super.setClipPath((RadialGradientManager) p10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(P p10, int i10) {
            super.setClipRule((RadialGradientManager) p10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(P p10, String str) {
            super.setDisplay((RadialGradientManager) p10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(P p10, String str) {
            super.setMarkerEnd((RadialGradientManager) p10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(P p10, String str) {
            super.setMarkerMid((RadialGradientManager) p10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(P p10, String str) {
            super.setMarkerStart((RadialGradientManager) p10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(P p10, String str) {
            super.setMask((RadialGradientManager) p10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(P p10, ReadableArray readableArray) {
            super.setMatrix((RadialGradientManager) p10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(P p10, String str) {
            super.setName((RadialGradientManager) p10, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((RadialGradientManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(P p10, String str) {
            super.setPointerEvents((RadialGradientManager) p10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(P p10, boolean z10) {
            super.setResponsible((RadialGradientManager) p10, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "cx")
        public void setCx(P p10, Dynamic dynamic) {
            p10.o(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "cy")
        public void setCy(P p10, Dynamic dynamic) {
            p10.p(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "fx")
        public void setFx(P p10, Dynamic dynamic) {
            p10.q(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "fy")
        public void setFy(P p10, Dynamic dynamic) {
            p10.r(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "gradient")
        public void setGradient(P p10, ReadableArray readableArray) {
            p10.s(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "gradientTransform")
        public void setGradientTransform(P p10, ReadableArray readableArray) {
            p10.t(readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "gradientUnits")
        public void setGradientUnits(P p10, int i10) {
            p10.u(i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "rx")
        public void setRx(P p10, Dynamic dynamic) {
            p10.v(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface
        @ReactProp(name = "ry")
        public void setRy(P p10, Dynamic dynamic) {
            p10.w(dynamic);
        }
    }

    public static class RectViewManager extends RenderableViewManager<Q> implements RNSVGRectManagerInterface<Q> {
        public static final String REACT_CLASS = "RNSVGRect";

        public RectViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGRect);
            ((VirtualViewManager) this).mDelegate = new RNSVGRectManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(Q q10, String str) {
            super.setClipPath((RectViewManager) q10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(Q q10, int i10) {
            super.setClipRule((RectViewManager) q10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(Q q10, Integer num) {
            super.setColor((RectViewManager) q10, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(Q q10, String str) {
            super.setDisplay((RectViewManager) q10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(Q q10, Dynamic dynamic) {
            super.setFill((RectViewManager) q10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(Q q10, float f10) {
            super.setFillOpacity((RectViewManager) q10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(Q q10, int i10) {
            super.setFillRule((RectViewManager) q10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(Q q10, String str) {
            super.setFilter((RectViewManager) q10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(Q q10, String str) {
            super.setMarkerEnd((RectViewManager) q10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(Q q10, String str) {
            super.setMarkerMid((RectViewManager) q10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(Q q10, String str) {
            super.setMarkerStart((RectViewManager) q10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(Q q10, String str) {
            super.setMask((RectViewManager) q10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(Q q10, ReadableArray readableArray) {
            super.setMatrix((RectViewManager) q10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(Q q10, String str) {
            super.setName((RectViewManager) q10, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((RectViewManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(Q q10, String str) {
            super.setPointerEvents((RectViewManager) q10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(Q q10, ReadableArray readableArray) {
            super.setPropList((RectViewManager) q10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(Q q10, boolean z10) {
            super.setResponsible((RectViewManager) q10, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(Q q10, Dynamic dynamic) {
            super.setStroke((RectViewManager) q10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(Q q10, Dynamic dynamic) {
            super.setStrokeDasharray((RectViewManager) q10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(Q q10, float f10) {
            super.setStrokeDashoffset((RectViewManager) q10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(Q q10, int i10) {
            super.setStrokeLinecap((RectViewManager) q10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(Q q10, int i10) {
            super.setStrokeLinejoin((RectViewManager) q10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(Q q10, float f10) {
            super.setStrokeMiterlimit((RectViewManager) q10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(Q q10, float f10) {
            super.setStrokeOpacity((RectViewManager) q10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(Q q10, Dynamic dynamic) {
            super.setStrokeWidth((RectViewManager) q10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(Q q10, int i10) {
            super.setVectorEffect((RectViewManager) q10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "height")
        public void setHeight(Q q10, Dynamic dynamic) {
            q10.o(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "rx")
        public void setRx(Q q10, Dynamic dynamic) {
            q10.p(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "ry")
        public void setRy(Q q10, Dynamic dynamic) {
            q10.q(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "width")
        public void setWidth(Q q10, Dynamic dynamic) {
            q10.r(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public void setX(Q q10, Dynamic dynamic) {
            q10.s(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGRectManagerInterface
        @ReactProp(name = "y")
        public void setY(Q q10, Dynamic dynamic) {
            q10.t(dynamic);
        }
    }

    public static class SymbolManager extends GroupViewManagerAbstract<T> implements RNSVGSymbolManagerInterface<T> {
        public static final String REACT_CLASS = "RNSVGSymbol";

        public SymbolManager() {
            super(VirtualViewManager.SVGClass.RNSVGSymbol);
            ((VirtualViewManager) this).mDelegate = new RNSVGSymbolManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(T t10, String str) {
            super.setClipPath((SymbolManager) t10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(T t10, int i10) {
            super.setClipRule((SymbolManager) t10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(T t10, Integer num) {
            super.setColor((SymbolManager) t10, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(T t10, String str) {
            super.setDisplay((SymbolManager) t10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(T t10, Dynamic dynamic) {
            super.setFill((SymbolManager) t10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(T t10, float f10) {
            super.setFillOpacity((SymbolManager) t10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(T t10, int i10) {
            super.setFillRule((SymbolManager) t10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(T t10, String str) {
            super.setFilter((SymbolManager) t10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(T t10, Dynamic dynamic) {
            super.setFont((SymbolManager) t10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(T t10, Dynamic dynamic) {
            super.setFontSize((SymbolManager) t10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(T t10, Dynamic dynamic) {
            super.setFontWeight((SymbolManager) t10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(T t10, String str) {
            super.setMarkerEnd((SymbolManager) t10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(T t10, String str) {
            super.setMarkerMid((SymbolManager) t10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(T t10, String str) {
            super.setMarkerStart((SymbolManager) t10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(T t10, String str) {
            super.setMask((SymbolManager) t10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(T t10, ReadableArray readableArray) {
            super.setMatrix((SymbolManager) t10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(T t10, String str) {
            super.setName((SymbolManager) t10, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((SymbolManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(T t10, String str) {
            super.setPointerEvents((SymbolManager) t10, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(T t10, ReadableArray readableArray) {
            super.setPropList((SymbolManager) t10, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(T t10, boolean z10) {
            super.setResponsible((SymbolManager) t10, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(T t10, Dynamic dynamic) {
            super.setStroke((SymbolManager) t10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(T t10, Dynamic dynamic) {
            super.setStrokeDasharray((SymbolManager) t10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(T t10, float f10) {
            super.setStrokeDashoffset((SymbolManager) t10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(T t10, int i10) {
            super.setStrokeLinecap((SymbolManager) t10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(T t10, int i10) {
            super.setStrokeLinejoin((SymbolManager) t10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(T t10, float f10) {
            super.setStrokeMiterlimit((SymbolManager) t10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(T t10, float f10) {
            super.setStrokeOpacity((SymbolManager) t10, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(T t10, Dynamic dynamic) {
            super.setStrokeWidth((SymbolManager) t10, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(T t10, int i10) {
            super.setVectorEffect((SymbolManager) t10, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "align")
        public void setAlign(T t10, String str) {
            t10.setAlign(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(T t10, int i10) {
            t10.setMeetOrSlice(i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "minX")
        public void setMinX(T t10, float f10) {
            t10.setMinX(f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "minY")
        public void setMinY(T t10, float f10) {
            t10.setMinY(f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "vbHeight")
        public void setVbHeight(T t10, float f10) {
            t10.setVbHeight(f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface
        @ReactProp(name = "vbWidth")
        public void setVbWidth(T t10, float f10) {
            t10.setVbWidth(f10);
        }
    }

    public static class TSpanViewManager extends TextViewManagerAbstract<b0> implements RNSVGTSpanManagerInterface<b0> {
        public static final String REACT_CLASS = "RNSVGTSpan";

        public TSpanViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTSpan);
            ((VirtualViewManager) this).mDelegate = new RNSVGTSpanManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(b0 b0Var, String str) {
            super.setAlignmentBaseline((TSpanViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(b0 b0Var, Dynamic dynamic) {
            super.setBaselineShift((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(b0 b0Var, String str) {
            super.setClipPath((TSpanViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(b0 b0Var, int i10) {
            super.setClipRule((TSpanViewManager) b0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(b0 b0Var, Integer num) {
            super.setColor((TSpanViewManager) b0Var, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(b0 b0Var, String str) {
            super.setDisplay((TSpanViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(b0 b0Var, Dynamic dynamic) {
            super.setDx((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(b0 b0Var, Dynamic dynamic) {
            super.setDy((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(b0 b0Var, Dynamic dynamic) {
            super.setFill((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(b0 b0Var, float f10) {
            super.setFillOpacity((TSpanViewManager) b0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(b0 b0Var, int i10) {
            super.setFillRule((TSpanViewManager) b0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(b0 b0Var, String str) {
            super.setFilter((TSpanViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(b0 b0Var, Dynamic dynamic) {
            super.setFont((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(b0 b0Var, Dynamic dynamic) {
            super.setFontSize((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(b0 b0Var, Dynamic dynamic) {
            super.setFontWeight((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(b0 b0Var, Dynamic dynamic) {
            super.setInlineSize((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(b0 b0Var, String str) {
            super.setLengthAdjust((TSpanViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(b0 b0Var, String str) {
            super.setMarkerEnd((TSpanViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(b0 b0Var, String str) {
            super.setMarkerMid((TSpanViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(b0 b0Var, String str) {
            super.setMarkerStart((TSpanViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(b0 b0Var, String str) {
            super.setMask((TSpanViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(b0 b0Var, ReadableArray readableArray) {
            super.setMatrix((TSpanViewManager) b0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(b0 b0Var, String str) {
            super.setName((TSpanViewManager) b0Var, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((TSpanViewManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(b0 b0Var, String str) {
            super.setPointerEvents((TSpanViewManager) b0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(b0 b0Var, ReadableArray readableArray) {
            super.setPropList((TSpanViewManager) b0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(b0 b0Var, boolean z10) {
            super.setResponsible((TSpanViewManager) b0Var, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(b0 b0Var, Dynamic dynamic) {
            super.setRotate((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(b0 b0Var, Dynamic dynamic) {
            super.setStroke((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(b0 b0Var, Dynamic dynamic) {
            super.setStrokeDasharray((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(b0 b0Var, float f10) {
            super.setStrokeDashoffset((TSpanViewManager) b0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(b0 b0Var, int i10) {
            super.setStrokeLinecap((TSpanViewManager) b0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(b0 b0Var, int i10) {
            super.setStrokeLinejoin((TSpanViewManager) b0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(b0 b0Var, float f10) {
            super.setStrokeMiterlimit((TSpanViewManager) b0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(b0 b0Var, float f10) {
            super.setStrokeOpacity((TSpanViewManager) b0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(b0 b0Var, Dynamic dynamic) {
            super.setStrokeWidth((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(b0 b0Var, Dynamic dynamic) {
            super.setTextLength((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(b0 b0Var, int i10) {
            super.setVectorEffect((TSpanViewManager) b0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(b0 b0Var, Dynamic dynamic) {
            super.setVerticalAlign((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public /* bridge */ /* synthetic */ void setX(b0 b0Var, Dynamic dynamic) {
            super.setX((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(b0 b0Var, Dynamic dynamic) {
            super.setY((TSpanViewManager) b0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTSpanManagerInterface
        @ReactProp(name = "content")
        public void setContent(b0 b0Var, String str) {
            b0Var.X(str);
        }

        public TSpanViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new RNSVGTSpanManagerDelegate(this);
        }
    }

    public static class TextPathViewManager extends TextViewManagerAbstract<c0> implements RNSVGTextPathManagerInterface<c0> {
        public static final String REACT_CLASS = "RNSVGTextPath";

        public TextPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTextPath);
            ((VirtualViewManager) this).mDelegate = new RNSVGTextPathManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(c0 c0Var, String str) {
            super.setAlignmentBaseline((TextPathViewManager) c0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(c0 c0Var, Dynamic dynamic) {
            super.setBaselineShift((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(c0 c0Var, String str) {
            super.setClipPath((TextPathViewManager) c0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(c0 c0Var, int i10) {
            super.setClipRule((TextPathViewManager) c0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(c0 c0Var, Integer num) {
            super.setColor((TextPathViewManager) c0Var, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(c0 c0Var, String str) {
            super.setDisplay((TextPathViewManager) c0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(c0 c0Var, Dynamic dynamic) {
            super.setDx((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(c0 c0Var, Dynamic dynamic) {
            super.setDy((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(c0 c0Var, Dynamic dynamic) {
            super.setFill((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(c0 c0Var, float f10) {
            super.setFillOpacity((TextPathViewManager) c0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(c0 c0Var, int i10) {
            super.setFillRule((TextPathViewManager) c0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(c0 c0Var, String str) {
            super.setFilter((TextPathViewManager) c0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(c0 c0Var, Dynamic dynamic) {
            super.setFont((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(c0 c0Var, Dynamic dynamic) {
            super.setFontSize((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(c0 c0Var, Dynamic dynamic) {
            super.setFontWeight((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(c0 c0Var, Dynamic dynamic) {
            super.setInlineSize((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(c0 c0Var, String str) {
            super.setLengthAdjust((TextPathViewManager) c0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(c0 c0Var, String str) {
            super.setMarkerEnd((TextPathViewManager) c0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(c0 c0Var, String str) {
            super.setMarkerMid((TextPathViewManager) c0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(c0 c0Var, String str) {
            super.setMarkerStart((TextPathViewManager) c0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(c0 c0Var, String str) {
            super.setMask((TextPathViewManager) c0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(c0 c0Var, ReadableArray readableArray) {
            super.setMatrix((TextPathViewManager) c0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(c0 c0Var, String str) {
            super.setName((TextPathViewManager) c0Var, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((TextPathViewManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(c0 c0Var, String str) {
            super.setPointerEvents((TextPathViewManager) c0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(c0 c0Var, ReadableArray readableArray) {
            super.setPropList((TextPathViewManager) c0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(c0 c0Var, boolean z10) {
            super.setResponsible((TextPathViewManager) c0Var, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(c0 c0Var, Dynamic dynamic) {
            super.setRotate((TextPathViewManager) c0Var, dynamic);
        }

        @ReactProp(name = "midLine")
        public void setSharp(c0 c0Var, String str) {
            c0Var.V(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(c0 c0Var, Dynamic dynamic) {
            super.setStroke((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(c0 c0Var, Dynamic dynamic) {
            super.setStrokeDasharray((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(c0 c0Var, float f10) {
            super.setStrokeDashoffset((TextPathViewManager) c0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(c0 c0Var, int i10) {
            super.setStrokeLinecap((TextPathViewManager) c0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(c0 c0Var, int i10) {
            super.setStrokeLinejoin((TextPathViewManager) c0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(c0 c0Var, float f10) {
            super.setStrokeMiterlimit((TextPathViewManager) c0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(c0 c0Var, float f10) {
            super.setStrokeOpacity((TextPathViewManager) c0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(c0 c0Var, Dynamic dynamic) {
            super.setStrokeWidth((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(c0 c0Var, Dynamic dynamic) {
            super.setTextLength((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(c0 c0Var, int i10) {
            super.setVectorEffect((TextPathViewManager) c0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(c0 c0Var, Dynamic dynamic) {
            super.setVerticalAlign((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public /* bridge */ /* synthetic */ void setX(c0 c0Var, Dynamic dynamic) {
            super.setX((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(c0 c0Var, Dynamic dynamic) {
            super.setY((TextPathViewManager) c0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "href")
        public void setHref(c0 c0Var, String str) {
            c0Var.U(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        public void setMidLine(c0 c0Var, String str) {
            c0Var.V(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "side")
        public void setSide(c0 c0Var, String str) {
            c0Var.W(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "spacing")
        public void setSpacing(c0 c0Var, String str) {
            c0Var.X(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextPathManagerInterface
        @ReactProp(name = "startOffset")
        public void setStartOffset(c0 c0Var, Dynamic dynamic) {
            c0Var.Y(dynamic);
        }

        public TextPathViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new RNSVGTextPathManagerDelegate(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract
        @ReactProp(name = "method")
        public void setMethod(c0 c0Var, String str) {
            c0Var.K(str);
        }
    }

    public static class TextViewManagerAbstract<K extends o0> extends GroupViewManagerAbstract<K> {
        public TextViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        public void setAlignmentBaseline(K k10, String str) {
            k10.K(str);
        }

        @ReactProp(name = "baselineShift")
        public void setBaselineShift(K k10, Dynamic dynamic) {
            k10.F(dynamic);
        }

        @ReactProp(name = "dx")
        public void setDx(K k10, Dynamic dynamic) {
            k10.G(dynamic);
        }

        @ReactProp(name = "dy")
        public void setDy(K k10, Dynamic dynamic) {
            k10.H(dynamic);
        }

        @ReactProp(name = "inlineSize")
        public void setInlineSize(K k10, Dynamic dynamic) {
            k10.I(dynamic);
        }

        @ReactProp(name = "lengthAdjust")
        public void setLengthAdjust(K k10, String str) {
            k10.J(str);
        }

        @ReactProp(name = "alignmentBaseline")
        public void setMethod(K k10, String str) {
            k10.K(str);
        }

        @ReactProp(name = "rotate")
        public void setRotate(K k10, Dynamic dynamic) {
            k10.N(dynamic);
        }

        @ReactProp(name = "textLength")
        public void setTextLength(K k10, Dynamic dynamic) {
            k10.O(dynamic);
        }

        @ReactProp(name = "verticalAlign")
        public void setVerticalAlign(K k10, Dynamic dynamic) {
            k10.P(dynamic);
        }

        @ReactProp(name = C5444x.f55808b)
        public void setX(K k10, Dynamic dynamic) {
            k10.L(dynamic);
        }

        @ReactProp(name = "y")
        public void setY(K k10, Dynamic dynamic) {
            k10.M(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract
        @ReactProp(name = "font")
        public void setFont(K k10, Dynamic dynamic) {
            k10.w(dynamic);
        }
    }

    public static class UseViewManager extends RenderableViewManager<p0> implements RNSVGUseManagerInterface<p0> {
        public static final String REACT_CLASS = "RNSVGUse";

        public UseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGUse);
            ((VirtualViewManager) this).mDelegate = new RNSVGUseManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(p0 p0Var, String str) {
            super.setClipPath((UseViewManager) p0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(p0 p0Var, int i10) {
            super.setClipRule((UseViewManager) p0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(p0 p0Var, Integer num) {
            super.setColor((UseViewManager) p0Var, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(p0 p0Var, String str) {
            super.setDisplay((UseViewManager) p0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(p0 p0Var, Dynamic dynamic) {
            super.setFill((UseViewManager) p0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(p0 p0Var, float f10) {
            super.setFillOpacity((UseViewManager) p0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(p0 p0Var, int i10) {
            super.setFillRule((UseViewManager) p0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(p0 p0Var, String str) {
            super.setFilter((UseViewManager) p0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(p0 p0Var, String str) {
            super.setMarkerEnd((UseViewManager) p0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(p0 p0Var, String str) {
            super.setMarkerMid((UseViewManager) p0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(p0 p0Var, String str) {
            super.setMarkerStart((UseViewManager) p0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(p0 p0Var, String str) {
            super.setMask((UseViewManager) p0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(p0 p0Var, ReadableArray readableArray) {
            super.setMatrix((UseViewManager) p0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(p0 p0Var, String str) {
            super.setName((UseViewManager) p0Var, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((UseViewManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(p0 p0Var, String str) {
            super.setPointerEvents((UseViewManager) p0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(p0 p0Var, ReadableArray readableArray) {
            super.setPropList((UseViewManager) p0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(p0 p0Var, boolean z10) {
            super.setResponsible((UseViewManager) p0Var, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(p0 p0Var, Dynamic dynamic) {
            super.setStroke((UseViewManager) p0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(p0 p0Var, Dynamic dynamic) {
            super.setStrokeDasharray((UseViewManager) p0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(p0 p0Var, float f10) {
            super.setStrokeDashoffset((UseViewManager) p0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(p0 p0Var, int i10) {
            super.setStrokeLinecap((UseViewManager) p0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(p0 p0Var, int i10) {
            super.setStrokeLinejoin((UseViewManager) p0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(p0 p0Var, float f10) {
            super.setStrokeMiterlimit((UseViewManager) p0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(p0 p0Var, float f10) {
            super.setStrokeOpacity((UseViewManager) p0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(p0 p0Var, Dynamic dynamic) {
            super.setStrokeWidth((UseViewManager) p0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(p0 p0Var, int i10) {
            super.setVectorEffect((UseViewManager) p0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "height")
        public void setHeight(p0 p0Var, Dynamic dynamic) {
            p0Var.o(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "href")
        public void setHref(p0 p0Var, String str) {
            p0Var.p(str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "width")
        public void setWidth(p0 p0Var, Dynamic dynamic) {
            p0Var.q(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public void setX(p0 p0Var, Dynamic dynamic) {
            p0Var.r(dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGUseManagerInterface
        @ReactProp(name = "y")
        public void setY(p0 p0Var, Dynamic dynamic) {
            p0Var.s(dynamic);
        }
    }

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RenderableViewManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(SvgOnLayoutEvent.EVENT_NAME, MapBuilder.of("registrationName", "onSvgLayout"));
        return hashMap;
    }

    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(T t10, Integer num) {
        t10.setCurrentColor(num);
    }

    @ReactProp(name = "fill")
    public void setFill(T t10, Dynamic dynamic) {
        t10.setFill(dynamic);
    }

    @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(T t10, float f10) {
        t10.setFillOpacity(f10);
    }

    @ReactProp(defaultInt = 1, name = "fillRule")
    public void setFillRule(T t10, int i10) {
        t10.setFillRule(i10);
    }

    @ReactProp(name = ViewProps.FILTER)
    public void setFilter(T t10, String str) {
        t10.setFilter(str);
    }

    @ReactProp(name = "propList")
    public void setPropList(T t10, ReadableArray readableArray) {
        t10.setPropList(readableArray);
    }

    @ReactProp(name = "stroke")
    public void setStroke(T t10, Dynamic dynamic) {
        t10.setStroke(dynamic);
    }

    @ReactProp(name = "strokeDasharray")
    public void setStrokeDasharray(T t10, Dynamic dynamic) {
        t10.setStrokeDasharray(dynamic);
    }

    @ReactProp(name = "strokeDashoffset")
    public void setStrokeDashoffset(T t10, float f10) {
        t10.setStrokeDashoffset(f10);
    }

    @ReactProp(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(T t10, int i10) {
        t10.setStrokeLinecap(i10);
    }

    @ReactProp(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(T t10, int i10) {
        t10.setStrokeLinejoin(i10);
    }

    @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(T t10, float f10) {
        t10.setStrokeMiterlimit(f10);
    }

    @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(T t10, float f10) {
        t10.setStrokeOpacity(f10);
    }

    @ReactProp(name = "strokeWidth")
    public void setStrokeWidth(T t10, Dynamic dynamic) {
        t10.setStrokeWidth(dynamic);
    }

    @ReactProp(name = "vectorEffect")
    public void setVectorEffect(T t10, int i10) {
        t10.setVectorEffect(i10);
    }

    public static class TextViewManager extends TextViewManagerAbstract<o0> implements RNSVGTextManagerInterface<o0> {
        public static final String REACT_CLASS = "RNSVGText";

        public TextViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGText);
            ((VirtualViewManager) this).mDelegate = new RNSVGTextManagerDelegate(this);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(o0 o0Var, String str) {
            super.setAlignmentBaseline((TextViewManager) o0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(o0 o0Var, Dynamic dynamic) {
            super.setBaselineShift((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(o0 o0Var, String str) {
            super.setClipPath((TextViewManager) o0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(o0 o0Var, int i10) {
            super.setClipRule((TextViewManager) o0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(customType = "Color", name = ViewProps.COLOR)
        public /* bridge */ /* synthetic */ void setColor(o0 o0Var, Integer num) {
            super.setColor((TextViewManager) o0Var, num);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.DISPLAY)
        public /* bridge */ /* synthetic */ void setDisplay(o0 o0Var, String str) {
            super.setDisplay((TextViewManager) o0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(o0 o0Var, Dynamic dynamic) {
            super.setDx((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(o0 o0Var, Dynamic dynamic) {
            super.setDy((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(o0 o0Var, Dynamic dynamic) {
            super.setFill((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(o0 o0Var, float f10) {
            super.setFillOpacity((TextViewManager) o0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(o0 o0Var, int i10) {
            super.setFillRule((TextViewManager) o0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.FILTER)
        public /* bridge */ /* synthetic */ void setFilter(o0 o0Var, String str) {
            super.setFilter((TextViewManager) o0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "font")
        public /* bridge */ /* synthetic */ void setFont(o0 o0Var, Dynamic dynamic) {
            super.setFont((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.FONT_SIZE)
        public /* bridge */ /* synthetic */ void setFontSize(o0 o0Var, Dynamic dynamic) {
            super.setFontSize((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.FONT_WEIGHT)
        public /* bridge */ /* synthetic */ void setFontWeight(o0 o0Var, Dynamic dynamic) {
            super.setFontWeight((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(o0 o0Var, Dynamic dynamic) {
            super.setInlineSize((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(o0 o0Var, String str) {
            super.setLengthAdjust((TextViewManager) o0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(o0 o0Var, String str) {
            super.setMarkerEnd((TextViewManager) o0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(o0 o0Var, String str) {
            super.setMarkerMid((TextViewManager) o0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(o0 o0Var, String str) {
            super.setMarkerStart((TextViewManager) o0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(o0 o0Var, String str) {
            super.setMask((TextViewManager) o0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        public /* bridge */ /* synthetic */ void setMatrix(o0 o0Var, ReadableArray readableArray) {
            super.setMatrix((TextViewManager) o0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "name")
        public /* bridge */ /* synthetic */ void setName(o0 o0Var, String str) {
            super.setName((TextViewManager) o0Var, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((TextViewManager) view, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = ViewProps.POINTER_EVENTS)
        public /* bridge */ /* synthetic */ void setPointerEvents(o0 o0Var, String str) {
            super.setPointerEvents((TextViewManager) o0Var, str);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(o0 o0Var, ReadableArray readableArray) {
            super.setPropList((TextViewManager) o0Var, readableArray);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(o0 o0Var, boolean z10) {
            super.setResponsible((TextViewManager) o0Var, z10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(o0 o0Var, Dynamic dynamic) {
            super.setRotate((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(o0 o0Var, Dynamic dynamic) {
            super.setStroke((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(o0 o0Var, Dynamic dynamic) {
            super.setStrokeDasharray((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(o0 o0Var, float f10) {
            super.setStrokeDashoffset((TextViewManager) o0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(o0 o0Var, int i10) {
            super.setStrokeLinecap((TextViewManager) o0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(o0 o0Var, int i10) {
            super.setStrokeLinejoin((TextViewManager) o0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(o0 o0Var, float f10) {
            super.setStrokeMiterlimit((TextViewManager) o0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(o0 o0Var, float f10) {
            super.setStrokeOpacity((TextViewManager) o0Var, f10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(o0 o0Var, Dynamic dynamic) {
            super.setStrokeWidth((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(o0 o0Var, Dynamic dynamic) {
            super.setTextLength((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(o0 o0Var, int i10) {
            super.setVectorEffect((TextViewManager) o0Var, i10);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(o0 o0Var, Dynamic dynamic) {
            super.setVerticalAlign((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = C5444x.f55808b)
        public /* bridge */ /* synthetic */ void setX(o0 o0Var, Dynamic dynamic) {
            super.setX((TextViewManager) o0Var, dynamic);
        }

        @Override // com.facebook.react.viewmanagers.RNSVGTextManagerInterface
        @ReactProp(name = "y")
        public /* bridge */ /* synthetic */ void setY(o0 o0Var, Dynamic dynamic) {
            super.setY((TextViewManager) o0Var, dynamic);
        }

        public TextViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new RNSVGTextManagerDelegate(this);
        }
    }

    public void setFill(T t10, ReadableMap readableMap) {
        t10.setFill(readableMap);
    }

    public void setStroke(T t10, ReadableMap readableMap) {
        t10.setStroke(readableMap);
    }
}
