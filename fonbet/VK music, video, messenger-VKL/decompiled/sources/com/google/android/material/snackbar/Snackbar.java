package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$layout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.g;
import xsna.ina;

/* loaded from: classes13.dex */
public final class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] B = {R$attr.snackbarButtonStyle, R$attr.snackbarTextViewStyle};
    public boolean A;

    @Nullable
    public final AccessibilityManager z;

    public static final class SnackbarLayout extends BaseTransientBottomBar.g {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.g, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull SnackbarContentLayout snackbarContentLayout, @NonNull SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.z = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @NonNull
    public static Snackbar h(@NonNull View view, @NonNull String str) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(B);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? R$layout.design_layout_snackbar_include : R$layout.mtrl_layout_snackbar_include, viewGroup, false);
        Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) snackbar.i.getChildAt(0)).getMessageView().setText(str);
        snackbar.k = -2;
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void a() {
        b(3);
    }

    @NonNull
    public final void i(@Nullable String str, @Nullable View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(str)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.A = false;
        } else {
            this.A = true;
            actionView.setVisibility(0);
            actionView.setText(str);
            actionView.setOnClickListener(new ina(2, this, onClickListener));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x002a, code lost:
    
        if (r1.isTouchExplorationEnabled() != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        g b = g.b();
        AccessibilityManager accessibilityManager = this.z;
        int i = this.k;
        boolean z = false;
        if (i != -2) {
            if (Build.VERSION.SDK_INT >= 29) {
                i = accessibilityManager.getRecommendedTimeoutMillis(i, (this.A ? 4 : 0) | 3);
            } else if (this.A) {
            }
            BaseTransientBottomBar.e eVar = this.t;
            synchronized (b.a) {
                try {
                    if (b.c(eVar)) {
                        g.c cVar = b.c;
                        cVar.b = i;
                        b.b.removeCallbacksAndMessages(cVar);
                        b.f(b.c);
                        return;
                    }
                    g.c cVar2 = b.d;
                    if (cVar2 != null && cVar2.a.get() == eVar) {
                        z = true;
                    }
                    if (z) {
                        b.d.b = i;
                    } else {
                        b.d = new g.c(i, eVar);
                    }
                    g.c cVar3 = b.c;
                    if (cVar3 == null || !b.a(cVar3, 4)) {
                        b.c = null;
                        g.c cVar4 = b.d;
                        if (cVar4 != null) {
                            b.c = cVar4;
                            b.d = null;
                            g.b bVar = cVar4.a.get();
                            if (bVar != null) {
                                bVar.show();
                            } else {
                                b.c = null;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        i = -2;
        BaseTransientBottomBar.e eVar2 = this.t;
        synchronized (b.a) {
        }
    }
}
