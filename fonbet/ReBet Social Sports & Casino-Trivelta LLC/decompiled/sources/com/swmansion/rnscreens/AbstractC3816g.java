package com.swmansion.rnscreens;

import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.swmansion.rnscreens.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3816g extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public StateWrapper f41799a;

    /* renamed from: b, reason: collision with root package name */
    public float f41800b;

    /* renamed from: c, reason: collision with root package name */
    public float f41801c;

    /* renamed from: d, reason: collision with root package name */
    public float f41802d;

    public AbstractC3816g(ReactContext reactContext) {
        super(reactContext);
    }

    public final void b(int i10, int i11, int i12) {
        float dIPFromPixel = PixelUtil.toDIPFromPixel(i10);
        float dIPFromPixel2 = PixelUtil.toDIPFromPixel(i11);
        float dIPFromPixel3 = PixelUtil.toDIPFromPixel(i12);
        if (Math.abs(this.f41800b - dIPFromPixel) >= 0.9f || Math.abs(this.f41801c - dIPFromPixel2) >= 0.9f || Math.abs(this.f41802d - dIPFromPixel3) >= 0.9f) {
            this.f41800b = dIPFromPixel;
            this.f41801c = dIPFromPixel2;
            this.f41802d = dIPFromPixel3;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", dIPFromPixel);
            writableNativeMap.putDouble("frameHeight", dIPFromPixel2);
            writableNativeMap.putDouble("contentOffsetX", 0.0d);
            writableNativeMap.putDouble("contentOffsetY", dIPFromPixel3);
            StateWrapper stateWrapper = this.f41799a;
            if (stateWrapper != null) {
                stateWrapper.updateState(writableNativeMap);
            }
        }
    }

    public final void setStateWrapper(@Nullable StateWrapper stateWrapper) {
        this.f41799a = stateWrapper;
    }
}
