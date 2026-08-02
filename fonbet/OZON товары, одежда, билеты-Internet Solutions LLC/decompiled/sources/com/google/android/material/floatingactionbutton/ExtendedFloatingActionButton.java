package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import i7.C7017a;
import java.util.List;
import s7.C9609d;

/* loaded from: classes9.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f58327a = 0;

    final class a extends Property<View, Float> {
        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f7) {
            View view2 = view;
            view2.getLayoutParams().width = f7.intValue();
            view2.requestLayout();
        }
    }

    final class b extends Property<View, Float> {
        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f7) {
            View view2 = view;
            view2.getLayoutParams().height = f7.intValue();
            view2.requestLayout();
        }
    }

    final class c extends Property<View, Float> {
        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            int i11 = Y.f42258g;
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f7) {
            View view2 = view;
            int intValue = f7.intValue();
            int paddingTop = view2.getPaddingTop();
            int i11 = Y.f42258g;
            view2.setPaddingRelative(intValue, paddingTop, view2.getPaddingEnd(), view2.getPaddingBottom());
        }
    }

    final class d extends Property<View, Float> {
        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            int i11 = Y.f42258g;
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f7) {
            View view2 = view;
            int i11 = Y.f42258g;
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), f7.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new a(Float.class, "width");
        new b(Float.class, "height");
        new c(Float.class, "paddingStart");
        new d(Float.class, "paddingEnd");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public final CoordinatorLayout.c<ExtendedFloatingActionButton> a() {
        return null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i11) {
        super.setTextColor(i11);
        getTextColors();
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a, reason: collision with root package name */
        private Rect f58328a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f58329b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f58330c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f58329b = false;
            this.f58330c = true;
        }

        private boolean b(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f58329b && !this.f58330c) || fVar.b() != appBarLayout.getId()) {
                return false;
            }
            if (this.f58328a == null) {
                this.f58328a = new Rect();
            }
            Rect rect = this.f58328a;
            C9609d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.h()) {
                if (this.f58330c) {
                    int i11 = ExtendedFloatingActionButton.f58327a;
                    throw null;
                }
                int i12 = ExtendedFloatingActionButton.f58327a;
                throw null;
            }
            if (this.f58330c) {
                int i13 = ExtendedFloatingActionButton.f58327a;
                throw null;
            }
            int i14 = ExtendedFloatingActionButton.f58327a;
            throw null;
        }

        private boolean c(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f58329b && !this.f58330c) || fVar.b() != view.getId()) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                if (this.f58330c) {
                    int i11 = ExtendedFloatingActionButton.f58327a;
                    throw null;
                }
                int i12 = ExtendedFloatingActionButton.f58327a;
                throw null;
            }
            if (this.f58330c) {
                int i13 = ExtendedFloatingActionButton.f58327a;
                throw null;
            }
            int i14 = ExtendedFloatingActionButton.f58327a;
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (ExtendedFloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onAttachedToLayoutParams(@NonNull CoordinatorLayout.f fVar) {
            if (fVar.f41889h == 0) {
                fVar.f41889h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                b(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).c() instanceof BottomSheetBehavior : false) {
                    c(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = dependencies.get(i12);
                if (view2 instanceof AppBarLayout) {
                    b(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).c() instanceof BottomSheetBehavior : false) {
                        c(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i11);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7017a.f65947m);
            this.f58329b = obtainStyledAttributes.getBoolean(0, false);
            this.f58330c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public final void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
