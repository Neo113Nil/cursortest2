package Oc;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final a f8610g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8611a;

    /* renamed from: b, reason: collision with root package name */
    public StateWrapper f8612b;

    /* renamed from: c, reason: collision with root package name */
    public float f8613c;

    /* renamed from: d, reason: collision with root package name */
    public float f8614d;

    /* renamed from: e, reason: collision with root package name */
    public float f8615e;

    /* renamed from: f, reason: collision with root package name */
    public float f8616f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public b(boolean z10) {
        this.f8611a = z10;
    }

    public static /* synthetic */ void d(b bVar, Integer num, Integer num2, Integer num3, Integer num4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            num2 = null;
        }
        if ((i10 & 4) != 0) {
            num3 = null;
        }
        if ((i10 & 8) != 0) {
            num4 = null;
        }
        bVar.c(num, num2, num3, num4);
    }

    public final StateWrapper a() {
        return this.f8612b;
    }

    public final void b(StateWrapper stateWrapper) {
        this.f8612b = stateWrapper;
    }

    public final void c(Integer num, Integer num2, Integer num3, Integer num4) {
        float dIPFromPixel = num != null ? PixelUtil.toDIPFromPixel(num.intValue()) : this.f8613c;
        float dIPFromPixel2 = num2 != null ? PixelUtil.toDIPFromPixel(num2.intValue()) : this.f8614d;
        float dIPFromPixel3 = num3 != null ? PixelUtil.toDIPFromPixel(num3.intValue()) : this.f8615e;
        float dIPFromPixel4 = num4 != null ? PixelUtil.toDIPFromPixel(num4.intValue()) : this.f8616f;
        if (Math.abs(this.f8613c - dIPFromPixel) >= 0.1f || Math.abs(this.f8614d - dIPFromPixel2) >= 0.1f || Math.abs(this.f8615e - dIPFromPixel3) >= 0.1f || Math.abs(this.f8616f - dIPFromPixel4) >= 0.1f) {
            this.f8613c = dIPFromPixel;
            this.f8614d = dIPFromPixel2;
            this.f8615e = dIPFromPixel3;
            this.f8616f = dIPFromPixel4;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            if (this.f8611a) {
                writableNativeMap.putDouble("frameWidth", dIPFromPixel);
                writableNativeMap.putDouble("frameHeight", dIPFromPixel2);
            }
            writableNativeMap.putDouble("contentOffsetX", dIPFromPixel3);
            writableNativeMap.putDouble("contentOffsetY", dIPFromPixel4);
            StateWrapper stateWrapper = this.f8612b;
            if (stateWrapper != null) {
                stateWrapper.updateState(writableNativeMap);
            }
        }
    }

    public /* synthetic */ b(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
