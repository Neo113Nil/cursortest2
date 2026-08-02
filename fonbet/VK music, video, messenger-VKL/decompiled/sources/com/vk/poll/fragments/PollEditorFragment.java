package com.vk.poll.fragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.attachpicker.widget.TopShadowLinearLayout;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.view.FitSystemWindowsFragmentWrapperFrameLayout;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.log.L;
import com.vk.movika.tools.controls.seekbar.s;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import com.vkontakte.android.attachments.PollAttachment;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.Cnew;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cvk;
import xsna.dw20;
import xsna.fnj;
import xsna.glc0;
import xsna.gz80;
import xsna.hpb0;
import xsna.i440;
import xsna.iah0;
import xsna.ies;
import xsna.iia0;
import xsna.inb0;
import xsna.j5g;
import xsna.jnb0;
import xsna.kr50;
import xsna.krv0;
import xsna.mhy;
import xsna.msy;
import xsna.nds;
import xsna.nub0;
import xsna.oz50;
import xsna.p5y;
import xsna.p90;
import xsna.rka0;
import xsna.tpb0;
import xsna.tx;
import xsna.uuk;
import xsna.wx0;
import xsna.xg2;

/* compiled from: PollEditorFragment.kt */
/* loaded from: classes17.dex */
public final class PollEditorFragment extends BaseFragment implements ies, glc0, nds {
    public static final /* synthetic */ int X = 0;
    public hpb0 S;
    public p5y T;
    public boolean U;
    public f V;
    public final Object W = msy.a(LazyThreadSafetyMode.NONE, new i440(this, 15));

    /* compiled from: PollEditorFragment.kt */
    public static final class a extends oz50 {
        public static final /* synthetic */ int m = 0;

        /* compiled from: PollEditorFragment.kt */
        /* renamed from: com.vk.poll.fragments.PollEditorFragment$a$a, reason: collision with other inner class name */
        public static final class C1520a {
            public static a a(UserId userId, String str) {
                a aVar = new a();
                Bundle bundle = aVar.j;
                bundle.putParcelable("ownerId", userId);
                bundle.putString("ref", str);
                return aVar;
            }

            public static a b(PollAttachment pollAttachment, String str) {
                a aVar = new a();
                Bundle bundle = aVar.j;
                bundle.putParcelable("poll", pollAttachment);
                bundle.putString("ref", str);
                return aVar;
            }
        }

        public a() {
            super(PollEditorFragment.class, null, null);
            nub0.a().d(this);
        }
    }

    @Override // xsna.glc0
    public final void Gi() {
        View currentFocus;
        FragmentActivity activity = getActivity();
        if (activity == null || (currentFocus = activity.getCurrentFocus()) == null) {
            return;
        }
        mhy.j(currentFocus);
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    @Override // xsna.glc0
    public final boolean Xe() {
        hpb0 hpb0Var = this.S;
        if (hpb0Var == null) {
            hpb0Var = null;
        }
        String m = hpb0Var.m();
        if (m != null && m.length() > 0) {
            return true;
        }
        uuk uukVar = hpb0Var.n;
        if ((uukVar instanceof jnb0) && ((jnb0) uukVar).v0()) {
            return true;
        }
        Iterator it = hpb0Var.l().iterator();
        while (it.hasNext()) {
            if (((hpb0.d) it.next()).a.length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (((java.lang.Boolean) r7.getValue()).booleanValue() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        if (r2 == false) goto L48;
     */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a0() {
        Object obj;
        Poll poll;
        io().c(this);
        hpb0 hpb0Var = this.S;
        if (hpb0Var == null) {
            hpb0Var = null;
        }
        if (hpb0Var.R) {
            PollAttachment pollAttachment = hpb0Var.d;
            if (pollAttachment != null && (poll = pollAttachment.f) != null) {
                bpn0 bpn0Var = new bpn0(new xg2(9, hpb0Var, poll));
                bpn0 bpn0Var2 = new bpn0(new wx0(18, poll, hpb0Var));
                bpn0 bpn0Var3 = new bpn0(new tx(20, hpb0Var, poll));
                bpn0 bpn0Var4 = new bpn0(new kr50(hpb0Var, 11));
                if (!((Boolean) bpn0Var3.getValue()).booleanValue()) {
                    if (!((Boolean) bpn0Var.getValue()).booleanValue()) {
                        if (!((Boolean) bpn0Var2.getValue()).booleanValue()) {
                        }
                    }
                }
                ((d.a) hpb0Var.V.getValue()).m();
                return true;
            }
            return false;
        }
        ArrayList l = hpb0Var.l();
        String m = hpb0Var.m();
        boolean z = m == null || m.length() == 0;
        Iterator it = l.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((hpb0.d) obj).a.length() > 0) {
                break;
            }
        }
        hpb0.d dVar = (hpb0.d) obj;
        String str = dVar != null ? dVar.a : null;
        boolean z2 = str == null || str.length() == 0;
        boolean z3 = hpb0Var.n.K0() instanceof inb0;
        if (z) {
            if (z2) {
            }
        }
        ((d.a) hpb0Var.V.getValue()).m();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final tpb0 io() {
        return (tpb0) this.W.getValue();
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return krv0.l(R.attr.vk_ui_background_modal);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        hpb0 hpb0Var = this.S;
        if (hpb0Var == null) {
            hpb0Var = null;
        }
        hpb0Var.r(i, i2, intent);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hpb0 hpb0Var = this.S;
        if (hpb0Var == null) {
            hpb0Var = null;
        }
        ((ViewGroup) hpb0Var.J.getValue()).getLayoutParams().height = (int) getResources().getDimension(R.dimen.picker_toolbar_height);
        if (!isResumed()) {
            this.T = new p5y(this, 21);
        } else {
            hpb0 hpb0Var2 = this.S;
            (hpb0Var2 != null ? hpb0Var2 : null).p().a();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        UserId userId;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean containsKey = arguments != null ? arguments.containsKey("ownerId") : false;
        Bundle arguments2 = getArguments();
        boolean containsKey2 = arguments2 != null ? arguments2.containsKey("poll") : false;
        if (!containsKey && !containsKey2) {
            cvk.u(R.string.error, false);
            finish();
            L.l("You can't create poll without ownerId or edit without pollAttachment!");
        }
        Bundle arguments3 = getArguments();
        String str = (arguments3 == null || (string = arguments3.getString("ref", "poll")) == null) ? "poll" : string;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (userId = (UserId) arguments4.getParcelable("ownerId")) == null) {
            userId = UserId.d;
        }
        Bundle arguments5 = getArguments();
        PollAttachment pollAttachment = arguments5 != null ? (PollAttachment) arguments5.getParcelable("poll") : null;
        if (pollAttachment != null) {
            userId = pollAttachment.f.c;
        }
        UserId userId2 = userId;
        nub0.a().getClass();
        Bundle arguments6 = getArguments();
        hpb0 hpb0Var = new hpb0(userId2, str, pollAttachment, arguments6 != null ? arguments6.getInt("maxTitleLength", 80) : 80, 0L, io(), null, null, 944);
        this.S = hpb0Var;
        hpb0Var.P = this.V;
        Bundle arguments7 = getArguments();
        this.U = arguments7 != null ? arguments7.getBoolean("hideToolbar") : false;
        io().onCreate();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentManager supportFragmentManager;
        List<Fragment> f;
        FragmentActivity activity = getActivity();
        boolean z = !(((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (f = supportFragmentManager.c.f()) == null) ? null : (Fragment) j5g.Y(f)) instanceof dw20);
        hpb0 hpb0Var = this.S;
        (hpb0Var == null ? null : hpb0Var).Q = z;
        if (hpb0Var == null) {
            hpb0Var = null;
        }
        View f2 = hpb0Var.f(layoutInflater, viewGroup);
        if (this.U) {
            hpb0 hpb0Var2 = this.S;
            if (hpb0Var2 == null) {
                hpb0Var2 = null;
            }
            bwt0.p0((ViewGroup) hpb0Var2.J.getValue(), false);
            ((TopShadowLinearLayout) hpb0Var2.v.getValue()).setShadowEnabled(false);
        }
        hpb0 hpb0Var3 = this.S;
        (hpb0Var3 == null ? null : hpb0Var3).K = new rka0(this, 2);
        (hpb0Var3 == null ? null : hpb0Var3).L = new iia0(this, 4);
        (hpb0Var3 == null ? null : hpb0Var3).M = new Cnew(this, 27);
        (hpb0Var3 != null ? hpb0Var3 : null).N = new s(this, 15);
        return f2;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        hpb0 hpb0Var = this.S;
        if (hpb0Var == null) {
            hpb0Var = null;
        }
        hpb0Var.l.dispose();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        FragmentActivity activity = getActivity();
        VKActivity vKActivity = activity instanceof VKActivity ? (VKActivity) activity : null;
        if (vKActivity != null) {
            vKActivity.r = true;
        }
        hpb0 hpb0Var = this.S;
        if (hpb0Var == null) {
            hpb0Var = null;
        }
        c cVar = hpb0Var.r;
        if (cVar != null) {
            cVar.dispose();
        }
        hpb0Var.r = null;
        io().onDestroy();
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null && gz80.a(23)) {
            HashSet hashSet = iah0.a;
            if (!fnj.d(activity) && !this.U) {
                p90.b(activity, krv0.l(R.attr.vk_ui_background_modal), false);
            }
        }
        p5y p5yVar = this.T;
        if (p5yVar != null) {
            p5yVar.invoke();
        }
        this.T = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        io().b(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewParent parent;
        super.onViewCreated(view, bundle);
        FragmentActivity kn = kn();
        HashSet hashSet = iah0.a;
        if (fnj.d(kn) && (parent = view.getParent()) != null && (parent instanceof FitSystemWindowsFragmentWrapperFrameLayout)) {
            ((FitSystemWindowsFragmentWrapperFrameLayout) parent).setFitsSystemWindows(false);
        }
        TypedValue typedValue = krv0.a;
        if (krv0.j() && gz80.a(23)) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() + 8192);
        }
        FragmentActivity activity = getActivity();
        VKActivity vKActivity = activity instanceof VKActivity ? (VKActivity) activity : null;
        if (vKActivity != null) {
            vKActivity.r = false;
        }
        hpb0 hpb0Var = this.S;
        (hpb0Var != null ? hpb0Var : null).s();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            io().g(bundle);
        }
    }
}
