package com.journeyapps.barcodescanner;

import N9.l;
import N9.m;
import N9.o;
import O9.k;
import O9.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
public class c extends ViewGroup {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f60271z = 0;

    /* renamed from: a, reason: collision with root package name */
    private O9.e f60272a;

    /* renamed from: b, reason: collision with root package name */
    private WindowManager f60273b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f60274c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f60275d;

    /* renamed from: e, reason: collision with root package name */
    private SurfaceView f60276e;

    /* renamed from: f, reason: collision with root package name */
    private TextureView f60277f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f60278g;

    /* renamed from: h, reason: collision with root package name */
    private i f60279h;

    /* renamed from: i, reason: collision with root package name */
    private int f60280i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f60281j;

    /* renamed from: k, reason: collision with root package name */
    private k f60282k;

    /* renamed from: l, reason: collision with root package name */
    private O9.g f60283l;

    /* renamed from: m, reason: collision with root package name */
    private m f60284m;

    /* renamed from: n, reason: collision with root package name */
    private m f60285n;

    /* renamed from: o, reason: collision with root package name */
    private Rect f60286o;

    /* renamed from: p, reason: collision with root package name */
    private m f60287p;

    /* renamed from: q, reason: collision with root package name */
    private Rect f60288q;

    /* renamed from: r, reason: collision with root package name */
    private Rect f60289r;

    /* renamed from: s, reason: collision with root package name */
    private m f60290s;

    /* renamed from: t, reason: collision with root package name */
    private double f60291t;

    /* renamed from: u, reason: collision with root package name */
    private p f60292u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f60293v;

    /* renamed from: w, reason: collision with root package name */
    private final SurfaceHolder.Callback f60294w;

    /* renamed from: x, reason: collision with root package name */
    private l f60295x;

    /* renamed from: y, reason: collision with root package name */
    private final e f60296y;

    final class a implements SurfaceHolder.Callback {
        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            if (surfaceHolder == null) {
                int i14 = c.f60271z;
                Log.e("c", "*** WARNING *** surfaceChanged() gave us a null surface!");
            } else {
                m mVar = new m(i12, i13);
                c cVar = c.this;
                cVar.f60287p = mVar;
                cVar.x();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            c.this.f60287p = null;
        }
    }

    final class b implements Handler.Callback {
        b() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i11 = message.what;
            c cVar = c.this;
            if (i11 == R.id.zxing_prewiew_size_ready) {
                c.c(cVar, (m) message.obj);
                return true;
            }
            if (i11 != R.id.zxing_camera_error) {
                if (i11 != R.id.zxing_camera_closed) {
                    return false;
                }
                ((d) cVar.f60296y).cameraClosed();
                return false;
            }
            Exception exc = (Exception) message.obj;
            if (!cVar.n()) {
                return false;
            }
            cVar.q();
            ((d) cVar.f60296y).cameraError(exc);
            return false;
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.c$c, reason: collision with other inner class name */
    final class C0916c implements l {
        C0916c() {
        }
    }

    final class d implements e {
        d() {
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public final void cameraClosed() {
            Iterator it = c.this.f60281j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).cameraClosed();
            }
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public final void cameraError(Exception exc) {
            Iterator it = c.this.f60281j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).cameraError(exc);
            }
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public final void previewSized() {
            Iterator it = c.this.f60281j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).previewSized();
            }
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public final void previewStarted() {
            Iterator it = c.this.f60281j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).previewStarted();
            }
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public final void previewStopped() {
            Iterator it = c.this.f60281j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).previewStopped();
            }
        }
    }

    public interface e {
        void cameraClosed();

        void cameraError(Exception exc);

        void previewSized();

        void previewStarted();

        void previewStopped();
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60275d = false;
        this.f60278g = false;
        this.f60280i = -1;
        this.f60281j = new ArrayList();
        this.f60283l = new O9.g();
        this.f60288q = null;
        this.f60289r = null;
        this.f60290s = null;
        this.f60291t = 0.1d;
        this.f60292u = null;
        this.f60293v = false;
        this.f60294w = new a();
        b bVar = new b();
        this.f60295x = new C0916c();
        this.f60296y = new d();
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        m(attributeSet);
        this.f60273b = (WindowManager) context.getSystemService("window");
        this.f60274c = new Handler(bVar);
        this.f60279h = new i();
    }

    static void c(c cVar, m mVar) {
        k kVar;
        cVar.f60285n = mVar;
        m mVar2 = cVar.f60284m;
        if (mVar2 != null) {
            if (mVar == null || (kVar = cVar.f60282k) == null) {
                cVar.f60289r = null;
                cVar.f60288q = null;
                cVar.f60286o = null;
                throw new IllegalStateException("containerSize or previewSize is not set yet");
            }
            Rect c11 = kVar.c(mVar);
            if (c11.width() > 0 && c11.height() > 0) {
                cVar.f60286o = c11;
                Rect rect = new Rect(0, 0, mVar2.f18815a, mVar2.f18816b);
                Rect rect2 = cVar.f60286o;
                Rect rect3 = new Rect(rect);
                rect3.intersect(rect2);
                if (cVar.f60290s != null) {
                    rect3.inset(Math.max(0, (rect3.width() - cVar.f60290s.f18815a) / 2), Math.max(0, (rect3.height() - cVar.f60290s.f18816b) / 2));
                } else {
                    double width = rect3.width();
                    double d11 = cVar.f60291t;
                    int min = (int) Math.min(width * d11, rect3.height() * d11);
                    rect3.inset(min, min);
                    if (rect3.height() > rect3.width()) {
                        rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                    }
                }
                cVar.f60288q = rect3;
                Rect rect4 = new Rect(cVar.f60288q);
                Rect rect5 = cVar.f60286o;
                rect4.offset(-rect5.left, -rect5.top);
                int i11 = rect4.left;
                int i12 = mVar.f18815a;
                int width2 = (i11 * i12) / cVar.f60286o.width();
                int i13 = rect4.top;
                int i14 = mVar.f18816b;
                Rect rect6 = new Rect(width2, (i13 * i14) / cVar.f60286o.height(), (rect4.right * i12) / cVar.f60286o.width(), (rect4.bottom * i14) / cVar.f60286o.height());
                cVar.f60289r = rect6;
                if (rect6.width() <= 0 || cVar.f60289r.height() <= 0) {
                    cVar.f60289r = null;
                    cVar.f60288q = null;
                    Log.w("c", "Preview frame is too small");
                } else {
                    ((d) cVar.f60296y).previewSized();
                }
            }
            cVar.requestLayout();
            cVar.x();
        }
    }

    static void f(c cVar) {
        if (!cVar.n() || cVar.f60273b.getDefaultDisplay().getRotation() == cVar.f60280i) {
            return;
        }
        cVar.q();
        cVar.t();
    }

    private void w(O9.h hVar) {
        if (this.f60278g || this.f60272a == null) {
            return;
        }
        Log.i("c", "Starting preview");
        this.f60272a.t(hVar);
        this.f60272a.v();
        this.f60278g = true;
        s();
        ((d) this.f60296y).previewStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        Rect rect;
        float f7;
        m mVar = this.f60287p;
        if (mVar == null || this.f60285n == null || (rect = this.f60286o) == null) {
            return;
        }
        if (this.f60276e != null && mVar.equals(new m(rect.width(), this.f60286o.height()))) {
            w(new O9.h(this.f60276e.getHolder()));
            return;
        }
        TextureView textureView = this.f60277f;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.f60285n != null) {
            int width = this.f60277f.getWidth();
            int height = this.f60277f.getHeight();
            m mVar2 = this.f60285n;
            float f11 = width;
            float f12 = height;
            float f13 = f11 / f12;
            float f14 = mVar2.f18815a / mVar2.f18816b;
            float f15 = 1.0f;
            if (f13 < f14) {
                float f16 = f14 / f13;
                f7 = 1.0f;
                f15 = f16;
            } else {
                f7 = f13 / f14;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f15, f7);
            matrix.postTranslate((f11 - (f15 * f11)) / 2.0f, (f12 - (f7 * f12)) / 2.0f);
            this.f60277f.setTransform(matrix);
        }
        w(new O9.h(this.f60277f.getSurfaceTexture()));
    }

    public final void h(e eVar) {
        this.f60281j.add(eVar);
    }

    public final O9.e i() {
        return this.f60272a;
    }

    public final Rect j() {
        return this.f60288q;
    }

    public final Rect k() {
        return this.f60289r;
    }

    public final m l() {
        return this.f60285n;
    }

    protected final void m(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m9.j.f74666a);
        int dimension = (int) obtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f60290s = new m(dimension, dimension2);
        }
        this.f60275d = obtainStyledAttributes.getBoolean(3, true);
        int integer = obtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.f60292u = new O9.j();
        } else if (integer == 2) {
            this.f60292u = new O9.l();
        } else if (integer == 3) {
            this.f60292u = new O9.m();
        }
        obtainStyledAttributes.recycle();
    }

    protected final boolean n() {
        return this.f60272a != null;
    }

    public final boolean o() {
        O9.e eVar = this.f60272a;
        return eVar == null || eVar.n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f60275d) {
            TextureView textureView = new TextureView(getContext());
            this.f60277f = textureView;
            textureView.setSurfaceTextureListener(new com.journeyapps.barcodescanner.b(this));
            addView(this.f60277f);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f60276e = surfaceView;
        surfaceView.getHolder().addCallback(this.f60294w);
        addView(this.f60276e);
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        m mVar = new m(i13 - i11, i14 - i12);
        this.f60284m = mVar;
        O9.e eVar = this.f60272a;
        if (eVar != null && eVar.m() == null) {
            k kVar = new k(this.f60273b.getDefaultDisplay().getRotation(), mVar);
            this.f60282k = kVar;
            p pVar = this.f60292u;
            if (pVar == null) {
                pVar = this.f60277f != null ? new O9.j() : new O9.l();
            }
            kVar.d(pVar);
            this.f60272a.r(this.f60282k);
            this.f60272a.l();
            boolean z12 = this.f60293v;
            if (z12) {
                this.f60272a.u(z12);
            }
        }
        SurfaceView surfaceView = this.f60276e;
        if (surfaceView == null) {
            TextureView textureView = this.f60277f;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.f60286o;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        v(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f60293v);
        return bundle;
    }

    public final boolean p() {
        return this.f60278g;
    }

    public void q() {
        TextureView textureView;
        SurfaceView surfaceView;
        o.d();
        Log.d("c", "pause()");
        this.f60280i = -1;
        O9.e eVar = this.f60272a;
        if (eVar != null) {
            eVar.k();
            this.f60272a = null;
            this.f60278g = false;
        } else {
            this.f60274c.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.f60287p == null && (surfaceView = this.f60276e) != null) {
            surfaceView.getHolder().removeCallback(this.f60294w);
        }
        if (this.f60287p == null && (textureView = this.f60277f) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f60284m = null;
        this.f60285n = null;
        this.f60289r = null;
        this.f60279h.f();
        ((d) this.f60296y).previewStopped();
    }

    public final void r() {
        O9.e eVar = this.f60272a;
        q();
        long nanoTime = System.nanoTime();
        while (eVar != null && !eVar.n() && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    protected void s() {
    }

    public final void t() {
        o.d();
        Log.d("c", "resume()");
        if (this.f60272a != null) {
            Log.w("c", "initCamera called twice");
        } else {
            O9.e eVar = new O9.e(getContext());
            eVar.q(this.f60283l);
            this.f60272a = eVar;
            eVar.s(this.f60274c);
            this.f60272a.o();
            this.f60280i = this.f60273b.getDefaultDisplay().getRotation();
        }
        if (this.f60287p != null) {
            x();
        } else {
            SurfaceView surfaceView = this.f60276e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f60294w);
            } else {
                TextureView textureView = this.f60277f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.f60277f.getSurfaceTexture();
                        this.f60287p = new m(this.f60277f.getWidth(), this.f60277f.getHeight());
                        x();
                    } else {
                        this.f60277f.setSurfaceTextureListener(new com.journeyapps.barcodescanner.b(this));
                    }
                }
            }
        }
        requestLayout();
        this.f60279h.e(getContext(), this.f60295x);
    }

    public final void u(O9.g gVar) {
        this.f60283l = gVar;
    }

    public final void v(boolean z11) {
        this.f60293v = z11;
        O9.e eVar = this.f60272a;
        if (eVar != null) {
            eVar.u(z11);
        }
    }
}
