package com.rnlineargradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

@ReactModule(name = LinearGradientManager.REACT_CLASS)
/* loaded from: classes8.dex */
public class LinearGradientManager extends LinearGradientManagerSpec<LinearGradientView> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POINT = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POINT = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "RNLinearGradient";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public LinearGradientView createViewInstance(ThemedReactContext themedReactContext) {
        return new LinearGradientView(themedReactContext);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(name = PROP_COLORS)
    public void setColors(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setColors(readableArray);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(name = PROP_LOCATIONS)
    public void setLocations(LinearGradientView linearGradientView, ReadableArray readableArray) {
        if (readableArray != null) {
            linearGradientView.setLocations(readableArray);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(name = PROP_START_POINT)
    public void setStartPoint(LinearGradientView linearGradientView, ReadableMap readableMap) {
        linearGradientView.setStartPoint(readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(name = PROP_END_POINT)
    public void setEndPoint(LinearGradientView linearGradientView, ReadableMap readableMap) {
        linearGradientView.setEndPoint(readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(defaultBoolean = false, name = PROP_USE_ANGLE)
    public void setUseAngle(LinearGradientView linearGradientView, boolean z) {
        linearGradientView.setUseAngle(z);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(name = PROP_ANGLE_CENTER)
    public void setAngleCenter(LinearGradientView linearGradientView, ReadableMap readableMap) {
        linearGradientView.setAngleCenter(readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(defaultFloat = 45.0f, name = "angle")
    public void setAngle(LinearGradientView linearGradientView, float f) {
        linearGradientView.setAngle(f);
    }

    @Override // com.facebook.react.viewmanagers.RNLinearGradientManagerInterface
    @ReactProp(name = PROP_BORDER_RADII)
    public void setBorderRadii(LinearGradientView linearGradientView, ReadableArray readableArray) {
        linearGradientView.setBorderRadii(readableArray);
    }
}
