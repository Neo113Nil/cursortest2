package com.vk.im.itemlist.impl.presentation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.ironsource.X3;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a2s;
import xsna.ad0;
import xsna.akh;
import xsna.bpn0;
import xsna.dhr0;
import xsna.dlb;
import xsna.esm;
import xsna.f7w;
import xsna.f9t;
import xsna.fo50;
import xsna.fpf0;
import xsna.h3q;
import xsna.i6w;
import xsna.irb;
import xsna.iyp;
import xsna.izs;
import xsna.jsm;
import xsna.l2s;
import xsna.lpj;
import xsna.mag;
import xsna.msy;
import xsna.ngb;
import xsna.nsm;
import xsna.nzw;
import xsna.odm;
import xsna.oub;
import xsna.oz50;
import xsna.p6w;
import xsna.p7w;
import xsna.qcy;
import xsna.qhh0;
import xsna.r5w;
import xsna.r7w;
import xsna.rum;
import xsna.s3q0;
import xsna.too0;
import xsna.u8m;
import xsna.uic;
import xsna.w8m;
import xsna.xyh;
import xsna.y1z;
import xsna.y22;

/* compiled from: ImItemListFragment.kt */
/* loaded from: classes2.dex */
public final class ImItemListFragment extends FragmentImpl implements qhh0, too0 {
    public static final /* synthetic */ qcy<Object>[] S;
    public final bpn0 N = new bpn0(new akh(this, 26));
    public final Object O = msy.a(LazyThreadSafetyMode.NONE, new xyh(this, 22));
    public final d P = new d();
    public final nzw Q = new nzw(fpf0.d(p6w.class).toString(), this, new mag(this, 28));
    public p7w R;

    /* compiled from: ImItemListFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ImItemListFragment.kt */
    public static final class b extends fo50 {
        @Override // xsna.fo50
        public final ArrayList H(com.vk.im.engine.models.c cVar, DialogExt dialogExt, Peer peer) {
            ArrayList b = w8m.b(cVar, dialogExt, peer);
            b.add(u8m.b.b);
            return b;
        }
    }

    /* compiled from: ImItemListFragment.kt */
    public static final class c implements nsm {
        public final /* synthetic */ a2s b;

        public c(a2s a2sVar) {
            this.b = a2sVar;
        }

        @Override // xsna.nsm
        public final boolean a(Context context, u8m u8mVar, DialogExt dialogExt, io.reactivex.rxjava3.disposables.b bVar) {
            if (!(u8mVar instanceof u8m.b)) {
                return false;
            }
            this.b.a(context, new l2s.b(dialogExt.e));
            return true;
        }
    }

    /* compiled from: ImItemListFragment.kt */
    public static final class d extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    /* compiled from: ImItemListFragment.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<i6w, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(i6w i6wVar) {
            ((p6w) this.receiver).b(i6wVar);
            return s3q0.a;
        }
    }

    /* compiled from: ImItemListFragment.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<i6w, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(i6w i6wVar) {
            ((p6w) this.receiver).b(i6wVar);
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ImItemListFragment.class, X3.i.U, "getStore()Lcom/vk/im/itemlist/impl/presentation/feature/ImItemListMviStore;", 0);
        fpf0.a.getClass();
        S = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.P;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        this.P.b();
    }

    public final p6w eo() {
        qcy<Object> qcyVar = S[0];
        return (p6w) this.Q.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ImItemList.Debug onCreate: fragmentLifecycle=" + getLifecycle().getCurrentState()});
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"ImItemList.Debug onCreateView: fragmentLifecycle=" + getLifecycle().getCurrentState()});
        }
        return layoutInflater.inflate(R.layout.fragment_im_item_list, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ImItemList.Debug onDestroy: fragmentLifecycle=" + getLifecycle().getCurrentState()});
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        p7w p7wVar = this.R;
        if (p7wVar != null) {
            oub oubVar = p7wVar.n;
            irb irbVar = oubVar.e;
            if (irbVar != null) {
                irbVar.a();
            }
            oubVar.e = null;
            oubVar.f.e();
            p7wVar.i.b.e();
        }
        this.R = null;
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ImItemList.Debug onDestroyView: fragmentLifecycle=" + getLifecycle().getCurrentState()});
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ImItemList.Debug onPause: fragmentLifecycle=" + getLifecycle().getCurrentState() + ", viewLifecycle=" + getViewLifecycleOwner().getLifecycle().getCurrentState()});
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        p7w p7wVar = this.R;
        if (p7wVar != null) {
            p7wVar.q.a(p7wVar.h.a, p7wVar.l.h.f);
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ImItemList.Debug onResume: fragmentLifecycle=" + getLifecycle().getCurrentState() + ", viewLifecycle=" + getViewLifecycleOwner().getLifecycle().getCurrentState()});
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"ImItemList.Debug onViewCreated: fragmentLifecycle=" + getLifecycle().getCurrentState() + ", viewLifecycle=" + getViewLifecycleOwner().getLifecycle().getCurrentState()});
        }
        ngb ngbVar = new ngb(requireContext());
        rum rumVar = new rum(requireContext(), esm.a.d);
        ?? r1 = this.O;
        r7w r7wVar = new r7w(ngbVar, rumVar, ((jsm) r1.getValue()).d());
        p7w p7wVar = new p7w(this, (r5w) this.N.getValue(), ((jsm) r1.getValue()).d(), new f(1, eo(), p6w.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0));
        this.R = p7wVar;
        ad0.c(y22.a(getViewLifecycleOwner()), new dlb(this, r7wVar, p7wVar, 5));
        final f7w f7wVar = new f7w(this, new e(1, eo(), p6w.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0));
        L.d(new odm(this, 19));
        com.vk.mvi.binder.a aVar = new com.vk.mvi.binder.a(getViewLifecycleOwner().getLifecycle(), Lifecycle.State.RESUMED);
        com.vk.mvi.binder.c cVar = new com.vk.mvi.binder.c(h3q.c);
        s3q0 s3q0Var = s3q0.a;
        ArrayList arrayList = cVar.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((uic) it.next()).clear();
        }
        arrayList.clear();
        cVar.b = aVar;
        com.vk.mvi.binder.c.a(cVar, f9t.w(eo()), new iyp() { // from class: xsna.t5w
            @Override // xsna.iyp
            public final void a(pk50 pk50Var) {
                qcy<Object>[] qcyVarArr = ImItemListFragment.S;
                try {
                    new bfb((l6w) pk50Var, f7wVar, ImItemListFragment.this, 2).invoke();
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.q(th);
                }
            }
        });
        s3q0 s3q0Var2 = s3q0.a;
        s3q0 s3q0Var3 = s3q0.a;
    }

    @Override // xsna.qhh0
    public final boolean s() {
        eo().b(i6w.b0.b);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.IM;
    }
}
