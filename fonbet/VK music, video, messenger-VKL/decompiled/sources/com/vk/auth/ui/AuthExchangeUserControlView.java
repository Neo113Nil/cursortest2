package com.vk.auth.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.auth.common.R$styleable;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.image.c;
import com.vk.core.ui.themes.VKReplacerView;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.e370;
import xsna.fvr;
import xsna.hnj;
import xsna.iah0;
import xsna.ifx0;
import xsna.krv0;
import xsna.t65;
import xsna.x9;

/* compiled from: AuthExchangeUserControlView.kt */
/* loaded from: classes15.dex */
public final class AuthExchangeUserControlView extends FrameLayout {
    public static final int n;
    public static final int o;
    public static final int p;
    public final ImageView b;
    public final View c;
    public final TextView d;
    public boolean e;
    public final View f;
    public final VKImageController<View> g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final int k;
    public boolean l;
    public final int m;

    /* compiled from: AuthExchangeUserControlView.kt */
    public static final class CustomState extends View.BaseSavedState {
        public static final Parcelable.Creator<CustomState> CREATOR = new a();
        public boolean b;

        /* compiled from: AuthExchangeUserControlView.kt */
        public static final class a implements Parcelable.Creator<CustomState> {
            @Override // android.os.Parcelable.Creator
            public final CustomState createFromParcel(Parcel parcel) {
                return new CustomState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomState[] newArray(int i) {
                return new CustomState[i];
            }
        }

        public CustomState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public CustomState(Parcel parcel) {
            super(parcel);
            this.b = parcel.readInt() != 0;
        }
    }

    static {
        float f = 2;
        n = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * f);
        o = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * f);
        bpn0 bpn0Var = t65.a;
        p = (int) ((20 * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public AuthExchangeUserControlView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        this.e = true;
        Paint c = x9.c(true);
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        c.setXfermode(new PorterDuffXfermode(mode));
        c.setColor(0);
        this.h = c;
        Paint c2 = x9.c(true);
        Paint.Style style = Paint.Style.STROKE;
        c2.setStyle(style);
        int i = o;
        float f = i;
        c2.setStrokeWidth(3.0f * f);
        c2.setXfermode(new PorterDuffXfermode(mode));
        c2.setColor(0);
        this.i = c2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(style);
        paint.setStrokeWidth(f);
        this.j = paint;
        setLayerType(1, null);
        LayoutInflater.from(getContext()).inflate(R.layout.vk_auth_exchange_user_layout, this);
        VKReplacerView vKReplacerView = (VKReplacerView) findViewById(R.id.exchange_user_avatar_view);
        ImageView imageView = (ImageView) findViewById(R.id.selected_icon);
        this.b = imageView;
        this.c = findViewById(R.id.delete_icon);
        this.d = (TextView) findViewById(R.id.notifications_counter);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        try {
            int i2 = obtainStyledAttributes.getInt(4, 0);
            this.k = i2;
            setBorderSelectionColor(obtainStyledAttributes.getColor(1, krv0.m(R.attr.vk_ui_stroke_accent, getContext())));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, -1);
            this.m = obtainStyledAttributes.getDimensionPixelSize(2, n);
            obtainStyledAttributes.recycle();
            ifx0 ifx0Var = e370.c;
            VKImageController<View> create = (ifx0Var != null ? ifx0Var : null).b().create(getContext());
            this.g = create;
            View view = ((c) create).getView();
            this.f = view;
            vKReplacerView.a(view);
            if (dimensionPixelSize != -1) {
                view.getLayoutParams().width = dimensionPixelSize;
                view.getLayoutParams().height = dimensionPixelSize;
            }
            if (dimensionPixelSize2 != -1) {
                imageView.getLayoutParams().width = dimensionPixelSize2;
                imageView.getLayoutParams().height = dimensionPixelSize2;
            }
            if (i2 == 1) {
                int i3 = i * 4;
                view.getLayoutParams().width += i3;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i3 + layoutParams.height;
                int i4 = i * 2;
                view.setPadding(i4, i4, i4, i4);
                ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).bottomMargin += i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                marginLayoutParams.setMarginEnd(marginLayoutParams.getMarginEnd() + i4);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(View view, Canvas canvas) {
        if (view.getVisibility() != 0) {
            return;
        }
        canvas.drawCircle((view.getRight() + view.getLeft()) / 2.0f, (view.getBottom() + view.getTop()) / 2.0f, (view.getWidth() / 2.0f) + this.m, this.h);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view.equals(this.f)) {
            if (this.l) {
                Paint paint = this.j;
                if (paint.getColor() != 0) {
                    float right = (r8.getRight() + r8.getLeft()) / 2.0f;
                    float bottom = (r8.getBottom() + r8.getTop()) / 2.0f;
                    float min = Math.min(r8.getWidth(), r8.getHeight()) / 2.0f;
                    canvas.drawCircle(right, bottom, min, this.i);
                    canvas.drawCircle(right, bottom, min - (paint.getStrokeWidth() / 2.0f), paint);
                }
            }
            if (this.e) {
                a(this.b, canvas);
            }
            a(this.c, canvas);
        }
        return drawChild;
    }

    public final View getDeleteButton() {
        return this.c;
    }

    public final TextView getNotificationsIcon() {
        return this.d;
    }

    public final ImageView getSelectedIcon() {
        return this.b;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        CustomState customState = (CustomState) parcelable;
        super.onRestoreInstanceState(customState.getSuperState());
        this.l = customState.b;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CustomState customState = new CustomState(super.onSaveInstanceState());
        customState.b = this.l;
        return customState;
    }

    public final void setBorderSelectionColor(int i) {
        this.j.setColor(i);
    }

    public final void setDeleteButtonVisible(boolean z) {
        int i = z ? 0 : 8;
        View view = this.c;
        view.setVisibility(i);
        if (z) {
            fvr.o(iah0.a(10), view);
        } else {
            setTouchDelegate(null);
        }
    }

    public final void setNotificationsCount(int i) {
        String valueOf = i < 100 ? String.valueOf(i) : "99+";
        TextView textView = this.d;
        textView.setText(valueOf);
        int length = valueOf.length();
        int i2 = p;
        if (length <= 1) {
            textView.getLayoutParams().width = i2;
            textView.getLayoutParams().height = i2;
            textView.setBackgroundResource(R.drawable.vk_auth_bg_exchange_notifications_oval);
        } else {
            textView.getLayoutParams().width = -2;
            textView.getLayoutParams().height = i2;
            textView.setBackgroundResource(R.drawable.vk_auth_bg_exchange_notifications_rect);
        }
        textView.requestLayout();
    }

    public final void setNotificationsIconVisible(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    public final void setSelectedIconBorderEnabled(boolean z) {
        this.e = z;
        invalidate();
    }

    public final void setSelectionVisible(boolean z) {
        ImageView imageView = this.b;
        int i = this.k;
        if (i == 0) {
            imageView.setVisibility(z ? 0 : 8);
            return;
        }
        if (i == 1) {
            this.l = z;
            invalidate();
        } else {
            if (i != 2) {
                return;
            }
            imageView.setVisibility(z ? 0 : 8);
            this.l = z;
            invalidate();
        }
    }

    private static /* synthetic */ void getSelectionStyle$annotations() {
    }
}
