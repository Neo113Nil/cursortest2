package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.swmansion.rnscreens.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3814e extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public static final a f41783f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public StateWrapper f41784a;

    /* renamed from: b, reason: collision with root package name */
    public float f41785b;

    /* renamed from: c, reason: collision with root package name */
    public float f41786c;

    /* renamed from: d, reason: collision with root package name */
    public float f41787d;

    /* renamed from: e, reason: collision with root package name */
    public float f41788e;

    /* renamed from: com.swmansion.rnscreens.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public AbstractC3814e(Context context) {
        super(context);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        b(i10, i11, i12, i13);
    }

    public final void b(int i10, int i11, int i12, int i13) {
        float dIPFromPixel = PixelUtil.toDIPFromPixel(i10);
        float dIPFromPixel2 = PixelUtil.toDIPFromPixel(i11);
        float dIPFromPixel3 = PixelUtil.toDIPFromPixel(i12);
        float dIPFromPixel4 = PixelUtil.toDIPFromPixel(i13);
        if (Math.abs(this.f41785b - dIPFromPixel) >= 0.9f || Math.abs(this.f41786c - dIPFromPixel2) >= 0.9f || Math.abs(this.f41787d - dIPFromPixel3) >= 0.9f || Math.abs(this.f41788e - dIPFromPixel4) >= 0.9f) {
            this.f41785b = dIPFromPixel;
            this.f41786c = dIPFromPixel2;
            this.f41787d = dIPFromPixel3;
            this.f41788e = dIPFromPixel4;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", dIPFromPixel);
            writableNativeMap.putDouble("frameHeight", dIPFromPixel2);
            writableNativeMap.putDouble(ViewProps.PADDING_START, dIPFromPixel3);
            writableNativeMap.putDouble(ViewProps.PADDING_END, dIPFromPixel4);
            StateWrapper stateWrapper = this.f41784a;
            if (stateWrapper != null) {
                stateWrapper.updateState(writableNativeMap);
            }
        }
    }

    public final void setStateWrapper(@Nullable StateWrapper stateWrapper) {
        this.f41784a = stateWrapper;
    }
}
