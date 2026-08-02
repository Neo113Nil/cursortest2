package com.vk.posting.presentation.video.search;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.posting.data.PickerTechMetricsSession;
import com.vk.posting.di.PostingComponent;
import kotlin.LazyThreadSafetyMode;
import xsna.ao50;
import xsna.djl;
import xsna.dn20;
import xsna.e2s;
import xsna.f540;
import xsna.fpf0;
import xsna.gm50;
import xsna.jk9;
import xsna.k7m;
import xsna.km50;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.oz50;
import xsna.rzh0;
import xsna.tzh0;
import xsna.vk50;
import xsna.w8i;
import xsna.wf90;

/* compiled from: SearchVideoPickerFragment.kt */
/* loaded from: classes5.dex */
public final class SearchVideoPickerFragment extends MviImplFragment<rzh0, h, com.vk.posting.presentation.video.search.a> implements w8i {
    public static final /* synthetic */ int U = 0;
    public g Q;
    public final b R = new b();
    public final Handler S = new Handler(Looper.getMainLooper());
    public final Object T = msy.a(LazyThreadSafetyMode.NONE, new f540(this, 23));

    /* compiled from: SearchVideoPickerFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        g gVar = new g(requireContext(), getViewLifecycleOwner(), this);
        this.Q = gVar;
        return new mk50.c(gVar.e);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        h hVar = (h) ao50Var;
        g gVar = this.Q;
        if (gVar == null) {
            gVar = null;
        }
        gVar.getClass();
        gm50.a.b(gVar, hVar.a, new e2s(gVar, 27));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((rzh0) vk50Var).i.a(new dn20(this, 23), this);
        this.S.post(new jk9(this, 10));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            ((djl) this.T.getValue()).f(bundle);
        }
        this.o = false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        djl djlVar = (djl) this.T.getValue();
        djlVar.b.e();
        djlVar.c = false;
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        djl djlVar = (djl) this.T.getValue();
        bundle.putParcelable("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(djlVar.d, djlVar.e));
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        UserId userId;
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("user_id_video")) == null) {
            userId = UserId.d;
        }
        UserId userId2 = userId;
        return new rzh0(new d(new tzh0(userId2, null, false, null)), userId2, new wf90(), ((PostingComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(PostingComponent.class))).c8(), (djl) this.T.getValue());
    }
}
