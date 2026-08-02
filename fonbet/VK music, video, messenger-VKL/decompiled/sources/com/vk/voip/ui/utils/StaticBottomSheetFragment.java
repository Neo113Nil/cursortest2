package com.vk.voip.ui.utils;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vkontakte.android.R;
import xsna.b33;
import xsna.bwt0;
import xsna.pc3;
import xsna.uxk0;

/* compiled from: StaticBottomSheetFragment.kt */
/* loaded from: classes7.dex */
public abstract class StaticBottomSheetFragment extends ContextHolderFragment {
    public static final /* synthetic */ int O = 0;

    /* compiled from: StaticBottomSheetFragment.kt */
    public static final class a extends b33 {
        public a(Context context) {
            super(context, R.style.StaticBottomSheetFragment);
        }

        @Override // xsna.y8i, android.app.Dialog
        public final void onBackPressed() {
            StaticBottomSheetFragment.this.getClass();
            super.onBackPressed();
        }
    }

    public abstract View eo(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            tn();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.static_bottom_sheet_fragment, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.bottom_sheet);
        View eo = eo(layoutInflater, viewGroup2);
        if (eo != null) {
            viewGroup2.addView(eo);
        }
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new pc3(this, 9));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bottom_sheet);
        BottomSheetBehavior L = BottomSheetBehavior.L(viewGroup);
        L.X(3);
        L.T(true);
        L.K = true;
        L.D(new uxk0(this));
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            bwt0.c0(childAt.getLayoutParams().height, viewGroup);
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        a aVar = new a(requireContext());
        Window window = aVar.getWindow();
        if (window != null) {
            window.addFlags(524288);
        }
        return aVar;
    }
}
