package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.swmansion.rnscreens.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3815f extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public static final a f41791f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public StateWrapper f41792a;

    /* renamed from: b, reason: collision with root package name */
    public float f41793b;

    /* renamed from: c, reason: collision with root package name */
    public float f41794c;

    /* renamed from: d, reason: collision with root package name */
    public float f41795d;

    /* renamed from: e, reason: collision with root package name */
    public float f41796e;

    /* renamed from: com.swmansion.rnscreens.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public AbstractC3815f(Context context) {
        super(context);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        float dIPFromPixel = PixelUtil.toDIPFromPixel(i10);
        float dIPFromPixel2 = PixelUtil.toDIPFromPixel(i11);
        float dIPFromPixel3 = PixelUtil.toDIPFromPixel(i12);
        float dIPFromPixel4 = PixelUtil.toDIPFromPixel(i13);
        if (Math.abs(this.f41793b - dIPFromPixel) >= 0.9f || Math.abs(this.f41794c - dIPFromPixel2) >= 0.9f || Math.abs(this.f41795d - dIPFromPixel3) >= 0.9f || Math.abs(this.f41796e - dIPFromPixel4) >= 0.9f) {
            this.f41793b = dIPFromPixel;
            this.f41794c = dIPFromPixel2;
            this.f41795d = dIPFromPixel3;
            this.f41796e = dIPFromPixel4;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", dIPFromPixel);
            writableNativeMap.putDouble("frameHeight", dIPFromPixel2);
            writableNativeMap.putDouble("contentOffsetX", dIPFromPixel3);
            writableNativeMap.putDouble("contentOffsetY", dIPFromPixel4);
            StateWrapper stateWrapper = this.f41792a;
            if (stateWrapper != null) {
                stateWrapper.updateState(writableNativeMap);
            }
        }
    }

    public final void b(int i10, int i11, int i12, int i13) {
        a(i10, i11, i12, i13);
    }

    public final void setStateWrapper(@Nullable StateWrapper stateWrapper) {
        this.f41792a = stateWrapper;
    }
}
