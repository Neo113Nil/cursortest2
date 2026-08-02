package com.vk.core.fragments;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.transition.Transition;
import android.util.LruCache;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.impl.support.ParentSupportFragment;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.onboardingscreens.impl.georequest.presentation.fragment.GeoRequestFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Result;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.cs2;
import xsna.d3m;
import xsna.epx;
import xsna.fpf0;
import xsna.fy50;
import xsna.hbs;
import xsna.ibs;
import xsna.ilq;
import xsna.j5g;
import xsna.jcg;
import xsna.kd;
import xsna.kr6;
import xsna.l7s;
import xsna.lpj;
import xsna.m0q0;
import xsna.m84;
import xsna.mbs;
import xsna.mhy;
import xsna.mxj;
import xsna.mzp0;
import xsna.n5i;
import xsna.ndp0;
import xsna.nv2;
import xsna.pbs;
import xsna.qb6;
import xsna.qcy;
import xsna.rzp0;
import xsna.s3q0;
import xsna.t8i;
import xsna.u3k;
import xsna.vbs;
import xsna.vlp0;
import xsna.xbs;
import xsna.xyp0;
import xsna.yh9;
import xsna.yw90;
import xsna.zy50;

/* compiled from: FragmentImpl.kt */
/* loaded from: classes.dex */
public class FragmentImpl extends ParentSupportFragment implements m0q0, pbs, fy50 {
    public static final /* synthetic */ qcy<Object>[] M;
    public int A;
    public Intent B;
    public FragmentEntry C;
    public c E;
    public vbs H;
    public mzp0 J;
    public yw90 L;
    public boolean x;
    public boolean y = true;
    public boolean z = true;
    public final mbs D = new mbs();
    public final bpn0 F = new bpn0(new kr6(10));
    public final ilq G = new ilq();
    public final xyp0 I = new xyp0(this);
    public final zy50 K = new zy50(new u3k(this, 10));

    /* compiled from: FragmentImpl.kt */
    /* loaded from: classes17.dex */
    public static abstract class a<T extends Context> {
        public T a;

        public abstract void a(T t);

        public final void b() {
            T t = this.a;
            if (t != null) {
                a(t);
            }
        }

        public final T c() {
            return this.a;
        }

        public final void d() {
            this.a = null;
        }
    }

    /* compiled from: FragmentImpl.kt */
    /* loaded from: classes17.dex */
    public static abstract class b extends a<lpj> {
    }

    /* compiled from: FragmentImpl.kt */
    /* loaded from: classes17.dex */
    public interface c {
        void d();
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(FragmentImpl.class, "_scoreSession", "get_scoreSession()Lcom/vk/core/performance/score/navigation/NavigationPerformanceSession;", 0);
        fpf0.a.getClass();
        M = new qcy[]{propertyReference1Impl};
    }

    public static final void Gn(List list, View view, kd kdVar, int i, ClipsOwnerSwipeFragment clipsOwnerSwipeFragment) {
        ArrayList v0 = j5g.v0(view, list);
        Iterator it = v0.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            view2.setAlpha(1.0f);
            float f = 0;
            view2.setTranslationX(f);
            view2.setTranslationY(f);
            view2.animate().alpha(1.0f).translationX(i).translationY(f).setDuration(220L).setInterpolator(clipsOwnerSwipeFragment.G);
        }
        ((View) j5g.Y(v0)).animate().withEndAction(new cs2(kdVar, 8));
        Iterator it2 = v0.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).animate().start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context] */
    public Context B() {
        ?? c2;
        a<?> Jn = Jn();
        return (Jn == null || (c2 = Jn.c()) == 0) ? getActivity() : c2;
    }

    @Override // androidx.fragment.app.n
    public final View Dn(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Trace.beginSection(ndp0.f("FragmentImpl.createView"));
        try {
            Bundle arguments = getArguments();
            LayoutInflater from = (arguments == null || !arguments.containsKey("theme")) ? layoutInflater : LayoutInflater.from(new l7s(layoutInflater.getContext(), getArguments().getInt("theme")));
            Bundle arguments2 = getArguments();
            int i = arguments2 != null ? arguments2.getInt("background_color", 0) : 0;
            if (i == 0) {
                View Dn = super.Dn(from, viewGroup, bundle);
                Trace.endSection();
                return Dn;
            }
            FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
            frameLayout.addView(super.Dn(from, viewGroup, bundle));
            frameLayout.setBackgroundColor(i);
            Trace.endSection();
            return frameLayout;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void Hn() {
        Rn();
        vbs vbsVar = this.H;
        if (vbsVar != null) {
            for (Fragment fragment : vbsVar.a.c.f()) {
                if (fragment instanceof FragmentImpl) {
                    ((FragmentImpl) fragment).Hn();
                }
            }
        }
    }

    public void I3() {
        finish();
    }

    public final vbs In() {
        if (this.H == null) {
            this.H = new vbs(this);
        }
        return this.H;
    }

    public void J() {
        finish();
    }

    public a<?> Jn() {
        return null;
    }

    public final FragmentEntry Kn() {
        FragmentEntry fragmentEntry = this.C;
        if (fragmentEntry != null) {
            return fragmentEntry;
        }
        Serializer.c<FragmentEntry> cVar = FragmentEntry.CREATOR;
        Bundle arguments = getArguments();
        if (arguments != null) {
            return new FragmentEntry(getClass(), new Bundle(arguments), FragmentEntry.a.b(this));
        }
        return null;
    }

    public final vbs Ln() {
        LayoutInflater.Factory activity = getActivity();
        xbs xbsVar = activity instanceof xbs ? (xbs) activity : null;
        if (xbsVar != null) {
            return xbsVar.n();
        }
        return null;
    }

    public void Mf(int i, Intent intent) {
        if (!epx.f(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            ((Handler) this.F.getValue()).post(new t8i(i, intent, this));
            return;
        }
        if (intent == null) {
            setResult(i);
        } else {
            setResult(i, intent);
        }
        finish();
    }

    public final boolean Mn() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean("_fragment_impl_key_hidden", false);
    }

    public void Ng() {
        Rn();
    }

    public final boolean Nn() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean("_fragment_impl_key_started_for_result", false);
    }

    public final yw90 On() {
        yw90 yw90Var = this.L;
        if (yw90Var != null) {
            return yw90Var;
        }
        qcy<Object> qcyVar = M[0];
        return this.K.a(this);
    }

    public int Pn() {
        return 16;
    }

    public xyp0 Qn() {
        return this.I;
    }

    public void Sn() {
        if (this.J == null) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            this.J = rzp0.d(getArguments());
        }
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.d
    public final void Td(FragmentManager fragmentManager, String str) {
        super.Td(fragmentManager, str);
        Zn();
    }

    public void Tn() {
        On();
    }

    public boolean Wn(Rect rect, Rect rect2) {
        return true;
    }

    public final void Xn(int i) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            setArguments(arguments);
        }
        arguments.putInt("background_color", i);
    }

    public void Yn() {
        if (this.o) {
            Qn().c();
        }
    }

    public void Zn() {
        if (this.o) {
            Qn().d();
        }
    }

    public boolean a0() {
        return this instanceof GeoRequestFragment;
    }

    public void ao(View view) {
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.e(view);
        }
        On().d3(view);
    }

    public void b(boolean z) {
        finish();
    }

    public void bo() {
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.h();
        }
    }

    public void close() {
        finish();
    }

    public void co() {
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
    }

    public vbs d4() {
        return In();
    }

    @Override // androidx.fragment.app.d
    public void dismiss() {
        un(false, false);
        Yn();
    }

    public void finish() {
        vbs Ln = Ln();
        if ((Ln != null ? Ln.p() : 0) > 1) {
            ((Handler) this.F.getValue()).post(new yh9(this, 1));
            return;
        }
        if (Nn()) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
                return;
            }
            return;
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context] */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public Context mo2getContext() {
        ?? c2;
        a<?> Jn = Jn();
        return (Jn == null || (c2 = Jn.c()) == 0) ? super.mo2getContext() : c2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.D.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Object c2;
        Trace.beginSection(ndp0.f("FragmentImpl.onAttach"));
        try {
            a<?> Jn = Jn();
            if (Jn != null && (c2 = Jn.c()) != 0) {
                context = c2;
            }
            super.onAttach(context);
            Sn();
            mzp0 mzp0Var = this.J;
            if (mzp0Var != null) {
                mzp0Var.start();
            }
            Tn();
            this.D.b();
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.D.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Trace.beginSection(ndp0.f("FragmentImpl.onCreate"));
        try {
            super.onCreate(bundle);
            this.D.onCreate(bundle);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        Object failure;
        try {
            failure = AnimationUtils.loadAnimation(requireContext(), i2);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Animation animation = (Animation) failure;
        if (animation == null) {
            return null;
        }
        if (i2 > 0) {
            this.x = true;
            d3m.h(animation, new m84(12, this, animation));
        }
        return animation;
    }

    @Override // androidx.fragment.app.Fragment
    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        Object failure;
        try {
            failure = AnimatorInflater.loadAnimator(requireContext(), i2);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Animator animator = (Animator) failure;
        if (animator == null) {
            return null;
        }
        if (i2 > 0) {
            this.x = true;
            d3m.g(animator, new mxj(this, animator));
        }
        return animator;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.D.onDestroy();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.D.onDestroyView();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        co();
        this.D.c();
        a<?> Jn = Jn();
        if (Jn != null) {
            Jn.d();
        }
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Yn();
    }

    public void onFinish() {
        finish();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        Jn();
        return super.onGetLayoutInflater(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            vbs vbsVar = this.H;
            if (vbsVar != null) {
                vbsVar.e(z);
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putBoolean("_fragment_impl_key_hidden", z);
            }
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.putBoolean("_fragment_impl_key_hidden", z);
            }
            vbs vbsVar2 = this.H;
            if (vbsVar2 != null) {
                vbsVar2.e(z);
            }
        }
        if (z) {
            onPause();
        } else {
            onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        Trace.beginSection(ndp0.f("FragmentImpl.onPause"));
        try {
            super.onPause();
            this.D.onPause();
            co();
            On().deactivate();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Trace.beginSection(ndp0.f("FragmentImpl.onResume"));
        try {
            super.onResume();
            bo();
            this.D.onResume();
            On().c();
            mhy.e(kn().getWindow(), Pn());
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Trace.beginSection(ndp0.f("FragmentImpl.onSaveInstanceState"));
        try {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("fr_open_animation_enabled", this.z);
            bundle.putBoolean("fr_close_animation_enabled", this.y);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStop() {
        Trace.beginSection(ndp0.f("FragmentImpl.onStop"));
        try {
            super.onStop();
            this.D.onStop();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Trace.beginSection(ndp0.f("FragmentImpl.onViewCreated"));
        try {
            super.onViewCreated(view, bundle);
            if (bundle == null) {
                ao(view);
            }
            c cVar = this.E;
            if (cVar != null) {
                cVar.d();
            }
            this.E = null;
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.z = bundle.getBoolean("fr_open_animation_enabled");
            this.y = bundle.getBoolean("fr_close_animation_enabled");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void rn() {
        Trace.beginSection(ndp0.f("FragmentImpl.pause"));
        try {
            if (!Mn()) {
                Fragment parentFragment = getParentFragment();
                FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
                boolean z = false;
                if (fragmentImpl != null && fragmentImpl.Mn()) {
                    z = true;
                }
                if (!z) {
                    onPause();
                    s3q0 s3q0Var = s3q0.a;
                    Trace.endSection();
                }
            }
            super.onPause();
            s3q0 s3q0Var2 = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setEnterTransition(Object obj) {
        if (obj != null && (obj instanceof Transition)) {
            Transition transition = (Transition) obj;
            this.x = true;
            transition.addListener(new ibs(new qb6(11, transition, new n5i(this, transition))));
        }
        if (obj != null && (obj instanceof vlp0)) {
            vlp0 vlp0Var = (vlp0) obj;
            this.x = true;
            vlp0Var.addListener(new hbs(new nv2(19, vlp0Var, new jcg(this, vlp0Var))));
        }
        super.setEnterTransition(obj);
    }

    public final void setResult(int i) {
        if (Nn()) {
            this.A = i;
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(i);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            targetFragment.onActivityResult(getTargetRequestCode(), i, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void sn() {
        Trace.beginSection(ndp0.f("FragmentImpl.resume"));
        try {
            if (!Mn()) {
                Fragment parentFragment = getParentFragment();
                FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
                boolean z = false;
                if (fragmentImpl != null && fragmentImpl.Mn()) {
                    z = true;
                }
                if (!z) {
                    onResume();
                    s3q0 s3q0Var = s3q0.a;
                    Trace.endSection();
                }
            }
            super.onResume();
            s3q0 s3q0Var2 = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.fragment.app.d
    public void tn() {
        super.tn();
        Yn();
    }

    public void setResult(int i, Intent intent) {
        if (Nn()) {
            this.A = i;
            this.B = intent;
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(i, intent);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            targetFragment.onActivityResult(getTargetRequestCode(), i, intent);
        }
    }

    public void Rn() {
    }

    public void Vn() {
    }

    @Override // xsna.fy50
    public void lf() {
    }

    public void Un(KeyEvent keyEvent) {
    }

    public void y(UiTrackingScreen uiTrackingScreen) {
    }
}
