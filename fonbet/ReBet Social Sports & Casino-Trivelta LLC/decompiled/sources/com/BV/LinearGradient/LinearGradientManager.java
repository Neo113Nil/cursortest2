package com.BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import s3.C6313b;

/* loaded from: classes.dex */
public class LinearGradientManager extends SimpleViewManager<C6313b> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POINT = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POINT = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "BVLinearGradient";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(defaultFloat = 45.0f, name = PROP_ANGLE)
    public void setAngle(C6313b c6313b, float f10) {
        c6313b.setAngle(f10);
    }

    @ReactProp(name = PROP_ANGLE_CENTER)
    public void setAngleCenter(C6313b c6313b, ReadableArray readableArray) {
        c6313b.setAngleCenter(readableArray);
    }

    @ReactProp(name = PROP_BORDER_RADII)
    public void setBorderRadii(C6313b c6313b, ReadableArray readableArray) {
        c6313b.setBorderRadii(readableArray);
    }

    @ReactProp(name = PROP_COLORS)
    public void setColors(C6313b c6313b, ReadableArray readableArray) {
        c6313b.setColors(readableArray);
    }

    @ReactProp(name = PROP_END_POINT)
    public void setEndPoint(C6313b c6313b, ReadableArray readableArray) {
        c6313b.setEndPoint(readableArray);
    }

    @ReactProp(name = PROP_LOCATIONS)
    public void setLocations(C6313b c6313b, ReadableArray readableArray) {
        if (readableArray != null) {
            c6313b.setLocations(readableArray);
        }
    }

    @ReactProp(name = PROP_START_POINT)
    public void setStartPoint(C6313b c6313b, ReadableArray readableArray) {
        c6313b.setStartPoint(readableArray);
    }

    @ReactProp(defaultBoolean = false, name = PROP_USE_ANGLE)
    public void setUseAngle(C6313b c6313b, boolean z10) {
        c6313b.setUseAngle(z10);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C6313b createViewInstance(ThemedReactContext themedReactContext) {
        return new C6313b(themedReactContext);
    }
}
