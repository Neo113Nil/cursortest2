package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mml extends wvk {
    public final ViewGroup b;

    public mml(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        this.b = viewGroup;
    }
}
