package com.vk.im.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.bridges.ImageViewer;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import defpackage.k0;
import xsna.a1w;
import xsna.au90;
import xsna.epx;
import xsna.g2v;
import xsna.jbs;
import xsna.l8j;
import xsna.mxv;
import xsna.myc0;
import xsna.o25;
import xsna.oz50;
import xsna.q1w;
import xsna.szf0;

/* compiled from: ImContactFragment.kt */
/* loaded from: classes2.dex */
public final class ImContactFragment extends ImFragment implements au90, szf0 {
    public l8j P;

    /* compiled from: ImContactFragment.kt */
    public static final class a extends oz50 {
        public a(long j) {
            super(ImContactFragment.class, null, null);
            Bundle bundle = this.j;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            bundle.putParcelable("dialog_id", Peer.a.b(j));
        }
    }

    /* compiled from: ImContactFragment.kt */
    public static final class b {
        public b() {
        }
    }

    @Override // xsna.szf0
    public final boolean Hg(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("dialog_id");
        Bundle arguments = getArguments();
        return epx.f(parcelable, arguments != null ? (Peer) arguments.getParcelable("dialog_id") : null);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Peer peer;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        long j = (arguments == null || (peer = (Peer) arguments.getParcelable("dialog_id")) == null) ? 0L : peer.b;
        if (!com.vk.dto.common.b.d(j) && !com.vk.dto.common.b.b(j)) {
            throw new IllegalArgumentException(k0.a(j, "Illegal user id "));
        }
        long j2 = j;
        Context requireContext = requireContext();
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        mxv c = g2v.c();
        ImageViewer d = myc0.d();
        jbs jbsVar = new jbs(this);
        Serializer.c<Peer> cVar = Peer.CREATOR;
        l8j l8jVar = new l8j(requireContext, a1wVar, c, d, jbsVar, Peer.a.b(j2), o25.a());
        this.P = l8jVar;
        this.O.add(l8jVar);
        l8j l8jVar2 = this.P;
        (l8jVar2 != null ? l8jVar2 : null).o = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l8j l8jVar = this.P;
        if (l8jVar == null) {
            l8jVar = null;
        }
        return l8jVar.F0(viewGroup, bundle);
    }

    @Override // xsna.au90
    public final boolean v8(long j) {
        Peer peer;
        Bundle arguments = getArguments();
        return (arguments == null || (peer = (Peer) arguments.getParcelable("dialog_id")) == null || peer.b != j) ? false : true;
    }

    @Override // xsna.y760
    public final void h9(Intent intent) {
    }
}
