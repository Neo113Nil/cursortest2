package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.fragment.app.s;
import com.sofascore.results.R;
import defpackage.bkf;
import defpackage.g7a;
import defpackage.ijf;
import defpackage.k7d;
import defpackage.mqi;
import defpackage.vp2;
import defpackage.xxb;
import defpackage.ypa;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class NavHostFragment extends Fragment {
    public final mqi a = ypa.b(new xxb(this, 12));
    public View b;
    public int c;
    public boolean d;

    public final k7d j() {
        return (k7d) this.a.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (this.d) {
            s parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            a aVar = new a(parentFragmentManager);
            aVar.n(this);
            aVar.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        j();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.d = true;
            s parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            a aVar = new a(parentFragmentManager);
            aVar.n(this);
            aVar.f();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.b;
        if (view != null && g7a.t(view) == j()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        context.getClass();
        attributeSet.getClass();
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bkf.b);
        obtainStyledAttributes.getClass();
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.c = resourceId;
        }
        Unit unit = Unit.a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ijf.c);
        obtainStyledAttributes2.getClass();
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.d = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        if (this.d) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            vp2.b(view, " is not a ViewGroup", "created host view ");
            return;
        }
        view.setTag(R.id.nav_controller_view_tag, j());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            parent.getClass();
            View view2 = (View) parent;
            this.b = view2;
            if (view2.getId() == getId()) {
                View view3 = this.b;
                view3.getClass();
                view3.setTag(R.id.nav_controller_view_tag, j());
            }
        }
    }
}
