package com.vk.video.ui.upload.impl.attachedclips.presentation.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.video.ui.upload.api.router.AttachedClipsResult;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerArguments;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerFragment;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerResult;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bn50;
import xsna.c64;
import xsna.cb;
import xsna.fnj;
import xsna.fpf0;
import xsna.iah0;
import xsna.ies;
import xsna.ikv0;
import xsna.izs;
import xsna.msy;
import xsna.nwy;
import xsna.oz50;
import xsna.qcy;
import xsna.s3q0;
import xsna.t44;
import xsna.u1h0;
import xsna.w44;
import xsna.wcy;
import xsna.x44;
import xsna.xpi;

/* compiled from: AttachedClipsFragment.kt */
/* loaded from: classes7.dex */
public final class AttachedClipsFragment extends FragmentImpl implements ies {
    public static final /* synthetic */ qcy<Object>[] P;
    public final Object N = msy.a(LazyThreadSafetyMode.NONE, new cb(this, 6));
    public final u1h0 O;

    /* compiled from: AttachedClipsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: AttachedClipsFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<x44, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(x44 x44Var) {
            ikv0.d dVar;
            x44 x44Var2 = x44Var;
            AttachedClipsFragment attachedClipsFragment = (AttachedClipsFragment) this.receiver;
            qcy<Object>[] qcyVarArr = AttachedClipsFragment.P;
            attachedClipsFragment.getClass();
            if (x44Var2 instanceof x44.b) {
                new VideoViewerFragment.a(new VideoViewerArguments.RemoteAttachedClip(((x44.b) x44Var2).a)).g(1, attachedClipsFragment);
            } else if (x44Var2 instanceof x44.c) {
                x44.c cVar = (x44.c) x44Var2;
                Context requireContext = attachedClipsFragment.requireContext();
                boolean z = cVar instanceof x44.c.e;
                ikv0.c cVar2 = ikv0.c.f.a;
                if (z) {
                    dVar = new ikv0.d(new ikv0.d.c(requireContext.getString(R.string.attached_clips_snackbar_save_single_clip_success_title)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                } else if (cVar instanceof x44.c.d) {
                    dVar = new ikv0.d(new ikv0.d.c(requireContext.getString(R.string.attached_clips_snackbar_save_multiple_clips_success_title)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                } else if (cVar instanceof x44.c.a) {
                    dVar = new ikv0.d(new ikv0.d.c(requireContext.getString(R.string.attached_clips_snackbar_detach_clips_success_title)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                } else if (cVar instanceof x44.c.b) {
                    dVar = new ikv0.d(new ikv0.d.c(requireContext.getString(R.string.attached_clips_snackbar_clips_load_error_retry_title)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    cVar2 = ikv0.c.b.a;
                } else {
                    if (!(cVar instanceof x44.c.C3973c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar2 = new ikv0.c.C3058c(R.drawable.vk_icon_globe_cross_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), (Size) null, 12);
                    dVar = new ikv0.d(new ikv0.d.c(requireContext.getString(R.string.snackbar_network_error_title)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                }
                FragmentActivity kn = attachedClipsFragment.kn();
                ikv0.a aVar = new ikv0.a(kn);
                aVar.t = cVar2;
                aVar.u = dVar;
                HashSet hashSet = iah0.a;
                if (fnj.d(kn)) {
                    aVar.k = 1;
                    aVar.g(1);
                }
                aVar.b().c();
            } else {
                if (!(x44Var2 instanceof x44.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                AttachedClipsResult attachedClipsResult = ((x44.a) x44Var2).a;
                if (attachedClipsResult != null) {
                    Intent intent = new Intent();
                    intent.putExtra("arguments", attachedClipsResult);
                    s3q0 s3q0Var = s3q0.a;
                    attachedClipsFragment.Mf(-1, intent);
                } else {
                    attachedClipsFragment.Mf(0, null);
                }
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AttachedClipsFragment.class, X3.i.U, "getStore()Lcom/vk/mvi/saver/MviStoreSaver;", 0);
        fpf0.a.getClass();
        P = new qcy[]{propertyReference1Impl};
    }

    public AttachedClipsFragment() {
        com.vk.im.ui.components.viewcontrollers.dialog_header.info.a aVar = new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 6);
        int i = wcy.c;
        this.O = new u1h0(fpf0.e(bn50.class, wcy.a.a(fpf0.d(AttachedClipsState.class)), wcy.a.a(fpf0.d(AttachedClipsState.class)), wcy.a.a(fpf0.d(t44.class)), wcy.a.a(fpf0.d(x44.class))).toString(), this, this, aVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        eo().b(t44.a.b);
        return true;
    }

    public final bn50<AttachedClipsState, AttachedClipsState, t44, x44> eo() {
        qcy<Object> qcyVar = P[0];
        return (bn50) this.O.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcelable parcelable;
        Object parcelableExtra;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1 && intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("arguments", VideoViewerResult.class);
                parcelable = (Parcelable) parcelableExtra;
            } else {
                Parcelable parcelableExtra2 = intent.getParcelableExtra("arguments");
                if (!(parcelableExtra2 instanceof VideoViewerResult)) {
                    parcelableExtra2 = null;
                }
                parcelable = (VideoViewerResult) parcelableExtra2;
            }
            VideoViewerResult videoViewerResult = (VideoViewerResult) parcelable;
            if (videoViewerResult != null) {
                eo().b(new t44.c.C3716c(videoViewerResult.b));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nwy nwyVar = ((AttachedClipsFragmentInternalComponent) this.N.getValue()).d;
        qcy<Object> qcyVar = AttachedClipsFragmentInternalComponent.f[2];
        w44 w44Var = new w44((c64) nwyVar.c(), new b(1, this, AttachedClipsFragment.class, "handleEvent", "handleEvent(Lcom/vk/video/ui/upload/impl/attachedclips/presentation/feature/entity/AttachedClipsEvent;)V", 0));
        ComposeView a2 = xpi.a(layoutInflater.getContext());
        w44Var.c(eo(), a2);
        return a2;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        eo().b(t44.h.b);
    }
}
