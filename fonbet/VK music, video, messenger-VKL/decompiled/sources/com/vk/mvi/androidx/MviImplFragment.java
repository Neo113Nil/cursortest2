package com.vk.mvi.androidx;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.FragmentImpl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao50;
import xsna.dv4;
import xsna.fpf0;
import xsna.kj50;
import xsna.km50;
import xsna.mk50;
import xsna.qcy;
import xsna.quk0;
import xsna.s5q0;
import xsna.vk50;
import xsna.xn50;
import xsna.z4z;
import xsna.zyw;

/* compiled from: MviImplFragment.kt */
/* loaded from: classes.dex */
public abstract class MviImplFragment<F extends vk50<VS, A>, VS extends ao50, A extends kj50> extends FragmentImpl implements xn50<F, VS, A>, quk0<km50> {
    public static final /* synthetic */ qcy<Object>[] P;
    public final ArrayList N;
    public final s5q0 O;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MviImplFragment.class, SignalingProtocol.KEY_FEATURE, "getFeature()Lcom/vk/mvi/core/MviFeature;", 0);
        fpf0.a.getClass();
        P = new qcy[]{propertyReference1Impl};
    }

    public MviImplFragment() {
        ArrayList arrayList = new ArrayList();
        this.N = arrayList;
        s5q0 s5q0Var = new s5q0(this, new dv4(this, 9), this);
        arrayList.add(s5q0Var);
        this.O = s5q0Var;
    }

    @Override // xsna.xn50
    public final void e2(A a) {
        xn50.a.c(this, a);
    }

    @Override // xsna.quk0
    /* renamed from: eo */
    public km50 sf(Parcelable parcelable) {
        return null;
    }

    @Override // xsna.xn50
    public final F getFeature() {
        qcy<Object> qcyVar = P[0];
        return (F) this.O.b();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator it = this.N.iterator();
        while (it.hasNext()) {
            ((z4z) it.next()).a();
        }
        F feature = getFeature();
        zyw zywVar = feature instanceof zyw ? (zyw) feature : null;
        if (zywVar != null) {
            zywVar.A();
        }
        R4(getFeature());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        mk50 Fl = Fl();
        if (Fl instanceof mk50.c) {
            return ((mk50.c) Fl).a();
        }
        if (Fl instanceof mk50.b) {
            return layoutInflater.inflate(((mk50.b) Fl).a(), viewGroup, false);
        }
        if (Fl instanceof mk50.a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Jh(getFeature().g(), view);
    }

    public Parcelable vb() {
        return null;
    }

    public void R4(F f) {
    }
}
