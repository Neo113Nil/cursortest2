package com.sports.insider.ui.viewpage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.y;
import androidx.lifecycle.e0;
import androidx.lifecycle.p0;
import c4.o;
import c4.v;
import com.google.android.material.card.MaterialCardViewHelper;
import com.sports.insider.R;
import com.sports.insider.ui.viewpage.ViewImageFragment;
import e.d0;
import ge.d;
import io.sentry.config.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.n;
import pe.s;
import q4.e;
import q4.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sports/insider/ui/viewpage/ViewImageFragment;", "Landroidx/fragment/app/y;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewImageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewImageFragment.kt\ncom/sports/insider/ui/viewpage/ViewImageFragment\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 4 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt$load$1\n*L\n1#1,97:1\n27#2:98\n35#3,3:99\n17#3:102\n38#3,6:103\n44#3,2:110\n35#3,3:112\n17#3:115\n38#3,6:116\n44#3,2:123\n35#3,3:125\n17#3:128\n40#3,6:129\n38#4:109\n38#4:122\n*S KotlinDebug\n*F\n+ 1 ViewImageFragment.kt\ncom/sports/insider/ui/viewpage/ViewImageFragment\n*L\n44#1:98\n50#1:99,3\n50#1:102\n50#1:103,6\n50#1:110,2\n52#1:112,3\n52#1:115\n52#1:116,6\n52#1:123,2\n62#1:125,3\n62#1:128\n62#1:129,6\n50#1:109\n52#1:122\n*E\n"})
/* loaded from: classes.dex */
public final class ViewImageFragment extends y {

    /* renamed from: a, reason: collision with root package name */
    public View f7072a;

    /* renamed from: b, reason: collision with root package name */
    public AppCompatImageView f7073b;

    /* renamed from: c, reason: collision with root package name */
    public final d f7074c = new d(this, 11);

    /* renamed from: d, reason: collision with root package name */
    public s f7075d;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        frameLayout.setMinimumHeight(a.o(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION));
        frameLayout.setBackgroundColor(0);
        frameLayout.setLayoutParams(layoutParams);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        int o3 = a.o(24);
        int o4 = a.o(16);
        int o7 = a.o(32);
        layoutParams2.setMargins(o4, o7, o4, o7);
        appCompatImageView.setLayoutParams(layoutParams2);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setTag("webView");
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(o3, o3);
        layoutParams3.setMargins(o4, o7, o4, o7);
        layoutParams3.gravity = 8388613;
        frameLayout2.setLayoutParams(layoutParams3);
        frameLayout2.setId(View.generateViewId());
        frameLayout2.setTag("btnClose");
        View appCompatImageView2 = new AppCompatImageView(context, null);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(o4, o4);
        layoutParams4.gravity = 17;
        appCompatImageView2.setLayoutParams(layoutParams4);
        appCompatImageView2.setTag("imageCross");
        View appCompatImageView3 = new AppCompatImageView(context, null);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(o3, o3);
        layoutParams5.gravity = 17;
        appCompatImageView3.setLayoutParams(layoutParams5);
        appCompatImageView3.setTag("imageBackCross");
        frameLayout2.addView(appCompatImageView3);
        frameLayout2.addView(appCompatImageView2);
        frameLayout.addView(appCompatImageView);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f7075d = null;
        this.f7074c.e();
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onStart() {
        p0 p0Var;
        super.onStart();
        View view = this.f7072a;
        if (view != null) {
            final int i5 = 0;
            a.y(view, 600L, new Function1(this) { // from class: ue.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ViewImageFragment f24249b;

                {
                    this.f24249b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Context context;
                    switch (i5) {
                        case 0:
                            this.f24249b.f7074c.b();
                            break;
                        default:
                            ViewImageFragment viewImageFragment = this.f24249b;
                            s sVar = viewImageFragment.f7075d;
                            if (sVar != null && (context = viewImageFragment.getContext()) != null) {
                                sVar.q.B(context, sVar.f21883x, sVar.f21885z);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        AppCompatImageView appCompatImageView = this.f7073b;
        if (appCompatImageView != null) {
            final int i10 = 1;
            a.y(appCompatImageView, 500L, new Function1(this) { // from class: ue.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ViewImageFragment f24249b;

                {
                    this.f24249b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Context context;
                    switch (i10) {
                        case 0:
                            this.f24249b.f7074c.b();
                            break;
                        default:
                            ViewImageFragment viewImageFragment = this.f24249b;
                            s sVar = viewImageFragment.f7075d;
                            if (sVar != null && (context = viewImageFragment.getContext()) != null) {
                                sVar.q.B(context, sVar.f21883x, sVar.f21885z);
                            }
                            break;
                    }
                    return Unit.f19194a;
                }
            });
        }
        s sVar = this.f7075d;
        String str = (sVar == null || (p0Var = sVar.B) == null) ? null : (String) p0Var.d();
        AppCompatImageView appCompatImageView2 = this.f7073b;
        if (appCompatImageView2 != null) {
            o a7 = c4.y.a(appCompatImageView2.getContext());
            e eVar = new e(appCompatImageView2.getContext());
            eVar.f21940c = str;
            j.d(eVar, appCompatImageView2);
            eVar.f21942e = new n(this, 2);
            ((v) a7).a(eVar.a());
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        View view = this.f7072a;
        if (view != null) {
            view.setOnClickListener(null);
        }
        AppCompatImageView appCompatImageView = this.f7073b;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Window window2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        d0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        e0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.a(viewLifecycleOwner, this.f7074c);
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setLayout(-1, -2);
        }
        this.f7072a = view.findViewWithTag("btnClose");
        View findViewWithTag = view.findViewWithTag("imageBackCross");
        AppCompatImageView appCompatImageView = findViewWithTag instanceof AppCompatImageView ? (AppCompatImageView) findViewWithTag : null;
        if (appCompatImageView != null) {
            Integer valueOf = Integer.valueOf(R.drawable.ic_close_white_24dp_back);
            o a7 = c4.y.a(appCompatImageView.getContext());
            e eVar = new e(appCompatImageView.getContext());
            eVar.f21940c = valueOf;
            j.d(eVar, appCompatImageView);
            ((v) a7).a(eVar.a());
        }
        View findViewWithTag2 = view.findViewWithTag("imageCross");
        AppCompatImageView appCompatImageView2 = findViewWithTag2 instanceof AppCompatImageView ? (AppCompatImageView) findViewWithTag2 : null;
        if (appCompatImageView2 != null) {
            Integer valueOf2 = Integer.valueOf(R.drawable.ic_close_white_24dp);
            o a10 = c4.y.a(appCompatImageView2.getContext());
            e eVar2 = new e(appCompatImageView2.getContext());
            eVar2.f21940c = valueOf2;
            j.d(eVar2, appCompatImageView2);
            ((v) a10).a(eVar2.a());
        }
        mc.a aVar = s.F;
        androidx.fragment.app.p0 requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        this.f7075d = a.a.C(requireActivity);
        View findViewWithTag3 = view.findViewWithTag("webView");
        this.f7073b = findViewWithTag3 instanceof AppCompatImageView ? (AppCompatImageView) findViewWithTag3 : null;
    }
}
