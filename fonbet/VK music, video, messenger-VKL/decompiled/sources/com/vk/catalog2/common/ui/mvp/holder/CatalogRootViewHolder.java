package com.vk.catalog2.common.ui.mvp.holder;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.widget.LifecycleHandler;
import com.vk.movika.sdk.base.ui.g;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import java.util.Collections;
import java.util.UUID;
import kotlin.InitializedLazyImpl;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.b5a;
import xsna.b5z;
import xsna.bpn0;
import xsna.cfp0;
import xsna.e3m;
import xsna.enj;
import xsna.epx;
import xsna.ew;
import xsna.f5z;
import xsna.g2v;
import xsna.g380;
import xsna.gzs;
import xsna.hg1;
import xsna.i0q0;
import xsna.izs;
import xsna.jd;
import xsna.k00;
import xsna.l1;
import xsna.m3a;
import xsna.mba;
import xsna.msy;
import xsna.nda;
import xsna.obl0;
import xsna.od40;
import xsna.orp;
import xsna.q3a;
import xsna.rzp0;
import xsna.s3q0;
import xsna.smg;
import xsna.t4a;
import xsna.t5a;
import xsna.tb0;
import xsna.too0;
import xsna.u0a;
import xsna.u4a;
import xsna.uha;
import xsna.v1v;
import xsna.w8i;
import xsna.wia;
import xsna.x8l0;
import xsna.xhu0;
import xsna.z34;

/* compiled from: CatalogRootViewHolder.kt */
/* loaded from: classes16.dex */
public abstract class CatalogRootViewHolder implements CatalogViewHolder, CatalogVh, mba, tb0, g380, too0, w8i {
    public final Activity b;
    public final boolean c;
    public final f5z d;
    public final bpn0 e;
    public final Object f;
    public final Class<?> g;
    public final Bundle h;
    public final String i;
    public final uha j;
    public io.reactivex.rxjava3.disposables.b k;
    public final Object l;
    public final u4a m;
    public final bpn0 n;
    public final d o;

    /* compiled from: CatalogRootViewHolder.kt */
    public static final class a implements mba {
        public a() {
        }

        @Override // xsna.mba
        public final void m(int i, UIBlock uIBlock, izs<? super Boolean, s3q0> izsVar) {
            CatalogRootViewHolder b = CatalogRootViewHolder.this.m.b.b.b();
            if (b != null) {
                b.m(i, uIBlock, izsVar);
            }
        }

        @Override // xsna.mba
        public final void q(int i, UIBlock uIBlock, Object obj) {
            CatalogRootViewHolder b = CatalogRootViewHolder.this.m.b.b.b();
            if (b != null) {
                b.q(i, uIBlock, obj);
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.mba
        public final void w(View view, UIBlock uIBlock, Object obj) {
            CatalogRootViewHolder catalogRootViewHolder = CatalogRootViewHolder.this;
            if (!((Boolean) catalogRootViewHolder.l.getValue()).booleanValue()) {
                super.w(view, uIBlock, obj);
                return;
            }
            CatalogRootViewHolder b = catalogRootViewHolder.m.b.b.b();
            if (b != null) {
                b.w(view, uIBlock, null);
            }
        }

        @Override // xsna.mba
        public final void z(int i, UIBlock uIBlock) {
            CatalogRootViewHolder b = CatalogRootViewHolder.this.m.b.b.b();
            if (b != null) {
                b.z(i, uIBlock);
            }
        }
    }

    /* compiled from: CatalogRootViewHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((io.reactivex.rxjava3.disposables.b) this.receiver).dispose();
            return s3q0.a;
        }
    }

    /* compiled from: CatalogRootViewHolder.kt */
    public static final /* synthetic */ class c extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((CatalogRootViewHolder) this.receiver).k;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((CatalogRootViewHolder) this.receiver).k = (io.reactivex.rxjava3.disposables.b) obj;
        }
    }

    /* compiled from: CatalogRootViewHolder.kt */
    public static final class d extends b5z {
        public d() {
        }

        @Override // xsna.b5z
        public final void d(String str, int i, int i2, Intent intent) {
            CatalogRootViewHolder b;
            if (epx.f(String.valueOf(this.b), str) && (b = CatalogRootViewHolder.this.m.b.b.b()) != null) {
                b.onActivityResult(i, i2, intent);
            }
        }
    }

    public CatalogRootViewHolder(Bundle bundle, Class<?> cls, Activity activity, nda ndaVar, boolean z, FragmentManager fragmentManager, f5z f5zVar) {
        this.b = activity;
        this.c = z;
        this.d = f5zVar;
        this.e = new bpn0(new l1(this, 12));
        g gVar = new g(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, gVar);
        Class<?> cls2 = cls == null ? getClass() : cls;
        this.g = cls2;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.h = bundle2;
        String string = bundle2.getString("section");
        this.i = string == null ? "" : string;
        if (bundle2.containsKey("___CTLG_KEY_CLASS__")) {
            throw new IllegalStateException("Bundle already contains key: ___CTLG_KEY_CLASS__");
        }
        bundle2.putString("___CTLG_KEY_CLASS__", cls2.getCanonicalName());
        this.j = new uha(0);
        this.l = msy.a(lazyThreadSafetyMode, new z34(3));
        String string2 = bundle2.getString("entry_point", null);
        String canonicalName = cls2.getCanonicalName();
        mba J = J();
        if (string2 == null) {
            StringBuilder b2 = v1v.b(canonicalName, '_');
            b2.append(UUID.randomUUID());
            string2 = b2.toString();
        }
        String str = string2;
        xhu0 xhu0Var = t4a.a.a;
        (xhu0Var == null ? null : xhu0Var).getClass();
        x8l0 d2 = g2v.d();
        bpn0 bpn0Var = enj.a;
        obl0 e = d2.e(e3m.h(activity));
        u4a.b bVar = new u4a.b(J, new smg(g2v.d().a(), e), Collections.singletonList(new InitializedLazyImpl(e)), new t5a(), fragmentManager, activity, rzp0.d(bundle2), 64);
        xhu0 xhu0Var2 = t4a.a.a;
        u4a.a a2 = (xhu0Var2 != null ? xhu0Var2 : null).a(bundle2, str);
        u4a u4aVar = new u4a(a2, bVar);
        ndaVar.a = a2.a;
        u4a a3 = u4a.a(u4aVar, u4a.a.a(a2, ndaVar, null, null, null, null, null, null, null, null, null, null, -3, 1048575));
        orp Q = Q();
        a3 = Q != null ? Q.a(a3) : a3;
        this.m = a3;
        this.n = new bpn0(new jd(this, 15));
        this.o = new d();
        a3.b.s.E(a3);
    }

    public mba J() {
        return new a();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void K() {
        onPause();
        this.m.b.E.cancel();
        ((od40) this.f.getValue()).a(null);
        io.reactivex.rxjava3.disposables.b bVar = this.k;
        if (bVar != null) {
            i0q0.f(new b(0, bVar, io.reactivex.rxjava3.disposables.b.class, "dispose", "dispose()V", 0));
        }
        this.k = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        if (!this.c) {
            LifecycleHandler.h(this.b, R());
        }
        R().e(this.o);
        P().a();
        Y();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void M() {
        io.reactivex.rxjava3.disposables.b bVar = this.k;
        if (bVar != null) {
            bVar.dispose();
        }
        ((od40) this.f.getValue()).a(this.i);
        io.reactivex.rxjava3.disposables.b bVar2 = new io.reactivex.rxjava3.disposables.b();
        new c(this, CatalogRootViewHolder.class, "resumedCatalogDisposables", "getResumedCatalogDisposables()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", 0).set(bVar2);
        u4a u4aVar = this.m;
        u4a.a aVar = u4aVar.b;
        u4a.a aVar2 = u4aVar.b;
        io.reactivex.rxjava3.disposables.c g0 = g0(aVar.f);
        if (g0 != null) {
            bVar2.b(g0);
        }
        io.reactivex.rxjava3.disposables.c h0 = h0(aVar2.e);
        if (h0 != null) {
            bVar2.b(h0);
        }
        bVar2.b(f0(aVar2.d));
        f<u0a> fVar = aVar2.f.a;
        hg1.k kVar = new hg1.k();
        fVar.getClass();
        bVar2.b(new i0(fVar, kVar).U(new hg1.j()).subscribe(new ew(new k00(this, 14), 7)));
        onResume();
    }

    public final wia N() {
        return (wia) this.e.getValue();
    }

    public uha P() {
        return this.j;
    }

    public orp Q() {
        return null;
    }

    public final LifecycleHandler R() {
        return (LifecycleHandler) this.n.getValue();
    }

    public void S(cfp0 cfp0Var) {
        P().c(cfp0Var.a, cfp0Var.b);
    }

    public boolean T(boolean z) {
        return this.m.b.b.c(z);
    }

    public boolean W() {
        return false;
    }

    public abstract View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public abstract void Y();

    public byte[] b0() {
        return new byte[0];
    }

    public io.reactivex.rxjava3.disposables.c f0(m3a m3aVar) {
        return EmptyDisposable.INSTANCE;
    }

    public io.reactivex.rxjava3.disposables.c g0(b5a b5aVar) {
        return null;
    }

    public io.reactivex.rxjava3.disposables.c h0(q3a q3aVar) {
        return null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        u4a.a aVar = this.m.b;
        View a2 = aVar.b.a(layoutInflater, aVar.s, this, this.h);
        R().a(this.o);
        return a2;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.too0
    public void Ng() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void Z(byte[] bArr) {
    }

    @Override // xsna.m0q0
    public void y(UiTrackingScreen uiTrackingScreen) {
    }

    public /* synthetic */ CatalogRootViewHolder(Bundle bundle, Class cls, Activity activity, nda ndaVar, boolean z, f5z f5zVar, int i) {
        this(bundle, (Class<?>) ((i & 2) != 0 ? null : cls), activity, ndaVar, (i & 16) != 0 ? false : z, (FragmentManager) null, (i & 64) != 0 ? null : f5zVar);
    }

    @Override // xsna.mba
    public void m(int i, UIBlock uIBlock, izs<? super Boolean, s3q0> izsVar) {
    }

    @Override // xsna.mba
    public void q(int i, UIBlock uIBlock, Object obj) {
    }
}
