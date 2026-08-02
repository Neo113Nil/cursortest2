package com.vk.photos.ui.attachmentspicker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.lists.ListDataSet;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.a920;
import xsna.aeg0;
import xsna.am1;
import xsna.aq2;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cty;
import xsna.dm1;
import xsna.epx;
import xsna.g3p0;
import xsna.gm6;
import xsna.hha0;
import xsna.iin0;
import xsna.j5g;
import xsna.jfv;
import xsna.jha0;
import xsna.klj;
import xsna.lha0;
import xsna.msy;
import xsna.n7w;
import xsna.tb0;
import xsna.vq3;
import xsna.we6;
import xsna.xmz;
import xsna.y8g0;
import xsna.z34;
import xsna.zvw;

/* compiled from: PickVKPhotoFragmentNew.kt */
/* loaded from: classes3.dex */
public final class PickVKPhotoFragmentNew extends BasePhotoListFragment<Object> implements hha0, iin0, tb0 {
    public static final /* synthetic */ int t0 = 0;
    public int o0;
    public Toolbar q0;
    public final Object r0;
    public final Object s0;
    public final lha0 n0 = new lha0(this);
    public final bpn0 p0 = new bpn0(new cty(this, 25));

    public PickVKPhotoFragmentNew() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.r0 = msy.a(lazyThreadSafetyMode, new n7w(this, 19));
        this.s0 = msy.a(lazyThreadSafetyMode, new z34(27));
    }

    @Override // xsna.hha0
    public final void P(PhotosGetAlbums.a aVar) {
        ArrayList<PhotoAlbum> arrayList = aVar.a;
        int size = arrayList.size();
        ArrayList<PhotoAlbum> arrayList2 = aVar.b;
        this.o0 = arrayList2.size() + size;
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.addAll(arrayList2);
        uo().clear();
        uo().n0(j5g.H0(arrayList3, 10));
    }

    @Override // xsna.hha0
    public final void R(int i) {
        dm1 uo = uo();
        uo.getClass();
        uo.C0(new am1(i));
        int i2 = -1;
        this.o0--;
        klj kljVar = to();
        ListDataSet listDataSet = (ListDataSet) this.V.c;
        ArrayList arrayList = listDataSet.d;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (epx.f(((we6) arrayList.get(i3)).f, 1)) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 >= 0) {
            listDataSet.h(i2);
            arrayList.set(i2, kljVar);
            listDataSet.d(i2);
        }
    }

    @Override // xsna.hha0
    public final void U(int i, String str) {
        uo().U(i, str);
    }

    @Override // xsna.iin0
    public final ViewGroup Wj(Context context) {
        Toolbar toolbar = this.q0;
        if (toolbar != null) {
            return toolbar;
        }
        Toolbar toolbar2 = new Toolbar(context, null);
        toolbar2.setTitle(R.string.photos);
        g3p0.c(toolbar2);
        bwt0.Z(R.attr.vk_ui_background_modal, toolbar2);
        this.q0 = toolbar2;
        return toolbar2;
    }

    @Override // xsna.hha0
    public final void X(PhotoAlbum photoAlbum) {
        uo().X(photoAlbum);
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, com.vk.core.fragments.BaseMvpFragment
    public final gm6 io() {
        return this.n0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    public final void lo() {
        zvw zvwVar = this.V;
        zvwVar.clear();
        if (this.o0 > 0) {
            zvwVar.x0(to());
            jfv jfvVar = new jfv(0, uo());
            jfvVar.j = new xmz(20);
            jfvVar.b = true;
            zvwVar.x0(jfvVar);
        }
        ?? r0 = this.s0;
        ((zvw) r0.getValue()).clear();
        ((zvw) r0.getValue()).x0(new klj(y8g0.e(R.string.all_photos), this.a0, false, (Runnable) null, 24));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    public final a920 mo() {
        a920 a920Var = new a920();
        a920Var.K0(this.V);
        a920Var.K0((zvw) this.s0.getValue());
        a920Var.K0(po());
        return a920Var;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == -1) {
            Mf(-1, intent);
        }
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater.Factory kn = kn();
        aeg0 aeg0Var = kn instanceof aeg0 ? (aeg0) kn : null;
        if (aeg0Var != null) {
            aeg0Var.Li(this);
        }
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        LayoutInflater.Factory kn = kn();
        aeg0 aeg0Var = kn instanceof aeg0 ? (aeg0) kn : null;
        if (aeg0Var != null) {
            aeg0Var.yk(this);
        }
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bwt0.Z(R.attr.vk_ui_background_content, view);
        VkTopBar vkTopBar = this.X;
        if (vkTopBar != null) {
            vkTopBar.setVisibility(8);
        }
        this.q0 = null;
        view.findViewById(R.id.app_bar_shadow_view).setVisibility(8);
        if (view.hasOnClickListeners()) {
            return;
        }
        view.setOnClickListener(new jha0());
    }

    @Override // xsna.hha0
    public final void q() {
        aq2 aq2Var = this.Y;
        if (aq2Var == null) {
            aq2Var = null;
        }
        aq2Var.f0();
        C1(null);
        ko();
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    /* renamed from: ro */
    public final Object io() {
        return this.n0;
    }

    public final klj to() {
        klj kljVar = new klj(kn().getString(R.string.albums), this.o0, true, (Runnable) new vq3(this, 10), 8);
        kljVar.f = 1;
        return kljVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dm1 uo() {
        return (dm1) this.r0.getValue();
    }
}
