package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Rational;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.view.PreviewView;
import androidx.camera.view.a;
import androidx.lifecycle.n;
import java.util.Objects;
import xsna.bwr;
import xsna.d4z;
import xsna.e7y0;
import xsna.ej20;
import xsna.fj20;
import xsna.lhg;
import xsna.o0t;
import xsna.o6y0;
import xsna.p6y0;
import xsna.r0t;
import xsna.re9;
import xsna.s100;
import xsna.snw;
import xsna.spw;
import xsna.u11;
import xsna.ub9;
import xsna.ugz;
import xsna.vm5;
import xsna.wvr;
import xsna.xo9;
import xsna.ze9;
import xsna.zvr;

/* loaded from: classes11.dex */
public final class CameraView extends FrameLayout {
    public long b;
    public c c;
    public boolean d;
    public androidx.camera.view.a e;
    public final a f;
    public PreviewView g;
    public MotionEvent h;

    public enum CaptureMode {
        IMAGE(0),
        VIDEO(1),
        MIXED(2);

        private final int mId;

        CaptureMode(int i) {
            this.mId = i;
        }

        public static CaptureMode a(int i) {
            for (CaptureMode captureMode : values()) {
                if (captureMode.mId == i) {
                    return captureMode;
                }
            }
            throw new IllegalArgumentException();
        }

        public final int h() {
            return this.mId;
        }
    }

    public class b implements o0t<bwr> {
        @Override // xsna.o0t
        public final void onFailure(Throwable th) {
            throw new RuntimeException(th);
        }

        @Override // xsna.o0t
        public final /* bridge */ /* synthetic */ void onSuccess(@Nullable bwr bwrVar) {
        }
    }

    public static class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public c b;

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            this.b.onScale(scaleGestureDetector);
            return true;
        }
    }

    public CameraView(@NonNull Context context) {
        this(context, null);
    }

    private long getMaxVideoSize() {
        return this.e.d;
    }

    private void setMaxVideoDuration(long j) {
        this.e.c = j;
    }

    private void setMaxVideoSize(long j) {
        this.e.d = j;
    }

    public final void a(Context context, @Nullable AttributeSet attributeSet) {
        PreviewView previewView = new PreviewView(getContext());
        this.g = previewView;
        addView(previewView, 0);
        this.e = new androidx.camera.view.a(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
            setScaleType(PreviewView.ScaleType.a(obtainStyledAttributes.getInteger(4, getScaleType().h())));
            setPinchToZoomEnabled(obtainStyledAttributes.getBoolean(3, this.d));
            setCaptureMode(CaptureMode.a(obtainStyledAttributes.getInteger(0, getCaptureMode().h())));
            int i = obtainStyledAttributes.getInt(2, 2);
            if (i == 0) {
                setCameraLensFacing(null);
            } else if (i == 1) {
                setCameraLensFacing(0);
            } else if (i == 2) {
                setCameraLensFacing(1);
            }
            int i2 = obtainStyledAttributes.getInt(1, 0);
            if (i2 == 1) {
                setFlash(0);
            } else if (i2 == 2) {
                setFlash(1);
            } else if (i2 == 4) {
                setFlash(2);
            }
            obtainStyledAttributes.recycle();
        }
        if (getBackground() == null) {
            setBackgroundColor(-15658735);
        }
        this.c = new c(this, context);
    }

    @Nullable
    public Integer getCameraLensFacing() {
        return this.e.g;
    }

    @NonNull
    public CaptureMode getCaptureMode() {
        return this.e.b;
    }

    public int getDisplaySurfaceRotation() {
        Display display = getDisplay();
        if (display == null) {
            return 0;
        }
        return display.getRotation();
    }

    public int getFlash() {
        return this.e.e;
    }

    public long getMaxVideoDuration() {
        return this.e.c;
    }

    public float getMaxZoomRatio() {
        d4z d4zVar = this.e.f;
        if (d4zVar != null) {
            return ((e7y0) ((ze9) d4zVar.b()).i().d()).c();
        }
        return 1.0f;
    }

    public float getMinZoomRatio() {
        d4z d4zVar = this.e.f;
        if (d4zVar != null) {
            return ((e7y0) ((ze9) d4zVar.b()).i().d()).d();
        }
        return 1.0f;
    }

    @NonNull
    public n<PreviewView.StreamState> getPreviewStreamState() {
        return this.g.getPreviewStreamState();
    }

    @NonNull
    public PreviewView getPreviewView() {
        return this.g;
    }

    @NonNull
    public PreviewView.ScaleType getScaleType() {
        return this.g.getScaleType();
    }

    public float getZoomRatio() {
        d4z d4zVar = this.e.f;
        if (d4zVar != null) {
            return ((e7y0) ((ze9) d4zVar.b()).i().d()).b();
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((DisplayManager) getContext().getSystemService("display")).registerDisplayListener(this.f, new Handler(Looper.getMainLooper()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((DisplayManager) getContext().getSystemService("display")).unregisterDisplayListener(this.f);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    @SuppressLint({"MissingPermission"})
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.e.getClass();
        this.e.a();
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    @SuppressLint({"MissingPermission"})
    public final void onMeasure(int i, int i2) {
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            this.e.getClass();
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        int i;
        Integer valueOf;
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setScaleType(PreviewView.ScaleType.a(bundle.getInt("scale_type")));
        setZoomRatio(bundle.getFloat("zoom_ratio"));
        setPinchToZoomEnabled(bundle.getBoolean("pinch_to_zoom_enabled"));
        String string = bundle.getString("flash");
        if (string == null) {
            throw new NullPointerException("name cannot be null");
        }
        i = 2;
        int i2 = 1;
        switch (string) {
            case "ON":
                i = 1;
                break;
            case "OFF":
                break;
            case "AUTO":
                i = 0;
                break;
            default:
                throw new IllegalArgumentException("Unknown flash mode name ".concat(string));
        }
        setFlash(i);
        setMaxVideoDuration(bundle.getLong("max_video_duration"));
        setMaxVideoSize(bundle.getLong("max_video_size"));
        String string2 = bundle.getString("camera_direction");
        if (TextUtils.isEmpty(string2)) {
            valueOf = null;
        } else {
            if (string2 == null) {
                throw new NullPointerException("name cannot be null");
            }
            if (!string2.equals("BACK")) {
                if (!string2.equals("FRONT")) {
                    throw new IllegalArgumentException("Unknown len facing name ".concat(string2));
                }
                i2 = 0;
            }
            valueOf = Integer.valueOf(i2);
        }
        setCameraLensFacing(valueOf);
        setCaptureMode(CaptureMode.a(bundle.getInt("captureMode")));
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        String str;
        String str2;
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putInt("scale_type", getScaleType().h());
        bundle.putFloat("zoom_ratio", getZoomRatio());
        bundle.putBoolean("pinch_to_zoom_enabled", this.d);
        int flash = getFlash();
        if (flash == 0) {
            str = "AUTO";
        } else if (flash == 1) {
            str = "ON";
        } else {
            if (flash != 2) {
                throw new IllegalArgumentException(lhg.a(flash, "Unknown flash mode "));
            }
            str = "OFF";
        }
        bundle.putString("flash", str);
        bundle.putLong("max_video_duration", getMaxVideoDuration());
        bundle.putLong("max_video_size", getMaxVideoSize());
        if (getCameraLensFacing() != null) {
            int intValue = getCameraLensFacing().intValue();
            if (intValue == 0) {
                str2 = "FRONT";
            } else {
                if (intValue != 1) {
                    throw new IllegalArgumentException(lhg.a(intValue, "Unknown lens facing "));
                }
                str2 = "BACK";
            }
            bundle.putString("camera_direction", str2);
        }
        bundle.putInt("captureMode", getCaptureMode().h());
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if ((r0 != null ? ((xsna.e7y0) ((xsna.ze9) r0.b()).i().d()).c() : 1.0f) != 1.0f) goto L26;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        this.e.getClass();
        if (this.d) {
            this.c.onTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() == 2 && this.d) {
            d4z d4zVar = this.e.f;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = System.currentTimeMillis();
            return true;
        }
        if (action != 1) {
            return false;
        }
        if (System.currentTimeMillis() - this.b < ViewConfiguration.getLongPressTimeout() && this.e.f != null) {
            this.h = motionEvent;
            performClick();
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        ugz e;
        super.performClick();
        MotionEvent motionEvent = this.h;
        float x = motionEvent != null ? motionEvent.getX() : getX() + (getWidth() / 2.0f);
        MotionEvent motionEvent2 = this.h;
        float y = motionEvent2 != null ? motionEvent2.getY() : (getHeight() / 2.0f) + getY();
        this.h = null;
        d4z d4zVar = this.e.f;
        if (d4zVar != null) {
            fj20 meteringPointFactory = this.g.getMeteringPointFactory();
            ej20 a2 = meteringPointFactory.a(x, y, 0.16666667f);
            ej20 a3 = meteringPointFactory.a(x, y, 0.25f);
            CameraControlInternal a4 = d4zVar.a();
            wvr.a aVar = new wvr.a(a2);
            aVar.a(a3, 2);
            final wvr wvrVar = new wvr(aVar);
            re9 re9Var = (re9) a4;
            if (re9Var.j()) {
                final zvr zvrVar = re9Var.i;
                final Rational rational = re9Var.h;
                zvrVar.getClass();
                e = r0t.e(ub9.a(new ub9.c() { // from class: xsna.yvr
                    @Override // xsna.ub9.c
                    public final Object attachCompleter(ub9.a aVar2) {
                        zvr zvrVar2 = zvr.this;
                        zvrVar2.b.execute(new fvn(zvrVar2, aVar2, wvrVar, rational, 1));
                        return "startFocusAndMetering";
                    }
                }));
            } else {
                e = new snw.a(new CameraControl$OperationCanceledException("Camera is not active."));
            }
            r0t.a(e, new b(), xo9.g());
        }
        return true;
    }

    public void setCameraLensFacing(@Nullable Integer num) {
        androidx.camera.view.a aVar = this.e;
        if (Objects.equals(aVar.g, num)) {
            return;
        }
        aVar.g = num;
    }

    public void setCaptureMode(@NonNull CaptureMode captureMode) {
        this.e.b = captureMode;
    }

    public void setFlash(int i) {
        this.e.e = i;
    }

    public void setPinchToZoomEnabled(boolean z) {
        this.d = z;
    }

    public void setScaleType(@NonNull PreviewView.ScaleType scaleType) {
        this.g.setScaleType(scaleType);
    }

    public void setZoomRatio(float f) {
        ugz aVar;
        ugz e;
        vm5 e2;
        d4z d4zVar = this.e.f;
        if (d4zVar == null) {
            s100.a("CameraXModule", "Failed to set zoom ratio", null);
            return;
        }
        re9 re9Var = (re9) d4zVar.a();
        if (re9Var.j()) {
            p6y0 p6y0Var = re9Var.j;
            synchronized (p6y0Var.c) {
                try {
                    p6y0Var.c.e(f);
                    e2 = spw.e(p6y0Var.c);
                } catch (IllegalArgumentException e3) {
                    aVar = new snw.a(e3);
                }
            }
            p6y0Var.a(e2);
            aVar = ub9.a(new o6y0(p6y0Var, e2));
            e = r0t.e(aVar);
        } else {
            e = new snw.a(new CameraControl$OperationCanceledException("Camera is not active."));
        }
        r0t.a(e, new a.c(), xo9.g());
    }

    public CameraView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    @NonNull
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public CameraView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        this.f = new a();
        a(context, attributeSet);
    }

    public CameraView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = true;
        this.f = new a();
        a(context, attributeSet);
    }

    public class a implements DisplayManager.DisplayListener {
        public a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            CameraView.this.e.a();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    public class c extends ScaleGestureDetector implements ScaleGestureDetector.OnScaleGestureListener {
        public final /* synthetic */ CameraView b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(CameraView cameraView, Context context) {
            super(context, r0);
            d dVar = new d();
            this.b = cameraView;
            dVar.b = this;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            float b = scaleFactor > 1.0f ? u11.b(scaleFactor, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - scaleFactor) * 2.0f);
            CameraView cameraView = this.b;
            float zoomRatio = cameraView.getZoomRatio() * b;
            float maxZoomRatio = cameraView.getMaxZoomRatio();
            float minZoomRatio = cameraView.getMinZoomRatio();
            cameraView.getClass();
            cameraView.setZoomRatio(Math.min(Math.max(zoomRatio, minZoomRatio), maxZoomRatio));
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }
}
