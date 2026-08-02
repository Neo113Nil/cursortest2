package ru.ozon.app.android.feature.scanit.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import ru.ozon.app.android.feature.scanit.R$id;
import ru.ozon.app.android.feature.scanit.R$layout;
import ru.ozon.app.android.uikit.databinding.ViewProgressbarBgBinding;

/* loaded from: classes12.dex */
public final class FragmentMainScanItBinding implements a {

    @NonNull
    public final FrameLayout contentTv;

    @NonNull
    public final ViewProgressbarBgBinding progressBg;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final Toolbar toolbar;

    private FragmentMainScanItBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull ViewProgressbarBgBinding viewProgressbarBgBinding, @NonNull Toolbar toolbar) {
        this.rootView = relativeLayout;
        this.contentTv = frameLayout;
        this.progressBg = viewProgressbarBgBinding;
        this.toolbar = toolbar;
    }

    @NonNull
    public static FragmentMainScanItBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.contentTv;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
        if (frameLayout != null && (d11 = C2548q.d((i11 = R$id.progressBg), view)) != null) {
            ViewProgressbarBgBinding bind = ViewProgressbarBgBinding.bind(d11);
            int i12 = R$id.toolbar;
            Toolbar toolbar = (Toolbar) C2548q.d(i12, view);
            if (toolbar != null) {
                return new FragmentMainScanItBinding((RelativeLayout) view, frameLayout, bind, toolbar);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentMainScanItBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_main_scan_it, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public RelativeLayout getConstraintLayout() {
        return this.rootView;
    }
}
