package Xj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class j {

    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f13890a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f13891b;

        public a(View view, boolean z10) {
            this.f13890a = view;
            this.f13891b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            j.j(this.f13890a, this.f13891b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f13890a.setAlpha(this.f13891b ? 0.0f : 1.0f);
            j.j(this.f13890a, this.f13891b);
        }
    }

    public static final void b(View view, boolean z10, long j10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (h(view) == z10) {
            return;
        }
        view.animate().setDuration(j10).alpha(z10 ? 1.0f : 0.0f).setListener(new a(view, z10));
    }

    public static /* synthetic */ void c(View view, boolean z10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 200;
        }
        b(view, z10, j10);
    }

    public static final int d(Resources resources, int i10) {
        return Resources.getSystem().getDisplayMetrics().heightPixels - resources.getDimensionPixelOffset(i10);
    }

    public static final void e(TabLayout tabLayout) {
        Intrinsics.checkNotNullParameter(tabLayout, "<this>");
        View childAt = tabLayout.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) childAt;
        int tabCount = tabLayout.getTabCount();
        for (int i10 = 0; i10 < tabCount; i10++) {
            View childAt2 = viewGroup.getChildAt(i10);
            Intrinsics.checkNotNull(childAt2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) childAt2).setEnabled(false);
        }
    }

    public static final com.google.android.material.bottomsheet.a f(final com.google.android.material.bottomsheet.a aVar, final int i10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: Xj.i
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                j.g(com.google.android.material.bottomsheet.a.this, i10, dialogInterface);
            }
        });
        return aVar;
    }

    public static final void g(com.google.android.material.bottomsheet.a aVar, int i10, DialogInterface dialogInterface) {
        View findViewById = aVar.findViewById(ia.g.f48429f);
        Intrinsics.checkNotNull(findViewById);
        FrameLayout frameLayout = (FrameLayout) findViewById;
        BottomSheetBehavior q02 = BottomSheetBehavior.q0(frameLayout);
        Intrinsics.checkNotNullExpressionValue(q02, "from(...)");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        Resources resources = aVar.getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        layoutParams.height = d(resources, i10);
        frameLayout.setLayoutParams(layoutParams);
        q02.c1(3);
    }

    public static final boolean h(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final void i(MaterialCheckBox materialCheckBox, boolean z10) {
        Intrinsics.checkNotNullParameter(materialCheckBox, "<this>");
        materialCheckBox.setChecked(z10);
        materialCheckBox.jumpDrawablesToCurrentState();
    }

    public static final void j(View view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z10 ? 0 : 8);
    }
}
