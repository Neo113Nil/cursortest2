package c7;

import D6.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import b7.InterfaceC2406a;
import b7.InterfaceC2407b;
import c7.AbstractC2891a;

/* renamed from: c7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2893c extends ImageView {
    private static boolean sGlobalLegacyVisibilityHandlingEnabled = false;
    private float mAspectRatio;
    private C2892b mDraweeHolder;
    private Object mExtraData;
    private boolean mInitialised;
    private boolean mLegacyVisibilityHandlingEnabled;
    private final AbstractC2891a.C0443a mMeasureSpec;

    public AbstractC2893c(Context context) {
        super(context);
        this.mMeasureSpec = new AbstractC2891a.C0443a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        this.mExtraData = null;
        a(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z10) {
        sGlobalLegacyVisibilityHandlingEnabled = z10;
    }

    public final void a(Context context) {
        try {
            if (N7.b.d()) {
                N7.b.a("DraweeView#init");
            }
            if (this.mInitialised) {
                if (N7.b.d()) {
                    N7.b.b();
                    return;
                }
                return;
            }
            boolean z10 = true;
            this.mInitialised = true;
            this.mDraweeHolder = C2892b.c(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (N7.b.d()) {
                    N7.b.b();
                    return;
                }
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                z10 = false;
            }
            this.mLegacyVisibilityHandlingEnabled = z10;
            if (N7.b.d()) {
                N7.b.b();
            }
        } catch (Throwable th2) {
            if (N7.b.d()) {
                N7.b.b();
            }
            throw th2;
        }
    }

    public final void b() {
        Drawable drawable;
        if (!this.mLegacyVisibilityHandlingEnabled || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public void doAttach() {
        this.mDraweeHolder.j();
    }

    public void doDetach() {
        this.mDraweeHolder.k();
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    public InterfaceC2406a getController() {
        return this.mDraweeHolder.e();
    }

    public Object getExtraData() {
        return this.mExtraData;
    }

    public InterfaceC2407b getHierarchy() {
        return this.mDraweeHolder.f();
    }

    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.g();
    }

    public boolean hasController() {
        return this.mDraweeHolder.e() != null;
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.h();
    }

    public void onAttach() {
        doAttach();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        onAttach();
    }

    public void onDetach() {
        doDetach();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        onDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        b();
        onAttach();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        AbstractC2891a.C0443a c0443a = this.mMeasureSpec;
        c0443a.f27608a = i10;
        c0443a.f27609b = i11;
        AbstractC2891a.b(c0443a, this.mAspectRatio, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        AbstractC2891a.C0443a c0443a2 = this.mMeasureSpec;
        super.onMeasure(c0443a2.f27608a, c0443a2.f27609b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        b();
        onDetach();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.l(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        b();
    }

    public void resetActualImage() {
        setController(null);
    }

    public void setAspectRatio(float f10) {
        if (f10 == this.mAspectRatio) {
            return;
        }
        this.mAspectRatio = f10;
        requestLayout();
    }

    public void setController(InterfaceC2406a interfaceC2406a) {
        this.mDraweeHolder.o(interfaceC2406a);
        super.setImageDrawable(this.mDraweeHolder.g());
    }

    public void setExtraData(Object obj) {
        this.mExtraData = obj;
    }

    public void setHierarchy(InterfaceC2407b interfaceC2407b) {
        this.mDraweeHolder.p(interfaceC2407b);
        super.setImageDrawable(this.mDraweeHolder.g());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        a(getContext());
        this.mDraweeHolder.n();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        a(getContext());
        this.mDraweeHolder.n();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i10) {
        a(getContext());
        this.mDraweeHolder.n();
        super.setImageResource(i10);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        a(getContext());
        this.mDraweeHolder.n();
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z10) {
        this.mLegacyVisibilityHandlingEnabled = z10;
    }

    @Override // android.view.View
    public String toString() {
        i.a b10 = i.b(this);
        C2892b c2892b = this.mDraweeHolder;
        return b10.b("holder", c2892b != null ? c2892b.toString() : "<no holder set>").toString();
    }

    public AbstractC2893c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMeasureSpec = new AbstractC2891a.C0443a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        this.mExtraData = null;
        a(context);
    }

    public AbstractC2893c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mMeasureSpec = new AbstractC2891a.C0443a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        this.mExtraData = null;
        a(context);
    }
}
