package androidx.fragment.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.lang.reflect.Field;
import xsna.sen0;

/* compiled from: HackSupportFragment.kt */
/* loaded from: classes.dex */
public class n extends d {
    public View Dn(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.performCreateView(layoutInflater, viewGroup, bundle);
        return this.mView;
    }

    @Override // androidx.fragment.app.d
    public void Td(FragmentManager fragmentManager, String str) {
        try {
            super.Td(fragmentManager, str);
        } catch (IllegalStateException unused) {
            a aVar = new a(fragmentManager);
            aVar.f(0, this, str, 1);
            aVar.k(true);
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mView = Dn(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void performPause() {
        m mVar;
        if (this.mView != null && (mVar = this.mViewLifecycleOwner) != null) {
            mVar.a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.c(Lifecycle.Event.ON_PAUSE);
        getChildFragmentManager().w(5);
        this.mState = 5;
        Field declaredField = Fragment.class.getDeclaredField("mCalled");
        declaredField.setAccessible(true);
        declaredField.set(this, Boolean.FALSE);
        declaredField.setAccessible(false);
        rn();
        Field declaredField2 = Fragment.class.getDeclaredField("mCalled");
        declaredField2.setAccessible(true);
        boolean booleanValue = ((Boolean) declaredField2.get(this)).booleanValue();
        declaredField2.setAccessible(false);
        if (booleanValue) {
            return;
        }
        throw new sen0("Fragment " + this + " did not call through to super.onPause()");
    }

    @Override // androidx.fragment.app.Fragment
    public final void performResume() {
        m mVar;
        getChildFragmentManager().V();
        getChildFragmentManager().C(true);
        this.mState = 7;
        Field declaredField = Fragment.class.getDeclaredField("mCalled");
        declaredField.setAccessible(true);
        declaredField.set(this, Boolean.FALSE);
        declaredField.setAccessible(false);
        sn();
        Field declaredField2 = Fragment.class.getDeclaredField("mCalled");
        declaredField2.setAccessible(true);
        boolean booleanValue = ((Boolean) declaredField2.get(this)).booleanValue();
        declaredField2.setAccessible(false);
        if (!booleanValue) {
            throw new sen0("Fragment " + this + " did not call through to super.onResume()");
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.H = false;
        childFragmentManager.I = false;
        childFragmentManager.O.g = false;
        childFragmentManager.w(7);
        getChildFragmentManager().C(true);
        androidx.lifecycle.m mVar2 = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        mVar2.c(event);
        if (this.mView == null || (mVar = this.mViewLifecycleOwner) == null) {
            return;
        }
        mVar.a(event);
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        StringBuilder sb2 = new StringBuilder(" screen:");
        UiTracker uiTracker = UiTracker.a;
        sb2.append(UiTracker.d());
        sb2.append(' ');
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("prev_screen:");
        UiTrackingScreen b = UiTracker.j.b();
        sb3.append((b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.a) == null) ? null : mobileOfficialAppsCoreNavStat$EventScreen.name());
        sb.append(sb3.toString());
        return sb.toString();
    }
}
