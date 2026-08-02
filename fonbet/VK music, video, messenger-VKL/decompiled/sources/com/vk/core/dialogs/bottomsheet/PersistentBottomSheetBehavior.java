package com.vk.core.dialogs.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import java.util.ArrayList;
import xsna.awt0;
import xsna.bwt0;
import xsna.j5g;

/* compiled from: PersistentBottomSheetBehavior.kt */
/* loaded from: classes17.dex */
public class PersistentBottomSheetBehavior extends CustomisableBottomSheetBehavior<FrameLayout> {
    @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior
    public final View E(View view) {
        if (F(view)) {
            return view;
        }
        View view2 = null;
        int i = 0;
        if (!(view instanceof ViewPager)) {
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            View[] d = awt0.d((ViewGroup) view);
            ArrayList arrayList = new ArrayList();
            int length = d.length;
            while (i < length) {
                View E = E(d[i]);
                if (E != null) {
                    arrayList.add(E);
                }
                i++;
            }
            return (View) j5g.a0(arrayList);
        }
        ViewPager viewPager = (ViewPager) view;
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter != null && adapter.getCount() != 0 && viewPager.getChildCount() != 0) {
            View[] d2 = awt0.d(viewPager);
            ArrayList arrayList2 = new ArrayList();
            int length2 = d2.length;
            while (i < length2) {
                View view3 = d2[i];
                if (!((ViewPager.g) view3.getLayoutParams()).a) {
                    arrayList2.add(view3);
                }
                i++;
            }
            view2 = (View) j5g.b0(viewPager.getCurrentItem(), arrayList2);
        }
        return E(view2);
    }

    @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior
    public boolean F(View view) {
        return (view instanceof RecyclerView) && bwt0.K(view);
    }
}
