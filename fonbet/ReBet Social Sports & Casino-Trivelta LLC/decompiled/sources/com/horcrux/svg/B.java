package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class B extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    public ReadableMap f38626a;

    /* renamed from: b, reason: collision with root package name */
    public C3548z f38627b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f38628c;

    /* renamed from: d, reason: collision with root package name */
    public Canvas f38629d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f38630e;

    public B(ReactContext reactContext) {
        super(reactContext);
        this.f38630e = new Paint(1);
    }

    public static Object v(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f10) {
        y(canvas);
        clip(canvas, paint);
        o(canvas, paint, f10);
        renderMarkers(canvas, paint, f10);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        this.mPath = new Path();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof G) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path path2 = virtualView.getPath(canvas, paint);
                if (path2 != null) {
                    this.mPath.addPath(path2, matrix);
                }
            }
        }
        return this.mPath;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        int reactTagForTouch;
        VirtualView virtualView;
        int hitTest;
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        int round = Math.round(fArr2[0]);
        int round2 = Math.round(fArr2[1]);
        Path clipPath = getClipPath();
        if (clipPath != null) {
            if (this.mClipRegionPath != clipPath) {
                this.mClipRegionPath = clipPath;
                RectF rectF = new RectF();
                this.mClipBounds = rectF;
                clipPath.computeBounds(rectF, true);
                this.mClipRegion = getRegion(clipPath, this.mClipBounds);
            }
            if (!this.mClipRegion.contains(round, round2)) {
                return -1;
            }
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof VirtualView) {
                if (!(childAt instanceof G) && (hitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                    return (virtualView.isResponsible() || hitTest != childAt.getId()) ? hitTest : getId();
                }
            } else if ((childAt instanceof SvgView) && (reactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                return reactTagForTouch;
            }
        }
        return -1;
    }

    public void o(Canvas canvas, Paint paint, float f10) {
        u();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        if (this.mOpacity != 1.0f) {
            Bitmap bitmap = this.f38628c;
            if (bitmap == null) {
                this.f38628c = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f38629d = new Canvas(this.f38628c);
            } else {
                bitmap.recycle();
                Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f38628c = createBitmap;
                this.f38629d.setBitmap(createBitmap);
            }
            this.f38629d.save();
            this.f38629d.setMatrix(canvas.getMatrix());
        } else {
            this.f38629d = canvas;
        }
        this.elements = new ArrayList<>();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof G) || (childAt instanceof C3525c)) {
                ((RenderableView) childAt).mergeProperties(this);
            } else if (childAt instanceof VirtualView) {
                VirtualView virtualView = (VirtualView) childAt;
                if (!ViewProps.NONE.equals(virtualView.mDisplay)) {
                    boolean z10 = virtualView instanceof RenderableView;
                    if (z10) {
                        ((RenderableView) virtualView).mergeProperties(this);
                    }
                    int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(this.f38629d, this.mCTM);
                    virtualView.render(this.f38629d, paint, f10);
                    RectF clientRect = virtualView.getClientRect();
                    if (clientRect != null) {
                        rectF.union(clientRect);
                    }
                    virtualView.restoreCanvas(this.f38629d, saveAndSetupCanvas);
                    if (z10) {
                        ((RenderableView) virtualView).resetProperties();
                    }
                    if (virtualView.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                    ArrayList<H> arrayList = virtualView.elements;
                    if (arrayList != null) {
                        this.elements.addAll(arrayList);
                    }
                }
            } else if (childAt instanceof SvgView) {
                SvgView svgView2 = (SvgView) childAt;
                if (svgView2.getChildCount() > 0) {
                    View childAt2 = svgView2.getChildAt(0);
                    if (childAt2 instanceof B) {
                        ((B) childAt2).mergeProperties(this);
                    }
                }
                svgView2.drawChildren(canvas);
                if (svgView2.isResponsible()) {
                    svgView.enableTouchEvents();
                }
            }
        }
        if (this.mOpacity != 1.0f) {
            this.f38629d.restore();
            int save = canvas.save();
            canvas.setMatrix(null);
            this.f38630e.setAlpha((int) (this.mOpacity * 255.0f));
            Bitmap bitmap2 = this.f38628c;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.f38630e);
            }
            canvas.restoreToCount(save);
        }
        setClientRect(rectF);
        t();
    }

    public void p(Canvas canvas, Paint paint, float f10) {
        super.draw(canvas, paint, f10);
    }

    public C3548z q() {
        return this.f38627b;
    }

    public Path r(Canvas canvas, Paint paint, Region.Op op) {
        Path path = new Path();
        Path.Op valueOf = Path.Op.valueOf(op.name());
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof G) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path r10 = virtualView instanceof B ? ((B) virtualView).r(canvas, paint, op) : virtualView.getPath(canvas, paint);
                r10.transform(matrix);
                path.op(r10, valueOf);
            }
        }
        return path;
    }

    @Override // com.horcrux.svg.RenderableView
    public void resetProperties() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    public C3548z s() {
        return ((B) v(getTextRoot())).q();
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    public void t() {
        s().n();
    }

    public void u() {
        s().o(this, this.f38626a);
    }

    public void w(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Map) {
            this.f38626a = dynamic.asMap();
        } else {
            this.f38626a = null;
        }
        invalidate();
    }

    public void x(ReadableMap readableMap) {
        this.f38626a = readableMap;
        invalidate();
    }

    public void y(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        this.f38627b = new C3548z(this.mScale, rectF.width(), rectF.height());
    }
}
