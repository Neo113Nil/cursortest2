package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import y7.C10857h;

/* loaded from: classes9.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: a, reason: collision with root package name */
    private int f58008a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f58009b;

    static class a extends O2.a {
        public static final Parcelable.Creator<a> CREATOR = new C0878a();

        /* renamed from: c, reason: collision with root package name */
        int f58014c;

        /* renamed from: d, reason: collision with root package name */
        boolean f58015d;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a, reason: collision with other inner class name */
        final class C0878a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final a createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i11) {
                return new a[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new a(parcel, null);
            }
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // O2.a, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f58014c);
            parcel.writeInt(this.f58015d ? 1 : 0);
        }

        public a(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f58014c = parcel.readInt();
            this.f58015d = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View c() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public final CoordinatorLayout.c a() {
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10857h.c(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        ActionMenuView actionMenuView;
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            throw null;
        }
        int i15 = 0;
        while (true) {
            if (i15 >= getChildCount()) {
                actionMenuView = null;
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt instanceof ActionMenuView) {
                actionMenuView = (ActionMenuView) childAt;
                break;
            }
            i15++;
        }
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            View c11 = c();
            FloatingActionButton floatingActionButton = c11 instanceof FloatingActionButton ? (FloatingActionButton) c11 : null;
            if (floatingActionButton == null || !floatingActionButton.r()) {
                new com.google.android.material.bottomappbar.a(this, actionMenuView, 0, false).run();
            } else {
                new com.google.android.material.bottomappbar.a(this, actionMenuView, this.f58008a, this.f58009b).run();
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        this.f58008a = aVar.f58014c;
        this.f58009b = aVar.f58015d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    protected final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f58014c = this.f58008a;
        aVar.f58015d = this.f58009b;
        return aVar;
    }

    @Override // android.view.View
    public final void setElevation(float f7) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void setTitle(CharSequence charSequence) {
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        private final Rect f58010d;

        /* renamed from: e, reason: collision with root package name */
        private WeakReference<BottomAppBar> f58011e;

        /* renamed from: f, reason: collision with root package name */
        private final View.OnLayoutChangeListener f58012f;

        final class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                Behavior behavior = Behavior.this;
                if (((BottomAppBar) behavior.f58011e.get()) == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                } else {
                    ((FloatingActionButton) view).m(behavior.f58010d);
                    behavior.f58010d.height();
                    throw null;
                }
            }
        }

        public Behavior() {
            this.f58012f = new a();
            this.f58010d = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f58011e = new WeakReference<>(bottomAppBar);
            View c11 = bottomAppBar.c();
            if (c11 != null) {
                int i12 = Y.f42258g;
                if (!c11.isLaidOut()) {
                    ((CoordinatorLayout.f) c11.getLayoutParams()).f41885d = 49;
                    if (c11 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) c11;
                        if (floatingActionButton.n() == null) {
                            floatingActionButton.u();
                        }
                        if (floatingActionButton.k() == null) {
                            floatingActionButton.t();
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.f58012f);
                        floatingActionButton.f();
                        floatingActionButton.g(new b(bottomAppBar));
                        floatingActionButton.h();
                    }
                    throw null;
                }
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i11);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i11);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i11, int i12) {
            ((BottomAppBar) view).getClass();
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f58012f = new a();
            this.f58010d = new Rect();
        }
    }
}
