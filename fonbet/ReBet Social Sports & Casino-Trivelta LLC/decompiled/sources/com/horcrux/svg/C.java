package com.horcrux.svg;

import C7.C1055t;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.horcrux.svg.events.SvgLoadEvent;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class C extends RenderableView {

    /* renamed from: a, reason: collision with root package name */
    public SVGLength f38631a;

    /* renamed from: b, reason: collision with root package name */
    public SVGLength f38632b;

    /* renamed from: c, reason: collision with root package name */
    public SVGLength f38633c;

    /* renamed from: d, reason: collision with root package name */
    public SVGLength f38634d;

    /* renamed from: e, reason: collision with root package name */
    public String f38635e;

    /* renamed from: f, reason: collision with root package name */
    public int f38636f;

    /* renamed from: g, reason: collision with root package name */
    public int f38637g;

    /* renamed from: h, reason: collision with root package name */
    public String f38638h;

    /* renamed from: i, reason: collision with root package name */
    public int f38639i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f38640j;

    public class a extends D7.b {
        public a() {
        }

        @Override // D7.b
        public void a(Bitmap bitmap) {
            C c10 = C.this;
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(c10.mContext, c10.getId());
            int surfaceId = UIManagerHelper.getSurfaceId(C.this);
            int id2 = C.this.getId();
            C c11 = C.this;
            eventDispatcherForReactTag.dispatchEvent(new SvgLoadEvent(surfaceId, id2, c11.mContext, c11.f38635e, bitmap.getWidth(), bitmap.getHeight()));
            C.this.f38640j.set(false);
            SvgView svgView = C.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }

        @Override // M6.b
        public void onFailureImpl(M6.c cVar) {
            C.this.f38640j.set(false);
            E6.a.N(ReactConstants.TAG, cVar.f(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
        }
    }

    public C(ReactContext reactContext) {
        super(reactContext);
        this.f38640j = new AtomicBoolean(false);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f10) {
        if (this.f38640j.get()) {
            return;
        }
        C1055t a10 = com.facebook.drawee.backends.pipeline.d.a();
        com.facebook.imagepipeline.request.b fromUri = com.facebook.imagepipeline.request.b.fromUri(new ImageSource(this.mContext, this.f38635e).getUri());
        if (a10.v(fromUri)) {
            y(a10, fromUri, canvas, paint, f10 * this.mOpacity);
        } else {
            s(a10, fromUri);
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        this.mPath = path;
        path.addRect(r(), Path.Direction.CW);
        return this.mPath;
    }

    public final void q(Canvas canvas, Paint paint, Bitmap bitmap, float f10) {
        if (this.f38636f == 0 || this.f38637g == 0) {
            this.f38636f = bitmap.getWidth();
            this.f38637g = bitmap.getHeight();
        }
        RectF r10 = r();
        RectF rectF = new RectF(0.0f, 0.0f, this.f38636f, this.f38637g);
        q0.a(rectF, r10, this.f38638h, this.f38639i).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f10 * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    public final RectF r() {
        double relativeOnWidth = relativeOnWidth(this.f38631a);
        double relativeOnHeight = relativeOnHeight(this.f38632b);
        double relativeOnWidth2 = relativeOnWidth(this.f38633c);
        double relativeOnHeight2 = relativeOnHeight(this.f38634d);
        if (relativeOnWidth2 == 0.0d) {
            relativeOnWidth2 = this.f38636f * this.mScale;
        }
        if (relativeOnHeight2 == 0.0d) {
            relativeOnHeight2 = this.f38637g * this.mScale;
        }
        return new RectF((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2));
    }

    public final void s(C1055t c1055t, com.facebook.imagepipeline.request.b bVar) {
        this.f38640j.set(true);
        c1055t.k(bVar, this.mContext).g(new a(), B6.i.D0());
    }

    public void setAlign(String str) {
        this.f38638h = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f38639i = i10;
        invalidate();
    }

    public void t(Dynamic dynamic) {
        this.f38634d = SVGLength.b(dynamic);
        invalidate();
    }

    public void u(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString("uri");
            this.f38635e = string;
            if (string == null || string.isEmpty()) {
                return;
            }
            if (readableMap.hasKey("width") && readableMap.hasKey("height")) {
                this.f38636f = readableMap.getInt("width");
                this.f38637g = readableMap.getInt("height");
            } else {
                this.f38636f = 0;
                this.f38637g = 0;
            }
            if (Uri.parse(this.f38635e).getScheme() == null) {
                ResourceDrawableIdHelper.getInstance();
                ResourceDrawableIdHelper.getResourceDrawableUri(this.mContext, this.f38635e);
            }
        }
    }

    public void v(Dynamic dynamic) {
        this.f38633c = SVGLength.b(dynamic);
        invalidate();
    }

    public void w(Dynamic dynamic) {
        this.f38631a = SVGLength.b(dynamic);
        invalidate();
    }

    public void x(Dynamic dynamic) {
        this.f38632b = SVGLength.b(dynamic);
        invalidate();
    }

    public final void y(C1055t c1055t, com.facebook.imagepipeline.request.b bVar, Canvas canvas, Paint paint, float f10) {
        M6.c o10 = c1055t.o(bVar, this.mContext);
        try {
            try {
                H6.a aVar = (H6.a) o10.getResult();
                try {
                    if (aVar == null) {
                        return;
                    }
                    try {
                        H7.e eVar = (H7.e) aVar.z0();
                        if (eVar instanceof H7.d) {
                            Bitmap A12 = ((H7.d) eVar).A1();
                            if (A12 == null) {
                                return;
                            }
                            q(canvas, paint, A12, f10);
                        }
                    } catch (Exception e10) {
                        throw new IllegalStateException(e10);
                    }
                } finally {
                    H6.a.U(aVar);
                }
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        } finally {
            o10.close();
        }
    }
}
