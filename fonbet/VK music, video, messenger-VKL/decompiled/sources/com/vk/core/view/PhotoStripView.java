package com.vk.core.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKMultiImageView;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.widget.MenuListView;
import java.util.List;
import xsna.d540;
import xsna.e3m;
import xsna.iah0;
import xsna.m33;
import xsna.njt;
import xsna.u11;

@Deprecated
/* loaded from: classes17.dex */
public class PhotoStripView extends VKMultiImageView {
    public final SparseIntArray f;
    public int g;
    public final GestureDetector h;
    public b i;
    public float j;
    public final Path k;
    public Paint l;
    public TextPaint m;
    public float n;
    public boolean o;
    public boolean p;
    public String q;
    public final float[] r;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            PhotoStripView photoStripView = PhotoStripView.this;
            int height = (int) (x / (photoStripView.getHeight() + photoStripView.g));
            if (height >= photoStripView.b.b.size()) {
                return true;
            }
            photoStripView.playSoundEffect(0);
            b bVar = photoStripView.i;
            if (bVar == null) {
                return true;
            }
            MenuListView menuListView = MenuListView.this;
            ((ProfileFragmentProviderComponent) menuListView.I.getValue()).ye(((UserProfile) menuListView.r.get(height)).c, null).k(menuListView.getContext());
            return true;
        }
    }

    public interface b {
    }

    public PhotoStripView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new SparseIntArray();
        this.g = iah0.a(3);
        a aVar = new a();
        this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.n = 1.0f;
        this.o = false;
        this.p = false;
        this.r = new float[2];
        this.h = new GestureDetector(getContext(), aVar, new Handler(Looper.getMainLooper()));
        this.k = new Path();
    }

    public int getCount() {
        return this.b.b.size() + (this.p ? 1 : 0);
    }

    public float getOffset() {
        return this.j;
    }

    public final void l(int i, @NonNull List list) {
        int min = i >= 0 ? Math.min(list.size(), i) : list.size();
        setCount(min);
        for (int i2 = 0; i2 < min; i2++) {
            h(i2, (String) list.get(i2));
        }
    }

    @Override // com.vk.imageloader.view.VKMultiImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int i = this.g + height;
        int i2 = 0;
        for (int i3 = 0; i3 < getCount(); i3++) {
            i2 = (i * i3) - Math.round(this.j * i);
            if (i3 > 0) {
                float f = this.n;
                if (f < 1.0f) {
                    i2 = (int) (i2 - (((1.0f - f) * height) * i3));
                }
            }
            int i4 = i2 + height;
            if (i4 > getWidth() || (this.p && i3 == getCount() - 1)) {
                break;
            }
            Drawable d = this.b.a(i3).d();
            if (d != null) {
                d.setAlpha(this.f.get(i3, 255));
                if (this.n == 1.0f || ((i3 == 0 && !this.o) || (this.o && i3 == getCount() - 1))) {
                    d.setBounds(Math.round(i2), 0, Math.round(i4), height);
                    d.draw(canvas);
                } else {
                    canvas.save();
                    float f2 = i2;
                    this.k.offset(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    canvas.clipPath(this.k);
                    d.setBounds(Math.round(f2), 0, Math.round(i4), height);
                    d.draw(canvas);
                    this.k.offset(-i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    canvas.restore();
                }
            }
        }
        if (this.p) {
            float f3 = height / 2.0f;
            float f4 = i2 + f3;
            canvas.drawCircle(f4, f3, f3, this.l);
            String str = this.q;
            float[] fArr = this.r;
            canvas.drawText(str, f4 - (fArr[0] / 2.0f), (fArr[1] / 2.0f) + f3, this.m);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            setMeasuredDimension(size2, size);
            return;
        }
        if (this.n < 1.0f) {
            int count = getCount();
            setMeasuredDimension((count > 0 ? size : 0) + (count > 1 ? Math.round((count - 1) * size * this.n) : 0) + (count > 0 ? (count - 1) * this.g : 0), size);
        } else {
            int count2 = getCount();
            setMeasuredDimension((count2 * size) + (count2 > 0 ? this.g * (count2 - 1) : 0), size);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setOverlapOffset(this.n);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.i == null || this.n != 1.0f) {
            return super.onTouchEvent(motionEvent);
        }
        this.h.onTouchEvent(motionEvent);
        return true;
    }

    public void setBorderPadding(int i) {
        this.g = i;
    }

    public void setCount(int i) {
        d540<njt> d540Var = this.b;
        if (d540Var.b.size() != i) {
            k();
            for (int i2 = 0; i2 < i; i2++) {
                Context context = getContext();
                e3m.a aVar = e3m.a;
                setPlaceholder(m33.a(R.drawable.user_placeholder, context));
                b();
                njt njtVar = d540Var.a(i2).d;
                njtVar.getClass();
                njtVar.u(RoundingParams.a());
            }
            requestLayout();
        }
    }

    public void setListener(b bVar) {
        this.i = bVar;
    }

    public void setOffset(float f) {
        this.j = f;
        invalidate();
    }

    public void setOverlapOffset(float f) {
        float f2;
        float b2;
        this.n = f;
        int height = getHeight();
        this.k.reset();
        this.k.setFillType(Path.FillType.EVEN_ODD);
        if (f == 1.0f) {
            return;
        }
        float f3 = height / 2;
        if (this.o) {
            f2 = f3 - (this.g / 2);
            b2 = (3.0f * f2) - ((1.0f - f) * (2.0f * f2));
        } else {
            f2 = (this.g / 2) + f3;
            b2 = u11.b(1.0f, f, 2.0f * f2, -f2);
        }
        Path.Direction direction = Path.Direction.CW;
        this.k.addCircle(f3, f3, f3 + 0.5f, direction);
        this.k.addCircle(b2, f3, f2 + 0.5f, direction);
        invalidate();
    }

    public void setPadding(int i) {
        this.g = i;
        invalidate();
    }

    public void setReverseStack(boolean z) {
        this.o = z;
        invalidate();
    }
}
