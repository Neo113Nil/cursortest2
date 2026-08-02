package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.mvvm.base.AbstractFragment;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pz0 extends u11 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pz0(ViewGroup viewGroup, FragmentActivity fragmentActivity, Map map, AbstractFragment abstractFragment) {
        super(viewGroup, r3, r4, map, abstractFragment);
        FragmentActivity fragmentActivity2;
        u6b u6bVar;
        u6b viewLifecycleOwner;
        viewGroup.getClass();
        fragmentActivity.getClass();
        if (abstractFragment == null || (viewLifecycleOwner = abstractFragment.getViewLifecycleOwner()) == null) {
            fragmentActivity2 = fragmentActivity;
            u6bVar = fragmentActivity2;
        } else {
            fragmentActivity2 = fragmentActivity;
            u6bVar = viewLifecycleOwner;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pz0(LinearLayout linearLayout, AbstractFragment abstractFragment, Map map) {
        this(linearLayout, r0, map, abstractFragment);
        linearLayout.getClass();
        FragmentActivity requireActivity = abstractFragment.requireActivity();
        requireActivity.getClass();
    }
}
