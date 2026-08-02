package ed;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class p extends LayoutShadowNode {

    /* renamed from: a, reason: collision with root package name */
    public n f45968a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45969b;

    @NotNull
    private final float[] mMargins;

    @NotNull
    private final float[] mPaddings;

    public p() {
        int[] iArr = ViewProps.PADDING_MARGIN_SPACING_TYPES;
        this.mPaddings = new float[iArr.length];
        this.mMargins = new float[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.mPaddings[i10] = Float.NaN;
            this.mMargins[i10] = Float.NaN;
        }
    }

    public final float a(l lVar, float f10, float f11) {
        return lVar == l.f45954a ? f11 : lVar == l.f45956c ? Math.max(f10, f11) : f10 + f11;
    }

    public final void b(o oVar) {
        if (oVar == o.f45965a) {
            super.setPadding(1, this.mPaddings[1]);
            super.setPadding(2, this.mPaddings[2]);
            super.setPadding(3, this.mPaddings[3]);
            super.setPadding(0, this.mPaddings[0]);
        } else {
            super.setMargin(1, this.mMargins[1]);
            super.setMargin(2, this.mMargins[2]);
            super.setMargin(3, this.mMargins[3]);
            super.setMargin(0, this.mMargins[0]);
        }
        markUpdated();
    }

    public final void c() {
        n nVar = this.f45968a;
        if (nVar == null) {
            return;
        }
        o c10 = nVar.c();
        o oVar = o.f45965a;
        float[] fArr = c10 == oVar ? this.mPaddings : this.mMargins;
        float f10 = fArr[8];
        if (Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        float f11 = f10;
        float f12 = f11;
        float f13 = f12;
        float f14 = fArr[7];
        if (!Float.isNaN(f14)) {
            f10 = f14;
            f12 = f10;
        }
        float f15 = fArr[6];
        if (!Float.isNaN(f15)) {
            f11 = f15;
            f13 = f11;
        }
        float f16 = fArr[1];
        if (!Float.isNaN(f16)) {
            f10 = f16;
        }
        float f17 = fArr[2];
        if (!Float.isNaN(f17)) {
            f11 = f17;
        }
        float f18 = fArr[3];
        if (!Float.isNaN(f18)) {
            f12 = f18;
        }
        float f19 = fArr[0];
        if (!Float.isNaN(f19)) {
            f13 = f19;
        }
        float pixelFromDIP = PixelUtil.toPixelFromDIP(f10);
        float pixelFromDIP2 = PixelUtil.toPixelFromDIP(f11);
        float pixelFromDIP3 = PixelUtil.toPixelFromDIP(f12);
        float pixelFromDIP4 = PixelUtil.toPixelFromDIP(f13);
        m a10 = nVar.a();
        C4201a b10 = nVar.b();
        if (nVar.c() == oVar) {
            super.setPadding(1, a(a10.d(), b10.d(), pixelFromDIP));
            super.setPadding(2, a(a10.c(), b10.c(), pixelFromDIP2));
            super.setPadding(3, a(a10.a(), b10.a(), pixelFromDIP3));
            super.setPadding(0, a(a10.b(), b10.b(), pixelFromDIP4));
            return;
        }
        super.setMargin(1, a(a10.d(), b10.d(), pixelFromDIP));
        super.setMargin(2, a(a10.c(), b10.c(), pixelFromDIP2));
        super.setMargin(3, a(a10.a(), b10.a(), pixelFromDIP3));
        super.setMargin(0, a(a10.b(), b10.b(), pixelFromDIP4));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        Intrinsics.checkNotNullParameter(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        if (this.f45969b) {
            this.f45969b = false;
            c();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof n) {
            n nVar = this.f45968a;
            if (nVar != null && nVar.c() != ((n) data).c()) {
                b(nVar.c());
            }
            this.f45968a = (n) data;
            this.f45969b = false;
            c();
        }
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(names = {ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT})
    public void setMargins(int i10, @NotNull Dynamic margin) {
        Intrinsics.checkNotNullParameter(margin, "margin");
        this.mMargins[ViewProps.PADDING_MARGIN_SPACING_TYPES[i10]] = margin.getType() == ReadableType.Number ? (float) margin.asDouble() : Float.NaN;
        super.setMargins(i10, margin);
        this.f45969b = true;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(names = {ViewProps.PADDING, ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, ViewProps.PADDING_LEFT, ViewProps.PADDING_RIGHT})
    public void setPaddings(int i10, @NotNull Dynamic padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.mPaddings[ViewProps.PADDING_MARGIN_SPACING_TYPES[i10]] = padding.getType() == ReadableType.Number ? (float) padding.asDouble() : Float.NaN;
        super.setPaddings(i10, padding);
        this.f45969b = true;
    }
}
