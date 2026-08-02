package ru.ozon.fintech.base.bottom;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.w;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;
import ru.ozon.app.android.R;
import ru.ozon.fintech.base.NoScrollRecycler;
import ru.ozon.fintech.base.bottom.BaseBottomSheetBehaviour;

/* loaded from: classes3.dex */
public final class g extends w {

    /* renamed from: a, reason: collision with root package name */
    private BaseBottomSheetBehaviour<FrameLayout> f94996a;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f94997b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f94998c;

    /* renamed from: d, reason: collision with root package name */
    public LinearLayout f94999d;

    /* renamed from: e, reason: collision with root package name */
    public NoScrollRecycler f95000e;

    /* renamed from: f, reason: collision with root package name */
    boolean f95001f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f95002g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f95003h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    private BaseBottomSheetBehaviour.b f95004i;

    final class a extends BaseBottomSheetBehaviour.b {
        a() {
        }

        @Override // ru.ozon.fintech.base.bottom.BaseBottomSheetBehaviour.b
        public final void a(@NonNull View view, float f7) {
        }

        @Override // ru.ozon.fintech.base.bottom.BaseBottomSheetBehaviour.b
        public final void b(@NonNull View view, int i11) {
            if (i11 == 5) {
                g.this.cancel();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(@NonNull Context context, int i11) {
        super(context, i11);
        if (i11 == 0) {
            TypedValue typedValue = new TypedValue();
            i11 = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        this.f95001f = true;
        this.f95002g = true;
        this.f95004i = new a();
        supportRequestWindowFeature(1);
    }

    private void b() {
        if (this.f94997b == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.base_design_bottom_sheet_dialog, null);
            this.f94997b = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.design_bottom_sheet);
            this.f94998c = (LinearLayout) this.f94997b.findViewById(R.id.design_bottom_sheet_bottom);
            this.f94999d = (LinearLayout) this.f94997b.findViewById(R.id.design_bottom_sheet_bottom_ll);
            this.f95000e = (NoScrollRecycler) this.f94997b.findViewById(R.id.design_bottom_sheet_bottom_rv);
            BaseBottomSheetBehaviour<FrameLayout> h11 = BaseBottomSheetBehaviour.h(frameLayout2);
            this.f94996a = h11;
            h11.g(this.f95004i);
            this.f94996a.setHideable(this.f95001f);
        }
    }

    private FrameLayout d(int i11, View view, ViewGroup.LayoutParams layoutParams) {
        b();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f94997b.findViewById(R.id.coordinator);
        if (i11 != 0 && view == null) {
            view = getLayoutInflater().inflate(i11, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f94997b.findViewById(R.id.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new d(this));
        Y.C(frameLayout, new e(this));
        frameLayout.setOnTouchListener(new f());
        return this.f94997b;
    }

    @NonNull
    public final BaseBottomSheetBehaviour<FrameLayout> c() {
        if (this.f94996a == null) {
            b();
        }
        return this.f94996a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        c();
        super.cancel();
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(LinearLayoutManager.INVALID_OFFSET);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.activity.s, android.app.Dialog
    protected final void onStart() {
        super.onStart();
        BaseBottomSheetBehaviour<FrameLayout> baseBottomSheetBehaviour = this.f94996a;
        if (baseBottomSheetBehaviour == null || baseBottomSheetBehaviour.f94975x != 5) {
            return;
        }
        baseBottomSheetBehaviour.setState(4);
    }

    final void removeDefaultCallback() {
        this.f94996a.i(this.f95004i);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z11) {
        super.setCancelable(z11);
        if (this.f95001f != z11) {
            this.f95001f = z11;
            BaseBottomSheetBehaviour<FrameLayout> baseBottomSheetBehaviour = this.f94996a;
            if (baseBottomSheetBehaviour != null) {
                baseBottomSheetBehaviour.setHideable(z11);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z11) {
        super.setCanceledOnTouchOutside(z11);
        if (z11 && !this.f95001f) {
            this.f95001f = true;
        }
        this.f95002g = z11;
        this.f95003h = true;
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    public final void setContentView(int i11) {
        super.setContentView(d(i11, null, null));
    }

    final boolean shouldWindowCloseOnTouchOutside() {
        if (!this.f95003h) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.f95002g = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f95003h = true;
        }
        return this.f95002g;
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(d(0, view, null));
    }

    @Override // androidx.appcompat.app.w, androidx.activity.s, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(d(0, view, layoutParams));
    }
}
