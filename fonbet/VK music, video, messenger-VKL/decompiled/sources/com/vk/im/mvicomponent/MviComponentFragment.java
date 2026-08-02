package com.vk.im.mvicomponent;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.FragmentImpl;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.subjects.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import xsna.bpn0;
import xsna.bv1;
import xsna.kj50;
import xsna.km50;
import xsna.mg8;
import xsna.mk50;
import xsna.msm0;
import xsna.quk0;
import xsna.s1x;
import xsna.u210;
import xsna.yj50;
import xsna.yn50;

/* compiled from: MviComponentFragment.kt */
/* loaded from: classes.dex */
public abstract class MviComponentFragment extends FragmentImpl implements mg8, quk0<km50> {
    public static final /* synthetic */ int S = 0;
    public final msm0 N = new msm0();
    public final f<kj50> O = new f<>();
    public final bpn0 P = new bpn0(new u210(this, 8));
    public final LinkedHashMap Q = new LinkedHashMap();
    public final bpn0 R = new bpn0(new s1x(this, 15));

    @Override // xsna.mg8
    public final <T extends yn50> void H9(yj50<?, ?, ?, ?, ?, ?, ?> yj50Var, T t) {
        ((mg8) this.P.getValue()).H9(yj50Var, t);
    }

    @Override // xsna.mg8
    public final <T extends kj50> void P9(yj50<?, ?, ?, ?, ?, ?, ?> yj50Var, T t) {
        ((mg8) this.P.getValue()).P9(yj50Var, t);
    }

    public abstract mg8 eo();

    public abstract Iterable<yj50<?, ?, ?, ?, ?, ?, ?>> fo();

    public abstract ViewGroup go(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public final void ho(kj50 kj50Var) {
        this.O.onNext(kj50Var);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = ((Set) this.R.getValue()).iterator();
        while (it.hasNext()) {
            ((yj50) it.next()).g();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Iterator it = ((Set) this.R.getValue()).iterator();
        while (it.hasNext()) {
            ((yj50) it.next()).h();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        io();
        ViewGroup go = go(layoutInflater, viewGroup, bundle);
        Iterator it = ((Set) this.R.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.Q;
            if (!hasNext) {
                this.N.a(go, linkedHashMap);
                return go;
            }
            yj50 yj50Var = (yj50) it.next();
            linkedHashMap.put(yj50Var, yj50Var.c(layoutInflater, go, new bv1(25, this, yj50Var)));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Iterator it = ((Set) this.R.getValue()).iterator();
        while (it.hasNext()) {
            ((yj50) it.next()).i();
        }
        this.Q.clear();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        for (Map.Entry entry : this.Q.entrySet()) {
            yj50 yj50Var = (yj50) entry.getKey();
            mk50 mk50Var = (mk50) entry.getValue();
            View view2 = null;
            mk50.c cVar = mk50Var instanceof mk50.c ? (mk50.c) mk50Var : null;
            if (cVar != null) {
                view2 = cVar.a();
            }
            yj50Var.j(view2, bundle);
        }
    }

    @Override // xsna.quk0
    public final /* bridge */ /* synthetic */ Object sf(Parcelable parcelable) {
        return null;
    }

    @Override // xsna.mg8
    public final q<kj50> v() {
        return ((mg8) this.P.getValue()).v().Y(this.O);
    }

    @Override // xsna.quk0
    public final Parcelable vb() {
        return null;
    }

    public void io() {
    }
}
