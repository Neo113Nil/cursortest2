package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.plaid.internal.EnumC3631g;

/* loaded from: classes.dex */
public class Placeholder extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f18207a;

    /* renamed from: b, reason: collision with root package name */
    public View f18208b;

    /* renamed from: c, reason: collision with root package name */
    public int f18209c;

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18207a = -1;
        this.f18208b = null;
        this.f18209c = 4;
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.f18209c);
        this.f18207a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g.f18465N2) {
                    this.f18207a = obtainStyledAttributes.getResourceId(index, this.f18207a);
                } else if (index == g.f18472O2) {
                    this.f18209c = obtainStyledAttributes.getInt(index, this.f18209c);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f18208b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f18208b.getLayoutParams();
        bVar2.f18191v0.k1(0);
        e.b A10 = bVar.f18191v0.A();
        e.b bVar3 = e.b.FIXED;
        if (A10 != bVar3) {
            bVar.f18191v0.l1(bVar2.f18191v0.W());
        }
        if (bVar.f18191v0.T() != bVar3) {
            bVar.f18191v0.M0(bVar2.f18191v0.x());
        }
        bVar2.f18191v0.k1(8);
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.f18207a == -1 && !isInEditMode()) {
            setVisibility(this.f18209c);
        }
        View findViewById = constraintLayout.findViewById(this.f18207a);
        this.f18208b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f18167j0 = true;
            this.f18208b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f18208b;
    }

    public int getEmptyVisibility() {
        return this.f18209c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            Paint paint = new Paint();
            paint.setARGB(255, EnumC3631g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC3631g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC3631g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f18207a == i10) {
            return;
        }
        View view = this.f18208b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f18208b.getLayoutParams()).f18167j0 = false;
            this.f18208b = null;
        }
        this.f18207a = i10;
        if (i10 == -1 || (findViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f18209c = i10;
    }
}
