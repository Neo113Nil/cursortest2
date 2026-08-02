package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import xsna.am;
import xsna.b0u0;
import xsna.hk;
import xsna.iut0;
import xsna.qj4;
import xsna.zm10;

/* loaded from: classes13.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    public static final int k = R$style.Widget_Material3_BottomSheet_DragHandle;

    @Nullable
    public final AccessibilityManager b;

    @Nullable
    public BottomSheetBehavior<?> c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final a j;

    public final class b extends hk {
        public b() {
        }

        @Override // xsna.hk
        public final void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                int i = BottomSheetDragHandleView.k;
                BottomSheetDragHandleView.this.U();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(zm10.a(context, attributeSet, r0, k), attributeSet, r0);
        int i = R$attr.bottomSheetDragHandleStyle;
        this.g = getResources().getString(R$string.bottomsheet_action_expand);
        this.h = getResources().getString(R$string.bottomsheet_action_collapse);
        this.i = getResources().getString(R$string.bottomsheet_drag_handle_clicked);
        this.j = new a();
        this.b = (AccessibilityManager) getContext().getSystemService("accessibility");
        W();
        iut0.q(this, new b());
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.c;
        a aVar = this.j;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.Q(aVar);
            this.c.R(null);
        }
        this.c = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.R(this);
            V(this.c.M);
            this.c.D(aVar);
        }
        W();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1 == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U() {
        if (!this.e) {
            return false;
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(this.i);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.c;
        boolean z = bottomSheetBehavior.c;
        int i = bottomSheetBehavior.M;
        int i2 = 6;
        int i3 = 3;
        if (i != 4) {
            if (i == 3) {
                if (z) {
                    i2 = 4;
                }
                bottomSheetBehavior.X(i2);
                return true;
            }
            if (!this.f) {
                i3 = 4;
            }
            i2 = i3;
            bottomSheetBehavior.X(i2);
            return true;
        }
    }

    public final void V(int i) {
        if (i == 4) {
            this.f = true;
        } else if (i == 3) {
            this.f = false;
        }
        iut0.o(this, am.a.e, this.f ? this.g : this.h, new qj4(this, 2));
    }

    public final void W() {
        this.e = this.d && this.c != null;
        int i = this.c == null ? 2 : 1;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        setImportantForAccessibility(i);
        setClickable(this.e);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.d = z;
        W();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
                if (cVar instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) cVar;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    public class a extends BottomSheetBehavior.d {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, @NonNull View view) {
            int i2 = BottomSheetDragHandleView.k;
            BottomSheetDragHandleView.this.V(i);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(@NonNull View view, float f) {
        }
    }
}
