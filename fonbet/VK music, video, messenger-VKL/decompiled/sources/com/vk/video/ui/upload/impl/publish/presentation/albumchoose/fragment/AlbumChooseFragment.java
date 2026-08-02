package com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bn50;
import xsna.cd1;
import xsna.fpf0;
import xsna.g7s0;
import xsna.hd1;
import xsna.id1;
import xsna.ies;
import xsna.izs;
import xsna.msy;
import xsna.nwy;
import xsna.oz50;
import xsna.pu;
import xsna.qcy;
import xsna.qu;
import xsna.s3q0;
import xsna.u1h0;
import xsna.wcy;
import xsna.xpi;
import xsna.ye1;

/* compiled from: AlbumChooseFragment.kt */
/* loaded from: classes7.dex */
public final class AlbumChooseFragment extends FragmentImpl implements ies {
    public static final /* synthetic */ qcy<Object>[] P;
    public final Object N = msy.a(LazyThreadSafetyMode.NONE, new pu(this, 4));
    public final u1h0 O;

    /* compiled from: AlbumChooseFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: AlbumChooseFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<id1, s3q0> {
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(id1 id1Var) {
            id1 id1Var2 = id1Var;
            AlbumChooseFragment albumChooseFragment = (AlbumChooseFragment) this.receiver;
            qcy<Object>[] qcyVarArr = AlbumChooseFragment.P;
            albumChooseFragment.getClass();
            if (id1Var2 instanceof id1.a) {
                AlbumChooseResult albumChooseResult = ((id1.a) id1Var2).a;
                if (albumChooseResult != null) {
                    Intent intent = new Intent();
                    intent.putExtra("arguments", albumChooseResult);
                    s3q0 s3q0Var = s3q0.a;
                    albumChooseFragment.Mf(-1, intent);
                } else {
                    albumChooseFragment.Mf(0, null);
                }
            } else {
                if (!(id1Var2 instanceof id1.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                UserId userId = ((id1.b) id1Var2).a;
                nwy nwyVar = ((AlbumChooseFragmentInternalComponent) albumChooseFragment.N.getValue()).e;
                qcy<Object> qcyVar = AlbumChooseFragmentInternalComponent.h[3];
                g7s0 g7s0Var = (g7s0) nwyVar.c();
                Context requireContext = albumChooseFragment.requireContext();
                int i = g7s0.G7;
                g7s0Var.n(requireContext, userId);
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AlbumChooseFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        P = new qcy[]{propertyReference1Impl};
    }

    public AlbumChooseFragment() {
        qu quVar = new qu(this, 2);
        int i = wcy.c;
        this.O = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(AlbumChooseState.class)), wcy.a.a(fpf0.d(AlbumChooseState.class)), wcy.a.a(fpf0.d(cd1.class)), wcy.a.a(fpf0.d(id1.class))).toString(), this, this, quVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        eo().b(cd1.d.b);
        return true;
    }

    public final bn50<AlbumChooseState, AlbumChooseState, cd1, id1> eo() {
        qcy<Object> qcyVar = P[0];
        return (bn50) this.O.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nwy nwyVar = ((AlbumChooseFragmentInternalComponent) this.N.getValue()).f;
        qcy<Object> qcyVar = AlbumChooseFragmentInternalComponent.h[4];
        hd1 hd1Var = new hd1((ye1) nwyVar.c(), new b(1, this, AlbumChooseFragment.class, "handleEvent", "handleEvent(Lcom/vk/video/ui/upload/impl/publish/presentation/albumchoose/feature/entity/AlbumChooseEvent;)V", 0));
        ComposeView a2 = xpi.a(layoutInflater.getContext());
        hd1Var.c(eo(), a2);
        return a2;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        eo().b(cd1.h.b);
    }
}
