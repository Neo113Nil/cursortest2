package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.CameraInternal;
import androidx.lifecycle.n;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import xsna.bo5;
import xsna.f6d0;
import xsna.fj20;
import xsna.fsk;
import xsna.g0e;
import xsna.gh9;
import xsna.i73;
import xsna.ikn0;
import xsna.lhg;
import xsna.n3d0;
import xsna.qoo0;
import xsna.tiz;
import xsna.tzt0;
import xsna.ug50;
import xsna.ui9;
import xsna.v5d0;
import xsna.w5d0;
import xsna.wiz;
import xsna.xo9;
import xsna.z5d0;
import xsna.zjn0;
import xsna.zq5;

/* loaded from: classes11.dex */
public final class PreviewView extends FrameLayout {
    public static final ImplementationMode j = ImplementationMode.PERFORMANCE;

    @NonNull
    public ImplementationMode b;

    @Nullable
    public z5d0 c;

    @NonNull
    public final androidx.camera.view.c d;

    @NonNull
    public final ug50<StreamState> e;

    @Nullable
    public final AtomicReference<androidx.camera.view.b> f;

    @NonNull
    public final f6d0 g;
    public final g0e h;
    public final a i;

    public enum ImplementationMode {
        PERFORMANCE(0),
        COMPATIBLE(1);

        private final int mId;

        ImplementationMode(int i) {
            this.mId = i;
        }

        public static ImplementationMode a(int i) {
            for (ImplementationMode implementationMode : values()) {
                if (implementationMode.mId == i) {
                    return implementationMode;
                }
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown implementation mode id "));
        }

        public final int h() {
            return this.mId;
        }
    }

    public enum ScaleType {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        private final int mId;

        ScaleType(int i) {
            this.mId = i;
        }

        public static ScaleType a(int i) {
            for (ScaleType scaleType : values()) {
                if (scaleType.mId == i) {
                    return scaleType;
                }
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown scale type id "));
        }

        public final int h() {
            return this.mId;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StreamState {
        private static final /* synthetic */ StreamState[] $VALUES;
        public static final StreamState IDLE;
        public static final StreamState STREAMING;

        static {
            StreamState streamState = new StreamState("IDLE", 0);
            IDLE = streamState;
            StreamState streamState2 = new StreamState("STREAMING", 1);
            STREAMING = streamState2;
            $VALUES = new StreamState[]{streamState, streamState2};
        }

        public StreamState() {
            throw null;
        }

        public static StreamState valueOf(String str) {
            return (StreamState) Enum.valueOf(StreamState.class, str);
        }

        public static StreamState[] values() {
            return (StreamState[]) $VALUES.clone();
        }
    }

    public class a implements n3d0.d {
        public a() {
        }

        public final void a(@NonNull zjn0 zjn0Var) {
            z5d0 z5d0Var;
            int i;
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                PreviewView.this.getContext().getMainExecutor().execute(new i73(4, this, zjn0Var));
                return;
            }
            CameraInternal cameraInternal = zjn0Var.c;
            Executor mainExecutor = PreviewView.this.getContext().getMainExecutor();
            v5d0 v5d0Var = new v5d0(this, cameraInternal, zjn0Var);
            zjn0Var.j = v5d0Var;
            zjn0Var.k = mainExecutor;
            bo5 bo5Var = zjn0Var.i;
            if (bo5Var != null) {
                mainExecutor.execute(new zq5(5, v5d0Var, bo5Var));
            }
            PreviewView previewView = PreviewView.this;
            ImplementationMode implementationMode = previewView.b;
            boolean equals = zjn0Var.c.b().e().equals("androidx.camera.camera2.legacy");
            if (zjn0Var.b || equals || (i = b.b[implementationMode.ordinal()]) == 1) {
                PreviewView previewView2 = PreviewView.this;
                qoo0 qoo0Var = new qoo0(previewView2, previewView2.d);
                qoo0Var.h = false;
                qoo0Var.j = new AtomicReference<>();
                z5d0Var = qoo0Var;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Invalid implementation mode: " + implementationMode);
                }
                PreviewView previewView3 = PreviewView.this;
                z5d0Var = new ikn0(previewView3, previewView3.d);
            }
            previewView.c = z5d0Var;
            ui9 b = cameraInternal.b();
            PreviewView previewView4 = PreviewView.this;
            androidx.camera.view.b bVar = new androidx.camera.view.b(b, previewView4.e, previewView4.c);
            PreviewView.this.f.set(bVar);
            wiz d = cameraInternal.d();
            Executor mainExecutor2 = PreviewView.this.getContext().getMainExecutor();
            synchronized (d.b) {
                wiz.a aVar = (wiz.a) d.b.get(bVar);
                if (aVar != null) {
                    aVar.b.set(false);
                }
                wiz.a aVar2 = new wiz.a(mainExecutor2, bVar);
                d.b.put(bVar, aVar2);
                xo9.t().execute(new tiz(d, aVar, aVar2));
            }
            PreviewView.this.c.e(zjn0Var, new w5d0(this, bVar, cameraInternal));
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ImplementationMode.values().length];
            b = iArr;
            try {
                iArr[ImplementationMode.COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ImplementationMode.PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ScaleType.FILL_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ScaleType.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ScaleType.FILL_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ScaleType.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            PreviewView.this.getClass();
            return true;
        }
    }

    public PreviewView(@NonNull Context context) {
        this(context, null);
    }

    private int getViewPortScaleType() {
        switch (b.a[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                throw new IllegalStateException("Unexpected scale type: " + getScaleType());
        }
    }

    public final void a() {
        z5d0 z5d0Var = this.c;
        if (z5d0Var != null) {
            z5d0Var.f();
        }
        f6d0 f6d0Var = this.g;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        f6d0Var.getClass();
        fsk.m();
        synchronized (f6d0Var) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0) {
                    f6d0Var.b = f6d0Var.a.a(layoutDirection, size);
                    return;
                }
                f6d0Var.b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public Bitmap getBitmap() {
        fsk.m();
        z5d0 z5d0Var = this.c;
        if (z5d0Var == null) {
            return null;
        }
        FrameLayout frameLayout = z5d0Var.b;
        Bitmap b2 = z5d0Var.b();
        if (b2 == null) {
            return null;
        }
        androidx.camera.view.c cVar = z5d0Var.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!cVar.f()) {
            return b2;
        }
        Matrix d = cVar.d();
        RectF e = cVar.e(layoutDirection, size);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), b2.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(d);
        matrix.postScale(e.width() / cVar.a.getWidth(), e.height() / cVar.a.getHeight());
        matrix.postTranslate(e.left, e.top);
        canvas.drawBitmap(b2, matrix, new Paint(7));
        return createBitmap;
    }

    @Nullable
    public gh9 getController() {
        fsk.m();
        return null;
    }

    @NonNull
    public ImplementationMode getImplementationMode() {
        fsk.m();
        return this.b;
    }

    @NonNull
    public fj20 getMeteringPointFactory() {
        fsk.m();
        return this.g;
    }

    @NonNull
    public n<StreamState> getPreviewStreamState() {
        return this.e;
    }

    @NonNull
    public ScaleType getScaleType() {
        fsk.m();
        return this.d.f;
    }

    @NonNull
    public n3d0.d getSurfaceProvider() {
        fsk.m();
        return this.i;
    }

    @Nullable
    public tzt0 getViewPort() {
        fsk.m();
        if (getDisplay() == null) {
            return null;
        }
        getDisplay().getRotation();
        fsk.m();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        return new tzt0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnLayoutChangeListener(this.h);
        z5d0 z5d0Var = this.c;
        if (z5d0Var != null) {
            z5d0Var.c();
        }
        getDisplay();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.h);
        z5d0 z5d0Var = this.c;
        if (z5d0Var != null) {
            z5d0Var.d();
        }
    }

    public void setController(@Nullable gh9 gh9Var) {
        fsk.m();
        getDisplay();
        getViewPort();
    }

    public void setImplementationMode(@NonNull ImplementationMode implementationMode) {
        fsk.m();
        this.b = implementationMode;
    }

    public void setScaleType(@NonNull ScaleType scaleType) {
        fsk.m();
        this.d.f = scaleType;
        a();
        getDisplay();
        getViewPort();
    }

    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2;
        ImplementationMode implementationMode = j;
        this.b = implementationMode;
        androidx.camera.view.c cVar = new androidx.camera.view.c();
        cVar.f = androidx.camera.view.c.g;
        this.d = cVar;
        this.e = new ug50<>(StreamState.IDLE);
        this.f = new AtomicReference<>();
        this.g = new f6d0(cVar);
        this.h = new g0e(this, 1);
        this.i = new a();
        fsk.m();
        Resources.Theme theme = context.getTheme();
        int[] iArr = R$styleable.b;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
        if (Build.VERSION.SDK_INT >= 29) {
            context2 = context;
            saveAttributeDataForStyleable(context2, iArr, attributeSet, obtainStyledAttributes, i, i2);
        } else {
            context2 = context;
        }
        try {
            setScaleType(ScaleType.a(obtainStyledAttributes.getInteger(1, cVar.f.h())));
            setImplementationMode(ImplementationMode.a(obtainStyledAttributes.getInteger(0, implementationMode.h())));
            obtainStyledAttributes.recycle();
            new ScaleGestureDetector(context2, new c());
            if (getBackground() == null) {
                setBackgroundColor(getContext().getColor(R.color.black));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
