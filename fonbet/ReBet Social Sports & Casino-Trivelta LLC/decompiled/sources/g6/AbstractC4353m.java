package g6;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import h6.C4470F;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z6.AbstractC6931a;
import z6.AbstractC6936f;

/* renamed from: g6.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4353m extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final String f47095a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47096b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnClickListener f47097c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnClickListener f47098d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f47099e;

    /* renamed from: f, reason: collision with root package name */
    public int f47100f;

    /* renamed from: g, reason: collision with root package name */
    public int f47101g;

    /* renamed from: h, reason: collision with root package name */
    public T7.B f47102h;

    /* renamed from: i, reason: collision with root package name */
    public final int f47103i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4353m(Context context, AttributeSet attributeSet, int i10, int i11, String analyticsButtonCreatedEventName, String analyticsButtonTappedEventName) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsButtonCreatedEventName, "analyticsButtonCreatedEventName");
        Intrinsics.checkNotNullParameter(analyticsButtonTappedEventName, "analyticsButtonTappedEventName");
        i11 = i11 == 0 ? getDefaultStyleResource() : i11;
        c(context, attributeSet, i10, i11 == 0 ? AbstractC6936f.f68619c : i11);
        this.f47095a = analyticsButtonCreatedEventName;
        this.f47096b = analyticsButtonTappedEventName;
        setClickable(true);
        setFocusable(true);
    }

    public static final void l(AbstractC4353m this$0, View view) {
        if (Y7.a.d(AbstractC4353m.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.e(this$0.getContext());
            View.OnClickListener onClickListener = this$0.f47098d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            View.OnClickListener onClickListener2 = this$0.f47097c;
            if (onClickListener2 == null) {
                return;
            }
            onClickListener2.onClick(view);
        } catch (Throwable th2) {
            Y7.a.b(th2, AbstractC4353m.class);
        }
    }

    public void b(View view) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.f47097c;
            if (onClickListener == null) {
                return;
            }
            onClickListener.onClick(view);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            g(context, attributeSet, i10, i11);
            h(context, attributeSet, i10, i11);
            i(context, attributeSet, i10, i11);
            j(context, attributeSet, i10, i11);
            k();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public void d(Context context) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            C4470F.f47729b.a(context, null).f(this.f47095a);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public void e(Context context) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            C4470F.f47729b.a(context, null).f(this.f47096b);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public int f(String str) {
        if (Y7.a.d(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil(getPaint().measureText(str));
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return 0;
        }
    }

    public final void g(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (isInEditMode()) {
                return;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.background}, i10, i11);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(AbstractC5338c.getColor(context, AbstractC6931a.f68597a));
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            Y7.a.b(th3, this);
        }
    }

    @NotNull
    public Activity getActivity() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new C4357q("Unable to get Activity.");
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    @NotNull
    public final String getAnalyticsButtonCreatedEventName() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return this.f47095a;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    @NotNull
    public final String getAnalyticsButtonTappedEventName() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return this.f47096b;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    @Nullable
    public final j.e getAndroidxActivityResultRegistryOwner() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            ComponentCallbacks2 activity = getActivity();
            if (activity instanceof j.e) {
                return (j.e) activity;
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (Y7.a.d(this)) {
            return 0;
        }
        try {
            return this.f47099e ? this.f47100f : super.getCompoundPaddingLeft();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (Y7.a.d(this)) {
            return 0;
        }
        try {
            return this.f47099e ? this.f47101g : super.getCompoundPaddingRight();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return 0;
        }
    }

    public abstract int getDefaultRequestCode();

    public int getDefaultStyleResource() {
        if (Y7.a.d(this)) {
            return 0;
        }
        try {
            return this.f47103i;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return 0;
        }
    }

    @Nullable
    public final Fragment getFragment() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            T7.B b10 = this.f47102h;
            if (b10 == null) {
                return null;
            }
            return b10.c();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    @Nullable
    public final android.app.Fragment getNativeFragment() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            T7.B b10 = this.f47102h;
            if (b10 == null) {
                return null;
            }
            return b10.b();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public int getRequestCode() {
        if (Y7.a.d(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return 0;
        }
    }

    public final void h(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.drawableLeft, R.attr.drawableTop, R.attr.drawableRight, R.attr.drawableBottom, R.attr.drawablePadding}, i10, i11);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
            try {
                setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
                obtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            Y7.a.b(th3, this);
        }
    }

    public final void i(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom}, i10, i11);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
            try {
                setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void j(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.textColor}, i10, i11);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, colorResources, defStyleAttr, defStyleRes)");
            try {
                setTextColor(obtainStyledAttributes.getColorStateList(0));
                obtainStyledAttributes.recycle();
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.gravity}, i10, i11);
                Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, gravityResources, defStyleAttr, defStyleRes)");
                try {
                    int i12 = obtainStyledAttributes.getInt(0, 17);
                    obtainStyledAttributes.recycle();
                    setGravity(i12);
                    obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.textSize, R.attr.textStyle, R.attr.text}, i10, i11);
                    Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, attrsResources, defStyleAttr, defStyleRes)");
                    try {
                        setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(0, 0));
                        setTypeface(Typeface.create(getTypeface(), 1));
                        String string = obtainStyledAttributes.getString(2);
                        obtainStyledAttributes.recycle();
                        setText(string);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void k() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            super.setOnClickListener(new View.OnClickListener() { // from class: g6.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC4353m.l(AbstractC4353m.this, view);
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (isInEditMode()) {
                return;
            }
            d(getContext());
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - f(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.f47100f = compoundPaddingLeft - min;
                this.f47101g = compoundPaddingRight + min;
                this.f47099e = true;
            }
            super.onDraw(canvas);
            this.f47099e = false;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void setFragment(@NotNull android.app.Fragment fragment) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f47102h = new T7.B(fragment);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public void setInternalOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            this.f47098d = onClickListener;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            this.f47097c = onClickListener;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void setFragment(@NotNull Fragment fragment) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f47102h = new T7.B(fragment);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
