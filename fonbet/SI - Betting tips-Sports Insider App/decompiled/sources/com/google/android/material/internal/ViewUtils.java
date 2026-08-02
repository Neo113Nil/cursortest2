package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.core.view.k2;
import androidx.core.view.q0;
import androidx.core.view.q2;
import androidx.core.view.x;
import androidx.core.view.z0;
import com.google.android.material.drawable.DrawableUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ViewUtils {
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public interface OnApplyWindowInsetsListener {
        k2 onApplyWindowInsets(View view, k2 k2Var, RelativePadding relativePadding);
    }

    private ViewUtils() {
    }

    public static void addOnGlobalLayoutListener(View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @NonNull
    public static Rect calculateOffsetRectFromBounds(@NonNull View view, @NonNull View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i5 = iArr[0];
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i11 = i5 - iArr2[0];
        int i12 = i10 - iArr2[1];
        return new Rect(i11, i12, view2.getWidth() + i11, view2.getHeight() + i12);
    }

    @NonNull
    public static Rect calculateRectFromBounds(@NonNull View view) {
        return calculateRectFromBounds(view, 0);
    }

    public static void doOnApplyWindowInsets(@NonNull View view, AttributeSet attributeSet, int i5, int i10) {
        doOnApplyWindowInsets(view, attributeSet, i5, i10, null);
    }

    public static float dpToPx(@NonNull Context context, int i5) {
        return TypedValue.applyDimension(1, i5, context.getResources().getDisplayMetrics());
    }

    public static Integer getBackgroundColor(@NonNull View view) {
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(view.getBackground());
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    @NonNull
    public static List<View> getChildren(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                arrayList.add(viewGroup.getChildAt(i5));
            }
        }
        return arrayList;
    }

    public static ViewGroup getContentView(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @Deprecated
    public static ViewOverlayImpl getContentViewOverlay(@NonNull View view) {
        return getOverlay(getContentView(view));
    }

    private static InputMethodManager getInputMethodManager(@NonNull View view) {
        return (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
    }

    @Deprecated
    public static ViewOverlayImpl getOverlay(final View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayImpl() { // from class: com.google.android.material.internal.ViewUtils.4
            @Override // com.google.android.material.internal.ViewOverlayImpl
            public void add(@NonNull Drawable drawable) {
                view.getOverlay().add(drawable);
            }

            @Override // com.google.android.material.internal.ViewOverlayImpl
            public void remove(@NonNull Drawable drawable) {
                view.getOverlay().remove(drawable);
            }
        };
    }

    public static float getParentAbsoluteElevation(@NonNull View view) {
        float f6 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f6 += ((View) parent).getElevation();
        }
        return f6;
    }

    public static void hideKeyboard(@NonNull View view) {
        hideKeyboard(view, true);
    }

    public static boolean isLayoutRtl(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i5, PorterDuff.Mode mode) {
        if (i5 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i5 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i5 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i5) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void removeOnGlobalLayoutListener(View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void requestApplyInsetsWhenAttached(@NonNull View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.3
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NonNull View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    view2.requestApplyInsets();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public static void requestFocusAndShowKeyboard(@NonNull View view) {
        requestFocusAndShowKeyboard(view, true);
    }

    public static void setBoundsFromRect(@NonNull View view, @NonNull Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    public static void showKeyboard(@NonNull View view) {
        showKeyboard(view, true);
    }

    @NonNull
    public static Rect calculateRectFromBounds(@NonNull View view, int i5) {
        return new Rect(view.getLeft(), view.getTop() + i5, view.getRight(), view.getBottom() + i5);
    }

    public static void doOnApplyWindowInsets(@NonNull View view, AttributeSet attributeSet, int i5, int i10, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.Insets, i5, i10);
        final boolean z5 = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        final boolean z7 = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        final boolean z10 = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @NonNull
            public k2 onApplyWindowInsets(View view2, @NonNull k2 k2Var, @NonNull RelativePadding relativePadding) {
                if (z5) {
                    relativePadding.bottom = k2Var.a() + relativePadding.bottom;
                }
                boolean isLayoutRtl = ViewUtils.isLayoutRtl(view2);
                if (z7) {
                    if (isLayoutRtl) {
                        relativePadding.end = k2Var.b() + relativePadding.end;
                    } else {
                        relativePadding.start = k2Var.b() + relativePadding.start;
                    }
                }
                if (z10) {
                    if (isLayoutRtl) {
                        relativePadding.start = k2Var.c() + relativePadding.start;
                    } else {
                        relativePadding.end = k2Var.c() + relativePadding.end;
                    }
                }
                relativePadding.applyToView(view2);
                OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, k2Var, relativePadding) : k2Var;
            }
        });
    }

    public static void hideKeyboard(@NonNull View view, boolean z5) {
        q2 h10;
        if (z5 && (h10 = z0.h(view)) != null) {
            h10.f1386a.r();
            return;
        }
        InputMethodManager inputMethodManager = getInputMethodManager(view);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void removeOnGlobalLayoutListener(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void requestFocusAndShowKeyboard(@NonNull View view, boolean z5) {
        view.requestFocus();
        view.post(new b(view, z5, 0));
    }

    public static void showKeyboard(@NonNull View view, boolean z5) {
        q2 h10;
        if (!z5 || (h10 = z0.h(view)) == null) {
            getInputMethodManager(view).showSoftInput(view, 1);
        } else {
            h10.f1386a.z();
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i5, int i10, int i11, int i12) {
            this.start = i5;
            this.top = i10;
            this.end = i11;
            this.bottom = i12;
        }

        public void applyToView(View view) {
            view.setPaddingRelative(this.start, this.top, this.end, this.bottom);
        }

        public RelativePadding(@NonNull RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @NonNull final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        final RelativePadding relativePadding = new RelativePadding(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        x xVar = new x() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // androidx.core.view.x
            public k2 onApplyWindowInsets(View view2, k2 k2Var) {
                return OnApplyWindowInsetsListener.this.onApplyWindowInsets(view2, k2Var, new RelativePadding(relativePadding));
            }
        };
        WeakHashMap weakHashMap = z0.f1413a;
        q0.l(view, xVar);
        requestApplyInsetsWhenAttached(view);
    }
}
